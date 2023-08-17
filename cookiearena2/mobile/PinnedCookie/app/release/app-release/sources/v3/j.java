package v3;

import v3.d1;
/* loaded from: classes.dex */
public final class j<T, R> extends i<T, R> implements e4.d<R> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public t4.q<? super i<?, ?>, Object, ? super e4.d<Object>, ? extends Object> f17803k;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public Object f17804l;
    @n6.e

    /* renamed from: m  reason: collision with root package name */
    public e4.d<Object> f17805m;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public Object f17806n;

    @u4.r1({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 DeepRecursive.kt\nkotlin/DeepRecursiveScopeImpl\n*L\n1#1,161:1\n184#2,6:162\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a implements e4.d<Object> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ e4.g f17807k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ j f17808l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ t4.q f17809m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ e4.d f17810n;

        public a(e4.g gVar, j jVar, t4.q qVar, e4.d dVar) {
            this.f17807k = gVar;
            this.f17808l = jVar;
            this.f17809m = qVar;
            this.f17810n = dVar;
        }

        @Override // e4.d
        public void D(@n6.d Object obj) {
            this.f17808l.f17803k = this.f17809m;
            this.f17808l.f17805m = this.f17810n;
            this.f17808l.f17806n = obj;
        }

        @Override // e4.d
        @n6.d
        public e4.g g() {
            return this.f17807k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(@n6.d t4.q<? super i<T, R>, ? super T, ? super e4.d<? super R>, ? extends Object> qVar, T t6) {
        super(null);
        Object obj;
        u4.l0.p(qVar, "block");
        this.f17803k = qVar;
        this.f17804l = t6;
        u4.l0.n(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f17805m = this;
        obj = h.f17789a;
        this.f17806n = obj;
    }

    @Override // e4.d
    public void D(@n6.d Object obj) {
        this.f17805m = null;
        this.f17806n = obj;
    }

    @Override // v3.i
    @n6.e
    public Object a(T t6, @n6.d e4.d<? super R> dVar) {
        u4.l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f17805m = dVar;
        this.f17804l = t6;
        Object h7 = g4.d.h();
        if (h7 == g4.d.h()) {
            h4.h.c(dVar);
        }
        return h7;
    }

    @Override // v3.i
    @n6.e
    public <U, S> Object c(@n6.d g<U, S> gVar, U u6, @n6.d e4.d<? super S> dVar) {
        t4.q<i<U, S>, U, e4.d<? super S>, Object> a7 = gVar.a();
        u4.l0.n(a7, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        t4.q<? super i<?, ?>, Object, ? super e4.d<Object>, ? extends Object> qVar = this.f17803k;
        if (a7 != qVar) {
            this.f17803k = a7;
            u4.l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f17805m = j(qVar, dVar);
        } else {
            u4.l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f17805m = dVar;
        }
        this.f17804l = u6;
        Object h7 = g4.d.h();
        if (h7 == g4.d.h()) {
            h4.h.c(dVar);
        }
        return h7;
    }

    @Override // e4.d
    @n6.d
    public e4.g g() {
        return e4.i.f8770k;
    }

    public final e4.d<Object> j(t4.q<? super i<?, ?>, Object, ? super e4.d<Object>, ? extends Object> qVar, e4.d<Object> dVar) {
        return new a(e4.i.f8770k, this, qVar, dVar);
    }

    public final R k() {
        Object obj;
        Object obj2;
        while (true) {
            R r6 = (R) this.f17806n;
            e4.d<Object> dVar = this.f17805m;
            if (dVar == null) {
                e1.n(r6);
                return r6;
            }
            obj = h.f17789a;
            if (d1.d(obj, r6)) {
                try {
                    t4.q<? super i<?, ?>, Object, ? super e4.d<Object>, ? extends Object> qVar = this.f17803k;
                    Object obj3 = this.f17804l;
                    u4.l0.n(qVar, "null cannot be cast to non-null type kotlin.Function3<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, P of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn>, kotlin.Any?>");
                    Object I = ((t4.q) u4.u1.q(qVar, 3)).I(this, obj3, dVar);
                    if (I != g4.d.h()) {
                        d1.a aVar = d1.f17778l;
                        dVar.D(d1.b(I));
                    }
                } catch (Throwable th) {
                    d1.a aVar2 = d1.f17778l;
                    dVar.D(d1.b(e1.a(th)));
                }
            } else {
                obj2 = h.f17789a;
                this.f17806n = obj2;
                dVar.D(r6);
            }
        }
    }
}
