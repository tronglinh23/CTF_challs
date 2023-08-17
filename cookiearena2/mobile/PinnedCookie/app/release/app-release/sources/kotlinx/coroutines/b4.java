package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class b4 extends o0 {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final b4 f11858m = new b4();

    @Override // kotlinx.coroutines.o0
    public void V0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        e4 e4Var = (e4) gVar.e(e4.f11963m);
        if (e4Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        e4Var.f11964l = true;
    }

    @Override // kotlinx.coroutines.o0
    public boolean X0(@n6.d e4.g gVar) {
        return false;
    }

    @Override // kotlinx.coroutines.o0
    @c2
    @n6.d
    public o0 Y0(int i7) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.o0
    @n6.d
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
