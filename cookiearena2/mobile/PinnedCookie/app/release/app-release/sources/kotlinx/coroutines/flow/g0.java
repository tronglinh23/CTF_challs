package kotlinx.coroutines.flow;

import java.util.List;
import kotlinx.coroutines.n2;
/* loaded from: classes.dex */
public final class g0<T> implements t0<T>, c<T>, p5.r<T> {
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public final n2 f12232k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ t0<T> f12233l;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(@n6.d t0<? extends T> t0Var, @n6.e n2 n2Var) {
        this.f12232k = n2Var;
        this.f12233l = t0Var;
    }

    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @n6.e
    public Object a(@n6.d j<? super T> jVar, @n6.d e4.d<?> dVar) {
        return this.f12233l.a(jVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.i0
    @n6.d
    public List<T> b() {
        return this.f12233l.b();
    }

    @Override // p5.r
    @n6.d
    public i<T> c(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        return v0.d(this, gVar, i7, mVar);
    }

    @Override // kotlinx.coroutines.flow.t0
    public T getValue() {
        return this.f12233l.getValue();
    }
}
