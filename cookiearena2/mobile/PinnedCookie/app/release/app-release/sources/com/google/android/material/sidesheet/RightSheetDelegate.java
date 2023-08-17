package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import d.o0;
/* loaded from: classes.dex */
final class RightSheetDelegate extends SheetDelegate {
    final SideSheetBehavior<? extends View> sheetBehavior;

    public RightSheetDelegate(@o0 SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.sheetBehavior = sideSheetBehavior;
    }

    private boolean isReleasedCloseToOriginEdge(@o0 View view) {
        return view.getLeft() > (getHiddenOffset() - getExpandedOffset()) / 2;
    }

    private boolean isSwipeSignificant(float f7, float f8) {
        return SheetUtils.isSwipeMostlyHorizontal(f7, f8) && f8 > ((float) this.sheetBehavior.getSignificantVelocityThreshold());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int calculateInnerMargin(@o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public float calculateSlideOffset(int i7) {
        float hiddenOffset = getHiddenOffset();
        return (hiddenOffset - i7) / (hiddenOffset - getExpandedOffset());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int calculateTargetStateOnViewReleased(@o0 View view, float f7, float f8) {
        if (f7 < 0.0f) {
            return 3;
        }
        if (shouldHide(view, f7)) {
            if (!isSwipeSignificant(f7, f8) && !isReleasedCloseToOriginEdge(view)) {
                return 3;
            }
        } else if (f7 == 0.0f || !SheetUtils.isSwipeMostlyHorizontal(f7, f8)) {
            int left = view.getLeft();
            if (Math.abs(left - getExpandedOffset()) < Math.abs(left - getHiddenOffset())) {
                return 3;
            }
        }
        return 5;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getExpandedOffset() {
        return Math.max(0, (getHiddenOffset() - this.sheetBehavior.getChildWidth()) - this.sheetBehavior.getInnerMargin());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getHiddenOffset() {
        return this.sheetBehavior.getParentWidth();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public <V extends View> int getOuterEdge(@o0 V v6) {
        return v6.getLeft() - this.sheetBehavior.getInnerMargin();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getSheetEdge() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean isSettling(View view, int i7, boolean z6) {
        int outerEdgeOffsetForState = this.sheetBehavior.getOuterEdgeOffsetForState(i7);
        androidx.customview.widget.d viewDragHelper = this.sheetBehavior.getViewDragHelper();
        return viewDragHelper != null && (!z6 ? !viewDragHelper.X(view, outerEdgeOffsetForState, view.getTop()) : !viewDragHelper.V(outerEdgeOffsetForState, view.getTop()));
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean shouldHide(@o0 View view, float f7) {
        return Math.abs(((float) view.getRight()) + (f7 * this.sheetBehavior.getHideFriction())) > this.sheetBehavior.getHideThreshold();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public void updateCoplanarSiblingLayoutParams(@o0 ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i8) {
        int parentWidth = this.sheetBehavior.getParentWidth();
        if (i7 <= parentWidth) {
            marginLayoutParams.rightMargin = parentWidth - i7;
        }
    }
}
