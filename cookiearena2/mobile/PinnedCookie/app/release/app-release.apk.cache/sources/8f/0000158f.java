package kotlinx.coroutines;

import e4.g;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public interface n2 extends g.b {
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final b f12920c = b.f12921k;

    /* loaded from: classes.dex */
    public static final class a {
        @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void a(n2 n2Var) {
            n2Var.f(null);
        }

        public static /* synthetic */ void b(n2 n2Var, CancellationException cancellationException, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i7 & 1) != 0) {
                cancellationException = null;
            }
            n2Var.f(cancellationException);
        }

        public static /* synthetic */ boolean c(n2 n2Var, Throwable th, int i7, Object obj) {
            if (obj == null) {
                if ((i7 & 1) != 0) {
                    th = null;
                }
                return n2Var.b(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R d(@n6.d n2 n2Var, R r6, @n6.d t4.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(n2Var, r6, pVar);
        }

        @n6.e
        public static <E extends g.b> E e(@n6.d n2 n2Var, @n6.d g.c<E> cVar) {
            return (E) g.b.a.b(n2Var, cVar);
        }

        public static /* synthetic */ p1 f(n2 n2Var, boolean z6, boolean z7, t4.l lVar, int i7, Object obj) {
            if (obj == null) {
                if ((i7 & 1) != 0) {
                    z6 = false;
                }
                if ((i7 & 2) != 0) {
                    z7 = true;
                }
                return n2Var.p0(z6, z7, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        @n6.d
        public static e4.g g(@n6.d n2 n2Var, @n6.d g.c<?> cVar) {
            return g.b.a.c(n2Var, cVar);
        }

        @n6.d
        public static e4.g h(@n6.d n2 n2Var, @n6.d e4.g gVar) {
            return g.b.a.d(n2Var, gVar);
        }

        @n6.d
        @v3.k(level = v3.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static n2 i(@n6.d n2 n2Var, @n6.d n2 n2Var2) {
            return n2Var2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g.c<n2> {

        /* renamed from: k  reason: collision with root package name */
        public static final /* synthetic */ b f12921k = new b();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    n2 A(@n6.d n2 n2Var);

    @n6.e
    Object E0(@n6.d e4.d<? super v3.m2> dVar);

    @n6.d
    f5.m<n2> Q();

    @n6.d
    @i2
    w T0(@n6.d y yVar);

    @n6.d
    p1 X(@n6.d t4.l<? super Throwable, v3.m2> lVar);

    @n6.d
    kotlinx.coroutines.selects.c Z();

    @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean b(Throwable th);

    @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    boolean d();

    void f(@n6.e CancellationException cancellationException);

    boolean isCancelled();

    boolean l();

    @n6.d
    @i2
    p1 p0(boolean z6, boolean z7, @n6.d t4.l<? super Throwable, v3.m2> lVar);

    boolean start();

    @n6.d
    @i2
    CancellationException w0();
}