package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import b2.a;
import b2.b;
import b2.c;
import d.b1;

@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new b();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new a();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new c();
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static float lerp(float f7, float f8, float f9) {
        return f7 + (f9 * (f8 - f7));
    }

    public static int lerp(int i7, int i8, float f7) {
        return i7 + Math.round(f7 * (i8 - i7));
    }

    public static float lerp(float f7, float f8, float f9, float f10, float f11) {
        return f11 <= f9 ? f7 : f11 >= f10 ? f8 : lerp(f7, f8, (f11 - f9) / (f10 - f9));
    }
}