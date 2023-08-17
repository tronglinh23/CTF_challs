package kotlinx.coroutines;

import e4.g;
import kotlinx.coroutines.n2;
/* loaded from: classes.dex */
public interface c0 extends n2 {

    /* loaded from: classes.dex */
    public static final class a {
        public static <R> R b(@n6.d c0 c0Var, R r6, @n6.d t4.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) n2.a.d(c0Var, r6, pVar);
        }

        @n6.e
        public static <E extends g.b> E c(@n6.d c0 c0Var, @n6.d g.c<E> cVar) {
            return (E) n2.a.e(c0Var, cVar);
        }

        @n6.d
        public static e4.g d(@n6.d c0 c0Var, @n6.d g.c<?> cVar) {
            return n2.a.g(c0Var, cVar);
        }

        @n6.d
        public static e4.g e(@n6.d c0 c0Var, @n6.d e4.g gVar) {
            return n2.a.h(c0Var, gVar);
        }

        @n6.d
        @v3.k(level = v3.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static n2 f(@n6.d c0 c0Var, @n6.d n2 n2Var) {
            return n2.a.i(c0Var, n2Var);
        }
    }

    boolean h();

    boolean i(@n6.d Throwable th);
}
