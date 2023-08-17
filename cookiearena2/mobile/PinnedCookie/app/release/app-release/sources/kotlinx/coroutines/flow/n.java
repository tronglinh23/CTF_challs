package kotlinx.coroutines.flow;

import kotlinx.coroutines.n2;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class n {

    /* loaded from: classes.dex */
    public static final class a<T> implements j<T> {

        /* renamed from: k */
        public final /* synthetic */ t4.p<T, e4.d<? super m2>, Object> f12339k;

        /* renamed from: kotlinx.coroutines.flow.n$a$a */
        /* loaded from: classes.dex */
        public static final class C0157a extends h4.d {

            /* renamed from: n */
            public /* synthetic */ Object f12340n;

            /* renamed from: p */
            public int f12342p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0157a(e4.d<? super C0157a> dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12340n = obj;
                this.f12342p |= Integer.MIN_VALUE;
                return a.this.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(t4.p<? super T, ? super e4.d<? super m2>, ? extends Object> pVar) {
            this.f12339k = pVar;
        }

        @n6.e
        public Object a(T t6, @n6.d e4.d<? super m2> dVar) {
            u4.i0.e(4);
            new C0157a(dVar);
            u4.i0.e(5);
            this.f12339k.J(t6, dVar);
            return m2.f17815a;
        }

        @Override // kotlinx.coroutines.flow.j
        @n6.e
        public Object f(T t6, @n6.d e4.d<? super m2> dVar) {
            Object J = this.f12339k.J(t6, dVar);
            return J == g4.d.h() ? J : m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements j<T> {

        /* renamed from: k */
        public int f12343k;

        /* renamed from: l */
        public final /* synthetic */ t4.q<Integer, T, e4.d<? super m2>, Object> f12344l;

        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n */
            public /* synthetic */ Object f12345n;

            /* renamed from: p */
            public int f12347p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e4.d<? super a> dVar) {
                super(dVar);
                b.this = r1;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12345n = obj;
                this.f12347p |= Integer.MIN_VALUE;
                return b.this.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(t4.q<? super Integer, ? super T, ? super e4.d<? super m2>, ? extends Object> qVar) {
            this.f12344l = qVar;
        }

        @n6.e
        public Object a(T t6, @n6.d e4.d<? super m2> dVar) {
            u4.i0.e(4);
            new a(dVar);
            u4.i0.e(5);
            t4.q<Integer, T, e4.d<? super m2>, Object> qVar = this.f12344l;
            int i7 = this.f12343k;
            this.f12343k = i7 + 1;
            if (i7 >= 0) {
                qVar.I(Integer.valueOf(i7), t6, dVar);
                return m2.f17815a;
            }
            throw new ArithmeticException("Index overflow has happened");
        }

        @Override // kotlinx.coroutines.flow.j
        @n6.e
        public Object f(T t6, @n6.d e4.d<? super m2> dVar) {
            t4.q<Integer, T, e4.d<? super m2>, Object> qVar = this.f12344l;
            int i7 = this.f12343k;
            this.f12343k = i7 + 1;
            if (i7 >= 0) {
                Object I = qVar.I(h4.b.f(i7), t6, dVar);
                return I == g4.d.h() ? I : m2.f17815a;
            }
            throw new ArithmeticException("Index overflow has happened");
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class c extends h4.o implements t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12348o;

        /* renamed from: p */
        public final /* synthetic */ i<T> f12349p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(i<? extends T> iVar, e4.d<? super c> dVar) {
            super(2, dVar);
            this.f12349p = iVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            return new c(this.f12349p, dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12348o;
            if (i7 == 0) {
                e1.n(obj);
                i<T> iVar = this.f12349p;
                this.f12348o = 1;
                if (k.x(iVar, this) == h7) {
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
        /* renamed from: a0 */
        public final Object J(@n6.d kotlinx.coroutines.u0 u0Var, @n6.e e4.d<? super m2> dVar) {
            return ((c) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    @n6.e
    public static final Object a(@n6.d i<?> iVar, @n6.d e4.d<? super m2> dVar) {
        Object a7 = iVar.a(p5.t.f14963k, dVar);
        return a7 == g4.d.h() ? a7 : m2.f17815a;
    }

    @v3.k(level = v3.m.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> Object b(i<? extends T> iVar, t4.p<? super T, ? super e4.d<? super m2>, ? extends Object> pVar, e4.d<? super m2> dVar) {
        Object a7 = iVar.a(new a(pVar), dVar);
        return a7 == g4.d.h() ? a7 : m2.f17815a;
    }

    @v3.k(level = v3.m.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> Object c(i<? extends T> iVar, t4.p<? super T, ? super e4.d<? super m2>, ? extends Object> pVar, e4.d<? super m2> dVar) {
        a aVar = new a(pVar);
        u4.i0.e(0);
        iVar.a(aVar, dVar);
        u4.i0.e(1);
        return m2.f17815a;
    }

    @n6.e
    public static final <T> Object d(@n6.d i<? extends T> iVar, @n6.d t4.q<? super Integer, ? super T, ? super e4.d<? super m2>, ? extends Object> qVar, @n6.d e4.d<? super m2> dVar) {
        Object a7 = iVar.a(new b(qVar), dVar);
        return a7 == g4.d.h() ? a7 : m2.f17815a;
    }

    public static final <T> Object e(i<? extends T> iVar, t4.q<? super Integer, ? super T, ? super e4.d<? super m2>, ? extends Object> qVar, e4.d<? super m2> dVar) {
        b bVar = new b(qVar);
        u4.i0.e(0);
        iVar.a(bVar, dVar);
        u4.i0.e(1);
        return m2.f17815a;
    }

    @n6.e
    public static final <T> Object f(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super m2>, ? extends Object> pVar, @n6.d e4.d<? super m2> dVar) {
        i d7;
        d7 = p.d(k.W0(iVar, pVar), 0, null, 2, null);
        Object x6 = k.x(d7, dVar);
        return x6 == g4.d.h() ? x6 : m2.f17815a;
    }

    @n6.e
    public static final <T> Object g(@n6.d j<? super T> jVar, @n6.d i<? extends T> iVar, @n6.d e4.d<? super m2> dVar) {
        k.o0(jVar);
        Object a7 = iVar.a(jVar, dVar);
        return a7 == g4.d.h() ? a7 : m2.f17815a;
    }

    @n6.d
    public static final <T> n2 h(@n6.d i<? extends T> iVar, @n6.d kotlinx.coroutines.u0 u0Var) {
        n2 f7;
        f7 = kotlinx.coroutines.l.f(u0Var, null, null, new c(iVar, null), 3, null);
        return f7;
    }
}
