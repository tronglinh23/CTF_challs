package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import d.i;
import d.o0;
import d.q0;
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    @q0
    private AnimatorSet currentAnimation;

    public ExpandableTransformationBehavior() {
    }

    @o0
    public abstract AnimatorSet onCreateExpandedStateChangeAnimation(View view, View view2, boolean z6, boolean z7);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @i
    public boolean onExpandedStateChange(View view, View view2, boolean z6, boolean z7) {
        AnimatorSet animatorSet = this.currentAnimation;
        boolean z8 = animatorSet != null;
        if (z8) {
            animatorSet.cancel();
        }
        AnimatorSet onCreateExpandedStateChangeAnimation = onCreateExpandedStateChangeAnimation(view, view2, z6, z8);
        this.currentAnimation = onCreateExpandedStateChangeAnimation;
        onCreateExpandedStateChangeAnimation.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.ExpandableTransformationBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.currentAnimation = null;
            }
        });
        this.currentAnimation.start();
        if (!z7) {
            this.currentAnimation.end();
        }
        return true;
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
