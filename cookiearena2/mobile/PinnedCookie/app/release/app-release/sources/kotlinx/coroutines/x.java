package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class x extends p2 implements w {
    @n6.d
    @s4.e

    /* renamed from: o  reason: collision with root package name */
    public final y f13162o;

    public x(@n6.d y yVar) {
        this.f13162o = yVar;
    }

    @Override // t4.l
    public /* bridge */ /* synthetic */ v3.m2 O(Throwable th) {
        X0(th);
        return v3.m2.f17815a;
    }

    @Override // kotlinx.coroutines.g0
    public void X0(@n6.e Throwable th) {
        this.f13162o.C0(Y0());
    }

    @Override // kotlinx.coroutines.w
    public boolean a0(@n6.d Throwable th) {
        return Y0().z0(th);
    }

    @Override // kotlinx.coroutines.w
    @n6.d
    public n2 getParent() {
        return Y0();
    }
}
