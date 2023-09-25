<?php
  $input = $_REQUEST["test"];
  $wh = filter_var($input, FILTER_SANITIZE_URL);
  echo "<h2>" . $wh . "</h2>";
?>