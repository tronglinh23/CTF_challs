<?php

$k = preg_match('/(?:\D+|<\d+>)*[!?]/', 'ABCDEf ABCDEf ABCDEf');
echo preg_last_error()."\n";
echo PREG_BACKTRACK_LIMIT_ERROR."\n";
if (preg_last_error() == PREG_BACKTRACK_LIMIT_ERROR) {
    echo 'Backtrack limit was exhausted!';
}


?>
