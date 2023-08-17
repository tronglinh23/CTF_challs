package e4;

import e4.g;
import i0.x2;
import t4.p;
import u4.l0;
import v3.g1;
@g1(version = "1.3")
/* loaded from: classes.dex */
public interface e extends g.b {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final b f8765a = b.f8766k;

    /* loaded from: classes.dex */
    public static final class a {
        public static <R> R a(@n6.d e eVar, R r6, @n6.d p<? super R, ? super g.b, ? extends R> pVar) {
            l0.p(pVar, "operation");
            return (R) g.b.a.a(eVar, r6, pVar);
        }

        @n6.e
        public static <E extends g.b> E b(@n6.d e eVar, @n6.d g.c<E> cVar) {
            l0.p(cVar, x2.f10960j);
            if (!(cVar instanceof e4.b)) {
                if (e.f8765a == cVar) {
                    l0.n(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                    return eVar;
                }
                return null;
            }
            e4.b bVar = (e4.b) cVar;
            if (bVar.a(eVar.getKey())) {
                E e7 = (E) bVar.b(eVar);
                if (e7 instanceof g.b) {
                    return e7;
                }
                return null;
            }
            return null;
        }

        @n6.d
        public static g c(@n6.d e eVar, @n6.d g.c<?> cVar) {
            l0.p(cVar, x2.f10960j);
            if (!(cVar instanceof e4.b)) {
                return e.f8765a == cVar ? i.f8770k : eVar;
            }
            e4.b bVar = (e4.b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : i.f8770k;
        }

        @n6.d
        public static g d(@n6.d e eVar, @n6.d g gVar) {
            l0.p(gVar, "context");
            return g.b.a.d(eVar, gVar);
        }

        public static void e(@n6.d e eVar, @n6.d d<?> dVar) {
            l0.p(dVar, "continuation");
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g.c<e> {

        /* renamed from: k  reason: collision with root package name */
        public static final /* synthetic */ b f8766k = new b();
    }

    @n6.d
    <T> d<T> S(@n6.d d<? super T> dVar);

    void U0(@n6.d d<?> dVar);

    @Override // e4.g.b, e4.g
    @n6.d
    g a(@n6.d g.c<?> cVar);

    @Override // e4.g.b, e4.g
    @n6.e
    <E extends g.b> E e(@n6.d g.c<E> cVar);
}
