<?php

$k="80e32263";
$kh="6f8af44abea0";
$kf="351039f4a7b5";
$p="0UlYyJHG87EJqEz6";

function x($t,$k){
  $c=strlen($k);
  $l=strlen($t);
  $o="";
  for($i=0;$i<$l;){
    for($j=0;($j<$c&&$i<$l);$j++,$i++){
      $o.=$t[$i]^$k[$j];
    }}
  return $o;
}

# 0UlYyJHG87EJqEz66f8af44abea0(key)351039f4a7b5

$user_input = file_get_contents("php://input");
$filter1 = preg_replace("/0UlYyJHG87EJqEz66f8af44abea0/","", $user_input);
$filter2 = preg_replace("/351039f4a7b5/","", $filter1);
$result = gzuncompress(@x(base64_decode($filter2),$k));
echo $result;


?>
