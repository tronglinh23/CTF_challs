package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.r0;
import androidx.transition.s1;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.VisibilityAnimatorProvider;
import d.f;
import d.o0;
import d.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends s1 {
    private final List<VisibilityAnimatorProvider> additionalAnimatorProviders = new ArrayList();
    private final P primaryAnimatorProvider;
    @q0
    private VisibilityAnimatorProvider secondaryAnimatorProvider;

    public MaterialVisibility(P p6, @q0 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.primaryAnimatorProvider = p6;
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
    }

    private static void addAnimatorIfNeeded(List<Animator> list, @q0 VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z6) {
        if (visibilityAnimatorProvider == null) {
            return;
        }
        Animator createAppear = z6 ? visibilityAnimatorProvider.createAppear(viewGroup, view) : visibilityAnimatorProvider.createDisappear(viewGroup, view);
        if (createAppear != null) {
            list.add(createAppear);
        }
    }

    private Animator createAnimator(@o0 ViewGroup viewGroup, @o0 View view, boolean z6) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        addAnimatorIfNeeded(arrayList, this.primaryAnimatorProvider, viewGroup, view, z6);
        addAnimatorIfNeeded(arrayList, this.secondaryAnimatorProvider, viewGroup, view, z6);
        Iterator<VisibilityAnimatorProvider> it = this.additionalAnimatorProviders.iterator();
        while (it.hasNext()) {
            addAnimatorIfNeeded(arrayList, it.next(), viewGroup, view, z6);
        }
        maybeApplyThemeValues(viewGroup.getContext(), z6);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private void maybeApplyThemeValues(@o0 Context context, boolean z6) {
        TransitionUtils.maybeApplyThemeDuration(this, context, getDurationThemeAttrResId(z6));
        TransitionUtils.maybeApplyThemeInterpolator(this, context, getEasingThemeAttrResId(z6), getDefaultEasingInterpolator(z6));
    }

    public void addAdditionalAnimatorProvider(@o0 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.additionalAnimatorProviders.add(visibilityAnimatorProvider);
    }

    public void clearAdditionalAnimatorProvider() {
        this.additionalAnimatorProviders.clear();
    }

    @o0
    public TimeInterpolator getDefaultEasingInterpolator(boolean z6) {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    @f
    public int getDurationThemeAttrResId(boolean z6) {
        return 0;
    }

    @f
    public int getEasingThemeAttrResId(boolean z6) {
        return 0;
    }

    @o0
    public P getPrimaryAnimatorProvider() {
        return this.primaryAnimatorProvider;
    }

    @q0
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    @Override // androidx.transition.s1
    public Animator onAppear(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        return createAnimator(viewGroup, view, true);
    }

    @Override // androidx.transition.s1
    public Animator onDisappear(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        return createAnimator(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(@o0 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.additionalAnimatorProviders.remove(visibilityAnimatorProvider);
    }

    public void setSecondaryAnimatorProvider(@q0 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
    }
}
