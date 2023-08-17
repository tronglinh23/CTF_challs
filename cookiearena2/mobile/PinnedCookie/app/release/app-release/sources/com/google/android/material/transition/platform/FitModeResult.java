package com.google.android.material.transition.platform;

import d.w0;
@w0(21)
/* loaded from: classes.dex */
class FitModeResult {
    final float currentEndHeight;
    final float currentEndWidth;
    final float currentStartHeight;
    final float currentStartWidth;
    final float endScale;
    final float startScale;

    public FitModeResult(float f7, float f8, float f9, float f10, float f11, float f12) {
        this.startScale = f7;
        this.endScale = f8;
        this.currentStartWidth = f9;
        this.currentStartHeight = f10;
        this.currentEndWidth = f11;
        this.currentEndHeight = f12;
    }
}
