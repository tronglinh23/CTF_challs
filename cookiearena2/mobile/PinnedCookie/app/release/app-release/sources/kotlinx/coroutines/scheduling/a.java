package kotlinx.coroutines.scheduling;

import d5.u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.m0;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.z0;
import u4.l0;
import u4.w;
import v3.m2;
/* loaded from: classes.dex */
public final class a implements Executor, Closeable {
    public static final long A = 2097151;
    public static final long B = 4398044413952L;
    public static final int C = 42;
    public static final long D = 9223367638808264704L;
    public static final int E = 1;
    public static final int F = 2097150;
    public static final long G = 2097151;
    public static final long H = -2097152;
    public static final long I = 2097152;

    /* renamed from: w  reason: collision with root package name */
    public static final int f12952w = -1;

    /* renamed from: x  reason: collision with root package name */
    public static final int f12953x = 0;

    /* renamed from: y  reason: collision with root package name */
    public static final int f12954y = 1;

    /* renamed from: z  reason: collision with root package name */
    public static final int f12955z = 21;
    @n6.d
    private volatile /* synthetic */ int _isTerminated;
    @n6.d
    volatile /* synthetic */ long controlState;
    @s4.e

    /* renamed from: k  reason: collision with root package name */
    public final int f12956k;
    @s4.e

    /* renamed from: l  reason: collision with root package name */
    public final int f12957l;
    @s4.e

    /* renamed from: m  reason: collision with root package name */
    public final long f12958m;
    @n6.d
    @s4.e

    /* renamed from: n  reason: collision with root package name */
    public final String f12959n;
    @n6.d
    @s4.e

    /* renamed from: o  reason: collision with root package name */
    public final f f12960o;
    @n6.d
    @s4.e

    /* renamed from: p  reason: collision with root package name */
    public final f f12961p;
    @n6.d
    private volatile /* synthetic */ long parkedWorkersStack;
    @n6.d
    @s4.e

    /* renamed from: q  reason: collision with root package name */
    public final m0<c> f12962q;
    @n6.d

    /* renamed from: r  reason: collision with root package name */
    public static final C0172a f12947r = new C0172a(null);
    @n6.d
    @s4.e

    /* renamed from: v  reason: collision with root package name */
    public static final r0 f12951v = new r0("NOT_IN_STACK");

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f12948s = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f12949t = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12950u = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: kotlinx.coroutines.scheduling.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0172a {
        public /* synthetic */ C0172a(w wVar) {
            this();
        }

        public C0172a() {
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12963a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f12963a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i7, int i8, long j7, @n6.d String str) {
        this.f12956k = i7;
        this.f12957l = i8;
        this.f12958m = j7;
        this.f12959n = str;
        if (!(i7 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i7 + " should be at least 1").toString());
        }
        if (!(i8 >= i7)) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should be greater than or equals to core pool size " + i7).toString());
        }
        if (!(i8 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j7 > 0) {
            this.f12960o = new f();
            this.f12961p = new f();
            this.parkedWorkersStack = 0L;
            this.f12962q = new m0<>(i7 + 1);
            this.controlState = i7 << 42;
            this._isTerminated = 0;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j7 + " must be positive").toString());
    }

    public static /* synthetic */ void p(a aVar, Runnable runnable, l lVar, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            lVar = o.f13010i;
        }
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        aVar.m(runnable, lVar, z6);
    }

    public static /* synthetic */ boolean w0(a aVar, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = aVar.controlState;
        }
        return aVar.q0(j7);
    }

    public final long A() {
        return f12949t.addAndGet(this, I);
    }

    public final int C() {
        return (int) (f12949t.incrementAndGet(this) & 2097151);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean E() {
        return this._isTerminated;
    }

    public final int I(c cVar) {
        Object h7 = cVar.h();
        while (h7 != f12951v) {
            if (h7 == null) {
                return 0;
            }
            c cVar2 = (c) h7;
            int g7 = cVar2.g();
            if (g7 != 0) {
                return g7;
            }
            h7 = cVar2.h();
        }
        return -1;
    }

    public final c L() {
        while (true) {
            long j7 = this.parkedWorkersStack;
            c b7 = this.f12962q.b((int) (2097151 & j7));
            if (b7 == null) {
                return null;
            }
            long j8 = (I + j7) & H;
            int I2 = I(b7);
            if (I2 >= 0 && f12948s.compareAndSet(this, j7, I2 | j8)) {
                b7.q(f12951v);
                return b7;
            }
        }
    }

    public final boolean O(@n6.d c cVar) {
        long j7;
        long j8;
        int g7;
        if (cVar.h() != f12951v) {
            return false;
        }
        do {
            j7 = this.parkedWorkersStack;
            j8 = (I + j7) & H;
            g7 = cVar.g();
            cVar.q(this.f12962q.b((int) (2097151 & j7)));
        } while (!f12948s.compareAndSet(this, j7, j8 | g7));
        return true;
    }

    public final void Q(@n6.d c cVar, int i7, int i8) {
        while (true) {
            long j7 = this.parkedWorkersStack;
            int i9 = (int) (2097151 & j7);
            long j8 = (I + j7) & H;
            if (i9 == i7) {
                i9 = i8 == 0 ? I(cVar) : i8;
            }
            if (i9 >= 0 && f12948s.compareAndSet(this, j7, j8 | i9)) {
                return;
            }
        }
    }

    public final long R() {
        return f12949t.addAndGet(this, 4398046511104L);
    }

    public final void S(@n6.d k kVar) {
        try {
            kVar.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                kotlinx.coroutines.b b7 = kotlinx.coroutines.c.b();
                if (b7 == null) {
                }
            } finally {
                kotlinx.coroutines.b b8 = kotlinx.coroutines.c.b();
                if (b8 != null) {
                    b8.f();
                }
            }
        }
    }

    public final void X(long j7) {
        int i7;
        k g7;
        if (f12950u.compareAndSet(this, 0, 1)) {
            c i8 = i();
            synchronized (this.f12962q) {
                i7 = (int) (this.controlState & 2097151);
            }
            if (1 <= i7) {
                int i9 = 1;
                while (true) {
                    c b7 = this.f12962q.b(i9);
                    l0.m(b7);
                    c cVar = b7;
                    if (cVar != i8) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j7);
                        }
                        cVar.f12965k.g(this.f12961p);
                    }
                    if (i9 == i7) {
                        break;
                    }
                    i9++;
                }
            }
            this.f12961p.b();
            this.f12960o.b();
            while (true) {
                if (i8 != null) {
                    g7 = i8.f(true);
                    if (g7 != null) {
                        continue;
                        S(g7);
                    }
                }
                g7 = this.f12960o.g();
                if (g7 == null && (g7 = this.f12961p.g()) == null) {
                    break;
                }
                S(g7);
            }
            if (i8 != null) {
                i8.t(d.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void Z(boolean z6) {
        long addAndGet = f12949t.addAndGet(this, I);
        if (z6 || z0() || q0(addAndGet)) {
            return;
        }
        z0();
    }

    public final boolean a(k kVar) {
        return kVar.f12999l.M0() == 1 ? this.f12961p.a(kVar) : this.f12960o.a(kVar);
    }

    public final int b(long j7) {
        return (int) ((j7 & D) >> 42);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        X(10000L);
    }

    public final int d(long j7) {
        return (int) ((j7 & B) >> 21);
    }

    public final void d0() {
        if (z0() || w0(this, 0L, 1, null)) {
            return;
        }
        z0();
    }

    public final int e() {
        synchronized (this.f12962q) {
            if (E()) {
                return -1;
            }
            long j7 = this.controlState;
            int i7 = (int) (j7 & 2097151);
            int u6 = u.u(i7 - ((int) ((j7 & B) >> 21)), 0);
            if (u6 >= this.f12956k) {
                return 0;
            }
            if (i7 >= this.f12957l) {
                return 0;
            }
            int i8 = ((int) (this.controlState & 2097151)) + 1;
            if (i8 > 0 && this.f12962q.b(i8) == null) {
                c cVar = new c(this, i8);
                this.f12962q.c(i8, cVar);
                if (i8 == ((int) (2097151 & f12949t.incrementAndGet(this)))) {
                    cVar.start();
                    return u6 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@n6.d Runnable runnable) {
        p(this, runnable, null, false, 6, null);
    }

    @n6.d
    public final k f(@n6.d Runnable runnable, @n6.d l lVar) {
        long a7 = o.f13007f.a();
        if (runnable instanceof k) {
            k kVar = (k) runnable;
            kVar.f12998k = a7;
            kVar.f12999l = lVar;
            return kVar;
        }
        return new n(runnable, a7, lVar);
    }

    public final k f0(c cVar, k kVar, boolean z6) {
        if (cVar == null || cVar.f12966l == d.TERMINATED) {
            return kVar;
        }
        if (kVar.f12999l.M0() == 0 && cVar.f12966l == d.BLOCKING) {
            return kVar;
        }
        cVar.f12970p = true;
        return cVar.f12965k.a(kVar, z6);
    }

    public final int h(long j7) {
        return (int) (j7 & 2097151);
    }

    public final c i() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !l0.g(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void k() {
        f12949t.addAndGet(this, H);
    }

    public final int l() {
        return (int) (f12949t.getAndDecrement(this) & 2097151);
    }

    public final void m(@n6.d Runnable runnable, @n6.d l lVar, boolean z6) {
        kotlinx.coroutines.b b7 = kotlinx.coroutines.c.b();
        if (b7 != null) {
            b7.e();
        }
        k f7 = f(runnable, lVar);
        c i7 = i();
        k f02 = f0(i7, f7, z6);
        if (f02 != null && !a(f02)) {
            throw new RejectedExecutionException(this.f12959n + " was terminated");
        }
        boolean z7 = z6 && i7 != null;
        if (f7.f12999l.M0() != 0) {
            Z(z7);
        } else if (z7) {
        } else {
            d0();
        }
    }

    public final boolean p0() {
        long j7;
        do {
            j7 = this.controlState;
            if (((int) ((D & j7) >> 42)) == 0) {
                return false;
            }
        } while (!f12949t.compareAndSet(this, j7, j7 - 4398046511104L));
        return true;
    }

    public final boolean q0(long j7) {
        if (u.u(((int) (2097151 & j7)) - ((int) ((j7 & B) >> 21)), 0) < this.f12956k) {
            int e7 = e();
            if (e7 == 1 && this.f12956k > 1) {
                e();
            }
            if (e7 > 0) {
                return true;
            }
        }
        return false;
    }

    public final int t() {
        return (int) ((this.controlState & D) >> 42);
    }

    @n6.d
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a7 = this.f12962q.a();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < a7; i12++) {
            c b7 = this.f12962q.b(i12);
            if (b7 != null) {
                int f7 = b7.f12965k.f();
                int i13 = b.f12963a[b7.f12966l.ordinal()];
                if (i13 == 1) {
                    i9++;
                } else if (i13 == 2) {
                    i8++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(f7);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i13 == 3) {
                    i7++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f7);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i13 == 4) {
                    i10++;
                    if (f7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i13 == 5) {
                    i11++;
                }
            }
        }
        long j7 = this.controlState;
        return this.f12959n + '@' + z0.b(this) + "[Pool Size {core = " + this.f12956k + ", max = " + this.f12957l + "}, Worker States {CPU = " + i7 + ", blocking = " + i8 + ", parked = " + i9 + ", dormant = " + i10 + ", terminated = " + i11 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f12960o.c() + ", global blocking queue size = " + this.f12961p.c() + ", Control State {created workers= " + ((int) (2097151 & j7)) + ", blocking tasks = " + ((int) ((B & j7) >> 21)) + ", CPUs acquired = " + (this.f12956k - ((int) ((D & j7) >> 42))) + "}]";
    }

    public final int u() {
        return (int) (this.controlState & 2097151);
    }

    public final boolean z0() {
        c L;
        do {
            L = L();
            if (L == null) {
                return false;
            }
        } while (!c.f12964r.compareAndSet(L, -1, 0));
        LockSupport.unpark(L);
        return true;
    }

    /* loaded from: classes.dex */
    public final class c extends Thread {

        /* renamed from: r  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f12964r = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private volatile int indexInArray;
        @n6.d
        @s4.e

        /* renamed from: k  reason: collision with root package name */
        public final q f12965k;
        @n6.d
        @s4.e

        /* renamed from: l  reason: collision with root package name */
        public d f12966l;

        /* renamed from: m  reason: collision with root package name */
        public long f12967m;

        /* renamed from: n  reason: collision with root package name */
        public long f12968n;
        @n6.e
        private volatile Object nextParkedWorker;

        /* renamed from: o  reason: collision with root package name */
        public int f12969o;
        @s4.e

        /* renamed from: p  reason: collision with root package name */
        public boolean f12970p;
        @n6.d
        volatile /* synthetic */ int workerCtl;

        public c() {
            setDaemon(true);
            this.f12965k = new q();
            this.f12966l = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f12951v;
            this.f12969o = b5.f.f7260k.l();
        }

        public final void b(int i7) {
            if (i7 == 0) {
                return;
            }
            a.f12949t.addAndGet(a.this, a.H);
            if (this.f12966l != d.TERMINATED) {
                this.f12966l = d.DORMANT;
            }
        }

        public final void c(int i7) {
            if (i7 != 0 && t(d.BLOCKING)) {
                a.this.d0();
            }
        }

        public final void d(k kVar) {
            int M0 = kVar.f12999l.M0();
            j(M0);
            c(M0);
            a.this.S(kVar);
            b(M0);
        }

        public final k e(boolean z6) {
            k n7;
            k n8;
            if (z6) {
                boolean z7 = l(a.this.f12956k * 2) == 0;
                if (z7 && (n8 = n()) != null) {
                    return n8;
                }
                k h7 = this.f12965k.h();
                if (h7 != null) {
                    return h7;
                }
                if (!z7 && (n7 = n()) != null) {
                    return n7;
                }
            } else {
                k n9 = n();
                if (n9 != null) {
                    return n9;
                }
            }
            return u(false);
        }

        @n6.e
        public final k f(boolean z6) {
            k g7;
            if (r()) {
                return e(z6);
            }
            if (z6) {
                g7 = this.f12965k.h();
                if (g7 == null) {
                    g7 = a.this.f12961p.g();
                }
            } else {
                g7 = a.this.f12961p.g();
            }
            return g7 == null ? u(true) : g7;
        }

        public final int g() {
            return this.indexInArray;
        }

        @n6.e
        public final Object h() {
            return this.nextParkedWorker;
        }

        @n6.d
        public final a i() {
            return a.this;
        }

        public final void j(int i7) {
            this.f12967m = 0L;
            if (this.f12966l == d.PARKING) {
                this.f12966l = d.BLOCKING;
            }
        }

        public final boolean k() {
            return this.nextParkedWorker != a.f12951v;
        }

        public final int l(int i7) {
            int i8 = this.f12969o;
            int i9 = i8 ^ (i8 << 13);
            int i10 = i9 ^ (i9 >> 17);
            int i11 = i10 ^ (i10 << 5);
            this.f12969o = i11;
            int i12 = i7 - 1;
            return (i12 & i7) == 0 ? i11 & i12 : (i11 & Integer.MAX_VALUE) % i7;
        }

        public final void m() {
            if (this.f12967m == 0) {
                this.f12967m = System.nanoTime() + a.this.f12958m;
            }
            LockSupport.parkNanos(a.this.f12958m);
            if (System.nanoTime() - this.f12967m >= 0) {
                this.f12967m = 0L;
                v();
            }
        }

        public final k n() {
            if (l(2) == 0) {
                k g7 = a.this.f12960o.g();
                return g7 != null ? g7 : a.this.f12961p.g();
            }
            k g8 = a.this.f12961p.g();
            return g8 != null ? g8 : a.this.f12960o.g();
        }

        public final void o() {
            loop0: while (true) {
                boolean z6 = false;
                while (!a.this.E() && this.f12966l != d.TERMINATED) {
                    k f7 = f(this.f12970p);
                    if (f7 != null) {
                        this.f12968n = 0L;
                        d(f7);
                    } else {
                        this.f12970p = false;
                        if (this.f12968n == 0) {
                            s();
                        } else if (z6) {
                            t(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f12968n);
                            this.f12968n = 0L;
                        } else {
                            z6 = true;
                        }
                    }
                }
            }
            t(d.TERMINATED);
        }

        public final void p(int i7) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f12959n);
            sb.append("-worker-");
            sb.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
            setName(sb.toString());
            this.indexInArray = i7;
        }

        public final void q(@n6.e Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r() {
            boolean z6;
            if (this.f12966l == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            while (true) {
                long j7 = aVar.controlState;
                if (((int) ((a.D & j7) >> 42)) == 0) {
                    z6 = false;
                    break;
                }
                if (a.f12949t.compareAndSet(aVar, j7, j7 - 4398046511104L)) {
                    z6 = true;
                    break;
                }
            }
            if (z6) {
                this.f12966l = d.CPU_ACQUIRED;
                return true;
            }
            return false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            o();
        }

        public final void s() {
            if (!k()) {
                a.this.O(this);
                return;
            }
            this.workerCtl = -1;
            while (k() && this.workerCtl == -1 && !a.this.E() && this.f12966l != d.TERMINATED) {
                t(d.PARKING);
                Thread.interrupted();
                m();
            }
        }

        public final boolean t(@n6.d d dVar) {
            d dVar2 = this.f12966l;
            boolean z6 = dVar2 == d.CPU_ACQUIRED;
            if (z6) {
                a.f12949t.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f12966l = dVar;
            }
            return z6;
        }

        public final k u(boolean z6) {
            int i7 = (int) (a.this.controlState & 2097151);
            if (i7 < 2) {
                return null;
            }
            int l7 = l(i7);
            a aVar = a.this;
            long j7 = Long.MAX_VALUE;
            for (int i8 = 0; i8 < i7; i8++) {
                l7++;
                if (l7 > i7) {
                    l7 = 1;
                }
                c b7 = aVar.f12962q.b(l7);
                if (b7 != null && b7 != this) {
                    long k7 = z6 ? this.f12965k.k(b7.f12965k) : this.f12965k.l(b7.f12965k);
                    if (k7 == -1) {
                        return this.f12965k.h();
                    }
                    if (k7 > 0) {
                        j7 = Math.min(j7, k7);
                    }
                }
            }
            if (j7 == Long.MAX_VALUE) {
                j7 = 0;
            }
            this.f12968n = j7;
            return null;
        }

        public final void v() {
            a aVar = a.this;
            synchronized (aVar.f12962q) {
                if (aVar.E()) {
                    return;
                }
                if (((int) (aVar.controlState & 2097151)) <= aVar.f12956k) {
                    return;
                }
                if (f12964r.compareAndSet(this, -1, 1)) {
                    int i7 = this.indexInArray;
                    p(0);
                    aVar.Q(this, i7, 0);
                    int andDecrement = (int) (a.f12949t.getAndDecrement(aVar) & 2097151);
                    if (andDecrement != i7) {
                        c b7 = aVar.f12962q.b(andDecrement);
                        l0.m(b7);
                        c cVar = b7;
                        aVar.f12962q.c(i7, cVar);
                        cVar.p(i7);
                        aVar.Q(cVar, andDecrement, i7);
                    }
                    aVar.f12962q.c(andDecrement, null);
                    m2 m2Var = m2.f17815a;
                    this.f12966l = d.TERMINATED;
                }
            }
        }

        public c(a aVar, int i7) {
            this();
            p(i7);
        }
    }

    public /* synthetic */ a(int i7, int i8, long j7, String str, int i9, w wVar) {
        this(i7, i8, (i9 & 4) != 0 ? o.f13006e : j7, (i9 & 8) != 0 ? o.f13002a : str);
    }
}
