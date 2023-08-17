package com.google.android.material.internal;

import d.x;
/* loaded from: classes.dex */
final class FadeThroughUtils {
    static final float THRESHOLD_ALPHA = 0.5f;

    private FadeThroughUtils() {
    }

    public static void calculateFadeOutAndInAlphas(@x(from = 0.0d, to = 1.0d) float f7, float[] fArr) {
        if (f7 <= 0.5f) {
            fArr[0] = 1.0f - (f7 * 2.0f);
            fArr[1] = 0.0f;
            return;
        }
        fArr[0] = 0.0f;
        fArr[1] = (f7 * 2.0f) - 1.0f;
    }
}
