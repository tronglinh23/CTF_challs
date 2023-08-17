package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.j0;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.q;
import kotlinx.coroutines.s;
import t4.l;
import t4.p;
import u4.n0;
import v3.m2;
/* loaded from: classes.dex */
public final class d implements kotlinx.coroutines.sync.c, kotlinx.coroutines.selects.e<Object, kotlinx.coroutines.sync.c> {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13061k = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_state");
    @n6.d
    volatile /* synthetic */ Object _state;

    /* loaded from: classes.dex */
    public final class a extends c {
        @n6.d

        /* renamed from: q  reason: collision with root package name */
        public final q<m2> f13062q;

        /* renamed from: kotlinx.coroutines.sync.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0175a extends n0 implements l<Throwable, m2> {

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ d f13064l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ a f13065m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0175a(d dVar, a aVar) {
                super(1);
                this.f13064l = dVar;
                this.f13065m = aVar;
            }

            @Override // t4.l
            public /* bridge */ /* synthetic */ m2 O(Throwable th) {
                b(th);
                return m2.f17815a;
            }

            public final void b(@n6.d Throwable th) {
                this.f13064l.b(this.f13065m.f13072n);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@n6.e Object obj, @n6.d q<? super m2> qVar) {
            super(obj);
            this.f13062q = qVar;
        }

        @Override // kotlinx.coroutines.sync.d.c
        public void X0() {
            this.f13062q.t0(s.f12943d);
        }

        @Override // kotlinx.coroutines.sync.d.c
        public boolean Z0() {
            return Y0() && this.f13062q.m0(m2.f17815a, null, new C0175a(d.this, this)) != null;
        }

        @Override // kotlinx.coroutines.internal.y
        @n6.d
        public String toString() {
            return "LockCont[" + this.f13072n + ", " + this.f13062q + "] for " + d.this;
        }
    }

    /* loaded from: classes.dex */
    public final class b<R> extends c {
        @n6.d
        @s4.e

        /* renamed from: q  reason: collision with root package name */
        public final kotlinx.coroutines.selects.f<R> f13066q;
        @n6.d
        @s4.e

        /* renamed from: r  reason: collision with root package name */
        public final p<kotlinx.coroutines.sync.c, e4.d<? super R>, Object> f13067r;

        /* loaded from: classes.dex */
        public static final class a extends n0 implements l<Throwable, m2> {

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ d f13069l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ b<R> f13070m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, b<R> bVar) {
                super(1);
                this.f13069l = dVar;
                this.f13070m = bVar;
            }

            @Override // t4.l
            public /* bridge */ /* synthetic */ m2 O(Throwable th) {
                b(th);
                return m2.f17815a;
            }

            public final void b(@n6.d Throwable th) {
                this.f13069l.b(this.f13070m.f13072n);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@n6.e Object obj, @n6.d kotlinx.coroutines.selects.f<? super R> fVar, @n6.d p<? super kotlinx.coroutines.sync.c, ? super e4.d<? super R>, ? extends Object> pVar) {
            super(obj);
            this.f13066q = fVar;
            this.f13067r = pVar;
        }

        @Override // kotlinx.coroutines.sync.d.c
        public void X0() {
            q5.a.e(this.f13067r, d.this, this.f13066q.h(), new a(d.this, this));
        }

        @Override // kotlinx.coroutines.sync.d.c
        public boolean Z0() {
            return Y0() && this.f13066q.S();
        }

        @Override // kotlinx.coroutines.internal.y
        @n6.d
        public String toString() {
            return "LockSelect[" + this.f13072n + ", " + this.f13066q + "] for " + d.this;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c extends y implements p1 {

        /* renamed from: p  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f13071p = AtomicIntegerFieldUpdater.newUpdater(c.class, "isTaken");
        @n6.d
        private volatile /* synthetic */ int isTaken = 0;
        @s4.e
        @n6.e

        /* renamed from: n  reason: collision with root package name */
        public final Object f13072n;

        public c(@n6.e Object obj) {
            this.f13072n = obj;
        }

        public abstract void X0();

        public final boolean Y0() {
            return f13071p.compareAndSet(this, 0, 1);
        }

        public abstract boolean Z0();

        @Override // kotlinx.coroutines.p1
        public final void j() {
            Q0();
        }
    }

    /* renamed from: kotlinx.coroutines.sync.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0176d extends w {
        @n6.d
        @s4.e
        public volatile Object owner;

        public C0176d(@n6.d Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.y
        @n6.d
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends kotlinx.coroutines.internal.b {
        @n6.d
        @s4.e

        /* renamed from: b  reason: collision with root package name */
        public final d f13074b;
        @s4.e
        @n6.e

        /* renamed from: c  reason: collision with root package name */
        public final Object f13075c;

        /* loaded from: classes.dex */
        public final class a extends j0 {
            @n6.d

            /* renamed from: a  reason: collision with root package name */
            public final kotlinx.coroutines.internal.d<?> f13076a;

            public a(@n6.d kotlinx.coroutines.internal.d<?> dVar) {
                this.f13076a = dVar;
            }

            @Override // kotlinx.coroutines.internal.j0
            @n6.d
            public kotlinx.coroutines.internal.d<?> a() {
                return this.f13076a;
            }

            @Override // kotlinx.coroutines.internal.j0
            @n6.e
            public Object c(@n6.e Object obj) {
                Object a7 = a().h() ? kotlinx.coroutines.sync.e.f13086f : a();
                if (obj != null) {
                    p.b.a(d.f13061k, (d) obj, this, a7);
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
            }
        }

        public e(@n6.d d dVar, @n6.e Object obj) {
            this.f13074b = dVar;
            this.f13075c = obj;
        }

        @Override // kotlinx.coroutines.internal.b
        public void a(@n6.d kotlinx.coroutines.internal.d<?> dVar, @n6.e Object obj) {
            kotlinx.coroutines.sync.b bVar;
            if (obj != null) {
                bVar = kotlinx.coroutines.sync.e.f13086f;
            } else {
                Object obj2 = this.f13075c;
                bVar = obj2 == null ? kotlinx.coroutines.sync.e.f13085e : new kotlinx.coroutines.sync.b(obj2);
            }
            p.b.a(d.f13061k, this.f13074b, dVar, bVar);
        }

        @Override // kotlinx.coroutines.internal.b
        @n6.e
        public Object c(@n6.d kotlinx.coroutines.internal.d<?> dVar) {
            kotlinx.coroutines.sync.b bVar;
            r0 r0Var;
            a aVar = new a(dVar);
            d dVar2 = this.f13074b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f13061k;
            bVar = kotlinx.coroutines.sync.e.f13086f;
            if (p.b.a(atomicReferenceFieldUpdater, dVar2, bVar, aVar)) {
                return aVar.c(this.f13074b);
            }
            r0Var = kotlinx.coroutines.sync.e.f13081a;
            return r0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends kotlinx.coroutines.internal.d<d> {
        @n6.d
        @s4.e

        /* renamed from: b  reason: collision with root package name */
        public final C0176d f13078b;

        public f(@n6.d C0176d c0176d) {
            this.f13078b = c0176d;
        }

        @Override // kotlinx.coroutines.internal.d
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public void d(@n6.d d dVar, @n6.e Object obj) {
            p.b.a(d.f13061k, dVar, this, obj == null ? kotlinx.coroutines.sync.e.f13086f : this.f13078b);
        }

        @Override // kotlinx.coroutines.internal.d
        @n6.e
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public Object i(@n6.d d dVar) {
            r0 r0Var;
            if (this.f13078b.Y0()) {
                return null;
            }
            r0Var = kotlinx.coroutines.sync.e.f13082b;
            return r0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends n0 implements l<Throwable, m2> {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Object f13080m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Object obj) {
            super(1);
            this.f13080m = obj;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Throwable th) {
            b(th);
            return m2.f17815a;
        }

        public final void b(@n6.d Throwable th) {
            d.this.b(this.f13080m);
        }
    }

    public d(boolean z6) {
        this._state = z6 ? kotlinx.coroutines.sync.e.f13085e : kotlinx.coroutines.sync.e.f13086f;
    }

    @Override // kotlinx.coroutines.selects.e
    public <R> void H(@n6.d kotlinx.coroutines.selects.f<? super R> fVar, @n6.e Object obj, @n6.d p<? super kotlinx.coroutines.sync.c, ? super e4.d<? super R>, ? extends Object> pVar) {
        r0 r0Var;
        r0 r0Var2;
        while (!fVar.p0()) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.b) {
                kotlinx.coroutines.sync.b bVar = (kotlinx.coroutines.sync.b) obj2;
                Object obj3 = bVar.f13060a;
                r0Var = kotlinx.coroutines.sync.e.f13084d;
                if (obj3 != r0Var) {
                    p.b.a(f13061k, this, obj2, new C0176d(bVar.f13060a));
                } else {
                    Object L = fVar.L(new e(this, obj));
                    if (L == null) {
                        q5.b.d(pVar, this, fVar.h());
                        return;
                    } else if (L == kotlinx.coroutines.selects.g.d()) {
                        return;
                    } else {
                        r0Var2 = kotlinx.coroutines.sync.e.f13081a;
                        if (L != r0Var2 && L != kotlinx.coroutines.internal.c.f12787b) {
                            throw new IllegalStateException(("performAtomicTrySelect(TryLockDesc) returned " + L).toString());
                        }
                    }
                }
            } else if (obj2 instanceof C0176d) {
                C0176d c0176d = (C0176d) obj2;
                if (!(c0176d.owner != obj)) {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
                b bVar2 = new b(obj, fVar, pVar);
                c0176d.x0(bVar2);
                if (this._state == obj2 || !bVar2.Y0()) {
                    fVar.i0(bVar2);
                    return;
                }
            } else if (!(obj2 instanceof j0)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                ((j0) obj2).c(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    @n6.e
    public Object a(@n6.e Object obj, @n6.d e4.d<? super m2> dVar) {
        Object i7;
        return (!e(obj) && (i7 = i(obj, dVar)) == g4.d.h()) ? i7 : m2.f17815a;
    }

    @Override // kotlinx.coroutines.sync.c
    public void b(@n6.e Object obj) {
        kotlinx.coroutines.sync.b bVar;
        r0 r0Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.b) {
                if (obj == null) {
                    Object obj3 = ((kotlinx.coroutines.sync.b) obj2).f13060a;
                    r0Var = kotlinx.coroutines.sync.e.f13084d;
                    if (!(obj3 != r0Var)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    kotlinx.coroutines.sync.b bVar2 = (kotlinx.coroutines.sync.b) obj2;
                    if (!(bVar2.f13060a == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar2.f13060a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13061k;
                bVar = kotlinx.coroutines.sync.e.f13086f;
                if (p.b.a(atomicReferenceFieldUpdater, this, obj2, bVar)) {
                    return;
                }
            } else if (obj2 instanceof j0) {
                ((j0) obj2).c(this);
            } else if (!(obj2 instanceof C0176d)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                if (obj != null) {
                    C0176d c0176d = (C0176d) obj2;
                    if (!(c0176d.owner == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + c0176d.owner + " but expected " + obj).toString());
                    }
                }
                C0176d c0176d2 = (C0176d) obj2;
                y S0 = c0176d2.S0();
                if (S0 == null) {
                    f fVar = new f(c0176d2);
                    if (p.b.a(f13061k, this, obj2, fVar) && fVar.c(this) == null) {
                        return;
                    }
                } else {
                    c cVar = (c) S0;
                    if (cVar.Z0()) {
                        Object obj4 = cVar.f13072n;
                        if (obj4 == null) {
                            obj4 = kotlinx.coroutines.sync.e.f13083c;
                        }
                        c0176d2.owner = obj4;
                        cVar.X0();
                        return;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean c(@n6.d Object obj) {
        Object obj2 = this._state;
        if (obj2 instanceof kotlinx.coroutines.sync.b) {
            if (((kotlinx.coroutines.sync.b) obj2).f13060a == obj) {
                return true;
            }
        } else if ((obj2 instanceof C0176d) && ((C0176d) obj2).owner == obj) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.c
    @n6.d
    public kotlinx.coroutines.selects.e<Object, kotlinx.coroutines.sync.c> d() {
        return this;
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean e(@n6.e Object obj) {
        r0 r0Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.b) {
                Object obj3 = ((kotlinx.coroutines.sync.b) obj2).f13060a;
                r0Var = kotlinx.coroutines.sync.e.f13084d;
                if (obj3 != r0Var) {
                    return false;
                }
                if (p.b.a(f13061k, this, obj2, obj == null ? kotlinx.coroutines.sync.e.f13085e : new kotlinx.coroutines.sync.b(obj))) {
                    return true;
                }
            } else if (obj2 instanceof C0176d) {
                if (((C0176d) obj2).owner != obj) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (!(obj2 instanceof j0)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                ((j0) obj2).c(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean f() {
        r0 r0Var;
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                Object obj2 = ((kotlinx.coroutines.sync.b) obj).f13060a;
                r0Var = kotlinx.coroutines.sync.e.f13084d;
                return obj2 != r0Var;
            } else if (obj instanceof C0176d) {
                return true;
            } else {
                if (!(obj instanceof j0)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                ((j0) obj).c(this);
            }
        }
    }

    public final boolean h() {
        Object obj = this._state;
        return (obj instanceof C0176d) && ((C0176d) obj).Y0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        kotlinx.coroutines.t.c(r0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r7, e4.d<? super v3.m2> r8) {
        /*
            r6 = this;
            e4.d r0 = g4.c.d(r8)
            kotlinx.coroutines.r r0 = kotlinx.coroutines.t.b(r0)
            kotlinx.coroutines.sync.d$a r1 = new kotlinx.coroutines.sync.d$a
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.b
            if (r3 == 0) goto L4a
            r3 = r2
            kotlinx.coroutines.sync.b r3 = (kotlinx.coroutines.sync.b) r3
            java.lang.Object r4 = r3.f13060a
            kotlinx.coroutines.internal.r0 r5 = kotlinx.coroutines.sync.e.g()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.d.f13061k
            kotlinx.coroutines.sync.d$d r5 = new kotlinx.coroutines.sync.d$d
            java.lang.Object r3 = r3.f13060a
            r5.<init>(r3)
            p.b.a(r4, r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            kotlinx.coroutines.sync.b r3 = kotlinx.coroutines.sync.e.c()
            goto L37
        L32:
            kotlinx.coroutines.sync.b r3 = new kotlinx.coroutines.sync.b
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.d.f13061k
            boolean r2 = p.b.a(r4, r6, r2, r3)
            if (r2 == 0) goto Ld
            v3.m2 r1 = v3.m2.f17815a
            kotlinx.coroutines.sync.d$g r2 = new kotlinx.coroutines.sync.d$g
            r2.<init>(r7)
            r0.Y(r1, r2)
            goto L71
        L4a:
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.d.C0176d
            if (r3 == 0) goto La3
            r3 = r2
            kotlinx.coroutines.sync.d$d r3 = (kotlinx.coroutines.sync.d.C0176d) r3
            java.lang.Object r4 = r3.owner
            if (r4 == r7) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L88
            r3.x0(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L6e
            boolean r2 = r1.Y0()
            if (r2 != 0) goto L68
            goto L6e
        L68:
            kotlinx.coroutines.sync.d$a r1 = new kotlinx.coroutines.sync.d$a
            r1.<init>(r7, r0)
            goto Ld
        L6e:
            kotlinx.coroutines.t.c(r0, r1)
        L71:
            java.lang.Object r7 = r0.A()
            java.lang.Object r0 = g4.d.h()
            if (r7 != r0) goto L7e
            h4.h.c(r8)
        L7e:
            java.lang.Object r8 = g4.d.h()
            if (r7 != r8) goto L85
            return r7
        L85:
            v3.m2 r7 = v3.m2.f17815a
            return r7
        L88:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Already locked by "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        La3:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.j0
            if (r3 == 0) goto Lae
            kotlinx.coroutines.internal.j0 r2 = (kotlinx.coroutines.internal.j0) r2
            r2.c(r6)
            goto Ld
        Lae:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Illegal state "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.d.i(java.lang.Object, e4.d):java.lang.Object");
    }

    @n6.d
    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                return "Mutex[" + ((kotlinx.coroutines.sync.b) obj).f13060a + ']';
            } else if (!(obj instanceof j0)) {
                if (!(obj instanceof C0176d)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                return "Mutex[" + ((C0176d) obj).owner + ']';
            } else {
                ((j0) obj).c(this);
            }
        }
    }
}
