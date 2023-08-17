package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class q1 extends o {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final p1 f12931k;

    public q1(@n6.d p1 p1Var) {
        this.f12931k = p1Var;
    }

    @Override // t4.l
    public /* bridge */ /* synthetic */ v3.m2 O(Throwable th) {
        b(th);
        return v3.m2.f17815a;
    }

    @Override // kotlinx.coroutines.p
    public void b(@n6.e Throwable th) {
        this.f12931k.j();
    }

    @n6.d
    public String toString() {
        return "DisposeOnCancel[" + this.f12931k + ']';
    }
}
