package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import d.b1;
@b1({b1.a.f8134l})
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class VisibilityAwareImageButton extends ImageButton {
    private int userSetVisibility;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public final int getUserSetVisibility() {
        return this.userSetVisibility;
    }

    public final void internalSetVisibility(int i7, boolean z6) {
        super.setVisibility(i7);
        if (z6) {
            this.userSetVisibility = i7;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i7) {
        internalSetVisibility(i7, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.userSetVisibility = getVisibility();
    }
}
