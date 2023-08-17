package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import d.b1;
import d.o0;

@b1({b1.a.f8134l})
/* loaded from: classes.dex */
public class ReversableAnimatedValueInterpolator implements TimeInterpolator {
    private final TimeInterpolator sourceInterpolator;

    public ReversableAnimatedValueInterpolator(@o0 TimeInterpolator timeInterpolator) {
        this.sourceInterpolator = timeInterpolator;
    }

    @o0
    public static TimeInterpolator of(boolean z6, @o0 TimeInterpolator timeInterpolator) {
        return z6 ? timeInterpolator : new ReversableAnimatedValueInterpolator(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f7) {
        return 1.0f - this.sourceInterpolator.getInterpolation(f7);
    }
}