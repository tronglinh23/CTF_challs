package s5;

import i5.b0;
import i5.c0;
import i6.m;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import n6.e;
import u4.l0;
/* loaded from: classes.dex */
public final class a {
    public static final boolean a(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (l0.t(charAt, 31) <= 0 || l0.t(charAt, 127) >= 0 || c0.r3(" #%/:?@[\\]", charAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(String str, int i7, int i8, byte[] bArr, int i9) {
        int i10 = i9;
        while (i7 < i8) {
            if (i10 == bArr.length) {
                return false;
            }
            if (i10 != i9) {
                if (str.charAt(i7) != '.') {
                    return false;
                }
                i7++;
            }
            int i11 = i7;
            int i12 = 0;
            while (i11 < i8) {
                char charAt = str.charAt(i11);
                if (l0.t(charAt, 48) < 0 || l0.t(charAt, 57) > 0) {
                    break;
                } else if ((i12 == 0 && i7 != i11) || (i12 = ((i12 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i11++;
                }
            }
            if (i11 - i7 == 0) {
                return false;
            }
            bArr[i10] = (byte) i12;
            i10++;
            i7 = i11;
        }
        return i10 == i9 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
        if (r13 == 16) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
        if (r14 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress c(java.lang.String r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.a.c(java.lang.String, int, int):java.net.InetAddress");
    }

    public static final String d(byte[] bArr) {
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < bArr.length) {
            int i11 = i9;
            while (i11 < 16 && bArr[i11] == 0 && bArr[i11 + 1] == 0) {
                i11 += 2;
            }
            int i12 = i11 - i9;
            if (i12 > i10 && i12 >= 4) {
                i7 = i9;
                i10 = i12;
            }
            i9 = i11 + 2;
        }
        m mVar = new m();
        while (i8 < bArr.length) {
            if (i8 == i7) {
                mVar.e0(58);
                i8 += i10;
                if (i8 == 16) {
                    mVar.e0(58);
                }
            } else {
                if (i8 > 0) {
                    mVar.e0(58);
                }
                mVar.v((d.b(bArr[i8], 255) << 8) | d.b(bArr[i8 + 1], 255));
                i8 += 2;
            }
        }
        return mVar.j0();
    }

    @e
    public static final String e(@n6.d String str) {
        l0.p(str, "$this$toCanonicalHost");
        if (!c0.W2(str, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                l0.o(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                l0.o(locale, "Locale.US");
                if (ascii != null) {
                    String lowerCase = ascii.toLowerCase(locale);
                    l0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (!(lowerCase.length() == 0) && !a(lowerCase)) {
                        return lowerCase;
                    }
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress c7 = (b0.v2(str, "[", false, 2, null) && b0.K1(str, "]", false, 2, null)) ? c(str, 1, str.length() - 1) : c(str, 0, str.length());
        if (c7 != null) {
            byte[] address = c7.getAddress();
            if (address.length == 16) {
                l0.o(address, "address");
                return d(address);
            } else if (address.length == 4) {
                return c7.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        }
        return null;
    }
}
