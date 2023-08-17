package o4;

import java.io.IOException;
import java.io.InputStream;
import u4.l0;
import v3.t1;
import x3.o;

@f
/* loaded from: classes.dex */
public final class d extends InputStream {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final InputStream f14413k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final a f14414l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14415m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14416n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final byte[] f14417o;
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public final byte[] f14418p;
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f14419q;

    /* renamed from: r  reason: collision with root package name */
    public int f14420r;

    /* renamed from: s  reason: collision with root package name */
    public int f14421s;

    public d(@n6.d InputStream inputStream, @n6.d a aVar) {
        l0.p(inputStream, "input");
        l0.p(aVar, "base64");
        this.f14413k = inputStream;
        this.f14414l = aVar;
        this.f14417o = new byte[1];
        this.f14418p = new byte[1024];
        this.f14419q = new byte[1024];
    }

    public final void a(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = this.f14419q;
        int i9 = this.f14420r;
        o.W0(bArr2, bArr, i7, i9, i9 + i8);
        this.f14420r += i8;
        h();
    }

    public final int b(byte[] bArr, int i7, int i8, int i9) {
        int i10 = this.f14421s;
        this.f14421s = i10 + this.f14414l.n(this.f14418p, this.f14419q, i10, 0, i9);
        int min = Math.min(d(), i8 - i7);
        a(bArr, i7, min);
        i();
        return min;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14415m) {
            return;
        }
        this.f14415m = true;
        this.f14413k.close();
    }

    public final int d() {
        return this.f14421s - this.f14420r;
    }

    public final int e(int i7) {
        this.f14418p[i7] = a.f14401h;
        if ((i7 & 3) == 2) {
            int f7 = f();
            if (f7 >= 0) {
                this.f14418p[i7 + 1] = (byte) f7;
            }
            return i7 + 2;
        }
        return i7 + 1;
    }

    public final int f() {
        int read;
        if (!this.f14414l.D()) {
            return this.f14413k.read();
        }
        do {
            read = this.f14413k.read();
            if (read == -1) {
                break;
            }
        } while (!c.i(read));
        return read;
    }

    public final void h() {
        if (this.f14420r == this.f14421s) {
            this.f14420r = 0;
            this.f14421s = 0;
        }
    }

    public final void i() {
        byte[] bArr = this.f14419q;
        int length = bArr.length;
        int i7 = this.f14421s;
        if ((this.f14418p.length / 4) * 3 > length - i7) {
            o.W0(bArr, bArr, 0, this.f14420r, i7);
            this.f14421s -= this.f14420r;
            this.f14420r = 0;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        int i7 = this.f14420r;
        if (i7 < this.f14421s) {
            int i8 = this.f14419q[i7] & t1.f17828n;
            this.f14420r = i7 + 1;
            h();
            return i8;
        }
        int read = read(this.f14417o, 0, 1);
        if (read != -1) {
            if (read == 1) {
                return this.f14417o[0] & t1.f17828n;
            }
            throw new IllegalStateException("Unreachable".toString());
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(@n6.d byte[] bArr, int i7, int i8) {
        int i9;
        boolean z6;
        boolean z7;
        l0.p(bArr, "destination");
        if (i7 >= 0 && i8 >= 0 && (i9 = i7 + i8) <= bArr.length) {
            if (!this.f14415m) {
                if (this.f14416n) {
                    return -1;
                }
                if (i8 == 0) {
                    return 0;
                }
                if (d() >= i8) {
                    a(bArr, i7, i8);
                    return i8;
                }
                int d7 = ((((i8 - d()) + 3) - 1) / 3) * 4;
                int i10 = i7;
                while (true) {
                    z6 = this.f14416n;
                    if (z6 || d7 <= 0) {
                        break;
                    }
                    int min = Math.min(this.f14418p.length, d7);
                    int i11 = 0;
                    while (true) {
                        z7 = this.f14416n;
                        if (z7 || i11 >= min) {
                            break;
                        }
                        int f7 = f();
                        if (f7 == -1) {
                            this.f14416n = true;
                        } else if (f7 != 61) {
                            this.f14418p[i11] = (byte) f7;
                            i11++;
                        } else {
                            i11 = e(i11);
                            this.f14416n = true;
                        }
                    }
                    if (z7 || i11 == min) {
                        d7 -= i11;
                        i10 += b(bArr, i10, i9, i11);
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                if (i10 == i7 && z6) {
                    return -1;
                }
                return i10 - i7;
            }
            throw new IOException("The input stream is closed.");
        }
        throw new IndexOutOfBoundsException("offset: " + i7 + ", length: " + i8 + ", buffer size: " + bArr.length);
    }
}