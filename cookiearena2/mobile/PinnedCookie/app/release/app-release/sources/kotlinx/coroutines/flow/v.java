package kotlinx.coroutines.flow;

import u4.k1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class v {

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {136}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class a<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12535n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f12536o;

        /* renamed from: p  reason: collision with root package name */
        public int f12537p;

        public a(e4.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12536o = obj;
            this.f12537p |= Integer.MIN_VALUE;
            return v.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.p<T, e4.d<? super Boolean>, Object> f12538k;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {130}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public Object f12539n;

            /* renamed from: o  reason: collision with root package name */
            public /* synthetic */ Object f12540o;

            /* renamed from: q  reason: collision with root package name */
            public int f12542q;

            public a(e4.d<? super a> dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12540o = obj;
                this.f12542q |= Integer.MIN_VALUE;
                return b.this.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
            this.f12538k = pVar;
        }

        @n6.e
        public Object a(T t6, @n6.d e4.d<? super m2> dVar) {
            u4.i0.e(4);
            new a(dVar);
            u4.i0.e(5);
            if (((Boolean) this.f12538k.J(t6, dVar)).booleanValue()) {
                return m2.f17815a;
            }
            throw new p5.a(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object f(T r5, @n6.d e4.d<? super v3.m2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.v$b$a r0 = (kotlinx.coroutines.flow.v.b.a) r0
                int r1 = r0.f12542q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12542q = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$b$a r0 = new kotlinx.coroutines.flow.v$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f12540o
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12542q
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f12539n
                kotlinx.coroutines.flow.v$b r5 = (kotlinx.coroutines.flow.v.b) r5
                v3.e1.n(r6)
                goto L46
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                v3.e1.n(r6)
                t4.p<T, e4.d<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f12538k
                r0.f12539n = r4
                r0.f12542q = r3
                java.lang.Object r6 = r6.J(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L51
                v3.m2 r5 = v3.m2.f17815a
                return r5
            L51:
                p5.a r6 = new p5.a
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.b.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class c<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f12543k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f12544l;

        public c(kotlinx.coroutines.flow.i iVar, int i7) {
            this.f12543k = iVar;
            this.f12544l = i7;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
            Object a7 = this.f12543k.a(new d(new k1.f(), this.f12544l, jVar), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.f f12545k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f12546l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<T> f12547m;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12548n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ d<T> f12549o;

            /* renamed from: p  reason: collision with root package name */
            public int f12550p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, e4.d<? super a> dVar2) {
                super(dVar2);
                this.f12549o = dVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12548n = obj;
                this.f12550p |= Integer.MIN_VALUE;
                return this.f12549o.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(k1.f fVar, int i7, kotlinx.coroutines.flow.j<? super T> jVar) {
            this.f12545k = fVar;
            this.f12546l = i7;
            this.f12547m = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r6, @n6.d e4.d<? super v3.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.v.d.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.v$d$a r0 = (kotlinx.coroutines.flow.v.d.a) r0
                int r1 = r0.f12550p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12550p = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$d$a r0 = new kotlinx.coroutines.flow.v$d$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f12548n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12550p
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                v3.e1.n(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                v3.e1.n(r7)
                u4.k1$f r7 = r5.f12545k
                int r2 = r7.f17434k
                int r4 = r5.f12546l
                if (r2 < r4) goto L4a
                kotlinx.coroutines.flow.j<T> r7 = r5.f12547m
                r0.f12550p = r3
                java.lang.Object r6 = r7.f(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                v3.m2 r6 = v3.m2.f17815a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.f17434k = r2
                v3.m2 r6 = v3.m2.f17815a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.d.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class e<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f12551k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.p f12552l;

        public e(kotlinx.coroutines.flow.i iVar, t4.p pVar) {
            this.f12551k = iVar;
            this.f12552l = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
            Object a7 = this.f12551k.a(new f(new k1.a(), jVar, this.f12552l), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.a f12553k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<T> f12554l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ t4.p<T, e4.d<? super Boolean>, Object> f12555m;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {37, 38, 40}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public Object f12556n;

            /* renamed from: o  reason: collision with root package name */
            public Object f12557o;

            /* renamed from: p  reason: collision with root package name */
            public /* synthetic */ Object f12558p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ f<T> f12559q;

            /* renamed from: r  reason: collision with root package name */
            public int f12560r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(f<? super T> fVar, e4.d<? super a> dVar) {
                super(dVar);
                this.f12559q = fVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12558p = obj;
                this.f12560r |= Integer.MIN_VALUE;
                return this.f12559q.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(k1.a aVar, kotlinx.coroutines.flow.j<? super T> jVar, t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
            this.f12553k = aVar;
            this.f12554l = jVar;
            this.f12555m = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r7, @n6.d e4.d<? super v3.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.v.f.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.v$f$a r0 = (kotlinx.coroutines.flow.v.f.a) r0
                int r1 = r0.f12560r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12560r = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$f$a r0 = new kotlinx.coroutines.flow.v$f$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f12558p
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12560r
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                v3.e1.n(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f12557o
                java.lang.Object r2 = r0.f12556n
                kotlinx.coroutines.flow.v$f r2 = (kotlinx.coroutines.flow.v.f) r2
                v3.e1.n(r8)
                goto L6c
            L41:
                v3.e1.n(r8)
                goto L59
            L45:
                v3.e1.n(r8)
                u4.k1$a r8 = r6.f12553k
                boolean r8 = r8.f17429k
                if (r8 == 0) goto L5c
                kotlinx.coroutines.flow.j<T> r8 = r6.f12554l
                r0.f12560r = r5
                java.lang.Object r7 = r8.f(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                v3.m2 r7 = v3.m2.f17815a
                return r7
            L5c:
                t4.p<T, e4.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f12555m
                r0.f12556n = r6
                r0.f12557o = r7
                r0.f12560r = r4
                java.lang.Object r8 = r8.J(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                u4.k1$a r8 = r2.f12553k
                r8.f17429k = r5
                kotlinx.coroutines.flow.j<T> r8 = r2.f12554l
                r2 = 0
                r0.f12556n = r2
                r0.f12557o = r2
                r0.f12560r = r3
                java.lang.Object r7 = r8.f(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                v3.m2 r7 = v3.m2.f17815a
                return r7
            L8b:
                v3.m2 r7 = v3.m2.f17815a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.f.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {73}, m = "emitAbort$FlowKt__LimitKt", n = {"$this$emitAbort"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class g<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12561n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f12562o;

        /* renamed from: p  reason: collision with root package name */
        public int f12563p;

        public g(e4.d<? super g> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12562o = obj;
            this.f12563p |= Integer.MIN_VALUE;
            return v.f(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class h<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f12564k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f12565l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {115}, m = "collect", n = {"$this$take_u24lambda_u2d4"}, s = {"L$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12566n;

            /* renamed from: o  reason: collision with root package name */
            public int f12567o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12569q;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12566n = obj;
                this.f12567o |= Integer.MIN_VALUE;
                return h.this.a(null, this);
            }
        }

        public h(kotlinx.coroutines.flow.i iVar, int i7) {
            this.f12564k = iVar;
            this.f12565l = i7;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
            p5.q.b(r8, r7);
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r7, @n6.d e4.d<? super v3.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.v.h.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.v$h$a r0 = (kotlinx.coroutines.flow.v.h.a) r0
                int r1 = r0.f12567o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12567o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$h$a r0 = new kotlinx.coroutines.flow.v$h$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f12566n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12567o
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f12569q
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                v3.e1.n(r8)     // Catch: p5.a -> L51
                goto L55
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                v3.e1.n(r8)
                u4.k1$f r8 = new u4.k1$f
                r8.<init>()
                kotlinx.coroutines.flow.i r2 = r6.f12564k     // Catch: p5.a -> L51
                kotlinx.coroutines.flow.v$i r4 = new kotlinx.coroutines.flow.v$i     // Catch: p5.a -> L51
                int r5 = r6.f12565l     // Catch: p5.a -> L51
                r4.<init>(r8, r5, r7)     // Catch: p5.a -> L51
                r0.f12569q = r7     // Catch: p5.a -> L51
                r0.f12567o = r3     // Catch: p5.a -> L51
                java.lang.Object r7 = r2.a(r4, r0)     // Catch: p5.a -> L51
                if (r7 != r1) goto L55
                return r1
            L51:
                r8 = move-exception
                p5.q.b(r8, r7)
            L55:
                v3.m2 r7 = v3.m2.f17815a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.h.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class i<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.f f12570k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f12571l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<T> f12572m;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {61, 63}, m = "emit", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12573n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ i<T> f12574o;

            /* renamed from: p  reason: collision with root package name */
            public int f12575p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super T> iVar, e4.d<? super a> dVar) {
                super(dVar);
                this.f12574o = iVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12573n = obj;
                this.f12575p |= Integer.MIN_VALUE;
                return this.f12574o.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(k1.f fVar, int i7, kotlinx.coroutines.flow.j<? super T> jVar) {
            this.f12570k = fVar;
            this.f12571l = i7;
            this.f12572m = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r6, @n6.d e4.d<? super v3.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.v.i.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.v$i$a r0 = (kotlinx.coroutines.flow.v.i.a) r0
                int r1 = r0.f12575p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12575p = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$i$a r0 = new kotlinx.coroutines.flow.v$i$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f12573n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12575p
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                v3.e1.n(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                v3.e1.n(r7)
                goto L51
            L38:
                v3.e1.n(r7)
                u4.k1$f r7 = r5.f12570k
                int r2 = r7.f17434k
                int r2 = r2 + r4
                r7.f17434k = r2
                int r7 = r5.f12571l
                if (r2 >= r7) goto L54
                kotlinx.coroutines.flow.j<T> r7 = r5.f12572m
                r0.f12575p = r4
                java.lang.Object r6 = r7.f(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                v3.m2 r6 = v3.m2.f17815a
                return r6
            L54:
                kotlinx.coroutines.flow.j<T> r7 = r5.f12572m
                r0.f12575p = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.v.a(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                v3.m2 r6 = v3.m2.f17815a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.i.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class j<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f12576k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.p f12577l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {124}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12578n;

            /* renamed from: o  reason: collision with root package name */
            public int f12579o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12581q;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12578n = obj;
                this.f12579o |= Integer.MIN_VALUE;
                return j.this.a(null, this);
            }
        }

        public j(kotlinx.coroutines.flow.i iVar, t4.p pVar) {
            this.f12576k = iVar;
            this.f12577l = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r6, @n6.d e4.d<? super v3.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.v.j.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.v$j$a r0 = (kotlinx.coroutines.flow.v.j.a) r0
                int r1 = r0.f12579o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12579o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$j$a r0 = new kotlinx.coroutines.flow.v$j$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f12578n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12579o
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f12581q
                kotlinx.coroutines.flow.v$k r6 = (kotlinx.coroutines.flow.v.k) r6
                v3.e1.n(r7)     // Catch: p5.a -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                v3.e1.n(r7)
                kotlinx.coroutines.flow.i r7 = r5.f12576k
                kotlinx.coroutines.flow.v$k r2 = new kotlinx.coroutines.flow.v$k
                t4.p r4 = r5.f12577l
                r2.<init>(r4, r6)
                r0.f12581q = r2     // Catch: p5.a -> L4e
                r0.f12579o = r3     // Catch: p5.a -> L4e
                java.lang.Object r6 = r7.a(r2, r0)     // Catch: p5.a -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                p5.q.b(r7, r6)
            L53:
                v3.m2 r6 = v3.m2.f17815a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.j.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class k<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.p f12582k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j f12583l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {142, 143}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public Object f12584n;

            /* renamed from: o  reason: collision with root package name */
            public /* synthetic */ Object f12585o;

            /* renamed from: p  reason: collision with root package name */
            public int f12586p;

            /* renamed from: r  reason: collision with root package name */
            public Object f12588r;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12585o = obj;
                this.f12586p |= Integer.MIN_VALUE;
                return k.this.f(null, this);
            }
        }

        public k(t4.p pVar, kotlinx.coroutines.flow.j jVar) {
            this.f12582k = pVar;
            this.f12583l = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object f(T r8, @n6.d e4.d<? super v3.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.v.k.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.v$k$a r0 = (kotlinx.coroutines.flow.v.k.a) r0
                int r1 = r0.f12586p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12586p = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$k$a r0 = new kotlinx.coroutines.flow.v$k$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f12585o
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12586p
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f12584n
                kotlinx.coroutines.flow.v$k r8 = (kotlinx.coroutines.flow.v.k) r8
                v3.e1.n(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f12588r
                java.lang.Object r2 = r0.f12584n
                kotlinx.coroutines.flow.v$k r2 = (kotlinx.coroutines.flow.v.k) r2
                v3.e1.n(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                v3.e1.n(r9)
                t4.p r9 = r7.f12582k
                r0.f12584n = r7
                r0.f12588r = r8
                r0.f12586p = r4
                r2 = 6
                u4.i0.e(r2)
                java.lang.Object r9 = r9.J(r8, r0)
                r2 = 7
                u4.i0.e(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                kotlinx.coroutines.flow.j r2 = r8.f12583l
                r0.f12584n = r8
                r5 = 0
                r0.f12588r = r5
                r0.f12586p = r3
                java.lang.Object r9 = r2.f(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                v3.m2 r8 = v3.m2.f17815a
                return r8
            L81:
                p5.a r9 = new p5.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.k.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class l<R> extends h4.o implements t4.p<kotlinx.coroutines.flow.j<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f12589o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f12590p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T> f12591q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ t4.q<kotlinx.coroutines.flow.j<? super R>, T, e4.d<? super Boolean>, Object> f12592r;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* loaded from: classes.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.j<T> {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ t4.q f12593k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.j f12594l;

            @h4.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", i = {0}, l = {142}, m = "emit", n = {"this"}, s = {"L$0"})
            /* renamed from: kotlinx.coroutines.flow.v$l$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0165a extends h4.d {

                /* renamed from: n  reason: collision with root package name */
                public Object f12595n;

                /* renamed from: o  reason: collision with root package name */
                public /* synthetic */ Object f12596o;

                /* renamed from: p  reason: collision with root package name */
                public int f12597p;

                public C0165a(e4.d dVar) {
                    super(dVar);
                }

                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    this.f12596o = obj;
                    this.f12597p |= Integer.MIN_VALUE;
                    return a.this.f(null, this);
                }
            }

            public a(t4.q qVar, kotlinx.coroutines.flow.j jVar) {
                this.f12593k = qVar;
                this.f12594l = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
            @Override // kotlinx.coroutines.flow.j
            @n6.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object f(T r5, @n6.d e4.d<? super v3.m2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.l.a.C0165a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.v$l$a$a r0 = (kotlinx.coroutines.flow.v.l.a.C0165a) r0
                    int r1 = r0.f12597p
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12597p = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.v$l$a$a r0 = new kotlinx.coroutines.flow.v$l$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f12596o
                    java.lang.Object r1 = g4.d.h()
                    int r2 = r0.f12597p
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r5 = r0.f12595n
                    kotlinx.coroutines.flow.v$l$a r5 = (kotlinx.coroutines.flow.v.l.a) r5
                    v3.e1.n(r6)
                    goto L50
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    v3.e1.n(r6)
                    t4.q r6 = r4.f12593k
                    kotlinx.coroutines.flow.j r2 = r4.f12594l
                    r0.f12595n = r4
                    r0.f12597p = r3
                    r3 = 6
                    u4.i0.e(r3)
                    java.lang.Object r6 = r6.I(r2, r5, r0)
                    r5 = 7
                    u4.i0.e(r5)
                    if (r6 != r1) goto L4f
                    return r1
                L4f:
                    r5 = r4
                L50:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L5b
                    v3.m2 r5 = v3.m2.f17815a
                    return r5
                L5b:
                    p5.a r6 = new p5.a
                    r6.<init>(r5)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.l.a.f(java.lang.Object, e4.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(kotlinx.coroutines.flow.i<? extends T> iVar, t4.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super e4.d<? super Boolean>, ? extends Object> qVar, e4.d<? super l> dVar) {
            super(2, dVar);
            this.f12591q = iVar;
            this.f12592r = qVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            l lVar = new l(this.f12591q, this.f12592r, dVar);
            lVar.f12590p = obj;
            return lVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            a aVar;
            Object h7 = g4.d.h();
            int i7 = this.f12589o;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12590p;
                kotlinx.coroutines.flow.i<T> iVar = this.f12591q;
                a aVar2 = new a(this.f12592r, jVar);
                try {
                    this.f12590p = aVar2;
                    this.f12589o = 1;
                    if (iVar.a(aVar2, this) == h7) {
                        return h7;
                    }
                } catch (p5.a e7) {
                    e = e7;
                    aVar = aVar2;
                    p5.q.b(e, aVar);
                    return m2.f17815a;
                }
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                aVar = (a) this.f12590p;
                try {
                    e1.n(obj);
                } catch (p5.a e8) {
                    e = e8;
                    p5.q.b(e, aVar);
                    return m2.f17815a;
                }
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.e e4.d<? super m2> dVar) {
            return ((l) H(jVar, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, @n6.d t4.p<? super T, ? super e4.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @n6.d e4.d<? super v3.m2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.v$a r0 = (kotlinx.coroutines.flow.v.a) r0
            int r1 = r0.f12537p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12537p = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.v$a r0 = new kotlinx.coroutines.flow.v$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12536o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12537p
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f12535n
            kotlinx.coroutines.flow.v$b r4 = (kotlinx.coroutines.flow.v.b) r4
            v3.e1.n(r6)     // Catch: p5.a -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L4c
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            v3.e1.n(r6)
            kotlinx.coroutines.flow.v$b r6 = new kotlinx.coroutines.flow.v$b
            r6.<init>(r5)
            r0.f12535n = r6     // Catch: p5.a -> L4a
            r0.f12537p = r3     // Catch: p5.a -> L4a
            java.lang.Object r4 = r4.a(r6, r0)     // Catch: p5.a -> L4a
            if (r4 != r1) goto L4f
            return r1
        L4a:
            r5 = move-exception
            r4 = r6
        L4c:
            p5.q.b(r5, r4)
        L4f:
            v3.m2 r4 = v3.m2.f17815a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.b(kotlinx.coroutines.flow.i, t4.p, e4.d):java.lang.Object");
    }

    public static final <T> Object c(kotlinx.coroutines.flow.i<? extends T> iVar, t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar, e4.d<? super m2> dVar) {
        b bVar = new b(pVar);
        try {
            u4.i0.e(0);
            iVar.a(bVar, dVar);
            u4.i0.e(1);
        } catch (p5.a e7) {
            p5.q.b(e7, bVar);
        }
        return m2.f17815a;
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> d(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, int i7) {
        if (i7 >= 0) {
            return new c(iVar, i7);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i7).toString());
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> e(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
        return new e(iVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object f(kotlinx.coroutines.flow.j<? super T> r4, T r5, e4.d<? super v3.m2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.g
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.v$g r0 = (kotlinx.coroutines.flow.v.g) r0
            int r1 = r0.f12563p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12563p = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.v$g r0 = new kotlinx.coroutines.flow.v$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12562o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12563p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f12561n
            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
            v3.e1.n(r6)
            goto L43
        L35:
            v3.e1.n(r6)
            r0.f12561n = r4
            r0.f12563p = r3
            java.lang.Object r5 = r4.f(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            p5.a r5 = new p5.a
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.f(kotlinx.coroutines.flow.j, java.lang.Object, e4.d):java.lang.Object");
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> g(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, int i7) {
        if (i7 > 0) {
            return new h(iVar, i7);
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " should be positive").toString());
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> h(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
        return new j(iVar, pVar);
    }

    @n6.d
    public static final <T, R> kotlinx.coroutines.flow.i<R> i(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, @v3.b @n6.d t4.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super e4.d<? super Boolean>, ? extends Object> qVar) {
        return kotlinx.coroutines.flow.k.I0(new l(iVar, qVar, null));
    }
}
