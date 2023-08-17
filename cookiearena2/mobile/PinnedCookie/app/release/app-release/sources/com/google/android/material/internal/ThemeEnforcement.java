package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.t1;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import d.b1;
import d.f;
import d.g1;
import d.h1;
import d.o0;
import d.q0;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class ThemeEnforcement {
    private static final String APPCOMPAT_THEME_NAME = "Theme.AppCompat";
    private static final String MATERIAL_THEME_NAME = "Theme.MaterialComponents";
    private static final int[] APPCOMPAT_CHECK_ATTRS = {R.attr.colorPrimary};
    private static final int[] MATERIAL_CHECK_ATTRS = {R.attr.colorPrimaryVariant};

    private ThemeEnforcement() {
    }

    public static void checkAppCompatTheme(@o0 Context context) {
        checkTheme(context, APPCOMPAT_CHECK_ATTRS, APPCOMPAT_THEME_NAME);
    }

    private static void checkCompatibleTheme(@o0 Context context, AttributeSet attributeSet, @f int i7, @g1 int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ThemeEnforcement, i7, i8);
        boolean z6 = obtainStyledAttributes.getBoolean(R.styleable.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z6) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                checkMaterialTheme(context);
            }
        }
        checkAppCompatTheme(context);
    }

    public static void checkMaterialTheme(@o0 Context context) {
        checkTheme(context, MATERIAL_CHECK_ATTRS, MATERIAL_THEME_NAME);
    }

    private static void checkTextAppearance(@o0 Context context, AttributeSet attributeSet, @h1 @o0 int[] iArr, @f int i7, @g1 int i8, @q0 @h1 int... iArr2) {
        boolean z6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ThemeEnforcement, i7, i8);
        if (!obtainStyledAttributes.getBoolean(R.styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z6 = obtainStyledAttributes.getResourceId(R.styleable.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            z6 = isCustomTextAppearanceValid(context, attributeSet, iArr, i7, i8, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z6) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void checkTheme(@o0 Context context, @o0 int[] iArr, String str) {
        if (isTheme(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static boolean isAppCompatTheme(@o0 Context context) {
        return isTheme(context, APPCOMPAT_CHECK_ATTRS);
    }

    private static boolean isCustomTextAppearanceValid(@o0 Context context, AttributeSet attributeSet, @h1 @o0 int[] iArr, @f int i7, @g1 int i8, @h1 @o0 int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, i8);
        for (int i9 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i9, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean isMaterial3Theme(@o0 Context context) {
        return MaterialAttributes.resolveBoolean(context, R.attr.isMaterial3Theme, false);
    }

    public static boolean isMaterialTheme(@o0 Context context) {
        return isTheme(context, MATERIAL_CHECK_ATTRS);
    }

    private static boolean isTheme(@o0 Context context, @o0 int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i7 = 0; i7 < iArr.length; i7++) {
            if (!obtainStyledAttributes.hasValue(i7)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    @o0
    public static TypedArray obtainStyledAttributes(@o0 Context context, AttributeSet attributeSet, @h1 @o0 int[] iArr, @f int i7, @g1 int i8, @h1 int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i7, i8);
        checkTextAppearance(context, attributeSet, iArr, i7, i8, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i7, i8);
    }

    public static t1 obtainTintedStyledAttributes(@o0 Context context, AttributeSet attributeSet, @h1 @o0 int[] iArr, @f int i7, @g1 int i8, @h1 int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i7, i8);
        checkTextAppearance(context, attributeSet, iArr, i7, i8, iArr2);
        return t1.G(context, attributeSet, iArr, i7, i8);
    }
}
