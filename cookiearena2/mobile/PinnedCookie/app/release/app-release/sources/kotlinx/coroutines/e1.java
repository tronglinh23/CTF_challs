package kotlinx.coroutines;
@i2
/* loaded from: classes.dex */
public interface e1 {

    /* loaded from: classes.dex */
    public static final class a {
        @v3.k(level = v3.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @n6.e
        public static Object a(@n6.d e1 e1Var, long j7, @n6.d e4.d<? super v3.m2> dVar) {
            if (j7 <= 0) {
                return v3.m2.f17815a;
            }
            r rVar = new r(g4.c.d(dVar), 1);
            rVar.x();
            e1Var.m(j7, rVar);
            Object A = rVar.A();
            if (A == g4.d.h()) {
                h4.h.c(dVar);
            }
            return A == g4.d.h() ? A : v3.m2.f17815a;
        }

        @n6.d
        public static p1 b(@n6.d e1 e1Var, long j7, @n6.d Runnable runnable, @n6.d e4.g gVar) {
            return b1.a().z0(j7, runnable, gVar);
        }
    }

    @v3.k(level = v3.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @n6.e
    Object O0(long j7, @n6.d e4.d<? super v3.m2> dVar);

    void m(long j7, @n6.d q<? super v3.m2> qVar);

    @n6.d
    p1 z0(long j7, @n6.d Runnable runnable, @n6.d e4.g gVar);
}
