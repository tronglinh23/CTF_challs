package h6;

import i6.m;
import i6.o;
import i6.p;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import u4.l0;
/* loaded from: classes.dex */
public final class h implements Closeable {

    /* renamed from: k  reason: collision with root package name */
    public boolean f10419k;

    /* renamed from: l  reason: collision with root package name */
    public int f10420l;

    /* renamed from: m  reason: collision with root package name */
    public long f10421m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10422n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10423o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10424p;

    /* renamed from: q  reason: collision with root package name */
    public final m f10425q;

    /* renamed from: r  reason: collision with root package name */
    public final m f10426r;

    /* renamed from: s  reason: collision with root package name */
    public c f10427s;

    /* renamed from: t  reason: collision with root package name */
    public final byte[] f10428t;

    /* renamed from: u  reason: collision with root package name */
    public final m.a f10429u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f10430v;
    @n6.d

    /* renamed from: w  reason: collision with root package name */
    public final o f10431w;

    /* renamed from: x  reason: collision with root package name */
    public final a f10432x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f10433y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f10434z;

    /* loaded from: classes.dex */
    public interface a {
        void b(@n6.d p pVar) throws IOException;

        void g(@n6.d p pVar);

        void h(@n6.d p pVar);

        void i(@n6.d String str) throws IOException;

        void j(int i7, @n6.d String str);
    }

    public h(boolean z6, @n6.d o oVar, @n6.d a aVar, boolean z7, boolean z8) {
        l0.p(oVar, "source");
        l0.p(aVar, "frameCallback");
        this.f10430v = z6;
        this.f10431w = oVar;
        this.f10432x = aVar;
        this.f10433y = z7;
        this.f10434z = z8;
        this.f10425q = new m();
        this.f10426r = new m();
        this.f10428t = z6 ? null : new byte[4];
        this.f10429u = z6 ? null : new m.a();
    }

    @n6.d
    public final o a() {
        return this.f10431w;
    }

    public final void b() throws IOException {
        e();
        if (this.f10423o) {
            d();
        } else {
            h();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        c cVar = this.f10427s;
        if (cVar != null) {
            cVar.close();
        }
    }

    public final void d() throws IOException {
        short s6;
        String str;
        long j7 = this.f10421m;
        if (j7 > 0) {
            this.f10431w.K0(this.f10425q, j7);
            if (!this.f10430v) {
                m mVar = this.f10425q;
                m.a aVar = this.f10429u;
                l0.m(aVar);
                mVar.C0(aVar);
                this.f10429u.e(0L);
                g gVar = g.f10418w;
                m.a aVar2 = this.f10429u;
                byte[] bArr = this.f10428t;
                l0.m(bArr);
                gVar.c(aVar2, bArr);
                this.f10429u.close();
            }
        }
        switch (this.f10420l) {
            case 8:
                long a12 = this.f10425q.a1();
                if (a12 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (a12 != 0) {
                    s6 = this.f10425q.readShort();
                    str = this.f10425q.j0();
                    String b7 = g.f10418w.b(s6);
                    if (b7 != null) {
                        throw new ProtocolException(b7);
                    }
                } else {
                    s6 = 1005;
                    str = "";
                }
                this.f10432x.j(s6, str);
                this.f10419k = true;
                return;
            case 9:
                this.f10432x.g(this.f10425q.x());
                return;
            case 10:
                this.f10432x.h(this.f10425q.x());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + s5.d.Y(this.f10420l));
        }
    }

    public final void e() throws IOException, ProtocolException {
        boolean z6;
        if (this.f10419k) {
            throw new IOException("closed");
        }
        long j7 = this.f10431w.c().j();
        this.f10431w.c().b();
        try {
            int b7 = s5.d.b(this.f10431w.readByte(), 255);
            this.f10431w.c().i(j7, TimeUnit.NANOSECONDS);
            int i7 = b7 & 15;
            this.f10420l = i7;
            boolean z7 = (b7 & 128) != 0;
            this.f10422n = z7;
            boolean z8 = (b7 & 8) != 0;
            this.f10423o = z8;
            if (z8 && !z7) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z9 = (b7 & 64) != 0;
            if (i7 == 1 || i7 == 2) {
                if (!z9) {
                    z6 = false;
                } else if (!this.f10433y) {
                    throw new ProtocolException("Unexpected rsv1 flag");
                } else {
                    z6 = true;
                }
                this.f10424p = z6;
            } else if (z9) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b7 & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b7 & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int b8 = s5.d.b(this.f10431w.readByte(), 255);
            boolean z10 = (b8 & 128) != 0;
            if (z10 == this.f10430v) {
                throw new ProtocolException(this.f10430v ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j8 = b8 & 127;
            this.f10421m = j8;
            if (j8 == ((long) g.f10413r)) {
                this.f10421m = s5.d.c(this.f10431w.readShort(), 65535);
            } else if (j8 == 127) {
                long readLong = this.f10431w.readLong();
                this.f10421m = readLong;
                if (readLong < 0) {
                    throw new ProtocolException("Frame length 0x" + s5.d.Z(this.f10421m) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f10423o && this.f10421m > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z10) {
                o oVar = this.f10431w;
                byte[] bArr = this.f10428t;
                l0.m(bArr);
                oVar.readFully(bArr);
            }
        } catch (Throwable th) {
            this.f10431w.c().i(j7, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    public final void f() throws IOException {
        while (!this.f10419k) {
            long j7 = this.f10421m;
            if (j7 > 0) {
                this.f10431w.K0(this.f10426r, j7);
                if (!this.f10430v) {
                    m mVar = this.f10426r;
                    m.a aVar = this.f10429u;
                    l0.m(aVar);
                    mVar.C0(aVar);
                    this.f10429u.e(this.f10426r.a1() - this.f10421m);
                    g gVar = g.f10418w;
                    m.a aVar2 = this.f10429u;
                    byte[] bArr = this.f10428t;
                    l0.m(bArr);
                    gVar.c(aVar2, bArr);
                    this.f10429u.close();
                }
            }
            if (this.f10422n) {
                return;
            }
            i();
            if (this.f10420l != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + s5.d.Y(this.f10420l));
            }
        }
        throw new IOException("closed");
    }

    public final void h() throws IOException {
        int i7 = this.f10420l;
        if (i7 != 1 && i7 != 2) {
            throw new ProtocolException("Unknown opcode: " + s5.d.Y(i7));
        }
        f();
        if (this.f10424p) {
            c cVar = this.f10427s;
            if (cVar == null) {
                cVar = new c(this.f10434z);
                this.f10427s = cVar;
            }
            cVar.a(this.f10426r);
        }
        if (i7 == 1) {
            this.f10432x.i(this.f10426r.j0());
        } else {
            this.f10432x.b(this.f10426r.x());
        }
    }

    public final void i() throws IOException {
        while (!this.f10419k) {
            e();
            if (!this.f10423o) {
                return;
            }
            d();
        }
    }
}
