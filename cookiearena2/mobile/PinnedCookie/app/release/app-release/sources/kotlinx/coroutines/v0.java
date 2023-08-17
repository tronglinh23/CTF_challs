package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class v0 {
    @n6.d
    public static final u0 a(@n6.d e4.g gVar) {
        c0 c7;
        if (gVar.e(n2.f12920c) == null) {
            c7 = t2.c(null, 1, null);
            gVar = gVar.t(c7);
        }
        return new kotlinx.coroutines.internal.j(gVar);
    }

    @n6.d
    public static final u0 b() {
        return new kotlinx.coroutines.internal.j(r3.c(null, 1, null).t(m1.e()));
    }

    public static final void c(@n6.d u0 u0Var, @n6.d String str, @n6.e Throwable th) {
        d(u0Var, y1.a(str, th));
    }

    public static final void d(@n6.d u0 u0Var, @n6.e CancellationException cancellationException) {
        n2 n2Var = (n2) u0Var.getCoroutineContext().e(n2.f12920c);
        if (n2Var != null) {
            n2Var.f(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + u0Var).toString());
    }

    public static /* synthetic */ void e(u0 u0Var, String str, Throwable th, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            th = null;
        }
        c(u0Var, str, th);
    }

    public static /* synthetic */ void f(u0 u0Var, CancellationException cancellationException, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            cancellationException = null;
        }
        d(u0Var, cancellationException);
    }

    @n6.e
    public static final <R> Object g(@n6.d t4.p<? super u0, ? super e4.d<? super R>, ? extends Object> pVar, @n6.d e4.d<? super R> dVar) {
        kotlinx.coroutines.internal.n0 n0Var = new kotlinx.coroutines.internal.n0(dVar.g(), dVar);
        Object f7 = q5.b.f(n0Var, n0Var, pVar);
        if (f7 == g4.d.h()) {
            h4.h.c(dVar);
        }
        return f7;
    }

    @n6.e
    public static final Object h(@n6.d e4.d<? super e4.g> dVar) {
        return dVar.g();
    }

    public static final Object i(e4.d<? super e4.g> dVar) {
        u4.i0.e(3);
        throw null;
    }

    public static final void j(@n6.d u0 u0Var) {
        r2.z(u0Var.getCoroutineContext());
    }

    public static final boolean k(@n6.d u0 u0Var) {
        n2 n2Var = (n2) u0Var.getCoroutineContext().e(n2.f12920c);
        if (n2Var != null) {
            return n2Var.d();
        }
        return true;
    }

    public static /* synthetic */ void l(u0 u0Var) {
    }

    @n6.d
    public static final u0 m(@n6.d u0 u0Var, @n6.d e4.g gVar) {
        return new kotlinx.coroutines.internal.j(u0Var.getCoroutineContext().t(gVar));
    }
}
