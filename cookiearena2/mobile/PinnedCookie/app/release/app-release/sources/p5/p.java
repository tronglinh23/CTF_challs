package p5;

import kotlinx.coroutines.u0;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final class p {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes.dex */
    public static final class a<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.q f14956k;

        public a(t4.q qVar) {
            this.f14956k = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d e4.d<? super m2> dVar) {
            Object a7 = p.a(new b(this.f14956k, jVar, null), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class b extends h4.o implements t4.p<u0, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f14957o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f14958p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ t4.q<u0, kotlinx.coroutines.flow.j<? super R>, e4.d<? super m2>, Object> f14959q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<R> f14960r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(t4.q<? super u0, ? super kotlinx.coroutines.flow.j<? super R>, ? super e4.d<? super m2>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super R> jVar, e4.d<? super b> dVar) {
            super(2, dVar);
            this.f14959q = qVar;
            this.f14960r = jVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            b bVar = new b(this.f14959q, this.f14960r, dVar);
            bVar.f14958p = obj;
            return bVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f14957o;
            if (i7 == 0) {
                e1.n(obj);
                u0 u0Var = (u0) this.f14958p;
                t4.q<u0, kotlinx.coroutines.flow.j<? super R>, e4.d<? super m2>, Object> qVar = this.f14959q;
                Object obj2 = this.f14960r;
                this.f14957o = 1;
                if (qVar.I(u0Var, obj2, this) == h7) {
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
        public final Object J(@n6.d u0 u0Var, @n6.e e4.d<? super m2> dVar) {
            return ((b) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    @n6.e
    public static final <R> Object a(@v3.b @n6.d t4.p<? super u0, ? super e4.d<? super R>, ? extends Object> pVar, @n6.d e4.d<? super R> dVar) {
        o oVar = new o(dVar.g(), dVar);
        Object f7 = q5.b.f(oVar, oVar, pVar);
        if (f7 == g4.d.h()) {
            h4.h.c(dVar);
        }
        return f7;
    }

    @n6.d
    public static final <R> kotlinx.coroutines.flow.i<R> b(@v3.b @n6.d t4.q<? super u0, ? super kotlinx.coroutines.flow.j<? super R>, ? super e4.d<? super m2>, ? extends Object> qVar) {
        return new a(qVar);
    }
}
