<?php
    // Starting the session
    session_start();
    // conditional usage of session values that may have been set in a previous session
    if (isset($_GET['username'])) {
        $_SESSION['username'] = $_GET['username'];
        header('Location: /');
    }
    if(!isset($_SESSION["username"])) {
        echo "Please enter your username first";
        exit;
    }

?>