package androidx.lifecycle;

import u4.k1;
import v3.m2;

@s4.h(name = "Transformations")
/* loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* loaded from: classes.dex */
    public static final class a<X> extends u4.n0 implements t4.l<X, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ f0<X> f4851l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ k1.a f4852m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f0<X> f0Var, k1.a aVar) {
            super(1);
            this.f4851l = f0Var;
            this.f4852m = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Object obj) {
            b(obj);
            return m2.f17815a;
        }

        public final void b(X x6) {
            X f7 = this.f4851l.f();
            if (this.f4852m.f17429k || ((f7 == null && x6 != null) || !(f7 == null || u4.l0.g(f7, x6)))) {
                this.f4852m.f17429k = false;
                this.f4851l.r(x6);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* loaded from: classes.dex */
    public static final class b<X> extends u4.n0 implements t4.l<X, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ f0<Y> f4853l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ t4.l<X, Y> f4854m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f0<Y> f0Var, t4.l<X, Y> lVar) {
            super(1);
            this.f4853l = f0Var;
            this.f4854m = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Object obj) {
            b(obj);
            return m2.f17815a;
        }

        public final void b(X x6) {
            this.f4853l.r(this.f4854m.O(x6));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends u4.n0 implements t4.l<Object, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ f0<Object> f4855l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ n.a<Object, Object> f4856m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f0<Object> f0Var, n.a<Object, Object> aVar) {
            super(1);
            this.f4855l = f0Var;
            this.f4856m = aVar;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Object obj) {
            b(obj);
            return m2.f17815a;
        }

        public final void b(Object obj) {
            this.f4855l.r(this.f4856m.apply(obj));
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements i0, u4.d0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.l f4857a;

        public d(t4.l lVar) {
            u4.l0.p(lVar, "function");
            this.f4857a = lVar;
        }

        @Override // u4.d0
        @n6.d
        public final v3.v<?> a() {
            return this.f4857a;
        }

        @Override // androidx.lifecycle.i0
        public final /* synthetic */ void b(Object obj) {
            this.f4857a.O(obj);
        }

        public final boolean equals(@n6.e Object obj) {
            if ((obj instanceof i0) && (obj instanceof u4.d0)) {
                return u4.l0.g(a(), ((u4.d0) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* loaded from: classes.dex */
    public static final class e<X> implements i0<X> {
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public LiveData<Y> f4858a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.l<X, LiveData<Y>> f4859b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f0<Y> f4860c;

        /* JADX INFO: Add missing generic type declarations: [Y] */
        /* loaded from: classes.dex */
        public static final class a<Y> extends u4.n0 implements t4.l<Y, m2> {

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ f0<Y> f4861l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f0<Y> f0Var) {
                super(1);
                this.f4861l = f0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // t4.l
            public /* bridge */ /* synthetic */ m2 O(Object obj) {
                b(obj);
                return m2.f17815a;
            }

            public final void b(Y y6) {
                this.f4861l.r(y6);
            }
        }

        public e(t4.l<X, LiveData<Y>> lVar, f0<Y> f0Var) {
            this.f4859b = lVar;
            this.f4860c = f0Var;
        }

        @n6.e
        public final LiveData<Y> a() {
            return this.f4858a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.i0
        public void b(X x6) {
            LiveData<Y> liveData = (LiveData) this.f4859b.O(x6);
            Object obj = this.f4858a;
            if (obj == liveData) {
                return;
            }
            if (obj != null) {
                f0<Y> f0Var = this.f4860c;
                u4.l0.m(obj);
                f0Var.t(obj);
            }
            this.f4858a = liveData;
            if (liveData != 0) {
                f0<Y> f0Var2 = this.f4860c;
                u4.l0.m(liveData);
                f0Var2.s(liveData, new d(new a(this.f4860c)));
            }
        }

        public final void c(@n6.e LiveData<Y> liveData) {
            this.f4858a = liveData;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements i0<Object> {
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public LiveData<Object> f4862a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ n.a<Object, LiveData<Object>> f4863b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f0<Object> f4864c;

        /* loaded from: classes.dex */
        public static final class a extends u4.n0 implements t4.l<Object, m2> {

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ f0<Object> f4865l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f0<Object> f0Var) {
                super(1);
                this.f4865l = f0Var;
            }

            @Override // t4.l
            public /* bridge */ /* synthetic */ m2 O(Object obj) {
                b(obj);
                return m2.f17815a;
            }

            public final void b(Object obj) {
                this.f4865l.r(obj);
            }
        }

        public f(n.a<Object, LiveData<Object>> aVar, f0<Object> f0Var) {
            this.f4863b = aVar;
            this.f4864c = f0Var;
        }

        @n6.e
        public final LiveData<Object> a() {
            return this.f4862a;
        }

        @Override // androidx.lifecycle.i0
        public void b(Object obj) {
            LiveData<Object> apply = this.f4863b.apply(obj);
            LiveData<Object> liveData = this.f4862a;
            if (liveData == apply) {
                return;
            }
            if (liveData != null) {
                f0<Object> f0Var = this.f4864c;
                u4.l0.m(liveData);
                f0Var.t(liveData);
            }
            this.f4862a = apply;
            if (apply != null) {
                f0<Object> f0Var2 = this.f4864c;
                u4.l0.m(apply);
                f0Var2.s(apply, new d(new a(this.f4864c)));
            }
        }

        public final void c(@n6.e LiveData<Object> liveData) {
            this.f4862a = liveData;
        }
    }

    @d.l0
    @s4.h(name = "distinctUntilChanged")
    @d.j
    @n6.d
    public static final <X> LiveData<X> a(@n6.d LiveData<X> liveData) {
        u4.l0.p(liveData, "<this>");
        f0 f0Var = new f0();
        k1.a aVar = new k1.a();
        aVar.f17429k = true;
        if (liveData.j()) {
            f0Var.r(liveData.f());
            aVar.f17429k = false;
        }
        f0Var.s(liveData, new d(new a(f0Var, aVar)));
        return f0Var;
    }

    @d.l0
    @s4.h(name = "map")
    @v3.k(level = v3.m.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @d.j
    public static final /* synthetic */ LiveData b(LiveData liveData, n.a aVar) {
        u4.l0.p(liveData, "<this>");
        u4.l0.p(aVar, "mapFunction");
        f0 f0Var = new f0();
        f0Var.s(liveData, new d(new c(f0Var, aVar)));
        return f0Var;
    }

    @d.l0
    @s4.h(name = "map")
    @d.j
    @n6.d
    public static final <X, Y> LiveData<Y> c(@n6.d LiveData<X> liveData, @n6.d t4.l<X, Y> lVar) {
        u4.l0.p(liveData, "<this>");
        u4.l0.p(lVar, "transform");
        f0 f0Var = new f0();
        f0Var.s(liveData, new d(new b(f0Var, lVar)));
        return f0Var;
    }

    @d.l0
    @s4.h(name = "switchMap")
    @v3.k(level = v3.m.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @d.j
    public static final /* synthetic */ LiveData d(LiveData liveData, n.a aVar) {
        u4.l0.p(liveData, "<this>");
        u4.l0.p(aVar, "switchMapFunction");
        f0 f0Var = new f0();
        f0Var.s(liveData, new f(aVar, f0Var));
        return f0Var;
    }

    @d.l0
    @s4.h(name = "switchMap")
    @d.j
    @n6.d
    public static final <X, Y> LiveData<Y> e(@n6.d LiveData<X> liveData, @n6.d t4.l<X, LiveData<Y>> lVar) {
        u4.l0.p(liveData, "<this>");
        u4.l0.p(lVar, "transform");
        f0 f0Var = new f0();
        f0Var.s(liveData, new e(lVar, f0Var));
        return f0Var;
    }
}