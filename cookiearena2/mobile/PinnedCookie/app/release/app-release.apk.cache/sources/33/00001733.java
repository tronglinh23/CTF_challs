package n5;

import kotlinx.coroutines.e3;
import kotlinx.coroutines.u0;
import n5.i0;
import v3.b1;

@e3
/* loaded from: classes.dex */
public interface f<E> extends u0, i0<E> {

    /* loaded from: classes.dex */
    public static final class a {
        @n6.d
        public static <E> kotlinx.coroutines.selects.d<E> b(@n6.d f<E> fVar) {
            return i0.a.d(fVar);
        }

        @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
        @n6.e
        public static <E> E c(@n6.d f<E> fVar) {
            return (E) i0.a.h(fVar);
        }

        @k4.h
        @v3.k(level = v3.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
        @n6.e
        public static <E> Object d(@n6.d f<E> fVar, @n6.d e4.d<? super E> dVar) {
            return i0.a.i(fVar, dVar);
        }
    }

    @n6.d
    n<E> m();
}