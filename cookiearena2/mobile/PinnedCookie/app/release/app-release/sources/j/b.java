package j;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import d.b1;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: b  reason: collision with root package name */
    public Object f11306b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11307c;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(b bVar, MenuItem menuItem);

        boolean b(b bVar, Menu menu);

        void c(b bVar);

        boolean d(b bVar, Menu menu);
    }

    public abstract void a();

    public abstract View b();

    public abstract Menu c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public Object f() {
        return this.f11306b;
    }

    public abstract CharSequence g();

    public boolean h() {
        return this.f11307c;
    }

    public abstract void i();

    public boolean j() {
        return false;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean k() {
        return true;
    }

    public abstract void l(View view);

    public abstract void m(int i7);

    public abstract void n(CharSequence charSequence);

    public void o(Object obj) {
        this.f11306b = obj;
    }

    public abstract void p(int i7);

    public abstract void q(CharSequence charSequence);

    public void r(boolean z6) {
        this.f11307c = z6;
    }
}
