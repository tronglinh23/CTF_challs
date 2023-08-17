package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.l0;
import androidx.core.view.a3;
import androidx.core.view.b3;
import androidx.core.view.c3;
import androidx.core.view.u1;
import androidx.core.view.z2;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.u0;
import d.b1;
import d.o0;
import f.a;
import j.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b0 extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    public static final String N = "WindowDecorActionBar";
    public static final Interpolator O = new AccelerateInterpolator();
    public static final Interpolator P = new DecelerateInterpolator();
    public static final int Q = -1;
    public static final long R = 100;
    public static final long S = 200;
    public boolean A;
    public boolean D;
    public boolean E;
    public boolean F;
    public j.h H;
    public boolean I;
    public boolean J;

    /* renamed from: i  reason: collision with root package name */
    public Context f743i;

    /* renamed from: j  reason: collision with root package name */
    public Context f744j;

    /* renamed from: k  reason: collision with root package name */
    public Activity f745k;

    /* renamed from: l  reason: collision with root package name */
    public ActionBarOverlayLayout f746l;

    /* renamed from: m  reason: collision with root package name */
    public ActionBarContainer f747m;

    /* renamed from: n  reason: collision with root package name */
    public l0 f748n;

    /* renamed from: o  reason: collision with root package name */
    public ActionBarContextView f749o;

    /* renamed from: p  reason: collision with root package name */
    public View f750p;

    /* renamed from: q  reason: collision with root package name */
    public j1 f751q;

    /* renamed from: s  reason: collision with root package name */
    public e f753s;

    /* renamed from: u  reason: collision with root package name */
    public boolean f755u;

    /* renamed from: v  reason: collision with root package name */
    public d f756v;

    /* renamed from: w  reason: collision with root package name */
    public j.b f757w;

    /* renamed from: x  reason: collision with root package name */
    public b.a f758x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f759y;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<e> f752r = new ArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    public int f754t = -1;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<a.d> f760z = new ArrayList<>();
    public int B = 0;
    public boolean C = true;
    public boolean G = true;
    public final a3 K = new a();
    public final a3 L = new b();
    public final c3 M = new c();

    /* loaded from: classes.dex */
    public class a extends b3 {
        public a() {
        }

        @Override // androidx.core.view.b3, androidx.core.view.a3
        public void b(View view) {
            View view2;
            b0 b0Var = b0.this;
            if (b0Var.C && (view2 = b0Var.f750p) != null) {
                view2.setTranslationY(0.0f);
                b0.this.f747m.setTranslationY(0.0f);
            }
            b0.this.f747m.setVisibility(8);
            b0.this.f747m.setTransitioning(false);
            b0 b0Var2 = b0.this;
            b0Var2.H = null;
            b0Var2.H0();
            ActionBarOverlayLayout actionBarOverlayLayout = b0.this.f746l;
            if (actionBarOverlayLayout != null) {
                u1.v1(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends b3 {
        public b() {
        }

        @Override // androidx.core.view.b3, androidx.core.view.a3
        public void b(View view) {
            b0 b0Var = b0.this;
            b0Var.H = null;
            b0Var.f747m.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c implements c3 {
        public c() {
        }

        @Override // androidx.core.view.c3
        public void a(View view) {
            ((View) b0.this.f747m.getParent()).invalidate();
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class d extends j.b implements g.a {

        /* renamed from: d  reason: collision with root package name */
        public final Context f764d;

        /* renamed from: e  reason: collision with root package name */
        public final androidx.appcompat.view.menu.g f765e;

        /* renamed from: f  reason: collision with root package name */
        public b.a f766f;

        /* renamed from: g  reason: collision with root package name */
        public WeakReference<View> f767g;

        public d(Context context, b.a aVar) {
            this.f764d = context;
            this.f766f = aVar;
            androidx.appcompat.view.menu.g defaultShowAsAction = new androidx.appcompat.view.menu.g(context).setDefaultShowAsAction(1);
            this.f765e = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // j.b
        public void a() {
            b0 b0Var = b0.this;
            if (b0Var.f756v != this) {
                return;
            }
            if (b0.F0(b0Var.D, b0Var.E, false)) {
                this.f766f.c(this);
            } else {
                b0 b0Var2 = b0.this;
                b0Var2.f757w = this;
                b0Var2.f758x = this.f766f;
            }
            this.f766f = null;
            b0.this.E0(false);
            b0.this.f749o.p();
            b0 b0Var3 = b0.this;
            b0Var3.f746l.setHideOnContentScrollEnabled(b0Var3.J);
            b0.this.f756v = null;
        }

        @Override // j.b
        public View b() {
            WeakReference<View> weakReference = this.f767g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // j.b
        public Menu c() {
            return this.f765e;
        }

        @Override // j.b
        public MenuInflater d() {
            return new j.g(this.f764d);
        }

        @Override // j.b
        public CharSequence e() {
            return b0.this.f749o.getSubtitle();
        }

        @Override // j.b
        public CharSequence g() {
            return b0.this.f749o.getTitle();
        }

        @Override // j.b
        public void i() {
            if (b0.this.f756v != this) {
                return;
            }
            this.f765e.stopDispatchingItemsChanged();
            try {
                this.f766f.d(this, this.f765e);
            } finally {
                this.f765e.startDispatchingItemsChanged();
            }
        }

        @Override // j.b
        public boolean j() {
            return b0.this.f749o.s();
        }

        @Override // j.b
        public void l(View view) {
            b0.this.f749o.setCustomView(view);
            this.f767g = new WeakReference<>(view);
        }

        @Override // j.b
        public void m(int i7) {
            n(b0.this.f743i.getResources().getString(i7));
        }

        @Override // j.b
        public void n(CharSequence charSequence) {
            b0.this.f749o.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean onMenuItemSelected(@o0 androidx.appcompat.view.menu.g gVar, @o0 MenuItem menuItem) {
            b.a aVar = this.f766f;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void onMenuModeChange(@o0 androidx.appcompat.view.menu.g gVar) {
            if (this.f766f == null) {
                return;
            }
            i();
            b0.this.f749o.o();
        }

        @Override // j.b
        public void p(int i7) {
            q(b0.this.f743i.getResources().getString(i7));
        }

        @Override // j.b
        public void q(CharSequence charSequence) {
            b0.this.f749o.setTitle(charSequence);
        }

        @Override // j.b
        public void r(boolean z6) {
            super.r(z6);
            b0.this.f749o.setTitleOptional(z6);
        }

        public boolean s() {
            this.f765e.stopDispatchingItemsChanged();
            try {
                return this.f766f.b(this, this.f765e);
            } finally {
                this.f765e.startDispatchingItemsChanged();
            }
        }

        public void t(androidx.appcompat.view.menu.g gVar, boolean z6) {
        }

        public void u(androidx.appcompat.view.menu.s sVar) {
        }

        public boolean v(androidx.appcompat.view.menu.s sVar) {
            if (this.f766f == null) {
                return false;
            }
            if (sVar.hasVisibleItems()) {
                new androidx.appcompat.view.menu.m(b0.this.A(), sVar).l();
                return true;
            }
            return true;
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class e extends a.f {

        /* renamed from: b  reason: collision with root package name */
        public a.g f769b;

        /* renamed from: c  reason: collision with root package name */
        public Object f770c;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f771d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f772e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f773f;

        /* renamed from: g  reason: collision with root package name */
        public int f774g = -1;

        /* renamed from: h  reason: collision with root package name */
        public View f775h;

        public e() {
        }

        @Override // androidx.appcompat.app.a.f
        public CharSequence a() {
            return this.f773f;
        }

        @Override // androidx.appcompat.app.a.f
        public View b() {
            return this.f775h;
        }

        @Override // androidx.appcompat.app.a.f
        public Drawable c() {
            return this.f771d;
        }

        @Override // androidx.appcompat.app.a.f
        public int d() {
            return this.f774g;
        }

        @Override // androidx.appcompat.app.a.f
        public Object e() {
            return this.f770c;
        }

        @Override // androidx.appcompat.app.a.f
        public CharSequence f() {
            return this.f772e;
        }

        @Override // androidx.appcompat.app.a.f
        public void g() {
            b0.this.S(this);
        }

        @Override // androidx.appcompat.app.a.f
        public a.f h(int i7) {
            return i(b0.this.f743i.getResources().getText(i7));
        }

        @Override // androidx.appcompat.app.a.f
        public a.f i(CharSequence charSequence) {
            this.f773f = charSequence;
            int i7 = this.f774g;
            if (i7 >= 0) {
                b0.this.f751q.m(i7);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public a.f j(int i7) {
            return k(LayoutInflater.from(b0.this.A()).inflate(i7, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.a.f
        public a.f k(View view) {
            this.f775h = view;
            int i7 = this.f774g;
            if (i7 >= 0) {
                b0.this.f751q.m(i7);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public a.f l(int i7) {
            return m(g.a.b(b0.this.f743i, i7));
        }

        @Override // androidx.appcompat.app.a.f
        public a.f m(Drawable drawable) {
            this.f771d = drawable;
            int i7 = this.f774g;
            if (i7 >= 0) {
                b0.this.f751q.m(i7);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public a.f n(a.g gVar) {
            this.f769b = gVar;
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public a.f o(Object obj) {
            this.f770c = obj;
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public a.f p(int i7) {
            return q(b0.this.f743i.getResources().getText(i7));
        }

        @Override // androidx.appcompat.app.a.f
        public a.f q(CharSequence charSequence) {
            this.f772e = charSequence;
            int i7 = this.f774g;
            if (i7 >= 0) {
                b0.this.f751q.m(i7);
            }
            return this;
        }

        public a.g r() {
            return this.f769b;
        }

        public void s(int i7) {
            this.f774g = i7;
        }
    }

    public b0(Activity activity, boolean z6) {
        this.f745k = activity;
        View decorView = activity.getWindow().getDecorView();
        Q0(decorView);
        if (z6) {
            return;
        }
        this.f750p = decorView.findViewById(16908290);
    }

    public static boolean F0(boolean z6, boolean z7, boolean z8) {
        if (z8) {
            return true;
        }
        return (z6 || z7) ? false : true;
    }

    @Override // androidx.appcompat.app.a
    public Context A() {
        if (this.f744j == null) {
            TypedValue typedValue = new TypedValue();
            this.f743i.getTheme().resolveAttribute(a.b.f8890k, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                this.f744j = new ContextThemeWrapper(this.f743i, i7);
            } else {
                this.f744j = this.f743i;
            }
        }
        return this.f744j;
    }

    @Override // androidx.appcompat.app.a
    public void A0(CharSequence charSequence) {
        this.f748n.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public CharSequence B() {
        return this.f748n.getTitle();
    }

    @Override // androidx.appcompat.app.a
    public void B0(CharSequence charSequence) {
        this.f748n.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void C() {
        if (this.D) {
            return;
        }
        this.D = true;
        U0(false);
    }

    @Override // androidx.appcompat.app.a
    public void C0() {
        if (this.D) {
            this.D = false;
            U0(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public j.b D0(b.a aVar) {
        d dVar = this.f756v;
        if (dVar != null) {
            dVar.a();
        }
        this.f746l.setHideOnContentScrollEnabled(false);
        this.f749o.t();
        d dVar2 = new d(this.f749o.getContext(), aVar);
        if (dVar2.s()) {
            this.f756v = dVar2;
            dVar2.i();
            this.f749o.q(dVar2);
            E0(true);
            return dVar2;
        }
        return null;
    }

    @Override // androidx.appcompat.app.a
    public boolean E() {
        return this.f746l.u();
    }

    public void E0(boolean z6) {
        z2 M;
        z2 n7;
        if (z6) {
            T0();
        } else {
            P0();
        }
        if (!S0()) {
            if (z6) {
                this.f748n.setVisibility(4);
                this.f749o.setVisibility(0);
                return;
            }
            this.f748n.setVisibility(0);
            this.f749o.setVisibility(8);
            return;
        }
        if (z6) {
            n7 = this.f748n.M(4, 100L);
            M = this.f749o.n(0, 200L);
        } else {
            M = this.f748n.M(0, 200L);
            n7 = this.f749o.n(8, 100L);
        }
        j.h hVar = new j.h();
        hVar.d(n7, M);
        hVar.h();
    }

    @Override // androidx.appcompat.app.a
    public boolean F() {
        int r6 = r();
        return this.G && (r6 == 0 || s() < r6);
    }

    @Override // androidx.appcompat.app.a
    public boolean G() {
        l0 l0Var = this.f748n;
        return l0Var != null && l0Var.w();
    }

    public final void G0() {
        if (this.f753s != null) {
            S(null);
        }
        this.f752r.clear();
        j1 j1Var = this.f751q;
        if (j1Var != null) {
            j1Var.k();
        }
        this.f754t = -1;
    }

    @Override // androidx.appcompat.app.a
    public a.f H() {
        return new e();
    }

    public void H0() {
        b.a aVar = this.f758x;
        if (aVar != null) {
            aVar.c(this.f757w);
            this.f757w = null;
            this.f758x = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public void I(Configuration configuration) {
        R0(j.a.b(this.f743i).g());
    }

    public final void I0(a.f fVar, int i7) {
        e eVar = (e) fVar;
        if (eVar.r() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        eVar.s(i7);
        this.f752r.add(i7, eVar);
        int size = this.f752r.size();
        while (true) {
            i7++;
            if (i7 >= size) {
                return;
            }
            this.f752r.get(i7).s(i7);
        }
    }

    public void J0(boolean z6) {
        View view;
        j.h hVar = this.H;
        if (hVar != null) {
            hVar.a();
        }
        if (this.B != 0 || (!this.I && !z6)) {
            this.K.b(null);
            return;
        }
        this.f747m.setAlpha(1.0f);
        this.f747m.setTransitioning(true);
        j.h hVar2 = new j.h();
        float f7 = -this.f747m.getHeight();
        if (z6) {
            this.f747m.getLocationInWindow(new int[]{0, 0});
            f7 -= r5[1];
        }
        z2 B = u1.g(this.f747m).B(f7);
        B.x(this.M);
        hVar2.c(B);
        if (this.C && (view = this.f750p) != null) {
            hVar2.c(u1.g(view).B(f7));
        }
        hVar2.f(O);
        hVar2.e(250L);
        hVar2.g(this.K);
        this.H = hVar2;
        hVar2.h();
    }

    @Override // androidx.appcompat.app.a
    public boolean K(int i7, KeyEvent keyEvent) {
        Menu c7;
        d dVar = this.f756v;
        if (dVar == null || (c7 = dVar.c()) == null) {
            return false;
        }
        c7.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return c7.performShortcut(i7, keyEvent, 0);
    }

    public void K0(boolean z6) {
        View view;
        View view2;
        j.h hVar = this.H;
        if (hVar != null) {
            hVar.a();
        }
        this.f747m.setVisibility(0);
        if (this.B == 0 && (this.I || z6)) {
            this.f747m.setTranslationY(0.0f);
            float f7 = -this.f747m.getHeight();
            if (z6) {
                this.f747m.getLocationInWindow(new int[]{0, 0});
                f7 -= r5[1];
            }
            this.f747m.setTranslationY(f7);
            j.h hVar2 = new j.h();
            z2 B = u1.g(this.f747m).B(0.0f);
            B.x(this.M);
            hVar2.c(B);
            if (this.C && (view2 = this.f750p) != null) {
                view2.setTranslationY(f7);
                hVar2.c(u1.g(this.f750p).B(0.0f));
            }
            hVar2.f(P);
            hVar2.e(250L);
            hVar2.g(this.L);
            this.H = hVar2;
            hVar2.h();
        } else {
            this.f747m.setAlpha(1.0f);
            this.f747m.setTranslationY(0.0f);
            if (this.C && (view = this.f750p) != null) {
                view.setTranslationY(0.0f);
            }
            this.L.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f746l;
        if (actionBarOverlayLayout != null) {
            u1.v1(actionBarOverlayLayout);
        }
    }

    public final void L0() {
        if (this.f751q != null) {
            return;
        }
        j1 j1Var = new j1(this.f743i);
        if (this.A) {
            j1Var.setVisibility(0);
            this.f748n.p(j1Var);
        } else {
            if (u() == 2) {
                j1Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f746l;
                if (actionBarOverlayLayout != null) {
                    u1.v1(actionBarOverlayLayout);
                }
            } else {
                j1Var.setVisibility(8);
            }
            this.f747m.setTabContainer(j1Var);
        }
        this.f751q = j1Var;
    }

    public final l0 M0(View view) {
        if (view instanceof l0) {
            return (l0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    @Override // androidx.appcompat.app.a
    public void N() {
        G0();
    }

    public boolean N0() {
        return this.f748n.j();
    }

    @Override // androidx.appcompat.app.a
    public void O(a.d dVar) {
        this.f760z.remove(dVar);
    }

    public boolean O0() {
        return this.f748n.e();
    }

    @Override // androidx.appcompat.app.a
    public void P(a.f fVar) {
        Q(fVar.d());
    }

    public final void P0() {
        if (this.F) {
            this.F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f746l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            U0(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public void Q(int i7) {
        if (this.f751q == null) {
            return;
        }
        e eVar = this.f753s;
        int d7 = eVar != null ? eVar.d() : this.f754t;
        this.f751q.l(i7);
        e remove = this.f752r.remove(i7);
        if (remove != null) {
            remove.s(-1);
        }
        int size = this.f752r.size();
        for (int i8 = i7; i8 < size; i8++) {
            this.f752r.get(i8).s(i8);
        }
        if (d7 == i7) {
            S(this.f752r.isEmpty() ? null : this.f752r.get(Math.max(0, i7 - 1)));
        }
    }

    public final void Q0(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(a.g.f9177x);
        this.f746l = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f748n = M0(view.findViewById(a.g.f9131a));
        this.f749o = (ActionBarContextView) view.findViewById(a.g.f9145h);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(a.g.f9135c);
        this.f747m = actionBarContainer;
        l0 l0Var = this.f748n;
        if (l0Var == null || this.f749o == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f743i = l0Var.g();
        boolean z6 = (this.f748n.B() & 4) != 0;
        if (z6) {
            this.f755u = true;
        }
        j.a b7 = j.a.b(this.f743i);
        m0(b7.a() || z6);
        R0(b7.g());
        TypedArray obtainStyledAttributes = this.f743i.obtainStyledAttributes(null, a.m.f9428a, a.b.f8860f, 0);
        if (obtainStyledAttributes.getBoolean(a.m.f9547p, false)) {
            h0(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.m.f9532n, 0);
        if (dimensionPixelSize != 0) {
            f0(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.app.a
    public boolean R() {
        ViewGroup q6 = this.f748n.q();
        if (q6 == null || q6.hasFocus()) {
            return false;
        }
        q6.requestFocus();
        return true;
    }

    public final void R0(boolean z6) {
        this.A = z6;
        if (z6) {
            this.f747m.setTabContainer(null);
            this.f748n.p(this.f751q);
        } else {
            this.f748n.p(null);
            this.f747m.setTabContainer(this.f751q);
        }
        boolean z7 = u() == 2;
        j1 j1Var = this.f751q;
        if (j1Var != null) {
            if (z7) {
                j1Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f746l;
                if (actionBarOverlayLayout != null) {
                    u1.v1(actionBarOverlayLayout);
                }
            } else {
                j1Var.setVisibility(8);
            }
        }
        this.f748n.S(!this.A && z7);
        this.f746l.setHasNonEmbeddedTabs(!this.A && z7);
    }

    @Override // androidx.appcompat.app.a
    public void S(a.f fVar) {
        if (u() != 2) {
            this.f754t = fVar != null ? fVar.d() : -1;
            return;
        }
        u0 w6 = (!(this.f745k instanceof FragmentActivity) || this.f748n.q().isInEditMode()) ? null : ((FragmentActivity) this.f745k).K().u().w();
        e eVar = this.f753s;
        if (eVar != fVar) {
            this.f751q.setTabSelected(fVar != null ? fVar.d() : -1);
            e eVar2 = this.f753s;
            if (eVar2 != null) {
                eVar2.r().a(this.f753s, w6);
            }
            e eVar3 = (e) fVar;
            this.f753s = eVar3;
            if (eVar3 != null) {
                eVar3.r().c(this.f753s, w6);
            }
        } else if (eVar != null) {
            eVar.r().b(this.f753s, w6);
            this.f751q.c(fVar.d());
        }
        if (w6 == null || w6.A()) {
            return;
        }
        w6.q();
    }

    public final boolean S0() {
        return u1.U0(this.f747m);
    }

    @Override // androidx.appcompat.app.a
    public void T(Drawable drawable) {
        this.f747m.setPrimaryBackground(drawable);
    }

    public final void T0() {
        if (this.F) {
            return;
        }
        this.F = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f746l;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        U0(false);
    }

    @Override // androidx.appcompat.app.a
    public void U(int i7) {
        V(LayoutInflater.from(A()).inflate(i7, this.f748n.q(), false));
    }

    public final void U0(boolean z6) {
        if (F0(this.D, this.E, this.F)) {
            if (this.G) {
                return;
            }
            this.G = true;
            K0(z6);
        } else if (this.G) {
            this.G = false;
            J0(z6);
        }
    }

    @Override // androidx.appcompat.app.a
    public void V(View view) {
        this.f748n.K(view);
    }

    @Override // androidx.appcompat.app.a
    public void W(View view, a.b bVar) {
        view.setLayoutParams(bVar);
        this.f748n.K(view);
    }

    @Override // androidx.appcompat.app.a
    public void X(boolean z6) {
        if (this.f755u) {
            return;
        }
        Y(z6);
    }

    @Override // androidx.appcompat.app.a
    public void Y(boolean z6) {
        a0(z6 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void Z(int i7) {
        if ((i7 & 4) != 0) {
            this.f755u = true;
        }
        this.f748n.x(i7);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.E) {
            this.E = false;
            U0(true);
        }
    }

    @Override // androidx.appcompat.app.a
    public void a0(int i7, int i8) {
        int B = this.f748n.B();
        if ((i8 & 4) != 0) {
            this.f755u = true;
        }
        this.f748n.x((i7 & i8) | ((~i8) & B));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        j.h hVar = this.H;
        if (hVar != null) {
            hVar.a();
            this.H = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public void b0(boolean z6) {
        a0(z6 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(int i7) {
        this.B = i7;
    }

    @Override // androidx.appcompat.app.a
    public void c0(boolean z6) {
        a0(z6 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
    }

    @Override // androidx.appcompat.app.a
    public void d0(boolean z6) {
        a0(z6 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e(boolean z6) {
        this.C = z6;
    }

    @Override // androidx.appcompat.app.a
    public void e0(boolean z6) {
        a0(z6 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
        if (this.E) {
            return;
        }
        this.E = true;
        U0(true);
    }

    @Override // androidx.appcompat.app.a
    public void f0(float f7) {
        u1.N1(this.f747m, f7);
    }

    @Override // androidx.appcompat.app.a
    public void g(a.d dVar) {
        this.f760z.add(dVar);
    }

    @Override // androidx.appcompat.app.a
    public void g0(int i7) {
        if (i7 != 0 && !this.f746l.v()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.f746l.setActionBarHideOffset(i7);
    }

    @Override // androidx.appcompat.app.a
    public void h(a.f fVar) {
        k(fVar, this.f752r.isEmpty());
    }

    @Override // androidx.appcompat.app.a
    public void h0(boolean z6) {
        if (z6 && !this.f746l.v()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.J = z6;
        this.f746l.setHideOnContentScrollEnabled(z6);
    }

    @Override // androidx.appcompat.app.a
    public void i(a.f fVar, int i7) {
        j(fVar, i7, this.f752r.isEmpty());
    }

    @Override // androidx.appcompat.app.a
    public void i0(int i7) {
        this.f748n.H(i7);
    }

    @Override // androidx.appcompat.app.a
    public void j(a.f fVar, int i7, boolean z6) {
        L0();
        this.f751q.a(fVar, i7, z6);
        I0(fVar, i7);
        if (z6) {
            S(fVar);
        }
    }

    @Override // androidx.appcompat.app.a
    public void j0(CharSequence charSequence) {
        this.f748n.z(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void k(a.f fVar, boolean z6) {
        L0();
        this.f751q.b(fVar, z6);
        I0(fVar, this.f752r.size());
        if (z6) {
            S(fVar);
        }
    }

    @Override // androidx.appcompat.app.a
    public void k0(int i7) {
        this.f748n.T(i7);
    }

    @Override // androidx.appcompat.app.a
    public void l0(Drawable drawable) {
        this.f748n.R(drawable);
    }

    @Override // androidx.appcompat.app.a
    public boolean m() {
        l0 l0Var = this.f748n;
        if (l0Var == null || !l0Var.v()) {
            return false;
        }
        this.f748n.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void m0(boolean z6) {
        this.f748n.r(z6);
    }

    @Override // androidx.appcompat.app.a
    public void n(boolean z6) {
        if (z6 == this.f759y) {
            return;
        }
        this.f759y = z6;
        int size = this.f760z.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f760z.get(i7).a(z6);
        }
    }

    @Override // androidx.appcompat.app.a
    public void n0(int i7) {
        this.f748n.setIcon(i7);
    }

    @Override // androidx.appcompat.app.a
    public View o() {
        return this.f748n.o();
    }

    @Override // androidx.appcompat.app.a
    public void o0(Drawable drawable) {
        this.f748n.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public int p() {
        return this.f748n.B();
    }

    @Override // androidx.appcompat.app.a
    public void p0(SpinnerAdapter spinnerAdapter, a.e eVar) {
        this.f748n.t(spinnerAdapter, new w(eVar));
    }

    @Override // androidx.appcompat.app.a
    public float q() {
        return u1.R(this.f747m);
    }

    @Override // androidx.appcompat.app.a
    public void q0(int i7) {
        this.f748n.setLogo(i7);
    }

    @Override // androidx.appcompat.app.a
    public int r() {
        return this.f747m.getHeight();
    }

    @Override // androidx.appcompat.app.a
    public void r0(Drawable drawable) {
        this.f748n.s(drawable);
    }

    @Override // androidx.appcompat.app.a
    public int s() {
        return this.f746l.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.a
    public void s0(int i7) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int J = this.f748n.J();
        if (J == 2) {
            this.f754t = v();
            S(null);
            this.f751q.setVisibility(8);
        }
        if (J != i7 && !this.A && (actionBarOverlayLayout = this.f746l) != null) {
            u1.v1(actionBarOverlayLayout);
        }
        this.f748n.N(i7);
        boolean z6 = false;
        if (i7 == 2) {
            L0();
            this.f751q.setVisibility(0);
            int i8 = this.f754t;
            if (i8 != -1) {
                t0(i8);
                this.f754t = -1;
            }
        }
        this.f748n.S(i7 == 2 && !this.A);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f746l;
        if (i7 == 2 && !this.A) {
            z6 = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z6);
    }

    @Override // androidx.appcompat.app.a
    public int t() {
        int J = this.f748n.J();
        if (J != 1) {
            if (J != 2) {
                return 0;
            }
            return this.f752r.size();
        }
        return this.f748n.P();
    }

    @Override // androidx.appcompat.app.a
    public void t0(int i7) {
        int J = this.f748n.J();
        if (J == 1) {
            this.f748n.F(i7);
        } else if (J != 2) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        } else {
            S(this.f752r.get(i7));
        }
    }

    @Override // androidx.appcompat.app.a
    public int u() {
        return this.f748n.J();
    }

    @Override // androidx.appcompat.app.a
    public void u0(boolean z6) {
        j.h hVar;
        this.I = z6;
        if (z6 || (hVar = this.H) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public int v() {
        e eVar;
        int J = this.f748n.J();
        if (J != 1) {
            if (J == 2 && (eVar = this.f753s) != null) {
                return eVar.d();
            }
            return -1;
        }
        return this.f748n.C();
    }

    @Override // androidx.appcompat.app.a
    public void v0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.a
    public a.f w() {
        return this.f753s;
    }

    @Override // androidx.appcompat.app.a
    public void w0(Drawable drawable) {
        this.f747m.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public CharSequence x() {
        return this.f748n.y();
    }

    @Override // androidx.appcompat.app.a
    public void x0(int i7) {
        y0(this.f743i.getString(i7));
    }

    @Override // androidx.appcompat.app.a
    public a.f y(int i7) {
        return this.f752r.get(i7);
    }

    @Override // androidx.appcompat.app.a
    public void y0(CharSequence charSequence) {
        this.f748n.A(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public int z() {
        return this.f752r.size();
    }

    @Override // androidx.appcompat.app.a
    public void z0(int i7) {
        A0(this.f743i.getString(i7));
    }

    public b0(Dialog dialog) {
        Q0(dialog.getWindow().getDecorView());
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public b0(View view) {
        Q0(view);
    }
}
