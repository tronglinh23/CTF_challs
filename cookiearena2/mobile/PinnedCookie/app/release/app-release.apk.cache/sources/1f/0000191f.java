package q4;

import k4.f;
import n6.e;
import s4.h;
import t4.l;
import u4.i0;
import u4.l0;
import v3.a1;
import v3.g1;
import v3.p;

@h(name = "AutoCloseableKt")
/* loaded from: classes.dex */
public final class a {
    @g1(version = "1.2")
    @a1
    public static final void a(@e AutoCloseable autoCloseable, @e Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                p.a(th, th2);
            }
        }
    }

    @g1(version = "1.2")
    @f
    public static final <T extends AutoCloseable, R> R b(T t6, l<? super T, ? extends R> lVar) {
        l0.p(lVar, "block");
        try {
            R O = lVar.O(t6);
            i0.d(1);
            a(t6, null);
            i0.c(1);
            return O;
        } finally {
        }
    }
}