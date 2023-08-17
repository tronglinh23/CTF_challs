package n5;

import v3.m2;
/* loaded from: classes.dex */
public final class c0<E> extends k<E> {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final e4.d<m2> f13919n;

    public c0(@n6.d e4.g gVar, @n6.d i<E> iVar, @n6.d t4.p<? super g0<? super E>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        super(gVar, iVar, false);
        this.f13919n = g4.c.c(pVar, this, this);
    }

    @Override // n5.k, n5.i
    @n6.d
    public i0<E> B() {
        i0<E> B = M1().B();
        start();
        return B;
    }

    @Override // kotlinx.coroutines.v2
    public void q1() {
        q5.a.c(this.f13919n, this);
    }
}
