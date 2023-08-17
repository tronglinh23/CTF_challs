package o4;

import java.io.IOException;
import java.io.OutputStream;
import u4.l0;
import x3.o;

@f
/* loaded from: classes.dex */
public final class e extends OutputStream {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final OutputStream f14422k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final a f14423l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14424m;

    /* renamed from: n  reason: collision with root package name */
    public int f14425n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final byte[] f14426o;
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public final byte[] f14427p;

    /* renamed from: q  reason: collision with root package name */
    public int f14428q;

    public e(@n6.d OutputStream outputStream, @n6.d a aVar) {
        l0.p(outputStream, "output");
        l0.p(aVar, "base64");
        this.f14422k = outputStream;
        this.f14423l = aVar;
        this.f14425n = aVar.D() ? 76 : -1;
        this.f14426o = new byte[1024];
        this.f14427p = new byte[3];
    }

    public final void a() {
        if (this.f14424m) {
            throw new IOException("The output stream is closed.");
        }
    }

    public final int b(byte[] bArr, int i7, int i8) {
        int min = Math.min(3 - this.f14428q, i8 - i7);
        o.W0(bArr, this.f14427p, this.f14428q, i7, i7 + min);
        int i9 = this.f14428q + min;
        this.f14428q = i9;
        if (i9 == 3) {
            d();
        }
        return min;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14424m) {
            return;
        }
        this.f14424m = true;
        if (this.f14428q != 0) {
            d();
        }
        this.f14422k.close();
    }

    public final void d() {
        if (!(e(this.f14427p, 0, this.f14428q) == 4)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f14428q = 0;
    }

    public final int e(byte[] bArr, int i7, int i8) {
        int t6 = this.f14423l.t(bArr, this.f14426o, 0, i7, i8);
        if (this.f14425n == 0) {
            this.f14422k.write(a.f14396c.H());
            this.f14425n = 76;
            if (!(t6 <= 76)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        this.f14422k.write(this.f14426o, 0, t6);
        this.f14425n -= t6;
        return t6;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        a();
        this.f14422k.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i7) {
        a();
        byte[] bArr = this.f14427p;
        int i8 = this.f14428q;
        int i9 = i8 + 1;
        this.f14428q = i9;
        bArr[i8] = (byte) i7;
        if (i9 == 3) {
            d();
        }
    }

    @Override // java.io.OutputStream
    public void write(@n6.d byte[] bArr, int i7, int i8) {
        int i9;
        l0.p(bArr, "source");
        a();
        if (i7 < 0 || i8 < 0 || (i9 = i7 + i8) > bArr.length) {
            throw new IndexOutOfBoundsException("offset: " + i7 + ", length: " + i8 + ", source size: " + bArr.length);
        } else if (i8 == 0) {
        } else {
            int i10 = this.f14428q;
            if (i10 < 3) {
                if (i10 != 0) {
                    i7 += b(bArr, i7, i9);
                    if (this.f14428q != 0) {
                        return;
                    }
                }
                while (i7 + 3 <= i9) {
                    int min = Math.min((this.f14423l.D() ? this.f14425n : this.f14426o.length) / 4, (i9 - i7) / 3);
                    int i11 = (min * 3) + i7;
                    if (!(e(bArr, i7, i11) == min * 4)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    i7 = i11;
                }
                o.W0(bArr, this.f14427p, 0, i7, i9);
                this.f14428q = i9 - i7;
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}