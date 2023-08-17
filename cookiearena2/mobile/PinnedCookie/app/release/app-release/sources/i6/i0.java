package i6;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import v3.t1;
/* loaded from: classes.dex */
public final class i0 implements o {
    @n6.d
    @s4.e

    /* renamed from: k  reason: collision with root package name */
    public final m f11205k;
    @s4.e

    /* renamed from: l  reason: collision with root package name */
    public boolean f11206l;
    @n6.d
    @s4.e

    /* renamed from: m  reason: collision with root package name */
    public final o0 f11207m;

    public i0(@n6.d o0 o0Var) {
        u4.l0.p(o0Var, "source");
        this.f11207m = o0Var;
        this.f11205k = new m();
    }

    public static /* synthetic */ void a() {
    }

    @Override // i6.o
    @n6.d
    public o A0() {
        return a0.d(new f0(this));
    }

    @Override // i6.o
    public boolean G(long j7) {
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if ((!this.f11206l) == false) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.f11205k.a1() < j7) {
            if (this.f11207m.l0(this.f11205k, 8192) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // i6.o
    public void G0(long j7) {
        if (!G(j7)) {
            throw new EOFException();
        }
    }

    @Override // i6.o
    public void K0(@n6.d m mVar, long j7) {
        u4.l0.p(mVar, "sink");
        try {
            G0(j7);
            this.f11205k.K0(mVar, j7);
        } catch (EOFException e7) {
            mVar.B(this.f11205k);
            throw e7;
        }
    }

    @Override // i6.o
    public long N0(byte b7) {
        return s0(b7, 0L, Long.MAX_VALUE);
    }

    @Override // i6.o
    public long P0() {
        byte Z;
        G0(1L);
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            if (!G(i8)) {
                break;
            }
            Z = this.f11205k.Z(i7);
            if ((Z < ((byte) 48) || Z > ((byte) 57)) && ((Z < ((byte) 97) || Z > ((byte) w0.m0.f18129j)) && (Z < ((byte) 65) || Z > ((byte) 70)))) {
                break;
            }
            i7 = i8;
        }
        if (i7 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String num = Integer.toString(Z, i5.d.a(i5.d.a(16)));
            u4.l0.o(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(num);
            throw new NumberFormatException(sb.toString());
        }
        return this.f11205k.P0();
    }

    @Override // i6.o
    public long Q0(@n6.d m0 m0Var) {
        u4.l0.p(m0Var, "sink");
        long j7 = 0;
        while (this.f11207m.l0(this.f11205k, 8192) != -1) {
            long p6 = this.f11205k.p();
            if (p6 > 0) {
                j7 += p6;
                m0Var.w(this.f11205k, p6);
            }
        }
        if (this.f11205k.a1() > 0) {
            long a12 = j7 + this.f11205k.a1();
            m mVar = this.f11205k;
            m0Var.w(mVar, mVar.a1());
            return a12;
        }
        return j7;
    }

    @Override // i6.o
    @n6.d
    public String R0(@n6.d Charset charset) {
        u4.l0.p(charset, "charset");
        this.f11205k.B(this.f11207m);
        return this.f11205k.R0(charset);
    }

    @Override // i6.o
    @n6.d
    public InputStream S0() {
        return new a();
    }

    @Override // i6.o
    @n6.d
    public String T() {
        return y0(Long.MAX_VALUE);
    }

    @Override // i6.o
    public long U(@n6.d p pVar, long j7) {
        u4.l0.p(pVar, "targetBytes");
        if ((!this.f11206l) != true) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long U = this.f11205k.U(pVar, j7);
            if (U != -1) {
                return U;
            }
            long a12 = this.f11205k.a1();
            if (this.f11207m.l0(this.f11205k, 8192) == -1) {
                return -1L;
            }
            j7 = Math.max(j7, a12);
        }
    }

    @Override // i6.o
    @n6.d
    public byte[] V() {
        this.f11205k.B(this.f11207m);
        return this.f11205k.V();
    }

    @Override // i6.o
    public long W(@n6.d p pVar, long j7) {
        u4.l0.p(pVar, "bytes");
        if ((!this.f11206l) != true) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long W = this.f11205k.W(pVar, j7);
            if (W != -1) {
                return W;
            }
            long a12 = this.f11205k.a1();
            if (this.f11207m.l0(this.f11205k, 8192) == -1) {
                return -1L;
            }
            j7 = Math.max(j7, (a12 - pVar.c0()) + 1);
        }
    }

    @Override // i6.o
    public int Y() {
        G0(4L);
        return this.f11205k.Y();
    }

    @Override // i6.o
    public long b0(@n6.d p pVar) {
        u4.l0.p(pVar, "targetBytes");
        return U(pVar, 0L);
    }

    @Override // i6.o0
    @n6.d
    public q0 c() {
        return this.f11207m.c();
    }

    @Override // i6.o
    public boolean c0() {
        if ((!this.f11206l) == true) {
            return this.f11205k.c0() && this.f11207m.l0(this.f11205k, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f11206l) {
            return;
        }
        this.f11206l = true;
        this.f11207m.close();
        this.f11205k.l();
    }

    @Override // i6.o
    @n6.d
    public m g() {
        return this.f11205k;
    }

    @Override // i6.o
    public int g0(@n6.d d0 d0Var) {
        u4.l0.p(d0Var, "options");
        if ((!this.f11206l) == false) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int d02 = j6.a.d0(this.f11205k, d0Var, true);
            if (d02 != -2) {
                if (d02 != -1) {
                    this.f11205k.skip(d0Var.f()[d02].c0());
                    return d02;
                }
            } else if (this.f11207m.l0(this.f11205k, 8192) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // i6.o
    @n6.d
    public byte[] h0(long j7) {
        G0(j7);
        return this.f11205k.h0(j7);
    }

    @Override // i6.o
    public boolean i0(long j7, @n6.d p pVar, int i7, int i8) {
        int i9;
        u4.l0.p(pVar, "bytes");
        if ((!this.f11206l) == true) {
            if (j7 >= 0 && i7 >= 0 && i8 >= 0 && pVar.c0() - i7 >= i8) {
                for (0; i9 < i8; i9 + 1) {
                    long j8 = i9 + j7;
                    i9 = (G(1 + j8) && this.f11205k.Z(j8) == pVar.r(i7 + i9)) ? i9 + 1 : 0;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f11206l;
    }

    @Override // i6.o
    @n6.d
    public m j() {
        return this.f11205k;
    }

    @Override // i6.o
    @n6.d
    public String j0() {
        this.f11205k.B(this.f11207m);
        return this.f11205k.j0();
    }

    @Override // i6.o0
    public long l0(@n6.d m mVar, long j7) {
        u4.l0.p(mVar, "sink");
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        } else if ((!this.f11206l) == true) {
            if (this.f11205k.a1() == 0 && this.f11207m.l0(this.f11205k, 8192) == -1) {
                return -1L;
            }
            return this.f11205k.l0(mVar, Math.min(j7, this.f11205k.a1()));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // i6.o
    @n6.d
    public String m0(long j7, @n6.d Charset charset) {
        u4.l0.p(charset, "charset");
        G0(j7);
        return this.f11205k.m0(j7, charset);
    }

    @Override // i6.o
    public boolean n0(long j7, @n6.d p pVar) {
        u4.l0.p(pVar, "bytes");
        return i0(j7, pVar, 0, pVar.c0());
    }

    @Override // i6.o
    public int o() {
        G0(1L);
        byte Z = this.f11205k.Z(0L);
        if ((Z & 224) == 192) {
            G0(2L);
        } else if ((Z & 240) == 224) {
            G0(3L);
        } else if ((Z & 248) == 240) {
            G0(4L);
        }
        return this.f11205k.o();
    }

    @Override // i6.o
    public long o0(byte b7, long j7) {
        return s0(b7, j7, Long.MAX_VALUE);
    }

    @Override // i6.o
    @n6.d
    public String q(long j7) {
        G0(j7);
        return this.f11205k.q(j7);
    }

    @Override // i6.o
    public long r(@n6.d p pVar) {
        u4.l0.p(pVar, "bytes");
        return W(pVar, 0L);
    }

    @Override // i6.o
    public short r0() {
        G0(2L);
        return this.f11205k.r0();
    }

    @Override // i6.o
    public int read(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    @Override // i6.o
    public byte readByte() {
        G0(1L);
        return this.f11205k.readByte();
    }

    @Override // i6.o
    public void readFully(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "sink");
        try {
            G0(bArr.length);
            this.f11205k.readFully(bArr);
        } catch (EOFException e7) {
            int i7 = 0;
            while (this.f11205k.a1() > 0) {
                m mVar = this.f11205k;
                int read = mVar.read(bArr, i7, (int) mVar.a1());
                if (read == -1) {
                    throw new AssertionError();
                }
                i7 += read;
            }
            throw e7;
        }
    }

    @Override // i6.o
    public int readInt() {
        G0(4L);
        return this.f11205k.readInt();
    }

    @Override // i6.o
    public long readLong() {
        G0(8L);
        return this.f11205k.readLong();
    }

    @Override // i6.o
    public short readShort() {
        G0(2L);
        return this.f11205k.readShort();
    }

    @Override // i6.o
    public long s0(byte b7, long j7, long j8) {
        if ((!this.f11206l) == true) {
            if (!(0 <= j7 && j8 >= j7)) {
                throw new IllegalArgumentException(("fromIndex=" + j7 + " toIndex=" + j8).toString());
            }
            while (j7 < j8) {
                long s02 = this.f11205k.s0(b7, j7, j8);
                if (s02 != -1) {
                    return s02;
                }
                long a12 = this.f11205k.a1();
                if (a12 >= j8 || this.f11207m.l0(this.f11205k, 8192) == -1) {
                    return -1L;
                }
                j7 = Math.max(j7, a12);
            }
            return -1L;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.o
    public void skip(long j7) {
        if ((!this.f11206l) != true) {
            throw new IllegalStateException("closed".toString());
        }
        while (j7 > 0) {
            if (this.f11205k.a1() == 0 && this.f11207m.l0(this.f11205k, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j7, this.f11205k.a1());
            this.f11205k.skip(min);
            j7 -= min;
        }
    }

    @Override // i6.o
    @n6.e
    public String t0() {
        long N0 = N0((byte) 10);
        if (N0 == -1) {
            if (this.f11205k.a1() != 0) {
                return q(this.f11205k.a1());
            }
            return null;
        }
        return j6.a.b0(this.f11205k, N0);
    }

    @n6.d
    public String toString() {
        return "buffer(" + this.f11207m + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9] or '-' character but was 0x");
        r2 = java.lang.Integer.toString(r8, i5.d.a(i5.d.a(16)));
        u4.l0.o(r2, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // i6.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long v0() {
        /*
            r10 = this;
            r0 = 1
            r10.G0(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.G(r6)
            if (r8 == 0) goto L59
            i6.m r8 = r10.f11205k
            byte r8 = r8.Z(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L20
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2a
        L20:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r4 == 0) goto L2f
            goto L59
        L2f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = i5.d.a(r2)
            int r2 = i5.d.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            u4.l0.o(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L59:
            i6.m r0 = r10.f11205k
            long r0 = r0.v0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.i0.v0():long");
    }

    @Override // i6.o
    @n6.d
    public p x() {
        this.f11205k.B(this.f11207m);
        return this.f11205k.x();
    }

    @Override // i6.o
    public long x0() {
        G0(8L);
        return this.f11205k.x0();
    }

    @Override // i6.o
    @n6.d
    public String y0(long j7) {
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j7).toString());
        }
        long j8 = j7 == Long.MAX_VALUE ? Long.MAX_VALUE : j7 + 1;
        byte b7 = (byte) 10;
        long s02 = s0(b7, 0L, j8);
        if (s02 != -1) {
            return j6.a.b0(this.f11205k, s02);
        }
        if (j8 < Long.MAX_VALUE && G(j8) && this.f11205k.Z(j8 - 1) == ((byte) 13) && G(1 + j8) && this.f11205k.Z(j8) == b7) {
            return j6.a.b0(this.f11205k, j8);
        }
        m mVar = new m();
        m mVar2 = this.f11205k;
        mVar2.A(mVar, 0L, Math.min(32, mVar2.a1()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f11205k.a1(), j7) + " content=" + mVar.x().w() + "…");
    }

    @Override // i6.o
    @n6.d
    public p z(long j7) {
        G0(j7);
        return this.f11205k.z(j7);
    }

    @Override // i6.o
    public int read(@n6.d byte[] bArr, int i7, int i8) {
        u4.l0.p(bArr, "sink");
        long j7 = i8;
        j.e(bArr.length, i7, j7);
        if (this.f11205k.a1() == 0 && this.f11207m.l0(this.f11205k, 8192) == -1) {
            return -1;
        }
        return this.f11205k.read(bArr, i7, (int) Math.min(j7, this.f11205k.a1()));
    }

    /* loaded from: classes.dex */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            i0 i0Var = i0.this;
            if (i0Var.f11206l) {
                throw new IOException("closed");
            }
            return (int) Math.min(i0Var.f11205k.a1(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            i0.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            i0 i0Var = i0.this;
            if (!i0Var.f11206l) {
                if (i0Var.f11205k.a1() == 0) {
                    i0 i0Var2 = i0.this;
                    if (i0Var2.f11207m.l0(i0Var2.f11205k, 8192) == -1) {
                        return -1;
                    }
                }
                return i0.this.f11205k.readByte() & t1.f17828n;
            }
            throw new IOException("closed");
        }

        @n6.d
        public String toString() {
            return i0.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@n6.d byte[] bArr, int i7, int i8) {
            u4.l0.p(bArr, "data");
            if (!i0.this.f11206l) {
                j.e(bArr.length, i7, i8);
                if (i0.this.f11205k.a1() == 0) {
                    i0 i0Var = i0.this;
                    if (i0Var.f11207m.l0(i0Var.f11205k, 8192) == -1) {
                        return -1;
                    }
                }
                return i0.this.f11205k.read(bArr, i7, i8);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@n6.d ByteBuffer byteBuffer) {
        u4.l0.p(byteBuffer, "sink");
        if (this.f11205k.a1() == 0 && this.f11207m.l0(this.f11205k, 8192) == -1) {
            return -1;
        }
        return this.f11205k.read(byteBuffer);
    }
}
