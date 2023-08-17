package j6;

import i5.h0;
import i6.d0;
import i6.i;
import i6.j;
import i6.j0;
import i6.k0;
import i6.m;
import i6.m0;
import i6.o0;
import i6.p;
import i6.r0;
import java.io.EOFException;
import kotlinx.coroutines.x1;
import u.v;
import u4.l0;
import u4.o;
import v3.t1;
/* loaded from: classes.dex */
public final class a {
    @n6.d

    /* renamed from: a */
    public static final byte[] f11425a = i.a("0123456789abcdef");

    /* renamed from: b */
    public static final int f11426b = 4096;

    /* renamed from: c */
    public static final long f11427c = -922337203685477580L;

    /* renamed from: d */
    public static final long f11428d = -7;

    public static final short A(@n6.d m mVar) {
        l0.p(mVar, "$this$commonReadShort");
        if (mVar.a1() >= 2) {
            j0 j0Var = mVar.f11238k;
            l0.m(j0Var);
            int i7 = j0Var.f11213b;
            int i8 = j0Var.f11214c;
            if (i8 - i7 < 2) {
                return (short) ((mVar.readByte() & t1.f17828n) | ((mVar.readByte() & t1.f17828n) << 8));
            }
            byte[] bArr = j0Var.f11212a;
            int i9 = i7 + 1;
            int i10 = i9 + 1;
            int i11 = ((bArr[i7] & t1.f17828n) << 8) | (bArr[i9] & t1.f17828n);
            mVar.W0(mVar.a1() - 2);
            if (i10 == i8) {
                mVar.f11238k = j0Var.b();
                k0.d(j0Var);
            } else {
                j0Var.f11213b = i10;
            }
            return (short) i11;
        }
        throw new EOFException();
    }

    @n6.d
    public static final String B(@n6.d m mVar, long j7) {
        l0.p(mVar, "$this$commonReadUtf8");
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (!(i7 >= 0 && j7 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        } else if (mVar.a1() >= j7) {
            if (i7 == 0) {
                return "";
            }
            j0 j0Var = mVar.f11238k;
            l0.m(j0Var);
            int i8 = j0Var.f11213b;
            if (i8 + j7 > j0Var.f11214c) {
                return f.c(mVar.h0(j7), 0, 0, 3, null);
            }
            int i9 = (int) j7;
            String b7 = f.b(j0Var.f11212a, i8, i8 + i9);
            j0Var.f11213b += i9;
            mVar.W0(mVar.a1() - j7);
            if (j0Var.f11213b == j0Var.f11214c) {
                mVar.f11238k = j0Var.b();
                k0.d(j0Var);
            }
            return b7;
        } else {
            throw new EOFException();
        }
    }

    public static final int C(@n6.d m mVar) {
        int i7;
        int i8;
        int i9;
        l0.p(mVar, "$this$commonReadUtf8CodePoint");
        if (mVar.a1() != 0) {
            byte Z = mVar.Z(0L);
            if ((Z & o.f17448b) == 0) {
                i7 = Z & o.f17449c;
                i9 = 0;
                i8 = 1;
            } else if ((Z & 224) == 192) {
                i7 = Z & 31;
                i8 = 2;
                i9 = 128;
            } else if ((Z & 240) == 224) {
                i7 = Z & 15;
                i8 = 3;
                i9 = 2048;
            } else if ((Z & 248) != 240) {
                mVar.skip(1L);
                return r0.f11275c;
            } else {
                i7 = Z & 7;
                i8 = 4;
                i9 = 65536;
            }
            long j7 = i8;
            if (mVar.a1() < j7) {
                throw new EOFException("size < " + i8 + ": " + mVar.a1() + " (to read code point prefixed 0x" + j.m(Z) + ')');
            }
            for (int i10 = 1; i10 < i8; i10++) {
                long j8 = i10;
                byte Z2 = mVar.Z(j8);
                if ((Z2 & 192) != 128) {
                    mVar.skip(j8);
                    return r0.f11275c;
                }
                i7 = (i7 << 6) | (Z2 & r0.f11273a);
            }
            mVar.skip(j7);
            return i7 > 1114111 ? r0.f11275c : ((55296 <= i7 && 57343 >= i7) || i7 < i9) ? r0.f11275c : i7;
        }
        throw new EOFException();
    }

    @n6.e
    public static final String D(@n6.d m mVar) {
        l0.p(mVar, "$this$commonReadUtf8Line");
        long N0 = mVar.N0((byte) 10);
        if (N0 != -1) {
            return b0(mVar, N0);
        }
        if (mVar.a1() != 0) {
            return mVar.q(mVar.a1());
        }
        return null;
    }

    @n6.d
    public static final String E(@n6.d m mVar, long j7) {
        l0.p(mVar, "$this$commonReadUtf8LineStrict");
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j7).toString());
        }
        long j8 = j7 != Long.MAX_VALUE ? j7 + 1 : Long.MAX_VALUE;
        byte b7 = (byte) 10;
        long s02 = mVar.s0(b7, 0L, j8);
        if (s02 != -1) {
            return b0(mVar, s02);
        }
        if (j8 < mVar.a1() && mVar.Z(j8 - 1) == ((byte) 13) && mVar.Z(j8) == b7) {
            return b0(mVar, j8);
        }
        m mVar2 = new m();
        mVar.A(mVar2, 0L, Math.min(32, mVar.a1()));
        throw new EOFException("\\n not found: limit=" + Math.min(mVar.a1(), j7) + " content=" + mVar2.x().w() + h0.F);
    }

    public static final int F(@n6.d m mVar, @n6.d d0 d0Var) {
        l0.p(mVar, "$this$commonSelect");
        l0.p(d0Var, "options");
        int e02 = e0(mVar, d0Var, false, 2, null);
        if (e02 == -1) {
            return -1;
        }
        mVar.skip(d0Var.f()[e02].c0());
        return e02;
    }

    public static final void G(@n6.d m mVar, long j7) {
        l0.p(mVar, "$this$commonSkip");
        while (j7 > 0) {
            j0 j0Var = mVar.f11238k;
            if (j0Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j7, j0Var.f11214c - j0Var.f11213b);
            long j8 = min;
            mVar.W0(mVar.a1() - j8);
            j7 -= j8;
            int i7 = j0Var.f11213b + min;
            j0Var.f11213b = i7;
            if (i7 == j0Var.f11214c) {
                mVar.f11238k = j0Var.b();
                k0.d(j0Var);
            }
        }
    }

    @n6.d
    public static final p H(@n6.d m mVar) {
        l0.p(mVar, "$this$commonSnapshot");
        if (mVar.a1() <= ((long) Integer.MAX_VALUE)) {
            return mVar.c1((int) mVar.a1());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + mVar.a1()).toString());
    }

    @n6.d
    public static final p I(@n6.d m mVar, int i7) {
        l0.p(mVar, "$this$commonSnapshot");
        if (i7 == 0) {
            return p.f11251o;
        }
        j.e(mVar.a1(), 0L, i7);
        j0 j0Var = mVar.f11238k;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            l0.m(j0Var);
            int i11 = j0Var.f11214c;
            int i12 = j0Var.f11213b;
            if (i11 == i12) {
                throw new AssertionError("s.limit == s.pos");
            }
            i9 += i11 - i12;
            i10++;
            j0Var = j0Var.f11217f;
        }
        byte[][] bArr = new byte[i10];
        int[] iArr = new int[i10 * 2];
        j0 j0Var2 = mVar.f11238k;
        int i13 = 0;
        while (i8 < i7) {
            l0.m(j0Var2);
            bArr[i13] = j0Var2.f11212a;
            i8 += j0Var2.f11214c - j0Var2.f11213b;
            iArr[i13] = Math.min(i8, i7);
            iArr[i13 + i10] = j0Var2.f11213b;
            j0Var2.f11215d = true;
            i13++;
            j0Var2 = j0Var2.f11217f;
        }
        return new i6.l0(bArr, iArr);
    }

    @n6.d
    public static final j0 J(@n6.d m mVar, int i7) {
        l0.p(mVar, "$this$commonWritableSegment");
        if (i7 >= 1 && i7 <= 8192) {
            j0 j0Var = mVar.f11238k;
            if (j0Var != null) {
                l0.m(j0Var);
                j0 j0Var2 = j0Var.f11218g;
                l0.m(j0Var2);
                return (j0Var2.f11214c + i7 > 8192 || !j0Var2.f11216e) ? j0Var2.c(k0.e()) : j0Var2;
            }
            j0 e7 = k0.e();
            mVar.f11238k = e7;
            e7.f11218g = e7;
            e7.f11217f = e7;
            return e7;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @n6.d
    public static final m K(@n6.d m mVar, @n6.d p pVar, int i7, int i8) {
        l0.p(mVar, "$this$commonWrite");
        l0.p(pVar, "byteString");
        pVar.p0(mVar, i7, i8);
        return mVar;
    }

    @n6.d
    public static final m L(@n6.d m mVar, @n6.d o0 o0Var, long j7) {
        l0.p(mVar, "$this$commonWrite");
        l0.p(o0Var, "source");
        while (j7 > 0) {
            long l02 = o0Var.l0(mVar, j7);
            if (l02 == -1) {
                throw new EOFException();
            }
            j7 -= l02;
        }
        return mVar;
    }

    @n6.d
    public static final m M(@n6.d m mVar, @n6.d byte[] bArr) {
        l0.p(mVar, "$this$commonWrite");
        l0.p(bArr, "source");
        return mVar.n(bArr, 0, bArr.length);
    }

    @n6.d
    public static final m N(@n6.d m mVar, @n6.d byte[] bArr, int i7, int i8) {
        l0.p(mVar, "$this$commonWrite");
        l0.p(bArr, "source");
        long j7 = i8;
        j.e(bArr.length, i7, j7);
        int i9 = i8 + i7;
        while (i7 < i9) {
            j0 d12 = mVar.d1(1);
            int min = Math.min(i9 - i7, 8192 - d12.f11214c);
            int i10 = i7 + min;
            x3.o.W0(bArr, d12.f11212a, d12.f11214c, i7, i10);
            d12.f11214c += min;
            i7 = i10;
        }
        mVar.W0(mVar.a1() + j7);
        return mVar;
    }

    public static final void O(@n6.d m mVar, @n6.d m mVar2, long j7) {
        j0 j0Var;
        l0.p(mVar, "$this$commonWrite");
        l0.p(mVar2, "source");
        if (!(mVar2 != mVar)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        j.e(mVar2.a1(), 0L, j7);
        while (j7 > 0) {
            j0 j0Var2 = mVar2.f11238k;
            l0.m(j0Var2);
            int i7 = j0Var2.f11214c;
            l0.m(mVar2.f11238k);
            if (j7 < i7 - r2.f11213b) {
                j0 j0Var3 = mVar.f11238k;
                if (j0Var3 != null) {
                    l0.m(j0Var3);
                    j0Var = j0Var3.f11218g;
                } else {
                    j0Var = null;
                }
                if (j0Var != null && j0Var.f11216e) {
                    if ((j0Var.f11214c + j7) - (j0Var.f11215d ? 0 : j0Var.f11213b) <= 8192) {
                        j0 j0Var4 = mVar2.f11238k;
                        l0.m(j0Var4);
                        j0Var4.g(j0Var, (int) j7);
                        mVar2.W0(mVar2.a1() - j7);
                        mVar.W0(mVar.a1() + j7);
                        return;
                    }
                }
                j0 j0Var5 = mVar2.f11238k;
                l0.m(j0Var5);
                mVar2.f11238k = j0Var5.e((int) j7);
            }
            j0 j0Var6 = mVar2.f11238k;
            l0.m(j0Var6);
            long j8 = j0Var6.f11214c - j0Var6.f11213b;
            mVar2.f11238k = j0Var6.b();
            j0 j0Var7 = mVar.f11238k;
            if (j0Var7 == null) {
                mVar.f11238k = j0Var6;
                j0Var6.f11218g = j0Var6;
                j0Var6.f11217f = j0Var6;
            } else {
                l0.m(j0Var7);
                j0 j0Var8 = j0Var7.f11218g;
                l0.m(j0Var8);
                j0Var8.c(j0Var6).a();
            }
            mVar2.W0(mVar2.a1() - j8);
            mVar.W0(mVar.a1() + j8);
            j7 -= j8;
        }
    }

    public static /* synthetic */ m P(m mVar, p pVar, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = pVar.c0();
        }
        l0.p(mVar, "$this$commonWrite");
        l0.p(pVar, "byteString");
        pVar.p0(mVar, i7, i8);
        return mVar;
    }

    public static final long Q(@n6.d m mVar, @n6.d o0 o0Var) {
        l0.p(mVar, "$this$commonWriteAll");
        l0.p(o0Var, "source");
        long j7 = 0;
        while (true) {
            long l02 = o0Var.l0(mVar, 8192);
            if (l02 == -1) {
                return j7;
            }
            j7 += l02;
        }
    }

    @n6.d
    public static final m R(@n6.d m mVar, int i7) {
        l0.p(mVar, "$this$commonWriteByte");
        j0 d12 = mVar.d1(1);
        byte[] bArr = d12.f11212a;
        int i8 = d12.f11214c;
        d12.f11214c = i8 + 1;
        bArr[i8] = (byte) i7;
        mVar.W0(mVar.a1() + 1);
        return mVar;
    }

    @n6.d
    public static final m S(@n6.d m mVar, long j7) {
        boolean z6;
        l0.p(mVar, "$this$commonWriteDecimalLong");
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (i7 == 0) {
            return mVar.e0(48);
        }
        int i8 = 1;
        if (i7 < 0) {
            j7 = -j7;
            if (j7 < 0) {
                return mVar.H0("-9223372036854775808");
            }
            z6 = true;
        } else {
            z6 = false;
        }
        if (j7 >= 100000000) {
            i8 = j7 < 1000000000000L ? j7 < x5.f.f18453v ? j7 < 1000000000 ? 9 : 10 : j7 < 100000000000L ? 11 : 12 : j7 < 1000000000000000L ? j7 < 10000000000000L ? 13 : j7 < 100000000000000L ? 14 : 15 : j7 < 100000000000000000L ? j7 < 10000000000000000L ? 16 : 17 : j7 < 1000000000000000000L ? 18 : 19;
        } else if (j7 >= 10000) {
            i8 = j7 < x1.f13167e ? j7 < 100000 ? 5 : 6 : j7 < 10000000 ? 7 : 8;
        } else if (j7 >= 100) {
            i8 = j7 < 1000 ? 3 : 4;
        } else if (j7 >= 10) {
            i8 = 2;
        }
        if (z6) {
            i8++;
        }
        j0 d12 = mVar.d1(i8);
        byte[] bArr = d12.f11212a;
        int i9 = d12.f11214c + i8;
        while (j7 != 0) {
            long j8 = 10;
            i9--;
            bArr[i9] = Z()[(int) (j7 % j8)];
            j7 /= j8;
        }
        if (z6) {
            bArr[i9 - 1] = (byte) 45;
        }
        d12.f11214c += i8;
        mVar.W0(mVar.a1() + i8);
        return mVar;
    }

    @n6.d
    public static final m T(@n6.d m mVar, long j7) {
        l0.p(mVar, "$this$commonWriteHexadecimalUnsignedLong");
        if (j7 == 0) {
            return mVar.e0(48);
        }
        long j8 = (j7 >>> 1) | j7;
        long j9 = j8 | (j8 >>> 2);
        long j10 = j9 | (j9 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i7 = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + 3) / 4);
        j0 d12 = mVar.d1(i7);
        byte[] bArr = d12.f11212a;
        int i8 = d12.f11214c;
        for (int i9 = (i8 + i7) - 1; i9 >= i8; i9--) {
            bArr[i9] = Z()[(int) (15 & j7)];
            j7 >>>= 4;
        }
        d12.f11214c += i7;
        mVar.W0(mVar.a1() + i7);
        return mVar;
    }

    @n6.d
    public static final m U(@n6.d m mVar, int i7) {
        l0.p(mVar, "$this$commonWriteInt");
        j0 d12 = mVar.d1(4);
        byte[] bArr = d12.f11212a;
        int i8 = d12.f11214c;
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i7 >>> 24) & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((i7 >>> 16) & 255);
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((i7 >>> 8) & 255);
        bArr[i11] = (byte) (i7 & 255);
        d12.f11214c = i11 + 1;
        mVar.W0(mVar.a1() + 4);
        return mVar;
    }

    @n6.d
    public static final m V(@n6.d m mVar, long j7) {
        l0.p(mVar, "$this$commonWriteLong");
        j0 d12 = mVar.d1(8);
        byte[] bArr = d12.f11212a;
        int i7 = d12.f11214c;
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j7 >>> 56) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j7 >>> 48) & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((j7 >>> 40) & 255);
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j7 >>> 32) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j7 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j7 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((j7 >>> 8) & 255);
        bArr[i14] = (byte) (j7 & 255);
        d12.f11214c = i14 + 1;
        mVar.W0(mVar.a1() + 8);
        return mVar;
    }

    @n6.d
    public static final m W(@n6.d m mVar, int i7) {
        l0.p(mVar, "$this$commonWriteShort");
        j0 d12 = mVar.d1(2);
        byte[] bArr = d12.f11212a;
        int i8 = d12.f11214c;
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i7 >>> 8) & 255);
        bArr[i9] = (byte) (i7 & 255);
        d12.f11214c = i9 + 1;
        mVar.W0(mVar.a1() + 2);
        return mVar;
    }

    @n6.d
    public static final m X(@n6.d m mVar, @n6.d String str, int i7, int i8) {
        l0.p(mVar, "$this$commonWriteUtf8");
        l0.p(str, v.b.f17140e);
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i7).toString());
        }
        if (!(i8 >= i7)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i8 + " < " + i7).toString());
        }
        if (!(i8 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i8 + " > " + str.length()).toString());
        }
        while (i7 < i8) {
            char charAt = str.charAt(i7);
            if (charAt < 128) {
                j0 d12 = mVar.d1(1);
                byte[] bArr = d12.f11212a;
                int i9 = d12.f11214c - i7;
                int min = Math.min(i8, 8192 - i9);
                int i10 = i7 + 1;
                bArr[i7 + i9] = (byte) charAt;
                while (i10 < min) {
                    char charAt2 = str.charAt(i10);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i10 + i9] = (byte) charAt2;
                    i10++;
                }
                int i11 = d12.f11214c;
                int i12 = (i9 + i10) - i11;
                d12.f11214c = i11 + i12;
                mVar.W0(mVar.a1() + i12);
                i7 = i10;
            } else {
                if (charAt < 2048) {
                    j0 d13 = mVar.d1(2);
                    byte[] bArr2 = d13.f11212a;
                    int i13 = d13.f11214c;
                    bArr2[i13] = (byte) ((charAt >> 6) | 192);
                    bArr2[i13 + 1] = (byte) ((charAt & '?') | 128);
                    d13.f11214c = i13 + 2;
                    mVar.W0(mVar.a1() + 2);
                } else if (charAt < 55296 || charAt > 57343) {
                    j0 d14 = mVar.d1(3);
                    byte[] bArr3 = d14.f11212a;
                    int i14 = d14.f11214c;
                    bArr3[i14] = (byte) ((charAt >> '\f') | 224);
                    bArr3[i14 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                    bArr3[i14 + 2] = (byte) ((charAt & '?') | 128);
                    d14.f11214c = i14 + 3;
                    mVar.W0(mVar.a1() + 3);
                } else {
                    int i15 = i7 + 1;
                    char charAt3 = i15 < i8 ? str.charAt(i15) : (char) 0;
                    if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                        mVar.e0(63);
                        i7 = i15;
                    } else {
                        int i16 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        j0 d15 = mVar.d1(4);
                        byte[] bArr4 = d15.f11212a;
                        int i17 = d15.f11214c;
                        bArr4[i17] = (byte) ((i16 >> 18) | 240);
                        bArr4[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                        bArr4[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                        bArr4[i17 + 3] = (byte) ((i16 & 63) | 128);
                        d15.f11214c = i17 + 4;
                        mVar.W0(mVar.a1() + 4);
                        i7 += 2;
                    }
                }
                i7++;
            }
        }
        return mVar;
    }

    @n6.d
    public static final m Y(@n6.d m mVar, int i7) {
        l0.p(mVar, "$this$commonWriteUtf8CodePoint");
        if (i7 < 128) {
            mVar.e0(i7);
        } else if (i7 < 2048) {
            j0 d12 = mVar.d1(2);
            byte[] bArr = d12.f11212a;
            int i8 = d12.f11214c;
            bArr[i8] = (byte) ((i7 >> 6) | 192);
            bArr[i8 + 1] = (byte) ((i7 & 63) | 128);
            d12.f11214c = i8 + 2;
            mVar.W0(mVar.a1() + 2);
        } else if (55296 <= i7 && 57343 >= i7) {
            mVar.e0(63);
        } else if (i7 < 65536) {
            j0 d13 = mVar.d1(3);
            byte[] bArr2 = d13.f11212a;
            int i9 = d13.f11214c;
            bArr2[i9] = (byte) ((i7 >> 12) | 224);
            bArr2[i9 + 1] = (byte) (((i7 >> 6) & 63) | 128);
            bArr2[i9 + 2] = (byte) ((i7 & 63) | 128);
            d13.f11214c = i9 + 3;
            mVar.W0(mVar.a1() + 3);
        } else if (i7 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + j.n(i7));
        } else {
            j0 d14 = mVar.d1(4);
            byte[] bArr3 = d14.f11212a;
            int i10 = d14.f11214c;
            bArr3[i10] = (byte) ((i7 >> 18) | 240);
            bArr3[i10 + 1] = (byte) (((i7 >> 12) & 63) | 128);
            bArr3[i10 + 2] = (byte) (((i7 >> 6) & 63) | 128);
            bArr3[i10 + 3] = (byte) ((i7 & 63) | 128);
            d14.f11214c = i10 + 4;
            mVar.W0(mVar.a1() + 4);
        }
        return mVar;
    }

    @n6.d
    public static final byte[] Z() {
        return f11425a;
    }

    public static final void a(@n6.d m mVar) {
        l0.p(mVar, "$this$commonClear");
        mVar.skip(mVar.a1());
    }

    public static final boolean a0(@n6.d j0 j0Var, int i7, @n6.d byte[] bArr, int i8, int i9) {
        l0.p(j0Var, "segment");
        l0.p(bArr, "bytes");
        int i10 = j0Var.f11214c;
        byte[] bArr2 = j0Var.f11212a;
        while (i8 < i9) {
            if (i7 == i10) {
                j0Var = j0Var.f11217f;
                l0.m(j0Var);
                byte[] bArr3 = j0Var.f11212a;
                bArr2 = bArr3;
                i7 = j0Var.f11213b;
                i10 = j0Var.f11214c;
            }
            if (bArr2[i7] != bArr[i8]) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    public static final long b(@n6.d m mVar) {
        l0.p(mVar, "$this$commonCompleteSegmentByteCount");
        long a12 = mVar.a1();
        if (a12 == 0) {
            return 0L;
        }
        j0 j0Var = mVar.f11238k;
        l0.m(j0Var);
        j0 j0Var2 = j0Var.f11218g;
        l0.m(j0Var2);
        return (j0Var2.f11214c >= 8192 || !j0Var2.f11216e) ? a12 : a12 - (r2 - j0Var2.f11213b);
    }

    @n6.d
    public static final String b0(@n6.d m mVar, long j7) {
        l0.p(mVar, "$this$readUtf8Line");
        if (j7 > 0) {
            long j8 = j7 - 1;
            if (mVar.Z(j8) == ((byte) 13)) {
                String q6 = mVar.q(j8);
                mVar.skip(2L);
                return q6;
            }
        }
        String q7 = mVar.q(j7);
        mVar.skip(1L);
        return q7;
    }

    @n6.d
    public static final m c(@n6.d m mVar) {
        l0.p(mVar, "$this$commonCopy");
        m mVar2 = new m();
        if (mVar.a1() == 0) {
            return mVar2;
        }
        j0 j0Var = mVar.f11238k;
        l0.m(j0Var);
        j0 d7 = j0Var.d();
        mVar2.f11238k = d7;
        d7.f11218g = d7;
        d7.f11217f = d7;
        for (j0 j0Var2 = j0Var.f11217f; j0Var2 != j0Var; j0Var2 = j0Var2.f11217f) {
            j0 j0Var3 = d7.f11218g;
            l0.m(j0Var3);
            l0.m(j0Var2);
            j0Var3.c(j0Var2.d());
        }
        mVar2.W0(mVar.a1());
        return mVar2;
    }

    public static final <T> T c0(@n6.d m mVar, long j7, @n6.d t4.p<? super j0, ? super Long, ? extends T> pVar) {
        l0.p(mVar, "$this$seek");
        l0.p(pVar, "lambda");
        j0 j0Var = mVar.f11238k;
        if (j0Var == null) {
            return pVar.J(null, -1L);
        }
        if (mVar.a1() - j7 < j7) {
            long a12 = mVar.a1();
            while (a12 > j7) {
                j0Var = j0Var.f11218g;
                l0.m(j0Var);
                a12 -= j0Var.f11214c - j0Var.f11213b;
            }
            return pVar.J(j0Var, Long.valueOf(a12));
        }
        long j8 = 0;
        while (true) {
            long j9 = (j0Var.f11214c - j0Var.f11213b) + j8;
            if (j9 > j7) {
                return pVar.J(j0Var, Long.valueOf(j8));
            }
            j0Var = j0Var.f11217f;
            l0.m(j0Var);
            j8 = j9;
        }
    }

    @n6.d
    public static final m d(@n6.d m mVar, @n6.d m mVar2, long j7, long j8) {
        l0.p(mVar, "$this$commonCopyTo");
        l0.p(mVar2, "out");
        j.e(mVar.a1(), j7, j8);
        if (j8 == 0) {
            return mVar;
        }
        mVar2.W0(mVar2.a1() + j8);
        j0 j0Var = mVar.f11238k;
        while (true) {
            l0.m(j0Var);
            int i7 = j0Var.f11214c;
            int i8 = j0Var.f11213b;
            if (j7 < i7 - i8) {
                break;
            }
            j7 -= i7 - i8;
            j0Var = j0Var.f11217f;
        }
        while (j8 > 0) {
            l0.m(j0Var);
            j0 d7 = j0Var.d();
            int i9 = d7.f11213b + ((int) j7);
            d7.f11213b = i9;
            d7.f11214c = Math.min(i9 + ((int) j8), d7.f11214c);
            j0 j0Var2 = mVar2.f11238k;
            if (j0Var2 == null) {
                d7.f11218g = d7;
                d7.f11217f = d7;
                mVar2.f11238k = d7;
            } else {
                l0.m(j0Var2);
                j0 j0Var3 = j0Var2.f11218g;
                l0.m(j0Var3);
                j0Var3.c(d7);
            }
            j8 -= d7.f11214c - d7.f11213b;
            j0Var = j0Var.f11217f;
            j7 = 0;
        }
        return mVar;
    }

    public static final int d0(@n6.d m mVar, @n6.d d0 d0Var, boolean z6) {
        int i7;
        int i8;
        int i9;
        int i10;
        j0 j0Var;
        l0.p(mVar, "$this$selectPrefix");
        l0.p(d0Var, "options");
        j0 j0Var2 = mVar.f11238k;
        if (j0Var2 == null) {
            return z6 ? -2 : -1;
        }
        byte[] bArr = j0Var2.f11212a;
        int i11 = j0Var2.f11213b;
        int i12 = j0Var2.f11214c;
        int[] g7 = d0Var.g();
        j0 j0Var3 = j0Var2;
        int i13 = -1;
        int i14 = 0;
        loop0: while (true) {
            int i15 = i14 + 1;
            int i16 = g7[i14];
            int i17 = i15 + 1;
            int i18 = g7[i15];
            if (i18 != -1) {
                i13 = i18;
            }
            if (j0Var3 == null) {
                break;
            }
            if (i16 >= 0) {
                i7 = i11 + 1;
                int i19 = bArr[i11] & t1.f17828n;
                int i20 = i17 + i16;
                while (i17 != i20) {
                    if (i19 == g7[i17]) {
                        i8 = g7[i17 + i16];
                        if (i7 == i12) {
                            j0Var3 = j0Var3.f11217f;
                            l0.m(j0Var3);
                            i7 = j0Var3.f11213b;
                            bArr = j0Var3.f11212a;
                            i12 = j0Var3.f11214c;
                            if (j0Var3 == j0Var2) {
                                j0Var3 = null;
                            }
                        }
                    } else {
                        i17++;
                    }
                }
                return i13;
            }
            int i21 = i17 + (i16 * (-1));
            while (true) {
                int i22 = i11 + 1;
                int i23 = i17 + 1;
                if ((bArr[i11] & t1.f17828n) != g7[i17]) {
                    return i13;
                }
                boolean z7 = i23 == i21;
                if (i22 == i12) {
                    l0.m(j0Var3);
                    j0 j0Var4 = j0Var3.f11217f;
                    l0.m(j0Var4);
                    i10 = j0Var4.f11213b;
                    byte[] bArr2 = j0Var4.f11212a;
                    i9 = j0Var4.f11214c;
                    if (j0Var4 != j0Var2) {
                        j0Var = j0Var4;
                        bArr = bArr2;
                    } else if (!z7) {
                        break loop0;
                    } else {
                        bArr = bArr2;
                        j0Var = null;
                    }
                } else {
                    j0 j0Var5 = j0Var3;
                    i9 = i12;
                    i10 = i22;
                    j0Var = j0Var5;
                }
                if (z7) {
                    i8 = g7[i23];
                    i7 = i10;
                    i12 = i9;
                    j0Var3 = j0Var;
                    break;
                }
                i11 = i10;
                i12 = i9;
                i17 = i23;
                j0Var3 = j0Var;
            }
            if (i8 >= 0) {
                return i8;
            }
            i14 = -i8;
            i11 = i7;
        }
        if (z6) {
            return -2;
        }
        return i13;
    }

    public static final boolean e(@n6.d m mVar, @n6.e Object obj) {
        l0.p(mVar, "$this$commonEquals");
        if (mVar == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar2 = (m) obj;
            if (mVar.a1() != mVar2.a1()) {
                return false;
            }
            if (mVar.a1() == 0) {
                return true;
            }
            j0 j0Var = mVar.f11238k;
            l0.m(j0Var);
            j0 j0Var2 = mVar2.f11238k;
            l0.m(j0Var2);
            int i7 = j0Var.f11213b;
            int i8 = j0Var2.f11213b;
            long j7 = 0;
            while (j7 < mVar.a1()) {
                long min = Math.min(j0Var.f11214c - i7, j0Var2.f11214c - i8);
                long j8 = 0;
                while (j8 < min) {
                    int i9 = i7 + 1;
                    int i10 = i8 + 1;
                    if (j0Var.f11212a[i7] != j0Var2.f11212a[i8]) {
                        return false;
                    }
                    j8++;
                    i7 = i9;
                    i8 = i10;
                }
                if (i7 == j0Var.f11214c) {
                    j0Var = j0Var.f11217f;
                    l0.m(j0Var);
                    i7 = j0Var.f11213b;
                }
                if (i8 == j0Var2.f11214c) {
                    j0Var2 = j0Var2.f11217f;
                    l0.m(j0Var2);
                    i8 = j0Var2.f11213b;
                }
                j7 += min;
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ int e0(m mVar, d0 d0Var, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return d0(mVar, d0Var, z6);
    }

    public static final byte f(@n6.d m mVar, long j7) {
        l0.p(mVar, "$this$commonGet");
        j.e(mVar.a1(), j7, 1L);
        j0 j0Var = mVar.f11238k;
        if (j0Var == null) {
            l0.m(null);
            throw null;
        } else if (mVar.a1() - j7 < j7) {
            long a12 = mVar.a1();
            while (a12 > j7) {
                j0Var = j0Var.f11218g;
                l0.m(j0Var);
                a12 -= j0Var.f11214c - j0Var.f11213b;
            }
            l0.m(j0Var);
            return j0Var.f11212a[(int) ((j0Var.f11213b + j7) - a12)];
        } else {
            long j8 = 0;
            while (true) {
                long j9 = (j0Var.f11214c - j0Var.f11213b) + j8;
                if (j9 > j7) {
                    l0.m(j0Var);
                    return j0Var.f11212a[(int) ((j0Var.f11213b + j7) - j8)];
                }
                j0Var = j0Var.f11217f;
                l0.m(j0Var);
                j8 = j9;
            }
        }
    }

    public static final int g(@n6.d m mVar) {
        l0.p(mVar, "$this$commonHashCode");
        j0 j0Var = mVar.f11238k;
        if (j0Var != null) {
            int i7 = 1;
            do {
                int i8 = j0Var.f11214c;
                for (int i9 = j0Var.f11213b; i9 < i8; i9++) {
                    i7 = (i7 * 31) + j0Var.f11212a[i9];
                }
                j0Var = j0Var.f11217f;
                l0.m(j0Var);
            } while (j0Var != mVar.f11238k);
            return i7;
        }
        return 0;
    }

    public static final long h(@n6.d m mVar, byte b7, long j7, long j8) {
        j0 j0Var;
        int i7;
        l0.p(mVar, "$this$commonIndexOf");
        long j9 = 0;
        if (!(0 <= j7 && j8 >= j7)) {
            throw new IllegalArgumentException(("size=" + mVar.a1() + " fromIndex=" + j7 + " toIndex=" + j8).toString());
        }
        if (j8 > mVar.a1()) {
            j8 = mVar.a1();
        }
        if (j7 == j8 || (j0Var = mVar.f11238k) == null) {
            return -1L;
        }
        if (mVar.a1() - j7 < j7) {
            j9 = mVar.a1();
            while (j9 > j7) {
                j0Var = j0Var.f11218g;
                l0.m(j0Var);
                j9 -= j0Var.f11214c - j0Var.f11213b;
            }
            while (j9 < j8) {
                byte[] bArr = j0Var.f11212a;
                int min = (int) Math.min(j0Var.f11214c, (j0Var.f11213b + j8) - j9);
                i7 = (int) ((j0Var.f11213b + j7) - j9);
                while (i7 < min) {
                    if (bArr[i7] != b7) {
                        i7++;
                    }
                }
                j9 += j0Var.f11214c - j0Var.f11213b;
                j0Var = j0Var.f11217f;
                l0.m(j0Var);
                j7 = j9;
            }
            return -1L;
        }
        while (true) {
            long j10 = (j0Var.f11214c - j0Var.f11213b) + j9;
            if (j10 > j7) {
                break;
            }
            j0Var = j0Var.f11217f;
            l0.m(j0Var);
            j9 = j10;
        }
        while (j9 < j8) {
            byte[] bArr2 = j0Var.f11212a;
            int min2 = (int) Math.min(j0Var.f11214c, (j0Var.f11213b + j8) - j9);
            i7 = (int) ((j0Var.f11213b + j7) - j9);
            while (i7 < min2) {
                if (bArr2[i7] != b7) {
                    i7++;
                }
            }
            j9 += j0Var.f11214c - j0Var.f11213b;
            j0Var = j0Var.f11217f;
            l0.m(j0Var);
            j7 = j9;
        }
        return -1L;
        return (i7 - j0Var.f11213b) + j9;
    }

    public static final long i(@n6.d m mVar, @n6.d p pVar, long j7) {
        long j8 = j7;
        l0.p(mVar, "$this$commonIndexOf");
        l0.p(pVar, "bytes");
        boolean z6 = true;
        if (pVar.c0() > 0) {
            long j9 = 0;
            if (!(j8 >= 0)) {
                throw new IllegalArgumentException(("fromIndex < 0: " + j8).toString());
            }
            j0 j0Var = mVar.f11238k;
            if (j0Var != null) {
                if (mVar.a1() - j8 < j8) {
                    long a12 = mVar.a1();
                    while (a12 > j8) {
                        j0Var = j0Var.f11218g;
                        l0.m(j0Var);
                        a12 -= j0Var.f11214c - j0Var.f11213b;
                    }
                    byte[] H = pVar.H();
                    byte b7 = H[0];
                    int c02 = pVar.c0();
                    long a13 = (mVar.a1() - c02) + 1;
                    while (a12 < a13) {
                        byte[] bArr = j0Var.f11212a;
                        int min = (int) Math.min(j0Var.f11214c, (j0Var.f11213b + a13) - a12);
                        for (int i7 = (int) ((j0Var.f11213b + j8) - a12); i7 < min; i7++) {
                            if (bArr[i7] == b7 && a0(j0Var, i7 + 1, H, 1, c02)) {
                                return (i7 - j0Var.f11213b) + a12;
                            }
                        }
                        a12 += j0Var.f11214c - j0Var.f11213b;
                        j0Var = j0Var.f11217f;
                        l0.m(j0Var);
                        j8 = a12;
                    }
                    return -1L;
                }
                while (true) {
                    long j10 = (j0Var.f11214c - j0Var.f11213b) + j9;
                    if (j10 > j8) {
                        break;
                    }
                    j0Var = j0Var.f11217f;
                    l0.m(j0Var);
                    j9 = j10;
                    z6 = z6;
                }
                byte[] H2 = pVar.H();
                byte b8 = H2[0];
                int c03 = pVar.c0();
                long a14 = (mVar.a1() - c03) + 1;
                while (j9 < a14) {
                    byte[] bArr2 = j0Var.f11212a;
                    long j11 = j9;
                    int min2 = (int) Math.min(j0Var.f11214c, (j0Var.f11213b + a14) - j9);
                    for (int i8 = (int) ((j0Var.f11213b + j8) - j11); i8 < min2; i8++) {
                        if (bArr2[i8] == b8 && a0(j0Var, i8 + 1, H2, 1, c03)) {
                            return (i8 - j0Var.f11213b) + j11;
                        }
                    }
                    j9 = j11 + (j0Var.f11214c - j0Var.f11213b);
                    j0Var = j0Var.f11217f;
                    l0.m(j0Var);
                    j8 = j9;
                }
                return -1L;
            }
            return -1L;
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public static final long j(@n6.d m mVar, @n6.d p pVar, long j7) {
        int i7;
        int i8;
        l0.p(mVar, "$this$commonIndexOfElement");
        l0.p(pVar, "targetBytes");
        long j8 = 0;
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j7).toString());
        }
        j0 j0Var = mVar.f11238k;
        if (j0Var != null) {
            if (mVar.a1() - j7 < j7) {
                j8 = mVar.a1();
                while (j8 > j7) {
                    j0Var = j0Var.f11218g;
                    l0.m(j0Var);
                    j8 -= j0Var.f11214c - j0Var.f11213b;
                }
                if (pVar.c0() == 2) {
                    byte r6 = pVar.r(0);
                    byte r7 = pVar.r(1);
                    while (j8 < mVar.a1()) {
                        byte[] bArr = j0Var.f11212a;
                        i7 = (int) ((j0Var.f11213b + j7) - j8);
                        int i9 = j0Var.f11214c;
                        while (i7 < i9) {
                            byte b7 = bArr[i7];
                            if (b7 != r6 && b7 != r7) {
                                i7++;
                            }
                            i8 = j0Var.f11213b;
                        }
                        j8 += j0Var.f11214c - j0Var.f11213b;
                        j0Var = j0Var.f11217f;
                        l0.m(j0Var);
                        j7 = j8;
                    }
                } else {
                    byte[] H = pVar.H();
                    while (j8 < mVar.a1()) {
                        byte[] bArr2 = j0Var.f11212a;
                        i7 = (int) ((j0Var.f11213b + j7) - j8);
                        int i10 = j0Var.f11214c;
                        while (i7 < i10) {
                            byte b8 = bArr2[i7];
                            for (byte b9 : H) {
                                if (b8 == b9) {
                                    i8 = j0Var.f11213b;
                                }
                            }
                            i7++;
                        }
                        j8 += j0Var.f11214c - j0Var.f11213b;
                        j0Var = j0Var.f11217f;
                        l0.m(j0Var);
                        j7 = j8;
                    }
                }
                return -1L;
            }
            while (true) {
                long j9 = (j0Var.f11214c - j0Var.f11213b) + j8;
                if (j9 > j7) {
                    break;
                }
                j0Var = j0Var.f11217f;
                l0.m(j0Var);
                j8 = j9;
            }
            if (pVar.c0() == 2) {
                byte r8 = pVar.r(0);
                byte r9 = pVar.r(1);
                while (j8 < mVar.a1()) {
                    byte[] bArr3 = j0Var.f11212a;
                    i7 = (int) ((j0Var.f11213b + j7) - j8);
                    int i11 = j0Var.f11214c;
                    while (i7 < i11) {
                        byte b10 = bArr3[i7];
                        if (b10 != r8 && b10 != r9) {
                            i7++;
                        }
                        i8 = j0Var.f11213b;
                    }
                    j8 += j0Var.f11214c - j0Var.f11213b;
                    j0Var = j0Var.f11217f;
                    l0.m(j0Var);
                    j7 = j8;
                }
            } else {
                byte[] H2 = pVar.H();
                while (j8 < mVar.a1()) {
                    byte[] bArr4 = j0Var.f11212a;
                    i7 = (int) ((j0Var.f11213b + j7) - j8);
                    int i12 = j0Var.f11214c;
                    while (i7 < i12) {
                        byte b11 = bArr4[i7];
                        for (byte b12 : H2) {
                            if (b11 == b12) {
                                i8 = j0Var.f11213b;
                            }
                        }
                        i7++;
                    }
                    j8 += j0Var.f11214c - j0Var.f11213b;
                    j0Var = j0Var.f11217f;
                    l0.m(j0Var);
                    j7 = j8;
                }
            }
            return -1L;
            return (i7 - i8) + j8;
        }
        return -1L;
    }

    public static final boolean k(@n6.d m mVar, long j7, @n6.d p pVar, int i7, int i8) {
        l0.p(mVar, "$this$commonRangeEquals");
        l0.p(pVar, "bytes");
        if (j7 < 0 || i7 < 0 || i8 < 0 || mVar.a1() - j7 < i8 || pVar.c0() - i7 < i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (mVar.Z(i9 + j7) != pVar.r(i7 + i9)) {
                return false;
            }
        }
        return true;
    }

    public static final int l(@n6.d m mVar, @n6.d byte[] bArr) {
        l0.p(mVar, "$this$commonRead");
        l0.p(bArr, "sink");
        return mVar.read(bArr, 0, bArr.length);
    }

    public static final int m(@n6.d m mVar, @n6.d byte[] bArr, int i7, int i8) {
        l0.p(mVar, "$this$commonRead");
        l0.p(bArr, "sink");
        j.e(bArr.length, i7, i8);
        j0 j0Var = mVar.f11238k;
        if (j0Var != null) {
            int min = Math.min(i8, j0Var.f11214c - j0Var.f11213b);
            byte[] bArr2 = j0Var.f11212a;
            int i9 = j0Var.f11213b;
            x3.o.W0(bArr2, bArr, i7, i9, i9 + min);
            j0Var.f11213b += min;
            mVar.W0(mVar.a1() - min);
            if (j0Var.f11213b == j0Var.f11214c) {
                mVar.f11238k = j0Var.b();
                k0.d(j0Var);
            }
            return min;
        }
        return -1;
    }

    public static final long n(@n6.d m mVar, @n6.d m mVar2, long j7) {
        l0.p(mVar, "$this$commonRead");
        l0.p(mVar2, "sink");
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        } else if (mVar.a1() == 0) {
            return -1L;
        } else {
            if (j7 > mVar.a1()) {
                j7 = mVar.a1();
            }
            mVar2.w(mVar, j7);
            return j7;
        }
    }

    public static final long o(@n6.d m mVar, @n6.d m0 m0Var) {
        l0.p(mVar, "$this$commonReadAll");
        l0.p(m0Var, "sink");
        long a12 = mVar.a1();
        if (a12 > 0) {
            m0Var.w(mVar, a12);
        }
        return a12;
    }

    public static final byte p(@n6.d m mVar) {
        l0.p(mVar, "$this$commonReadByte");
        if (mVar.a1() != 0) {
            j0 j0Var = mVar.f11238k;
            l0.m(j0Var);
            int i7 = j0Var.f11213b;
            int i8 = j0Var.f11214c;
            int i9 = i7 + 1;
            byte b7 = j0Var.f11212a[i7];
            mVar.W0(mVar.a1() - 1);
            if (i9 == i8) {
                mVar.f11238k = j0Var.b();
                k0.d(j0Var);
            } else {
                j0Var.f11213b = i9;
            }
            return b7;
        }
        throw new EOFException();
    }

    @n6.d
    public static final byte[] q(@n6.d m mVar) {
        l0.p(mVar, "$this$commonReadByteArray");
        return mVar.h0(mVar.a1());
    }

    @n6.d
    public static final byte[] r(@n6.d m mVar, long j7) {
        l0.p(mVar, "$this$commonReadByteArray");
        if (!(j7 >= 0 && j7 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        } else if (mVar.a1() >= j7) {
            byte[] bArr = new byte[(int) j7];
            mVar.readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    @n6.d
    public static final p s(@n6.d m mVar) {
        l0.p(mVar, "$this$commonReadByteString");
        return mVar.z(mVar.a1());
    }

    @n6.d
    public static final p t(@n6.d m mVar, long j7) {
        l0.p(mVar, "$this$commonReadByteString");
        if (!(j7 >= 0 && j7 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        } else if (mVar.a1() >= j7) {
            if (j7 >= 4096) {
                p c12 = mVar.c1((int) j7);
                mVar.skip(j7);
                return c12;
            }
            return new p(mVar.h0(j7));
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00b8 A[EDGE_INSN: B:103:0x00b8->B:95:0x00b8 BREAK  A[LOOP:0: B:62:0x0016->B:107:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long u(@n6.d i6.m r15) {
        /*
            java.lang.String r0 = "$this$commonReadDecimalLong"
            u4.l0.p(r15, r0)
            long r0 = r15.a1()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lc6
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        L16:
            i6.j0 r7 = r15.f11238k
            u4.l0.m(r7)
            byte[] r8 = r7.f11212a
            int r9 = r7.f11213b
            int r10 = r7.f11214c
        L21:
            if (r9 >= r10) goto La4
            r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L74
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L74
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L47
            if (r13 != 0) goto L41
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L41
            goto L47
        L41:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L80
        L47:
            i6.m r15 = new i6.m
            r15.<init>()
            i6.m r15 = r15.J0(r3)
            i6.m r15 = r15.e0(r11)
            if (r1 != 0) goto L59
            r15.readByte()
        L59:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r15 = r15.j0()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L74:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L85
            if (r0 != 0) goto L85
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L80:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L21
        L85:
            if (r0 == 0) goto L89
            r2 = r13
            goto La4
        L89:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was 0x"
            r0.append(r1)
            java.lang.String r1 = i6.j.m(r11)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        La4:
            if (r9 != r10) goto Lb0
            i6.j0 r8 = r7.b()
            r15.f11238k = r8
            i6.k0.d(r7)
            goto Lb2
        Lb0:
            r7.f11213b = r9
        Lb2:
            if (r2 != 0) goto Lb8
            i6.j0 r7 = r15.f11238k
            if (r7 != 0) goto L16
        Lb8:
            long r5 = r15.a1()
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.W0(r5)
            if (r1 == 0) goto Lc4
            goto Lc5
        Lc4:
            long r3 = -r3
        Lc5:
            return r3
        Lc6:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.a.u(i6.m):long");
    }

    public static final void v(@n6.d m mVar, @n6.d m mVar2, long j7) {
        l0.p(mVar, "$this$commonReadFully");
        l0.p(mVar2, "sink");
        if (mVar.a1() >= j7) {
            mVar2.w(mVar, j7);
        } else {
            mVar2.w(mVar, mVar.a1());
            throw new EOFException();
        }
    }

    public static final void w(@n6.d m mVar, @n6.d byte[] bArr) {
        l0.p(mVar, "$this$commonReadFully");
        l0.p(bArr, "sink");
        int i7 = 0;
        while (i7 < bArr.length) {
            int read = mVar.read(bArr, i7, bArr.length - i7);
            if (read == -1) {
                throw new EOFException();
            }
            i7 += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b3 A[EDGE_INSN: B:92:0x00b3->B:86:0x00b3 BREAK  A[LOOP:0: B:54:0x0012->B:94:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long x(@n6.d i6.m r14) {
        /*
            java.lang.String r0 = "$this$commonReadHexadecimalUnsignedLong"
            u4.l0.p(r14, r0)
            long r0 = r14.a1()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lbd
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            i6.j0 r6 = r14.f11238k
            u4.l0.m(r6)
            byte[] r7 = r6.f11212a
            int r8 = r6.f11213b
            int r9 = r6.f11214c
        L1d:
            if (r8 >= r9) goto L9f
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L2e
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L2e
            int r11 = r10 - r11
            goto L48
        L2e:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L3d
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L3d
        L38:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L48
        L3d:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L80
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L80
            goto L38
        L48:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L58
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L58:
            i6.m r14 = new i6.m
            r14.<init>()
            i6.m r14 = r14.v(r4)
            i6.m r14 = r14.e0(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r14 = r14.j0()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L80:
            if (r0 == 0) goto L84
            r1 = 1
            goto L9f
        L84:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = i6.j.m(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L9f:
            if (r8 != r9) goto Lab
            i6.j0 r7 = r6.b()
            r14.f11238k = r7
            i6.k0.d(r6)
            goto Lad
        Lab:
            r6.f11213b = r8
        Lad:
            if (r1 != 0) goto Lb3
            i6.j0 r6 = r14.f11238k
            if (r6 != 0) goto L12
        Lb3:
            long r1 = r14.a1()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.W0(r1)
            return r4
        Lbd:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.a.x(i6.m):long");
    }

    public static final int y(@n6.d m mVar) {
        l0.p(mVar, "$this$commonReadInt");
        if (mVar.a1() >= 4) {
            j0 j0Var = mVar.f11238k;
            l0.m(j0Var);
            int i7 = j0Var.f11213b;
            int i8 = j0Var.f11214c;
            if (i8 - i7 < 4) {
                return (mVar.readByte() & t1.f17828n) | ((mVar.readByte() & t1.f17828n) << 24) | ((mVar.readByte() & t1.f17828n) << 16) | ((mVar.readByte() & t1.f17828n) << 8);
            }
            byte[] bArr = j0Var.f11212a;
            int i9 = i7 + 1;
            int i10 = i9 + 1;
            int i11 = ((bArr[i7] & t1.f17828n) << 24) | ((bArr[i9] & t1.f17828n) << 16);
            int i12 = i10 + 1;
            int i13 = i11 | ((bArr[i10] & t1.f17828n) << 8);
            int i14 = i12 + 1;
            int i15 = i13 | (bArr[i12] & t1.f17828n);
            mVar.W0(mVar.a1() - 4);
            if (i14 == i8) {
                mVar.f11238k = j0Var.b();
                k0.d(j0Var);
            } else {
                j0Var.f11213b = i14;
            }
            return i15;
        }
        throw new EOFException();
    }

    public static final long z(@n6.d m mVar) {
        l0.p(mVar, "$this$commonReadLong");
        if (mVar.a1() >= 8) {
            j0 j0Var = mVar.f11238k;
            l0.m(j0Var);
            int i7 = j0Var.f11213b;
            int i8 = j0Var.f11214c;
            if (i8 - i7 < 8) {
                return ((mVar.readInt() & 4294967295L) << 32) | (4294967295L & mVar.readInt());
            }
            byte[] bArr = j0Var.f11212a;
            long j7 = (bArr[i7] & 255) << 56;
            int i9 = i7 + 1 + 1 + 1;
            long j8 = j7 | ((bArr[r7] & 255) << 48) | ((bArr[r1] & 255) << 40);
            long j9 = j8 | ((bArr[i9] & 255) << 32) | ((bArr[r1] & 255) << 24);
            long j10 = j9 | ((bArr[r8] & 255) << 16);
            long j11 = j10 | ((bArr[r1] & 255) << 8);
            int i10 = i9 + 1 + 1 + 1 + 1 + 1;
            long j12 = j11 | (bArr[r8] & 255);
            mVar.W0(mVar.a1() - 8);
            if (i10 == i8) {
                mVar.f11238k = j0Var.b();
                k0.d(j0Var);
            } else {
                j0Var.f11213b = i10;
            }
            return j12;
        }
        throw new EOFException();
    }
}
