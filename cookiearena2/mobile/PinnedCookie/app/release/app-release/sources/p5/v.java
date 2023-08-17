package p5;

import e4.g;
import kotlinx.coroutines.r2;
import u4.l0;
import u4.n0;
import v3.d1;
import v3.m2;
/* loaded from: classes.dex */
public final class v<T> extends h4.d implements kotlinx.coroutines.flow.j<T>, h4.e {
    @n6.d
    @s4.e

    /* renamed from: n  reason: collision with root package name */
    public final kotlinx.coroutines.flow.j<T> f14967n;
    @n6.d
    @s4.e

    /* renamed from: o  reason: collision with root package name */
    public final e4.g f14968o;
    @s4.e

    /* renamed from: p  reason: collision with root package name */
    public final int f14969p;
    @n6.e

    /* renamed from: q  reason: collision with root package name */
    public e4.g f14970q;
    @n6.e

    /* renamed from: r  reason: collision with root package name */
    public e4.d<? super m2> f14971r;

    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.p<Integer, g.b, Integer> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f14972l = new a();

        public a() {
            super(2);
        }

        @Override // t4.p
        public /* bridge */ /* synthetic */ Integer J(Integer num, g.b bVar) {
            return b(num.intValue(), bVar);
        }

        @n6.d
        public final Integer b(int i7, @n6.d g.b bVar) {
            return Integer.valueOf(i7 + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(@n6.d kotlinx.coroutines.flow.j<? super T> jVar, @n6.d e4.g gVar) {
        super(s.f14961k, e4.i.f8770k);
        this.f14967n = jVar;
        this.f14968o = gVar;
        this.f14969p = ((Number) gVar.k(0, a.f14972l)).intValue();
    }

    @Override // h4.a
    @n6.d
    public Object Q(@n6.d Object obj) {
        Throwable e7 = d1.e(obj);
        if (e7 != null) {
            this.f14970q = new n(e7, g());
        }
        e4.d<? super m2> dVar = this.f14971r;
        if (dVar != null) {
            dVar.D(obj);
        }
        return g4.d.h();
    }

    @Override // h4.d, h4.a
    public void R() {
        super.R();
    }

    public final void a0(e4.g gVar, e4.g gVar2, T t6) {
        if (gVar2 instanceof n) {
            h0((n) gVar2, t6);
        }
        x.a(this, gVar);
    }

    public final Object c0(e4.d<? super m2> dVar, T t6) {
        e4.g g7 = dVar.g();
        r2.z(g7);
        e4.g gVar = this.f14970q;
        if (gVar != g7) {
            a0(g7, gVar, t6);
            this.f14970q = g7;
        }
        this.f14971r = dVar;
        Object I = w.a().I(this.f14967n, t6, this);
        if (!l0.g(I, g4.d.h())) {
            this.f14971r = null;
        }
        return I;
    }

    @Override // kotlinx.coroutines.flow.j
    @n6.e
    public Object f(T t6, @n6.d e4.d<? super m2> dVar) {
        try {
            Object c02 = c0(dVar, t6);
            if (c02 == g4.d.h()) {
                h4.h.c(dVar);
            }
            return c02 == g4.d.h() ? c02 : m2.f17815a;
        } catch (Throwable th) {
            this.f14970q = new n(th, dVar.g());
            throw th;
        }
    }

    @Override // h4.d, e4.d
    @n6.d
    public e4.g g() {
        e4.g gVar = this.f14970q;
        return gVar == null ? e4.i.f8770k : gVar;
    }

    public final void h0(n nVar, Object obj) {
        throw new IllegalStateException(i5.u.p("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + nVar.f14954k + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // h4.a, h4.e
    @n6.e
    public StackTraceElement k0() {
        return null;
    }

    @Override // h4.a, h4.e
    @n6.e
    public h4.e v() {
        e4.d<? super m2> dVar = this.f14971r;
        if (dVar instanceof h4.e) {
            return (h4.e) dVar;
        }
        return null;
    }
}
