package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d.b1;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: d  reason: collision with root package name */
    public static final String f3523d = "ActionProvider(support)";

    /* renamed from: a  reason: collision with root package name */
    public final Context f3524a;

    /* renamed from: b  reason: collision with root package name */
    public a f3525b;

    /* renamed from: c  reason: collision with root package name */
    public InterfaceC0035b f3526c;

    @d.b1({b1.a.f8135m})
    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z6);
    }

    /* renamed from: androidx.core.view.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0035b {
        void onActionProviderVisibilityChanged(boolean z6);
    }

    public b(@d.o0 Context context) {
        this.f3524a = context;
    }

    @d.o0
    public Context a() {
        return this.f3524a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    @d.o0
    public abstract View d();

    @d.o0
    public View e(@d.o0 MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public void g(@d.o0 SubMenu subMenu) {
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if (this.f3526c == null || !h()) {
            return;
        }
        this.f3526c.onActionProviderVisibilityChanged(c());
    }

    @d.b1({b1.a.f8135m})
    public void j() {
        this.f3526c = null;
        this.f3525b = null;
    }

    @d.b1({b1.a.f8135m})
    public void k(@d.q0 a aVar) {
        this.f3525b = aVar;
    }

    public void l(@d.q0 InterfaceC0035b interfaceC0035b) {
        if (this.f3526c != null && interfaceC0035b != null) {
            Log.w(f3523d, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f3526c = interfaceC0035b;
    }

    @d.b1({b1.a.f8135m})
    public void m(boolean z6) {
        a aVar = this.f3525b;
        if (aVar != null) {
            aVar.a(z6);
        }
    }
}
