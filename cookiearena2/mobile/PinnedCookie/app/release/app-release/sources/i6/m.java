package i6;

import i0.x2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.coroutines.x1;
import u.v;
import u4.t1;
import v3.b1;
/* loaded from: classes.dex */
public final class m implements o, n, Cloneable, ByteChannel {
    @s4.e
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public j0 f11238k;

    /* renamed from: l  reason: collision with root package name */
    public long f11239l;

    /* loaded from: classes.dex */
    public static final class a implements Closeable {
        @s4.e
        @n6.e

        /* renamed from: k  reason: collision with root package name */
        public m f11240k;
        @s4.e

        /* renamed from: l  reason: collision with root package name */
        public boolean f11241l;

        /* renamed from: m  reason: collision with root package name */
        public j0 f11242m;
        @s4.e
        @n6.e

        /* renamed from: o  reason: collision with root package name */
        public byte[] f11244o;
        @s4.e

        /* renamed from: n  reason: collision with root package name */
        public long f11243n = -1;
        @s4.e

        /* renamed from: p  reason: collision with root package name */
        public int f11245p = -1;
        @s4.e

        /* renamed from: q  reason: collision with root package name */
        public int f11246q = -1;

        public final long a(int i7) {
            if (!(i7 > 0)) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i7).toString());
            }
            if (!(i7 <= 8192)) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i7).toString());
            }
            m mVar = this.f11240k;
            if (mVar != null) {
                if (this.f11241l) {
                    long a12 = mVar.a1();
                    j0 d12 = mVar.d1(i7);
                    int i8 = 8192 - d12.f11214c;
                    d12.f11214c = 8192;
                    long j7 = i8;
                    mVar.W0(a12 + j7);
                    this.f11242m = d12;
                    this.f11243n = a12;
                    this.f11244o = d12.f11212a;
                    this.f11245p = 8192 - i8;
                    this.f11246q = 8192;
                    return j7;
                }
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int b() {
            long j7 = this.f11243n;
            m mVar = this.f11240k;
            u4.l0.m(mVar);
            if (j7 != mVar.a1()) {
                long j8 = this.f11243n;
                return e(j8 == -1 ? 0L : j8 + (this.f11246q - this.f11245p));
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f11240k != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f11240k = null;
            this.f11242m = null;
            this.f11243n = -1L;
            this.f11244o = null;
            this.f11245p = -1;
            this.f11246q = -1;
        }

        public final long d(long j7) {
            m mVar = this.f11240k;
            if (mVar != null) {
                if (this.f11241l) {
                    long a12 = mVar.a1();
                    int i7 = (j7 > a12 ? 1 : (j7 == a12 ? 0 : -1));
                    int i8 = 1;
                    if (i7 <= 0) {
                        if (!(j7 >= 0)) {
                            throw new IllegalArgumentException(("newSize < 0: " + j7).toString());
                        }
                        long j8 = a12 - j7;
                        while (true) {
                            if (j8 <= 0) {
                                break;
                            }
                            j0 j0Var = mVar.f11238k;
                            u4.l0.m(j0Var);
                            j0 j0Var2 = j0Var.f11218g;
                            u4.l0.m(j0Var2);
                            int i9 = j0Var2.f11214c;
                            long j9 = i9 - j0Var2.f11213b;
                            if (j9 > j8) {
                                j0Var2.f11214c = i9 - ((int) j8);
                                break;
                            }
                            mVar.f11238k = j0Var2.b();
                            k0.d(j0Var2);
                            j8 -= j9;
                        }
                        this.f11242m = null;
                        this.f11243n = j7;
                        this.f11244o = null;
                        this.f11245p = -1;
                        this.f11246q = -1;
                    } else if (i7 > 0) {
                        long j10 = j7 - a12;
                        boolean z6 = true;
                        while (j10 > 0) {
                            j0 d12 = mVar.d1(i8);
                            int min = (int) Math.min(j10, 8192 - d12.f11214c);
                            int i10 = d12.f11214c + min;
                            d12.f11214c = i10;
                            j10 -= min;
                            if (z6) {
                                this.f11242m = d12;
                                this.f11243n = a12;
                                this.f11244o = d12.f11212a;
                                this.f11245p = i10 - min;
                                this.f11246q = i10;
                                z6 = false;
                            }
                            i8 = 1;
                        }
                    }
                    mVar.W0(j7);
                    return a12;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int e(long j7) {
            j0 j0Var;
            m mVar = this.f11240k;
            if (mVar != null) {
                if (j7 < -1 || j7 > mVar.a1()) {
                    t1 t1Var = t1.f17486a;
                    String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j7), Long.valueOf(mVar.a1())}, 2));
                    u4.l0.o(format, "java.lang.String.format(format, *args)");
                    throw new ArrayIndexOutOfBoundsException(format);
                } else if (j7 == -1 || j7 == mVar.a1()) {
                    this.f11242m = null;
                    this.f11243n = j7;
                    this.f11244o = null;
                    this.f11245p = -1;
                    this.f11246q = -1;
                    return -1;
                } else {
                    long a12 = mVar.a1();
                    j0 j0Var2 = mVar.f11238k;
                    j0 j0Var3 = this.f11242m;
                    long j8 = 0;
                    if (j0Var3 != null) {
                        long j9 = this.f11243n;
                        int i7 = this.f11245p;
                        u4.l0.m(j0Var3);
                        long j10 = j9 - (i7 - j0Var3.f11213b);
                        if (j10 > j7) {
                            j0Var = j0Var2;
                            j0Var2 = this.f11242m;
                            a12 = j10;
                        } else {
                            j0Var = this.f11242m;
                            j8 = j10;
                        }
                    } else {
                        j0Var = j0Var2;
                    }
                    if (a12 - j7 > j7 - j8) {
                        while (true) {
                            u4.l0.m(j0Var);
                            int i8 = j0Var.f11214c;
                            int i9 = j0Var.f11213b;
                            if (j7 < (i8 - i9) + j8) {
                                break;
                            }
                            j8 += i8 - i9;
                            j0Var = j0Var.f11217f;
                        }
                    } else {
                        while (a12 > j7) {
                            u4.l0.m(j0Var2);
                            j0Var2 = j0Var2.f11218g;
                            u4.l0.m(j0Var2);
                            a12 -= j0Var2.f11214c - j0Var2.f11213b;
                        }
                        j8 = a12;
                        j0Var = j0Var2;
                    }
                    if (this.f11241l) {
                        u4.l0.m(j0Var);
                        if (j0Var.f11215d) {
                            j0 f7 = j0Var.f();
                            if (mVar.f11238k == j0Var) {
                                mVar.f11238k = f7;
                            }
                            j0Var = j0Var.c(f7);
                            j0 j0Var4 = j0Var.f11218g;
                            u4.l0.m(j0Var4);
                            j0Var4.b();
                        }
                    }
                    this.f11242m = j0Var;
                    this.f11243n = j7;
                    u4.l0.m(j0Var);
                    this.f11244o = j0Var.f11212a;
                    int i10 = j0Var.f11213b + ((int) (j7 - j8));
                    this.f11245p = i10;
                    int i11 = j0Var.f11214c;
                    this.f11246q = i11;
                    return i11 - i10;
                }
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends OutputStream {
        public c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @n6.d
        public String toString() {
            return m.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
            m.this.e0(i7);
        }

        @Override // java.io.OutputStream
        public void write(@n6.d byte[] bArr, int i7, int i8) {
            u4.l0.p(bArr, "data");
            m.this.n(bArr, i7, i8);
        }
    }

    public static /* synthetic */ a E0(m mVar, a aVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = new a();
        }
        return mVar.C0(aVar);
    }

    public static /* synthetic */ m L(m mVar, m mVar2, long j7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j7 = 0;
        }
        return mVar.u(mVar2, j7);
    }

    public static /* synthetic */ m O(m mVar, m mVar2, long j7, long j8, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j7 = 0;
        }
        return mVar.A(mVar2, j7, j8);
    }

    public static /* synthetic */ m Q(m mVar, OutputStream outputStream, long j7, long j8, int i7, Object obj) throws IOException {
        if ((i7 & 2) != 0) {
            j7 = 0;
        }
        long j9 = j7;
        if ((i7 & 4) != 0) {
            j8 = mVar.f11239l - j9;
        }
        return mVar.I(outputStream, j9, j8);
    }

    public static /* synthetic */ a V0(m mVar, a aVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = new a();
        }
        return mVar.U0(aVar);
    }

    public static /* synthetic */ m w1(m mVar, OutputStream outputStream, long j7, int i7, Object obj) throws IOException {
        if ((i7 & 2) != 0) {
            j7 = mVar.f11239l;
        }
        return mVar.v1(outputStream, j7);
    }

    @n6.d
    public final m A(@n6.d m mVar, long j7, long j8) {
        u4.l0.p(mVar, "out");
        j.e(a1(), j7, j8);
        if (j8 != 0) {
            mVar.W0(mVar.a1() + j8);
            j0 j0Var = this.f11238k;
            while (true) {
                u4.l0.m(j0Var);
                int i7 = j0Var.f11214c;
                int i8 = j0Var.f11213b;
                if (j7 < i7 - i8) {
                    break;
                }
                j7 -= i7 - i8;
                j0Var = j0Var.f11217f;
            }
            while (j8 > 0) {
                u4.l0.m(j0Var);
                j0 d7 = j0Var.d();
                int i9 = d7.f11213b + ((int) j7);
                d7.f11213b = i9;
                d7.f11214c = Math.min(i9 + ((int) j8), d7.f11214c);
                j0 j0Var2 = mVar.f11238k;
                if (j0Var2 == null) {
                    d7.f11218g = d7;
                    d7.f11217f = d7;
                    mVar.f11238k = d7;
                } else {
                    u4.l0.m(j0Var2);
                    j0 j0Var3 = j0Var2.f11218g;
                    u4.l0.m(j0Var3);
                    j0Var3.c(d7);
                }
                j8 -= d7.f11214c - d7.f11213b;
                j0Var = j0Var.f11217f;
                j7 = 0;
            }
        }
        return this;
    }

    @Override // i6.o
    @n6.d
    public o A0() {
        return a0.d(new f0(this));
    }

    @Override // i6.n
    public long B(@n6.d o0 o0Var) throws IOException {
        u4.l0.p(o0Var, "source");
        long j7 = 0;
        while (true) {
            long l02 = o0Var.l0(this, 8192);
            if (l02 == -1) {
                return j7;
            }
            j7 += l02;
        }
    }

    @n6.d
    @s4.i
    public final m C(@n6.d OutputStream outputStream) throws IOException {
        return Q(this, outputStream, 0L, 0L, 6, null);
    }

    @n6.d
    @s4.i
    public final a C0(@n6.d a aVar) {
        u4.l0.p(aVar, "unsafeCursor");
        if (aVar.f11240k == null) {
            aVar.f11240k = this;
            aVar.f11241l = true;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @n6.d
    @s4.i
    public final m E(@n6.d OutputStream outputStream, long j7) throws IOException {
        return Q(this, outputStream, j7, 0L, 4, null);
    }

    @Override // i6.o
    public boolean G(long j7) {
        return this.f11239l >= j7;
    }

    @Override // i6.o
    public void G0(long j7) throws EOFException {
        if (this.f11239l < j7) {
            throw new EOFException();
        }
    }

    @n6.d
    @s4.i
    public final m I(@n6.d OutputStream outputStream, long j7, long j8) throws IOException {
        u4.l0.p(outputStream, "out");
        j.e(this.f11239l, j7, j8);
        if (j8 == 0) {
            return this;
        }
        j0 j0Var = this.f11238k;
        while (true) {
            u4.l0.m(j0Var);
            int i7 = j0Var.f11214c;
            int i8 = j0Var.f11213b;
            if (j7 < i7 - i8) {
                break;
            }
            j7 -= i7 - i8;
            j0Var = j0Var.f11217f;
        }
        while (j8 > 0) {
            u4.l0.m(j0Var);
            int min = (int) Math.min(j0Var.f11214c - r9, j8);
            outputStream.write(j0Var.f11212a, (int) (j0Var.f11213b + j7), min);
            j8 -= min;
            j0Var = j0Var.f11217f;
            j7 = 0;
        }
        return this;
    }

    @n6.d
    public final m I0(@n6.d InputStream inputStream) throws IOException {
        u4.l0.p(inputStream, "input");
        O0(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @Override // i6.o
    public void K0(@n6.d m mVar, long j7) throws EOFException {
        u4.l0.p(mVar, "sink");
        if (a1() >= j7) {
            mVar.w(this, j7);
        } else {
            mVar.w(this, a1());
            throw new EOFException();
        }
    }

    @Override // i6.n
    @n6.d
    public OutputStream L0() {
        return new c();
    }

    @n6.d
    public final m M0(@n6.d InputStream inputStream, long j7) throws IOException {
        u4.l0.p(inputStream, "input");
        if (j7 >= 0) {
            O0(inputStream, j7, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
    }

    @Override // i6.o
    public long N0(byte b7) {
        return s0(b7, 0L, Long.MAX_VALUE);
    }

    public final void O0(InputStream inputStream, long j7, boolean z6) throws IOException {
        while (true) {
            if (j7 <= 0 && !z6) {
                return;
            }
            j0 d12 = d1(1);
            int read = inputStream.read(d12.f11212a, d12.f11214c, (int) Math.min(j7, 8192 - d12.f11214c));
            if (read == -1) {
                if (d12.f11213b == d12.f11214c) {
                    this.f11238k = d12.b();
                    k0.d(d12);
                }
                if (!z6) {
                    throw new EOFException();
                }
                return;
            }
            d12.f11214c += read;
            long j8 = read;
            this.f11239l += j8;
            j7 -= j8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[EDGE_INSN: B:42:0x00ae->B:37:0x00ae BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // i6.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long P0() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.a1()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb8
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            i6.j0 r6 = r14.f11238k
            u4.l0.m(r6)
            byte[] r7 = r6.f11212a
            int r8 = r6.f11213b
            int r9 = r6.f11214c
        L18:
            if (r8 >= r9) goto L9a
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7b
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            i6.m r0 = new i6.m
            r0.<init>()
            i6.m r0 = r0.v(r4)
            i6.m r0 = r0.e0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.j0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7b:
            if (r0 == 0) goto L7f
            r1 = 1
            goto L9a
        L7f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = i6.j.m(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            i6.j0 r7 = r6.b()
            r14.f11238k = r7
            i6.k0.d(r6)
            goto La8
        La6:
            r6.f11213b = r8
        La8:
            if (r1 != 0) goto Lae
            i6.j0 r6 = r14.f11238k
            if (r6 != 0) goto Ld
        Lae:
            long r1 = r14.a1()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.W0(r1)
            return r4
        Lb8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.m.P0():long");
    }

    @Override // i6.o
    public long Q0(@n6.d m0 m0Var) throws IOException {
        u4.l0.p(m0Var, "sink");
        long a12 = a1();
        if (a12 > 0) {
            m0Var.w(this, a12);
        }
        return a12;
    }

    public final p R(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        j0 j0Var = this.f11238k;
        if (j0Var != null) {
            byte[] bArr = j0Var.f11212a;
            int i7 = j0Var.f11213b;
            messageDigest.update(bArr, i7, j0Var.f11214c - i7);
            j0 j0Var2 = j0Var.f11217f;
            u4.l0.m(j0Var2);
            while (j0Var2 != j0Var) {
                byte[] bArr2 = j0Var2.f11212a;
                int i8 = j0Var2.f11213b;
                messageDigest.update(bArr2, i8, j0Var2.f11214c - i8);
                j0Var2 = j0Var2.f11217f;
                u4.l0.m(j0Var2);
            }
        }
        byte[] digest = messageDigest.digest();
        u4.l0.o(digest, "messageDigest.digest()");
        return new p(digest);
    }

    @Override // i6.o
    @n6.d
    public String R0(@n6.d Charset charset) {
        u4.l0.p(charset, "charset");
        return m0(this.f11239l, charset);
    }

    @Override // i6.n
    @n6.d
    /* renamed from: S  reason: merged with bridge method [inline-methods] */
    public m D() {
        return this;
    }

    @Override // i6.o
    @n6.d
    public InputStream S0() {
        return new b();
    }

    @Override // i6.o
    @n6.d
    public String T() throws EOFException {
        return y0(Long.MAX_VALUE);
    }

    @n6.d
    @s4.i
    public final a T0() {
        return V0(this, null, 1, null);
    }

    @Override // i6.o
    public long U(@n6.d p pVar, long j7) {
        int i7;
        int i8;
        u4.l0.p(pVar, "targetBytes");
        long j8 = 0;
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j7).toString());
        }
        j0 j0Var = this.f11238k;
        if (j0Var != null) {
            if (a1() - j7 < j7) {
                j8 = a1();
                while (j8 > j7) {
                    j0Var = j0Var.f11218g;
                    u4.l0.m(j0Var);
                    j8 -= j0Var.f11214c - j0Var.f11213b;
                }
                if (pVar.c0() == 2) {
                    byte r6 = pVar.r(0);
                    byte r7 = pVar.r(1);
                    while (j8 < a1()) {
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
                        u4.l0.m(j0Var);
                        j7 = j8;
                    }
                    return -1L;
                }
                byte[] H = pVar.H();
                while (j8 < a1()) {
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
                    u4.l0.m(j0Var);
                    j7 = j8;
                }
                return -1L;
            }
            while (true) {
                long j9 = (j0Var.f11214c - j0Var.f11213b) + j8;
                if (j9 > j7) {
                    break;
                }
                j0Var = j0Var.f11217f;
                u4.l0.m(j0Var);
                j8 = j9;
            }
            if (pVar.c0() == 2) {
                byte r8 = pVar.r(0);
                byte r9 = pVar.r(1);
                while (j8 < a1()) {
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
                    u4.l0.m(j0Var);
                    j7 = j8;
                }
                return -1L;
            }
            byte[] H2 = pVar.H();
            while (j8 < a1()) {
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
                u4.l0.m(j0Var);
                j7 = j8;
            }
            return -1L;
            return (i7 - i8) + j8;
        }
        return -1L;
    }

    @n6.d
    @s4.i
    public final a U0(@n6.d a aVar) {
        u4.l0.p(aVar, "unsafeCursor");
        if (aVar.f11240k == null) {
            aVar.f11240k = this;
            aVar.f11241l = false;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @Override // i6.o
    @n6.d
    public byte[] V() {
        return h0(a1());
    }

    @Override // i6.o
    public long W(@n6.d p pVar, long j7) throws IOException {
        long j8 = j7;
        u4.l0.p(pVar, "bytes");
        if (pVar.c0() > 0) {
            long j9 = 0;
            if (!(j8 >= 0)) {
                throw new IllegalArgumentException(("fromIndex < 0: " + j8).toString());
            }
            j0 j0Var = this.f11238k;
            if (j0Var != null) {
                if (a1() - j8 < j8) {
                    long a12 = a1();
                    while (a12 > j8) {
                        j0Var = j0Var.f11218g;
                        u4.l0.m(j0Var);
                        a12 -= j0Var.f11214c - j0Var.f11213b;
                    }
                    byte[] H = pVar.H();
                    byte b7 = H[0];
                    int c02 = pVar.c0();
                    long a13 = (a1() - c02) + 1;
                    while (a12 < a13) {
                        byte[] bArr = j0Var.f11212a;
                        long j10 = a12;
                        int min = (int) Math.min(j0Var.f11214c, (j0Var.f11213b + a13) - a12);
                        for (int i7 = (int) ((j0Var.f11213b + j8) - j10); i7 < min; i7++) {
                            if (bArr[i7] == b7 && j6.a.a0(j0Var, i7 + 1, H, 1, c02)) {
                                return (i7 - j0Var.f11213b) + j10;
                            }
                        }
                        a12 = j10 + (j0Var.f11214c - j0Var.f11213b);
                        j0Var = j0Var.f11217f;
                        u4.l0.m(j0Var);
                        j8 = a12;
                    }
                } else {
                    while (true) {
                        long j11 = (j0Var.f11214c - j0Var.f11213b) + j9;
                        if (j11 > j8) {
                            break;
                        }
                        j0Var = j0Var.f11217f;
                        u4.l0.m(j0Var);
                        j9 = j11;
                    }
                    byte[] H2 = pVar.H();
                    byte b8 = H2[0];
                    int c03 = pVar.c0();
                    long a14 = (a1() - c03) + 1;
                    while (j9 < a14) {
                        byte[] bArr2 = j0Var.f11212a;
                        long j12 = a14;
                        int min2 = (int) Math.min(j0Var.f11214c, (j0Var.f11213b + a14) - j9);
                        for (int i8 = (int) ((j0Var.f11213b + j8) - j9); i8 < min2; i8++) {
                            if (bArr2[i8] == b8 && j6.a.a0(j0Var, i8 + 1, H2, 1, c03)) {
                                return (i8 - j0Var.f11213b) + j9;
                            }
                        }
                        j9 += j0Var.f11214c - j0Var.f11213b;
                        j0Var = j0Var.f11217f;
                        u4.l0.m(j0Var);
                        j8 = j9;
                        a14 = j12;
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public final void W0(long j7) {
        this.f11239l = j7;
    }

    @Override // i6.n
    @n6.d
    /* renamed from: X  reason: merged with bridge method [inline-methods] */
    public m u0() {
        return this;
    }

    @n6.d
    public final p X0() {
        return R("SHA-1");
    }

    @Override // i6.o
    public int Y() throws EOFException {
        return j.h(readInt());
    }

    @n6.d
    public final p Y0() {
        return R("SHA-256");
    }

    @s4.h(name = "getByte")
    public final byte Z(long j7) {
        j.e(a1(), j7, 1L);
        j0 j0Var = this.f11238k;
        if (j0Var == null) {
            u4.l0.m(null);
            throw null;
        } else if (a1() - j7 < j7) {
            long a12 = a1();
            while (a12 > j7) {
                j0Var = j0Var.f11218g;
                u4.l0.m(j0Var);
                a12 -= j0Var.f11214c - j0Var.f11213b;
            }
            u4.l0.m(j0Var);
            return j0Var.f11212a[(int) ((j0Var.f11213b + j7) - a12)];
        } else {
            long j8 = 0;
            while (true) {
                long j9 = (j0Var.f11214c - j0Var.f11213b) + j8;
                if (j9 > j7) {
                    u4.l0.m(j0Var);
                    return j0Var.f11212a[(int) ((j0Var.f11213b + j7) - j8)];
                }
                j0Var = j0Var.f11217f;
                u4.l0.m(j0Var);
                j8 = j9;
            }
        }
    }

    @n6.d
    public final p Z0() {
        return R("SHA-512");
    }

    @s4.h(name = "size")
    public final long a1() {
        return this.f11239l;
    }

    @Override // i6.o
    public long b0(@n6.d p pVar) {
        u4.l0.p(pVar, "targetBytes");
        return U(pVar, 0L);
    }

    @n6.d
    public final p b1() {
        if (a1() <= ((long) Integer.MAX_VALUE)) {
            return c1((int) a1());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + a1()).toString());
    }

    @Override // i6.o0
    @n6.d
    public q0 c() {
        return q0.f11267d;
    }

    @Override // i6.o
    public boolean c0() {
        return this.f11239l == 0;
    }

    @n6.d
    public final p c1(int i7) {
        if (i7 == 0) {
            return p.f11251o;
        }
        j.e(a1(), 0L, i7);
        j0 j0Var = this.f11238k;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            u4.l0.m(j0Var);
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
        j0 j0Var2 = this.f11238k;
        int i13 = 0;
        while (i8 < i7) {
            u4.l0.m(j0Var2);
            bArr[i13] = j0Var2.f11212a;
            i8 += j0Var2.f11214c - j0Var2.f11213b;
            iArr[i13] = Math.min(i8, i7);
            iArr[i13 + i10] = j0Var2.f11213b;
            j0Var2.f11215d = true;
            i13++;
            j0Var2 = j0Var2.f11217f;
        }
        return new l0(bArr, iArr);
    }

    @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final p d0(String str, p pVar) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(pVar.H(), str));
            j0 j0Var = this.f11238k;
            if (j0Var != null) {
                byte[] bArr = j0Var.f11212a;
                int i7 = j0Var.f11213b;
                mac.update(bArr, i7, j0Var.f11214c - i7);
                j0 j0Var2 = j0Var.f11217f;
                u4.l0.m(j0Var2);
                while (j0Var2 != j0Var) {
                    byte[] bArr2 = j0Var2.f11212a;
                    int i8 = j0Var2.f11213b;
                    mac.update(bArr2, i8, j0Var2.f11214c - i8);
                    j0Var2 = j0Var2.f11217f;
                    u4.l0.m(j0Var2);
                }
            }
            byte[] doFinal = mac.doFinal();
            u4.l0.o(doFinal, "mac.doFinal()");
            return new p(doFinal);
        } catch (InvalidKeyException e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    @n6.d
    public final j0 d1(int i7) {
        if (i7 >= 1 && i7 <= 8192) {
            j0 j0Var = this.f11238k;
            if (j0Var != null) {
                u4.l0.m(j0Var);
                j0 j0Var2 = j0Var.f11218g;
                u4.l0.m(j0Var2);
                return (j0Var2.f11214c + i7 > 8192 || !j0Var2.f11216e) ? j0Var2.c(k0.e()) : j0Var2;
            }
            j0 e7 = k0.e();
            this.f11238k = e7;
            e7.f11218g = e7;
            e7.f11217f = e7;
            return e7;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @s4.h(name = "-deprecated_getByte")
    @v3.k(level = v3.m.ERROR, message = "moved to operator function", replaceWith = @b1(expression = "this[index]", imports = {}))
    public final byte e(long j7) {
        return Z(j7);
    }

    @Override // i6.n
    @n6.d
    /* renamed from: e1  reason: merged with bridge method [inline-methods] */
    public m K(@n6.d p pVar) {
        u4.l0.p(pVar, "byteString");
        pVar.p0(this, 0, pVar.c0());
        return this;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (a1() == mVar.a1()) {
                if (a1() == 0) {
                    return true;
                }
                j0 j0Var = this.f11238k;
                u4.l0.m(j0Var);
                j0 j0Var2 = mVar.f11238k;
                u4.l0.m(j0Var2);
                int i7 = j0Var.f11213b;
                int i8 = j0Var2.f11213b;
                long j7 = 0;
                while (j7 < a1()) {
                    long min = Math.min(j0Var.f11214c - i7, j0Var2.f11214c - i8);
                    long j8 = 0;
                    while (j8 < min) {
                        int i9 = i7 + 1;
                        int i10 = i8 + 1;
                        if (j0Var.f11212a[i7] == j0Var2.f11212a[i8]) {
                            j8++;
                            i7 = i9;
                            i8 = i10;
                        }
                    }
                    if (i7 == j0Var.f11214c) {
                        j0Var = j0Var.f11217f;
                        u4.l0.m(j0Var);
                        i7 = j0Var.f11213b;
                    }
                    if (i8 == j0Var2.f11214c) {
                        j0Var2 = j0Var2.f11217f;
                        u4.l0.m(j0Var2);
                        i8 = j0Var2.f11213b;
                    }
                    j7 += min;
                }
                return true;
            }
        }
        return false;
    }

    @n6.d
    public final p f0(@n6.d p pVar) {
        u4.l0.p(pVar, x2.f10960j);
        return d0("HmacSHA1", pVar);
    }

    @Override // i6.n
    @n6.d
    /* renamed from: f1  reason: merged with bridge method [inline-methods] */
    public m M(@n6.d p pVar, int i7, int i8) {
        u4.l0.p(pVar, "byteString");
        pVar.p0(this, i7, i8);
        return this;
    }

    @Override // i6.n, i6.m0, java.io.Flushable
    public void flush() {
    }

    @Override // i6.o
    @n6.d
    public m g() {
        return this;
    }

    @Override // i6.o
    public int g0(@n6.d d0 d0Var) {
        u4.l0.p(d0Var, "options");
        int e02 = j6.a.e0(this, d0Var, false, 2, null);
        if (e02 == -1) {
            return -1;
        }
        skip(d0Var.f()[e02].c0());
        return e02;
    }

    @Override // i6.n
    @n6.d
    /* renamed from: g1  reason: merged with bridge method [inline-methods] */
    public m N(@n6.d o0 o0Var, long j7) throws IOException {
        u4.l0.p(o0Var, "source");
        while (j7 > 0) {
            long l02 = o0Var.l0(this, j7);
            if (l02 == -1) {
                throw new EOFException();
            }
            j7 -= l02;
        }
        return this;
    }

    @Override // i6.o
    @n6.d
    public byte[] h0(long j7) throws EOFException {
        if (!(j7 >= 0 && j7 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        } else if (a1() >= j7) {
            byte[] bArr = new byte[(int) j7];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    @Override // i6.n
    @n6.d
    /* renamed from: h1  reason: merged with bridge method [inline-methods] */
    public m k0(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "source");
        return n(bArr, 0, bArr.length);
    }

    public int hashCode() {
        j0 j0Var = this.f11238k;
        if (j0Var != null) {
            int i7 = 1;
            do {
                int i8 = j0Var.f11214c;
                for (int i9 = j0Var.f11213b; i9 < i8; i9++) {
                    i7 = (i7 * 31) + j0Var.f11212a[i9];
                }
                j0Var = j0Var.f11217f;
                u4.l0.m(j0Var);
            } while (j0Var != this.f11238k);
            return i7;
        }
        return 0;
    }

    @Override // i6.o
    public boolean i0(long j7, @n6.d p pVar, int i7, int i8) {
        u4.l0.p(pVar, "bytes");
        if (j7 < 0 || i7 < 0 || i8 < 0 || a1() - j7 < i8 || pVar.c0() - i7 < i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (Z(i9 + j7) != pVar.r(i7 + i9)) {
                return false;
            }
        }
        return true;
    }

    @Override // i6.n
    @n6.d
    /* renamed from: i1  reason: merged with bridge method [inline-methods] */
    public m n(@n6.d byte[] bArr, int i7, int i8) {
        u4.l0.p(bArr, "source");
        long j7 = i8;
        j.e(bArr.length, i7, j7);
        int i9 = i8 + i7;
        while (i7 < i9) {
            j0 d12 = d1(1);
            int min = Math.min(i9 - i7, 8192 - d12.f11214c);
            int i10 = i7 + min;
            x3.o.W0(bArr, d12.f11212a, d12.f11214c, i7, i10);
            d12.f11214c += min;
            i7 = i10;
        }
        W0(a1() + j7);
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // i6.o
    @n6.d
    public m j() {
        return this;
    }

    @Override // i6.o
    @n6.d
    public String j0() {
        return m0(this.f11239l, i5.f.f11071b);
    }

    @Override // i6.n
    @n6.d
    /* renamed from: j1  reason: merged with bridge method [inline-methods] */
    public m e0(int i7) {
        j0 d12 = d1(1);
        byte[] bArr = d12.f11212a;
        int i8 = d12.f11214c;
        d12.f11214c = i8 + 1;
        bArr[i8] = (byte) i7;
        W0(a1() + 1);
        return this;
    }

    @s4.h(name = "-deprecated_size")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "size", imports = {}))
    public final long k() {
        return this.f11239l;
    }

    @Override // i6.n
    @n6.d
    /* renamed from: k1  reason: merged with bridge method [inline-methods] */
    public m J0(long j7) {
        boolean z6;
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (i7 == 0) {
            return e0(48);
        }
        int i8 = 1;
        if (i7 < 0) {
            j7 = -j7;
            if (j7 < 0) {
                return H0("-9223372036854775808");
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
        j0 d12 = d1(i8);
        byte[] bArr = d12.f11212a;
        int i9 = d12.f11214c + i8;
        while (j7 != 0) {
            long j8 = 10;
            i9--;
            bArr[i9] = j6.a.Z()[(int) (j7 % j8)];
            j7 /= j8;
        }
        if (z6) {
            bArr[i9 - 1] = (byte) 45;
        }
        d12.f11214c += i8;
        W0(a1() + i8);
        return this;
    }

    public final void l() {
        skip(a1());
    }

    @Override // i6.o0
    public long l0(@n6.d m mVar, long j7) {
        u4.l0.p(mVar, "sink");
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        } else if (a1() == 0) {
            return -1L;
        } else {
            if (j7 > a1()) {
                j7 = a1();
            }
            mVar.w(this, j7);
            return j7;
        }
    }

    @Override // i6.n
    @n6.d
    /* renamed from: l1  reason: merged with bridge method [inline-methods] */
    public m v(long j7) {
        if (j7 == 0) {
            return e0(48);
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
        j0 d12 = d1(i7);
        byte[] bArr = d12.f11212a;
        int i8 = d12.f11214c;
        for (int i9 = (i8 + i7) - 1; i9 >= i8; i9--) {
            bArr[i9] = j6.a.Z()[(int) (15 & j7)];
            j7 >>>= 4;
        }
        d12.f11214c += i7;
        W0(a1() + i7);
        return this;
    }

    @n6.d
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public m clone() {
        return t();
    }

    @Override // i6.o
    @n6.d
    public String m0(long j7, @n6.d Charset charset) throws EOFException {
        u4.l0.p(charset, "charset");
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (!(i7 >= 0 && j7 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        } else if (this.f11239l >= j7) {
            if (i7 == 0) {
                return "";
            }
            j0 j0Var = this.f11238k;
            u4.l0.m(j0Var);
            int i8 = j0Var.f11213b;
            if (i8 + j7 > j0Var.f11214c) {
                return new String(h0(j7), charset);
            }
            int i9 = (int) j7;
            String str = new String(j0Var.f11212a, i8, i9, charset);
            int i10 = j0Var.f11213b + i9;
            j0Var.f11213b = i10;
            this.f11239l -= j7;
            if (i10 == j0Var.f11214c) {
                this.f11238k = j0Var.b();
                k0.d(j0Var);
            }
            return str;
        } else {
            throw new EOFException();
        }
    }

    @Override // i6.n
    @n6.d
    /* renamed from: m1  reason: merged with bridge method [inline-methods] */
    public m J(int i7) {
        j0 d12 = d1(4);
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
        W0(a1() + 4);
        return this;
    }

    @Override // i6.o
    public boolean n0(long j7, @n6.d p pVar) {
        u4.l0.p(pVar, "bytes");
        return i0(j7, pVar, 0, pVar.c0());
    }

    @Override // i6.n
    @n6.d
    /* renamed from: n1  reason: merged with bridge method [inline-methods] */
    public m a0(int i7) {
        return J(j.h(i7));
    }

    @Override // i6.o
    public int o() throws EOFException {
        int i7;
        int i8;
        int i9;
        if (a1() != 0) {
            byte Z = Z(0L);
            if ((Z & u4.o.f17448b) == 0) {
                i7 = Z & u4.o.f17449c;
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
                skip(1L);
                return r0.f11275c;
            } else {
                i7 = Z & 7;
                i8 = 4;
                i9 = 65536;
            }
            long j7 = i8;
            if (a1() < j7) {
                throw new EOFException("size < " + i8 + ": " + a1() + " (to read code point prefixed 0x" + j.m(Z) + ')');
            }
            for (int i10 = 1; i10 < i8; i10++) {
                long j8 = i10;
                byte Z2 = Z(j8);
                if ((Z2 & 192) != 128) {
                    skip(j8);
                    return r0.f11275c;
                }
                i7 = (i7 << 6) | (Z2 & r0.f11273a);
            }
            skip(j7);
            return i7 > 1114111 ? r0.f11275c : ((55296 <= i7 && 57343 >= i7) || i7 < i9) ? r0.f11275c : i7;
        }
        throw new EOFException();
    }

    @Override // i6.o
    public long o0(byte b7, long j7) {
        return s0(b7, j7, Long.MAX_VALUE);
    }

    @Override // i6.n
    @n6.d
    /* renamed from: o1  reason: merged with bridge method [inline-methods] */
    public m F0(long j7) {
        j0 d12 = d1(8);
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
        W0(a1() + 8);
        return this;
    }

    public final long p() {
        long a12 = a1();
        if (a12 == 0) {
            return 0L;
        }
        j0 j0Var = this.f11238k;
        u4.l0.m(j0Var);
        j0 j0Var2 = j0Var.f11218g;
        u4.l0.m(j0Var2);
        if (j0Var2.f11214c < 8192 && j0Var2.f11216e) {
            a12 -= r3 - j0Var2.f11213b;
        }
        return a12;
    }

    @n6.d
    public final p p0(@n6.d p pVar) {
        u4.l0.p(pVar, x2.f10960j);
        return d0("HmacSHA256", pVar);
    }

    @Override // i6.n
    @n6.d
    /* renamed from: p1  reason: merged with bridge method [inline-methods] */
    public m P(long j7) {
        return F0(j.i(j7));
    }

    @Override // i6.o
    @n6.d
    public String q(long j7) throws EOFException {
        return m0(j7, i5.f.f11071b);
    }

    @n6.d
    public final p q0(@n6.d p pVar) {
        u4.l0.p(pVar, x2.f10960j);
        return d0("HmacSHA512", pVar);
    }

    @Override // i6.n
    @n6.d
    /* renamed from: q1  reason: merged with bridge method [inline-methods] */
    public m F(int i7) {
        j0 d12 = d1(2);
        byte[] bArr = d12.f11212a;
        int i8 = d12.f11214c;
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i7 >>> 8) & 255);
        bArr[i9] = (byte) (i7 & 255);
        d12.f11214c = i9 + 1;
        W0(a1() + 2);
        return this;
    }

    @Override // i6.o
    public long r(@n6.d p pVar) throws IOException {
        u4.l0.p(pVar, "bytes");
        return W(pVar, 0L);
    }

    @Override // i6.o
    public short r0() throws EOFException {
        return j.j(readShort());
    }

    @Override // i6.n
    @n6.d
    /* renamed from: r1  reason: merged with bridge method [inline-methods] */
    public m B0(int i7) {
        return F(j.j((short) i7));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@n6.d ByteBuffer byteBuffer) throws IOException {
        u4.l0.p(byteBuffer, "sink");
        j0 j0Var = this.f11238k;
        if (j0Var != null) {
            int min = Math.min(byteBuffer.remaining(), j0Var.f11214c - j0Var.f11213b);
            byteBuffer.put(j0Var.f11212a, j0Var.f11213b, min);
            int i7 = j0Var.f11213b + min;
            j0Var.f11213b = i7;
            this.f11239l -= min;
            if (i7 == j0Var.f11214c) {
                this.f11238k = j0Var.b();
                k0.d(j0Var);
            }
            return min;
        }
        return -1;
    }

    @Override // i6.o
    public byte readByte() throws EOFException {
        if (a1() != 0) {
            j0 j0Var = this.f11238k;
            u4.l0.m(j0Var);
            int i7 = j0Var.f11213b;
            int i8 = j0Var.f11214c;
            int i9 = i7 + 1;
            byte b7 = j0Var.f11212a[i7];
            W0(a1() - 1);
            if (i9 == i8) {
                this.f11238k = j0Var.b();
                k0.d(j0Var);
            } else {
                j0Var.f11213b = i9;
            }
            return b7;
        }
        throw new EOFException();
    }

    @Override // i6.o
    public void readFully(@n6.d byte[] bArr) throws EOFException {
        u4.l0.p(bArr, "sink");
        int i7 = 0;
        while (i7 < bArr.length) {
            int read = read(bArr, i7, bArr.length - i7);
            if (read == -1) {
                throw new EOFException();
            }
            i7 += read;
        }
    }

    @Override // i6.o
    public int readInt() throws EOFException {
        if (a1() >= 4) {
            j0 j0Var = this.f11238k;
            u4.l0.m(j0Var);
            int i7 = j0Var.f11213b;
            int i8 = j0Var.f11214c;
            if (i8 - i7 < 4) {
                return ((readByte() & v3.t1.f17828n) << 24) | ((readByte() & v3.t1.f17828n) << 16) | ((readByte() & v3.t1.f17828n) << 8) | (readByte() & v3.t1.f17828n);
            }
            byte[] bArr = j0Var.f11212a;
            int i9 = i7 + 1;
            int i10 = i9 + 1;
            int i11 = ((bArr[i7] & v3.t1.f17828n) << 24) | ((bArr[i9] & v3.t1.f17828n) << 16);
            int i12 = i10 + 1;
            int i13 = i11 | ((bArr[i10] & v3.t1.f17828n) << 8);
            int i14 = i12 + 1;
            int i15 = i13 | (bArr[i12] & v3.t1.f17828n);
            W0(a1() - 4);
            if (i14 == i8) {
                this.f11238k = j0Var.b();
                k0.d(j0Var);
            } else {
                j0Var.f11213b = i14;
            }
            return i15;
        }
        throw new EOFException();
    }

    @Override // i6.o
    public long readLong() throws EOFException {
        if (a1() >= 8) {
            j0 j0Var = this.f11238k;
            u4.l0.m(j0Var);
            int i7 = j0Var.f11213b;
            int i8 = j0Var.f11214c;
            if (i8 - i7 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
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
            W0(a1() - 8);
            if (i10 == i8) {
                this.f11238k = j0Var.b();
                k0.d(j0Var);
            } else {
                j0Var.f11213b = i10;
            }
            return j12;
        }
        throw new EOFException();
    }

    @Override // i6.o
    public short readShort() throws EOFException {
        if (a1() >= 2) {
            j0 j0Var = this.f11238k;
            u4.l0.m(j0Var);
            int i7 = j0Var.f11213b;
            int i8 = j0Var.f11214c;
            if (i8 - i7 < 2) {
                return (short) (((readByte() & v3.t1.f17828n) << 8) | (readByte() & v3.t1.f17828n));
            }
            byte[] bArr = j0Var.f11212a;
            int i9 = i7 + 1;
            int i10 = i9 + 1;
            int i11 = ((bArr[i7] & v3.t1.f17828n) << 8) | (bArr[i9] & v3.t1.f17828n);
            W0(a1() - 2);
            if (i10 == i8) {
                this.f11238k = j0Var.b();
                k0.d(j0Var);
            } else {
                j0Var.f11213b = i10;
            }
            return (short) i11;
        }
        throw new EOFException();
    }

    @Override // i6.o
    public long s0(byte b7, long j7, long j8) {
        j0 j0Var;
        int i7;
        long j9 = 0;
        if (!(0 <= j7 && j8 >= j7)) {
            throw new IllegalArgumentException(("size=" + a1() + " fromIndex=" + j7 + " toIndex=" + j8).toString());
        }
        if (j8 > a1()) {
            j8 = a1();
        }
        if (j7 == j8 || (j0Var = this.f11238k) == null) {
            return -1L;
        }
        if (a1() - j7 < j7) {
            j9 = a1();
            while (j9 > j7) {
                j0Var = j0Var.f11218g;
                u4.l0.m(j0Var);
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
                u4.l0.m(j0Var);
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
            u4.l0.m(j0Var);
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
            u4.l0.m(j0Var);
            j7 = j9;
        }
        return -1L;
        return (i7 - j0Var.f11213b) + j9;
    }

    @Override // i6.n
    @n6.d
    /* renamed from: s1  reason: merged with bridge method [inline-methods] */
    public m D0(@n6.d String str, int i7, int i8, @n6.d Charset charset) {
        u4.l0.p(str, v.b.f17140e);
        u4.l0.p(charset, "charset");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i7).toString());
        }
        if (!(i8 >= i7)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i8 + " < " + i7).toString());
        }
        if (!(i8 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i8 + " > " + str.length()).toString());
        } else if (u4.l0.g(charset, i5.f.f11071b)) {
            return s(str, i7, i8);
        } else {
            String substring = str.substring(i7, i8);
            u4.l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (substring != null) {
                byte[] bytes = substring.getBytes(charset);
                u4.l0.o(bytes, "(this as java.lang.String).getBytes(charset)");
                return n(bytes, 0, bytes.length);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Override // i6.o
    public void skip(long j7) throws EOFException {
        while (j7 > 0) {
            j0 j0Var = this.f11238k;
            if (j0Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j7, j0Var.f11214c - j0Var.f11213b);
            long j8 = min;
            W0(a1() - j8);
            j7 -= j8;
            int i7 = j0Var.f11213b + min;
            j0Var.f11213b = i7;
            if (i7 == j0Var.f11214c) {
                this.f11238k = j0Var.b();
                k0.d(j0Var);
            }
        }
    }

    @n6.d
    public final m t() {
        m mVar = new m();
        if (a1() != 0) {
            j0 j0Var = this.f11238k;
            u4.l0.m(j0Var);
            j0 d7 = j0Var.d();
            mVar.f11238k = d7;
            d7.f11218g = d7;
            d7.f11217f = d7;
            for (j0 j0Var2 = j0Var.f11217f; j0Var2 != j0Var; j0Var2 = j0Var2.f11217f) {
                j0 j0Var3 = d7.f11218g;
                u4.l0.m(j0Var3);
                u4.l0.m(j0Var2);
                j0Var3.c(j0Var2.d());
            }
            mVar.W0(a1());
        }
        return mVar;
    }

    @Override // i6.o
    @n6.e
    public String t0() throws EOFException {
        long N0 = N0((byte) 10);
        if (N0 != -1) {
            return j6.a.b0(this, N0);
        }
        if (a1() != 0) {
            return q(a1());
        }
        return null;
    }

    @Override // i6.n
    @n6.d
    /* renamed from: t1  reason: merged with bridge method [inline-methods] */
    public m y(@n6.d String str, @n6.d Charset charset) {
        u4.l0.p(str, v.b.f17140e);
        u4.l0.p(charset, "charset");
        return D0(str, 0, str.length(), charset);
    }

    @n6.d
    public String toString() {
        return b1().toString();
    }

    @n6.d
    public final m u(@n6.d m mVar, long j7) {
        u4.l0.p(mVar, "out");
        return A(mVar, j7, this.f11239l - j7);
    }

    @n6.d
    @s4.i
    public final m u1(@n6.d OutputStream outputStream) throws IOException {
        return w1(this, outputStream, 0L, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3 A[EDGE_INSN: B:46:0x00b3->B:38:0x00b3 BREAK  A[LOOP:0: B:5:0x0011->B:50:?], SYNTHETIC] */
    @Override // i6.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long v0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.a1()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lc1
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        L11:
            i6.j0 r7 = r15.f11238k
            u4.l0.m(r7)
            byte[] r8 = r7.f11212a
            int r9 = r7.f11213b
            int r10 = r7.f11214c
        L1c:
            if (r9 >= r10) goto L9f
            r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L6f
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L6f
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L42
            if (r13 != 0) goto L3c
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L3c
            goto L42
        L3c:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L7b
        L42:
            i6.m r0 = new i6.m
            r0.<init>()
            i6.m r0 = r0.J0(r3)
            i6.m r0 = r0.e0(r11)
            if (r1 != 0) goto L54
            r0.readByte()
        L54:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.j0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6f:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L80
            if (r0 != 0) goto L80
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L7b:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L1c
        L80:
            if (r0 == 0) goto L84
            r2 = r13
            goto L9f
        L84:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            java.lang.String r2 = i6.j.m(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9f:
            if (r9 != r10) goto Lab
            i6.j0 r8 = r7.b()
            r15.f11238k = r8
            i6.k0.d(r7)
            goto Lad
        Lab:
            r7.f11213b = r9
        Lad:
            if (r2 != 0) goto Lb3
            i6.j0 r7 = r15.f11238k
            if (r7 != 0) goto L11
        Lb3:
            long r5 = r15.a1()
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.W0(r5)
            if (r1 == 0) goto Lbf
            goto Lc0
        Lbf:
            long r3 = -r3
        Lc0:
            return r3
        Lc1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.m.v0():long");
    }

    @n6.d
    @s4.i
    public final m v1(@n6.d OutputStream outputStream, long j7) throws IOException {
        u4.l0.p(outputStream, "out");
        j.e(this.f11239l, 0L, j7);
        j0 j0Var = this.f11238k;
        while (j7 > 0) {
            u4.l0.m(j0Var);
            int min = (int) Math.min(j7, j0Var.f11214c - j0Var.f11213b);
            outputStream.write(j0Var.f11212a, j0Var.f11213b, min);
            int i7 = j0Var.f11213b + min;
            j0Var.f11213b = i7;
            long j8 = min;
            this.f11239l -= j8;
            j7 -= j8;
            if (i7 == j0Var.f11214c) {
                j0 b7 = j0Var.b();
                this.f11238k = b7;
                k0.d(j0Var);
                j0Var = b7;
            }
        }
        return this;
    }

    @Override // i6.m0
    public void w(@n6.d m mVar, long j7) {
        j0 j0Var;
        u4.l0.p(mVar, "source");
        if (!(mVar != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        j.e(mVar.a1(), 0L, j7);
        while (j7 > 0) {
            j0 j0Var2 = mVar.f11238k;
            u4.l0.m(j0Var2);
            int i7 = j0Var2.f11214c;
            u4.l0.m(mVar.f11238k);
            if (j7 < i7 - r2.f11213b) {
                j0 j0Var3 = this.f11238k;
                if (j0Var3 != null) {
                    u4.l0.m(j0Var3);
                    j0Var = j0Var3.f11218g;
                } else {
                    j0Var = null;
                }
                if (j0Var != null && j0Var.f11216e) {
                    if ((j0Var.f11214c + j7) - (j0Var.f11215d ? 0 : j0Var.f11213b) <= 8192) {
                        j0 j0Var4 = mVar.f11238k;
                        u4.l0.m(j0Var4);
                        j0Var4.g(j0Var, (int) j7);
                        mVar.W0(mVar.a1() - j7);
                        W0(a1() + j7);
                        return;
                    }
                }
                j0 j0Var5 = mVar.f11238k;
                u4.l0.m(j0Var5);
                mVar.f11238k = j0Var5.e((int) j7);
            }
            j0 j0Var6 = mVar.f11238k;
            u4.l0.m(j0Var6);
            long j8 = j0Var6.f11214c - j0Var6.f11213b;
            mVar.f11238k = j0Var6.b();
            j0 j0Var7 = this.f11238k;
            if (j0Var7 == null) {
                this.f11238k = j0Var6;
                j0Var6.f11218g = j0Var6;
                j0Var6.f11217f = j0Var6;
            } else {
                u4.l0.m(j0Var7);
                j0 j0Var8 = j0Var7.f11218g;
                u4.l0.m(j0Var8);
                j0Var8.c(j0Var6).a();
            }
            mVar.W0(mVar.a1() - j8);
            W0(a1() + j8);
            j7 -= j8;
        }
    }

    @n6.d
    public final p w0() {
        return R("MD5");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@n6.d ByteBuffer byteBuffer) throws IOException {
        u4.l0.p(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i7 = remaining;
        while (i7 > 0) {
            j0 d12 = d1(1);
            int min = Math.min(i7, 8192 - d12.f11214c);
            byteBuffer.get(d12.f11212a, d12.f11214c, min);
            i7 -= min;
            d12.f11214c += min;
        }
        this.f11239l += remaining;
        return remaining;
    }

    @Override // i6.o
    @n6.d
    public p x() {
        return z(a1());
    }

    @Override // i6.o
    public long x0() throws EOFException {
        return j.i(readLong());
    }

    @Override // i6.n
    @n6.d
    /* renamed from: x1  reason: merged with bridge method [inline-methods] */
    public m H0(@n6.d String str) {
        u4.l0.p(str, v.b.f17140e);
        return s(str, 0, str.length());
    }

    @Override // i6.o
    @n6.d
    public String y0(long j7) throws EOFException {
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j7).toString());
        }
        long j8 = j7 != Long.MAX_VALUE ? j7 + 1 : Long.MAX_VALUE;
        byte b7 = (byte) 10;
        long s02 = s0(b7, 0L, j8);
        if (s02 != -1) {
            return j6.a.b0(this, s02);
        }
        if (j8 < a1() && Z(j8 - 1) == ((byte) 13) && Z(j8) == b7) {
            return j6.a.b0(this, j8);
        }
        m mVar = new m();
        A(mVar, 0L, Math.min(32, a1()));
        throw new EOFException("\\n not found: limit=" + Math.min(a1(), j7) + " content=" + mVar.x().w() + i5.h0.F);
    }

    @Override // i6.n
    @n6.d
    /* renamed from: y1  reason: merged with bridge method [inline-methods] */
    public m s(@n6.d String str, int i7, int i8) {
        u4.l0.p(str, v.b.f17140e);
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
                j0 d12 = d1(1);
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
                W0(a1() + i12);
                i7 = i10;
            } else {
                if (charAt < 2048) {
                    j0 d13 = d1(2);
                    byte[] bArr2 = d13.f11212a;
                    int i13 = d13.f11214c;
                    bArr2[i13] = (byte) ((charAt >> 6) | 192);
                    bArr2[i13 + 1] = (byte) ((charAt & '?') | 128);
                    d13.f11214c = i13 + 2;
                    W0(a1() + 2);
                } else if (charAt < 55296 || charAt > 57343) {
                    j0 d14 = d1(3);
                    byte[] bArr3 = d14.f11212a;
                    int i14 = d14.f11214c;
                    bArr3[i14] = (byte) ((charAt >> '\f') | 224);
                    bArr3[i14 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                    bArr3[i14 + 2] = (byte) ((charAt & '?') | 128);
                    d14.f11214c = i14 + 3;
                    W0(a1() + 3);
                } else {
                    int i15 = i7 + 1;
                    char charAt3 = i15 < i8 ? str.charAt(i15) : (char) 0;
                    if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                        e0(63);
                        i7 = i15;
                    } else {
                        int i16 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        j0 d15 = d1(4);
                        byte[] bArr4 = d15.f11212a;
                        int i17 = d15.f11214c;
                        bArr4[i17] = (byte) ((i16 >> 18) | 240);
                        bArr4[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                        bArr4[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                        bArr4[i17 + 3] = (byte) ((i16 & 63) | 128);
                        d15.f11214c = i17 + 4;
                        W0(a1() + 4);
                        i7 += 2;
                    }
                }
                i7++;
            }
        }
        return this;
    }

    @Override // i6.o
    @n6.d
    public p z(long j7) throws EOFException {
        if (!(j7 >= 0 && j7 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        } else if (a1() >= j7) {
            if (j7 >= 4096) {
                p c12 = c1((int) j7);
                skip(j7);
                return c12;
            }
            return new p(h0(j7));
        } else {
            throw new EOFException();
        }
    }

    @n6.d
    @s4.i
    public final a z0() {
        return E0(this, null, 1, null);
    }

    @Override // i6.n
    @n6.d
    /* renamed from: z1  reason: merged with bridge method [inline-methods] */
    public m H(int i7) {
        if (i7 < 128) {
            e0(i7);
        } else if (i7 < 2048) {
            j0 d12 = d1(2);
            byte[] bArr = d12.f11212a;
            int i8 = d12.f11214c;
            bArr[i8] = (byte) ((i7 >> 6) | 192);
            bArr[i8 + 1] = (byte) ((i7 & 63) | 128);
            d12.f11214c = i8 + 2;
            W0(a1() + 2);
        } else if (55296 <= i7 && 57343 >= i7) {
            e0(63);
        } else if (i7 < 65536) {
            j0 d13 = d1(3);
            byte[] bArr2 = d13.f11212a;
            int i9 = d13.f11214c;
            bArr2[i9] = (byte) ((i7 >> 12) | 224);
            bArr2[i9 + 1] = (byte) (((i7 >> 6) & 63) | 128);
            bArr2[i9 + 2] = (byte) ((i7 & 63) | 128);
            d13.f11214c = i9 + 3;
            W0(a1() + 3);
        } else if (i7 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + j.n(i7));
        } else {
            j0 d14 = d1(4);
            byte[] bArr3 = d14.f11212a;
            int i10 = d14.f11214c;
            bArr3[i10] = (byte) ((i7 >> 18) | 240);
            bArr3[i10 + 1] = (byte) (((i7 >> 12) & 63) | 128);
            bArr3[i10 + 2] = (byte) (((i7 >> 6) & 63) | 128);
            bArr3[i10 + 3] = (byte) ((i7 & 63) | 128);
            d14.f11214c = i10 + 4;
            W0(a1() + 4);
        }
        return this;
    }

    /* loaded from: classes.dex */
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(m.this.a1(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (m.this.a1() > 0) {
                return m.this.readByte() & v3.t1.f17828n;
            }
            return -1;
        }

        @n6.d
        public String toString() {
            return m.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@n6.d byte[] bArr, int i7, int i8) {
            u4.l0.p(bArr, "sink");
            return m.this.read(bArr, i7, i8);
        }
    }

    @Override // i6.o
    public int read(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    @Override // i6.o
    public int read(@n6.d byte[] bArr, int i7, int i8) {
        u4.l0.p(bArr, "sink");
        j.e(bArr.length, i7, i8);
        j0 j0Var = this.f11238k;
        if (j0Var != null) {
            int min = Math.min(i8, j0Var.f11214c - j0Var.f11213b);
            byte[] bArr2 = j0Var.f11212a;
            int i9 = j0Var.f11213b;
            x3.o.W0(bArr2, bArr, i7, i9, i9 + min);
            j0Var.f11213b += min;
            W0(a1() - min);
            if (j0Var.f11213b == j0Var.f11214c) {
                this.f11238k = j0Var.b();
                k0.d(j0Var);
                return min;
            }
            return min;
        }
        return -1;
    }
}
