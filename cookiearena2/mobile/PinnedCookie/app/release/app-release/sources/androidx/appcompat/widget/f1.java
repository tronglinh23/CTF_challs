package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.g;
import d.b1;
import f.a;
/* loaded from: classes.dex */
public class f1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1589a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.appcompat.view.menu.g f1590b;

    /* renamed from: c  reason: collision with root package name */
    public final View f1591c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.appcompat.view.menu.m f1592d;

    /* renamed from: e  reason: collision with root package name */
    public e f1593e;

    /* renamed from: f  reason: collision with root package name */
    public d f1594f;

    /* renamed from: g  reason: collision with root package name */
    public View.OnTouchListener f1595g;

    /* loaded from: classes.dex */
    public class a implements g.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean onMenuItemSelected(@d.o0 androidx.appcompat.view.menu.g gVar, @d.o0 MenuItem menuItem) {
            e eVar = f1.this.f1593e;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void onMenuModeChange(@d.o0 androidx.appcompat.view.menu.g gVar) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            f1 f1Var = f1.this;
            d dVar = f1Var.f1594f;
            if (dVar != null) {
                dVar.a(f1Var);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends x0 {
        public c(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.x0
        public androidx.appcompat.view.menu.q b() {
            return f1.this.f1592d.e();
        }

        @Override // androidx.appcompat.widget.x0
        public boolean c() {
            f1.this.l();
            return true;
        }

        @Override // androidx.appcompat.widget.x0
        public boolean d() {
            f1.this.a();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(f1 f1Var);
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public f1(@d.o0 Context context, @d.o0 View view) {
        this(context, view, 0);
    }

    public void a() {
        this.f1592d.dismiss();
    }

    @d.o0
    public View.OnTouchListener b() {
        if (this.f1595g == null) {
            this.f1595g = new c(this.f1591c);
        }
        return this.f1595g;
    }

    public int c() {
        return this.f1592d.c();
    }

    @d.o0
    public Menu d() {
        return this.f1590b;
    }

    @d.o0
    public MenuInflater e() {
        return new j.g(this.f1589a);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public ListView f() {
        if (this.f1592d.f()) {
            return this.f1592d.d();
        }
        return null;
    }

    public void g(@d.m0 int i7) {
        e().inflate(i7, this.f1590b);
    }

    public void h(boolean z6) {
        this.f1592d.i(z6);
    }

    public void i(int i7) {
        this.f1592d.j(i7);
    }

    public void j(@d.q0 d dVar) {
        this.f1594f = dVar;
    }

    public void k(@d.q0 e eVar) {
        this.f1593e = eVar;
    }

    public void l() {
        this.f1592d.l();
    }

    public f1(@d.o0 Context context, @d.o0 View view, int i7) {
        this(context, view, i7, a.b.f8971z2, 0);
    }

    public f1(@d.o0 Context context, @d.o0 View view, int i7, @d.f int i8, @d.g1 int i9) {
        this.f1589a = context;
        this.f1591c = view;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        this.f1590b = gVar;
        gVar.setCallback(new a());
        androidx.appcompat.view.menu.m mVar = new androidx.appcompat.view.menu.m(context, gVar, view, false, i8, i9);
        this.f1592d = mVar;
        mVar.j(i7);
        mVar.k(new b());
    }
}
