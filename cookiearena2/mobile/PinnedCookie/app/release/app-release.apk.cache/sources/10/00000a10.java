package com.google.android.material.color.utilities;

import d.b1;

@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class CorePalette {

    /* renamed from: a1  reason: collision with root package name */
    public TonalPalette f8026a1;

    /* renamed from: a2  reason: collision with root package name */
    public TonalPalette f8027a2;

    /* renamed from: a3  reason: collision with root package name */
    public TonalPalette f8028a3;
    public TonalPalette error;

    /* renamed from: n1  reason: collision with root package name */
    public TonalPalette f8029n1;

    /* renamed from: n2  reason: collision with root package name */
    public TonalPalette f8030n2;

    private CorePalette(int i7, boolean z6) {
        Hct fromInt = Hct.fromInt(i7);
        double hue = fromInt.getHue();
        double chroma = fromInt.getChroma();
        if (z6) {
            this.f8026a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f8027a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f8028a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f8029n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f8030n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f8026a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f8027a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f8028a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f8029n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f8030n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i7) {
        return new CorePalette(i7, true);
    }

    public static CorePalette of(int i7) {
        return new CorePalette(i7, false);
    }
}