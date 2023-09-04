<?php
// $a = "$_GET";
// $password = sha1($a);
// echo $password;
// $admin = "linh\"";
$payload = "xxx%1$\%27)";
$username = strtr($payload, ['"' => '\\"', '\\' => '\\\\']);
echo vsprintf('SELECT * FROM users WHERE username = "%s"', [$username]). "\n";
// echo htmlspecialchars($username, ENT_COMPAT | ENT_SUBSTITUTE);
?>