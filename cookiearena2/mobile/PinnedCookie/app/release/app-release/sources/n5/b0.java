package n5;

import v3.m2;
/* loaded from: classes.dex */
public final class b0<E> extends d<E> implements kotlinx.coroutines.selects.e<E, m0<? super E>> {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public e4.d<? super m2> f13907n;

    public b0(@n6.d e4.g gVar, @n6.d n<E> nVar, @n6.d t4.p<? super f<E>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        super(gVar, nVar, false);
        this.f13907n = g4.c.c(pVar, this, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.e
    public <R> void H(@n6.d kotlinx.coroutines.selects.f<? super R> fVar, E e7, @n6.d t4.p<? super m0<? super E>, ? super e4.d<? super R>, ? extends Object> pVar) {
        start();
        super.j().H(fVar, e7, pVar);
    }

    @Override // n5.o, n5.m0
    @n6.d
    public Object V(E e7) {
        start();
        return super.V(e7);
    }

    @Override // n5.o, n5.m0
    @n6.d
    public kotlinx.coroutines.selects.e<E, m0<E>> j() {
        return this;
    }

    @Override // kotlinx.coroutines.v2
    public void q1() {
        q5.a.c(this.f13907n, this);
    }

    @Override // n5.o, n5.m0
    public boolean s(E e7) {
        start();
        return super.s(e7);
    }

    @Override // n5.o, n5.m0
    /* renamed from: w */
    public boolean b(@n6.e Throwable th) {
        boolean b7 = super.b(th);
        start();
        return b7;
    }

    @Override // n5.o, n5.m0
    @n6.e
    public Object z(E e7, @n6.d e4.d<? super m2> dVar) {
        start();
        Object z6 = super.z(e7, dVar);
        return z6 == g4.d.h() ? z6 : m2.f17815a;
    }
}
