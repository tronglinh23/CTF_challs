package com.google.android.material.slider;

import d.o0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class BasicLabelFormatter implements LabelFormatter {
    private static final int BILLION = 1000000000;
    private static final int MILLION = 1000000;
    private static final int THOUSAND = 1000;
    private static final long TRILLION = 1000000000000L;

    @Override // com.google.android.material.slider.LabelFormatter
    @o0
    public String getFormattedValue(float f7) {
        return f7 >= 1.0E12f ? String.format(Locale.US, "%.1fT", Float.valueOf(f7 / 1.0E12f)) : f7 >= 1.0E9f ? String.format(Locale.US, "%.1fB", Float.valueOf(f7 / 1.0E9f)) : f7 >= 1000000.0f ? String.format(Locale.US, "%.1fM", Float.valueOf(f7 / 1000000.0f)) : f7 >= 1000.0f ? String.format(Locale.US, "%.1fK", Float.valueOf(f7 / 1000.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(f7));
    }
}