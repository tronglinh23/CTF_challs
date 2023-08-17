package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.b;
import androidx.appcompat.app.t;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d2;
import d.b1;
import d.d0;
import d.g1;
import d.j0;
import d.l1;
import d.o0;
import d.q0;
import d.s0;
import d.w0;
import j.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import z0.a;
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f787b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final String f788c = "AppCompatDelegate";

    /* renamed from: e  reason: collision with root package name */
    public static final int f790e = -1;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public static final int f791f = 0;
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public static final int f792g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f793h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f794i = 2;

    /* renamed from: j  reason: collision with root package name */
    public static final int f795j = 3;

    /* renamed from: k  reason: collision with root package name */
    public static final int f796k = -100;

    /* renamed from: t  reason: collision with root package name */
    public static final int f805t = 108;

    /* renamed from: u  reason: collision with root package name */
    public static final int f806u = 109;

    /* renamed from: v  reason: collision with root package name */
    public static final int f807v = 10;

    /* renamed from: d  reason: collision with root package name */
    public static t.a f789d = new t.a(new t.b());

    /* renamed from: l  reason: collision with root package name */
    public static int f797l = -100;

    /* renamed from: m  reason: collision with root package name */
    public static z0.u f798m = null;

    /* renamed from: n  reason: collision with root package name */
    public static z0.u f799n = null;

    /* renamed from: o  reason: collision with root package name */
    public static Boolean f800o = null;

    /* renamed from: p  reason: collision with root package name */
    public static boolean f801p = false;

    /* renamed from: q  reason: collision with root package name */
    public static final androidx.collection.c<WeakReference<h>> f802q = new androidx.collection.c<>();

    /* renamed from: r  reason: collision with root package name */
    public static final Object f803r = new Object();

    /* renamed from: s  reason: collision with root package name */
    public static final Object f804s = new Object();

    @w0(24)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    @w0(33)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static LocaleList a(Object obj) {
            LocaleList applicationLocales;
            applicationLocales = i.a(obj).getApplicationLocales();
            return applicationLocales;
        }

        @d.u
        public static void b(Object obj, LocaleList localeList) {
            i.a(obj).setApplicationLocales(localeList);
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public static boolean E(Context context) {
        if (f800o == null) {
            try {
                Bundle bundle = r.a(context).metaData;
                if (bundle != null) {
                    f800o = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f800o = Boolean.FALSE;
            }
        }
        return f800o.booleanValue();
    }

    public static boolean F() {
        return d2.b();
    }

    public static /* synthetic */ void I(Context context) {
        t.c(context);
        f801p = true;
    }

    public static void R(@o0 h hVar) {
        synchronized (f803r) {
            S(hVar);
        }
    }

    public static void S(@o0 h hVar) {
        synchronized (f803r) {
            Iterator<WeakReference<h>> it = f802q.iterator();
            while (it.hasNext()) {
                h hVar2 = it.next().get();
                if (hVar2 == hVar || hVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    @l1
    public static void U() {
        f798m = null;
        f799n = null;
    }

    @s0(markerClass = {a.b.class})
    public static void V(@o0 z0.u uVar) {
        Objects.requireNonNull(uVar);
        if (z0.a.k()) {
            Object w6 = w();
            if (w6 != null) {
                b.b(w6, a.a(uVar.m()));
            }
        } else if (uVar.equals(f798m)) {
        } else {
            synchronized (f803r) {
                f798m = uVar;
                h();
            }
        }
    }

    public static void W(boolean z6) {
        d2.c(z6);
    }

    public static void a0(int i7) {
        if ((i7 == -1 || i7 == 0 || i7 == 1 || i7 == 2 || i7 == 3) && f797l != i7) {
            f797l = i7;
            g();
        }
    }

    public static void c(@o0 h hVar) {
        synchronized (f803r) {
            S(hVar);
            f802q.add(new WeakReference<>(hVar));
        }
    }

    @l1
    public static void c0(boolean z6) {
        f800o = Boolean.valueOf(z6);
    }

    public static void g() {
        synchronized (f803r) {
            Iterator<WeakReference<h>> it = f802q.iterator();
            while (it.hasNext()) {
                h hVar = it.next().get();
                if (hVar != null) {
                    hVar.f();
                }
            }
        }
    }

    public static void h() {
        Iterator<WeakReference<h>> it = f802q.iterator();
        while (it.hasNext()) {
            h hVar = it.next().get();
            if (hVar != null) {
                hVar.e();
            }
        }
    }

    @s0(markerClass = {a.b.class})
    public static void j0(final Context context) {
        if (E(context)) {
            if (z0.a.k()) {
                if (f801p) {
                    return;
                }
                f789d.execute(new Runnable() { // from class: androidx.appcompat.app.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.I(context);
                    }
                });
                return;
            }
            synchronized (f804s) {
                z0.u uVar = f798m;
                if (uVar == null) {
                    if (f799n == null) {
                        f799n = z0.u.c(t.b(context));
                    }
                    if (f799n.j()) {
                        return;
                    }
                    f798m = f799n;
                } else if (!uVar.equals(f799n)) {
                    z0.u uVar2 = f798m;
                    f799n = uVar2;
                    t.a(context, uVar2.m());
                }
            }
        }
    }

    @o0
    public static h l(@o0 Activity activity, @q0 e eVar) {
        return new l(activity, eVar);
    }

    @o0
    public static h m(@o0 Dialog dialog, @q0 e eVar) {
        return new l(dialog, eVar);
    }

    @o0
    public static h n(@o0 Context context, @o0 Activity activity, @q0 e eVar) {
        return new l(context, activity, eVar);
    }

    @o0
    public static h o(@o0 Context context, @o0 Window window, @q0 e eVar) {
        return new l(context, window, eVar);
    }

    @d.d
    @o0
    @s0(markerClass = {a.b.class})
    public static z0.u r() {
        if (z0.a.k()) {
            Object w6 = w();
            if (w6 != null) {
                return z0.u.o(b.a(w6));
            }
        } else {
            z0.u uVar = f798m;
            if (uVar != null) {
                return uVar;
            }
        }
        return z0.u.g();
    }

    public static int t() {
        return f797l;
    }

    @w0(33)
    public static Object w() {
        Context s6;
        Iterator<WeakReference<h>> it = f802q.iterator();
        while (it.hasNext()) {
            h hVar = it.next().get();
            if (hVar != null && (s6 = hVar.s()) != null) {
                return s6.getSystemService("locale");
            }
        }
        return null;
    }

    @q0
    public static z0.u y() {
        return f798m;
    }

    @q0
    public static z0.u z() {
        return f799n;
    }

    @q0
    public abstract androidx.appcompat.app.a A();

    public abstract boolean B(int i7);

    public abstract void C();

    public abstract void D();

    public abstract boolean G();

    public abstract void J(Configuration configuration);

    public abstract void K(Bundle bundle);

    public abstract void L();

    public abstract void M(Bundle bundle);

    public abstract void N();

    public abstract void O(Bundle bundle);

    public abstract void P();

    public abstract void Q();

    public abstract boolean T(int i7);

    public abstract void X(@j0 int i7);

    public abstract void Y(View view);

    public abstract void Z(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void b0(boolean z6);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    @w0(17)
    public abstract void d0(int i7);

    public boolean e() {
        return false;
    }

    @d.i
    @w0(33)
    public void e0(@q0 OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract boolean f();

    public abstract void f0(@q0 Toolbar toolbar);

    public void g0(@g1 int i7) {
    }

    public abstract void h0(@q0 CharSequence charSequence);

    public void i(final Context context) {
        f789d.execute(new Runnable() { // from class: androidx.appcompat.app.f
            @Override // java.lang.Runnable
            public final void run() {
                h.j0(context);
            }
        });
    }

    @q0
    public abstract j.b i0(@o0 b.a aVar);

    @Deprecated
    public void j(Context context) {
    }

    @d.i
    @o0
    public Context k(@o0 Context context) {
        j(context);
        return context;
    }

    public abstract View p(@q0 View view, String str, @o0 Context context, @o0 AttributeSet attributeSet);

    @q0
    public abstract <T extends View> T q(@d0 int i7);

    @q0
    public Context s() {
        return null;
    }

    @q0
    public abstract b.InterfaceC0019b u();

    public int v() {
        return -100;
    }

    public abstract MenuInflater x();
}
