package kotlinx.coroutines.flow;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import v3.b1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final class c0 {

    @h4.f(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends h4.o implements t4.p<Throwable, e4.d<? super Boolean>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f12211o;

        public a(e4.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            return new a(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            g4.d.h();
            if (this.f12211o == 0) {
                e1.n(obj);
                return h4.b.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d Throwable th, @n6.e e4.d<? super Boolean> dVar) {
            return ((a) H(th, dVar)).Q(m2.f17815a);
        }
    }

    @v3.k(level = v3.m.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @b1(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void a(@n6.d j<?> jVar, @n6.e CancellationException cancellationException) {
        k.b1();
        throw new v3.y();
    }

    public static /* synthetic */ void b(j jVar, CancellationException cancellationException, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            cancellationException = null;
        }
        a(jVar, cancellationException);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> c(@n6.d i0<? extends T> i0Var) {
        k.b1();
        throw new v3.y();
    }

    @v3.k(level = v3.m.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @b1(expression = "this", imports = {}))
    @k4.f
    public static final <T> i<T> d(i0<? extends T> i0Var, t4.q<? super j<? super T>, ? super Throwable, ? super e4.d<? super m2>, ? extends Object> qVar) {
        return k.u(i0Var, qVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> e(@n6.d t0<? extends T> t0Var) {
        k.b1();
        throw new v3.y();
    }

    @v3.k(level = v3.m.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @k4.f
    public static final <T> Object f(i0<? extends T> i0Var, e4.d<? super Integer> dVar) {
        u4.i0.e(0);
        Object Y = k.Y(i0Var, dVar);
        u4.i0.e(1);
        return Y;
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> g(@n6.d t0<? extends T> t0Var) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> h(@n6.d i0<? extends T> i0Var, @n6.d e4.g gVar) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    public static final e4.g i(@n6.d j<?> jVar) {
        k.b1();
        throw new v3.y();
    }

    @v3.k(level = v3.m.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @b1(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void j(j jVar) {
    }

    public static final boolean k(@n6.d j<?> jVar) {
        k.b1();
        throw new v3.y();
    }

    @v3.k(level = v3.m.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @b1(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void l(j jVar) {
    }

    @v3.k(level = v3.m.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @b1(expression = "this", imports = {}))
    @k4.f
    public static final <T> i<T> m(i0<? extends T> i0Var, long j7, t4.p<? super Throwable, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
        return k.v1(i0Var, j7, pVar);
    }

    public static /* synthetic */ i n(i0 i0Var, long j7, t4.p pVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = Long.MAX_VALUE;
        }
        if ((i7 & 2) != 0) {
            pVar = new a(null);
        }
        return k.v1(i0Var, j7, pVar);
    }

    @v3.k(level = v3.m.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @b1(expression = "this", imports = {}))
    @k4.f
    public static final <T> i<T> o(i0<? extends T> i0Var, t4.r<? super j<? super T>, ? super Throwable, ? super Long, ? super e4.d<? super Boolean>, ? extends Object> rVar) {
        return k.x1(i0Var, rVar);
    }

    @v3.k(level = v3.m.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @k4.f
    public static final <T> Object p(i0<? extends T> i0Var, e4.d<? super List<? extends T>> dVar) {
        Object c7;
        u4.i0.e(0);
        c7 = o.c(i0Var, null, dVar, 1, null);
        u4.i0.e(1);
        return c7;
    }

    @v3.k(level = v3.m.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @k4.f
    public static final <T> Object q(i0<? extends T> i0Var, e4.d<? super Set<? extends T>> dVar) {
        Object e7;
        u4.i0.e(0);
        e7 = o.e(i0Var, null, dVar, 1, null);
        u4.i0.e(1);
        return e7;
    }
}
