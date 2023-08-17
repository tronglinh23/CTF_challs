package kotlinx.coroutines.internal;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public d<?> f12761a;

    public abstract void a(@n6.d d<?> dVar, @n6.e Object obj);

    @n6.d
    public final d<?> b() {
        d<?> dVar = this.f12761a;
        if (dVar != null) {
            return dVar;
        }
        u4.l0.S("atomicOp");
        return null;
    }

    @n6.e
    public abstract Object c(@n6.d d<?> dVar);

    public final void d(@n6.d d<?> dVar) {
        this.f12761a = dVar;
    }
}