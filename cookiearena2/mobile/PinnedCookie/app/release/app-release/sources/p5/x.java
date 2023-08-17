package p5;

import e4.g;
import kotlinx.coroutines.n2;
import u4.i0;
import u4.n0;
import v3.a1;
import v3.m2;
/* loaded from: classes.dex */
public final class x {

    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.p<Integer, g.b, Integer> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ v<?> f14975l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v<?> vVar) {
            super(2);
            this.f14975l = vVar;
        }

        @Override // t4.p
        public /* bridge */ /* synthetic */ Integer J(Integer num, g.b bVar) {
            return b(num.intValue(), bVar);
        }

        @n6.d
        public final Integer b(int i7, @n6.d g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b e7 = this.f14975l.f14968o.e(key);
            if (key != n2.f12920c) {
                return Integer.valueOf(bVar != e7 ? Integer.MIN_VALUE : i7 + 1);
            }
            n2 n2Var = (n2) e7;
            n2 b7 = x.b((n2) bVar, n2Var);
            if (b7 == n2Var) {
                if (n2Var != null) {
                    i7++;
                }
                return Integer.valueOf(i7);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b7 + ", expected child of " + n2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.p<kotlinx.coroutines.flow.j<? super T>, e4.d<? super m2>, Object> f14976k;

        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f14977n;

            /* renamed from: p  reason: collision with root package name */
            public int f14979p;

            public a(e4.d<? super a> dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f14977n = obj;
                this.f14979p |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(t4.p<? super kotlinx.coroutines.flow.j<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
            this.f14976k = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
            Object J = this.f14976k.J(jVar, dVar);
            return J == g4.d.h() ? J : m2.f17815a;
        }

        @n6.e
        public Object d(@n6.d kotlinx.coroutines.flow.j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
            i0.e(4);
            new a(dVar);
            i0.e(5);
            this.f14976k.J(jVar, dVar);
            return m2.f17815a;
        }
    }

    @s4.h(name = "checkContext")
    public static final void a(@n6.d v<?> vVar, @n6.d e4.g gVar) {
        if (((Number) gVar.k(0, new a(vVar))).intValue() == vVar.f14969p) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + vVar.f14968o + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    @n6.e
    public static final n2 b(@n6.e n2 n2Var, @n6.e n2 n2Var2) {
        while (n2Var != null) {
            if (n2Var == n2Var2 || !(n2Var instanceof kotlinx.coroutines.internal.n0)) {
                return n2Var;
            }
            n2Var = ((kotlinx.coroutines.internal.n0) n2Var).M1();
        }
        return null;
    }

    @n6.d
    @a1
    public static final <T> kotlinx.coroutines.flow.i<T> c(@v3.b @n6.d t4.p<? super kotlinx.coroutines.flow.j<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return new b(pVar);
    }
}
