package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import h1.f0;
/* loaded from: classes.dex */
class ClickActionDelegate extends androidx.core.view.a {
    private final f0.a clickAction;

    public ClickActionDelegate(Context context, int i7) {
        this.clickAction = new f0.a(16, context.getString(i7));
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, f0 f0Var) {
        super.onInitializeAccessibilityNodeInfo(view, f0Var);
        f0Var.b(this.clickAction);
    }
}
