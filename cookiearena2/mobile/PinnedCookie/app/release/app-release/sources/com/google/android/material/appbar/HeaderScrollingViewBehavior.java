package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.h4;
import androidx.core.view.m0;
import androidx.core.view.u1;
import d.o0;
import d.q0;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private int overlayTop;
    final Rect tempRect1;
    final Rect tempRect2;
    private int verticalLayoutGap;

    public HeaderScrollingViewBehavior() {
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    private static int resolveGravity(int i7) {
        if (i7 == 0) {
            return 8388659;
        }
        return i7;
    }

    @q0
    public abstract View findFirstDependency(List<View> list);

    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i7 = this.overlayTop;
        return x0.a.e((int) (overlapRatioForOffset * i7), 0, i7);
    }

    public float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    public int getScrollRange(@o0 View view) {
        return view.getMeasuredHeight();
    }

    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i7) {
        View findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
        if (findFirstDependency == null) {
            super.layoutChild(coordinatorLayout, view, i7);
            this.verticalLayoutGap = 0;
            return;
        }
        CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
        Rect rect = this.tempRect1;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, findFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, ((coordinatorLayout.getHeight() + findFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        h4 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && u1.U(coordinatorLayout) && !u1.U(view)) {
            rect.left += lastWindowInsets.p();
            rect.right -= lastWindowInsets.q();
        }
        Rect rect2 = this.tempRect2;
        m0.b(resolveGravity(gVar.f3462c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i7);
        int overlapPixelsForOffset = getOverlapPixelsForOffset(findFirstDependency);
        view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
        this.verticalLayoutGap = rect2.top - findFirstDependency.getBottom();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i7, int i8, int i9, int i10) {
        View findFirstDependency;
        h4 lastWindowInsets;
        int i11 = view.getLayoutParams().height;
        if ((i11 == -1 || i11 == -2) && (findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view))) != null) {
            int size = View.MeasureSpec.getSize(i9);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (u1.U(findFirstDependency) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.r() + lastWindowInsets.o();
            }
            int scrollRange = size + getScrollRange(findFirstDependency);
            int measuredHeight = findFirstDependency.getMeasuredHeight();
            if (shouldHeaderOverlapScrollingChild()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                scrollRange -= measuredHeight;
            }
            coordinatorLayout.onMeasureChild(view, i7, i8, View.MeasureSpec.makeMeasureSpec(scrollRange, i11 == -1 ? 1073741824 : Integer.MIN_VALUE), i10);
            return true;
        }
        return false;
    }

    public final void setOverlayTop(int i7) {
        this.overlayTop = i7;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }
}
