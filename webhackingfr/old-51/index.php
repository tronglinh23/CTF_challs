<?php
$input_id = addslashes($_POST['id']);
echo "input_id: {$input_id}<br>";
echo "select id from chall51 where id='{$input_id}' and";