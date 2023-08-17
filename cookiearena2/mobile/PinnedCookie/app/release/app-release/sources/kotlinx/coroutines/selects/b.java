package kotlinx.coroutines.selects;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.internal.j0;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s;
import kotlinx.coroutines.selects.a;
import t4.l;
import t4.p;
import u4.l0;
import v3.a1;
import v3.d1;
import v3.e1;
import v3.m2;
@a1
/* loaded from: classes.dex */
public final class b<R> extends w implements kotlinx.coroutines.selects.a<R>, f<R>, e4.d<R>, h4.e {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13023o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_state");

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13024p = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_result");
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final e4.d<R> f13025n;
    @n6.d
    volatile /* synthetic */ Object _state = g.f();
    @n6.d
    private volatile /* synthetic */ Object _result = g.c();
    @n6.d
    private volatile /* synthetic */ Object _parentHandle = null;

    /* loaded from: classes.dex */
    public static final class a extends kotlinx.coroutines.internal.d<Object> {
        @n6.d
        @s4.e

        /* renamed from: b  reason: collision with root package name */
        public final b<?> f13026b;
        @n6.d
        @s4.e

        /* renamed from: c  reason: collision with root package name */
        public final kotlinx.coroutines.internal.b f13027c;

        /* renamed from: d  reason: collision with root package name */
        public final long f13028d = g.b().a();

        public a(@n6.d b<?> bVar, @n6.d kotlinx.coroutines.internal.b bVar2) {
            this.f13026b = bVar;
            this.f13027c = bVar2;
            bVar2.d(this);
        }

        @Override // kotlinx.coroutines.internal.d
        public void d(@n6.e Object obj, @n6.e Object obj2) {
            j(obj2);
            this.f13027c.a(this, obj2);
        }

        @Override // kotlinx.coroutines.internal.d
        public long g() {
            return this.f13028d;
        }

        @Override // kotlinx.coroutines.internal.d
        @n6.e
        public Object i(@n6.e Object obj) {
            Object k7;
            if (obj != null || (k7 = k()) == null) {
                try {
                    return this.f13027c.c(this);
                } catch (Throwable th) {
                    if (obj == null) {
                        l();
                    }
                    throw th;
                }
            }
            return k7;
        }

        public final void j(Object obj) {
            boolean z6 = obj == null;
            if (p.b.a(b.f13023o, this.f13026b, this, z6 ? null : g.f()) && z6) {
                this.f13026b.c1();
            }
        }

        public final Object k() {
            b<?> bVar = this.f13026b;
            while (true) {
                Object obj = bVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof j0) {
                    ((j0) obj).c(this.f13026b);
                } else if (obj != g.f()) {
                    return g.d();
                } else {
                    if (p.b.a(b.f13023o, this.f13026b, g.f(), this)) {
                        return null;
                    }
                }
            }
        }

        public final void l() {
            p.b.a(b.f13023o, this.f13026b, this, g.f());
        }

        @Override // kotlinx.coroutines.internal.j0
        @n6.d
        public String toString() {
            return "AtomicSelectOp(sequence=" + g() + ')';
        }
    }

    /* renamed from: kotlinx.coroutines.selects.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0174b extends y {
        @n6.d
        @s4.e

        /* renamed from: n  reason: collision with root package name */
        public final p1 f13029n;

        public C0174b(@n6.d p1 p1Var) {
            this.f13029n = p1Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends j0 {
        @n6.d
        @s4.e

        /* renamed from: a  reason: collision with root package name */
        public final y.d f13030a;

        public c(@n6.d y.d dVar) {
            this.f13030a = dVar;
        }

        @Override // kotlinx.coroutines.internal.j0
        @n6.d
        public kotlinx.coroutines.internal.d<?> a() {
            return this.f13030a.a();
        }

        @Override // kotlinx.coroutines.internal.j0
        @n6.e
        public Object c(@n6.e Object obj) {
            if (obj != null) {
                b bVar = (b) obj;
                this.f13030a.d();
                Object e7 = this.f13030a.a().e(null);
                p.b.a(b.f13023o, bVar, this, e7 == null ? this.f13030a.f12875c : g.f());
                return e7;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
    }

    /* loaded from: classes.dex */
    public final class d extends p2 {
        public d() {
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Throwable th) {
            X0(th);
            return m2.f17815a;
        }

        @Override // kotlinx.coroutines.g0
        public void X0(@n6.e Throwable th) {
            if (b.this.S()) {
                b.this.H(Y0().w0());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Runnable {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ l f13033l;

        public e(l lVar) {
            this.f13033l = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.S()) {
                q5.a.d(this.f13033l, b.this.h());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@n6.d e4.d<? super R> dVar) {
        this.f13025n = dVar;
    }

    @Override // e4.d
    public void D(@n6.d Object obj) {
        while (true) {
            Object obj2 = this._result;
            if (obj2 == g.c()) {
                if (p.b.a(f13024p, this, g.c(), k0.d(obj, null, 1, null))) {
                    return;
                }
            } else if (obj2 != g4.d.h()) {
                throw new IllegalStateException("Already resumed");
            } else {
                if (p.b.a(f13024p, this, g4.d.h(), g.a())) {
                    if (!d1.i(obj)) {
                        this.f13025n.D(obj);
                        return;
                    }
                    e4.d<R> dVar = this.f13025n;
                    Throwable e7 = d1.e(obj);
                    l0.m(e7);
                    d1.a aVar = d1.f17778l;
                    dVar.D(d1.b(e1.a(e7)));
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void G(@n6.d kotlinx.coroutines.selects.e<? super P, ? extends Q> eVar, P p6, @n6.d p<? super Q, ? super e4.d<? super R>, ? extends Object> pVar) {
        eVar.H(this, p6, pVar);
    }

    @Override // kotlinx.coroutines.selects.f
    public void H(@n6.d Throwable th) {
        while (true) {
            Object obj = this._result;
            if (obj == g.c()) {
                if (p.b.a(f13024p, this, g.c(), new e0(th, false, 2, null))) {
                    return;
                }
            } else if (obj != g4.d.h()) {
                throw new IllegalStateException("Already resumed");
            } else {
                if (p.b.a(f13024p, this, g4.d.h(), g.a())) {
                    e4.d d7 = g4.c.d(this.f13025n);
                    d1.a aVar = d1.f17778l;
                    d7.D(d1.b(e1.a(th)));
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.f
    @n6.e
    public Object L(@n6.d kotlinx.coroutines.internal.b bVar) {
        return new a(this, bVar).c(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        c1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        return kotlinx.coroutines.s.f12943d;
     */
    @Override // kotlinx.coroutines.selects.f
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Q(@n6.e kotlinx.coroutines.internal.y.d r4) {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            java.lang.Object r1 = kotlinx.coroutines.selects.g.f()
            r2 = 0
            if (r0 != r1) goto L36
            if (r4 != 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.b.f13023o
            java.lang.Object r1 = kotlinx.coroutines.selects.g.f()
            boolean r0 = p.b.a(r0, r3, r1, r2)
            if (r0 != 0) goto L30
            goto L0
        L18:
            kotlinx.coroutines.selects.b$c r0 = new kotlinx.coroutines.selects.b$c
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.b.f13023o
            java.lang.Object r2 = kotlinx.coroutines.selects.g.f()
            boolean r1 = p.b.a(r1, r3, r2, r0)
            if (r1 == 0) goto L0
            java.lang.Object r4 = r0.c(r3)
            if (r4 == 0) goto L30
            return r4
        L30:
            r3.c1()
            kotlinx.coroutines.internal.r0 r4 = kotlinx.coroutines.s.f12943d
            return r4
        L36:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.j0
            if (r1 == 0) goto L6a
            if (r4 == 0) goto L64
            kotlinx.coroutines.internal.d r1 = r4.a()
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.b.a
            if (r2 == 0) goto L58
            r2 = r1
            kotlinx.coroutines.selects.b$a r2 = (kotlinx.coroutines.selects.b.a) r2
            kotlinx.coroutines.selects.b<?> r2 = r2.f13026b
            if (r2 == r3) goto L4c
            goto L58
        L4c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use matching select clauses on the same object"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L58:
            r2 = r0
            kotlinx.coroutines.internal.j0 r2 = (kotlinx.coroutines.internal.j0) r2
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L64
            java.lang.Object r4 = kotlinx.coroutines.internal.c.f12787b
            return r4
        L64:
            kotlinx.coroutines.internal.j0 r0 = (kotlinx.coroutines.internal.j0) r0
            r0.c(r3)
            goto L0
        L6a:
            if (r4 != 0) goto L6d
            return r2
        L6d:
            kotlinx.coroutines.internal.y$a r4 = r4.f12875c
            if (r0 != r4) goto L74
            kotlinx.coroutines.internal.r0 r4 = kotlinx.coroutines.s.f12943d
            return r4
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.b.Q(kotlinx.coroutines.internal.y$d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.selects.f
    public boolean S() {
        Object Q = Q(null);
        if (Q == s.f12943d) {
            return true;
        }
        if (Q == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + Q).toString());
    }

    public final void c1() {
        p1 e12 = e1();
        if (e12 != null) {
            e12.j();
        }
        for (y yVar = (y) I0(); !l0.g(yVar, this); yVar = yVar.J0()) {
            if (yVar instanceof C0174b) {
                ((C0174b) yVar).f13029n.j();
            }
        }
    }

    public final void d1(t4.a<? extends Object> aVar, t4.a<m2> aVar2) {
        while (true) {
            Object obj = this._result;
            if (obj == g.c()) {
                if (p.b.a(f13024p, this, g.c(), aVar.n())) {
                    return;
                }
            } else if (obj != g4.d.h()) {
                throw new IllegalStateException("Already resumed");
            } else {
                if (p.b.a(f13024p, this, g4.d.h(), g.a())) {
                    aVar2.n();
                    return;
                }
            }
        }
    }

    public final p1 e1() {
        return (p1) this._parentHandle;
    }

    @Override // kotlinx.coroutines.selects.a
    public void f(long j7, @n6.d l<? super e4.d<? super R>, ? extends Object> lVar) {
        if (j7 > 0) {
            i0(f1.d(g()).z0(j7, new e(lVar), g()));
        } else if (S()) {
            q5.b.c(lVar, h());
        }
    }

    @n6.e
    @a1
    public final Object f1() {
        if (!p0()) {
            x();
        }
        Object obj = this._result;
        if (obj == g.c()) {
            if (p.b.a(f13024p, this, g.c(), g4.d.h())) {
                return g4.d.h();
            }
            obj = this._result;
        }
        if (obj != g.a()) {
            if (obj instanceof e0) {
                throw ((e0) obj).f11961a;
            }
            return obj;
        }
        throw new IllegalStateException("Already resumed");
    }

    @Override // e4.d
    @n6.d
    public e4.g g() {
        return this.f13025n.g();
    }

    @a1
    public final void g1(@n6.d Throwable th) {
        if (S()) {
            d1.a aVar = d1.f17778l;
            D(d1.b(e1.a(th)));
        } else if (th instanceof CancellationException) {
        } else {
            Object f12 = f1();
            if ((f12 instanceof e0) && ((e0) f12).f11961a == th) {
                return;
            }
            r0.b(g(), th);
        }
    }

    @Override // kotlinx.coroutines.selects.f
    @n6.d
    public e4.d<R> h() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.a
    public <Q> void h0(@n6.d kotlinx.coroutines.selects.d<? extends Q> dVar, @n6.d p<? super Q, ? super e4.d<? super R>, ? extends Object> pVar) {
        dVar.c(this, pVar);
    }

    public final void h1(p1 p1Var) {
        this._parentHandle = p1Var;
    }

    @Override // kotlinx.coroutines.selects.f
    public void i0(@n6.d p1 p1Var) {
        C0174b c0174b = new C0174b(p1Var);
        if (!p0()) {
            x0(c0174b);
            if (!p0()) {
                return;
            }
        }
        p1Var.j();
    }

    @Override // kotlinx.coroutines.selects.a
    public void k(@n6.d kotlinx.coroutines.selects.c cVar, @n6.d l<? super e4.d<? super R>, ? extends Object> lVar) {
        cVar.P(this, lVar);
    }

    @Override // h4.e
    @n6.e
    public StackTraceElement k0() {
        return null;
    }

    @Override // kotlinx.coroutines.selects.f
    public boolean p0() {
        while (true) {
            Object obj = this._state;
            if (obj == g.f()) {
                return false;
            }
            if (!(obj instanceof j0)) {
                return true;
            }
            ((j0) obj).c(this);
        }
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void q0(@n6.d kotlinx.coroutines.selects.e<? super P, ? extends Q> eVar, @n6.d p<? super Q, ? super e4.d<? super R>, ? extends Object> pVar) {
        a.C0173a.a(this, eVar, pVar);
    }

    @Override // kotlinx.coroutines.internal.y
    @n6.d
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    @Override // h4.e
    @n6.e
    public h4.e v() {
        e4.d<R> dVar = this.f13025n;
        if (dVar instanceof h4.e) {
            return (h4.e) dVar;
        }
        return null;
    }

    public final void x() {
        n2 n2Var = (n2) g().e(n2.f12920c);
        if (n2Var == null) {
            return;
        }
        p1 f7 = n2.a.f(n2Var, true, false, new d(), 2, null);
        h1(f7);
        if (p0()) {
            f7.j();
        }
    }
}
