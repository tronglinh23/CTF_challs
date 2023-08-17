package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.a;
import androidx.appcompat.app.l;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.x1;
import androidx.core.view.u1;
import d.o0;
import d.q0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class y extends androidx.appcompat.app.a {

    /* renamed from: i  reason: collision with root package name */
    public final l0 f917i;

    /* renamed from: j  reason: collision with root package name */
    public final Window.Callback f918j;

    /* renamed from: k  reason: collision with root package name */
    public final l.i f919k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f920l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f921m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f922n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<a.d> f923o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public final Runnable f924p = new a();

    /* renamed from: q  reason: collision with root package name */
    public final Toolbar.h f925q;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.F0();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Toolbar.h {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return y.this.f918j.onMenuItemSelected(0, menuItem);
        }
    }

    /* loaded from: classes.dex */
    public final class c implements n.a {

        /* renamed from: b  reason: collision with root package name */
        public boolean f928b;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean a(@o0 androidx.appcompat.view.menu.g gVar) {
            y.this.f918j.onMenuOpened(h.f805t, gVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void onCloseMenu(@o0 androidx.appcompat.view.menu.g gVar, boolean z6) {
            if (this.f928b) {
                return;
            }
            this.f928b = true;
            y.this.f917i.m();
            y.this.f918j.onPanelClosed(h.f805t, gVar);
            this.f928b = false;
        }
    }

    /* loaded from: classes.dex */
    public final class d implements g.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean onMenuItemSelected(@o0 androidx.appcompat.view.menu.g gVar, @o0 MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void onMenuModeChange(@o0 androidx.appcompat.view.menu.g gVar) {
            if (y.this.f917i.c()) {
                y.this.f918j.onPanelClosed(h.f805t, gVar);
            } else if (y.this.f918j.onPreparePanel(0, null, gVar)) {
                y.this.f918j.onMenuOpened(h.f805t, gVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements l.i {
        public e() {
        }

        @Override // androidx.appcompat.app.l.i
        public boolean a(int i7) {
            if (i7 == 0) {
                y yVar = y.this;
                if (yVar.f920l) {
                    return false;
                }
                yVar.f917i.d();
                y.this.f920l = true;
                return false;
            }
            return false;
        }

        @Override // androidx.appcompat.app.l.i
        public View onCreatePanelView(int i7) {
            if (i7 == 0) {
                return new View(y.this.f917i.g());
            }
            return null;
        }
    }

    public y(@o0 Toolbar toolbar, @q0 CharSequence charSequence, @o0 Window.Callback callback) {
        b bVar = new b();
        this.f925q = bVar;
        g1.s.l(toolbar);
        x1 x1Var = new x1(toolbar, false);
        this.f917i = x1Var;
        this.f918j = (Window.Callback) g1.s.l(callback);
        x1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        x1Var.setWindowTitle(charSequence);
        this.f919k = new e();
    }

    @Override // androidx.appcompat.app.a
    public Context A() {
        return this.f917i.g();
    }

    @Override // androidx.appcompat.app.a
    public void A0(CharSequence charSequence) {
        this.f917i.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public CharSequence B() {
        return this.f917i.getTitle();
    }

    @Override // androidx.appcompat.app.a
    public void B0(CharSequence charSequence) {
        this.f917i.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void C() {
        this.f917i.setVisibility(8);
    }

    @Override // androidx.appcompat.app.a
    public void C0() {
        this.f917i.setVisibility(0);
    }

    @Override // androidx.appcompat.app.a
    public boolean D() {
        this.f917i.q().removeCallbacks(this.f924p);
        u1.p1(this.f917i.q(), this.f924p);
        return true;
    }

    public final Menu E0() {
        if (!this.f921m) {
            this.f917i.n(new c(), new d());
            this.f921m = true;
        }
        return this.f917i.G();
    }

    @Override // androidx.appcompat.app.a
    public boolean F() {
        return this.f917i.b() == 0;
    }

    public void F0() {
        Menu E0 = E0();
        androidx.appcompat.view.menu.g gVar = E0 instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) E0 : null;
        if (gVar != null) {
            gVar.stopDispatchingItemsChanged();
        }
        try {
            E0.clear();
            if (!this.f918j.onCreatePanelMenu(0, E0) || !this.f918j.onPreparePanel(0, null, E0)) {
                E0.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.startDispatchingItemsChanged();
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean G() {
        return super.G();
    }

    @Override // androidx.appcompat.app.a
    public a.f H() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void I(Configuration configuration) {
        super.I(configuration);
    }

    @Override // androidx.appcompat.app.a
    public void J() {
        this.f917i.q().removeCallbacks(this.f924p);
    }

    @Override // androidx.appcompat.app.a
    public boolean K(int i7, KeyEvent keyEvent) {
        Menu E0 = E0();
        if (E0 != null) {
            E0.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return E0.performShortcut(i7, keyEvent, 0);
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public boolean L(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            M();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean M() {
        return this.f917i.i();
    }

    @Override // androidx.appcompat.app.a
    public void N() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void O(a.d dVar) {
        this.f923o.remove(dVar);
    }

    @Override // androidx.appcompat.app.a
    public void P(a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void Q(int i7) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public boolean R() {
        ViewGroup q6 = this.f917i.q();
        if (q6 == null || q6.hasFocus()) {
            return false;
        }
        q6.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void S(a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void T(@q0 Drawable drawable) {
        this.f917i.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void U(int i7) {
        V(LayoutInflater.from(this.f917i.g()).inflate(i7, this.f917i.q(), false));
    }

    @Override // androidx.appcompat.app.a
    public void V(View view) {
        W(view, new a.b(-2, -2));
    }

    @Override // androidx.appcompat.app.a
    public void W(View view, a.b bVar) {
        if (view != null) {
            view.setLayoutParams(bVar);
        }
        this.f917i.K(view);
    }

    @Override // androidx.appcompat.app.a
    public void X(boolean z6) {
    }

    @Override // androidx.appcompat.app.a
    public void Y(boolean z6) {
        a0(z6 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    @SuppressLint({"WrongConstant"})
    public void Z(int i7) {
        a0(i7, -1);
    }

    @Override // androidx.appcompat.app.a
    public void a0(int i7, int i8) {
        this.f917i.x((i7 & i8) | ((~i8) & this.f917i.B()));
    }

    @Override // androidx.appcompat.app.a
    public void b0(boolean z6) {
        a0(z6 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void c0(boolean z6) {
        a0(z6 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void d0(boolean z6) {
        a0(z6 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void e0(boolean z6) {
        a0(z6 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.a
    public void f0(float f7) {
        u1.N1(this.f917i.q(), f7);
    }

    @Override // androidx.appcompat.app.a
    public void g(a.d dVar) {
        this.f923o.add(dVar);
    }

    @Override // androidx.appcompat.app.a
    public void h(a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void i(a.f fVar, int i7) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void i0(int i7) {
        this.f917i.H(i7);
    }

    @Override // androidx.appcompat.app.a
    public void j(a.f fVar, int i7, boolean z6) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void j0(CharSequence charSequence) {
        this.f917i.z(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void k(a.f fVar, boolean z6) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void k0(int i7) {
        this.f917i.T(i7);
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        return this.f917i.h();
    }

    @Override // androidx.appcompat.app.a
    public void l0(Drawable drawable) {
        this.f917i.R(drawable);
    }

    @Override // androidx.appcompat.app.a
    public boolean m() {
        if (this.f917i.v()) {
            this.f917i.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public void m0(boolean z6) {
    }

    @Override // androidx.appcompat.app.a
    public void n(boolean z6) {
        if (z6 == this.f922n) {
            return;
        }
        this.f922n = z6;
        int size = this.f923o.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f923o.get(i7).a(z6);
        }
    }

    @Override // androidx.appcompat.app.a
    public void n0(int i7) {
        this.f917i.setIcon(i7);
    }

    @Override // androidx.appcompat.app.a
    public View o() {
        return this.f917i.o();
    }

    @Override // androidx.appcompat.app.a
    public void o0(Drawable drawable) {
        this.f917i.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public int p() {
        return this.f917i.B();
    }

    @Override // androidx.appcompat.app.a
    public void p0(SpinnerAdapter spinnerAdapter, a.e eVar) {
        this.f917i.t(spinnerAdapter, new w(eVar));
    }

    @Override // androidx.appcompat.app.a
    public float q() {
        return u1.R(this.f917i.q());
    }

    @Override // androidx.appcompat.app.a
    public void q0(int i7) {
        this.f917i.setLogo(i7);
    }

    @Override // androidx.appcompat.app.a
    public int r() {
        return this.f917i.getHeight();
    }

    @Override // androidx.appcompat.app.a
    public void r0(Drawable drawable) {
        this.f917i.s(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void s0(int i7) {
        if (i7 == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.f917i.N(i7);
    }

    @Override // androidx.appcompat.app.a
    public int t() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public void t0(int i7) {
        if (this.f917i.J() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.f917i.F(i7);
    }

    @Override // androidx.appcompat.app.a
    public int u() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public void u0(boolean z6) {
    }

    @Override // androidx.appcompat.app.a
    public int v() {
        return -1;
    }

    @Override // androidx.appcompat.app.a
    public void v0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.a
    public a.f w() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void w0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.a
    public CharSequence x() {
        return this.f917i.y();
    }

    @Override // androidx.appcompat.app.a
    public void x0(int i7) {
        l0 l0Var = this.f917i;
        l0Var.A(i7 != 0 ? l0Var.g().getText(i7) : null);
    }

    @Override // androidx.appcompat.app.a
    public a.f y(int i7) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void y0(CharSequence charSequence) {
        this.f917i.A(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public int z() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public void z0(int i7) {
        l0 l0Var = this.f917i;
        l0Var.setTitle(i7 != 0 ? l0Var.g().getText(i7) : null);
    }
}
