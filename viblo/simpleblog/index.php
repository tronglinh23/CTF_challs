<?php session_start(); ?>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Blog</title>
    <link rel="stylesheet" href="/style.css">
    <?php include 'login.php'; ?>
  </head>

  <body>
    <p><?php echo "Hello ".$_SESSION['username'] ?></p>
    <h1>Welcome to my blog! ❤️</h1>
    <p>This is where I talk about a lot of nice things.</p>
    <hr>
    <ul>
      <?php
        $posts = glob("posts/*");
        foreach ($posts as $post) {
          $name = basename($post);
          echo '<li><a href="/post.php?post=' . $name . '">' . $name . '</a></li>';
        }
      ?>
    </ul>
  </body>
</html>
