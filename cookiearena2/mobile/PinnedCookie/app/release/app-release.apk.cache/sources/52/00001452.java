package kotlinx.coroutines.flow;

import v3.m2;

/* loaded from: classes.dex */
public final class h0<T> extends a<T> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final t4.p<j<? super T>, e4.d<? super m2>, Object> f12235k;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(@n6.d t4.p<? super j<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        this.f12235k = pVar;
    }

    @Override // kotlinx.coroutines.flow.a
    @n6.e
    public Object d(@n6.d j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
        Object J = this.f12235k.J(jVar, dVar);
        return J == g4.d.h() ? J : m2.f17815a;
    }
}