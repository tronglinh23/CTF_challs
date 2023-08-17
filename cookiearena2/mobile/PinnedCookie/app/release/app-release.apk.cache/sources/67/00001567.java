package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.i2;

@i2
/* loaded from: classes.dex */
public class y {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12865k = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "_next");

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12866l = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "_prev");

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12867m = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "_removedRef");
    @n6.d
    volatile /* synthetic */ Object _next = this;
    @n6.d
    volatile /* synthetic */ Object _prev = this;
    @n6.d
    private volatile /* synthetic */ Object _removedRef = null;

    /* loaded from: classes.dex */
    public static abstract class a extends kotlinx.coroutines.internal.b {
        @Override // kotlinx.coroutines.internal.b
        public final void a(@n6.d kotlinx.coroutines.internal.d<?> dVar, @n6.e Object obj) {
            y i7;
            boolean z6 = obj == null;
            y h7 = h();
            if (h7 == null || (i7 = i()) == null) {
                return;
            }
            if (p.b.a(y.f12865k, h7, dVar, z6 ? n(h7, i7) : i7) && z6) {
                f(h7, i7);
            }
        }

        @Override // kotlinx.coroutines.internal.b
        @n6.e
        public final Object c(@n6.d kotlinx.coroutines.internal.d<?> dVar) {
            while (true) {
                y m7 = m(dVar);
                if (m7 == null) {
                    return kotlinx.coroutines.internal.c.f12787b;
                }
                Object obj = m7._next;
                if (obj == dVar || dVar.h()) {
                    return null;
                }
                if (obj instanceof j0) {
                    j0 j0Var = (j0) obj;
                    if (dVar.b(j0Var)) {
                        return kotlinx.coroutines.internal.c.f12787b;
                    }
                    j0Var.c(m7);
                } else {
                    Object e7 = e(m7);
                    if (e7 != null) {
                        return e7;
                    }
                    if (l(m7, obj)) {
                        continue;
                    } else {
                        d dVar2 = new d(m7, (y) obj, this);
                        if (p.b.a(y.f12865k, m7, obj, dVar2)) {
                            try {
                                if (dVar2.c(m7) != z.f12881a) {
                                    return null;
                                }
                            } catch (Throwable th) {
                                p.b.a(y.f12865k, m7, dVar2, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        @n6.e
        public Object e(@n6.d y yVar) {
            return null;
        }

        public abstract void f(@n6.d y yVar, @n6.d y yVar2);

        public abstract void g(@n6.d d dVar);

        @n6.e
        public abstract y h();

        @n6.e
        public abstract y i();

        @n6.e
        public Object j(@n6.d d dVar) {
            g(dVar);
            return null;
        }

        public void k(@n6.d y yVar) {
        }

        public boolean l(@n6.d y yVar, @n6.d Object obj) {
            return false;
        }

        @n6.e
        public y m(@n6.d j0 j0Var) {
            y h7 = h();
            u4.l0.m(h7);
            return h7;
        }

        @n6.d
        public abstract Object n(@n6.d y yVar, @n6.d y yVar2);
    }

    /* loaded from: classes.dex */
    public static class b<T extends y> extends a {

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f12868d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_affectedNode");
        @n6.d
        private volatile /* synthetic */ Object _affectedNode = null;
        @n6.d
        @s4.e

        /* renamed from: b  reason: collision with root package name */
        public final y f12869b;
        @n6.d
        @s4.e

        /* renamed from: c  reason: collision with root package name */
        public final T f12870c;

        public b(@n6.d y yVar, @n6.d T t6) {
            this.f12869b = yVar;
            this.f12870c = t6;
        }

        @Override // kotlinx.coroutines.internal.y.a
        public void f(@n6.d y yVar, @n6.d y yVar2) {
            this.f12870c.H0(this.f12869b);
        }

        @Override // kotlinx.coroutines.internal.y.a
        public void g(@n6.d d dVar) {
            p.b.a(f12868d, this, null, dVar.f12873a);
        }

        @Override // kotlinx.coroutines.internal.y.a
        @n6.e
        public final y h() {
            return (y) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.y.a
        @n6.d
        public final y i() {
            return this.f12869b;
        }

        @Override // kotlinx.coroutines.internal.y.a
        public boolean l(@n6.d y yVar, @n6.d Object obj) {
            return obj != this.f12869b;
        }

        @Override // kotlinx.coroutines.internal.y.a
        @n6.e
        public final y m(@n6.d j0 j0Var) {
            return this.f12869b.D0(j0Var);
        }

        @Override // kotlinx.coroutines.internal.y.a
        @n6.d
        public Object n(@n6.d y yVar, @n6.d y yVar2) {
            T t6 = this.f12870c;
            p.b.a(y.f12866l, t6, t6, yVar);
            T t7 = this.f12870c;
            p.b.a(y.f12865k, t7, t7, this.f12869b);
            return this.f12870c;
        }
    }

    @v3.a1
    /* loaded from: classes.dex */
    public static abstract class c extends kotlinx.coroutines.internal.d<y> {
        @n6.d
        @s4.e

        /* renamed from: b  reason: collision with root package name */
        public final y f12871b;
        @s4.e
        @n6.e

        /* renamed from: c  reason: collision with root package name */
        public y f12872c;

        public c(@n6.d y yVar) {
            this.f12871b = yVar;
        }

        @Override // kotlinx.coroutines.internal.d
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public void d(@n6.d y yVar, @n6.e Object obj) {
            boolean z6 = obj == null;
            y yVar2 = z6 ? this.f12871b : this.f12872c;
            if (yVar2 != null && p.b.a(y.f12865k, yVar, this, yVar2) && z6) {
                y yVar3 = this.f12871b;
                y yVar4 = this.f12872c;
                u4.l0.m(yVar4);
                yVar3.H0(yVar4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends j0 {
        @n6.d
        @s4.e

        /* renamed from: a  reason: collision with root package name */
        public final y f12873a;
        @n6.d
        @s4.e

        /* renamed from: b  reason: collision with root package name */
        public final y f12874b;
        @n6.d
        @s4.e

        /* renamed from: c  reason: collision with root package name */
        public final a f12875c;

        public d(@n6.d y yVar, @n6.d y yVar2, @n6.d a aVar) {
            this.f12873a = yVar;
            this.f12874b = yVar2;
            this.f12875c = aVar;
        }

        @Override // kotlinx.coroutines.internal.j0
        @n6.d
        public kotlinx.coroutines.internal.d<?> a() {
            return this.f12875c.b();
        }

        @Override // kotlinx.coroutines.internal.j0
        @n6.e
        public Object c(@n6.e Object obj) {
            if (obj != null) {
                y yVar = (y) obj;
                Object j7 = this.f12875c.j(this);
                Object obj2 = z.f12881a;
                if (j7 != obj2) {
                    Object e7 = j7 != null ? a().e(j7) : a().f();
                    p.b.a(y.f12865k, yVar, this, e7 == kotlinx.coroutines.internal.c.f12786a ? a() : e7 == null ? this.f12875c.n(yVar, this.f12874b) : this.f12874b);
                    return null;
                }
                y yVar2 = this.f12874b;
                if (p.b.a(y.f12865k, yVar, this, yVar2.U0())) {
                    this.f12875c.k(yVar);
                    yVar2.D0(null);
                }
                return obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        }

        public final void d() {
            this.f12875c.g(this);
        }

        @Override // kotlinx.coroutines.internal.j0
        @n6.d
        public String toString() {
            return "PrepareOp(op=" + a() + ')';
        }
    }

    /* loaded from: classes.dex */
    public static class e<T> extends a {

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f12876c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_affectedNode");

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f12877d = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_originalNext");
        @n6.d
        private volatile /* synthetic */ Object _affectedNode = null;
        @n6.d
        private volatile /* synthetic */ Object _originalNext = null;
        @n6.d
        @s4.e

        /* renamed from: b  reason: collision with root package name */
        public final y f12878b;

        public e(@n6.d y yVar) {
            this.f12878b = yVar;
        }

        public static /* synthetic */ void p() {
        }

        @Override // kotlinx.coroutines.internal.y.a
        @n6.e
        public Object e(@n6.d y yVar) {
            if (yVar == this.f12878b) {
                return x.d();
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.y.a
        public final void f(@n6.d y yVar, @n6.d y yVar2) {
            yVar2.D0(null);
        }

        @Override // kotlinx.coroutines.internal.y.a
        public void g(@n6.d d dVar) {
            p.b.a(f12876c, this, null, dVar.f12873a);
            p.b.a(f12877d, this, null, dVar.f12874b);
        }

        @Override // kotlinx.coroutines.internal.y.a
        @n6.e
        public final y h() {
            return (y) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.y.a
        @n6.e
        public final y i() {
            return (y) this._originalNext;
        }

        @Override // kotlinx.coroutines.internal.y.a
        public final boolean l(@n6.d y yVar, @n6.d Object obj) {
            if (obj instanceof l0) {
                ((l0) obj).f12820a.M0();
                return true;
            }
            return false;
        }

        @Override // kotlinx.coroutines.internal.y.a
        @n6.e
        public final y m(@n6.d j0 j0Var) {
            y yVar = this.f12878b;
            while (true) {
                Object obj = yVar._next;
                if (!(obj instanceof j0)) {
                    return (y) obj;
                }
                j0 j0Var2 = (j0) obj;
                if (j0Var.b(j0Var2)) {
                    return null;
                }
                j0Var2.c(this.f12878b);
            }
        }

        @Override // kotlinx.coroutines.internal.y.a
        @n6.d
        public final Object n(@n6.d y yVar, @n6.d y yVar2) {
            return yVar2.U0();
        }

        public final T o() {
            T t6 = (T) h();
            u4.l0.m(t6);
            return t6;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ t4.a<Boolean> f12879d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(y yVar, t4.a<Boolean> aVar) {
            super(yVar);
            this.f12879d = aVar;
        }

        @Override // kotlinx.coroutines.internal.d
        @n6.e
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public Object i(@n6.d y yVar) {
            if (this.f12879d.n().booleanValue()) {
                return null;
            }
            return x.a();
        }
    }

    public final boolean A0(@n6.d y yVar, @n6.d t4.l<? super y, Boolean> lVar, @n6.d t4.a<Boolean> aVar) {
        int V0;
        f fVar = new f(yVar, aVar);
        do {
            y K0 = K0();
            if (!lVar.O(K0).booleanValue()) {
                return false;
            }
            V0 = K0.V0(yVar, this, fVar);
            if (V0 == 1) {
                return true;
            }
        } while (V0 != 2);
        return false;
    }

    @v3.a1
    public final boolean B0(@n6.d y yVar, @n6.d y yVar2) {
        f12866l.lazySet(yVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12865k;
        atomicReferenceFieldUpdater.lazySet(yVar, yVar2);
        if (p.b.a(atomicReferenceFieldUpdater, this, yVar2, yVar)) {
            yVar.H0(yVar2);
            return true;
        }
        return false;
    }

    public final boolean C0(@n6.d y yVar) {
        f12866l.lazySet(yVar, this);
        f12865k.lazySet(yVar, this);
        while (I0() == this) {
            if (p.b.a(f12865k, this, this, yVar)) {
                yVar.H0(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (p.b.a(kotlinx.coroutines.internal.y.f12865k, r3, r2, ((kotlinx.coroutines.internal.l0) r4).f12820a) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.y D0(kotlinx.coroutines.internal.j0 r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.y) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.y.f12866l
            boolean r0 = p.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.N0()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.j0
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.j0 r0 = (kotlinx.coroutines.internal.j0) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.j0 r4 = (kotlinx.coroutines.internal.j0) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.l0
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.y.f12865k
            kotlinx.coroutines.internal.l0 r4 = (kotlinx.coroutines.internal.l0) r4
            kotlinx.coroutines.internal.y r4 = r4.f12820a
            boolean r2 = p.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.y r2 = (kotlinx.coroutines.internal.y) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.y r3 = (kotlinx.coroutines.internal.y) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.y.D0(kotlinx.coroutines.internal.j0):kotlinx.coroutines.internal.y");
    }

    @n6.d
    public final <T extends y> b<T> E0(@n6.d T t6) {
        return new b<>(this, t6);
    }

    @n6.d
    public final e<y> F0() {
        return new e<>(this);
    }

    public final y G0(y yVar) {
        while (yVar.N0()) {
            yVar = (y) yVar._prev;
        }
        return yVar;
    }

    public final void H0(y yVar) {
        y yVar2;
        do {
            yVar2 = (y) yVar._prev;
            if (I0() != yVar) {
                return;
            }
        } while (!p.b.a(f12866l, yVar, yVar2, this));
        if (N0()) {
            yVar.D0(null);
        }
    }

    @n6.d
    public final Object I0() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof j0)) {
                return obj;
            }
            ((j0) obj).c(this);
        }
    }

    @n6.d
    public final y J0() {
        return x.h(I0());
    }

    @n6.d
    public final y K0() {
        y D0 = D0(null);
        return D0 == null ? G0((y) this._prev) : D0;
    }

    public final void L0() {
        ((l0) I0()).f12820a.M0();
    }

    @v3.a1
    public final void M0() {
        y yVar = this;
        while (true) {
            Object I0 = yVar.I0();
            if (!(I0 instanceof l0)) {
                yVar.D0(null);
                return;
            }
            yVar = ((l0) I0).f12820a;
        }
    }

    public boolean N0() {
        return I0() instanceof l0;
    }

    @n6.d
    @v3.a1
    public final c O0(@n6.d y yVar, @n6.d t4.a<Boolean> aVar) {
        return new f(yVar, aVar);
    }

    @n6.e
    public y P0() {
        Object I0 = I0();
        l0 l0Var = I0 instanceof l0 ? (l0) I0 : null;
        if (l0Var != null) {
            return l0Var.f12820a;
        }
        return null;
    }

    public boolean Q0() {
        return T0() == null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, kotlinx.coroutines.internal.y, java.lang.Object] */
    public final /* synthetic */ <T> T R0(t4.l<? super T, Boolean> lVar) {
        y T0;
        while (true) {
            y yVar = (y) I0();
            if (yVar == this) {
                return null;
            }
            u4.l0.y(3, "T");
            if (!(yVar instanceof Object)) {
                return null;
            }
            if ((lVar.O(yVar).booleanValue() && !yVar.N0()) || (T0 = yVar.T0()) == null) {
                return yVar;
            }
            T0.M0();
        }
    }

    @n6.e
    public final y S0() {
        while (true) {
            y yVar = (y) I0();
            if (yVar == this) {
                return null;
            }
            if (yVar.Q0()) {
                return yVar;
            }
            yVar.L0();
        }
    }

    @n6.e
    @v3.a1
    public final y T0() {
        Object I0;
        y yVar;
        do {
            I0 = I0();
            if (I0 instanceof l0) {
                return ((l0) I0).f12820a;
            }
            if (I0 == this) {
                return (y) I0;
            }
            yVar = (y) I0;
        } while (!p.b.a(f12865k, this, I0, yVar.U0()));
        yVar.D0(null);
        return null;
    }

    public final l0 U0() {
        l0 l0Var = (l0) this._removedRef;
        if (l0Var == null) {
            l0 l0Var2 = new l0(this);
            f12867m.lazySet(this, l0Var2);
            return l0Var2;
        }
        return l0Var;
    }

    @v3.a1
    public final int V0(@n6.d y yVar, @n6.d y yVar2, @n6.d c cVar) {
        f12866l.lazySet(yVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12865k;
        atomicReferenceFieldUpdater.lazySet(yVar, yVar2);
        cVar.f12872c = yVar2;
        if (p.b.a(atomicReferenceFieldUpdater, this, yVar2, cVar)) {
            return cVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final void W0(@n6.d y yVar, @n6.d y yVar2) {
    }

    @n6.d
    public String toString() {
        return new u4.e1(this) { // from class: kotlinx.coroutines.internal.y.g
            @Override // u4.e1, e5.p
            @n6.e
            public Object get() {
                return kotlinx.coroutines.z0.a(this.f17460l);
            }
        } + '@' + kotlinx.coroutines.z0.b(this);
    }

    public final void x0(@n6.d y yVar) {
        do {
        } while (!K0().B0(yVar, this));
    }

    public final boolean y0(@n6.d y yVar, @n6.d t4.a<Boolean> aVar) {
        int V0;
        f fVar = new f(yVar, aVar);
        do {
            V0 = K0().V0(yVar, this, fVar);
            if (V0 == 1) {
                return true;
            }
        } while (V0 != 2);
        return false;
    }

    public final boolean z0(@n6.d y yVar, @n6.d t4.l<? super y, Boolean> lVar) {
        y K0;
        do {
            K0 = K0();
            if (!lVar.O(K0).booleanValue()) {
                return false;
            }
        } while (!K0.B0(yVar, this));
        return true;
    }
}