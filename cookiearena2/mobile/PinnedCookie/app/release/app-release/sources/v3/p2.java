package v3;
@s4.h(name = "UnsignedKt")
/* loaded from: classes.dex */
public final class p2 {
    @a1
    public static final int a(double d7) {
        if (!Double.isNaN(d7) && d7 > f(0)) {
            if (d7 >= f(-1)) {
                return -1;
            }
            return d7 <= 2.147483647E9d ? x1.l((int) d7) : x1.l(x1.l((int) (d7 - Integer.MAX_VALUE)) + x1.l(Integer.MAX_VALUE));
        }
        return 0;
    }

    @a1
    public static final long b(double d7) {
        if (!Double.isNaN(d7) && d7 > j(0L)) {
            if (d7 >= j(-1L)) {
                return -1L;
            }
            return d7 < 9.223372036854776E18d ? b2.l((long) d7) : b2.l(b2.l((long) (d7 - 9.223372036854776E18d)) - Long.MIN_VALUE);
        }
        return 0L;
    }

    @a1
    public static final int c(int i7, int i8) {
        return u4.l0.t(i7 ^ Integer.MIN_VALUE, i8 ^ Integer.MIN_VALUE);
    }

    @a1
    public static final int d(int i7, int i8) {
        return x1.l((int) ((i7 & 4294967295L) / (i8 & 4294967295L)));
    }

    @a1
    public static final int e(int i7, int i8) {
        return x1.l((int) ((i7 & 4294967295L) % (i8 & 4294967295L)));
    }

    @a1
    public static final double f(int i7) {
        return (Integer.MAX_VALUE & i7) + (((i7 >>> 31) << 30) * 2);
    }

    @a1
    public static final int g(long j7, long j8) {
        return u4.l0.u(j7 ^ Long.MIN_VALUE, j8 ^ Long.MIN_VALUE);
    }

    @a1
    public static final long h(long j7, long j8) {
        if (j8 < 0) {
            return Long.compareUnsigned(j7, j8) < 0 ? b2.l(0L) : b2.l(1L);
        } else if (j7 >= 0) {
            return b2.l(j7 / j8);
        } else {
            long j9 = ((j7 >>> 1) / j8) << 1;
            return b2.l(j9 + (Long.compareUnsigned(b2.l(j7 - (j9 * j8)), b2.l(j8)) < 0 ? 0 : 1));
        }
    }

    @a1
    public static final long i(long j7, long j8) {
        if (j8 < 0) {
            return Long.compareUnsigned(j7, j8) < 0 ? j7 : b2.l(j7 - j8);
        } else if (j7 >= 0) {
            return b2.l(j7 % j8);
        } else {
            long j9 = j7 - ((((j7 >>> 1) / j8) << 1) * j8);
            if (Long.compareUnsigned(b2.l(j9), b2.l(j8)) < 0) {
                j8 = 0;
            }
            return b2.l(j9 - j8);
        }
    }

    @a1
    public static final double j(long j7) {
        return ((j7 >>> 11) * 2048) + (j7 & 2047);
    }

    @n6.d
    public static final String k(long j7) {
        return l(j7, 10);
    }

    @n6.d
    public static final String l(long j7, int i7) {
        if (j7 >= 0) {
            String l7 = Long.toString(j7, i5.d.a(i7));
            u4.l0.o(l7, "toString(this, checkRadix(radix))");
            return l7;
        }
        long j8 = i7;
        long j9 = ((j7 >>> 1) / j8) << 1;
        long j10 = j7 - (j9 * j8);
        if (j10 >= j8) {
            j10 -= j8;
            j9++;
        }
        StringBuilder sb = new StringBuilder();
        String l8 = Long.toString(j9, i5.d.a(i7));
        u4.l0.o(l8, "toString(this, checkRadix(radix))");
        sb.append(l8);
        String l9 = Long.toString(j10, i5.d.a(i7));
        u4.l0.o(l9, "toString(this, checkRadix(radix))");
        sb.append(l9);
        return sb.toString();
    }
}
