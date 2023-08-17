package androidx.lifecycle;

import androidx.lifecycle.p;
import n5.m0;
import v3.m2;
/* loaded from: classes.dex */
public final class l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @h4.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class a<T> extends h4.o implements t4.p<n5.g0<? super T>, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f4763o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f4764p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ p f4765q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ p.b f4766r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T> f4767s;

        @h4.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {androidx.constraintlayout.widget.e.L1}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.lifecycle.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0053a extends h4.o implements t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> {

            /* renamed from: o  reason: collision with root package name */
            public int f4768o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.i<T> f4769p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ n5.g0<T> f4770q;

            /* renamed from: androidx.lifecycle.l$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0054a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ n5.g0<T> f4771k;

                /* JADX WARN: Multi-variable type inference failed */
                public C0054a(n5.g0<? super T> g0Var) {
                    this.f4771k = g0Var;
                }

                @Override // kotlinx.coroutines.flow.j
                @n6.e
                public final Object f(T t6, @n6.d e4.d<? super m2> dVar) {
                    Object z6 = this.f4771k.z(t6, dVar);
                    return z6 == g4.d.h() ? z6 : m2.f17815a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0053a(kotlinx.coroutines.flow.i<? extends T> iVar, n5.g0<? super T> g0Var, e4.d<? super C0053a> dVar) {
                super(2, dVar);
                this.f4769p = iVar;
                this.f4770q = g0Var;
            }

            @Override // h4.a
            @n6.d
            public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                return new C0053a(this.f4769p, this.f4770q, dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                Object h7 = g4.d.h();
                int i7 = this.f4768o;
                if (i7 == 0) {
                    v3.e1.n(obj);
                    kotlinx.coroutines.flow.i<T> iVar = this.f4769p;
                    C0054a c0054a = new C0054a(this.f4770q);
                    this.f4768o = 1;
                    if (iVar.a(c0054a, this) == h7) {
                        return h7;
                    }
                } else if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    v3.e1.n(obj);
                }
                return m2.f17815a;
            }

            @Override // t4.p
            @n6.e
            /* renamed from: a0  reason: merged with bridge method [inline-methods] */
            public final Object J(@n6.d kotlinx.coroutines.u0 u0Var, @n6.e e4.d<? super m2> dVar) {
                return ((C0053a) H(u0Var, dVar)).Q(m2.f17815a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p pVar, p.b bVar, kotlinx.coroutines.flow.i<? extends T> iVar, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f4765q = pVar;
            this.f4766r = bVar;
            this.f4767s = iVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            a aVar = new a(this.f4765q, this.f4766r, this.f4767s, dVar);
            aVar.f4764p = obj;
            return aVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            n5.g0 g0Var;
            Object h7 = g4.d.h();
            int i7 = this.f4763o;
            if (i7 == 0) {
                v3.e1.n(obj);
                n5.g0 g0Var2 = (n5.g0) this.f4764p;
                p pVar = this.f4765q;
                p.b bVar = this.f4766r;
                C0053a c0053a = new C0053a(this.f4767s, g0Var2, null);
                this.f4764p = g0Var2;
                this.f4763o = 1;
                if (RepeatOnLifecycleKt.a(pVar, bVar, c0053a, this) == h7) {
                    return h7;
                }
                g0Var = g0Var2;
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                g0Var = (n5.g0) this.f4764p;
                v3.e1.n(obj);
            }
            m0.a.a(g0Var, null, 1, null);
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d n5.g0<? super T> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((a) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @n6.d
    public static final <T> kotlinx.coroutines.flow.i<T> a(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, @n6.d p pVar, @n6.d p.b bVar) {
        u4.l0.p(iVar, "<this>");
        u4.l0.p(pVar, "lifecycle");
        u4.l0.p(bVar, "minActiveState");
        return kotlinx.coroutines.flow.k.s(new a(pVar, bVar, iVar, null));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i b(kotlinx.coroutines.flow.i iVar, p pVar, p.b bVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            bVar = p.b.STARTED;
        }
        return a(iVar, pVar, bVar);
    }
}
