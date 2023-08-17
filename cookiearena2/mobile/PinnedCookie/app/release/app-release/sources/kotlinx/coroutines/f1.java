package kotlinx.coroutines;

import e4.g;
/* loaded from: classes.dex */
public final class f1 {

    @h4.f(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {148}, m = "awaitCancellation", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public /* synthetic */ Object f11975n;

        /* renamed from: o  reason: collision with root package name */
        public int f11976o;

        public a(e4.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f11975n = obj;
            this.f11976o |= Integer.MIN_VALUE;
            return f1.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@n6.d e4.d<?> r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.f1.a
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.f1$a r0 = (kotlinx.coroutines.f1.a) r0
            int r1 = r0.f11976o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11976o = r1
            goto L18
        L13:
            kotlinx.coroutines.f1$a r0 = new kotlinx.coroutines.f1$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f11975n
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f11976o
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            v3.e1.n(r4)
            goto L52
        L31:
            v3.e1.n(r4)
            r0.f11976o = r3
            kotlinx.coroutines.r r4 = new kotlinx.coroutines.r
            e4.d r2 = g4.c.d(r0)
            r4.<init>(r2, r3)
            r4.x()
            java.lang.Object r4 = r4.A()
            java.lang.Object r2 = g4.d.h()
            if (r4 != r2) goto L4f
            h4.h.c(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            v3.y r4 = new v3.y
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.f1.a(e4.d):java.lang.Object");
    }

    @n6.e
    public static final Object b(long j7, @n6.d e4.d<? super v3.m2> dVar) {
        if (j7 <= 0) {
            return v3.m2.f17815a;
        }
        r rVar = new r(g4.c.d(dVar), 1);
        rVar.x();
        if (j7 < Long.MAX_VALUE) {
            d(rVar.g()).m(j7, rVar);
        }
        Object A = rVar.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        return A == g4.d.h() ? A : v3.m2.f17815a;
    }

    @n6.e
    public static final Object c(long j7, @n6.d e4.d<? super v3.m2> dVar) {
        Object b7 = b(e(j7), dVar);
        return b7 == g4.d.h() ? b7 : v3.m2.f17815a;
    }

    @n6.d
    public static final e1 d(@n6.d e4.g gVar) {
        g.b e7 = gVar.e(e4.e.f8765a);
        e1 e1Var = e7 instanceof e1 ? (e1) e7 : null;
        return e1Var == null ? b1.a() : e1Var;
    }

    public static final long e(long j7) {
        if (k5.e.l(j7, k5.e.f11783l.W()) > 0) {
            return d5.u.v(k5.e.M(j7), 1L);
        }
        return 0L;
    }
}
