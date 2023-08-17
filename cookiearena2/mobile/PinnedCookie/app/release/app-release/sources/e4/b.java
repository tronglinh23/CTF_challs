package e4;

import e4.g;
import e4.g.b;
import i0.x2;
import t4.l;
import u4.l0;
import v3.g1;
import v3.r;
@g1(version = "1.3")
@r
/* loaded from: classes.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final l<g.b, E> f8755k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final g.c<?> f8756l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [t4.l<? super e4.g$b, ? extends E extends B>, t4.l<e4.g$b, E extends B>, java.lang.Object] */
    public b(@n6.d g.c<B> cVar, @n6.d l<? super g.b, ? extends E> lVar) {
        l0.p(cVar, "baseKey");
        l0.p(lVar, "safeCast");
        this.f8755k = lVar;
        this.f8756l = cVar instanceof b ? (g.c<B>) ((b) cVar).f8756l : cVar;
    }

    public final boolean a(@n6.d g.c<?> cVar) {
        l0.p(cVar, x2.f10960j);
        return cVar == this || this.f8756l == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Le4/g$b;)TE; */
    @n6.e
    public final g.b b(@n6.d g.b bVar) {
        l0.p(bVar, "element");
        return (g.b) this.f8755k.O(bVar);
    }
}
