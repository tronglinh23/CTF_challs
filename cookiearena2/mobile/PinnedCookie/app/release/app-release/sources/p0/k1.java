package p0;

import a1.h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import d.b1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m0.f;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
@d.w0(21)
/* loaded from: classes.dex */
public class k1 extends m2 {

    /* renamed from: d  reason: collision with root package name */
    public static final String f14512d = "TypefaceCompatApi21Impl";

    /* renamed from: e  reason: collision with root package name */
    public static final String f14513e = "android.graphics.FontFamily";

    /* renamed from: f  reason: collision with root package name */
    public static final String f14514f = "addFontWeightStyle";

    /* renamed from: g  reason: collision with root package name */
    public static final String f14515g = "createFromFamiliesWithDefault";

    /* renamed from: h  reason: collision with root package name */
    public static Class<?> f14516h = null;

    /* renamed from: i  reason: collision with root package name */
    public static Constructor<?> f14517i = null;

    /* renamed from: j  reason: collision with root package name */
    public static Method f14518j = null;

    /* renamed from: k  reason: collision with root package name */
    public static Method f14519k = null;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f14520l = false;

    public static boolean o(Object obj, String str, int i7, boolean z6) {
        r();
        try {
            return ((Boolean) f14518j.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static Typeface p(Object obj) {
        r();
        try {
            Object newInstance = Array.newInstance(f14516h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f14519k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void r() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f14520l) {
            return;
        }
        f14520l = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e(f14512d, e7.getClass().getName(), e7);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f14517i = constructor;
        f14516h = cls;
        f14518j = method2;
        f14519k = method;
    }

    public static Object s() {
        r();
        try {
            return f14517i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // p0.m2
    public Typeface b(Context context, f.d dVar, Resources resources, int i7) {
        Object s6 = s();
        for (f.e eVar : dVar.a()) {
            File e7 = n2.e(context);
            if (e7 == null) {
                return null;
            }
            try {
                if (!n2.c(e7, resources, eVar.b())) {
                    return null;
                }
                if (!o(s6, e7.getPath(), eVar.e(), eVar.f())) {
                    return null;
                }
                e7.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e7.delete();
            }
        }
        return p(s6);
    }

    @Override // p0.m2
    public Typeface d(Context context, CancellationSignal cancellationSignal, @d.o0 h.c[] cVarArr, int i7) {
        if (cVarArr.length < 1) {
            return null;
        }
        h.c l7 = l(cVarArr, i7);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l7.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File q6 = q(openFileDescriptor);
            if (q6 != null && q6.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(q6);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface e7 = super.e(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return e7;
        } catch (IOException unused) {
            return null;
        }
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

    public final File q(@d.o0 ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
