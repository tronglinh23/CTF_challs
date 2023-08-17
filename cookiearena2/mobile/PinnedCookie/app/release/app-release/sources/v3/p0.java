package v3;
/* loaded from: classes.dex */
public class p0 extends o0 {
    @g1(version = "1.2")
    @k4.f
    public static final float A0(u4.a0 a0Var, int i7) {
        u4.l0.p(a0Var, "<this>");
        return Float.intBitsToFloat(i7);
    }

    @k4.f
    public static final boolean B0(double d7) {
        return (Double.isInfinite(d7) || Double.isNaN(d7)) ? false : true;
    }

    @k4.f
    public static final boolean C0(float f7) {
        return (Float.isInfinite(f7) || Float.isNaN(f7)) ? false : true;
    }

    @k4.f
    public static final boolean D0(double d7) {
        return Double.isInfinite(d7);
    }

    @k4.f
    public static final boolean E0(float f7) {
        return Float.isInfinite(f7);
    }

    @k4.f
    public static final boolean F0(double d7) {
        return Double.isNaN(d7);
    }

    @k4.f
    public static final boolean G0(float f7) {
        return Float.isNaN(f7);
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int H0(int i7, int i8) {
        return Integer.rotateLeft(i7, i8);
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {r.class})
    public static final long I0(long j7, int i7) {
        return Long.rotateLeft(j7, i7);
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int J0(int i7, int i8) {
        return Integer.rotateRight(i7, i8);
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {r.class})
    public static final long K0(long j7, int i7) {
        return Long.rotateRight(j7, i7);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int L0(int i7) {
        return Integer.highestOneBit(i7);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final long M0(long j7) {
        return Long.highestOneBit(j7);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int N0(int i7) {
        return Integer.lowestOneBit(i7);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final long O0(long j7) {
        return Long.lowestOneBit(j7);
    }

    @g1(version = "1.2")
    @k4.f
    public static final int P0(float f7) {
        return Float.floatToIntBits(f7);
    }

    @g1(version = "1.2")
    @k4.f
    public static final long Q0(double d7) {
        return Double.doubleToLongBits(d7);
    }

    @g1(version = "1.2")
    @k4.f
    public static final int R0(float f7) {
        return Float.floatToRawIntBits(f7);
    }

    @g1(version = "1.2")
    @k4.f
    public static final long S0(double d7) {
        return Double.doubleToRawLongBits(d7);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int t0(int i7) {
        return Integer.numberOfLeadingZeros(i7);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int u0(long j7) {
        return Long.numberOfLeadingZeros(j7);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int v0(int i7) {
        return Integer.bitCount(i7);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int w0(long j7) {
        return Long.bitCount(j7);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int x0(int i7) {
        return Integer.numberOfTrailingZeros(i7);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int y0(long j7) {
        return Long.numberOfTrailingZeros(j7);
    }

    @g1(version = "1.2")
    @k4.f
    public static final double z0(u4.x xVar, long j7) {
        u4.l0.p(xVar, "<this>");
        return Double.longBitsToDouble(j7);
    }
}
