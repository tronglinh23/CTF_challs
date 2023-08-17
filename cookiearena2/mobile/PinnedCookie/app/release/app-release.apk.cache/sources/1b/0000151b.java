package kotlinx.coroutines;

/* loaded from: classes.dex */
public final class h1 extends RuntimeException {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final e4.g f12750k;

    public h1(@n6.d e4.g gVar) {
        this.f12750k = gVar;
    }

    @Override // java.lang.Throwable
    @n6.d
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @n6.d
    public String getLocalizedMessage() {
        return this.f12750k.toString();
    }
}