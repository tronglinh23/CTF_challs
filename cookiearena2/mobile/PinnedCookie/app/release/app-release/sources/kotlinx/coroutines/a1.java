package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.u1;
/* loaded from: classes.dex */
public final class a1 extends u1 implements Runnable {
    @n6.e
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;
    @n6.d

    /* renamed from: r  reason: collision with root package name */
    public static final a1 f11839r;
    @n6.d

    /* renamed from: s  reason: collision with root package name */
    public static final String f11840s = "kotlinx.coroutines.DefaultExecutor";

    /* renamed from: t  reason: collision with root package name */
    public static final long f11841t = 1000;

    /* renamed from: u  reason: collision with root package name */
    public static final long f11842u;

    /* renamed from: v  reason: collision with root package name */
    public static final int f11843v = 0;

    /* renamed from: w  reason: collision with root package name */
    public static final int f11844w = 1;

    /* renamed from: x  reason: collision with root package name */
    public static final int f11845x = 2;

    /* renamed from: y  reason: collision with root package name */
    public static final int f11846y = 3;

    /* renamed from: z  reason: collision with root package name */
    public static final int f11847z = 4;

    static {
        Long l7;
        a1 a1Var = new a1();
        f11839r = a1Var;
        t1.g1(a1Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f11842u = timeUnit.toNanos(l7.longValue());
    }

    public static /* synthetic */ void G1() {
    }

    public final synchronized void D1() {
        if (I1()) {
            debugStatus = 3;
            x1();
            notifyAll();
        }
    }

    public final synchronized Thread E1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, f11840s);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final synchronized void F1() {
        debugStatus = 0;
        E1();
        while (debugStatus == 0) {
            wait();
        }
    }

    public final boolean H1() {
        return debugStatus == 4;
    }

    public final boolean I1() {
        int i7 = debugStatus;
        return i7 == 2 || i7 == 3;
    }

    public final boolean J1() {
        return _thread != null;
    }

    public final synchronized boolean K1() {
        if (I1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    public final void L1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void M1(long j7) {
        v3.m2 m2Var;
        long currentTimeMillis = System.currentTimeMillis() + j7;
        if (!I1()) {
            debugStatus = 2;
        }
        while (debugStatus != 3 && _thread != null) {
            Thread thread = _thread;
            if (thread != null) {
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
            if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                break;
            }
            wait(j7);
        }
        debugStatus = 0;
    }

    @Override // kotlinx.coroutines.u1, kotlinx.coroutines.t1
    public void n1() {
        debugStatus = 4;
        super.n1();
    }

    @Override // kotlinx.coroutines.v1
    @n6.d
    public Thread o1() {
        Thread thread = _thread;
        return thread == null ? E1() : thread;
    }

    @Override // kotlinx.coroutines.v1
    public void p1(long j7, @n6.d u1.c cVar) {
        L1();
    }

    @Override // java.lang.Runnable
    public void run() {
        v3.m2 m2Var;
        boolean h12;
        u3.f13126a.d(this);
        b b7 = c.b();
        if (b7 != null) {
            b7.d();
        }
        try {
            if (!K1()) {
                if (h12) {
                    return;
                }
                return;
            }
            long j7 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long k12 = k1();
                if (k12 == Long.MAX_VALUE) {
                    b b8 = c.b();
                    long b9 = b8 != null ? b8.b() : System.nanoTime();
                    if (j7 == Long.MAX_VALUE) {
                        j7 = f11842u + b9;
                    }
                    long j8 = j7 - b9;
                    if (j8 <= 0) {
                        _thread = null;
                        D1();
                        b b10 = c.b();
                        if (b10 != null) {
                            b10.h();
                        }
                        if (h1()) {
                            return;
                        }
                        o1();
                        return;
                    }
                    k12 = d5.u.C(k12, j8);
                } else {
                    j7 = Long.MAX_VALUE;
                }
                if (k12 > 0) {
                    if (I1()) {
                        _thread = null;
                        D1();
                        b b11 = c.b();
                        if (b11 != null) {
                            b11.h();
                        }
                        if (h1()) {
                            return;
                        }
                        o1();
                        return;
                    }
                    b b12 = c.b();
                    if (b12 != null) {
                        b12.c(this, k12);
                        m2Var = v3.m2.f17815a;
                    } else {
                        m2Var = null;
                    }
                    if (m2Var == null) {
                        LockSupport.parkNanos(this, k12);
                    }
                }
            }
        } finally {
            _thread = null;
            D1();
            b b13 = c.b();
            if (b13 != null) {
                b13.h();
            }
            if (!h1()) {
                o1();
            }
        }
    }

    @Override // kotlinx.coroutines.u1
    public void u1(@n6.d Runnable runnable) {
        if (H1()) {
            L1();
        }
        super.u1(runnable);
    }

    @Override // kotlinx.coroutines.u1, kotlinx.coroutines.e1
    @n6.d
    public p1 z0(long j7, @n6.d Runnable runnable, @n6.d e4.g gVar) {
        return A1(j7, runnable);
    }
}
