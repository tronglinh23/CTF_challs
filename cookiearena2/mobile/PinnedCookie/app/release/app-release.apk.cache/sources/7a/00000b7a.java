package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.b1;
import d.o0;
import d.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ExpandCollapseAnimationHelper {
    @q0
    private ValueAnimator.AnimatorUpdateListener additionalUpdateListener;
    private final View collapsedView;
    private int collapsedViewOffsetY;
    private long duration;
    private final View expandedView;
    private int expandedViewOffsetY;
    private final List<AnimatorListenerAdapter> listeners = new ArrayList();
    private final List<View> endAnchoredViews = new ArrayList();

    public ExpandCollapseAnimationHelper(@o0 View view, @o0 View view2) {
        this.collapsedView = view;
        this.expandedView = view2;
    }

    public static /* synthetic */ void a(ExpandCollapseAnimationHelper expandCollapseAnimationHelper, Rect rect, ValueAnimator valueAnimator) {
        expandCollapseAnimationHelper.lambda$getExpandCollapseAnimator$0(rect, valueAnimator);
    }

    private void addListeners(Animator animator, List<AnimatorListenerAdapter> list) {
        Iterator<AnimatorListenerAdapter> it = list.iterator();
        while (it.hasNext()) {
            animator.addListener(it.next());
        }
    }

    private AnimatorSet getAnimatorSet(boolean z6) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getExpandCollapseAnimator(z6), getExpandedViewChildrenAlphaAnimator(z6), getEndAnchoredViewsTranslateAnimator(z6));
        return animatorSet;
    }

    private Animator getEndAnchoredViewsTranslateAnimator(boolean z6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat((this.expandedView.getLeft() - this.collapsedView.getLeft()) + (this.collapsedView.getRight() - this.expandedView.getRight()), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(this.endAnchoredViews));
        ofFloat.setDuration(this.duration);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z6, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return ofFloat;
    }

    private Animator getExpandCollapseAnimator(boolean z6) {
        Rect calculateRectFromBounds = ViewUtils.calculateRectFromBounds(this.collapsedView, this.collapsedViewOffsetY);
        Rect calculateRectFromBounds2 = ViewUtils.calculateRectFromBounds(this.expandedView, this.expandedViewOffsetY);
        final Rect rect = new Rect(calculateRectFromBounds);
        ValueAnimator ofObject = ValueAnimator.ofObject(new RectEvaluator(rect), calculateRectFromBounds, calculateRectFromBounds2);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandCollapseAnimationHelper.a(ExpandCollapseAnimationHelper.this, rect, valueAnimator);
            }
        });
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.additionalUpdateListener;
        if (animatorUpdateListener != null) {
            ofObject.addUpdateListener(animatorUpdateListener);
        }
        ofObject.setDuration(this.duration);
        ofObject.setInterpolator(ReversableAnimatedValueInterpolator.of(z6, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return ofObject;
    }

    private Animator getExpandedViewChildrenAlphaAnimator(boolean z6) {
        List<View> children = ViewUtils.getChildren(this.expandedView);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(children));
        ofFloat.setDuration(this.duration);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z6, AnimationUtils.LINEAR_INTERPOLATOR));
        return ofFloat;
    }

    public /* synthetic */ void lambda$getExpandCollapseAnimator$0(Rect rect, ValueAnimator valueAnimator) {
        ViewUtils.setBoundsFromRect(this.expandedView, rect);
    }

    @CanIgnoreReturnValue
    @o0
    public ExpandCollapseAnimationHelper addEndAnchoredViews(@o0 View... viewArr) {
        Collections.addAll(this.endAnchoredViews, viewArr);
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public ExpandCollapseAnimationHelper addListener(@o0 AnimatorListenerAdapter animatorListenerAdapter) {
        this.listeners.add(animatorListenerAdapter);
        return this;
    }

    @o0
    public Animator getCollapseAnimator() {
        AnimatorSet animatorSet = getAnimatorSet(false);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.internal.ExpandCollapseAnimationHelper.2
            {
                ExpandCollapseAnimationHelper.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExpandCollapseAnimationHelper.this.expandedView.setVisibility(8);
            }
        });
        addListeners(animatorSet, this.listeners);
        return animatorSet;
    }

    @o0
    public Animator getExpandAnimator() {
        AnimatorSet animatorSet = getAnimatorSet(true);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.internal.ExpandCollapseAnimationHelper.1
            {
                ExpandCollapseAnimationHelper.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ExpandCollapseAnimationHelper.this.expandedView.setVisibility(0);
            }
        });
        addListeners(animatorSet, this.listeners);
        return animatorSet;
    }

    @CanIgnoreReturnValue
    @o0
    public ExpandCollapseAnimationHelper setAdditionalUpdateListener(@q0 ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.additionalUpdateListener = animatorUpdateListener;
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public ExpandCollapseAnimationHelper setCollapsedViewOffsetY(int i7) {
        this.collapsedViewOffsetY = i7;
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public ExpandCollapseAnimationHelper setDuration(long j7) {
        this.duration = j7;
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public ExpandCollapseAnimationHelper setExpandedViewOffsetY(int i7) {
        this.expandedViewOffsetY = i7;
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public ExpandCollapseAnimationHelper addEndAnchoredViews(@o0 Collection<View> collection) {
        this.endAnchoredViews.addAll(collection);
        return this;
    }
}