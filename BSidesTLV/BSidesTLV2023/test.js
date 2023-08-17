function validate_key(input): bool {
    goto first;
    first: x = "\57\136\133\60\x2d\71\135\x7b\65\x7d\x2d\x5b\x41\x2d\132\141\x2d\x7a\x5d\x7b\63\x7d\55\133\60\x2d\x39\135\173\67\x7d\55\x5b\60\x2d\x39\135\173\65\175\x24\x2f\151";
    goto second;
    third: return $iemVT % 7 == 0;
    goto forth;
    fifth: input = htmlspecialchars(input);
    goto LQHHH;
    aZ2HL: $iemVT = 0;
    goto Jsi21;
    Y1JYP: if (is_numeric(input[$mM5aW + 18])) {
        goto BcHCu;
    } goto lIceC;
    va6be: eHqaj: goto c9E41;
    Q6G_X: if (in_array(substr(input, 3, 2), [$MN1tG[52].$MN1tG[52], $MN1tG[52].$MN1tG[53], $MN1tG[52].$MN1tG[54], $MN1tG[61].$MN1tG[57], $MN1tG[61].$MN1tG[58], $MN1tG[61].$MN1tG[59], $MN1tG[61].$MN1tG[60], $MN1tG[61].$MN1tG[61]])) {
        goto rozEh;
    } goto jjH1i;
    Jxyt_: return false;
    goto RCR3Q;
    jjH1i: return false;
    goto tJ7SK;
    LEG2h: return false;
    goto F2lTN;
    m0zed: BcHCu: goto HFfrL;
    F2lTN: chlBQ: goto L7XME;
    lIceC: return false;
    goto m0zed;
    p9Isd: goto eHqaj;
    goto Jj9rm;
    Jsi21: $mM5aW = 10;
    goto va6be;
    E1z1K: if (!(strtoupper(substr(input, 6, 3)) != $MN1tG[14].$MN1tG[4].$MN1tG[12])) {
        goto cda8y;
    } goto BcOlL;
    Jj9rm: KPRmF: goto third;
    wypRV: mzemE: goto diCkR;
    vF84E: $mM5aW++;
    goto p9Isd;
    c9E41: if (!($mM5aW < 17)) {
        goto KPRmF;
    } goto EhUBF;
    tDhR4: if (preg_match(x, input)) {
        goto chlBQ;
    } goto LEG2h;
    UjYJ3: goto mzemE;
    goto XdkLx;
    second: $MN1tG = array_merge(range("\101", "\x5a"), range("\141", "\x7a"), range(0, 9), str_split("\41\x40\43\44\45\136\46\52\50\x29\137\x2b\x2d\75\133\x5d\173\x7d\174\73\x3a\x2c\56\x3c\76\77"));
    goto tDhR4;
    tJ7SK: rozEh: goto E1z1K;
    Hf6ou: $mM5aW++;
    goto UjYJ3;
    L7XME: input = trim(input);
    goto jKwmW;
    RCR3Q: AiYjL: goto Q6G_X;
    HFfrL: h5pal: goto Hf6ou;
    IgbLP: $mM5aW = 0;
    goto wypRV;
    eA3ZV: cda8y: goto IgbLP;
    EhUBF: $iemVT += input[$mM5aW];
    goto BUf3P;
    diCkR: if (!($mM5aW < 5)) {
        goto xB2El;
    } goto Y1JYP;
    XdkLx: xB2El: goto aZ2HL;
    jKwmW: input = stripcslashes(input);
    goto fifth;
    BcOlL: return false;
    goto eA3ZV;
    LQHHH: if (!((int) substr(input, 0, 3) > (int) $MN1tG[55].$MN1tG[58].$MN1tG[58])) {
        goto AiYjL;
    } goto Jxyt_;
    BUf3P: O85xy: goto vF84E;
    forth:
}