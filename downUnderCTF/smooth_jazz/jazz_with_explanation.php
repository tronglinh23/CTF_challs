<?php
function mysql_fquery($mysqli, $query, $params) {
  $result = vsprintf($query, $params);
  return mysqli_query($mysqli, $result);
}

if (isset($_POST['username']) && isset($_POST['password'])) {
  $mysqli = mysqli_connect('db', 'challuser', 'challpass', 'challenge');
  $username = strtr($_POST['username'], ['"' => '\\"', '\\' => '\\\\']);
  $password = sha1($_POST['password']);

  // if username contains an invalid utf8 char, mysql will not continue to read past the character 'admin%ffsomething' will result in querying for 'admin' 
  $res = mysql_fquery($mysqli, 'SELECT * FROM users WHERE username = "%s"', [$username]);

  if (!mysqli_fetch_assoc($res)) {
     $message = "Username not found.";
     goto fail;
  }

  // since vsprintf is used on the string we have partial access to, we can use some format string in username to inject a " character
  // we can use %1$c to print the first argument as a character (converted from decimal)
  // the character 34 is the " character
  // character loading stops if it finds a non-numeric character so we have to provide a sha1 hash that starts with 34 continued by a non-number
  // one such hash comes from the string 4791 -> 34c0ed704be66e9c03b6d2b796f6807cbfb9b5e4
  // the payload to bypass this check is username=admin%ff%1$c+OR+1;+--+xx&password=4791
  $res = mysql_fquery($mysqli, 'SELECT * FROM users WHERE username = "'.$username.'" AND password = "%s"', [$password]);
  if (!mysqli_fetch_assoc($res)) {
     $message = "Invalid password.";
     goto fail;
  }
  $htmlsafe_username = htmlspecialchars($username, ENT_COMPAT | ENT_SUBSTITUTE);
  
  // as the username is no longer admin, we're not able to get the second %s argument from the vsprintf
  // -> we need to inject a %s in the username to get the flag
  // we cannot do this right away with %s because the previous query will fail as it has only one argument
  // we can use the fact that the username here is modified with htmlspecialchars to create a "polyglot" payload that will
  // be interpreted as non-%s by the previous query and as %s by the vsprintf with the flag as argument
  // (source: https://www.php.net/manual/en/function.vsprintf.php)
  // 1. if the specifier of a format is `%` it will result in a literal `%` in the output
  // 2. even if % is the specifier, the formatstring is parsed as %[argnum$][flags][width][.precision]specifier 
  // 3. we can use this to smuggle the %s throught the first query and after it's expanded by htmlspecialchars, it will be interpreted as %s by vsprintf
  // -> %1$'>%s will be interpreted as
  //    - %1 -> take first argument
  //    - %'> -> Pads the result with the character >.
  //    - % -> % as a specifier -> the whole thing returns literal percent character.
  //    - s (and everything after) -> is treated as a literal s
  // after htmlspecialchars `$1%'>%s` will turn into `$1%'&gt%s`
  // it is interpreted as 1st argument padded with `&` and `g` as specifier (a specifier for printing a float)
  // --- end of the first format string
  // %s is treated as a valid specifier by vsprintf and it consumes the first argument. The second argument (flag) is printed by `the server time is %s`
  // win!

  // final payload: username=admin%ff%1$c+OR+1;+--+xx%1$'>%s&password=4791
  $greeting = $username === "admin" 
      ? "Hello $htmlsafe_username, the server time is %s and the flag is %s"
      : "Hello $htmlsafe_username, the server time is %s";

  $message = vsprintf($greeting, [date('Y-m-d H:i:s'), getenv('FLAG')]);
  
  fail:
}
?>
<!DOCTYPE html>
<html>
<head>
  <title>🎷 Smooth Jazz</title>
  <style>
    body {
      background-color: #f8f8f8;
      font-family: Arial, sans-serif;
    }

    .container {
      max-width: 400px;
      margin: 100px auto;
      padding: 20px;
      background-color: #fff;
      border-radius: 5px;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
      text-align: center;
    }

    h1 {
      color: #333;
    }

    form {
      margin-top: 20px;
    }

    label, input {
      display: block;
      margin-bottom: 10px;
    }

    input[type="text"],
    input[type="password"] {
      width: 100%;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    input[type="submit"] {
      width: 100%;
      padding: 10px;
      background-color: #4287f5;
      color: white;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    .music-player {
      margin-top: 20px;
    }

    h2 {
      color: #333;
    }

    audio {
      width: 100%;
      margin-top: 10px;
    }

    .message {
      margin-top: 10px;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>Smooth Jazz</h1>
    <form method="post">
      <label for="username">Username:</label>
      <input type="text" id="username" name="username" placeholder="Enter your username">

      <label for="password">Password:</label>
      <input type="password" id="password" name="password" placeholder="Enter your password">

      <input type="submit" value="Login">
    </form>
    <div class="music-player">
      <audio src="/offering-larry-stephens.mp3" id="audio"></audio>
      If you are stuck, you can <a href="javascript:document.getElementById('audio').play()">listen to some smooth jazz</a>.
    </div>
    <div id="message" class="message">
      <p><?= $message ?? '' ?></p>
    </div>
  </div>
</body>
</html>