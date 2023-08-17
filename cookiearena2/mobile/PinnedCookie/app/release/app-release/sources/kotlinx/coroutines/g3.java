package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class g3 extends g {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final kotlinx.coroutines.internal.y f12747k;

    public g3(@n6.d kotlinx.coroutines.internal.y yVar) {
        this.f12747k = yVar;
    }

    @Override // t4.l
    public /* bridge */ /* synthetic */ v3.m2 O(Throwable th) {
        b(th);
        return v3.m2.f17815a;
    }

    @Override // kotlinx.coroutines.p
    public void b(@n6.e Throwable th) {
        this.f12747k.Q0();
    }

    @n6.d
    public String toString() {
        return "RemoveOnCancel[" + this.f12747k + ']';
    }
}
