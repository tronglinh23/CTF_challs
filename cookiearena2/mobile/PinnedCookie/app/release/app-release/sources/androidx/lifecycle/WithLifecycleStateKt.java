package androidx.lifecycle;

import androidx.lifecycle.p;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.z2;
import u4.r1;
import v3.d1;
import v3.m2;
@r1({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,206:1\n154#1,8:207\n154#1,8:215\n154#1,8:223\n154#1,8:231\n43#1,5:239\n154#1,8:244\n43#1,5:252\n154#1,8:257\n154#1,8:265\n154#1,8:273\n154#1,8:281\n314#2,11:289\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n47#1:207,8\n58#1:215,8\n71#1:223,8\n84#1:231,8\n98#1:239,5\n98#1:244,8\n98#1:252,5\n98#1:257,8\n111#1:265,8\n124#1:273,8\n137#1:281,8\n177#1:289,11\n*E\n"})
/* loaded from: classes.dex */
public final class WithLifecycleStateKt {

    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ p f4668k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f4669l;

        public a(p pVar, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            this.f4668k = pVar;
            this.f4669l = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f4668k.a(this.f4669l);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u4.n0 implements t4.l<Throwable, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.o0 f4670l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ p f4671m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f4672n;

        /* loaded from: classes.dex */
        public static final class a implements Runnable {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ p f4673k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f4674l;

            public a(p pVar, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
                this.f4673k = pVar;
                this.f4674l = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f4673k.d(this.f4674l);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.o0 o0Var, p pVar, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            super(1);
            this.f4670l = o0Var;
            this.f4671m = pVar;
            this.f4672n = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Throwable th) {
            b(th);
            return m2.f17815a;
        }

        public final void b(@n6.e Throwable th) {
            kotlinx.coroutines.o0 o0Var = this.f4670l;
            e4.i iVar = e4.i.f8770k;
            if (o0Var.X0(iVar)) {
                this.f4670l.V0(iVar, new a(this.f4671m, this.f4672n));
            } else {
                this.f4671m.d(this.f4672n);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @r1({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2\n*L\n1#1,206:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class c<R> extends u4.n0 implements t4.a<R> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.a<R> f4675l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(t4.a<? extends R> aVar) {
            super(0);
            this.f4675l = aVar;
        }

        @Override // t4.a
        public final R n() {
            return this.f4675l.n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, androidx.lifecycle.y] */
    @n6.e
    @v3.a1
    public static final <R> Object a(@n6.d final p pVar, @n6.d final p.b bVar, boolean z6, @n6.d kotlinx.coroutines.o0 o0Var, @n6.d final t4.a<? extends R> aVar, @n6.d e4.d<? super R> dVar) {
        final kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(g4.c.d(dVar), 1);
        rVar.x();
        ?? r12 = new v() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.v
            public void d(@n6.d z zVar, @n6.d p.a aVar2) {
                Object b7;
                u4.l0.p(zVar, "source");
                u4.l0.p(aVar2, i0.k0.I0);
                if (aVar2 != p.a.Companion.d(p.b.this)) {
                    if (aVar2 == p.a.ON_DESTROY) {
                        pVar.d(this);
                        e4.d dVar2 = rVar;
                        d1.a aVar3 = v3.d1.f17778l;
                        dVar2.D(v3.d1.b(v3.e1.a(new t())));
                        return;
                    }
                    return;
                }
                pVar.d(this);
                e4.d dVar3 = rVar;
                t4.a<R> aVar4 = aVar;
                try {
                    d1.a aVar5 = v3.d1.f17778l;
                    b7 = v3.d1.b(aVar4.n());
                } catch (Throwable th) {
                    d1.a aVar6 = v3.d1.f17778l;
                    b7 = v3.d1.b(v3.e1.a(th));
                }
                dVar3.D(b7);
            }
        };
        if (z6) {
            o0Var.V0(e4.i.f8770k, new a(pVar, r12));
        } else {
            pVar.a(r12);
        }
        rVar.N(new b(o0Var, pVar, r12));
        Object A = rVar.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        return A;
    }

    @n6.e
    public static final <R> Object b(@n6.d p pVar, @n6.d t4.a<? extends R> aVar, @n6.d e4.d<? super R> dVar) {
        p.b bVar = p.b.CREATED;
        z2 c12 = m1.e().c1();
        boolean X0 = c12.X0(dVar.g());
        if (!X0) {
            if (pVar.b() == p.b.DESTROYED) {
                throw new t();
            }
            if (pVar.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(pVar, bVar, X0, c12, new c(aVar), dVar);
    }

    @n6.e
    public static final <R> Object c(@n6.d z zVar, @n6.d t4.a<? extends R> aVar, @n6.d e4.d<? super R> dVar) {
        p lifecycle = zVar.getLifecycle();
        p.b bVar = p.b.CREATED;
        z2 c12 = m1.e().c1();
        boolean X0 = c12.X0(dVar.g());
        if (!X0) {
            if (lifecycle.b() == p.b.DESTROYED) {
                throw new t();
            }
            if (lifecycle.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(lifecycle, bVar, X0, c12, new c(aVar), dVar);
    }

    public static final <R> Object d(p pVar, t4.a<? extends R> aVar, e4.d<? super R> dVar) {
        p.b bVar = p.b.CREATED;
        m1.e().c1();
        u4.i0.e(3);
        throw null;
    }

    public static final <R> Object e(z zVar, t4.a<? extends R> aVar, e4.d<? super R> dVar) {
        zVar.getLifecycle();
        p.b bVar = p.b.CREATED;
        m1.e().c1();
        u4.i0.e(3);
        throw null;
    }

    @n6.e
    public static final <R> Object f(@n6.d p pVar, @n6.d t4.a<? extends R> aVar, @n6.d e4.d<? super R> dVar) {
        p.b bVar = p.b.RESUMED;
        z2 c12 = m1.e().c1();
        boolean X0 = c12.X0(dVar.g());
        if (!X0) {
            if (pVar.b() == p.b.DESTROYED) {
                throw new t();
            }
            if (pVar.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(pVar, bVar, X0, c12, new c(aVar), dVar);
    }

    @n6.e
    public static final <R> Object g(@n6.d z zVar, @n6.d t4.a<? extends R> aVar, @n6.d e4.d<? super R> dVar) {
        p lifecycle = zVar.getLifecycle();
        p.b bVar = p.b.RESUMED;
        z2 c12 = m1.e().c1();
        boolean X0 = c12.X0(dVar.g());
        if (!X0) {
            if (lifecycle.b() == p.b.DESTROYED) {
                throw new t();
            }
            if (lifecycle.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(lifecycle, bVar, X0, c12, new c(aVar), dVar);
    }

    public static final <R> Object h(p pVar, t4.a<? extends R> aVar, e4.d<? super R> dVar) {
        p.b bVar = p.b.RESUMED;
        m1.e().c1();
        u4.i0.e(3);
        throw null;
    }

    public static final <R> Object i(z zVar, t4.a<? extends R> aVar, e4.d<? super R> dVar) {
        zVar.getLifecycle();
        p.b bVar = p.b.RESUMED;
        m1.e().c1();
        u4.i0.e(3);
        throw null;
    }

    @n6.e
    public static final <R> Object j(@n6.d p pVar, @n6.d t4.a<? extends R> aVar, @n6.d e4.d<? super R> dVar) {
        p.b bVar = p.b.STARTED;
        z2 c12 = m1.e().c1();
        boolean X0 = c12.X0(dVar.g());
        if (!X0) {
            if (pVar.b() == p.b.DESTROYED) {
                throw new t();
            }
            if (pVar.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(pVar, bVar, X0, c12, new c(aVar), dVar);
    }

    @n6.e
    public static final <R> Object k(@n6.d z zVar, @n6.d t4.a<? extends R> aVar, @n6.d e4.d<? super R> dVar) {
        p lifecycle = zVar.getLifecycle();
        p.b bVar = p.b.STARTED;
        z2 c12 = m1.e().c1();
        boolean X0 = c12.X0(dVar.g());
        if (!X0) {
            if (lifecycle.b() == p.b.DESTROYED) {
                throw new t();
            }
            if (lifecycle.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(lifecycle, bVar, X0, c12, new c(aVar), dVar);
    }

    public static final <R> Object l(p pVar, t4.a<? extends R> aVar, e4.d<? super R> dVar) {
        p.b bVar = p.b.STARTED;
        m1.e().c1();
        u4.i0.e(3);
        throw null;
    }

    public static final <R> Object m(z zVar, t4.a<? extends R> aVar, e4.d<? super R> dVar) {
        zVar.getLifecycle();
        p.b bVar = p.b.STARTED;
        m1.e().c1();
        u4.i0.e(3);
        throw null;
    }

    @n6.e
    public static final <R> Object n(@n6.d p pVar, @n6.d p.b bVar, @n6.d t4.a<? extends R> aVar, @n6.d e4.d<? super R> dVar) {
        if (!(bVar.compareTo(p.b.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
        }
        z2 c12 = m1.e().c1();
        boolean X0 = c12.X0(dVar.g());
        if (!X0) {
            if (pVar.b() == p.b.DESTROYED) {
                throw new t();
            }
            if (pVar.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(pVar, bVar, X0, c12, new c(aVar), dVar);
    }

    @n6.e
    public static final <R> Object o(@n6.d z zVar, @n6.d p.b bVar, @n6.d t4.a<? extends R> aVar, @n6.d e4.d<? super R> dVar) {
        p lifecycle = zVar.getLifecycle();
        if (!(bVar.compareTo(p.b.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
        }
        z2 c12 = m1.e().c1();
        boolean X0 = c12.X0(dVar.g());
        if (!X0) {
            if (lifecycle.b() == p.b.DESTROYED) {
                throw new t();
            }
            if (lifecycle.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(lifecycle, bVar, X0, c12, new c(aVar), dVar);
    }

    public static final <R> Object p(p pVar, p.b bVar, t4.a<? extends R> aVar, e4.d<? super R> dVar) {
        if (bVar.compareTo(p.b.CREATED) >= 0) {
            m1.e().c1();
            u4.i0.e(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
    }

    public static final <R> Object q(z zVar, p.b bVar, t4.a<? extends R> aVar, e4.d<? super R> dVar) {
        zVar.getLifecycle();
        if (bVar.compareTo(p.b.CREATED) >= 0) {
            m1.e().c1();
            u4.i0.e(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
    }

    @n6.e
    @v3.a1
    public static final <R> Object r(@n6.d p pVar, @n6.d p.b bVar, @n6.d t4.a<? extends R> aVar, @n6.d e4.d<? super R> dVar) {
        z2 c12 = m1.e().c1();
        boolean X0 = c12.X0(dVar.g());
        if (!X0) {
            if (pVar.b() == p.b.DESTROYED) {
                throw new t();
            }
            if (pVar.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(pVar, bVar, X0, c12, new c(aVar), dVar);
    }

    @v3.a1
    public static final <R> Object s(p pVar, p.b bVar, t4.a<? extends R> aVar, e4.d<? super R> dVar) {
        m1.e().c1();
        u4.i0.e(3);
        throw null;
    }
}
