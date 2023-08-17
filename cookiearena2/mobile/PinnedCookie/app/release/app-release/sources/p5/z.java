package p5;
/* loaded from: classes.dex */
public final class z<T> implements e4.d<T>, h4.e {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final e4.d<T> f14981k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final e4.g f14982l;

    /* JADX WARN: Multi-variable type inference failed */
    public z(@n6.d e4.d<? super T> dVar, @n6.d e4.g gVar) {
        this.f14981k = dVar;
        this.f14982l = gVar;
    }

    @Override // e4.d
    public void D(@n6.d Object obj) {
        this.f14981k.D(obj);
    }

    @Override // e4.d
    @n6.d
    public e4.g g() {
        return this.f14982l;
    }

    @Override // h4.e
    @n6.e
    public StackTraceElement k0() {
        return null;
    }

    @Override // h4.e
    @n6.e
    public h4.e v() {
        e4.d<T> dVar = this.f14981k;
        if (dVar instanceof h4.e) {
            return (h4.e) dVar;
        }
        return null;
    }
}
