package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class a0<T> extends v2 implements z<T>, kotlinx.coroutines.selects.d<T> {
    public a0(@n6.e n2 n2Var) {
        super(true);
        Y0(n2Var);
    }

    @Override // kotlinx.coroutines.c1
    @n6.d
    public kotlinx.coroutines.selects.d<T> O() {
        return this;
    }

    @Override // kotlinx.coroutines.v2
    public boolean Q0() {
        return true;
    }

    @Override // kotlinx.coroutines.selects.d
    public <R> void c(@n6.d kotlinx.coroutines.selects.f<? super R> fVar, @n6.d t4.p<? super T, ? super e4.d<? super R>, ? extends Object> pVar) {
        t1(fVar, pVar);
    }

    @Override // kotlinx.coroutines.z
    public boolean d0(T t6) {
        return g1(t6);
    }

    @Override // kotlinx.coroutines.c1
    @n6.e
    public Object f0(@n6.d e4.d<? super T> dVar) {
        Object l02 = l0(dVar);
        g4.d.h();
        return l02;
    }

    @Override // kotlinx.coroutines.z
    public boolean i(@n6.d Throwable th) {
        return g1(new e0(th, false, 2, null));
    }

    @Override // kotlinx.coroutines.c1
    public T u() {
        return (T) K0();
    }
}
