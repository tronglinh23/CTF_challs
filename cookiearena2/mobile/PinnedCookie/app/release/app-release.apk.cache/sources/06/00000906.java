package com.google.android.material.animation;

import d.o0;

/* loaded from: classes.dex */
public interface AnimatableView {

    /* loaded from: classes.dex */
    public interface Listener {
        void onAnimationEnd();
    }

    void startAnimation(@o0 Listener listener);

    void stopAnimation();
}