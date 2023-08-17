package kotlinx.coroutines.internal;
/* loaded from: classes.dex */
public final class j implements kotlinx.coroutines.u0 {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final e4.g f12814k;

    public j(@n6.d e4.g gVar) {
        this.f12814k = gVar;
    }

    @Override // kotlinx.coroutines.u0
    @n6.d
    public e4.g I() {
        return this.f12814k;
    }

    @n6.d
    public String toString() {
        return "CoroutineScope(coroutineContext=" + I() + ')';
    }
}
