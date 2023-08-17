package kotlinx.coroutines.flow;

import u4.k1;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class a0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f11982k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.p f11983l;

        /* renamed from: kotlinx.coroutines.flow.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0147a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f11984n;

            /* renamed from: o  reason: collision with root package name */
            public int f11985o;

            public C0147a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f11984n = obj;
                this.f11985o |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        /* loaded from: classes.dex */
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.j f11987k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ t4.p f11988l;

            @h4.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filter_u24lambda_u2d0"}, s = {"L$0", "L$1"})
            /* renamed from: kotlinx.coroutines.flow.a0$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0148a extends h4.d {

                /* renamed from: n  reason: collision with root package name */
                public /* synthetic */ Object f11989n;

                /* renamed from: o  reason: collision with root package name */
                public int f11990o;

                /* renamed from: q  reason: collision with root package name */
                public Object f11992q;

                /* renamed from: r  reason: collision with root package name */
                public Object f11993r;

                public C0148a(e4.d dVar) {
                    super(dVar);
                }

                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    this.f11989n = obj;
                    this.f11990o |= Integer.MIN_VALUE;
                    return b.this.f(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, t4.p pVar) {
                this.f11987k = jVar;
                this.f11988l = pVar;
            }

            @n6.e
            public final Object a(Object obj, @n6.d e4.d dVar) {
                u4.i0.e(4);
                new C0148a(dVar);
                u4.i0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f11987k;
                if (((Boolean) this.f11988l.J(obj, dVar)).booleanValue()) {
                    u4.i0.e(0);
                    jVar.f(obj, dVar);
                    u4.i0.e(1);
                }
                return m2.f17815a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
            @Override // kotlinx.coroutines.flow.j
            @n6.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object f(T r7, @n6.d e4.d<? super v3.m2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.a.b.C0148a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$a$b$a r0 = (kotlinx.coroutines.flow.a0.a.b.C0148a) r0
                    int r1 = r0.f11990o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f11990o = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$a$b$a r0 = new kotlinx.coroutines.flow.a0$a$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f11989n
                    java.lang.Object r1 = g4.d.h()
                    int r2 = r0.f11990o
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    v3.e1.n(r8)
                    goto L6c
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f11993r
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    java.lang.Object r2 = r0.f11992q
                    v3.e1.n(r8)
                    goto L56
                L3e:
                    v3.e1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f11987k
                    t4.p r2 = r6.f11988l
                    r0.f11992q = r7
                    r0.f11993r = r8
                    r0.f11990o = r4
                    java.lang.Object r2 = r2.J(r7, r0)
                    if (r2 != r1) goto L52
                    return r1
                L52:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L56:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L6c
                    r8 = 0
                    r0.f11992q = r8
                    r0.f11993r = r8
                    r0.f11990o = r3
                    java.lang.Object r7 = r7.f(r2, r0)
                    if (r7 != r1) goto L6c
                    return r1
                L6c:
                    v3.m2 r7 = v3.m2.f17815a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.a.b.f(java.lang.Object, e4.d):java.lang.Object");
            }
        }

        public a(kotlinx.coroutines.flow.i iVar, t4.p pVar) {
            this.f11982k = iVar;
            this.f11983l = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            Object a7 = this.f11982k.a(new b(jVar, this.f11983l), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }

        @n6.e
        public Object d(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            u4.i0.e(4);
            new C0147a(dVar);
            u4.i0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f11982k;
            b bVar = new b(jVar, this.f11983l);
            u4.i0.e(0);
            iVar.a(bVar, dVar);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements kotlinx.coroutines.flow.i<Object> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f11994k;

        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f11995n;

            /* renamed from: o  reason: collision with root package name */
            public int f11996o;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f11995n = obj;
                this.f11996o |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        /* renamed from: kotlinx.coroutines.flow.a0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0149b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.j f11998k;

            @h4.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.a0$b$b$a */
            /* loaded from: classes.dex */
            public static final class a extends h4.d {

                /* renamed from: n  reason: collision with root package name */
                public /* synthetic */ Object f11999n;

                /* renamed from: o  reason: collision with root package name */
                public int f12000o;

                /* renamed from: p  reason: collision with root package name */
                public Object f12001p;

                /* renamed from: q  reason: collision with root package name */
                public Object f12002q;

                public a(e4.d dVar) {
                    super(dVar);
                }

                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    this.f11999n = obj;
                    this.f12000o |= Integer.MIN_VALUE;
                    return C0149b.this.f(null, this);
                }
            }

            public C0149b(kotlinx.coroutines.flow.j jVar) {
                this.f11998k = jVar;
            }

            @n6.e
            public final Object a(Object obj, @n6.d e4.d dVar) {
                u4.i0.e(4);
                new a(dVar);
                u4.i0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f11998k;
                u4.l0.y(3, "R");
                if (obj instanceof Object) {
                    u4.i0.e(0);
                    jVar.f(obj, dVar);
                    u4.i0.e(1);
                }
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
            public final java.lang.Object f(java.lang.Object r6, @n6.d e4.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.a0.b.C0149b.a
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.a0$b$b$a r0 = (kotlinx.coroutines.flow.a0.b.C0149b.a) r0
                    int r1 = r0.f12000o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12000o = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$b$b$a r0 = new kotlinx.coroutines.flow.a0$b$b$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f11999n
                    java.lang.Object r1 = g4.d.h()
                    int r2 = r0.f12000o
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    v3.e1.n(r7)
                    goto L49
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    v3.e1.n(r7)
                    kotlinx.coroutines.flow.j r7 = r5.f11998k
                    r2 = 3
                    java.lang.String r4 = "R"
                    u4.l0.y(r2, r4)
                    boolean r2 = r6 instanceof java.lang.Object
                    if (r2 == 0) goto L49
                    r0.f12000o = r3
                    java.lang.Object r6 = r7.f(r6, r0)
                    if (r6 != r1) goto L49
                    return r1
                L49:
                    v3.m2 r6 = v3.m2.f17815a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.b.C0149b.f(java.lang.Object, e4.d):java.lang.Object");
            }
        }

        public b(kotlinx.coroutines.flow.i iVar) {
            this.f11994k = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j<? super Object> jVar, @n6.d e4.d dVar) {
            kotlinx.coroutines.flow.i iVar = this.f11994k;
            u4.l0.w();
            Object a7 = iVar.a(new C0149b(jVar), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }

        @n6.e
        public Object d(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            u4.i0.e(4);
            new a(dVar);
            u4.i0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f11994k;
            u4.l0.w();
            C0149b c0149b = new C0149b(jVar);
            u4.i0.e(0);
            iVar.a(c0149b, dVar);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class c<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f12004k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.p f12005l;

        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12006n;

            /* renamed from: o  reason: collision with root package name */
            public int f12007o;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12006n = obj;
                this.f12007o |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        /* loaded from: classes.dex */
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.j f12009k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ t4.p f12010l;

            @h4.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filterNot_u24lambda_u2d1"}, s = {"L$0", "L$1"})
            /* loaded from: classes.dex */
            public static final class a extends h4.d {

                /* renamed from: n  reason: collision with root package name */
                public /* synthetic */ Object f12011n;

                /* renamed from: o  reason: collision with root package name */
                public int f12012o;

                /* renamed from: q  reason: collision with root package name */
                public Object f12014q;

                /* renamed from: r  reason: collision with root package name */
                public Object f12015r;

                public a(e4.d dVar) {
                    super(dVar);
                }

                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    this.f12011n = obj;
                    this.f12012o |= Integer.MIN_VALUE;
                    return b.this.f(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, t4.p pVar) {
                this.f12009k = jVar;
                this.f12010l = pVar;
            }

            @n6.e
            public final Object a(Object obj, @n6.d e4.d dVar) {
                u4.i0.e(4);
                new a(dVar);
                u4.i0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f12009k;
                if (!((Boolean) this.f12010l.J(obj, dVar)).booleanValue()) {
                    u4.i0.e(0);
                    jVar.f(obj, dVar);
                    u4.i0.e(1);
                }
                return m2.f17815a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
            @Override // kotlinx.coroutines.flow.j
            @n6.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object f(T r7, @n6.d e4.d<? super v3.m2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.c.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$c$b$a r0 = (kotlinx.coroutines.flow.a0.c.b.a) r0
                    int r1 = r0.f12012o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12012o = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$c$b$a r0 = new kotlinx.coroutines.flow.a0$c$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f12011n
                    java.lang.Object r1 = g4.d.h()
                    int r2 = r0.f12012o
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    v3.e1.n(r8)
                    goto L6c
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f12015r
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    java.lang.Object r2 = r0.f12014q
                    v3.e1.n(r8)
                    goto L56
                L3e:
                    v3.e1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f12009k
                    t4.p r2 = r6.f12010l
                    r0.f12014q = r7
                    r0.f12015r = r8
                    r0.f12012o = r4
                    java.lang.Object r2 = r2.J(r7, r0)
                    if (r2 != r1) goto L52
                    return r1
                L52:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L56:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 != 0) goto L6c
                    r8 = 0
                    r0.f12014q = r8
                    r0.f12015r = r8
                    r0.f12012o = r3
                    java.lang.Object r7 = r7.f(r2, r0)
                    if (r7 != r1) goto L6c
                    return r1
                L6c:
                    v3.m2 r7 = v3.m2.f17815a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.c.b.f(java.lang.Object, e4.d):java.lang.Object");
            }
        }

        public c(kotlinx.coroutines.flow.i iVar, t4.p pVar) {
            this.f12004k = iVar;
            this.f12005l = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            Object a7 = this.f12004k.a(new b(jVar, this.f12005l), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }

        @n6.e
        public Object d(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            u4.i0.e(4);
            new a(dVar);
            u4.i0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f12004k;
            b bVar = new b(jVar, this.f12005l);
            u4.i0.e(0);
            iVar.a(bVar, dVar);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class d<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f12016k;

        /* loaded from: classes.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.j f12017k;

            @h4.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.a0$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0150a extends h4.d {

                /* renamed from: n  reason: collision with root package name */
                public /* synthetic */ Object f12018n;

                /* renamed from: o  reason: collision with root package name */
                public int f12019o;

                public C0150a(e4.d dVar) {
                    super(dVar);
                }

                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    this.f12018n = obj;
                    this.f12019o |= Integer.MIN_VALUE;
                    return a.this.f(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar) {
                this.f12017k = jVar;
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
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.a0.d.a.C0150a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.a0$d$a$a r0 = (kotlinx.coroutines.flow.a0.d.a.C0150a) r0
                    int r1 = r0.f12019o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12019o = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$d$a$a r0 = new kotlinx.coroutines.flow.a0$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f12018n
                    java.lang.Object r1 = g4.d.h()
                    int r2 = r0.f12019o
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
                    kotlinx.coroutines.flow.j r6 = r4.f12017k
                    if (r5 == 0) goto L41
                    r0.f12019o = r3
                    java.lang.Object r5 = r6.f(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    v3.m2 r5 = v3.m2.f17815a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.d.a.f(java.lang.Object, e4.d):java.lang.Object");
            }
        }

        public d(kotlinx.coroutines.flow.i iVar) {
            this.f12016k = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            Object a7 = this.f12016k.a(new a(jVar), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes.dex */
    public static final class e<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f12021k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.p f12022l;

        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12023n;

            /* renamed from: o  reason: collision with root package name */
            public int f12024o;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12023n = obj;
                this.f12024o |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        /* loaded from: classes.dex */
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.j f12026k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ t4.p f12027l;

            @h4.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            /* loaded from: classes.dex */
            public static final class a extends h4.d {

                /* renamed from: n  reason: collision with root package name */
                public /* synthetic */ Object f12028n;

                /* renamed from: o  reason: collision with root package name */
                public int f12029o;

                /* renamed from: q  reason: collision with root package name */
                public Object f12031q;

                public a(e4.d dVar) {
                    super(dVar);
                }

                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    this.f12028n = obj;
                    this.f12029o |= Integer.MIN_VALUE;
                    return b.this.f(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, t4.p pVar) {
                this.f12026k = jVar;
                this.f12027l = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @n6.e
            public final Object a(Object obj, @n6.d e4.d dVar) {
                u4.i0.e(4);
                new a(dVar);
                u4.i0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f12026k;
                Object J = this.f12027l.J(obj, dVar);
                u4.i0.e(0);
                jVar.f(J, dVar);
                u4.i0.e(1);
                return m2.f17815a;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
            @Override // kotlinx.coroutines.flow.j
            @n6.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object f(T r7, @n6.d e4.d<? super v3.m2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.e.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$e$b$a r0 = (kotlinx.coroutines.flow.a0.e.b.a) r0
                    int r1 = r0.f12029o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12029o = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$e$b$a r0 = new kotlinx.coroutines.flow.a0$e$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f12028n
                    java.lang.Object r1 = g4.d.h()
                    int r2 = r0.f12029o
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    v3.e1.n(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f12031q
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    v3.e1.n(r8)
                    goto L51
                L3c:
                    v3.e1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f12026k
                    t4.p r2 = r6.f12027l
                    r0.f12031q = r8
                    r0.f12029o = r4
                    java.lang.Object r7 = r2.J(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f12031q = r2
                    r0.f12029o = r3
                    java.lang.Object r7 = r7.f(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    v3.m2 r7 = v3.m2.f17815a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.e.b.f(java.lang.Object, e4.d):java.lang.Object");
            }
        }

        public e(kotlinx.coroutines.flow.i iVar, t4.p pVar) {
            this.f12021k = iVar;
            this.f12022l = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            Object a7 = this.f12021k.a(new b(jVar, this.f12022l), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }

        @n6.e
        public Object d(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            u4.i0.e(4);
            new a(dVar);
            u4.i0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f12021k;
            b bVar = new b(jVar, this.f12022l);
            u4.i0.e(0);
            iVar.a(bVar, dVar);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes.dex */
    public static final class f<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f12032k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.p f12033l;

        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12034n;

            /* renamed from: o  reason: collision with root package name */
            public int f12035o;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12034n = obj;
                this.f12035o |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        /* loaded from: classes.dex */
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.j f12037k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ t4.p f12038l;

            @h4.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0}, l = {223, 224}, m = "emit", n = {"$this$mapNotNull_u24lambda_u2d5"}, s = {"L$0"})
            /* loaded from: classes.dex */
            public static final class a extends h4.d {

                /* renamed from: n  reason: collision with root package name */
                public /* synthetic */ Object f12039n;

                /* renamed from: o  reason: collision with root package name */
                public int f12040o;

                /* renamed from: q  reason: collision with root package name */
                public Object f12042q;

                public a(e4.d dVar) {
                    super(dVar);
                }

                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    this.f12039n = obj;
                    this.f12040o |= Integer.MIN_VALUE;
                    return b.this.f(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, t4.p pVar) {
                this.f12037k = jVar;
                this.f12038l = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @n6.e
            public final Object a(Object obj, @n6.d e4.d dVar) {
                u4.i0.e(4);
                new a(dVar);
                u4.i0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f12037k;
                Object J = this.f12038l.J(obj, dVar);
                if (J != null) {
                    u4.i0.e(0);
                    jVar.f(J, dVar);
                    u4.i0.e(1);
                }
                return m2.f17815a;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
            @Override // kotlinx.coroutines.flow.j
            @n6.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object f(T r7, @n6.d e4.d<? super v3.m2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.f.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$f$b$a r0 = (kotlinx.coroutines.flow.a0.f.b.a) r0
                    int r1 = r0.f12040o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12040o = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$f$b$a r0 = new kotlinx.coroutines.flow.a0$f$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f12039n
                    java.lang.Object r1 = g4.d.h()
                    int r2 = r0.f12040o
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    v3.e1.n(r8)
                    goto L60
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f12042q
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    v3.e1.n(r8)
                    goto L51
                L3c:
                    v3.e1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f12037k
                    t4.p r2 = r6.f12038l
                    r0.f12042q = r8
                    r0.f12040o = r4
                    java.lang.Object r7 = r2.J(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    if (r8 != 0) goto L54
                    goto L60
                L54:
                    r2 = 0
                    r0.f12042q = r2
                    r0.f12040o = r3
                    java.lang.Object r7 = r7.f(r8, r0)
                    if (r7 != r1) goto L60
                    return r1
                L60:
                    v3.m2 r7 = v3.m2.f17815a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.f.b.f(java.lang.Object, e4.d):java.lang.Object");
            }
        }

        public f(kotlinx.coroutines.flow.i iVar, t4.p pVar) {
            this.f12032k = iVar;
            this.f12033l = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            Object a7 = this.f12032k.a(new b(jVar, this.f12033l), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }

        @n6.e
        public Object d(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            u4.i0.e(4);
            new a(dVar);
            u4.i0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f12032k;
            b bVar = new b(jVar, this.f12033l);
            u4.i0.e(0);
            iVar.a(bVar, dVar);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class g<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f12043k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.p f12044l;

        /* loaded from: classes.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.j f12045k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ t4.p f12046l;

            @h4.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 224}, m = "emit", n = {"value", "$this$onEach_u24lambda_u2d7"}, s = {"L$0", "L$1"})
            /* renamed from: kotlinx.coroutines.flow.a0$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0151a extends h4.d {

                /* renamed from: n  reason: collision with root package name */
                public /* synthetic */ Object f12047n;

                /* renamed from: o  reason: collision with root package name */
                public int f12048o;

                /* renamed from: q  reason: collision with root package name */
                public Object f12050q;

                /* renamed from: r  reason: collision with root package name */
                public Object f12051r;

                public C0151a(e4.d dVar) {
                    super(dVar);
                }

                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    this.f12047n = obj;
                    this.f12048o |= Integer.MIN_VALUE;
                    return a.this.f(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, t4.p pVar) {
                this.f12045k = jVar;
                this.f12046l = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
            @Override // kotlinx.coroutines.flow.j
            @n6.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object f(T r6, @n6.d e4.d<? super v3.m2> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.a0.g.a.C0151a
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.a0$g$a$a r0 = (kotlinx.coroutines.flow.a0.g.a.C0151a) r0
                    int r1 = r0.f12048o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12048o = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$g$a$a r0 = new kotlinx.coroutines.flow.a0$g$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f12047n
                    java.lang.Object r1 = g4.d.h()
                    int r2 = r0.f12048o
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    v3.e1.n(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f12051r
                    kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                    java.lang.Object r2 = r0.f12050q
                    v3.e1.n(r7)
                    goto L5c
                L3e:
                    v3.e1.n(r7)
                    kotlinx.coroutines.flow.j r7 = r5.f12045k
                    t4.p r2 = r5.f12046l
                    r0.f12050q = r6
                    r0.f12051r = r7
                    r0.f12048o = r4
                    r4 = 6
                    u4.i0.e(r4)
                    java.lang.Object r2 = r2.J(r6, r0)
                    r4 = 7
                    u4.i0.e(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f12050q = r7
                    r0.f12051r = r7
                    r0.f12048o = r3
                    java.lang.Object r6 = r6.f(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    v3.m2 r6 = v3.m2.f17815a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.g.a.f(java.lang.Object, e4.d):java.lang.Object");
            }
        }

        public g(kotlinx.coroutines.flow.i iVar, t4.p pVar) {
            this.f12043k = iVar;
            this.f12044l = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            Object a7 = this.f12043k.a(new a(jVar, this.f12044l), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes.dex */
    public static final class h<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Object f12052k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f12053l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ t4.q f12054m;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {114, 115}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u2d8", "accumulator"}, s = {"L$0", "L$1", "L$2"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12055n;

            /* renamed from: o  reason: collision with root package name */
            public int f12056o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12058q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12059r;

            /* renamed from: s  reason: collision with root package name */
            public Object f12060s;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12055n = obj;
                this.f12056o |= Integer.MIN_VALUE;
                return h.this.a(null, this);
            }
        }

        public h(Object obj, kotlinx.coroutines.flow.i iVar, t4.q qVar) {
            this.f12052k = obj;
            this.f12053l = iVar;
            this.f12054m = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[RETURN] */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super R> r7, @n6.d e4.d<? super v3.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.h.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.a0$h$a r0 = (kotlinx.coroutines.flow.a0.h.a) r0
                int r1 = r0.f12056o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12056o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$h$a r0 = new kotlinx.coroutines.flow.a0$h$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f12055n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12056o
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L44
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                v3.e1.n(r8)
                goto L7b
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f12060s
                u4.k1$h r7 = (u4.k1.h) r7
                java.lang.Object r2 = r0.f12059r
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r4 = r0.f12058q
                kotlinx.coroutines.flow.a0$h r4 = (kotlinx.coroutines.flow.a0.h) r4
                v3.e1.n(r8)
                goto L62
            L44:
                v3.e1.n(r8)
                u4.k1$h r8 = new u4.k1$h
                r8.<init>()
                java.lang.Object r2 = r6.f12052k
                r8.f17436k = r2
                r0.f12058q = r6
                r0.f12059r = r7
                r0.f12060s = r8
                r0.f12056o = r4
                java.lang.Object r2 = r7.f(r2, r0)
                if (r2 != r1) goto L5f
                return r1
            L5f:
                r4 = r6
                r2 = r7
                r7 = r8
            L62:
                kotlinx.coroutines.flow.i r8 = r4.f12053l
                kotlinx.coroutines.flow.a0$i r5 = new kotlinx.coroutines.flow.a0$i
                t4.q r4 = r4.f12054m
                r5.<init>(r7, r4, r2)
                r7 = 0
                r0.f12058q = r7
                r0.f12059r = r7
                r0.f12060s = r7
                r0.f12056o = r3
                java.lang.Object r7 = r8.a(r5, r0)
                if (r7 != r1) goto L7b
                return r1
            L7b:
                v3.m2 r7 = v3.m2.f17815a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.h.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class i<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.h<R> f12061k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.q<R, T, e4.d<? super R>, Object> f12062l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<R> f12063m;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {103, w0.m0.f18130k}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public Object f12064n;

            /* renamed from: o  reason: collision with root package name */
            public Object f12065o;

            /* renamed from: p  reason: collision with root package name */
            public /* synthetic */ Object f12066p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ i<T> f12067q;

            /* renamed from: r  reason: collision with root package name */
            public int f12068r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super T> iVar, e4.d<? super a> dVar) {
                super(dVar);
                this.f12067q = iVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12066p = obj;
                this.f12068r |= Integer.MIN_VALUE;
                return this.f12067q.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(k1.h<R> hVar, t4.q<? super R, ? super T, ? super e4.d<? super R>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super R> jVar) {
            this.f12061k = hVar;
            this.f12062l = qVar;
            this.f12063m = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r8, @n6.d e4.d<? super v3.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.a0.i.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.a0$i$a r0 = (kotlinx.coroutines.flow.a0.i.a) r0
                int r1 = r0.f12068r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12068r = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$i$a r0 = new kotlinx.coroutines.flow.a0$i$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f12066p
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12068r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                v3.e1.n(r9)
                goto L70
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.f12065o
                u4.k1$h r8 = (u4.k1.h) r8
                java.lang.Object r2 = r0.f12064n
                kotlinx.coroutines.flow.a0$i r2 = (kotlinx.coroutines.flow.a0.i) r2
                v3.e1.n(r9)
                goto L5a
            L40:
                v3.e1.n(r9)
                u4.k1$h<R> r9 = r7.f12061k
                t4.q<R, T, e4.d<? super R>, java.lang.Object> r2 = r7.f12062l
                T r5 = r9.f17436k
                r0.f12064n = r7
                r0.f12065o = r9
                r0.f12068r = r4
                java.lang.Object r8 = r2.I(r5, r8, r0)
                if (r8 != r1) goto L56
                return r1
            L56:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L5a:
                r8.f17436k = r9
                kotlinx.coroutines.flow.j<R> r8 = r2.f12063m
                u4.k1$h<R> r9 = r2.f12061k
                T r9 = r9.f17436k
                r2 = 0
                r0.f12064n = r2
                r0.f12065o = r2
                r0.f12068r = r3
                java.lang.Object r8 = r8.f(r9, r0)
                if (r8 != r1) goto L70
                return r1
            L70:
                v3.m2 r8 = v3.m2.f17815a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.i.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class j<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f12069k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.q f12070l;

        public j(kotlinx.coroutines.flow.i iVar, t4.q qVar) {
            this.f12069k = iVar;
            this.f12070l = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
            k1.h hVar = new k1.h();
            hVar.f17436k = (T) p5.u.f14964a;
            Object a7 = this.f12069k.a(new k(hVar, this.f12070l, jVar), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.h<Object> f12071k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.q<T, T, e4.d<? super T>, Object> f12072l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<T> f12073m;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {125, 127}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public Object f12074n;

            /* renamed from: o  reason: collision with root package name */
            public Object f12075o;

            /* renamed from: p  reason: collision with root package name */
            public /* synthetic */ Object f12076p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ k<T> f12077q;

            /* renamed from: r  reason: collision with root package name */
            public int f12078r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(k<? super T> kVar, e4.d<? super a> dVar) {
                super(dVar);
                this.f12077q = kVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12076p = obj;
                this.f12078r |= Integer.MIN_VALUE;
                return this.f12077q.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public k(k1.h<Object> hVar, t4.q<? super T, ? super T, ? super e4.d<? super T>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super T> jVar) {
            this.f12071k = hVar;
            this.f12072l = qVar;
            this.f12073m = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[RETURN] */
        /* JADX WARN: Type inference failed for: r9v7 */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r8, @n6.d e4.d<? super v3.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.a0.k.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.a0$k$a r0 = (kotlinx.coroutines.flow.a0.k.a) r0
                int r1 = r0.f12078r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12078r = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$k$a r0 = new kotlinx.coroutines.flow.a0$k$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f12076p
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12078r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                v3.e1.n(r9)
                goto L79
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.f12075o
                u4.k1$h r8 = (u4.k1.h) r8
                java.lang.Object r2 = r0.f12074n
                kotlinx.coroutines.flow.a0$k r2 = (kotlinx.coroutines.flow.a0.k) r2
                v3.e1.n(r9)
                goto L60
            L40:
                v3.e1.n(r9)
                u4.k1$h<java.lang.Object> r9 = r7.f12071k
                T r2 = r9.f17436k
                kotlinx.coroutines.internal.r0 r5 = p5.u.f14964a
                if (r2 != r5) goto L4d
                r2 = r7
                goto L63
            L4d:
                t4.q<T, T, e4.d<? super T>, java.lang.Object> r5 = r7.f12072l
                r0.f12074n = r7
                r0.f12075o = r9
                r0.f12078r = r4
                java.lang.Object r8 = r5.I(r2, r8, r0)
                if (r8 != r1) goto L5c
                return r1
            L5c:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L60:
                r6 = r9
                r9 = r8
                r8 = r6
            L63:
                r9.f17436k = r8
                kotlinx.coroutines.flow.j<T> r8 = r2.f12073m
                u4.k1$h<java.lang.Object> r9 = r2.f12071k
                T r9 = r9.f17436k
                r2 = 0
                r0.f12074n = r2
                r0.f12075o = r2
                r0.f12078r = r3
                java.lang.Object r8 = r8.f(r9, r0)
                if (r8 != r1) goto L79
                return r1
            L79:
                v3.m2 r8 = v3.m2.f17815a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.k.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class l<T> implements kotlinx.coroutines.flow.i<x3.p0<? extends T>> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f12079k;

        public l(kotlinx.coroutines.flow.i iVar) {
            this.f12079k = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j<? super x3.p0<? extends T>> jVar, @n6.d e4.d<? super m2> dVar) {
            Object a7 = this.f12079k.a(new m(jVar, new k1.f()), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<x3.p0<? extends T>> f12080k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ k1.f f12081l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {65}, m = "emit", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12082n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ m<T> f12083o;

            /* renamed from: p  reason: collision with root package name */
            public int f12084p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(m<? super T> mVar, e4.d<? super a> dVar) {
                super(dVar);
                this.f12083o = mVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12082n = obj;
                this.f12084p |= Integer.MIN_VALUE;
                return this.f12083o.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public m(kotlinx.coroutines.flow.j<? super x3.p0<? extends T>> jVar, k1.f fVar) {
            this.f12080k = jVar;
            this.f12081l = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r8, @n6.d e4.d<? super v3.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.a0.m.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.a0$m$a r0 = (kotlinx.coroutines.flow.a0.m.a) r0
                int r1 = r0.f12084p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12084p = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$m$a r0 = new kotlinx.coroutines.flow.a0$m$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f12082n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12084p
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                v3.e1.n(r9)
                goto L4e
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                v3.e1.n(r9)
                kotlinx.coroutines.flow.j<x3.p0<? extends T>> r9 = r7.f12080k
                x3.p0 r2 = new x3.p0
                u4.k1$f r4 = r7.f12081l
                int r5 = r4.f17434k
                int r6 = r5 + 1
                r4.f17434k = r6
                if (r5 < 0) goto L51
                r2.<init>(r5, r8)
                r0.f12084p = r3
                java.lang.Object r8 = r9.f(r2, r0)
                if (r8 != r1) goto L4e
                return r1
            L4e:
                v3.m2 r8 = v3.m2.f17815a
                return r8
            L51:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "Index overflow has happened"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.m.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> a(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
        return new a(iVar, pVar);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <R> kotlinx.coroutines.flow.i<R> b(kotlinx.coroutines.flow.i<?> r1) {
        /*
            u4.l0.w()
            kotlinx.coroutines.flow.a0$b r0 = new kotlinx.coroutines.flow.a0$b
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.b(kotlinx.coroutines.flow.i):kotlinx.coroutines.flow.i");
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> c(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
        return new c(iVar, pVar);
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> d(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar) {
        return new d(iVar);
    }

    @n6.d
    public static final <T, R> kotlinx.coroutines.flow.i<R> e(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super R>, ? extends Object> pVar) {
        return new e(iVar, pVar);
    }

    @n6.d
    public static final <T, R> kotlinx.coroutines.flow.i<R> f(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super R>, ? extends Object> pVar) {
        return new f(iVar, pVar);
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> g(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return new g(iVar, pVar);
    }

    @n6.d
    public static final <T, R> kotlinx.coroutines.flow.i<R> h(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, R r6, @v3.b @n6.d t4.q<? super R, ? super T, ? super e4.d<? super R>, ? extends Object> qVar) {
        return new h(r6, iVar, qVar);
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> i(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, @n6.d t4.q<? super T, ? super T, ? super e4.d<? super T>, ? extends Object> qVar) {
        return new j(iVar, qVar);
    }

    @n6.d
    public static final <T, R> kotlinx.coroutines.flow.i<R> j(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, R r6, @v3.b @n6.d t4.q<? super R, ? super T, ? super e4.d<? super R>, ? extends Object> qVar) {
        return kotlinx.coroutines.flow.k.y1(iVar, r6, qVar);
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<x3.p0<T>> k(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar) {
        return new l(iVar);
    }
}
