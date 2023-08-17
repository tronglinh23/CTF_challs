package i6;

import i6.p;
import java.util.Arrays;
import v3.t1;

@s4.h(name = "-Base64")
/* loaded from: classes.dex */
public final class a {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f11163a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f11164b;

    static {
        p.a aVar = p.f11252p;
        f11163a = aVar.l("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").s();
        f11164b = aVar.l("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").s();
    }

    @n6.e
    public static final byte[] a(@n6.d String str) {
        int i7;
        char charAt;
        u4.l0.p(str, "$this$decodeBase64ToArray");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i8 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i8];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char charAt2 = str.charAt(i12);
            if ('A' <= charAt2 && 'Z' >= charAt2) {
                i7 = charAt2 - 'A';
            } else if ('a' <= charAt2 && 'z' >= charAt2) {
                i7 = charAt2 - 'G';
            } else if ('0' <= charAt2 && '9' >= charAt2) {
                i7 = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i7 = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i7 = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i10 = (i10 << 6) | i7;
            i9++;
            if (i9 % 4 == 0) {
                int i13 = i11 + 1;
                bArr[i11] = (byte) (i10 >> 16);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (i10 >> 8);
                bArr[i14] = (byte) i10;
                i11 = i14 + 1;
            }
        }
        int i15 = i9 % 4;
        if (i15 != 1) {
            if (i15 == 2) {
                bArr[i11] = (byte) ((i10 << 12) >> 16);
                i11++;
            } else if (i15 == 3) {
                int i16 = i10 << 6;
                int i17 = i11 + 1;
                bArr[i11] = (byte) (i16 >> 16);
                i11 = i17 + 1;
                bArr[i17] = (byte) (i16 >> 8);
            }
            if (i11 == i8) {
                return bArr;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i11);
            u4.l0.o(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            return copyOf;
        }
        return null;
    }

    @n6.d
    public static final String b(@n6.d byte[] bArr, @n6.d byte[] bArr2) {
        u4.l0.p(bArr, "$this$encodeBase64");
        u4.l0.p(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = i7 + 1;
            byte b7 = bArr[i7];
            int i10 = i9 + 1;
            byte b8 = bArr[i9];
            int i11 = i10 + 1;
            byte b9 = bArr[i10];
            int i12 = i8 + 1;
            bArr3[i8] = bArr2[(b7 & t1.f17828n) >> 2];
            int i13 = i12 + 1;
            bArr3[i12] = bArr2[((b7 & 3) << 4) | ((b8 & t1.f17828n) >> 4)];
            int i14 = i13 + 1;
            bArr3[i13] = bArr2[((b8 & 15) << 2) | ((b9 & t1.f17828n) >> 6)];
            i8 = i14 + 1;
            bArr3[i14] = bArr2[b9 & r0.f11273a];
            i7 = i11;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b10 = bArr[i7];
            int i15 = i8 + 1;
            bArr3[i8] = bArr2[(b10 & t1.f17828n) >> 2];
            int i16 = i15 + 1;
            bArr3[i15] = bArr2[(b10 & 3) << 4];
            byte b11 = (byte) 61;
            bArr3[i16] = b11;
            bArr3[i16 + 1] = b11;
        } else if (length2 == 2) {
            int i17 = i7 + 1;
            byte b12 = bArr[i7];
            byte b13 = bArr[i17];
            int i18 = i8 + 1;
            bArr3[i8] = bArr2[(b12 & t1.f17828n) >> 2];
            int i19 = i18 + 1;
            bArr3[i18] = bArr2[((b12 & 3) << 4) | ((b13 & t1.f17828n) >> 4)];
            bArr3[i19] = bArr2[(b13 & 15) << 2];
            bArr3[i19 + 1] = (byte) 61;
        }
        return i.c(bArr3);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bArr2 = f11163a;
        }
        return b(bArr, bArr2);
    }

    @n6.d
    public static final byte[] d() {
        return f11163a;
    }

    @n6.d
    public static final byte[] e() {
        return f11164b;
    }
}