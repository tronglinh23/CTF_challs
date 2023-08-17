package p5;

import kotlinx.coroutines.i2;
import n5.m0;
import v3.m2;
@i2
/* loaded from: classes.dex */
public final class y<T> implements kotlinx.coroutines.flow.j<T> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final m0<T> f14980k;

    /* JADX WARN: Multi-variable type inference failed */
    public y(@n6.d m0<? super T> m0Var) {
        this.f14980k = m0Var;
    }

    @Override // kotlinx.coroutines.flow.j
    @n6.e
    public Object f(T t6, @n6.d e4.d<? super m2> dVar) {
        Object z6 = this.f14980k.z(t6, dVar);
        return z6 == g4.d.h() ? z6 : m2.f17815a;
    }
}
