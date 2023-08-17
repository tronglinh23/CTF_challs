package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.g0;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import d.b1;
import d.o0;
import d.u0;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {
    @u0
    private int itemMinimumHeight;
    private final FrameLayout.LayoutParams layoutParams;

    public NavigationRailMenuView(@o0 Context context) {
        super(context);
        this.itemMinimumHeight = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.layoutParams = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int makeSharedHeightSpec(int i7, int i8, int i9) {
        int max = i8 / Math.max(1, i9);
        int i10 = this.itemMinimumHeight;
        if (i10 == -1) {
            i10 = View.MeasureSpec.getSize(i7);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i10, max), 0);
    }

    private int measureChildHeight(View view, int i7, int i8) {
        if (view.getVisibility() != 8) {
            view.measure(i7, i8);
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private int measureSharedChildHeights(int i7, int i8, int i9, View view) {
        int makeSharedHeightSpec = view == null ? makeSharedHeightSpec(i7, i8, i9) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != view) {
                i10 += measureChildHeight(childAt, i7, makeSharedHeightSpec);
            }
        }
        return i10;
    }

    private int measureShiftingChildHeights(int i7, int i8, int i9) {
        int i10;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i10 = measureChildHeight(childAt, i7, makeSharedHeightSpec(i7, i8, i9));
            i8 -= i10;
            i9--;
        } else {
            i10 = 0;
        }
        return i10 + measureSharedChildHeights(i7, i8, i9, childAt);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @o0
    public NavigationBarItemView createNavigationBarItemView(@o0 Context context) {
        return new NavigationRailItemView(context);
    }

    @u0
    public int getItemMinimumHeight() {
        return this.itemMinimumHeight;
    }

    public int getMenuGravity() {
        return this.layoutParams.gravity;
    }

    public boolean isTopGravity() {
        return (this.layoutParams.gravity & g0.f1602o) == 48;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int i11 = i9 - i7;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i12;
                childAt.layout(0, i12, i11, measuredHeight);
                i12 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        int size = View.MeasureSpec.getSize(i8);
        int size2 = getMenu().getVisibleItems().size();
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.resolveSizeAndState((size2 <= 1 || !isShifting(getLabelVisibilityMode(), size2)) ? measureSharedChildHeights(i7, size, size2, null) : measureShiftingChildHeights(i7, size, size2), i8, 0));
    }

    public void setItemMinimumHeight(@u0 int i7) {
        if (this.itemMinimumHeight != i7) {
            this.itemMinimumHeight = i7;
            requestLayout();
        }
    }

    public void setMenuGravity(int i7) {
        FrameLayout.LayoutParams layoutParams = this.layoutParams;
        if (layoutParams.gravity != i7) {
            layoutParams.gravity = i7;
            setLayoutParams(layoutParams);
        }
    }
}
