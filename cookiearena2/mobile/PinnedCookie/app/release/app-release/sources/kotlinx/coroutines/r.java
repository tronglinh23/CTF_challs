package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.n2;
@v3.a1
/* loaded from: classes.dex */
public class r<T> extends j1<T> implements q<T>, h4.e {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12933q = AtomicIntegerFieldUpdater.newUpdater(r.class, "_decision");

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12934r = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_state");
    @n6.d
    private volatile /* synthetic */ int _decision;
    @n6.d
    private volatile /* synthetic */ Object _state;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final e4.d<T> f12935n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final e4.g f12936o;
    @n6.e

    /* renamed from: p  reason: collision with root package name */
    public p1 f12937p;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@n6.d e4.d<? super T> dVar, int i7) {
        super(i7);
        this.f12935n = dVar;
        this.f12936o = dVar.g();
        this._decision = 0;
        this._state = d.f11862k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void O(r rVar, Object obj, int i7, t4.l lVar, int i8, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        rVar.M(obj, i7, lVar);
    }

    @n6.e
    @v3.a1
    public final Object A() {
        n2 n2Var;
        boolean F = F();
        if (S()) {
            if (this.f12937p == null) {
                E();
            }
            if (F) {
                K();
            }
            return g4.d.h();
        }
        if (F) {
            K();
        }
        Object B = B();
        if (B instanceof e0) {
            throw ((e0) B).f11961a;
        }
        if (!k1.c(this.f12882m) || (n2Var = (n2) g().e(n2.f12920c)) == null || n2Var.d()) {
            return h(B);
        }
        CancellationException w02 = n2Var.w0();
        c(B, w02);
        throw w02;
    }

    @n6.e
    public final Object B() {
        return this._state;
    }

    public final String C() {
        Object B = B();
        return B instanceof d3 ? "Active" : B instanceof u ? "Cancelled" : "Completed";
    }

    @Override // e4.d
    public void D(@n6.d Object obj) {
        O(this, k0.b(obj, this), this.f12882m, null, 4, null);
    }

    public final p1 E() {
        n2 n2Var = (n2) g().e(n2.f12920c);
        if (n2Var == null) {
            return null;
        }
        p1 f7 = n2.a.f(n2Var, true, false, new v(this), 2, null);
        this.f12937p = f7;
        return f7;
    }

    public final boolean F() {
        return k1.d(this.f12882m) && ((kotlinx.coroutines.internal.l) this.f12935n).t();
    }

    public final o G(t4.l<? super Throwable, v3.m2> lVar) {
        return lVar instanceof o ? (o) lVar : new k2(lVar);
    }

    public final void H(t4.l<? super Throwable, v3.m2> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    @n6.d
    public String I() {
        return "CancellableContinuation";
    }

    public final void J(@n6.d Throwable th) {
        if (t(th)) {
            return;
        }
        b(th);
        w();
    }

    public final void K() {
        Throwable B;
        e4.d<T> dVar = this.f12935n;
        kotlinx.coroutines.internal.l lVar = dVar instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) dVar : null;
        if (lVar == null || (B = lVar.B(this)) == null) {
            return;
        }
        u();
        b(B);
    }

    @s4.h(name = "resetStateReusable")
    public final boolean L() {
        Object obj = this._state;
        if ((obj instanceof d0) && ((d0) obj).f11866d != null) {
            u();
            return false;
        }
        this._decision = 0;
        this._state = d.f11862k;
        return true;
    }

    public final void M(Object obj, int i7, t4.l<? super Throwable, v3.m2> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof d3)) {
                if (obj2 instanceof u) {
                    u uVar = (u) obj2;
                    if (uVar.c()) {
                        if (lVar != null) {
                            s(lVar, uVar.f11961a);
                            return;
                        }
                        return;
                    }
                }
                k(obj);
                throw new v3.y();
            }
        } while (!p.b.a(f12934r, this, obj2, P((d3) obj2, obj, i7, lVar, null)));
        w();
        y(i7);
    }

    @Override // kotlinx.coroutines.q
    public void N(@n6.d t4.l<? super Throwable, v3.m2> lVar) {
        o G = G(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (p.b.a(f12934r, this, obj, G)) {
                    return;
                }
            } else if (obj instanceof o) {
                H(lVar, obj);
            } else {
                boolean z6 = obj instanceof e0;
                if (z6) {
                    e0 e0Var = (e0) obj;
                    if (!e0Var.b()) {
                        H(lVar, obj);
                    }
                    if (obj instanceof u) {
                        if (!z6) {
                            e0Var = null;
                        }
                        n(lVar, e0Var != null ? e0Var.f11961a : null);
                        return;
                    }
                    return;
                } else if (obj instanceof d0) {
                    d0 d0Var = (d0) obj;
                    if (d0Var.f11864b != null) {
                        H(lVar, obj);
                    }
                    if (G instanceof g) {
                        return;
                    }
                    if (d0Var.h()) {
                        n(lVar, d0Var.f11867e);
                        return;
                    } else {
                        if (p.b.a(f12934r, this, obj, d0.g(d0Var, null, G, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else if (G instanceof g) {
                    return;
                } else {
                    if (p.b.a(f12934r, this, obj, new d0(obj, G, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    public final Object P(d3 d3Var, Object obj, int i7, t4.l<? super Throwable, v3.m2> lVar, Object obj2) {
        if (obj instanceof e0) {
            return obj;
        }
        if (k1.c(i7) || obj2 != null) {
            if (lVar != null || (((d3Var instanceof o) && !(d3Var instanceof g)) || obj2 != null)) {
                return new d0(obj, d3Var instanceof o ? (o) d3Var : null, lVar, obj2, null, 16, null);
            }
            return obj;
        }
        return obj;
    }

    public final boolean Q() {
        do {
            int i7 = this._decision;
            if (i7 != 0) {
                if (i7 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f12933q.compareAndSet(this, 0, 2));
        return true;
    }

    public final kotlinx.coroutines.internal.r0 R(Object obj, Object obj2, t4.l<? super Throwable, v3.m2> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof d3)) {
                if ((obj3 instanceof d0) && obj2 != null && ((d0) obj3).f11866d == obj2) {
                    return s.f12943d;
                }
                return null;
            }
        } while (!p.b.a(f12934r, this, obj3, P((d3) obj3, obj, this.f12882m, lVar, obj2)));
        w();
        return s.f12943d;
    }

    public final boolean S() {
        do {
            int i7 = this._decision;
            if (i7 != 0) {
                if (i7 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f12933q.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.q
    public void Y(T t6, @n6.e t4.l<? super Throwable, v3.m2> lVar) {
        M(t6, this.f12882m, lVar);
    }

    @Override // kotlinx.coroutines.q
    public boolean b(@n6.e Throwable th) {
        Object obj;
        boolean z6;
        do {
            obj = this._state;
            if (!(obj instanceof d3)) {
                return false;
            }
            z6 = obj instanceof o;
        } while (!p.b.a(f12934r, this, obj, new u(this, th, z6)));
        o oVar = z6 ? (o) obj : null;
        if (oVar != null) {
            m(oVar, th);
        }
        w();
        y(this.f12882m);
        return true;
    }

    @Override // kotlinx.coroutines.j1
    public void c(@n6.e Object obj, @n6.d Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof d3) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof e0) {
                return;
            }
            if (obj2 instanceof d0) {
                d0 d0Var = (d0) obj2;
                if ((!d0Var.h()) != true) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (p.b.a(f12934r, this, obj2, d0.g(d0Var, null, null, null, null, th, 15, null))) {
                    d0Var.i(this, th);
                    return;
                }
            } else if (p.b.a(f12934r, this, obj2, new d0(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.q
    public boolean d() {
        return B() instanceof d3;
    }

    @Override // kotlinx.coroutines.j1
    @n6.d
    public final e4.d<T> e() {
        return this.f12935n;
    }

    @Override // kotlinx.coroutines.j1
    @n6.e
    public Throwable f(@n6.e Object obj) {
        Throwable f7 = super.f(obj);
        if (f7 != null) {
            return f7;
        }
        return null;
    }

    @Override // e4.d
    @n6.d
    public e4.g g() {
        return this.f12936o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.j1
    public <T> T h(@n6.e Object obj) {
        return obj instanceof d0 ? (T) ((d0) obj).f11863a : obj;
    }

    @Override // kotlinx.coroutines.q
    public boolean isCancelled() {
        return B() instanceof u;
    }

    @Override // kotlinx.coroutines.j1
    @n6.e
    public Object j() {
        return B();
    }

    public final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    @Override // h4.e
    @n6.e
    public StackTraceElement k0() {
        return null;
    }

    @Override // kotlinx.coroutines.q
    public boolean l() {
        return !(B() instanceof d3);
    }

    public final void m(@n6.d o oVar, @n6.e Throwable th) {
        try {
            oVar.b(th);
        } catch (Throwable th2) {
            r0.b(g(), new h0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.q
    @n6.e
    public Object m0(T t6, @n6.e Object obj, @n6.e t4.l<? super Throwable, v3.m2> lVar) {
        return R(t6, obj, lVar);
    }

    public final void n(t4.l<? super Throwable, v3.m2> lVar, Throwable th) {
        try {
            lVar.O(th);
        } catch (Throwable th2) {
            r0.b(g(), new h0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.q
    @n6.e
    public Object o(T t6, @n6.e Object obj) {
        return R(t6, obj, null);
    }

    public final void p(t4.a<v3.m2> aVar) {
        try {
            aVar.n();
        } catch (Throwable th) {
            r0.b(g(), new h0("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.o0] */
    @Override // kotlinx.coroutines.q
    public void q(@n6.d o0 o0Var, @n6.d Throwable th) {
        e4.d<T> dVar = this.f12935n;
        kotlinx.coroutines.internal.l lVar = dVar instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) dVar : null;
        O(this, new e0(th, false, 2, r2), (lVar != null ? lVar.f12816n : null) == o0Var ? 4 : this.f12882m, null, 4, null);
    }

    @Override // kotlinx.coroutines.q
    public void r(@n6.d o0 o0Var, T t6) {
        e4.d<T> dVar = this.f12935n;
        kotlinx.coroutines.internal.l lVar = dVar instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) dVar : null;
        O(this, t6, (lVar != null ? lVar.f12816n : null) == o0Var ? 4 : this.f12882m, null, 4, null);
    }

    @Override // kotlinx.coroutines.q
    @n6.e
    public Object r0(@n6.d Throwable th) {
        return R(new e0(th, false, 2, null), null, null);
    }

    public final void s(@n6.d t4.l<? super Throwable, v3.m2> lVar, @n6.d Throwable th) {
        try {
            lVar.O(th);
        } catch (Throwable th2) {
            r0.b(g(), new h0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final boolean t(Throwable th) {
        if (F()) {
            return ((kotlinx.coroutines.internal.l) this.f12935n).u(th);
        }
        return false;
    }

    @Override // kotlinx.coroutines.q
    public void t0(@n6.d Object obj) {
        y(this.f12882m);
    }

    @n6.d
    public String toString() {
        return I() + '(' + z0.c(this.f12935n) + "){" + C() + "}@" + z0.b(this);
    }

    public final void u() {
        p1 p1Var = this.f12937p;
        if (p1Var == null) {
            return;
        }
        p1Var.j();
        this.f12937p = c3.f11860k;
    }

    @Override // h4.e
    @n6.e
    public h4.e v() {
        e4.d<T> dVar = this.f12935n;
        if (dVar instanceof h4.e) {
            return (h4.e) dVar;
        }
        return null;
    }

    public final void w() {
        if (F()) {
            return;
        }
        u();
    }

    @Override // kotlinx.coroutines.q
    public void x() {
        p1 E = E();
        if (E != null && l()) {
            E.j();
            this.f12937p = c3.f11860k;
        }
    }

    public final void y(int i7) {
        if (Q()) {
            return;
        }
        k1.a(this, i7);
    }

    @n6.d
    public Throwable z(@n6.d n2 n2Var) {
        return n2Var.w0();
    }
}
