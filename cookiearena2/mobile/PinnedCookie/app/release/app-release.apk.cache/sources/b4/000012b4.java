package j6;

import i6.r0;
import java.util.Arrays;
import u4.l0;

/* loaded from: classes.dex */
public final class f {
    @n6.d
    public static final byte[] a(@n6.d String str) {
        int i7;
        int i8;
        char charAt;
        l0.p(str, "$this$commonAsUtf8ToByteArray");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            char charAt2 = str.charAt(i9);
            if (l0.t(charAt2, 128) >= 0) {
                int length2 = str.length();
                int i10 = i9;
                while (i9 < length2) {
                    char charAt3 = str.charAt(i9);
                    if (l0.t(charAt3, 128) < 0) {
                        int i11 = i10 + 1;
                        bArr[i10] = (byte) charAt3;
                        i9++;
                        while (i9 < length2 && l0.t(str.charAt(i9), 128) < 0) {
                            bArr[i11] = (byte) str.charAt(i9);
                            i9++;
                            i11++;
                        }
                        i10 = i11;
                    } else {
                        if (l0.t(charAt3, 2048) < 0) {
                            int i12 = i10 + 1;
                            bArr[i10] = (byte) ((charAt3 >> 6) | 192);
                            byte b7 = (byte) ((charAt3 & '?') | 128);
                            i7 = i12 + 1;
                            bArr[i12] = b7;
                        } else if (55296 > charAt3 || 57343 < charAt3) {
                            int i13 = i10 + 1;
                            bArr[i10] = (byte) ((charAt3 >> '\f') | 224);
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((charAt3 >> 6) & 63) | 128);
                            byte b8 = (byte) ((charAt3 & '?') | 128);
                            i7 = i14 + 1;
                            bArr[i14] = b8;
                        } else if (l0.t(charAt3, 56319) > 0 || length2 <= (i8 = i9 + 1) || 56320 > (charAt = str.charAt(i8)) || 57343 < charAt) {
                            i7 = i10 + 1;
                            bArr[i10] = r0.f11273a;
                        } else {
                            int charAt4 = ((charAt3 << '\n') + str.charAt(i8)) - 56613888;
                            int i15 = i10 + 1;
                            bArr[i10] = (byte) ((charAt4 >> 18) | 240);
                            int i16 = i15 + 1;
                            bArr[i15] = (byte) (((charAt4 >> 12) & 63) | 128);
                            int i17 = i16 + 1;
                            bArr[i16] = (byte) (((charAt4 >> 6) & 63) | 128);
                            byte b9 = (byte) ((charAt4 & 63) | 128);
                            i7 = i17 + 1;
                            bArr[i17] = b9;
                            i9 += 2;
                            i10 = i7;
                        }
                        i9++;
                        i10 = i7;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i10);
                l0.o(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                return copyOf;
            }
            bArr[i9] = (byte) charAt2;
            i9++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        l0.o(copyOf2, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
        if (((r16[r5] & 192) == 128) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0117, code lost:
        if (((r16[r5] & 192) == 128) == false) goto L92;
     */
    @n6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String b(@n6.d byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.f.b(byte[], int, int):java.lang.String");
    }

    public static /* synthetic */ String c(byte[] bArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = bArr.length;
        }
        return b(bArr, i7, i8);
    }
}