package kotlinx.coroutines.flow;

import kotlinx.coroutines.n2;
import u4.k1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class u {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class a<T> implements i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ i f12494k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.q f12495l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {113, 114}, m = "collect", n = {"this", "$this$catch_u24lambda_u2d0"}, s = {"L$0", "L$1"})
        /* renamed from: kotlinx.coroutines.flow.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0164a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12496n;

            /* renamed from: o  reason: collision with root package name */
            public int f12497o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12499q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12500r;

            public C0164a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12496n = obj;
                this.f12497o |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(i iVar, t4.q qVar) {
            this.f12494k = iVar;
            this.f12495l = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r6, @n6.d e4.d<? super v3.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.u.a.C0164a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.u$a$a r0 = (kotlinx.coroutines.flow.u.a.C0164a) r0
                int r1 = r0.f12497o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12497o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.u$a$a r0 = new kotlinx.coroutines.flow.u$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f12496n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12497o
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                v3.e1.n(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f12500r
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                java.lang.Object r2 = r0.f12499q
                kotlinx.coroutines.flow.u$a r2 = (kotlinx.coroutines.flow.u.a) r2
                v3.e1.n(r7)
                goto L53
            L40:
                v3.e1.n(r7)
                kotlinx.coroutines.flow.i r7 = r5.f12494k
                r0.f12499q = r5
                r0.f12500r = r6
                r0.f12497o = r4
                java.lang.Object r7 = kotlinx.coroutines.flow.k.v(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                t4.q r2 = r2.f12495l
                r4 = 0
                r0.f12499q = r4
                r0.f12500r = r4
                r0.f12497o = r3
                r3 = 6
                u4.i0.e(r3)
                java.lang.Object r6 = r2.I(r6, r7, r0)
                r7 = 7
                u4.i0.e(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                v3.m2 r6 = v3.m2.f17815a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.a.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {156}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class b<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12501n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f12502o;

        /* renamed from: p  reason: collision with root package name */
        public int f12503p;

        public b(e4.d<? super b> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12502o = obj;
            this.f12503p |= Integer.MIN_VALUE;
            return k.v(null, null, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ j<T> f12504k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ k1.h<Throwable> f12505l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {158}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public Object f12506n;

            /* renamed from: o  reason: collision with root package name */
            public /* synthetic */ Object f12507o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ c<T> f12508p;

            /* renamed from: q  reason: collision with root package name */
            public int f12509q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c<? super T> cVar, e4.d<? super a> dVar) {
                super(dVar);
                this.f12508p = cVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12507o = obj;
                this.f12509q |= Integer.MIN_VALUE;
                return this.f12508p.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(j<? super T> jVar, k1.h<Throwable> hVar) {
            this.f12504k = jVar;
            this.f12505l = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r5, @n6.d e4.d<? super v3.m2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.u.c.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.u$c$a r0 = (kotlinx.coroutines.flow.u.c.a) r0
                int r1 = r0.f12509q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12509q = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.u$c$a r0 = new kotlinx.coroutines.flow.u$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f12507o
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12509q
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f12506n
                kotlinx.coroutines.flow.u$c r5 = (kotlinx.coroutines.flow.u.c) r5
                v3.e1.n(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                v3.e1.n(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f12504k     // Catch: java.lang.Throwable -> L4a
                r0.f12506n = r4     // Catch: java.lang.Throwable -> L4a
                r0.f12509q = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.f(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                v3.m2 r5 = v3.m2.f17815a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                u4.k1$h<java.lang.Throwable> r5 = r5.f12505l
                r5.f17436k = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.c.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class d extends h4.o implements t4.p<Throwable, e4.d<? super Boolean>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f12510o;

        public d(e4.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            return new d(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            g4.d.h();
            if (this.f12510o == 0) {
                e1.n(obj);
                return h4.b.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d Throwable th, @n6.e e4.d<? super Boolean> dVar) {
            return ((d) H(th, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {androidx.constraintlayout.widget.e.O1}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class e<T> extends h4.o implements t4.r<j<? super T>, Throwable, Long, e4.d<? super Boolean>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f12511o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f12512p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ long f12513q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ long f12514r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ t4.p<Throwable, e4.d<? super Boolean>, Object> f12515s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(long j7, t4.p<? super Throwable, ? super e4.d<? super Boolean>, ? extends Object> pVar, e4.d<? super e> dVar) {
            super(4, dVar);
            this.f12514r = j7;
            this.f12515s = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
            if (((java.lang.Boolean) r8).booleanValue() != false) goto L17;
         */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r7.f12511o
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                v3.e1.n(r8)
                goto L31
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                v3.e1.n(r8)
                java.lang.Object r8 = r7.f12512p
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                long r3 = r7.f12513q
                long r5 = r7.f12514r
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L3a
                t4.p<java.lang.Throwable, e4.d<? super java.lang.Boolean>, java.lang.Object> r1 = r7.f12515s
                r7.f12511o = r2
                java.lang.Object r8 = r1.J(r8, r7)
                if (r8 != r0) goto L31
                return r0
            L31:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L3a
                goto L3b
            L3a:
                r2 = 0
            L3b:
                java.lang.Boolean r8 = h4.b.a(r2)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.e.Q(java.lang.Object):java.lang.Object");
        }

        @n6.e
        public final Object a0(@n6.d j<? super T> jVar, @n6.d Throwable th, long j7, @n6.e e4.d<? super Boolean> dVar) {
            e eVar = new e(this.f12514r, this.f12515s, dVar);
            eVar.f12512p = th;
            eVar.f12513q = j7;
            return eVar.Q(m2.f17815a);
        }

        @Override // t4.r
        public /* bridge */ /* synthetic */ Object l0(Object obj, Throwable th, Long l7, e4.d<? super Boolean> dVar) {
            return a0((j) obj, th, l7.longValue(), dVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class f<T> implements i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ i f12516k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.r f12517l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {117, 119}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u2d2", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u2d2", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12518n;

            /* renamed from: o  reason: collision with root package name */
            public int f12519o;

            /* renamed from: q  reason: collision with root package name */
            public Object f12521q;

            /* renamed from: r  reason: collision with root package name */
            public Object f12522r;

            /* renamed from: s  reason: collision with root package name */
            public Object f12523s;

            /* renamed from: t  reason: collision with root package name */
            public long f12524t;

            /* renamed from: u  reason: collision with root package name */
            public int f12525u;

            public a(e4.d dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12518n = obj;
                this.f12519o |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        public f(i iVar, t4.r rVar) {
            this.f12516k = iVar;
            this.f12517l = rVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:31:0x00a8). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0097 -> B:27:0x009a). Please submit an issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r12, @n6.d e4.d<? super v3.m2> r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof kotlinx.coroutines.flow.u.f.a
                if (r0 == 0) goto L13
                r0 = r13
                kotlinx.coroutines.flow.u$f$a r0 = (kotlinx.coroutines.flow.u.f.a) r0
                int r1 = r0.f12519o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12519o = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.u$f$a r0 = new kotlinx.coroutines.flow.u$f$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.f12518n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12519o
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L52
                if (r2 == r4) goto L42
                if (r2 != r3) goto L3a
                long r5 = r0.f12524t
                java.lang.Object r12 = r0.f12523s
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                java.lang.Object r2 = r0.f12522r
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r7 = r0.f12521q
                kotlinx.coroutines.flow.u$f r7 = (kotlinx.coroutines.flow.u.f) r7
                v3.e1.n(r13)
                goto L9a
            L3a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L42:
                int r12 = r0.f12525u
                long r5 = r0.f12524t
                java.lang.Object r2 = r0.f12522r
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r7 = r0.f12521q
                kotlinx.coroutines.flow.u$f r7 = (kotlinx.coroutines.flow.u.f) r7
                v3.e1.n(r13)
                goto L74
            L52:
                v3.e1.n(r13)
                r5 = 0
                r13 = r11
            L58:
                kotlinx.coroutines.flow.i r2 = r13.f12516k
                r0.f12521q = r13
                r0.f12522r = r12
                r7 = 0
                r0.f12523s = r7
                r0.f12524t = r5
                r7 = 0
                r0.f12525u = r7
                r0.f12519o = r4
                java.lang.Object r2 = kotlinx.coroutines.flow.k.v(r2, r12, r0)
                if (r2 != r1) goto L6f
                return r1
            L6f:
                r10 = r2
                r2 = r12
                r12 = r7
                r7 = r13
                r13 = r10
            L74:
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                if (r13 == 0) goto La8
                t4.r r12 = r7.f12517l
                java.lang.Long r8 = h4.b.g(r5)
                r0.f12521q = r7
                r0.f12522r = r2
                r0.f12523s = r13
                r0.f12524t = r5
                r0.f12519o = r3
                r9 = 6
                u4.i0.e(r9)
                java.lang.Object r12 = r12.l0(r2, r13, r8, r0)
                r8 = 7
                u4.i0.e(r8)
                if (r12 != r1) goto L97
                return r1
            L97:
                r10 = r13
                r13 = r12
                r12 = r10
            L9a:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto La7
                r12 = 1
                long r5 = r5 + r12
                r12 = r4
                goto La8
            La7:
                throw r12
            La8:
                r13 = r7
                if (r12 != 0) goto Lae
                v3.m2 r12 = v3.m2.f17815a
                return r12
            Lae:
                r12 = r2
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.f.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
        }
    }

    @n6.d
    public static final <T> i<T> a(@n6.d i<? extends T> iVar, @n6.d t4.q<? super j<? super T>, ? super Throwable, ? super e4.d<? super m2>, ? extends Object> qVar) {
        return new a(iVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, @n6.d kotlinx.coroutines.flow.j<? super T> r5, @n6.d e4.d<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.u.b
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.u$b r0 = (kotlinx.coroutines.flow.u.b) r0
            int r1 = r0.f12503p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12503p = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.u$b r0 = new kotlinx.coroutines.flow.u$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12502o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12503p
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f12501n
            u4.k1$h r4 = (u4.k1.h) r4
            v3.e1.n(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            v3.e1.n(r6)
            u4.k1$h r6 = new u4.k1$h
            r6.<init>()
            kotlinx.coroutines.flow.u$c r2 = new kotlinx.coroutines.flow.u$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f12501n = r6     // Catch: java.lang.Throwable -> L51
            r0.f12503p = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.f17436k
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            e4.g r6 = r0.g()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            v3.p.a(r4, r5)
            throw r4
        L72:
            v3.p.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.b(kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
    }

    public static final boolean c(Throwable th, e4.g gVar) {
        n2 n2Var = (n2) gVar.e(n2.f12920c);
        if (n2Var == null || !n2Var.isCancelled()) {
            return false;
        }
        return d(th, n2Var.w0());
    }

    public static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && u4.l0.g(th2, th);
    }

    @n6.d
    public static final <T> i<T> e(@n6.d i<? extends T> iVar, long j7, @n6.d t4.p<? super Throwable, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
        if (j7 > 0) {
            return k.x1(iVar, new e(j7, pVar, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j7).toString());
    }

    public static /* synthetic */ i f(i iVar, long j7, t4.p pVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = Long.MAX_VALUE;
        }
        if ((i7 & 2) != 0) {
            pVar = new d(null);
        }
        return k.v1(iVar, j7, pVar);
    }

    @n6.d
    public static final <T> i<T> g(@n6.d i<? extends T> iVar, @n6.d t4.r<? super j<? super T>, ? super Throwable, ? super Long, ? super e4.d<? super Boolean>, ? extends Object> rVar) {
        return new f(iVar, rVar);
    }
}
