package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.material.R;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.dialog.MaterialDialogs;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import d.b1;
import d.f;
import d.g1;
import d.o0;
import d.q0;

@b1({b1.a.LIBRARY_GROUP, b1.a.TESTS})
/* loaded from: classes.dex */
public class MaterialStyledDatePickerDialog extends DatePickerDialog {
    @f
    private static final int DEF_STYLE_ATTR = 16843612;
    @g1
    private static final int DEF_STYLE_RES = R.style.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;
    @o0
    private final Drawable background;
    @o0
    private final Rect backgroundInsets;

    public MaterialStyledDatePickerDialog(@o0 Context context) {
        this(context, 0);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.background);
        getWindow().getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(this, this.backgroundInsets));
    }

    public MaterialStyledDatePickerDialog(@o0 Context context, int i7) {
        this(context, i7, null, -1, -1, -1);
    }

    public MaterialStyledDatePickerDialog(@o0 Context context, @q0 DatePickerDialog.OnDateSetListener onDateSetListener, int i7, int i8, int i9) {
        this(context, 0, onDateSetListener, i7, i8, i9);
    }

    public MaterialStyledDatePickerDialog(@o0 Context context, int i7, @q0 DatePickerDialog.OnDateSetListener onDateSetListener, int i8, int i9, int i10) {
        super(context, i7, onDateSetListener, i8, i9, i10);
        Context context2 = getContext();
        int resolveOrThrow = MaterialAttributes.resolveOrThrow(getContext(), R.attr.colorSurface, getClass().getCanonicalName());
        int i11 = DEF_STYLE_RES;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, DEF_STYLE_ATTR, i11);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(resolveOrThrow));
        Rect dialogBackgroundInsets = MaterialDialogs.getDialogBackgroundInsets(context2, DEF_STYLE_ATTR, i11);
        this.backgroundInsets = dialogBackgroundInsets;
        this.background = MaterialDialogs.insetDrawable(materialShapeDrawable, dialogBackgroundInsets);
    }
}