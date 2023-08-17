package b4;

import u4.l0;
import v3.g1;
/* loaded from: classes.dex */
public class h extends g {
    @g1(version = "1.1")
    @k4.f
    public static final byte I(byte b7, byte b8) {
        return (byte) Math.max((int) b7, (int) b8);
    }

    @g1(version = "1.1")
    @k4.f
    public static final byte J(byte b7, byte b8, byte b9) {
        return (byte) Math.max((int) b7, Math.max((int) b8, (int) b9));
    }

    @g1(version = "1.4")
    public static final byte K(byte b7, @n6.d byte... bArr) {
        l0.p(bArr, "other");
        for (byte b8 : bArr) {
            b7 = (byte) Math.max((int) b7, (int) b8);
        }
        return b7;
    }

    @g1(version = "1.1")
    @k4.f
    public static final double L(double d7, double d8) {
        return Math.max(d7, d8);
    }

    @g1(version = "1.1")
    @k4.f
    public static final double M(double d7, double d8, double d9) {
        return Math.max(d7, Math.max(d8, d9));
    }

    @g1(version = "1.4")
    public static final double N(double d7, @n6.d double... dArr) {
        l0.p(dArr, "other");
        for (double d8 : dArr) {
            d7 = Math.max(d7, d8);
        }
        return d7;
    }

    @g1(version = "1.1")
    @k4.f
    public static final float O(float f7, float f8) {
        return Math.max(f7, f8);
    }

    @g1(version = "1.1")
    @k4.f
    public static final float P(float f7, float f8, float f9) {
        return Math.max(f7, Math.max(f8, f9));
    }

    @g1(version = "1.4")
    public static final float Q(float f7, @n6.d float... fArr) {
        l0.p(fArr, "other");
        for (float f8 : fArr) {
            f7 = Math.max(f7, f8);
        }
        return f7;
    }

    @g1(version = "1.1")
    @k4.f
    public static final int R(int i7, int i8) {
        return Math.max(i7, i8);
    }

    @g1(version = "1.1")
    @k4.f
    public static final int S(int i7, int i8, int i9) {
        return Math.max(i7, Math.max(i8, i9));
    }

    @g1(version = "1.4")
    public static final int T(int i7, @n6.d int... iArr) {
        l0.p(iArr, "other");
        for (int i8 : iArr) {
            i7 = Math.max(i7, i8);
        }
        return i7;
    }

    @g1(version = "1.1")
    @k4.f
    public static final long U(long j7, long j8) {
        return Math.max(j7, j8);
    }

    @g1(version = "1.1")
    @k4.f
    public static final long V(long j7, long j8, long j9) {
        return Math.max(j7, Math.max(j8, j9));
    }

    @g1(version = "1.4")
    public static final long W(long j7, @n6.d long... jArr) {
        l0.p(jArr, "other");
        for (long j8 : jArr) {
            j7 = Math.max(j7, j8);
        }
        return j7;
    }

    @g1(version = "1.1")
    @n6.d
    public static final <T extends Comparable<? super T>> T X(@n6.d T t6, @n6.d T t7) {
        l0.p(t6, "a");
        l0.p(t7, "b");
        return t6.compareTo(t7) >= 0 ? t6 : t7;
    }

    @g1(version = "1.1")
    @n6.d
    public static final <T extends Comparable<? super T>> T Y(@n6.d T t6, @n6.d T t7, @n6.d T t8) {
        l0.p(t6, "a");
        l0.p(t7, "b");
        l0.p(t8, "c");
        return (T) X(t6, X(t7, t8));
    }

    @g1(version = "1.4")
    @n6.d
    public static final <T extends Comparable<? super T>> T Z(@n6.d T t6, @n6.d T... tArr) {
        l0.p(t6, "a");
        l0.p(tArr, "other");
        for (T t7 : tArr) {
            t6 = (T) X(t6, t7);
        }
        return t6;
    }

    @g1(version = "1.1")
    @k4.f
    public static final short a0(short s6, short s7) {
        return (short) Math.max((int) s6, (int) s7);
    }

    @g1(version = "1.1")
    @k4.f
    public static final short b0(short s6, short s7, short s8) {
        return (short) Math.max((int) s6, Math.max((int) s7, (int) s8));
    }

    @g1(version = "1.4")
    public static final short c0(short s6, @n6.d short... sArr) {
        l0.p(sArr, "other");
        for (short s7 : sArr) {
            s6 = (short) Math.max((int) s6, (int) s7);
        }
        return s6;
    }

    @g1(version = "1.1")
    @k4.f
    public static final byte d0(byte b7, byte b8) {
        return (byte) Math.min((int) b7, (int) b8);
    }

    @g1(version = "1.1")
    @k4.f
    public static final byte e0(byte b7, byte b8, byte b9) {
        return (byte) Math.min((int) b7, Math.min((int) b8, (int) b9));
    }

    @g1(version = "1.4")
    public static final byte f0(byte b7, @n6.d byte... bArr) {
        l0.p(bArr, "other");
        for (byte b8 : bArr) {
            b7 = (byte) Math.min((int) b7, (int) b8);
        }
        return b7;
    }

    @g1(version = "1.1")
    @k4.f
    public static final double g0(double d7, double d8) {
        return Math.min(d7, d8);
    }

    @g1(version = "1.1")
    @k4.f
    public static final double h0(double d7, double d8, double d9) {
        return Math.min(d7, Math.min(d8, d9));
    }

    @g1(version = "1.4")
    public static final double i0(double d7, @n6.d double... dArr) {
        l0.p(dArr, "other");
        for (double d8 : dArr) {
            d7 = Math.min(d7, d8);
        }
        return d7;
    }

    @g1(version = "1.1")
    @k4.f
    public static final float j0(float f7, float f8) {
        return Math.min(f7, f8);
    }

    @g1(version = "1.1")
    @k4.f
    public static final float k0(float f7, float f8, float f9) {
        return Math.min(f7, Math.min(f8, f9));
    }

    @g1(version = "1.4")
    public static final float l0(float f7, @n6.d float... fArr) {
        l0.p(fArr, "other");
        for (float f8 : fArr) {
            f7 = Math.min(f7, f8);
        }
        return f7;
    }

    @g1(version = "1.1")
    @k4.f
    public static final int m0(int i7, int i8) {
        return Math.min(i7, i8);
    }

    @g1(version = "1.1")
    @k4.f
    public static final int n0(int i7, int i8, int i9) {
        return Math.min(i7, Math.min(i8, i9));
    }

    @g1(version = "1.4")
    public static final int o0(int i7, @n6.d int... iArr) {
        l0.p(iArr, "other");
        for (int i8 : iArr) {
            i7 = Math.min(i7, i8);
        }
        return i7;
    }

    @g1(version = "1.1")
    @k4.f
    public static final long p0(long j7, long j8) {
        return Math.min(j7, j8);
    }

    @g1(version = "1.1")
    @k4.f
    public static final long q0(long j7, long j8, long j9) {
        return Math.min(j7, Math.min(j8, j9));
    }

    @g1(version = "1.4")
    public static final long r0(long j7, @n6.d long... jArr) {
        l0.p(jArr, "other");
        for (long j8 : jArr) {
            j7 = Math.min(j7, j8);
        }
        return j7;
    }

    @g1(version = "1.1")
    @n6.d
    public static final <T extends Comparable<? super T>> T s0(@n6.d T t6, @n6.d T t7) {
        l0.p(t6, "a");
        l0.p(t7, "b");
        return t6.compareTo(t7) <= 0 ? t6 : t7;
    }

    @g1(version = "1.1")
    @n6.d
    public static final <T extends Comparable<? super T>> T t0(@n6.d T t6, @n6.d T t7, @n6.d T t8) {
        l0.p(t6, "a");
        l0.p(t7, "b");
        l0.p(t8, "c");
        return (T) s0(t6, s0(t7, t8));
    }

    @g1(version = "1.4")
    @n6.d
    public static final <T extends Comparable<? super T>> T u0(@n6.d T t6, @n6.d T... tArr) {
        l0.p(t6, "a");
        l0.p(tArr, "other");
        for (T t7 : tArr) {
            t6 = (T) s0(t6, t7);
        }
        return t6;
    }

    @g1(version = "1.1")
    @k4.f
    public static final short v0(short s6, short s7) {
        return (short) Math.min((int) s6, (int) s7);
    }

    @g1(version = "1.1")
    @k4.f
    public static final short w0(short s6, short s7, short s8) {
        return (short) Math.min((int) s6, Math.min((int) s7, (int) s8));
    }

    @g1(version = "1.4")
    public static final short x0(short s6, @n6.d short... sArr) {
        l0.p(sArr, "other");
        for (short s7 : sArr) {
            s6 = (short) Math.min((int) s6, (int) s7);
        }
        return s6;
    }
}
