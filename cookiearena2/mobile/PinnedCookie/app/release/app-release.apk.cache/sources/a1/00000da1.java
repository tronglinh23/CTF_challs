package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import d.o0;
import d.q0;

/* loaded from: classes.dex */
public interface VisibilityAnimatorProvider {
    @q0
    Animator createAppear(@o0 ViewGroup viewGroup, @o0 View view);

    @q0
    Animator createDisappear(@o0 ViewGroup viewGroup, @o0 View view);
}