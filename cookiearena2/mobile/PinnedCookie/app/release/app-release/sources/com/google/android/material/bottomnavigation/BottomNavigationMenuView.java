package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import d.b1;
import d.o0;
import java.util.ArrayList;
import java.util.List;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private boolean itemHorizontalTranslationEnabled;
    private final List<Integer> tempChildWidths;

    public BottomNavigationMenuView(@o0 Context context) {
        super(context);
        this.tempChildWidths = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.activeItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @o0
    public NavigationBarItemView createNavigationBarItemView(@o0 Context context) {
        return new BottomNavigationItemView(context);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int i11 = i9 - i7;
        int i12 = i10 - i8;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                if (u1.Z(this) == 1) {
                    int i15 = i11 - i13;
                    childAt.layout(i15 - childAt.getMeasuredWidth(), 0, i15, i12);
                } else {
                    childAt.layout(i13, 0, childAt.getMeasuredWidth() + i13, i12);
                }
                i13 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        g menu = getMenu();
        int size = View.MeasureSpec.getSize(i7);
        int size2 = menu.getVisibleItems().size();
        int childCount = getChildCount();
        this.tempChildWidths.clear();
        int size3 = View.MeasureSpec.getSize(i8);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (isShifting(getLabelVisibilityMode(), size2) && isItemHorizontalTranslationEnabled()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int i11 = this.activeItemMinWidth;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), makeMeasureSpec);
                i11 = Math.max(i11, childAt.getMeasuredWidth());
            }
            int i12 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.inactiveItemMinWidth * i12), Math.min(i11, this.activeItemMaxWidth));
            int i13 = size - min;
            int min2 = Math.min(i13 / (i12 != 0 ? i12 : 1), this.inactiveItemMaxWidth);
            int i14 = i13 - (i12 * min2);
            int i15 = 0;
            while (i15 < childCount) {
                if (getChildAt(i15).getVisibility() != 8) {
                    i10 = i15 == getSelectedItemPosition() ? min : min2;
                    if (i14 > 0) {
                        i10++;
                        i14--;
                    }
                } else {
                    i10 = 0;
                }
                this.tempChildWidths.add(Integer.valueOf(i10));
                i15++;
            }
        } else {
            int min3 = Math.min(size / (size2 != 0 ? size2 : 1), this.activeItemMaxWidth);
            int i16 = size - (size2 * min3);
            for (int i17 = 0; i17 < childCount; i17++) {
                if (getChildAt(i17).getVisibility() == 8) {
                    i9 = 0;
                } else if (i16 > 0) {
                    i9 = min3 + 1;
                    i16--;
                } else {
                    i9 = min3;
                }
                this.tempChildWidths.add(Integer.valueOf(i9));
            }
        }
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.tempChildWidths.get(i19).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i18 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(i18, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z6) {
        this.itemHorizontalTranslationEnabled = z6;
    }
}
