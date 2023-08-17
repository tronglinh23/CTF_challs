package n5;

import kotlinx.coroutines.u0;
import n5.m0;
import v3.b1;

/* loaded from: classes.dex */
public interface g0<E> extends u0, m0<E> {

    /* loaded from: classes.dex */
    public static final class a {
        @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean a(@n6.d g0<? super E> g0Var, E e7) {
            return m0.a.c(g0Var, e7);
        }
    }

    @n6.d
    m0<E> m();
}