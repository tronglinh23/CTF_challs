package kotlinx.coroutines.flow;

import kotlinx.coroutines.c2;
import kotlinx.coroutines.d2;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class w {

    /* renamed from: a */
    public static final int f12601a = kotlinx.coroutines.internal.t0.b(k.f12256a, 16, 1, Integer.MAX_VALUE);

    /* loaded from: classes.dex */
    public static final class a<R> implements i<i<? extends R>> {

        /* renamed from: k */
        public final /* synthetic */ i f12602k;

        /* renamed from: l */
        public final /* synthetic */ t4.p f12603l;

        /* renamed from: kotlinx.coroutines.flow.w$a$a */
        /* loaded from: classes.dex */
        public static final class C0166a<T> implements j {

            /* renamed from: k */
            public final /* synthetic */ j f12604k;

            /* renamed from: l */
            public final /* synthetic */ t4.p f12605l;

            @h4.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.w$a$a$a */
            /* loaded from: classes.dex */
            public static final class C0167a extends h4.d {

                /* renamed from: n */
                public /* synthetic */ Object f12606n;

                /* renamed from: o */
                public int f12607o;

                /* renamed from: p */
                public Object f12608p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0167a(e4.d dVar) {
                    super(dVar);
                    C0166a.this = r1;
                }

                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    this.f12606n = obj;
                    this.f12607o |= Integer.MIN_VALUE;
                    return C0166a.this.f(null, this);
                }
            }

            public C0166a(j jVar, t4.p pVar) {
                this.f12604k = jVar;
                this.f12605l = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x005c A[RETURN] */
            @Override // kotlinx.coroutines.flow.j
            @n6.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object f(java.lang.Object r7, @n6.d e4.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.w.a.C0166a.C0167a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.w$a$a$a r0 = (kotlinx.coroutines.flow.w.a.C0166a.C0167a) r0
                    int r1 = r0.f12607o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12607o = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.w$a$a$a r0 = new kotlinx.coroutines.flow.w$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f12606n
                    java.lang.Object r1 = g4.d.h()
                    int r2 = r0.f12607o
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    v3.e1.n(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f12608p
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    v3.e1.n(r8)
                    goto L51
                L3c:
                    v3.e1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f12604k
                    t4.p r2 = r6.f12605l
                    r0.f12608p = r8
                    r0.f12607o = r4
                    java.lang.Object r7 = r2.J(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f12608p = r2
                    r0.f12607o = r3
                    java.lang.Object r7 = r7.f(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    v3.m2 r7 = v3.m2.f17815a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.a.C0166a.f(java.lang.Object, e4.d):java.lang.Object");
            }
        }

        public a(i iVar, t4.p pVar) {
            this.f12602k = iVar;
            this.f12603l = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d j jVar, @n6.d e4.d dVar) {
            Object a7 = this.f12602k.a(new C0166a(jVar, this.f12603l), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {190, 190}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class b<R, T> extends h4.o implements t4.q<j<? super R>, T, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12610o;

        /* renamed from: p */
        public /* synthetic */ Object f12611p;

        /* renamed from: q */
        public /* synthetic */ Object f12612q;

        /* renamed from: r */
        public final /* synthetic */ t4.p<T, e4.d<? super i<? extends R>>, Object> f12613r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(t4.p<? super T, ? super e4.d<? super i<? extends R>>, ? extends Object> pVar, e4.d<? super b> dVar) {
            super(3, dVar);
            this.f12613r = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            j jVar;
            Object h7 = g4.d.h();
            int i7 = this.f12610o;
            if (i7 == 0) {
                e1.n(obj);
                jVar = (j) this.f12611p;
                Object obj2 = this.f12612q;
                t4.p<T, e4.d<? super i<? extends R>>, Object> pVar = this.f12613r;
                this.f12611p = jVar;
                this.f12610o = 1;
                obj = pVar.J(obj2, this);
                if (obj == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    e1.n(obj);
                    return m2.f17815a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jVar = (j) this.f12611p;
                e1.n(obj);
            }
            this.f12611p = null;
            this.f12610o = 2;
            if (k.l0(jVar, (i) obj, this) == h7) {
                return h7;
            }
            return m2.f17815a;
        }

        @Override // t4.q
        @n6.e
        /* renamed from: a0 */
        public final Object I(@n6.d j<? super R> jVar, T t6, @n6.e e4.d<? super m2> dVar) {
            b bVar = new b(this.f12613r, dVar);
            bVar.f12611p = jVar;
            bVar.f12612q = t6;
            return bVar.Q(m2.f17815a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @n6.e
        public final Object c0(@n6.d Object obj) {
            j jVar = (j) this.f12611p;
            i iVar = (i) this.f12613r.J(this.f12612q, this);
            u4.i0.e(0);
            k.l0(jVar, iVar, this);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c<R> implements i<i<? extends R>> {

        /* renamed from: k */
        public final /* synthetic */ i f12614k;

        /* renamed from: l */
        public final /* synthetic */ t4.p f12615l;

        /* loaded from: classes.dex */
        public static final class a<T> implements j {

            /* renamed from: k */
            public final /* synthetic */ j f12616k;

            /* renamed from: l */
            public final /* synthetic */ t4.p f12617l;

            @h4.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.w$c$a$a */
            /* loaded from: classes.dex */
            public static final class C0168a extends h4.d {

                /* renamed from: n */
                public /* synthetic */ Object f12618n;

                /* renamed from: o */
                public int f12619o;

                /* renamed from: p */
                public Object f12620p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0168a(e4.d dVar) {
                    super(dVar);
                    a.this = r1;
                }

                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    this.f12618n = obj;
                    this.f12619o |= Integer.MIN_VALUE;
                    return a.this.f(null, this);
                }
            }

            public a(j jVar, t4.p pVar) {
                this.f12616k = jVar;
                this.f12617l = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x005c A[RETURN] */
            @Override // kotlinx.coroutines.flow.j
            @n6.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object f(java.lang.Object r7, @n6.d e4.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.w.c.a.C0168a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.w$c$a$a r0 = (kotlinx.coroutines.flow.w.c.a.C0168a) r0
                    int r1 = r0.f12619o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12619o = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.w$c$a$a r0 = new kotlinx.coroutines.flow.w$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f12618n
                    java.lang.Object r1 = g4.d.h()
                    int r2 = r0.f12619o
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    v3.e1.n(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f12620p
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    v3.e1.n(r8)
                    goto L51
                L3c:
                    v3.e1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f12616k
                    t4.p r2 = r6.f12617l
                    r0.f12620p = r8
                    r0.f12619o = r4
                    java.lang.Object r7 = r2.J(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f12620p = r2
                    r0.f12619o = r3
                    java.lang.Object r7 = r7.f(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    v3.m2 r7 = v3.m2.f17815a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.c.a.f(java.lang.Object, e4.d):java.lang.Object");
            }
        }

        public c(i iVar, t4.p pVar) {
            this.f12614k = iVar;
            this.f12615l = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d j jVar, @n6.d e4.d dVar) {
            Object a7 = this.f12614k.a(new a(jVar, this.f12615l), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> implements i<T> {

        /* renamed from: k */
        public final /* synthetic */ i f12622k;

        public d(i iVar) {
            this.f12622k = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
            Object a7 = this.f12622k.a(new e(jVar), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e<T> implements j {

        /* renamed from: k */
        public final /* synthetic */ j<T> f12623k;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {80}, m = "emit", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n */
            public /* synthetic */ Object f12624n;

            /* renamed from: o */
            public final /* synthetic */ e<T> f12625o;

            /* renamed from: p */
            public int f12626p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(e<? super T> eVar, e4.d<? super a> dVar) {
                super(dVar);
                this.f12625o = eVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12624n = obj;
                this.f12626p |= Integer.MIN_VALUE;
                return this.f12625o.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(j<? super T> jVar) {
            this.f12623k = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(@n6.d kotlinx.coroutines.flow.i<? extends T> r5, @n6.d e4.d<? super v3.m2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.w.e.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.w$e$a r0 = (kotlinx.coroutines.flow.w.e.a) r0
                int r1 = r0.f12626p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12626p = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.w$e$a r0 = new kotlinx.coroutines.flow.w$e$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f12624n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f12626p
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                v3.e1.n(r6)
                goto L3f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                v3.e1.n(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f12623k
                r0.f12626p = r3
                java.lang.Object r5 = kotlinx.coroutines.flow.k.l0(r6, r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                v3.m2 r5 = v3.m2.f17815a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.e.f(kotlinx.coroutines.flow.i, e4.d):java.lang.Object");
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {214, 214}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class f<R, T> extends h4.o implements t4.q<j<? super R>, T, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12627o;

        /* renamed from: p */
        public /* synthetic */ Object f12628p;

        /* renamed from: q */
        public /* synthetic */ Object f12629q;

        /* renamed from: r */
        public final /* synthetic */ t4.p<T, e4.d<? super R>, Object> f12630r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(t4.p<? super T, ? super e4.d<? super R>, ? extends Object> pVar, e4.d<? super f> dVar) {
            super(3, dVar);
            this.f12630r = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            j jVar;
            Object h7 = g4.d.h();
            int i7 = this.f12627o;
            if (i7 == 0) {
                e1.n(obj);
                j jVar2 = (j) this.f12628p;
                Object obj2 = this.f12629q;
                t4.p<T, e4.d<? super R>, Object> pVar = this.f12630r;
                this.f12628p = jVar2;
                this.f12627o = 1;
                obj = pVar.J(obj2, this);
                jVar = jVar2;
                if (obj == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    e1.n(obj);
                    return m2.f17815a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                j jVar3 = (j) this.f12628p;
                e1.n(obj);
                jVar = jVar3;
            }
            this.f12628p = null;
            this.f12627o = 2;
            if (jVar.f(obj, this) == h7) {
                return h7;
            }
            return m2.f17815a;
        }

        @Override // t4.q
        @n6.e
        /* renamed from: a0 */
        public final Object I(@n6.d j<? super R> jVar, T t6, @n6.e e4.d<? super m2> dVar) {
            f fVar = new f(this.f12630r, dVar);
            fVar.f12628p = jVar;
            fVar.f12629q = t6;
            return fVar.Q(m2.f17815a);
        }
    }

    @d2
    @n6.d
    public static final <T, R> i<R> a(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super i<? extends R>>, ? extends Object> pVar) {
        return k.F0(new a(iVar, pVar));
    }

    @c2
    @n6.d
    public static final <T, R> i<R> b(@n6.d i<? extends T> iVar, @v3.b @n6.d t4.p<? super T, ? super e4.d<? super i<? extends R>>, ? extends Object> pVar) {
        return k.b2(iVar, new b(pVar, null));
    }

    @d2
    @n6.d
    public static final <T, R> i<R> c(@n6.d i<? extends T> iVar, int i7, @n6.d t4.p<? super T, ? super e4.d<? super i<? extends R>>, ? extends Object> pVar) {
        return k.G0(new c(iVar, pVar), i7);
    }

    public static /* synthetic */ i d(i iVar, int i7, t4.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = f12601a;
        }
        return k.C0(iVar, i7, pVar);
    }

    @d2
    @n6.d
    public static final <T> i<T> e(@n6.d i<? extends i<? extends T>> iVar) {
        return new d(iVar);
    }

    @d2
    @n6.d
    public static final <T> i<T> f(@n6.d i<? extends i<? extends T>> iVar, int i7) {
        if (i7 > 0) {
            return i7 == 1 ? k.F0(iVar) : new p5.g(iVar, i7, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i7).toString());
    }

    public static /* synthetic */ i g(i iVar, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = f12601a;
        }
        return k.G0(iVar, i7);
    }

    public static final int h() {
        return f12601a;
    }

    @d2
    public static /* synthetic */ void i() {
    }

    @d2
    public static /* synthetic */ void j() {
    }

    @c2
    @n6.d
    public static final <T, R> i<R> k(@n6.d i<? extends T> iVar, @v3.b @n6.d t4.p<? super T, ? super e4.d<? super R>, ? extends Object> pVar) {
        return k.b2(iVar, new f(pVar, null));
    }

    @n6.d
    public static final <T> i<T> l(@n6.d Iterable<? extends i<? extends T>> iterable) {
        return new p5.k(iterable, null, 0, null, 14, null);
    }

    @n6.d
    public static final <T> i<T> m(@n6.d i<? extends T>... iVarArr) {
        return k.Y0(x3.p.c6(iVarArr));
    }

    @c2
    @n6.d
    public static final <T, R> i<R> n(@n6.d i<? extends T> iVar, @v3.b @n6.d t4.q<? super j<? super R>, ? super T, ? super e4.d<? super m2>, ? extends Object> qVar) {
        return new p5.j(qVar, iVar, null, 0, null, 28, null);
    }
}
