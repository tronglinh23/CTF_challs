package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m0;
import androidx.transition.r0;
import com.google.android.material.R;
import d.b1;
import d.f;
import d.o0;
import d.q0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public final class MaterialSharedAxis extends MaterialVisibility<VisibilityAnimatorProvider> {
    @f
    private static final int DEFAULT_THEMED_DURATION_ATTR = R.attr.motionDurationLong1;
    @f
    private static final int DEFAULT_THEMED_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    private final int axis;
    private final boolean forward;

    @b1({b1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Axis {
    }

    public MaterialSharedAxis(int i7, boolean z6) {
        super(createPrimaryAnimatorProvider(i7, z6), createSecondaryAnimatorProvider());
        this.axis = i7;
        this.forward = z6;
    }

    private static VisibilityAnimatorProvider createPrimaryAnimatorProvider(int i7, boolean z6) {
        if (i7 == 0) {
            return new SlideDistanceProvider(z6 ? 8388613 : m0.f3714b);
        } else if (i7 == 1) {
            return new SlideDistanceProvider(z6 ? 80 : 48);
        } else if (i7 == 2) {
            return new ScaleProvider(z6);
        } else {
            throw new IllegalArgumentException("Invalid axis: " + i7);
        }
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        return new FadeThroughProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@o0 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    public int getAxis() {
        return this.axis;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @f
    public int getDurationThemeAttrResId(boolean z6) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @f
    public int getEasingThemeAttrResId(boolean z6) {
        return DEFAULT_THEMED_EASING_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @o0
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @q0
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isForward() {
        return this.forward;
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.s1
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        return super.onAppear(viewGroup, view, r0Var, r0Var2);
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.s1
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        return super.onDisappear(viewGroup, view, r0Var, r0Var2);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@o0 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@q0 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}
