package z5;

import i5.c0;
import i5.h0;
import i6.m;
import i6.m0;
import i6.n;
import i6.o;
import i6.o0;
import i6.q0;
import i6.t;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import r5.b0;
import r5.d0;
import r5.f0;
import r5.u;
import r5.v;
import u4.l0;
import u4.w;
import y5.i;
import y5.k;
/* loaded from: classes.dex */
public final class b implements y5.d {

    /* renamed from: j  reason: collision with root package name */
    public static final long f19067j = -1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f19068k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final int f19069l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f19070m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f19071n = 3;

    /* renamed from: o  reason: collision with root package name */
    public static final int f19072o = 4;

    /* renamed from: p  reason: collision with root package name */
    public static final int f19073p = 5;

    /* renamed from: q  reason: collision with root package name */
    public static final int f19074q = 6;

    /* renamed from: r  reason: collision with root package name */
    public static final d f19075r = new d(null);

    /* renamed from: c  reason: collision with root package name */
    public int f19076c;

    /* renamed from: d  reason: collision with root package name */
    public final z5.a f19077d;

    /* renamed from: e  reason: collision with root package name */
    public u f19078e;

    /* renamed from: f  reason: collision with root package name */
    public final b0 f19079f;
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public final x5.f f19080g;

    /* renamed from: h  reason: collision with root package name */
    public final o f19081h;

    /* renamed from: i  reason: collision with root package name */
    public final n f19082i;

    /* loaded from: classes.dex */
    public abstract class a implements o0 {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final t f19083k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f19084l;

        public a() {
            this.f19083k = new t(b.this.f19081h.c());
        }

        public final boolean a() {
            return this.f19084l;
        }

        @n6.d
        public final t b() {
            return this.f19083k;
        }

        @Override // i6.o0
        @n6.d
        public q0 c() {
            return this.f19083k;
        }

        public final void d() {
            if (b.this.f19076c == 6) {
                return;
            }
            if (b.this.f19076c == 5) {
                b.this.s(this.f19083k);
                b.this.f19076c = 6;
                return;
            }
            throw new IllegalStateException("state: " + b.this.f19076c);
        }

        public final void e(boolean z6) {
            this.f19084l = z6;
        }

        @Override // i6.o0
        public long l0(@n6.d m mVar, long j7) {
            l0.p(mVar, "sink");
            try {
                return b.this.f19081h.l0(mVar, j7);
            } catch (IOException e7) {
                b.this.i().G();
                d();
                throw e7;
            }
        }
    }

    /* renamed from: z5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0271b implements m0 {

        /* renamed from: k  reason: collision with root package name */
        public final t f19086k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f19087l;

        public C0271b() {
            this.f19086k = new t(b.this.f19082i.c());
        }

        @Override // i6.m0
        @n6.d
        public q0 c() {
            return this.f19086k;
        }

        @Override // i6.m0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f19087l) {
                return;
            }
            this.f19087l = true;
            b.this.f19082i.H0("0\r\n\r\n");
            b.this.s(this.f19086k);
            b.this.f19076c = 3;
        }

        @Override // i6.m0, java.io.Flushable
        public synchronized void flush() {
            if (this.f19087l) {
                return;
            }
            b.this.f19082i.flush();
        }

        @Override // i6.m0
        public void w(@n6.d m mVar, long j7) {
            l0.p(mVar, "source");
            if ((!this.f19087l) != true) {
                throw new IllegalStateException("closed".toString());
            }
            if (j7 == 0) {
                return;
            }
            b.this.f19082i.v(j7);
            b.this.f19082i.H0("\r\n");
            b.this.f19082i.w(mVar, j7);
            b.this.f19082i.H0("\r\n");
        }
    }

    /* loaded from: classes.dex */
    public final class c extends a {

        /* renamed from: n  reason: collision with root package name */
        public long f19089n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f19090o;

        /* renamed from: p  reason: collision with root package name */
        public final v f19091p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ b f19092q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@n6.d b bVar, v vVar) {
            super();
            l0.p(vVar, "url");
            this.f19092q = bVar;
            this.f19091p = vVar;
            this.f19089n = -1L;
            this.f19090o = true;
        }

        @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f19090o && !s5.d.t(this, 100, TimeUnit.MILLISECONDS)) {
                this.f19092q.i().G();
                d();
            }
            e(true);
        }

        public final void f() {
            if (this.f19089n != -1) {
                this.f19092q.f19081h.T();
            }
            try {
                this.f19089n = this.f19092q.f19081h.P0();
                String T = this.f19092q.f19081h.T();
                if (T == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String obj = c0.F5(T).toString();
                if (this.f19089n >= 0) {
                    if (!(obj.length() > 0) || i5.b0.v2(obj, ";", false, 2, null)) {
                        if (this.f19089n == 0) {
                            this.f19090o = false;
                            b bVar = this.f19092q;
                            bVar.f19078e = bVar.f19077d.b();
                            b0 b0Var = this.f19092q.f19079f;
                            l0.m(b0Var);
                            r5.n U = b0Var.U();
                            v vVar = this.f19091p;
                            u uVar = this.f19092q.f19078e;
                            l0.m(uVar);
                            y5.e.g(U, vVar, uVar);
                            d();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f19089n + obj + h0.f11093b);
            } catch (NumberFormatException e7) {
                throw new ProtocolException(e7.getMessage());
            }
        }

        @Override // z5.b.a, i6.o0
        public long l0(@n6.d m mVar, long j7) {
            l0.p(mVar, "sink");
            if (!(j7 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
            } else if ((!a()) == true) {
                if (this.f19090o) {
                    long j8 = this.f19089n;
                    if (j8 == 0 || j8 == -1) {
                        f();
                        if (!this.f19090o) {
                            return -1L;
                        }
                    }
                    long l02 = super.l0(mVar, Math.min(j7, this.f19089n));
                    if (l02 != -1) {
                        this.f19089n -= l02;
                        return l02;
                    }
                    this.f19092q.i().G();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    d();
                    throw protocolException;
                }
                return -1L;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class e extends a {

        /* renamed from: n  reason: collision with root package name */
        public long f19093n;

        public e(long j7) {
            super();
            this.f19093n = j7;
            if (j7 == 0) {
                d();
            }
        }

        @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f19093n != 0 && !s5.d.t(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.i().G();
                d();
            }
            e(true);
        }

        @Override // z5.b.a, i6.o0
        public long l0(@n6.d m mVar, long j7) {
            l0.p(mVar, "sink");
            if (!(j7 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
            } else if ((!a()) == true) {
                long j8 = this.f19093n;
                if (j8 == 0) {
                    return -1L;
                }
                long l02 = super.l0(mVar, Math.min(j8, j7));
                if (l02 == -1) {
                    b.this.i().G();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    d();
                    throw protocolException;
                }
                long j9 = this.f19093n - l02;
                this.f19093n = j9;
                if (j9 == 0) {
                    d();
                }
                return l02;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public final class f implements m0 {

        /* renamed from: k  reason: collision with root package name */
        public final t f19095k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f19096l;

        public f() {
            this.f19095k = new t(b.this.f19082i.c());
        }

        @Override // i6.m0
        @n6.d
        public q0 c() {
            return this.f19095k;
        }

        @Override // i6.m0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f19096l) {
                return;
            }
            this.f19096l = true;
            b.this.s(this.f19095k);
            b.this.f19076c = 3;
        }

        @Override // i6.m0, java.io.Flushable
        public void flush() {
            if (this.f19096l) {
                return;
            }
            b.this.f19082i.flush();
        }

        @Override // i6.m0
        public void w(@n6.d m mVar, long j7) {
            l0.p(mVar, "source");
            if ((!this.f19096l) != true) {
                throw new IllegalStateException("closed".toString());
            }
            s5.d.k(mVar.a1(), 0L, j7);
            b.this.f19082i.w(mVar, j7);
        }
    }

    /* loaded from: classes.dex */
    public final class g extends a {

        /* renamed from: n  reason: collision with root package name */
        public boolean f19098n;

        public g() {
            super();
        }

        @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (!this.f19098n) {
                d();
            }
            e(true);
        }

        @Override // z5.b.a, i6.o0
        public long l0(@n6.d m mVar, long j7) {
            l0.p(mVar, "sink");
            if (!(j7 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
            } else if ((!a()) == true) {
                if (this.f19098n) {
                    return -1L;
                }
                long l02 = super.l0(mVar, j7);
                if (l02 == -1) {
                    this.f19098n = true;
                    d();
                    return -1L;
                }
                return l02;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public b(@n6.e b0 b0Var, @n6.d x5.f fVar, @n6.d o oVar, @n6.d n nVar) {
        l0.p(fVar, a6.g.f398i);
        l0.p(oVar, "source");
        l0.p(nVar, "sink");
        this.f19079f = b0Var;
        this.f19080g = fVar;
        this.f19081h = oVar;
        this.f19082i = nVar;
        this.f19077d = new z5.a(oVar);
    }

    public final o0 A() {
        if (this.f19076c == 4) {
            this.f19076c = 5;
            i().G();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f19076c).toString());
    }

    public final void B(@n6.d f0 f0Var) {
        l0.p(f0Var, "response");
        long x6 = s5.d.x(f0Var);
        if (x6 == -1) {
            return;
        }
        o0 y6 = y(x6);
        s5.d.T(y6, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        y6.close();
    }

    public final void C(@n6.d u uVar, @n6.d String str) {
        l0.p(uVar, "headers");
        l0.p(str, "requestLine");
        if (!(this.f19076c == 0)) {
            throw new IllegalStateException(("state: " + this.f19076c).toString());
        }
        this.f19082i.H0(str).H0("\r\n");
        int size = uVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f19082i.H0(uVar.i(i7)).H0(": ").H0(uVar.o(i7)).H0("\r\n");
        }
        this.f19082i.H0("\r\n");
        this.f19076c = 1;
    }

    @Override // y5.d
    public void a() {
        this.f19082i.flush();
    }

    @Override // y5.d
    @n6.d
    public o0 b(@n6.d f0 f0Var) {
        l0.p(f0Var, "response");
        if (y5.e.c(f0Var)) {
            if (u(f0Var)) {
                return x(f0Var.O0().q());
            }
            long x6 = s5.d.x(f0Var);
            return x6 != -1 ? y(x6) : A();
        }
        return y(0L);
    }

    @Override // y5.d
    public void c() {
        this.f19082i.flush();
    }

    @Override // y5.d
    public void cancel() {
        i().k();
    }

    @Override // y5.d
    public void d(@n6.d d0 d0Var) {
        l0.p(d0Var, "request");
        i iVar = i.f18878a;
        Proxy.Type type = i().c().e().type();
        l0.o(type, "connection.route().proxy.type()");
        C(d0Var.k(), iVar.a(d0Var, type));
    }

    @Override // y5.d
    public long e(@n6.d f0 f0Var) {
        l0.p(f0Var, "response");
        if (y5.e.c(f0Var)) {
            if (u(f0Var)) {
                return -1L;
            }
            return s5.d.x(f0Var);
        }
        return 0L;
    }

    @Override // y5.d
    @n6.d
    public m0 f(@n6.d d0 d0Var, long j7) {
        l0.p(d0Var, "request");
        if (d0Var.f() == null || !d0Var.f().p()) {
            if (t(d0Var)) {
                return w();
            }
            if (j7 != -1) {
                return z();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        throw new ProtocolException("Duplex connections are not supported for HTTP/1");
    }

    @Override // y5.d
    @n6.d
    public u g() {
        if (this.f19076c == 6) {
            u uVar = this.f19078e;
            return uVar != null ? uVar : s5.d.f16652b;
        }
        throw new IllegalStateException("too early; can't read the trailers yet".toString());
    }

    @Override // y5.d
    @n6.e
    public f0.a h(boolean z6) {
        int i7 = this.f19076c;
        boolean z7 = true;
        if (i7 != 1 && i7 != 3) {
            z7 = false;
        }
        if (!z7) {
            throw new IllegalStateException(("state: " + this.f19076c).toString());
        }
        try {
            k b7 = k.f18886h.b(this.f19077d.c());
            f0.a w6 = new f0.a().B(b7.f18887a).g(b7.f18888b).y(b7.f18889c).w(this.f19077d.b());
            if (z6 && b7.f18888b == 100) {
                return null;
            }
            if (b7.f18888b == 100) {
                this.f19076c = 3;
                return w6;
            }
            this.f19076c = 4;
            return w6;
        } catch (EOFException e7) {
            throw new IOException("unexpected end of stream on " + i().c().d().w().V(), e7);
        }
    }

    @Override // y5.d
    @n6.d
    public x5.f i() {
        return this.f19080g;
    }

    public final void s(t tVar) {
        q0 l7 = tVar.l();
        tVar.m(q0.f11267d);
        l7.a();
        l7.b();
    }

    public final boolean t(d0 d0Var) {
        return i5.b0.L1("chunked", d0Var.i("Transfer-Encoding"), true);
    }

    public final boolean u(f0 f0Var) {
        return i5.b0.L1("chunked", f0.X(f0Var, "Transfer-Encoding", null, 2, null), true);
    }

    public final boolean v() {
        return this.f19076c == 6;
    }

    public final m0 w() {
        if (this.f19076c == 1) {
            this.f19076c = 2;
            return new C0271b();
        }
        throw new IllegalStateException(("state: " + this.f19076c).toString());
    }

    public final o0 x(v vVar) {
        if (this.f19076c == 4) {
            this.f19076c = 5;
            return new c(this, vVar);
        }
        throw new IllegalStateException(("state: " + this.f19076c).toString());
    }

    public final o0 y(long j7) {
        if (this.f19076c == 4) {
            this.f19076c = 5;
            return new e(j7);
        }
        throw new IllegalStateException(("state: " + this.f19076c).toString());
    }

    public final m0 z() {
        if (this.f19076c == 1) {
            this.f19076c = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f19076c).toString());
    }
}
