package n4;

import java.io.Closeable;
import u4.i0;
import u4.l0;
import v3.a1;
import v3.g1;
@s4.h(name = "CloseableKt")
/* loaded from: classes.dex */
public final class c {
    @g1(version = "1.1")
    @a1
    public static final void a(@n6.e Closeable closeable, @n6.e Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                v3.p.a(th, th2);
            }
        }
    }

    @k4.f
    public static final <T extends Closeable, R> R b(T t6, t4.l<? super T, ? extends R> lVar) {
        l0.p(lVar, "block");
        try {
            R O = lVar.O(t6);
            i0.d(1);
            if (k4.m.a(1, 1, 0)) {
                a(t6, null);
            } else if (t6 != null) {
                t6.close();
            }
            i0.c(1);
            return O;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                i0.d(1);
                if (k4.m.a(1, 1, 0)) {
                    a(t6, th);
                } else if (t6 != null) {
                    try {
                        t6.close();
                    } catch (Throwable unused) {
                    }
                }
                i0.c(1);
                throw th2;
            }
        }
    }
}
