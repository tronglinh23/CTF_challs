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
@d.w0(26)
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14574a = "WeightTypeface";

    /* renamed from: b  reason: collision with root package name */
    public static final String f14575b = "native_instance";

    /* renamed from: c  reason: collision with root package name */
    public static final String f14576c = "nativeCreateFromTypefaceWithExactStyle";

    /* renamed from: d  reason: collision with root package name */
    public static final Field f14577d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f14578e;

    /* renamed from: f  reason: collision with root package name */
    public static final Constructor<Typeface> f14579f;
    @d.b0("sWeightCacheLock")

    /* renamed from: g  reason: collision with root package name */
    public static final androidx.collection.h<SparseArray<Typeface>> f14580g;

    /* renamed from: h  reason: collision with root package name */
    public static final Object f14581h;

    static {
        Field field;
        Constructor<Typeface> constructor;
        Method method;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            method = Typeface.class.getDeclaredMethod(f14576c, cls, Integer.TYPE, Boolean.TYPE);
            method.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e7) {
            Log.e("WeightTypeface", e7.getClass().getName(), e7);
            field = null;
            constructor = null;
            method = null;
        }
        f14577d = field;
        f14578e = method;
        f14579f = constructor;
        f14580g = new androidx.collection.h<>(3);
        f14581h = new Object();
    }

    @d.q0
    public static Typeface a(long j7) {
        try {
            return f14579f.newInstance(Long.valueOf(j7));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @d.q0
    public static Typeface b(@d.o0 Typeface typeface, int i7, boolean z6) {
        if (d()) {
            int i8 = (i7 << 1) | (z6 ? 1 : 0);
            synchronized (f14581h) {
                long c7 = c(typeface);
                androidx.collection.h<SparseArray<Typeface>> hVar = f14580g;
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
                Typeface a7 = a(e(c7, i7, z6));
                o6.put(i8, a7);
                return a7;
            }
        }
        return null;
    }

    public static long c(@d.o0 Typeface typeface) {
        try {
            return f14577d.getLong(typeface);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static boolean d() {
        return f14577d != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static long e(long j7, int i7, boolean z6) {
        try {
            return ((Long) f14578e.invoke(null, Long.valueOf(j7), Integer.valueOf(i7), Boolean.valueOf(z6))).longValue();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }
}