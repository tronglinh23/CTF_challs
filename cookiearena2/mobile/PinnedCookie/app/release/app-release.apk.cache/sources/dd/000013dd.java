package kotlinx.coroutines.debug.internal;

/* loaded from: classes.dex */
public final class n implements h4.e {
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public final h4.e f11951k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final StackTraceElement f11952l;

    public n(@n6.e h4.e eVar, @n6.d StackTraceElement stackTraceElement) {
        this.f11951k = eVar;
        this.f11952l = stackTraceElement;
    }

    @Override // h4.e
    @n6.d
    public StackTraceElement k0() {
        return this.f11952l;
    }

    @Override // h4.e
    @n6.e
    public h4.e v() {
        return this.f11951k;
    }
}