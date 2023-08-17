package e4;

import e4.e;
import i0.x2;
import t4.p;
import u4.l0;
import u4.n0;
import v3.g1;

@g1(version = "1.3")
/* loaded from: classes.dex */
public interface g {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e4.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0104a extends n0 implements p<g, b, g> {

            /* renamed from: l  reason: collision with root package name */
            public static final C0104a f8769l = new C0104a();

            public C0104a() {
                super(2);
            }

            @Override // t4.p
            @n6.d
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public final g J(@n6.d g gVar, @n6.d b bVar) {
                e4.c cVar;
                l0.p(gVar, "acc");
                l0.p(bVar, "element");
                g a7 = gVar.a(bVar.getKey());
                i iVar = i.f8770k;
                if (a7 == iVar) {
                    return bVar;
                }
                e.b bVar2 = e.f8765a;
                e eVar = (e) a7.e(bVar2);
                if (eVar == null) {
                    cVar = new e4.c(a7, bVar);
                } else {
                    g a8 = a7.a(bVar2);
                    if (a8 == iVar) {
                        return new e4.c(bVar, eVar);
                    }
                    cVar = new e4.c(new e4.c(a8, bVar), eVar);
                }
                return cVar;
            }
        }

        @n6.d
        public static g a(@n6.d g gVar, @n6.d g gVar2) {
            l0.p(gVar2, "context");
            return gVar2 == i.f8770k ? gVar : (g) gVar2.k(gVar, C0104a.f8769l);
        }
    }

    /* loaded from: classes.dex */
    public interface b extends g {

        /* loaded from: classes.dex */
        public static final class a {
            public static <R> R a(@n6.d b bVar, R r6, @n6.d p<? super R, ? super b, ? extends R> pVar) {
                l0.p(pVar, "operation");
                return pVar.J(r6, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @n6.e
            public static <E extends b> E b(@n6.d b bVar, @n6.d c<E> cVar) {
                l0.p(cVar, x2.f10960j);
                if (l0.g(bVar.getKey(), cVar)) {
                    l0.n(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            @n6.d
            public static g c(@n6.d b bVar, @n6.d c<?> cVar) {
                l0.p(cVar, x2.f10960j);
                return l0.g(bVar.getKey(), cVar) ? i.f8770k : bVar;
            }

            @n6.d
            public static g d(@n6.d b bVar, @n6.d g gVar) {
                l0.p(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        @Override // e4.g
        @n6.d
        g a(@n6.d c<?> cVar);

        @Override // e4.g
        @n6.e
        <E extends b> E e(@n6.d c<E> cVar);

        @n6.d
        c<?> getKey();

        @Override // e4.g
        <R> R k(R r6, @n6.d p<? super R, ? super b, ? extends R> pVar);
    }

    /* loaded from: classes.dex */
    public interface c<E extends b> {
    }

    @n6.d
    g a(@n6.d c<?> cVar);

    @n6.e
    <E extends b> E e(@n6.d c<E> cVar);

    <R> R k(R r6, @n6.d p<? super R, ? super b, ? extends R> pVar);

    @n6.d
    g t(@n6.d g gVar);
}