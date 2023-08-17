package b5;

import d5.l;
import d5.o;
import u.v;
import u4.l0;
import u4.r1;
import v3.g1;
@r1({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* loaded from: classes.dex */
public final class g {
    @g1(version = "1.3")
    @n6.d
    public static final f a(int i7) {
        return new i(i7, i7 >> 31);
    }

    @g1(version = "1.3")
    @n6.d
    public static final f b(long j7) {
        return new i((int) j7, (int) (j7 >> 32));
    }

    @n6.d
    public static final String c(@n6.d Object obj, @n6.d Object obj2) {
        l0.p(obj, v.h.f17254c);
        l0.p(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void d(double d7, double d8) {
        if (!(d8 > d7)) {
            throw new IllegalArgumentException(c(Double.valueOf(d7), Double.valueOf(d8)).toString());
        }
    }

    public static final void e(int i7, int i8) {
        if (!(i8 > i7)) {
            throw new IllegalArgumentException(c(Integer.valueOf(i7), Integer.valueOf(i8)).toString());
        }
    }

    public static final void f(long j7, long j8) {
        if (!(j8 > j7)) {
            throw new IllegalArgumentException(c(Long.valueOf(j7), Long.valueOf(j8)).toString());
        }
    }

    public static final int g(int i7) {
        return 31 - Integer.numberOfLeadingZeros(i7);
    }

    @g1(version = "1.3")
    public static final int h(@n6.d f fVar, @n6.d l lVar) {
        l0.p(fVar, "<this>");
        l0.p(lVar, "range");
        if (!lVar.isEmpty()) {
            return lVar.j() < Integer.MAX_VALUE ? fVar.n(lVar.i(), lVar.j() + 1) : lVar.i() > Integer.MIN_VALUE ? fVar.n(lVar.i() - 1, lVar.j()) + 1 : fVar.l();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + lVar);
    }

    @g1(version = "1.3")
    public static final long i(@n6.d f fVar, @n6.d o oVar) {
        l0.p(fVar, "<this>");
        l0.p(oVar, "range");
        if (!oVar.isEmpty()) {
            return oVar.j() < Long.MAX_VALUE ? fVar.q(oVar.i(), oVar.j() + 1) : oVar.i() > Long.MIN_VALUE ? fVar.q(oVar.i() - 1, oVar.j()) + 1 : fVar.o();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + oVar);
    }

    public static final int j(int i7, int i8) {
        return (i7 >>> (32 - i8)) & ((-i8) >> 31);
    }
}
