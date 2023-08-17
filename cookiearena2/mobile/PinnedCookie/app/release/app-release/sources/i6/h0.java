package i6;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import u.v;
/* loaded from: classes.dex */
public final class h0 implements n {
    @n6.d
    @s4.e

    /* renamed from: k  reason: collision with root package name */
    public final m f11201k;
    @s4.e

    /* renamed from: l  reason: collision with root package name */
    public boolean f11202l;
    @n6.d
    @s4.e

    /* renamed from: m  reason: collision with root package name */
    public final m0 f11203m;

    public h0(@n6.d m0 m0Var) {
        u4.l0.p(m0Var, "sink");
        this.f11203m = m0Var;
        this.f11201k = new m();
    }

    public static /* synthetic */ void a() {
    }

    @Override // i6.n
    public long B(@n6.d o0 o0Var) {
        u4.l0.p(o0Var, "source");
        long j7 = 0;
        while (true) {
            long l02 = o0Var.l0(this.f11201k, 8192);
            if (l02 == -1) {
                return j7;
            }
            j7 += l02;
            u0();
        }
    }

    @Override // i6.n
    @n6.d
    public n B0(int i7) {
        if ((!this.f11202l) == true) {
            this.f11201k.B0(i7);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n D() {
        if ((!this.f11202l) == true) {
            long a12 = this.f11201k.a1();
            if (a12 > 0) {
                this.f11203m.w(this.f11201k, a12);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n D0(@n6.d String str, int i7, int i8, @n6.d Charset charset) {
        u4.l0.p(str, v.b.f17140e);
        u4.l0.p(charset, "charset");
        if ((!this.f11202l) == true) {
            this.f11201k.D0(str, i7, i8, charset);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n F(int i7) {
        if ((!this.f11202l) == true) {
            this.f11201k.F(i7);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n F0(long j7) {
        if ((!this.f11202l) == true) {
            this.f11201k.F0(j7);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n H(int i7) {
        if ((!this.f11202l) == true) {
            this.f11201k.H(i7);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n H0(@n6.d String str) {
        u4.l0.p(str, v.b.f17140e);
        if ((!this.f11202l) == true) {
            this.f11201k.H0(str);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n J(int i7) {
        if ((!this.f11202l) == true) {
            this.f11201k.J(i7);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n J0(long j7) {
        if ((!this.f11202l) == true) {
            this.f11201k.J0(j7);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n K(@n6.d p pVar) {
        u4.l0.p(pVar, "byteString");
        if ((!this.f11202l) == true) {
            this.f11201k.K(pVar);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public OutputStream L0() {
        return new a();
    }

    @Override // i6.n
    @n6.d
    public n M(@n6.d p pVar, int i7, int i8) {
        u4.l0.p(pVar, "byteString");
        if ((!this.f11202l) == true) {
            this.f11201k.M(pVar, i7, i8);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n N(@n6.d o0 o0Var, long j7) {
        u4.l0.p(o0Var, "source");
        while (j7 > 0) {
            long l02 = o0Var.l0(this.f11201k, j7);
            if (l02 == -1) {
                throw new EOFException();
            }
            j7 -= l02;
            u0();
        }
        return this;
    }

    @Override // i6.n
    @n6.d
    public n P(long j7) {
        if ((!this.f11202l) == true) {
            this.f11201k.P(j7);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n a0(int i7) {
        if ((!this.f11202l) == true) {
            this.f11201k.a0(i7);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.m0
    @n6.d
    public q0 c() {
        return this.f11203m.c();
    }

    @Override // i6.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f11202l) {
            return;
        }
        try {
            if (this.f11201k.a1() > 0) {
                m0 m0Var = this.f11203m;
                m mVar = this.f11201k;
                m0Var.w(mVar, mVar.a1());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f11203m.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f11202l = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // i6.n
    @n6.d
    public n e0(int i7) {
        if ((!this.f11202l) == true) {
            this.f11201k.e0(i7);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n, i6.m0, java.io.Flushable
    public void flush() {
        if ((!this.f11202l) != true) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f11201k.a1() > 0) {
            m0 m0Var = this.f11203m;
            m mVar = this.f11201k;
            m0Var.w(mVar, mVar.a1());
        }
        this.f11203m.flush();
    }

    @Override // i6.n
    @n6.d
    public m g() {
        return this.f11201k;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f11202l;
    }

    @Override // i6.n
    @n6.d
    public m j() {
        return this.f11201k;
    }

    @Override // i6.n
    @n6.d
    public n k0(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "source");
        if ((!this.f11202l) == true) {
            this.f11201k.k0(bArr);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n n(@n6.d byte[] bArr, int i7, int i8) {
        u4.l0.p(bArr, "source");
        if ((!this.f11202l) == true) {
            this.f11201k.n(bArr, i7, i8);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n s(@n6.d String str, int i7, int i8) {
        u4.l0.p(str, v.b.f17140e);
        if ((!this.f11202l) == true) {
            this.f11201k.s(str, i7, i8);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public String toString() {
        return "buffer(" + this.f11203m + ')';
    }

    @Override // i6.n
    @n6.d
    public n u0() {
        if ((!this.f11202l) == true) {
            long p6 = this.f11201k.p();
            if (p6 > 0) {
                this.f11203m.w(this.f11201k, p6);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n v(long j7) {
        if ((!this.f11202l) == true) {
            this.f11201k.v(j7);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.m0
    public void w(@n6.d m mVar, long j7) {
        u4.l0.p(mVar, "source");
        if ((!this.f11202l) != true) {
            throw new IllegalStateException("closed".toString());
        }
        this.f11201k.w(mVar, j7);
        u0();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@n6.d ByteBuffer byteBuffer) {
        u4.l0.p(byteBuffer, "source");
        if ((!this.f11202l) == true) {
            int write = this.f11201k.write(byteBuffer);
            u0();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.n
    @n6.d
    public n y(@n6.d String str, @n6.d Charset charset) {
        u4.l0.p(str, v.b.f17140e);
        u4.l0.p(charset, "charset");
        if ((!this.f11202l) == true) {
            this.f11201k.y(str, charset);
            return u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* loaded from: classes.dex */
    public static final class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            h0.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            h0 h0Var = h0.this;
            if (h0Var.f11202l) {
                return;
            }
            h0Var.flush();
        }

        @n6.d
        public String toString() {
            return h0.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
            h0 h0Var = h0.this;
            if (!h0Var.f11202l) {
                h0Var.f11201k.e0((byte) i7);
                h0.this.u0();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(@n6.d byte[] bArr, int i7, int i8) {
            u4.l0.p(bArr, "data");
            h0 h0Var = h0.this;
            if (!h0Var.f11202l) {
                h0Var.f11201k.n(bArr, i7, i8);
                h0.this.u0();
                return;
            }
            throw new IOException("closed");
        }
    }
}
