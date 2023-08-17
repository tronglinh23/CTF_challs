package i6;

import i0.x2;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class l0 extends p {
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public final transient byte[][] f11236q;
    @n6.d

    /* renamed from: r  reason: collision with root package name */
    public final transient int[] f11237r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@n6.d byte[][] bArr, @n6.d int[] iArr) {
        super(p.f11251o.s());
        u4.l0.p(bArr, "segments");
        u4.l0.p(iArr, "directory");
        this.f11236q = bArr;
        this.f11237r = iArr;
    }

    @Override // i6.p
    public int E(@n6.d byte[] bArr, int i7) {
        u4.l0.p(bArr, "other");
        return t0().E(bArr, i7);
    }

    @Override // i6.p
    @n6.d
    public byte[] H() {
        return m0();
    }

    @Override // i6.p
    public byte I(int i7) {
        j.e(r0()[s0().length - 1], i7, 1L);
        int n7 = j6.e.n(this, i7);
        return s0()[n7][(i7 - (n7 == 0 ? 0 : r0()[n7 - 1])) + r0()[s0().length + n7]];
    }

    @Override // i6.p
    public int M(@n6.d byte[] bArr, int i7) {
        u4.l0.p(bArr, "other");
        return t0().M(bArr, i7);
    }

    @Override // i6.p
    public boolean T(int i7, @n6.d p pVar, int i8, int i9) {
        u4.l0.p(pVar, "other");
        if (i7 < 0 || i7 > c0() - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int n7 = j6.e.n(this, i7);
        while (i7 < i10) {
            int i11 = n7 == 0 ? 0 : r0()[n7 - 1];
            int i12 = r0()[n7] - i11;
            int i13 = r0()[s0().length + n7];
            int min = Math.min(i10, i12 + i11) - i7;
            if (!pVar.U(i8, s0()[n7], i13 + (i7 - i11), min)) {
                return false;
            }
            i8 += min;
            i7 += min;
            n7++;
        }
        return true;
    }

    @Override // i6.p
    public boolean U(int i7, @n6.d byte[] bArr, int i8, int i9) {
        u4.l0.p(bArr, "other");
        if (i7 < 0 || i7 > c0() - i9 || i8 < 0 || i8 > bArr.length - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int n7 = j6.e.n(this, i7);
        while (i7 < i10) {
            int i11 = n7 == 0 ? 0 : r0()[n7 - 1];
            int i12 = r0()[n7] - i11;
            int i13 = r0()[s0().length + n7];
            int min = Math.min(i10, i12 + i11) - i7;
            if (!j.d(s0()[n7], i13 + (i7 - i11), bArr, i8, min)) {
                return false;
            }
            i8 += min;
            i7 += min;
            n7++;
        }
        return true;
    }

    @Override // i6.p
    @n6.d
    public ByteBuffer e() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(m0()).asReadOnlyBuffer();
        u4.l0.o(asReadOnlyBuffer, "ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    @Override // i6.p
    public boolean equals(@n6.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (pVar.c0() == c0() && T(0, pVar, 0, c0())) {
                return true;
            }
        }
        return false;
    }

    @Override // i6.p
    @n6.d
    public String f0(@n6.d Charset charset) {
        u4.l0.p(charset, "charset");
        return t0().f0(charset);
    }

    @Override // i6.p
    @n6.d
    public String h() {
        return t0().h();
    }

    @Override // i6.p
    public int hashCode() {
        int t6 = t();
        if (t6 != 0) {
            return t6;
        }
        int length = s0().length;
        int i7 = 0;
        int i8 = 1;
        int i9 = 0;
        while (i7 < length) {
            int i10 = r0()[length + i7];
            int i11 = r0()[i7];
            byte[] bArr = s0()[i7];
            int i12 = (i11 - i9) + i10;
            while (i10 < i12) {
                i8 = (i8 * 31) + bArr[i10];
                i10++;
            }
            i7++;
            i9 = i11;
        }
        X(i8);
        return i8;
    }

    @Override // i6.p
    @n6.d
    public String i() {
        return t0().i();
    }

    @Override // i6.p
    @n6.d
    public p i0(int i7, int i8) {
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i7 + " < 0").toString());
        }
        if (!(i8 <= c0())) {
            throw new IllegalArgumentException(("endIndex=" + i8 + " > length(" + c0() + ')').toString());
        }
        int i9 = i8 - i7;
        if (!(i9 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + i8 + " < beginIndex=" + i7).toString());
        } else if (i7 == 0 && i8 == c0()) {
            return this;
        } else {
            if (i7 == i8) {
                return p.f11251o;
            }
            int n7 = j6.e.n(this, i7);
            int n8 = j6.e.n(this, i8 - 1);
            byte[][] bArr = (byte[][]) x3.o.M1(s0(), n7, n8 + 1);
            int[] iArr = new int[bArr.length * 2];
            if (n7 <= n8) {
                int i10 = 0;
                int i11 = n7;
                while (true) {
                    iArr[i10] = Math.min(r0()[i11] - i7, i9);
                    int i12 = i10 + 1;
                    iArr[i10 + bArr.length] = r0()[s0().length + i11];
                    if (i11 == n8) {
                        break;
                    }
                    i11++;
                    i10 = i12;
                }
            }
            int i13 = n7 != 0 ? r0()[n7 - 1] : 0;
            int length = bArr.length;
            iArr[length] = iArr[length] + (i7 - i13);
            return new l0(bArr, iArr);
        }
    }

    @Override // i6.p
    @n6.d
    public p k0() {
        return t0().k0();
    }

    @Override // i6.p
    @n6.d
    public p l0() {
        return t0().l0();
    }

    @Override // i6.p
    @n6.d
    public p m(@n6.d String str) {
        u4.l0.p(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = s0().length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = r0()[length + i7];
            int i10 = r0()[i7];
            messageDigest.update(s0()[i7], i9, i10 - i8);
            i7++;
            i8 = i10;
        }
        byte[] digest = messageDigest.digest();
        u4.l0.o(digest, "digest.digest()");
        return new p(digest);
    }

    @Override // i6.p
    @n6.d
    public byte[] m0() {
        byte[] bArr = new byte[c0()];
        int length = s0().length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < length) {
            int i10 = r0()[length + i7];
            int i11 = r0()[i7];
            int i12 = i11 - i8;
            x3.o.W0(s0()[i7], bArr, i9, i10, i10 + i12);
            i9 += i12;
            i7++;
            i8 = i11;
        }
        return bArr;
    }

    @Override // i6.p
    public void o0(@n6.d OutputStream outputStream) throws IOException {
        u4.l0.p(outputStream, "out");
        int length = s0().length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = r0()[length + i7];
            int i10 = r0()[i7];
            outputStream.write(s0()[i7], i9, i10 - i8);
            i7++;
            i8 = i10;
        }
    }

    @Override // i6.p
    public void p0(@n6.d m mVar, int i7, int i8) {
        u4.l0.p(mVar, "buffer");
        int i9 = i8 + i7;
        int n7 = j6.e.n(this, i7);
        while (i7 < i9) {
            int i10 = n7 == 0 ? 0 : r0()[n7 - 1];
            int i11 = r0()[n7] - i10;
            int i12 = r0()[s0().length + n7];
            int min = Math.min(i9, i11 + i10) - i7;
            int i13 = i12 + (i7 - i10);
            j0 j0Var = new j0(s0()[n7], i13, i13 + min, true, false);
            j0 j0Var2 = mVar.f11238k;
            if (j0Var2 == null) {
                j0Var.f11218g = j0Var;
                j0Var.f11217f = j0Var;
                mVar.f11238k = j0Var;
            } else {
                u4.l0.m(j0Var2);
                j0 j0Var3 = j0Var2.f11218g;
                u4.l0.m(j0Var3);
                j0Var3.c(j0Var);
            }
            i7 += min;
            n7++;
        }
        mVar.W0(mVar.a1() + c0());
    }

    @n6.d
    public final int[] r0() {
        return this.f11237r;
    }

    @n6.d
    public final byte[][] s0() {
        return this.f11236q;
    }

    public final p t0() {
        return new p(m0());
    }

    @Override // i6.p
    @n6.d
    public String toString() {
        return t0().toString();
    }

    @Override // i6.p
    public int u() {
        return r0()[s0().length - 1];
    }

    public final Object u0() {
        p t02 = t0();
        if (t02 != null) {
            return t02;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
    }

    @Override // i6.p
    @n6.d
    public String w() {
        return t0().w();
    }

    @Override // i6.p
    @n6.d
    public p x(@n6.d String str, @n6.d p pVar) {
        u4.l0.p(str, "algorithm");
        u4.l0.p(pVar, x2.f10960j);
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(pVar.m0(), str));
            int length = s0().length;
            int i7 = 0;
            int i8 = 0;
            while (i7 < length) {
                int i9 = r0()[length + i7];
                int i10 = r0()[i7];
                mac.update(s0()[i7], i9, i10 - i8);
                i7++;
                i8 = i10;
            }
            byte[] doFinal = mac.doFinal();
            u4.l0.o(doFinal, "mac.doFinal()");
            return new p(doFinal);
        } catch (InvalidKeyException e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
