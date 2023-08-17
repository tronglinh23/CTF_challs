package com.google.android.material.color.utilities;

import d.b1;

@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SchemeTonalSpot extends DynamicScheme {
    public SchemeTonalSpot(Hct hct, boolean z6, double d7) {
        super(hct, Variant.TONAL_SPOT, z6, d7, TonalPalette.fromHueAndChroma(hct.getHue(), 40.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d), TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + 60.0d), 24.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 6.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 8.0d));
    }
}