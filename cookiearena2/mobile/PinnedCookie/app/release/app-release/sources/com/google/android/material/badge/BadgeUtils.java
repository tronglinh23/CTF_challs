package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.a;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ToolbarUtils;
import d.d0;
import d.l1;
import d.o0;
import d.q0;
import h1.f0;
@ExperimentalBadgeUtils
/* loaded from: classes.dex */
public class BadgeUtils {
    private static final String LOG_TAG = "BadgeUtils";
    public static final boolean USE_COMPAT_PARENT = false;

    private BadgeUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void attachBadgeContentDescription(@o0 final BadgeDrawable badgeDrawable, @o0 View view) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (Build.VERSION.SDK_INT < 29 || !u1.G0(view)) {
            u1.B1(view, new a() { // from class: com.google.android.material.badge.BadgeUtils.3
                @Override // androidx.core.view.a
                public void onInitializeAccessibilityNodeInfo(View view2, f0 f0Var) {
                    super.onInitializeAccessibilityNodeInfo(view2, f0Var);
                    f0Var.f1(BadgeDrawable.this.getContentDescription());
                }
            });
            return;
        }
        accessibilityDelegate = view.getAccessibilityDelegate();
        u1.B1(view, new a(accessibilityDelegate) { // from class: com.google.android.material.badge.BadgeUtils.2
            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view2, f0 f0Var) {
                super.onInitializeAccessibilityNodeInfo(view2, f0Var);
                f0Var.f1(badgeDrawable.getContentDescription());
            }
        });
    }

    public static void attachBadgeDrawable(@o0 BadgeDrawable badgeDrawable, @o0 View view) {
        attachBadgeDrawable(badgeDrawable, view, (FrameLayout) null);
    }

    @o0
    public static SparseArray<BadgeDrawable> createBadgeDrawablesFromSavedStates(Context context, @o0 ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i7 = 0; i7 < parcelableSparseArray.size(); i7++) {
            int keyAt = parcelableSparseArray.keyAt(i7);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i7);
            if (state == null) {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(keyAt, BadgeDrawable.createFromSavedState(context, state));
        }
        return sparseArray;
    }

    @o0
    public static ParcelableSparseArray createParcelableBadgeStates(@o0 SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            int keyAt = sparseArray.keyAt(i7);
            BadgeDrawable valueAt = sparseArray.valueAt(i7);
            if (valueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(keyAt, valueAt.getSavedState());
        }
        return parcelableSparseArray;
    }

    private static void detachBadgeContentDescription(@o0 View view) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (Build.VERSION.SDK_INT < 29 || !u1.G0(view)) {
            u1.B1(view, null);
            return;
        }
        accessibilityDelegate = view.getAccessibilityDelegate();
        u1.B1(view, new a(accessibilityDelegate) { // from class: com.google.android.material.badge.BadgeUtils.4
            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view2, f0 f0Var) {
                super.onInitializeAccessibilityNodeInfo(view2, f0Var);
                f0Var.f1(null);
            }
        });
    }

    public static void detachBadgeDrawable(@q0 BadgeDrawable badgeDrawable, @o0 View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (!USE_COMPAT_PARENT && badgeDrawable.getCustomBadgeParent() == null) {
            view.getOverlay().remove(badgeDrawable);
        } else {
            badgeDrawable.getCustomBadgeParent().setForeground(null);
        }
    }

    @l1
    public static void removeToolbarOffset(BadgeDrawable badgeDrawable) {
        badgeDrawable.setAdditionalHorizontalOffset(0);
        badgeDrawable.setAdditionalVerticalOffset(0);
    }

    public static void setBadgeDrawableBounds(@o0 BadgeDrawable badgeDrawable, @o0 View view, @q0 FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.updateBadgeCoordinates(view, frameLayout);
    }

    @l1
    public static void setToolbarOffset(BadgeDrawable badgeDrawable, Resources resources) {
        badgeDrawable.setAdditionalHorizontalOffset(resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
        badgeDrawable.setAdditionalVerticalOffset(resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset));
    }

    public static void updateBadgeBounds(@o0 Rect rect, float f7, float f8, float f9, float f10) {
        rect.set((int) (f7 - f9), (int) (f8 - f10), (int) (f7 + f9), (int) (f8 + f10));
    }

    public static void attachBadgeDrawable(@o0 BadgeDrawable badgeDrawable, @o0 View view, @q0 FrameLayout frameLayout) {
        setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
        if (badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(badgeDrawable);
        } else if (!USE_COMPAT_PARENT) {
            view.getOverlay().add(badgeDrawable);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    public static void detachBadgeDrawable(@q0 BadgeDrawable badgeDrawable, @o0 Toolbar toolbar, @d0 int i7) {
        if (badgeDrawable == null) {
            return;
        }
        ActionMenuItemView actionMenuItemView = ToolbarUtils.getActionMenuItemView(toolbar, i7);
        if (actionMenuItemView != null) {
            removeToolbarOffset(badgeDrawable);
            detachBadgeDrawable(badgeDrawable, actionMenuItemView);
            detachBadgeContentDescription(actionMenuItemView);
            return;
        }
        Log.w(LOG_TAG, "Trying to remove badge from a null menuItemView: " + i7);
    }

    public static void attachBadgeDrawable(@o0 BadgeDrawable badgeDrawable, @o0 Toolbar toolbar, @d0 int i7) {
        attachBadgeDrawable(badgeDrawable, toolbar, i7, null);
    }

    public static void attachBadgeDrawable(@o0 final BadgeDrawable badgeDrawable, @o0 final Toolbar toolbar, @d0 final int i7, @q0 final FrameLayout frameLayout) {
        toolbar.post(new Runnable() { // from class: com.google.android.material.badge.BadgeUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ActionMenuItemView actionMenuItemView = ToolbarUtils.getActionMenuItemView(Toolbar.this, i7);
                if (actionMenuItemView != null) {
                    BadgeUtils.setToolbarOffset(badgeDrawable, Toolbar.this.getResources());
                    BadgeUtils.attachBadgeDrawable(badgeDrawable, actionMenuItemView, frameLayout);
                    BadgeUtils.attachBadgeContentDescription(badgeDrawable, actionMenuItemView);
                }
            }
        });
    }
}
