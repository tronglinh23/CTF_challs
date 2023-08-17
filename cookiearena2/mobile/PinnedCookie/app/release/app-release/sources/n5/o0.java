package n5;

import v3.m2;
/* loaded from: classes.dex */
public final class o0<E> extends n0<E> {
    @n6.d
    @s4.e

    /* renamed from: p  reason: collision with root package name */
    public final t4.l<E, m2> f13972p;

    /* JADX WARN: Multi-variable type inference failed */
    public o0(E e7, @n6.d kotlinx.coroutines.q<? super m2> qVar, @n6.d t4.l<? super E, m2> lVar) {
        super(e7, qVar);
        this.f13972p = lVar;
    }

    @Override // kotlinx.coroutines.internal.y
    public boolean Q0() {
        if (super.Q0()) {
            b1();
            return true;
        }
        return false;
    }

    @Override // n5.l0
    public void b1() {
        kotlinx.coroutines.internal.i0.b(this.f13972p, Y0(), this.f13970o.g());
    }
}
