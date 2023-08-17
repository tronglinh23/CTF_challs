package kotlinx.coroutines.flow;

import java.util.List;
import kotlinx.coroutines.n2;
/* loaded from: classes.dex */
public final class f0<T> implements i0<T>, c<T>, p5.r<T> {
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public final n2 f12221k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ i0<T> f12222l;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(@n6.d i0<? extends T> i0Var, @n6.e n2 n2Var) {
        this.f12221k = n2Var;
        this.f12222l = i0Var;
    }

    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @n6.e
    public Object a(@n6.d j<? super T> jVar, @n6.d e4.d<?> dVar) {
        return this.f12222l.a(jVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.i0
    @n6.d
    public List<T> b() {
        return this.f12222l.b();
    }

    @Override // p5.r
    @n6.d
    public i<T> c(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        return k0.e(this, gVar, i7, mVar);
    }
}
