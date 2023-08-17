package n5;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.o2;
import kotlinx.coroutines.v2;
import v3.b1;
import v3.m2;
/* loaded from: classes.dex */
public class o<E> extends kotlinx.coroutines.a<m2> implements n<E> {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final n<E> f13971m;

    public o(@n6.d e4.g gVar, @n6.d n<E> nVar, boolean z6, boolean z7) {
        super(gVar, z6, z7);
        this.f13971m = nVar;
    }

    @Override // n5.i0
    @n6.e
    public Object F(@n6.d e4.d<? super r<? extends E>> dVar) {
        Object F = this.f13971m.F(dVar);
        g4.d.h();
        return F;
    }

    @Override // n5.i0
    @n6.d
    public kotlinx.coroutines.selects.d<E> G() {
        return this.f13971m.G();
    }

    @Override // n5.i0
    @n6.d
    public kotlinx.coroutines.selects.d<r<E>> J() {
        return this.f13971m.J();
    }

    @Override // n5.i0
    @n6.d
    public kotlinx.coroutines.selects.d<E> K() {
        return this.f13971m.K();
    }

    @Override // n5.i0
    @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
    @n6.e
    public E M() {
        return this.f13971m.M();
    }

    @n6.d
    public final n<E> M1() {
        return this.f13971m;
    }

    @Override // n5.i0
    @n6.d
    public Object T() {
        return this.f13971m.T();
    }

    @Override // n5.i0
    @k4.h
    @v3.k(level = v3.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    @n6.e
    public Object U(@n6.d e4.d<? super E> dVar) {
        return this.f13971m.U(dVar);
    }

    @n6.d
    public Object V(E e7) {
        return this.f13971m.V(e7);
    }

    @Override // n5.m0
    public boolean W() {
        return this.f13971m.W();
    }

    @Override // n5.m0
    @c2
    public void a0(@n6.d t4.l<? super Throwable, m2> lVar) {
        this.f13971m.a0(lVar);
    }

    @Override // kotlinx.coroutines.v2, kotlinx.coroutines.n2
    @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean b(Throwable th) {
        u0(new o2(y0(), null, this));
        return true;
    }

    @Override // kotlinx.coroutines.v2, kotlinx.coroutines.n2
    public /* synthetic */ void cancel() {
        u0(new o2(y0(), null, this));
    }

    @Override // kotlinx.coroutines.v2, kotlinx.coroutines.n2
    public final void f(@n6.e CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new o2(y0(), null, this);
        }
        u0(cancellationException);
    }

    @Override // n5.i0
    public boolean isEmpty() {
        return this.f13971m.isEmpty();
    }

    @Override // n5.i0
    @n6.d
    public p<E> iterator() {
        return this.f13971m.iterator();
    }

    @n6.d
    public kotlinx.coroutines.selects.e<E, m0<E>> j() {
        return this.f13971m.j();
    }

    @n6.d
    public final n<E> m() {
        return this;
    }

    @Override // n5.i0
    @n6.e
    public Object n(@n6.d e4.d<? super E> dVar) {
        return this.f13971m.n(dVar);
    }

    @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean s(E e7) {
        return this.f13971m.s(e7);
    }

    @Override // kotlinx.coroutines.v2
    public void u0(@n6.d Throwable th) {
        CancellationException A1 = v2.A1(this, th, null, 1, null);
        this.f13971m.f(A1);
        o0(A1);
    }

    /* renamed from: w */
    public boolean b(@n6.e Throwable th) {
        return this.f13971m.b(th);
    }

    @Override // n5.i0
    public boolean y() {
        return this.f13971m.y();
    }

    @n6.e
    public Object z(E e7, @n6.d e4.d<? super m2> dVar) {
        return this.f13971m.z(e7, dVar);
    }
}
