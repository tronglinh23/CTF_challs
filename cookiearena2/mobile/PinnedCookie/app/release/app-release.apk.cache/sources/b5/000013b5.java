package kotlinx.coroutines;

import e4.g;
import kotlinx.coroutines.n2;

/* loaded from: classes.dex */
public interface c1<T> extends n2 {

    /* loaded from: classes.dex */
    public static final class a {
        public static <T, R> R b(@n6.d c1<? extends T> c1Var, R r6, @n6.d t4.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) n2.a.d(c1Var, r6, pVar);
        }

        @n6.e
        public static <T, E extends g.b> E c(@n6.d c1<? extends T> c1Var, @n6.d g.c<E> cVar) {
            return (E) n2.a.e(c1Var, cVar);
        }

        @n6.d
        public static <T> e4.g d(@n6.d c1<? extends T> c1Var, @n6.d g.c<?> cVar) {
            return n2.a.g(c1Var, cVar);
        }

        @n6.d
        public static <T> e4.g e(@n6.d c1<? extends T> c1Var, @n6.d e4.g gVar) {
            return n2.a.h(c1Var, gVar);
        }

        @n6.d
        @v3.k(level = v3.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> n2 f(@n6.d c1<? extends T> c1Var, @n6.d n2 n2Var) {
            return n2.a.i(c1Var, n2Var);
        }
    }

    @n6.d
    kotlinx.coroutines.selects.d<T> O();

    @c2
    @n6.e
    Throwable R();

    @n6.e
    Object f0(@n6.d e4.d<? super T> dVar);

    @c2
    T u();
}