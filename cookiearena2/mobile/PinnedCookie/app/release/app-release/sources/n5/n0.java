package n5;

import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.z0;
import v3.d1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public class n0<E> extends l0 {

    /* renamed from: n  reason: collision with root package name */
    public final E f13969n;
    @n6.d
    @s4.e

    /* renamed from: o  reason: collision with root package name */
    public final kotlinx.coroutines.q<m2> f13970o;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(E e7, @n6.d kotlinx.coroutines.q<? super m2> qVar) {
        this.f13969n = e7;
        this.f13970o = qVar;
    }

    @Override // n5.l0
    public void X0() {
        this.f13970o.t0(kotlinx.coroutines.s.f12943d);
    }

    @Override // n5.l0
    public E Y0() {
        return this.f13969n;
    }

    @Override // n5.l0
    public void Z0(@n6.d w<?> wVar) {
        kotlinx.coroutines.q<m2> qVar = this.f13970o;
        d1.a aVar = d1.f17778l;
        qVar.D(d1.b(e1.a(wVar.f1())));
    }

    @Override // n5.l0
    @n6.e
    public r0 a1(@n6.e y.d dVar) {
        if (this.f13970o.o(m2.f17815a, dVar != null ? dVar.f12875c : null) == null) {
            return null;
        }
        if (dVar != null) {
            dVar.d();
        }
        return kotlinx.coroutines.s.f12943d;
    }

    @Override // kotlinx.coroutines.internal.y
    @n6.d
    public String toString() {
        return z0.a(this) + '@' + z0.b(this) + '(' + Y0() + ')';
    }
}
