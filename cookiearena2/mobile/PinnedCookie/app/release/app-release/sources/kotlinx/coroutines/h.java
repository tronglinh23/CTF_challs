package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public final class h<T> extends a<T> {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final Thread f12748m;
    @n6.e

    /* renamed from: n  reason: collision with root package name */
    public final t1 f12749n;

    public h(@n6.d e4.g gVar, @n6.d Thread thread, @n6.e t1 t1Var) {
        super(gVar, true, true);
        this.f12748m = thread;
        this.f12749n = t1Var;
    }

    public final T M1() {
        v3.m2 m2Var;
        b b7 = c.b();
        if (b7 != null) {
            b7.d();
        }
        try {
            t1 t1Var = this.f12749n;
            if (t1Var != null) {
                t1.g1(t1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                t1 t1Var2 = this.f12749n;
                long k12 = t1Var2 != null ? t1Var2.k1() : Long.MAX_VALUE;
                if (l()) {
                    t1 t1Var3 = this.f12749n;
                    if (t1Var3 != null) {
                        t1.b1(t1Var3, false, 1, null);
                    }
                    T t6 = (T) w2.o(V0());
                    e0 e0Var = t6 instanceof e0 ? (e0) t6 : null;
                    if (e0Var == null) {
                        return t6;
                    }
                    throw e0Var.f11961a;
                }
                b b8 = c.b();
                if (b8 != null) {
                    b8.c(this, k12);
                    m2Var = v3.m2.f17815a;
                } else {
                    m2Var = null;
                }
                if (m2Var == null) {
                    LockSupport.parkNanos(this, k12);
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            o0(interruptedException);
            throw interruptedException;
        } finally {
            b b9 = c.b();
            if (b9 != null) {
                b9.h();
            }
        }
    }

    @Override // kotlinx.coroutines.v2
    public boolean b1() {
        return true;
    }

    @Override // kotlinx.coroutines.v2
    public void j0(@n6.e Object obj) {
        v3.m2 m2Var;
        if (u4.l0.g(Thread.currentThread(), this.f12748m)) {
            return;
        }
        Thread thread = this.f12748m;
        b b7 = c.b();
        if (b7 != null) {
            b7.g(thread);
            m2Var = v3.m2.f17815a;
        } else {
            m2Var = null;
        }
        if (m2Var == null) {
            LockSupport.unpark(thread);
        }
    }
}
