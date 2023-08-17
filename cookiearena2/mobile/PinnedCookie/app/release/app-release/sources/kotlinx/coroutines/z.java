package kotlinx.coroutines;

import e4.g;
import kotlinx.coroutines.c1;
/* loaded from: classes.dex */
public interface z<T> extends c1<T> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <T, R> R b(@n6.d z<T> zVar, R r6, @n6.d t4.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) c1.a.b(zVar, r6, pVar);
        }

        @n6.e
        public static <T, E extends g.b> E c(@n6.d z<T> zVar, @n6.d g.c<E> cVar) {
            return (E) c1.a.c(zVar, cVar);
        }

        @n6.d
        public static <T> e4.g d(@n6.d z<T> zVar, @n6.d g.c<?> cVar) {
            return c1.a.d(zVar, cVar);
        }

        @n6.d
        public static <T> e4.g e(@n6.d z<T> zVar, @n6.d e4.g gVar) {
            return c1.a.e(zVar, gVar);
        }

        @n6.d
        @v3.k(level = v3.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> n2 f(@n6.d z<T> zVar, @n6.d n2 n2Var) {
            return c1.a.f(zVar, n2Var);
        }
    }

    boolean d0(T t6);

    boolean i(@n6.d Throwable th);
}
