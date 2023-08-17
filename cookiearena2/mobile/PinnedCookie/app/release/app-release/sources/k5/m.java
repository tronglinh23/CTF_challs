package k5;

import k5.e;
import u4.r1;
@r1({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,75:1\n74#1:76\n74#1:77\n74#1:78\n74#1:79\n74#1:80\n74#1:81\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n15#1:76\n18#1:77\n36#1:78\n45#1:79\n52#1:80\n56#1:81\n*E\n"})
/* loaded from: classes.dex */
public final class m {
    public static final long a(long j7, long j8, long j9) {
        if (!e.d0(j8) || (j7 ^ j9) >= 0) {
            return j7;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    public static final boolean b(long j7) {
        return ((j7 - 1) | 1) == Long.MAX_VALUE;
    }

    public static final long c(long j7, long j8) {
        long O = e.O(j8);
        if (((j7 - 1) | 1) == Long.MAX_VALUE) {
            return a(j7, j8, O);
        }
        if ((1 | (O - 1)) == Long.MAX_VALUE) {
            return d(j7, j8);
        }
        long j9 = j7 + O;
        return ((j7 ^ j9) & (O ^ j9)) < 0 ? j7 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j9;
    }

    public static final long d(long j7, long j8) {
        long p6 = e.p(j8, 2);
        return (((e.O(p6) - 1) | 1) > Long.MAX_VALUE ? 1 : (((e.O(p6) - 1) | 1) == Long.MAX_VALUE ? 0 : -1)) == 0 ? (long) (j7 + e.o0(j8, h.NANOSECONDS)) : c(c(j7, p6), e.g0(j8, p6));
    }

    public static final long e(long j7, long j8) {
        return ((1 | (j8 - 1)) > Long.MAX_VALUE ? 1 : ((1 | (j8 - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? e.x0(g.n0(j8, h.DAYS)) : f(j7, j8);
    }

    public static final long f(long j7, long j8) {
        long j9 = j7 - j8;
        if (((j9 ^ j7) & (~(j9 ^ j8))) >= 0) {
            e.a aVar = e.f11783l;
            return g.n0(j9, h.NANOSECONDS);
        }
        long j10 = 1000000;
        long j11 = (j7 / j10) - (j8 / j10);
        long j12 = (j7 % j10) - (j8 % j10);
        e.a aVar2 = e.f11783l;
        return e.h0(g.n0(j11, h.MILLISECONDS), g.n0(j12, h.NANOSECONDS));
    }

    public static final long g(long j7, long j8) {
        if (((j8 - 1) | 1) == Long.MAX_VALUE) {
            return j7 == j8 ? e.f11783l.W() : e.x0(g.n0(j8, h.DAYS));
        }
        return (1 | (j7 - 1)) == Long.MAX_VALUE ? g.n0(j7, h.DAYS) : f(j7, j8);
    }
}
