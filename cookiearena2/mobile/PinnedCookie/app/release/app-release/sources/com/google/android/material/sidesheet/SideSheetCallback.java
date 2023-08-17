package com.google.android.material.sidesheet;

import android.view.View;
import d.o0;
/* loaded from: classes.dex */
public abstract class SideSheetCallback implements SheetCallback {
    public void onLayout(@o0 View view) {
    }

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onSlide(@o0 View view, float f7);

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onStateChanged(@o0 View view, int i7);
}
