package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public final class c {
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public static b f11859a;

    @k4.f
    public static final long a() {
        b b7 = b();
        return b7 != null ? b7.a() : System.currentTimeMillis();
    }

    @n6.e
    public static final b b() {
        return f11859a;
    }

    @k4.f
    public static final long c() {
        b b7 = b();
        return b7 != null ? b7.b() : System.nanoTime();
    }

    @k4.f
    public static final void d(Object obj, long j7) {
        v3.m2 m2Var;
        b b7 = b();
        if (b7 != null) {
            b7.c(obj, j7);
            m2Var = v3.m2.f17815a;
        } else {
            m2Var = null;
        }
        if (m2Var == null) {
            LockSupport.parkNanos(obj, j7);
        }
    }

    @k4.f
    public static final void e() {
        b b7 = b();
        if (b7 != null) {
            b7.d();
        }
    }

    public static final void f(@n6.e b bVar) {
        f11859a = bVar;
    }

    @k4.f
    public static final void g() {
        b b7 = b();
        if (b7 != null) {
            b7.e();
        }
    }

    @k4.f
    public static final void h() {
        b b7 = b();
        if (b7 != null) {
            b7.f();
        }
    }

    @k4.f
    public static final void i(Thread thread) {
        v3.m2 m2Var;
        b b7 = b();
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

    @k4.f
    public static final void j() {
        b b7 = b();
        if (b7 != null) {
            b7.h();
        }
    }

    @k4.f
    public static final Runnable k(Runnable runnable) {
        Runnable i7;
        b b7 = b();
        return (b7 == null || (i7 = b7.i(runnable)) == null) ? runnable : i7;
    }
}
