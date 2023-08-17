<!-- <?php
function nolesbmb($a, $b)
{
$result = "";

for ($i=0; $i<strlen($a);)
{
  for ($j=0; $j<strlen($b) && $i<strlen($a); $j++, $i++)
  {
    var_dump(ord($a[$i]) ^ ord($b[$j]));
    // echo var_dump(chr(ord($a[$i]) ^ ord($b[$j])));
    $result .= chr(ord($a[$i]) ^ ord($b[$j]));
  }
}
echo $result;
}

nolesbmb(nolesbmb("06b8c8f2240dc544ef6401487371c3e4i%3Df0%21z%3A5%25sv6%24%3A%3Bvom%28%600b%3C7%08%25qko%24akcx%2Bu%7B4p136gkn6sl2%3Fkjn%28s%2Ak%25dt%26cwi%7Bqpd%2Am8%7Bkjq%27v%24vy%24v%7Cxombh%7F%23aw%3D0%20x%60%20%3D%28%27%7C%3E%2Becsu%7Fm%3F6gwti%3Dh%26%7Dwloe%3D%22l%27a%2F%3Dz%26oku%20~h%7Dvd", "06b8c8f2240dc544ef6401487371c3e4i%3Df0%21z%3A5%25sv6%24%3A%3Bvom%28%600b%3C7%08%25qko%24akcx%2Bu%7B4p136gkn6sl2%3Fkjn%28s%2Ak%25dt%26cwi%7Bqpd%2Am8%7Bkjq%27v%24vy%24v%7Cxombh%7F%23aw%3D0%20x%60%20%3D%28%27%7C%3E%2Becsu%7Fm%3F6gwti%3Dh%26%7Dwloe%3D%22l%27a%2F%3Dz%26oku%20~h%7Dvd"),"123");

// $k = "ls";
// echo serialize($k);
// $yzfppg = @unserialize("O:1:\"a\":1:{s:1:\"k\";s:2:\"ls\";}");
// echo var_dump($yzfppg);

// function guudpi($cukhpkar) {

//   if (strlen($cukhpkar) < 4)
//   {
//       return "";
//   }

//   $konrvbmzkwwluqr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";

//   $pnooxjxnfecez = str_split($konrvbmzkwwluqr);
//   $pnooxjxnfecez = array_flip($pnooxjxnfecez);

//   $oylknnt = 0;
//   $pvlaeka = "";

//   $cukhpkar = preg_replace("~[^A-Za-z0-9\+\/\=]~", "", $cukhpkar);
//   echo $cukhpkar;

//   do {
//       $knxnyph = $pnooxjxnfecez[$cukhpkar[$oylknnt++]];
//       $onxqfybg = $pnooxjxnfecez[$cukhpkar[$oylknnt++]];
//       $xsljba = $pnooxjxnfecez[$cukhpkar[$oylknnt++]];
//       $qkkolgr = $pnooxjxnfecez[$cukhpkar[$oylknnt++]];

//       $uvgpquiy = ($knxnyph << 2) | ($onxqfybg >> 4);
//       $tamnincvvjsf = (($onxqfybg & 15) << 4) | ($xsljba >> 2);
//       $tamninnpbziq = (($xsljba & 3) << 6) | $qkkolgr;
//       $pvlaeka = $pvlaeka . chr($uvgpquiy);
//       if ($xsljba != 64) {
//           $pvlaeka = $pvlaeka . chr($tamnincvvjsf);
//       }
//       if ($qkkolgr != 64) {
//           $pvlaeka = $pvlaeka . chr($tamninnpbziq);
//       }
//   } while ($oylknnt < strlen($cukhpkar));
//   return $pvlaeka;
// }

// echo guudpi(122323555555555555555555)
// $cukhpkar = "O:1:\"a\":1:{s:1:\"k\";s:2:\"ls\";";
// $cukhpkar = preg_replace("~[^A-Za-z0-9\+\/\=]~", "", $cukhpkar);
// echo $cukhpkar;
// $konrvbmzkwwluqr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";

// $pnooxjxnfecez = str_split($konrvbmzkwwluqr);
// $pnooxjxnfecez = array_flip($pnooxjxnfecez);

// echo var_dump($pnooxjxnfecez["="]);

$oylknnt = Array(
  'ak' => '816291f4-e264-4109-b4a2-56b0ccc91819',
  'a' =>  'e',
  'd' => "ls"
);
$result = @serialize($oylknnt);
echo json_encode($result);
$yzfppg = @unserialize($result);
// echo var_dump($yzfppg['ak']);
?>


