package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;
/* loaded from: classes.dex */
class MaxInputValidator implements InputFilter {
    private int max;

    public MaxInputValidator(int i7) {
        this.max = i7;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i9, i10, charSequence.subSequence(i7, i8).toString());
            if (Integer.parseInt(sb.toString()) <= this.max) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int i7) {
        this.max = i7;
    }
}
