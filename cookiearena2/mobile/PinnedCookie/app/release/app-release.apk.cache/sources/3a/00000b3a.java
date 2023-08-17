package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import d.q0;

/* loaded from: classes.dex */
class AnimatorTracker {
    @q0
    private Animator currentAnimator;

    public void cancelCurrent() {
        Animator animator = this.currentAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void clear() {
        this.currentAnimator = null;
    }

    public void onNextAnimationStart(Animator animator) {
        cancelCurrent();
        this.currentAnimator = animator;
    }
}