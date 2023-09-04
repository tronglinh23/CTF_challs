<?php
error_reporting(0);

setcookie("user", "BKSEC_guest", time() + (86400 * 30), "/"); // Cookie will be valid for 30 days

if (isset($_FILES) && !empty($_FILES)) {
    $uploadpath = "/var/tmp/";
    $error = "";
    
    $timestamp = time();

    $userValue = $_COOKIE['user'];
    $target_file = $uploadpath . $userValue . "_" . $timestamp . "_" . $_FILES["image"]["name"];

    move_uploaded_file($_FILES["image"]["tmp_name"], $target_file);

    if ($_FILES["image"]["size"] > 1048576) {
        $error .= '<p class="h5 text-danger">Maximum file size is 1MB.</p>';
    } elseif ($_FILES["image"]["type"] !== "image/jpeg") {
        $error .= '<p class="h5 text-danger">Only JPG files are allowed.</p>';
    } else {
      $exif = exif_read_data($target_file, 0, true);

      if ($exif === false) {
          $error .= '<p class="h5 text-danger">No metadata found.</p>';
      } else {
          $metadata = '<table class="table table-striped">';
          foreach ($exif as $key => $section) {
              $metadata .=
                  '<thead><tr><th colspan="2" class="text-center">' .
                  $key .
                  "</th></tr></thead><tbody>";
              foreach ($section as $name => $value) {
                  $metadata .=
                      "<tr><td>" . $name . "</td><td>" . $value . "</td></tr>";
              }
              $metadata .= "</tbody>";
          }
          $metadata .= "</table>";
      }
    }
}
?>
<!DOCTYPE html>
<!-- Modified from https://getbootstrap.com/docs/5.3/examples/checkout -->
<html lang="en" data-bs-theme="auto">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>BKSEC Metadata checker</title>
  <link href="assets/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/dist/css/checkout.css" rel="stylesheet">
  <link rel="icon" href="assets/images/logo.png" type="image/png">
</head>

<body class="bg-body-tertiary">

  <div class="container">
    <main>
      <div class="py-5 text-center">
        <a href="/"><img class="d-block mx-auto mb-4"  src="assets/images/logo.png" alt="" width="72"></a>
        <h2>BKSEC Metadata checker</h2>
        <p class="lead">Only jpg files are supported and maximum file size is 1MB.</p>
      </div>
      <form action="/index.php" method="post" enctype="multipart/form-data">
        <label class="h5 form-label">Upload your image</label>
        <input class="form-control form-control-lg my-4" name="image" id="formFileLg" type="file" required/>
        <div class="col text-center">
            <button class="btn btn-primary btn-lg" type="submit">Upload</button>
        </div>
      </form>
	    <?php
        // I want to show a loading effect within 1.5s here but don't know how
        sleep(3);
        // This might be okay..... I think so
        // My teammates will help me fix it later, I hope they don't forget that
        echo $error;
        
        echo $metadata;
        // unlink($target_file);
        ?>
    </main>

    <footer class="my-5 pt-5 text-body-secondary text-center text-small">
      <p class="mb-1">&copy; 2023 CLB An Toàn Thông Tin - BKHN</p>
    </footer>
  </div>
  <script src="assets/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>