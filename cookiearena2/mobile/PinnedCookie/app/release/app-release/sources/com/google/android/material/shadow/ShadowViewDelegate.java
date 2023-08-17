package com.google.android.material.shadow;

import android.graphics.drawable.Drawable;
import d.q0;
/* loaded from: classes.dex */
public interface ShadowViewDelegate {
    float getRadius();

    boolean isCompatPaddingEnabled();

    void setBackgroundDrawable(@q0 Drawable drawable);

    void setShadowPadding(int i7, int i8, int i9, int i10);
}
