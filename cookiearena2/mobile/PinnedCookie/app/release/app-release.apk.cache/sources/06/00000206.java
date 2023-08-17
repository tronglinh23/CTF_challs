package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import d.b1;
import f.a;
import java.lang.ref.WeakReference;
import java.util.Locale;
import m0.i;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: n  reason: collision with root package name */
    public static final int f1546n = -1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f1547o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f1548p = 2;

    /* renamed from: q  reason: collision with root package name */
    public static final int f1549q = 3;
    @d.o0

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1550a;

    /* renamed from: b  reason: collision with root package name */
    public r1 f1551b;

    /* renamed from: c  reason: collision with root package name */
    public r1 f1552c;

    /* renamed from: d  reason: collision with root package name */
    public r1 f1553d;

    /* renamed from: e  reason: collision with root package name */
    public r1 f1554e;

    /* renamed from: f  reason: collision with root package name */
    public r1 f1555f;

    /* renamed from: g  reason: collision with root package name */
    public r1 f1556g;

    /* renamed from: h  reason: collision with root package name */
    public r1 f1557h;
    @d.o0

    /* renamed from: i  reason: collision with root package name */
    public final g0 f1558i;

    /* renamed from: j  reason: collision with root package name */
    public int f1559j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1560k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f1561l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1562m;

    /* loaded from: classes.dex */
    public class a extends i.g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f1563a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1564b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f1565c;

        public a(int i7, int i8, WeakReference weakReference) {
            this.f1563a = i7;
            this.f1564b = i8;
            this.f1565c = weakReference;
        }

        @Override // m0.i.g
        /* renamed from: onFontRetrievalFailed */
        public void c(int i7) {
        }

        @Override // m0.i.g
        /* renamed from: onFontRetrieved */
        public void d(@d.o0 Typeface typeface) {
            int i7;
            if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f1563a) != -1) {
                typeface = g.a(typeface, i7, (this.f1564b & 2) != 0);
            }
            d0.this.n(this.f1565c, typeface);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ TextView f1567k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Typeface f1568l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ int f1569m;

        public b(TextView textView, Typeface typeface, int i7) {
            this.f1567k = textView;
            this.f1568l = typeface;
            this.f1569m = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1567k.setTypeface(this.f1568l, this.f1569m);
        }
    }

    @d.w0(17)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @d.u
        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @d.u
        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class d {
        @d.u
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class e {
        @d.u
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @d.u
        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class f {
        @d.u
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @d.u
        public static void b(TextView textView, int i7, int i8, int i9, int i10) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
        }

        @d.u
        public static void c(TextView textView, int[] iArr, int i7) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
        }

        @d.u
        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class g {
        @d.u
        public static Typeface a(Typeface typeface, int i7, boolean z6) {
            Typeface create;
            create = Typeface.create(typeface, i7, z6);
            return create;
        }
    }

    public d0(@d.o0 TextView textView) {
        this.f1550a = textView;
        this.f1558i = new g0(textView);
    }

    public static r1 d(Context context, l lVar, int i7) {
        ColorStateList f7 = lVar.f(context, i7);
        if (f7 != null) {
            r1 r1Var = new r1();
            r1Var.f1768d = true;
            r1Var.f1765a = f7;
            return r1Var;
        }
        return null;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void A(int i7, float f7) {
        if (e2.f1580c || l()) {
            return;
        }
        B(i7, f7);
    }

    public final void B(int i7, float f7) {
        this.f1558i.w(i7, f7);
    }

    public final void C(Context context, t1 t1Var) {
        String w6;
        this.f1559j = t1Var.o(a.m.f9443b6, this.f1559j);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            int o6 = t1Var.o(a.m.f9515k6, -1);
            this.f1560k = o6;
            if (o6 != -1) {
                this.f1559j = (this.f1559j & 2) | 0;
            }
        }
        if (!t1Var.C(a.m.f9507j6) && !t1Var.C(a.m.f9523l6)) {
            if (t1Var.C(a.m.f9435a6)) {
                this.f1562m = false;
                int o7 = t1Var.o(a.m.f9435a6, 1);
                if (o7 == 1) {
                    this.f1561l = Typeface.SANS_SERIF;
                    return;
                } else if (o7 == 2) {
                    this.f1561l = Typeface.SERIF;
                    return;
                } else if (o7 != 3) {
                    return;
                } else {
                    this.f1561l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1561l = null;
        int i8 = t1Var.C(a.m.f9523l6) ? a.m.f9523l6 : a.m.f9507j6;
        int i9 = this.f1560k;
        int i10 = this.f1559j;
        if (!context.isRestricted()) {
            try {
                Typeface k7 = t1Var.k(i8, this.f1559j, new a(i9, i10, new WeakReference(this.f1550a)));
                if (k7 != null) {
                    if (i7 < 28 || this.f1560k == -1) {
                        this.f1561l = k7;
                    } else {
                        this.f1561l = g.a(Typeface.create(k7, 0), this.f1560k, (this.f1559j & 2) != 0);
                    }
                }
                this.f1562m = this.f1561l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1561l != null || (w6 = t1Var.w(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1560k == -1) {
            this.f1561l = Typeface.create(w6, this.f1559j);
        } else {
            this.f1561l = g.a(Typeface.create(w6, 0), this.f1560k, (this.f1559j & 2) != 0);
        }
    }

    public final void a(Drawable drawable, r1 r1Var) {
        if (drawable == null || r1Var == null) {
            return;
        }
        l.j(drawable, r1Var, this.f1550a.getDrawableState());
    }

    public void b() {
        if (this.f1551b != null || this.f1552c != null || this.f1553d != null || this.f1554e != null) {
            Drawable[] compoundDrawables = this.f1550a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1551b);
            a(compoundDrawables[1], this.f1552c);
            a(compoundDrawables[2], this.f1553d);
            a(compoundDrawables[3], this.f1554e);
        }
        if (this.f1555f == null && this.f1556g == null) {
            return;
        }
        Drawable[] a7 = c.a(this.f1550a);
        a(a7[0], this.f1555f);
        a(a7[2], this.f1556g);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void c() {
        this.f1558i.b();
    }

    public int e() {
        return this.f1558i.h();
    }

    public int f() {
        return this.f1558i.i();
    }

    public int g() {
        return this.f1558i.j();
    }

    public int[] h() {
        return this.f1558i.k();
    }

    public int i() {
        return this.f1558i.l();
    }

    @d.q0
    public ColorStateList j() {
        r1 r1Var = this.f1557h;
        if (r1Var != null) {
            return r1Var.f1765a;
        }
        return null;
    }

    @d.q0
    public PorterDuff.Mode k() {
        r1 r1Var = this.f1557h;
        if (r1Var != null) {
            return r1Var.f1766b;
        }
        return null;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean l() {
        return this.f1558i.q();
    }

    @SuppressLint({"NewApi"})
    public void m(@d.q0 AttributeSet attributeSet, int i7) {
        boolean z6;
        boolean z7;
        String str;
        String str2;
        boolean z8;
        Context context = this.f1550a.getContext();
        l b7 = l.b();
        t1 G = t1.G(context, attributeSet, a.m.f9533n0, i7, 0);
        TextView textView = this.f1550a;
        androidx.core.view.u1.z1(textView, textView.getContext(), a.m.f9533n0, attributeSet, G.B(), i7, 0);
        int u6 = G.u(a.m.f9541o0, -1);
        if (G.C(a.m.f9562r0)) {
            this.f1551b = d(context, b7, G.u(a.m.f9562r0, 0));
        }
        if (G.C(a.m.f9548p0)) {
            this.f1552c = d(context, b7, G.u(a.m.f9548p0, 0));
        }
        if (G.C(a.m.f9569s0)) {
            this.f1553d = d(context, b7, G.u(a.m.f9569s0, 0));
        }
        if (G.C(a.m.f9555q0)) {
            this.f1554e = d(context, b7, G.u(a.m.f9555q0, 0));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (G.C(a.m.f9576t0)) {
            this.f1555f = d(context, b7, G.u(a.m.f9576t0, 0));
        }
        if (G.C(a.m.f9583u0)) {
            this.f1556g = d(context, b7, G.u(a.m.f9583u0, 0));
        }
        G.I();
        boolean z9 = this.f1550a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (u6 != -1) {
            t1 E = t1.E(context, u6, a.m.Y5);
            if (z9 || !E.C(a.m.f9539n6)) {
                z6 = false;
                z7 = false;
            } else {
                z6 = E.a(a.m.f9539n6, false);
                z7 = true;
            }
            C(context, E);
            str = E.C(a.m.o6) ? E.w(a.m.o6) : null;
            str2 = E.C(a.m.f9531m6) ? E.w(a.m.f9531m6) : null;
            E.I();
        } else {
            z6 = false;
            z7 = false;
            str = null;
            str2 = null;
        }
        t1 G2 = t1.G(context, attributeSet, a.m.Y5, i7, 0);
        if (z9 || !G2.C(a.m.f9539n6)) {
            z8 = z7;
        } else {
            z6 = G2.a(a.m.f9539n6, false);
            z8 = true;
        }
        if (G2.C(a.m.o6)) {
            str = G2.w(a.m.o6);
        }
        if (G2.C(a.m.f9531m6)) {
            str2 = G2.w(a.m.f9531m6);
        }
        if (i8 >= 28 && G2.C(a.m.Z5) && G2.g(a.m.Z5, -1) == 0) {
            this.f1550a.setTextSize(0, 0.0f);
        }
        C(context, G2);
        G2.I();
        if (!z9 && z8) {
            s(z6);
        }
        Typeface typeface = this.f1561l;
        if (typeface != null) {
            if (this.f1560k == -1) {
                this.f1550a.setTypeface(typeface, this.f1559j);
            } else {
                this.f1550a.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            f.d(this.f1550a, str2);
        }
        if (str != null) {
            e.b(this.f1550a, e.a(str));
        }
        this.f1558i.r(attributeSet, i7);
        if (e2.f1580c && this.f1558i.l() != 0) {
            int[] k7 = this.f1558i.k();
            if (k7.length > 0) {
                if (f.a(this.f1550a) != -1.0f) {
                    f.b(this.f1550a, this.f1558i.i(), this.f1558i.h(), this.f1558i.j(), 0);
                } else {
                    f.c(this.f1550a, k7, 0);
                }
            }
        }
        t1 F = t1.F(context, attributeSet, a.m.f9590v0);
        int u7 = F.u(a.m.E0, -1);
        Drawable c7 = u7 != -1 ? b7.c(context, u7) : null;
        int u8 = F.u(a.m.J0, -1);
        Drawable c8 = u8 != -1 ? b7.c(context, u8) : null;
        int u9 = F.u(a.m.F0, -1);
        Drawable c9 = u9 != -1 ? b7.c(context, u9) : null;
        int u10 = F.u(a.m.C0, -1);
        Drawable c10 = u10 != -1 ? b7.c(context, u10) : null;
        int u11 = F.u(a.m.G0, -1);
        Drawable c11 = u11 != -1 ? b7.c(context, u11) : null;
        int u12 = F.u(a.m.D0, -1);
        y(c7, c8, c9, c10, c11, u12 != -1 ? b7.c(context, u12) : null);
        if (F.C(a.m.H0)) {
            k1.v.u(this.f1550a, F.d(a.m.H0));
        }
        if (F.C(a.m.I0)) {
            k1.v.v(this.f1550a, q0.e(F.o(a.m.I0, -1), null));
        }
        int g7 = F.g(a.m.L0, -1);
        int g8 = F.g(a.m.O0, -1);
        int g9 = F.g(a.m.P0, -1);
        F.I();
        if (g7 != -1) {
            k1.v.A(this.f1550a, g7);
        }
        if (g8 != -1) {
            k1.v.B(this.f1550a, g8);
        }
        if (g9 != -1) {
            k1.v.C(this.f1550a, g9);
        }
    }

    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1562m) {
            this.f1561l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (androidx.core.view.u1.O0(textView)) {
                    textView.post(new b(textView, typeface, this.f1559j));
                } else {
                    textView.setTypeface(typeface, this.f1559j);
                }
            }
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void o(boolean z6, int i7, int i8, int i9, int i10) {
        if (e2.f1580c) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i7) {
        String w6;
        t1 E = t1.E(context, i7, a.m.Y5);
        if (E.C(a.m.f9539n6)) {
            s(E.a(a.m.f9539n6, false));
        }
        if (E.C(a.m.Z5) && E.g(a.m.Z5, -1) == 0) {
            this.f1550a.setTextSize(0, 0.0f);
        }
        C(context, E);
        if (E.C(a.m.f9531m6) && (w6 = E.w(a.m.f9531m6)) != null) {
            f.d(this.f1550a, w6);
        }
        E.I();
        Typeface typeface = this.f1561l;
        if (typeface != null) {
            this.f1550a.setTypeface(typeface, this.f1559j);
        }
    }

    public void r(@d.o0 TextView textView, @d.q0 InputConnection inputConnection, @d.o0 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        j1.e.j(editorInfo, textView.getText());
    }

    public void s(boolean z6) {
        this.f1550a.setAllCaps(z6);
    }

    public void t(int i7, int i8, int i9, int i10) throws IllegalArgumentException {
        this.f1558i.s(i7, i8, i9, i10);
    }

    public void u(@d.o0 int[] iArr, int i7) throws IllegalArgumentException {
        this.f1558i.t(iArr, i7);
    }

    public void v(int i7) {
        this.f1558i.u(i7);
    }

    public void w(@d.q0 ColorStateList colorStateList) {
        if (this.f1557h == null) {
            this.f1557h = new r1();
        }
        r1 r1Var = this.f1557h;
        r1Var.f1765a = colorStateList;
        r1Var.f1768d = colorStateList != null;
        z();
    }

    public void x(@d.q0 PorterDuff.Mode mode) {
        if (this.f1557h == null) {
            this.f1557h = new r1();
        }
        r1 r1Var = this.f1557h;
        r1Var.f1766b = mode;
        r1Var.f1767c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a7 = c.a(this.f1550a);
            TextView textView = this.f1550a;
            if (drawable5 == null) {
                drawable5 = a7[0];
            }
            if (drawable2 == null) {
                drawable2 = a7[1];
            }
            if (drawable6 == null) {
                drawable6 = a7[2];
            }
            if (drawable4 == null) {
                drawable4 = a7[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            Drawable[] a8 = c.a(this.f1550a);
            Drawable drawable7 = a8[0];
            if (drawable7 != null || a8[2] != null) {
                TextView textView2 = this.f1550a;
                if (drawable2 == null) {
                    drawable2 = a8[1];
                }
                Drawable drawable8 = a8[2];
                if (drawable4 == null) {
                    drawable4 = a8[3];
                }
                c.b(textView2, drawable7, drawable2, drawable8, drawable4);
                return;
            }
            Drawable[] compoundDrawables = this.f1550a.getCompoundDrawables();
            TextView textView3 = this.f1550a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    public final void z() {
        r1 r1Var = this.f1557h;
        this.f1551b = r1Var;
        this.f1552c = r1Var;
        this.f1553d = r1Var;
        this.f1554e = r1Var;
        this.f1555f = r1Var;
        this.f1556g = r1Var;
    }
}