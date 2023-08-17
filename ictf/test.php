<?php
// See the password_hash() example to see where this came from.
$hash = "$2a$10$/LmLOuY7yTAno4lYQxT2r.a9bNCMj1RN4Pj97hMRGR5fTih4f1hJG";
// $k = password_hash('bjctf{test_flag}', PASSWORD_DEFAULT);
echo $k. "\n";

if (password_verify('h', $hash )) {
    echo 'Password is valid!';
} else {
    echo 'Invalid password.';
}
?>