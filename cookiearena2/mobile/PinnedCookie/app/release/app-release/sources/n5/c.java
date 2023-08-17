package n5;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.z0;
import n5.m0;
import u4.u1;
import v3.d1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public abstract class c<E> implements m0<E> {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13908m = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");
    @s4.e
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public final t4.l<E, m2> f13909k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final kotlinx.coroutines.internal.w f13910l = new kotlinx.coroutines.internal.w();
    @n6.d
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* loaded from: classes.dex */
    public static final class a<E> extends l0 {
        @s4.e

        /* renamed from: n  reason: collision with root package name */
        public final E f13911n;

        public a(E e7) {
            this.f13911n = e7;
        }

        @Override // n5.l0
        public void X0() {
        }

        @Override // n5.l0
        @n6.e
        public Object Y0() {
            return this.f13911n;
        }

        @Override // n5.l0
        public void Z0(@n6.d w<?> wVar) {
        }

        @Override // n5.l0
        @n6.e
        public r0 a1(@n6.e y.d dVar) {
            r0 r0Var = kotlinx.coroutines.s.f12943d;
            if (dVar != null) {
                dVar.d();
            }
            return r0Var;
        }

        @Override // kotlinx.coroutines.internal.y
        @n6.d
        public String toString() {
            return "SendBuffered@" + z0.b(this) + '(' + this.f13911n + ')';
        }
    }

    /* loaded from: classes.dex */
    public static class b<E> extends y.b<a<? extends E>> {
        public b(@n6.d kotlinx.coroutines.internal.w wVar, E e7) {
            super(wVar, new a(e7));
        }

        @Override // kotlinx.coroutines.internal.y.a
        @n6.e
        public Object e(@n6.d kotlinx.coroutines.internal.y yVar) {
            if (yVar instanceof w) {
                return yVar;
            }
            if (yVar instanceof j0) {
                return n5.b.f13903e;
            }
            return null;
        }
    }

    /* renamed from: n5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0190c<E, R> extends l0 implements p1 {

        /* renamed from: n  reason: collision with root package name */
        public final E f13912n;
        @n6.d
        @s4.e

        /* renamed from: o  reason: collision with root package name */
        public final c<E> f13913o;
        @n6.d
        @s4.e

        /* renamed from: p  reason: collision with root package name */
        public final kotlinx.coroutines.selects.f<R> f13914p;
        @n6.d
        @s4.e

        /* renamed from: q  reason: collision with root package name */
        public final t4.p<m0<? super E>, e4.d<? super R>, Object> f13915q;

        /* JADX WARN: Multi-variable type inference failed */
        public C0190c(E e7, @n6.d c<E> cVar, @n6.d kotlinx.coroutines.selects.f<? super R> fVar, @n6.d t4.p<? super m0<? super E>, ? super e4.d<? super R>, ? extends Object> pVar) {
            this.f13912n = e7;
            this.f13913o = cVar;
            this.f13914p = fVar;
            this.f13915q = pVar;
        }

        @Override // n5.l0
        public void X0() {
            q5.a.f(this.f13915q, this.f13913o, this.f13914p.h(), null, 4, null);
        }

        @Override // n5.l0
        public E Y0() {
            return this.f13912n;
        }

        @Override // n5.l0
        public void Z0(@n6.d w<?> wVar) {
            if (this.f13914p.S()) {
                this.f13914p.H(wVar.f1());
            }
        }

        @Override // n5.l0
        @n6.e
        public r0 a1(@n6.e y.d dVar) {
            return (r0) this.f13914p.Q(dVar);
        }

        @Override // n5.l0
        public void b1() {
            t4.l<E, m2> lVar = this.f13913o.f13909k;
            if (lVar != null) {
                kotlinx.coroutines.internal.i0.b(lVar, Y0(), this.f13914p.h().g());
            }
        }

        @Override // kotlinx.coroutines.p1
        public void j() {
            if (Q0()) {
                b1();
            }
        }

        @Override // kotlinx.coroutines.internal.y
        @n6.d
        public String toString() {
            return "SendSelect@" + z0.b(this) + '(' + Y0() + ")[" + this.f13913o + ", " + this.f13914p + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class d<E> extends y.e<j0<? super E>> {
        @s4.e

        /* renamed from: e  reason: collision with root package name */
        public final E f13916e;

        public d(E e7, @n6.d kotlinx.coroutines.internal.w wVar) {
            super(wVar);
            this.f13916e = e7;
        }

        @Override // kotlinx.coroutines.internal.y.e, kotlinx.coroutines.internal.y.a
        @n6.e
        public Object e(@n6.d kotlinx.coroutines.internal.y yVar) {
            if (yVar instanceof w) {
                return yVar;
            }
            if (yVar instanceof j0) {
                return null;
            }
            return n5.b.f13903e;
        }

        @Override // kotlinx.coroutines.internal.y.a
        @n6.e
        public Object j(@n6.d y.d dVar) {
            r0 c02 = ((j0) dVar.f12873a).c0(this.f13916e, dVar);
            if (c02 == null) {
                return kotlinx.coroutines.internal.z.f12881a;
            }
            Object obj = kotlinx.coroutines.internal.c.f12787b;
            if (c02 == obj) {
                return obj;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends y.c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f13917d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kotlinx.coroutines.internal.y yVar, c cVar) {
            super(yVar);
            this.f13917d = cVar;
        }

        @Override // kotlinx.coroutines.internal.d
        @n6.e
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public Object i(@n6.d kotlinx.coroutines.internal.y yVar) {
            if (this.f13917d.D()) {
                return null;
            }
            return kotlinx.coroutines.internal.x.a();
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements kotlinx.coroutines.selects.e<E, m0<? super E>> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ c<E> f13918k;

        public f(c<E> cVar) {
            this.f13918k = cVar;
        }

        @Override // kotlinx.coroutines.selects.e
        public <R> void H(@n6.d kotlinx.coroutines.selects.f<? super R> fVar, E e7, @n6.d t4.p<? super m0<? super E>, ? super e4.d<? super R>, ? extends Object> pVar) {
            this.f13918k.N(fVar, e7, pVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@n6.e t4.l<? super E, m2> lVar) {
        this.f13909k = lVar;
    }

    public final void A(Throwable th) {
        r0 r0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (r0Var = n5.b.f13906h) || !p.b.a(f13908m, this, obj, r0Var)) {
            return;
        }
        ((t4.l) u1.q(obj, 1)).O(th);
    }

    public abstract boolean C();

    public abstract boolean D();

    public final boolean E() {
        return !(this.f13910l.J0() instanceof j0) && D();
    }

    @n6.d
    public Object H(E e7) {
        j0<E> Q;
        do {
            Q = Q();
            if (Q == null) {
                return n5.b.f13903e;
            }
        } while (Q.c0(e7, null) == null);
        Q.A(e7);
        return Q.R();
    }

    @n6.d
    public Object I(E e7, @n6.d kotlinx.coroutines.selects.f<?> fVar) {
        d<E> i7 = i(e7);
        Object L = fVar.L(i7);
        if (L != null) {
            return L;
        }
        j0<? super E> o6 = i7.o();
        o6.A(e7);
        return o6.R();
    }

    public void L(@n6.d kotlinx.coroutines.internal.y yVar) {
    }

    public final <R> void N(kotlinx.coroutines.selects.f<? super R> fVar, E e7, t4.p<? super m0<? super E>, ? super e4.d<? super R>, ? extends Object> pVar) {
        while (!fVar.p0()) {
            if (E()) {
                C0190c c0190c = new C0190c(e7, this, fVar, pVar);
                Object k7 = k(c0190c);
                if (k7 == null) {
                    fVar.i0(c0190c);
                    return;
                } else if (k7 instanceof w) {
                    throw kotlinx.coroutines.internal.q0.p(u(e7, (w) k7));
                } else {
                    if (k7 != n5.b.f13905g && !(k7 instanceof h0)) {
                        throw new IllegalStateException(("enqueueSend returned " + k7 + ' ').toString());
                    }
                }
            }
            Object I = I(e7, fVar);
            if (I == kotlinx.coroutines.selects.g.d()) {
                return;
            }
            if (I != n5.b.f13903e && I != kotlinx.coroutines.internal.c.f12787b) {
                if (I == n5.b.f13902d) {
                    q5.b.d(pVar, this, fVar.h());
                    return;
                } else if (I instanceof w) {
                    throw kotlinx.coroutines.internal.q0.p(u(e7, (w) I));
                } else {
                    throw new IllegalStateException(("offerSelectInternal returned " + I).toString());
                }
            }
        }
    }

    @n6.e
    public final j0<?> O(E e7) {
        kotlinx.coroutines.internal.y K0;
        kotlinx.coroutines.internal.y yVar = this.f13910l;
        a aVar = new a(e7);
        do {
            K0 = yVar.K0();
            if (K0 instanceof j0) {
                return (j0) K0;
            }
        } while (!K0.B0(aVar, yVar));
        return null;
    }

    public final Object P(E e7, e4.d<? super m2> dVar) {
        kotlinx.coroutines.r b7 = kotlinx.coroutines.t.b(g4.c.d(dVar));
        while (true) {
            if (E()) {
                l0 n0Var = this.f13909k == null ? new n0(e7, b7) : new o0(e7, b7, this.f13909k);
                Object k7 = k(n0Var);
                if (k7 == null) {
                    kotlinx.coroutines.t.c(b7, n0Var);
                    break;
                } else if (k7 instanceof w) {
                    x(b7, e7, (w) k7);
                    break;
                } else if (k7 != n5.b.f13905g && !(k7 instanceof h0)) {
                    throw new IllegalStateException(("enqueueSend returned " + k7).toString());
                }
            }
            Object H = H(e7);
            if (H == n5.b.f13902d) {
                d1.a aVar = d1.f17778l;
                b7.D(d1.b(m2.f17815a));
                break;
            } else if (H != n5.b.f13903e) {
                if (!(H instanceof w)) {
                    throw new IllegalStateException(("offerInternal returned " + H).toString());
                }
                x(b7, e7, (w) H);
            }
        }
        Object A = b7.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        return A == g4.d.h() ? A : m2.f17815a;
    }

    @n6.e
    public j0<E> Q() {
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y T0;
        kotlinx.coroutines.internal.w wVar = this.f13910l;
        while (true) {
            yVar = (kotlinx.coroutines.internal.y) wVar.I0();
            if (yVar != wVar && (yVar instanceof j0)) {
                if (((((j0) yVar) instanceof w) && !yVar.N0()) || (T0 = yVar.T0()) == null) {
                    break;
                }
                T0.M0();
            }
        }
        yVar = null;
        return (j0) yVar;
    }

    @n6.e
    public final l0 R() {
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y T0;
        kotlinx.coroutines.internal.w wVar = this.f13910l;
        while (true) {
            yVar = (kotlinx.coroutines.internal.y) wVar.I0();
            if (yVar != wVar && (yVar instanceof l0)) {
                if (((((l0) yVar) instanceof w) && !yVar.N0()) || (T0 = yVar.T0()) == null) {
                    break;
                }
                T0.M0();
            }
        }
        yVar = null;
        return (l0) yVar;
    }

    @Override // n5.m0
    @n6.d
    public final Object V(E e7) {
        Object H = H(e7);
        if (H == n5.b.f13902d) {
            return r.f13994b.c(m2.f17815a);
        }
        if (H == n5.b.f13903e) {
            w<?> p6 = p();
            return p6 == null ? r.f13994b.b() : r.f13994b.a(v(p6));
        } else if (H instanceof w) {
            return r.f13994b.a(v((w) H));
        } else {
            throw new IllegalStateException(("trySend returned " + H).toString());
        }
    }

    @Override // n5.m0
    public final boolean W() {
        return p() != null;
    }

    @Override // n5.m0
    public void a0(@n6.d t4.l<? super Throwable, m2> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13908m;
        if (p.b.a(atomicReferenceFieldUpdater, this, null, lVar)) {
            w<?> p6 = p();
            if (p6 == null || !p.b.a(atomicReferenceFieldUpdater, this, lVar, n5.b.f13906h)) {
                return;
            }
            lVar.O(p6.f14213n);
            return;
        }
        Object obj = this.onCloseHandler;
        if (obj == n5.b.f13906h) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        throw new IllegalStateException("Another handler was already registered: " + obj);
    }

    public final int g() {
        kotlinx.coroutines.internal.w wVar = this.f13910l;
        int i7 = 0;
        for (kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) wVar.I0(); !u4.l0.g(yVar, wVar); yVar = yVar.J0()) {
            if (yVar instanceof kotlinx.coroutines.internal.y) {
                i7++;
            }
        }
        return i7;
    }

    @n6.d
    public final y.b<?> h(E e7) {
        return new b(this.f13910l, e7);
    }

    @n6.d
    public final d<E> i(E e7) {
        return new d<>(e7, this.f13910l);
    }

    @Override // n5.m0
    @n6.d
    public final kotlinx.coroutines.selects.e<E, m0<E>> j() {
        return new f(this);
    }

    @n6.e
    public Object k(@n6.d l0 l0Var) {
        boolean z6;
        kotlinx.coroutines.internal.y K0;
        if (C()) {
            kotlinx.coroutines.internal.y yVar = this.f13910l;
            do {
                K0 = yVar.K0();
                if (K0 instanceof j0) {
                    return K0;
                }
            } while (!K0.B0(l0Var, yVar));
            return null;
        }
        kotlinx.coroutines.internal.y yVar2 = this.f13910l;
        e eVar = new e(l0Var, this);
        while (true) {
            kotlinx.coroutines.internal.y K02 = yVar2.K0();
            if (!(K02 instanceof j0)) {
                int V0 = K02.V0(l0Var, yVar2, eVar);
                z6 = true;
                if (V0 != 1) {
                    if (V0 == 2) {
                        z6 = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return K02;
            }
        }
        if (z6) {
            return null;
        }
        return n5.b.f13905g;
    }

    @n6.d
    public String l() {
        return "";
    }

    @n6.e
    public final w<?> o() {
        kotlinx.coroutines.internal.y J0 = this.f13910l.J0();
        w<?> wVar = J0 instanceof w ? (w) J0 : null;
        if (wVar != null) {
            t(wVar);
            return wVar;
        }
        return null;
    }

    @n6.e
    public final w<?> p() {
        kotlinx.coroutines.internal.y K0 = this.f13910l.K0();
        w<?> wVar = K0 instanceof w ? (w) K0 : null;
        if (wVar != null) {
            t(wVar);
            return wVar;
        }
        return null;
    }

    @n6.d
    public final kotlinx.coroutines.internal.w q() {
        return this.f13910l;
    }

    public final String r() {
        String str;
        kotlinx.coroutines.internal.y J0 = this.f13910l.J0();
        if (J0 == this.f13910l) {
            return "EmptyQueue";
        }
        if (J0 instanceof w) {
            str = J0.toString();
        } else if (J0 instanceof h0) {
            str = "ReceiveQueued";
        } else if (J0 instanceof l0) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + J0;
        }
        kotlinx.coroutines.internal.y K0 = this.f13910l.K0();
        if (K0 != J0) {
            String str2 = str + ",queueSize=" + g();
            if (K0 instanceof w) {
                return str2 + ",closedForSend=" + K0;
            }
            return str2;
        }
        return str;
    }

    @Override // n5.m0
    public boolean s(E e7) {
        kotlinx.coroutines.internal.d1 d7;
        try {
            return m0.a.c(this, e7);
        } catch (Throwable th) {
            t4.l<E, m2> lVar = this.f13909k;
            if (lVar == null || (d7 = kotlinx.coroutines.internal.i0.d(lVar, e7, null, 2, null)) == null) {
                throw th;
            }
            v3.p.a(d7, th);
            throw d7;
        }
    }

    public final void t(w<?> wVar) {
        Object c7 = kotlinx.coroutines.internal.q.c(null, 1, null);
        while (true) {
            kotlinx.coroutines.internal.y K0 = wVar.K0();
            h0 h0Var = K0 instanceof h0 ? (h0) K0 : null;
            if (h0Var == null) {
                break;
            } else if (h0Var.Q0()) {
                c7 = kotlinx.coroutines.internal.q.h(c7, h0Var);
            } else {
                h0Var.L0();
            }
        }
        if (c7 != null) {
            if (c7 instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) c7;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((h0) arrayList.get(size)).Z0(wVar);
                }
            } else {
                ((h0) c7).Z0(wVar);
            }
        }
        L(wVar);
    }

    @n6.d
    public String toString() {
        return z0.a(this) + '@' + z0.b(this) + '{' + r() + '}' + l();
    }

    public final Throwable u(E e7, w<?> wVar) {
        kotlinx.coroutines.internal.d1 d7;
        t(wVar);
        t4.l<E, m2> lVar = this.f13909k;
        if (lVar == null || (d7 = kotlinx.coroutines.internal.i0.d(lVar, e7, null, 2, null)) == null) {
            return wVar.f1();
        }
        v3.p.a(d7, wVar.f1());
        throw d7;
    }

    public final Throwable v(w<?> wVar) {
        t(wVar);
        return wVar.f1();
    }

    @Override // n5.m0
    /* renamed from: w */
    public boolean b(@n6.e Throwable th) {
        boolean z6;
        w<?> wVar = new w<>(th);
        kotlinx.coroutines.internal.y yVar = this.f13910l;
        while (true) {
            kotlinx.coroutines.internal.y K0 = yVar.K0();
            z6 = true;
            if ((!(K0 instanceof w)) != true) {
                z6 = false;
                break;
            } else if (K0.B0(wVar, yVar)) {
                break;
            }
        }
        if (!z6) {
            wVar = (w) this.f13910l.K0();
        }
        t(wVar);
        if (z6) {
            A(th);
        }
        return z6;
    }

    public final void x(e4.d<?> dVar, E e7, w<?> wVar) {
        kotlinx.coroutines.internal.d1 d7;
        t(wVar);
        Throwable f12 = wVar.f1();
        t4.l<E, m2> lVar = this.f13909k;
        if (lVar == null || (d7 = kotlinx.coroutines.internal.i0.d(lVar, e7, null, 2, null)) == null) {
            d1.a aVar = d1.f17778l;
            dVar.D(d1.b(e1.a(f12)));
            return;
        }
        v3.p.a(d7, f12);
        d1.a aVar2 = d1.f17778l;
        dVar.D(d1.b(e1.a(d7)));
    }

    @Override // n5.m0
    @n6.e
    public final Object z(E e7, @n6.d e4.d<? super m2> dVar) {
        Object P;
        return (H(e7) != n5.b.f13902d && (P = P(e7, dVar)) == g4.d.h()) ? P : m2.f17815a;
    }
}
