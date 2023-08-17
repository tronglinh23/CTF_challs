package kotlinx.coroutines.flow;

import kotlinx.coroutines.n2;
import kotlinx.coroutines.r2;
import u4.k1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class z {

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends h4.o implements t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12726o;

        /* renamed from: p */
        public final /* synthetic */ o0 f12727p;

        /* renamed from: q */
        public final /* synthetic */ i<T> f12728q;

        /* renamed from: r */
        public final /* synthetic */ d0<T> f12729r;

        /* renamed from: s */
        public final /* synthetic */ T f12730s;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.z$a$a */
        /* loaded from: classes.dex */
        public static final class C0169a extends h4.o implements t4.p<Integer, e4.d<? super Boolean>, Object> {

            /* renamed from: o */
            public int f12731o;

            /* renamed from: p */
            public /* synthetic */ int f12732p;

            public C0169a(e4.d<? super C0169a> dVar) {
                super(2, dVar);
            }

            @Override // h4.a
            @n6.d
            public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                C0169a c0169a = new C0169a(dVar);
                c0169a.f12732p = ((Number) obj).intValue();
                return c0169a;
            }

            @Override // t4.p
            public /* bridge */ /* synthetic */ Object J(Integer num, e4.d<? super Boolean> dVar) {
                return a0(num.intValue(), dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                g4.d.h();
                if (this.f12731o == 0) {
                    e1.n(obj);
                    return h4.b.a(this.f12732p > 0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @n6.e
            public final Object a0(int i7, @n6.e e4.d<? super Boolean> dVar) {
                return ((C0169a) H(Integer.valueOf(i7), dVar)).Q(m2.f17815a);
            }
        }

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class b extends h4.o implements t4.p<m0, e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12733o;

            /* renamed from: p */
            public /* synthetic */ Object f12734p;

            /* renamed from: q */
            public final /* synthetic */ i<T> f12735q;

            /* renamed from: r */
            public final /* synthetic */ d0<T> f12736r;

            /* renamed from: s */
            public final /* synthetic */ T f12737s;

            /* renamed from: kotlinx.coroutines.flow.z$a$b$a */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0170a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f12738a;

                static {
                    int[] iArr = new int[m0.values().length];
                    iArr[m0.START.ordinal()] = 1;
                    iArr[m0.STOP.ordinal()] = 2;
                    iArr[m0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    f12738a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(i<? extends T> iVar, d0<T> d0Var, T t6, e4.d<? super b> dVar) {
                super(2, dVar);
                this.f12735q = iVar;
                this.f12736r = d0Var;
                this.f12737s = t6;
            }

            @Override // h4.a
            @n6.d
            public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                b bVar = new b(this.f12735q, this.f12736r, this.f12737s, dVar);
                bVar.f12734p = obj;
                return bVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f12733o;
                if (i7 == 0) {
                    e1.n(obj);
                    int i8 = C0170a.f12738a[((m0) this.f12734p).ordinal()];
                    if (i8 == 1) {
                        i<T> iVar = this.f12735q;
                        j jVar = this.f12736r;
                        this.f12733o = 1;
                        if (iVar.a(jVar, this) == h7) {
                            return h7;
                        }
                    } else if (i8 == 3) {
                        T t6 = this.f12737s;
                        if (t6 == k0.f12257a) {
                            this.f12736r.j();
                        } else {
                            this.f12736r.k(t6);
                        }
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
            public final Object J(@n6.d m0 m0Var, @n6.e e4.d<? super m2> dVar) {
                return ((b) H(m0Var, dVar)).Q(m2.f17815a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o0 o0Var, i<? extends T> iVar, d0<T> d0Var, T t6, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f12727p = o0Var;
            this.f12728q = iVar;
            this.f12729r = d0Var;
            this.f12730s = t6;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            return new a(this.f12727p, this.f12728q, this.f12729r, this.f12730s, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0068 A[RETURN] */
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
                int r1 = r7.f12726o
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                v3.e1.n(r8)
                goto L5c
            L21:
                v3.e1.n(r8)
                goto L8d
            L25:
                v3.e1.n(r8)
                kotlinx.coroutines.flow.o0 r8 = r7.f12727p
                kotlinx.coroutines.flow.o0$a r1 = kotlinx.coroutines.flow.o0.f12358a
                kotlinx.coroutines.flow.o0 r6 = r1.c()
                if (r8 != r6) goto L3f
                kotlinx.coroutines.flow.i<T> r8 = r7.f12728q
                kotlinx.coroutines.flow.d0<T> r1 = r7.f12729r
                r7.f12726o = r5
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                kotlinx.coroutines.flow.o0 r8 = r7.f12727p
                kotlinx.coroutines.flow.o0 r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                kotlinx.coroutines.flow.d0<T> r8 = r7.f12729r
                kotlinx.coroutines.flow.t0 r8 = r8.A()
                kotlinx.coroutines.flow.z$a$a r1 = new kotlinx.coroutines.flow.z$a$a
                r1.<init>(r5)
                r7.f12726o = r4
                java.lang.Object r8 = kotlinx.coroutines.flow.k.u0(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                kotlinx.coroutines.flow.i<T> r8 = r7.f12728q
                kotlinx.coroutines.flow.d0<T> r1 = r7.f12729r
                r7.f12726o = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                kotlinx.coroutines.flow.o0 r8 = r7.f12727p
                kotlinx.coroutines.flow.d0<T> r1 = r7.f12729r
                kotlinx.coroutines.flow.t0 r1 = r1.A()
                kotlinx.coroutines.flow.i r8 = r8.a(r1)
                kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.g0(r8)
                kotlinx.coroutines.flow.z$a$b r1 = new kotlinx.coroutines.flow.z$a$b
                kotlinx.coroutines.flow.i<T> r3 = r7.f12728q
                kotlinx.coroutines.flow.d0<T> r4 = r7.f12729r
                T r6 = r7.f12730s
                r1.<init>(r3, r4, r6, r5)
                r7.f12726o = r2
                java.lang.Object r8 = kotlinx.coroutines.flow.k.A(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                v3.m2 r8 = v3.m2.f17815a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z.a.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d kotlinx.coroutines.u0 u0Var, @n6.e e4.d<? super m2> dVar) {
            return ((a) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class b extends h4.o implements t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12739o;

        /* renamed from: p */
        public /* synthetic */ Object f12740p;

        /* renamed from: q */
        public final /* synthetic */ i<T> f12741q;

        /* renamed from: r */
        public final /* synthetic */ kotlinx.coroutines.z<t0<T>> f12742r;

        /* loaded from: classes.dex */
        public static final class a<T> implements j {

            /* renamed from: k */
            public final /* synthetic */ k1.h<e0<T>> f12743k;

            /* renamed from: l */
            public final /* synthetic */ kotlinx.coroutines.u0 f12744l;

            /* renamed from: m */
            public final /* synthetic */ kotlinx.coroutines.z<t0<T>> f12745m;

            public a(k1.h<e0<T>> hVar, kotlinx.coroutines.u0 u0Var, kotlinx.coroutines.z<t0<T>> zVar) {
                this.f12743k = hVar;
                this.f12744l = u0Var;
                this.f12745m = zVar;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [T, kotlinx.coroutines.flow.t0, kotlinx.coroutines.flow.e0] */
            @Override // kotlinx.coroutines.flow.j
            @n6.e
            public final Object f(T t6, @n6.d e4.d<? super m2> dVar) {
                m2 m2Var;
                e0<T> e0Var = this.f12743k.f17436k;
                if (e0Var != null) {
                    e0Var.setValue(t6);
                    m2Var = m2.f17815a;
                } else {
                    m2Var = null;
                }
                if (m2Var == null) {
                    kotlinx.coroutines.u0 u0Var = this.f12744l;
                    k1.h<e0<T>> hVar = this.f12743k;
                    kotlinx.coroutines.z<t0<T>> zVar = this.f12745m;
                    ?? r42 = (T) v0.a(t6);
                    zVar.d0(new g0(r42, r2.B(u0Var.getCoroutineContext())));
                    hVar.f17436k = r42;
                }
                return m2.f17815a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(i<? extends T> iVar, kotlinx.coroutines.z<t0<T>> zVar, e4.d<? super b> dVar) {
            super(2, dVar);
            this.f12741q = iVar;
            this.f12742r = zVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            b bVar = new b(this.f12741q, this.f12742r, dVar);
            bVar.f12740p = obj;
            return bVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12739o;
            try {
                if (i7 == 0) {
                    e1.n(obj);
                    kotlinx.coroutines.u0 u0Var = (kotlinx.coroutines.u0) this.f12740p;
                    k1.h hVar = new k1.h();
                    i<T> iVar = this.f12741q;
                    a aVar = new a(hVar, u0Var, this.f12742r);
                    this.f12739o = 1;
                    if (iVar.a(aVar, this) == h7) {
                        return h7;
                    }
                } else if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e1.n(obj);
                }
                return m2.f17815a;
            } catch (Throwable th) {
                this.f12742r.i(th);
                throw th;
            }
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d kotlinx.coroutines.u0 u0Var, @n6.e e4.d<? super m2> dVar) {
            return ((b) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    @n6.d
    public static final <T> i0<T> a(@n6.d d0<T> d0Var) {
        return new f0(d0Var, null);
    }

    @n6.d
    public static final <T> t0<T> b(@n6.d e0<T> e0Var) {
        return new g0(e0Var, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x002d, code lost:
        if (r3 == 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> kotlinx.coroutines.flow.n0<T> c(kotlinx.coroutines.flow.i<? extends T> r7, int r8) {
        /*
            n5.n$b r0 = n5.n.f13954d
            int r0 = r0.a()
            int r0 = d5.u.u(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof p5.e
            if (r1 == 0) goto L3d
            r1 = r7
            p5.e r1 = (p5.e) r1
            kotlinx.coroutines.flow.i r2 = r1.l()
            if (r2 == 0) goto L3d
            kotlinx.coroutines.flow.n0 r7 = new kotlinx.coroutines.flow.n0
            int r3 = r1.f14844l
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L35
        L26:
            n5.m r4 = r1.f14845m
            n5.m r5 = n5.m.SUSPEND
            r6 = 0
            if (r4 != r5) goto L30
            if (r3 != 0) goto L35
            goto L34
        L30:
            if (r8 != 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = r6
        L35:
            n5.m r8 = r1.f14845m
            e4.g r1 = r1.f14843k
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3d:
            kotlinx.coroutines.flow.n0 r8 = new kotlinx.coroutines.flow.n0
            n5.m r1 = n5.m.SUSPEND
            e4.i r2 = e4.i.f8770k
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z.c(kotlinx.coroutines.flow.i, int):kotlinx.coroutines.flow.n0");
    }

    public static final <T> n2 d(kotlinx.coroutines.u0 u0Var, e4.g gVar, i<? extends T> iVar, d0<T> d0Var, o0 o0Var, T t6) {
        return kotlinx.coroutines.j.d(u0Var, gVar, u4.l0.g(o0Var, o0.f12358a.c()) ? kotlinx.coroutines.w0.DEFAULT : kotlinx.coroutines.w0.UNDISPATCHED, new a(o0Var, iVar, d0Var, t6, null));
    }

    public static final <T> void e(kotlinx.coroutines.u0 u0Var, e4.g gVar, i<? extends T> iVar, kotlinx.coroutines.z<t0<T>> zVar) {
        kotlinx.coroutines.l.f(u0Var, gVar, null, new b(iVar, zVar, null), 2, null);
    }

    @n6.d
    public static final <T> i0<T> f(@n6.d i0<? extends T> i0Var, @n6.d t4.p<? super j<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return new y0(i0Var, pVar);
    }

    @n6.d
    public static final <T> i0<T> g(@n6.d i<? extends T> iVar, @n6.d kotlinx.coroutines.u0 u0Var, @n6.d o0 o0Var, int i7) {
        n0 c7 = c(iVar, i7);
        d0 a7 = k0.a(i7, c7.f12351b, c7.f12352c);
        return new f0(a7, d(u0Var, c7.f12353d, c7.f12350a, a7, o0Var, k0.f12257a));
    }

    public static /* synthetic */ i0 h(i iVar, kotlinx.coroutines.u0 u0Var, o0 o0Var, int i7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return k.F1(iVar, u0Var, o0Var, i7);
    }

    @n6.e
    public static final <T> Object i(@n6.d i<? extends T> iVar, @n6.d kotlinx.coroutines.u0 u0Var, @n6.d e4.d<? super t0<? extends T>> dVar) {
        n0 c7 = c(iVar, 1);
        kotlinx.coroutines.z c8 = kotlinx.coroutines.b0.c(null, 1, null);
        e(u0Var, c7.f12353d, c7.f12350a, c8);
        return c8.f0(dVar);
    }

    @n6.d
    public static final <T> t0<T> j(@n6.d i<? extends T> iVar, @n6.d kotlinx.coroutines.u0 u0Var, @n6.d o0 o0Var, T t6) {
        n0 c7 = c(iVar, 1);
        e0 a7 = v0.a(t6);
        return new g0(a7, d(u0Var, c7.f12353d, c7.f12350a, a7, o0Var, t6));
    }
}
