package i6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.x1;
import v3.m2;
/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11269a;

    /* renamed from: b  reason: collision with root package name */
    public long f11270b;

    /* renamed from: c  reason: collision with root package name */
    public long f11271c;

    /* renamed from: e  reason: collision with root package name */
    public static final b f11268e = new b(null);
    @n6.d
    @s4.e

    /* renamed from: d  reason: collision with root package name */
    public static final q0 f11267d = new a();

    /* loaded from: classes.dex */
    public static final class a extends q0 {
        @Override // i6.q0
        @n6.d
        public q0 e(long j7) {
            return this;
        }

        @Override // i6.q0
        public void h() {
        }

        @Override // i6.q0
        @n6.d
        public q0 i(long j7, @n6.d TimeUnit timeUnit) {
            u4.l0.p(timeUnit, "unit");
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public final long a(long j7, long j8) {
            return (j7 != 0 && (j8 == 0 || j7 < j8)) ? j7 : j8;
        }

        public /* synthetic */ b(u4.w wVar) {
            this();
        }
    }

    @n6.d
    public q0 a() {
        this.f11269a = false;
        return this;
    }

    @n6.d
    public q0 b() {
        this.f11271c = 0L;
        return this;
    }

    @n6.d
    public final q0 c(long j7, @n6.d TimeUnit timeUnit) {
        u4.l0.p(timeUnit, "unit");
        if (j7 > 0) {
            return e(System.nanoTime() + timeUnit.toNanos(j7));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j7).toString());
    }

    public long d() {
        if (this.f11269a) {
            return this.f11270b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    @n6.d
    public q0 e(long j7) {
        this.f11269a = true;
        this.f11270b = j7;
        return this;
    }

    public boolean f() {
        return this.f11269a;
    }

    public final void g(@n6.d q0 q0Var, @n6.d t4.a<m2> aVar) {
        u4.l0.p(q0Var, "other");
        u4.l0.p(aVar, "block");
        long j7 = j();
        long a7 = f11268e.a(q0Var.j(), j());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        i(a7, timeUnit);
        if (!f()) {
            if (q0Var.f()) {
                e(q0Var.d());
            }
            try {
                aVar.n();
                u4.i0.d(1);
                i(j7, timeUnit);
                if (q0Var.f()) {
                    a();
                }
                u4.i0.c(1);
                return;
            } catch (Throwable th) {
                u4.i0.d(1);
                i(j7, TimeUnit.NANOSECONDS);
                if (q0Var.f()) {
                    a();
                }
                u4.i0.c(1);
                throw th;
            }
        }
        long d7 = d();
        if (q0Var.f()) {
            e(Math.min(d(), q0Var.d()));
        }
        try {
            aVar.n();
            u4.i0.d(1);
            i(j7, timeUnit);
            if (q0Var.f()) {
                e(d7);
            }
            u4.i0.c(1);
        } catch (Throwable th2) {
            u4.i0.d(1);
            i(j7, TimeUnit.NANOSECONDS);
            if (q0Var.f()) {
                e(d7);
            }
            u4.i0.c(1);
            throw th2;
        }
    }

    public void h() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f11269a && this.f11270b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @n6.d
    public q0 i(long j7, @n6.d TimeUnit timeUnit) {
        u4.l0.p(timeUnit, "unit");
        if (j7 >= 0) {
            this.f11271c = timeUnit.toNanos(j7);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j7).toString());
    }

    public long j() {
        return this.f11271c;
    }

    public final void k(@n6.d Object obj) throws InterruptedIOException {
        u4.l0.p(obj, "monitor");
        try {
            boolean f7 = f();
            long j7 = j();
            long j8 = 0;
            if (!f7 && j7 == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (f7 && j7 != 0) {
                j7 = Math.min(j7, d() - nanoTime);
            } else if (f7) {
                j7 = d() - nanoTime;
            }
            if (j7 > 0) {
                long j9 = j7 / x1.f13167e;
                obj.wait(j9, (int) (j7 - (x1.f13167e * j9)));
                j8 = System.nanoTime() - nanoTime;
            }
            if (j8 >= j7) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
