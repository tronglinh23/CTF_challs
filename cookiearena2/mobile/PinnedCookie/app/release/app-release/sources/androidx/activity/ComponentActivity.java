package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.view.a1;
import androidx.core.view.u0;
import androidx.core.view.x0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c1;
import androidx.lifecycle.e1;
import androidx.lifecycle.f1;
import androidx.lifecycle.g1;
import androidx.lifecycle.i1;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.z;
import androidx.savedstate.a;
import c.a;
import c.b;
import d.j0;
import d.l0;
import d.o0;
import d.w0;
import i0.n3;
import i0.t2;
import i0.u2;
import i0.v2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k0.q0;
import k0.r0;
import z0.a;
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements a.a, z, f1, androidx.lifecycle.o, e3.d, t, androidx.activity.result.k, androidx.activity.result.c, q0, r0, u2, t2, v2, u0 {

    /* renamed from: u  reason: collision with root package name */
    public static final String f486u = "android:support:activity-result";

    /* renamed from: d  reason: collision with root package name */
    public final a.b f487d;

    /* renamed from: e  reason: collision with root package name */
    public final x0 f488e;

    /* renamed from: f  reason: collision with root package name */
    public final b0 f489f;

    /* renamed from: g  reason: collision with root package name */
    public final e3.c f490g;

    /* renamed from: h  reason: collision with root package name */
    public e1 f491h;

    /* renamed from: i  reason: collision with root package name */
    public c1.b f492i;

    /* renamed from: j  reason: collision with root package name */
    public final OnBackPressedDispatcher f493j;
    @j0

    /* renamed from: k  reason: collision with root package name */
    public int f494k;

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f495l;

    /* renamed from: m  reason: collision with root package name */
    public final ActivityResultRegistry f496m;

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList<g1.e<Configuration>> f497n;

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList<g1.e<Integer>> f498o;

    /* renamed from: p  reason: collision with root package name */
    public final CopyOnWriteArrayList<g1.e<Intent>> f499p;

    /* renamed from: q  reason: collision with root package name */
    public final CopyOnWriteArrayList<g1.e<i0.w>> f500q;

    /* renamed from: r  reason: collision with root package name */
    public final CopyOnWriteArrayList<g1.e<n3>> f501r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f502s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f503t;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e7) {
                if (!TextUtils.equals(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e7;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActivityResultRegistry {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ int f509k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ a.C0084a f510l;

            public a(int i7, a.C0084a c0084a) {
                this.f509k = i7;
                this.f510l = c0084a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f509k, this.f510l.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0013b implements Runnable {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ int f512k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f513l;

            public RunnableC0013b(int i7, IntentSender.SendIntentException sendIntentException) {
                this.f512k = i7;
                this.f513l = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f512k, 0, new Intent().setAction(b.n.f7292b).putExtra(b.n.f7294d, this.f513l));
            }
        }

        public b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i7, @o0 c.a<I, O> aVar, I i8, @d.q0 i0.i iVar) {
            Bundle l7;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0084a<O> b7 = aVar.b(componentActivity, i8);
            if (b7 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i7, b7));
                return;
            }
            Intent a7 = aVar.a(componentActivity, i8);
            if (a7.getExtras() != null && a7.getExtras().getClassLoader() == null) {
                a7.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a7.hasExtra(b.m.f7290b)) {
                Bundle bundleExtra = a7.getBundleExtra(b.m.f7290b);
                a7.removeExtra(b.m.f7290b);
                l7 = bundleExtra;
            } else {
                l7 = iVar != null ? iVar.l() : null;
            }
            if (b.k.f7286b.equals(a7.getAction())) {
                String[] stringArrayExtra = a7.getStringArrayExtra(b.k.f7287c);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                i0.b.J(componentActivity, stringArrayExtra, i7);
            } else if (!b.n.f7292b.equals(a7.getAction())) {
                i0.b.Q(componentActivity, a7, i7, l7);
            } else {
                androidx.activity.result.l lVar = (androidx.activity.result.l) a7.getParcelableExtra(b.n.f7293c);
                try {
                    i0.b.R(componentActivity, lVar.d(), i7, lVar.a(), lVar.b(), lVar.c(), 0, l7);
                } catch (IntentSender.SendIntentException e7) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0013b(i7, e7));
                }
            }
        }
    }

    @w0(19)
    /* loaded from: classes.dex */
    public static class c {
        public static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    @w0(33)
    /* loaded from: classes.dex */
    public static class d {
        @d.u
        public static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public Object f515a;

        /* renamed from: b  reason: collision with root package name */
        public e1 f516b;
    }

    public ComponentActivity() {
        this.f487d = new a.b();
        this.f488e = new x0(new Runnable() { // from class: androidx.activity.e
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.invalidateMenu();
            }
        });
        this.f489f = new b0(this);
        e3.c a7 = e3.c.a(this);
        this.f490g = a7;
        this.f493j = new OnBackPressedDispatcher(new a());
        this.f495l = new AtomicInteger();
        this.f496m = new b();
        this.f497n = new CopyOnWriteArrayList<>();
        this.f498o = new CopyOnWriteArrayList<>();
        this.f499p = new CopyOnWriteArrayList<>();
        this.f500q = new CopyOnWriteArrayList<>();
        this.f501r = new CopyOnWriteArrayList<>();
        this.f502s = false;
        this.f503t = false;
        if (getLifecycle() != null) {
            getLifecycle().a(new androidx.lifecycle.v() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.v
                public void d(@o0 z zVar, @o0 p.a aVar) {
                    if (aVar == p.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            c.a(peekDecorView);
                        }
                    }
                }
            });
            getLifecycle().a(new androidx.lifecycle.v() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.v
                public void d(@o0 z zVar, @o0 p.a aVar) {
                    if (aVar == p.a.ON_DESTROY) {
                        ComponentActivity.this.f487d.b();
                        if (ComponentActivity.this.isChangingConfigurations()) {
                            return;
                        }
                        ComponentActivity.this.getViewModelStore().a();
                    }
                }
            });
            getLifecycle().a(new androidx.lifecycle.v() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.v
                public void d(@o0 z zVar, @o0 p.a aVar) {
                    ComponentActivity.this.z();
                    ComponentActivity.this.getLifecycle().d(this);
                }
            });
            a7.c();
            s0.c(this);
            getSavedStateRegistry().j(f486u, new a.c() { // from class: androidx.activity.f
                @Override // androidx.savedstate.a.c
                public final Bundle a() {
                    Bundle C;
                    C = ComponentActivity.this.C();
                    return C;
                }
            });
            c(new a.d() { // from class: androidx.activity.g
                @Override // a.d
                public final void a(Context context) {
                    ComponentActivity.this.D(context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void B() {
        g1.b(getWindow().getDecorView(), this);
        i1.b(getWindow().getDecorView(), this);
        e3.f.b(getWindow().getDecorView(), this);
        y.b(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle C() {
        Bundle bundle = new Bundle();
        this.f496m.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Context context) {
        Bundle b7 = getSavedStateRegistry().b(f486u);
        if (b7 != null) {
            this.f496m.g(b7);
        }
    }

    @d.q0
    @Deprecated
    public Object A() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f515a;
        }
        return null;
    }

    @d.q0
    @Deprecated
    public Object E() {
        return null;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        B();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.u0
    public void addMenuProvider(@o0 a1 a1Var) {
        this.f488e.c(a1Var);
    }

    @Override // k0.q0
    public final void b(@o0 g1.e<Configuration> eVar) {
        this.f497n.add(eVar);
    }

    @Override // a.a
    public final void c(@o0 a.d dVar) {
        this.f487d.a(dVar);
    }

    @Override // k0.q0
    public final void d(@o0 g1.e<Configuration> eVar) {
        this.f497n.remove(eVar);
    }

    @Override // i0.v2
    public final void f(@o0 g1.e<n3> eVar) {
        this.f501r.remove(eVar);
    }

    @Override // androidx.lifecycle.o
    @d.i
    @o0
    public k2.a getDefaultViewModelCreationExtras() {
        k2.e eVar = new k2.e();
        if (getApplication() != null) {
            eVar.c(c1.a.f4720i, getApplication());
        }
        eVar.c(s0.f4832c, this);
        eVar.c(s0.f4833d, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            eVar.c(s0.f4834e, getIntent().getExtras());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.o
    @o0
    public c1.b getDefaultViewModelProviderFactory() {
        if (this.f492i == null) {
            this.f492i = new v0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f492i;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.z
    @o0
    public androidx.lifecycle.p getLifecycle() {
        return this.f489f;
    }

    @Override // androidx.activity.t
    @o0
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f493j;
    }

    @Override // e3.d
    @o0
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.f490g.b();
    }

    @Override // androidx.lifecycle.f1
    @o0
    public e1 getViewModelStore() {
        if (getApplication() != null) {
            z();
            return this.f491h;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // i0.t2
    public final void h(@o0 g1.e<i0.w> eVar) {
        this.f500q.add(eVar);
    }

    @Override // i0.v2
    public final void i(@o0 g1.e<n3> eVar) {
        this.f501r.add(eVar);
    }

    @Override // androidx.core.view.u0
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // i0.u2
    public final void j(@o0 g1.e<Intent> eVar) {
        this.f499p.add(eVar);
    }

    @Override // a.a
    public final void k(@o0 a.d dVar) {
        this.f487d.e(dVar);
    }

    @Override // a.a
    @d.q0
    public Context l() {
        return this.f487d.d();
    }

    @Override // i0.u2
    public final void m(@o0 g1.e<Intent> eVar) {
        this.f499p.remove(eVar);
    }

    @Override // k0.r0
    public final void n(@o0 g1.e<Integer> eVar) {
        this.f498o.add(eVar);
    }

    @Override // androidx.activity.result.k
    @o0
    public final ActivityResultRegistry o() {
        return this.f496m;
    }

    @Override // android.app.Activity
    @d.i
    @Deprecated
    public void onActivityResult(int i7, int i8, @d.q0 Intent intent) {
        if (this.f496m.b(i7, i8, intent)) {
            return;
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    @l0
    public void onBackPressed() {
        this.f493j.g();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @d.i
    public void onConfigurationChanged(@o0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<g1.e<Configuration>> it = this.f497n.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @d.s0(markerClass = {a.b.class})
    public void onCreate(@d.q0 Bundle bundle) {
        this.f490g.d(bundle);
        this.f487d.c(this);
        super.onCreate(bundle);
        p0.g(this);
        if (z0.a.k()) {
            this.f493j.h(d.a(this));
        }
        int i7 = this.f494k;
        if (i7 != 0) {
            setContentView(i7);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, @o0 Menu menu) {
        if (i7 == 0) {
            super.onCreatePanelMenu(i7, menu);
            this.f488e.h(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, @o0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 0) {
            return this.f488e.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @d.i
    public void onMultiWindowModeChanged(boolean z6) {
        if (this.f502s) {
            return;
        }
        Iterator<g1.e<i0.w>> it = this.f500q.iterator();
        while (it.hasNext()) {
            it.next().accept(new i0.w(z6));
        }
    }

    @Override // android.app.Activity
    @d.i
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<g1.e<Intent>> it = this.f499p.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, @o0 Menu menu) {
        this.f488e.i(menu);
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    @d.i
    public void onPictureInPictureModeChanged(boolean z6) {
        if (this.f503t) {
            return;
        }
        Iterator<g1.e<n3>> it = this.f501r.iterator();
        while (it.hasNext()) {
            it.next().accept(new n3(z6));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i7, @d.q0 View view, @o0 Menu menu) {
        if (i7 == 0) {
            super.onPreparePanel(i7, view, menu);
            this.f488e.k(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @d.i
    @Deprecated
    public void onRequestPermissionsResult(int i7, @o0 String[] strArr, @o0 int[] iArr) {
        if (this.f496m.b(i7, -1, new Intent().putExtra(b.k.f7287c, strArr).putExtra(b.k.f7288d, iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    @d.q0
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object E = E();
        e1 e1Var = this.f491h;
        if (e1Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            e1Var = eVar.f516b;
        }
        if (e1Var == null && E == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f515a = E;
        eVar2.f516b = e1Var;
        return eVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @d.i
    public void onSaveInstanceState(@o0 Bundle bundle) {
        androidx.lifecycle.p lifecycle = getLifecycle();
        if (lifecycle instanceof b0) {
            ((b0) lifecycle).s(p.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f490g.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @d.i
    public void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator<g1.e<Integer>> it = this.f498o.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i7));
        }
    }

    @Override // i0.t2
    public final void p(@o0 g1.e<i0.w> eVar) {
        this.f500q.remove(eVar);
    }

    @Override // k0.r0
    public final void r(@o0 g1.e<Integer> eVar) {
        this.f498o.remove(eVar);
    }

    @Override // androidx.activity.result.c
    @o0
    public final <I, O> androidx.activity.result.i<I> registerForActivityResult(@o0 c.a<I, O> aVar, @o0 ActivityResultRegistry activityResultRegistry, @o0 androidx.activity.result.b<O> bVar) {
        return activityResultRegistry.i("activity_rq#" + this.f495l.getAndIncrement(), this, aVar, bVar);
    }

    @Override // androidx.core.view.u0
    public void removeMenuProvider(@o0 a1 a1Var) {
        this.f488e.l(a1Var);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (j3.b.h()) {
                j3.b.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            j3.b.f();
        }
    }

    @Override // android.app.Activity
    public void setContentView(@j0 int i7) {
        B();
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@o0 Intent intent, int i7) {
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@o0 IntentSender intentSender, int i7, @d.q0 Intent intent, int i8, int i9, int i10) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10);
    }

    public void z() {
        if (this.f491h == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f491h = eVar.f516b;
            }
            if (this.f491h == null) {
                this.f491h = new e1();
            }
        }
    }

    @Override // androidx.core.view.u0
    public void addMenuProvider(@o0 a1 a1Var, @o0 z zVar) {
        this.f488e.d(a1Var, zVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@o0 Intent intent, int i7, @d.q0 Bundle bundle) {
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@o0 IntentSender intentSender, int i7, @d.q0 Intent intent, int i8, int i9, int i10, @d.q0 Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }

    @Override // androidx.core.view.u0
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@o0 a1 a1Var, @o0 z zVar, @o0 p.b bVar) {
        this.f488e.e(a1Var, zVar, bVar);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        B();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    @d.i
    @w0(api = 26)
    public void onMultiWindowModeChanged(boolean z6, @o0 Configuration configuration) {
        this.f502s = true;
        try {
            super.onMultiWindowModeChanged(z6, configuration);
            this.f502s = false;
            Iterator<g1.e<i0.w>> it = this.f500q.iterator();
            while (it.hasNext()) {
                it.next().accept(new i0.w(z6, configuration));
            }
        } catch (Throwable th) {
            this.f502s = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @d.i
    @w0(api = 26)
    public void onPictureInPictureModeChanged(boolean z6, @o0 Configuration configuration) {
        this.f503t = true;
        try {
            super.onPictureInPictureModeChanged(z6, configuration);
            this.f503t = false;
            Iterator<g1.e<n3>> it = this.f501r.iterator();
            while (it.hasNext()) {
                it.next().accept(new n3(z6, configuration));
            }
        } catch (Throwable th) {
            this.f503t = false;
            throw th;
        }
    }

    @Override // androidx.activity.result.c
    @o0
    public final <I, O> androidx.activity.result.i<I> registerForActivityResult(@o0 c.a<I, O> aVar, @o0 androidx.activity.result.b<O> bVar) {
        return registerForActivityResult(aVar, this.f496m, bVar);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        B();
        super.setContentView(view, layoutParams);
    }

    @d.o
    public ComponentActivity(@j0 int i7) {
        this();
        this.f494k = i7;
    }
}
