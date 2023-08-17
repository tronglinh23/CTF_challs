package x5;

import a6.f;
import a6.m;
import h6.e;
import i0.k0;
import i5.u;
import i6.a0;
import i6.n;
import i6.o;
import i6.q0;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import r5.b0;
import r5.c0;
import r5.d0;
import r5.f0;
import r5.h0;
import r5.l;
import r5.r;
import r5.t;
import r5.v;
import u4.l0;
import u4.n0;
import u4.w;
import x3.x;
/* loaded from: classes.dex */
public final class f extends f.d implements r5.j {

    /* renamed from: t  reason: collision with root package name */
    public static final String f18451t = "throw with null exception";

    /* renamed from: u  reason: collision with root package name */
    public static final int f18452u = 21;

    /* renamed from: v  reason: collision with root package name */
    public static final long f18453v = 10000000000L;

    /* renamed from: w  reason: collision with root package name */
    public static final a f18454w = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public Socket f18455c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f18456d;

    /* renamed from: e  reason: collision with root package name */
    public t f18457e;

    /* renamed from: f  reason: collision with root package name */
    public c0 f18458f;

    /* renamed from: g  reason: collision with root package name */
    public a6.f f18459g;

    /* renamed from: h  reason: collision with root package name */
    public o f18460h;

    /* renamed from: i  reason: collision with root package name */
    public n f18461i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f18462j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f18463k;

    /* renamed from: l  reason: collision with root package name */
    public int f18464l;

    /* renamed from: m  reason: collision with root package name */
    public int f18465m;

    /* renamed from: n  reason: collision with root package name */
    public int f18466n;

    /* renamed from: o  reason: collision with root package name */
    public int f18467o;
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public final List<Reference<e>> f18468p;

    /* renamed from: q  reason: collision with root package name */
    public long f18469q;
    @n6.d

    /* renamed from: r  reason: collision with root package name */
    public final h f18470r;

    /* renamed from: s  reason: collision with root package name */
    public final h0 f18471s;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.d
        public final f a(@n6.d h hVar, @n6.d h0 h0Var, @n6.d Socket socket, long j7) {
            l0.p(hVar, "connectionPool");
            l0.p(h0Var, "route");
            l0.p(socket, "socket");
            f fVar = new f(hVar, h0Var);
            fVar.f18456d = socket;
            fVar.I(j7);
            return fVar;
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.a<List<? extends Certificate>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ r5.g f18472l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ t f18473m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ r5.a f18474n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r5.g gVar, t tVar, r5.a aVar) {
            super(0);
            this.f18472l = gVar;
            this.f18473m = tVar;
            this.f18474n = aVar;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final List<Certificate> n() {
            g6.c e7 = this.f18472l.e();
            l0.m(e7);
            return e7.a(this.f18473m.m(), this.f18474n.w().F());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.a<List<? extends X509Certificate>> {
        public c() {
            super(0);
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> n() {
            t tVar = f.this.f18457e;
            l0.m(tVar);
            List<Certificate> m7 = tVar.m();
            ArrayList arrayList = new ArrayList(x.Y(m7, 10));
            for (Certificate certificate : m7) {
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends e.d {

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ x5.c f18476n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ o f18477o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ n f18478p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x5.c cVar, o oVar, n nVar, boolean z6, o oVar2, n nVar2) {
            super(z6, oVar2, nVar2);
            this.f18476n = cVar;
            this.f18477o = oVar;
            this.f18478p = nVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f18476n.a(-1L, true, true, null);
        }
    }

    public f(@n6.d h hVar, @n6.d h0 h0Var) {
        l0.p(hVar, "connectionPool");
        l0.p(h0Var, "route");
        this.f18470r = hVar;
        this.f18471s = h0Var;
        this.f18467o = 1;
        this.f18468p = new ArrayList();
        this.f18469q = Long.MAX_VALUE;
    }

    public final boolean A(@n6.d r5.a aVar, @n6.e List<h0> list) {
        l0.p(aVar, "address");
        if (s5.d.f16658h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        } else if (this.f18468p.size() >= this.f18467o || this.f18462j || !this.f18471s.d().o(aVar)) {
            return false;
        } else {
            if (l0.g(aVar.w().F(), c().d().w().F())) {
                return true;
            }
            if (this.f18459g != null && list != null && H(list) && aVar.p() == g6.d.f10091c && M(aVar.w())) {
                try {
                    r5.g l7 = aVar.l();
                    l0.m(l7);
                    String F = aVar.w().F();
                    t b7 = b();
                    l0.m(b7);
                    l7.a(F, b7.m());
                    return true;
                } catch (SSLPeerUnverifiedException unused) {
                    return false;
                }
            }
            return false;
        }
    }

    public final boolean B(boolean z6) {
        long j7;
        if (s5.d.f16658h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.f18455c;
        l0.m(socket);
        Socket socket2 = this.f18456d;
        l0.m(socket2);
        o oVar = this.f18460h;
        l0.m(oVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        a6.f fVar = this.f18459g;
        if (fVar != null) {
            return fVar.W0(nanoTime);
        }
        synchronized (this) {
            j7 = nanoTime - this.f18469q;
        }
        if (j7 < f18453v || !z6) {
            return true;
        }
        return s5.d.K(socket2, oVar);
    }

    public final boolean C() {
        return this.f18459g != null;
    }

    @n6.d
    public final y5.d D(@n6.d b0 b0Var, @n6.d y5.g gVar) throws SocketException {
        l0.p(b0Var, "client");
        l0.p(gVar, "chain");
        Socket socket = this.f18456d;
        l0.m(socket);
        o oVar = this.f18460h;
        l0.m(oVar);
        n nVar = this.f18461i;
        l0.m(nVar);
        a6.f fVar = this.f18459g;
        if (fVar != null) {
            return new a6.g(b0Var, this, gVar, fVar);
        }
        socket.setSoTimeout(gVar.e());
        q0 c7 = oVar.c();
        long o6 = gVar.o();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c7.i(o6, timeUnit);
        nVar.c().i(gVar.q(), timeUnit);
        return new z5.b(b0Var, this, oVar, nVar);
    }

    @n6.d
    public final e.d E(@n6.d x5.c cVar) throws SocketException {
        l0.p(cVar, "exchange");
        Socket socket = this.f18456d;
        l0.m(socket);
        o oVar = this.f18460h;
        l0.m(oVar);
        n nVar = this.f18461i;
        l0.m(nVar);
        socket.setSoTimeout(0);
        G();
        return new d(cVar, oVar, nVar, true, oVar, nVar);
    }

    public final synchronized void F() {
        this.f18463k = true;
    }

    public final synchronized void G() {
        this.f18462j = true;
    }

    public final boolean H(List<h0> list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (h0 h0Var : list) {
            if (h0Var.e().type() == Proxy.Type.DIRECT && this.f18471s.e().type() == Proxy.Type.DIRECT && l0.g(this.f18471s.g(), h0Var.g())) {
                return true;
            }
        }
        return false;
    }

    public final void I(long j7) {
        this.f18469q = j7;
    }

    public final void J(boolean z6) {
        this.f18462j = z6;
    }

    public final void K(int i7) {
        this.f18464l = i7;
    }

    public final void L(int i7) throws IOException {
        Socket socket = this.f18456d;
        l0.m(socket);
        o oVar = this.f18460h;
        l0.m(oVar);
        n nVar = this.f18461i;
        l0.m(nVar);
        socket.setSoTimeout(0);
        a6.f a7 = new f.b(true, w5.d.f18228h).y(socket, this.f18471s.d().w().F(), oVar, nVar).k(this).l(i7).a();
        this.f18459g = a7;
        this.f18467o = a6.f.T.a().f();
        a6.f.q1(a7, false, null, 3, null);
    }

    public final boolean M(v vVar) {
        t tVar;
        if (s5.d.f16658h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        v w6 = this.f18471s.d().w();
        if (vVar.N() != w6.N()) {
            return false;
        }
        if (l0.g(vVar.F(), w6.F())) {
            return true;
        }
        if (this.f18463k || (tVar = this.f18457e) == null) {
            return false;
        }
        l0.m(tVar);
        return l(vVar, tVar);
    }

    public final synchronized void N(@n6.d e eVar, @n6.e IOException iOException) {
        l0.p(eVar, k0.E0);
        if (iOException instanceof a6.n) {
            if (((a6.n) iOException).f485k == a6.b.REFUSED_STREAM) {
                int i7 = this.f18466n + 1;
                this.f18466n = i7;
                if (i7 > 1) {
                    this.f18462j = true;
                    this.f18464l++;
                }
            } else if (((a6.n) iOException).f485k != a6.b.CANCEL || !eVar.i()) {
                this.f18462j = true;
                this.f18464l++;
            }
        } else if (!C() || (iOException instanceof a6.a)) {
            this.f18462j = true;
            if (this.f18465m == 0) {
                if (iOException != null) {
                    n(eVar.q(), this.f18471s, iOException);
                }
                this.f18464l++;
            }
        }
    }

    @Override // r5.j
    @n6.d
    public c0 a() {
        c0 c0Var = this.f18458f;
        l0.m(c0Var);
        return c0Var;
    }

    @Override // r5.j
    @n6.e
    public t b() {
        return this.f18457e;
    }

    @Override // r5.j
    @n6.d
    public h0 c() {
        return this.f18471s;
    }

    @Override // r5.j
    @n6.d
    public Socket d() {
        Socket socket = this.f18456d;
        l0.m(socket);
        return socket;
    }

    @Override // a6.f.d
    public synchronized void e(@n6.d a6.f fVar, @n6.d m mVar) {
        l0.p(fVar, a6.g.f398i);
        l0.p(mVar, "settings");
        this.f18467o = mVar.f();
    }

    @Override // a6.f.d
    public void f(@n6.d a6.i iVar) throws IOException {
        l0.p(iVar, "stream");
        iVar.d(a6.b.REFUSED_STREAM, null);
    }

    public final void k() {
        Socket socket = this.f18455c;
        if (socket != null) {
            s5.d.n(socket);
        }
    }

    public final boolean l(v vVar, t tVar) {
        List<Certificate> m7 = tVar.m();
        if ((!m7.isEmpty()) != false) {
            g6.d dVar = g6.d.f10091c;
            String F = vVar.F();
            Certificate certificate = m7.get(0);
            if (certificate == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            if (dVar.c(F, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c A[EDGE_INSN: B:72:0x014c->B:61:0x014c BREAK  A[LOOP:0: B:68:0x009a->B:76:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r17, int r18, int r19, int r20, boolean r21, @n6.d r5.e r22, @n6.d r5.r r23) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.f.m(int, int, int, int, boolean, r5.e, r5.r):void");
    }

    public final void n(@n6.d b0 b0Var, @n6.d h0 h0Var, @n6.d IOException iOException) {
        l0.p(b0Var, "client");
        l0.p(h0Var, "failedRoute");
        l0.p(iOException, "failure");
        if (h0Var.e().type() != Proxy.Type.DIRECT) {
            r5.a d7 = h0Var.d();
            d7.t().connectFailed(d7.w().Z(), h0Var.e().address(), iOException);
        }
        b0Var.a0().b(h0Var);
    }

    public final void o(int i7, int i8, r5.e eVar, r rVar) throws IOException {
        Socket socket;
        int i9;
        Proxy e7 = this.f18471s.e();
        r5.a d7 = this.f18471s.d();
        Proxy.Type type = e7.type();
        if (type != null && ((i9 = g.f18479a[type.ordinal()]) == 1 || i9 == 2)) {
            socket = d7.u().createSocket();
            l0.m(socket);
        } else {
            socket = new Socket(e7);
        }
        this.f18455c = socket;
        rVar.j(eVar, this.f18471s.g(), e7);
        socket.setSoTimeout(i8);
        try {
            c6.j.f8005e.g().g(socket, this.f18471s.g(), i7);
            try {
                this.f18460h = a0.d(a0.n(socket));
                this.f18461i = a0.c(a0.i(socket));
            } catch (NullPointerException e8) {
                if (l0.g(e8.getMessage(), f18451t)) {
                    throw new IOException(e8);
                }
            }
        } catch (ConnectException e9) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f18471s.g());
            connectException.initCause(e9);
            throw connectException;
        }
    }

    public final void p(x5.b bVar) throws IOException {
        r5.a d7 = this.f18471s.d();
        SSLSocketFactory v6 = d7.v();
        SSLSocket sSLSocket = null;
        try {
            l0.m(v6);
            Socket createSocket = v6.createSocket(this.f18455c, d7.w().F(), d7.w().N(), true);
            if (createSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                l a7 = bVar.a(sSLSocket2);
                if (a7.k()) {
                    c6.j.f8005e.g().f(sSLSocket2, d7.w().F(), d7.q());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                t.a aVar = t.f16037e;
                l0.o(session, "sslSocketSession");
                t b7 = aVar.b(session);
                HostnameVerifier p6 = d7.p();
                l0.m(p6);
                if (p6.verify(d7.w().F(), session)) {
                    r5.g l7 = d7.l();
                    l0.m(l7);
                    this.f18457e = new t(b7.o(), b7.g(), b7.k(), new b(l7, b7, d7));
                    l7.c(d7.w().F(), new c());
                    String j7 = a7.k() ? c6.j.f8005e.g().j(sSLSocket2) : null;
                    this.f18456d = sSLSocket2;
                    this.f18460h = a0.d(a0.n(sSLSocket2));
                    this.f18461i = a0.c(a0.i(sSLSocket2));
                    this.f18458f = j7 != null ? c0.f15798s.a(j7) : c0.HTTP_1_1;
                    c6.j.f8005e.g().c(sSLSocket2);
                    return;
                }
                List<Certificate> m7 = b7.m();
                if ((!m7.isEmpty()) != true) {
                    throw new SSLPeerUnverifiedException("Hostname " + d7.w().F() + " not verified (no certificates)");
                }
                Certificate certificate = m7.get(0);
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate x509Certificate = (X509Certificate) certificate;
                StringBuilder sb = new StringBuilder();
                sb.append("\n              |Hostname ");
                sb.append(d7.w().F());
                sb.append(" not verified:\n              |    certificate: ");
                sb.append(r5.g.f15872d.a(x509Certificate));
                sb.append("\n              |    DN: ");
                Principal subjectDN = x509Certificate.getSubjectDN();
                l0.o(subjectDN, "cert.subjectDN");
                sb.append(subjectDN.getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(g6.d.f10091c.a(x509Certificate));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(u.r(sb.toString(), null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    c6.j.f8005e.g().c(sSLSocket);
                }
                if (sSLSocket != null) {
                    s5.d.n(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void q(int i7, int i8, int i9, r5.e eVar, r rVar) throws IOException {
        d0 s6 = s();
        v q6 = s6.q();
        for (int i10 = 0; i10 < 21; i10++) {
            o(i7, i8, eVar, rVar);
            s6 = r(i8, i9, s6, q6);
            if (s6 == null) {
                return;
            }
            Socket socket = this.f18455c;
            if (socket != null) {
                s5.d.n(socket);
            }
            this.f18455c = null;
            this.f18461i = null;
            this.f18460h = null;
            rVar.h(eVar, this.f18471s.g(), this.f18471s.e(), null);
        }
    }

    public final d0 r(int i7, int i8, d0 d0Var, v vVar) throws IOException {
        String str = "CONNECT " + s5.d.a0(vVar, true) + " HTTP/1.1";
        while (true) {
            o oVar = this.f18460h;
            l0.m(oVar);
            n nVar = this.f18461i;
            l0.m(nVar);
            z5.b bVar = new z5.b(null, this, oVar, nVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            oVar.c().i(i7, timeUnit);
            nVar.c().i(i8, timeUnit);
            bVar.C(d0Var.k(), str);
            bVar.a();
            f0.a h7 = bVar.h(false);
            l0.m(h7);
            f0 c7 = h7.E(d0Var).c();
            bVar.B(c7);
            int L = c7.L();
            if (L == 200) {
                if (oVar.j().c0() && nVar.j().c0()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (L != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c7.L());
            } else {
                d0 a7 = this.f18471s.d().s().a(this.f18471s, c7);
                if (a7 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if (i5.b0.L1("close", f0.X(c7, "Connection", null, 2, null), true)) {
                    return a7;
                }
                d0Var = a7;
            }
        }
    }

    public final d0 s() throws IOException {
        d0 b7 = new d0.a().D(this.f18471s.d().w()).p("CONNECT", null).n("Host", s5.d.a0(this.f18471s.d().w(), true)).n("Proxy-Connection", "Keep-Alive").n("User-Agent", s5.d.f16660j).b();
        d0 a7 = this.f18471s.d().s().a(this.f18471s, new f0.a().E(b7).B(c0.HTTP_1_1).g(407).y("Preemptive Authenticate").b(s5.d.f16653c).F(-1L).C(-1L).v("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a7 != null ? a7 : b7;
    }

    public final void t(x5.b bVar, int i7, r5.e eVar, r rVar) throws IOException {
        if (this.f18471s.d().v() != null) {
            rVar.C(eVar);
            p(bVar);
            rVar.B(eVar, this.f18457e);
            if (this.f18458f == c0.HTTP_2) {
                L(i7);
                return;
            }
            return;
        }
        List<c0> q6 = this.f18471s.d().q();
        c0 c0Var = c0.H2_PRIOR_KNOWLEDGE;
        if (!q6.contains(c0Var)) {
            this.f18456d = this.f18455c;
            this.f18458f = c0.HTTP_1_1;
            return;
        }
        this.f18456d = this.f18455c;
        this.f18458f = c0Var;
        L(i7);
    }

    @n6.d
    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f18471s.d().w().F());
        sb.append(':');
        sb.append(this.f18471s.d().w().N());
        sb.append(',');
        sb.append(" proxy=");
        sb.append(this.f18471s.e());
        sb.append(" hostAddress=");
        sb.append(this.f18471s.g());
        sb.append(" cipherSuite=");
        t tVar = this.f18457e;
        if (tVar == null || (obj = tVar.g()) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f18458f);
        sb.append('}');
        return sb.toString();
    }

    @n6.d
    public final List<Reference<e>> u() {
        return this.f18468p;
    }

    @n6.d
    public final h v() {
        return this.f18470r;
    }

    public final long w() {
        return this.f18469q;
    }

    public final boolean x() {
        return this.f18462j;
    }

    public final int y() {
        return this.f18464l;
    }

    public final synchronized void z() {
        this.f18465m++;
    }
}
