package e4;

import e4.g;
import i0.x2;
import t4.p;
import u4.l0;
import v3.g1;
@g1(version = "1.3")
/* loaded from: classes.dex */
public abstract class a implements g.b {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final g.c<?> f8754k;

    public a(@n6.d g.c<?> cVar) {
        l0.p(cVar, x2.f10960j);
        this.f8754k = cVar;
    }

    @Override // e4.g.b, e4.g
    @n6.d
    public g a(@n6.d g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // e4.g.b, e4.g
    @n6.e
    public <E extends g.b> E e(@n6.d g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // e4.g.b
    @n6.d
    public g.c<?> getKey() {
        return this.f8754k;
    }

    @Override // e4.g.b, e4.g
    public <R> R k(R r6, @n6.d p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r6, pVar);
    }

    @Override // e4.g
    @n6.d
    public g t(@n6.d g gVar) {
        return g.b.a.d(this, gVar);
    }
}
