package androidx.lifecycle;

import kotlinx.coroutines.n2;
import v3.m2;
/* loaded from: classes.dex */
public abstract class s implements kotlinx.coroutines.u0 {

    @h4.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends h4.o implements t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f4821o;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> f4823q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super m2>, ? extends Object> pVar, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f4823q = pVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            return new a(this.f4823q, dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f4821o;
            if (i7 == 0) {
                v3.e1.n(obj);
                p lifecycle = s.this.getLifecycle();
                t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> pVar = this.f4823q;
                this.f4821o = 1;
                if (l0.a(lifecycle, pVar, this) == h7) {
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
            return ((a) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class b extends h4.o implements t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f4824o;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> f4826q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super m2>, ? extends Object> pVar, e4.d<? super b> dVar) {
            super(2, dVar);
            this.f4826q = pVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            return new b(this.f4826q, dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f4824o;
            if (i7 == 0) {
                v3.e1.n(obj);
                p lifecycle = s.this.getLifecycle();
                t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> pVar = this.f4826q;
                this.f4824o = 1;
                if (l0.c(lifecycle, pVar, this) == h7) {
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
            return ((b) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", i = {}, l = {356}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class c extends h4.o implements t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f4827o;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> f4829q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super m2>, ? extends Object> pVar, e4.d<? super c> dVar) {
            super(2, dVar);
            this.f4829q = pVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            return new c(this.f4829q, dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f4827o;
            if (i7 == 0) {
                v3.e1.n(obj);
                p lifecycle = s.this.getLifecycle();
                t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> pVar = this.f4829q;
                this.f4827o = 1;
                if (l0.e(lifecycle, pVar, this) == h7) {
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
            return ((c) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    @n6.d
    /* renamed from: h */
    public abstract p getLifecycle();

    @n6.d
    @v3.k(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    public final n2 i(@n6.d t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super m2>, ? extends Object> pVar) {
        u4.l0.p(pVar, "block");
        return kotlinx.coroutines.j.e(this, null, null, new a(pVar, null), 3, null);
    }

    @n6.d
    @v3.k(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    public final n2 j(@n6.d t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super m2>, ? extends Object> pVar) {
        u4.l0.p(pVar, "block");
        return kotlinx.coroutines.j.e(this, null, null, new b(pVar, null), 3, null);
    }

    @n6.d
    @v3.k(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    public final n2 k(@n6.d t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super m2>, ? extends Object> pVar) {
        u4.l0.p(pVar, "block");
        return kotlinx.coroutines.j.e(this, null, null, new c(pVar, null), 3, null);
    }
}
