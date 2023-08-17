package com.google.android.material.color.utilities;

import d.b1;
@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SchemeContent extends DynamicScheme {
    public SchemeContent(Hct hct, boolean z6, double d7) {
        super(hct, Variant.CONTENT, z6, d7, TonalPalette.fromHueAndChroma(hct.getHue(), hct.getChroma()), TonalPalette.fromHueAndChroma(hct.getHue(), Math.max(hct.getChroma() - 32.0d, hct.getChroma() * 0.5d)), TonalPalette.fromHct(DislikeAnalyzer.fixIfDisliked(new TemperatureCache(hct).getAnalogousColors(3, 6).get(2))), TonalPalette.fromHueAndChroma(hct.getHue(), hct.getChroma() / 8.0d), TonalPalette.fromHueAndChroma(hct.getHue(), (hct.getChroma() / 8.0d) + 4.0d));
    }
}
