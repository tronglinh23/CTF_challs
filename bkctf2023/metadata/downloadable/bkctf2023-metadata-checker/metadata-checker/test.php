<?php
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

?>