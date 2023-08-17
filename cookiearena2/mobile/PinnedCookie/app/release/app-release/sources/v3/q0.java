package v3;
/* loaded from: classes.dex */
public class q0 extends p0 {
    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int T0(byte b7) {
        return Integer.numberOfLeadingZeros(b7 & t1.f17828n) - 24;
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int U0(short s6) {
        return Integer.numberOfLeadingZeros(s6 & h2.f17796n) - 16;
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int V0(byte b7) {
        return Integer.bitCount(b7 & t1.f17828n);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int W0(short s6) {
        return Integer.bitCount(s6 & h2.f17796n);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int X0(byte b7) {
        return Integer.numberOfTrailingZeros(b7 | 256);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final int Y0(short s6) {
        return Integer.numberOfTrailingZeros(s6 | h2.f17795m);
    }

    @g1(version = "1.6")
    @q2(markerClass = {r.class})
    public static final byte Z0(byte b7, int i7) {
        int i8 = i7 & 7;
        return (byte) (((b7 & 255) >>> (8 - i8)) | (b7 << i8));
    }

    @g1(version = "1.6")
    @q2(markerClass = {r.class})
    public static final short a1(short s6, int i7) {
        int i8 = i7 & 15;
        return (short) (((s6 & 65535) >>> (16 - i8)) | (s6 << i8));
    }

    @g1(version = "1.6")
    @q2(markerClass = {r.class})
    public static final byte b1(byte b7, int i7) {
        int i8 = i7 & 7;
        return (byte) (((b7 & 255) >>> i8) | (b7 << (8 - i8)));
    }

    @g1(version = "1.6")
    @q2(markerClass = {r.class})
    public static final short c1(short s6, int i7) {
        int i8 = i7 & 15;
        return (short) (((s6 & 65535) >>> i8) | (s6 << (16 - i8)));
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final byte d1(byte b7) {
        return (byte) Integer.highestOneBit(b7 & t1.f17828n);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final short e1(short s6) {
        return (short) Integer.highestOneBit(s6 & h2.f17796n);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final byte f1(byte b7) {
        return (byte) Integer.lowestOneBit(b7);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {r.class})
    public static final short g1(short s6) {
        return (short) Integer.lowestOneBit(s6);
    }
}
