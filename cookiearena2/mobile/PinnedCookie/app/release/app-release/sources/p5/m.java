package p5;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.internal.w0;
import kotlinx.coroutines.t2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;
import n5.e0;
import n5.g0;
import n5.i0;
import n5.m0;
import u4.n0;
import v3.a1;
import v3.e1;
import v3.m2;
import x3.p0;
/* loaded from: classes.dex */
public final class m {

    @h4.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {androidx.constraintlayout.widget.e.f2190c1, 79, 82}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    /* loaded from: classes.dex */
    public static final class a extends h4.o implements t4.p<u0, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public Object f14895o;

        /* renamed from: p  reason: collision with root package name */
        public Object f14896p;

        /* renamed from: q  reason: collision with root package name */
        public int f14897q;

        /* renamed from: r  reason: collision with root package name */
        public int f14898r;

        /* renamed from: s  reason: collision with root package name */
        public int f14899s;

        /* renamed from: t  reason: collision with root package name */
        public /* synthetic */ Object f14900t;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f14901u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ t4.a<T[]> f14902v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ t4.q<kotlinx.coroutines.flow.j<? super R>, T[], e4.d<? super m2>, Object> f14903w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<R> f14904x;

        @h4.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: p5.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0213a extends h4.o implements t4.p<u0, e4.d<? super m2>, Object> {

            /* renamed from: o  reason: collision with root package name */
            public int f14905o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f14906p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ int f14907q;

            /* renamed from: r  reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f14908r;

            /* renamed from: s  reason: collision with root package name */
            public final /* synthetic */ n5.n<p0<Object>> f14909s;

            /* renamed from: p5.m$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0214a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ n5.n<p0<Object>> f14910k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ int f14911l;

                @h4.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {35, 36}, m = "emit", n = {}, s = {})
                /* renamed from: p5.m$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0215a extends h4.d {

                    /* renamed from: n  reason: collision with root package name */
                    public /* synthetic */ Object f14912n;

                    /* renamed from: o  reason: collision with root package name */
                    public final /* synthetic */ C0214a<T> f14913o;

                    /* renamed from: p  reason: collision with root package name */
                    public int f14914p;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0215a(C0214a<? super T> c0214a, e4.d<? super C0215a> dVar) {
                        super(dVar);
                        this.f14913o = c0214a;
                    }

                    @Override // h4.a
                    @n6.e
                    public final Object Q(@n6.d Object obj) {
                        this.f14912n = obj;
                        this.f14914p |= Integer.MIN_VALUE;
                        return this.f14913o.f(null, this);
                    }
                }

                public C0214a(n5.n<p0<Object>> nVar, int i7) {
                    this.f14910k = nVar;
                    this.f14911l = i7;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
                @Override // kotlinx.coroutines.flow.j
                @n6.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(T r7, @n6.d e4.d<? super v3.m2> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof p5.m.a.C0213a.C0214a.C0215a
                        if (r0 == 0) goto L13
                        r0 = r8
                        p5.m$a$a$a$a r0 = (p5.m.a.C0213a.C0214a.C0215a) r0
                        int r1 = r0.f14914p
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f14914p = r1
                        goto L18
                    L13:
                        p5.m$a$a$a$a r0 = new p5.m$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f14912n
                        java.lang.Object r1 = g4.d.h()
                        int r2 = r0.f14914p
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        v3.e1.n(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        v3.e1.n(r8)
                        goto L4d
                    L38:
                        v3.e1.n(r8)
                        n5.n<x3.p0<java.lang.Object>> r8 = r6.f14910k
                        x3.p0 r2 = new x3.p0
                        int r5 = r6.f14911l
                        r2.<init>(r5, r7)
                        r0.f14914p = r4
                        java.lang.Object r7 = r8.z(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f14914p = r3
                        java.lang.Object r7 = kotlinx.coroutines.f4.a(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        v3.m2 r7 = v3.m2.f17815a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p5.m.a.C0213a.C0214a.f(java.lang.Object, e4.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0213a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, int i7, AtomicInteger atomicInteger, n5.n<p0<Object>> nVar, e4.d<? super C0213a> dVar) {
                super(2, dVar);
                this.f14906p = iVarArr;
                this.f14907q = i7;
                this.f14908r = atomicInteger;
                this.f14909s = nVar;
            }

            @Override // h4.a
            @n6.d
            public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                return new C0213a(this.f14906p, this.f14907q, this.f14908r, this.f14909s, dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                AtomicInteger atomicInteger;
                Object h7 = g4.d.h();
                int i7 = this.f14905o;
                try {
                    if (i7 == 0) {
                        e1.n(obj);
                        kotlinx.coroutines.flow.i[] iVarArr = this.f14906p;
                        int i8 = this.f14907q;
                        kotlinx.coroutines.flow.i iVar = iVarArr[i8];
                        C0214a c0214a = new C0214a(this.f14909s, i8);
                        this.f14905o = 1;
                        if (iVar.a(c0214a, this) == h7) {
                            return h7;
                        }
                    } else if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e1.n(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        m0.a.a(this.f14909s, null, 1, null);
                    }
                    return m2.f17815a;
                } finally {
                    if (this.f14908r.decrementAndGet() == 0) {
                        m0.a.a(this.f14909s, null, 1, null);
                    }
                }
            }

            @Override // t4.p
            @n6.e
            /* renamed from: a0  reason: merged with bridge method [inline-methods] */
            public final Object J(@n6.d u0 u0Var, @n6.e e4.d<? super m2> dVar) {
                return ((C0213a) H(u0Var, dVar)).Q(m2.f17815a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, t4.a<T[]> aVar, t4.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super e4.d<? super m2>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super R> jVar, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f14901u = iVarArr;
            this.f14902v = aVar;
            this.f14903w = qVar;
            this.f14904x = jVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            a aVar = new a(this.f14901u, this.f14902v, this.f14903w, this.f14904x, dVar);
            aVar.f14900t = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x010b A[EDGE_INSN: B:49:0x010b->B:35:0x010b BREAK  A[LOOP:0: B:28:0x00e6->B:50:?], SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v0, types: [kotlinx.coroutines.flow.i<T>[], kotlinx.coroutines.flow.i[]] */
        /* JADX WARN: Type inference failed for: r2v12, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.flow.i<T>[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x012e -> B:20:0x00c3). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0161 -> B:45:0x015d). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 357
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p5.m.a.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d u0 u0Var, @n6.e e4.d<? super m2> dVar) {
            return ((a) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes.dex */
    public static final class b<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f14915k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i f14916l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ t4.q f14917m;

        public b(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.flow.i iVar2, t4.q qVar) {
            this.f14915k = iVar;
            this.f14916l = iVar2;
            this.f14917m = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d e4.d<? super m2> dVar) {
            Object g7 = v0.g(new c(jVar, this.f14915k, this.f14916l, this.f14917m, null), dVar);
            return g7 == g4.d.h() ? g7 : m2.f17815a;
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class c extends h4.o implements t4.p<u0, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f14918o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f14919p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<R> f14920q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T2> f14921r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T1> f14922s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ t4.q<T1, T2, e4.d<? super R>, Object> f14923t;

        /* loaded from: classes.dex */
        public static final class a extends n0 implements t4.l<Throwable, m2> {

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ c0 f14924l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.j<R> f14925m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c0 c0Var, kotlinx.coroutines.flow.j<? super R> jVar) {
                super(1);
                this.f14924l = c0Var;
                this.f14925m = jVar;
            }

            @Override // t4.l
            public /* bridge */ /* synthetic */ m2 O(Throwable th) {
                b(th);
                return m2.f17815a;
            }

            public final void b(@n6.e Throwable th) {
                if (this.f14924l.d()) {
                    this.f14924l.f(new p5.a(this.f14925m));
                }
            }
        }

        @h4.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class b extends h4.o implements t4.p<m2, e4.d<? super m2>, Object> {

            /* renamed from: o  reason: collision with root package name */
            public int f14926o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.i<T1> f14927p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ e4.g f14928q;

            /* renamed from: r  reason: collision with root package name */
            public final /* synthetic */ Object f14929r;

            /* renamed from: s  reason: collision with root package name */
            public final /* synthetic */ i0<Object> f14930s;

            /* renamed from: t  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.j<R> f14931t;

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ t4.q<T1, T2, e4.d<? super R>, Object> f14932u;

            /* loaded from: classes.dex */
            public static final class a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ e4.g f14933k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ Object f14934l;

                /* renamed from: m  reason: collision with root package name */
                public final /* synthetic */ i0<Object> f14935m;

                /* renamed from: n  reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j<R> f14936n;

                /* renamed from: o  reason: collision with root package name */
                public final /* synthetic */ t4.q<T1, T2, e4.d<? super R>, Object> f14937o;

                @h4.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {132, 135, 135}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: p5.m$c$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0216a extends h4.o implements t4.p<m2, e4.d<? super m2>, Object> {

                    /* renamed from: o  reason: collision with root package name */
                    public Object f14938o;

                    /* renamed from: p  reason: collision with root package name */
                    public int f14939p;

                    /* renamed from: q  reason: collision with root package name */
                    public final /* synthetic */ i0<Object> f14940q;

                    /* renamed from: r  reason: collision with root package name */
                    public final /* synthetic */ kotlinx.coroutines.flow.j<R> f14941r;

                    /* renamed from: s  reason: collision with root package name */
                    public final /* synthetic */ t4.q<T1, T2, e4.d<? super R>, Object> f14942s;

                    /* renamed from: t  reason: collision with root package name */
                    public final /* synthetic */ T1 f14943t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0216a(i0<? extends Object> i0Var, kotlinx.coroutines.flow.j<? super R> jVar, t4.q<? super T1, ? super T2, ? super e4.d<? super R>, ? extends Object> qVar, T1 t12, e4.d<? super C0216a> dVar) {
                        super(2, dVar);
                        this.f14940q = i0Var;
                        this.f14941r = jVar;
                        this.f14942s = qVar;
                        this.f14943t = t12;
                    }

                    @Override // h4.a
                    @n6.d
                    public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                        return new C0216a(this.f14940q, this.f14941r, this.f14942s, this.f14943t, dVar);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[RETURN] */
                    @Override // h4.a
                    @n6.e
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object Q(@n6.d java.lang.Object r9) {
                        /*
                            r8 = this;
                            java.lang.Object r0 = g4.d.h()
                            int r1 = r8.f14939p
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L30
                            if (r1 == r5) goto L26
                            if (r1 == r4) goto L1e
                            if (r1 != r3) goto L16
                            v3.e1.n(r9)
                            goto L6f
                        L16:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L1e:
                            java.lang.Object r1 = r8.f14938o
                            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                            v3.e1.n(r9)
                            goto L64
                        L26:
                            v3.e1.n(r9)
                            n5.r r9 = (n5.r) r9
                            java.lang.Object r9 = r9.o()
                            goto L3e
                        L30:
                            v3.e1.n(r9)
                            n5.i0<java.lang.Object> r9 = r8.f14940q
                            r8.f14939p = r5
                            java.lang.Object r9 = r9.F(r8)
                            if (r9 != r0) goto L3e
                            return r0
                        L3e:
                            kotlinx.coroutines.flow.j<R> r1 = r8.f14941r
                            boolean r5 = r9 instanceof n5.r.c
                            if (r5 == 0) goto L50
                            java.lang.Throwable r9 = n5.r.f(r9)
                            if (r9 != 0) goto L4f
                            p5.a r9 = new p5.a
                            r9.<init>(r1)
                        L4f:
                            throw r9
                        L50:
                            t4.q<T1, T2, e4.d<? super R>, java.lang.Object> r5 = r8.f14942s
                            T1 r6 = r8.f14943t
                            kotlinx.coroutines.internal.r0 r7 = p5.u.f14964a
                            if (r9 != r7) goto L59
                            r9 = r2
                        L59:
                            r8.f14938o = r1
                            r8.f14939p = r4
                            java.lang.Object r9 = r5.I(r6, r9, r8)
                            if (r9 != r0) goto L64
                            return r0
                        L64:
                            r8.f14938o = r2
                            r8.f14939p = r3
                            java.lang.Object r9 = r1.f(r9, r8)
                            if (r9 != r0) goto L6f
                            return r0
                        L6f:
                            v3.m2 r9 = v3.m2.f17815a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p5.m.c.b.a.C0216a.Q(java.lang.Object):java.lang.Object");
                    }

                    @Override // t4.p
                    @n6.e
                    /* renamed from: a0  reason: merged with bridge method [inline-methods] */
                    public final Object J(@n6.d m2 m2Var, @n6.e e4.d<? super m2> dVar) {
                        return ((C0216a) H(m2Var, dVar)).Q(m2.f17815a);
                    }
                }

                @h4.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {131}, m = "emit", n = {}, s = {})
                /* renamed from: p5.m$c$b$a$b  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0217b extends h4.d {

                    /* renamed from: n  reason: collision with root package name */
                    public /* synthetic */ Object f14944n;

                    /* renamed from: o  reason: collision with root package name */
                    public final /* synthetic */ a<T> f14945o;

                    /* renamed from: p  reason: collision with root package name */
                    public int f14946p;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0217b(a<? super T> aVar, e4.d<? super C0217b> dVar) {
                        super(dVar);
                        this.f14945o = aVar;
                    }

                    @Override // h4.a
                    @n6.e
                    public final Object Q(@n6.d Object obj) {
                        this.f14944n = obj;
                        this.f14946p |= Integer.MIN_VALUE;
                        return this.f14945o.f(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a(e4.g gVar, Object obj, i0<? extends Object> i0Var, kotlinx.coroutines.flow.j<? super R> jVar, t4.q<? super T1, ? super T2, ? super e4.d<? super R>, ? extends Object> qVar) {
                    this.f14933k = gVar;
                    this.f14934l = obj;
                    this.f14935m = i0Var;
                    this.f14936n = jVar;
                    this.f14937o = qVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.j
                @n6.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(T1 r13, @n6.d e4.d<? super v3.m2> r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof p5.m.c.b.a.C0217b
                        if (r0 == 0) goto L13
                        r0 = r14
                        p5.m$c$b$a$b r0 = (p5.m.c.b.a.C0217b) r0
                        int r1 = r0.f14946p
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f14946p = r1
                        goto L18
                    L13:
                        p5.m$c$b$a$b r0 = new p5.m$c$b$a$b
                        r0.<init>(r12, r14)
                    L18:
                        java.lang.Object r14 = r0.f14944n
                        java.lang.Object r1 = g4.d.h()
                        int r2 = r0.f14946p
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        v3.e1.n(r14)
                        goto L51
                    L29:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L31:
                        v3.e1.n(r14)
                        e4.g r14 = r12.f14933k
                        v3.m2 r2 = v3.m2.f17815a
                        java.lang.Object r4 = r12.f14934l
                        p5.m$c$b$a$a r11 = new p5.m$c$b$a$a
                        n5.i0<java.lang.Object> r6 = r12.f14935m
                        kotlinx.coroutines.flow.j<R> r7 = r12.f14936n
                        t4.q<T1, T2, e4.d<? super R>, java.lang.Object> r8 = r12.f14937o
                        r10 = 0
                        r5 = r11
                        r9 = r13
                        r5.<init>(r6, r7, r8, r9, r10)
                        r0.f14946p = r3
                        java.lang.Object r13 = p5.f.c(r14, r2, r4, r11, r0)
                        if (r13 != r1) goto L51
                        return r1
                    L51:
                        v3.m2 r13 = v3.m2.f17815a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p5.m.c.b.a.f(java.lang.Object, e4.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(kotlinx.coroutines.flow.i<? extends T1> iVar, e4.g gVar, Object obj, i0<? extends Object> i0Var, kotlinx.coroutines.flow.j<? super R> jVar, t4.q<? super T1, ? super T2, ? super e4.d<? super R>, ? extends Object> qVar, e4.d<? super b> dVar) {
                super(2, dVar);
                this.f14927p = iVar;
                this.f14928q = gVar;
                this.f14929r = obj;
                this.f14930s = i0Var;
                this.f14931t = jVar;
                this.f14932u = qVar;
            }

            @Override // h4.a
            @n6.d
            public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                return new b(this.f14927p, this.f14928q, this.f14929r, this.f14930s, this.f14931t, this.f14932u, dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f14926o;
                if (i7 == 0) {
                    e1.n(obj);
                    kotlinx.coroutines.flow.i<T1> iVar = this.f14927p;
                    a aVar = new a(this.f14928q, this.f14929r, this.f14930s, this.f14931t, this.f14932u);
                    this.f14926o = 1;
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
            /* renamed from: a0  reason: merged with bridge method [inline-methods] */
            public final Object J(@n6.d m2 m2Var, @n6.e e4.d<? super m2> dVar) {
                return ((b) H(m2Var, dVar)).Q(m2.f17815a);
            }
        }

        @h4.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {androidx.constraintlayout.widget.e.L1}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: p5.m$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0218c extends h4.o implements t4.p<g0<? super Object>, e4.d<? super m2>, Object> {

            /* renamed from: o  reason: collision with root package name */
            public int f14947o;

            /* renamed from: p  reason: collision with root package name */
            public /* synthetic */ Object f14948p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.i<T2> f14949q;

            /* renamed from: p5.m$c$c$a */
            /* loaded from: classes.dex */
            public static final class a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ g0<Object> f14950k;

                @h4.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {androidx.constraintlayout.widget.e.M1}, m = "emit", n = {}, s = {})
                /* renamed from: p5.m$c$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0219a extends h4.d {

                    /* renamed from: n  reason: collision with root package name */
                    public /* synthetic */ Object f14951n;

                    /* renamed from: o  reason: collision with root package name */
                    public final /* synthetic */ a<T> f14952o;

                    /* renamed from: p  reason: collision with root package name */
                    public int f14953p;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0219a(a<? super T> aVar, e4.d<? super C0219a> dVar) {
                        super(dVar);
                        this.f14952o = aVar;
                    }

                    @Override // h4.a
                    @n6.e
                    public final Object Q(@n6.d Object obj) {
                        this.f14951n = obj;
                        this.f14953p |= Integer.MIN_VALUE;
                        return this.f14952o.f(null, this);
                    }
                }

                public a(g0<Object> g0Var) {
                    this.f14950k = g0Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.j
                @n6.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(T2 r5, @n6.d e4.d<? super v3.m2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof p5.m.c.C0218c.a.C0219a
                        if (r0 == 0) goto L13
                        r0 = r6
                        p5.m$c$c$a$a r0 = (p5.m.c.C0218c.a.C0219a) r0
                        int r1 = r0.f14953p
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f14953p = r1
                        goto L18
                    L13:
                        p5.m$c$c$a$a r0 = new p5.m$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f14951n
                        java.lang.Object r1 = g4.d.h()
                        int r2 = r0.f14953p
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        v3.e1.n(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        v3.e1.n(r6)
                        n5.g0<java.lang.Object> r6 = r4.f14950k
                        n5.m0 r6 = r6.m()
                        if (r5 != 0) goto L3e
                        kotlinx.coroutines.internal.r0 r5 = p5.u.f14964a
                    L3e:
                        r0.f14953p = r3
                        java.lang.Object r5 = r6.z(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        v3.m2 r5 = v3.m2.f17815a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p5.m.c.C0218c.a.f(java.lang.Object, e4.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0218c(kotlinx.coroutines.flow.i<? extends T2> iVar, e4.d<? super C0218c> dVar) {
                super(2, dVar);
                this.f14949q = iVar;
            }

            @Override // h4.a
            @n6.d
            public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                C0218c c0218c = new C0218c(this.f14949q, dVar);
                c0218c.f14948p = obj;
                return c0218c;
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f14947o;
                if (i7 == 0) {
                    e1.n(obj);
                    g0 g0Var = (g0) this.f14948p;
                    kotlinx.coroutines.flow.i<T2> iVar = this.f14949q;
                    a aVar = new a(g0Var);
                    this.f14947o = 1;
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
            /* renamed from: a0  reason: merged with bridge method [inline-methods] */
            public final Object J(@n6.d g0<Object> g0Var, @n6.e e4.d<? super m2> dVar) {
                return ((C0218c) H(g0Var, dVar)).Q(m2.f17815a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(kotlinx.coroutines.flow.j<? super R> jVar, kotlinx.coroutines.flow.i<? extends T2> iVar, kotlinx.coroutines.flow.i<? extends T1> iVar2, t4.q<? super T1, ? super T2, ? super e4.d<? super R>, ? extends Object> qVar, e4.d<? super c> dVar) {
            super(2, dVar);
            this.f14920q = jVar;
            this.f14921r = iVar;
            this.f14922s = iVar2;
            this.f14923t = qVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            c cVar = new c(this.f14920q, this.f14921r, this.f14922s, this.f14923t, dVar);
            cVar.f14919p = obj;
            return cVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            c0 c7;
            i0 i0Var;
            i0 i0Var2;
            Object h7 = g4.d.h();
            int i7 = this.f14918o;
            if (i7 == 0) {
                e1.n(obj);
                u0 u0Var = (u0) this.f14919p;
                i0 h8 = e0.h(u0Var, null, 0, new C0218c(this.f14921r, null), 3, null);
                c7 = t2.c(null, 1, null);
                ((m0) h8).a0(new a(c7, this.f14920q));
                try {
                    e4.g coroutineContext = u0Var.getCoroutineContext();
                    Object b7 = w0.b(coroutineContext);
                    e4.g t6 = u0Var.getCoroutineContext().t(c7);
                    m2 m2Var = m2.f17815a;
                    b bVar = new b(this.f14922s, coroutineContext, b7, h8, this.f14920q, this.f14923t, null);
                    this.f14919p = h8;
                    this.f14918o = 1;
                    i0Var = h8;
                    try {
                        if (f.d(t6, m2Var, null, bVar, this, 4, null) == h7) {
                            return h7;
                        }
                        i0Var2 = i0Var;
                    } catch (p5.a e7) {
                        e = e7;
                        i0Var2 = i0Var;
                        q.b(e, this.f14920q);
                        i0.a.b(i0Var2, null, 1, null);
                        return m2.f17815a;
                    } catch (Throwable th) {
                        th = th;
                        i0Var2 = i0Var;
                        i0.a.b(i0Var2, null, 1, null);
                        throw th;
                    }
                } catch (p5.a e8) {
                    e = e8;
                    i0Var = h8;
                } catch (Throwable th2) {
                    th = th2;
                    i0Var = h8;
                }
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i0Var2 = (i0) this.f14919p;
                try {
                    try {
                        e1.n(obj);
                    } catch (p5.a e9) {
                        e = e9;
                        q.b(e, this.f14920q);
                        i0.a.b(i0Var2, null, 1, null);
                        return m2.f17815a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i0.a.b(i0Var2, null, 1, null);
                    throw th;
                }
            }
            i0.a.b(i0Var2, null, 1, null);
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d u0 u0Var, @n6.e e4.d<? super m2> dVar) {
            return ((c) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    @n6.e
    @a1
    public static final <R, T> Object a(@n6.d kotlinx.coroutines.flow.j<? super R> jVar, @n6.d kotlinx.coroutines.flow.i<? extends T>[] iVarArr, @n6.d t4.a<T[]> aVar, @n6.d t4.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super e4.d<? super m2>, ? extends Object> qVar, @n6.d e4.d<? super m2> dVar) {
        Object a7 = p.a(new a(iVarArr, aVar, qVar, jVar, null), dVar);
        return a7 == g4.d.h() ? a7 : m2.f17815a;
    }

    @n6.d
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> b(@n6.d kotlinx.coroutines.flow.i<? extends T1> iVar, @n6.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @n6.d t4.q<? super T1, ? super T2, ? super e4.d<? super R>, ? extends Object> qVar) {
        return new b(iVar2, iVar, qVar);
    }
}
