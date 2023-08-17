package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import d.b;
import d.o0;
import d.q0;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface MotionStrategy {
    void addAnimationListener(@o0 Animator.AnimatorListener animatorListener);

    AnimatorSet createAnimator();

    MotionSpec getCurrentMotionSpec();

    @b
    int getDefaultMotionSpecResource();

    List<Animator.AnimatorListener> getListeners();

    @q0
    MotionSpec getMotionSpec();

    void onAnimationCancel();

    void onAnimationEnd();

    void onAnimationStart(Animator animator);

    void onChange(@q0 ExtendedFloatingActionButton.OnChangedCallback onChangedCallback);

    void performNow();

    void removeAnimationListener(@o0 Animator.AnimatorListener animatorListener);

    void setMotionSpec(@q0 MotionSpec motionSpec);

    boolean shouldCancel();
}
