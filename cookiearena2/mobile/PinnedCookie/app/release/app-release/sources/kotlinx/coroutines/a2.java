package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.e1;
/* loaded from: classes.dex */
public final class a2 extends z1 implements e1 {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final Executor f11848n;

    public a2(@n6.d Executor executor) {
        this.f11848n = executor;
        kotlinx.coroutines.internal.f.c(a1());
    }

    @Override // kotlinx.coroutines.e1
    @v3.k(level = v3.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @n6.e
    public Object O0(long j7, @n6.d e4.d<? super v3.m2> dVar) {
        return e1.a.a(this, j7, dVar);
    }

    @Override // kotlinx.coroutines.o0
    public void V0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        Runnable runnable2;
        try {
            Executor a12 = a1();
            b b7 = c.b();
            if (b7 == null || (runnable2 = b7.i(runnable)) == null) {
                runnable2 = runnable;
            }
            a12.execute(runnable2);
        } catch (RejectedExecutionException e7) {
            b b8 = c.b();
            if (b8 != null) {
                b8.f();
            }
            b1(gVar, e7);
            m1.c().V0(gVar, runnable);
        }
    }

    @Override // kotlinx.coroutines.z1
    @n6.d
    public Executor a1() {
        return this.f11848n;
    }

    public final void b1(e4.g gVar, RejectedExecutionException rejectedExecutionException) {
        r2.f(gVar, y1.a("The task was rejected", rejectedExecutionException));
    }

    public final ScheduledFuture<?> c1(ScheduledExecutorService scheduledExecutorService, Runnable runnable, e4.g gVar, long j7) {
        try {
            return scheduledExecutorService.schedule(runnable, j7, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e7) {
            b1(gVar, e7);
            return null;
        }
    }

    @Override // kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor a12 = a1();
        ExecutorService executorService = a12 instanceof ExecutorService ? (ExecutorService) a12 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(@n6.e Object obj) {
        return (obj instanceof a2) && ((a2) obj).a1() == a1();
    }

    public int hashCode() {
        return System.identityHashCode(a1());
    }

    @Override // kotlinx.coroutines.e1
    public void m(long j7, @n6.d q<? super v3.m2> qVar) {
        Executor a12 = a1();
        ScheduledExecutorService scheduledExecutorService = a12 instanceof ScheduledExecutorService ? (ScheduledExecutorService) a12 : null;
        ScheduledFuture<?> c12 = scheduledExecutorService != null ? c1(scheduledExecutorService, new j3(this, qVar), qVar.g(), j7) : null;
        if (c12 != null) {
            r2.w(qVar, c12);
        } else {
            a1.f11839r.m(j7, qVar);
        }
    }

    @Override // kotlinx.coroutines.o0
    @n6.d
    public String toString() {
        return a1().toString();
    }

    @Override // kotlinx.coroutines.e1
    @n6.d
    public p1 z0(long j7, @n6.d Runnable runnable, @n6.d e4.g gVar) {
        Executor a12 = a1();
        ScheduledExecutorService scheduledExecutorService = a12 instanceof ScheduledExecutorService ? (ScheduledExecutorService) a12 : null;
        ScheduledFuture<?> c12 = scheduledExecutorService != null ? c1(scheduledExecutorService, runnable, gVar, j7) : null;
        return c12 != null ? new o1(c12) : a1.f11839r.z0(j7, runnable, gVar);
    }
}
