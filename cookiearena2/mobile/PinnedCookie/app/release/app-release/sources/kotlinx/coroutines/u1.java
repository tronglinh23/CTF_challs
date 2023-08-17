package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.e1;
/* loaded from: classes.dex */
public abstract class u1 extends v1 implements e1 {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13117p = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_queue");

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13118q = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_delayed");
    @n6.d
    private volatile /* synthetic */ Object _queue = null;
    @n6.d
    private volatile /* synthetic */ Object _delayed = null;
    @n6.d
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes.dex */
    public final class a extends c {
        @n6.d

        /* renamed from: m  reason: collision with root package name */
        public final q<v3.m2> f13119m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j7, @n6.d q<? super v3.m2> qVar) {
            super(j7);
            this.f13119m = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13119m.r(u1.this, v3.m2.f17815a);
        }

        @Override // kotlinx.coroutines.u1.c
        @n6.d
        public String toString() {
            return super.toString() + this.f13119m;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends c {
        @n6.d

        /* renamed from: m  reason: collision with root package name */
        public final Runnable f13121m;

        public b(long j7, @n6.d Runnable runnable) {
            super(j7);
            this.f13121m = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13121m.run();
        }

        @Override // kotlinx.coroutines.u1.c
        @n6.d
        public String toString() {
            return super.toString() + this.f13121m;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c implements Runnable, Comparable<c>, p1, kotlinx.coroutines.internal.b1 {
        @n6.e
        private volatile Object _heap;
        @s4.e

        /* renamed from: k  reason: collision with root package name */
        public long f13122k;

        /* renamed from: l  reason: collision with root package name */
        public int f13123l = -1;

        public c(long j7) {
            this.f13122k = j7;
        }

        @Override // kotlinx.coroutines.internal.b1
        public void c(int i7) {
            this.f13123l = i7;
        }

        @Override // kotlinx.coroutines.internal.b1
        public void d(@n6.e kotlinx.coroutines.internal.a1<?> a1Var) {
            kotlinx.coroutines.internal.r0 r0Var;
            Object obj = this._heap;
            r0Var = x1.f13163a;
            if (!(obj != r0Var)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = a1Var;
        }

        @Override // kotlinx.coroutines.internal.b1
        @n6.e
        public kotlinx.coroutines.internal.a1<?> e() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.a1) {
                return (kotlinx.coroutines.internal.a1) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.b1
        public int h() {
            return this.f13123l;
        }

        @Override // java.lang.Comparable
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public int compareTo(@n6.d c cVar) {
            int i7 = ((this.f13122k - cVar.f13122k) > 0L ? 1 : ((this.f13122k - cVar.f13122k) == 0L ? 0 : -1));
            if (i7 > 0) {
                return 1;
            }
            return i7 < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.p1
        public final synchronized void j() {
            kotlinx.coroutines.internal.r0 r0Var;
            kotlinx.coroutines.internal.r0 r0Var2;
            Object obj = this._heap;
            r0Var = x1.f13163a;
            if (obj == r0Var) {
                return;
            }
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                dVar.k(this);
            }
            r0Var2 = x1.f13163a;
            this._heap = r0Var2;
        }

        public final synchronized int k(long j7, @n6.d d dVar, @n6.d u1 u1Var) {
            kotlinx.coroutines.internal.r0 r0Var;
            Object obj = this._heap;
            r0Var = x1.f13163a;
            if (obj == r0Var) {
                return 2;
            }
            synchronized (dVar) {
                c f7 = dVar.f();
                if (u1Var.l()) {
                    return 1;
                }
                if (f7 == null) {
                    dVar.f13124b = j7;
                } else {
                    long j8 = f7.f13122k;
                    if (j8 - j7 < 0) {
                        j7 = j8;
                    }
                    if (j7 - dVar.f13124b > 0) {
                        dVar.f13124b = j7;
                    }
                }
                long j9 = this.f13122k;
                long j10 = dVar.f13124b;
                if (j9 - j10 < 0) {
                    this.f13122k = j10;
                }
                dVar.a(this);
                return 0;
            }
        }

        public final boolean l(long j7) {
            return j7 - this.f13122k >= 0;
        }

        @n6.d
        public String toString() {
            return "Delayed[nanos=" + this.f13122k + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends kotlinx.coroutines.internal.a1<c> {
        @s4.e

        /* renamed from: b  reason: collision with root package name */
        public long f13124b;

        public d(long j7) {
            this.f13124b = j7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean l() {
        return this._isCompleted;
    }

    @n6.d
    public final p1 A1(long j7, @n6.d Runnable runnable) {
        long d7 = x1.d(j7);
        if (d7 < 4611686018427387903L) {
            kotlinx.coroutines.b b7 = kotlinx.coroutines.c.b();
            long b8 = b7 != null ? b7.b() : System.nanoTime();
            b bVar = new b(d7 + b8, runnable);
            y1(b8, bVar);
            return bVar;
        }
        return c3.f11860k;
    }

    public final void B1(boolean z6) {
        this._isCompleted = z6 ? 1 : 0;
    }

    public final boolean C1(c cVar) {
        d dVar = (d) this._delayed;
        return (dVar != null ? dVar.i() : null) == cVar;
    }

    @Override // kotlinx.coroutines.e1
    @v3.k(level = v3.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @n6.e
    public Object O0(long j7, @n6.d e4.d<? super v3.m2> dVar) {
        return e1.a.a(this, j7, dVar);
    }

    @Override // kotlinx.coroutines.o0
    public final void V0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        u1(runnable);
    }

    @Override // kotlinx.coroutines.t1
    public long e1() {
        c i7;
        kotlinx.coroutines.internal.r0 r0Var;
        if (super.e1() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.b0)) {
                r0Var = x1.f13170h;
                return obj == r0Var ? Long.MAX_VALUE : 0L;
            } else if (!((kotlinx.coroutines.internal.b0) obj).h()) {
                return 0L;
            }
        }
        d dVar = (d) this._delayed;
        if (dVar == null || (i7 = dVar.i()) == null) {
            return Long.MAX_VALUE;
        }
        long j7 = i7.f13122k;
        kotlinx.coroutines.b b7 = kotlinx.coroutines.c.b();
        return d5.u.v(j7 - (b7 != null ? b7.b() : System.nanoTime()), 0L);
    }

    @Override // kotlinx.coroutines.t1
    public boolean h1() {
        kotlinx.coroutines.internal.r0 r0Var;
        if (j1()) {
            d dVar = (d) this._delayed;
            if (dVar == null || dVar.h()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof kotlinx.coroutines.internal.b0) {
                        return ((kotlinx.coroutines.internal.b0) obj).h();
                    }
                    r0Var = x1.f13170h;
                    if (obj != r0Var) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // kotlinx.coroutines.t1
    public long k1() {
        c cVar;
        if (l1()) {
            return 0L;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.h()) {
            kotlinx.coroutines.b b7 = kotlinx.coroutines.c.b();
            long b8 = b7 != null ? b7.b() : System.nanoTime();
            do {
                synchronized (dVar) {
                    c f7 = dVar.f();
                    if (f7 != null) {
                        c cVar2 = f7;
                        cVar = cVar2.l(b8) ? v1(cVar2) : false ? dVar.l(0) : null;
                    }
                }
            } while (cVar != null);
        }
        Runnable t12 = t1();
        if (t12 != null) {
            t12.run();
            return 0L;
        }
        return e1();
    }

    @Override // kotlinx.coroutines.e1
    public void m(long j7, @n6.d q<? super v3.m2> qVar) {
        long d7 = x1.d(j7);
        if (d7 < 4611686018427387903L) {
            kotlinx.coroutines.b b7 = kotlinx.coroutines.c.b();
            long b8 = b7 != null ? b7.b() : System.nanoTime();
            a aVar = new a(d7 + b8, qVar);
            y1(b8, aVar);
            t.a(qVar, aVar);
        }
    }

    @Override // kotlinx.coroutines.t1
    public void n1() {
        u3.f13126a.c();
        B1(true);
        s1();
        do {
        } while (k1() <= 0);
        w1();
    }

    public final void s1() {
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13117p;
                r0Var = x1.f13170h;
                if (p.b.a(atomicReferenceFieldUpdater, this, null, r0Var)) {
                    return;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.b0) {
                ((kotlinx.coroutines.internal.b0) obj).d();
                return;
            } else {
                r0Var2 = x1.f13170h;
                if (obj == r0Var2) {
                    return;
                }
                kotlinx.coroutines.internal.b0 b0Var = new kotlinx.coroutines.internal.b0(8, true);
                b0Var.a((Runnable) obj);
                if (p.b.a(f13117p, this, obj, b0Var)) {
                    return;
                }
            }
        }
    }

    public final Runnable t1() {
        kotlinx.coroutines.internal.r0 r0Var;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.b0) {
                kotlinx.coroutines.internal.b0 b0Var = (kotlinx.coroutines.internal.b0) obj;
                Object l7 = b0Var.l();
                if (l7 != kotlinx.coroutines.internal.b0.f12777t) {
                    return (Runnable) l7;
                }
                p.b.a(f13117p, this, obj, b0Var.k());
            } else {
                r0Var = x1.f13170h;
                if (obj == r0Var) {
                    return null;
                }
                if (p.b.a(f13117p, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    public void u1(@n6.d Runnable runnable) {
        if (v1(runnable)) {
            q1();
        } else {
            a1.f11839r.u1(runnable);
        }
    }

    public final boolean v1(Runnable runnable) {
        kotlinx.coroutines.internal.r0 r0Var;
        while (true) {
            Object obj = this._queue;
            if (l()) {
                return false;
            }
            if (obj == null) {
                if (p.b.a(f13117p, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.b0) {
                kotlinx.coroutines.internal.b0 b0Var = (kotlinx.coroutines.internal.b0) obj;
                int a7 = b0Var.a(runnable);
                if (a7 == 0) {
                    return true;
                }
                if (a7 == 1) {
                    p.b.a(f13117p, this, obj, b0Var.k());
                } else if (a7 == 2) {
                    return false;
                }
            } else {
                r0Var = x1.f13170h;
                if (obj == r0Var) {
                    return false;
                }
                kotlinx.coroutines.internal.b0 b0Var2 = new kotlinx.coroutines.internal.b0(8, true);
                b0Var2.a((Runnable) obj);
                b0Var2.a(runnable);
                if (p.b.a(f13117p, this, obj, b0Var2)) {
                    return true;
                }
            }
        }
    }

    public final void w1() {
        c n7;
        kotlinx.coroutines.b b7 = kotlinx.coroutines.c.b();
        long b8 = b7 != null ? b7.b() : System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar == null || (n7 = dVar.n()) == null) {
                return;
            }
            p1(b8, n7);
        }
    }

    public final void x1() {
        this._queue = null;
        this._delayed = null;
    }

    public final void y1(long j7, @n6.d c cVar) {
        int z12 = z1(j7, cVar);
        if (z12 == 0) {
            if (C1(cVar)) {
                q1();
            }
        } else if (z12 == 1) {
            p1(j7, cVar);
        } else if (z12 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @n6.d
    public p1 z0(long j7, @n6.d Runnable runnable, @n6.d e4.g gVar) {
        return e1.a.b(this, j7, runnable, gVar);
    }

    public final int z1(long j7, c cVar) {
        if (l()) {
            return 1;
        }
        d dVar = (d) this._delayed;
        if (dVar == null) {
            p.b.a(f13118q, this, null, new d(j7));
            Object obj = this._delayed;
            u4.l0.m(obj);
            dVar = (d) obj;
        }
        return cVar.k(j7, dVar, this);
    }
}
