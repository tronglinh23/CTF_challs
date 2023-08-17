package com.google.android.material.transition;
/* loaded from: classes.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int i7, int i8, boolean z6) {
        this.startAlpha = i7;
        this.endAlpha = i8;
        this.endOnTop = z6;
    }

    public static FadeModeResult endOnTop(int i7, int i8) {
        return new FadeModeResult(i7, i8, true);
    }

    public static FadeModeResult startOnTop(int i7, int i8) {
        return new FadeModeResult(i7, i8, false);
    }
}
