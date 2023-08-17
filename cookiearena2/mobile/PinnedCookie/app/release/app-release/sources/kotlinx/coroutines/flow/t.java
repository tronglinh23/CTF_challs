package kotlinx.coroutines.flow;

import u4.k1;
import v3.a1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class t {

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {216}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class a<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12444n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f12445o;

        /* renamed from: p  reason: collision with root package name */
        public int f12446p;

        public a(e4.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12445o = obj;
            this.f12446p |= Integer.MIN_VALUE;
            return t.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> implements i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ i f12447k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.q f12448l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {114, 121, 128}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u2d2", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12449n;

            /* renamed from: o  reason: collision with root package name */
            public int f12450o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12452q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12453r;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12449n = obj;
                this.f12450o |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(i iVar, t4.q qVar) {
            this.f12447k = iVar;
            this.f12448l = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r9, @n6.d e4.d<? super v3.m2> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.t.b.a
                if (r0 == 0) goto L13
                r0 = r10
                kotlinx.coroutines.flow.t$b$a r0 = (kotlinx.coroutines.flow.t.b.a) r0
                int r1 = r0.f12450o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12450o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$b$a r0 = new kotlinx.coroutines.flow.t$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f12449n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12450o
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f12452q
                p5.v r9 = (p5.v) r9
                v3.e1.n(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f12452q
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                v3.e1.n(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.f12453r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.j) r9
                java.lang.Object r2 = r0.f12452q
                kotlinx.coroutines.flow.t$b r2 = (kotlinx.coroutines.flow.t.b) r2
                v3.e1.n(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                v3.e1.n(r10)
                kotlinx.coroutines.flow.i r10 = r8.f12447k     // Catch: java.lang.Throwable -> L96
                r0.f12452q = r8     // Catch: java.lang.Throwable -> L96
                r0.f12453r = r9     // Catch: java.lang.Throwable -> L96
                r0.f12450o = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                p5.v r10 = new p5.v
                e4.g r4 = r0.g()
                r10.<init>(r9, r4)
                t4.q r9 = r2.f12448l     // Catch: java.lang.Throwable -> L8e
                r0.f12452q = r10     // Catch: java.lang.Throwable -> L8e
                r0.f12453r = r6     // Catch: java.lang.Throwable -> L8e
                r0.f12450o = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                u4.i0.e(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.I(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                u4.i0.e(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.R()
                v3.m2 r9 = v3.m2.f17815a
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.R()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                kotlinx.coroutines.flow.z0 r10 = new kotlinx.coroutines.flow.z0
                r10.<init>(r9)
                t4.q r2 = r2.f12448l
                r0.f12452q = r9
                r0.f12453r = r6
                r0.f12450o = r4
                java.lang.Object r10 = kotlinx.coroutines.flow.t.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.b.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class c<T> implements i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ i f12454k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.p f12455l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {114, 122}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u2d3", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12456n;

            /* renamed from: o  reason: collision with root package name */
            public int f12457o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12459q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12460r;

            /* renamed from: s  reason: collision with root package name */
            public Object f12461s;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12456n = obj;
                this.f12457o |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(i iVar, t4.p pVar) {
            this.f12454k = iVar;
            this.f12455l = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
        /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.flow.j, java.lang.Object, kotlinx.coroutines.flow.j<? super T>] */
        /* JADX WARN: Type inference failed for: r7v1, types: [p5.v] */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v7, types: [p5.v] */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r7, @n6.d e4.d<? super v3.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.t.c.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.t$c$a r0 = (kotlinx.coroutines.flow.t.c.a) r0
                int r1 = r0.f12457o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12457o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$c$a r0 = new kotlinx.coroutines.flow.t$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f12456n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12457o
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4a
                if (r2 == r4) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r7 = r0.f12459q
                p5.v r7 = (p5.v) r7
                v3.e1.n(r8)     // Catch: java.lang.Throwable -> L30
                goto L94
            L30:
                r8 = move-exception
                goto L98
            L32:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3a:
                java.lang.Object r7 = r0.f12461s
                u4.k1$a r7 = (u4.k1.a) r7
                java.lang.Object r2 = r0.f12460r
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r4 = r0.f12459q
                kotlinx.coroutines.flow.t$c r4 = (kotlinx.coroutines.flow.t.c) r4
                v3.e1.n(r8)
                goto L6d
            L4a:
                v3.e1.n(r8)
                u4.k1$a r8 = new u4.k1$a
                r8.<init>()
                r8.f17429k = r4
                kotlinx.coroutines.flow.i r2 = r6.f12454k
                kotlinx.coroutines.flow.t$d r5 = new kotlinx.coroutines.flow.t$d
                r5.<init>(r8, r7)
                r0.f12459q = r6
                r0.f12460r = r7
                r0.f12461s = r8
                r0.f12457o = r4
                java.lang.Object r2 = r2.a(r5, r0)
                if (r2 != r1) goto L6a
                return r1
            L6a:
                r4 = r6
                r2 = r7
                r7 = r8
            L6d:
                boolean r7 = r7.f17429k
                if (r7 == 0) goto L9c
                p5.v r7 = new p5.v
                e4.g r8 = r0.g()
                r7.<init>(r2, r8)
                t4.p r8 = r4.f12455l     // Catch: java.lang.Throwable -> L30
                r0.f12459q = r7     // Catch: java.lang.Throwable -> L30
                r2 = 0
                r0.f12460r = r2     // Catch: java.lang.Throwable -> L30
                r0.f12461s = r2     // Catch: java.lang.Throwable -> L30
                r0.f12457o = r3     // Catch: java.lang.Throwable -> L30
                r2 = 6
                u4.i0.e(r2)     // Catch: java.lang.Throwable -> L30
                java.lang.Object r8 = r8.J(r7, r0)     // Catch: java.lang.Throwable -> L30
                r0 = 7
                u4.i0.e(r0)     // Catch: java.lang.Throwable -> L30
                if (r8 != r1) goto L94
                return r1
            L94:
                r7.R()
                goto L9c
            L98:
                r7.R()
                throw r8
            L9c:
                v3.m2 r7 = v3.m2.f17815a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.c.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> implements j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.a f12462k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ j<T> f12463l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {185}, m = "emit", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12464n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ d<T> f12465o;

            /* renamed from: p  reason: collision with root package name */
            public int f12466p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, e4.d<? super a> dVar2) {
                super(dVar2);
                this.f12465o = dVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12464n = obj;
                this.f12466p |= Integer.MIN_VALUE;
                return this.f12465o.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(k1.a aVar, j<? super T> jVar) {
            this.f12462k = aVar;
            this.f12463l = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r5, @n6.d e4.d<? super v3.m2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.t.d.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.t$d$a r0 = (kotlinx.coroutines.flow.t.d.a) r0
                int r1 = r0.f12466p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12466p = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$d$a r0 = new kotlinx.coroutines.flow.t$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f12464n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12466p
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                v3.e1.n(r6)
                goto L44
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                v3.e1.n(r6)
                u4.k1$a r6 = r4.f12462k
                r2 = 0
                r6.f17429k = r2
                kotlinx.coroutines.flow.j<T> r6 = r4.f12463l
                r0.f12466p = r3
                java.lang.Object r5 = r6.f(r5, r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                v3.m2 r5 = v3.m2.f17815a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.d.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class e<T> implements i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.p f12467k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ i f12468l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {116, 120}, m = "collect", n = {"this", "$this$onStart_u24lambda_u2d1", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12469n;

            /* renamed from: o  reason: collision with root package name */
            public int f12470o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12472q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12473r;

            /* renamed from: s  reason: collision with root package name */
            public Object f12474s;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12469n = obj;
                this.f12470o |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        public e(t4.p pVar, i iVar) {
            this.f12467k = pVar;
            this.f12468l = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r7, @n6.d e4.d<? super v3.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.t.e.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.t$e$a r0 = (kotlinx.coroutines.flow.t.e.a) r0
                int r1 = r0.f12470o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12470o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$e$a r0 = new kotlinx.coroutines.flow.t$e$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f12469n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12470o
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                v3.e1.n(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f12474s
                p5.v r7 = (p5.v) r7
                java.lang.Object r2 = r0.f12473r
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r4 = r0.f12472q
                kotlinx.coroutines.flow.t$e r4 = (kotlinx.coroutines.flow.t.e) r4
                v3.e1.n(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                v3.e1.n(r8)
                p5.v r8 = new p5.v
                e4.g r2 = r0.g()
                r8.<init>(r7, r2)
                t4.p r2 = r6.f12467k     // Catch: java.lang.Throwable -> L86
                r0.f12472q = r6     // Catch: java.lang.Throwable -> L86
                r0.f12473r = r7     // Catch: java.lang.Throwable -> L86
                r0.f12474s = r8     // Catch: java.lang.Throwable -> L86
                r0.f12470o = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                u4.i0.e(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.J(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                u4.i0.e(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.R()
                kotlinx.coroutines.flow.i r7 = r4.f12468l
                r8 = 0
                r0.f12472q = r8
                r0.f12473r = r8
                r0.f12474s = r8
                r0.f12470o = r3
                java.lang.Object r7 = r7.a(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                v3.m2 r7 = v3.m2.f17815a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.R()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.e.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class f<R> extends h4.o implements t4.p<j<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f12475o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f12476p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ i<T> f12477q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ t4.q<j<? super R>, T, e4.d<? super m2>, Object> f12478r;

        /* loaded from: classes.dex */
        public static final class a<T> implements j {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ t4.q<j<? super R>, T, e4.d<? super m2>, Object> f12479k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ j<R> f12480l;

            @h4.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", f = "Emitters.kt", i = {}, l = {42}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.t$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0163a extends h4.d {

                /* renamed from: n  reason: collision with root package name */
                public /* synthetic */ Object f12481n;

                /* renamed from: o  reason: collision with root package name */
                public final /* synthetic */ a<T> f12482o;

                /* renamed from: p  reason: collision with root package name */
                public int f12483p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0163a(a<? super T> aVar, e4.d<? super C0163a> dVar) {
                    super(dVar);
                    this.f12482o = aVar;
                }

                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    this.f12481n = obj;
                    this.f12483p |= Integer.MIN_VALUE;
                    return this.f12482o.f(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(t4.q<? super j<? super R>, ? super T, ? super e4.d<? super m2>, ? extends Object> qVar, j<? super R> jVar) {
                this.f12479k = qVar;
                this.f12480l = jVar;
            }

            @n6.e
            public final Object a(T t6, @n6.d e4.d<? super m2> dVar) {
                u4.i0.e(4);
                new C0163a(this, dVar);
                u4.i0.e(5);
                this.f12479k.I(this.f12480l, t6, dVar);
                return m2.f17815a;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // kotlinx.coroutines.flow.j
            @n6.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object f(T r5, @n6.d e4.d<? super v3.m2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.t.f.a.C0163a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.t$f$a$a r0 = (kotlinx.coroutines.flow.t.f.a.C0163a) r0
                    int r1 = r0.f12483p
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12483p = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.t$f$a$a r0 = new kotlinx.coroutines.flow.t$f$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f12481n
                    java.lang.Object r1 = g4.d.h()
                    int r2 = r0.f12483p
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    v3.e1.n(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    v3.e1.n(r6)
                    t4.q<kotlinx.coroutines.flow.j<? super R>, T, e4.d<? super v3.m2>, java.lang.Object> r6 = r4.f12479k
                    kotlinx.coroutines.flow.j<R> r2 = r4.f12480l
                    r0.f12483p = r3
                    java.lang.Object r5 = r6.I(r2, r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    v3.m2 r5 = v3.m2.f17815a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.f.a.f(java.lang.Object, e4.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(i<? extends T> iVar, t4.q<? super j<? super R>, ? super T, ? super e4.d<? super m2>, ? extends Object> qVar, e4.d<? super f> dVar) {
            super(2, dVar);
            this.f12477q = iVar;
            this.f12478r = qVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            f fVar = new f(this.f12477q, this.f12478r, dVar);
            fVar.f12476p = obj;
            return fVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12475o;
            if (i7 == 0) {
                e1.n(obj);
                j jVar = (j) this.f12476p;
                i<T> iVar = this.f12477q;
                a aVar = new a(this.f12478r, jVar);
                this.f12475o = 1;
                if (iVar.a(aVar, this) == h7) {
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
        public final Object J(@n6.d j<? super R> jVar, @n6.e e4.d<? super m2> dVar) {
            return ((f) H(jVar, dVar)).Q(m2.f17815a);
        }

        @n6.e
        public final Object c0(@n6.d Object obj) {
            j jVar = (j) this.f12476p;
            i<T> iVar = this.f12477q;
            a aVar = new a(this.f12478r, jVar);
            u4.i0.e(0);
            iVar.a(aVar, this);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes.dex */
    public static final class g<R> implements i<R> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ i f12484k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.q f12485l;

        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12486n;

            /* renamed from: o  reason: collision with root package name */
            public int f12487o;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12486n = obj;
                this.f12487o |= Integer.MIN_VALUE;
                return g.this.a(null, this);
            }
        }

        public g(i iVar, t4.q qVar) {
            this.f12484k = iVar;
            this.f12485l = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d j<? super R> jVar, @n6.d e4.d<? super m2> dVar) {
            Object a7 = this.f12484k.a(new h(this.f12485l, jVar), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }

        @n6.e
        public Object d(@n6.d j jVar, @n6.d e4.d dVar) {
            u4.i0.e(4);
            new a(dVar);
            u4.i0.e(5);
            i iVar = this.f12484k;
            h hVar = new h(this.f12485l, jVar);
            u4.i0.e(0);
            iVar.a(hVar, dVar);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h<T> implements j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.q<j<? super R>, T, e4.d<? super m2>, Object> f12489k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ j<R> f12490l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", f = "Emitters.kt", i = {}, l = {53}, m = "emit", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12491n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ h<T> f12492o;

            /* renamed from: p  reason: collision with root package name */
            public int f12493p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(h<? super T> hVar, e4.d<? super a> dVar) {
                super(dVar);
                this.f12492o = hVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12491n = obj;
                this.f12493p |= Integer.MIN_VALUE;
                return this.f12492o.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(t4.q<? super j<? super R>, ? super T, ? super e4.d<? super m2>, ? extends Object> qVar, j<? super R> jVar) {
            this.f12489k = qVar;
            this.f12490l = jVar;
        }

        @n6.e
        public final Object a(T t6, @n6.d e4.d<? super m2> dVar) {
            u4.i0.e(4);
            new a(this, dVar);
            u4.i0.e(5);
            this.f12489k.I(this.f12490l, t6, dVar);
            return m2.f17815a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r5, @n6.d e4.d<? super v3.m2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.t.h.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.t$h$a r0 = (kotlinx.coroutines.flow.t.h.a) r0
                int r1 = r0.f12493p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12493p = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$h$a r0 = new kotlinx.coroutines.flow.t$h$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f12491n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12493p
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                v3.e1.n(r6)
                goto L41
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                v3.e1.n(r6)
                t4.q<kotlinx.coroutines.flow.j<? super R>, T, e4.d<? super v3.m2>, java.lang.Object> r6 = r4.f12489k
                kotlinx.coroutines.flow.j<R> r2 = r4.f12490l
                r0.f12493p = r3
                java.lang.Object r5 = r6.I(r2, r5, r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                v3.m2 r5 = v3.m2.f17815a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.h.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    public static final void b(@n6.d j<?> jVar) {
        if (jVar instanceof z0) {
            throw ((z0) jVar).f12746k;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(kotlinx.coroutines.flow.j<? super T> r4, t4.q<? super kotlinx.coroutines.flow.j<? super T>, ? super java.lang.Throwable, ? super e4.d<? super v3.m2>, ? extends java.lang.Object> r5, java.lang.Throwable r6, e4.d<? super v3.m2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.t.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.t$a r0 = (kotlinx.coroutines.flow.t.a) r0
            int r1 = r0.f12446p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12446p = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.t$a r0 = new kotlinx.coroutines.flow.t$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f12445o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12446p
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f12444n
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            v3.e1.n(r7)     // Catch: java.lang.Throwable -> L47
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            v3.e1.n(r7)
            r0.f12444n = r6     // Catch: java.lang.Throwable -> L47
            r0.f12446p = r3     // Catch: java.lang.Throwable -> L47
            java.lang.Object r4 = r5.I(r4, r6, r0)     // Catch: java.lang.Throwable -> L47
            if (r4 != r1) goto L44
            return r1
        L44:
            v3.m2 r4 = v3.m2.f17815a
            return r4
        L47:
            r4 = move-exception
            if (r6 == 0) goto L4f
            if (r6 == r4) goto L4f
            v3.p.a(r4, r6)
        L4f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.c(kotlinx.coroutines.flow.j, t4.q, java.lang.Throwable, e4.d):java.lang.Object");
    }

    @n6.d
    public static final <T> i<T> d(@n6.d i<? extends T> iVar, @n6.d t4.q<? super j<? super T>, ? super Throwable, ? super e4.d<? super m2>, ? extends Object> qVar) {
        return new b(iVar, qVar);
    }

    @n6.d
    public static final <T> i<T> e(@n6.d i<? extends T> iVar, @n6.d t4.p<? super j<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return new c(iVar, pVar);
    }

    @n6.d
    public static final <T> i<T> f(@n6.d i<? extends T> iVar, @n6.d t4.p<? super j<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return new e(pVar, iVar);
    }

    @n6.d
    public static final <T, R> i<R> g(@n6.d i<? extends T> iVar, @v3.b @n6.d t4.q<? super j<? super R>, ? super T, ? super e4.d<? super m2>, ? extends Object> qVar) {
        return k.I0(new f(iVar, qVar, null));
    }

    @n6.d
    @a1
    public static final <T, R> i<R> h(@n6.d i<? extends T> iVar, @v3.b @n6.d t4.q<? super j<? super R>, ? super T, ? super e4.d<? super m2>, ? extends Object> qVar) {
        return new g(iVar, qVar);
    }
}
