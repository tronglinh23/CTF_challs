package n5;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.q;
import kotlinx.coroutines.z0;
import n5.n;
import n5.p;
import n5.r;
import v3.b1;
import v3.d1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public abstract class a<E> extends n5.c<E> implements n<E> {

    /* renamed from: n5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0189a<E> implements p<E> {
        @n6.d
        @s4.e

        /* renamed from: a  reason: collision with root package name */
        public final a<E> f13878a;
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public Object f13879b = n5.b.f13904f;

        public C0189a(@n6.d a<E> aVar) {
            this.f13878a = aVar;
        }

        @Override // n5.p
        @s4.h(name = "next")
        @v3.k(level = v3.m.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ Object a(e4.d dVar) {
            return p.a.a(this, dVar);
        }

        @Override // n5.p
        @n6.e
        public Object b(@n6.d e4.d<? super Boolean> dVar) {
            Object obj = this.f13879b;
            r0 r0Var = n5.b.f13904f;
            if (obj != r0Var) {
                return h4.b.a(e(obj));
            }
            Object o02 = this.f13878a.o0();
            this.f13879b = o02;
            return o02 != r0Var ? h4.b.a(e(o02)) : f(dVar);
        }

        @n6.e
        public final Object d() {
            return this.f13879b;
        }

        public final boolean e(Object obj) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (wVar.f14213n == null) {
                    return false;
                }
                throw kotlinx.coroutines.internal.q0.p(wVar.e1());
            }
            return true;
        }

        public final Object f(e4.d<? super Boolean> dVar) {
            kotlinx.coroutines.r b7 = kotlinx.coroutines.t.b(g4.c.d(dVar));
            d dVar2 = new d(this, b7);
            while (true) {
                if (this.f13878a.d0(dVar2)) {
                    this.f13878a.s0(b7, dVar2);
                    break;
                }
                Object o02 = this.f13878a.o0();
                g(o02);
                if (o02 instanceof w) {
                    w wVar = (w) o02;
                    if (wVar.f14213n == null) {
                        d1.a aVar = d1.f17778l;
                        b7.D(d1.b(h4.b.a(false)));
                    } else {
                        d1.a aVar2 = d1.f17778l;
                        b7.D(d1.b(e1.a(wVar.e1())));
                    }
                } else if (o02 != n5.b.f13904f) {
                    Boolean a7 = h4.b.a(true);
                    t4.l<E, m2> lVar = this.f13878a.f13909k;
                    b7.Y(a7, lVar != null ? kotlinx.coroutines.internal.i0.a(lVar, o02, b7.g()) : null);
                }
            }
            Object A = b7.A();
            if (A == g4.d.h()) {
                h4.h.c(dVar);
            }
            return A;
        }

        public final void g(@n6.e Object obj) {
            this.f13879b = obj;
        }

        @Override // n5.p
        public E next() {
            E e7 = (E) this.f13879b;
            if (e7 instanceof w) {
                throw kotlinx.coroutines.internal.q0.p(((w) e7).e1());
            }
            r0 r0Var = n5.b.f13904f;
            if (e7 != r0Var) {
                this.f13879b = r0Var;
                return e7;
            }
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
    }

    /* loaded from: classes.dex */
    public static class b<E> extends h0<E> {
        @n6.d
        @s4.e

        /* renamed from: n  reason: collision with root package name */
        public final kotlinx.coroutines.q<Object> f13880n;
        @s4.e

        /* renamed from: o  reason: collision with root package name */
        public final int f13881o;

        public b(@n6.d kotlinx.coroutines.q<Object> qVar, int i7) {
            this.f13880n = qVar;
            this.f13881o = i7;
        }

        @Override // n5.j0
        public void A(E e7) {
            this.f13880n.t0(kotlinx.coroutines.s.f12943d);
        }

        @Override // n5.h0
        public void Z0(@n6.d w<?> wVar) {
            if (this.f13881o != 1) {
                kotlinx.coroutines.q<Object> qVar = this.f13880n;
                d1.a aVar = d1.f17778l;
                qVar.D(d1.b(e1.a(wVar.e1())));
                return;
            }
            kotlinx.coroutines.q<Object> qVar2 = this.f13880n;
            r b7 = r.b(r.f13994b.a(wVar.f14213n));
            d1.a aVar2 = d1.f17778l;
            qVar2.D(d1.b(b7));
        }

        @n6.e
        public final Object a1(E e7) {
            return this.f13881o == 1 ? r.b(r.f13994b.c(e7)) : e7;
        }

        @Override // n5.j0
        @n6.e
        public r0 c0(E e7, @n6.e y.d dVar) {
            if (this.f13880n.m0(a1(e7), dVar != null ? dVar.f12875c : null, Y0(e7)) == null) {
                return null;
            }
            if (dVar != null) {
                dVar.d();
            }
            return kotlinx.coroutines.s.f12943d;
        }

        @Override // kotlinx.coroutines.internal.y
        @n6.d
        public String toString() {
            return "ReceiveElement@" + z0.b(this) + "[receiveMode=" + this.f13881o + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class c<E> extends b<E> {
        @n6.d
        @s4.e

        /* renamed from: p  reason: collision with root package name */
        public final t4.l<E, m2> f13882p;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@n6.d kotlinx.coroutines.q<Object> qVar, int i7, @n6.d t4.l<? super E, m2> lVar) {
            super(qVar, i7);
            this.f13882p = lVar;
        }

        @Override // n5.h0
        @n6.e
        public t4.l<Throwable, m2> Y0(E e7) {
            return kotlinx.coroutines.internal.i0.a(this.f13882p, e7, this.f13880n.g());
        }
    }

    /* loaded from: classes.dex */
    public static class d<E> extends h0<E> {
        @n6.d
        @s4.e

        /* renamed from: n  reason: collision with root package name */
        public final C0189a<E> f13883n;
        @n6.d
        @s4.e

        /* renamed from: o  reason: collision with root package name */
        public final kotlinx.coroutines.q<Boolean> f13884o;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@n6.d C0189a<E> c0189a, @n6.d kotlinx.coroutines.q<? super Boolean> qVar) {
            this.f13883n = c0189a;
            this.f13884o = qVar;
        }

        @Override // n5.j0
        public void A(E e7) {
            this.f13883n.g(e7);
            this.f13884o.t0(kotlinx.coroutines.s.f12943d);
        }

        @Override // n5.h0
        @n6.e
        public t4.l<Throwable, m2> Y0(E e7) {
            t4.l<E, m2> lVar = this.f13883n.f13878a.f13909k;
            if (lVar != null) {
                return kotlinx.coroutines.internal.i0.a(lVar, e7, this.f13884o.g());
            }
            return null;
        }

        @Override // n5.h0
        public void Z0(@n6.d w<?> wVar) {
            Object b7 = wVar.f14213n == null ? q.a.b(this.f13884o, Boolean.FALSE, null, 2, null) : this.f13884o.r0(wVar.e1());
            if (b7 != null) {
                this.f13883n.g(wVar);
                this.f13884o.t0(b7);
            }
        }

        @Override // n5.j0
        @n6.e
        public r0 c0(E e7, @n6.e y.d dVar) {
            if (this.f13884o.m0(Boolean.TRUE, dVar != null ? dVar.f12875c : null, Y0(e7)) == null) {
                return null;
            }
            if (dVar != null) {
                dVar.d();
            }
            return kotlinx.coroutines.s.f12943d;
        }

        @Override // kotlinx.coroutines.internal.y
        @n6.d
        public String toString() {
            return "ReceiveHasNext@" + z0.b(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class e<R, E> extends h0<E> implements p1 {
        @n6.d
        @s4.e

        /* renamed from: n  reason: collision with root package name */
        public final a<E> f13885n;
        @n6.d
        @s4.e

        /* renamed from: o  reason: collision with root package name */
        public final kotlinx.coroutines.selects.f<R> f13886o;
        @n6.d
        @s4.e

        /* renamed from: p  reason: collision with root package name */
        public final t4.p<Object, e4.d<? super R>, Object> f13887p;
        @s4.e

        /* renamed from: q  reason: collision with root package name */
        public final int f13888q;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@n6.d a<E> aVar, @n6.d kotlinx.coroutines.selects.f<? super R> fVar, @n6.d t4.p<Object, ? super e4.d<? super R>, ? extends Object> pVar, int i7) {
            this.f13885n = aVar;
            this.f13886o = fVar;
            this.f13887p = pVar;
            this.f13888q = i7;
        }

        @Override // n5.j0
        public void A(E e7) {
            q5.a.e(this.f13887p, this.f13888q == 1 ? r.b(r.f13994b.c(e7)) : e7, this.f13886o.h(), Y0(e7));
        }

        @Override // n5.h0
        @n6.e
        public t4.l<Throwable, m2> Y0(E e7) {
            t4.l<E, m2> lVar = this.f13885n.f13909k;
            if (lVar != null) {
                return kotlinx.coroutines.internal.i0.a(lVar, e7, this.f13886o.h().g());
            }
            return null;
        }

        @Override // n5.h0
        public void Z0(@n6.d w<?> wVar) {
            if (this.f13886o.S()) {
                int i7 = this.f13888q;
                if (i7 == 0) {
                    this.f13886o.H(wVar.e1());
                } else if (i7 != 1) {
                } else {
                    q5.a.f(this.f13887p, r.b(r.f13994b.a(wVar.f14213n)), this.f13886o.h(), null, 4, null);
                }
            }
        }

        @Override // n5.j0
        @n6.e
        public r0 c0(E e7, @n6.e y.d dVar) {
            return (r0) this.f13886o.Q(dVar);
        }

        @Override // kotlinx.coroutines.p1
        public void j() {
            if (Q0()) {
                this.f13885n.m0();
            }
        }

        @Override // kotlinx.coroutines.internal.y
        @n6.d
        public String toString() {
            return "ReceiveSelect@" + z0.b(this) + '[' + this.f13886o + ",receiveMode=" + this.f13888q + ']';
        }
    }

    /* loaded from: classes.dex */
    public final class f extends kotlinx.coroutines.g {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final h0<?> f13889k;

        public f(@n6.d h0<?> h0Var) {
            this.f13889k = h0Var;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Throwable th) {
            b(th);
            return m2.f17815a;
        }

        @Override // kotlinx.coroutines.p
        public void b(@n6.e Throwable th) {
            if (this.f13889k.Q0()) {
                a.this.m0();
            }
        }

        @n6.d
        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f13889k + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class g<E> extends y.e<l0> {
        public g(@n6.d kotlinx.coroutines.internal.w wVar) {
            super(wVar);
        }

        @Override // kotlinx.coroutines.internal.y.e, kotlinx.coroutines.internal.y.a
        @n6.e
        public Object e(@n6.d kotlinx.coroutines.internal.y yVar) {
            if (yVar instanceof w) {
                return yVar;
            }
            if (yVar instanceof l0) {
                return null;
            }
            return n5.b.f13904f;
        }

        @Override // kotlinx.coroutines.internal.y.a
        @n6.e
        public Object j(@n6.d y.d dVar) {
            r0 a12 = ((l0) dVar.f12873a).a1(dVar);
            if (a12 == null) {
                return kotlinx.coroutines.internal.z.f12881a;
            }
            Object obj = kotlinx.coroutines.internal.c.f12787b;
            if (a12 == obj) {
                return obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.y.a
        public void k(@n6.d kotlinx.coroutines.internal.y yVar) {
            ((l0) yVar).b1();
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends y.c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f13891d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(kotlinx.coroutines.internal.y yVar, a aVar) {
            super(yVar);
            this.f13891d = aVar;
        }

        @Override // kotlinx.coroutines.internal.d
        @n6.e
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public Object i(@n6.d kotlinx.coroutines.internal.y yVar) {
            if (this.f13891d.i0()) {
                return null;
            }
            return kotlinx.coroutines.internal.x.a();
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements kotlinx.coroutines.selects.d<E> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ a<E> f13892k;

        public i(a<E> aVar) {
            this.f13892k = aVar;
        }

        @Override // kotlinx.coroutines.selects.d
        public <R> void c(@n6.d kotlinx.coroutines.selects.f<? super R> fVar, @n6.d t4.p<? super E, ? super e4.d<? super R>, ? extends Object> pVar) {
            this.f13892k.r0(fVar, 0, pVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements kotlinx.coroutines.selects.d<r<? extends E>> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ a<E> f13893k;

        public j(a<E> aVar) {
            this.f13893k = aVar;
        }

        @Override // kotlinx.coroutines.selects.d
        public <R> void c(@n6.d kotlinx.coroutines.selects.f<? super R> fVar, @n6.d t4.p<? super r<? extends E>, ? super e4.d<? super R>, ? extends Object> pVar) {
            this.f13893k.r0(fVar, 1, pVar);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", i = {}, l = {633}, m = "receiveCatching-JP2dKIU", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class k extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public /* synthetic */ Object f13894n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ a<E> f13895o;

        /* renamed from: p  reason: collision with root package name */
        public int f13896p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(a<E> aVar, e4.d<? super k> dVar) {
            super(dVar);
            this.f13895o = aVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f13894n = obj;
            this.f13896p |= Integer.MIN_VALUE;
            Object F = this.f13895o.F(this);
            return F == g4.d.h() ? F : r.b(F);
        }
    }

    public a(@n6.e t4.l<? super E, m2> lVar) {
        super(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // n5.i0
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(@n6.d e4.d<? super n5.r<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof n5.a.k
            if (r0 == 0) goto L13
            r0 = r5
            n5.a$k r0 = (n5.a.k) r0
            int r1 = r0.f13896p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13896p = r1
            goto L18
        L13:
            n5.a$k r0 = new n5.a$k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13894n
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f13896p
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            v3.e1.n(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            v3.e1.n(r5)
            java.lang.Object r5 = r4.o0()
            kotlinx.coroutines.internal.r0 r2 = n5.b.f13904f
            if (r5 == r2) goto L52
            boolean r0 = r5 instanceof n5.w
            if (r0 == 0) goto L4b
            n5.r$b r0 = n5.r.f13994b
            n5.w r5 = (n5.w) r5
            java.lang.Throwable r5 = r5.f14213n
            java.lang.Object r5 = r0.a(r5)
            goto L51
        L4b:
            n5.r$b r0 = n5.r.f13994b
            java.lang.Object r5 = r0.c(r5)
        L51:
            return r5
        L52:
            r0.f13896p = r3
            java.lang.Object r5 = r4.q0(r3, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            n5.r r5 = (n5.r) r5
            java.lang.Object r5 = r5.o()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a.F(e4.d):java.lang.Object");
    }

    @Override // n5.i0
    @n6.d
    public final kotlinx.coroutines.selects.d<E> G() {
        return new i(this);
    }

    @Override // n5.i0
    @n6.d
    public final kotlinx.coroutines.selects.d<r<E>> J() {
        return new j(this);
    }

    @Override // n5.i0
    @n6.d
    public kotlinx.coroutines.selects.d<E> K() {
        return n.a.b(this);
    }

    @Override // n5.i0
    @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
    @n6.e
    public E M() {
        return (E) n.a.d(this);
    }

    @Override // n5.c
    @n6.e
    public j0<E> Q() {
        j0<E> Q = super.Q();
        if (Q != null && !(Q instanceof w)) {
            m0();
        }
        return Q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n5.i0
    @n6.d
    public final Object T() {
        Object o02 = o0();
        return o02 == n5.b.f13904f ? r.f13994b.b() : o02 instanceof w ? r.f13994b.a(((w) o02).f14213n) : r.f13994b.c(o02);
    }

    @Override // n5.i0
    @k4.h
    @v3.k(level = v3.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    @n6.e
    public Object U(@n6.d e4.d<? super E> dVar) {
        return n.a.e(this, dVar);
    }

    @Override // n5.i0
    /* renamed from: b0  reason: merged with bridge method [inline-methods] */
    public final boolean b(@n6.e Throwable th) {
        boolean w6 = w(th);
        k0(w6);
        return w6;
    }

    @n6.d
    public final g<E> c0() {
        return new g<>(q());
    }

    @Override // n5.i0
    @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        f(null);
    }

    public final boolean d0(h0<? super E> h0Var) {
        boolean e02 = e0(h0Var);
        if (e02) {
            n0();
        }
        return e02;
    }

    public boolean e0(@n6.d h0<? super E> h0Var) {
        int V0;
        kotlinx.coroutines.internal.y K0;
        if (!h0()) {
            kotlinx.coroutines.internal.y q6 = q();
            h hVar = new h(h0Var, this);
            do {
                kotlinx.coroutines.internal.y K02 = q6.K0();
                if ((!(K02 instanceof l0)) != true) {
                    return false;
                }
                V0 = K02.V0(h0Var, q6, hVar);
                if (V0 != 1) {
                }
            } while (V0 != 2);
            return false;
        }
        kotlinx.coroutines.internal.y q7 = q();
        do {
            K0 = q7.K0();
            if ((!(K0 instanceof l0)) == false) {
                return false;
            }
        } while (!K0.B0(h0Var, q7));
        return true;
    }

    @Override // n5.i0
    public final void f(@n6.e CancellationException cancellationException) {
        if (y()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(z0.a(this) + " was cancelled");
        }
        b(cancellationException);
    }

    public final <R> boolean f0(kotlinx.coroutines.selects.f<? super R> fVar, t4.p<Object, ? super e4.d<? super R>, ? extends Object> pVar, int i7) {
        e eVar = new e(this, fVar, pVar, i7);
        boolean d02 = d0(eVar);
        if (d02) {
            fVar.i0(eVar);
        }
        return d02;
    }

    public final boolean g0() {
        return q().J0() instanceof j0;
    }

    public abstract boolean h0();

    public abstract boolean i0();

    @Override // n5.i0
    public boolean isEmpty() {
        return j0();
    }

    @Override // n5.i0
    @n6.d
    public final p<E> iterator() {
        return new C0189a(this);
    }

    public final boolean j0() {
        return !(q().J0() instanceof l0) && i0();
    }

    public void k0(boolean z6) {
        w<?> p6 = p();
        if (p6 == null) {
            throw new IllegalStateException("Cannot happen".toString());
        }
        Object c7 = kotlinx.coroutines.internal.q.c(null, 1, null);
        while (true) {
            kotlinx.coroutines.internal.y K0 = p6.K0();
            if (K0 instanceof kotlinx.coroutines.internal.w) {
                l0(c7, p6);
                return;
            } else if (K0.Q0()) {
                c7 = kotlinx.coroutines.internal.q.h(c7, (l0) K0);
            } else {
                K0.L0();
            }
        }
    }

    public void l0(@n6.d Object obj, @n6.d w<?> wVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((l0) obj).Z0(wVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            ((l0) arrayList.get(size)).Z0(wVar);
        }
    }

    public void m0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n5.i0
    @n6.e
    public final Object n(@n6.d e4.d<? super E> dVar) {
        Object o02 = o0();
        return (o02 == n5.b.f13904f || (o02 instanceof w)) ? q0(0, dVar) : o02;
    }

    public void n0() {
    }

    @n6.e
    public Object o0() {
        while (true) {
            l0 R = R();
            if (R == null) {
                return n5.b.f13904f;
            }
            if (R.a1(null) != null) {
                R.X0();
                return R.Y0();
            }
            R.b1();
        }
    }

    @n6.e
    public Object p0(@n6.d kotlinx.coroutines.selects.f<?> fVar) {
        g<E> c02 = c0();
        Object L = fVar.L(c02);
        if (L != null) {
            return L;
        }
        c02.o().X0();
        return c02.o().Y0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [n5.a$b] */
    public final <R> Object q0(int i7, e4.d<? super R> dVar) {
        kotlinx.coroutines.r b7 = kotlinx.coroutines.t.b(g4.c.d(dVar));
        c bVar = this.f13909k == null ? new b(b7, i7) : new c(b7, i7, this.f13909k);
        while (true) {
            if (d0(bVar)) {
                s0(b7, bVar);
                break;
            }
            Object o02 = o0();
            if (o02 instanceof w) {
                bVar.Z0((w) o02);
                break;
            } else if (o02 != n5.b.f13904f) {
                b7.Y(bVar.a1(o02), bVar.Y0(o02));
                break;
            }
        }
        Object A = b7.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        return A;
    }

    public final <R> void r0(kotlinx.coroutines.selects.f<? super R> fVar, int i7, t4.p<Object, ? super e4.d<? super R>, ? extends Object> pVar) {
        while (!fVar.p0()) {
            if (!j0()) {
                Object p02 = p0(fVar);
                if (p02 == kotlinx.coroutines.selects.g.d()) {
                    return;
                }
                if (p02 != n5.b.f13904f && p02 != kotlinx.coroutines.internal.c.f12787b) {
                    t0(pVar, fVar, i7, p02);
                }
            } else if (f0(fVar, pVar, i7)) {
                return;
            }
        }
    }

    public final void s0(kotlinx.coroutines.q<?> qVar, h0<?> h0Var) {
        qVar.N(new f(h0Var));
    }

    public final <R> void t0(t4.p<Object, ? super e4.d<? super R>, ? extends Object> pVar, kotlinx.coroutines.selects.f<? super R> fVar, int i7, Object obj) {
        boolean z6 = obj instanceof w;
        if (!z6) {
            if (i7 != 1) {
                q5.b.d(pVar, obj, fVar.h());
                return;
            }
            r.b bVar = r.f13994b;
            q5.b.d(pVar, r.b(z6 ? bVar.a(((w) obj).f14213n) : bVar.c(obj)), fVar.h());
        } else if (i7 == 0) {
            throw kotlinx.coroutines.internal.q0.p(((w) obj).e1());
        } else {
            if (i7 == 1 && fVar.S()) {
                q5.b.d(pVar, r.b(r.f13994b.a(((w) obj).f14213n)), fVar.h());
            }
        }
    }

    @Override // n5.i0
    public boolean y() {
        return o() != null && i0();
    }
}
