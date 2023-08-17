package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class k2 extends o {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final t4.l<Throwable, v3.m2> f12897k;

    /* JADX WARN: Multi-variable type inference failed */
    public k2(@n6.d t4.l<? super Throwable, v3.m2> lVar) {
        this.f12897k = lVar;
    }

    @Override // t4.l
    public /* bridge */ /* synthetic */ v3.m2 O(Throwable th) {
        b(th);
        return v3.m2.f17815a;
    }

    @Override // kotlinx.coroutines.p
    public void b(@n6.e Throwable th) {
        this.f12897k.O(th);
    }

    @n6.d
    public String toString() {
        return "InvokeOnCancel[" + z0.a(this.f12897k) + '@' + z0.b(this) + ']';
    }
}
