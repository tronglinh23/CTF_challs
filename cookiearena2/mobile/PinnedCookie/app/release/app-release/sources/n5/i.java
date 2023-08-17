package n5;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.e3;
import n5.m0;
import v3.b1;
@e3
/* loaded from: classes.dex */
public interface i<E> extends m0<E> {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(i iVar, CancellationException cancellationException, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i7 & 1) != 0) {
                cancellationException = null;
            }
            iVar.f(cancellationException);
        }

        public static /* synthetic */ boolean b(i iVar, Throwable th, int i7, Object obj) {
            if (obj == null) {
                if ((i7 & 1) != 0) {
                    th = null;
                }
                return iVar.b(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@n6.d i<E> iVar, E e7) {
            return m0.a.c(iVar, e7);
        }
    }

    @n6.d
    i0<E> B();

    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility only")
    /* synthetic */ boolean b(Throwable th);

    void f(@n6.e CancellationException cancellationException);
}
