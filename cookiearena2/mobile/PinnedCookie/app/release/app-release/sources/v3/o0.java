package v3;
/* loaded from: classes.dex */
public class o0 extends n0 {
    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final int J(byte b7, byte b8) {
        int i7 = b7 / b8;
        return ((b7 ^ b8) >= 0 || b8 * i7 == b7) ? i7 : i7 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final int K(byte b7, int i7) {
        int i8 = b7 / i7;
        return ((b7 ^ i7) >= 0 || i7 * i8 == b7) ? i8 : i8 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final int L(byte b7, short s6) {
        int i7 = b7 / s6;
        return ((b7 ^ s6) >= 0 || s6 * i7 == b7) ? i7 : i7 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final int M(int i7, byte b7) {
        int i8 = i7 / b7;
        return ((i7 ^ b7) >= 0 || b7 * i8 == i7) ? i8 : i8 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final int N(int i7, int i8) {
        int i9 = i7 / i8;
        return ((i7 ^ i8) >= 0 || i8 * i9 == i7) ? i9 : i9 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final int O(int i7, short s6) {
        int i8 = i7 / s6;
        return ((i7 ^ s6) >= 0 || s6 * i8 == i7) ? i8 : i8 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final int P(short s6, byte b7) {
        int i7 = s6 / b7;
        return ((s6 ^ b7) >= 0 || b7 * i7 == s6) ? i7 : i7 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final int Q(short s6, int i7) {
        int i8 = s6 / i7;
        return ((s6 ^ i7) >= 0 || i7 * i8 == s6) ? i8 : i8 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final int R(short s6, short s7) {
        int i7 = s6 / s7;
        return ((s6 ^ s7) >= 0 || s7 * i7 == s6) ? i7 : i7 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final long S(byte b7, long j7) {
        long j8 = b7;
        long j9 = j8 / j7;
        return ((j8 ^ j7) >= 0 || j7 * j9 == j8) ? j9 : j9 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final long T(int i7, long j7) {
        long j8 = i7;
        long j9 = j8 / j7;
        return ((j8 ^ j7) >= 0 || j7 * j9 == j8) ? j9 : j9 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final long U(long j7, byte b7) {
        long j8 = b7;
        long j9 = j7 / j8;
        return ((j7 ^ j8) >= 0 || j8 * j9 == j7) ? j9 : j9 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final long V(long j7, int i7) {
        long j8 = i7;
        long j9 = j7 / j8;
        return ((j7 ^ j8) >= 0 || j8 * j9 == j7) ? j9 : j9 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final long W(long j7, long j8) {
        long j9 = j7 / j8;
        return ((j7 ^ j8) >= 0 || j8 * j9 == j7) ? j9 : j9 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final long X(long j7, short s6) {
        long j8 = s6;
        long j9 = j7 / j8;
        return ((j7 ^ j8) >= 0 || j8 * j9 == j7) ? j9 : j9 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final long Y(short s6, long j7) {
        long j8 = s6;
        long j9 = j8 / j7;
        return ((j8 ^ j7) >= 0 || j7 * j9 == j8) ? j9 : j9 - 1;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final byte Z(byte b7, byte b8) {
        int i7 = b7 % b8;
        return (byte) (i7 + (b8 & (((i7 ^ b8) & ((-i7) | i7)) >> 31)));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final byte a0(int i7, byte b7) {
        int i8 = i7 % b7;
        return (byte) (i8 + (b7 & (((i8 ^ b7) & ((-i8) | i8)) >> 31)));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final byte b0(long j7, byte b7) {
        long j8 = j7 % b7;
        return (byte) (j8 + (r0 & (((j8 ^ r0) & ((-j8) | j8)) >> 63)));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final byte c0(short s6, byte b7) {
        int i7 = s6 % b7;
        return (byte) (i7 + (b7 & (((i7 ^ b7) & ((-i7) | i7)) >> 31)));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final double d0(double d7, double d8) {
        double d9 = d7 % d8;
        if (d9 == androidx.cardview.widget.g.f1896q) {
            return d9;
        }
        return !(Math.signum(d9) == Math.signum(d8)) ? d9 + d8 : d9;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final double e0(double d7, float f7) {
        double d8 = f7;
        double d9 = d7 % d8;
        if (d9 == androidx.cardview.widget.g.f1896q) {
            return d9;
        }
        return !(Math.signum(d9) == Math.signum(d8)) ? d9 + d8 : d9;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final double f0(float f7, double d7) {
        double d8 = f7 % d7;
        if (d8 == androidx.cardview.widget.g.f1896q) {
            return d8;
        }
        return !(Math.signum(d8) == Math.signum(d7)) ? d8 + d7 : d8;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final float g0(float f7, float f8) {
        float f9 = f7 % f8;
        if (f9 == 0.0f) {
            return f9;
        }
        return !(Math.signum(f9) == Math.signum(f8)) ? f9 + f8 : f9;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final int h0(byte b7, int i7) {
        int i8 = b7 % i7;
        return i8 + (i7 & (((i8 ^ i7) & ((-i8) | i8)) >> 31));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final int i0(int i7, int i8) {
        int i9 = i7 % i8;
        return i9 + (i8 & (((i9 ^ i8) & ((-i9) | i9)) >> 31));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final int j0(long j7, int i7) {
        long j8 = i7;
        long j9 = j7 % j8;
        return (int) (j9 + (j8 & (((j9 ^ j8) & ((-j9) | j9)) >> 63)));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final int k0(short s6, int i7) {
        int i8 = s6 % i7;
        return i8 + (i7 & (((i8 ^ i7) & ((-i8) | i8)) >> 31));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final long l0(byte b7, long j7) {
        long j8 = b7 % j7;
        return j8 + (j7 & (((j8 ^ j7) & ((-j8) | j8)) >> 63));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final long m0(int i7, long j7) {
        long j8 = i7 % j7;
        return j8 + (j7 & (((j8 ^ j7) & ((-j8) | j8)) >> 63));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final long n0(long j7, long j8) {
        long j9 = j7 % j8;
        return j9 + (j8 & (((j9 ^ j8) & ((-j9) | j9)) >> 63));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final long o0(short s6, long j7) {
        long j8 = s6 % j7;
        return j8 + (j7 & (((j8 ^ j7) & ((-j8) | j8)) >> 63));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final short p0(byte b7, short s6) {
        int i7 = b7 % s6;
        return (short) (i7 + (s6 & (((i7 ^ s6) & ((-i7) | i7)) >> 31)));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final short q0(int i7, short s6) {
        int i8 = i7 % s6;
        return (short) (i8 + (s6 & (((i8 ^ s6) & ((-i8) | i8)) >> 31)));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final short r0(long j7, short s6) {
        long j8 = j7 % s6;
        return (short) (j8 + (r0 & (((j8 ^ r0) & ((-j8) | j8)) >> 63)));
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    public static final short s0(short s6, short s7) {
        int i7 = s6 % s7;
        return (short) (i7 + (s7 & (((i7 ^ s7) & ((-i7) | i7)) >> 31)));
    }
}
