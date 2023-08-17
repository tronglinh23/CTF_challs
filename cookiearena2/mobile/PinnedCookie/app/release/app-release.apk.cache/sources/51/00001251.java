package i6;

import v3.h2;

@s4.h(name = "-Util")
/* loaded from: classes.dex */
public final class j {
    public static final int a(byte b7, int i7) {
        return b7 & i7;
    }

    public static final long b(byte b7, long j7) {
        return b7 & j7;
    }

    public static final long c(int i7, long j7) {
        return i7 & j7;
    }

    public static final boolean d(@n6.d byte[] bArr, int i7, @n6.d byte[] bArr2, int i8, int i9) {
        u4.l0.p(bArr, "a");
        u4.l0.p(bArr2, "b");
        for (int i10 = 0; i10 < i9; i10++) {
            if (bArr[i10 + i7] != bArr2[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    public static final void e(long j7, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j7 || j7 - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException("size=" + j7 + " offset=" + j8 + " byteCount=" + j9);
        }
    }

    public static final long f(int i7, long j7) {
        return Math.min(i7, j7);
    }

    public static final long g(long j7, int i7) {
        return Math.min(j7, i7);
    }

    public static final int h(int i7) {
        return ((i7 & 255) << 24) | (((-16777216) & i7) >>> 24) | ((16711680 & i7) >>> 8) | ((65280 & i7) << 8);
    }

    public static final long i(long j7) {
        return ((j7 & 255) << 56) | (((-72057594037927936L) & j7) >>> 56) | ((71776119061217280L & j7) >>> 40) | ((280375465082880L & j7) >>> 24) | ((1095216660480L & j7) >>> 8) | ((4278190080L & j7) << 8) | ((16711680 & j7) << 24) | ((65280 & j7) << 40);
    }

    public static final short j(short s6) {
        int i7 = s6 & h2.f17796n;
        return (short) (((i7 & 255) << 8) | ((65280 & i7) >>> 8));
    }

    public static final int k(byte b7, int i7) {
        return b7 << i7;
    }

    public static final int l(byte b7, int i7) {
        return b7 >> i7;
    }

    @n6.d
    public static final String m(byte b7) {
        return new String(new char[]{j6.b.I()[(b7 >> 4) & 15], j6.b.I()[b7 & 15]});
    }

    @n6.d
    public static final String n(int i7) {
        if (i7 == 0) {
            return "0";
        }
        int i8 = 0;
        char[] cArr = {j6.b.I()[(i7 >> 28) & 15], j6.b.I()[(i7 >> 24) & 15], j6.b.I()[(i7 >> 20) & 15], j6.b.I()[(i7 >> 16) & 15], j6.b.I()[(i7 >> 12) & 15], j6.b.I()[(i7 >> 8) & 15], j6.b.I()[(i7 >> 4) & 15], j6.b.I()[i7 & 15]};
        while (i8 < 8 && cArr[i8] == '0') {
            i8++;
        }
        return new String(cArr, i8, 8 - i8);
    }

    @n6.d
    public static final String o(long j7) {
        if (j7 == 0) {
            return "0";
        }
        int i7 = 0;
        char[] cArr = {j6.b.I()[(int) ((j7 >> 60) & 15)], j6.b.I()[(int) ((j7 >> 56) & 15)], j6.b.I()[(int) ((j7 >> 52) & 15)], j6.b.I()[(int) ((j7 >> 48) & 15)], j6.b.I()[(int) ((j7 >> 44) & 15)], j6.b.I()[(int) ((j7 >> 40) & 15)], j6.b.I()[(int) ((j7 >> 36) & 15)], j6.b.I()[(int) ((j7 >> 32) & 15)], j6.b.I()[(int) ((j7 >> 28) & 15)], j6.b.I()[(int) ((j7 >> 24) & 15)], j6.b.I()[(int) ((j7 >> 20) & 15)], j6.b.I()[(int) ((j7 >> 16) & 15)], j6.b.I()[(int) ((j7 >> 12) & 15)], j6.b.I()[(int) ((j7 >> 8) & 15)], j6.b.I()[(int) ((j7 >> 4) & 15)], j6.b.I()[(int) (j7 & 15)]};
        while (i7 < 16 && cArr[i7] == '0') {
            i7++;
        }
        return new String(cArr, i7, 16 - i7);
    }
}