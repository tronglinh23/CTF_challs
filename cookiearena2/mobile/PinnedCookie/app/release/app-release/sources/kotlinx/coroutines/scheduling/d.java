package kotlinx.coroutines.scheduling;
/* loaded from: classes.dex */
public final class d extends i {
    @n6.d

    /* renamed from: s  reason: collision with root package name */
    public static final d f12980s = new d();

    public d() {
        super(o.f13004c, o.f13005d, o.f13006e, o.f13002a);
    }

    @Override // kotlinx.coroutines.scheduling.i, kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final void g1() {
        super.close();
    }

    @Override // kotlinx.coroutines.o0
    @n6.d
    public String toString() {
        return "Dispatchers.Default";
    }
}
