package i5;

import u4.l0;
import v3.g1;
/* loaded from: classes.dex */
public class a0 extends z {
    @n6.d
    public static final Void V0(@n6.d String str) {
        l0.p(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    @g1(version = "1.1")
    @n6.e
    public static final Byte W0(@n6.d String str) {
        l0.p(str, "<this>");
        return X0(str, 10);
    }

    @g1(version = "1.1")
    @n6.e
    public static final Byte X0(@n6.d String str, int i7) {
        int intValue;
        l0.p(str, "<this>");
        Integer Z0 = Z0(str, i7);
        if (Z0 == null || (intValue = Z0.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    @g1(version = "1.1")
    @n6.e
    public static final Integer Y0(@n6.d String str) {
        l0.p(str, "<this>");
        return Z0(str, 10);
    }

    @g1(version = "1.1")
    @n6.e
    public static final Integer Z0(@n6.d String str, int i7) {
        boolean z6;
        int i8;
        int i9;
        l0.p(str, "<this>");
        d.a(i7);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char charAt = str.charAt(0);
        int i11 = -2147483647;
        if (l0.t(charAt, 48) < 0) {
            i8 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i11 = Integer.MIN_VALUE;
                z6 = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
            i8 = 0;
        }
        int i12 = -59652323;
        while (i8 < length) {
            int b7 = d.b(str.charAt(i8), i7);
            if (b7 < 0) {
                return null;
            }
            if ((i10 < i12 && (i12 != -59652323 || i10 < (i12 = i11 / i7))) || (i9 = i10 * i7) < i11 + b7) {
                return null;
            }
            i10 = i9 - b7;
            i8++;
        }
        return z6 ? Integer.valueOf(i10) : Integer.valueOf(-i10);
    }

    @g1(version = "1.1")
    @n6.e
    public static final Long a1(@n6.d String str) {
        l0.p(str, "<this>");
        return b1(str, 10);
    }

    @g1(version = "1.1")
    @n6.e
    public static final Long b1(@n6.d String str, int i7) {
        boolean z6;
        l0.p(str, "<this>");
        d.a(i7);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char charAt = str.charAt(0);
        long j7 = -9223372036854775807L;
        if (l0.t(charAt, 48) < 0) {
            z6 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j7 = Long.MIN_VALUE;
                i8 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z6 = false;
                i8 = 1;
            }
        } else {
            z6 = false;
        }
        long j8 = -256204778801521550L;
        long j9 = 0;
        long j10 = -256204778801521550L;
        while (i8 < length) {
            int b7 = d.b(str.charAt(i8), i7);
            if (b7 < 0) {
                return null;
            }
            if (j9 < j10) {
                if (j10 == j8) {
                    j10 = j7 / i7;
                    if (j9 < j10) {
                    }
                }
                return null;
            }
            long j11 = j9 * i7;
            long j12 = b7;
            if (j11 < j7 + j12) {
                return null;
            }
            j9 = j11 - j12;
            i8++;
            j8 = -256204778801521550L;
        }
        return z6 ? Long.valueOf(j9) : Long.valueOf(-j9);
    }

    @g1(version = "1.1")
    @n6.e
    public static final Short c1(@n6.d String str) {
        l0.p(str, "<this>");
        return d1(str, 10);
    }

    @g1(version = "1.1")
    @n6.e
    public static final Short d1(@n6.d String str, int i7) {
        int intValue;
        l0.p(str, "<this>");
        Integer Z0 = Z0(str, i7);
        if (Z0 == null || (intValue = Z0.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }
}
