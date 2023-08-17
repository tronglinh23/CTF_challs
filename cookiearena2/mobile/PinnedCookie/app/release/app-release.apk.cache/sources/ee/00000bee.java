package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings;
import d.b1;
import d.l1;
import d.o0;

@b1({b1.a.f8134l})
/* loaded from: classes.dex */
public class AnimatorDurationScaleProvider {
    private static float defaultSystemAnimatorDurationScale = 1.0f;

    @l1
    public static void setDefaultSystemAnimatorDurationScale(float f7) {
        defaultSystemAnimatorDurationScale = f7;
    }

    public float getSystemAnimatorDurationScale(@o0 ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}