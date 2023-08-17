package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import d.b1;
import d.o0;
import java.util.Collection;
@b1({b1.a.f8134l})
/* loaded from: classes.dex */
public class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    private final Listener listener;
    private final View[] views;

    /* loaded from: classes.dex */
    public interface Listener {
        void onAnimationUpdate(@o0 ValueAnimator valueAnimator, @o0 View view);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@o0 Listener listener, @o0 View... viewArr) {
        this.listener = listener;
        this.views = viewArr;
    }

    @o0
    public static MultiViewUpdateListener alphaListener(@o0 View... viewArr) {
        return new MultiViewUpdateListener(new e(), viewArr);
    }

    @o0
    public static MultiViewUpdateListener scaleListener(@o0 View... viewArr) {
        return new MultiViewUpdateListener(new c(), viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setAlpha(@o0 ValueAnimator valueAnimator, @o0 View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setScale(@o0 ValueAnimator valueAnimator, @o0 View view) {
        Float f7 = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f7.floatValue());
        view.setScaleY(f7.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationX(@o0 ValueAnimator valueAnimator, @o0 View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationY(@o0 ValueAnimator valueAnimator, @o0 View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @o0
    public static MultiViewUpdateListener translationXListener(@o0 View... viewArr) {
        return new MultiViewUpdateListener(new b(), viewArr);
    }

    @o0
    public static MultiViewUpdateListener translationYListener(@o0 View... viewArr) {
        return new MultiViewUpdateListener(new d(), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
        for (View view : this.views) {
            this.listener.onAnimationUpdate(valueAnimator, view);
        }
    }

    @o0
    public static MultiViewUpdateListener alphaListener(@o0 Collection<View> collection) {
        return new MultiViewUpdateListener(new e(), collection);
    }

    @o0
    public static MultiViewUpdateListener scaleListener(@o0 Collection<View> collection) {
        return new MultiViewUpdateListener(new c(), collection);
    }

    @o0
    public static MultiViewUpdateListener translationXListener(@o0 Collection<View> collection) {
        return new MultiViewUpdateListener(new b(), collection);
    }

    @o0
    public static MultiViewUpdateListener translationYListener(@o0 Collection<View> collection) {
        return new MultiViewUpdateListener(new d(), collection);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@o0 Listener listener, @o0 Collection<View> collection) {
        this.listener = listener;
        this.views = (View[]) collection.toArray(new View[0]);
    }
}
