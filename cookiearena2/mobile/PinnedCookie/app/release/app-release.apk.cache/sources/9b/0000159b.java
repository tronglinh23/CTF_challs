package kotlinx.coroutines;

import e4.g;

/* loaded from: classes.dex */
public interface p0 extends g.b {
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final b f12928b = b.f12929k;

    /* loaded from: classes.dex */
    public static final class a {
        public static <R> R a(@n6.d p0 p0Var, R r6, @n6.d t4.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(p0Var, r6, pVar);
        }

        @n6.e
        public static <E extends g.b> E b(@n6.d p0 p0Var, @n6.d g.c<E> cVar) {
            return (E) g.b.a.b(p0Var, cVar);
        }

        @n6.d
        public static e4.g c(@n6.d p0 p0Var, @n6.d g.c<?> cVar) {
            return g.b.a.c(p0Var, cVar);
        }

        @n6.d
        public static e4.g d(@n6.d p0 p0Var, @n6.d e4.g gVar) {
            return g.b.a.d(p0Var, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g.c<p0> {

        /* renamed from: k  reason: collision with root package name */
        public static final /* synthetic */ b f12929k = new b();
    }

    void I0(@n6.d e4.g gVar, @n6.d Throwable th);
}