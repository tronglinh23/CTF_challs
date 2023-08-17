package j;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.widget.ActionBarContextView;
import d.b1;
import d.o0;
import j.b;
import java.lang.ref.WeakReference;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e extends b implements g.a {

    /* renamed from: d  reason: collision with root package name */
    public Context f11314d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContextView f11315e;

    /* renamed from: f  reason: collision with root package name */
    public b.a f11316f;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<View> f11317g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11318h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11319i;

    /* renamed from: j  reason: collision with root package name */
    public androidx.appcompat.view.menu.g f11320j;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z6) {
        this.f11314d = context;
        this.f11315e = actionBarContextView;
        this.f11316f = aVar;
        androidx.appcompat.view.menu.g defaultShowAsAction = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f11320j = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.f11319i = z6;
    }

    @Override // j.b
    public void a() {
        if (this.f11318h) {
            return;
        }
        this.f11318h = true;
        this.f11316f.c(this);
    }

    @Override // j.b
    public View b() {
        WeakReference<View> weakReference = this.f11317g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // j.b
    public Menu c() {
        return this.f11320j;
    }

    @Override // j.b
    public MenuInflater d() {
        return new g(this.f11315e.getContext());
    }

    @Override // j.b
    public CharSequence e() {
        return this.f11315e.getSubtitle();
    }

    @Override // j.b
    public CharSequence g() {
        return this.f11315e.getTitle();
    }

    @Override // j.b
    public void i() {
        this.f11316f.d(this, this.f11320j);
    }

    @Override // j.b
    public boolean j() {
        return this.f11315e.s();
    }

    @Override // j.b
    public boolean k() {
        return this.f11319i;
    }

    @Override // j.b
    public void l(View view) {
        this.f11315e.setCustomView(view);
        this.f11317g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // j.b
    public void m(int i7) {
        n(this.f11314d.getString(i7));
    }

    @Override // j.b
    public void n(CharSequence charSequence) {
        this.f11315e.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean onMenuItemSelected(@o0 androidx.appcompat.view.menu.g gVar, @o0 MenuItem menuItem) {
        return this.f11316f.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void onMenuModeChange(@o0 androidx.appcompat.view.menu.g gVar) {
        i();
        this.f11315e.o();
    }

    @Override // j.b
    public void p(int i7) {
        q(this.f11314d.getString(i7));
    }

    @Override // j.b
    public void q(CharSequence charSequence) {
        this.f11315e.setTitle(charSequence);
    }

    @Override // j.b
    public void r(boolean z6) {
        super.r(z6);
        this.f11315e.setTitleOptional(z6);
    }

    public void s(androidx.appcompat.view.menu.g gVar, boolean z6) {
    }

    public void t(s sVar) {
    }

    public boolean u(s sVar) {
        if (sVar.hasVisibleItems()) {
            new m(this.f11315e.getContext(), sVar).l();
            return true;
        }
        return true;
    }
}
