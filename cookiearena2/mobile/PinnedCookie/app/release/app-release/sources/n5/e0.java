package n5;

import kotlinx.coroutines.c2;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.w0;
import v3.d1;
import v3.m2;
/* loaded from: classes.dex */
public final class e0 {

    @h4.f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {153}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class a extends h4.d {

        /* renamed from: n */
        public Object f13920n;

        /* renamed from: o */
        public Object f13921o;

        /* renamed from: p */
        public /* synthetic */ Object f13922p;

        /* renamed from: q */
        public int f13923q;

        public a(e4.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f13922p = obj;
            this.f13923q |= Integer.MIN_VALUE;
            return e0.a(null, null, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u4.n0 implements t4.a<m2> {

        /* renamed from: l */
        public static final b f13924l = new b();

        public b() {
            super(0);
        }

        public final void b() {
        }

        @Override // t4.a
        public /* bridge */ /* synthetic */ m2 n() {
            b();
            return m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends u4.n0 implements t4.l<Throwable, m2> {

        /* renamed from: l */
        public final /* synthetic */ kotlinx.coroutines.q<m2> f13925l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(kotlinx.coroutines.q<? super m2> qVar) {
            super(1);
            this.f13925l = qVar;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Throwable th) {
            b(th);
            return m2.f17815a;
        }

        public final void b(@n6.e Throwable th) {
            kotlinx.coroutines.q<m2> qVar = this.f13925l;
            d1.a aVar = d1.f17778l;
            qVar.D(d1.b(m2.f17815a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003c  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@n6.d n5.g0<?> r4, @n6.d t4.a<v3.m2> r5, @n6.d e4.d<? super v3.m2> r6) {
        /*
            boolean r0 = r6 instanceof n5.e0.a
            if (r0 == 0) goto L13
            r0 = r6
            n5.e0$a r0 = (n5.e0.a) r0
            int r1 = r0.f13923q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13923q = r1
            goto L18
        L13:
            n5.e0$a r0 = new n5.e0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f13922p
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f13923q
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f13921o
            r5 = r4
            t4.a r5 = (t4.a) r5
            java.lang.Object r4 = r0.f13920n
            n5.g0 r4 = (n5.g0) r4
            v3.e1.n(r6)     // Catch: java.lang.Throwable -> L32
            goto L7a
        L32:
            r4 = move-exception
            goto L80
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            v3.e1.n(r6)
            e4.g r6 = r0.g()
            kotlinx.coroutines.n2$b r2 = kotlinx.coroutines.n2.f12920c
            e4.g$b r6 = r6.e(r2)
            if (r6 != r4) goto L4d
            r6 = r3
            goto L4e
        L4d:
            r6 = 0
        L4e:
            if (r6 == 0) goto L84
            r0.f13920n = r4     // Catch: java.lang.Throwable -> L32
            r0.f13921o = r5     // Catch: java.lang.Throwable -> L32
            r0.f13923q = r3     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.r r6 = new kotlinx.coroutines.r     // Catch: java.lang.Throwable -> L32
            e4.d r2 = g4.c.d(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.x()     // Catch: java.lang.Throwable -> L32
            n5.e0$c r2 = new n5.e0$c     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.a0(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.A()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = g4.d.h()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L77
            h4.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L77:
            if (r4 != r1) goto L7a
            return r1
        L7a:
            r5.n()
            v3.m2 r4 = v3.m2.f17815a
            return r4
        L80:
            r5.n()
            throw r4
        L84:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.e0.a(n5.g0, t4.a, e4.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(g0 g0Var, t4.a aVar, e4.d dVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = b.f13924l;
        }
        return a(g0Var, aVar, dVar);
    }

    @n6.d
    @i2
    public static final <E> i0<E> c(@n6.d u0 u0Var, @n6.d e4.g gVar, int i7, @n6.d w0 w0Var, @n6.e t4.l<? super Throwable, m2> lVar, @v3.b @n6.d t4.p<? super g0<? super E>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return d(u0Var, gVar, i7, m.SUSPEND, w0Var, lVar, pVar);
    }

    @n6.d
    public static final <E> i0<E> d(@n6.d u0 u0Var, @n6.d e4.g gVar, int i7, @n6.d m mVar, @n6.d w0 w0Var, @n6.e t4.l<? super Throwable, m2> lVar, @v3.b @n6.d t4.p<? super g0<? super E>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        f0 f0Var = new f0(kotlinx.coroutines.n0.e(u0Var, gVar), q.d(i7, mVar, null, 4, null));
        if (lVar != null) {
            f0Var.X(lVar);
        }
        f0Var.L1(w0Var, f0Var, pVar);
        return f0Var;
    }

    @c2
    @n6.d
    public static final <E> i0<E> e(@n6.d u0 u0Var, @n6.d e4.g gVar, int i7, @v3.b @n6.d t4.p<? super g0<? super E>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return d(u0Var, gVar, i7, m.SUSPEND, w0.DEFAULT, null, pVar);
    }

    public static /* synthetic */ i0 f(u0 u0Var, e4.g gVar, int i7, w0 w0Var, t4.l lVar, t4.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = e4.i.f8770k;
        }
        e4.g gVar2 = gVar;
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        int i9 = i7;
        if ((i8 & 4) != 0) {
            w0Var = w0.DEFAULT;
        }
        w0 w0Var2 = w0Var;
        if ((i8 & 8) != 0) {
            lVar = null;
        }
        return c(u0Var, gVar2, i9, w0Var2, lVar, pVar);
    }

    public static /* synthetic */ i0 g(u0 u0Var, e4.g gVar, int i7, m mVar, w0 w0Var, t4.l lVar, t4.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = e4.i.f8770k;
        }
        e4.g gVar2 = gVar;
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        int i9 = i7;
        if ((i8 & 4) != 0) {
            mVar = m.SUSPEND;
        }
        m mVar2 = mVar;
        if ((i8 & 8) != 0) {
            w0Var = w0.DEFAULT;
        }
        w0 w0Var2 = w0Var;
        if ((i8 & 16) != 0) {
            lVar = null;
        }
        return d(u0Var, gVar2, i9, mVar2, w0Var2, lVar, pVar);
    }

    public static /* synthetic */ i0 h(u0 u0Var, e4.g gVar, int i7, t4.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = e4.i.f8770k;
        }
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        return e(u0Var, gVar, i7, pVar);
    }
}
