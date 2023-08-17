package kotlinx.coroutines;

import e4.g;
/* loaded from: classes.dex */
public interface s3<S> extends g.b {

    /* loaded from: classes.dex */
    public static final class a {
        public static <S, R> R a(@n6.d s3<S> s3Var, R r6, @n6.d t4.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(s3Var, r6, pVar);
        }

        @n6.e
        public static <S, E extends g.b> E b(@n6.d s3<S> s3Var, @n6.d g.c<E> cVar) {
            return (E) g.b.a.b(s3Var, cVar);
        }

        @n6.d
        public static <S> e4.g c(@n6.d s3<S> s3Var, @n6.d g.c<?> cVar) {
            return g.b.a.c(s3Var, cVar);
        }

        @n6.d
        public static <S> e4.g d(@n6.d s3<S> s3Var, @n6.d e4.g gVar) {
            return g.b.a.d(s3Var, gVar);
        }
    }

    S C(@n6.d e4.g gVar);

    void E(@n6.d e4.g gVar, S s6);
}
