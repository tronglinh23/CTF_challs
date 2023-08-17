package com.google.android.material.color.utilities;

import d.b1;

@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class ToneDeltaConstraint {
    public final double delta;
    public final DynamicColor keepAway;
    public final TonePolarity keepAwayPolarity;

    public ToneDeltaConstraint(double d7, DynamicColor dynamicColor, TonePolarity tonePolarity) {
        this.delta = d7;
        this.keepAway = dynamicColor;
        this.keepAwayPolarity = tonePolarity;
    }
}