package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import d.o0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class SheetDelegate {
    public abstract int calculateInnerMargin(@o0 ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float calculateSlideOffset(int i7);

    public abstract int calculateTargetStateOnViewReleased(@o0 View view, float f7, float f8);

    public abstract int getExpandedOffset();

    public abstract int getHiddenOffset();

    public abstract <V extends View> int getOuterEdge(@o0 V v6);

    public abstract int getSheetEdge();

    public abstract boolean isSettling(View view, int i7, boolean z6);

    public abstract boolean shouldHide(@o0 View view, float f7);

    public abstract void updateCoplanarSiblingLayoutParams(@o0 ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i8);
}
