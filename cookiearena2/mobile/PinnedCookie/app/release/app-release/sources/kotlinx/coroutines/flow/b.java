package kotlinx.coroutines.flow;

import v3.m2;
/* loaded from: classes.dex */
public final class b<T> extends f<T> {
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final t4.p<n5.g0<? super T>, e4.d<? super m2>, Object> f12085o;

    @h4.f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {336}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class a extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12086n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f12087o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ b<T> f12088p;

        /* renamed from: q  reason: collision with root package name */
        public int f12089q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, e4.d<? super a> dVar) {
            super(dVar);
            this.f12088p = bVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12087o = obj;
            this.f12089q |= Integer.MIN_VALUE;
            return this.f12088p.g(null, this);
        }
    }

    public /* synthetic */ b(t4.p pVar, e4.g gVar, int i7, n5.m mVar, int i8, u4.w wVar) {
        this(pVar, (i8 & 2) != 0 ? e4.i.f8770k : gVar, (i8 & 4) != 0 ? -2 : i7, (i8 & 8) != 0 ? n5.m.SUSPEND : mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // kotlinx.coroutines.flow.f, p5.e
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@n6.d n5.g0<? super T> r5, @n6.d e4.d<? super v3.m2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.b.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.b$a r0 = (kotlinx.coroutines.flow.b.a) r0
            int r1 = r0.f12089q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12089q = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.b$a r0 = new kotlinx.coroutines.flow.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f12087o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12089q
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f12086n
            n5.g0 r5 = (n5.g0) r5
            v3.e1.n(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            v3.e1.n(r6)
            r0.f12086n = r5
            r0.f12089q = r3
            java.lang.Object r6 = super.g(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.W()
            if (r5 == 0) goto L4c
            v3.m2 r5 = v3.m2.f17815a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b.g(n5.g0, e4.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.f, p5.e
    @n6.d
    public p5.e<T> i(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        return new b(this.f12085o, gVar, i7, mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@n6.d t4.p<? super n5.g0<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar, @n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        super(pVar, gVar, i7, mVar);
        this.f12085o = pVar;
    }
}
