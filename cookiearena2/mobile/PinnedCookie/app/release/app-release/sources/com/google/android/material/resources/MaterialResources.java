package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.t1;
import com.google.android.material.R;
import d.b1;
import d.g1;
import d.h1;
import d.o0;
import d.q0;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class MaterialResources {
    private static final float FONT_SCALE_1_3 = 1.3f;
    private static final float FONT_SCALE_2_0 = 2.0f;

    private MaterialResources() {
    }

    @q0
    public static ColorStateList getColorStateList(@o0 Context context, @o0 TypedArray typedArray, @h1 int i7) {
        int resourceId;
        ColorStateList a7;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (a7 = g.a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i7) : a7;
    }

    private static int getComplexUnit(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static int getDimensionPixelSize(@o0 Context context, @o0 TypedArray typedArray, @h1 int i7, int i8) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i7, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i8);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i7, i8);
    }

    @q0
    public static Drawable getDrawable(@o0 Context context, @o0 TypedArray typedArray, @h1 int i7) {
        int resourceId;
        Drawable b7;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (b7 = g.a.b(context, resourceId)) == null) ? typedArray.getDrawable(i7) : b7;
    }

    @h1
    public static int getIndexWithValue(@o0 TypedArray typedArray, @h1 int i7, @h1 int i8) {
        return typedArray.hasValue(i7) ? i7 : i8;
    }

    @q0
    public static TextAppearance getTextAppearance(@o0 Context context, @o0 TypedArray typedArray, @h1 int i7) {
        int resourceId;
        if (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) {
            return null;
        }
        return new TextAppearance(context, resourceId);
    }

    public static int getUnscaledTextSize(@o0 Context context, @g1 int i7, int i8) {
        if (i7 == 0) {
            return i8;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, R.styleable.TextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(R.styleable.TextAppearance_android_textSize, typedValue);
        obtainStyledAttributes.recycle();
        return !value ? i8 : getComplexUnit(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static boolean isFontScaleAtLeast1_3(@o0 Context context) {
        return context.getResources().getConfiguration().fontScale >= FONT_SCALE_1_3;
    }

    public static boolean isFontScaleAtLeast2_0(@o0 Context context) {
        return context.getResources().getConfiguration().fontScale >= FONT_SCALE_2_0;
    }

    @q0
    public static ColorStateList getColorStateList(@o0 Context context, @o0 t1 t1Var, @h1 int i7) {
        int u6;
        ColorStateList a7;
        return (!t1Var.C(i7) || (u6 = t1Var.u(i7, 0)) == 0 || (a7 = g.a.a(context, u6)) == null) ? t1Var.d(i7) : a7;
    }
}
