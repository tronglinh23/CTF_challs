package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.vectordrawable.graphics.drawable.b;
import d.o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class IndeterminateAnimatorDelegate<T extends Animator> {
    protected IndeterminateDrawable drawable;
    protected final int[] segmentColors;
    protected final float[] segmentPositions;

    public IndeterminateAnimatorDelegate(int i7) {
        this.segmentPositions = new float[i7 * 2];
        this.segmentColors = new int[i7];
    }

    public abstract void cancelAnimatorImmediately();

    public float getFractionInRange(int i7, int i8, int i9) {
        return (i7 - i8) / i9;
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(@o0 b.a aVar);

    public void registerDrawable(@o0 IndeterminateDrawable indeterminateDrawable) {
        this.drawable = indeterminateDrawable;
    }

    public abstract void requestCancelAnimatorAfterCurrentCycle();

    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}