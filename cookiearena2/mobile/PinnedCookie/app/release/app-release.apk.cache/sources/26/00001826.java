package p0;

import a1.h;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import d.b1;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import m0.f;

@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
@d.w0(26)
/* loaded from: classes.dex */
public class m1 extends k1 {
    public static final int A = -1;

    /* renamed from: t  reason: collision with root package name */
    public static final String f14529t = "TypefaceCompatApi26Impl";

    /* renamed from: u  reason: collision with root package name */
    public static final String f14530u = "android.graphics.FontFamily";

    /* renamed from: v  reason: collision with root package name */
    public static final String f14531v = "addFontFromAssetManager";

    /* renamed from: w  reason: collision with root package name */
    public static final String f14532w = "addFontFromBuffer";

    /* renamed from: x  reason: collision with root package name */
    public static final String f14533x = "createFromFamiliesWithDefault";

    /* renamed from: y  reason: collision with root package name */
    public static final String f14534y = "freeze";

    /* renamed from: z  reason: collision with root package name */
    public static final String f14535z = "abortCreation";

    /* renamed from: m  reason: collision with root package name */
    public final Class<?> f14536m;

    /* renamed from: n  reason: collision with root package name */
    public final Constructor<?> f14537n;

    /* renamed from: o  reason: collision with root package name */
    public final Method f14538o;

    /* renamed from: p  reason: collision with root package name */
    public final Method f14539p;

    /* renamed from: q  reason: collision with root package name */
    public final Method f14540q;

    /* renamed from: r  reason: collision with root package name */
    public final Method f14541r;

    /* renamed from: s  reason: collision with root package name */
    public final Method f14542s;

    public m1() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = C();
            constructor = D(cls);
            method = z(cls);
            method2 = A(cls);
            method3 = E(cls);
            method4 = y(cls);
            method5 = B(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e(f14529t, "Unable to collect necessary methods for class " + e7.getClass().getName(), e7);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f14536m = cls;
        this.f14537n = constructor;
        this.f14538o = method;
        this.f14539p = method2;
        this.f14540q = method3;
        this.f14541r = method4;
        this.f14542s = method5;
    }

    @d.q0
    private Object s() {
        try {
            return this.f14537n.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method A(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(f14532w, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method B(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> C() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor<?> D(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    public Method E(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f14534y, new Class[0]);
    }

    @Override // p0.k1, p0.m2
    @d.q0
    public Typeface b(Context context, f.d dVar, Resources resources, int i7) {
        if (x()) {
            Object s6 = s();
            if (s6 == null) {
                return null;
            }
            for (f.e eVar : dVar.a()) {
                if (!u(context, s6, eVar.a(), eVar.c(), eVar.e(), eVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(eVar.d()))) {
                    t(s6);
                    return null;
                }
            }
            if (w(s6)) {
                return p(s6);
            }
            return null;
        }
        return super.b(context, dVar, resources, i7);
    }

    @Override // p0.k1, p0.m2
    @d.q0
    public Typeface d(Context context, @d.q0 CancellationSignal cancellationSignal, @d.o0 h.c[] cVarArr, int i7) {
        Typeface p6;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!x()) {
            h.c l7 = l(cVarArr, i7);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l7.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(l7.e()).setItalic(l7.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> h7 = n2.h(context, cVarArr, cancellationSignal);
        Object s6 = s();
        if (s6 == null) {
            return null;
        }
        boolean z6 = false;
        for (h.c cVar : cVarArr) {
            ByteBuffer byteBuffer = h7.get(cVar.d());
            if (byteBuffer != null) {
                if (!v(s6, byteBuffer, cVar.c(), cVar.e(), cVar.f() ? 1 : 0)) {
                    t(s6);
                    return null;
                }
                z6 = true;
            }
        }
        if (!z6) {
            t(s6);
            return null;
        } else if (w(s6) && (p6 = p(s6)) != null) {
            return Typeface.create(p6, i7);
        } else {
            return null;
        }
    }

    @Override // p0.m2
    @d.q0
    public Typeface f(Context context, Resources resources, int i7, String str, int i8) {
        if (x()) {
            Object s6 = s();
            if (s6 == null) {
                return null;
            }
            if (!u(context, s6, str, 0, -1, -1, null)) {
                t(s6);
                return null;
            } else if (w(s6)) {
                return p(s6);
            } else {
                return null;
            }
        }
        return super.f(context, resources, i7, str, i8);
    }

    @Override // p0.k1, p0.m2
    @d.o0
    public Typeface g(@d.o0 Context context, @d.o0 Typeface typeface, int i7, boolean z6) {
        Typeface typeface2;
        try {
            typeface2 = q2.b(typeface, i7, z6);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        return typeface2 == null ? super.g(context, typeface, i7, z6) : typeface2;
    }

    @d.q0
    public Typeface p(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f14536m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f14542s.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void t(Object obj) {
        try {
            this.f14541r.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean u(Context context, Object obj, String str, int i7, int i8, int i9, @d.q0 FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f14538o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean v(Object obj, ByteBuffer byteBuffer, int i7, int i8, int i9) {
        try {
            return ((Boolean) this.f14539p.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Integer.valueOf(i9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean w(Object obj) {
        try {
            return ((Boolean) this.f14540q.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean x() {
        if (this.f14538o == null) {
            Log.w(f14529t, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f14538o != null;
    }

    public Method y(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f14535z, new Class[0]);
    }

    public Method z(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(f14531v, AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }
}