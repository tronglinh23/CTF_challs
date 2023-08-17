package i6;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class v implements o0 {

    /* renamed from: k  reason: collision with root package name */
    public byte f11288k;

    /* renamed from: l  reason: collision with root package name */
    public final i0 f11289l;

    /* renamed from: m  reason: collision with root package name */
    public final Inflater f11290m;

    /* renamed from: n  reason: collision with root package name */
    public final y f11291n;

    /* renamed from: o  reason: collision with root package name */
    public final CRC32 f11292o;

    public v(@n6.d o0 o0Var) {
        u4.l0.p(o0Var, "source");
        i0 i0Var = new i0(o0Var);
        this.f11289l = i0Var;
        Inflater inflater = new Inflater(true);
        this.f11290m = inflater;
        this.f11291n = new y((o) i0Var, inflater);
        this.f11292o = new CRC32();
    }

    public final void a(String str, int i7, int i8) {
        if (i8 == i7) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i8), Integer.valueOf(i7)}, 3));
        u4.l0.o(format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }

    public final void b() throws IOException {
        this.f11289l.G0(10L);
        byte Z = this.f11289l.f11205k.Z(3L);
        boolean z6 = ((Z >> 1) & 1) == 1;
        if (z6) {
            e(this.f11289l.f11205k, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f11289l.readShort());
        this.f11289l.skip(8L);
        if (((Z >> 2) & 1) == 1) {
            this.f11289l.G0(2L);
            if (z6) {
                e(this.f11289l.f11205k, 0L, 2L);
            }
            long r02 = this.f11289l.f11205k.r0();
            this.f11289l.G0(r02);
            if (z6) {
                e(this.f11289l.f11205k, 0L, r02);
            }
            this.f11289l.skip(r02);
        }
        if (((Z >> 3) & 1) == 1) {
            long N0 = this.f11289l.N0((byte) 0);
            if (N0 == -1) {
                throw new EOFException();
            }
            if (z6) {
                e(this.f11289l.f11205k, 0L, N0 + 1);
            }
            this.f11289l.skip(N0 + 1);
        }
        if (((Z >> 4) & 1) == 1) {
            long N02 = this.f11289l.N0((byte) 0);
            if (N02 == -1) {
                throw new EOFException();
            }
            if (z6) {
                e(this.f11289l.f11205k, 0L, N02 + 1);
            }
            this.f11289l.skip(N02 + 1);
        }
        if (z6) {
            a("FHCRC", this.f11289l.r0(), (short) this.f11292o.getValue());
            this.f11292o.reset();
        }
    }

    @Override // i6.o0
    @n6.d
    public q0 c() {
        return this.f11289l.c();
    }

    @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f11291n.close();
    }

    public final void d() throws IOException {
        a("CRC", this.f11289l.Y(), (int) this.f11292o.getValue());
        a("ISIZE", this.f11289l.Y(), (int) this.f11290m.getBytesWritten());
    }

    public final void e(m mVar, long j7, long j8) {
        j0 j0Var = mVar.f11238k;
        u4.l0.m(j0Var);
        while (true) {
            int i7 = j0Var.f11214c;
            int i8 = j0Var.f11213b;
            if (j7 < i7 - i8) {
                break;
            }
            j7 -= i7 - i8;
            j0Var = j0Var.f11217f;
            u4.l0.m(j0Var);
        }
        while (j8 > 0) {
            int min = (int) Math.min(j0Var.f11214c - r6, j8);
            this.f11292o.update(j0Var.f11212a, (int) (j0Var.f11213b + j7), min);
            j8 -= min;
            j0Var = j0Var.f11217f;
            u4.l0.m(j0Var);
            j7 = 0;
        }
    }

    @Override // i6.o0
    public long l0(@n6.d m mVar, long j7) throws IOException {
        u4.l0.p(mVar, "sink");
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        } else if (i7 == 0) {
            return 0L;
        } else {
            if (this.f11288k == 0) {
                b();
                this.f11288k = (byte) 1;
            }
            if (this.f11288k == 1) {
                long a12 = mVar.a1();
                long l02 = this.f11291n.l0(mVar, j7);
                if (l02 != -1) {
                    e(mVar, a12, l02);
                    return l02;
                }
                this.f11288k = (byte) 2;
            }
            if (this.f11288k == 2) {
                d();
                this.f11288k = (byte) 3;
                if (!this.f11289l.c0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }
}