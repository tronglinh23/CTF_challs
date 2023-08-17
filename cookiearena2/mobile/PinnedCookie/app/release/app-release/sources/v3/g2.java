package v3;
@s4.h(name = "UNumbersKt")
/* loaded from: classes.dex */
public final class g2 {
    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final int A(int i7) {
        return x1.l(Integer.lowestOneBit(i7));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final short B(short s6) {
        return h2.l((short) Integer.lowestOneBit(s6 & h2.f17796n));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final int a(byte b7) {
        return Integer.numberOfLeadingZeros(b7 & t1.f17828n) - 24;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final int b(long j7) {
        return Long.numberOfLeadingZeros(j7);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final int c(int i7) {
        return Integer.numberOfLeadingZeros(i7);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final int d(short s6) {
        return Integer.numberOfLeadingZeros(s6 & h2.f17796n) - 16;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final int e(byte b7) {
        return Integer.bitCount(x1.l(b7 & t1.f17828n));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final int f(long j7) {
        return Long.bitCount(j7);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final int g(int i7) {
        return Integer.bitCount(i7);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final int h(short s6) {
        return Integer.bitCount(x1.l(s6 & h2.f17796n));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final int i(byte b7) {
        return Integer.numberOfTrailingZeros(b7 | 256);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final int j(long j7) {
        return Long.numberOfTrailingZeros(j7);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final int k(int i7) {
        return Integer.numberOfTrailingZeros(i7);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final int l(short s6) {
        return Integer.numberOfTrailingZeros(s6 | h2.f17795m);
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {r.class, t.class})
    public static final long m(long j7, int i7) {
        return b2.l(Long.rotateLeft(j7, i7));
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {r.class, t.class})
    public static final byte n(byte b7, int i7) {
        return t1.l(q0.Z0(b7, i7));
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {r.class, t.class})
    public static final int o(int i7, int i8) {
        return x1.l(Integer.rotateLeft(i7, i8));
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {r.class, t.class})
    public static final short p(short s6, int i7) {
        return h2.l(q0.a1(s6, i7));
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {r.class, t.class})
    public static final long q(long j7, int i7) {
        return b2.l(Long.rotateRight(j7, i7));
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {r.class, t.class})
    public static final byte r(byte b7, int i7) {
        return t1.l(q0.b1(b7, i7));
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {r.class, t.class})
    public static final int s(int i7, int i8) {
        return x1.l(Integer.rotateRight(i7, i8));
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {r.class, t.class})
    public static final short t(short s6, int i7) {
        return h2.l(q0.c1(s6, i7));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final byte u(byte b7) {
        return t1.l((byte) Integer.highestOneBit(b7 & t1.f17828n));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final long v(long j7) {
        return b2.l(Long.highestOneBit(j7));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final int w(int i7) {
        return x1.l(Integer.highestOneBit(i7));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final short x(short s6) {
        return h2.l((short) Integer.highestOneBit(s6 & h2.f17796n));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final byte y(byte b7) {
        return t1.l((byte) Integer.lowestOneBit(b7 & t1.f17828n));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {t.class, r.class})
    public static final long z(long j7) {
        return b2.l(Long.lowestOneBit(j7));
    }
}
