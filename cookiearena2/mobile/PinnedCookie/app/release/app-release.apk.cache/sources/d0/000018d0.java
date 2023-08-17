package p5;

import e4.g;

/* loaded from: classes.dex */
public final class n implements e4.g {
    @n6.d
    @s4.e

    /* renamed from: k  reason: collision with root package name */
    public final Throwable f14954k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ e4.g f14955l;

    public n(@n6.d Throwable th, @n6.d e4.g gVar) {
        this.f14954k = th;
        this.f14955l = gVar;
    }

    @Override // e4.g
    @n6.d
    public e4.g a(@n6.d g.c<?> cVar) {
        return this.f14955l.a(cVar);
    }

    @Override // e4.g
    @n6.e
    public <E extends g.b> E e(@n6.d g.c<E> cVar) {
        return (E) this.f14955l.e(cVar);
    }

    @Override // e4.g
    public <R> R k(R r6, @n6.d t4.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) this.f14955l.k(r6, pVar);
    }

    @Override // e4.g
    @n6.d
    public e4.g t(@n6.d e4.g gVar) {
        return this.f14955l.t(gVar);
    }
}