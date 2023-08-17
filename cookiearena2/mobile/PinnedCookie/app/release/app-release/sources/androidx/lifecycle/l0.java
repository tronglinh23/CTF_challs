package androidx.lifecycle;

import androidx.lifecycle.p;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.n2;
import v3.m2;
/* loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @h4.f(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class a<T> extends h4.o implements t4.p<kotlinx.coroutines.u0, e4.d<? super T>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f4772o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f4773p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ p f4774q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ p.b f4775r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ t4.p<kotlinx.coroutines.u0, e4.d<? super T>, Object> f4776s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p pVar, p.b bVar, t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super T>, ? extends Object> pVar2, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f4774q = pVar;
            this.f4775r = bVar;
            this.f4776s = pVar2;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            a aVar = new a(this.f4774q, this.f4775r, this.f4776s, dVar);
            aVar.f4773p = obj;
            return aVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            r rVar;
            Object h7 = g4.d.h();
            int i7 = this.f4772o;
            if (i7 == 0) {
                v3.e1.n(obj);
                n2 n2Var = (n2) ((kotlinx.coroutines.u0) this.f4773p).getCoroutineContext().e(n2.f12920c);
                if (n2Var == null) {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
                k0 k0Var = new k0();
                r rVar2 = new r(this.f4774q, this.f4775r, k0Var.f4762m, n2Var);
                try {
                    t4.p<kotlinx.coroutines.u0, e4.d<? super T>, Object> pVar = this.f4776s;
                    this.f4773p = rVar2;
                    this.f4772o = 1;
                    obj = kotlinx.coroutines.j.h(k0Var, pVar, this);
                    if (obj == h7) {
                        return h7;
                    }
                    rVar = rVar2;
                } catch (Throwable th) {
                    th = th;
                    rVar = rVar2;
                    rVar.b();
                    throw th;
                }
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rVar = (r) this.f4773p;
                try {
                    v3.e1.n(obj);
                } catch (Throwable th2) {
                    th = th2;
                    rVar.b();
                    throw th;
                }
            }
            rVar.b();
            return obj;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d kotlinx.coroutines.u0 u0Var, @n6.e e4.d<? super T> dVar) {
            return ((a) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    @v3.k(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @n6.e
    public static final <T> Object a(@n6.d p pVar, @n6.d t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super T>, ? extends Object> pVar2, @n6.d e4.d<? super T> dVar) {
        return g(pVar, p.b.CREATED, pVar2, dVar);
    }

    @v3.k(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @n6.e
    public static final <T> Object b(@n6.d z zVar, @n6.d t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super T>, ? extends Object> pVar, @n6.d e4.d<? super T> dVar) {
        return a(zVar.getLifecycle(), pVar, dVar);
    }

    @v3.k(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @n6.e
    public static final <T> Object c(@n6.d p pVar, @n6.d t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super T>, ? extends Object> pVar2, @n6.d e4.d<? super T> dVar) {
        return g(pVar, p.b.RESUMED, pVar2, dVar);
    }

    @v3.k(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @n6.e
    public static final <T> Object d(@n6.d z zVar, @n6.d t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super T>, ? extends Object> pVar, @n6.d e4.d<? super T> dVar) {
        return c(zVar.getLifecycle(), pVar, dVar);
    }

    @v3.k(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @n6.e
    public static final <T> Object e(@n6.d p pVar, @n6.d t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super T>, ? extends Object> pVar2, @n6.d e4.d<? super T> dVar) {
        return g(pVar, p.b.STARTED, pVar2, dVar);
    }

    @v3.k(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @n6.e
    public static final <T> Object f(@n6.d z zVar, @n6.d t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super T>, ? extends Object> pVar, @n6.d e4.d<? super T> dVar) {
        return e(zVar.getLifecycle(), pVar, dVar);
    }

    @v3.k(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    @n6.e
    public static final <T> Object g(@n6.d p pVar, @n6.d p.b bVar, @n6.d t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super T>, ? extends Object> pVar2, @n6.d e4.d<? super T> dVar) {
        return kotlinx.coroutines.j.h(m1.e().c1(), new a(pVar, bVar, pVar2, null), dVar);
    }
}
