<?php
  set_time_limit(2);

  $value = isset($_POST["value"]) ? $_POST["value"] : "";
  $secret = "CENSORED"; // printable ASCII only
  $flag = $secret === $value ? "CENSORED": "Nope !";
  $matched = 0;

  if (isset($_POST["pattern"])) {
    $pattern = $_POST["pattern"];
    $matched = preg_match($pattern, $secret . "##END##");
    echo var_dump($matched);
    echo preg_last_error()."\n";
    echo PREG_BACKTRACK_LIMIT_ERROR."\n";
    echo var_dump(preg_last_error() === PREG_BACKTRACK_LIMIT_ERROR);

    if (preg_last_error() == PREG_BACKTRACK_LIMIT_ERROR) {
      # prevent server attack -_-
      echo "123";
      sleep(1);
    }
  }
?>