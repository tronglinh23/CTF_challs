package j6;

import i5.b0;
import i6.i;
import i6.j;
import i6.m;
import i6.p;
import java.util.Arrays;
import u4.l0;
import v3.t1;
import x3.o;

/* loaded from: classes.dex */
public final class b {
    @n6.d

    /* renamed from: a */
    public static final char[] f11429a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @n6.d
    public static final p A(@n6.d p pVar) {
        byte b7;
        l0.p(pVar, "$this$commonToAsciiLowercase");
        for (int i7 = 0; i7 < pVar.s().length; i7++) {
            byte b8 = pVar.s()[i7];
            byte b9 = (byte) 65;
            if (b8 >= b9 && b8 <= (b7 = (byte) 90)) {
                byte[] s6 = pVar.s();
                byte[] copyOf = Arrays.copyOf(s6, s6.length);
                l0.o(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i7] = (byte) (b8 + 32);
                for (int i8 = i7 + 1; i8 < copyOf.length; i8++) {
                    byte b10 = copyOf[i8];
                    if (b10 >= b9 && b10 <= b7) {
                        copyOf[i8] = (byte) (b10 + 32);
                    }
                }
                return new p(copyOf);
            }
        }
        return pVar;
    }

    @n6.d
    public static final p B(@n6.d p pVar) {
        byte b7;
        l0.p(pVar, "$this$commonToAsciiUppercase");
        for (int i7 = 0; i7 < pVar.s().length; i7++) {
            byte b8 = pVar.s()[i7];
            byte b9 = (byte) 97;
            if (b8 >= b9 && b8 <= (b7 = (byte) 122)) {
                byte[] s6 = pVar.s();
                byte[] copyOf = Arrays.copyOf(s6, s6.length);
                l0.o(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i7] = (byte) (b8 - 32);
                for (int i8 = i7 + 1; i8 < copyOf.length; i8++) {
                    byte b10 = copyOf[i8];
                    if (b10 >= b9 && b10 <= b7) {
                        copyOf[i8] = (byte) (b10 - 32);
                    }
                }
                return new p(copyOf);
            }
        }
        return pVar;
    }

    @n6.d
    public static final byte[] C(@n6.d p pVar) {
        l0.p(pVar, "$this$commonToByteArray");
        byte[] s6 = pVar.s();
        byte[] copyOf = Arrays.copyOf(s6, s6.length);
        l0.o(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @n6.d
    public static final p D(@n6.d byte[] bArr, int i7, int i8) {
        l0.p(bArr, "$this$commonToByteString");
        j.e(bArr.length, i7, i8);
        return new p(o.G1(bArr, i7, i8 + i7));
    }

    @n6.d
    public static final String E(@n6.d p pVar) {
        p pVar2 = pVar;
        l0.p(pVar2, "$this$commonToString");
        if (pVar.s().length == 0) {
            return "[size=0]";
        }
        int c7 = c(pVar.s(), 64);
        if (c7 != -1) {
            String n02 = pVar.n0();
            if (n02 != null) {
                String substring = n02.substring(0, c7);
                l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String l22 = b0.l2(b0.l2(b0.l2(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (c7 >= n02.length()) {
                    return "[text=" + l22 + ']';
                }
                return "[size=" + pVar.s().length + " text=" + l22 + "…]";
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } else if (pVar.s().length <= 64) {
            return "[hex=" + pVar.w() + ']';
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(pVar.s().length);
            sb.append(" hex=");
            if (64 <= pVar.s().length) {
                if (64 != pVar.s().length) {
                    pVar2 = new p(o.G1(pVar.s(), 0, 64));
                }
                sb.append(pVar2.w());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + pVar.s().length + ')').toString());
        }
    }

    @n6.d
    public static final String F(@n6.d p pVar) {
        l0.p(pVar, "$this$commonUtf8");
        String v6 = pVar.v();
        if (v6 == null) {
            String c7 = i.c(pVar.H());
            pVar.Y(c7);
            return c7;
        }
        return v6;
    }

    public static final void G(@n6.d p pVar, @n6.d m mVar, int i7, int i8) {
        l0.p(pVar, "$this$commonWrite");
        l0.p(mVar, "buffer");
        mVar.n(pVar.s(), i7, i8);
    }

    public static final int H(char c7) {
        if ('0' <= c7 && '9' >= c7) {
            return c7 - '0';
        }
        char c8 = 'a';
        if ('a' > c7 || 'f' < c7) {
            c8 = 'A';
            if ('A' > c7 || 'F' < c7) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c7);
            }
        }
        return (c7 - c8) + 10;
    }

    @n6.d
    public static final char[] I() {
        return f11429a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:304:0x0069, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.b.c(byte[], int):int");
    }

    @n6.d
    public static final String d(@n6.d p pVar) {
        l0.p(pVar, "$this$commonBase64");
        return i6.a.c(pVar.s(), null, 1, null);
    }

    @n6.d
    public static final String e(@n6.d p pVar) {
        l0.p(pVar, "$this$commonBase64Url");
        return i6.a.b(pVar.s(), i6.a.e());
    }

    public static final int f(@n6.d p pVar, @n6.d p pVar2) {
        l0.p(pVar, "$this$commonCompareTo");
        l0.p(pVar2, "other");
        int c02 = pVar.c0();
        int c03 = pVar2.c0();
        int min = Math.min(c02, c03);
        for (int i7 = 0; i7 < min; i7++) {
            int r6 = pVar.r(i7) & t1.f17828n;
            int r7 = pVar2.r(i7) & t1.f17828n;
            if (r6 != r7) {
                return r6 < r7 ? -1 : 1;
            }
        }
        if (c02 == c03) {
            return 0;
        }
        return c02 < c03 ? -1 : 1;
    }

    @n6.e
    public static final p g(@n6.d String str) {
        l0.p(str, "$this$commonDecodeBase64");
        byte[] a7 = i6.a.a(str);
        if (a7 != null) {
            return new p(a7);
        }
        return null;
    }

    @n6.d
    public static final p h(@n6.d String str) {
        l0.p(str, "$this$commonDecodeHex");
        if (!(str.length() % 2 == 0)) {
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 2;
            bArr[i7] = (byte) ((H(str.charAt(i8)) << 4) + H(str.charAt(i8 + 1)));
        }
        return new p(bArr);
    }

    @n6.d
    public static final p i(@n6.d String str) {
        l0.p(str, "$this$commonEncodeUtf8");
        p pVar = new p(i.a(str));
        pVar.Y(str);
        return pVar;
    }

    public static final boolean j(@n6.d p pVar, @n6.d p pVar2) {
        l0.p(pVar, "$this$commonEndsWith");
        l0.p(pVar2, "suffix");
        return pVar.T(pVar.c0() - pVar2.c0(), pVar2, 0, pVar2.c0());
    }

    public static final boolean k(@n6.d p pVar, @n6.d byte[] bArr) {
        l0.p(pVar, "$this$commonEndsWith");
        l0.p(bArr, "suffix");
        return pVar.U(pVar.c0() - bArr.length, bArr, 0, bArr.length);
    }

    public static final boolean l(@n6.d p pVar, @n6.e Object obj) {
        l0.p(pVar, "$this$commonEquals");
        if (obj == pVar) {
            return true;
        }
        if (obj instanceof p) {
            p pVar2 = (p) obj;
            if (pVar2.c0() == pVar.s().length && pVar2.U(0, pVar.s(), 0, pVar.s().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte m(@n6.d p pVar, int i7) {
        l0.p(pVar, "$this$commonGetByte");
        return pVar.s()[i7];
    }

    public static final int n(@n6.d p pVar) {
        l0.p(pVar, "$this$commonGetSize");
        return pVar.s().length;
    }

    public static final int o(@n6.d p pVar) {
        l0.p(pVar, "$this$commonHashCode");
        int t6 = pVar.t();
        if (t6 != 0) {
            return t6;
        }
        int hashCode = Arrays.hashCode(pVar.s());
        pVar.X(hashCode);
        return hashCode;
    }

    @n6.d
    public static final String p(@n6.d p pVar) {
        l0.p(pVar, "$this$commonHex");
        char[] cArr = new char[pVar.s().length * 2];
        int i7 = 0;
        for (byte b7 : pVar.s()) {
            int i8 = i7 + 1;
            cArr[i7] = I()[(b7 >> 4) & 15];
            i7 = i8 + 1;
            cArr[i8] = I()[b7 & 15];
        }
        return new String(cArr);
    }

    public static final int q(@n6.d p pVar, @n6.d byte[] bArr, int i7) {
        l0.p(pVar, "$this$commonIndexOf");
        l0.p(bArr, "other");
        int length = pVar.s().length - bArr.length;
        int max = Math.max(i7, 0);
        if (max <= length) {
            while (!j.d(pVar.s(), max, bArr, 0, bArr.length)) {
                if (max == length) {
                    return -1;
                }
                max++;
            }
            return max;
        }
        return -1;
    }

    @n6.d
    public static final byte[] r(@n6.d p pVar) {
        l0.p(pVar, "$this$commonInternalArray");
        return pVar.s();
    }

    public static final int s(@n6.d p pVar, @n6.d p pVar2, int i7) {
        l0.p(pVar, "$this$commonLastIndexOf");
        l0.p(pVar2, "other");
        return pVar.M(pVar2.H(), i7);
    }

    public static final int t(@n6.d p pVar, @n6.d byte[] bArr, int i7) {
        l0.p(pVar, "$this$commonLastIndexOf");
        l0.p(bArr, "other");
        for (int min = Math.min(i7, pVar.s().length - bArr.length); min >= 0; min--) {
            if (j.d(pVar.s(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    @n6.d
    public static final p u(@n6.d byte[] bArr) {
        l0.p(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new p(copyOf);
    }

    public static final boolean v(@n6.d p pVar, int i7, @n6.d p pVar2, int i8, int i9) {
        l0.p(pVar, "$this$commonRangeEquals");
        l0.p(pVar2, "other");
        return pVar2.U(i8, pVar.s(), i7, i9);
    }

    public static final boolean w(@n6.d p pVar, int i7, @n6.d byte[] bArr, int i8, int i9) {
        l0.p(pVar, "$this$commonRangeEquals");
        l0.p(bArr, "other");
        return i7 >= 0 && i7 <= pVar.s().length - i9 && i8 >= 0 && i8 <= bArr.length - i9 && j.d(pVar.s(), i7, bArr, i8, i9);
    }

    public static final boolean x(@n6.d p pVar, @n6.d p pVar2) {
        l0.p(pVar, "$this$commonStartsWith");
        l0.p(pVar2, "prefix");
        return pVar.T(0, pVar2, 0, pVar2.c0());
    }

    public static final boolean y(@n6.d p pVar, @n6.d byte[] bArr) {
        l0.p(pVar, "$this$commonStartsWith");
        l0.p(bArr, "prefix");
        return pVar.U(0, bArr, 0, bArr.length);
    }

    @n6.d
    public static final p z(@n6.d p pVar, int i7, int i8) {
        l0.p(pVar, "$this$commonSubstring");
        if (i7 >= 0) {
            if (i8 <= pVar.s().length) {
                if (i8 - i7 >= 0) {
                    return (i7 == 0 && i8 == pVar.s().length) ? pVar : new p(o.G1(pVar.s(), i7, i8));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + pVar.s().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }
}