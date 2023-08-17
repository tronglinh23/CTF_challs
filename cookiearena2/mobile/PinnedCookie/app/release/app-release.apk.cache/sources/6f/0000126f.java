package i6;

import v3.m2;

@s4.h(name = "Utf8")
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final byte f11273a = 63;

    /* renamed from: b  reason: collision with root package name */
    public static final char f11274b = 65533;

    /* renamed from: c  reason: collision with root package name */
    public static final int f11275c = 65533;

    /* renamed from: d  reason: collision with root package name */
    public static final int f11276d = 55232;

    /* renamed from: e  reason: collision with root package name */
    public static final int f11277e = 56320;

    /* renamed from: f  reason: collision with root package name */
    public static final int f11278f = 3968;

    /* renamed from: g  reason: collision with root package name */
    public static final int f11279g = -123008;

    /* renamed from: h  reason: collision with root package name */
    public static final int f11280h = 3678080;

    public static final boolean a(int i7) {
        return (i7 >= 0 && 31 >= i7) || (127 <= i7 && 159 >= i7);
    }

    public static final boolean b(byte b7) {
        return (b7 & 192) == 128;
    }

    public static final int c(@n6.d byte[] bArr, int i7, int i8, @n6.d t4.l<? super Integer, m2> lVar) {
        u4.l0.p(bArr, "$this$process2Utf8Bytes");
        u4.l0.p(lVar, "yield");
        int i9 = i7 + 1;
        Integer valueOf = Integer.valueOf((int) f11275c);
        if (i8 <= i9) {
            lVar.O(valueOf);
            return 1;
        }
        byte b7 = bArr[i7];
        byte b8 = bArr[i9];
        if (!((b8 & 192) == 128)) {
            lVar.O(valueOf);
            return 1;
        }
        int i10 = (b8 ^ u4.o.f17448b) ^ (b7 << 6);
        if (i10 < 128) {
            lVar.O(valueOf);
            return 2;
        }
        lVar.O(Integer.valueOf(i10));
        return 2;
    }

    public static final int d(@n6.d byte[] bArr, int i7, int i8, @n6.d t4.l<? super Integer, m2> lVar) {
        u4.l0.p(bArr, "$this$process3Utf8Bytes");
        u4.l0.p(lVar, "yield");
        int i9 = i7 + 2;
        Integer valueOf = Integer.valueOf((int) f11275c);
        if (i8 <= i9) {
            lVar.O(valueOf);
            int i10 = i7 + 1;
            if (i8 > i10) {
                if ((bArr[i10] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b7 = bArr[i7];
        byte b8 = bArr[i7 + 1];
        if (!((b8 & 192) == 128)) {
            lVar.O(valueOf);
            return 1;
        }
        byte b9 = bArr[i9];
        if (!((b9 & 192) == 128)) {
            lVar.O(valueOf);
            return 2;
        }
        int i11 = ((b9 ^ u4.o.f17448b) ^ (b8 << 6)) ^ (b7 << 12);
        if (i11 < 2048) {
            lVar.O(valueOf);
            return 3;
        } else if (55296 <= i11 && 57343 >= i11) {
            lVar.O(valueOf);
            return 3;
        } else {
            lVar.O(Integer.valueOf(i11));
            return 3;
        }
    }

    public static final int e(@n6.d byte[] bArr, int i7, int i8, @n6.d t4.l<? super Integer, m2> lVar) {
        u4.l0.p(bArr, "$this$process4Utf8Bytes");
        u4.l0.p(lVar, "yield");
        int i9 = i7 + 3;
        Integer valueOf = Integer.valueOf((int) f11275c);
        if (i8 <= i9) {
            lVar.O(valueOf);
            int i10 = i7 + 1;
            if (i8 > i10) {
                if ((bArr[i10] & 192) == 128) {
                    int i11 = i7 + 2;
                    if (i8 > i11) {
                        if ((bArr[i11] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b7 = bArr[i7];
        byte b8 = bArr[i7 + 1];
        if (!((b8 & 192) == 128)) {
            lVar.O(valueOf);
            return 1;
        }
        byte b9 = bArr[i7 + 2];
        if (!((b9 & 192) == 128)) {
            lVar.O(valueOf);
            return 2;
        }
        byte b10 = bArr[i9];
        if (!((b10 & 192) == 128)) {
            lVar.O(valueOf);
            return 3;
        }
        int i12 = (((b10 ^ u4.o.f17448b) ^ (b9 << 6)) ^ (b8 << 12)) ^ (b7 << 18);
        if (i12 > 1114111) {
            lVar.O(valueOf);
            return 4;
        } else if (55296 <= i12 && 57343 >= i12) {
            lVar.O(valueOf);
            return 4;
        } else if (i12 < 65536) {
            lVar.O(valueOf);
            return 4;
        } else {
            lVar.O(Integer.valueOf(i12));
            return 4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0112, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(@n6.d byte[] r16, int r17, int r18, @n6.d t4.l<? super java.lang.Character, v3.m2> r19) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.r0.f(byte[], int, int, t4.l):void");
    }

    public static final void g(@n6.d String str, int i7, int i8, @n6.d t4.l<? super Byte, m2> lVar) {
        int i9;
        char charAt;
        u4.l0.p(str, "$this$processUtf8Bytes");
        u4.l0.p(lVar, "yield");
        while (i7 < i8) {
            char charAt2 = str.charAt(i7);
            if (u4.l0.t(charAt2, 128) < 0) {
                lVar.O(Byte.valueOf((byte) charAt2));
                i7++;
                while (i7 < i8 && u4.l0.t(str.charAt(i7), 128) < 0) {
                    lVar.O(Byte.valueOf((byte) str.charAt(i7)));
                    i7++;
                }
            } else {
                if (u4.l0.t(charAt2, 2048) < 0) {
                    lVar.O(Byte.valueOf((byte) ((charAt2 >> 6) | 192)));
                    lVar.O(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (55296 > charAt2 || 57343 < charAt2) {
                    lVar.O(Byte.valueOf((byte) ((charAt2 >> '\f') | 224)));
                    lVar.O(Byte.valueOf((byte) (((charAt2 >> 6) & 63) | 128)));
                    lVar.O(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (u4.l0.t(charAt2, 56319) > 0 || i8 <= (i9 = i7 + 1) || 56320 > (charAt = str.charAt(i9)) || 57343 < charAt) {
                    lVar.O(Byte.valueOf((byte) f11273a));
                } else {
                    int charAt3 = ((charAt2 << '\n') + str.charAt(i9)) - 56613888;
                    lVar.O(Byte.valueOf((byte) ((charAt3 >> 18) | 240)));
                    lVar.O(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                    lVar.O(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                    lVar.O(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                    i7 += 2;
                }
                i7++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0110, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(@n6.d byte[] r16, int r17, int r18, @n6.d t4.l<? super java.lang.Integer, v3.m2> r19) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.r0.h(byte[], int, int, t4.l):void");
    }

    @s4.h(name = "size")
    @s4.i
    public static final long i(@n6.d String str) {
        return l(str, 0, 0, 3, null);
    }

    @s4.h(name = "size")
    @s4.i
    public static final long j(@n6.d String str, int i7) {
        return l(str, i7, 0, 2, null);
    }

    @s4.h(name = "size")
    @s4.i
    public static final long k(@n6.d String str, int i7, int i8) {
        int i9;
        u4.l0.p(str, "$this$utf8Size");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i7).toString());
        }
        if (!(i8 >= i7)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i8 + " < " + i7).toString());
        }
        if (!(i8 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i8 + " > " + str.length()).toString());
        }
        long j7 = 0;
        while (i7 < i8) {
            char charAt = str.charAt(i7);
            if (charAt < 128) {
                j7++;
            } else {
                if (charAt < 2048) {
                    i9 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i9 = 3;
                } else {
                    int i10 = i7 + 1;
                    char charAt2 = i10 < i8 ? str.charAt(i10) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j7++;
                        i7 = i10;
                    } else {
                        j7 += 4;
                        i7 += 2;
                    }
                }
                j7 += i9;
            }
            i7++;
        }
        return j7;
    }

    public static /* synthetic */ long l(String str, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        return k(str, i7, i8);
    }
}