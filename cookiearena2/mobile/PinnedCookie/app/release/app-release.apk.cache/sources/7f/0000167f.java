package m0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import d.b0;
import d.b1;
import d.o0;
import d.q0;
import d.u;
import d.v;
import d.w0;
import d.y;
import g1.s;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import m0.i;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public static final String f13451a = "ResourcesCompat";

    /* renamed from: b */
    public static final ThreadLocal<TypedValue> f13452b = new ThreadLocal<>();
    @b0("sColorStateCacheLock")

    /* renamed from: c */
    public static final WeakHashMap<f, SparseArray<e>> f13453c = new WeakHashMap<>(0);

    /* renamed from: d */
    public static final Object f13454d = new Object();
    @d.c

    /* renamed from: e */
    public static final int f13455e = 0;

    @w0(15)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static Drawable a(Resources resources, int i7, int i8) {
            return resources.getDrawableForDensity(i7, i8);
        }
    }

    @w0(21)
    /* loaded from: classes.dex */
    public static class b {
        @u
        public static Drawable a(Resources resources, int i7, Resources.Theme theme) {
            return resources.getDrawable(i7, theme);
        }

        @u
        public static Drawable b(Resources resources, int i7, int i8, Resources.Theme theme) {
            return resources.getDrawableForDensity(i7, i8, theme);
        }
    }

    @w0(23)
    /* loaded from: classes.dex */
    public static class c {
        @u
        public static int a(Resources resources, int i7, Resources.Theme theme) {
            return resources.getColor(i7, theme);
        }

        @u
        @o0
        public static ColorStateList b(@o0 Resources resources, @d.n int i7, @q0 Resources.Theme theme) {
            return resources.getColorStateList(i7, theme);
        }
    }

    @w0(29)
    /* loaded from: classes.dex */
    public static class d {
        @u
        public static float a(@o0 Resources resources, @d.q int i7) {
            float f7;
            f7 = resources.getFloat(i7);
            return f7;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public final ColorStateList f13456a;

        /* renamed from: b */
        public final Configuration f13457b;

        /* renamed from: c */
        public final int f13458c;

        public e(@o0 ColorStateList colorStateList, @o0 Configuration configuration, @q0 Resources.Theme theme) {
            this.f13456a = colorStateList;
            this.f13457b = configuration;
            this.f13458c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        public final Resources f13459a;

        /* renamed from: b */
        public final Resources.Theme f13460b;

        public f(@o0 Resources resources, @q0 Resources.Theme theme) {
            this.f13459a = resources;
            this.f13460b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f13459a.equals(fVar.f13459a) && g1.n.a(this.f13460b, fVar.f13460b);
        }

        public int hashCode() {
            return g1.n.b(this.f13459a, this.f13460b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public static /* synthetic */ void a(g gVar, int i7) {
            gVar.c(i7);
        }

        public static /* synthetic */ void b(g gVar, Typeface typeface) {
            gVar.d(typeface);
        }

        @b1({b1.a.LIBRARY})
        @o0
        public static Handler getHandler(@q0 Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(final int i7, @q0 Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: m0.l
                @Override // java.lang.Runnable
                public final void run() {
                    i.g.a(i.g.this, i7);
                }
            });
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(@o0 final Typeface typeface, @q0 Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: m0.k
                @Override // java.lang.Runnable
                public final void run() {
                    i.g.b(i.g.this, typeface);
                }
            });
        }

        /* renamed from: onFontRetrievalFailed */
        public abstract void c(int i7);

        /* renamed from: onFontRetrieved */
        public abstract void d(@o0 Typeface typeface);
    }

    /* loaded from: classes.dex */
    public static final class h {

        @w0(23)
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            public static final Object f13461a = new Object();

            /* renamed from: b */
            public static Method f13462b;

            /* renamed from: c */
            public static boolean f13463c;

            @SuppressLint({"BanUncheckedReflection"})
            public static void a(@o0 Resources.Theme theme) {
                synchronized (f13461a) {
                    if (!f13463c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f13462b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e7) {
                            Log.i(i.f13451a, "Failed to retrieve rebase() method", e7);
                        }
                        f13463c = true;
                    }
                    Method method = f13462b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e8) {
                            Log.i(i.f13451a, "Failed to invoke rebase() method via reflection", e8);
                            f13462b = null;
                        }
                    }
                }
            }
        }

        @w0(29)
        /* loaded from: classes.dex */
        public static class b {
            @u
            public static void a(@o0 Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(@o0 Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    public static void a(@o0 f fVar, @d.n int i7, @o0 ColorStateList colorStateList, @q0 Resources.Theme theme) {
        synchronized (f13454d) {
            WeakHashMap<f, SparseArray<e>> weakHashMap = f13453c;
            SparseArray<e> sparseArray = weakHashMap.get(fVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(fVar, sparseArray);
            }
            sparseArray.append(i7, new e(colorStateList, fVar.f13459a.getConfiguration(), theme));
        }
    }

    public static void b(@o0 Resources.Theme theme) {
        synchronized (f13454d) {
            Iterator<f> it = f13453c.keySet().iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next != null && theme.equals(next.f13460b)) {
                    it.remove();
                }
            }
        }
    }

    @q0
    public static ColorStateList c(@o0 f fVar, @d.n int i7) {
        e eVar;
        Resources.Theme theme;
        synchronized (f13454d) {
            SparseArray<e> sparseArray = f13453c.get(fVar);
            if (sparseArray != null && sparseArray.size() > 0 && (eVar = sparseArray.get(i7)) != null) {
                if (eVar.f13457b.equals(fVar.f13459a.getConfiguration()) && (((theme = fVar.f13460b) == null && eVar.f13458c == 0) || (theme != null && eVar.f13458c == theme.hashCode()))) {
                    return eVar.f13456a;
                }
                sparseArray.remove(i7);
            }
            return null;
        }
    }

    @q0
    public static Typeface d(@o0 Context context, @y int i7) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i7, new TypedValue(), 0, null, null, false, true);
    }

    @d.l
    public static int e(@o0 Resources resources, @d.n int i7, @q0 Resources.Theme theme) throws Resources.NotFoundException {
        return c.a(resources, i7, theme);
    }

    @q0
    public static ColorStateList f(@o0 Resources resources, @d.n int i7, @q0 Resources.Theme theme) throws Resources.NotFoundException {
        f fVar = new f(resources, theme);
        ColorStateList c7 = c(fVar, i7);
        if (c7 != null) {
            return c7;
        }
        ColorStateList n7 = n(resources, i7, theme);
        if (n7 != null) {
            a(fVar, i7, n7, theme);
            return n7;
        }
        return c.b(resources, i7, theme);
    }

    @q0
    public static Drawable g(@o0 Resources resources, @v int i7, @q0 Resources.Theme theme) throws Resources.NotFoundException {
        return b.a(resources, i7, theme);
    }

    @q0
    public static Drawable h(@o0 Resources resources, @v int i7, int i8, @q0 Resources.Theme theme) throws Resources.NotFoundException {
        return b.b(resources, i7, i8, theme);
    }

    public static float i(@o0 Resources resources, @d.q int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(resources, i7);
        }
        TypedValue m7 = m();
        resources.getValue(i7, m7, true);
        if (m7.type == 4) {
            return m7.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i7) + " type #0x" + Integer.toHexString(m7.type) + " is not valid");
    }

    @q0
    public static Typeface j(@o0 Context context, @y int i7) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i7, new TypedValue(), 0, null, null, false, false);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @q0
    public static Typeface k(@o0 Context context, @y int i7, @o0 TypedValue typedValue, int i8, @q0 g gVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i7, typedValue, i8, gVar, null, true, false);
    }

    public static void l(@o0 Context context, @y int i7, @o0 g gVar, @q0 Handler handler) throws Resources.NotFoundException {
        s.l(gVar);
        if (context.isRestricted()) {
            gVar.callbackFailAsync(-4, handler);
        } else {
            p(context, i7, new TypedValue(), 0, gVar, handler, false, false);
        }
    }

    @o0
    public static TypedValue m() {
        ThreadLocal<TypedValue> threadLocal = f13452b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    @q0
    public static ColorStateList n(Resources resources, int i7, @q0 Resources.Theme theme) {
        if (o(resources, i7)) {
            return null;
        }
        try {
            return m0.c.a(resources, resources.getXml(i7), theme);
        } catch (Exception e7) {
            Log.w(f13451a, "Failed to inflate ColorStateList, leaving it to the framework", e7);
            return null;
        }
    }

    public static boolean o(@o0 Resources resources, @d.n int i7) {
        TypedValue m7 = m();
        resources.getValue(i7, m7, true);
        int i8 = m7.type;
        return i8 >= 28 && i8 <= 31;
    }

    public static Typeface p(@o0 Context context, int i7, @o0 TypedValue typedValue, int i8, @q0 g gVar, @q0 Handler handler, boolean z6, boolean z7) {
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        Typeface q6 = q(context, resources, typedValue, i7, i8, gVar, handler, z6, z7);
        if (q6 == null && gVar == null && !z7) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i7) + " could not be retrieved.");
        }
        return q6;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface q(@d.o0 android.content.Context r17, android.content.res.Resources r18, @d.o0 android.util.TypedValue r19, int r20, int r21, @d.q0 m0.i.g r22, @d.q0 android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Lbb
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L25
            if (r11 == 0) goto L24
            r11.callbackFailAsync(r15, r12)
        L24:
            return r16
        L25:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = p0.j1.k(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L35
            if (r11 == 0) goto L34
            r11.callbackSuccessAsync(r2, r12)
        L34:
            return r2
        L35:
            if (r25 == 0) goto L38
            return r16
        L38:
            java.lang.String r2 = r14.toLowerCase()     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r2 == 0) goto L6f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            m0.f$b r2 = m0.f.b(r2, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r2 != 0) goto L59
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r11 == 0) goto L58
            r11.callbackFailAsync(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
        L58:
            return r16
        L59:
            int r6 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = p0.j1.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            return r0
        L6f:
            int r5 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = p0.j1.h(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r11 == 0) goto L89
            if (r0 == 0) goto L86
            r11.callbackSuccessAsync(r0, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            goto L89
        L86:
            r11.callbackFailAsync(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
        L89:
            return r0
        L8a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto Lb5
        La0:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        Lb5:
            if (r11 == 0) goto Lba
            r11.callbackFailAsync(r15, r12)
        Lba:
            return r16
        Lbb:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.i.q(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, m0.i$g, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}