package p5;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class l extends CancellationException {
    public l() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    @n6.d
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
