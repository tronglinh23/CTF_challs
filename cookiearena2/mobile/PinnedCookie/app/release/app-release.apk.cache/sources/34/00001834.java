package p0;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import d.b1;
import java.lang.reflect.Field;
import m0.f;

@d.b1({b1.a.LIBRARY})
/* loaded from: classes.dex */
public final class o2 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14551a = "WeightTypeface";

    /* renamed from: b  reason: collision with root package name */
    public static final String f14552b = "native_instance";

    /* renamed from: c  reason: collision with root package name */
    public static final Field f14553c;
    @d.b0("sWeightCacheLock")

    /* renamed from: d  reason: collision with root package name */
    public static final androidx.collection.h<SparseArray<Typeface>> f14554d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f14555e;

    static {
        Field field;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            field.setAccessible(true);
        } catch (Exception e7) {
            Log.e("WeightTypeface", e7.getClass().getName(), e7);
            field = null;
        }
        f14553c = field;
        f14554d = new androidx.collection.h<>(3);
        f14555e = new Object();
    }

    @d.q0
    public static Typeface a(@d.o0 m2 m2Var, @d.o0 Context context, @d.o0 Typeface typeface, int i7, boolean z6) {
        if (d()) {
            int i8 = (i7 << 1) | (z6 ? 1 : 0);
            synchronized (f14555e) {
                long c7 = c(typeface);
                androidx.collection.h<SparseArray<Typeface>> hVar = f14554d;
                SparseArray<Typeface> o6 = hVar.o(c7);
                if (o6 == null) {
                    o6 = new SparseArray<>(4);
                    hVar.u(c7, o6);
                } else {
                    Typeface typeface2 = o6.get(i8);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface b7 = b(m2Var, context, typeface, i7, z6);
                if (b7 == null) {
                    b7 = e(typeface, i7, z6);
                }
                o6.put(i8, b7);
                return b7;
            }
        }
        return null;
    }

    @d.q0
    public static Typeface b(@d.o0 m2 m2Var, @d.o0 Context context, @d.o0 Typeface typeface, int i7, boolean z6) {
        f.d m7 = m2Var.m(typeface);
        if (m7 == null) {
            return null;
        }
        return m2Var.c(context, m7, context.getResources(), i7, z6);
    }

    public static long c(@d.o0 Typeface typeface) {
        try {
            return ((Number) f14553c.get(typeface)).longValue();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static boolean d() {
        return f14553c != null;
    }

    public static Typeface e(Typeface typeface, int i7, boolean z6) {
        int i8 = 1;
        boolean z7 = i7 >= 600;
        if (!z7 && !z6) {
            i8 = 0;
        } else if (!z7) {
            i8 = 2;
        } else if (z6) {
            i8 = 3;
        }
        return Typeface.create(typeface, i8);
    }
}