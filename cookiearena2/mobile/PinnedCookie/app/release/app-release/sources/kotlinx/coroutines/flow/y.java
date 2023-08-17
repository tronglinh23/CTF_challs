package kotlinx.coroutines.flow;

import u4.k1;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.h f12653k;

        public a(k1.h hVar) {
            this.f12653k = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @n6.e
        public Object f(T t6, @n6.d e4.d<? super m2> dVar) {
            this.f12653k.f17436k = t6;
            throw new p5.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.p f12654k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ k1.h f12655l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {142}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public Object f12656n;

            /* renamed from: o  reason: collision with root package name */
            public /* synthetic */ Object f12657o;

            /* renamed from: p  reason: collision with root package name */
            public int f12658p;

            /* renamed from: r  reason: collision with root package name */
            public Object f12660r;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12657o = obj;
                this.f12658p |= Integer.MIN_VALUE;
                return b.this.f(null, this);
            }
        }

        public b(t4.p pVar, k1.h hVar) {
            this.f12654k = pVar;
            this.f12655l = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object f(T r5, @n6.d e4.d<? super v3.m2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.y$b$a r0 = (kotlinx.coroutines.flow.y.b.a) r0
                int r1 = r0.f12658p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12658p = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$b$a r0 = new kotlinx.coroutines.flow.y$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f12657o
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12658p
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f12660r
                java.lang.Object r0 = r0.f12656n
                kotlinx.coroutines.flow.y$b r0 = (kotlinx.coroutines.flow.y.b) r0
                v3.e1.n(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                v3.e1.n(r6)
                t4.p r6 = r4.f12654k
                r0.f12656n = r4
                r0.f12660r = r5
                r0.f12658p = r3
                r2 = 6
                u4.i0.e(r2)
                java.lang.Object r6 = r6.J(r5, r0)
                r0 = 7
                u4.i0.e(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                u4.k1$h r6 = r0.f12655l
                r6.f17436k = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                v3.m2 r5 = v3.m2.f17815a
                return r5
            L64:
                p5.a r5 = new p5.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.b.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class c<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12661n;

        /* renamed from: o  reason: collision with root package name */
        public Object f12662o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f12663p;

        /* renamed from: q  reason: collision with root package name */
        public int f12664q;

        public c(e4.d<? super c> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12663p = obj;
            this.f12664q |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.t0(null, this);
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {183}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes.dex */
    public static final class d<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12665n;

        /* renamed from: o  reason: collision with root package name */
        public Object f12666o;

        /* renamed from: p  reason: collision with root package name */
        public Object f12667p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f12668q;

        /* renamed from: r  reason: collision with root package name */
        public int f12669r;

        public d(e4.d<? super d> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12668q = obj;
            this.f12669r |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.u0(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class e<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.h f12670k;

        public e(k1.h hVar) {
            this.f12670k = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @n6.e
        public Object f(T t6, @n6.d e4.d<? super m2> dVar) {
            this.f12670k.f17436k = t6;
            throw new p5.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class f<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.p f12671k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ k1.h f12672l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {142}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public Object f12673n;

            /* renamed from: o  reason: collision with root package name */
            public /* synthetic */ Object f12674o;

            /* renamed from: p  reason: collision with root package name */
            public int f12675p;

            /* renamed from: r  reason: collision with root package name */
            public Object f12677r;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12674o = obj;
                this.f12675p |= Integer.MIN_VALUE;
                return f.this.f(null, this);
            }
        }

        public f(t4.p pVar, k1.h hVar) {
            this.f12671k = pVar;
            this.f12672l = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object f(T r5, @n6.d e4.d<? super v3.m2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.f.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.y$f$a r0 = (kotlinx.coroutines.flow.y.f.a) r0
                int r1 = r0.f12675p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12675p = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$f$a r0 = new kotlinx.coroutines.flow.y$f$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f12674o
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12675p
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f12677r
                java.lang.Object r0 = r0.f12673n
                kotlinx.coroutines.flow.y$f r0 = (kotlinx.coroutines.flow.y.f) r0
                v3.e1.n(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                v3.e1.n(r6)
                t4.p r6 = r4.f12671k
                r0.f12673n = r4
                r0.f12677r = r5
                r0.f12675p = r3
                r2 = 6
                u4.i0.e(r2)
                java.lang.Object r6 = r6.J(r5, r0)
                r0 = 7
                u4.i0.e(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                u4.k1$h r6 = r0.f12672l
                r6.f17436k = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                v3.m2 r5 = v3.m2.f17815a
                return r5
            L64:
                p5.a r5 = new p5.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.f.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class g<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12678n;

        /* renamed from: o  reason: collision with root package name */
        public Object f12679o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f12680p;

        /* renamed from: q  reason: collision with root package name */
        public int f12681q;

        public g(e4.d<? super g> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12680p = obj;
            this.f12681q |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.v0(null, this);
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class h<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12682n;

        /* renamed from: o  reason: collision with root package name */
        public Object f12683o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f12684p;

        /* renamed from: q  reason: collision with root package name */
        public int f12685q;

        public h(e4.d<? super h> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12684p = obj;
            this.f12685q |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.w0(null, null, this);
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {44}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class i<T, R> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12686n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f12687o;

        /* renamed from: p  reason: collision with root package name */
        public int f12688p;

        public i(e4.d<? super i> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12687o = obj;
            this.f12688p |= Integer.MIN_VALUE;
            return y.e(null, null, null, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class j<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.h<R> f12689k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.q<R, T, e4.d<? super R>, Object> f12690l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", f = "Reduce.kt", i = {}, l = {45}, m = "emit", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public Object f12691n;

            /* renamed from: o  reason: collision with root package name */
            public /* synthetic */ Object f12692o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ j<T> f12693p;

            /* renamed from: q  reason: collision with root package name */
            public int f12694q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(j<? super T> jVar, e4.d<? super a> dVar) {
                super(dVar);
                this.f12693p = jVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12692o = obj;
                this.f12694q |= Integer.MIN_VALUE;
                return this.f12693p.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public j(k1.h<R> hVar, t4.q<? super R, ? super T, ? super e4.d<? super R>, ? extends Object> qVar) {
            this.f12689k = hVar;
            this.f12690l = qVar;
        }

        @n6.e
        public final Object a(T t6, @n6.d e4.d<? super m2> dVar) {
            u4.i0.e(4);
            new a(this, dVar);
            u4.i0.e(5);
            k1.h<R> hVar = this.f12689k;
            hVar.f17436k = (T) this.f12690l.I(hVar.f17436k, t6, dVar);
            return m2.f17815a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r7, @n6.d e4.d<? super v3.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.y.j.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.y$j$a r0 = (kotlinx.coroutines.flow.y.j.a) r0
                int r1 = r0.f12694q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12694q = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$j$a r0 = new kotlinx.coroutines.flow.y$j$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f12692o
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12694q
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f12691n
                u4.k1$h r7 = (u4.k1.h) r7
                v3.e1.n(r8)
                goto L4c
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                v3.e1.n(r8)
                u4.k1$h<R> r8 = r6.f12689k
                t4.q<R, T, e4.d<? super R>, java.lang.Object> r2 = r6.f12690l
                T r4 = r8.f17436k
                r0.f12691n = r8
                r0.f12694q = r3
                java.lang.Object r7 = r2.I(r4, r7, r0)
                if (r7 != r1) goto L49
                return r1
            L49:
                r5 = r8
                r8 = r7
                r7 = r5
            L4c:
                r7.f17436k = r8
                v3.m2 r7 = v3.m2.f17815a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.j.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {155}, m = "last", n = {"result"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class k<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12695n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f12696o;

        /* renamed from: p  reason: collision with root package name */
        public int f12697p;

        public k(e4.d<? super k> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12696o = obj;
            this.f12697p |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.S0(null, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class l<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.h<Object> f12698k;

        public l(k1.h<Object> hVar) {
            this.f12698k = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @n6.e
        public final Object f(T t6, @n6.d e4.d<? super m2> dVar) {
            this.f12698k.f17436k = t6;
            return m2.f17815a;
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {167}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class m<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12699n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f12700o;

        /* renamed from: p  reason: collision with root package name */
        public int f12701p;

        public m(e4.d<? super m> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12700o = obj;
            this.f12701p |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.T0(null, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class n<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.h<T> f12702k;

        public n(k1.h<T> hVar) {
            this.f12702k = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @n6.e
        public final Object f(T t6, @n6.d e4.d<? super m2> dVar) {
            this.f12702k.f17436k = t6;
            return m2.f17815a;
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {22}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class o<S, T extends S> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12703n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f12704o;

        /* renamed from: p  reason: collision with root package name */
        public int f12705p;

        public o(e4.d<? super o> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12704o = obj;
            this.f12705p |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.s1(null, null, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class p<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.h<Object> f12706k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.q<S, T, e4.d<? super S>, Object> f12707l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public Object f12708n;

            /* renamed from: o  reason: collision with root package name */
            public /* synthetic */ Object f12709o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ p<T> f12710p;

            /* renamed from: q  reason: collision with root package name */
            public int f12711q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(p<? super T> pVar, e4.d<? super a> dVar) {
                super(dVar);
                this.f12710p = pVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12709o = obj;
                this.f12711q |= Integer.MIN_VALUE;
                return this.f12710p.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public p(k1.h<Object> hVar, t4.q<? super S, ? super T, ? super e4.d<? super S>, ? extends Object> qVar) {
            this.f12706k = hVar;
            this.f12707l = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Type inference failed for: r8v5 */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r7, @n6.d e4.d<? super v3.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.y.p.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.y$p$a r0 = (kotlinx.coroutines.flow.y.p.a) r0
                int r1 = r0.f12711q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12711q = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$p$a r0 = new kotlinx.coroutines.flow.y$p$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f12709o
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12711q
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f12708n
                u4.k1$h r7 = (u4.k1.h) r7
                v3.e1.n(r8)
                goto L50
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                v3.e1.n(r8)
                u4.k1$h<java.lang.Object> r8 = r6.f12706k
                T r2 = r8.f17436k
                kotlinx.coroutines.internal.r0 r4 = p5.u.f14964a
                if (r2 == r4) goto L53
                t4.q<S, T, e4.d<? super S>, java.lang.Object> r4 = r6.f12707l
                r0.f12708n = r8
                r0.f12711q = r3
                java.lang.Object r7 = r4.I(r2, r7, r0)
                if (r7 != r1) goto L4d
                return r1
            L4d:
                r5 = r8
                r8 = r7
                r7 = r5
            L50:
                r5 = r8
                r8 = r7
                r7 = r5
            L53:
                r8.f17436k = r7
                v3.m2 r7 = v3.m2.f17815a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.p.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {androidx.constraintlayout.widget.e.f2190c1}, m = "single", n = {"result"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class q<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12712n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f12713o;

        /* renamed from: p  reason: collision with root package name */
        public int f12714p;

        public q(e4.d<? super q> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12713o = obj;
            this.f12714p |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.H1(null, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class r<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.h<Object> f12715k;

        public r(k1.h<Object> hVar) {
            this.f12715k = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @n6.e
        public final Object f(T t6, @n6.d e4.d<? super m2> dVar) {
            k1.h<Object> hVar = this.f12715k;
            if (hVar.f17436k == p5.u.f14964a) {
                hVar.f17436k = t6;
                return m2.f17815a;
            }
            throw new IllegalArgumentException("Flow has more than one element".toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class s<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.h f12716k;

        public s(k1.h hVar) {
            this.f12716k = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @n6.e
        public Object f(T t6, @n6.d e4.d<? super m2> dVar) {
            boolean z6;
            k1.h hVar = this.f12716k;
            T t7 = hVar.f17436k;
            T t8 = (T) p5.u.f14964a;
            if (t7 == t8) {
                hVar.f17436k = t6;
                z6 = true;
            } else {
                hVar.f17436k = t8;
                z6 = false;
            }
            if (z6) {
                return m2.f17815a;
            }
            throw new p5.a(this);
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class t<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12717n;

        /* renamed from: o  reason: collision with root package name */
        public Object f12718o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f12719p;

        /* renamed from: q  reason: collision with root package name */
        public int f12720q;

        public t(e4.d<? super t> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12719p = obj;
            this.f12720q |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.I1(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, @n6.d e4.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.c
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$c r0 = (kotlinx.coroutines.flow.y.c) r0
            int r1 = r0.f12664q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12664q = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$c r0 = new kotlinx.coroutines.flow.y$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12663p
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12664q
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f12662o
            kotlinx.coroutines.flow.y$a r4 = (kotlinx.coroutines.flow.y.a) r4
            java.lang.Object r0 = r0.f12661n
            u4.k1$h r0 = (u4.k1.h) r0
            v3.e1.n(r5)     // Catch: p5.a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            v3.e1.n(r5)
            u4.k1$h r5 = new u4.k1$h
            r5.<init>()
            kotlinx.coroutines.internal.r0 r2 = p5.u.f14964a
            r5.f17436k = r2
            kotlinx.coroutines.flow.y$a r2 = new kotlinx.coroutines.flow.y$a
            r2.<init>(r5)
            r0.f12661n = r5     // Catch: p5.a -> L5b
            r0.f12662o = r2     // Catch: p5.a -> L5b
            r0.f12664q = r3     // Catch: p5.a -> L5b
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: p5.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            p5.q.b(r5, r4)
        L62:
            T r4 = r0.f17436k
            kotlinx.coroutines.internal.r0 r5 = p5.u.f14964a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.a(kotlinx.coroutines.flow.i, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, @n6.d t4.p<? super T, ? super e4.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @n6.d e4.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.d
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.y$d r0 = (kotlinx.coroutines.flow.y.d) r0
            int r1 = r0.f12669r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12669r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$d r0 = new kotlinx.coroutines.flow.y$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12668q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12669r
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f12667p
            kotlinx.coroutines.flow.y$b r4 = (kotlinx.coroutines.flow.y.b) r4
            java.lang.Object r5 = r0.f12666o
            u4.k1$h r5 = (u4.k1.h) r5
            java.lang.Object r0 = r0.f12665n
            t4.p r0 = (t4.p) r0
            v3.e1.n(r6)     // Catch: p5.a -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            v3.e1.n(r6)
            u4.k1$h r6 = new u4.k1$h
            r6.<init>()
            kotlinx.coroutines.internal.r0 r2 = p5.u.f14964a
            r6.f17436k = r2
            kotlinx.coroutines.flow.y$b r2 = new kotlinx.coroutines.flow.y$b
            r2.<init>(r5, r6)
            r0.f12665n = r5     // Catch: p5.a -> L62
            r0.f12666o = r6     // Catch: p5.a -> L62
            r0.f12667p = r2     // Catch: p5.a -> L62
            r0.f12669r = r3     // Catch: p5.a -> L62
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: p5.a -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            p5.q.b(r6, r4)
        L6a:
            T r4 = r5.f17436k
            kotlinx.coroutines.internal.r0 r5 = p5.u.f14964a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.b(kotlinx.coroutines.flow.i, t4.p, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, @n6.d e4.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.g
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$g r0 = (kotlinx.coroutines.flow.y.g) r0
            int r1 = r0.f12681q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12681q = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$g r0 = new kotlinx.coroutines.flow.y$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12680p
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12681q
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f12679o
            kotlinx.coroutines.flow.y$e r4 = (kotlinx.coroutines.flow.y.e) r4
            java.lang.Object r0 = r0.f12678n
            u4.k1$h r0 = (u4.k1.h) r0
            v3.e1.n(r5)     // Catch: p5.a -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            v3.e1.n(r5)
            u4.k1$h r5 = new u4.k1$h
            r5.<init>()
            kotlinx.coroutines.flow.y$e r2 = new kotlinx.coroutines.flow.y$e
            r2.<init>(r5)
            r0.f12678n = r5     // Catch: p5.a -> L57
            r0.f12679o = r2     // Catch: p5.a -> L57
            r0.f12681q = r3     // Catch: p5.a -> L57
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: p5.a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            p5.q.b(r5, r4)
        L5e:
            T r4 = r0.f17436k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.c(kotlinx.coroutines.flow.i, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, @n6.d t4.p<? super T, ? super e4.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @n6.d e4.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.h
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.y$h r0 = (kotlinx.coroutines.flow.y.h) r0
            int r1 = r0.f12685q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12685q = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$h r0 = new kotlinx.coroutines.flow.y$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12684p
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12685q
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f12683o
            kotlinx.coroutines.flow.y$f r4 = (kotlinx.coroutines.flow.y.f) r4
            java.lang.Object r5 = r0.f12682n
            u4.k1$h r5 = (u4.k1.h) r5
            v3.e1.n(r6)     // Catch: p5.a -> L31
            goto L5e
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            v3.e1.n(r6)
            u4.k1$h r6 = new u4.k1$h
            r6.<init>()
            kotlinx.coroutines.flow.y$f r2 = new kotlinx.coroutines.flow.y$f
            r2.<init>(r5, r6)
            r0.f12682n = r6     // Catch: p5.a -> L57
            r0.f12683o = r2     // Catch: p5.a -> L57
            r0.f12685q = r3     // Catch: p5.a -> L57
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: p5.a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L5e
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            p5.q.b(r6, r4)
        L5e:
            T r4 = r5.f17436k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.d(kotlinx.coroutines.flow.i, t4.p, e4.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, R> java.lang.Object e(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, R r5, @n6.d t4.q<? super R, ? super T, ? super e4.d<? super R>, ? extends java.lang.Object> r6, @n6.d e4.d<? super R> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.y.i
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.y$i r0 = (kotlinx.coroutines.flow.y.i) r0
            int r1 = r0.f12688p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12688p = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$i r0 = new kotlinx.coroutines.flow.y$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f12687o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12688p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f12686n
            u4.k1$h r4 = (u4.k1.h) r4
            v3.e1.n(r7)
            goto L50
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            v3.e1.n(r7)
            u4.k1$h r7 = new u4.k1$h
            r7.<init>()
            r7.f17436k = r5
            kotlinx.coroutines.flow.y$j r5 = new kotlinx.coroutines.flow.y$j
            r5.<init>(r7, r6)
            r0.f12686n = r7
            r0.f12688p = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r7
        L50:
            T r4 = r4.f17436k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.e(kotlinx.coroutines.flow.i, java.lang.Object, t4.q, e4.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> Object f(kotlinx.coroutines.flow.i<? extends T> iVar, R r6, t4.q<? super R, ? super T, ? super e4.d<? super R>, ? extends Object> qVar, e4.d<? super R> dVar) {
        k1.h hVar = new k1.h();
        hVar.f17436k = r6;
        j jVar = new j(hVar, qVar);
        u4.i0.e(0);
        iVar.a(jVar, dVar);
        u4.i0.e(1);
        return hVar.f17436k;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object g(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, @n6.d e4.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.k
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$k r0 = (kotlinx.coroutines.flow.y.k) r0
            int r1 = r0.f12697p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12697p = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$k r0 = new kotlinx.coroutines.flow.y$k
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12696o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12697p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f12695n
            u4.k1$h r4 = (u4.k1.h) r4
            v3.e1.n(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            v3.e1.n(r5)
            u4.k1$h r5 = new u4.k1$h
            r5.<init>()
            kotlinx.coroutines.internal.r0 r2 = p5.u.f14964a
            r5.f17436k = r2
            kotlinx.coroutines.flow.y$l r2 = new kotlinx.coroutines.flow.y$l
            r2.<init>(r5)
            r0.f12695n = r5
            r0.f12697p = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.f17436k
            kotlinx.coroutines.internal.r0 r5 = p5.u.f14964a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.g(kotlinx.coroutines.flow.i, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object h(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, @n6.d e4.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.m
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$m r0 = (kotlinx.coroutines.flow.y.m) r0
            int r1 = r0.f12701p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12701p = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$m r0 = new kotlinx.coroutines.flow.y$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12700o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12701p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f12699n
            u4.k1$h r4 = (u4.k1.h) r4
            v3.e1.n(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            v3.e1.n(r5)
            u4.k1$h r5 = new u4.k1$h
            r5.<init>()
            kotlinx.coroutines.flow.y$n r2 = new kotlinx.coroutines.flow.y$n
            r2.<init>(r5)
            r0.f12699n = r5
            r0.f12701p = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            T r4 = r4.f17436k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.h(kotlinx.coroutines.flow.i, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.internal.r0, T] */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S, T extends S> java.lang.Object i(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, @n6.d t4.q<? super S, ? super T, ? super e4.d<? super S>, ? extends java.lang.Object> r5, @n6.d e4.d<? super S> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.o
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.y$o r0 = (kotlinx.coroutines.flow.y.o) r0
            int r1 = r0.f12705p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12705p = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$o r0 = new kotlinx.coroutines.flow.y$o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12704o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12705p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f12703n
            u4.k1$h r4 = (u4.k1.h) r4
            v3.e1.n(r6)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            v3.e1.n(r6)
            u4.k1$h r6 = new u4.k1$h
            r6.<init>()
            kotlinx.coroutines.internal.r0 r2 = p5.u.f14964a
            r6.f17436k = r2
            kotlinx.coroutines.flow.y$p r2 = new kotlinx.coroutines.flow.y$p
            r2.<init>(r6, r5)
            r0.f12703n = r6
            r0.f12705p = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r6
        L52:
            T r4 = r4.f17436k
            kotlinx.coroutines.internal.r0 r5 = p5.u.f14964a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Empty flow can't be reduced"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.i(kotlinx.coroutines.flow.i, t4.q, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object j(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, @n6.d e4.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.q
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$q r0 = (kotlinx.coroutines.flow.y.q) r0
            int r1 = r0.f12714p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12714p = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$q r0 = new kotlinx.coroutines.flow.y$q
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12713o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12714p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f12712n
            u4.k1$h r4 = (u4.k1.h) r4
            v3.e1.n(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            v3.e1.n(r5)
            u4.k1$h r5 = new u4.k1$h
            r5.<init>()
            kotlinx.coroutines.internal.r0 r2 = p5.u.f14964a
            r5.f17436k = r2
            kotlinx.coroutines.flow.y$r r2 = new kotlinx.coroutines.flow.y$r
            r2.<init>(r5)
            r0.f12712n = r5
            r0.f12714p = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.f17436k
            kotlinx.coroutines.internal.r0 r5 = p5.u.f14964a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.j(kotlinx.coroutines.flow.i, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object k(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, @n6.d e4.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.t
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$t r0 = (kotlinx.coroutines.flow.y.t) r0
            int r1 = r0.f12720q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12720q = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$t r0 = new kotlinx.coroutines.flow.y$t
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12719p
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12720q
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f12718o
            kotlinx.coroutines.flow.y$s r4 = (kotlinx.coroutines.flow.y.s) r4
            java.lang.Object r0 = r0.f12717n
            u4.k1$h r0 = (u4.k1.h) r0
            v3.e1.n(r5)     // Catch: p5.a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            v3.e1.n(r5)
            u4.k1$h r5 = new u4.k1$h
            r5.<init>()
            kotlinx.coroutines.internal.r0 r2 = p5.u.f14964a
            r5.f17436k = r2
            kotlinx.coroutines.flow.y$s r2 = new kotlinx.coroutines.flow.y$s
            r2.<init>(r5)
            r0.f12717n = r5     // Catch: p5.a -> L5b
            r0.f12718o = r2     // Catch: p5.a -> L5b
            r0.f12720q = r3     // Catch: p5.a -> L5b
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: p5.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            p5.q.b(r5, r4)
        L62:
            T r4 = r0.f17436k
            kotlinx.coroutines.internal.r0 r5 = p5.u.f14964a
            if (r4 != r5) goto L69
            r4 = 0
        L69:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.k(kotlinx.coroutines.flow.i, e4.d):java.lang.Object");
    }
}
