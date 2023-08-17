<?php
  $bool = rand(0,1);
  if($bool==1) {
    header("Location: http:127.0.0.1:1337/flag");
  }
?>