package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a */
    public final Runnable f3865a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<a1> f3866b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Map<a1, a> f3867c = new HashMap();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final androidx.lifecycle.p f3868a;

        /* renamed from: b */
        public androidx.lifecycle.v f3869b;

        public a(@d.o0 androidx.lifecycle.p pVar, @d.o0 androidx.lifecycle.v vVar) {
            this.f3868a = pVar;
            this.f3869b = vVar;
            pVar.a(vVar);
        }

        public void a() {
            this.f3868a.d(this.f3869b);
            this.f3869b = null;
        }
    }

    public x0(@d.o0 Runnable runnable) {
        this.f3865a = runnable;
    }

    public static /* synthetic */ void a(x0 x0Var, p.b bVar, a1 a1Var, androidx.lifecycle.z zVar, p.a aVar) {
        x0Var.g(bVar, a1Var, zVar, aVar);
    }

    public static /* synthetic */ void b(x0 x0Var, a1 a1Var, androidx.lifecycle.z zVar, p.a aVar) {
        x0Var.f(a1Var, zVar, aVar);
    }

    public /* synthetic */ void f(a1 a1Var, androidx.lifecycle.z zVar, p.a aVar) {
        if (aVar == p.a.ON_DESTROY) {
            l(a1Var);
        }
    }

    public /* synthetic */ void g(p.b bVar, a1 a1Var, androidx.lifecycle.z zVar, p.a aVar) {
        if (aVar == p.a.j(bVar)) {
            c(a1Var);
        } else if (aVar == p.a.ON_DESTROY) {
            l(a1Var);
        } else if (aVar == p.a.d(bVar)) {
            this.f3866b.remove(a1Var);
            this.f3865a.run();
        }
    }

    public void c(@d.o0 a1 a1Var) {
        this.f3866b.add(a1Var);
        this.f3865a.run();
    }

    public void d(@d.o0 final a1 a1Var, @d.o0 androidx.lifecycle.z zVar) {
        c(a1Var);
        androidx.lifecycle.p lifecycle = zVar.getLifecycle();
        a remove = this.f3867c.remove(a1Var);
        if (remove != null) {
            remove.a();
        }
        this.f3867c.put(a1Var, new a(lifecycle, new androidx.lifecycle.v() { // from class: androidx.core.view.v0
            @Override // androidx.lifecycle.v
            public final void d(androidx.lifecycle.z zVar2, p.a aVar) {
                x0.b(x0.this, a1Var, zVar2, aVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(@d.o0 final a1 a1Var, @d.o0 androidx.lifecycle.z zVar, @d.o0 final p.b bVar) {
        androidx.lifecycle.p lifecycle = zVar.getLifecycle();
        a remove = this.f3867c.remove(a1Var);
        if (remove != null) {
            remove.a();
        }
        this.f3867c.put(a1Var, new a(lifecycle, new androidx.lifecycle.v() { // from class: androidx.core.view.w0
            @Override // androidx.lifecycle.v
            public final void d(androidx.lifecycle.z zVar2, p.a aVar) {
                x0.a(x0.this, bVar, a1Var, zVar2, aVar);
            }
        }));
    }

    public void h(@d.o0 Menu menu, @d.o0 MenuInflater menuInflater) {
        Iterator<a1> it = this.f3866b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void i(@d.o0 Menu menu) {
        Iterator<a1> it = this.f3866b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean j(@d.o0 MenuItem menuItem) {
        Iterator<a1> it = this.f3866b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(@d.o0 Menu menu) {
        Iterator<a1> it = this.f3866b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }

    public void l(@d.o0 a1 a1Var) {
        this.f3866b.remove(a1Var);
        a remove = this.f3867c.remove(a1Var);
        if (remove != null) {
            remove.a();
        }
        this.f3865a.run();
    }
}