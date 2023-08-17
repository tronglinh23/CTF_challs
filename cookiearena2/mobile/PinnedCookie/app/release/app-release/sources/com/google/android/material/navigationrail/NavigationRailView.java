package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.t1;
import androidx.core.view.h4;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarView;
import d.b1;
import d.j0;
import d.o0;
import d.q0;
import d.u0;
/* loaded from: classes.dex */
public class NavigationRailView extends NavigationBarView {
    private static final int DEFAULT_HEADER_GRAVITY = 49;
    static final int DEFAULT_MENU_GRAVITY = 49;
    static final int MAX_ITEM_COUNT = 7;
    static final int NO_ITEM_MINIMUM_HEIGHT = -1;
    @q0
    private View headerView;
    @q0
    private Boolean paddingBottomSystemWindowInsets;
    @q0
    private Boolean paddingTopSystemWindowInsets;
    private final int topMargin;

    public NavigationRailView(@o0 Context context) {
        this(context, null);
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.navigationrail.NavigationRailView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @o0
            public h4 onApplyWindowInsets(View view, @o0 h4 h4Var, @o0 ViewUtils.RelativePadding relativePadding) {
                NavigationRailView navigationRailView = NavigationRailView.this;
                if (navigationRailView.shouldApplyWindowInsetPadding(navigationRailView.paddingTopSystemWindowInsets)) {
                    relativePadding.top += h4Var.f(h4.m.i()).f14586b;
                }
                NavigationRailView navigationRailView2 = NavigationRailView.this;
                if (navigationRailView2.shouldApplyWindowInsetPadding(navigationRailView2.paddingBottomSystemWindowInsets)) {
                    relativePadding.bottom += h4Var.f(h4.m.i()).f14588d;
                }
                boolean z6 = u1.Z(view) == 1;
                int p6 = h4Var.p();
                int q6 = h4Var.q();
                int i7 = relativePadding.start;
                if (z6) {
                    p6 = q6;
                }
                relativePadding.start = i7 + p6;
                relativePadding.applyToView(view);
                return h4Var;
            }
        });
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private boolean isHeaderViewVisible() {
        View view = this.headerView;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    private int makeMinWidthSpec(int i7) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i7) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i7;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldApplyWindowInsetPadding(Boolean bool) {
        return bool != null ? bool.booleanValue() : u1.U(this);
    }

    public void addHeaderView(@j0 int i7) {
        addHeaderView(LayoutInflater.from(getContext()).inflate(i7, (ViewGroup) this, false));
    }

    @q0
    public View getHeaderView() {
        return this.headerView;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i11 = 0;
        if (isHeaderViewVisible()) {
            int bottom = this.headerView.getBottom() + this.topMargin;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i11 = bottom - top;
            }
        } else if (navigationRailMenuView.isTopGravity()) {
            i11 = this.topMargin;
        }
        if (i11 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i11, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i11);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        int makeMinWidthSpec = makeMinWidthSpec(i7);
        super.onMeasure(makeMinWidthSpec, i8);
        if (isHeaderViewVisible()) {
            measureChild(getNavigationRailMenuView(), makeMinWidthSpec, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.headerView.getMeasuredHeight()) - this.topMargin, Integer.MIN_VALUE));
        }
    }

    public void removeHeaderView() {
        View view = this.headerView;
        if (view != null) {
            removeView(view);
            this.headerView = null;
        }
    }

    public void setItemMinimumHeight(@u0 int i7) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i7);
    }

    public void setMenuGravity(int i7) {
        getNavigationRailMenuView().setMenuGravity(i7);
    }

    public NavigationRailView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public void addHeaderView(@o0 View view) {
        removeHeaderView();
        this.headerView = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.topMargin;
        addView(view, 0, layoutParams);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @b1({b1.a.LIBRARY_GROUP})
    @o0
    public NavigationRailMenuView createNavigationBarMenuView(@o0 Context context) {
        return new NavigationRailMenuView(context);
    }

    public NavigationRailView(@o0 Context context, @q0 AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, R.style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@o0 Context context, @q0 AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.paddingTopSystemWindowInsets = null;
        this.paddingBottomSystemWindowInsets = null;
        this.topMargin = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        t1 obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(getContext(), attributeSet, R.styleable.NavigationRailView, i7, i8, new int[0]);
        int u6 = obtainTintedStyledAttributes.u(R.styleable.NavigationRailView_headerLayout, 0);
        if (u6 != 0) {
            addHeaderView(u6);
        }
        setMenuGravity(obtainTintedStyledAttributes.o(R.styleable.NavigationRailView_menuGravity, 49));
        if (obtainTintedStyledAttributes.C(R.styleable.NavigationRailView_itemMinHeight)) {
            setItemMinimumHeight(obtainTintedStyledAttributes.g(R.styleable.NavigationRailView_itemMinHeight, -1));
        }
        if (obtainTintedStyledAttributes.C(R.styleable.NavigationRailView_paddingTopSystemWindowInsets)) {
            this.paddingTopSystemWindowInsets = Boolean.valueOf(obtainTintedStyledAttributes.a(R.styleable.NavigationRailView_paddingTopSystemWindowInsets, false));
        }
        if (obtainTintedStyledAttributes.C(R.styleable.NavigationRailView_paddingBottomSystemWindowInsets)) {
            this.paddingBottomSystemWindowInsets = Boolean.valueOf(obtainTintedStyledAttributes.a(R.styleable.NavigationRailView_paddingBottomSystemWindowInsets, false));
        }
        obtainTintedStyledAttributes.I();
        applyWindowInsets();
    }
}
