package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.R;
import d.b1;
import d.f;
import d.o0;
import d.q;
import d.q0;
import d.u0;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class MaterialAttributes {
    @q0
    public static TypedValue resolve(@o0 Context context, @f int i7) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(@o0 Context context, @f int i7, boolean z6) {
        TypedValue resolve = resolve(context, i7);
        return (resolve == null || resolve.type != 18) ? z6 : resolve.data != 0;
    }

    public static boolean resolveBooleanOrThrow(@o0 Context context, @f int i7, @o0 String str) {
        return resolveOrThrow(context, i7, str) != 0;
    }

    @u0
    public static int resolveDimension(@o0 Context context, @f int i7, @q int i8) {
        TypedValue resolve = resolve(context, i7);
        return (int) ((resolve == null || resolve.type != 5) ? context.getResources().getDimension(i8) : resolve.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int resolveInteger(@o0 Context context, @f int i7, int i8) {
        TypedValue resolve = resolve(context, i7);
        return (resolve == null || resolve.type != 16) ? i8 : resolve.data;
    }

    @u0
    public static int resolveMinimumAccessibleTouchTarget(@o0 Context context) {
        return resolveDimension(context, R.attr.minTouchTargetSize, R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(@o0 Context context, @f int i7, @o0 String str) {
        return resolveTypedValueOrThrow(context, i7, str).data;
    }

    @o0
    public static TypedValue resolveTypedValueOrThrow(@o0 View view, @f int i7) {
        return resolveTypedValueOrThrow(view.getContext(), i7, view.getClass().getCanonicalName());
    }

    public static int resolveOrThrow(@o0 View view, @f int i7) {
        return resolveTypedValueOrThrow(view, i7).data;
    }

    @o0
    public static TypedValue resolveTypedValueOrThrow(@o0 Context context, @f int i7, @o0 String str) {
        TypedValue resolve = resolve(context, i7);
        if (resolve != null) {
            return resolve;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i7)));
    }
}
