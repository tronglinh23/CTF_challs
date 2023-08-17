package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.q;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.w;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;
import d.o0;
import d.q0;
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends q {
    @Override // androidx.appcompat.app.q
    @o0
    public e createAutoCompleteTextView(@o0 Context context, @q0 AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // androidx.appcompat.app.q
    @o0
    public g createButton(@o0 Context context, @o0 AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.q
    @o0
    public h createCheckBox(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.q
    @o0
    public w createRadioButton(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.q
    @o0
    public f0 createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
