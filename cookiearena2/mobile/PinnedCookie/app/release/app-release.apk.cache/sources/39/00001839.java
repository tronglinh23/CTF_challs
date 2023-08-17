package p0;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import d.b1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@d.b1({b1.a.LIBRARY})
@SuppressLint({"SoonBlockedPrivateApi"})
@d.w0(21)
/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14564a = "WeightTypeface";

    /* renamed from: b  reason: collision with root package name */
    public static final String f14565b = "native_instance";

    /* renamed from: c  reason: collision with root package name */
    public static final String f14566c = "nativeCreateFromTypeface";

    /* renamed from: d  reason: collision with root package name */
    public static final String f14567d = "nativeCreateWeightAlias";

    /* renamed from: e  reason: collision with root package name */
    public static final Field f14568e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f14569f;

    /* renamed from: g  reason: collision with root package name */
    public static final Method f14570g;

    /* renamed from: h  reason: collision with root package name */
    public static final Constructor<Typeface> f14571h;
    @d.b0("sWeightCacheLock")

    /* renamed from: i  reason: collision with root package name */
    public static final androidx.collection.h<SparseArray<Typeface>> f14572i;

    /* renamed from: j  reason: collision with root package name */
    public static final Object f14573j;

    static {
        Field field;
        Constructor<Typeface> constructor;
        Method method;
        Method method2;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            method = Typeface.class.getDeclaredMethod(f14566c, cls, cls2);
            method.setAccessible(true);
            method2 = Typeface.class.getDeclaredMethod(f14567d, cls, cls2);
            method2.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e7) {
            Log.e("WeightTypeface", e7.getClass().getName(), e7);
            field = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f14568e = field;
        f14569f = method;
        f14570g = method2;
        f14571h = constructor;
        f14572i = new androidx.collection.h<>(3);
        f14573j = new Object();
    }

    @d.q0
    public static Typeface a(long j7) {
        try {
            return f14571h.newInstance(Long.valueOf(j7));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @d.q0
    public static Typeface b(@d.o0 Typeface typeface, int i7, boolean z6) {
        if (d()) {
            int i8 = (i7 << 1) | z6;
            synchronized (f14573j) {
                long c7 = c(typeface);
                androidx.collection.h<SparseArray<Typeface>> hVar = f14572i;
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
                Typeface a7 = z6 == typeface.isItalic() ? a(f(c7, i7)) : a(e(c7, i7, z6));
                o6.put(i8, a7);
                return a7;
            }
        }
        return null;
    }

    public static long c(@d.o0 Typeface typeface) {
        try {
            return f14568e.getLong(typeface);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static boolean d() {
        return f14568e != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static long e(long j7, int i7, boolean z6) {
        try {
            return ((Long) f14570g.invoke(null, Long.valueOf(((Long) f14569f.invoke(null, Long.valueOf(j7), Integer.valueOf(z6 ? 2 : 0))).longValue()), Integer.valueOf(i7))).longValue();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static long f(long j7, int i7) {
        try {
            return ((Long) f14570g.invoke(null, Long.valueOf(j7), Integer.valueOf(i7))).longValue();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }
}