package com.google.android.material.slider;

import d.o0;

/* loaded from: classes.dex */
public interface LabelFormatter {
    public static final int LABEL_FLOATING = 0;
    public static final int LABEL_GONE = 2;
    public static final int LABEL_VISIBLE = 3;
    public static final int LABEL_WITHIN_BOUNDS = 1;

    @o0
    String getFormattedValue(float f7);
}