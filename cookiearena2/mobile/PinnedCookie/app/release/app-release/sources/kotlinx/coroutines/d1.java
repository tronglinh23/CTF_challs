package kotlinx.coroutines;
/* loaded from: classes.dex */
public class d1<T> extends a<T> implements c1<T>, kotlinx.coroutines.selects.d<T> {
    public d1(@n6.d e4.g gVar, boolean z6) {
        super(gVar, true, z6);
    }

    public static /* synthetic */ Object M1(d1 d1Var, e4.d dVar) {
        Object l02 = d1Var.l0(dVar);
        g4.d.h();
        return l02;
    }

    @Override // kotlinx.coroutines.c1
    @n6.d
    public kotlinx.coroutines.selects.d<T> O() {
        return this;
    }

    @Override // kotlinx.coroutines.selects.d
    public <R> void c(@n6.d kotlinx.coroutines.selects.f<? super R> fVar, @n6.d t4.p<? super T, ? super e4.d<? super R>, ? extends Object> pVar) {
        t1(fVar, pVar);
    }

    @Override // kotlinx.coroutines.c1
    @n6.e
    public Object f0(@n6.d e4.d<? super T> dVar) {
        return M1(this, dVar);
    }

    @Override // kotlinx.coroutines.c1
    public T u() {
        return (T) K0();
    }
}
