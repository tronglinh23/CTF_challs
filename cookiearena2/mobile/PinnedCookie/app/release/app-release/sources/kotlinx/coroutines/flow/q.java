package kotlinx.coroutines.flow;

import u4.k1;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class q {

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {18}, m = "count", n = {"i"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class a<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12362n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f12363o;

        /* renamed from: p  reason: collision with root package name */
        public int f12364p;

        public a(e4.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12363o = obj;
            this.f12364p |= Integer.MIN_VALUE;
            return k.Y(null, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.f f12365k;

        public b(k1.f fVar) {
            this.f12365k = fVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @n6.e
        public final Object f(T t6, @n6.d e4.d<? super m2> dVar) {
            this.f12365k.f17434k++;
            return m2.f17815a;
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {30}, m = "count", n = {"i"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class c<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12366n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f12367o;

        /* renamed from: p  reason: collision with root package name */
        public int f12368p;

        public c(e4.d<? super c> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12367o = obj;
            this.f12368p |= Integer.MIN_VALUE;
            return k.Z(null, null, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> implements j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.p<T, e4.d<? super Boolean>, Object> f12369k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ k1.f f12370l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {31}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public Object f12371n;

            /* renamed from: o  reason: collision with root package name */
            public /* synthetic */ Object f12372o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ d<T> f12373p;

            /* renamed from: q  reason: collision with root package name */
            public int f12374q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, e4.d<? super a> dVar2) {
                super(dVar2);
                this.f12373p = dVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12372o = obj;
                this.f12374q |= Integer.MIN_VALUE;
                return this.f12373p.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar, k1.f fVar) {
            this.f12369k = pVar;
            this.f12370l = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r5, @n6.d e4.d<? super v3.m2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.q.d.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.q$d$a r0 = (kotlinx.coroutines.flow.q.d.a) r0
                int r1 = r0.f12374q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12374q = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.q$d$a r0 = new kotlinx.coroutines.flow.q$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f12372o
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12374q
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f12371n
                kotlinx.coroutines.flow.q$d r5 = (kotlinx.coroutines.flow.q.d) r5
                v3.e1.n(r6)
                goto L46
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                v3.e1.n(r6)
                t4.p<T, e4.d<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f12369k
                r0.f12371n = r4
                r0.f12374q = r3
                java.lang.Object r6 = r6.J(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L55
                u4.k1$f r5 = r5.f12370l
                int r6 = r5.f17434k
                int r6 = r6 + r3
                r5.f17434k = r6
            L55:
                v3.m2 r5 = v3.m2.f17815a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q.d.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, @n6.d e4.d<? super java.lang.Integer> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.q.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.q$a r0 = (kotlinx.coroutines.flow.q.a) r0
            int r1 = r0.f12364p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12364p = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.q$a r0 = new kotlinx.coroutines.flow.q$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12363o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12364p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f12362n
            u4.k1$f r4 = (u4.k1.f) r4
            v3.e1.n(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            v3.e1.n(r5)
            u4.k1$f r5 = new u4.k1$f
            r5.<init>()
            kotlinx.coroutines.flow.q$b r2 = new kotlinx.coroutines.flow.q$b
            r2.<init>(r5)
            r0.f12362n = r5
            r0.f12364p = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            int r4 = r4.f17434k
            java.lang.Integer r4 = h4.b.f(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q.a(kotlinx.coroutines.flow.i, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, @n6.d t4.p<? super T, ? super e4.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @n6.d e4.d<? super java.lang.Integer> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.q.c
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.q$c r0 = (kotlinx.coroutines.flow.q.c) r0
            int r1 = r0.f12368p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12368p = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.q$c r0 = new kotlinx.coroutines.flow.q$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12367o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12368p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f12366n
            u4.k1$f r4 = (u4.k1.f) r4
            v3.e1.n(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            v3.e1.n(r6)
            u4.k1$f r6 = new u4.k1$f
            r6.<init>()
            kotlinx.coroutines.flow.q$d r2 = new kotlinx.coroutines.flow.q$d
            r2.<init>(r5, r6)
            r0.f12366n = r6
            r0.f12368p = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r6
        L4e:
            int r4 = r4.f17434k
            java.lang.Integer r4 = h4.b.f(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q.b(kotlinx.coroutines.flow.i, t4.p, e4.d):java.lang.Object");
    }
}
