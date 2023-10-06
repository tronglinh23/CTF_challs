<html>
<head>
<title>Challenge 50</title>
</head>
<body>
<?php
  if($_GET['id'] && $_GET['pw']){
    echo 1;
    $_GET['id'] = addslashes($_GET['id']); 
    $_GET['pw'] = addslashes($_GET['pw']);
    $_GET['id'] = mb_convert_encoding($_GET['id'],'utf-8','euc-kr');
    foreach($_GET as $ck) if(preg_match("/from|pw|\(|\)| |%|=|>|</i",$ck)) exit();
    if(preg_match("/union/i",$_GET['id'])) exit();
    $result = "select lv from chall50 where id='".$_GET['id']."' and pw=md5('".$_GET['pw']."')";

    echo "<div>".$result."</div>";
  }
?>
</body>
</html>