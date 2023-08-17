package b4;

import u4.l0;
import v3.c2;
import v3.g1;
import v3.h2;
import v3.i2;
import v3.q2;
import v3.t;
import v3.t1;
import v3.u1;
import v3.y1;
/* loaded from: classes.dex */
public class n {
    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final short a(short s6, short s7) {
        return l0.t(s6 & h2.f17796n, 65535 & s7) >= 0 ? s6 : s7;
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final int b(int i7, int i8) {
        return Integer.compareUnsigned(i7, i8) >= 0 ? i7 : i8;
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final byte c(byte b7, byte b8) {
        return l0.t(b7 & t1.f17828n, b8 & t1.f17828n) >= 0 ? b7 : b8;
    }

    @g1(version = "1.4")
    @t
    public static final int d(int i7, @n6.d int... iArr) {
        l0.p(iArr, "other");
        int o6 = y1.o(iArr);
        for (int i8 = 0; i8 < o6; i8++) {
            i7 = b(i7, y1.m(iArr, i8));
        }
        return i7;
    }

    @g1(version = "1.4")
    @t
    public static final long e(long j7, @n6.d long... jArr) {
        l0.p(jArr, "other");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            j7 = j(j7, c2.m(jArr, i7));
        }
        return j7;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class})
    public static final short f(short s6, short s7, short s8) {
        return a(s6, a(s7, s8));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class})
    public static final int g(int i7, int i8, int i9) {
        return b(i7, b(i8, i9));
    }

    @g1(version = "1.4")
    @t
    public static final byte h(byte b7, @n6.d byte... bArr) {
        l0.p(bArr, "other");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            b7 = c(b7, u1.m(bArr, i7));
        }
        return b7;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class})
    public static final byte i(byte b7, byte b8, byte b9) {
        return c(b7, c(b8, b9));
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final long j(long j7, long j8) {
        return Long.compareUnsigned(j7, j8) >= 0 ? j7 : j8;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class})
    public static final long k(long j7, long j8, long j9) {
        return j(j7, j(j8, j9));
    }

    @g1(version = "1.4")
    @t
    public static final short l(short s6, @n6.d short... sArr) {
        l0.p(sArr, "other");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            s6 = a(s6, i2.m(sArr, i7));
        }
        return s6;
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final short m(short s6, short s7) {
        return l0.t(s6 & h2.f17796n, 65535 & s7) <= 0 ? s6 : s7;
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final int n(int i7, int i8) {
        return Integer.compareUnsigned(i7, i8) <= 0 ? i7 : i8;
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final byte o(byte b7, byte b8) {
        return l0.t(b7 & t1.f17828n, b8 & t1.f17828n) <= 0 ? b7 : b8;
    }

    @g1(version = "1.4")
    @t
    public static final int p(int i7, @n6.d int... iArr) {
        l0.p(iArr, "other");
        int o6 = y1.o(iArr);
        for (int i8 = 0; i8 < o6; i8++) {
            i7 = n(i7, y1.m(iArr, i8));
        }
        return i7;
    }

    @g1(version = "1.4")
    @t
    public static final long q(long j7, @n6.d long... jArr) {
        l0.p(jArr, "other");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            j7 = v(j7, c2.m(jArr, i7));
        }
        return j7;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class})
    public static final short r(short s6, short s7, short s8) {
        return m(s6, m(s7, s8));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class})
    public static final int s(int i7, int i8, int i9) {
        return n(i7, n(i8, i9));
    }

    @g1(version = "1.4")
    @t
    public static final byte t(byte b7, @n6.d byte... bArr) {
        l0.p(bArr, "other");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            b7 = o(b7, u1.m(bArr, i7));
        }
        return b7;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class})
    public static final byte u(byte b7, byte b8, byte b9) {
        return o(b7, o(b8, b9));
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final long v(long j7, long j8) {
        return Long.compareUnsigned(j7, j8) <= 0 ? j7 : j8;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class})
    public static final long w(long j7, long j8, long j9) {
        return v(j7, v(j8, j9));
    }

    @g1(version = "1.4")
    @t
    public static final short x(short s6, @n6.d short... sArr) {
        l0.p(sArr, "other");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            s6 = m(s6, i2.m(sArr, i7));
        }
        return s6;
    }
}
