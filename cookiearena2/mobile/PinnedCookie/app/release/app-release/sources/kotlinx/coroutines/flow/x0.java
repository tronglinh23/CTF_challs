package kotlinx.coroutines.flow;

import u.v;
import v3.m2;
/* loaded from: classes.dex */
public final class x0<T> implements j<T> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final j<T> f12646k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final t4.p<j<? super T>, e4.d<? super m2>, Object> f12647l;

    @h4.f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {419, v.c.f17172u}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class a extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12648n;

        /* renamed from: o  reason: collision with root package name */
        public Object f12649o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f12650p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ x0<T> f12651q;

        /* renamed from: r  reason: collision with root package name */
        public int f12652r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0<T> x0Var, e4.d<? super a> dVar) {
            super(dVar);
            this.f12651q = x0Var;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12650p = obj;
            this.f12652r |= Integer.MIN_VALUE;
            return this.f12651q.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x0(@n6.d j<? super T> jVar, @n6.d t4.p<? super j<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        this.f12646k = jVar;
        this.f12647l = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [p5.v] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@n6.d e4.d<? super v3.m2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.x0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.x0$a r0 = (kotlinx.coroutines.flow.x0.a) r0
            int r1 = r0.f12652r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12652r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.x0$a r0 = new kotlinx.coroutines.flow.x0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f12650p
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12652r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            v3.e1.n(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f12649o
            p5.v r2 = (p5.v) r2
            java.lang.Object r4 = r0.f12648n
            kotlinx.coroutines.flow.x0 r4 = (kotlinx.coroutines.flow.x0) r4
            v3.e1.n(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            v3.e1.n(r7)
            p5.v r2 = new p5.v
            kotlinx.coroutines.flow.j<T> r7 = r6.f12646k
            e4.g r5 = r0.g()
            r2.<init>(r7, r5)
            t4.p<kotlinx.coroutines.flow.j<? super T>, e4.d<? super v3.m2>, java.lang.Object> r7 = r6.f12647l     // Catch: java.lang.Throwable -> L7d
            r0.f12648n = r6     // Catch: java.lang.Throwable -> L7d
            r0.f12649o = r2     // Catch: java.lang.Throwable -> L7d
            r0.f12652r = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.J(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.R()
            kotlinx.coroutines.flow.j<T> r7 = r4.f12646k
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.x0
            if (r2 == 0) goto L7a
            kotlinx.coroutines.flow.x0 r7 = (kotlinx.coroutines.flow.x0) r7
            r2 = 0
            r0.f12648n = r2
            r0.f12649o = r2
            r0.f12652r = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            v3.m2 r7 = v3.m2.f17815a
            return r7
        L7a:
            v3.m2 r7 = v3.m2.f17815a
            return r7
        L7d:
            r7 = move-exception
            r2.R()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x0.a(e4.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.j
    @n6.e
    public Object f(T t6, @n6.d e4.d<? super m2> dVar) {
        return this.f12646k.f(t6, dVar);
    }
}
