package p5;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class a extends CancellationException {
    @n6.d
    @s4.e

    /* renamed from: k  reason: collision with root package name */
    public final transient kotlinx.coroutines.flow.j<?> f14831k;

    public a(@n6.d kotlinx.coroutines.flow.j<?> jVar) {
        super("Flow was aborted, no more elements needed");
        this.f14831k = jVar;
    }

    @Override // java.lang.Throwable
    @n6.d
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
