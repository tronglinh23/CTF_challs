<?php
function xxd(string $s): string {
	$out = '';
	$ctr = 0;
	foreach (str_split($s, 16) as $v) {
		$hex_string = implode(' ', str_split(bin2hex($v), 4));
		$ascii_string = '';
		foreach (str_split($v) as $c) {
			$ascii_string .= $c < ' ' || $c > '~' ? '.' : $c;
		}
		$out .= sprintf("%08x: %-40s %-16s\n", $ctr, $hex_string, $ascii_string);
		$ctr += 16;
	}
	return $out;
}
echo xxd("test")
?>