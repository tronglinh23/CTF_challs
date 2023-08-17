package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import d.b1;
import d.o0;
import d.q0;

@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class TypefaceUtils {
    private TypefaceUtils() {
    }

    @q0
    public static Typeface maybeCopyWithFontWeightAdjustment(@o0 Context context, @o0 Typeface typeface) {
        return maybeCopyWithFontWeightAdjustment(context.getResources().getConfiguration(), typeface);
    }

    @q0
    public static Typeface maybeCopyWithFontWeightAdjustment(@o0 Configuration configuration, @o0 Typeface typeface) {
        int i7;
        int i8;
        int weight;
        int i9;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i7 = configuration.fontWeightAdjustment;
            if (i7 != Integer.MAX_VALUE) {
                i8 = configuration.fontWeightAdjustment;
                if (i8 == 0 || typeface == null) {
                    return null;
                }
                weight = typeface.getWeight();
                i9 = configuration.fontWeightAdjustment;
                create = Typeface.create(typeface, x0.a.e(weight + i9, 1, 1000), typeface.isItalic());
                return create;
            }
            return null;
        }
        return null;
    }
}