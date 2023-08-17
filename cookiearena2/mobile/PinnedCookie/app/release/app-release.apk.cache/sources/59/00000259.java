package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import d.b1;
import f.a;

@d.b1({b1.a.LIBRARY})
/* loaded from: classes.dex */
public class o1 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1733a = "ThemeUtils";

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f1734b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1735c = {-16842910};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1736d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1737e = {16843518};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1738f = {16842919};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1739g = {16842912};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f1740h = {16842913};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f1741i = {-16842919, -16842908};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f1742j = new int[0];

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f1743k = new int[1];

    public static void a(@d.o0 View view, @d.o0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a.m.S0);
        try {
            if (!obtainStyledAttributes.hasValue(a.m.f9480g3)) {
                Log.e(f1733a, "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @d.o0
    public static ColorStateList b(int i7, int i8) {
        return new ColorStateList(new int[][]{f1735c, f1742j}, new int[]{i8, i7});
    }

    public static int c(@d.o0 Context context, int i7) {
        ColorStateList f7 = f(context, i7);
        if (f7 == null || !f7.isStateful()) {
            TypedValue g7 = g();
            context.getTheme().resolveAttribute(16842803, g7, true);
            return e(context, i7, g7.getFloat());
        }
        return f7.getColorForState(f1735c, f7.getDefaultColor());
    }

    public static int d(@d.o0 Context context, int i7) {
        int[] iArr = f1743k;
        iArr[0] = i7;
        t1 F = t1.F(context, null, iArr);
        try {
            return F.c(0, 0);
        } finally {
            F.I();
        }
    }

    public static int e(@d.o0 Context context, int i7, float f7) {
        return p0.p0.B(d(context, i7), Math.round(Color.alpha(r0) * f7));
    }

    @d.q0
    public static ColorStateList f(@d.o0 Context context, int i7) {
        int[] iArr = f1743k;
        iArr[0] = i7;
        t1 F = t1.F(context, null, iArr);
        try {
            return F.d(0);
        } finally {
            F.I();
        }
    }

    public static TypedValue g() {
        ThreadLocal<TypedValue> threadLocal = f1734b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}