package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class m3<T, R> extends u2 {
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final kotlinx.coroutines.selects.f<R> f12911o;
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public final t4.p<T, e4.d<? super R>, Object> f12912p;

    /* JADX WARN: Multi-variable type inference failed */
    public m3(@n6.d kotlinx.coroutines.selects.f<? super R> fVar, @n6.d t4.p<? super T, ? super e4.d<? super R>, ? extends Object> pVar) {
        this.f12911o = fVar;
        this.f12912p = pVar;
    }

    @Override // t4.l
    public /* bridge */ /* synthetic */ v3.m2 O(Throwable th) {
        X0(th);
        return v3.m2.f17815a;
    }

    @Override // kotlinx.coroutines.g0
    public void X0(@n6.e Throwable th) {
        if (this.f12911o.S()) {
            Y0().v1(this.f12911o, this.f12912p);
        }
    }
}
