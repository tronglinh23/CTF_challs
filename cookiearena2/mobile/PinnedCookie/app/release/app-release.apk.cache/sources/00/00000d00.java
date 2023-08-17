package com.google.android.material.textfield;

import android.widget.EditText;
import d.o0;

/* loaded from: classes.dex */
class EditTextUtils {
    private EditTextUtils() {
    }

    public static boolean isEditable(@o0 EditText editText) {
        return editText.getInputType() != 0;
    }
}