package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import d.b1;
import d.o0;
import d.q0;

@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class FadeThroughUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    private final float[] alphas = new float[2];
    @q0
    private final View fadeInView;
    @q0
    private final View fadeOutView;

    public FadeThroughUpdateListener(@q0 View view, @q0 View view2) {
        this.fadeOutView = view;
        this.fadeInView = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
        FadeThroughUtils.calculateFadeOutAndInAlphas(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.alphas);
        View view = this.fadeOutView;
        if (view != null) {
            view.setAlpha(this.alphas[0]);
        }
        View view2 = this.fadeInView;
        if (view2 != null) {
            view2.setAlpha(this.alphas[1]);
        }
    }
}