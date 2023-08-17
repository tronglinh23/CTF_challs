package n5;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.d1;
import kotlinx.coroutines.internal.r0;
import v3.m2;
/* loaded from: classes.dex */
public class h<E> extends n5.a<E> {

    /* renamed from: n  reason: collision with root package name */
    public final int f13932n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final m f13933o;
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public final ReentrantLock f13934p;
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public Object[] f13935q;

    /* renamed from: r  reason: collision with root package name */
    public int f13936r;
    @n6.d
    private volatile /* synthetic */ int size;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13937a;

        static {
            int[] iArr = new int[m.values().length];
            iArr[m.SUSPEND.ordinal()] = 1;
            iArr[m.DROP_LATEST.ordinal()] = 2;
            iArr[m.DROP_OLDEST.ordinal()] = 3;
            f13937a = iArr;
        }
    }

    public h(int i7, @n6.d m mVar, @n6.e t4.l<? super E, m2> lVar) {
        super(lVar);
        this.f13932n = i7;
        this.f13933o = mVar;
        if (!(i7 >= 1)) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i7 + " was specified").toString());
        }
        this.f13934p = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i7, 8)];
        x3.o.w2(objArr, b.f13901c, 0, 0, 6, null);
        this.f13935q = objArr;
        this.size = 0;
    }

    @Override // n5.c
    public final boolean C() {
        return false;
    }

    @Override // n5.c
    public final boolean D() {
        return this.size == this.f13932n && this.f13933o == m.SUSPEND;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r1 == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        r2 = Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
        if ((r2 instanceof n5.w) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
        r4.size = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
        u4.l0.m(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        if (r2.c0(r5, null) == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
        r4.size = r1;
        r1 = v3.m2.f17815a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        r0.unlock();
        r2.A(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
        return r2.R();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
        u0(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        return n5.b.f13902d;
     */
    @Override // n5.c
    @n6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(E r5) {
        /*
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.f13934p
            r0.lock()
            int r1 = r4.size     // Catch: java.lang.Throwable -> L50
            n5.w r2 = r4.p()     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L11
            r0.unlock()
            return r2
        L11:
            kotlinx.coroutines.internal.r0 r2 = r4.w0(r1)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L1b
            r0.unlock()
            return r2
        L1b:
            if (r1 != 0) goto L47
        L1d:
            n5.j0 r2 = r4.Q()     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto L24
            goto L47
        L24:
            boolean r3 = r2 instanceof n5.w     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L2e
            r4.size = r1     // Catch: java.lang.Throwable -> L50
            r0.unlock()
            return r2
        L2e:
            u4.l0.m(r2)     // Catch: java.lang.Throwable -> L50
            r3 = 0
            kotlinx.coroutines.internal.r0 r3 = r2.c0(r5, r3)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L1d
            r4.size = r1     // Catch: java.lang.Throwable -> L50
            v3.m2 r1 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L50
            r0.unlock()
            r2.A(r5)
            java.lang.Object r5 = r2.R()
            return r5
        L47:
            r4.u0(r1, r5)     // Catch: java.lang.Throwable -> L50
            kotlinx.coroutines.internal.r0 r5 = n5.b.f13902d     // Catch: java.lang.Throwable -> L50
            r0.unlock()
            return r5
        L50:
            r5 = move-exception
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.h.H(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r1 == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        r2 = i(r5);
        r3 = r6.L(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r3 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        r4.size = r1;
        r6 = r2.o();
        r1 = v3.m2.f17815a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        r0.unlock();
        u4.l0.m(r6);
        r6 = r6;
        r6.A(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        return r6.R();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r3 == n5.b.f13903e) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r3 == kotlinx.coroutines.internal.c.f12787b) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r3 == kotlinx.coroutines.selects.g.d()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
        if ((r3 instanceof n5.w) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        throw new java.lang.IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + r3).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
        r4.size = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        if (r6.S() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
        r4.size = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        return kotlinx.coroutines.selects.g.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
        u0(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
        return n5.b.f13902d;
     */
    @Override // n5.c
    @n6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I(E r5, @n6.d kotlinx.coroutines.selects.f<?> r6) {
        /*
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.f13934p
            r0.lock()
            int r1 = r4.size     // Catch: java.lang.Throwable -> L8c
            n5.w r2 = r4.p()     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L11
            r0.unlock()
            return r2
        L11:
            kotlinx.coroutines.internal.r0 r2 = r4.w0(r1)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L1b
            r0.unlock()
            return r2
        L1b:
            if (r1 != 0) goto L73
        L1d:
            n5.c$d r2 = r4.i(r5)     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r3 = r6.L(r2)     // Catch: java.lang.Throwable -> L8c
            if (r3 != 0) goto L3f
            r4.size = r1     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r6 = r2.o()     // Catch: java.lang.Throwable -> L8c
            v3.m2 r1 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L8c
            r0.unlock()
            u4.l0.m(r6)
            n5.j0 r6 = (n5.j0) r6
            r6.A(r5)
            java.lang.Object r5 = r6.R()
            return r5
        L3f:
            kotlinx.coroutines.internal.r0 r2 = n5.b.f13903e     // Catch: java.lang.Throwable -> L8c
            if (r3 == r2) goto L73
            java.lang.Object r2 = kotlinx.coroutines.internal.c.f12787b     // Catch: java.lang.Throwable -> L8c
            if (r3 == r2) goto L1d
            java.lang.Object r5 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> L8c
            if (r3 == r5) goto L6d
            boolean r5 = r3 instanceof n5.w     // Catch: java.lang.Throwable -> L8c
            if (r5 == 0) goto L52
            goto L6d
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r6.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            r6.append(r1)     // Catch: java.lang.Throwable -> L8c
            r6.append(r3)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L8c
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L8c
            throw r5     // Catch: java.lang.Throwable -> L8c
        L6d:
            r4.size = r1     // Catch: java.lang.Throwable -> L8c
            r0.unlock()
            return r3
        L73:
            boolean r6 = r6.S()     // Catch: java.lang.Throwable -> L8c
            if (r6 != 0) goto L83
            r4.size = r1     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r5 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> L8c
            r0.unlock()
            return r5
        L83:
            r4.u0(r1, r5)     // Catch: java.lang.Throwable -> L8c
            kotlinx.coroutines.internal.r0 r5 = n5.b.f13902d     // Catch: java.lang.Throwable -> L8c
            r0.unlock()
            return r5
        L8c:
            r5 = move-exception
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.h.I(java.lang.Object, kotlinx.coroutines.selects.f):java.lang.Object");
    }

    @Override // n5.a
    public boolean e0(@n6.d h0<? super E> h0Var) {
        ReentrantLock reentrantLock = this.f13934p;
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
        return this.size == 0;
    }

    @Override // n5.a, n5.i0
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f13934p;
        reentrantLock.lock();
        try {
            return j0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // n5.c
    @n6.e
    public Object k(@n6.d l0 l0Var) {
        ReentrantLock reentrantLock = this.f13934p;
        reentrantLock.lock();
        try {
            return super.k(l0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // n5.a
    public void k0(boolean z6) {
        t4.l<E, m2> lVar = this.f13909k;
        ReentrantLock reentrantLock = this.f13934p;
        reentrantLock.lock();
        try {
            int i7 = this.size;
            d1 d1Var = null;
            for (int i8 = 0; i8 < i7; i8++) {
                Object obj = this.f13935q[this.f13936r];
                if (lVar != null && obj != b.f13901c) {
                    d1Var = kotlinx.coroutines.internal.i0.c(lVar, obj, d1Var);
                }
                Object[] objArr = this.f13935q;
                int i9 = this.f13936r;
                objArr[i9] = b.f13901c;
                this.f13936r = (i9 + 1) % objArr.length;
            }
            this.size = 0;
            m2 m2Var = m2.f17815a;
            reentrantLock.unlock();
            super.k0(z6);
            if (d1Var != null) {
                throw d1Var;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // n5.c
    @n6.d
    public String l() {
        return "(buffer:capacity=" + this.f13932n + ",size=" + this.size + ')';
    }

    @Override // n5.a
    @n6.e
    public Object o0() {
        ReentrantLock reentrantLock = this.f13934p;
        reentrantLock.lock();
        try {
            int i7 = this.size;
            if (i7 == 0) {
                Object p6 = p();
                if (p6 == null) {
                    p6 = b.f13904f;
                }
                return p6;
            }
            Object[] objArr = this.f13935q;
            int i8 = this.f13936r;
            Object obj = objArr[i8];
            l0 l0Var = null;
            objArr[i8] = null;
            this.size = i7 - 1;
            Object obj2 = b.f13904f;
            boolean z6 = false;
            if (i7 == this.f13932n) {
                l0 l0Var2 = null;
                while (true) {
                    l0 R = R();
                    if (R == null) {
                        l0Var = l0Var2;
                        break;
                    }
                    u4.l0.m(R);
                    if (R.a1(null) != null) {
                        obj2 = R.Y0();
                        z6 = true;
                        l0Var = R;
                        break;
                    }
                    R.b1();
                    l0Var2 = R;
                }
            }
            if (obj2 != b.f13904f && !(obj2 instanceof w)) {
                this.size = i7;
                Object[] objArr2 = this.f13935q;
                objArr2[(this.f13936r + i7) % objArr2.length] = obj2;
            }
            this.f13936r = (this.f13936r + 1) % this.f13935q.length;
            m2 m2Var = m2.f17815a;
            if (z6) {
                u4.l0.m(l0Var);
                l0Var.X0();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r1 == r8.f13932n) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        r3 = c0();
        r7 = r9.L(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r7 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        r5 = r3.o();
        u4.l0.m(r5);
        r2 = r5.Y0();
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r7 == n5.b.f13904f) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r7 == kotlinx.coroutines.internal.c.f12787b) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r7 != kotlinx.coroutines.selects.g.d()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        r8.size = r1;
        r8.f13935q[r8.f13936r] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        if ((r7 instanceof n5.w) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        r3 = true;
        r2 = r7;
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
        throw new java.lang.IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + r7).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
        if (r2 == n5.b.f13904f) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
        if ((r2 instanceof n5.w) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
        r8.size = r1;
        r9 = r8.f13935q;
        r9[(r8.f13936r + r1) % r9.length] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (r9.S() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
        r8.size = r1;
        r8.f13935q[r8.f13936r] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
        return kotlinx.coroutines.selects.g.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
        r8.f13936r = (r8.f13936r + 1) % r8.f13935q.length;
        r9 = v3.m2.f17815a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
        if (r3 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
        u4.l0.m(r5);
        r5.X0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
        return r4;
     */
    @Override // n5.a
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p0(@n6.d kotlinx.coroutines.selects.f<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f13934p
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> Lc4
            if (r1 != 0) goto L15
            n5.w r9 = r8.p()     // Catch: java.lang.Throwable -> Lc4
            if (r9 != 0) goto L11
            kotlinx.coroutines.internal.r0 r9 = n5.b.f13904f     // Catch: java.lang.Throwable -> Lc4
        L11:
            r0.unlock()
            return r9
        L15:
            java.lang.Object[] r2 = r8.f13935q     // Catch: java.lang.Throwable -> Lc4
            int r3 = r8.f13936r     // Catch: java.lang.Throwable -> Lc4
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lc4
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lc4
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> Lc4
            kotlinx.coroutines.internal.r0 r2 = n5.b.f13904f     // Catch: java.lang.Throwable -> Lc4
            int r3 = r8.f13932n     // Catch: java.lang.Throwable -> Lc4
            r6 = 1
            if (r1 != r3) goto L80
        L29:
            n5.a$g r3 = r8.c0()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r7 = r9.L(r3)     // Catch: java.lang.Throwable -> Lc4
            if (r7 != 0) goto L43
            java.lang.Object r5 = r3.o()     // Catch: java.lang.Throwable -> Lc4
            u4.l0.m(r5)     // Catch: java.lang.Throwable -> Lc4
            r2 = r5
            n5.l0 r2 = (n5.l0) r2     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r2 = r2.Y0()     // Catch: java.lang.Throwable -> Lc4
            r3 = r6
            goto L81
        L43:
            kotlinx.coroutines.internal.r0 r3 = n5.b.f13904f     // Catch: java.lang.Throwable -> Lc4
            if (r7 == r3) goto L80
            java.lang.Object r3 = kotlinx.coroutines.internal.c.f12787b     // Catch: java.lang.Throwable -> Lc4
            if (r7 == r3) goto L29
            java.lang.Object r2 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> Lc4
            if (r7 != r2) goto L5d
            r8.size = r1     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r9 = r8.f13935q     // Catch: java.lang.Throwable -> Lc4
            int r1 = r8.f13936r     // Catch: java.lang.Throwable -> Lc4
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lc4
            r0.unlock()
            return r7
        L5d:
            boolean r2 = r7 instanceof n5.w     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L65
            r3 = r6
            r2 = r7
            r5 = r2
            goto L81
        L65:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r1.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = "performAtomicTrySelect(describeTryOffer) returned "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc4
            r1.append(r7)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc4
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lc4
            throw r9     // Catch: java.lang.Throwable -> Lc4
        L80:
            r3 = 0
        L81:
            kotlinx.coroutines.internal.r0 r7 = n5.b.f13904f     // Catch: java.lang.Throwable -> Lc4
            if (r2 == r7) goto L95
            boolean r7 = r2 instanceof n5.w     // Catch: java.lang.Throwable -> Lc4
            if (r7 != 0) goto L95
            r8.size = r1     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r9 = r8.f13935q     // Catch: java.lang.Throwable -> Lc4
            int r7 = r8.f13936r     // Catch: java.lang.Throwable -> Lc4
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lc4
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> Lc4
            goto Lab
        L95:
            boolean r9 = r9.S()     // Catch: java.lang.Throwable -> Lc4
            if (r9 != 0) goto Lab
            r8.size = r1     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r9 = r8.f13935q     // Catch: java.lang.Throwable -> Lc4
            int r1 = r8.f13936r     // Catch: java.lang.Throwable -> Lc4
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r9 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> Lc4
            r0.unlock()
            return r9
        Lab:
            int r9 = r8.f13936r     // Catch: java.lang.Throwable -> Lc4
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.f13935q     // Catch: java.lang.Throwable -> Lc4
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lc4
            int r9 = r9 % r1
            r8.f13936r = r9     // Catch: java.lang.Throwable -> Lc4
            v3.m2 r9 = v3.m2.f17815a     // Catch: java.lang.Throwable -> Lc4
            r0.unlock()
            if (r3 == 0) goto Lc3
            u4.l0.m(r5)
            n5.l0 r5 = (n5.l0) r5
            r5.X0()
        Lc3:
            return r4
        Lc4:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.h.p0(kotlinx.coroutines.selects.f):java.lang.Object");
    }

    public final void u0(int i7, E e7) {
        if (i7 < this.f13932n) {
            v0(i7);
            Object[] objArr = this.f13935q;
            objArr[(this.f13936r + i7) % objArr.length] = e7;
            return;
        }
        Object[] objArr2 = this.f13935q;
        int i8 = this.f13936r;
        objArr2[i8 % objArr2.length] = null;
        objArr2[(i7 + i8) % objArr2.length] = e7;
        this.f13936r = (i8 + 1) % objArr2.length;
    }

    public final void v0(int i7) {
        Object[] objArr = this.f13935q;
        if (i7 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f13932n);
            Object[] objArr2 = new Object[min];
            for (int i8 = 0; i8 < i7; i8++) {
                Object[] objArr3 = this.f13935q;
                objArr2[i8] = objArr3[(this.f13936r + i8) % objArr3.length];
            }
            x3.o.n2(objArr2, b.f13901c, i7, min);
            this.f13935q = objArr2;
            this.f13936r = 0;
        }
    }

    public final r0 w0(int i7) {
        if (i7 < this.f13932n) {
            this.size = i7 + 1;
            return null;
        }
        int i8 = a.f13937a[this.f13933o.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return null;
                }
                throw new v3.j0();
            }
            return b.f13902d;
        }
        return b.f13903e;
    }

    @Override // n5.a, n5.i0
    public boolean y() {
        ReentrantLock reentrantLock = this.f13934p;
        reentrantLock.lock();
        try {
            return super.y();
        } finally {
            reentrantLock.unlock();
        }
    }
}
