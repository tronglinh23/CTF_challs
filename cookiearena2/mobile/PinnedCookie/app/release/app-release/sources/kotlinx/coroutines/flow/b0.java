package kotlinx.coroutines.flow;

import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class b0 {

    /* loaded from: classes.dex */
    public static final class a<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: k */
        public final /* synthetic */ kotlinx.coroutines.flow.i[] f12090k;

        /* renamed from: l */
        public final /* synthetic */ t4.r f12091l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.b0$a$a */
        /* loaded from: classes.dex */
        public static final class C0152a extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, Object[], e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12092o;

            /* renamed from: p */
            public /* synthetic */ Object f12093p;

            /* renamed from: q */
            public /* synthetic */ Object f12094q;

            /* renamed from: r */
            public final /* synthetic */ t4.r f12095r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0152a(e4.d dVar, t4.r rVar) {
                super(3, dVar);
                this.f12095r = rVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                kotlinx.coroutines.flow.j jVar;
                Object h7 = g4.d.h();
                int i7 = this.f12092o;
                if (i7 == 0) {
                    e1.n(obj);
                    jVar = (kotlinx.coroutines.flow.j) this.f12093p;
                    Object[] objArr = (Object[]) this.f12094q;
                    t4.r rVar = this.f12095r;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f12093p = jVar;
                    this.f12092o = 1;
                    u4.i0.e(6);
                    obj = rVar.l0(obj2, obj3, obj4, this);
                    u4.i0.e(7);
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
                    jVar = (kotlinx.coroutines.flow.j) this.f12093p;
                    e1.n(obj);
                }
                this.f12093p = null;
                this.f12092o = 2;
                if (jVar.f(obj, this) == h7) {
                    return h7;
                }
                return m2.f17815a;
            }

            @Override // t4.q
            @n6.e
            /* renamed from: a0 */
            public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d Object[] objArr, @n6.e e4.d<? super m2> dVar) {
                C0152a c0152a = new C0152a(dVar, this.f12095r);
                c0152a.f12093p = jVar;
                c0152a.f12094q = objArr;
                return c0152a.Q(m2.f17815a);
            }
        }

        public a(kotlinx.coroutines.flow.i[] iVarArr, t4.r rVar) {
            this.f12090k = iVarArr;
            this.f12091l = rVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            Object a7 = p5.m.a(jVar, this.f12090k, b0.a(), new C0152a(null, this.f12091l), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: k */
        public final /* synthetic */ kotlinx.coroutines.flow.i[] f12096k;

        /* renamed from: l */
        public final /* synthetic */ t4.s f12097l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, Object[], e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12098o;

            /* renamed from: p */
            public /* synthetic */ Object f12099p;

            /* renamed from: q */
            public /* synthetic */ Object f12100q;

            /* renamed from: r */
            public final /* synthetic */ t4.s f12101r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e4.d dVar, t4.s sVar) {
                super(3, dVar);
                this.f12101r = sVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                kotlinx.coroutines.flow.j jVar;
                Object h7 = g4.d.h();
                int i7 = this.f12098o;
                if (i7 == 0) {
                    e1.n(obj);
                    jVar = (kotlinx.coroutines.flow.j) this.f12099p;
                    Object[] objArr = (Object[]) this.f12100q;
                    t4.s sVar = this.f12101r;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f12099p = jVar;
                    this.f12098o = 1;
                    u4.i0.e(6);
                    obj = sVar.P(obj2, obj3, obj4, obj5, this);
                    u4.i0.e(7);
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
                    jVar = (kotlinx.coroutines.flow.j) this.f12099p;
                    e1.n(obj);
                }
                this.f12099p = null;
                this.f12098o = 2;
                if (jVar.f(obj, this) == h7) {
                    return h7;
                }
                return m2.f17815a;
            }

            @Override // t4.q
            @n6.e
            /* renamed from: a0 */
            public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d Object[] objArr, @n6.e e4.d<? super m2> dVar) {
                a aVar = new a(dVar, this.f12101r);
                aVar.f12099p = jVar;
                aVar.f12100q = objArr;
                return aVar.Q(m2.f17815a);
            }
        }

        public b(kotlinx.coroutines.flow.i[] iVarArr, t4.s sVar) {
            this.f12096k = iVarArr;
            this.f12097l = sVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            Object a7 = p5.m.a(jVar, this.f12096k, b0.a(), new a(null, this.f12097l), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: k */
        public final /* synthetic */ kotlinx.coroutines.flow.i[] f12102k;

        /* renamed from: l */
        public final /* synthetic */ t4.t f12103l;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, Object[], e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12104o;

            /* renamed from: p */
            public /* synthetic */ Object f12105p;

            /* renamed from: q */
            public /* synthetic */ Object f12106q;

            /* renamed from: r */
            public final /* synthetic */ t4.t f12107r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e4.d dVar, t4.t tVar) {
                super(3, dVar);
                this.f12107r = tVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                kotlinx.coroutines.flow.j jVar;
                Object h7 = g4.d.h();
                int i7 = this.f12104o;
                if (i7 == 0) {
                    e1.n(obj);
                    jVar = (kotlinx.coroutines.flow.j) this.f12105p;
                    Object[] objArr = (Object[]) this.f12106q;
                    t4.t tVar = this.f12107r;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f12105p = jVar;
                    this.f12104o = 1;
                    u4.i0.e(6);
                    obj = tVar.B(obj2, obj3, obj4, obj5, obj6, this);
                    u4.i0.e(7);
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
                    jVar = (kotlinx.coroutines.flow.j) this.f12105p;
                    e1.n(obj);
                }
                this.f12105p = null;
                this.f12104o = 2;
                if (jVar.f(obj, this) == h7) {
                    return h7;
                }
                return m2.f17815a;
            }

            @Override // t4.q
            @n6.e
            /* renamed from: a0 */
            public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d Object[] objArr, @n6.e e4.d<? super m2> dVar) {
                a aVar = new a(dVar, this.f12107r);
                aVar.f12105p = jVar;
                aVar.f12106q = objArr;
                return aVar.Q(m2.f17815a);
            }
        }

        public c(kotlinx.coroutines.flow.i[] iVarArr, t4.t tVar) {
            this.f12102k = iVarArr;
            this.f12103l = tVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            Object a7 = p5.m.a(jVar, this.f12102k, b0.a(), new a(null, this.f12103l), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: k */
        public final /* synthetic */ kotlinx.coroutines.flow.i f12108k;

        /* renamed from: l */
        public final /* synthetic */ kotlinx.coroutines.flow.i f12109l;

        /* renamed from: m */
        public final /* synthetic */ t4.q f12110m;

        public d(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.flow.i iVar2, t4.q qVar) {
            this.f12108k = iVar;
            this.f12109l = iVar2;
            this.f12110m = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d e4.d<? super m2> dVar) {
            Object a7 = p5.m.a(jVar, new kotlinx.coroutines.flow.i[]{this.f12108k, this.f12109l}, b0.a(), new g(this.f12110m, null), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: k */
        public final /* synthetic */ kotlinx.coroutines.flow.i[] f12111k;

        /* renamed from: l */
        public final /* synthetic */ t4.p f12112l;

        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n */
            public /* synthetic */ Object f12113n;

            /* renamed from: o */
            public int f12114o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e4.d dVar) {
                super(dVar);
                e.this = r1;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12113n = obj;
                this.f12114o |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        public e(kotlinx.coroutines.flow.i[] iVarArr, t4.p pVar) {
            this.f12111k = iVarArr;
            this.f12112l = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d e4.d<? super m2> dVar) {
            kotlinx.coroutines.flow.i[] iVarArr = this.f12111k;
            u4.l0.w();
            h hVar = new h(this.f12111k);
            u4.l0.w();
            Object a7 = p5.m.a(jVar, iVarArr, hVar, new i(this.f12112l, null), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }

        @n6.e
        public Object d(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            u4.i0.e(4);
            new a(dVar);
            u4.i0.e(5);
            kotlinx.coroutines.flow.i[] iVarArr = this.f12111k;
            u4.l0.w();
            h hVar = new h(this.f12111k);
            u4.l0.w();
            i iVar = new i(this.f12112l, null);
            u4.i0.e(0);
            p5.m.a(jVar, iVarArr, hVar, iVar, dVar);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: k */
        public final /* synthetic */ kotlinx.coroutines.flow.i[] f12116k;

        /* renamed from: l */
        public final /* synthetic */ t4.p f12117l;

        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n */
            public /* synthetic */ Object f12118n;

            /* renamed from: o */
            public int f12119o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e4.d dVar) {
                super(dVar);
                f.this = r1;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12118n = obj;
                this.f12119o |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        public f(kotlinx.coroutines.flow.i[] iVarArr, t4.p pVar) {
            this.f12116k = iVarArr;
            this.f12117l = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d e4.d<? super m2> dVar) {
            kotlinx.coroutines.flow.i[] iVarArr = this.f12116k;
            u4.l0.w();
            j jVar2 = new j(this.f12116k);
            u4.l0.w();
            Object a7 = p5.m.a(jVar, iVarArr, jVar2, new k(this.f12117l, null), dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }

        @n6.e
        public Object d(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            u4.i0.e(4);
            new a(dVar);
            u4.i0.e(5);
            kotlinx.coroutines.flow.i[] iVarArr = this.f12116k;
            u4.l0.w();
            j jVar2 = new j(this.f12116k);
            u4.l0.w();
            k kVar = new k(this.f12117l, null);
            u4.i0.e(0);
            p5.m.a(jVar, iVarArr, jVar2, kVar, dVar);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class g<R> extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, Object[], e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12121o;

        /* renamed from: p */
        public /* synthetic */ Object f12122p;

        /* renamed from: q */
        public /* synthetic */ Object f12123q;

        /* renamed from: r */
        public final /* synthetic */ t4.q<T1, T2, e4.d<? super R>, Object> f12124r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(t4.q<? super T1, ? super T2, ? super e4.d<? super R>, ? extends Object> qVar, e4.d<? super g> dVar) {
            super(3, dVar);
            this.f12124r = qVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            kotlinx.coroutines.flow.j jVar;
            Object h7 = g4.d.h();
            int i7 = this.f12121o;
            if (i7 == 0) {
                e1.n(obj);
                jVar = (kotlinx.coroutines.flow.j) this.f12122p;
                Object[] objArr = (Object[]) this.f12123q;
                t4.q<T1, T2, e4.d<? super R>, Object> qVar = this.f12124r;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f12122p = jVar;
                this.f12121o = 1;
                obj = qVar.I(obj2, obj3, this);
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
                jVar = (kotlinx.coroutines.flow.j) this.f12122p;
                e1.n(obj);
            }
            this.f12122p = null;
            this.f12121o = 2;
            if (jVar.f(obj, this) == h7) {
                return h7;
            }
            return m2.f17815a;
        }

        @Override // t4.q
        @n6.e
        /* renamed from: a0 */
        public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d Object[] objArr, @n6.e e4.d<? super m2> dVar) {
            g gVar = new g(this.f12124r, dVar);
            gVar.f12122p = jVar;
            gVar.f12123q = objArr;
            return gVar.Q(m2.f17815a);
        }
    }

    /* loaded from: classes.dex */
    public static final class h<T> extends u4.n0 implements t4.a<T[]> {

        /* renamed from: l */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f12125l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(kotlinx.coroutines.flow.i<? extends T>[] iVarArr) {
            super(0);
            this.f12125l = iVarArr;
        }

        @Override // t4.a
        @n6.e
        /* renamed from: b */
        public final T[] n() {
            int length = this.f12125l.length;
            u4.l0.y(0, "T?");
            return (T[]) new Object[length];
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", f = "Zip.kt", i = {}, l = {238, 238}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class i<R, T> extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12126o;

        /* renamed from: p */
        public /* synthetic */ Object f12127p;

        /* renamed from: q */
        public /* synthetic */ Object f12128q;

        /* renamed from: r */
        public final /* synthetic */ t4.p<T[], e4.d<? super R>, Object> f12129r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(t4.p<? super T[], ? super e4.d<? super R>, ? extends Object> pVar, e4.d<? super i> dVar) {
            super(3, dVar);
            this.f12129r = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            kotlinx.coroutines.flow.j jVar;
            Object h7 = g4.d.h();
            int i7 = this.f12126o;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar2 = (kotlinx.coroutines.flow.j) this.f12127p;
                Object[] objArr = (Object[]) this.f12128q;
                t4.p<T[], e4.d<? super R>, Object> pVar = this.f12129r;
                this.f12127p = jVar2;
                this.f12126o = 1;
                obj = pVar.J(objArr, this);
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
                kotlinx.coroutines.flow.j jVar3 = (kotlinx.coroutines.flow.j) this.f12127p;
                e1.n(obj);
                jVar = jVar3;
            }
            this.f12127p = null;
            this.f12126o = 2;
            if (jVar.f(obj, this) == h7) {
                return h7;
            }
            return m2.f17815a;
        }

        @Override // t4.q
        @n6.e
        /* renamed from: a0 */
        public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d T[] tArr, @n6.e e4.d<? super m2> dVar) {
            i iVar = new i(this.f12129r, dVar);
            iVar.f12127p = jVar;
            iVar.f12128q = tArr;
            return iVar.Q(m2.f17815a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @n6.e
        public final Object c0(@n6.d Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12127p;
            Object J = this.f12129r.J((Object[]) this.f12128q, this);
            u4.i0.e(0);
            jVar.f(J, this);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j<T> extends u4.n0 implements t4.a<T[]> {

        /* renamed from: l */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f12130l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(kotlinx.coroutines.flow.i<T>[] iVarArr) {
            super(0);
            this.f12130l = iVarArr;
        }

        @Override // t4.a
        @n6.e
        /* renamed from: b */
        public final T[] n() {
            int length = this.f12130l.length;
            u4.l0.y(0, "T?");
            return (T[]) new Object[length];
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {292, 292}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class k<R, T> extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12131o;

        /* renamed from: p */
        public /* synthetic */ Object f12132p;

        /* renamed from: q */
        public /* synthetic */ Object f12133q;

        /* renamed from: r */
        public final /* synthetic */ t4.p<T[], e4.d<? super R>, Object> f12134r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(t4.p<? super T[], ? super e4.d<? super R>, ? extends Object> pVar, e4.d<? super k> dVar) {
            super(3, dVar);
            this.f12134r = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            kotlinx.coroutines.flow.j jVar;
            Object h7 = g4.d.h();
            int i7 = this.f12131o;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar2 = (kotlinx.coroutines.flow.j) this.f12132p;
                Object[] objArr = (Object[]) this.f12133q;
                t4.p<T[], e4.d<? super R>, Object> pVar = this.f12134r;
                this.f12132p = jVar2;
                this.f12131o = 1;
                obj = pVar.J(objArr, this);
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
                kotlinx.coroutines.flow.j jVar3 = (kotlinx.coroutines.flow.j) this.f12132p;
                e1.n(obj);
                jVar = jVar3;
            }
            this.f12132p = null;
            this.f12131o = 2;
            if (jVar.f(obj, this) == h7) {
                return h7;
            }
            return m2.f17815a;
        }

        @Override // t4.q
        @n6.e
        /* renamed from: a0 */
        public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d T[] tArr, @n6.e e4.d<? super m2> dVar) {
            k kVar = new k(this.f12134r, dVar);
            kVar.f12132p = jVar;
            kVar.f12133q = tArr;
            return kVar.Q(m2.f17815a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @n6.e
        public final Object c0(@n6.d Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12132p;
            Object J = this.f12134r.J((Object[]) this.f12133q, this);
            u4.i0.e(0);
            jVar.f(J, this);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class l<R> extends h4.o implements t4.p<kotlinx.coroutines.flow.j<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12135o;

        /* renamed from: p */
        public /* synthetic */ Object f12136p;

        /* renamed from: q */
        public final /* synthetic */ kotlinx.coroutines.flow.i[] f12137q;

        /* renamed from: r */
        public final /* synthetic */ t4.r f12138r;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, Object[], e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12139o;

            /* renamed from: p */
            public /* synthetic */ Object f12140p;

            /* renamed from: q */
            public /* synthetic */ Object f12141q;

            /* renamed from: r */
            public final /* synthetic */ t4.r f12142r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e4.d dVar, t4.r rVar) {
                super(3, dVar);
                this.f12142r = rVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f12139o;
                if (i7 == 0) {
                    e1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12140p;
                    Object[] objArr = (Object[]) this.f12141q;
                    t4.r rVar = this.f12142r;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f12139o = 1;
                    u4.i0.e(6);
                    Object l02 = rVar.l0(jVar, obj2, obj3, this);
                    u4.i0.e(7);
                    if (l02 == h7) {
                        return h7;
                    }
                } else if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e1.n(obj);
                }
                return m2.f17815a;
            }

            @Override // t4.q
            @n6.e
            /* renamed from: a0 */
            public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d Object[] objArr, @n6.e e4.d<? super m2> dVar) {
                a aVar = new a(dVar, this.f12142r);
                aVar.f12140p = jVar;
                aVar.f12141q = objArr;
                return aVar.Q(m2.f17815a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(kotlinx.coroutines.flow.i[] iVarArr, e4.d dVar, t4.r rVar) {
            super(2, dVar);
            this.f12137q = iVarArr;
            this.f12138r = rVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            l lVar = new l(this.f12137q, dVar, this.f12138r);
            lVar.f12136p = obj;
            return lVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12135o;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12136p;
                kotlinx.coroutines.flow.i[] iVarArr = this.f12137q;
                t4.a a7 = b0.a();
                a aVar = new a(null, this.f12138r);
                this.f12135o = 1;
                if (p5.m.a(jVar, iVarArr, a7, aVar, this) == h7) {
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
        public final Object J(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.e e4.d<? super m2> dVar) {
            return ((l) H(jVar, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class m<R> extends h4.o implements t4.p<kotlinx.coroutines.flow.j<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12143o;

        /* renamed from: p */
        public /* synthetic */ Object f12144p;

        /* renamed from: q */
        public final /* synthetic */ kotlinx.coroutines.flow.i[] f12145q;

        /* renamed from: r */
        public final /* synthetic */ t4.r f12146r;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, Object[], e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12147o;

            /* renamed from: p */
            public /* synthetic */ Object f12148p;

            /* renamed from: q */
            public /* synthetic */ Object f12149q;

            /* renamed from: r */
            public final /* synthetic */ t4.r f12150r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e4.d dVar, t4.r rVar) {
                super(3, dVar);
                this.f12150r = rVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f12147o;
                if (i7 == 0) {
                    e1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12148p;
                    Object[] objArr = (Object[]) this.f12149q;
                    t4.r rVar = this.f12150r;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f12147o = 1;
                    u4.i0.e(6);
                    Object l02 = rVar.l0(jVar, obj2, obj3, this);
                    u4.i0.e(7);
                    if (l02 == h7) {
                        return h7;
                    }
                } else if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e1.n(obj);
                }
                return m2.f17815a;
            }

            @Override // t4.q
            @n6.e
            /* renamed from: a0 */
            public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d Object[] objArr, @n6.e e4.d<? super m2> dVar) {
                a aVar = new a(dVar, this.f12150r);
                aVar.f12148p = jVar;
                aVar.f12149q = objArr;
                return aVar.Q(m2.f17815a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(kotlinx.coroutines.flow.i[] iVarArr, e4.d dVar, t4.r rVar) {
            super(2, dVar);
            this.f12145q = iVarArr;
            this.f12146r = rVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            m mVar = new m(this.f12145q, dVar, this.f12146r);
            mVar.f12144p = obj;
            return mVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12143o;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12144p;
                kotlinx.coroutines.flow.i[] iVarArr = this.f12145q;
                t4.a a7 = b0.a();
                a aVar = new a(null, this.f12146r);
                this.f12143o = 1;
                if (p5.m.a(jVar, iVarArr, a7, aVar, this) == h7) {
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
        public final Object J(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.e e4.d<? super m2> dVar) {
            return ((m) H(jVar, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class n<R> extends h4.o implements t4.p<kotlinx.coroutines.flow.j<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12151o;

        /* renamed from: p */
        public /* synthetic */ Object f12152p;

        /* renamed from: q */
        public final /* synthetic */ kotlinx.coroutines.flow.i[] f12153q;

        /* renamed from: r */
        public final /* synthetic */ t4.s f12154r;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, Object[], e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12155o;

            /* renamed from: p */
            public /* synthetic */ Object f12156p;

            /* renamed from: q */
            public /* synthetic */ Object f12157q;

            /* renamed from: r */
            public final /* synthetic */ t4.s f12158r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e4.d dVar, t4.s sVar) {
                super(3, dVar);
                this.f12158r = sVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f12155o;
                if (i7 == 0) {
                    e1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12156p;
                    Object[] objArr = (Object[]) this.f12157q;
                    t4.s sVar = this.f12158r;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f12155o = 1;
                    u4.i0.e(6);
                    Object P = sVar.P(jVar, obj2, obj3, obj4, this);
                    u4.i0.e(7);
                    if (P == h7) {
                        return h7;
                    }
                } else if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e1.n(obj);
                }
                return m2.f17815a;
            }

            @Override // t4.q
            @n6.e
            /* renamed from: a0 */
            public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d Object[] objArr, @n6.e e4.d<? super m2> dVar) {
                a aVar = new a(dVar, this.f12158r);
                aVar.f12156p = jVar;
                aVar.f12157q = objArr;
                return aVar.Q(m2.f17815a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(kotlinx.coroutines.flow.i[] iVarArr, e4.d dVar, t4.s sVar) {
            super(2, dVar);
            this.f12153q = iVarArr;
            this.f12154r = sVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            n nVar = new n(this.f12153q, dVar, this.f12154r);
            nVar.f12152p = obj;
            return nVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12151o;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12152p;
                kotlinx.coroutines.flow.i[] iVarArr = this.f12153q;
                t4.a a7 = b0.a();
                a aVar = new a(null, this.f12154r);
                this.f12151o = 1;
                if (p5.m.a(jVar, iVarArr, a7, aVar, this) == h7) {
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
        public final Object J(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.e e4.d<? super m2> dVar) {
            return ((n) H(jVar, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o<R> extends h4.o implements t4.p<kotlinx.coroutines.flow.j<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12159o;

        /* renamed from: p */
        public /* synthetic */ Object f12160p;

        /* renamed from: q */
        public final /* synthetic */ kotlinx.coroutines.flow.i[] f12161q;

        /* renamed from: r */
        public final /* synthetic */ t4.t f12162r;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, Object[], e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12163o;

            /* renamed from: p */
            public /* synthetic */ Object f12164p;

            /* renamed from: q */
            public /* synthetic */ Object f12165q;

            /* renamed from: r */
            public final /* synthetic */ t4.t f12166r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e4.d dVar, t4.t tVar) {
                super(3, dVar);
                this.f12166r = tVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f12163o;
                if (i7 == 0) {
                    e1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12164p;
                    Object[] objArr = (Object[]) this.f12165q;
                    t4.t tVar = this.f12166r;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f12163o = 1;
                    u4.i0.e(6);
                    Object B = tVar.B(jVar, obj2, obj3, obj4, obj5, this);
                    u4.i0.e(7);
                    if (B == h7) {
                        return h7;
                    }
                } else if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e1.n(obj);
                }
                return m2.f17815a;
            }

            @Override // t4.q
            @n6.e
            /* renamed from: a0 */
            public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d Object[] objArr, @n6.e e4.d<? super m2> dVar) {
                a aVar = new a(dVar, this.f12166r);
                aVar.f12164p = jVar;
                aVar.f12165q = objArr;
                return aVar.Q(m2.f17815a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(kotlinx.coroutines.flow.i[] iVarArr, e4.d dVar, t4.t tVar) {
            super(2, dVar);
            this.f12161q = iVarArr;
            this.f12162r = tVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            o oVar = new o(this.f12161q, dVar, this.f12162r);
            oVar.f12160p = obj;
            return oVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12159o;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12160p;
                kotlinx.coroutines.flow.i[] iVarArr = this.f12161q;
                t4.a a7 = b0.a();
                a aVar = new a(null, this.f12162r);
                this.f12159o = 1;
                if (p5.m.a(jVar, iVarArr, a7, aVar, this) == h7) {
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
        public final Object J(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.e e4.d<? super m2> dVar) {
            return ((o) H(jVar, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class p<R> extends h4.o implements t4.p<kotlinx.coroutines.flow.j<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12167o;

        /* renamed from: p */
        public /* synthetic */ Object f12168p;

        /* renamed from: q */
        public final /* synthetic */ kotlinx.coroutines.flow.i[] f12169q;

        /* renamed from: r */
        public final /* synthetic */ t4.u f12170r;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, Object[], e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12171o;

            /* renamed from: p */
            public /* synthetic */ Object f12172p;

            /* renamed from: q */
            public /* synthetic */ Object f12173q;

            /* renamed from: r */
            public final /* synthetic */ t4.u f12174r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e4.d dVar, t4.u uVar) {
                super(3, dVar);
                this.f12174r = uVar;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f12171o;
                if (i7 == 0) {
                    e1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12172p;
                    Object[] objArr = (Object[]) this.f12173q;
                    t4.u uVar = this.f12174r;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f12171o = 1;
                    u4.i0.e(6);
                    Object Z = uVar.Z(jVar, obj2, obj3, obj4, obj5, obj6, this);
                    u4.i0.e(7);
                    if (Z == h7) {
                        return h7;
                    }
                } else if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e1.n(obj);
                }
                return m2.f17815a;
            }

            @Override // t4.q
            @n6.e
            /* renamed from: a0 */
            public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d Object[] objArr, @n6.e e4.d<? super m2> dVar) {
                a aVar = new a(dVar, this.f12174r);
                aVar.f12172p = jVar;
                aVar.f12173q = objArr;
                return aVar.Q(m2.f17815a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(kotlinx.coroutines.flow.i[] iVarArr, e4.d dVar, t4.u uVar) {
            super(2, dVar);
            this.f12169q = iVarArr;
            this.f12170r = uVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            p pVar = new p(this.f12169q, dVar, this.f12170r);
            pVar.f12168p = obj;
            return pVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12167o;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12168p;
                kotlinx.coroutines.flow.i[] iVarArr = this.f12169q;
                t4.a a7 = b0.a();
                a aVar = new a(null, this.f12170r);
                this.f12167o = 1;
                if (p5.m.a(jVar, iVarArr, a7, aVar, this) == h7) {
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
        public final Object J(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.e e4.d<? super m2> dVar) {
            return ((p) H(jVar, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class q<R> extends h4.o implements t4.p<kotlinx.coroutines.flow.j<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12175o;

        /* renamed from: p */
        public /* synthetic */ Object f12176p;

        /* renamed from: q */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f12177q;

        /* renamed from: r */
        public final /* synthetic */ t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> f12178r;

        /* loaded from: classes.dex */
        public static final class a<T> extends u4.n0 implements t4.a<T[]> {

            /* renamed from: l */
            public final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f12179l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr) {
                super(0);
                this.f12179l = iVarArr;
            }

            @Override // t4.a
            @n6.e
            /* renamed from: b */
            public final T[] n() {
                int length = this.f12179l.length;
                u4.l0.y(0, "T?");
                return (T[]) new Object[length];
            }
        }

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class b<T> extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12180o;

            /* renamed from: p */
            public /* synthetic */ Object f12181p;

            /* renamed from: q */
            public /* synthetic */ Object f12182q;

            /* renamed from: r */
            public final /* synthetic */ t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> f12183r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(t4.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super e4.d<? super m2>, ? extends Object> qVar, e4.d<? super b> dVar) {
                super(3, dVar);
                this.f12183r = qVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f12180o;
                if (i7 == 0) {
                    e1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12181p;
                    Object[] objArr = (Object[]) this.f12182q;
                    t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> qVar = this.f12183r;
                    this.f12181p = null;
                    this.f12180o = 1;
                    if (qVar.I(jVar, objArr, this) == h7) {
                        return h7;
                    }
                } else if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e1.n(obj);
                }
                return m2.f17815a;
            }

            @Override // t4.q
            @n6.e
            /* renamed from: a0 */
            public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d T[] tArr, @n6.e e4.d<? super m2> dVar) {
                b bVar = new b(this.f12183r, dVar);
                bVar.f12181p = jVar;
                bVar.f12182q = tArr;
                return bVar.Q(m2.f17815a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @n6.e
            public final Object c0(@n6.d Object obj) {
                this.f12183r.I((kotlinx.coroutines.flow.j) this.f12181p, (Object[]) this.f12182q, this);
                return m2.f17815a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, t4.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super e4.d<? super m2>, ? extends Object> qVar, e4.d<? super q> dVar) {
            super(2, dVar);
            this.f12177q = iVarArr;
            this.f12178r = qVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            q qVar = new q(this.f12177q, this.f12178r, dVar);
            qVar.f12176p = obj;
            return qVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12175o;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12176p;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.f12177q;
                u4.l0.w();
                a aVar = new a(this.f12177q);
                u4.l0.w();
                b bVar = new b(this.f12178r, null);
                this.f12175o = 1;
                if (p5.m.a(jVar, iVarArr, aVar, bVar, this) == h7) {
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
        public final Object J(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.e e4.d<? super m2> dVar) {
            return ((q) H(jVar, dVar)).Q(m2.f17815a);
        }

        @n6.e
        public final Object c0(@n6.d Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12176p;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.f12177q;
            u4.l0.w();
            a aVar = new a(this.f12177q);
            u4.l0.w();
            b bVar = new b(this.f12178r, null);
            u4.i0.e(0);
            p5.m.a(jVar, iVarArr, aVar, bVar, this);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class r<R> extends h4.o implements t4.p<kotlinx.coroutines.flow.j<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12184o;

        /* renamed from: p */
        public /* synthetic */ Object f12185p;

        /* renamed from: q */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f12186q;

        /* renamed from: r */
        public final /* synthetic */ t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> f12187r;

        /* loaded from: classes.dex */
        public static final class a<T> extends u4.n0 implements t4.a<T[]> {

            /* renamed from: l */
            public final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f12188l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.flow.i<T>[] iVarArr) {
                super(0);
                this.f12188l = iVarArr;
            }

            @Override // t4.a
            @n6.e
            /* renamed from: b */
            public final T[] n() {
                int length = this.f12188l.length;
                u4.l0.y(0, "T?");
                return (T[]) new Object[length];
            }
        }

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class b<T> extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12189o;

            /* renamed from: p */
            public /* synthetic */ Object f12190p;

            /* renamed from: q */
            public /* synthetic */ Object f12191q;

            /* renamed from: r */
            public final /* synthetic */ t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> f12192r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(t4.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super e4.d<? super m2>, ? extends Object> qVar, e4.d<? super b> dVar) {
                super(3, dVar);
                this.f12192r = qVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f12189o;
                if (i7 == 0) {
                    e1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12190p;
                    Object[] objArr = (Object[]) this.f12191q;
                    t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> qVar = this.f12192r;
                    this.f12190p = null;
                    this.f12189o = 1;
                    if (qVar.I(jVar, objArr, this) == h7) {
                        return h7;
                    }
                } else if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e1.n(obj);
                }
                return m2.f17815a;
            }

            @Override // t4.q
            @n6.e
            /* renamed from: a0 */
            public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d T[] tArr, @n6.e e4.d<? super m2> dVar) {
                b bVar = new b(this.f12192r, dVar);
                bVar.f12190p = jVar;
                bVar.f12191q = tArr;
                return bVar.Q(m2.f17815a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @n6.e
            public final Object c0(@n6.d Object obj) {
                this.f12192r.I((kotlinx.coroutines.flow.j) this.f12190p, (Object[]) this.f12191q, this);
                return m2.f17815a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(kotlinx.coroutines.flow.i<T>[] iVarArr, t4.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super e4.d<? super m2>, ? extends Object> qVar, e4.d<? super r> dVar) {
            super(2, dVar);
            this.f12186q = iVarArr;
            this.f12187r = qVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            r rVar = new r(this.f12186q, this.f12187r, dVar);
            rVar.f12185p = obj;
            return rVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12184o;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12185p;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.f12186q;
                u4.l0.w();
                a aVar = new a(this.f12186q);
                u4.l0.w();
                b bVar = new b(this.f12187r, null);
                this.f12184o = 1;
                if (p5.m.a(jVar, iVarArr, aVar, bVar, this) == h7) {
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
        public final Object J(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.e e4.d<? super m2> dVar) {
            return ((r) H(jVar, dVar)).Q(m2.f17815a);
        }

        @n6.e
        public final Object c0(@n6.d Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12185p;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.f12186q;
            u4.l0.w();
            a aVar = new a(this.f12186q);
            u4.l0.w();
            b bVar = new b(this.f12187r, null);
            u4.i0.e(0);
            p5.m.a(jVar, iVarArr, aVar, bVar, this);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class s<R> extends h4.o implements t4.p<kotlinx.coroutines.flow.j<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12193o;

        /* renamed from: p */
        public /* synthetic */ Object f12194p;

        /* renamed from: q */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f12195q;

        /* renamed from: r */
        public final /* synthetic */ t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> f12196r;

        @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class a<T> extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> {

            /* renamed from: o */
            public int f12197o;

            /* renamed from: p */
            public /* synthetic */ Object f12198p;

            /* renamed from: q */
            public /* synthetic */ Object f12199q;

            /* renamed from: r */
            public final /* synthetic */ t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> f12200r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(t4.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super e4.d<? super m2>, ? extends Object> qVar, e4.d<? super a> dVar) {
                super(3, dVar);
                this.f12200r = qVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f12197o;
                if (i7 == 0) {
                    e1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12198p;
                    Object[] objArr = (Object[]) this.f12199q;
                    t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> qVar = this.f12200r;
                    this.f12198p = null;
                    this.f12197o = 1;
                    if (qVar.I(jVar, objArr, this) == h7) {
                        return h7;
                    }
                } else if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e1.n(obj);
                }
                return m2.f17815a;
            }

            @Override // t4.q
            @n6.e
            /* renamed from: a0 */
            public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d T[] tArr, @n6.e e4.d<? super m2> dVar) {
                a aVar = new a(this.f12200r, dVar);
                aVar.f12198p = jVar;
                aVar.f12199q = tArr;
                return aVar.Q(m2.f17815a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @n6.e
            public final Object c0(@n6.d Object obj) {
                this.f12200r.I((kotlinx.coroutines.flow.j) this.f12198p, (Object[]) this.f12199q, this);
                return m2.f17815a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, t4.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super e4.d<? super m2>, ? extends Object> qVar, e4.d<? super s> dVar) {
            super(2, dVar);
            this.f12195q = iVarArr;
            this.f12196r = qVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            s sVar = new s(this.f12195q, this.f12196r, dVar);
            sVar.f12194p = obj;
            return sVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12193o;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12194p;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.f12195q;
                t4.a a7 = b0.a();
                u4.l0.w();
                a aVar = new a(this.f12196r, null);
                this.f12193o = 1;
                if (p5.m.a(jVar, iVarArr, a7, aVar, this) == h7) {
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
        public final Object J(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.e e4.d<? super m2> dVar) {
            return ((s) H(jVar, dVar)).Q(m2.f17815a);
        }

        @n6.e
        public final Object c0(@n6.d Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12194p;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.f12195q;
            t4.a a7 = b0.a();
            u4.l0.w();
            a aVar = new a(this.f12196r, null);
            u4.i0.e(0);
            p5.m.a(jVar, iVarArr, a7, aVar, this);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class t<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: k */
        public final /* synthetic */ kotlinx.coroutines.flow.i[] f12201k;

        /* renamed from: l */
        public final /* synthetic */ t4.p f12202l;

        /* loaded from: classes.dex */
        public static final class a extends h4.d {

            /* renamed from: n */
            public /* synthetic */ Object f12203n;

            /* renamed from: o */
            public int f12204o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e4.d dVar) {
                super(dVar);
                t.this = r1;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f12203n = obj;
                this.f12204o |= Integer.MIN_VALUE;
                return t.this.a(null, this);
            }
        }

        public t(kotlinx.coroutines.flow.i[] iVarArr, t4.p pVar) {
            this.f12201k = iVarArr;
            this.f12202l = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d e4.d<? super m2> dVar) {
            kotlinx.coroutines.flow.i[] iVarArr = this.f12201k;
            t4.a a7 = b0.a();
            u4.l0.w();
            Object a8 = p5.m.a(jVar, iVarArr, a7, new u(this.f12202l, null), dVar);
            return a8 == g4.d.h() ? a8 : m2.f17815a;
        }

        @n6.e
        public Object d(@n6.d kotlinx.coroutines.flow.j jVar, @n6.d e4.d dVar) {
            u4.i0.e(4);
            new a(dVar);
            u4.i0.e(5);
            kotlinx.coroutines.flow.i[] iVarArr = this.f12201k;
            t4.a a7 = b0.a();
            u4.l0.w();
            u uVar = new u(this.f12202l, null);
            u4.i0.e(0);
            p5.m.a(jVar, iVarArr, a7, uVar, dVar);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {262, 262}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class u<R, T> extends h4.o implements t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> {

        /* renamed from: o */
        public int f12206o;

        /* renamed from: p */
        public /* synthetic */ Object f12207p;

        /* renamed from: q */
        public /* synthetic */ Object f12208q;

        /* renamed from: r */
        public final /* synthetic */ t4.p<T[], e4.d<? super R>, Object> f12209r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(t4.p<? super T[], ? super e4.d<? super R>, ? extends Object> pVar, e4.d<? super u> dVar) {
            super(3, dVar);
            this.f12209r = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            kotlinx.coroutines.flow.j jVar;
            Object h7 = g4.d.h();
            int i7 = this.f12206o;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar2 = (kotlinx.coroutines.flow.j) this.f12207p;
                Object[] objArr = (Object[]) this.f12208q;
                t4.p<T[], e4.d<? super R>, Object> pVar = this.f12209r;
                this.f12207p = jVar2;
                this.f12206o = 1;
                obj = pVar.J(objArr, this);
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
                kotlinx.coroutines.flow.j jVar3 = (kotlinx.coroutines.flow.j) this.f12207p;
                e1.n(obj);
                jVar = jVar3;
            }
            this.f12207p = null;
            this.f12206o = 2;
            if (jVar.f(obj, this) == h7) {
                return h7;
            }
            return m2.f17815a;
        }

        @Override // t4.q
        @n6.e
        /* renamed from: a0 */
        public final Object I(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d T[] tArr, @n6.e e4.d<? super m2> dVar) {
            u uVar = new u(this.f12209r, dVar);
            uVar.f12207p = jVar;
            uVar.f12208q = tArr;
            return uVar.Q(m2.f17815a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @n6.e
        public final Object c0(@n6.d Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f12207p;
            Object J = this.f12209r.J((Object[]) this.f12208q, this);
            u4.i0.e(0);
            jVar.f(J, this);
            u4.i0.e(1);
            return m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends u4.n0 implements t4.a {

        /* renamed from: l */
        public static final v f12210l = new v();

        public v() {
            super(0);
        }

        @Override // t4.a
        @n6.e
        /* renamed from: b */
        public final Void n() {
            return null;
        }
    }

    public static final /* synthetic */ t4.a a() {
        return r();
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> b(Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, t4.p<? super T[], ? super e4.d<? super R>, ? extends Object> pVar) {
        Object[] array = x3.e0.Q5(iterable).toArray(new kotlinx.coroutines.flow.i[0]);
        if (array != null) {
            u4.l0.w();
            return new f((kotlinx.coroutines.flow.i[]) array, pVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @n6.d
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> c(@n6.d kotlinx.coroutines.flow.i<? extends T1> iVar, @n6.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @n6.d kotlinx.coroutines.flow.i<? extends T3> iVar3, @n6.d kotlinx.coroutines.flow.i<? extends T4> iVar4, @n6.d kotlinx.coroutines.flow.i<? extends T5> iVar5, @n6.d t4.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super e4.d<? super R>, ? extends Object> tVar) {
        return new c(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4, iVar5}, tVar);
    }

    @n6.d
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> d(@n6.d kotlinx.coroutines.flow.i<? extends T1> iVar, @n6.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @n6.d kotlinx.coroutines.flow.i<? extends T3> iVar3, @n6.d kotlinx.coroutines.flow.i<? extends T4> iVar4, @n6.d t4.s<? super T1, ? super T2, ? super T3, ? super T4, ? super e4.d<? super R>, ? extends Object> sVar) {
        return new b(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4}, sVar);
    }

    @n6.d
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> e(@n6.d kotlinx.coroutines.flow.i<? extends T1> iVar, @n6.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @n6.d kotlinx.coroutines.flow.i<? extends T3> iVar3, @v3.b @n6.d t4.r<? super T1, ? super T2, ? super T3, ? super e4.d<? super R>, ? extends Object> rVar) {
        return new a(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3}, rVar);
    }

    @n6.d
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> f(@n6.d kotlinx.coroutines.flow.i<? extends T1> iVar, @n6.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @n6.d t4.q<? super T1, ? super T2, ? super e4.d<? super R>, ? extends Object> qVar) {
        return kotlinx.coroutines.flow.k.J0(iVar, iVar2, qVar);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> g(kotlinx.coroutines.flow.i<? extends T>[] r1, t4.p<? super T[], ? super e4.d<? super R>, ? extends java.lang.Object> r2) {
        /*
            u4.l0.w()
            kotlinx.coroutines.flow.b0$e r0 = new kotlinx.coroutines.flow.b0$e
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b0.g(kotlinx.coroutines.flow.i[], t4.p):kotlinx.coroutines.flow.i");
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> h(Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, @v3.b t4.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super e4.d<? super m2>, ? extends Object> qVar) {
        Object[] array = x3.e0.Q5(iterable).toArray(new kotlinx.coroutines.flow.i[0]);
        if (array != null) {
            u4.l0.w();
            return kotlinx.coroutines.flow.k.I0(new r((kotlinx.coroutines.flow.i[]) array, qVar, null));
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @n6.d
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> i(@n6.d kotlinx.coroutines.flow.i<? extends T1> iVar, @n6.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @n6.d kotlinx.coroutines.flow.i<? extends T3> iVar3, @n6.d kotlinx.coroutines.flow.i<? extends T4> iVar4, @n6.d kotlinx.coroutines.flow.i<? extends T5> iVar5, @v3.b @n6.d t4.u<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super e4.d<? super m2>, ? extends Object> uVar) {
        return kotlinx.coroutines.flow.k.I0(new p(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4, iVar5}, null, uVar));
    }

    @n6.d
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> j(@n6.d kotlinx.coroutines.flow.i<? extends T1> iVar, @n6.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @n6.d kotlinx.coroutines.flow.i<? extends T3> iVar3, @n6.d kotlinx.coroutines.flow.i<? extends T4> iVar4, @v3.b @n6.d t4.t<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super e4.d<? super m2>, ? extends Object> tVar) {
        return kotlinx.coroutines.flow.k.I0(new o(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4}, null, tVar));
    }

    @n6.d
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> k(@n6.d kotlinx.coroutines.flow.i<? extends T1> iVar, @n6.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @n6.d kotlinx.coroutines.flow.i<? extends T3> iVar3, @v3.b @n6.d t4.s<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super e4.d<? super m2>, ? extends Object> sVar) {
        return kotlinx.coroutines.flow.k.I0(new n(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3}, null, sVar));
    }

    @n6.d
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> l(@n6.d kotlinx.coroutines.flow.i<? extends T1> iVar, @n6.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @v3.b @n6.d t4.r<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super e4.d<? super m2>, ? extends Object> rVar) {
        return kotlinx.coroutines.flow.k.I0(new m(new kotlinx.coroutines.flow.i[]{iVar, iVar2}, null, rVar));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> m(kotlinx.coroutines.flow.i<? extends T>[] r2, @v3.b t4.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super e4.d<? super v3.m2>, ? extends java.lang.Object> r3) {
        /*
            u4.l0.w()
            kotlinx.coroutines.flow.b0$q r0 = new kotlinx.coroutines.flow.b0$q
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.I0(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b0.m(kotlinx.coroutines.flow.i[], t4.q):kotlinx.coroutines.flow.i");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> n(kotlinx.coroutines.flow.i<? extends T>[] r2, @v3.b t4.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super e4.d<? super v3.m2>, ? extends java.lang.Object> r3) {
        /*
            u4.l0.w()
            kotlinx.coroutines.flow.b0$s r0 = new kotlinx.coroutines.flow.b0$s
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.I0(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b0.n(kotlinx.coroutines.flow.i[], t4.q):kotlinx.coroutines.flow.i");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> o(kotlinx.coroutines.flow.i<? extends T>[] r1, t4.p<? super T[], ? super e4.d<? super R>, ? extends java.lang.Object> r2) {
        /*
            u4.l0.w()
            kotlinx.coroutines.flow.b0$t r0 = new kotlinx.coroutines.flow.b0$t
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b0.o(kotlinx.coroutines.flow.i[], t4.p):kotlinx.coroutines.flow.i");
    }

    @s4.h(name = "flowCombine")
    @n6.d
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> p(@n6.d kotlinx.coroutines.flow.i<? extends T1> iVar, @n6.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @n6.d t4.q<? super T1, ? super T2, ? super e4.d<? super R>, ? extends Object> qVar) {
        return new d(iVar, iVar2, qVar);
    }

    @s4.h(name = "flowCombineTransform")
    @n6.d
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> q(@n6.d kotlinx.coroutines.flow.i<? extends T1> iVar, @n6.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @v3.b @n6.d t4.r<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super e4.d<? super m2>, ? extends Object> rVar) {
        return kotlinx.coroutines.flow.k.I0(new l(new kotlinx.coroutines.flow.i[]{iVar, iVar2}, null, rVar));
    }

    public static final <T> t4.a<T[]> r() {
        return v.f12210l;
    }

    @n6.d
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> s(@n6.d kotlinx.coroutines.flow.i<? extends T1> iVar, @n6.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @n6.d t4.q<? super T1, ? super T2, ? super e4.d<? super R>, ? extends Object> qVar) {
        return p5.m.b(iVar, iVar2, qVar);
    }
}
