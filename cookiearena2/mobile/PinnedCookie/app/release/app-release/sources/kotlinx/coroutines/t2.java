package kotlinx.coroutines;

import e4.g;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.n2;
/* loaded from: classes.dex */
public final /* synthetic */ class t2 {
    public static final boolean A(@n6.d e4.g gVar) {
        n2 n2Var = (n2) gVar.e(n2.f12920c);
        return n2Var != null && n2Var.d();
    }

    public static final Throwable B(Throwable th, n2 n2Var) {
        return th == null ? new o2("Job was cancelled", null, n2Var) : th;
    }

    @n6.d
    public static final c0 a(@n6.e n2 n2Var) {
        return new q2(n2Var);
    }

    @s4.h(name = "Job")
    @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ n2 b(n2 n2Var) {
        return r2.a(n2Var);
    }

    public static /* synthetic */ c0 c(n2 n2Var, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            n2Var = null;
        }
        return r2.a(n2Var);
    }

    public static /* synthetic */ n2 d(n2 n2Var, int i7, Object obj) {
        n2 b7;
        if ((i7 & 1) != 0) {
            n2Var = null;
        }
        b7 = b(n2Var);
        return b7;
    }

    public static final void f(@n6.d e4.g gVar, @n6.e CancellationException cancellationException) {
        n2 n2Var = (n2) gVar.e(n2.f12920c);
        if (n2Var != null) {
            n2Var.f(cancellationException);
        }
    }

    public static final void g(@n6.d n2 n2Var, @n6.d String str, @n6.e Throwable th) {
        n2Var.f(y1.a(str, th));
    }

    @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(e4.g gVar, Throwable th) {
        g.b e7 = gVar.e(n2.f12920c);
        v2 v2Var = e7 instanceof v2 ? (v2) e7 : null;
        if (v2Var == null) {
            return false;
        }
        v2Var.u0(B(th, v2Var));
        return true;
    }

    public static /* synthetic */ void i(e4.g gVar, CancellationException cancellationException, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            cancellationException = null;
        }
        r2.f(gVar, cancellationException);
    }

    public static /* synthetic */ void j(n2 n2Var, String str, Throwable th, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            th = null;
        }
        r2.g(n2Var, str, th);
    }

    public static /* synthetic */ boolean k(e4.g gVar, Throwable th, int i7, Object obj) {
        boolean h7;
        if ((i7 & 1) != 0) {
            th = null;
        }
        h7 = h(gVar, th);
        return h7;
    }

    @n6.e
    public static final Object l(@n6.d n2 n2Var, @n6.d e4.d<? super v3.m2> dVar) {
        n2.a.b(n2Var, null, 1, null);
        Object E0 = n2Var.E0(dVar);
        return E0 == g4.d.h() ? E0 : v3.m2.f17815a;
    }

    @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(e4.g gVar, Throwable th) {
        n2 n2Var = (n2) gVar.e(n2.f12920c);
        if (n2Var == null) {
            return;
        }
        for (n2 n2Var2 : n2Var.Q()) {
            v2 v2Var = n2Var2 instanceof v2 ? (v2) n2Var2 : null;
            if (v2Var != null) {
                v2Var.u0(B(th, n2Var));
            }
        }
    }

    public static final void o(@n6.d e4.g gVar, @n6.e CancellationException cancellationException) {
        f5.m<n2> Q;
        n2 n2Var = (n2) gVar.e(n2.f12920c);
        if (n2Var == null || (Q = n2Var.Q()) == null) {
            return;
        }
        Iterator<n2> it = Q.iterator();
        while (it.hasNext()) {
            it.next().f(cancellationException);
        }
    }

    @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(n2 n2Var, Throwable th) {
        for (n2 n2Var2 : n2Var.Q()) {
            v2 v2Var = n2Var2 instanceof v2 ? (v2) n2Var2 : null;
            if (v2Var != null) {
                v2Var.u0(B(th, n2Var));
            }
        }
    }

    public static final void r(@n6.d n2 n2Var, @n6.e CancellationException cancellationException) {
        Iterator<n2> it = n2Var.Q().iterator();
        while (it.hasNext()) {
            it.next().f(cancellationException);
        }
    }

    public static /* synthetic */ void s(e4.g gVar, Throwable th, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            th = null;
        }
        n(gVar, th);
    }

    public static /* synthetic */ void t(e4.g gVar, CancellationException cancellationException, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            cancellationException = null;
        }
        r2.o(gVar, cancellationException);
    }

    public static /* synthetic */ void u(n2 n2Var, Throwable th, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            th = null;
        }
        q(n2Var, th);
    }

    public static /* synthetic */ void v(n2 n2Var, CancellationException cancellationException, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            cancellationException = null;
        }
        r2.r(n2Var, cancellationException);
    }

    @n6.d
    public static final p1 w(@n6.d n2 n2Var, @n6.d p1 p1Var) {
        return n2Var.X(new r1(p1Var));
    }

    public static final void x(@n6.d e4.g gVar) {
        n2 n2Var = (n2) gVar.e(n2.f12920c);
        if (n2Var != null) {
            r2.A(n2Var);
        }
    }

    public static final void y(@n6.d n2 n2Var) {
        if (!n2Var.d()) {
            throw n2Var.w0();
        }
    }

    @n6.d
    public static final n2 z(@n6.d e4.g gVar) {
        n2 n2Var = (n2) gVar.e(n2.f12920c);
        if (n2Var != null) {
            return n2Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }
}
