package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.t1;
import androidx.core.view.h4;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import d.b1;
import d.o0;
import d.q0;
import k0.d;
/* loaded from: classes.dex */
public class BottomNavigationView extends NavigationBarView {
    private static final int MAX_ITEM_COUNT = 5;

    @Deprecated
    /* loaded from: classes.dex */
    public interface OnNavigationItemReselectedListener extends NavigationBarView.OnItemReselectedListener {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface OnNavigationItemSelectedListener extends NavigationBarView.OnItemSelectedListener {
    }

    public BottomNavigationView(@o0 Context context) {
        this(context, null);
    }

    private void addCompatibilityTopDivider(@o0 Context context) {
        View view = new View(context);
        view.setBackgroundColor(d.f(context, R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @o0
            public h4 onApplyWindowInsets(View view, @o0 h4 h4Var, @o0 ViewUtils.RelativePadding relativePadding) {
                relativePadding.bottom += h4Var.o();
                boolean z6 = u1.Z(view) == 1;
                int p6 = h4Var.p();
                int q6 = h4Var.q();
                relativePadding.start += z6 ? q6 : p6;
                int i7 = relativePadding.end;
                if (!z6) {
                    p6 = q6;
                }
                relativePadding.end = i7 + p6;
                relativePadding.applyToView(view);
                return h4Var;
            }
        });
    }

    private int makeMinHeightSpec(int i7) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i7) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i7;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    private boolean shouldDrawCompatibilityTopDivider() {
        return false;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @b1({b1.a.LIBRARY_GROUP})
    @o0
    public NavigationBarMenuView createNavigationBarMenuView(@o0 Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return ((BottomNavigationMenuView) getMenuView()).isItemHorizontalTranslationEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(i7, makeMinHeightSpec(i8));
    }

    public void setItemHorizontalTranslationEnabled(boolean z6) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.isItemHorizontalTranslationEnabled() != z6) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z6);
            getPresenter().updateMenuView(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@q0 OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        setOnItemReselectedListener(onNavigationItemReselectedListener);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@q0 OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        setOnItemSelectedListener(onNavigationItemSelectedListener);
    }

    public BottomNavigationView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(@o0 Context context, @q0 AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, R.style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@o0 Context context, @q0 AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        Context context2 = getContext();
        t1 obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.BottomNavigationView, i7, i8, new int[0]);
        setItemHorizontalTranslationEnabled(obtainTintedStyledAttributes.a(R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        if (obtainTintedStyledAttributes.C(R.styleable.BottomNavigationView_android_minHeight)) {
            setMinimumHeight(obtainTintedStyledAttributes.g(R.styleable.BottomNavigationView_android_minHeight, 0));
        }
        if (obtainTintedStyledAttributes.a(R.styleable.BottomNavigationView_compatShadowEnabled, true) && shouldDrawCompatibilityTopDivider()) {
            addCompatibilityTopDivider(context2);
        }
        obtainTintedStyledAttributes.I();
        applyWindowInsets();
    }
}
