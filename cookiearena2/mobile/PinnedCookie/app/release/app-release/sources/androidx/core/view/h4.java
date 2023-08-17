package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import d.b1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public class h4 {

    /* renamed from: b  reason: collision with root package name */
    public static final String f3605b = "WindowInsetsCompat";
    @d.o0

    /* renamed from: c  reason: collision with root package name */
    public static final h4 f3606c;

    /* renamed from: a  reason: collision with root package name */
    public final l f3607a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    @d.w0(21)
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f3608a;

        /* renamed from: b  reason: collision with root package name */
        public static Field f3609b;

        /* renamed from: c  reason: collision with root package name */
        public static Field f3610c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f3611d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3608a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3609b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3610c = declaredField3;
                declaredField3.setAccessible(true);
                f3611d = true;
            } catch (ReflectiveOperationException e7) {
                Log.w(h4.f3605b, "Failed to get visible insets from AttachInfo " + e7.getMessage(), e7);
            }
        }

        @d.q0
        public static h4 a(@d.o0 View view) {
            if (f3611d && view.isAttachedToWindow()) {
                try {
                    Object obj = f3608a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f3609b.get(obj);
                        Rect rect2 = (Rect) f3610c.get(obj);
                        if (rect != null && rect2 != null) {
                            h4 a7 = new b().f(p0.v0.e(rect)).h(p0.v0.e(rect2)).a();
                            a7.H(a7);
                            a7.d(view.getRootView());
                            return a7;
                        }
                    }
                } catch (IllegalAccessException e7) {
                    Log.w(h4.f3605b, "Failed to get insets from AttachInfo. " + e7.getMessage(), e7);
                }
            }
            return null;
        }
    }

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class e extends d {
        public e() {
        }

        @Override // androidx.core.view.h4.f
        public void d(int i7, @d.o0 p0.v0 v0Var) {
            this.f3619c.setInsets(n.a(i7), v0Var.h());
        }

        @Override // androidx.core.view.h4.f
        public void e(int i7, @d.o0 p0.v0 v0Var) {
            this.f3619c.setInsetsIgnoringVisibility(n.a(i7), v0Var.h());
        }

        @Override // androidx.core.view.h4.f
        public void k(int i7, boolean z6) {
            this.f3619c.setVisible(n.a(i7), z6);
        }

        public e(@d.o0 h4 h4Var) {
            super(h4Var);
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final h4 f3620a;

        /* renamed from: b  reason: collision with root package name */
        public p0.v0[] f3621b;

        public f() {
            this(new h4((h4) null));
        }

        public final void a() {
            p0.v0[] v0VarArr = this.f3621b;
            if (v0VarArr != null) {
                p0.v0 v0Var = v0VarArr[m.e(1)];
                p0.v0 v0Var2 = this.f3621b[m.e(2)];
                if (v0Var2 == null) {
                    v0Var2 = this.f3620a.f(2);
                }
                if (v0Var == null) {
                    v0Var = this.f3620a.f(1);
                }
                i(p0.v0.b(v0Var, v0Var2));
                p0.v0 v0Var3 = this.f3621b[m.e(16)];
                if (v0Var3 != null) {
                    h(v0Var3);
                }
                p0.v0 v0Var4 = this.f3621b[m.e(32)];
                if (v0Var4 != null) {
                    f(v0Var4);
                }
                p0.v0 v0Var5 = this.f3621b[m.e(64)];
                if (v0Var5 != null) {
                    j(v0Var5);
                }
            }
        }

        @d.o0
        public h4 b() {
            a();
            return this.f3620a;
        }

        public void c(@d.q0 d0 d0Var) {
        }

        public void d(int i7, @d.o0 p0.v0 v0Var) {
            if (this.f3621b == null) {
                this.f3621b = new p0.v0[9];
            }
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    this.f3621b[m.e(i8)] = v0Var;
                }
            }
        }

        public void e(int i7, @d.o0 p0.v0 v0Var) {
            if (i7 == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        public void f(@d.o0 p0.v0 v0Var) {
        }

        public void g(@d.o0 p0.v0 v0Var) {
        }

        public void h(@d.o0 p0.v0 v0Var) {
        }

        public void i(@d.o0 p0.v0 v0Var) {
        }

        public void j(@d.o0 p0.v0 v0Var) {
        }

        public void k(int i7, boolean z6) {
        }

        public f(@d.o0 h4 h4Var) {
            this.f3620a = h4Var;
        }
    }

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class i extends h {
        public i(@d.o0 h4 h4Var, @d.o0 WindowInsets windowInsets) {
            super(h4Var, windowInsets);
        }

        @Override // androidx.core.view.h4.l
        @d.o0
        public h4 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f3627c.consumeDisplayCutout();
            return h4.K(consumeDisplayCutout);
        }

        @Override // androidx.core.view.h4.g, androidx.core.view.h4.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return Objects.equals(this.f3627c, iVar.f3627c) && Objects.equals(this.f3631g, iVar.f3631g);
            }
            return false;
        }

        @Override // androidx.core.view.h4.l
        @d.q0
        public d0 f() {
            DisplayCutout displayCutout;
            displayCutout = this.f3627c.getDisplayCutout();
            return d0.i(displayCutout);
        }

        @Override // androidx.core.view.h4.l
        public int hashCode() {
            return this.f3627c.hashCode();
        }

        public i(@d.o0 h4 h4Var, @d.o0 i iVar) {
            super(h4Var, iVar);
        }
    }

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class k extends j {
        @d.o0

        /* renamed from: q  reason: collision with root package name */
        public static final h4 f3636q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f3636q = h4.K(windowInsets);
        }

        public k(@d.o0 h4 h4Var, @d.o0 WindowInsets windowInsets) {
            super(h4Var, windowInsets);
        }

        @Override // androidx.core.view.h4.g, androidx.core.view.h4.l
        public final void d(@d.o0 View view) {
        }

        @Override // androidx.core.view.h4.g, androidx.core.view.h4.l
        @d.o0
        public p0.v0 g(int i7) {
            Insets insets;
            insets = this.f3627c.getInsets(n.a(i7));
            return p0.v0.g(insets);
        }

        @Override // androidx.core.view.h4.g, androidx.core.view.h4.l
        @d.o0
        public p0.v0 h(int i7) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f3627c.getInsetsIgnoringVisibility(n.a(i7));
            return p0.v0.g(insetsIgnoringVisibility);
        }

        @Override // androidx.core.view.h4.g, androidx.core.view.h4.l
        public boolean q(int i7) {
            boolean isVisible;
            isVisible = this.f3627c.isVisible(n.a(i7));
            return isVisible;
        }

        public k(@d.o0 h4 h4Var, @d.o0 k kVar) {
            super(h4Var, kVar);
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        @d.o0

        /* renamed from: b  reason: collision with root package name */
        public static final h4 f3637b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        public final h4 f3638a;

        public l(@d.o0 h4 h4Var) {
            this.f3638a = h4Var;
        }

        @d.o0
        public h4 a() {
            return this.f3638a;
        }

        @d.o0
        public h4 b() {
            return this.f3638a;
        }

        @d.o0
        public h4 c() {
            return this.f3638a;
        }

        public void d(@d.o0 View view) {
        }

        public void e(@d.o0 h4 h4Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return p() == lVar.p() && o() == lVar.o() && g1.n.a(l(), lVar.l()) && g1.n.a(j(), lVar.j()) && g1.n.a(f(), lVar.f());
            }
            return false;
        }

        @d.q0
        public d0 f() {
            return null;
        }

        @d.o0
        public p0.v0 g(int i7) {
            return p0.v0.f14584e;
        }

        @d.o0
        public p0.v0 h(int i7) {
            if ((i7 & 8) == 0) {
                return p0.v0.f14584e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return g1.n.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        @d.o0
        public p0.v0 i() {
            return l();
        }

        @d.o0
        public p0.v0 j() {
            return p0.v0.f14584e;
        }

        @d.o0
        public p0.v0 k() {
            return l();
        }

        @d.o0
        public p0.v0 l() {
            return p0.v0.f14584e;
        }

        @d.o0
        public p0.v0 m() {
            return l();
        }

        @d.o0
        public h4 n(int i7, int i8, int i9, int i10) {
            return f3637b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i7) {
            return true;
        }

        public void r(p0.v0[] v0VarArr) {
        }

        public void s(@d.o0 p0.v0 v0Var) {
        }

        public void t(@d.q0 h4 h4Var) {
        }

        public void u(p0.v0 v0Var) {
        }
    }

    /* loaded from: classes.dex */
    public static final class m {

        /* renamed from: a  reason: collision with root package name */
        public static final int f3639a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f3640b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f3641c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static final int f3642d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f3643e = 8;

        /* renamed from: f  reason: collision with root package name */
        public static final int f3644f = 16;

        /* renamed from: g  reason: collision with root package name */
        public static final int f3645g = 32;

        /* renamed from: h  reason: collision with root package name */
        public static final int f3646h = 64;

        /* renamed from: i  reason: collision with root package name */
        public static final int f3647i = 128;

        /* renamed from: j  reason: collision with root package name */
        public static final int f3648j = 256;

        /* renamed from: k  reason: collision with root package name */
        public static final int f3649k = 9;

        /* renamed from: l  reason: collision with root package name */
        public static final int f3650l = 256;

        @d.b1({b1.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        @d.b1({b1.a.LIBRARY_GROUP})
        @SuppressLint({"WrongConstant"})
        public static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        public static int e(int i7) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 8) {
                            if (i7 != 16) {
                                if (i7 != 32) {
                                    if (i7 != 64) {
                                        if (i7 != 128) {
                                            if (i7 == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i7);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 7;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 64;
        }
    }

    @d.w0(30)
    /* loaded from: classes.dex */
    public static final class n {
        private n() {
        }

        public static int a(int i7) {
            int statusBars;
            int i8 = 0;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i7 & i9) != 0) {
                    if (i9 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i9 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i9 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i9 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i9 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i9 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i9 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i9 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i8 |= statusBars;
                }
            }
            return i8;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f3606c = k.f3636q;
        } else {
            f3606c = l.f3637b;
        }
    }

    @d.w0(20)
    public h4(@d.o0 WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.f3607a = new k(this, windowInsets);
        } else if (i7 >= 29) {
            this.f3607a = new j(this, windowInsets);
        } else if (i7 >= 28) {
            this.f3607a = new i(this, windowInsets);
        } else {
            this.f3607a = new h(this, windowInsets);
        }
    }

    @d.o0
    @d.w0(20)
    public static h4 K(@d.o0 WindowInsets windowInsets) {
        return L(windowInsets, null);
    }

    @d.o0
    @d.w0(20)
    public static h4 L(@d.o0 WindowInsets windowInsets, @d.q0 View view) {
        h4 h4Var = new h4((WindowInsets) g1.s.l(windowInsets));
        if (view != null && u1.O0(view)) {
            h4Var.H(u1.o0(view));
            h4Var.d(view.getRootView());
        }
        return h4Var;
    }

    public static p0.v0 z(@d.o0 p0.v0 v0Var, int i7, int i8, int i9, int i10) {
        int max = Math.max(0, v0Var.f14585a - i7);
        int max2 = Math.max(0, v0Var.f14586b - i8);
        int max3 = Math.max(0, v0Var.f14587c - i9);
        int max4 = Math.max(0, v0Var.f14588d - i10);
        return (max == i7 && max2 == i8 && max3 == i9 && max4 == i10) ? v0Var : p0.v0.d(max, max2, max3, max4);
    }

    public boolean A() {
        return this.f3607a.o();
    }

    public boolean B() {
        return this.f3607a.p();
    }

    public boolean C(int i7) {
        return this.f3607a.q(i7);
    }

    @d.o0
    @Deprecated
    public h4 D(int i7, int i8, int i9, int i10) {
        return new b(this).h(p0.v0.d(i7, i8, i9, i10)).a();
    }

    @d.o0
    @Deprecated
    public h4 E(@d.o0 Rect rect) {
        return new b(this).h(p0.v0.e(rect)).a();
    }

    public void F(p0.v0[] v0VarArr) {
        this.f3607a.r(v0VarArr);
    }

    public void G(@d.o0 p0.v0 v0Var) {
        this.f3607a.s(v0Var);
    }

    public void H(@d.q0 h4 h4Var) {
        this.f3607a.t(h4Var);
    }

    public void I(@d.q0 p0.v0 v0Var) {
        this.f3607a.u(v0Var);
    }

    @d.q0
    @d.w0(20)
    public WindowInsets J() {
        l lVar = this.f3607a;
        if (lVar instanceof g) {
            return ((g) lVar).f3627c;
        }
        return null;
    }

    @d.o0
    @Deprecated
    public h4 a() {
        return this.f3607a.a();
    }

    @d.o0
    @Deprecated
    public h4 b() {
        return this.f3607a.b();
    }

    @d.o0
    @Deprecated
    public h4 c() {
        return this.f3607a.c();
    }

    public void d(@d.o0 View view) {
        this.f3607a.d(view);
    }

    @d.q0
    public d0 e() {
        return this.f3607a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h4) {
            return g1.n.a(this.f3607a, ((h4) obj).f3607a);
        }
        return false;
    }

    @d.o0
    public p0.v0 f(int i7) {
        return this.f3607a.g(i7);
    }

    @d.o0
    public p0.v0 g(int i7) {
        return this.f3607a.h(i7);
    }

    @d.o0
    @Deprecated
    public p0.v0 h() {
        return this.f3607a.i();
    }

    public int hashCode() {
        l lVar = this.f3607a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f3607a.j().f14588d;
    }

    @Deprecated
    public int j() {
        return this.f3607a.j().f14585a;
    }

    @Deprecated
    public int k() {
        return this.f3607a.j().f14587c;
    }

    @Deprecated
    public int l() {
        return this.f3607a.j().f14586b;
    }

    @d.o0
    @Deprecated
    public p0.v0 m() {
        return this.f3607a.j();
    }

    @d.o0
    @Deprecated
    public p0.v0 n() {
        return this.f3607a.k();
    }

    @Deprecated
    public int o() {
        return this.f3607a.l().f14588d;
    }

    @Deprecated
    public int p() {
        return this.f3607a.l().f14585a;
    }

    @Deprecated
    public int q() {
        return this.f3607a.l().f14587c;
    }

    @Deprecated
    public int r() {
        return this.f3607a.l().f14586b;
    }

    @d.o0
    @Deprecated
    public p0.v0 s() {
        return this.f3607a.l();
    }

    @d.o0
    @Deprecated
    public p0.v0 t() {
        return this.f3607a.m();
    }

    public boolean u() {
        p0.v0 f7 = f(m.a());
        p0.v0 v0Var = p0.v0.f14584e;
        return (f7.equals(v0Var) && g(m.a() ^ m.d()).equals(v0Var) && e() == null) ? false : true;
    }

    @Deprecated
    public boolean v() {
        return !this.f3607a.j().equals(p0.v0.f14584e);
    }

    @Deprecated
    public boolean w() {
        return !this.f3607a.l().equals(p0.v0.f14584e);
    }

    @d.o0
    public h4 x(@d.g0(from = 0) int i7, @d.g0(from = 0) int i8, @d.g0(from = 0) int i9, @d.g0(from = 0) int i10) {
        return this.f3607a.n(i7, i8, i9, i10);
    }

    @d.o0
    public h4 y(@d.o0 p0.v0 v0Var) {
        return x(v0Var.f14585a, v0Var.f14586b, v0Var.f14587c, v0Var.f14588d);
    }

    @d.w0(api = 20)
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        public static Field f3613e = null;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f3614f = false;

        /* renamed from: g  reason: collision with root package name */
        public static Constructor<WindowInsets> f3615g = null;

        /* renamed from: h  reason: collision with root package name */
        public static boolean f3616h = false;

        /* renamed from: c  reason: collision with root package name */
        public WindowInsets f3617c;

        /* renamed from: d  reason: collision with root package name */
        public p0.v0 f3618d;

        public c() {
            this.f3617c = l();
        }

        @d.q0
        private static WindowInsets l() {
            if (!f3614f) {
                try {
                    f3613e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e7) {
                    Log.i(h4.f3605b, "Could not retrieve WindowInsets.CONSUMED field", e7);
                }
                f3614f = true;
            }
            Field field = f3613e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e8) {
                    Log.i(h4.f3605b, "Could not get value from WindowInsets.CONSUMED field", e8);
                }
            }
            if (!f3616h) {
                try {
                    f3615g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e9) {
                    Log.i(h4.f3605b, "Could not retrieve WindowInsets(Rect) constructor", e9);
                }
                f3616h = true;
            }
            Constructor<WindowInsets> constructor = f3615g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e10) {
                    Log.i(h4.f3605b, "Could not invoke WindowInsets(Rect) constructor", e10);
                }
            }
            return null;
        }

        @Override // androidx.core.view.h4.f
        @d.o0
        public h4 b() {
            a();
            h4 K = h4.K(this.f3617c);
            K.F(this.f3621b);
            K.I(this.f3618d);
            return K;
        }

        @Override // androidx.core.view.h4.f
        public void g(@d.q0 p0.v0 v0Var) {
            this.f3618d = v0Var;
        }

        @Override // androidx.core.view.h4.f
        public void i(@d.o0 p0.v0 v0Var) {
            WindowInsets windowInsets = this.f3617c;
            if (windowInsets != null) {
                this.f3617c = windowInsets.replaceSystemWindowInsets(v0Var.f14585a, v0Var.f14586b, v0Var.f14587c, v0Var.f14588d);
            }
        }

        public c(@d.o0 h4 h4Var) {
            super(h4Var);
            this.f3617c = h4Var.J();
        }
    }

    @d.w0(api = 29)
    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets.Builder f3619c;

        public d() {
            r4.a();
            this.f3619c = p4.a();
        }

        @Override // androidx.core.view.h4.f
        @d.o0
        public h4 b() {
            WindowInsets build;
            a();
            build = this.f3619c.build();
            h4 K = h4.K(build);
            K.F(this.f3621b);
            return K;
        }

        @Override // androidx.core.view.h4.f
        public void c(@d.q0 d0 d0Var) {
            this.f3619c.setDisplayCutout(d0Var != null ? d0Var.h() : null);
        }

        @Override // androidx.core.view.h4.f
        public void f(@d.o0 p0.v0 v0Var) {
            this.f3619c.setMandatorySystemGestureInsets(v0Var.h());
        }

        @Override // androidx.core.view.h4.f
        public void g(@d.o0 p0.v0 v0Var) {
            this.f3619c.setStableInsets(v0Var.h());
        }

        @Override // androidx.core.view.h4.f
        public void h(@d.o0 p0.v0 v0Var) {
            this.f3619c.setSystemGestureInsets(v0Var.h());
        }

        @Override // androidx.core.view.h4.f
        public void i(@d.o0 p0.v0 v0Var) {
            this.f3619c.setSystemWindowInsets(v0Var.h());
        }

        @Override // androidx.core.view.h4.f
        public void j(@d.o0 p0.v0 v0Var) {
            this.f3619c.setTappableElementInsets(v0Var.h());
        }

        public d(@d.o0 h4 h4Var) {
            super(h4Var);
            WindowInsets.Builder a7;
            WindowInsets J = h4Var.J();
            if (J != null) {
                r4.a();
                a7 = q4.a(J);
            } else {
                r4.a();
                a7 = p4.a();
            }
            this.f3619c = a7;
        }
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        public p0.v0 f3632m;

        public h(@d.o0 h4 h4Var, @d.o0 WindowInsets windowInsets) {
            super(h4Var, windowInsets);
            this.f3632m = null;
        }

        @Override // androidx.core.view.h4.l
        @d.o0
        public h4 b() {
            return h4.K(this.f3627c.consumeStableInsets());
        }

        @Override // androidx.core.view.h4.l
        @d.o0
        public h4 c() {
            return h4.K(this.f3627c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.h4.l
        @d.o0
        public final p0.v0 j() {
            if (this.f3632m == null) {
                this.f3632m = p0.v0.d(this.f3627c.getStableInsetLeft(), this.f3627c.getStableInsetTop(), this.f3627c.getStableInsetRight(), this.f3627c.getStableInsetBottom());
            }
            return this.f3632m;
        }

        @Override // androidx.core.view.h4.l
        public boolean o() {
            return this.f3627c.isConsumed();
        }

        @Override // androidx.core.view.h4.l
        public void u(@d.q0 p0.v0 v0Var) {
            this.f3632m = v0Var;
        }

        public h(@d.o0 h4 h4Var, @d.o0 h hVar) {
            super(h4Var, hVar);
            this.f3632m = null;
            this.f3632m = hVar.f3632m;
        }
    }

    @d.w0(20)
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f3622h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f3623i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f3624j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f3625k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f3626l;
        @d.o0

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f3627c;

        /* renamed from: d  reason: collision with root package name */
        public p0.v0[] f3628d;

        /* renamed from: e  reason: collision with root package name */
        public p0.v0 f3629e;

        /* renamed from: f  reason: collision with root package name */
        public h4 f3630f;

        /* renamed from: g  reason: collision with root package name */
        public p0.v0 f3631g;

        public g(@d.o0 h4 h4Var, @d.o0 WindowInsets windowInsets) {
            super(h4Var);
            this.f3629e = null;
            this.f3627c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                f3623i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3624j = cls;
                f3625k = cls.getDeclaredField("mVisibleInsets");
                f3626l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3625k.setAccessible(true);
                f3626l.setAccessible(true);
            } catch (ReflectiveOperationException e7) {
                Log.e(h4.f3605b, "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
            }
            f3622h = true;
        }

        @SuppressLint({"WrongConstant"})
        @d.o0
        private p0.v0 v(int i7, boolean z6) {
            p0.v0 v0Var = p0.v0.f14584e;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    v0Var = p0.v0.b(v0Var, w(i8, z6));
                }
            }
            return v0Var;
        }

        private p0.v0 x() {
            h4 h4Var = this.f3630f;
            return h4Var != null ? h4Var.m() : p0.v0.f14584e;
        }

        @d.q0
        private p0.v0 y(@d.o0 View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f3622h) {
                    A();
                }
                Method method = f3623i;
                if (method != null && f3624j != null && f3625k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w(h4.f3605b, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f3625k.get(f3626l.get(invoke));
                        if (rect != null) {
                            return p0.v0.e(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e7) {
                        Log.e(h4.f3605b, "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @Override // androidx.core.view.h4.l
        public void d(@d.o0 View view) {
            p0.v0 y6 = y(view);
            if (y6 == null) {
                y6 = p0.v0.f14584e;
            }
            s(y6);
        }

        @Override // androidx.core.view.h4.l
        public void e(@d.o0 h4 h4Var) {
            h4Var.H(this.f3630f);
            h4Var.G(this.f3631g);
        }

        @Override // androidx.core.view.h4.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f3631g, ((g) obj).f3631g);
            }
            return false;
        }

        @Override // androidx.core.view.h4.l
        @d.o0
        public p0.v0 g(int i7) {
            return v(i7, false);
        }

        @Override // androidx.core.view.h4.l
        @d.o0
        public p0.v0 h(int i7) {
            return v(i7, true);
        }

        @Override // androidx.core.view.h4.l
        @d.o0
        public final p0.v0 l() {
            if (this.f3629e == null) {
                this.f3629e = p0.v0.d(this.f3627c.getSystemWindowInsetLeft(), this.f3627c.getSystemWindowInsetTop(), this.f3627c.getSystemWindowInsetRight(), this.f3627c.getSystemWindowInsetBottom());
            }
            return this.f3629e;
        }

        @Override // androidx.core.view.h4.l
        @d.o0
        public h4 n(int i7, int i8, int i9, int i10) {
            b bVar = new b(h4.K(this.f3627c));
            bVar.h(h4.z(l(), i7, i8, i9, i10));
            bVar.f(h4.z(j(), i7, i8, i9, i10));
            return bVar.a();
        }

        @Override // androidx.core.view.h4.l
        public boolean p() {
            return this.f3627c.isRound();
        }

        @Override // androidx.core.view.h4.l
        @SuppressLint({"WrongConstant"})
        public boolean q(int i7) {
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0 && !z(i8)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.h4.l
        public void r(p0.v0[] v0VarArr) {
            this.f3628d = v0VarArr;
        }

        @Override // androidx.core.view.h4.l
        public void s(@d.o0 p0.v0 v0Var) {
            this.f3631g = v0Var;
        }

        @Override // androidx.core.view.h4.l
        public void t(@d.q0 h4 h4Var) {
            this.f3630f = h4Var;
        }

        @d.o0
        public p0.v0 w(int i7, boolean z6) {
            p0.v0 m7;
            int i8;
            if (i7 == 1) {
                return z6 ? p0.v0.d(0, Math.max(x().f14586b, l().f14586b), 0, 0) : p0.v0.d(0, l().f14586b, 0, 0);
            }
            if (i7 == 2) {
                if (z6) {
                    p0.v0 x6 = x();
                    p0.v0 j7 = j();
                    return p0.v0.d(Math.max(x6.f14585a, j7.f14585a), 0, Math.max(x6.f14587c, j7.f14587c), Math.max(x6.f14588d, j7.f14588d));
                }
                p0.v0 l7 = l();
                h4 h4Var = this.f3630f;
                m7 = h4Var != null ? h4Var.m() : null;
                int i9 = l7.f14588d;
                if (m7 != null) {
                    i9 = Math.min(i9, m7.f14588d);
                }
                return p0.v0.d(l7.f14585a, 0, l7.f14587c, i9);
            } else if (i7 != 8) {
                if (i7 != 16) {
                    if (i7 != 32) {
                        if (i7 != 64) {
                            if (i7 != 128) {
                                return p0.v0.f14584e;
                            }
                            h4 h4Var2 = this.f3630f;
                            d0 e7 = h4Var2 != null ? h4Var2.e() : f();
                            return e7 != null ? p0.v0.d(e7.d(), e7.f(), e7.e(), e7.c()) : p0.v0.f14584e;
                        }
                        return m();
                    }
                    return i();
                }
                return k();
            } else {
                p0.v0[] v0VarArr = this.f3628d;
                m7 = v0VarArr != null ? v0VarArr[m.e(8)] : null;
                if (m7 != null) {
                    return m7;
                }
                p0.v0 l8 = l();
                p0.v0 x7 = x();
                int i10 = l8.f14588d;
                if (i10 > x7.f14588d) {
                    return p0.v0.d(0, 0, 0, i10);
                }
                p0.v0 v0Var = this.f3631g;
                return (v0Var == null || v0Var.equals(p0.v0.f14584e) || (i8 = this.f3631g.f14588d) <= x7.f14588d) ? p0.v0.f14584e : p0.v0.d(0, 0, 0, i8);
            }
        }

        public boolean z(int i7) {
            if (i7 != 1 && i7 != 2) {
                if (i7 == 4) {
                    return false;
                }
                if (i7 != 8 && i7 != 128) {
                    return true;
                }
            }
            return !w(i7, false).equals(p0.v0.f14584e);
        }

        public g(@d.o0 h4 h4Var, @d.o0 g gVar) {
            this(h4Var, new WindowInsets(gVar.f3627c));
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class j extends i {

        /* renamed from: n  reason: collision with root package name */
        public p0.v0 f3633n;

        /* renamed from: o  reason: collision with root package name */
        public p0.v0 f3634o;

        /* renamed from: p  reason: collision with root package name */
        public p0.v0 f3635p;

        public j(@d.o0 h4 h4Var, @d.o0 WindowInsets windowInsets) {
            super(h4Var, windowInsets);
            this.f3633n = null;
            this.f3634o = null;
            this.f3635p = null;
        }

        @Override // androidx.core.view.h4.l
        @d.o0
        public p0.v0 i() {
            Insets mandatorySystemGestureInsets;
            if (this.f3634o == null) {
                mandatorySystemGestureInsets = this.f3627c.getMandatorySystemGestureInsets();
                this.f3634o = p0.v0.g(mandatorySystemGestureInsets);
            }
            return this.f3634o;
        }

        @Override // androidx.core.view.h4.l
        @d.o0
        public p0.v0 k() {
            Insets systemGestureInsets;
            if (this.f3633n == null) {
                systemGestureInsets = this.f3627c.getSystemGestureInsets();
                this.f3633n = p0.v0.g(systemGestureInsets);
            }
            return this.f3633n;
        }

        @Override // androidx.core.view.h4.l
        @d.o0
        public p0.v0 m() {
            Insets tappableElementInsets;
            if (this.f3635p == null) {
                tappableElementInsets = this.f3627c.getTappableElementInsets();
                this.f3635p = p0.v0.g(tappableElementInsets);
            }
            return this.f3635p;
        }

        @Override // androidx.core.view.h4.g, androidx.core.view.h4.l
        @d.o0
        public h4 n(int i7, int i8, int i9, int i10) {
            WindowInsets inset;
            inset = this.f3627c.inset(i7, i8, i9, i10);
            return h4.K(inset);
        }

        @Override // androidx.core.view.h4.h, androidx.core.view.h4.l
        public void u(@d.q0 p0.v0 v0Var) {
        }

        public j(@d.o0 h4 h4Var, @d.o0 j jVar) {
            super(h4Var, jVar);
            this.f3633n = null;
            this.f3634o = null;
            this.f3635p = null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final f f3612a;

        public b() {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                this.f3612a = new e();
            } else if (i7 >= 29) {
                this.f3612a = new d();
            } else {
                this.f3612a = new c();
            }
        }

        @d.o0
        public h4 a() {
            return this.f3612a.b();
        }

        @d.o0
        public b b(@d.q0 d0 d0Var) {
            this.f3612a.c(d0Var);
            return this;
        }

        @d.o0
        public b c(int i7, @d.o0 p0.v0 v0Var) {
            this.f3612a.d(i7, v0Var);
            return this;
        }

        @d.o0
        public b d(int i7, @d.o0 p0.v0 v0Var) {
            this.f3612a.e(i7, v0Var);
            return this;
        }

        @d.o0
        @Deprecated
        public b e(@d.o0 p0.v0 v0Var) {
            this.f3612a.f(v0Var);
            return this;
        }

        @d.o0
        @Deprecated
        public b f(@d.o0 p0.v0 v0Var) {
            this.f3612a.g(v0Var);
            return this;
        }

        @d.o0
        @Deprecated
        public b g(@d.o0 p0.v0 v0Var) {
            this.f3612a.h(v0Var);
            return this;
        }

        @d.o0
        @Deprecated
        public b h(@d.o0 p0.v0 v0Var) {
            this.f3612a.i(v0Var);
            return this;
        }

        @d.o0
        @Deprecated
        public b i(@d.o0 p0.v0 v0Var) {
            this.f3612a.j(v0Var);
            return this;
        }

        @d.o0
        public b j(int i7, boolean z6) {
            this.f3612a.k(i7, z6);
            return this;
        }

        public b(@d.o0 h4 h4Var) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                this.f3612a = new e(h4Var);
            } else if (i7 >= 29) {
                this.f3612a = new d(h4Var);
            } else {
                this.f3612a = new c(h4Var);
            }
        }
    }

    public h4(@d.q0 h4 h4Var) {
        if (h4Var != null) {
            l lVar = h4Var.f3607a;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30 && (lVar instanceof k)) {
                this.f3607a = new k(this, (k) lVar);
            } else if (i7 >= 29 && (lVar instanceof j)) {
                this.f3607a = new j(this, (j) lVar);
            } else if (i7 >= 28 && (lVar instanceof i)) {
                this.f3607a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f3607a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f3607a = new g(this, (g) lVar);
            } else {
                this.f3607a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f3607a = new l(this);
    }
}
