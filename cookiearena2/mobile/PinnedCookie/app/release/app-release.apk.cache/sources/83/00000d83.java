package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.r0;
import androidx.transition.s1;
import d.o0;
import d.q0;

/* loaded from: classes.dex */
public final class Hold extends s1 {
    @Override // androidx.transition.s1
    @o0
    public Animator onAppear(@o0 ViewGroup viewGroup, @o0 View view, @q0 r0 r0Var, @q0 r0 r0Var2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // androidx.transition.s1
    @o0
    public Animator onDisappear(@o0 ViewGroup viewGroup, @o0 View view, @q0 r0 r0Var, @q0 r0 r0Var2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}