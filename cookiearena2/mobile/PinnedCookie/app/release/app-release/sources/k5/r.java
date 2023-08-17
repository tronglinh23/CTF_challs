package k5;

import v3.g1;
@l
@g1(version = "1.3")
/* loaded from: classes.dex */
public interface r {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(@n6.d r rVar) {
            return e.e0(rVar.e());
        }

        public static boolean b(@n6.d r rVar) {
            return !e.e0(rVar.e());
        }

        @n6.d
        public static r c(@n6.d r rVar, long j7) {
            return rVar.b(e.x0(j7));
        }

        @n6.d
        public static r d(@n6.d r rVar, long j7) {
            return new c(rVar, j7, null);
        }
    }

    @n6.d
    r a(long j7);

    @n6.d
    r b(long j7);

    boolean c();

    boolean d();

    long e();
}
