package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d2;
import androidx.appcompat.widget.e2;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.t1;
import androidx.appcompat.widget.w0;
import androidx.core.view.b3;
import androidx.core.view.h4;
import androidx.core.view.k1;
import androidx.core.view.o0;
import androidx.core.view.p0;
import androidx.core.view.u1;
import androidx.core.view.z2;
import androidx.lifecycle.p;
import com.google.android.material.internal.ViewUtils;
import d.b1;
import d.d0;
import d.g1;
import d.l1;
import d.o0;
import d.q0;
import f.a;
import j.b;
import j.f;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import m0.i;
import org.xmlpull.v1.XmlPullParser;
@b1({b1.a.LIBRARY})
/* loaded from: classes.dex */
public class l extends androidx.appcompat.app.h implements g.a, LayoutInflater.Factory2 {
    public static boolean B0 = false;
    public static final String C0 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    public final androidx.appcompat.app.e A;
    public androidx.appcompat.app.a B;
    public MenuInflater C;
    public CharSequence D;
    public k0 E;
    public j F;
    public x G;
    public j.b H;
    public ActionBarContextView I;
    public PopupWindow J;
    public Runnable K;
    public z2 L;
    public boolean M;
    public boolean N;
    public ViewGroup O;
    public TextView P;
    public View Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public w[] Z;

    /* renamed from: a0  reason: collision with root package name */
    public w f812a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f813b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f814c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f815d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f816e0;

    /* renamed from: f0  reason: collision with root package name */
    public Configuration f817f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f818g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f819h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f820i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f821j0;

    /* renamed from: k0  reason: collision with root package name */
    public s f822k0;

    /* renamed from: l0  reason: collision with root package name */
    public s f823l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f824m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f825n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Runnable f826o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f827p0;

    /* renamed from: q0  reason: collision with root package name */
    public Rect f828q0;

    /* renamed from: r0  reason: collision with root package name */
    public Rect f829r0;

    /* renamed from: s0  reason: collision with root package name */
    public androidx.appcompat.app.q f830s0;

    /* renamed from: t0  reason: collision with root package name */
    public androidx.appcompat.app.u f831t0;

    /* renamed from: u0  reason: collision with root package name */
    public OnBackInvokedDispatcher f832u0;

    /* renamed from: v0  reason: collision with root package name */
    public OnBackInvokedCallback f833v0;

    /* renamed from: w  reason: collision with root package name */
    public final Object f834w;

    /* renamed from: x  reason: collision with root package name */
    public final Context f835x;

    /* renamed from: y  reason: collision with root package name */
    public Window f836y;

    /* renamed from: z  reason: collision with root package name */
    public q f837z;

    /* renamed from: w0  reason: collision with root package name */
    public static final androidx.collection.m<String, Integer> f808w0 = new androidx.collection.m<>();

    /* renamed from: x0  reason: collision with root package name */
    public static final boolean f809x0 = false;

    /* renamed from: y0  reason: collision with root package name */
    public static final int[] f810y0 = {16842836};

    /* renamed from: z0  reason: collision with root package name */
    public static final boolean f811z0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean A0 = true;

    /* loaded from: classes.dex */
    public class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f838a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f838a = uncaughtExceptionHandler;
        }

        public final boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@o0 Thread thread, @o0 Throwable th) {
            if (!a(th)) {
                this.f838a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + l.C0);
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f838a.uncaughtException(thread, notFoundException);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            if ((lVar.f825n0 & 1) != 0) {
                lVar.z0(0);
            }
            l lVar2 = l.this;
            if ((lVar2.f825n0 & 4096) != 0) {
                lVar2.z0(androidx.appcompat.app.h.f805t);
            }
            l lVar3 = l.this;
            lVar3.f824m0 = false;
            lVar3.f825n0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public class c implements k1 {
        public c() {
        }

        @Override // androidx.core.view.k1
        public h4 onApplyWindowInsets(View view, h4 h4Var) {
            int r6 = h4Var.r();
            int w12 = l.this.w1(h4Var, null);
            if (r6 != w12) {
                h4Var = h4Var.D(h4Var.p(), w12, h4Var.q(), h4Var.o());
            }
            return u1.g1(view, h4Var);
        }
    }

    /* loaded from: classes.dex */
    public class d implements w0.a {
        public d() {
        }

        @Override // androidx.appcompat.widget.w0.a
        public void a(Rect rect) {
            rect.top = l.this.w1(null, rect);
        }
    }

    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.a {
        public e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            l.this.x0();
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* loaded from: classes.dex */
        public class a extends b3 {
            public a() {
            }

            @Override // androidx.core.view.b3, androidx.core.view.a3
            public void b(View view) {
                l.this.I.setAlpha(1.0f);
                l.this.L.u(null);
                l.this.L = null;
            }

            @Override // androidx.core.view.b3, androidx.core.view.a3
            public void c(View view) {
                l.this.I.setVisibility(0);
            }
        }

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            lVar.J.showAtLocation(lVar.I, 55, 0, 0);
            l.this.A0();
            if (!l.this.m1()) {
                l.this.I.setAlpha(1.0f);
                l.this.I.setVisibility(0);
                return;
            }
            l.this.I.setAlpha(0.0f);
            l lVar2 = l.this;
            lVar2.L = u1.g(lVar2.I).b(1.0f);
            l.this.L.u(new a());
        }
    }

    /* loaded from: classes.dex */
    public class g extends b3 {
        public g() {
        }

        @Override // androidx.core.view.b3, androidx.core.view.a3
        public void b(View view) {
            l.this.I.setAlpha(1.0f);
            l.this.L.u(null);
            l.this.L = null;
        }

        @Override // androidx.core.view.b3, androidx.core.view.a3
        public void c(View view) {
            l.this.I.setVisibility(0);
            if (l.this.I.getParent() instanceof View) {
                u1.v1((View) l.this.I.getParent());
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements b.InterfaceC0019b {
        public h() {
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public void a(Drawable drawable, int i7) {
            androidx.appcompat.app.a A = l.this.A();
            if (A != null) {
                A.l0(drawable);
                A.i0(i7);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public boolean b() {
            androidx.appcompat.app.a A = l.this.A();
            return (A == null || (A.p() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public Drawable c() {
            t1 F = t1.F(e(), null, new int[]{a.b.E1});
            Drawable h7 = F.h(0);
            F.I();
            return h7;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public void d(int i7) {
            androidx.appcompat.app.a A = l.this.A();
            if (A != null) {
                A.i0(i7);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public Context e() {
            return l.this.F0();
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        boolean a(int i7);

        @q0
        View onCreatePanelView(int i7);
    }

    /* loaded from: classes.dex */
    public final class j implements n.a {
        public j() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean a(@o0 androidx.appcompat.view.menu.g gVar) {
            Window.Callback O0 = l.this.O0();
            if (O0 != null) {
                O0.onMenuOpened(androidx.appcompat.app.h.f805t, gVar);
                return true;
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void onCloseMenu(@o0 androidx.appcompat.view.menu.g gVar, boolean z6) {
            l.this.r0(gVar);
        }
    }

    /* loaded from: classes.dex */
    public class k implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public b.a f848a;

        /* loaded from: classes.dex */
        public class a extends b3 {
            public a() {
            }

            @Override // androidx.core.view.b3, androidx.core.view.a3
            public void b(View view) {
                l.this.I.setVisibility(8);
                l lVar = l.this;
                PopupWindow popupWindow = lVar.J;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (lVar.I.getParent() instanceof View) {
                    u1.v1((View) l.this.I.getParent());
                }
                l.this.I.t();
                l.this.L.u(null);
                l lVar2 = l.this;
                lVar2.L = null;
                u1.v1(lVar2.O);
            }
        }

        public k(b.a aVar) {
            this.f848a = aVar;
        }

        @Override // j.b.a
        public boolean a(j.b bVar, MenuItem menuItem) {
            return this.f848a.a(bVar, menuItem);
        }

        @Override // j.b.a
        public boolean b(j.b bVar, Menu menu) {
            return this.f848a.b(bVar, menu);
        }

        @Override // j.b.a
        public void c(j.b bVar) {
            this.f848a.c(bVar);
            l lVar = l.this;
            if (lVar.J != null) {
                lVar.f836y.getDecorView().removeCallbacks(l.this.K);
            }
            l lVar2 = l.this;
            if (lVar2.I != null) {
                lVar2.A0();
                l lVar3 = l.this;
                lVar3.L = u1.g(lVar3.I).b(0.0f);
                l.this.L.u(new a());
            }
            l lVar4 = l.this;
            androidx.appcompat.app.e eVar = lVar4.A;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(lVar4.H);
            }
            l lVar5 = l.this;
            lVar5.H = null;
            u1.v1(lVar5.O);
            l.this.u1();
        }

        @Override // j.b.a
        public boolean d(j.b bVar, Menu menu) {
            u1.v1(l.this.O);
            return this.f848a.d(bVar, menu);
        }
    }

    @d.w0(17)
    /* renamed from: androidx.appcompat.app.l$l  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0020l {
        public static Context a(@o0 Context context, @o0 Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        public static void b(@o0 Configuration configuration, @o0 Configuration configuration2, @o0 Configuration configuration3) {
            int i7 = configuration.densityDpi;
            int i8 = configuration2.densityDpi;
            if (i7 != i8) {
                configuration3.densityDpi = i8;
            }
        }

        @d.u
        public static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        @d.u
        public static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class m {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @d.u
        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class n {
        @d.u
        public static void a(@o0 Configuration configuration, @o0 Configuration configuration2, @o0 Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        @d.u
        public static z0.u b(Configuration configuration) {
            return z0.u.c(configuration.getLocales().toLanguageTags());
        }

        @d.u
        public static void c(z0.u uVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(uVar.m()));
        }

        @d.u
        public static void d(Configuration configuration, z0.u uVar) {
            configuration.setLocales(LocaleList.forLanguageTags(uVar.m()));
        }
    }

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class o {
        public static void a(@o0 Configuration configuration, @o0 Configuration configuration2, @o0 Configuration configuration3) {
            int i7 = configuration.colorMode & 3;
            int i8 = configuration2.colorMode;
            if (i7 != (i8 & 3)) {
                configuration3.colorMode |= i8 & 3;
            }
            int i9 = configuration.colorMode & 12;
            int i10 = configuration2.colorMode;
            if (i9 != (i10 & 12)) {
                configuration3.colorMode |= i10 & 12;
            }
        }
    }

    @d.w0(33)
    /* loaded from: classes.dex */
    public static class p {
        @d.u
        public static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        @d.u
        public static OnBackInvokedCallback b(Object obj, final l lVar) {
            Objects.requireNonNull(lVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.m
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    l.this.V0();
                }
            };
            androidx.activity.n.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        @d.u
        public static void c(Object obj, Object obj2) {
            androidx.activity.n.a(obj).unregisterOnBackInvokedCallback(androidx.activity.o.a(obj2));
        }
    }

    /* loaded from: classes.dex */
    public class q extends j.i {

        /* renamed from: c  reason: collision with root package name */
        public i f851c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f852d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f853e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f854f;

        public q(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f853e = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f853e = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f852d = true;
                callback.onContentChanged();
            } finally {
                this.f852d = false;
            }
        }

        public void d(Window.Callback callback, int i7, Menu menu) {
            try {
                this.f854f = true;
                callback.onPanelClosed(i7, menu);
            } finally {
                this.f854f = false;
            }
        }

        @Override // j.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f853e ? a().dispatchKeyEvent(keyEvent) : l.this.y0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // j.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || l.this.Y0(keyEvent.getKeyCode(), keyEvent);
        }

        public void e(@q0 i iVar) {
            this.f851c = iVar;
        }

        public final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(l.this.f835x, callback);
            j.b i02 = l.this.i0(aVar);
            if (i02 != null) {
                return aVar.e(i02);
            }
            return null;
        }

        @Override // j.i, android.view.Window.Callback
        public void onContentChanged() {
            if (this.f852d) {
                a().onContentChanged();
            }
        }

        @Override // j.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i7, Menu menu) {
            if (i7 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i7, menu);
            }
            return false;
        }

        @Override // j.i, android.view.Window.Callback
        public View onCreatePanelView(int i7) {
            View onCreatePanelView;
            i iVar = this.f851c;
            return (iVar == null || (onCreatePanelView = iVar.onCreatePanelView(i7)) == null) ? super.onCreatePanelView(i7) : onCreatePanelView;
        }

        @Override // j.i, android.view.Window.Callback
        public boolean onMenuOpened(int i7, Menu menu) {
            super.onMenuOpened(i7, menu);
            l.this.b1(i7);
            return true;
        }

        @Override // j.i, android.view.Window.Callback
        public void onPanelClosed(int i7, Menu menu) {
            if (this.f854f) {
                a().onPanelClosed(i7, menu);
                return;
            }
            super.onPanelClosed(i7, menu);
            l.this.c1(i7);
        }

        @Override // j.i, android.view.Window.Callback
        public boolean onPreparePanel(int i7, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i7 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.setOverrideVisibleItems(true);
            }
            i iVar = this.f851c;
            boolean z6 = iVar != null && iVar.a(i7);
            if (!z6) {
                z6 = super.onPreparePanel(i7, view, menu);
            }
            if (gVar != null) {
                gVar.setOverrideVisibleItems(false);
            }
            return z6;
        }

        @Override // j.i, android.view.Window.Callback
        @d.w0(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i7) {
            androidx.appcompat.view.menu.g gVar;
            w L0 = l.this.L0(0, true);
            if (L0 == null || (gVar = L0.f873j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i7);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i7);
            }
        }

        @Override // j.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // j.i, android.view.Window.Callback
        @d.w0(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
            if (l.this.G() && i7 == 0) {
                return f(callback);
            }
            return super.onWindowStartingActionMode(callback, i7);
        }
    }

    /* loaded from: classes.dex */
    public class r extends s {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f856c;

        public r(@o0 Context context) {
            super();
            this.f856c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.l.s
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.l.s
        public int c() {
            return m.a(this.f856c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.l.s
        public void e() {
            l.this.f();
        }
    }

    @b1({b1.a.LIBRARY})
    @l1
    /* loaded from: classes.dex */
    public abstract class s {

        /* renamed from: a  reason: collision with root package name */
        public BroadcastReceiver f858a;

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                s.this.e();
            }
        }

        public s() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f858a;
            if (broadcastReceiver != null) {
                try {
                    l.this.f835x.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f858a = null;
            }
        }

        @q0
        public abstract IntentFilter b();

        public abstract int c();

        public boolean d() {
            return this.f858a != null;
        }

        public abstract void e();

        public void f() {
            a();
            IntentFilter b7 = b();
            if (b7 == null || b7.countActions() == 0) {
                return;
            }
            if (this.f858a == null) {
                this.f858a = new a();
            }
            l.this.f835x.registerReceiver(this.f858a, b7);
        }
    }

    /* loaded from: classes.dex */
    public class t extends s {

        /* renamed from: c  reason: collision with root package name */
        public final a0 f861c;

        public t(@o0 a0 a0Var) {
            super();
            this.f861c = a0Var;
        }

        @Override // androidx.appcompat.app.l.s
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.l.s
        public int c() {
            return this.f861c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.l.s
        public void e() {
            l.this.f();
        }
    }

    @d.w0(17)
    /* loaded from: classes.dex */
    public static class u {
        public static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* loaded from: classes.dex */
    public class v extends ContentFrameLayout {
        public v(Context context) {
            super(context);
        }

        public final boolean c(int i7, int i8) {
            return i7 < -5 || i8 < -5 || i7 > getWidth() + 5 || i8 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return l.this.y0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                l.this.t0(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i7) {
            setBackgroundDrawable(g.a.b(getContext(), i7));
        }
    }

    /* loaded from: classes.dex */
    public static final class w {

        /* renamed from: a  reason: collision with root package name */
        public int f864a;

        /* renamed from: b  reason: collision with root package name */
        public int f865b;

        /* renamed from: c  reason: collision with root package name */
        public int f866c;

        /* renamed from: d  reason: collision with root package name */
        public int f867d;

        /* renamed from: e  reason: collision with root package name */
        public int f868e;

        /* renamed from: f  reason: collision with root package name */
        public int f869f;

        /* renamed from: g  reason: collision with root package name */
        public ViewGroup f870g;

        /* renamed from: h  reason: collision with root package name */
        public View f871h;

        /* renamed from: i  reason: collision with root package name */
        public View f872i;

        /* renamed from: j  reason: collision with root package name */
        public androidx.appcompat.view.menu.g f873j;

        /* renamed from: k  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f874k;

        /* renamed from: l  reason: collision with root package name */
        public Context f875l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f876m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f877n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f878o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f879p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f880q = false;

        /* renamed from: r  reason: collision with root package name */
        public boolean f881r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f882s;

        /* renamed from: t  reason: collision with root package name */
        public Bundle f883t;

        /* renamed from: u  reason: collision with root package name */
        public Bundle f884u;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0021a();

            /* renamed from: k  reason: collision with root package name */
            public int f885k;

            /* renamed from: l  reason: collision with root package name */
            public boolean f886l;

            /* renamed from: m  reason: collision with root package name */
            public Bundle f887m;

            /* renamed from: androidx.appcompat.app.l$w$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0021a implements Parcelable.ClassLoaderCreator<a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return a.a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b  reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return a.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c  reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i7) {
                    return new a[i7];
                }
            }

            public static a a(Parcel parcel, ClassLoader classLoader) {
                a aVar = new a();
                aVar.f885k = parcel.readInt();
                boolean z6 = parcel.readInt() == 1;
                aVar.f886l = z6;
                if (z6) {
                    aVar.f887m = parcel.readBundle(classLoader);
                }
                return aVar;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i7) {
                parcel.writeInt(this.f885k);
                parcel.writeInt(this.f886l ? 1 : 0);
                if (this.f886l) {
                    parcel.writeBundle(this.f887m);
                }
            }
        }

        public w(int i7) {
            this.f864a = i7;
        }

        public void a() {
            Bundle bundle;
            androidx.appcompat.view.menu.g gVar = this.f873j;
            if (gVar == null || (bundle = this.f883t) == null) {
                return;
            }
            gVar.restorePresenterStates(bundle);
            this.f883t = null;
        }

        public void b() {
            androidx.appcompat.view.menu.g gVar = this.f873j;
            if (gVar != null) {
                gVar.removeMenuPresenter(this.f874k);
            }
            this.f874k = null;
        }

        public androidx.appcompat.view.menu.o c(n.a aVar) {
            if (this.f873j == null) {
                return null;
            }
            if (this.f874k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f875l, a.j.f9210q);
                this.f874k = eVar;
                eVar.setCallback(aVar);
                this.f873j.addMenuPresenter(this.f874k);
            }
            return this.f874k.getMenuView(this.f870g);
        }

        public boolean d() {
            if (this.f871h == null) {
                return false;
            }
            return this.f872i != null || this.f874k.a().getCount() > 0;
        }

        public void e(Parcelable parcelable) {
            a aVar = (a) parcelable;
            this.f864a = aVar.f885k;
            this.f882s = aVar.f886l;
            this.f883t = aVar.f887m;
            this.f871h = null;
            this.f870g = null;
        }

        public Parcelable f() {
            a aVar = new a();
            aVar.f885k = this.f864a;
            aVar.f886l = this.f878o;
            if (this.f873j != null) {
                Bundle bundle = new Bundle();
                aVar.f887m = bundle;
                this.f873j.savePresenterStates(bundle);
            }
            return aVar;
        }

        public void g(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f873j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.removeMenuPresenter(this.f874k);
            }
            this.f873j = gVar;
            if (gVar == null || (eVar = this.f874k) == null) {
                return;
            }
            gVar.addMenuPresenter(eVar);
        }

        public void h(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(a.b.f8842c, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                newTheme.applyStyle(i7, true);
            }
            newTheme.resolveAttribute(a.b.f8961x2, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                newTheme.applyStyle(i8, true);
            } else {
                newTheme.applyStyle(a.l.P3, true);
            }
            j.d dVar = new j.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f875l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(a.m.S0);
            this.f865b = obtainStyledAttributes.getResourceId(a.m.B2, 0);
            this.f869f = obtainStyledAttributes.getResourceId(a.m.U0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public final class x implements n.a {
        public x() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean a(@o0 androidx.appcompat.view.menu.g gVar) {
            Window.Callback O0;
            if (gVar == gVar.getRootMenu()) {
                l lVar = l.this;
                if (!lVar.T || (O0 = lVar.O0()) == null || l.this.f816e0) {
                    return true;
                }
                O0.onMenuOpened(androidx.appcompat.app.h.f805t, gVar);
                return true;
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void onCloseMenu(@o0 androidx.appcompat.view.menu.g gVar, boolean z6) {
            androidx.appcompat.view.menu.g rootMenu = gVar.getRootMenu();
            boolean z7 = rootMenu != gVar;
            l lVar = l.this;
            if (z7) {
                gVar = rootMenu;
            }
            w D0 = lVar.D0(gVar);
            if (D0 != null) {
                if (!z7) {
                    l.this.u0(D0, z6);
                    return;
                }
                l.this.q0(D0.f864a, D0, rootMenu);
                l.this.u0(D0, true);
            }
        }
    }

    public l(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    @o0
    public static Configuration E0(@o0 Configuration configuration, @q0 Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f7 = configuration.fontScale;
            float f8 = configuration2.fontScale;
            if (f7 != f8) {
                configuration3.fontScale = f8;
            }
            int i7 = configuration.mcc;
            int i8 = configuration2.mcc;
            if (i7 != i8) {
                configuration3.mcc = i8;
            }
            int i9 = configuration.mnc;
            int i10 = configuration2.mnc;
            if (i9 != i10) {
                configuration3.mnc = i10;
            }
            n.a(configuration, configuration2, configuration3);
            int i11 = configuration.touchscreen;
            int i12 = configuration2.touchscreen;
            if (i11 != i12) {
                configuration3.touchscreen = i12;
            }
            int i13 = configuration.keyboard;
            int i14 = configuration2.keyboard;
            if (i13 != i14) {
                configuration3.keyboard = i14;
            }
            int i15 = configuration.keyboardHidden;
            int i16 = configuration2.keyboardHidden;
            if (i15 != i16) {
                configuration3.keyboardHidden = i16;
            }
            int i17 = configuration.navigation;
            int i18 = configuration2.navigation;
            if (i17 != i18) {
                configuration3.navigation = i18;
            }
            int i19 = configuration.navigationHidden;
            int i20 = configuration2.navigationHidden;
            if (i19 != i20) {
                configuration3.navigationHidden = i20;
            }
            int i21 = configuration.orientation;
            int i22 = configuration2.orientation;
            if (i21 != i22) {
                configuration3.orientation = i22;
            }
            int i23 = configuration.screenLayout & 15;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 15)) {
                configuration3.screenLayout |= i24 & 15;
            }
            int i25 = configuration.screenLayout & 192;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 192)) {
                configuration3.screenLayout |= i26 & 192;
            }
            int i27 = configuration.screenLayout & 48;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 48)) {
                configuration3.screenLayout |= i28 & 48;
            }
            int i29 = configuration.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & ViewUtils.EDGE_TO_EDGE_FLAGS)) {
                configuration3.screenLayout |= i30 & ViewUtils.EDGE_TO_EDGE_FLAGS;
            }
            o.a(configuration, configuration2, configuration3);
            int i31 = configuration.uiMode & 15;
            int i32 = configuration2.uiMode;
            if (i31 != (i32 & 15)) {
                configuration3.uiMode |= i32 & 15;
            }
            int i33 = configuration.uiMode & 48;
            int i34 = configuration2.uiMode;
            if (i33 != (i34 & 48)) {
                configuration3.uiMode |= i34 & 48;
            }
            int i35 = configuration.screenWidthDp;
            int i36 = configuration2.screenWidthDp;
            if (i35 != i36) {
                configuration3.screenWidthDp = i36;
            }
            int i37 = configuration.screenHeightDp;
            int i38 = configuration2.screenHeightDp;
            if (i37 != i38) {
                configuration3.screenHeightDp = i38;
            }
            int i39 = configuration.smallestScreenWidthDp;
            int i40 = configuration2.smallestScreenWidthDp;
            if (i39 != i40) {
                configuration3.smallestScreenWidthDp = i40;
            }
            C0020l.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    @Override // androidx.appcompat.app.h
    public androidx.appcompat.app.a A() {
        P0();
        return this.B;
    }

    public void A0() {
        z2 z2Var = this.L;
        if (z2Var != null) {
            z2Var.d();
        }
    }

    @Override // androidx.appcompat.app.h
    public boolean B(int i7) {
        int j12 = j1(i7);
        return (j12 != 1 ? j12 != 2 ? j12 != 5 ? j12 != 10 ? j12 != 108 ? j12 != 109 ? false : this.U : this.T : this.V : this.S : this.R : this.X) || this.f836y.hasFeature(i7);
    }

    public final void B0() {
        if (this.N) {
            return;
        }
        this.O = w0();
        CharSequence N0 = N0();
        if (!TextUtils.isEmpty(N0)) {
            k0 k0Var = this.E;
            if (k0Var != null) {
                k0Var.setWindowTitle(N0);
            } else if (f1() != null) {
                f1().B0(N0);
            } else {
                TextView textView = this.P;
                if (textView != null) {
                    textView.setText(N0);
                }
            }
        }
        m0();
        d1(this.O);
        this.N = true;
        w L0 = L0(0, false);
        if (this.f816e0) {
            return;
        }
        if (L0 == null || L0.f873j == null) {
            T0(androidx.appcompat.app.h.f805t);
        }
    }

    @Override // androidx.appcompat.app.h
    public void C() {
        LayoutInflater from = LayoutInflater.from(this.f835x);
        if (from.getFactory() == null) {
            p0.d(from, this);
        } else if (from.getFactory2() instanceof l) {
        } else {
            Log.i(androidx.appcompat.app.h.f788c, "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final void C0() {
        if (this.f836y == null) {
            Object obj = this.f834w;
            if (obj instanceof Activity) {
                n0(((Activity) obj).getWindow());
            }
        }
        if (this.f836y == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // androidx.appcompat.app.h
    public void D() {
        if (f1() == null || A().D()) {
            return;
        }
        T0(0);
    }

    public w D0(Menu menu) {
        w[] wVarArr = this.Z;
        int length = wVarArr != null ? wVarArr.length : 0;
        for (int i7 = 0; i7 < length; i7++) {
            w wVar = wVarArr[i7];
            if (wVar != null && wVar.f873j == menu) {
                return wVar;
            }
        }
        return null;
    }

    public final Context F0() {
        androidx.appcompat.app.a A = A();
        Context A2 = A != null ? A.A() : null;
        return A2 == null ? this.f835x : A2;
    }

    @Override // androidx.appcompat.app.h
    public boolean G() {
        return this.M;
    }

    public final int G0(Context context) {
        if (!this.f821j0 && (this.f834w instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f834w.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f820i0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.f820i0 = 0;
            }
        }
        this.f821j0 = true;
        return this.f820i0;
    }

    public final s H0(@o0 Context context) {
        if (this.f823l0 == null) {
            this.f823l0 = new r(context);
        }
        return this.f823l0;
    }

    @b1({b1.a.LIBRARY})
    @l1
    @o0
    public final s I0() {
        return J0(this.f835x);
    }

    @Override // androidx.appcompat.app.h
    public void J(Configuration configuration) {
        androidx.appcompat.app.a A;
        if (this.T && this.N && (A = A()) != null) {
            A.I(configuration);
        }
        androidx.appcompat.widget.l.b().g(this.f835x);
        this.f817f0 = new Configuration(this.f835x.getResources().getConfiguration());
        l0(false, false);
    }

    public final s J0(@o0 Context context) {
        if (this.f822k0 == null) {
            this.f822k0 = new t(a0.a(context));
        }
        return this.f822k0;
    }

    @Override // androidx.appcompat.app.h
    public void K(Bundle bundle) {
        String str;
        this.f814c0 = true;
        k0(false);
        C0();
        Object obj = this.f834w;
        if (obj instanceof Activity) {
            try {
                str = i0.x.d((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                androidx.appcompat.app.a f12 = f1();
                if (f12 == null) {
                    this.f827p0 = true;
                } else {
                    f12.X(true);
                }
            }
            androidx.appcompat.app.h.c(this);
        }
        this.f817f0 = new Configuration(this.f835x.getResources().getConfiguration());
        this.f815d0 = true;
    }

    public z0.u K0(Configuration configuration) {
        return n.b(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // androidx.appcompat.app.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f834w
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.h.R(r3)
        L9:
            boolean r0 = r3.f824m0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f836y
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f826o0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f816e0 = r0
            int r0 = r3.f818g0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f834w
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.m<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.l.f808w0
            java.lang.Object r1 = r3.f834w
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f818g0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.m<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.l.f808w0
            java.lang.Object r1 = r3.f834w
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.B
            if (r0 == 0) goto L5b
            r0.J()
        L5b:
            r3.s0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.l.L():void");
    }

    public w L0(int i7, boolean z6) {
        w[] wVarArr = this.Z;
        if (wVarArr == null || wVarArr.length <= i7) {
            w[] wVarArr2 = new w[i7 + 1];
            if (wVarArr != null) {
                System.arraycopy(wVarArr, 0, wVarArr2, 0, wVarArr.length);
            }
            this.Z = wVarArr2;
            wVarArr = wVarArr2;
        }
        w wVar = wVarArr[i7];
        if (wVar == null) {
            w wVar2 = new w(i7);
            wVarArr[i7] = wVar2;
            return wVar2;
        }
        return wVar;
    }

    @Override // androidx.appcompat.app.h
    public void M(Bundle bundle) {
        B0();
    }

    public ViewGroup M0() {
        return this.O;
    }

    @Override // androidx.appcompat.app.h
    public void N() {
        androidx.appcompat.app.a A = A();
        if (A != null) {
            A.u0(true);
        }
    }

    public final CharSequence N0() {
        Object obj = this.f834w;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.D;
    }

    @Override // androidx.appcompat.app.h
    public void O(Bundle bundle) {
    }

    public final Window.Callback O0() {
        return this.f836y.getCallback();
    }

    @Override // androidx.appcompat.app.h
    public void P() {
        l0(true, false);
    }

    public final void P0() {
        B0();
        if (this.T && this.B == null) {
            Object obj = this.f834w;
            if (obj instanceof Activity) {
                this.B = new b0((Activity) this.f834w, this.U);
            } else if (obj instanceof Dialog) {
                this.B = new b0((Dialog) this.f834w);
            }
            androidx.appcompat.app.a aVar = this.B;
            if (aVar != null) {
                aVar.X(this.f827p0);
            }
        }
    }

    @Override // androidx.appcompat.app.h
    public void Q() {
        androidx.appcompat.app.a A = A();
        if (A != null) {
            A.u0(false);
        }
    }

    public final boolean Q0(w wVar) {
        View view = wVar.f872i;
        if (view != null) {
            wVar.f871h = view;
            return true;
        } else if (wVar.f873j == null) {
            return false;
        } else {
            if (this.G == null) {
                this.G = new x();
            }
            View view2 = (View) wVar.c(this.G);
            wVar.f871h = view2;
            return view2 != null;
        }
    }

    public final boolean R0(w wVar) {
        wVar.h(F0());
        wVar.f870g = new v(wVar.f875l);
        wVar.f866c = 81;
        return true;
    }

    public final boolean S0(w wVar) {
        Resources.Theme theme;
        Context context = this.f835x;
        int i7 = wVar.f864a;
        if ((i7 == 0 || i7 == 108) && this.E != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(a.b.f8884j, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(a.b.f8890k, typedValue, true);
            } else {
                theme2.resolveAttribute(a.b.f8890k, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                j.d dVar = new j.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.setCallback(this);
        wVar.g(gVar);
        return true;
    }

    @Override // androidx.appcompat.app.h
    public boolean T(int i7) {
        int j12 = j1(i7);
        if (this.X && j12 == 108) {
            return false;
        }
        if (this.T && j12 == 1) {
            this.T = false;
        }
        if (j12 == 1) {
            q1();
            this.X = true;
            return true;
        } else if (j12 == 2) {
            q1();
            this.R = true;
            return true;
        } else if (j12 == 5) {
            q1();
            this.S = true;
            return true;
        } else if (j12 == 10) {
            q1();
            this.V = true;
            return true;
        } else if (j12 == 108) {
            q1();
            this.T = true;
            return true;
        } else if (j12 != 109) {
            return this.f836y.requestFeature(j12);
        } else {
            q1();
            this.U = true;
            return true;
        }
    }

    public final void T0(int i7) {
        this.f825n0 = (1 << i7) | this.f825n0;
        if (this.f824m0) {
            return;
        }
        u1.p1(this.f836y.getDecorView(), this.f826o0);
        this.f824m0 = true;
    }

    public int U0(@o0 Context context, int i7) {
        if (i7 != -100) {
            if (i7 != -1) {
                if (i7 == 0) {
                    if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                        return -1;
                    }
                    return J0(context).c();
                } else if (i7 != 1 && i7 != 2) {
                    if (i7 == 3) {
                        return H0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            }
            return i7;
        }
        return -1;
    }

    public boolean V0() {
        boolean z6 = this.f813b0;
        this.f813b0 = false;
        w L0 = L0(0, false);
        if (L0 != null && L0.f878o) {
            if (!z6) {
                u0(L0, true);
            }
            return true;
        }
        j.b bVar = this.H;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        androidx.appcompat.app.a A = A();
        return A != null && A.m();
    }

    public boolean W0(int i7, KeyEvent keyEvent) {
        if (i7 == 4) {
            this.f813b0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i7 == 82) {
            X0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.h
    public void X(int i7) {
        B0();
        ViewGroup viewGroup = (ViewGroup) this.O.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f835x).inflate(i7, viewGroup);
        this.f837z.c(this.f836y.getCallback());
    }

    public final boolean X0(int i7, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            w L0 = L0(i7, true);
            if (L0.f878o) {
                return false;
            }
            return h1(L0, keyEvent);
        }
        return false;
    }

    @Override // androidx.appcompat.app.h
    public void Y(View view) {
        B0();
        ViewGroup viewGroup = (ViewGroup) this.O.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f837z.c(this.f836y.getCallback());
    }

    public boolean Y0(int i7, KeyEvent keyEvent) {
        androidx.appcompat.app.a A = A();
        if (A == null || !A.K(i7, keyEvent)) {
            w wVar = this.f812a0;
            if (wVar != null && g1(wVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                w wVar2 = this.f812a0;
                if (wVar2 != null) {
                    wVar2.f877n = true;
                }
                return true;
            }
            if (this.f812a0 == null) {
                w L0 = L0(0, true);
                h1(L0, keyEvent);
                boolean g12 = g1(L0, keyEvent.getKeyCode(), keyEvent, 1);
                L0.f876m = false;
                if (g12) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.h
    public void Z(View view, ViewGroup.LayoutParams layoutParams) {
        B0();
        ViewGroup viewGroup = (ViewGroup) this.O.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f837z.c(this.f836y.getCallback());
    }

    public boolean Z0(int i7, KeyEvent keyEvent) {
        if (i7 != 4) {
            if (i7 == 82) {
                a1(0, keyEvent);
                return true;
            }
        } else if (V0()) {
            return true;
        }
        return false;
    }

    public final boolean a1(int i7, KeyEvent keyEvent) {
        boolean z6;
        k0 k0Var;
        if (this.H != null) {
            return false;
        }
        boolean z7 = true;
        w L0 = L0(i7, true);
        if (i7 != 0 || (k0Var = this.E) == null || !k0Var.k() || ViewConfiguration.get(this.f835x).hasPermanentMenuKey()) {
            boolean z8 = L0.f878o;
            if (z8 || L0.f877n) {
                u0(L0, true);
                z7 = z8;
            } else {
                if (L0.f876m) {
                    if (L0.f881r) {
                        L0.f876m = false;
                        z6 = h1(L0, keyEvent);
                    } else {
                        z6 = true;
                    }
                    if (z6) {
                        e1(L0, keyEvent);
                    }
                }
                z7 = false;
            }
        } else if (this.E.c()) {
            z7 = this.E.h();
        } else {
            if (!this.f816e0 && h1(L0, keyEvent)) {
                z7 = this.E.i();
            }
            z7 = false;
        }
        if (z7) {
            AudioManager audioManager = (AudioManager) this.f835x.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w(androidx.appcompat.app.h.f788c, "Couldn't get audio manager");
            }
        }
        return z7;
    }

    @Override // androidx.appcompat.app.h
    public void b0(boolean z6) {
        this.M = z6;
    }

    public void b1(int i7) {
        androidx.appcompat.app.a A;
        if (i7 != 108 || (A = A()) == null) {
            return;
        }
        A.n(true);
    }

    public void c1(int i7) {
        if (i7 == 108) {
            androidx.appcompat.app.a A = A();
            if (A != null) {
                A.n(false);
            }
        } else if (i7 == 0) {
            w L0 = L0(i7, true);
            if (L0.f878o) {
                u0(L0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.h
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        B0();
        ((ViewGroup) this.O.findViewById(16908290)).addView(view, layoutParams);
        this.f837z.c(this.f836y.getCallback());
    }

    @Override // androidx.appcompat.app.h
    @d.w0(17)
    public void d0(int i7) {
        if (this.f818g0 != i7) {
            this.f818g0 = i7;
            if (this.f814c0) {
                f();
            }
        }
    }

    public void d1(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.h
    public boolean e() {
        if (androidx.appcompat.app.h.E(this.f835x) && androidx.appcompat.app.h.y() != null && !androidx.appcompat.app.h.y().equals(androidx.appcompat.app.h.z())) {
            i(this.f835x);
        }
        return k0(true);
    }

    @Override // androidx.appcompat.app.h
    @d.w0(33)
    public void e0(@q0 OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.e0(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f832u0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f833v0) != null) {
            p.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f833v0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f834w;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f832u0 = p.a((Activity) this.f834w);
                u1();
            }
        }
        this.f832u0 = onBackInvokedDispatcher;
        u1();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e1(androidx.appcompat.app.l.w r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.l.e1(androidx.appcompat.app.l$w, android.view.KeyEvent):void");
    }

    @Override // androidx.appcompat.app.h
    public boolean f() {
        return k0(true);
    }

    @Override // androidx.appcompat.app.h
    public void f0(Toolbar toolbar) {
        if (this.f834w instanceof Activity) {
            androidx.appcompat.app.a A = A();
            if (A instanceof b0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.C = null;
            if (A != null) {
                A.J();
            }
            this.B = null;
            if (toolbar != null) {
                y yVar = new y(toolbar, N0(), this.f837z);
                this.B = yVar;
                this.f837z.e(yVar.f919k);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f837z.e(null);
            }
            D();
        }
    }

    public final androidx.appcompat.app.a f1() {
        return this.B;
    }

    @Override // androidx.appcompat.app.h
    public void g0(@g1 int i7) {
        this.f819h0 = i7;
    }

    public final boolean g1(w wVar, int i7, KeyEvent keyEvent, int i8) {
        androidx.appcompat.view.menu.g gVar;
        boolean z6 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((wVar.f876m || h1(wVar, keyEvent)) && (gVar = wVar.f873j) != null) {
            z6 = gVar.performShortcut(i7, keyEvent, i8);
        }
        if (z6 && (i8 & 1) == 0 && this.E == null) {
            u0(wVar, true);
        }
        return z6;
    }

    @Override // androidx.appcompat.app.h
    public final void h0(CharSequence charSequence) {
        this.D = charSequence;
        k0 k0Var = this.E;
        if (k0Var != null) {
            k0Var.setWindowTitle(charSequence);
        } else if (f1() != null) {
            f1().B0(charSequence);
        } else {
            TextView textView = this.P;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public final boolean h1(w wVar, KeyEvent keyEvent) {
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        if (this.f816e0) {
            return false;
        }
        if (wVar.f876m) {
            return true;
        }
        w wVar2 = this.f812a0;
        if (wVar2 != null && wVar2 != wVar) {
            u0(wVar2, false);
        }
        Window.Callback O0 = O0();
        if (O0 != null) {
            wVar.f872i = O0.onCreatePanelView(wVar.f864a);
        }
        int i7 = wVar.f864a;
        boolean z6 = i7 == 0 || i7 == 108;
        if (z6 && (k0Var3 = this.E) != null) {
            k0Var3.d();
        }
        if (wVar.f872i == null && (!z6 || !(f1() instanceof y))) {
            androidx.appcompat.view.menu.g gVar = wVar.f873j;
            if (gVar == null || wVar.f881r) {
                if (gVar == null && (!S0(wVar) || wVar.f873j == null)) {
                    return false;
                }
                if (z6 && this.E != null) {
                    if (this.F == null) {
                        this.F = new j();
                    }
                    this.E.a(wVar.f873j, this.F);
                }
                wVar.f873j.stopDispatchingItemsChanged();
                if (!O0.onCreatePanelMenu(wVar.f864a, wVar.f873j)) {
                    wVar.g(null);
                    if (z6 && (k0Var = this.E) != null) {
                        k0Var.a(null, this.F);
                    }
                    return false;
                }
                wVar.f881r = false;
            }
            wVar.f873j.stopDispatchingItemsChanged();
            Bundle bundle = wVar.f884u;
            if (bundle != null) {
                wVar.f873j.restoreActionViewStates(bundle);
                wVar.f884u = null;
            }
            if (!O0.onPreparePanel(0, wVar.f872i, wVar.f873j)) {
                if (z6 && (k0Var2 = this.E) != null) {
                    k0Var2.a(null, this.F);
                }
                wVar.f873j.startDispatchingItemsChanged();
                return false;
            }
            boolean z7 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            wVar.f879p = z7;
            wVar.f873j.setQwertyMode(z7);
            wVar.f873j.startDispatchingItemsChanged();
        }
        wVar.f876m = true;
        wVar.f877n = false;
        this.f812a0 = wVar;
        return true;
    }

    @Override // androidx.appcompat.app.h
    public j.b i0(@o0 b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar != null) {
            j.b bVar = this.H;
            if (bVar != null) {
                bVar.a();
            }
            k kVar = new k(aVar);
            androidx.appcompat.app.a A = A();
            if (A != null) {
                j.b D0 = A.D0(kVar);
                this.H = D0;
                if (D0 != null && (eVar = this.A) != null) {
                    eVar.onSupportActionModeStarted(D0);
                }
            }
            if (this.H == null) {
                this.H = p1(kVar);
            }
            u1();
            return this.H;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public final void i1(boolean z6) {
        k0 k0Var = this.E;
        if (k0Var == null || !k0Var.k() || (ViewConfiguration.get(this.f835x).hasPermanentMenuKey() && !this.E.f())) {
            w L0 = L0(0, true);
            L0.f880q = true;
            u0(L0, false);
            e1(L0, null);
            return;
        }
        Window.Callback O0 = O0();
        if (this.E.c() && z6) {
            this.E.h();
            if (this.f816e0) {
                return;
            }
            O0.onPanelClosed(androidx.appcompat.app.h.f805t, L0(0, true).f873j);
        } else if (O0 == null || this.f816e0) {
        } else {
            if (this.f824m0 && (this.f825n0 & 1) != 0) {
                this.f836y.getDecorView().removeCallbacks(this.f826o0);
                this.f826o0.run();
            }
            w L02 = L0(0, true);
            androidx.appcompat.view.menu.g gVar = L02.f873j;
            if (gVar == null || L02.f881r || !O0.onPreparePanel(0, L02.f872i, gVar)) {
                return;
            }
            O0.onMenuOpened(androidx.appcompat.app.h.f805t, L02.f873j);
            this.E.i();
        }
    }

    public final int j1(int i7) {
        if (i7 == 8) {
            Log.i(androidx.appcompat.app.h.f788c, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return androidx.appcompat.app.h.f805t;
        } else if (i7 == 9) {
            Log.i(androidx.appcompat.app.h.f788c, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return androidx.appcompat.app.h.f806u;
        } else {
            return i7;
        }
    }

    @Override // androidx.appcompat.app.h
    @d.i
    @o0
    public Context k(@o0 Context context) {
        this.f814c0 = true;
        int U0 = U0(context, p0());
        if (androidx.appcompat.app.h.E(context)) {
            androidx.appcompat.app.h.j0(context);
        }
        z0.u o02 = o0(context);
        if (A0 && (context instanceof ContextThemeWrapper)) {
            try {
                u.a((ContextThemeWrapper) context, v0(context, U0, o02, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof j.d) {
            try {
                ((j.d) context).a(v0(context, U0, o02, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (f811z0) {
            Configuration configuration = new Configuration();
            configuration.uiMode = -1;
            configuration.fontScale = 0.0f;
            Configuration configuration2 = C0020l.a(context, configuration).getResources().getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            configuration2.uiMode = configuration3.uiMode;
            Configuration v02 = v0(context, U0, o02, !configuration2.equals(configuration3) ? E0(configuration2, configuration3) : null, true);
            j.d dVar = new j.d(context, a.l.f9258b4);
            dVar.a(v02);
            boolean z6 = false;
            try {
                z6 = context.getTheme() != null;
            } catch (NullPointerException unused3) {
            }
            if (z6) {
                i.h.a(dVar.getTheme());
            }
            return super.k(dVar);
        }
        return super.k(context);
    }

    public final boolean k0(boolean z6) {
        return l0(z6, true);
    }

    public void k1(Configuration configuration, @o0 z0.u uVar) {
        n.d(configuration, uVar);
    }

    public final boolean l0(boolean z6, boolean z7) {
        if (this.f816e0) {
            return false;
        }
        int p02 = p0();
        int U0 = U0(this.f835x, p02);
        z0.u o02 = Build.VERSION.SDK_INT < 33 ? o0(this.f835x) : null;
        if (!z7 && o02 != null) {
            o02 = K0(this.f835x.getResources().getConfiguration());
        }
        boolean t12 = t1(U0, o02, z6);
        if (p02 == 0) {
            J0(this.f835x).f();
        } else {
            s sVar = this.f822k0;
            if (sVar != null) {
                sVar.a();
            }
        }
        if (p02 == 3) {
            H0(this.f835x).f();
        } else {
            s sVar2 = this.f823l0;
            if (sVar2 != null) {
                sVar2.a();
            }
        }
        return t12;
    }

    public void l1(z0.u uVar) {
        n.c(uVar);
    }

    public final void m0() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.O.findViewById(16908290);
        View decorView = this.f836y.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f835x.obtainStyledAttributes(a.m.S0);
        obtainStyledAttributes.getValue(a.m.f9536n3, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(a.m.f9544o3, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(a.m.f9520l3)) {
            obtainStyledAttributes.getValue(a.m.f9520l3, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(a.m.f9528m3)) {
            obtainStyledAttributes.getValue(a.m.f9528m3, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(a.m.f9504j3)) {
            obtainStyledAttributes.getValue(a.m.f9504j3, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(a.m.f9512k3)) {
            obtainStyledAttributes.getValue(a.m.f9512k3, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean m1() {
        ViewGroup viewGroup;
        return this.N && (viewGroup = this.O) != null && u1.U0(viewGroup);
    }

    public final void n0(@o0 Window window) {
        if (this.f836y != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof q) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        q qVar = new q(callback);
        this.f837z = qVar;
        window.setCallback(qVar);
        t1 F = t1.F(this.f835x, null, f810y0);
        Drawable i7 = F.i(0);
        if (i7 != null) {
            window.setBackgroundDrawable(i7);
        }
        F.I();
        this.f836y = window;
        if (Build.VERSION.SDK_INT < 33 || this.f832u0 != null) {
            return;
        }
        e0(null);
    }

    public final boolean n1(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f836y.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || u1.O0((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @q0
    public z0.u o0(@o0 Context context) {
        z0.u y6;
        if (Build.VERSION.SDK_INT < 33 && (y6 = androidx.appcompat.app.h.y()) != null) {
            z0.u K0 = K0(context.getApplicationContext().getResources().getConfiguration());
            z0.u c7 = androidx.appcompat.app.v.c(y6, K0);
            return c7.j() ? K0 : c7;
        }
        return null;
    }

    public boolean o1() {
        if (this.f832u0 == null) {
            return false;
        }
        w L0 = L0(0, false);
        return (L0 != null && L0.f878o) || this.H != null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return p(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean onMenuItemSelected(@o0 androidx.appcompat.view.menu.g gVar, @o0 MenuItem menuItem) {
        w D0;
        Window.Callback O0 = O0();
        if (O0 == null || this.f816e0 || (D0 = D0(gVar.getRootMenu())) == null) {
            return false;
        }
        return O0.onMenuItemSelected(D0.f864a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void onMenuModeChange(@o0 androidx.appcompat.view.menu.g gVar) {
        i1(true);
    }

    @Override // androidx.appcompat.app.h
    public View p(View view, String str, @o0 Context context, @o0 AttributeSet attributeSet) {
        boolean z6;
        boolean z7 = false;
        if (this.f830s0 == null) {
            String string = this.f835x.obtainStyledAttributes(a.m.S0).getString(a.m.f9472f3);
            if (string == null) {
                this.f830s0 = new androidx.appcompat.app.q();
            } else {
                try {
                    this.f830s0 = (androidx.appcompat.app.q) this.f835x.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i(androidx.appcompat.app.h.f788c, "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f830s0 = new androidx.appcompat.app.q();
                }
            }
        }
        boolean z8 = f809x0;
        if (z8) {
            if (this.f831t0 == null) {
                this.f831t0 = new androidx.appcompat.app.u();
            }
            if (this.f831t0.a(attributeSet)) {
                z6 = true;
                return this.f830s0.createView(view, str, context, attributeSet, z6, z8, true, d2.d());
            } else if (!(attributeSet instanceof XmlPullParser)) {
                z7 = n1((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z7 = true;
            }
        }
        z6 = z7;
        return this.f830s0.createView(view, str, context, attributeSet, z6, z8, true, d2.d());
    }

    public final int p0() {
        int i7 = this.f818g0;
        return i7 != -100 ? i7 : androidx.appcompat.app.h.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j.b p1(@d.o0 j.b.a r8) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.l.p1(j.b$a):j.b");
    }

    @Override // androidx.appcompat.app.h
    @q0
    public <T extends View> T q(@d0 int i7) {
        B0();
        return (T) this.f836y.findViewById(i7);
    }

    public void q0(int i7, w wVar, Menu menu) {
        if (menu == null) {
            if (wVar == null && i7 >= 0) {
                w[] wVarArr = this.Z;
                if (i7 < wVarArr.length) {
                    wVar = wVarArr[i7];
                }
            }
            if (wVar != null) {
                menu = wVar.f873j;
            }
        }
        if ((wVar == null || wVar.f878o) && !this.f816e0) {
            this.f837z.d(this.f836y.getCallback(), i7, menu);
        }
    }

    public final void q1() {
        if (this.N) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public void r0(@o0 androidx.appcompat.view.menu.g gVar) {
        if (this.Y) {
            return;
        }
        this.Y = true;
        this.E.n();
        Window.Callback O0 = O0();
        if (O0 != null && !this.f816e0) {
            O0.onPanelClosed(androidx.appcompat.app.h.f805t, gVar);
        }
        this.Y = false;
    }

    @q0
    public final AppCompatActivity r1() {
        for (Context context = this.f835x; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.h
    public Context s() {
        return this.f835x;
    }

    public final void s0() {
        s sVar = this.f822k0;
        if (sVar != null) {
            sVar.a();
        }
        s sVar2 = this.f823l0;
        if (sVar2 != null) {
            sVar2.a();
        }
    }

    public final void s1(Configuration configuration) {
        Activity activity = (Activity) this.f834w;
        if (activity instanceof androidx.lifecycle.z) {
            if (((androidx.lifecycle.z) activity).getLifecycle().b().d(p.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (!this.f815d0 || this.f816e0) {
        } else {
            activity.onConfigurationChanged(configuration);
        }
    }

    public void t0(int i7) {
        u0(L0(i7, true), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t1(int r9, @d.q0 z0.u r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f835x
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.v0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f835x
            int r1 = r8.G0(r1)
            android.content.res.Configuration r2 = r8.f817f0
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f835x
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            z0.u r2 = r8.K0(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            z0.u r0 = r8.K0(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.175E-43)
            goto L3b
        L3a:
            r3 = r6
        L3b:
            if (r0 == 0) goto L47
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L47
            r2 = r3 | 4
            r3 = r2 | 8192(0x2000, float:1.14794E-41)
        L47:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L71
            if (r11 == 0) goto L71
            boolean r11 = r8.f814c0
            if (r11 == 0) goto L71
            boolean r11 = androidx.appcompat.app.l.f811z0
            if (r11 != 0) goto L5a
            boolean r11 = r8.f815d0
            if (r11 == 0) goto L71
        L5a:
            java.lang.Object r11 = r8.f834w
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L71
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L71
            java.lang.Object r11 = r8.f834w
            android.app.Activity r11 = (android.app.Activity) r11
            i0.b.H(r11)
            r11 = r7
            goto L72
        L71:
            r11 = r6
        L72:
            if (r11 != 0) goto L7f
            if (r3 == 0) goto L7f
            r11 = r3 & r1
            if (r11 != r3) goto L7b
            r6 = r7
        L7b:
            r8.v1(r4, r0, r6, r5)
            goto L80
        L7f:
            r7 = r11
        L80:
            if (r7 == 0) goto L9c
            java.lang.Object r11 = r8.f834w
            boolean r1 = r11 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L9c
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L91
            androidx.appcompat.app.AppCompatActivity r11 = (androidx.appcompat.app.AppCompatActivity) r11
            r11.j0(r9)
        L91:
            r9 = r3 & 4
            if (r9 == 0) goto L9c
            java.lang.Object r9 = r8.f834w
            androidx.appcompat.app.AppCompatActivity r9 = (androidx.appcompat.app.AppCompatActivity) r9
            r9.i0(r10)
        L9c:
            if (r7 == 0) goto Lb1
            if (r0 == 0) goto Lb1
            android.content.Context r9 = r8.f835x
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            z0.u r9 = r8.K0(r9)
            r8.l1(r9)
        Lb1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.l.t1(int, z0.u, boolean):boolean");
    }

    @Override // androidx.appcompat.app.h
    public final b.InterfaceC0019b u() {
        return new h();
    }

    public void u0(w wVar, boolean z6) {
        ViewGroup viewGroup;
        k0 k0Var;
        if (z6 && wVar.f864a == 0 && (k0Var = this.E) != null && k0Var.c()) {
            r0(wVar.f873j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f835x.getSystemService("window");
        if (windowManager != null && wVar.f878o && (viewGroup = wVar.f870g) != null) {
            windowManager.removeView(viewGroup);
            if (z6) {
                q0(wVar.f864a, wVar, null);
            }
        }
        wVar.f876m = false;
        wVar.f877n = false;
        wVar.f878o = false;
        wVar.f871h = null;
        wVar.f880q = true;
        if (this.f812a0 == wVar) {
            this.f812a0 = null;
        }
        if (wVar.f864a == 0) {
            u1();
        }
    }

    public void u1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean o12 = o1();
            if (o12 && this.f833v0 == null) {
                this.f833v0 = p.b(this.f832u0, this);
            } else if (o12 || (onBackInvokedCallback = this.f833v0) == null) {
            } else {
                p.c(this.f832u0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.app.h
    public int v() {
        return this.f818g0;
    }

    @o0
    public final Configuration v0(@o0 Context context, int i7, @q0 z0.u uVar, @q0 Configuration configuration, boolean z6) {
        int i8 = i7 != 1 ? i7 != 2 ? z6 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i8 | (configuration2.uiMode & (-49));
        if (uVar != null) {
            k1(configuration2, uVar);
        }
        return configuration2;
    }

    public final void v1(int i7, @q0 z0.u uVar, boolean z6, @q0 Configuration configuration) {
        Resources resources = this.f835x.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i7 | (resources.getConfiguration().uiMode & (-49));
        if (uVar != null) {
            k1(configuration2, uVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i8 = this.f819h0;
        if (i8 != 0) {
            this.f835x.setTheme(i8);
            this.f835x.getTheme().applyStyle(this.f819h0, true);
        }
        if (z6 && (this.f834w instanceof Activity)) {
            s1(configuration2);
        }
    }

    public final ViewGroup w0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f835x.obtainStyledAttributes(a.m.S0);
        if (!obtainStyledAttributes.hasValue(a.m.f9480g3)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(a.m.f9551p3, false)) {
            T(1);
        } else if (obtainStyledAttributes.getBoolean(a.m.f9480g3, false)) {
            T(androidx.appcompat.app.h.f805t);
        }
        if (obtainStyledAttributes.getBoolean(a.m.f9488h3, false)) {
            T(androidx.appcompat.app.h.f806u);
        }
        if (obtainStyledAttributes.getBoolean(a.m.f9496i3, false)) {
            T(10);
        }
        this.W = obtainStyledAttributes.getBoolean(a.m.T0, false);
        obtainStyledAttributes.recycle();
        C0();
        this.f836y.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f835x);
        if (this.X) {
            viewGroup = this.V ? (ViewGroup) from.inflate(a.j.f9216w, (ViewGroup) null) : (ViewGroup) from.inflate(a.j.f9215v, (ViewGroup) null);
        } else if (this.W) {
            viewGroup = (ViewGroup) from.inflate(a.j.f9206m, (ViewGroup) null);
            this.U = false;
            this.T = false;
        } else if (this.T) {
            TypedValue typedValue = new TypedValue();
            this.f835x.getTheme().resolveAttribute(a.b.f8884j, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new j.d(this.f835x, typedValue.resourceId) : this.f835x).inflate(a.j.f9217x, (ViewGroup) null);
            k0 k0Var = (k0) viewGroup.findViewById(a.g.f9177x);
            this.E = k0Var;
            k0Var.setWindowCallback(O0());
            if (this.U) {
                this.E.m(androidx.appcompat.app.h.f806u);
            }
            if (this.R) {
                this.E.m(2);
            }
            if (this.S) {
                this.E.m(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.T + ", windowActionBarOverlay: " + this.U + ", android:windowIsFloating: " + this.W + ", windowActionModeOverlay: " + this.V + ", windowNoTitle: " + this.X + " }");
        }
        u1.a2(viewGroup, new c());
        if (this.E == null) {
            this.P = (TextView) viewGroup.findViewById(a.g.f9168s0);
        }
        e2.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.g.f9133b);
        ViewGroup viewGroup2 = (ViewGroup) this.f836y.findViewById(16908290);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f836y.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    public final int w1(@q0 h4 h4Var, @q0 Rect rect) {
        boolean z6;
        boolean z7;
        int r6 = h4Var != null ? h4Var.r() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.I;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z6 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.I.getLayoutParams();
            if (this.I.isShown()) {
                if (this.f828q0 == null) {
                    this.f828q0 = new Rect();
                    this.f829r0 = new Rect();
                }
                Rect rect2 = this.f828q0;
                Rect rect3 = this.f829r0;
                if (h4Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(h4Var.p(), h4Var.r(), h4Var.q(), h4Var.o());
                }
                e2.a(this.O, rect2, rect3);
                int i7 = rect2.top;
                int i8 = rect2.left;
                int i9 = rect2.right;
                h4 o02 = u1.o0(this.O);
                int p6 = o02 == null ? 0 : o02.p();
                int q6 = o02 == null ? 0 : o02.q();
                if (marginLayoutParams.topMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9) {
                    z7 = false;
                } else {
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.leftMargin = i8;
                    marginLayoutParams.rightMargin = i9;
                    z7 = true;
                }
                if (i7 <= 0 || this.Q != null) {
                    View view = this.Q;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != p6 || marginLayoutParams2.rightMargin != q6) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = p6;
                            marginLayoutParams2.rightMargin = q6;
                            this.Q.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f835x);
                    this.Q = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = p6;
                    layoutParams.rightMargin = q6;
                    this.O.addView(this.Q, -1, layoutParams);
                }
                View view3 = this.Q;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    x1(this.Q);
                }
                if (!this.V && r5) {
                    r6 = 0;
                }
                z6 = r5;
                r5 = z7;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z6 = false;
            } else {
                z6 = false;
                r5 = false;
            }
            if (r5) {
                this.I.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.Q;
        if (view4 != null) {
            view4.setVisibility(z6 ? 0 : 8);
        }
        return r6;
    }

    @Override // androidx.appcompat.app.h
    public MenuInflater x() {
        if (this.C == null) {
            P0();
            androidx.appcompat.app.a aVar = this.B;
            this.C = new j.g(aVar != null ? aVar.A() : this.f835x);
        }
        return this.C;
    }

    public void x0() {
        androidx.appcompat.view.menu.g gVar;
        k0 k0Var = this.E;
        if (k0Var != null) {
            k0Var.n();
        }
        if (this.J != null) {
            this.f836y.getDecorView().removeCallbacks(this.K);
            if (this.J.isShowing()) {
                try {
                    this.J.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.J = null;
        }
        A0();
        w L0 = L0(0, false);
        if (L0 == null || (gVar = L0.f873j) == null) {
            return;
        }
        gVar.close();
    }

    public final void x1(View view) {
        view.setBackgroundColor((u1.C0(view) & 8192) != 0 ? k0.d.f(this.f835x, a.d.f8987g) : k0.d.f(this.f835x, a.d.f8985f));
    }

    public boolean y0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f834w;
        if (((obj instanceof o0.a) || (obj instanceof androidx.appcompat.app.o)) && (decorView = this.f836y.getDecorView()) != null && androidx.core.view.o0.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f837z.b(this.f836y.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? W0(keyCode, keyEvent) : Z0(keyCode, keyEvent);
    }

    public void z0(int i7) {
        w L0;
        w L02 = L0(i7, true);
        if (L02.f873j != null) {
            Bundle bundle = new Bundle();
            L02.f873j.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                L02.f884u = bundle;
            }
            L02.f873j.stopDispatchingItemsChanged();
            L02.f873j.clear();
        }
        L02.f881r = true;
        L02.f880q = true;
        if ((i7 != 108 && i7 != 0) || this.E == null || (L0 = L0(0, false)) == null) {
            return;
        }
        L0.f876m = false;
        h1(L0, null);
    }

    public l(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public l(Context context, Window window, androidx.appcompat.app.e eVar) {
        this(context, window, eVar, context);
    }

    public l(Context context, Activity activity, androidx.appcompat.app.e eVar) {
        this(context, null, eVar, activity);
    }

    public l(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        androidx.collection.m<String, Integer> mVar;
        Integer num;
        AppCompatActivity r12;
        this.L = null;
        this.M = true;
        this.f818g0 = -100;
        this.f826o0 = new b();
        this.f835x = context;
        this.A = eVar;
        this.f834w = obj;
        if (this.f818g0 == -100 && (obj instanceof Dialog) && (r12 = r1()) != null) {
            this.f818g0 = r12.e0().v();
        }
        if (this.f818g0 == -100 && (num = (mVar = f808w0).get(obj.getClass().getName())) != null) {
            this.f818g0 = num.intValue();
            mVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            n0(window);
        }
        androidx.appcompat.widget.l.i();
    }
}
