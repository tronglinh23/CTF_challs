package p5;

import kotlinx.coroutines.n2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;
import u4.k1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final class j<T, R> extends h<T, R> {
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final t4.q<kotlinx.coroutines.flow.j<? super R>, T, e4.d<? super m2>, Object> f14872o;

    @h4.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends h4.o implements t4.p<u0, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f14873o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f14874p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ j<T, R> f14875q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<R> f14876r;

        /* renamed from: p5.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0211a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ k1.h<n2> f14877k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ u0 f14878l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ j<T, R> f14879m;

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.j<R> f14880n;

            @h4.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: p5.j$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0212a extends h4.o implements t4.p<u0, e4.d<? super m2>, Object> {

                /* renamed from: o  reason: collision with root package name */
                public int f14881o;

                /* renamed from: p  reason: collision with root package name */
                public final /* synthetic */ j<T, R> f14882p;

                /* renamed from: q  reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j<R> f14883q;

                /* renamed from: r  reason: collision with root package name */
                public final /* synthetic */ T f14884r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0212a(j<T, R> jVar, kotlinx.coroutines.flow.j<? super R> jVar2, T t6, e4.d<? super C0212a> dVar) {
                    super(2, dVar);
                    this.f14882p = jVar;
                    this.f14883q = jVar2;
                    this.f14884r = t6;
                }

                @Override // h4.a
                @n6.d
                public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                    return new C0212a(this.f14882p, this.f14883q, this.f14884r, dVar);
                }

                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    Object h7 = g4.d.h();
                    int i7 = this.f14881o;
                    if (i7 == 0) {
                        e1.n(obj);
                        t4.q qVar = this.f14882p.f14872o;
                        kotlinx.coroutines.flow.j<R> jVar = this.f14883q;
                        T t6 = this.f14884r;
                        this.f14881o = 1;
                        if (qVar.I(jVar, t6, this) == h7) {
                            return h7;
                        }
                    } else if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e1.n(obj);
                    }
                    return m2.f17815a;
                }

                @Override // t4.p
                @n6.e
                /* renamed from: a0  reason: merged with bridge method [inline-methods] */
                public final Object J(@n6.d u0 u0Var, @n6.e e4.d<? super m2> dVar) {
                    return ((C0212a) H(u0Var, dVar)).Q(m2.f17815a);
                }
            }

            @h4.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {30}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            /* renamed from: p5.j$a$a$b */
            /* loaded from: classes.dex */
            public static final class b extends h4.d {

                /* renamed from: n  reason: collision with root package name */
                public Object f14885n;

                /* renamed from: o  reason: collision with root package name */
                public Object f14886o;

                /* renamed from: p  reason: collision with root package name */
                public Object f14887p;

                /* renamed from: q  reason: collision with root package name */
                public /* synthetic */ Object f14888q;

                /* renamed from: r  reason: collision with root package name */
                public final /* synthetic */ C0211a<T> f14889r;

                /* renamed from: s  reason: collision with root package name */
                public int f14890s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0211a<? super T> c0211a, e4.d<? super b> dVar) {
                    super(dVar);
                    this.f14889r = c0211a;
                }

                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    this.f14888q = obj;
                    this.f14890s |= Integer.MIN_VALUE;
                    return this.f14889r.f(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0211a(k1.h<n2> hVar, u0 u0Var, j<T, R> jVar, kotlinx.coroutines.flow.j<? super R> jVar2) {
                this.f14877k = hVar;
                this.f14878l = u0Var;
                this.f14879m = jVar;
                this.f14880n = jVar2;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
            @Override // kotlinx.coroutines.flow.j
            @n6.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object f(T r8, @n6.d e4.d<? super v3.m2> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof p5.j.a.C0211a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    p5.j$a$a$b r0 = (p5.j.a.C0211a.b) r0
                    int r1 = r0.f14890s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f14890s = r1
                    goto L18
                L13:
                    p5.j$a$a$b r0 = new p5.j$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f14888q
                    java.lang.Object r1 = g4.d.h()
                    int r2 = r0.f14890s
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f14887p
                    kotlinx.coroutines.n2 r8 = (kotlinx.coroutines.n2) r8
                    java.lang.Object r8 = r0.f14886o
                    java.lang.Object r0 = r0.f14885n
                    p5.j$a$a r0 = (p5.j.a.C0211a) r0
                    v3.e1.n(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    v3.e1.n(r9)
                    u4.k1$h<kotlinx.coroutines.n2> r9 = r7.f14877k
                    T r9 = r9.f17436k
                    kotlinx.coroutines.n2 r9 = (kotlinx.coroutines.n2) r9
                    if (r9 == 0) goto L5d
                    p5.l r2 = new p5.l
                    r2.<init>()
                    r9.f(r2)
                    r0.f14885n = r7
                    r0.f14886o = r8
                    r0.f14887p = r9
                    r0.f14890s = r3
                    java.lang.Object r9 = r9.E0(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    u4.k1$h<kotlinx.coroutines.n2> r9 = r0.f14877k
                    kotlinx.coroutines.u0 r1 = r0.f14878l
                    r2 = 0
                    kotlinx.coroutines.w0 r3 = kotlinx.coroutines.w0.UNDISPATCHED
                    p5.j$a$a$a r4 = new p5.j$a$a$a
                    p5.j<T, R> r5 = r0.f14879m
                    kotlinx.coroutines.flow.j<R> r0 = r0.f14880n
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    kotlinx.coroutines.n2 r8 = kotlinx.coroutines.j.e(r1, r2, r3, r4, r5, r6)
                    r9.f17436k = r8
                    v3.m2 r8 = v3.m2.f17815a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: p5.j.a.C0211a.f(java.lang.Object, e4.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(j<T, R> jVar, kotlinx.coroutines.flow.j<? super R> jVar2, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f14875q = jVar;
            this.f14876r = jVar2;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            a aVar = new a(this.f14875q, this.f14876r, dVar);
            aVar.f14874p = obj;
            return aVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f14873o;
            if (i7 == 0) {
                e1.n(obj);
                u0 u0Var = (u0) this.f14874p;
                k1.h hVar = new k1.h();
                j<T, R> jVar = this.f14875q;
                kotlinx.coroutines.flow.i<S> iVar = jVar.f14868n;
                C0211a c0211a = new C0211a(hVar, u0Var, jVar, this.f14876r);
                this.f14873o = 1;
                if (iVar.a(c0211a, this) == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e1.n(obj);
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d u0 u0Var, @n6.e e4.d<? super m2> dVar) {
            return ((a) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    public /* synthetic */ j(t4.q qVar, kotlinx.coroutines.flow.i iVar, e4.g gVar, int i7, n5.m mVar, int i8, u4.w wVar) {
        this(qVar, iVar, (i8 & 4) != 0 ? e4.i.f8770k : gVar, (i8 & 8) != 0 ? -2 : i7, (i8 & 16) != 0 ? n5.m.SUSPEND : mVar);
    }

    @Override // p5.e
    @n6.d
    public e<R> i(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        return new j(this.f14872o, this.f14868n, gVar, i7, mVar);
    }

    @Override // p5.h
    @n6.e
    public Object t(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d e4.d<? super m2> dVar) {
        Object g7 = v0.g(new a(this, jVar, null), dVar);
        return g7 == g4.d.h() ? g7 : m2.f17815a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@n6.d t4.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super e4.d<? super m2>, ? extends Object> qVar, @n6.d kotlinx.coroutines.flow.i<? extends T> iVar, @n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        super(iVar, gVar, i7, mVar);
        this.f14872o = qVar;
    }
}
