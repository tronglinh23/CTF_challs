package kotlinx.coroutines;

import e4.g;
import kotlinx.coroutines.s3;

@g1
@c2
/* loaded from: classes.dex */
public interface l0<S> extends s3<S> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <S, R> R a(@n6.d l0<S> l0Var, R r6, @n6.d t4.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) s3.a.a(l0Var, r6, pVar);
        }

        @n6.e
        public static <S, E extends g.b> E b(@n6.d l0<S> l0Var, @n6.d g.c<E> cVar) {
            return (E) s3.a.b(l0Var, cVar);
        }

        @n6.d
        public static <S> e4.g c(@n6.d l0<S> l0Var, @n6.d g.c<?> cVar) {
            return s3.a.c(l0Var, cVar);
        }

        @n6.d
        public static <S> e4.g d(@n6.d l0<S> l0Var, @n6.d e4.g gVar) {
            return s3.a.d(l0Var, gVar);
        }
    }

    @n6.d
    l0<S> L();

    @n6.d
    e4.g p(@n6.d g.b bVar);
}