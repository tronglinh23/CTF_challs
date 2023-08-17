package com.google.android.material.color.utilities;

import d.b1;
import java.util.HashMap;
import java.util.Map;

@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;

    private TonalPalette(double d7, double d8) {
        this.hue = d7;
        this.chroma = d8;
    }

    public static final TonalPalette fromHct(Hct hct) {
        return fromHueAndChroma(hct.getHue(), hct.getChroma());
    }

    public static final TonalPalette fromHueAndChroma(double d7, double d8) {
        return new TonalPalette(d7, d8);
    }

    public static final TonalPalette fromInt(int i7) {
        return fromHct(Hct.fromInt(i7));
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d7) {
        return Hct.from(this.hue, this.chroma, d7);
    }

    public double getHue() {
        return this.hue;
    }

    public int tone(int i7) {
        Integer num = this.cache.get(Integer.valueOf(i7));
        if (num == null) {
            num = Integer.valueOf(Hct.from(this.hue, this.chroma, i7).toInt());
            this.cache.put(Integer.valueOf(i7), num);
        }
        return num.intValue();
    }
}