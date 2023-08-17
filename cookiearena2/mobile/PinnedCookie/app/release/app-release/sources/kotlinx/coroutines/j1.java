package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import v3.d1;
/* loaded from: classes.dex */
public abstract class j1<T> extends kotlinx.coroutines.scheduling.k {
    @s4.e

    /* renamed from: m  reason: collision with root package name */
    public int f12882m;

    public j1(int i7) {
        this.f12882m = i7;
    }

    public void c(@n6.e Object obj, @n6.d Throwable th) {
    }

    @n6.d
    public abstract e4.d<T> e();

    @n6.e
    public Throwable f(@n6.e Object obj) {
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        if (e0Var != null) {
            return e0Var.f11961a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T h(@n6.e Object obj) {
        return obj;
    }

    public final void i(@n6.e Throwable th, @n6.e Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            v3.p.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        u4.l0.m(th);
        r0.b(e().g(), new x0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @n6.e
    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object b7;
        Object b8;
        kotlinx.coroutines.scheduling.l lVar = this.f12999l;
        try {
            kotlinx.coroutines.internal.l lVar2 = (kotlinx.coroutines.internal.l) e();
            e4.d<T> dVar = lVar2.f12817o;
            Object obj = lVar2.f12819q;
            e4.g g7 = dVar.g();
            Object c7 = kotlinx.coroutines.internal.w0.c(g7, obj);
            c4<?> g8 = c7 != kotlinx.coroutines.internal.w0.f12850a ? n0.g(dVar, g7, c7) : null;
            e4.g g9 = dVar.g();
            Object j7 = j();
            Throwable f7 = f(j7);
            n2 n2Var = (f7 == null && k1.c(this.f12882m)) ? (n2) g9.e(n2.f12920c) : null;
            if (n2Var != null && !n2Var.d()) {
                CancellationException w02 = n2Var.w0();
                c(j7, w02);
                d1.a aVar = v3.d1.f17778l;
                dVar.D(v3.d1.b(v3.e1.a(w02)));
            } else if (f7 != null) {
                d1.a aVar2 = v3.d1.f17778l;
                dVar.D(v3.d1.b(v3.e1.a(f7)));
            } else {
                d1.a aVar3 = v3.d1.f17778l;
                dVar.D(v3.d1.b(h(j7)));
            }
            v3.m2 m2Var = v3.m2.f17815a;
            if (g8 == null || g8.N1()) {
                kotlinx.coroutines.internal.w0.a(g7, c7);
            }
            try {
                d1.a aVar4 = v3.d1.f17778l;
                lVar.I();
                b8 = v3.d1.b(m2Var);
            } catch (Throwable th) {
                d1.a aVar5 = v3.d1.f17778l;
                b8 = v3.d1.b(v3.e1.a(th));
            }
            i(null, v3.d1.e(b8));
        } catch (Throwable th2) {
            try {
                d1.a aVar6 = v3.d1.f17778l;
                lVar.I();
                b7 = v3.d1.b(v3.m2.f17815a);
            } catch (Throwable th3) {
                d1.a aVar7 = v3.d1.f17778l;
                b7 = v3.d1.b(v3.e1.a(th3));
            }
            i(th2, v3.d1.e(b7));
        }
    }
}
