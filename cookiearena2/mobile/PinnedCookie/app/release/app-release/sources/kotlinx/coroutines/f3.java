package kotlinx.coroutines;

import e4.g;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.n2;
@v3.k(level = v3.m.ERROR, message = "This is internal API and may be removed in the future releases")
@i2
/* loaded from: classes.dex */
public interface f3 extends n2 {

    /* loaded from: classes.dex */
    public static final class a {
        public static <R> R b(@n6.d f3 f3Var, R r6, @n6.d t4.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) n2.a.d(f3Var, r6, pVar);
        }

        @n6.e
        public static <E extends g.b> E c(@n6.d f3 f3Var, @n6.d g.c<E> cVar) {
            return (E) n2.a.e(f3Var, cVar);
        }

        @n6.d
        public static e4.g d(@n6.d f3 f3Var, @n6.d g.c<?> cVar) {
            return n2.a.g(f3Var, cVar);
        }

        @n6.d
        public static e4.g e(@n6.d f3 f3Var, @n6.d e4.g gVar) {
            return n2.a.h(f3Var, gVar);
        }

        @n6.d
        @v3.k(level = v3.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static n2 f(@n6.d f3 f3Var, @n6.d n2 n2Var) {
            return n2.a.i(f3Var, n2Var);
        }
    }

    @n6.d
    @i2
    CancellationException q0();
}
