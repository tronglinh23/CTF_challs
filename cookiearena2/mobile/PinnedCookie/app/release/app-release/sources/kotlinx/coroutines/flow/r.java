package kotlinx.coroutines.flow;

import com.google.android.material.card.MaterialCardViewHelper;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.f1;
import n5.r;
import u.v;
import u4.k1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class r {

    /* loaded from: classes.dex */
    public static final class a<T> extends u4.n0 implements t4.l<T, Long> {

        /* renamed from: l */
        public final /* synthetic */ long f12375l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j7) {
            super(1);
            this.f12375l = j7;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b */
        public final Long O(T t6) {
            return Long.valueOf(this.f12375l);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends u4.n0 implements t4.l<T, Long> {

        /* renamed from: l */
        public final /* synthetic */ t4.l<T, k5.e> f12376l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(t4.l<? super T, k5.e> lVar) {
            super(1);
            this.f12376l = lVar;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b */
        public final Long O(T t6) {
            return Long.valueOf(f1.e(this.f12376l.O(t6).y0()));
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {222, 355}, m = "invokeSuspend", n = {"downstream", androidx.lifecycle.r0.f4811g, "lastValue", "timeoutMillis", "downstream", androidx.lifecycle.r0.f4811g, "lastValue", "timeoutMillis"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes.dex */
    public static final class c<T> extends h4.o implements t4.q<kotlinx.coroutines.u0, j<? super T>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public Object f12377o;

        /* renamed from: p */
        public Object f12378p;

        /* renamed from: q */
        public int f12379q;

        /* renamed from: r */
        public /* synthetic */ Object f12380r;

        /* renamed from: s */
        public /* synthetic */ Object f12381s;

        /* renamed from: t */
        public final /* synthetic */ t4.l<T, Long> f12382t;

        /* renamed from: u */
        public final /* synthetic */ i<T> f12383u;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.o implements t4.l<e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12384o;

            /* renamed from: p */
            public final /* synthetic */ j<T> f12385p;

            /* renamed from: q */
            public final /* synthetic */ k1.h<Object> f12386q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(j<? super T> jVar, k1.h<Object> hVar, e4.d<? super a> dVar) {
                super(1, dVar);
                this.f12385p = jVar;
                this.f12386q = hVar;
            }

            @Override // h4.a
            @n6.d
            public final e4.d<m2> G(@n6.d e4.d<?> dVar) {
                return new a(this.f12385p, this.f12386q, dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f12384o;
                if (i7 == 0) {
                    e1.n(obj);
                    j<T> jVar = this.f12385p;
                    kotlinx.coroutines.internal.r0 r0Var = p5.u.f14964a;
                    T t6 = this.f12386q.f17436k;
                    if (t6 == r0Var) {
                        t6 = null;
                    }
                    this.f12384o = 1;
                    if (jVar.f(t6, this) == h7) {
                        return h7;
                    }
                } else if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e1.n(obj);
                }
                this.f12386q.f17436k = null;
                return m2.f17815a;
            }

            @Override // t4.l
            @n6.e
            /* renamed from: a0 */
            public final Object O(@n6.e e4.d<? super m2> dVar) {
                return ((a) G(dVar)).Q(m2.f17815a);
            }
        }

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {243}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
        /* loaded from: classes.dex */
        public static final class b extends h4.o implements t4.p<n5.r<? extends Object>, e4.d<? super m2>, Object> {

            /* renamed from: o */
            public Object f12387o;

            /* renamed from: p */
            public int f12388p;

            /* renamed from: q */
            public /* synthetic */ Object f12389q;

            /* renamed from: r */
            public final /* synthetic */ k1.h<Object> f12390r;

            /* renamed from: s */
            public final /* synthetic */ j<T> f12391s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(k1.h<Object> hVar, j<? super T> jVar, e4.d<? super b> dVar) {
                super(2, dVar);
                this.f12390r = hVar;
                this.f12391s = jVar;
            }

            @Override // h4.a
            @n6.d
            public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                b bVar = new b(this.f12390r, this.f12391s, dVar);
                bVar.f12389q = obj;
                return bVar;
            }

            @Override // t4.p
            public /* bridge */ /* synthetic */ Object J(n5.r<? extends Object> rVar, e4.d<? super m2> dVar) {
                return a0(rVar.o(), dVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                k1.h<Object> hVar;
                k1.h<Object> hVar2;
                Object h7 = g4.d.h();
                int i7 = this.f12388p;
                if (i7 == 0) {
                    e1.n(obj);
                    T t6 = (T) ((n5.r) this.f12389q).o();
                    hVar = this.f12390r;
                    boolean z6 = t6 instanceof r.c;
                    if (!z6) {
                        hVar.f17436k = t6;
                    }
                    j<T> jVar = this.f12391s;
                    if (z6) {
                        Throwable f7 = n5.r.f(t6);
                        if (f7 != null) {
                            throw f7;
                        }
                        Object obj2 = hVar.f17436k;
                        if (obj2 != null) {
                            if (obj2 == p5.u.f14964a) {
                                obj2 = null;
                            }
                            this.f12389q = t6;
                            this.f12387o = hVar;
                            this.f12388p = 1;
                            if (jVar.f(obj2, this) == h7) {
                                return h7;
                            }
                            hVar2 = hVar;
                        }
                        hVar.f17436k = (T) p5.u.f14966c;
                    }
                    return m2.f17815a;
                } else if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    hVar2 = (k1.h) this.f12387o;
                    e1.n(obj);
                }
                hVar = hVar2;
                hVar.f17436k = (T) p5.u.f14966c;
                return m2.f17815a;
            }

            @n6.e
            public final Object a0(@n6.d Object obj, @n6.e e4.d<? super m2> dVar) {
                return ((b) H(n5.r.b(obj), dVar)).Q(m2.f17815a);
            }
        }

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.r$c$c */
        /* loaded from: classes.dex */
        public static final class C0158c extends h4.o implements t4.p<n5.g0<? super Object>, e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12392o;

            /* renamed from: p */
            public /* synthetic */ Object f12393p;

            /* renamed from: q */
            public final /* synthetic */ i<T> f12394q;

            /* renamed from: kotlinx.coroutines.flow.r$c$c$a */
            /* loaded from: classes.dex */
            public static final class a<T> implements j {

                /* renamed from: k */
                public final /* synthetic */ n5.g0<Object> f12395k;

                @h4.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {211}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.r$c$c$a$a */
                /* loaded from: classes.dex */
                public static final class C0159a extends h4.d {

                    /* renamed from: n */
                    public /* synthetic */ Object f12396n;

                    /* renamed from: o */
                    public final /* synthetic */ a<T> f12397o;

                    /* renamed from: p */
                    public int f12398p;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0159a(a<? super T> aVar, e4.d<? super C0159a> dVar) {
                        super(dVar);
                        this.f12397o = aVar;
                    }

                    @Override // h4.a
                    @n6.e
                    public final Object Q(@n6.d Object obj) {
                        this.f12396n = obj;
                        this.f12398p |= Integer.MIN_VALUE;
                        return this.f12397o.f(null, this);
                    }
                }

                public a(n5.g0<Object> g0Var) {
                    this.f12395k = g0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0031  */
                @Override // kotlinx.coroutines.flow.j
                @n6.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(T r5, @n6.d e4.d<? super v3.m2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.r.c.C0158c.a.C0159a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.r$c$c$a$a r0 = (kotlinx.coroutines.flow.r.c.C0158c.a.C0159a) r0
                        int r1 = r0.f12398p
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f12398p = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.r$c$c$a$a r0 = new kotlinx.coroutines.flow.r$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f12396n
                        java.lang.Object r1 = g4.d.h()
                        int r2 = r0.f12398p
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        v3.e1.n(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        v3.e1.n(r6)
                        n5.g0<java.lang.Object> r6 = r4.f12395k
                        if (r5 != 0) goto L3a
                        kotlinx.coroutines.internal.r0 r5 = p5.u.f14964a
                    L3a:
                        r0.f12398p = r3
                        java.lang.Object r5 = r6.z(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        v3.m2 r5 = v3.m2.f17815a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.c.C0158c.a.f(java.lang.Object, e4.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0158c(i<? extends T> iVar, e4.d<? super C0158c> dVar) {
                super(2, dVar);
                this.f12394q = iVar;
            }

            @Override // h4.a
            @n6.d
            public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                C0158c c0158c = new C0158c(this.f12394q, dVar);
                c0158c.f12393p = obj;
                return c0158c;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f12392o;
                if (i7 == 0) {
                    e1.n(obj);
                    n5.g0 g0Var = (n5.g0) this.f12393p;
                    i<T> iVar = this.f12394q;
                    a aVar = new a(g0Var);
                    this.f12392o = 1;
                    if (iVar.a(aVar, this) == h7) {
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
            /* renamed from: a0 */
            public final Object J(@n6.d n5.g0<Object> g0Var, @n6.e e4.d<? super m2> dVar) {
                return ((C0158c) H(g0Var, dVar)).Q(m2.f17815a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(t4.l<? super T, Long> lVar, i<? extends T> iVar, e4.d<? super c> dVar) {
            super(3, dVar);
            this.f12382t = lVar;
            this.f12383u = iVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:50|26|30|31|32|33|(1:35)|36|37|(1:39)|(1:41)(1:42)) */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x00f7, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x00f8, code lost:
            r10.g1(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x010a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:101:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00e0 A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:89:0x00dc, B:91:0x00e0, B:92:0x00ea), top: B:104:0x00dc }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0105  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x010b -> B:64:0x006f). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.c.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.q
        @n6.e
        /* renamed from: a0 */
        public final Object I(@n6.d kotlinx.coroutines.u0 u0Var, @n6.d j<? super T> jVar, @n6.e e4.d<? super m2> dVar) {
            c cVar = new c(this.f12382t, this.f12383u, dVar);
            cVar.f12380r = u0Var;
            cVar.f12381s = jVar;
            return cVar.Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", f = "Delay.kt", i = {0, 1, 2}, l = {314, v.a.f17126q, v.a.f17127r}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    /* loaded from: classes.dex */
    public static final class d extends h4.o implements t4.p<n5.g0<? super m2>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12399o;

        /* renamed from: p */
        public /* synthetic */ Object f12400p;

        /* renamed from: q */
        public final /* synthetic */ long f12401q;

        /* renamed from: r */
        public final /* synthetic */ long f12402r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j7, long j8, e4.d<? super d> dVar) {
            super(2, dVar);
            this.f12401q = j7;
            this.f12402r = j8;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            d dVar2 = new d(this.f12401q, this.f12402r, dVar);
            dVar2.f12400p = obj;
            return dVar2;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0050 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x005d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x005b -> B:36:0x0040). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r7.f12399o
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L11
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
            L11:
                java.lang.Object r1 = r7.f12400p
                n5.g0 r1 = (n5.g0) r1
                v3.e1.n(r8)
                goto L3f
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.f12400p
                n5.g0 r1 = (n5.g0) r1
                v3.e1.n(r8)
                r8 = r7
                goto L51
            L2a:
                v3.e1.n(r8)
                java.lang.Object r8 = r7.f12400p
                r1 = r8
                n5.g0 r1 = (n5.g0) r1
                long r5 = r7.f12401q
                r7.f12400p = r1
                r7.f12399o = r4
                java.lang.Object r8 = kotlinx.coroutines.f1.b(r5, r7)
                if (r8 != r0) goto L3f
                return r0
            L3f:
                r8 = r7
            L40:
                n5.m0 r4 = r1.m()
                v3.m2 r5 = v3.m2.f17815a
                r8.f12400p = r1
                r8.f12399o = r3
                java.lang.Object r4 = r4.z(r5, r8)
                if (r4 != r0) goto L51
                return r0
            L51:
                long r4 = r8.f12402r
                r8.f12400p = r1
                r8.f12399o = r2
                java.lang.Object r4 = kotlinx.coroutines.f1.b(r4, r8)
                if (r4 != r0) goto L40
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.d.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d n5.g0<? super m2> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((d) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {352}, m = "invokeSuspend", n = {"downstream", androidx.lifecycle.r0.f4811g, "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes.dex */
    public static final class e<T> extends h4.o implements t4.q<kotlinx.coroutines.u0, j<? super T>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public Object f12403o;

        /* renamed from: p */
        public Object f12404p;

        /* renamed from: q */
        public int f12405q;

        /* renamed from: r */
        public /* synthetic */ Object f12406r;

        /* renamed from: s */
        public /* synthetic */ Object f12407s;

        /* renamed from: t */
        public final /* synthetic */ long f12408t;

        /* renamed from: u */
        public final /* synthetic */ i<T> f12409u;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.o implements t4.p<n5.r<? extends Object>, e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12410o;

            /* renamed from: p */
            public /* synthetic */ Object f12411p;

            /* renamed from: q */
            public final /* synthetic */ k1.h<Object> f12412q;

            /* renamed from: r */
            public final /* synthetic */ n5.i0<m2> f12413r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k1.h<Object> hVar, n5.i0<m2> i0Var, e4.d<? super a> dVar) {
                super(2, dVar);
                this.f12412q = hVar;
                this.f12413r = i0Var;
            }

            @Override // h4.a
            @n6.d
            public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                a aVar = new a(this.f12412q, this.f12413r, dVar);
                aVar.f12411p = obj;
                return aVar;
            }

            @Override // t4.p
            public /* bridge */ /* synthetic */ Object J(n5.r<? extends Object> rVar, e4.d<? super m2> dVar) {
                return a0(rVar.o(), dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                g4.d.h();
                if (this.f12410o == 0) {
                    e1.n(obj);
                    T t6 = (T) ((n5.r) this.f12411p).o();
                    k1.h<Object> hVar = this.f12412q;
                    boolean z6 = t6 instanceof r.c;
                    if (!z6) {
                        hVar.f17436k = t6;
                    }
                    n5.i0<m2> i0Var = this.f12413r;
                    if (z6) {
                        Throwable f7 = n5.r.f(t6);
                        if (f7 != null) {
                            throw f7;
                        }
                        i0Var.f(new p5.l());
                        hVar.f17436k = (T) p5.u.f14966c;
                    }
                    return m2.f17815a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @n6.e
            public final Object a0(@n6.d Object obj, @n6.e e4.d<? super m2> dVar) {
                return ((a) H(n5.r.b(obj), dVar)).Q(m2.f17815a);
            }
        }

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class b extends h4.o implements t4.p<m2, e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12414o;

            /* renamed from: p */
            public final /* synthetic */ k1.h<Object> f12415p;

            /* renamed from: q */
            public final /* synthetic */ j<T> f12416q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(k1.h<Object> hVar, j<? super T> jVar, e4.d<? super b> dVar) {
                super(2, dVar);
                this.f12415p = hVar;
                this.f12416q = jVar;
            }

            @Override // h4.a
            @n6.d
            public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                return new b(this.f12415p, this.f12416q, dVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f12414o;
                if (i7 == 0) {
                    e1.n(obj);
                    k1.h<Object> hVar = this.f12415p;
                    Object obj2 = hVar.f17436k;
                    if (obj2 == null) {
                        return m2.f17815a;
                    }
                    hVar.f17436k = null;
                    j<T> jVar = this.f12416q;
                    if (obj2 == p5.u.f14964a) {
                        obj2 = null;
                    }
                    this.f12414o = 1;
                    if (jVar.f(obj2, this) == h7) {
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
            /* renamed from: a0 */
            public final Object J(@n6.d m2 m2Var, @n6.e e4.d<? super m2> dVar) {
                return ((b) H(m2Var, dVar)).Q(m2.f17815a);
            }
        }

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {280}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class c extends h4.o implements t4.p<n5.g0<? super Object>, e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12417o;

            /* renamed from: p */
            public /* synthetic */ Object f12418p;

            /* renamed from: q */
            public final /* synthetic */ i<T> f12419q;

            /* loaded from: classes.dex */
            public static final class a<T> implements j {

                /* renamed from: k */
                public final /* synthetic */ n5.g0<Object> f12420k;

                @h4.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {280}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.r$e$c$a$a */
                /* loaded from: classes.dex */
                public static final class C0160a extends h4.d {

                    /* renamed from: n */
                    public /* synthetic */ Object f12421n;

                    /* renamed from: o */
                    public final /* synthetic */ a<T> f12422o;

                    /* renamed from: p */
                    public int f12423p;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0160a(a<? super T> aVar, e4.d<? super C0160a> dVar) {
                        super(dVar);
                        this.f12422o = aVar;
                    }

                    @Override // h4.a
                    @n6.e
                    public final Object Q(@n6.d Object obj) {
                        this.f12421n = obj;
                        this.f12423p |= Integer.MIN_VALUE;
                        return this.f12422o.f(null, this);
                    }
                }

                public a(n5.g0<Object> g0Var) {
                    this.f12420k = g0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0031  */
                @Override // kotlinx.coroutines.flow.j
                @n6.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(T r5, @n6.d e4.d<? super v3.m2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.r.e.c.a.C0160a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.r$e$c$a$a r0 = (kotlinx.coroutines.flow.r.e.c.a.C0160a) r0
                        int r1 = r0.f12423p
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f12423p = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.r$e$c$a$a r0 = new kotlinx.coroutines.flow.r$e$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f12421n
                        java.lang.Object r1 = g4.d.h()
                        int r2 = r0.f12423p
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        v3.e1.n(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        v3.e1.n(r6)
                        n5.g0<java.lang.Object> r6 = r4.f12420k
                        if (r5 != 0) goto L3a
                        kotlinx.coroutines.internal.r0 r5 = p5.u.f14964a
                    L3a:
                        r0.f12423p = r3
                        java.lang.Object r5 = r6.z(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        v3.m2 r5 = v3.m2.f17815a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.e.c.a.f(java.lang.Object, e4.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(i<? extends T> iVar, e4.d<? super c> dVar) {
                super(2, dVar);
                this.f12419q = iVar;
            }

            @Override // h4.a
            @n6.d
            public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                c cVar = new c(this.f12419q, dVar);
                cVar.f12418p = obj;
                return cVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f12417o;
                if (i7 == 0) {
                    e1.n(obj);
                    n5.g0 g0Var = (n5.g0) this.f12418p;
                    i<T> iVar = this.f12419q;
                    a aVar = new a(g0Var);
                    this.f12417o = 1;
                    if (iVar.a(aVar, this) == h7) {
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
            /* renamed from: a0 */
            public final Object J(@n6.d n5.g0<Object> g0Var, @n6.e e4.d<? super m2> dVar) {
                return ((c) H(g0Var, dVar)).Q(m2.f17815a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(long j7, i<? extends T> iVar, e4.d<? super e> dVar) {
            super(3, dVar);
            this.f12408t = j7;
            this.f12409u = iVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            n5.i0 g7;
            j jVar;
            n5.i0 i0Var;
            k1.h hVar;
            n5.i0 i0Var2;
            Object h7 = g4.d.h();
            int i7 = this.f12405q;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.u0 u0Var = (kotlinx.coroutines.u0) this.f12406r;
                j jVar2 = (j) this.f12407s;
                n5.i0 h8 = n5.e0.h(u0Var, null, -1, new c(this.f12409u, null), 1, null);
                k1.h hVar2 = new k1.h();
                g7 = r.g(u0Var, this.f12408t, 0L, 2, null);
                jVar = jVar2;
                i0Var = h8;
                hVar = hVar2;
                i0Var2 = g7;
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i0Var2 = (n5.i0) this.f12404p;
                hVar = (k1.h) this.f12403o;
                i0Var = (n5.i0) this.f12407s;
                jVar = (j) this.f12406r;
                e1.n(obj);
            }
            while (hVar.f17436k != p5.u.f14966c) {
                this.f12406r = jVar;
                this.f12407s = i0Var;
                this.f12403o = hVar;
                this.f12404p = i0Var2;
                this.f12405q = 1;
                kotlinx.coroutines.selects.b bVar = new kotlinx.coroutines.selects.b(this);
                try {
                    bVar.h0(i0Var.J(), new a(hVar, i0Var2, null));
                    bVar.h0(i0Var2.G(), new b(hVar, jVar, null));
                } catch (Throwable th) {
                    bVar.g1(th);
                }
                Object f12 = bVar.f1();
                if (f12 == g4.d.h()) {
                    h4.h.c(this);
                }
                if (f12 == h7) {
                    return h7;
                }
            }
            return m2.f17815a;
        }

        @Override // t4.q
        @n6.e
        /* renamed from: a0 */
        public final Object I(@n6.d kotlinx.coroutines.u0 u0Var, @n6.d j<? super T> jVar, @n6.e e4.d<? super m2> dVar) {
            e eVar = new e(this.f12408t, this.f12409u, dVar);
            eVar.f12406r = u0Var;
            eVar.f12407s = jVar;
            return eVar.Q(m2.f17815a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d2
    @n6.d
    public static final <T> i<T> a(@n6.d i<? extends T> iVar, long j7) {
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (i7 >= 0) {
            return i7 == 0 ? iVar : e(iVar, new a(j7));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    @d2
    @n6.d
    @v3.t0
    public static final <T> i<T> b(@n6.d i<? extends T> iVar, @n6.d t4.l<? super T, Long> lVar) {
        return e(iVar, lVar);
    }

    @d2
    @n6.d
    public static final <T> i<T> c(@n6.d i<? extends T> iVar, long j7) {
        return k.a0(iVar, f1.e(j7));
    }

    @d2
    @s4.h(name = "debounceDuration")
    @v3.t0
    @n6.d
    public static final <T> i<T> d(@n6.d i<? extends T> iVar, @n6.d t4.l<? super T, k5.e> lVar) {
        return e(iVar, new b(lVar));
    }

    public static final <T> i<T> e(i<? extends T> iVar, t4.l<? super T, Long> lVar) {
        return p5.p.b(new c(lVar, iVar, null));
    }

    @n6.d
    public static final n5.i0<m2> f(@n6.d kotlinx.coroutines.u0 u0Var, long j7, long j8) {
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j7 + " ms").toString());
        }
        if (j8 >= 0) {
            return n5.e0.h(u0Var, null, 0, new d(j8, j7, null), 1, null);
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j8 + " ms").toString());
    }

    public static /* synthetic */ n5.i0 g(kotlinx.coroutines.u0 u0Var, long j7, long j8, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j8 = j7;
        }
        return k.x0(u0Var, j7, j8);
    }

    @d2
    @n6.d
    public static final <T> i<T> h(@n6.d i<? extends T> iVar, long j7) {
        if (j7 > 0) {
            return p5.p.b(new e(j7, iVar, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    @d2
    @n6.d
    public static final <T> i<T> i(@n6.d i<? extends T> iVar, long j7) {
        return k.A1(iVar, f1.e(j7));
    }
}
