package kotlinx.coroutines.flow;

import v3.m2;
/* loaded from: classes.dex */
public class f<T> extends p5.e<T> {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final t4.p<n5.g0<? super T>, e4.d<? super m2>, Object> f12220n;

    public /* synthetic */ f(t4.p pVar, e4.g gVar, int i7, n5.m mVar, int i8, u4.w wVar) {
        this(pVar, (i8 & 2) != 0 ? e4.i.f8770k : gVar, (i8 & 4) != 0 ? -2 : i7, (i8 & 8) != 0 ? n5.m.SUSPEND : mVar);
    }

    public static /* synthetic */ Object p(f fVar, n5.g0 g0Var, e4.d dVar) {
        Object J = fVar.f12220n.J(g0Var, dVar);
        return J == g4.d.h() ? J : m2.f17815a;
    }

    @Override // p5.e
    @n6.e
    public Object g(@n6.d n5.g0<? super T> g0Var, @n6.d e4.d<? super m2> dVar) {
        return p(this, g0Var, dVar);
    }

    @Override // p5.e
    @n6.d
    public p5.e<T> i(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        return new f(this.f12220n, gVar, i7, mVar);
    }

    @Override // p5.e
    @n6.d
    public String toString() {
        return "block[" + this.f12220n + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@n6.d t4.p<? super n5.g0<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar, @n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        super(gVar, i7, mVar);
        this.f12220n = pVar;
    }
}
