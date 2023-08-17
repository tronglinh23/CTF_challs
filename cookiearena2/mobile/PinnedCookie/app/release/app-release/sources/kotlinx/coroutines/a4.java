package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class a4 {

    @h4.f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {100}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
    /* loaded from: classes.dex */
    public static final class a<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public long f11849n;

        /* renamed from: o  reason: collision with root package name */
        public Object f11850o;

        /* renamed from: p  reason: collision with root package name */
        public Object f11851p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f11852q;

        /* renamed from: r  reason: collision with root package name */
        public int f11853r;

        public a(e4.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f11852q = obj;
            this.f11853r |= Integer.MIN_VALUE;
            return a4.e(0L, null, this);
        }
    }

    @n6.d
    public static final y3 a(long j7, @n6.d n2 n2Var) {
        return new y3("Timed out waiting for " + j7 + " ms", n2Var);
    }

    public static final <U, T extends U> Object b(z3<U, ? super T> z3Var, t4.p<? super u0, ? super e4.d<? super T>, ? extends Object> pVar) {
        r2.y(z3Var, f1.d(z3Var.f12831m.g()).z0(z3Var.f13189n, z3Var, z3Var.g()));
        return q5.b.g(z3Var, z3Var, pVar);
    }

    @n6.e
    public static final <T> Object c(long j7, @n6.d t4.p<? super u0, ? super e4.d<? super T>, ? extends Object> pVar, @n6.d e4.d<? super T> dVar) {
        if (j7 > 0) {
            Object b7 = b(new z3(j7, dVar), pVar);
            if (b7 == g4.d.h()) {
                h4.h.c(dVar);
            }
            return b7;
        }
        throw new y3("Timed out immediately");
    }

    @n6.e
    public static final <T> Object d(long j7, @n6.d t4.p<? super u0, ? super e4.d<? super T>, ? extends Object> pVar, @n6.d e4.d<? super T> dVar) {
        return c(f1.e(j7), pVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.z3] */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(long r7, @n6.d t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super T>, ? extends java.lang.Object> r9, @n6.d e4.d<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.a4.a
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.a4$a r0 = (kotlinx.coroutines.a4.a) r0
            int r1 = r0.f11853r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11853r = r1
            goto L18
        L13:
            kotlinx.coroutines.a4$a r0 = new kotlinx.coroutines.a4$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f11852q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f11853r
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f11851p
            u4.k1$h r7 = (u4.k1.h) r7
            java.lang.Object r8 = r0.f11850o
            t4.p r8 = (t4.p) r8
            v3.e1.n(r10)     // Catch: kotlinx.coroutines.y3 -> L32
            goto L6b
        L32:
            r8 = move-exception
            goto L6e
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            v3.e1.n(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            u4.k1$h r10 = new u4.k1$h
            r10.<init>()
            r0.f11850o = r9     // Catch: kotlinx.coroutines.y3 -> L6c
            r0.f11851p = r10     // Catch: kotlinx.coroutines.y3 -> L6c
            r0.f11849n = r7     // Catch: kotlinx.coroutines.y3 -> L6c
            r0.f11853r = r4     // Catch: kotlinx.coroutines.y3 -> L6c
            kotlinx.coroutines.z3 r2 = new kotlinx.coroutines.z3     // Catch: kotlinx.coroutines.y3 -> L6c
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.y3 -> L6c
            r10.f17436k = r2     // Catch: kotlinx.coroutines.y3 -> L6c
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.y3 -> L6c
            java.lang.Object r8 = g4.d.h()     // Catch: kotlinx.coroutines.y3 -> L6c
            if (r7 != r8) goto L67
            h4.h.c(r0)     // Catch: kotlinx.coroutines.y3 -> L6c
        L67:
            if (r7 != r1) goto L6a
            return r1
        L6a:
            r10 = r7
        L6b:
            return r10
        L6c:
            r8 = move-exception
            r7 = r10
        L6e:
            kotlinx.coroutines.n2 r9 = r8.f13186k
            T r7 = r7.f17436k
            if (r9 != r7) goto L75
            return r3
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a4.e(long, t4.p, e4.d):java.lang.Object");
    }

    @n6.e
    public static final <T> Object f(long j7, @n6.d t4.p<? super u0, ? super e4.d<? super T>, ? extends Object> pVar, @n6.d e4.d<? super T> dVar) {
        return e(f1.e(j7), pVar, dVar);
    }
}
