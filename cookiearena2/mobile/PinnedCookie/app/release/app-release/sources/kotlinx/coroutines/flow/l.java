package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlinx.coroutines.d2;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class l {

    /* loaded from: classes.dex */
    public static final class a implements kotlinx.coroutines.flow.i<Long> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ d5.o f12258k;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d19"}, s = {"L$0"})
        /* renamed from: kotlinx.coroutines.flow.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0155a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12259n;

            /* renamed from: o  reason: collision with root package name */
            public int f12260o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12262q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12263r;

            public C0155a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12259n = obj;
                this.f12260o |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(d5.o oVar) {
            this.f12258k = oVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super java.lang.Long> r8, @n6.d e4.d<? super v3.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.a.C0155a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.l$a$a r0 = (kotlinx.coroutines.flow.l.a.C0155a) r0
                int r1 = r0.f12260o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12260o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$a$a r0 = new kotlinx.coroutines.flow.l$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f12259n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12260o
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r8 = r0.f12263r
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r2 = r0.f12262q
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                v3.e1.n(r9)
                r9 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3a:
                v3.e1.n(r9)
                d5.o r9 = r7.f12258k
                java.util.Iterator r9 = r9.iterator()
                r6 = r9
                r9 = r8
                r8 = r6
            L46:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L64
                r2 = r8
                x3.t0 r2 = (x3.t0) r2
                long r4 = r2.b()
                java.lang.Long r2 = h4.b.g(r4)
                r0.f12262q = r9
                r0.f12263r = r8
                r0.f12260o = r3
                java.lang.Object r2 = r9.f(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L64:
                v3.m2 r8 = v3.m2.f17815a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.a.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.a f12264k;

        public b(t4.a aVar) {
            this.f12264k = aVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
            Object f7 = jVar.f((Object) this.f12264k.n(), dVar);
            return f7 == g4.d.h() ? f7 : m2.f17815a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class c<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.l f12265k;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", f = "Builders.kt", i = {}, l = {113, 113}, m = "collect", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12266n;

            /* renamed from: o  reason: collision with root package name */
            public int f12267o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12269q;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12266n = obj;
                this.f12267o |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(t4.l lVar) {
            this.f12265k = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[RETURN] */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r6, @n6.d e4.d<? super v3.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.c.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$c$a r0 = (kotlinx.coroutines.flow.l.c.a) r0
                int r1 = r0.f12267o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12267o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$c$a r0 = new kotlinx.coroutines.flow.l$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f12266n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12267o
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                v3.e1.n(r7)
                goto L60
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f12269q
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                v3.e1.n(r7)
                goto L54
            L3c:
                v3.e1.n(r7)
                t4.l r7 = r5.f12265k
                r0.f12269q = r6
                r0.f12267o = r4
                r2 = 6
                u4.i0.e(r2)
                java.lang.Object r7 = r7.O(r0)
                r2 = 7
                u4.i0.e(r2)
                if (r7 != r1) goto L54
                return r1
            L54:
                r2 = 0
                r0.f12269q = r2
                r0.f12267o = r3
                java.lang.Object r6 = r6.f(r7, r0)
                if (r6 != r1) goto L60
                return r1
            L60:
                v3.m2 r6 = v3.m2.f17815a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.c.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class d<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Iterable f12270k;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d3"}, s = {"L$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12271n;

            /* renamed from: o  reason: collision with root package name */
            public int f12272o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12274q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12275r;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12271n = obj;
                this.f12272o |= Integer.MIN_VALUE;
                return d.this.a(null, this);
            }
        }

        public d(Iterable iterable) {
            this.f12270k = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r6, @n6.d e4.d<? super v3.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.d.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$d$a r0 = (kotlinx.coroutines.flow.l.d.a) r0
                int r1 = r0.f12272o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12272o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$d$a r0 = new kotlinx.coroutines.flow.l$d$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f12271n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12272o
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f12275r
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f12274q
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                v3.e1.n(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                v3.e1.n(r7)
                java.lang.Iterable r7 = r5.f12270k
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r6.next()
                r0.f12274q = r7
                r0.f12275r = r6
                r0.f12272o = r3
                java.lang.Object r2 = r7.f(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L5d:
                v3.m2 r6 = v3.m2.f17815a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.d.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class e<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Iterator f12276k;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d5"}, s = {"L$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12277n;

            /* renamed from: o  reason: collision with root package name */
            public int f12278o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12280q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12281r;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12277n = obj;
                this.f12278o |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        public e(Iterator it) {
            this.f12276k = it;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r6, @n6.d e4.d<? super v3.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.e.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$e$a r0 = (kotlinx.coroutines.flow.l.e.a) r0
                int r1 = r0.f12278o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12278o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$e$a r0 = new kotlinx.coroutines.flow.l$e$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f12277n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12278o
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f12281r
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f12280q
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                v3.e1.n(r7)
                r7 = r2
                goto L42
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                v3.e1.n(r7)
                java.util.Iterator r7 = r5.f12276k
                r4 = r7
                r7 = r6
                r6 = r4
            L42:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L59
                java.lang.Object r2 = r6.next()
                r0.f12280q = r7
                r0.f12281r = r6
                r0.f12278o = r3
                java.lang.Object r2 = r7.f(r2, r0)
                if (r2 != r1) goto L42
                return r1
            L59:
                v3.m2 r6 = v3.m2.f17815a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.e.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class f<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ f5.m f12282k;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d7"}, s = {"L$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12283n;

            /* renamed from: o  reason: collision with root package name */
            public int f12284o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12286q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12287r;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12283n = obj;
                this.f12284o |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        public f(f5.m mVar) {
            this.f12282k = mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r6, @n6.d e4.d<? super v3.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.f.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$f$a r0 = (kotlinx.coroutines.flow.l.f.a) r0
                int r1 = r0.f12284o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12284o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$f$a r0 = new kotlinx.coroutines.flow.l$f$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f12283n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12284o
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f12287r
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f12286q
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                v3.e1.n(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                v3.e1.n(r7)
                f5.m r7 = r5.f12282k
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r6.next()
                r0.f12286q = r7
                r0.f12287r = r6
                r0.f12284o = r3
                java.lang.Object r2 = r7.f(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L5d:
                v3.m2 r6 = v3.m2.f17815a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.f.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class g<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Object[] f12288k;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d11", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12289n;

            /* renamed from: o  reason: collision with root package name */
            public int f12290o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12292q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12293r;

            /* renamed from: s  reason: collision with root package name */
            public int f12294s;

            /* renamed from: t  reason: collision with root package name */
            public int f12295t;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12289n = obj;
                this.f12290o |= Integer.MIN_VALUE;
                return g.this.a(null, this);
            }
        }

        public g(Object[] objArr) {
            this.f12288k = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005c -> B:19:0x005f). Please submit an issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r8, @n6.d e4.d<? super v3.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.g.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.l$g$a r0 = (kotlinx.coroutines.flow.l.g.a) r0
                int r1 = r0.f12290o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12290o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$g$a r0 = new kotlinx.coroutines.flow.l$g$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f12289n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12290o
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.f12295t
                int r2 = r0.f12294s
                java.lang.Object r4 = r0.f12293r
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                java.lang.Object r5 = r0.f12292q
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                v3.e1.n(r9)
                r9 = r5
                goto L5f
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                v3.e1.n(r9)
                java.lang.Object[] r9 = r7.f12288k
                int r2 = r9.length
                r4 = 0
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r4
                r4 = r6
            L4a:
                if (r2 >= r8) goto L61
                r5 = r4[r2]
                r0.f12292q = r9
                r0.f12293r = r4
                r0.f12294s = r2
                r0.f12295t = r8
                r0.f12290o = r3
                java.lang.Object r5 = r9.f(r5, r0)
                if (r5 != r1) goto L5f
                return r1
            L5f:
                int r2 = r2 + r3
                goto L4a
            L61:
                v3.m2 r8 = v3.m2.f17815a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.g.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements kotlinx.coroutines.flow.i<Integer> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int[] f12296k;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d13", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12297n;

            /* renamed from: o  reason: collision with root package name */
            public int f12298o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12300q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12301r;

            /* renamed from: s  reason: collision with root package name */
            public int f12302s;

            /* renamed from: t  reason: collision with root package name */
            public int f12303t;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12297n = obj;
                this.f12298o |= Integer.MIN_VALUE;
                return h.this.a(null, this);
            }
        }

        public h(int[] iArr) {
            this.f12296k = iArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please submit an issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super java.lang.Integer> r8, @n6.d e4.d<? super v3.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.h.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.l$h$a r0 = (kotlinx.coroutines.flow.l.h.a) r0
                int r1 = r0.f12298o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12298o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$h$a r0 = new kotlinx.coroutines.flow.l$h$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f12297n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12298o
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.f12303t
                int r2 = r0.f12302s
                java.lang.Object r4 = r0.f12301r
                int[] r4 = (int[]) r4
                java.lang.Object r5 = r0.f12300q
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                v3.e1.n(r9)
                r9 = r5
                goto L63
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                v3.e1.n(r9)
                int[] r9 = r7.f12296k
                int r2 = r9.length
                r4 = 0
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r4
                r4 = r6
            L4a:
                if (r2 >= r8) goto L65
                r5 = r4[r2]
                java.lang.Integer r5 = h4.b.f(r5)
                r0.f12300q = r9
                r0.f12301r = r4
                r0.f12302s = r2
                r0.f12303t = r8
                r0.f12298o = r3
                java.lang.Object r5 = r9.f(r5, r0)
                if (r5 != r1) goto L63
                return r1
            L63:
                int r2 = r2 + r3
                goto L4a
            L65:
                v3.m2 r8 = v3.m2.f17815a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.h.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements kotlinx.coroutines.flow.i<Long> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ long[] f12304k;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d15", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12305n;

            /* renamed from: o  reason: collision with root package name */
            public int f12306o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12308q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12309r;

            /* renamed from: s  reason: collision with root package name */
            public int f12310s;

            /* renamed from: t  reason: collision with root package name */
            public int f12311t;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12305n = obj;
                this.f12306o |= Integer.MIN_VALUE;
                return i.this.a(null, this);
            }
        }

        public i(long[] jArr) {
            this.f12304k = jArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please submit an issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super java.lang.Long> r9, @n6.d e4.d<? super v3.m2> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.l.i.a
                if (r0 == 0) goto L13
                r0 = r10
                kotlinx.coroutines.flow.l$i$a r0 = (kotlinx.coroutines.flow.l.i.a) r0
                int r1 = r0.f12306o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12306o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$i$a r0 = new kotlinx.coroutines.flow.l$i$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f12305n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12306o
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r9 = r0.f12311t
                int r2 = r0.f12310s
                java.lang.Object r4 = r0.f12309r
                long[] r4 = (long[]) r4
                java.lang.Object r5 = r0.f12308q
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                v3.e1.n(r10)
                r10 = r5
                goto L63
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                v3.e1.n(r10)
                long[] r10 = r8.f12304k
                int r2 = r10.length
                r4 = 0
                r7 = r10
                r10 = r9
                r9 = r2
                r2 = r4
                r4 = r7
            L4a:
                if (r2 >= r9) goto L65
                r5 = r4[r2]
                java.lang.Long r5 = h4.b.g(r5)
                r0.f12308q = r10
                r0.f12309r = r4
                r0.f12310s = r2
                r0.f12311t = r9
                r0.f12306o = r3
                java.lang.Object r5 = r10.f(r5, r0)
                if (r5 != r1) goto L63
                return r1
            L63:
                int r2 = r2 + r3
                goto L4a
            L65:
                v3.m2 r9 = v3.m2.f17815a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.i.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements kotlinx.coroutines.flow.i<Integer> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ d5.l f12312k;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d17"}, s = {"L$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12313n;

            /* renamed from: o  reason: collision with root package name */
            public int f12314o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12316q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12317r;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12313n = obj;
                this.f12314o |= Integer.MIN_VALUE;
                return j.this.a(null, this);
            }
        }

        public j(d5.l lVar) {
            this.f12312k = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super java.lang.Integer> r6, @n6.d e4.d<? super v3.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.j.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$j$a r0 = (kotlinx.coroutines.flow.l.j.a) r0
                int r1 = r0.f12314o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12314o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$j$a r0 = new kotlinx.coroutines.flow.l$j$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f12313n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12314o
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f12317r
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f12316q
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                v3.e1.n(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                v3.e1.n(r7)
                d5.l r7 = r5.f12312k
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L64
                r2 = r6
                x3.s0 r2 = (x3.s0) r2
                int r2 = r2.b()
                java.lang.Integer r2 = h4.b.f(r2)
                r0.f12316q = r7
                r0.f12317r = r6
                r0.f12314o = r3
                java.lang.Object r2 = r7.f(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L64:
                v3.m2 r6 = v3.m2.f17815a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.j.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class k<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Object[] f12318k;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {114}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u2d8"}, s = {"L$0", "L$1"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12319n;

            /* renamed from: o  reason: collision with root package name */
            public int f12320o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12322q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12323r;

            /* renamed from: s  reason: collision with root package name */
            public int f12324s;

            /* renamed from: t  reason: collision with root package name */
            public int f12325t;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12319n = obj;
                this.f12320o |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        public k(Object[] objArr) {
            this.f12318k = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please submit an issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r8, @n6.d e4.d<? super v3.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.k.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.l$k$a r0 = (kotlinx.coroutines.flow.l.k.a) r0
                int r1 = r0.f12320o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12320o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$k$a r0 = new kotlinx.coroutines.flow.l$k$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f12319n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12320o
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.f12325t
                int r2 = r0.f12324s
                java.lang.Object r4 = r0.f12323r
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                java.lang.Object r5 = r0.f12322q
                kotlinx.coroutines.flow.l$k r5 = (kotlinx.coroutines.flow.l.k) r5
                v3.e1.n(r9)
                r9 = r4
                goto L60
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                v3.e1.n(r9)
                java.lang.Object[] r9 = r7.f12318k
                int r9 = r9.length
                r2 = 0
                r5 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L49:
                if (r2 >= r8) goto L62
                java.lang.Object[] r4 = r5.f12318k
                r4 = r4[r2]
                r0.f12322q = r5
                r0.f12323r = r9
                r0.f12324s = r2
                r0.f12325t = r8
                r0.f12320o = r3
                java.lang.Object r4 = r9.f(r4, r0)
                if (r4 != r1) goto L60
                return r1
            L60:
                int r2 = r2 + r3
                goto L49
            L62:
                v3.m2 r8 = v3.m2.f17815a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.k.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: kotlinx.coroutines.flow.l$l  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0156l<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Object f12326k;

        public C0156l(Object obj) {
            this.f12326k = obj;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
            Object f7 = jVar.f((Object) this.f12326k, dVar);
            return f7 == g4.d.h() ? f7 : m2.f17815a;
        }
    }

    @n6.d
    public static final kotlinx.coroutines.flow.i<Integer> a(@n6.d d5.l lVar) {
        return new j(lVar);
    }

    @n6.d
    public static final kotlinx.coroutines.flow.i<Long> b(@n6.d d5.o oVar) {
        return new a(oVar);
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> c(@n6.d f5.m<? extends T> mVar) {
        return new f(mVar);
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> d(@n6.d Iterable<? extends T> iterable) {
        return new d(iterable);
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> e(@n6.d Iterator<? extends T> it) {
        return new e(it);
    }

    @d2
    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> f(@n6.d t4.a<? extends T> aVar) {
        return new b(aVar);
    }

    @d2
    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> g(@n6.d t4.l<? super e4.d<? super T>, ? extends Object> lVar) {
        return new c(lVar);
    }

    @n6.d
    public static final kotlinx.coroutines.flow.i<Integer> h(@n6.d int[] iArr) {
        return new h(iArr);
    }

    @n6.d
    public static final kotlinx.coroutines.flow.i<Long> i(@n6.d long[] jArr) {
        return new i(jArr);
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> j(@n6.d T[] tArr) {
        return new g(tArr);
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> k(@v3.b @n6.d t4.p<? super n5.g0<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return new kotlinx.coroutines.flow.b(pVar, null, 0, null, 14, null);
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> l(@v3.b @n6.d t4.p<? super n5.g0<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return new kotlinx.coroutines.flow.f(pVar, null, 0, null, 14, null);
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> m() {
        return kotlinx.coroutines.flow.h.f12234k;
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> n(@v3.b @n6.d t4.p<? super kotlinx.coroutines.flow.j<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return new h0(pVar);
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> o(T t6) {
        return new C0156l(t6);
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> p(@n6.d T... tArr) {
        return new k(tArr);
    }
}
