package o4;

import i6.r0;
import java.nio.charset.Charset;
import u4.l0;
import u4.w;
import v3.g1;
import v3.t1;
@g1(version = "1.8")
@f
/* loaded from: classes.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    public static final int f14397d = 8;

    /* renamed from: e  reason: collision with root package name */
    public static final int f14398e = 6;

    /* renamed from: f  reason: collision with root package name */
    public static final int f14399f = 3;

    /* renamed from: g  reason: collision with root package name */
    public static final int f14400g = 4;

    /* renamed from: h  reason: collision with root package name */
    public static final byte f14401h = 61;

    /* renamed from: i  reason: collision with root package name */
    public static final int f14402i = 76;

    /* renamed from: j  reason: collision with root package name */
    public static final int f14403j = 19;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14407a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14408b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final C0200a f14396c = new C0200a(null);
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public static final byte[] f14404k = {13, 10};
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public static final a f14405l = new a(true, false);
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final a f14406m = new a(false, true);

    /* renamed from: o4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0200a extends a {
        public /* synthetic */ C0200a(w wVar) {
            this();
        }

        @n6.d
        public final a G() {
            return a.f14406m;
        }

        @n6.d
        public final byte[] H() {
            return a.f14404k;
        }

        @n6.d
        public final a I() {
            return a.f14405l;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0200a() {
            /*
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o4.a.C0200a.<init>():void");
        }
    }

    public /* synthetic */ a(boolean z6, boolean z7, w wVar) {
        this(z6, z7);
    }

    public static /* synthetic */ byte[] A(a aVar, byte[] bArr, int i7, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i7 = 0;
            }
            if ((i9 & 4) != 0) {
                i8 = bArr.length;
            }
            return aVar.z(bArr, i7, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
    }

    public static /* synthetic */ byte[] j(a aVar, CharSequence charSequence, int i7, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i7 = 0;
            }
            if ((i9 & 4) != 0) {
                i8 = charSequence.length();
            }
            return aVar.h(charSequence, i7, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    public static /* synthetic */ byte[] k(a aVar, byte[] bArr, int i7, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i7 = 0;
            }
            if ((i9 & 4) != 0) {
                i8 = bArr.length;
            }
            return aVar.i(bArr, i7, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    public static /* synthetic */ int o(a aVar, CharSequence charSequence, byte[] bArr, int i7, int i8, int i9, int i10, Object obj) {
        if (obj == null) {
            int i11 = (i10 & 4) != 0 ? 0 : i7;
            int i12 = (i10 & 8) != 0 ? 0 : i8;
            if ((i10 & 16) != 0) {
                i9 = charSequence.length();
            }
            return aVar.m(charSequence, bArr, i11, i12, i9);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    public static /* synthetic */ int p(a aVar, byte[] bArr, byte[] bArr2, int i7, int i8, int i9, int i10, Object obj) {
        if (obj == null) {
            int i11 = (i10 & 4) != 0 ? 0 : i7;
            int i12 = (i10 & 8) != 0 ? 0 : i8;
            if ((i10 & 16) != 0) {
                i9 = bArr.length;
            }
            return aVar.n(bArr, bArr2, i11, i12, i9);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    public static /* synthetic */ String s(a aVar, byte[] bArr, int i7, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i7 = 0;
            }
            if ((i9 & 4) != 0) {
                i8 = bArr.length;
            }
            return aVar.r(bArr, i7, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
    }

    public static /* synthetic */ int u(a aVar, byte[] bArr, byte[] bArr2, int i7, int i8, int i9, int i10, Object obj) {
        if (obj == null) {
            int i11 = (i10 & 4) != 0 ? 0 : i7;
            int i12 = (i10 & 8) != 0 ? 0 : i8;
            if ((i10 & 16) != 0) {
                i9 = bArr.length;
            }
            return aVar.t(bArr, bArr2, i11, i12, i9);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
    }

    public static /* synthetic */ Appendable y(a aVar, byte[] bArr, Appendable appendable, int i7, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 4) != 0) {
                i7 = 0;
            }
            if ((i9 & 8) != 0) {
                i8 = bArr.length;
            }
            return aVar.x(bArr, appendable, i7, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
    }

    @n6.d
    public final byte[] B(@n6.d byte[] bArr, int i7, int i8) {
        l0.p(bArr, "source");
        g(bArr.length, i7, i8);
        byte[] bArr2 = new byte[w(i8 - i7)];
        v(bArr, bArr2, 0, i7, i8);
        return bArr2;
    }

    public final int C(byte[] bArr, int i7, int i8, int i9) {
        if (i9 == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + i7);
        }
        if (i9 != -6) {
            if (i9 == -4) {
                i7 = F(bArr, i7 + 1, i8);
                if (i7 == i8 || bArr[i7] != 61) {
                    throw new IllegalArgumentException("Missing one pad character at index " + i7);
                }
            } else if (i9 != -2) {
                throw new IllegalStateException("Unreachable".toString());
            }
        }
        return i7 + 1;
    }

    public final boolean D() {
        return this.f14408b;
    }

    public final boolean E() {
        return this.f14407a;
    }

    public final int F(byte[] bArr, int i7, int i8) {
        if (this.f14408b) {
            while (i7 < i8) {
                if (c.a()[bArr[i7] & t1.f17828n] != -1) {
                    return i7;
                }
                i7++;
            }
            return i7;
        }
        return i7;
    }

    @n6.d
    public final String d(@n6.d byte[] bArr) {
        l0.p(bArr, "source");
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b7 : bArr) {
            sb.append((char) b7);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "stringBuilder.toString()");
        return sb2;
    }

    @n6.d
    public final byte[] e(@n6.d CharSequence charSequence, int i7, int i8) {
        l0.p(charSequence, "source");
        g(charSequence.length(), i7, i8);
        byte[] bArr = new byte[i8 - i7];
        int i9 = 0;
        while (i7 < i8) {
            char charAt = charSequence.charAt(i7);
            if (charAt <= 255) {
                bArr[i9] = (byte) charAt;
                i9++;
            } else {
                bArr[i9] = r0.f11273a;
                i9++;
            }
            i7++;
        }
        return bArr;
    }

    public final void f(int i7, int i8, int i9) {
        if (i8 < 0 || i8 > i7) {
            throw new IndexOutOfBoundsException("destination offset: " + i8 + ", destination size: " + i7);
        }
        int i10 = i8 + i9;
        if (i10 < 0 || i10 > i7) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i8 + ", destination size: " + i7 + ", capacity needed: " + i9);
        }
    }

    public final void g(int i7, int i8, int i9) {
        x3.c.f18278k.a(i8, i9, i7);
    }

    @n6.d
    public final byte[] h(@n6.d CharSequence charSequence, int i7, int i8) {
        byte[] e7;
        l0.p(charSequence, "source");
        if (charSequence instanceof String) {
            g(charSequence.length(), i7, i8);
            String substring = ((String) charSequence).substring(i7, i8);
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = i5.f.f11076g;
            l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            e7 = substring.getBytes(charset);
            l0.o(e7, "this as java.lang.String).getBytes(charset)");
        } else {
            e7 = e(charSequence, i7, i8);
        }
        return k(this, e7, 0, 0, 6, null);
    }

    @n6.d
    public final byte[] i(@n6.d byte[] bArr, int i7, int i8) {
        l0.p(bArr, "source");
        g(bArr.length, i7, i8);
        int q6 = q(bArr, i7, i8);
        byte[] bArr2 = new byte[q6];
        if (l(bArr, bArr2, 0, i7, i8) == q6) {
            return bArr2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int l(byte[] bArr, byte[] bArr2, int i7, int i8, int i9) {
        int[] c7 = this.f14407a ? c.c() : c.a();
        int i10 = -8;
        int i11 = i7;
        int i12 = -8;
        int i13 = 0;
        int i14 = i8;
        while (true) {
            if (i14 >= i9) {
                break;
            }
            if (i12 == i10 && i14 + 3 < i9) {
                int i15 = i14 + 1;
                int i16 = c7[bArr[i14] & t1.f17828n];
                int i17 = i15 + 1;
                int i18 = c7[bArr[i15] & t1.f17828n];
                int i19 = i17 + 1;
                int i20 = c7[bArr[i17] & t1.f17828n];
                int i21 = i19 + 1;
                int i22 = (i20 << 6) | (i16 << 18) | (i18 << 12) | c7[bArr[i19] & t1.f17828n];
                if (i22 >= 0) {
                    int i23 = i11 + 1;
                    bArr2[i11] = (byte) (i22 >> 16);
                    int i24 = i23 + 1;
                    bArr2[i23] = (byte) (i22 >> 8);
                    bArr2[i24] = (byte) i22;
                    i11 = i24 + 1;
                    i14 = i21;
                    i10 = -8;
                } else {
                    i14 = i21 - 4;
                }
            }
            int i25 = bArr[i14] & t1.f17828n;
            int i26 = c7[i25];
            if (i26 >= 0) {
                i14++;
                i13 = (i13 << 6) | i26;
                i12 += 6;
                if (i12 >= 0) {
                    bArr2[i11] = (byte) (i13 >>> i12);
                    i13 &= (1 << i12) - 1;
                    i12 -= 8;
                    i11++;
                }
            } else if (i26 == -2) {
                i14 = C(bArr, i14, i9, i12);
                break;
            } else if (!this.f14408b) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid symbol '");
                sb.append((char) i25);
                sb.append("'(");
                String num = Integer.toString(i25, i5.d.a(8));
                l0.o(num, "toString(this, checkRadix(radix))");
                sb.append(num);
                sb.append(") at index ");
                sb.append(i14);
                throw new IllegalArgumentException(sb.toString());
            } else {
                i14++;
            }
            i10 = -8;
        }
        if (i12 != -2) {
            int F = F(bArr, i14, i9);
            if (F >= i9) {
                return i11 - i7;
            }
            int i27 = bArr[F] & t1.f17828n;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Symbol '");
            sb2.append((char) i27);
            sb2.append("'(");
            String num2 = Integer.toString(i27, i5.d.a(8));
            l0.o(num2, "toString(this, checkRadix(radix))");
            sb2.append(num2);
            sb2.append(") at index ");
            sb2.append(F - 1);
            sb2.append(" is prohibited after the pad character");
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new IllegalArgumentException("The last unit of input does not have enough bits");
    }

    public final int m(@n6.d CharSequence charSequence, @n6.d byte[] bArr, int i7, int i8, int i9) {
        byte[] e7;
        l0.p(charSequence, "source");
        l0.p(bArr, "destination");
        if (charSequence instanceof String) {
            g(charSequence.length(), i8, i9);
            String substring = ((String) charSequence).substring(i8, i9);
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = i5.f.f11076g;
            l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            e7 = substring.getBytes(charset);
            l0.o(e7, "this as java.lang.String).getBytes(charset)");
        } else {
            e7 = e(charSequence, i8, i9);
        }
        return p(this, e7, bArr, i7, 0, 0, 24, null);
    }

    public final int n(@n6.d byte[] bArr, @n6.d byte[] bArr2, int i7, int i8, int i9) {
        l0.p(bArr, "source");
        l0.p(bArr2, "destination");
        g(bArr.length, i8, i9);
        f(bArr2.length, i7, q(bArr, i8, i9));
        return l(bArr, bArr2, i7, i8, i9);
    }

    public final int q(byte[] bArr, int i7, int i8) {
        int i9 = i8 - i7;
        if (i9 == 0) {
            return 0;
        }
        if (i9 == 1) {
            throw new IllegalArgumentException("Input should have at list 2 symbols for Base64 decoding, startIndex: " + i7 + ", endIndex: " + i8);
        }
        if (this.f14408b) {
            while (true) {
                if (i7 >= i8) {
                    break;
                }
                int i10 = c.a()[bArr[i7] & t1.f17828n];
                if (i10 < 0) {
                    if (i10 == -2) {
                        i9 -= i8 - i7;
                        break;
                    }
                    i9--;
                }
                i7++;
            }
        } else if (bArr[i8 - 1] == 61) {
            i9--;
            if (bArr[i8 - 2] == 61) {
                i9--;
            }
        }
        return (int) ((i9 * 6) / 8);
    }

    @n6.d
    public final String r(@n6.d byte[] bArr, int i7, int i8) {
        l0.p(bArr, "source");
        return new String(B(bArr, i7, i8), i5.f.f11076g);
    }

    public final int t(@n6.d byte[] bArr, @n6.d byte[] bArr2, int i7, int i8, int i9) {
        l0.p(bArr, "source");
        l0.p(bArr2, "destination");
        return v(bArr, bArr2, i7, i8, i9);
    }

    public final int v(@n6.d byte[] bArr, @n6.d byte[] bArr2, int i7, int i8, int i9) {
        l0.p(bArr, "source");
        l0.p(bArr2, "destination");
        g(bArr.length, i8, i9);
        f(bArr2.length, i7, w(i9 - i8));
        byte[] d7 = this.f14407a ? c.d() : c.b();
        int i10 = this.f14408b ? 19 : Integer.MAX_VALUE;
        int i11 = i7;
        while (true) {
            if (i8 + 2 >= i9) {
                break;
            }
            int min = Math.min((i9 - i8) / 3, i10);
            int i12 = 0;
            while (i12 < min) {
                int i13 = i8 + 1;
                int i14 = i13 + 1;
                int i15 = ((bArr[i8] & t1.f17828n) << 16) | ((bArr[i13] & t1.f17828n) << 8) | (bArr[i14] & t1.f17828n);
                int i16 = i11 + 1;
                bArr2[i11] = d7[i15 >>> 18];
                int i17 = i16 + 1;
                bArr2[i16] = d7[(i15 >>> 12) & 63];
                int i18 = i17 + 1;
                bArr2[i17] = d7[(i15 >>> 6) & 63];
                i11 = i18 + 1;
                bArr2[i18] = d7[i15 & 63];
                i12++;
                i8 = i14 + 1;
            }
            if (min == i10 && i8 != i9) {
                int i19 = i11 + 1;
                byte[] bArr3 = f14404k;
                bArr2[i11] = bArr3[0];
                i11 = i19 + 1;
                bArr2[i19] = bArr3[1];
            }
        }
        int i20 = i9 - i8;
        if (i20 == 1) {
            int i21 = i8 + 1;
            int i22 = (bArr[i8] & t1.f17828n) << 4;
            int i23 = i11 + 1;
            bArr2[i11] = d7[i22 >>> 6];
            int i24 = i23 + 1;
            bArr2[i23] = d7[i22 & 63];
            int i25 = i24 + 1;
            bArr2[i24] = f14401h;
            i11 = i25 + 1;
            bArr2[i25] = f14401h;
            i8 = i21;
        } else if (i20 == 2) {
            int i26 = i8 + 1;
            int i27 = i26 + 1;
            int i28 = ((bArr[i26] & t1.f17828n) << 2) | ((bArr[i8] & t1.f17828n) << 10);
            int i29 = i11 + 1;
            bArr2[i11] = d7[i28 >>> 12];
            int i30 = i29 + 1;
            bArr2[i29] = d7[(i28 >>> 6) & 63];
            int i31 = i30 + 1;
            bArr2[i30] = d7[i28 & 63];
            i11 = i31 + 1;
            bArr2[i31] = f14401h;
            i8 = i27;
        }
        if (i8 == i9) {
            return i11 - i7;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int w(int i7) {
        int i8 = ((i7 + 3) - 1) / 3;
        int i9 = (i8 * 4) + ((this.f14408b ? (i8 - 1) / 19 : 0) * 2);
        if (i9 >= 0) {
            return i9;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    @n6.d
    public final <A extends Appendable> A x(@n6.d byte[] bArr, @n6.d A a7, int i7, int i8) {
        l0.p(bArr, "source");
        l0.p(a7, "destination");
        a7.append(new String(B(bArr, i7, i8), i5.f.f11076g));
        return a7;
    }

    @n6.d
    public final byte[] z(@n6.d byte[] bArr, int i7, int i8) {
        l0.p(bArr, "source");
        return B(bArr, i7, i8);
    }

    public a(boolean z6, boolean z7) {
        this.f14407a = z6;
        this.f14408b = z7;
        if (!((z6 && z7) ? false : true)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
