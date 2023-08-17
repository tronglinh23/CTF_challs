package w5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import n6.e;
import u4.l0;
import v3.m2;
import x3.e0;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f18216a;
    @e

    /* renamed from: b  reason: collision with root package name */
    public w5.a f18217b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final List<w5.a> f18218c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18219d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public final d f18220e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public final String f18221f;

    /* loaded from: classes.dex */
    public static final class a extends w5.a {
        @n6.d

        /* renamed from: e  reason: collision with root package name */
        public final CountDownLatch f18222e;

        public a() {
            super(s5.d.f16659i + " awaitIdle", false);
            this.f18222e = new CountDownLatch(1);
        }

        @Override // w5.a
        public long f() {
            this.f18222e.countDown();
            return -1L;
        }

        @n6.d
        public final CountDownLatch i() {
            return this.f18222e;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends w5.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ t4.a f18223e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f18224f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ boolean f18225g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t4.a aVar, String str, boolean z6, String str2, boolean z7) {
            super(str2, z7);
            this.f18223e = aVar;
            this.f18224f = str;
            this.f18225g = z6;
        }

        @Override // w5.a
        public long f() {
            this.f18223e.n();
            return -1L;
        }
    }

    /* renamed from: w5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0259c extends w5.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ t4.a f18226e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f18227f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0259c(t4.a aVar, String str, String str2) {
            super(str2, false, 2, null);
            this.f18226e = aVar;
            this.f18227f = str;
        }

        @Override // w5.a
        public long f() {
            return ((Number) this.f18226e.n()).longValue();
        }
    }

    public c(@n6.d d dVar, @n6.d String str) {
        l0.p(dVar, "taskRunner");
        l0.p(str, "name");
        this.f18220e = dVar;
        this.f18221f = str;
        this.f18218c = new ArrayList();
    }

    public static /* synthetic */ void d(c cVar, String str, long j7, boolean z6, t4.a aVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j7 = 0;
        }
        if ((i7 & 4) != 0) {
            z6 = true;
        }
        boolean z7 = z6;
        l0.p(str, "name");
        l0.p(aVar, "block");
        cVar.n(new b(aVar, str, z7, str, z7), j7);
    }

    public static /* synthetic */ void o(c cVar, String str, long j7, t4.a aVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j7 = 0;
        }
        l0.p(str, "name");
        l0.p(aVar, "block");
        cVar.n(new C0259c(aVar, str, str), j7);
    }

    public static /* synthetic */ void p(c cVar, w5.a aVar, long j7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j7 = 0;
        }
        cVar.n(aVar, j7);
    }

    public final void a() {
        if (!s5.d.f16658h || !Thread.holdsLock(this)) {
            synchronized (this.f18220e) {
                if (b()) {
                    this.f18220e.i(this);
                }
                m2 m2Var = m2.f17815a;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final boolean b() {
        w5.a aVar = this.f18217b;
        if (aVar != null) {
            l0.m(aVar);
            if (aVar.a()) {
                this.f18219d = true;
            }
        }
        boolean z6 = false;
        for (int size = this.f18218c.size() - 1; size >= 0; size--) {
            if (this.f18218c.get(size).a()) {
                w5.a aVar2 = this.f18218c.get(size);
                if (d.f18230j.a().isLoggable(Level.FINE)) {
                    w5.b.c(aVar2, this, "canceled");
                }
                this.f18218c.remove(size);
                z6 = true;
            }
        }
        return z6;
    }

    public final void c(@n6.d String str, long j7, boolean z6, @n6.d t4.a<m2> aVar) {
        l0.p(str, "name");
        l0.p(aVar, "block");
        n(new b(aVar, str, z6, str, z6), j7);
    }

    @e
    public final w5.a e() {
        return this.f18217b;
    }

    public final boolean f() {
        return this.f18219d;
    }

    @n6.d
    public final List<w5.a> g() {
        return this.f18218c;
    }

    @n6.d
    public final String h() {
        return this.f18221f;
    }

    @n6.d
    public final List<w5.a> i() {
        List<w5.a> Q5;
        synchronized (this.f18220e) {
            Q5 = e0.Q5(this.f18218c);
        }
        return Q5;
    }

    public final boolean j() {
        return this.f18216a;
    }

    @n6.d
    public final d k() {
        return this.f18220e;
    }

    @n6.d
    public final CountDownLatch l() {
        synchronized (this.f18220e) {
            if (this.f18217b == null && this.f18218c.isEmpty()) {
                return new CountDownLatch(0);
            }
            w5.a aVar = this.f18217b;
            if (aVar instanceof a) {
                return ((a) aVar).i();
            }
            for (w5.a aVar2 : this.f18218c) {
                if (aVar2 instanceof a) {
                    return ((a) aVar2).i();
                }
            }
            a aVar3 = new a();
            if (q(aVar3, 0L, false)) {
                this.f18220e.i(this);
            }
            return aVar3.i();
        }
    }

    public final void m(@n6.d String str, long j7, @n6.d t4.a<Long> aVar) {
        l0.p(str, "name");
        l0.p(aVar, "block");
        n(new C0259c(aVar, str, str), j7);
    }

    public final void n(@n6.d w5.a aVar, long j7) {
        l0.p(aVar, "task");
        synchronized (this.f18220e) {
            if (!this.f18216a) {
                if (q(aVar, j7, false)) {
                    this.f18220e.i(this);
                }
                m2 m2Var = m2.f17815a;
            } else if (aVar.a()) {
                if (d.f18230j.a().isLoggable(Level.FINE)) {
                    w5.b.c(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.f18230j.a().isLoggable(Level.FINE)) {
                    w5.b.c(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean q(@n6.d w5.a aVar, long j7, boolean z6) {
        String str;
        l0.p(aVar, "task");
        aVar.e(this);
        long d7 = this.f18220e.h().d();
        long j8 = d7 + j7;
        int indexOf = this.f18218c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.c() <= j8) {
                if (d.f18230j.a().isLoggable(Level.FINE)) {
                    w5.b.c(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f18218c.remove(indexOf);
        }
        aVar.g(j8);
        if (d.f18230j.a().isLoggable(Level.FINE)) {
            if (z6) {
                str = "run again after " + w5.b.b(j8 - d7);
            } else {
                str = "scheduled after " + w5.b.b(j8 - d7);
            }
            w5.b.c(aVar, this, str);
        }
        Iterator<w5.a> it = this.f18218c.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (it.next().c() - d7 > j7) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            i7 = this.f18218c.size();
        }
        this.f18218c.add(i7, aVar);
        return i7 == 0;
    }

    public final void r(@e w5.a aVar) {
        this.f18217b = aVar;
    }

    public final void s(boolean z6) {
        this.f18219d = z6;
    }

    public final void t(boolean z6) {
        this.f18216a = z6;
    }

    @n6.d
    public String toString() {
        return this.f18221f;
    }

    public final void u() {
        if (!s5.d.f16658h || !Thread.holdsLock(this)) {
            synchronized (this.f18220e) {
                this.f18216a = true;
                if (b()) {
                    this.f18220e.i(this);
                }
                m2 m2Var = m2.f17815a;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }
}
