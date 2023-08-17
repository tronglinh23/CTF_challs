package kotlinx.coroutines;

/* loaded from: classes.dex */
public final class n3<R> extends u2 {
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final kotlinx.coroutines.selects.f<R> f12922o;
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public final t4.l<e4.d<? super R>, Object> f12923p;

    /* JADX WARN: Multi-variable type inference failed */
    public n3(@n6.d kotlinx.coroutines.selects.f<? super R> fVar, @n6.d t4.l<? super e4.d<? super R>, ? extends Object> lVar) {
        this.f12922o = fVar;
        this.f12923p = lVar;
    }

    @Override // t4.l
    public /* bridge */ /* synthetic */ v3.m2 O(Throwable th) {
        X0(th);
        return v3.m2.f17815a;
    }

    @Override // kotlinx.coroutines.g0
    public void X0(@n6.e Throwable th) {
        if (this.f12922o.S()) {
            q5.a.d(this.f12923p, this.f12922o.h());
        }
    }
}