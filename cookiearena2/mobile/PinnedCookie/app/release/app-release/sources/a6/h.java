package a6;

import a6.d;
import d5.u;
import i6.o;
import i6.o0;
import i6.p;
import i6.q0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class h implements Closeable {
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public static final Logger f415o;

    /* renamed from: p  reason: collision with root package name */
    public static final a f416p = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public final b f417k;

    /* renamed from: l  reason: collision with root package name */
    public final d.a f418l;

    /* renamed from: m  reason: collision with root package name */
    public final o f419m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f420n;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.d
        public final Logger a() {
            return h.f415o;
        }

        public final int b(int i7, int i8, int i9) throws IOException {
            if ((i8 & 8) != 0) {
                i7--;
            }
            if (i9 <= i7) {
                return i7 - i9;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i9 + " > remaining length " + i7);
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements o0 {

        /* renamed from: k  reason: collision with root package name */
        public int f421k;

        /* renamed from: l  reason: collision with root package name */
        public int f422l;

        /* renamed from: m  reason: collision with root package name */
        public int f423m;

        /* renamed from: n  reason: collision with root package name */
        public int f424n;

        /* renamed from: o  reason: collision with root package name */
        public int f425o;

        /* renamed from: p  reason: collision with root package name */
        public final o f426p;

        public b(@n6.d o oVar) {
            l0.p(oVar, "source");
            this.f426p = oVar;
        }

        public final int a() {
            return this.f422l;
        }

        public final int b() {
            return this.f424n;
        }

        @Override // i6.o0
        @n6.d
        public q0 c() {
            return this.f426p.c();
        }

        @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final int d() {
            return this.f421k;
        }

        public final int e() {
            return this.f425o;
        }

        public final int f() {
            return this.f423m;
        }

        public final void h() throws IOException {
            int i7 = this.f423m;
            int R = s5.d.R(this.f426p);
            this.f424n = R;
            this.f421k = R;
            int b7 = s5.d.b(this.f426p.readByte(), 255);
            this.f422l = s5.d.b(this.f426p.readByte(), 255);
            a aVar = h.f416p;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f303x.c(true, this.f423m, this.f421k, b7, this.f422l));
            }
            int readInt = this.f426p.readInt() & Integer.MAX_VALUE;
            this.f423m = readInt;
            if (b7 == 9) {
                if (readInt != i7) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
                return;
            }
            throw new IOException(b7 + " != TYPE_CONTINUATION");
        }

        public final void i(int i7) {
            this.f422l = i7;
        }

        public final void k(int i7) {
            this.f424n = i7;
        }

        public final void l(int i7) {
            this.f421k = i7;
        }

        @Override // i6.o0
        public long l0(@n6.d i6.m mVar, long j7) throws IOException {
            l0.p(mVar, "sink");
            while (true) {
                int i7 = this.f424n;
                if (i7 != 0) {
                    long l02 = this.f426p.l0(mVar, Math.min(j7, i7));
                    if (l02 == -1) {
                        return -1L;
                    }
                    this.f424n -= (int) l02;
                    return l02;
                }
                this.f426p.skip(this.f425o);
                this.f425o = 0;
                if ((this.f422l & 4) != 0) {
                    return -1L;
                }
                h();
            }
        }

        public final void m(int i7) {
            this.f425o = i7;
        }

        public final void p(int i7) {
            this.f423m = i7;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void b(boolean z6, int i7, @n6.d o oVar, int i8) throws IOException;

        void d(int i7, @n6.d String str, @n6.d p pVar, @n6.d String str2, int i8, long j7);

        void f(int i7, @n6.d a6.b bVar, @n6.d p pVar);

        void g();

        void h(int i7, @n6.d a6.b bVar);

        void j(boolean z6, int i7, int i8);

        void k(int i7, int i8, int i9, boolean z6);

        void l(boolean z6, int i7, int i8, @n6.d List<a6.c> list);

        void o(int i7, long j7);

        void q(int i7, int i8, @n6.d List<a6.c> list) throws IOException;

        void r(boolean z6, @n6.d m mVar);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        l0.o(logger, "Logger.getLogger(Http2::class.java.name)");
        f415o = logger;
    }

    public h(@n6.d o oVar, boolean z6) {
        l0.p(oVar, "source");
        this.f419m = oVar;
        this.f420n = z6;
        b bVar = new b(oVar);
        this.f417k = bVar;
        this.f418l = new d.a(bVar, 4096, 0, 4, null);
    }

    public final void A(c cVar, int i7, int i8, int i9) throws IOException {
        if (i7 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i7);
        }
        long d7 = s5.d.d(this.f419m.readInt(), 2147483647L);
        if (d7 == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.o(i9, d7);
    }

    public final boolean b(boolean z6, @n6.d c cVar) throws IOException {
        l0.p(cVar, "handler");
        try {
            this.f419m.G0(9L);
            int R = s5.d.R(this.f419m);
            if (R > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + R);
            }
            int b7 = s5.d.b(this.f419m.readByte(), 255);
            int b8 = s5.d.b(this.f419m.readByte(), 255);
            int readInt = this.f419m.readInt() & Integer.MAX_VALUE;
            Logger logger = f415o;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.f303x.c(true, readInt, R, b7, b8));
            }
            if (z6 && b7 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + e.f303x.b(b7));
            }
            switch (b7) {
                case 0:
                    e(cVar, R, b8, readInt);
                    return true;
                case 1:
                    i(cVar, R, b8, readInt);
                    return true;
                case 2:
                    m(cVar, R, b8, readInt);
                    return true;
                case 3:
                    t(cVar, R, b8, readInt);
                    return true;
                case 4:
                    u(cVar, R, b8, readInt);
                    return true;
                case 5:
                    p(cVar, R, b8, readInt);
                    return true;
                case 6:
                    k(cVar, R, b8, readInt);
                    return true;
                case 7:
                    f(cVar, R, b8, readInt);
                    return true;
                case 8:
                    A(cVar, R, b8, readInt);
                    return true;
                default:
                    this.f419m.skip(R);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f419m.close();
    }

    public final void d(@n6.d c cVar) throws IOException {
        l0.p(cVar, "handler");
        if (this.f420n) {
            if (!b(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        o oVar = this.f419m;
        p pVar = e.f280a;
        p z6 = oVar.z(pVar.c0());
        Logger logger = f415o;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(s5.d.v("<< CONNECTION " + z6.w(), new Object[0]));
        }
        if ((!l0.g(pVar, z6)) == true) {
            throw new IOException("Expected a connection header but was " + z6.n0());
        }
    }

    public final void e(c cVar, int i7, int i8, int i9) throws IOException {
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z6 = (i8 & 1) != 0;
        if ((i8 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int b7 = (i8 & 8) != 0 ? s5.d.b(this.f419m.readByte(), 255) : 0;
        cVar.b(z6, i9, this.f419m, f416p.b(i7, i8, b7));
        this.f419m.skip(b7);
    }

    public final void f(c cVar, int i7, int i8, int i9) throws IOException {
        if (i7 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i7);
        } else if (i9 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        } else {
            int readInt = this.f419m.readInt();
            int readInt2 = this.f419m.readInt();
            int i10 = i7 - 8;
            a6.b a7 = a6.b.A.a(readInt2);
            if (a7 == null) {
                throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
            }
            p pVar = p.f11251o;
            if (i10 > 0) {
                pVar = this.f419m.z(i10);
            }
            cVar.f(readInt, a7, pVar);
        }
    }

    public final List<a6.c> h(int i7, int i8, int i9, int i10) throws IOException {
        this.f417k.k(i7);
        b bVar = this.f417k;
        bVar.l(bVar.b());
        this.f417k.m(i8);
        this.f417k.i(i9);
        this.f417k.p(i10);
        this.f418l.l();
        return this.f418l.e();
    }

    public final void i(c cVar, int i7, int i8, int i9) throws IOException {
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z6 = (i8 & 1) != 0;
        int b7 = (i8 & 8) != 0 ? s5.d.b(this.f419m.readByte(), 255) : 0;
        if ((i8 & 32) != 0) {
            l(cVar, i9);
            i7 -= 5;
        }
        cVar.l(z6, i9, -1, h(f416p.b(i7, i8, b7), b7, i8, i9));
    }

    public final void k(c cVar, int i7, int i8, int i9) throws IOException {
        if (i7 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i7);
        } else if (i9 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        } else {
            cVar.j((i8 & 1) != 0, this.f419m.readInt(), this.f419m.readInt());
        }
    }

    public final void l(c cVar, int i7) throws IOException {
        int readInt = this.f419m.readInt();
        cVar.k(i7, readInt & Integer.MAX_VALUE, s5.d.b(this.f419m.readByte(), 255) + 1, (((int) 2147483648L) & readInt) != 0);
    }

    public final void m(c cVar, int i7, int i8, int i9) throws IOException {
        if (i7 == 5) {
            if (i9 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            l(cVar, i9);
            return;
        }
        throw new IOException("TYPE_PRIORITY length: " + i7 + " != 5");
    }

    public final void p(c cVar, int i7, int i8, int i9) throws IOException {
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int b7 = (i8 & 8) != 0 ? s5.d.b(this.f419m.readByte(), 255) : 0;
        cVar.q(i9, this.f419m.readInt() & Integer.MAX_VALUE, h(f416p.b(i7 - 4, i8, b7), b7, i8, i9));
    }

    public final void t(c cVar, int i7, int i8, int i9) throws IOException {
        if (i7 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i7 + " != 4");
        } else if (i9 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        } else {
            int readInt = this.f419m.readInt();
            a6.b a7 = a6.b.A.a(readInt);
            if (a7 != null) {
                cVar.h(i9, a7);
                return;
            }
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
        }
    }

    public final void u(c cVar, int i7, int i8, int i9) throws IOException {
        int readInt;
        if (i9 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i8 & 1) != 0) {
            if (i7 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.g();
        } else if (i7 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i7);
        } else {
            m mVar = new m();
            d5.j B1 = u.B1(u.W1(0, i7), 6);
            int i10 = B1.i();
            int j7 = B1.j();
            int k7 = B1.k();
            if (k7 < 0 ? i10 >= j7 : i10 <= j7) {
                while (true) {
                    int c7 = s5.d.c(this.f419m.readShort(), 65535);
                    readInt = this.f419m.readInt();
                    if (c7 != 2) {
                        if (c7 == 3) {
                            c7 = 4;
                        } else if (c7 != 4) {
                            if (c7 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                break;
                            }
                        } else if (readInt < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        } else {
                            c7 = 7;
                        }
                    } else if (readInt != 0 && readInt != 1) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    mVar.k(c7, readInt);
                    if (i10 == j7) {
                        break;
                    }
                    i10 += k7;
                }
                throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
            }
            cVar.r(false, mVar);
        }
    }
}
