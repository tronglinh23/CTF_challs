package x5;

import i0.k0;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import r5.h0;
import u4.l0;
import u4.w;
import v3.m2;
import x5.e;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: f  reason: collision with root package name */
    public static final a f18480f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final long f18481a;

    /* renamed from: b  reason: collision with root package name */
    public final w5.c f18482b;

    /* renamed from: c  reason: collision with root package name */
    public final b f18483c;

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentLinkedQueue<f> f18484d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18485e;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.d
        public final h a(@n6.d r5.k kVar) {
            l0.p(kVar, "connectionPool");
            return kVar.c();
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends w5.a {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // w5.a
        public long f() {
            return h.this.b(System.nanoTime());
        }
    }

    public h(@n6.d w5.d dVar, int i7, long j7, @n6.d TimeUnit timeUnit) {
        l0.p(dVar, "taskRunner");
        l0.p(timeUnit, "timeUnit");
        this.f18485e = i7;
        this.f18481a = timeUnit.toNanos(j7);
        this.f18482b = dVar.j();
        this.f18483c = new b(s5.d.f16659i + " ConnectionPool");
        this.f18484d = new ConcurrentLinkedQueue<>();
        if (j7 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j7).toString());
    }

    public final boolean a(@n6.d r5.a aVar, @n6.d e eVar, @n6.e List<h0> list, boolean z6) {
        l0.p(aVar, "address");
        l0.p(eVar, k0.E0);
        Iterator<f> it = this.f18484d.iterator();
        while (it.hasNext()) {
            f next = it.next();
            l0.o(next, a6.g.f398i);
            synchronized (next) {
                if (z6) {
                    if (!next.C()) {
                        m2 m2Var = m2.f17815a;
                    }
                }
                if (next.A(aVar, list)) {
                    eVar.j(next);
                    return true;
                }
                m2 m2Var2 = m2.f17815a;
            }
        }
        return false;
    }

    public final long b(long j7) {
        Iterator<f> it = this.f18484d.iterator();
        int i7 = 0;
        long j8 = Long.MIN_VALUE;
        f fVar = null;
        int i8 = 0;
        while (it.hasNext()) {
            f next = it.next();
            l0.o(next, a6.g.f398i);
            synchronized (next) {
                if (g(next, j7) > 0) {
                    i8++;
                } else {
                    i7++;
                    long w6 = j7 - next.w();
                    if (w6 > j8) {
                        m2 m2Var = m2.f17815a;
                        fVar = next;
                        j8 = w6;
                    } else {
                        m2 m2Var2 = m2.f17815a;
                    }
                }
            }
        }
        long j9 = this.f18481a;
        if (j8 < j9 && i7 <= this.f18485e) {
            if (i7 > 0) {
                return j9 - j8;
            }
            if (i8 > 0) {
                return j9;
            }
            return -1L;
        }
        l0.m(fVar);
        synchronized (fVar) {
            if ((!fVar.u().isEmpty()) == true) {
                return 0L;
            }
            if (fVar.w() + j8 != j7) {
                return 0L;
            }
            fVar.J(true);
            this.f18484d.remove(fVar);
            s5.d.n(fVar.d());
            if (this.f18484d.isEmpty()) {
                this.f18482b.a();
            }
            return 0L;
        }
    }

    public final boolean c(@n6.d f fVar) {
        l0.p(fVar, a6.g.f398i);
        if (s5.d.f16658h && !Thread.holdsLock(fVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(fVar);
            throw new AssertionError(sb.toString());
        } else if (!fVar.x() && this.f18485e != 0) {
            w5.c.p(this.f18482b, this.f18483c, 0L, 2, null);
            return false;
        } else {
            fVar.J(true);
            this.f18484d.remove(fVar);
            if (this.f18484d.isEmpty()) {
                this.f18482b.a();
            }
            return true;
        }
    }

    public final int d() {
        return this.f18484d.size();
    }

    public final void e() {
        Socket socket;
        Iterator<f> it = this.f18484d.iterator();
        l0.o(it, "connections.iterator()");
        while (it.hasNext()) {
            f next = it.next();
            l0.o(next, a6.g.f398i);
            synchronized (next) {
                if (next.u().isEmpty()) {
                    it.remove();
                    next.J(true);
                    socket = next.d();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                s5.d.n(socket);
            }
        }
        if (this.f18484d.isEmpty()) {
            this.f18482b.a();
        }
    }

    public final int f() {
        boolean isEmpty;
        ConcurrentLinkedQueue<f> concurrentLinkedQueue = this.f18484d;
        int i7 = 0;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (f fVar : concurrentLinkedQueue) {
                l0.o(fVar, "it");
                synchronized (fVar) {
                    isEmpty = fVar.u().isEmpty();
                }
                if (isEmpty && (i7 = i7 + 1) < 0) {
                    x3.w.V();
                }
            }
        }
        return i7;
    }

    public final int g(f fVar, long j7) {
        if (s5.d.f16658h && !Thread.holdsLock(fVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(fVar);
            throw new AssertionError(sb.toString());
        }
        List<Reference<e>> u6 = fVar.u();
        int i7 = 0;
        while (i7 < u6.size()) {
            Reference<e> reference = u6.get(i7);
            if (reference.get() != null) {
                i7++;
            } else {
                c6.j.f8005e.g().o("A connection to " + fVar.c().d().w() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                u6.remove(i7);
                fVar.J(true);
                if (u6.isEmpty()) {
                    fVar.I(j7 - this.f18481a);
                    return 0;
                }
            }
        }
        return u6.size();
    }

    public final void h(@n6.d f fVar) {
        l0.p(fVar, a6.g.f398i);
        if (!s5.d.f16658h || Thread.holdsLock(fVar)) {
            this.f18484d.add(fVar);
            w5.c.p(this.f18482b, this.f18483c, 0L, 2, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(fVar);
        throw new AssertionError(sb.toString());
    }
}
