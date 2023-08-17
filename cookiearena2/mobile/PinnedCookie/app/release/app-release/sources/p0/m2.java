package p0;

import a1.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import d.b1;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import m0.f;
import u.v;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class m2 {

    /* renamed from: b  reason: collision with root package name */
    public static final String f14543b = "TypefaceCompatBaseImpl";

    /* renamed from: c  reason: collision with root package name */
    public static final int f14544c = 0;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<Long, f.d> f14545a = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public class a implements d<h.c> {
        public a() {
        }

        @Override // p0.m2.d
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public int a(h.c cVar) {
            return cVar.e();
        }

        @Override // p0.m2.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public boolean b(h.c cVar) {
            return cVar.f();
        }
    }

    /* loaded from: classes.dex */
    public class b implements d<f.e> {
        public b() {
        }

        @Override // p0.m2.d
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public int a(f.e eVar) {
            return eVar.e();
        }

        @Override // p0.m2.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public boolean b(f.e eVar) {
            return eVar.f();
        }
    }

    /* loaded from: classes.dex */
    public class c implements d<f.e> {
        public c() {
        }

        @Override // p0.m2.d
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public int a(f.e eVar) {
            return eVar.e();
        }

        @Override // p0.m2.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public boolean b(f.e eVar) {
            return eVar.f();
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        int a(T t6);

        boolean b(T t6);
    }

    public static <T> T j(T[] tArr, int i7, d<T> dVar) {
        return (T) k(tArr, (i7 & 1) == 0 ? 400 : v.h.f17261j, (i7 & 2) != 0, dVar);
    }

    public static <T> T k(T[] tArr, int i7, boolean z6, d<T> dVar) {
        T t6 = null;
        int i8 = Integer.MAX_VALUE;
        for (T t7 : tArr) {
            int abs = (Math.abs(dVar.a(t7) - i7) * 2) + (dVar.b(t7) == z6 ? 0 : 1);
            if (t6 == null || i8 > abs) {
                t6 = t7;
                i8 = abs;
            }
        }
        return t6;
    }

    public static long n(@d.q0 Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e7) {
            Log.e(f14543b, "Could not retrieve font from family.", e7);
            return 0L;
        } catch (NoSuchFieldException e8) {
            Log.e(f14543b, "Could not retrieve font from family.", e8);
            return 0L;
        }
    }

    public final void a(Typeface typeface, f.d dVar) {
        long n7 = n(typeface);
        if (n7 != 0) {
            this.f14545a.put(Long.valueOf(n7), dVar);
        }
    }

    @d.q0
    public Typeface b(Context context, f.d dVar, Resources resources, int i7) {
        f.e h7 = h(dVar, i7);
        if (h7 == null) {
            return null;
        }
        Typeface h8 = j1.h(context, resources, h7.b(), h7.a(), 0, i7);
        a(h8, dVar);
        return h8;
    }

    @d.q0
    public Typeface c(Context context, f.d dVar, Resources resources, int i7, boolean z6) {
        f.e i8 = i(dVar, i7, z6);
        if (i8 == null) {
            return null;
        }
        Typeface h7 = j1.h(context, resources, i8.b(), i8.a(), 0, 0);
        a(h7, dVar);
        return h7;
    }

    @d.q0
    public Typeface d(Context context, @d.q0 CancellationSignal cancellationSignal, @d.o0 h.c[] cVarArr, int i7) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(l(cVarArr, i7).d());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface e7 = e(context, inputStream);
            n2.a(inputStream);
            return e7;
        } catch (IOException unused2) {
            n2.a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            n2.a(inputStream2);
            throw th;
        }
    }

    public Typeface e(Context context, InputStream inputStream) {
        File e7 = n2.e(context);
        if (e7 == null) {
            return null;
        }
        try {
            if (n2.d(e7, inputStream)) {
                return Typeface.createFromFile(e7.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e7.delete();
        }
    }

    @d.q0
    public Typeface f(Context context, Resources resources, int i7, String str, int i8) {
        File e7 = n2.e(context);
        if (e7 == null) {
            return null;
        }
        try {
            if (n2.c(e7, resources, i7)) {
                return Typeface.createFromFile(e7.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e7.delete();
        }
    }

    @d.o0
    public Typeface g(@d.o0 Context context, @d.o0 Typeface typeface, int i7, boolean z6) {
        Typeface typeface2;
        try {
            typeface2 = o2.a(this, context, typeface, i7, z6);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        return typeface2 == null ? typeface : typeface2;
    }

    public final f.e h(f.d dVar, int i7) {
        return (f.e) j(dVar.a(), i7, new b());
    }

    public final f.e i(f.d dVar, int i7, boolean z6) {
        return (f.e) k(dVar.a(), i7, z6, new c());
    }

    public h.c l(h.c[] cVarArr, int i7) {
        return (h.c) j(cVarArr, i7, new a());
    }

    @d.q0
    public f.d m(Typeface typeface) {
        long n7 = n(typeface);
        if (n7 == 0) {
            return null;
        }
        return this.f14545a.get(Long.valueOf(n7));
    }
}
