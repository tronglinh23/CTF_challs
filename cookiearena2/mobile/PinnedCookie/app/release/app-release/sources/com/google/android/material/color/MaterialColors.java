package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.R;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;
import d.g0;
import d.l;
import d.o0;
import d.q0;
import d.x;
import p0.p0;
/* loaded from: classes.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;

    private MaterialColors() {
    }

    @l
    public static int compositeARGBWithAlpha(@l int i7, @g0(from = 0, to = 255) int i8) {
        return p0.B(i7, (Color.alpha(i7) * i8) / 255);
    }

    @l
    public static int getColor(@o0 View view, @d.f int i7) {
        return resolveColor(view.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view, i7));
    }

    @l
    private static int getColorRole(@l int i7, @g0(from = 0, to = 100) int i8) {
        Hct fromInt = Hct.fromInt(i7);
        fromInt.setTone(i8);
        return fromInt.toInt();
    }

    @o0
    public static ColorRoles getColorRoles(@o0 Context context, @l int i7) {
        return getColorRoles(i7, MaterialAttributes.resolveBoolean(context, R.attr.isLightTheme, true));
    }

    @o0
    public static ColorStateList getColorStateList(@o0 Context context, @d.f int i7, @o0 ColorStateList colorStateList) {
        TypedValue resolve = MaterialAttributes.resolve(context, i7);
        ColorStateList resolveColorStateList = resolve != null ? resolveColorStateList(context, resolve) : null;
        return resolveColorStateList == null ? colorStateList : resolveColorStateList;
    }

    @q0
    public static ColorStateList getColorStateListOrNull(@o0 Context context, @d.f int i7) {
        TypedValue resolve = MaterialAttributes.resolve(context, i7);
        if (resolve == null) {
            return null;
        }
        int i8 = resolve.resourceId;
        if (i8 != 0) {
            return k0.d.g(context, i8);
        }
        int i9 = resolve.data;
        if (i9 != 0) {
            return ColorStateList.valueOf(i9);
        }
        return null;
    }

    @l
    public static int harmonize(@l int i7, @l int i8) {
        return Blend.harmonize(i7, i8);
    }

    @l
    public static int harmonizeWithPrimary(@o0 Context context, @l int i7) {
        return harmonize(i7, getColor(context, R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(@l int i7) {
        return i7 != 0 && p0.m(i7) > 0.5d;
    }

    @l
    public static int layer(@o0 View view, @d.f int i7, @d.f int i8) {
        return layer(view, i7, i8, 1.0f);
    }

    private static int resolveColor(@o0 Context context, @o0 TypedValue typedValue) {
        int i7 = typedValue.resourceId;
        return i7 != 0 ? k0.d.f(context, i7) : typedValue.data;
    }

    private static ColorStateList resolveColorStateList(@o0 Context context, @o0 TypedValue typedValue) {
        int i7 = typedValue.resourceId;
        return i7 != 0 ? k0.d.g(context, i7) : ColorStateList.valueOf(typedValue.data);
    }

    @l
    public static int layer(@o0 View view, @d.f int i7, @d.f int i8, @x(from = 0.0d, to = 1.0d) float f7) {
        return layer(getColor(view, i7), getColor(view, i8), f7);
    }

    @l
    public static int getColor(Context context, @d.f int i7, String str) {
        return resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, i7, str));
    }

    @o0
    public static ColorRoles getColorRoles(@l int i7, boolean z6) {
        if (z6) {
            return new ColorRoles(getColorRole(i7, 40), getColorRole(i7, 100), getColorRole(i7, 90), getColorRole(i7, 10));
        }
        return new ColorRoles(getColorRole(i7, 80), getColorRole(i7, 20), getColorRole(i7, 30), getColorRole(i7, 90));
    }

    @l
    public static int layer(@l int i7, @l int i8, @x(from = 0.0d, to = 1.0d) float f7) {
        return layer(i7, p0.B(i8, Math.round(Color.alpha(i8) * f7)));
    }

    @l
    public static int getColor(@o0 View view, @d.f int i7, @l int i8) {
        return getColor(view.getContext(), i7, i8);
    }

    @l
    public static int getColor(@o0 Context context, @d.f int i7, @l int i8) {
        TypedValue resolve = MaterialAttributes.resolve(context, i7);
        return resolve != null ? resolveColor(context, resolve) : i8;
    }

    @l
    public static int layer(@l int i7, @l int i8) {
        return p0.t(i8, i7);
    }
}
