package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class a0 {
    @d.o0

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f4273a = new CopyOnWriteArrayList<>();
    @d.o0

    /* renamed from: b  reason: collision with root package name */
    public final FragmentManager f4274b;

    /* loaded from: classes.dex */
    public static final class a {
        @d.o0

        /* renamed from: a  reason: collision with root package name */
        public final FragmentManager.m f4275a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4276b;

        public a(@d.o0 FragmentManager.m mVar, boolean z6) {
            this.f4275a = mVar;
            this.f4276b = z6;
        }
    }

    public a0(@d.o0 FragmentManager fragmentManager) {
        this.f4274b = fragmentManager;
    }

    public void a(@d.o0 Fragment fragment, @d.q0 Bundle bundle, boolean z6) {
        Fragment N0 = this.f4274b.N0();
        if (N0 != null) {
            N0.getParentFragmentManager().M0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.f4273a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z6 || next.f4276b) {
                next.f4275a.a(this.f4274b, fragment, bundle);
            }
        }
    }

    public void b(@d.o0 Fragment fragment, boolean z6) {
        Context k7 = this.f4274b.K0().k();
        Fragment N0 = this.f4274b.N0();
        if (N0 != null) {
            N0.getParentFragmentManager().M0().b(fragment, true);
        }
        Iterator<a> it = this.f4273a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z6 || next.f4276b) {
                next.f4275a.b(this.f4274b, fragment, k7);
            }
        }
    }

    public void c(@d.o0 Fragment fragment, @d.q0 Bundle bundle, boolean z6) {
        Fragment N0 = this.f4274b.N0();
        if (N0 != null) {
            N0.getParentFragmentManager().M0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.f4273a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z6 || next.f4276b) {
                next.f4275a.c(this.f4274b, fragment, bundle);
            }
        }
    }

    public void d(@d.o0 Fragment fragment, boolean z6) {
        Fragment N0 = this.f4274b.N0();
        if (N0 != null) {
            N0.getParentFragmentManager().M0().d(fragment, true);
        }
        Iterator<a> it = this.f4273a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z6 || next.f4276b) {
                next.f4275a.d(this.f4274b, fragment);
            }
        }
    }

    public void e(@d.o0 Fragment fragment, boolean z6) {
        Fragment N0 = this.f4274b.N0();
        if (N0 != null) {
            N0.getParentFragmentManager().M0().e(fragment, true);
        }
        Iterator<a> it = this.f4273a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z6 || next.f4276b) {
                next.f4275a.e(this.f4274b, fragment);
            }
        }
    }

    public void f(@d.o0 Fragment fragment, boolean z6) {
        Fragment N0 = this.f4274b.N0();
        if (N0 != null) {
            N0.getParentFragmentManager().M0().f(fragment, true);
        }
        Iterator<a> it = this.f4273a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z6 || next.f4276b) {
                next.f4275a.f(this.f4274b, fragment);
            }
        }
    }

    public void g(@d.o0 Fragment fragment, boolean z6) {
        Context k7 = this.f4274b.K0().k();
        Fragment N0 = this.f4274b.N0();
        if (N0 != null) {
            N0.getParentFragmentManager().M0().g(fragment, true);
        }
        Iterator<a> it = this.f4273a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z6 || next.f4276b) {
                next.f4275a.g(this.f4274b, fragment, k7);
            }
        }
    }

    public void h(@d.o0 Fragment fragment, @d.q0 Bundle bundle, boolean z6) {
        Fragment N0 = this.f4274b.N0();
        if (N0 != null) {
            N0.getParentFragmentManager().M0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.f4273a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z6 || next.f4276b) {
                next.f4275a.h(this.f4274b, fragment, bundle);
            }
        }
    }

    public void i(@d.o0 Fragment fragment, boolean z6) {
        Fragment N0 = this.f4274b.N0();
        if (N0 != null) {
            N0.getParentFragmentManager().M0().i(fragment, true);
        }
        Iterator<a> it = this.f4273a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z6 || next.f4276b) {
                next.f4275a.i(this.f4274b, fragment);
            }
        }
    }

    public void j(@d.o0 Fragment fragment, @d.o0 Bundle bundle, boolean z6) {
        Fragment N0 = this.f4274b.N0();
        if (N0 != null) {
            N0.getParentFragmentManager().M0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.f4273a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z6 || next.f4276b) {
                next.f4275a.j(this.f4274b, fragment, bundle);
            }
        }
    }

    public void k(@d.o0 Fragment fragment, boolean z6) {
        Fragment N0 = this.f4274b.N0();
        if (N0 != null) {
            N0.getParentFragmentManager().M0().k(fragment, true);
        }
        Iterator<a> it = this.f4273a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z6 || next.f4276b) {
                next.f4275a.k(this.f4274b, fragment);
            }
        }
    }

    public void l(@d.o0 Fragment fragment, boolean z6) {
        Fragment N0 = this.f4274b.N0();
        if (N0 != null) {
            N0.getParentFragmentManager().M0().l(fragment, true);
        }
        Iterator<a> it = this.f4273a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z6 || next.f4276b) {
                next.f4275a.l(this.f4274b, fragment);
            }
        }
    }

    public void m(@d.o0 Fragment fragment, @d.o0 View view, @d.q0 Bundle bundle, boolean z6) {
        Fragment N0 = this.f4274b.N0();
        if (N0 != null) {
            N0.getParentFragmentManager().M0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f4273a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z6 || next.f4276b) {
                next.f4275a.m(this.f4274b, fragment, view, bundle);
            }
        }
    }

    public void n(@d.o0 Fragment fragment, boolean z6) {
        Fragment N0 = this.f4274b.N0();
        if (N0 != null) {
            N0.getParentFragmentManager().M0().n(fragment, true);
        }
        Iterator<a> it = this.f4273a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z6 || next.f4276b) {
                next.f4275a.n(this.f4274b, fragment);
            }
        }
    }

    public void o(@d.o0 FragmentManager.m mVar, boolean z6) {
        this.f4273a.add(new a(mVar, z6));
    }

    public void p(@d.o0 FragmentManager.m mVar) {
        synchronized (this.f4273a) {
            int size = this.f4273a.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                } else if (this.f4273a.get(i7).f4275a == mVar) {
                    this.f4273a.remove(i7);
                    break;
                } else {
                    i7++;
                }
            }
        }
    }
}
