package k5;

import k5.r;
import u4.l0;
import v3.g1;

@l
@g1(version = "1.8")
/* loaded from: classes.dex */
public interface d extends r, Comparable<d> {

    /* loaded from: classes.dex */
    public static final class a {
        public static int a(@n6.d d dVar, @n6.d d dVar2) {
            l0.p(dVar2, "other");
            return e.l(dVar.f(dVar2), e.f11783l.W());
        }

        public static boolean b(@n6.d d dVar) {
            return r.a.a(dVar);
        }

        public static boolean c(@n6.d d dVar) {
            return r.a.b(dVar);
        }

        @n6.d
        public static d d(@n6.d d dVar, long j7) {
            return dVar.b(e.x0(j7));
        }
    }

    @Override // k5.r
    @n6.d
    d a(long j7);

    @Override // k5.r
    @n6.d
    d b(long j7);

    boolean equals(@n6.e Object obj);

    long f(@n6.d d dVar);

    int g(@n6.d d dVar);

    int hashCode();
}