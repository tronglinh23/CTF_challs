package n5;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.d1;
import kotlinx.coroutines.internal.r0;
import v3.m2;
/* loaded from: classes.dex */
public class a0<E> extends a<E> {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final ReentrantLock f13897n;
    @n6.e

    /* renamed from: o  reason: collision with root package name */
    public Object f13898o;

    public a0(@n6.e t4.l<? super E, m2> lVar) {
        super(lVar);
        this.f13897n = new ReentrantLock();
        this.f13898o = b.f13901c;
    }

    @Override // n5.c
    public final boolean C() {
        return false;
    }

    @Override // n5.c
    public final boolean D() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
        if ((r1 instanceof n5.w) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
        u4.l0.m(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r1.c0(r4, null) == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        r2 = v3.m2.f17815a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
        r0.unlock();
        r1.A(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        return r1.R();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        r4 = u0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r4 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
        return n5.b.f13902d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r3.f13898o == n5.b.f13901c) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        r1 = Q();
     */
    @Override // n5.c
    @n6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(E r4) {
        /*
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f13897n
            r0.lock()
            n5.w r1 = r3.p()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto Lf
            r0.unlock()
            return r1
        Lf:
            java.lang.Object r1 = r3.f13898o     // Catch: java.lang.Throwable -> L48
            kotlinx.coroutines.internal.r0 r2 = n5.b.f13901c     // Catch: java.lang.Throwable -> L48
            if (r1 != r2) goto L3b
        L15:
            n5.j0 r1 = r3.Q()     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L1c
            goto L3b
        L1c:
            boolean r2 = r1 instanceof n5.w     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L24
            r0.unlock()
            return r1
        L24:
            u4.l0.m(r1)     // Catch: java.lang.Throwable -> L48
            r2 = 0
            kotlinx.coroutines.internal.r0 r2 = r1.c0(r4, r2)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L15
            v3.m2 r2 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L48
            r0.unlock()
            r1.A(r4)
            java.lang.Object r4 = r1.R()
            return r4
        L3b:
            kotlinx.coroutines.internal.d1 r4 = r3.u0(r4)     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L47
            kotlinx.coroutines.internal.r0 r4 = n5.b.f13902d     // Catch: java.lang.Throwable -> L48
            r0.unlock()
            return r4
        L47:
            throw r4     // Catch: java.lang.Throwable -> L48
        L48:
            r4 = move-exception
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a0.H(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        r5 = r1.o();
        r1 = v3.m2.f17815a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        r0.unlock();
        u4.l0.m(r5);
        r5 = r5;
        r5.A(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        return r5.R();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r2 == n5.b.f13903e) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r2 == kotlinx.coroutines.internal.c.f12787b) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r2 == kotlinx.coroutines.selects.g.d()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        if ((r2 instanceof n5.w) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        throw new java.lang.IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + r2).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        if (r5.S() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        return kotlinx.coroutines.selects.g.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        r4 = u0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
        if (r4 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        return n5.b.f13902d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r3.f13898o == n5.b.f13901c) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        r1 = i(r4);
        r2 = r5.L(r1);
     */
    @Override // n5.c
    @n6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I(E r4, @n6.d kotlinx.coroutines.selects.f<?> r5) {
        /*
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f13897n
            r0.lock()
            n5.w r1 = r3.p()     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto Lf
            r0.unlock()
            return r1
        Lf:
            java.lang.Object r1 = r3.f13898o     // Catch: java.lang.Throwable -> L82
            kotlinx.coroutines.internal.r0 r2 = n5.b.f13901c     // Catch: java.lang.Throwable -> L82
            if (r1 != r2) goto L67
        L15:
            n5.c$d r1 = r3.i(r4)     // Catch: java.lang.Throwable -> L82
            java.lang.Object r2 = r5.L(r1)     // Catch: java.lang.Throwable -> L82
            if (r2 != 0) goto L35
            java.lang.Object r5 = r1.o()     // Catch: java.lang.Throwable -> L82
            v3.m2 r1 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L82
            r0.unlock()
            u4.l0.m(r5)
            n5.j0 r5 = (n5.j0) r5
            r5.A(r4)
            java.lang.Object r4 = r5.R()
            return r4
        L35:
            kotlinx.coroutines.internal.r0 r1 = n5.b.f13903e     // Catch: java.lang.Throwable -> L82
            if (r2 == r1) goto L67
            java.lang.Object r1 = kotlinx.coroutines.internal.c.f12787b     // Catch: java.lang.Throwable -> L82
            if (r2 == r1) goto L15
            java.lang.Object r4 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> L82
            if (r2 == r4) goto L63
            boolean r4 = r2 instanceof n5.w     // Catch: java.lang.Throwable -> L82
            if (r4 == 0) goto L48
            goto L63
        L48:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r5.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            r5.append(r1)     // Catch: java.lang.Throwable -> L82
            r5.append(r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L82
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L82
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L82
            throw r4     // Catch: java.lang.Throwable -> L82
        L63:
            r0.unlock()
            return r2
        L67:
            boolean r5 = r5.S()     // Catch: java.lang.Throwable -> L82
            if (r5 != 0) goto L75
            java.lang.Object r4 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> L82
            r0.unlock()
            return r4
        L75:
            kotlinx.coroutines.internal.d1 r4 = r3.u0(r4)     // Catch: java.lang.Throwable -> L82
            if (r4 != 0) goto L81
            kotlinx.coroutines.internal.r0 r4 = n5.b.f13902d     // Catch: java.lang.Throwable -> L82
            r0.unlock()
            return r4
        L81:
            throw r4     // Catch: java.lang.Throwable -> L82
        L82:
            r4 = move-exception
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a0.I(java.lang.Object, kotlinx.coroutines.selects.f):java.lang.Object");
    }

    @Override // n5.a
    public boolean e0(@n6.d h0<? super E> h0Var) {
        ReentrantLock reentrantLock = this.f13897n;
        reentrantLock.lock();
        try {
            return super.e0(h0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // n5.a
    public final boolean h0() {
        return false;
    }

    @Override // n5.a
    public final boolean i0() {
        ReentrantLock reentrantLock = this.f13897n;
        reentrantLock.lock();
        try {
            return this.f13898o == b.f13901c;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // n5.a, n5.i0
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f13897n;
        reentrantLock.lock();
        try {
            return j0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // n5.a
    public void k0(boolean z6) {
        ReentrantLock reentrantLock = this.f13897n;
        reentrantLock.lock();
        try {
            d1 u02 = u0(b.f13901c);
            m2 m2Var = m2.f17815a;
            reentrantLock.unlock();
            super.k0(z6);
            if (u02 != null) {
                throw u02;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // n5.c
    @n6.d
    public String l() {
        ReentrantLock reentrantLock = this.f13897n;
        reentrantLock.lock();
        try {
            return "(value=" + this.f13898o + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // n5.a
    @n6.e
    public Object o0() {
        ReentrantLock reentrantLock = this.f13897n;
        reentrantLock.lock();
        try {
            Object obj = this.f13898o;
            r0 r0Var = b.f13901c;
            if (obj != r0Var) {
                this.f13898o = r0Var;
                m2 m2Var = m2.f17815a;
                return obj;
            }
            Object p6 = p();
            if (p6 == null) {
                p6 = b.f13904f;
            }
            return p6;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // n5.a
    @n6.e
    public Object p0(@n6.d kotlinx.coroutines.selects.f<?> fVar) {
        ReentrantLock reentrantLock = this.f13897n;
        reentrantLock.lock();
        try {
            Object obj = this.f13898o;
            r0 r0Var = b.f13901c;
            if (obj == r0Var) {
                Object p6 = p();
                if (p6 == null) {
                    p6 = b.f13904f;
                }
                return p6;
            } else if (fVar.S()) {
                Object obj2 = this.f13898o;
                this.f13898o = r0Var;
                m2 m2Var = m2.f17815a;
                return obj2;
            } else {
                return kotlinx.coroutines.selects.g.d();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final d1 u0(Object obj) {
        t4.l<E, m2> lVar;
        Object obj2 = this.f13898o;
        d1 d1Var = null;
        if (obj2 != b.f13901c && (lVar = this.f13909k) != null) {
            d1Var = kotlinx.coroutines.internal.i0.d(lVar, obj2, null, 2, null);
        }
        this.f13898o = obj;
        return d1Var;
    }
}
