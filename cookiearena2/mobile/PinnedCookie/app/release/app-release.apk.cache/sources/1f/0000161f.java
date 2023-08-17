package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class y1 {
    @n6.d
    public static final CancellationException a(@n6.e String str, @n6.e Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final void b(@n6.d Throwable th, @n6.d Throwable th2) {
        v3.p.a(th, th2);
    }
}