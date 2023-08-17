package kotlinx.coroutines;

import v3.d1;
/* loaded from: classes.dex */
public final class h3<T> extends u2 {
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final r<T> f12752o;

    /* JADX WARN: Multi-variable type inference failed */
    public h3(@n6.d r<? super T> rVar) {
        this.f12752o = rVar;
    }

    @Override // t4.l
    public /* bridge */ /* synthetic */ v3.m2 O(Throwable th) {
        X0(th);
        return v3.m2.f17815a;
    }

    @Override // kotlinx.coroutines.g0
    public void X0(@n6.e Throwable th) {
        Object V0 = Y0().V0();
        if (V0 instanceof e0) {
            r<T> rVar = this.f12752o;
            d1.a aVar = v3.d1.f17778l;
            rVar.D(v3.d1.b(v3.e1.a(((e0) V0).f11961a)));
            return;
        }
        r<T> rVar2 = this.f12752o;
        d1.a aVar2 = v3.d1.f17778l;
        rVar2.D(v3.d1.b(w2.o(V0)));
    }
}
