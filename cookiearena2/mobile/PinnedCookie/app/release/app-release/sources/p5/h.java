package p5;

import e4.e;
import n5.g0;
import u4.l0;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public abstract class h<S, T> extends e<T> {
    @n6.d
    @s4.e

    /* renamed from: n  reason: collision with root package name */
    public final kotlinx.coroutines.flow.i<S> f14868n;

    @h4.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends h4.o implements t4.p<kotlinx.coroutines.flow.j<? super T>, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f14869o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f14870p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ h<S, T> f14871q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h<S, T> hVar, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f14871q = hVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            a aVar = new a(this.f14871q, dVar);
            aVar.f14870p = obj;
            return aVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f14869o;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.flow.j<? super T> jVar = (kotlinx.coroutines.flow.j) this.f14870p;
                h<S, T> hVar = this.f14871q;
                this.f14869o = 1;
                if (hVar.t(jVar, this) == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e1.n(obj);
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d kotlinx.coroutines.flow.j<? super T> jVar, @n6.e e4.d<? super m2> dVar) {
            return ((a) H(jVar, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@n6.d kotlinx.coroutines.flow.i<? extends S> iVar, @n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        super(gVar, i7, mVar);
        this.f14868n = iVar;
    }

    public static /* synthetic */ Object q(h hVar, kotlinx.coroutines.flow.j jVar, e4.d dVar) {
        if (hVar.f14844l == -3) {
            e4.g g7 = dVar.g();
            e4.g t6 = g7.t(hVar.f14843k);
            if (l0.g(t6, g7)) {
                Object t7 = hVar.t(jVar, dVar);
                return t7 == g4.d.h() ? t7 : m2.f17815a;
            }
            e.b bVar = e4.e.f8765a;
            if (l0.g(t6.e(bVar), g7.e(bVar))) {
                Object s6 = hVar.s(jVar, t6, dVar);
                return s6 == g4.d.h() ? s6 : m2.f17815a;
            }
        }
        Object a7 = super.a(jVar, dVar);
        return a7 == g4.d.h() ? a7 : m2.f17815a;
    }

    public static /* synthetic */ Object r(h hVar, g0 g0Var, e4.d dVar) {
        Object t6 = hVar.t(new y(g0Var), dVar);
        return t6 == g4.d.h() ? t6 : m2.f17815a;
    }

    @Override // p5.e, kotlinx.coroutines.flow.i
    @n6.e
    public Object a(@n6.d kotlinx.coroutines.flow.j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
        return q(this, jVar, dVar);
    }

    @Override // p5.e
    @n6.e
    public Object g(@n6.d g0<? super T> g0Var, @n6.d e4.d<? super m2> dVar) {
        return r(this, g0Var, dVar);
    }

    public final Object s(kotlinx.coroutines.flow.j<? super T> jVar, e4.g gVar, e4.d<? super m2> dVar) {
        Object d7 = f.d(gVar, f.a(jVar, dVar.g()), null, new a(this, null), dVar, 4, null);
        return d7 == g4.d.h() ? d7 : m2.f17815a;
    }

    @n6.e
    public abstract Object t(@n6.d kotlinx.coroutines.flow.j<? super T> jVar, @n6.d e4.d<? super m2> dVar);

    @Override // p5.e
    @n6.d
    public String toString() {
        return this.f14868n + " -> " + super.toString();
    }
}
