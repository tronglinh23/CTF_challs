package v1;

import java.util.Arrays;
import v3.t1;

/* loaded from: classes.dex */
public class a implements r {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f17632a;

    /* renamed from: b  reason: collision with root package name */
    public int f17633b;

    public a() {
        this(10);
    }

    @Override // v1.q
    public String A(int i7, int i8) {
        return a0.g(this.f17632a, i7, i8);
    }

    @Override // v1.r, v1.q
    public int a() {
        return this.f17633b;
    }

    @Override // v1.r
    public void b(int i7, short s6) {
        f(i7 + 2);
        byte[] bArr = this.f17632a;
        bArr[i7] = (byte) (s6 & 255);
        bArr[i7 + 1] = (byte) ((s6 >> 8) & 255);
    }

    @Override // v1.r
    public void c(int i7, byte[] bArr, int i8, int i9) {
        f((i9 - i8) + i7);
        System.arraycopy(bArr, i8, this.f17632a, i7, i9);
    }

    @Override // v1.r
    public void d(int i7, double d7) {
        f(i7 + 8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d7);
        int i8 = (int) doubleToRawLongBits;
        byte[] bArr = this.f17632a;
        int i9 = i7 + 1;
        bArr[i7] = (byte) (i8 & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((i8 >> 8) & 255);
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((i8 >> 16) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i8 >> 24) & 255);
        int i13 = (int) (doubleToRawLongBits >> 32);
        int i14 = i12 + 1;
        bArr[i12] = (byte) (i13 & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((i13 >> 8) & 255);
        bArr[i15] = (byte) ((i13 >> 16) & 255);
        bArr[i15 + 1] = (byte) ((i13 >> 24) & 255);
    }

    @Override // v1.r
    public void e(boolean z6) {
        n(this.f17633b, z6);
        this.f17633b++;
    }

    @Override // v1.r
    public boolean f(int i7) {
        byte[] bArr = this.f17632a;
        if (bArr.length > i7) {
            return true;
        }
        int length = bArr.length;
        this.f17632a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // v1.r
    public void g(int i7, int i8) {
        f(i7 + 4);
        byte[] bArr = this.f17632a;
        int i9 = i7 + 1;
        bArr[i7] = (byte) (i8 & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((i8 >> 8) & 255);
        bArr[i10] = (byte) ((i8 >> 16) & 255);
        bArr[i10 + 1] = (byte) ((i8 >> 24) & 255);
    }

    @Override // v1.q
    public byte get(int i7) {
        return this.f17632a[i7];
    }

    @Override // v1.r
    public void h(int i7, byte b7) {
        f(i7 + 1);
        this.f17632a[i7] = b7;
    }

    @Override // v1.q
    public double i(int i7) {
        return Double.longBitsToDouble(r(i7));
    }

    @Override // v1.r
    public void j(int i7, long j7) {
        f(i7 + 8);
        int i8 = (int) j7;
        byte[] bArr = this.f17632a;
        int i9 = i7 + 1;
        bArr[i7] = (byte) (i8 & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((i8 >> 8) & 255);
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((i8 >> 16) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i8 >> 24) & 255);
        int i13 = (int) (j7 >> 32);
        int i14 = i12 + 1;
        bArr[i12] = (byte) (i13 & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((i13 >> 8) & 255);
        bArr[i15] = (byte) ((i13 >> 16) & 255);
        bArr[i15 + 1] = (byte) ((i13 >> 24) & 255);
    }

    @Override // v1.q
    public boolean k(int i7) {
        return this.f17632a[i7] != 0;
    }

    @Override // v1.q
    public int l(int i7) {
        byte[] bArr = this.f17632a;
        return (bArr[i7] & t1.f17828n) | (bArr[i7 + 3] << 24) | ((bArr[i7 + 2] & t1.f17828n) << 16) | ((bArr[i7 + 1] & t1.f17828n) << 8);
    }

    @Override // v1.r
    public int m() {
        return this.f17633b;
    }

    @Override // v1.r
    public void n(int i7, boolean z6) {
        h(i7, z6 ? (byte) 1 : (byte) 0);
    }

    @Override // v1.q
    public float o(int i7) {
        return Float.intBitsToFloat(l(i7));
    }

    @Override // v1.r
    public void p(float f7) {
        x(this.f17633b, f7);
        this.f17633b += 4;
    }

    @Override // v1.r
    public void q(int i7) {
        g(this.f17633b, i7);
        this.f17633b += 4;
    }

    @Override // v1.q
    public long r(int i7) {
        byte[] bArr = this.f17632a;
        long j7 = bArr[i7] & 255;
        int i8 = i7 + 1 + 1 + 1;
        long j8 = j7 | ((bArr[r1] & 255) << 8) | ((bArr[r9] & 255) << 16);
        long j9 = j8 | ((bArr[i8] & 255) << 24);
        long j10 = j9 | ((bArr[r9] & 255) << 32);
        int i9 = i8 + 1 + 1 + 1;
        return j10 | ((bArr[r3] & 255) << 40) | ((255 & bArr[i9]) << 48) | (bArr[i9 + 1] << 56);
    }

    @Override // v1.r
    public void s(byte[] bArr, int i7, int i8) {
        c(this.f17633b, bArr, i7, i8);
        this.f17633b += i8;
    }

    @Override // v1.r
    public void t(double d7) {
        d(this.f17633b, d7);
        this.f17633b += 8;
    }

    @Override // v1.r
    public void u(short s6) {
        b(this.f17633b, s6);
        this.f17633b += 2;
    }

    @Override // v1.r
    public void v(byte b7) {
        h(this.f17633b, b7);
        this.f17633b++;
    }

    @Override // v1.q
    public short w(int i7) {
        byte[] bArr = this.f17632a;
        return (short) ((bArr[i7] & t1.f17828n) | (bArr[i7 + 1] << 8));
    }

    @Override // v1.r
    public void x(int i7, float f7) {
        f(i7 + 4);
        int floatToRawIntBits = Float.floatToRawIntBits(f7);
        byte[] bArr = this.f17632a;
        int i8 = i7 + 1;
        bArr[i7] = (byte) (floatToRawIntBits & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i9] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i9 + 1] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    @Override // v1.q
    public byte[] y() {
        return this.f17632a;
    }

    @Override // v1.r
    public void z(long j7) {
        j(this.f17633b, j7);
        this.f17633b += 8;
    }

    public a(int i7) {
        this(new byte[i7]);
    }

    public a(byte[] bArr) {
        this.f17632a = bArr;
        this.f17633b = 0;
    }

    public a(byte[] bArr, int i7) {
        this.f17632a = bArr;
        this.f17633b = i7;
    }
}