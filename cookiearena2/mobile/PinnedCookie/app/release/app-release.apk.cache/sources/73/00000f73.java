package f4;

import java.util.concurrent.CancellationException;
import k4.f;
import u4.r1;
import v3.g1;

@r1({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* loaded from: classes.dex */
public final class a {
    @g1(version = "1.4")
    @f
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @g1(version = "1.4")
    @f
    public static final CancellationException b(Throwable th) {
        CancellationException cancellationException = new CancellationException(th != null ? th.toString() : null);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @g1(version = "1.4")
    public static /* synthetic */ void c() {
    }
}