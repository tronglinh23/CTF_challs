package p0;

import a1.h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import d.b1;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import m0.f;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
@d.w0(24)
/* loaded from: classes.dex */
public class l1 extends m2 {

    /* renamed from: d  reason: collision with root package name */
    public static final String f14521d = "TypefaceCompatApi24Impl";

    /* renamed from: e  reason: collision with root package name */
    public static final String f14522e = "android.graphics.FontFamily";

    /* renamed from: f  reason: collision with root package name */
    public static final String f14523f = "addFontWeightStyle";

    /* renamed from: g  reason: collision with root package name */
    public static final String f14524g = "createFromFamiliesWithDefault";

    /* renamed from: h  reason: collision with root package name */
    public static final Class<?> f14525h;

    /* renamed from: i  reason: collision with root package name */
    public static final Constructor<?> f14526i;

    /* renamed from: j  reason: collision with root package name */
    public static final Method f14527j;

    /* renamed from: k  reason: collision with root package name */
    public static final Method f14528k;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e(f14521d, e7.getClass().getName(), e7);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f14526i = constructor;
        f14525h = cls;
        f14527j = method2;
        f14528k = method;
    }

    public static boolean o(Object obj, ByteBuffer byteBuffer, int i7, int i8, boolean z6) {
        try {
            return ((Boolean) f14527j.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface p(Object obj) {
        try {
            Object newInstance = Array.newInstance(f14525h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f14528k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean q() {
        Method method = f14527j;
        if (method == null) {
            Log.w(f14521d, "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    public static Object r() {
        try {
            return f14526i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p0.m2
    @d.q0
    public Typeface b(Context context, f.d dVar, Resources resources, int i7) {
        Object r6 = r();
        if (r6 == null) {
            return null;
        }
        for (f.e eVar : dVar.a()) {
            ByteBuffer b7 = n2.b(context, resources, eVar.b());
            if (b7 == null || !o(r6, b7, eVar.c(), eVar.e(), eVar.f())) {
                return null;
            }
        }
        return p(r6);
    }

    @Override // p0.m2
    @d.q0
    public Typeface d(Context context, @d.q0 CancellationSignal cancellationSignal, @d.o0 h.c[] cVarArr, int i7) {
        Object r6 = r();
        if (r6 == null) {
            return null;
        }
        androidx.collection.m mVar = new androidx.collection.m();
        for (h.c cVar : cVarArr) {
            Uri d7 = cVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) mVar.get(d7);
            if (byteBuffer == null) {
                byteBuffer = n2.f(context, cancellationSignal, d7);
                mVar.put(d7, byteBuffer);
            }
            if (byteBuffer == null || !o(r6, byteBuffer, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        Typeface p6 = p(r6);
        if (p6 == null) {
            return null;
        }
        return Typeface.create(p6, i7);
    }

    @Override // p0.m2
    @d.o0
    public Typeface g(@d.o0 Context context, @d.o0 Typeface typeface, int i7, boolean z6) {
        Typeface typeface2;
        try {
            typeface2 = p2.b(typeface, i7, z6);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        return typeface2 == null ? super.g(context, typeface, i7, z6) : typeface2;
    }
}
