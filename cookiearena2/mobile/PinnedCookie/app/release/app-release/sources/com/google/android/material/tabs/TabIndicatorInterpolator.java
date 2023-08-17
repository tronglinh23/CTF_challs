package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.tabs.TabLayout;
import d.o0;
import d.q0;
import d.r;
import d.x;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TabIndicatorInterpolator {
    @r(unit = 0)
    private static final int MIN_INDICATOR_WIDTH = 24;

    public static RectF calculateIndicatorWidthForTab(TabLayout tabLayout, @q0 View view) {
        return view == null ? new RectF() : (tabLayout.isTabIndicatorFullWidth() || !(view instanceof TabLayout.TabView)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : calculateTabViewContentBounds((TabLayout.TabView) view, 24);
    }

    public static RectF calculateTabViewContentBounds(@o0 TabLayout.TabView tabView, @r(unit = 0) int i7) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int dpToPx = (int) ViewUtils.dpToPx(tabView.getContext(), i7);
        if (contentWidth < dpToPx) {
            contentWidth = dpToPx;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i8 = contentWidth / 2;
        return new RectF(left - i8, top - (contentHeight / 2), i8 + left, top + (left / 2));
    }

    public void setIndicatorBoundsForTab(TabLayout tabLayout, View view, @o0 Drawable drawable) {
        RectF calculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view);
        drawable.setBounds((int) calculateIndicatorWidthForTab.left, drawable.getBounds().top, (int) calculateIndicatorWidthForTab.right, drawable.getBounds().bottom);
    }

    public void updateIndicatorForOffset(TabLayout tabLayout, View view, View view2, @x(from = 0.0d, to = 1.0d) float f7, @o0 Drawable drawable) {
        RectF calculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view);
        RectF calculateIndicatorWidthForTab2 = calculateIndicatorWidthForTab(tabLayout, view2);
        drawable.setBounds(AnimationUtils.lerp((int) calculateIndicatorWidthForTab.left, (int) calculateIndicatorWidthForTab2.left, f7), drawable.getBounds().top, AnimationUtils.lerp((int) calculateIndicatorWidthForTab.right, (int) calculateIndicatorWidthForTab2.right, f7), drawable.getBounds().bottom);
    }
}
