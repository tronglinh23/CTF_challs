package w5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.x1;
import s4.e;
import u4.l0;
import u4.w;
import v3.m2;
import x3.e0;
/* loaded from: classes.dex */
public final class d {
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f18229i;

    /* renamed from: a  reason: collision with root package name */
    public int f18231a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18232b;

    /* renamed from: c  reason: collision with root package name */
    public long f18233c;

    /* renamed from: d  reason: collision with root package name */
    public final List<w5.c> f18234d;

    /* renamed from: e  reason: collision with root package name */
    public final List<w5.c> f18235e;

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f18236f;
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public final a f18237g;

    /* renamed from: j  reason: collision with root package name */
    public static final b f18230j = new b(null);
    @n6.d
    @e

    /* renamed from: h  reason: collision with root package name */
    public static final d f18228h = new d(new c(s5.d.U(s5.d.f16659i + " TaskRunner", true)));

    /* loaded from: classes.dex */
    public interface a {
        void a(@n6.d d dVar);

        void b(@n6.d d dVar, long j7);

        void c(@n6.d d dVar);

        long d();

        void execute(@n6.d Runnable runnable);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        @n6.d
        public final Logger a() {
            return d.f18229i;
        }

        public /* synthetic */ b(w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadPoolExecutor f18238a;

        public c(@n6.d ThreadFactory threadFactory) {
            l0.p(threadFactory, "threadFactory");
            this.f18238a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // w5.d.a
        public void a(@n6.d d dVar) {
            l0.p(dVar, "taskRunner");
        }

        @Override // w5.d.a
        public void b(@n6.d d dVar, long j7) throws InterruptedException {
            l0.p(dVar, "taskRunner");
            long j8 = j7 / x1.f13167e;
            long j9 = j7 - (x1.f13167e * j8);
            if (j8 > 0 || j7 > 0) {
                dVar.wait(j8, (int) j9);
            }
        }

        @Override // w5.d.a
        public void c(@n6.d d dVar) {
            l0.p(dVar, "taskRunner");
            dVar.notify();
        }

        @Override // w5.d.a
        public long d() {
            return System.nanoTime();
        }

        public final void e() {
            this.f18238a.shutdown();
        }

        @Override // w5.d.a
        public void execute(@n6.d Runnable runnable) {
            l0.p(runnable, "runnable");
            this.f18238a.execute(runnable);
        }
    }

    /* renamed from: w5.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class RunnableC0260d implements Runnable {
        public RunnableC0260d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w5.a e7;
            long j7;
            while (true) {
                synchronized (d.this) {
                    e7 = d.this.e();
                }
                if (e7 == null) {
                    return;
                }
                w5.c d7 = e7.d();
                l0.m(d7);
                boolean isLoggable = d.f18230j.a().isLoggable(Level.FINE);
                if (isLoggable) {
                    j7 = d7.k().h().d();
                    w5.b.c(e7, d7, "starting");
                } else {
                    j7 = -1;
                }
                try {
                    d.this.k(e7);
                    m2 m2Var = m2.f17815a;
                    if (isLoggable) {
                        w5.b.c(e7, d7, "finished run in " + w5.b.b(d7.k().h().d() - j7));
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        w5.b.c(e7, d7, "failed a run in " + w5.b.b(d7.k().h().d() - j7));
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        l0.o(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f18229i = logger;
    }

    public d(@n6.d a aVar) {
        l0.p(aVar, "backend");
        this.f18237g = aVar;
        this.f18231a = 10000;
        this.f18234d = new ArrayList();
        this.f18235e = new ArrayList();
        this.f18236f = new RunnableC0260d();
    }

    @n6.d
    public final List<w5.c> c() {
        List<w5.c> z42;
        synchronized (this) {
            z42 = e0.z4(this.f18234d, this.f18235e);
        }
        return z42;
    }

    public final void d(w5.a aVar, long j7) {
        if (s5.d.f16658h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        w5.c d7 = aVar.d();
        l0.m(d7);
        if (!(d7.e() == aVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean f7 = d7.f();
        d7.s(false);
        d7.r(null);
        this.f18234d.remove(d7);
        if (j7 != -1 && !f7 && !d7.j()) {
            d7.q(aVar, j7, true);
        }
        if ((!d7.g().isEmpty()) == true) {
            this.f18235e.add(d7);
        }
    }

    @n6.e
    public final w5.a e() {
        boolean z6;
        if (s5.d.f16658h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        while (!this.f18235e.isEmpty()) {
            long d7 = this.f18237g.d();
            Iterator<w5.c> it = this.f18235e.iterator();
            long j7 = Long.MAX_VALUE;
            w5.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z6 = false;
                    break;
                }
                w5.a aVar2 = it.next().g().get(0);
                long max = Math.max(0L, aVar2.c() - d7);
                if (max > 0) {
                    j7 = Math.min(max, j7);
                } else if (aVar != null) {
                    z6 = true;
                    break;
                } else {
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                f(aVar);
                if (z6 || (!this.f18232b && (!this.f18235e.isEmpty()) != false)) {
                    this.f18237g.execute(this.f18236f);
                }
                return aVar;
            } else if (this.f18232b) {
                if (j7 < this.f18233c - d7) {
                    this.f18237g.c(this);
                }
                return null;
            } else {
                this.f18232b = true;
                this.f18233c = d7 + j7;
                try {
                    try {
                        this.f18237g.b(this, j7);
                    } catch (InterruptedException unused) {
                        g();
                    }
                } finally {
                    this.f18232b = false;
                }
            }
        }
        return null;
    }

    public final void f(w5.a aVar) {
        if (!s5.d.f16658h || Thread.holdsLock(this)) {
            aVar.g(-1L);
            w5.c d7 = aVar.d();
            l0.m(d7);
            d7.g().remove(aVar);
            this.f18235e.remove(d7);
            d7.r(aVar);
            this.f18234d.add(d7);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void g() {
        for (int size = this.f18234d.size() - 1; size >= 0; size--) {
            this.f18234d.get(size).b();
        }
        for (int size2 = this.f18235e.size() - 1; size2 >= 0; size2--) {
            w5.c cVar = this.f18235e.get(size2);
            cVar.b();
            if (cVar.g().isEmpty()) {
                this.f18235e.remove(size2);
            }
        }
    }

    @n6.d
    public final a h() {
        return this.f18237g;
    }

    public final void i(@n6.d w5.c cVar) {
        l0.p(cVar, "taskQueue");
        if (s5.d.f16658h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (cVar.e() == null) {
            if ((!cVar.g().isEmpty()) == true) {
                s5.d.a(this.f18235e, cVar);
            } else {
                this.f18235e.remove(cVar);
            }
        }
        if (this.f18232b) {
            this.f18237g.c(this);
        } else {
            this.f18237g.execute(this.f18236f);
        }
    }

    @n6.d
    public final w5.c j() {
        int i7;
        synchronized (this) {
            i7 = this.f18231a;
            this.f18231a = i7 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i7);
        return new w5.c(this, sb.toString());
    }

    public final void k(w5.a aVar) {
        if (s5.d.f16658h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        Thread currentThread2 = Thread.currentThread();
        l0.o(currentThread2, "currentThread");
        String name = currentThread2.getName();
        currentThread2.setName(aVar.b());
        try {
            long f7 = aVar.f();
            synchronized (this) {
                d(aVar, f7);
                m2 m2Var = m2.f17815a;
            }
            currentThread2.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                d(aVar, -1L);
                m2 m2Var2 = m2.f17815a;
                currentThread2.setName(name);
                throw th;
            }
        }
    }
}
