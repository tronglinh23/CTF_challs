package n5;

import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.z0;
/* loaded from: classes.dex */
public final class w<E> extends l0 implements j0<E> {
    @s4.e
    @n6.e

    /* renamed from: n  reason: collision with root package name */
    public final Throwable f14213n;

    public w(@n6.e Throwable th) {
        this.f14213n = th;
    }

    @Override // n5.j0
    public void A(E e7) {
    }

    @Override // n5.l0
    public void X0() {
    }

    @Override // n5.l0
    public void Z0(@n6.d w<?> wVar) {
    }

    @Override // n5.l0
    @n6.d
    public r0 a1(@n6.e y.d dVar) {
        r0 r0Var = kotlinx.coroutines.s.f12943d;
        if (dVar != null) {
            dVar.d();
        }
        return r0Var;
    }

    @Override // n5.j0
    @n6.d
    public r0 c0(E e7, @n6.e y.d dVar) {
        r0 r0Var = kotlinx.coroutines.s.f12943d;
        if (dVar != null) {
            dVar.d();
        }
        return r0Var;
    }

    @Override // n5.j0
    @n6.d
    /* renamed from: c1  reason: merged with bridge method [inline-methods] */
    public w<E> R() {
        return this;
    }

    @Override // n5.l0
    @n6.d
    /* renamed from: d1  reason: merged with bridge method [inline-methods] */
    public w<E> Y0() {
        return this;
    }

    @n6.d
    public final Throwable e1() {
        Throwable th = this.f14213n;
        return th == null ? new x(s.f13998a) : th;
    }

    @n6.d
    public final Throwable f1() {
        Throwable th = this.f14213n;
        return th == null ? new y(s.f13998a) : th;
    }

    @Override // kotlinx.coroutines.internal.y
    @n6.d
    public String toString() {
        return "Closed@" + z0.b(this) + '[' + this.f14213n + ']';
    }
}
