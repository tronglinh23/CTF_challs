package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: l  reason: collision with root package name */
    public final Context f1084l;

    /* renamed from: m  reason: collision with root package name */
    public androidx.collection.m<u0.b, MenuItem> f1085m;

    /* renamed from: n  reason: collision with root package name */
    public androidx.collection.m<u0.c, SubMenu> f1086n;

    public c(Context context) {
        this.f1084l = context;
    }

    public final MenuItem e(MenuItem menuItem) {
        if (menuItem instanceof u0.b) {
            u0.b bVar = (u0.b) menuItem;
            if (this.f1085m == null) {
                this.f1085m = new androidx.collection.m<>();
            }
            MenuItem menuItem2 = this.f1085m.get(bVar);
            if (menuItem2 == null) {
                k kVar = new k(this.f1084l, bVar);
                this.f1085m.put(bVar, kVar);
                return kVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final SubMenu f(SubMenu subMenu) {
        if (subMenu instanceof u0.c) {
            u0.c cVar = (u0.c) subMenu;
            if (this.f1086n == null) {
                this.f1086n = new androidx.collection.m<>();
            }
            SubMenu subMenu2 = this.f1086n.get(cVar);
            if (subMenu2 == null) {
                t tVar = new t(this.f1084l, cVar);
                this.f1086n.put(cVar, tVar);
                return tVar;
            }
            return subMenu2;
        }
        return subMenu;
    }

    public final void g() {
        androidx.collection.m<u0.b, MenuItem> mVar = this.f1085m;
        if (mVar != null) {
            mVar.clear();
        }
        androidx.collection.m<u0.c, SubMenu> mVar2 = this.f1086n;
        if (mVar2 != null) {
            mVar2.clear();
        }
    }

    public final void h(int i7) {
        if (this.f1085m == null) {
            return;
        }
        int i8 = 0;
        while (i8 < this.f1085m.size()) {
            if (this.f1085m.k(i8).getGroupId() == i7) {
                this.f1085m.m(i8);
                i8--;
            }
            i8++;
        }
    }

    public final void i(int i7) {
        if (this.f1085m == null) {
            return;
        }
        for (int i8 = 0; i8 < this.f1085m.size(); i8++) {
            if (this.f1085m.k(i8).getItemId() == i7) {
                this.f1085m.m(i8);
                return;
            }
        }
    }
}
