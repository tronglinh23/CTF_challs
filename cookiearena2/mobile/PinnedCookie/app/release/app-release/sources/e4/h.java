package e4;

import e4.g;
import i0.x2;
import u4.l0;
import v3.g1;
import v3.r;
/* loaded from: classes.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @r
    @n6.e
    public static final <E extends g.b> E a(@n6.d g.b bVar, @n6.d g.c<E> cVar) {
        l0.p(bVar, "<this>");
        l0.p(cVar, x2.f10960j);
        if (!(cVar instanceof b)) {
            if (bVar.getKey() == cVar) {
                return bVar;
            }
            return null;
        }
        b bVar2 = (b) cVar;
        if (bVar2.a(bVar.getKey())) {
            E e7 = (E) bVar2.b(bVar);
            if (e7 instanceof g.b) {
                return e7;
            }
            return null;
        }
        return null;
    }

    @g1(version = "1.3")
    @r
    @n6.d
    public static final g b(@n6.d g.b bVar, @n6.d g.c<?> cVar) {
        l0.p(bVar, "<this>");
        l0.p(cVar, x2.f10960j);
        if (!(cVar instanceof b)) {
            return bVar.getKey() == cVar ? i.f8770k : bVar;
        }
        b bVar2 = (b) cVar;
        return (!bVar2.a(bVar.getKey()) || bVar2.b(bVar) == null) ? bVar : i.f8770k;
    }
}
