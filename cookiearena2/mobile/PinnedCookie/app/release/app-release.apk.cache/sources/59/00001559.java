package kotlinx.coroutines.internal;

import kotlinx.coroutines.i2;

/* loaded from: classes.dex */
public final class s0 {
    @i2
    public static /* synthetic */ void a() {
    }

    @i2
    public static final <T> T b(@n6.d Object obj, @n6.d t4.a<? extends T> aVar) {
        T n7;
        synchronized (obj) {
            try {
                n7 = aVar.n();
                u4.i0.d(1);
            } catch (Throwable th) {
                u4.i0.d(1);
                u4.i0.c(1);
                throw th;
            }
        }
        u4.i0.c(1);
        return n7;
    }
}