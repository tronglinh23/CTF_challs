package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.q;
import kotlinx.coroutines.r;
import kotlinx.coroutines.t;
import t4.l;
import u4.n0;
import v3.m2;
/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13092c = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f13093d = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13094e = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f13095f = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx");

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13096g = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits");
    @n6.d
    volatile /* synthetic */ int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    public final int f13097a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, m2> f13098b;
    @n6.d
    private volatile /* synthetic */ long deqIdx = 0;
    @n6.d
    private volatile /* synthetic */ long enqIdx = 0;
    @n6.d
    private volatile /* synthetic */ Object head;
    @n6.d
    private volatile /* synthetic */ Object tail;

    /* loaded from: classes.dex */
    public static final class a extends n0 implements l<Throwable, m2> {
        public a() {
            super(1);
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Throwable th) {
            b(th);
            return m2.f17815a;
        }

        public final void b(@n6.d Throwable th) {
            g.this.a();
        }
    }

    public g(int i7, int i8) {
        this.f13097a = i7;
        if (!(i7 > 0)) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i7).toString());
        }
        if (!(i8 >= 0 && i8 <= i7)) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i7).toString());
        }
        i iVar = new i(0L, null, 2);
        this.head = iVar;
        this.tail = iVar;
        this._availablePermits = i7 - i8;
        this.f13098b = new a();
    }

    @Override // kotlinx.coroutines.sync.f
    public void a() {
        while (true) {
            int i7 = this._availablePermits;
            if (!(i7 < this.f13097a)) {
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f13097a).toString());
            }
            if (f13096g.compareAndSet(this, i7, i7 + 1) && (i7 >= 0 || k())) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.sync.f
    public int b() {
        return Math.max(this._availablePermits, 0);
    }

    @Override // kotlinx.coroutines.sync.f
    @n6.e
    public Object c(@n6.d e4.d<? super m2> dVar) {
        Object h7;
        return (f13096g.getAndDecrement(this) <= 0 && (h7 = h(dVar)) == g4.d.h()) ? h7 : m2.f17815a;
    }

    @Override // kotlinx.coroutines.sync.f
    public boolean d() {
        int i7;
        do {
            i7 = this._availablePermits;
            if (i7 <= 0) {
                return false;
            }
        } while (!f13096g.compareAndSet(this, i7, i7 - 1));
        return true;
    }

    public final Object h(e4.d<? super m2> dVar) {
        r b7 = t.b(g4.c.d(dVar));
        while (true) {
            if (i(b7)) {
                break;
            } else if (f13096g.getAndDecrement(this) > 0) {
                b7.Y(m2.f17815a, this.f13098b);
                break;
            }
        }
        Object A = b7.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        return A == g4.d.h() ? A : m2.f17815a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(kotlinx.coroutines.q<? super v3.m2> r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.tail
            kotlinx.coroutines.sync.i r0 = (kotlinx.coroutines.sync.i) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.sync.g.f13095f
            long r1 = r1.getAndIncrement(r14)
            int r3 = kotlinx.coroutines.sync.h.h()
            long r3 = (long) r3
            long r3 = r1 / r3
        L11:
            r5 = r0
        L12:
            long r6 = r5.o()
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 < 0) goto L26
            boolean r6 = r5.g()
            if (r6 == 0) goto L21
            goto L26
        L21:
            java.lang.Object r5 = kotlinx.coroutines.internal.p0.b(r5)
            goto L38
        L26:
            java.lang.Object r6 = kotlinx.coroutines.internal.h.a(r5)
            kotlinx.coroutines.internal.r0 r7 = kotlinx.coroutines.internal.g.a()
            if (r6 != r7) goto Lb5
            kotlinx.coroutines.internal.r0 r5 = kotlinx.coroutines.internal.g.a()
            java.lang.Object r5 = kotlinx.coroutines.internal.p0.b(r5)
        L38:
            boolean r6 = kotlinx.coroutines.internal.p0.h(r5)
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L7d
            kotlinx.coroutines.internal.o0 r6 = kotlinx.coroutines.internal.p0.f(r5)
        L44:
            java.lang.Object r9 = r14.tail
            kotlinx.coroutines.internal.o0 r9 = (kotlinx.coroutines.internal.o0) r9
            long r10 = r9.o()
            long r12 = r6.o()
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L56
        L54:
            r6 = r8
            goto L70
        L56:
            boolean r10 = r6.r()
            if (r10 != 0) goto L5e
            r6 = r7
            goto L70
        L5e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = kotlinx.coroutines.sync.g.f13094e
            boolean r10 = p.b.a(r10, r14, r9, r6)
            if (r10 == 0) goto L73
            boolean r6 = r9.n()
            if (r6 == 0) goto L54
            r9.l()
            goto L54
        L70:
            if (r6 == 0) goto L11
            goto L7d
        L73:
            boolean r9 = r6.n()
            if (r9 == 0) goto L44
            r6.l()
            goto L44
        L7d:
            kotlinx.coroutines.internal.o0 r0 = kotlinx.coroutines.internal.p0.f(r5)
            kotlinx.coroutines.sync.i r0 = (kotlinx.coroutines.sync.i) r0
            int r3 = kotlinx.coroutines.sync.h.h()
            long r3 = (long) r3
            long r1 = r1 % r3
            int r1 = (int) r1
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r0.f13110e
            r3 = 0
            boolean r2 = kotlinx.coroutines.debug.internal.b.a(r2, r1, r3, r15)
            if (r2 == 0) goto L9c
            kotlinx.coroutines.sync.a r2 = new kotlinx.coroutines.sync.a
            r2.<init>(r0, r1)
            r15.N(r2)
            return r8
        L9c:
            kotlinx.coroutines.internal.r0 r2 = kotlinx.coroutines.sync.h.g()
            kotlinx.coroutines.internal.r0 r3 = kotlinx.coroutines.sync.h.i()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.f13110e
            boolean r0 = kotlinx.coroutines.debug.internal.b.a(r0, r1, r2, r3)
            if (r0 == 0) goto Lb4
            v3.m2 r0 = v3.m2.f17815a
            t4.l<java.lang.Throwable, v3.m2> r1 = r14.f13098b
            r15.Y(r0, r1)
            return r8
        Lb4:
            return r7
        Lb5:
            kotlinx.coroutines.internal.h r6 = (kotlinx.coroutines.internal.h) r6
            kotlinx.coroutines.internal.o0 r6 = (kotlinx.coroutines.internal.o0) r6
            if (r6 == 0) goto Lbe
        Lbb:
            r5 = r6
            goto L12
        Lbe:
            long r6 = r5.o()
            r8 = 1
            long r6 = r6 + r8
            r8 = r5
            kotlinx.coroutines.sync.i r8 = (kotlinx.coroutines.sync.i) r8
            kotlinx.coroutines.sync.i r6 = kotlinx.coroutines.sync.h.c(r6, r8)
            boolean r7 = r5.m(r6)
            if (r7 == 0) goto L12
            boolean r7 = r5.g()
            if (r7 == 0) goto Lbb
            r5.l()
            goto Lbb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.g.i(kotlinx.coroutines.q):boolean");
    }

    public final boolean j(q<? super m2> qVar) {
        Object m02 = qVar.m0(m2.f17815a, null, this.f13098b);
        if (m02 == null) {
            return false;
        }
        qVar.t0(m02);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.g.k():boolean");
    }
}
