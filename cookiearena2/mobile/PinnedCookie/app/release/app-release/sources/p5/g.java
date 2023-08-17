package p5;

import kotlinx.coroutines.n2;
import kotlinx.coroutines.u0;
import n5.e0;
import n5.g0;
import n5.i0;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final class g<T> extends e<T> {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final kotlinx.coroutines.flow.i<kotlinx.coroutines.flow.i<T>> f14853n;

    /* renamed from: o  reason: collision with root package name */
    public final int f14854o;

    /* loaded from: classes.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ n2 f14855k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.sync.f f14856l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ g0<T> f14857m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ y<T> f14858n;

        @h4.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: p5.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0210a extends h4.o implements t4.p<u0, e4.d<? super m2>, Object> {

            /* renamed from: o  reason: collision with root package name */
            public int f14859o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.i<T> f14860p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ y<T> f14861q;

            /* renamed from: r  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.sync.f f14862r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0210a(kotlinx.coroutines.flow.i<? extends T> iVar, y<T> yVar, kotlinx.coroutines.sync.f fVar, e4.d<? super C0210a> dVar) {
                super(2, dVar);
                this.f14860p = iVar;
                this.f14861q = yVar;
                this.f14862r = fVar;
            }

            @Override // h4.a
            @n6.d
            public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                return new C0210a(this.f14860p, this.f14861q, this.f14862r, dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f14859o;
                try {
                    if (i7 == 0) {
                        e1.n(obj);
                        kotlinx.coroutines.flow.i<T> iVar = this.f14860p;
                        y<T> yVar = this.f14861q;
                        this.f14859o = 1;
                        if (iVar.a(yVar, this) == h7) {
                            return h7;
                        }
                    } else if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e1.n(obj);
                    }
                    this.f14862r.a();
                    return m2.f17815a;
                } catch (Throwable th) {
                    this.f14862r.a();
                    throw th;
                }
            }

            @Override // t4.p
            @n6.e
            /* renamed from: a0  reason: merged with bridge method [inline-methods] */
            public final Object J(@n6.d u0 u0Var, @n6.e e4.d<? super m2> dVar) {
                return ((C0210a) H(u0Var, dVar)).Q(m2.f17815a);
            }
        }

        @h4.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {66}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
        /* loaded from: classes.dex */
        public static final class b extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public Object f14863n;

            /* renamed from: o  reason: collision with root package name */
            public Object f14864o;

            /* renamed from: p  reason: collision with root package name */
            public /* synthetic */ Object f14865p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ a<T> f14866q;

            /* renamed from: r  reason: collision with root package name */
            public int f14867r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, e4.d<? super b> dVar) {
                super(dVar);
                this.f14866q = aVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f14865p = obj;
                this.f14867r |= Integer.MIN_VALUE;
                return this.f14866q.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(n2 n2Var, kotlinx.coroutines.sync.f fVar, g0<? super T> g0Var, y<T> yVar) {
            this.f14855k = n2Var;
            this.f14856l = fVar;
            this.f14857m = g0Var;
            this.f14858n = yVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(@n6.d kotlinx.coroutines.flow.i<? extends T> r8, @n6.d e4.d<? super v3.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p5.g.a.b
                if (r0 == 0) goto L13
                r0 = r9
                p5.g$a$b r0 = (p5.g.a.b) r0
                int r1 = r0.f14867r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f14867r = r1
                goto L18
            L13:
                p5.g$a$b r0 = new p5.g$a$b
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f14865p
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f14867r
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.f14864o
                kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
                java.lang.Object r0 = r0.f14863n
                p5.g$a r0 = (p5.g.a) r0
                v3.e1.n(r9)
                goto L53
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                v3.e1.n(r9)
                kotlinx.coroutines.n2 r9 = r7.f14855k
                if (r9 == 0) goto L43
                kotlinx.coroutines.r2.A(r9)
            L43:
                kotlinx.coroutines.sync.f r9 = r7.f14856l
                r0.f14863n = r7
                r0.f14864o = r8
                r0.f14867r = r3
                java.lang.Object r9 = r9.c(r0)
                if (r9 != r1) goto L52
                return r1
            L52:
                r0 = r7
            L53:
                n5.g0<T> r1 = r0.f14857m
                r2 = 0
                r3 = 0
                p5.g$a$a r4 = new p5.g$a$a
                p5.y<T> r9 = r0.f14858n
                kotlinx.coroutines.sync.f r0 = r0.f14856l
                r5 = 0
                r4.<init>(r8, r9, r0, r5)
                r5 = 3
                r6 = 0
                kotlinx.coroutines.j.e(r1, r2, r3, r4, r5, r6)
                v3.m2 r8 = v3.m2.f17815a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p5.g.a.f(kotlinx.coroutines.flow.i, e4.d):java.lang.Object");
        }
    }

    public /* synthetic */ g(kotlinx.coroutines.flow.i iVar, int i7, e4.g gVar, int i8, n5.m mVar, int i9, u4.w wVar) {
        this(iVar, i7, (i9 & 4) != 0 ? e4.i.f8770k : gVar, (i9 & 8) != 0 ? -2 : i8, (i9 & 16) != 0 ? n5.m.SUSPEND : mVar);
    }

    @Override // p5.e
    @n6.d
    public String d() {
        return "concurrency=" + this.f14854o;
    }

    @Override // p5.e
    @n6.e
    public Object g(@n6.d g0<? super T> g0Var, @n6.d e4.d<? super m2> dVar) {
        Object a7 = this.f14853n.a(new a((n2) dVar.g().e(n2.f12920c), kotlinx.coroutines.sync.h.b(this.f14854o, 0, 2, null), g0Var, new y(g0Var)), dVar);
        return a7 == g4.d.h() ? a7 : m2.f17815a;
    }

    @Override // p5.e
    @n6.d
    public e<T> i(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        return new g(this.f14853n, this.f14854o, gVar, i7, mVar);
    }

    @Override // p5.e
    @n6.d
    public i0<T> o(@n6.d u0 u0Var) {
        return e0.e(u0Var, this.f14843k, this.f14844l, m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@n6.d kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> iVar, int i7, @n6.d e4.g gVar, int i8, @n6.d n5.m mVar) {
        super(gVar, i8, mVar);
        this.f14853n = iVar;
        this.f14854o = i7;
    }
}
