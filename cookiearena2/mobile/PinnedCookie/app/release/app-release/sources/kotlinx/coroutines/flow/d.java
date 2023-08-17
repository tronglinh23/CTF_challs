package kotlinx.coroutines.flow;

import v3.m2;
/* loaded from: classes.dex */
public final class d<T> implements c<T> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final i<T> f12212k;

    /* loaded from: classes.dex */
    public static final class a<T> implements j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ j<T> f12213k;

        @h4.f(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {275}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0153a extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f12214n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ a<T> f12215o;

            /* renamed from: p  reason: collision with root package name */
            public int f12216p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0153a(a<? super T> aVar, e4.d<? super C0153a> dVar) {
                super(dVar);
                this.f12215o = aVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12214n = obj;
                this.f12216p |= Integer.MIN_VALUE;
                return this.f12215o.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(j<? super T> jVar) {
            this.f12213k = jVar;
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.d.a.C0153a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.d$a$a r0 = (kotlinx.coroutines.flow.d.a.C0153a) r0
                int r1 = r0.f12216p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12216p = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.d$a$a r0 = new kotlinx.coroutines.flow.d$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f12214n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12216p
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                v3.e1.n(r6)
                goto L46
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                v3.e1.n(r6)
                e4.g r6 = r0.g()
                kotlinx.coroutines.r2.z(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f12213k
                r0.f12216p = r3
                java.lang.Object r5 = r6.f(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                v3.m2 r5 = v3.m2.f17815a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.a.f(java.lang.Object, e4.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@n6.d i<? extends T> iVar) {
        this.f12212k = iVar;
    }

    @Override // kotlinx.coroutines.flow.i
    @n6.e
    public Object a(@n6.d j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
        Object a7 = this.f12212k.a(new a(jVar), dVar);
        return a7 == g4.d.h() ? a7 : m2.f17815a;
    }
}
