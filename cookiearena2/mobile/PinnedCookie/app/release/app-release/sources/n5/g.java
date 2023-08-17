package n5;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import v3.m2;
/* loaded from: classes.dex */
public final class g<E> extends c<E> implements i<E> {
    @n6.d
    private volatile /* synthetic */ long _head;
    @n6.d
    private volatile /* synthetic */ int _size;
    @n6.d
    private volatile /* synthetic */ long _tail;

    /* renamed from: n  reason: collision with root package name */
    public final int f13926n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final ReentrantLock f13927o;
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public final Object[] f13928p;
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public final List<a<E>> f13929q;

    /* loaded from: classes.dex */
    public static final class a<E> extends n5.a<E> implements i0<E> {
        @n6.d
        private volatile /* synthetic */ long _subHead;
        @n6.d

        /* renamed from: n  reason: collision with root package name */
        public final g<E> f13930n;
        @n6.d

        /* renamed from: o  reason: collision with root package name */
        public final ReentrantLock f13931o;

        public a(@n6.d g<E> gVar) {
            super(null);
            this.f13930n = gVar;
            this.f13931o = new ReentrantLock();
            this._subHead = 0L;
        }

        @Override // n5.c
        public boolean C() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // n5.c
        public boolean D() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // n5.a
        public boolean h0() {
            return false;
        }

        @Override // n5.a
        public boolean i0() {
            return v0() >= this.f13930n.h0();
        }

        @Override // n5.a
        @n6.e
        public Object o0() {
            boolean z6;
            ReentrantLock reentrantLock = this.f13931o;
            reentrantLock.lock();
            try {
                Object x02 = x0();
                if ((x02 instanceof w) || x02 == b.f13904f) {
                    z6 = false;
                } else {
                    y0(v0() + 1);
                    z6 = true;
                }
                reentrantLock.unlock();
                w wVar = x02 instanceof w ? (w) x02 : null;
                if (wVar != null) {
                    w(wVar.f14213n);
                }
                if (u0() ? true : z6) {
                    g.m0(this.f13930n, null, null, 3, null);
                }
                return x02;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // n5.a
        @n6.e
        public Object p0(@n6.d kotlinx.coroutines.selects.f<?> fVar) {
            ReentrantLock reentrantLock = this.f13931o;
            reentrantLock.lock();
            try {
                Object x02 = x0();
                boolean z6 = false;
                if (!(x02 instanceof w) && x02 != b.f13904f) {
                    if (fVar.S()) {
                        y0(v0() + 1);
                        z6 = true;
                    } else {
                        x02 = kotlinx.coroutines.selects.g.d();
                    }
                }
                reentrantLock.unlock();
                w wVar = x02 instanceof w ? (w) x02 : null;
                if (wVar != null) {
                    w(wVar.f14213n);
                }
                if (u0() ? true : z6) {
                    g.m0(this.f13930n, null, null, 3, null);
                }
                return x02;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
            r2 = (n5.w) r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean u0() {
            /*
                r8 = this;
                r0 = 0
            L1:
                boolean r1 = r8.w0()
                r2 = 0
                if (r1 == 0) goto L59
                java.util.concurrent.locks.ReentrantLock r1 = r8.f13931o
                boolean r1 = r1.tryLock()
                if (r1 == 0) goto L59
                java.lang.Object r1 = r8.x0()     // Catch: java.lang.Throwable -> L52
                kotlinx.coroutines.internal.r0 r3 = n5.b.f13904f     // Catch: java.lang.Throwable -> L52
                if (r1 != r3) goto L1e
            L18:
                java.util.concurrent.locks.ReentrantLock r1 = r8.f13931o
                r1.unlock()
                goto L1
            L1e:
                boolean r3 = r1 instanceof n5.w     // Catch: java.lang.Throwable -> L52
                if (r3 == 0) goto L2b
                r2 = r1
                n5.w r2 = (n5.w) r2     // Catch: java.lang.Throwable -> L52
            L25:
                java.util.concurrent.locks.ReentrantLock r1 = r8.f13931o
                r1.unlock()
                goto L59
            L2b:
                n5.j0 r3 = r8.Q()     // Catch: java.lang.Throwable -> L52
                if (r3 != 0) goto L32
                goto L25
            L32:
                boolean r4 = r3 instanceof n5.w     // Catch: java.lang.Throwable -> L52
                if (r4 == 0) goto L37
                goto L25
            L37:
                kotlinx.coroutines.internal.r0 r2 = r3.c0(r1, r2)     // Catch: java.lang.Throwable -> L52
                if (r2 != 0) goto L3e
                goto L18
            L3e:
                long r4 = r8.v0()     // Catch: java.lang.Throwable -> L52
                r6 = 1
                long r4 = r4 + r6
                r8.y0(r4)     // Catch: java.lang.Throwable -> L52
                java.util.concurrent.locks.ReentrantLock r0 = r8.f13931o
                r0.unlock()
                r3.A(r1)
                r0 = 1
                goto L1
            L52:
                r0 = move-exception
                java.util.concurrent.locks.ReentrantLock r1 = r8.f13931o
                r1.unlock()
                throw r0
            L59:
                if (r2 == 0) goto L60
                java.lang.Throwable r1 = r2.f14213n
                r8.w(r1)
            L60:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.g.a.u0():boolean");
        }

        public final long v0() {
            return this._subHead;
        }

        @Override // n5.c, n5.m0
        public boolean w(@n6.e Throwable th) {
            boolean w6 = super.w(th);
            if (w6) {
                g.m0(this.f13930n, null, this, 1, null);
                ReentrantLock reentrantLock = this.f13931o;
                reentrantLock.lock();
                try {
                    y0(this.f13930n.h0());
                    m2 m2Var = m2.f17815a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return w6;
        }

        public final boolean w0() {
            if (o() != null) {
                return false;
            }
            return (i0() && this.f13930n.o() == null) ? false : true;
        }

        public final Object x0() {
            long v02 = v0();
            w<?> o6 = this.f13930n.o();
            if (v02 < this.f13930n.h0()) {
                Object c02 = this.f13930n.c0(v02);
                w<?> o7 = o();
                return o7 != null ? o7 : c02;
            } else if (o6 == null) {
                w<?> o8 = o();
                return o8 == null ? b.f13904f : o8;
            } else {
                return o6;
            }
        }

        public final void y0(long j7) {
            this._subHead = j7;
        }
    }

    public g(int i7) {
        super(null);
        this.f13926n = i7;
        if (!(i7 >= 1)) {
            throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + i7 + " was specified").toString());
        }
        this.f13927o = new ReentrantLock();
        this.f13928p = new Object[i7];
        this._head = 0L;
        this._tail = 0L;
        this._size = 0;
        this.f13929q = kotlinx.coroutines.internal.f.d();
    }

    public static /* synthetic */ void g0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m0(g gVar, a aVar, a aVar2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = null;
        }
        if ((i7 & 2) != 0) {
            aVar2 = null;
        }
        gVar.l0(aVar, aVar2);
    }

    @Override // n5.i
    @n6.d
    public i0<E> B() {
        a aVar = new a(this);
        m0(this, aVar, null, 2, null);
        return aVar;
    }

    @Override // n5.c
    public boolean C() {
        return false;
    }

    @Override // n5.c
    public boolean D() {
        return f0() >= this.f13926n;
    }

    @Override // n5.c
    @n6.d
    public Object H(E e7) {
        ReentrantLock reentrantLock = this.f13927o;
        reentrantLock.lock();
        try {
            w<?> p6 = p();
            if (p6 != null) {
                return p6;
            }
            int f02 = f0();
            if (f02 >= this.f13926n) {
                return b.f13903e;
            }
            long h02 = h0();
            this.f13928p[(int) (h02 % this.f13926n)] = e7;
            j0(f02 + 1);
            k0(h02 + 1);
            m2 m2Var = m2.f17815a;
            reentrantLock.unlock();
            Z();
            return b.f13902d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // n5.c
    @n6.d
    public Object I(E e7, @n6.d kotlinx.coroutines.selects.f<?> fVar) {
        ReentrantLock reentrantLock = this.f13927o;
        reentrantLock.lock();
        try {
            w<?> p6 = p();
            if (p6 != null) {
                return p6;
            }
            int f02 = f0();
            if (f02 >= this.f13926n) {
                return b.f13903e;
            }
            if (fVar.S()) {
                long h02 = h0();
                this.f13928p[(int) (h02 % this.f13926n)] = e7;
                j0(f02 + 1);
                k0(h02 + 1);
                m2 m2Var = m2.f17815a;
                reentrantLock.unlock();
                Z();
                return b.f13902d;
            }
            return kotlinx.coroutines.selects.g.d();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // n5.i
    /* renamed from: Y  reason: merged with bridge method [inline-methods] */
    public final boolean b(Throwable th) {
        boolean w6 = w(th);
        Iterator<a<E>> it = this.f13929q.iterator();
        while (it.hasNext()) {
            it.next().b(th);
        }
        return w6;
    }

    public final void Z() {
        boolean z6;
        Iterator<a<E>> it = this.f13929q.iterator();
        boolean z7 = false;
        loop0: while (true) {
            z6 = z7;
            while (it.hasNext()) {
                if (it.next().u0()) {
                    break;
                }
                z6 = true;
            }
            z7 = true;
        }
        if (z7 || !z6) {
            m0(this, null, null, 3, null);
        }
    }

    public final long b0() {
        Iterator<a<E>> it = this.f13929q.iterator();
        long j7 = Long.MAX_VALUE;
        while (it.hasNext()) {
            j7 = d5.u.C(j7, it.next().v0());
        }
        return j7;
    }

    public final E c0(long j7) {
        return (E) this.f13928p[(int) (j7 % this.f13926n)];
    }

    public final int d0() {
        return this.f13926n;
    }

    public final long e0() {
        return this._head;
    }

    @Override // n5.i
    public void f(@n6.e CancellationException cancellationException) {
        b(cancellationException);
    }

    public final int f0() {
        return this._size;
    }

    public final long h0() {
        return this._tail;
    }

    public final void i0(long j7) {
        this._head = j7;
    }

    public final void j0(int i7) {
        this._size = i7;
    }

    public final void k0(long j7) {
        this._tail = j7;
    }

    @Override // n5.c
    @n6.d
    public String l() {
        return "(buffer:capacity=" + this.f13928p.length + ",size=" + f0() + ')';
    }

    public final void l0(a<E> aVar, a<E> aVar2) {
        l0 R;
        while (true) {
            ReentrantLock reentrantLock = this.f13927o;
            reentrantLock.lock();
            if (aVar != null) {
                try {
                    aVar.y0(h0());
                    boolean isEmpty = this.f13929q.isEmpty();
                    this.f13929q.add(aVar);
                    if (!isEmpty) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (aVar2 != null) {
                this.f13929q.remove(aVar2);
                if (e0() != aVar2.v0()) {
                    return;
                }
            }
            long b02 = b0();
            long h02 = h0();
            long e02 = e0();
            long C = d5.u.C(b02, h02);
            if (C <= e02) {
                return;
            }
            int f02 = f0();
            while (e02 < C) {
                Object[] objArr = this.f13928p;
                int i7 = this.f13926n;
                objArr[(int) (e02 % i7)] = null;
                boolean z6 = f02 >= i7;
                e02++;
                i0(e02);
                f02--;
                j0(f02);
                if (z6) {
                    do {
                        R = R();
                        if (R != null && !(R instanceof w)) {
                            u4.l0.m(R);
                        }
                    } while (R.a1(null) == null);
                    this.f13928p[(int) (h02 % this.f13926n)] = R.Y0();
                    j0(f02 + 1);
                    k0(h02 + 1);
                    m2 m2Var = m2.f17815a;
                    reentrantLock.unlock();
                    R.X0();
                    Z();
                    aVar = null;
                    aVar2 = null;
                }
            }
            return;
        }
    }

    @Override // n5.c, n5.m0
    public boolean w(@n6.e Throwable th) {
        if (super.w(th)) {
            Z();
            return true;
        }
        return false;
    }
}
