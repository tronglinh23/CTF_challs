package n5;

import kotlinx.coroutines.c2;
import v3.b1;
import v3.m2;
/* loaded from: classes.dex */
public interface m0<E> {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ boolean a(m0 m0Var, Throwable th, int i7, Object obj) {
            if (obj == null) {
                if ((i7 & 1) != 0) {
                    th = null;
                }
                return m0Var.w(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }

        @c2
        public static /* synthetic */ void b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@n6.d m0<? super E> m0Var, E e7) {
            Object V = m0Var.V(e7);
            if (r.m(V)) {
                return true;
            }
            Throwable f7 = r.f(V);
            if (f7 == null) {
                return false;
            }
            throw kotlinx.coroutines.internal.q0.p(f7);
        }
    }

    @n6.d
    Object V(E e7);

    boolean W();

    @c2
    void a0(@n6.d t4.l<? super Throwable, m2> lVar);

    @n6.d
    kotlinx.coroutines.selects.e<E, m0<E>> j();

    @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    boolean s(E e7);

    boolean w(@n6.e Throwable th);

    @n6.e
    Object z(E e7, @n6.d e4.d<? super m2> dVar);
}
