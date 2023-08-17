package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.f0;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import d.h1;
import d.o0;
import d.q0;
/* loaded from: classes.dex */
public class MaterialTextView extends f0 {
    public MaterialTextView(@o0 Context context) {
        this(context, null);
    }

    private void applyLineHeightFromViewAppearance(@o0 Resources.Theme theme, int i7) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i7, R.styleable.MaterialTextAppearance);
        int readFirstAvailableDimension = readFirstAvailableDimension(getContext(), obtainStyledAttributes, R.styleable.MaterialTextAppearance_android_lineHeight, R.styleable.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (readFirstAvailableDimension >= 0) {
            setLineHeight(readFirstAvailableDimension);
        }
    }

    private static boolean canApplyTextAppearanceLineHeight(Context context) {
        return MaterialAttributes.resolveBoolean(context, R.attr.textAppearanceLineHeightEnabled, true);
    }

    private static int findViewAppearanceResourceId(@o0 Resources.Theme theme, @q0 AttributeSet attributeSet, int i7, int i8) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.MaterialTextView, i7, i8);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void initialize(@q0 AttributeSet attributeSet, int i7, int i8) {
        int findViewAppearanceResourceId;
        Context context = getContext();
        if (canApplyTextAppearanceLineHeight(context)) {
            Resources.Theme theme = context.getTheme();
            if (viewAttrsHasLineHeight(context, theme, attributeSet, i7, i8) || (findViewAppearanceResourceId = findViewAppearanceResourceId(theme, attributeSet, i7, i8)) == -1) {
                return;
            }
            applyLineHeightFromViewAppearance(theme, findViewAppearanceResourceId);
        }
    }

    private static int readFirstAvailableDimension(@o0 Context context, @o0 TypedArray typedArray, @h1 @o0 int... iArr) {
        int i7 = -1;
        for (int i8 = 0; i8 < iArr.length && i7 < 0; i8++) {
            i7 = MaterialResources.getDimensionPixelSize(context, typedArray, iArr[i8], -1);
        }
        return i7;
    }

    private static boolean viewAttrsHasLineHeight(@o0 Context context, @o0 Resources.Theme theme, @q0 AttributeSet attributeSet, int i7, int i8) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.MaterialTextView, i7, i8);
        int readFirstAvailableDimension = readFirstAvailableDimension(context, obtainStyledAttributes, R.styleable.MaterialTextView_android_lineHeight, R.styleable.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        return readFirstAvailableDimension != -1;
    }

    @Override // androidx.appcompat.widget.f0, android.widget.TextView
    public void setTextAppearance(@o0 Context context, int i7) {
        super.setTextAppearance(context, i7);
        if (canApplyTextAppearanceLineHeight(context)) {
            applyLineHeightFromViewAppearance(context.getTheme(), i7);
        }
    }

    public MaterialTextView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(@o0 Context context, @q0 AttributeSet attributeSet, int i7) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, 0), attributeSet, i7);
        initialize(attributeSet, i7, 0);
    }

    @Deprecated
    public MaterialTextView(@o0 Context context, @q0 AttributeSet attributeSet, int i7, int i8) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, i8), attributeSet, i7);
        initialize(attributeSet, i7, i8);
    }
}
