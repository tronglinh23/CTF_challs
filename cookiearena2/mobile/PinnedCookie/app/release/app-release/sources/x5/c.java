package x5;

import h6.e;
import i0.k0;
import i6.a0;
import i6.m;
import i6.m0;
import i6.o0;
import i6.s;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import r5.d0;
import r5.e0;
import r5.f0;
import r5.g0;
import r5.r;
import r5.u;
import u4.l0;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f18403a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final f f18404b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final e f18405c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final r f18406d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public final d f18407e;

    /* renamed from: f  reason: collision with root package name */
    public final y5.d f18408f;

    /* loaded from: classes.dex */
    public final class a extends i6.r {

        /* renamed from: l  reason: collision with root package name */
        public boolean f18409l;

        /* renamed from: m  reason: collision with root package name */
        public long f18410m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f18411n;

        /* renamed from: o  reason: collision with root package name */
        public final long f18412o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ c f18413p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@n6.d c cVar, m0 m0Var, long j7) {
            super(m0Var);
            l0.p(m0Var, "delegate");
            this.f18413p = cVar;
            this.f18412o = j7;
        }

        @Override // i6.r, i6.m0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f18411n) {
                return;
            }
            this.f18411n = true;
            long j7 = this.f18412o;
            if (j7 != -1 && this.f18410m != j7) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                d(null);
            } catch (IOException e7) {
                throw d(e7);
            }
        }

        public final <E extends IOException> E d(E e7) {
            if (this.f18409l) {
                return e7;
            }
            this.f18409l = true;
            return (E) this.f18413p.a(this.f18410m, false, true, e7);
        }

        @Override // i6.r, i6.m0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e7) {
                throw d(e7);
            }
        }

        @Override // i6.r, i6.m0
        public void w(@n6.d m mVar, long j7) throws IOException {
            l0.p(mVar, "source");
            if ((!this.f18411n) != true) {
                throw new IllegalStateException("closed".toString());
            }
            long j8 = this.f18412o;
            if (j8 == -1 || this.f18410m + j7 <= j8) {
                try {
                    super.w(mVar, j7);
                    this.f18410m += j7;
                    return;
                } catch (IOException e7) {
                    throw d(e7);
                }
            }
            throw new ProtocolException("expected " + this.f18412o + " bytes but received " + (this.f18410m + j7));
        }
    }

    /* loaded from: classes.dex */
    public final class b extends s {

        /* renamed from: l  reason: collision with root package name */
        public long f18414l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f18415m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f18416n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f18417o;

        /* renamed from: p  reason: collision with root package name */
        public final long f18418p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ c f18419q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@n6.d c cVar, o0 o0Var, long j7) {
            super(o0Var);
            l0.p(o0Var, "delegate");
            this.f18419q = cVar;
            this.f18418p = j7;
            this.f18415m = true;
            if (j7 == 0) {
                d(null);
            }
        }

        @Override // i6.s, i6.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f18417o) {
                return;
            }
            this.f18417o = true;
            try {
                super.close();
                d(null);
            } catch (IOException e7) {
                throw d(e7);
            }
        }

        public final <E extends IOException> E d(E e7) {
            if (this.f18416n) {
                return e7;
            }
            this.f18416n = true;
            if (e7 == null && this.f18415m) {
                this.f18415m = false;
                this.f18419q.i().w(this.f18419q.g());
            }
            return (E) this.f18419q.a(this.f18414l, true, false, e7);
        }

        @Override // i6.s, i6.o0
        public long l0(@n6.d m mVar, long j7) throws IOException {
            l0.p(mVar, "sink");
            if ((!this.f18417o) == true) {
                try {
                    long l02 = b().l0(mVar, j7);
                    if (this.f18415m) {
                        this.f18415m = false;
                        this.f18419q.i().w(this.f18419q.g());
                    }
                    if (l02 == -1) {
                        d(null);
                        return -1L;
                    }
                    long j8 = this.f18414l + l02;
                    long j9 = this.f18418p;
                    if (j9 != -1 && j8 > j9) {
                        throw new ProtocolException("expected " + this.f18418p + " bytes but received " + j8);
                    }
                    this.f18414l = j8;
                    if (j8 == j9) {
                        d(null);
                    }
                    return l02;
                } catch (IOException e7) {
                    throw d(e7);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public c(@n6.d e eVar, @n6.d r rVar, @n6.d d dVar, @n6.d y5.d dVar2) {
        l0.p(eVar, k0.E0);
        l0.p(rVar, "eventListener");
        l0.p(dVar, "finder");
        l0.p(dVar2, "codec");
        this.f18405c = eVar;
        this.f18406d = rVar;
        this.f18407e = dVar;
        this.f18408f = dVar2;
        this.f18404b = dVar2.i();
    }

    public final <E extends IOException> E a(long j7, boolean z6, boolean z7, E e7) {
        if (e7 != null) {
            t(e7);
        }
        if (z7) {
            if (e7 != null) {
                this.f18406d.s(this.f18405c, e7);
            } else {
                this.f18406d.q(this.f18405c, j7);
            }
        }
        if (z6) {
            if (e7 != null) {
                this.f18406d.x(this.f18405c, e7);
            } else {
                this.f18406d.v(this.f18405c, j7);
            }
        }
        return (E) this.f18405c.z(this, z7, z6, e7);
    }

    public final void b() {
        this.f18408f.cancel();
    }

    @n6.d
    public final m0 c(@n6.d d0 d0Var, boolean z6) throws IOException {
        l0.p(d0Var, "request");
        this.f18403a = z6;
        e0 f7 = d0Var.f();
        l0.m(f7);
        long a7 = f7.a();
        this.f18406d.r(this.f18405c);
        return new a(this, this.f18408f.f(d0Var, a7), a7);
    }

    public final void d() {
        this.f18408f.cancel();
        this.f18405c.z(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f18408f.a();
        } catch (IOException e7) {
            this.f18406d.s(this.f18405c, e7);
            t(e7);
            throw e7;
        }
    }

    public final void f() throws IOException {
        try {
            this.f18408f.c();
        } catch (IOException e7) {
            this.f18406d.s(this.f18405c, e7);
            t(e7);
            throw e7;
        }
    }

    @n6.d
    public final e g() {
        return this.f18405c;
    }

    @n6.d
    public final f h() {
        return this.f18404b;
    }

    @n6.d
    public final r i() {
        return this.f18406d;
    }

    @n6.d
    public final d j() {
        return this.f18407e;
    }

    public final boolean k() {
        return !l0.g(this.f18407e.d().w().F(), this.f18404b.c().d().w().F());
    }

    public final boolean l() {
        return this.f18403a;
    }

    @n6.d
    public final e.d m() throws SocketException {
        this.f18405c.G();
        return this.f18408f.i().E(this);
    }

    public final void n() {
        this.f18408f.i().G();
    }

    public final void o() {
        this.f18405c.z(this, true, false, null);
    }

    @n6.d
    public final g0 p(@n6.d f0 f0Var) throws IOException {
        l0.p(f0Var, "response");
        try {
            String X = f0.X(f0Var, "Content-Type", null, 2, null);
            long e7 = this.f18408f.e(f0Var);
            return new y5.h(X, e7, a0.d(new b(this, this.f18408f.b(f0Var), e7)));
        } catch (IOException e8) {
            this.f18406d.x(this.f18405c, e8);
            t(e8);
            throw e8;
        }
    }

    @n6.e
    public final f0.a q(boolean z6) throws IOException {
        try {
            f0.a h7 = this.f18408f.h(z6);
            if (h7 != null) {
                h7.x(this);
            }
            return h7;
        } catch (IOException e7) {
            this.f18406d.x(this.f18405c, e7);
            t(e7);
            throw e7;
        }
    }

    public final void r(@n6.d f0 f0Var) {
        l0.p(f0Var, "response");
        this.f18406d.y(this.f18405c, f0Var);
    }

    public final void s() {
        this.f18406d.z(this.f18405c);
    }

    public final void t(IOException iOException) {
        this.f18407e.h(iOException);
        this.f18408f.i().N(this.f18405c, iOException);
    }

    @n6.d
    public final u u() throws IOException {
        return this.f18408f.g();
    }

    public final void v() {
        a(-1L, true, true, null);
    }

    public final void w(@n6.d d0 d0Var) throws IOException {
        l0.p(d0Var, "request");
        try {
            this.f18406d.u(this.f18405c);
            this.f18408f.d(d0Var);
            this.f18406d.t(this.f18405c, d0Var);
        } catch (IOException e7) {
            this.f18406d.s(this.f18405c, e7);
            t(e7);
            throw e7;
        }
    }
}
