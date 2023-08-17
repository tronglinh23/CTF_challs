<?php
  $filename = 'flag.txt';
  extract($_GET);
  if (isset($attempt)) {
      $combination = trim(file_get_contents($filename));
      echo $attempt."\n";
      echo $combination."\n";
      if ($attempt === $combination) {
          $flag = file_get_contents('flag.txt');
          echo "<p>You win! The flag is:"."$flag</p>";
      } else {
          echo "<p>Wrong! The secret not is <strong>$attempt</strong></p>";
      }
  }
?>