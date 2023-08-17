package n5;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.o2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.v2;
import n5.m0;
import v3.b1;
import v3.m2;
/* loaded from: classes.dex */
public class k<E> extends kotlinx.coroutines.a<m2> implements g0<E>, i<E> {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final i<E> f13944m;

    public k(@n6.d e4.g gVar, @n6.d i<E> iVar, boolean z6) {
        super(gVar, false, z6);
        this.f13944m = iVar;
        Y0((n2) gVar.e(n2.f12920c));
    }

    @n6.d
    public i0<E> B() {
        return this.f13944m.B();
    }

    @Override // kotlinx.coroutines.a
    public void J1(@n6.d Throwable th, boolean z6) {
        if (this.f13944m.b(th) || z6) {
            return;
        }
        r0.b(g(), th);
    }

    @n6.d
    public final i<E> M1() {
        return this.f13944m;
    }

    @Override // kotlinx.coroutines.a
    /* renamed from: N1  reason: merged with bridge method [inline-methods] */
    public void K1(@n6.d m2 m2Var) {
        m0.a.a(this.f13944m, null, 1, null);
    }

    @Override // n5.m0
    @n6.d
    public Object V(E e7) {
        return this.f13944m.V(e7);
    }

    @Override // n5.m0
    public boolean W() {
        return this.f13944m.W();
    }

    @Override // n5.m0
    @c2
    public void a0(@n6.d t4.l<? super Throwable, m2> lVar) {
        this.f13944m.a0(lVar);
    }

    @Override // kotlinx.coroutines.v2, kotlinx.coroutines.n2
    @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean b(Throwable th) {
        if (th == null) {
            th = new o2(y0(), null, this);
        }
        u0(th);
        return true;
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.v2, kotlinx.coroutines.n2
    public boolean d() {
        return super.d();
    }

    @Override // kotlinx.coroutines.v2, kotlinx.coroutines.n2
    public final void f(@n6.e CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new o2(y0(), null, this);
        }
        u0(cancellationException);
    }

    @Override // n5.m0
    @n6.d
    public kotlinx.coroutines.selects.e<E, m0<E>> j() {
        return this.f13944m.j();
    }

    @Override // n5.g0
    @n6.d
    public m0<E> m() {
        return this;
    }

    @Override // n5.m0
    @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean s(E e7) {
        return this.f13944m.s(e7);
    }

    @Override // kotlinx.coroutines.v2
    public void u0(@n6.d Throwable th) {
        CancellationException A1 = v2.A1(this, th, null, 1, null);
        this.f13944m.f(A1);
        o0(A1);
    }

    @Override // n5.m0
    /* renamed from: w */
    public boolean b(@n6.e Throwable th) {
        boolean b7 = this.f13944m.b(th);
        start();
        return b7;
    }

    @Override // n5.m0
    @n6.e
    public Object z(E e7, @n6.d e4.d<? super m2> dVar) {
        return this.f13944m.z(e7, dVar);
    }
}
