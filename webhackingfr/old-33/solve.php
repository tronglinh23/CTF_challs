<?php
// 14.177.10.96
$ip = "14.177.10.96";
for($i=0;$i<=strlen($ip);$i++) $ip=str_replace($i,ord($i),$ip);
$ip=str_replace(".","",$ip);
$ip=substr($ip,0,10);
$answer = $ip*2;
$answer = $ip/2;
$answer = str_replace(".","",$answer);
echo "answerip/{$answer}_{$ip}.php";
 