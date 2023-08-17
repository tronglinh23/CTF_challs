package kotlinx.coroutines.flow;

import u4.k1;
import v3.m2;

/* loaded from: classes.dex */
public final class g<T> implements i<T> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final i<T> f12223k;
    @n6.d
    @s4.e

    /* renamed from: l  reason: collision with root package name */
    public final t4.l<T, Object> f12224l;
    @n6.d
    @s4.e

    /* renamed from: m  reason: collision with root package name */
    public final t4.p<Object, Object, Boolean> f12225m;

    /* loaded from: classes.dex */
    public static final class a<T> implements j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ g<T> f12226k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ k1.h<Object> f12227l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ j<T> f12228m;

        @h4.f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {81}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0154a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12229n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ a<T> f12230o;

            /* renamed from: p  reason: collision with root package name */
            public int f12231p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0154a(a<? super T> aVar, e4.d<? super C0154a> dVar) {
                super(dVar);
                this.f12230o = aVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12229n = obj;
                this.f12231p |= Integer.MIN_VALUE;
                return this.f12230o.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(g<T> gVar, k1.h<Object> hVar, j<? super T> jVar) {
            this.f12226k = gVar;
            this.f12227l = hVar;
            this.f12228m = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object f(T r6, @n6.d e4.d<? super v3.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.g.a.C0154a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.g$a$a r0 = (kotlinx.coroutines.flow.g.a.C0154a) r0
                int r1 = r0.f12231p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12231p = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.g$a$a r0 = new kotlinx.coroutines.flow.g$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f12229n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12231p
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                v3.e1.n(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                v3.e1.n(r7)
                kotlinx.coroutines.flow.g<T> r7 = r5.f12226k
                t4.l<T, java.lang.Object> r7 = r7.f12224l
                java.lang.Object r7 = r7.O(r6)
                u4.k1$h<java.lang.Object> r2 = r5.f12227l
                T r2 = r2.f17436k
                kotlinx.coroutines.internal.r0 r4 = p5.u.f14964a
                if (r2 == r4) goto L58
                kotlinx.coroutines.flow.g<T> r4 = r5.f12226k
                t4.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f12225m
                java.lang.Object r2 = r4.J(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                v3.m2 r6 = v3.m2.f17815a
                return r6
            L58:
                u4.k1$h<java.lang.Object> r2 = r5.f12227l
                r2.f17436k = r7
                kotlinx.coroutines.flow.j<T> r7 = r5.f12228m
                r0.f12231p = r3
                java.lang.Object r6 = r7.f(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                v3.m2 r6 = v3.m2.f17815a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g.a.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@n6.d i<? extends T> iVar, @n6.d t4.l<? super T, ? extends Object> lVar, @n6.d t4.p<Object, Object, Boolean> pVar) {
        this.f12223k = iVar;
        this.f12224l = lVar;
        this.f12225m = pVar;
    }

    @Override // kotlinx.coroutines.flow.i
    @n6.e
    public Object a(@n6.d j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
        k1.h hVar = new k1.h();
        hVar.f17436k = (T) p5.u.f14964a;
        Object a7 = this.f12223k.a(new a(this, hVar, jVar), dVar);
        return a7 == g4.d.h() ? a7 : m2.f17815a;
    }
}