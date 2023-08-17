package r5;

import c6.j;
import g6.c;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import r5.e;
import r5.j0;
import r5.r;
import r5.w;
import u.v;
import u4.l0;
import v3.b1;
/* loaded from: classes.dex */
public class b0 implements Cloneable, e.a, j0.a {
    public final SSLSocketFactory A;
    @n6.e
    public final X509TrustManager B;
    @n6.d
    public final List<l> C;
    @n6.d
    public final List<c0> D;
    @n6.d
    public final HostnameVerifier E;
    @n6.d
    public final g F;
    @n6.e
    public final g6.c G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final long M;
    @n6.d
    public final x5.i N;
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final p f15707k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final k f15708l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final List<w> f15709m;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final List<w> f15710n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final r.c f15711o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f15712p;
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public final r5.b f15713q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f15714r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f15715s;
    @n6.d

    /* renamed from: t  reason: collision with root package name */
    public final n f15716t;
    @n6.e

    /* renamed from: u  reason: collision with root package name */
    public final c f15717u;
    @n6.d

    /* renamed from: v  reason: collision with root package name */
    public final q f15718v;
    @n6.e

    /* renamed from: w  reason: collision with root package name */
    public final Proxy f15719w;
    @n6.d

    /* renamed from: x  reason: collision with root package name */
    public final ProxySelector f15720x;
    @n6.d

    /* renamed from: y  reason: collision with root package name */
    public final r5.b f15721y;
    @n6.d

    /* renamed from: z  reason: collision with root package name */
    public final SocketFactory f15722z;
    public static final b Q = new b(null);
    @n6.d
    public static final List<c0> O = s5.d.z(c0.HTTP_2, c0.HTTP_1_1);
    @n6.d
    public static final List<l> P = s5.d.z(l.f15979h, l.f15981j);

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        @n6.d
        public final List<l> a() {
            return b0.P;
        }

        @n6.d
        public final List<c0> b() {
            return b0.O;
        }

        public /* synthetic */ b(u4.w wVar) {
            this();
        }
    }

    public b0(@n6.d a aVar) {
        ProxySelector R;
        l0.p(aVar, "builder");
        this.f15707k = aVar.E();
        this.f15708l = aVar.B();
        this.f15709m = s5.d.c0(aVar.K());
        this.f15710n = s5.d.c0(aVar.M());
        this.f15711o = aVar.G();
        this.f15712p = aVar.T();
        this.f15713q = aVar.v();
        this.f15714r = aVar.H();
        this.f15715s = aVar.I();
        this.f15716t = aVar.D();
        this.f15717u = aVar.w();
        this.f15718v = aVar.F();
        this.f15719w = aVar.P();
        if (aVar.P() != null) {
            R = e6.a.f8805a;
        } else {
            R = aVar.R();
            R = R == null ? ProxySelector.getDefault() : R;
            if (R == null) {
                R = e6.a.f8805a;
            }
        }
        this.f15720x = R;
        this.f15721y = aVar.Q();
        this.f15722z = aVar.V();
        List<l> C = aVar.C();
        this.C = C;
        this.D = aVar.O();
        this.E = aVar.J();
        this.H = aVar.x();
        this.I = aVar.A();
        this.J = aVar.S();
        this.K = aVar.X();
        this.L = aVar.N();
        this.M = aVar.L();
        x5.i U = aVar.U();
        this.N = U == null ? new x5.i() : U;
        boolean z6 = true;
        if (!(C instanceof Collection) || !C.isEmpty()) {
            Iterator<T> it = C.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((l) it.next()).i()) {
                    z6 = false;
                    break;
                }
            }
        }
        if (z6) {
            this.A = null;
            this.G = null;
            this.B = null;
            this.F = g.f15871c;
        } else if (aVar.W() != null) {
            this.A = aVar.W();
            g6.c y6 = aVar.y();
            l0.m(y6);
            this.G = y6;
            X509TrustManager Y = aVar.Y();
            l0.m(Y);
            this.B = Y;
            g z7 = aVar.z();
            l0.m(y6);
            this.F = z7.j(y6);
        } else {
            j.a aVar2 = c6.j.f8005e;
            X509TrustManager r6 = aVar2.g().r();
            this.B = r6;
            c6.j g7 = aVar2.g();
            l0.m(r6);
            this.A = g7.q(r6);
            c.a aVar3 = g6.c.f10088a;
            l0.m(r6);
            g6.c a7 = aVar3.a(r6);
            this.G = a7;
            g z8 = aVar.z();
            l0.m(a7);
            this.F = z8.j(a7);
        }
        p0();
    }

    @s4.h(name = "-deprecated_protocols")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "protocols", imports = {}))
    public final List<c0> A() {
        return this.D;
    }

    @s4.h(name = "-deprecated_proxy")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxy", imports = {}))
    @n6.e
    public final Proxy B() {
        return this.f15719w;
    }

    @s4.h(name = "-deprecated_proxyAuthenticator")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxyAuthenticator", imports = {}))
    public final r5.b C() {
        return this.f15721y;
    }

    @s4.h(name = "-deprecated_proxySelector")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxySelector", imports = {}))
    public final ProxySelector D() {
        return this.f15720x;
    }

    @s4.h(name = "-deprecated_readTimeoutMillis")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "readTimeoutMillis", imports = {}))
    public final int E() {
        return this.J;
    }

    @s4.h(name = "-deprecated_retryOnConnectionFailure")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "retryOnConnectionFailure", imports = {}))
    public final boolean F() {
        return this.f15712p;
    }

    @s4.h(name = "-deprecated_socketFactory")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "socketFactory", imports = {}))
    public final SocketFactory G() {
        return this.f15722z;
    }

    @s4.h(name = "-deprecated_sslSocketFactory")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "sslSocketFactory", imports = {}))
    public final SSLSocketFactory H() {
        return o0();
    }

    @s4.h(name = "-deprecated_writeTimeoutMillis")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "writeTimeoutMillis", imports = {}))
    public final int I() {
        return this.K;
    }

    @s4.h(name = "authenticator")
    @n6.d
    public final r5.b M() {
        return this.f15713q;
    }

    @s4.h(name = "cache")
    @n6.e
    public final c N() {
        return this.f15717u;
    }

    @s4.h(name = "callTimeoutMillis")
    public final int O() {
        return this.H;
    }

    @s4.h(name = "certificateChainCleaner")
    @n6.e
    public final g6.c P() {
        return this.G;
    }

    @s4.h(name = "certificatePinner")
    @n6.d
    public final g Q() {
        return this.F;
    }

    @s4.h(name = "connectTimeoutMillis")
    public final int R() {
        return this.I;
    }

    @s4.h(name = "connectionPool")
    @n6.d
    public final k S() {
        return this.f15708l;
    }

    @s4.h(name = "connectionSpecs")
    @n6.d
    public final List<l> T() {
        return this.C;
    }

    @s4.h(name = "cookieJar")
    @n6.d
    public final n U() {
        return this.f15716t;
    }

    @s4.h(name = "dispatcher")
    @n6.d
    public final p V() {
        return this.f15707k;
    }

    @s4.h(name = "dns")
    @n6.d
    public final q W() {
        return this.f15718v;
    }

    @s4.h(name = "eventListenerFactory")
    @n6.d
    public final r.c X() {
        return this.f15711o;
    }

    @s4.h(name = "followRedirects")
    public final boolean Y() {
        return this.f15714r;
    }

    @s4.h(name = "followSslRedirects")
    public final boolean Z() {
        return this.f15715s;
    }

    @n6.d
    public final x5.i a0() {
        return this.N;
    }

    @s4.h(name = "hostnameVerifier")
    @n6.d
    public final HostnameVerifier b0() {
        return this.E;
    }

    @s4.h(name = "interceptors")
    @n6.d
    public final List<w> c0() {
        return this.f15709m;
    }

    @n6.d
    public Object clone() {
        return super.clone();
    }

    @s4.h(name = "minWebSocketMessageToCompress")
    public final long d0() {
        return this.M;
    }

    @Override // r5.j0.a
    @n6.d
    public j0 e(@n6.d d0 d0Var, @n6.d k0 k0Var) {
        l0.p(d0Var, "request");
        l0.p(k0Var, "listener");
        h6.e eVar = new h6.e(w5.d.f18228h, d0Var, k0Var, new Random(), this.L, null, this.M);
        eVar.t(this);
        return eVar;
    }

    @s4.h(name = "networkInterceptors")
    @n6.d
    public final List<w> e0() {
        return this.f15710n;
    }

    @n6.d
    public a f0() {
        return new a(this);
    }

    @Override // r5.e.a
    @n6.d
    public e g(@n6.d d0 d0Var) {
        l0.p(d0Var, "request");
        return new x5.e(this, d0Var, false);
    }

    @s4.h(name = "pingIntervalMillis")
    public final int g0() {
        return this.L;
    }

    @s4.h(name = "protocols")
    @n6.d
    public final List<c0> h0() {
        return this.D;
    }

    @s4.h(name = "proxy")
    @n6.e
    public final Proxy i0() {
        return this.f15719w;
    }

    @s4.h(name = "-deprecated_authenticator")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "authenticator", imports = {}))
    public final r5.b j() {
        return this.f15713q;
    }

    @s4.h(name = "proxyAuthenticator")
    @n6.d
    public final r5.b j0() {
        return this.f15721y;
    }

    @s4.h(name = "-deprecated_cache")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "cache", imports = {}))
    @n6.e
    public final c k() {
        return this.f15717u;
    }

    @s4.h(name = "proxySelector")
    @n6.d
    public final ProxySelector k0() {
        return this.f15720x;
    }

    @s4.h(name = "-deprecated_callTimeoutMillis")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "callTimeoutMillis", imports = {}))
    public final int l() {
        return this.H;
    }

    @s4.h(name = "readTimeoutMillis")
    public final int l0() {
        return this.J;
    }

    @s4.h(name = "-deprecated_certificatePinner")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "certificatePinner", imports = {}))
    public final g m() {
        return this.F;
    }

    @s4.h(name = "retryOnConnectionFailure")
    public final boolean m0() {
        return this.f15712p;
    }

    @s4.h(name = "-deprecated_connectTimeoutMillis")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "connectTimeoutMillis", imports = {}))
    public final int n() {
        return this.I;
    }

    @s4.h(name = "socketFactory")
    @n6.d
    public final SocketFactory n0() {
        return this.f15722z;
    }

    @s4.h(name = "-deprecated_connectionPool")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "connectionPool", imports = {}))
    public final k o() {
        return this.f15708l;
    }

    @s4.h(name = "sslSocketFactory")
    @n6.d
    public final SSLSocketFactory o0() {
        SSLSocketFactory sSLSocketFactory = this.A;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @s4.h(name = "-deprecated_connectionSpecs")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "connectionSpecs", imports = {}))
    public final List<l> p() {
        return this.C;
    }

    public final void p0() {
        boolean z6;
        if (this.f15709m == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if ((!r0.contains(null)) != true) {
            throw new IllegalStateException(("Null interceptor: " + this.f15709m).toString());
        }
        if (this.f15710n == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if ((!r0.contains(null)) != true) {
            throw new IllegalStateException(("Null network interceptor: " + this.f15710n).toString());
        }
        List<l> list = this.C;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).i()) {
                    z6 = false;
                    break;
                }
            }
        }
        z6 = true;
        if (!z6) {
            if (this.A == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.G == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.B == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.A == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.G == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.B == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!l0.g(this.F, g.f15871c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @s4.h(name = "-deprecated_cookieJar")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "cookieJar", imports = {}))
    public final n q() {
        return this.f15716t;
    }

    @s4.h(name = "writeTimeoutMillis")
    public final int q0() {
        return this.K;
    }

    @s4.h(name = "-deprecated_dispatcher")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "dispatcher", imports = {}))
    public final p r() {
        return this.f15707k;
    }

    @s4.h(name = "x509TrustManager")
    @n6.e
    public final X509TrustManager r0() {
        return this.B;
    }

    @s4.h(name = "-deprecated_dns")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "dns", imports = {}))
    public final q s() {
        return this.f15718v;
    }

    @s4.h(name = "-deprecated_eventListenerFactory")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "eventListenerFactory", imports = {}))
    public final r.c t() {
        return this.f15711o;
    }

    @s4.h(name = "-deprecated_followRedirects")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "followRedirects", imports = {}))
    public final boolean u() {
        return this.f15714r;
    }

    @s4.h(name = "-deprecated_followSslRedirects")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "followSslRedirects", imports = {}))
    public final boolean v() {
        return this.f15715s;
    }

    @s4.h(name = "-deprecated_hostnameVerifier")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "hostnameVerifier", imports = {}))
    public final HostnameVerifier w() {
        return this.E;
    }

    @s4.h(name = "-deprecated_interceptors")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "interceptors", imports = {}))
    public final List<w> x() {
        return this.f15709m;
    }

    @s4.h(name = "-deprecated_networkInterceptors")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "networkInterceptors", imports = {}))
    public final List<w> y() {
        return this.f15710n;
    }

    @s4.h(name = "-deprecated_pingIntervalMillis")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "pingIntervalMillis", imports = {}))
    public final int z() {
        return this.L;
    }

    /* loaded from: classes.dex */
    public static final class a {
        public int A;
        public int B;
        public long C;
        @n6.e
        public x5.i D;
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public p f15723a;
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public k f15724b;
        @n6.d

        /* renamed from: c  reason: collision with root package name */
        public final List<w> f15725c;
        @n6.d

        /* renamed from: d  reason: collision with root package name */
        public final List<w> f15726d;
        @n6.d

        /* renamed from: e  reason: collision with root package name */
        public r.c f15727e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f15728f;
        @n6.d

        /* renamed from: g  reason: collision with root package name */
        public r5.b f15729g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f15730h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f15731i;
        @n6.d

        /* renamed from: j  reason: collision with root package name */
        public n f15732j;
        @n6.e

        /* renamed from: k  reason: collision with root package name */
        public c f15733k;
        @n6.d

        /* renamed from: l  reason: collision with root package name */
        public q f15734l;
        @n6.e

        /* renamed from: m  reason: collision with root package name */
        public Proxy f15735m;
        @n6.e

        /* renamed from: n  reason: collision with root package name */
        public ProxySelector f15736n;
        @n6.d

        /* renamed from: o  reason: collision with root package name */
        public r5.b f15737o;
        @n6.d

        /* renamed from: p  reason: collision with root package name */
        public SocketFactory f15738p;
        @n6.e

        /* renamed from: q  reason: collision with root package name */
        public SSLSocketFactory f15739q;
        @n6.e

        /* renamed from: r  reason: collision with root package name */
        public X509TrustManager f15740r;
        @n6.d

        /* renamed from: s  reason: collision with root package name */
        public List<l> f15741s;
        @n6.d

        /* renamed from: t  reason: collision with root package name */
        public List<? extends c0> f15742t;
        @n6.d

        /* renamed from: u  reason: collision with root package name */
        public HostnameVerifier f15743u;
        @n6.d

        /* renamed from: v  reason: collision with root package name */
        public g f15744v;
        @n6.e

        /* renamed from: w  reason: collision with root package name */
        public g6.c f15745w;

        /* renamed from: x  reason: collision with root package name */
        public int f15746x;

        /* renamed from: y  reason: collision with root package name */
        public int f15747y;

        /* renamed from: z  reason: collision with root package name */
        public int f15748z;

        /* renamed from: r5.b0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0229a implements w {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ t4.l f15749b;

            public C0229a(t4.l lVar) {
                this.f15749b = lVar;
            }

            @Override // r5.w
            @n6.d
            public final f0 a(@n6.d w.a aVar) {
                l0.p(aVar, "chain");
                return (f0) this.f15749b.O(aVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements w {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ t4.l f15750b;

            public b(t4.l lVar) {
                this.f15750b = lVar;
            }

            @Override // r5.w
            @n6.d
            public final f0 a(@n6.d w.a aVar) {
                l0.p(aVar, "chain");
                return (f0) this.f15750b.O(aVar);
            }
        }

        public a() {
            this.f15723a = new p();
            this.f15724b = new k();
            this.f15725c = new ArrayList();
            this.f15726d = new ArrayList();
            this.f15727e = s5.d.e(r.f16028a);
            this.f15728f = true;
            r5.b bVar = r5.b.f15703a;
            this.f15729g = bVar;
            this.f15730h = true;
            this.f15731i = true;
            this.f15732j = n.f16014a;
            this.f15734l = q.f16025a;
            this.f15737o = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            l0.o(socketFactory, "SocketFactory.getDefault()");
            this.f15738p = socketFactory;
            b bVar2 = b0.Q;
            this.f15741s = bVar2.a();
            this.f15742t = bVar2.b();
            this.f15743u = g6.d.f10091c;
            this.f15744v = g.f15871c;
            this.f15747y = 10000;
            this.f15748z = 10000;
            this.A = 10000;
            this.C = h6.e.C;
        }

        public final int A() {
            return this.f15747y;
        }

        public final void A0(@n6.d HostnameVerifier hostnameVerifier) {
            l0.p(hostnameVerifier, "<set-?>");
            this.f15743u = hostnameVerifier;
        }

        @n6.d
        public final k B() {
            return this.f15724b;
        }

        public final void B0(long j7) {
            this.C = j7;
        }

        @n6.d
        public final List<l> C() {
            return this.f15741s;
        }

        public final void C0(int i7) {
            this.B = i7;
        }

        @n6.d
        public final n D() {
            return this.f15732j;
        }

        public final void D0(@n6.d List<? extends c0> list) {
            l0.p(list, "<set-?>");
            this.f15742t = list;
        }

        @n6.d
        public final p E() {
            return this.f15723a;
        }

        public final void E0(@n6.e Proxy proxy) {
            this.f15735m = proxy;
        }

        @n6.d
        public final q F() {
            return this.f15734l;
        }

        public final void F0(@n6.d r5.b bVar) {
            l0.p(bVar, "<set-?>");
            this.f15737o = bVar;
        }

        @n6.d
        public final r.c G() {
            return this.f15727e;
        }

        public final void G0(@n6.e ProxySelector proxySelector) {
            this.f15736n = proxySelector;
        }

        public final boolean H() {
            return this.f15730h;
        }

        public final void H0(int i7) {
            this.f15748z = i7;
        }

        public final boolean I() {
            return this.f15731i;
        }

        public final void I0(boolean z6) {
            this.f15728f = z6;
        }

        @n6.d
        public final HostnameVerifier J() {
            return this.f15743u;
        }

        public final void J0(@n6.e x5.i iVar) {
            this.D = iVar;
        }

        @n6.d
        public final List<w> K() {
            return this.f15725c;
        }

        public final void K0(@n6.d SocketFactory socketFactory) {
            l0.p(socketFactory, "<set-?>");
            this.f15738p = socketFactory;
        }

        public final long L() {
            return this.C;
        }

        public final void L0(@n6.e SSLSocketFactory sSLSocketFactory) {
            this.f15739q = sSLSocketFactory;
        }

        @n6.d
        public final List<w> M() {
            return this.f15726d;
        }

        public final void M0(int i7) {
            this.A = i7;
        }

        public final int N() {
            return this.B;
        }

        public final void N0(@n6.e X509TrustManager x509TrustManager) {
            this.f15740r = x509TrustManager;
        }

        @n6.d
        public final List<c0> O() {
            return this.f15742t;
        }

        @n6.d
        public final a O0(@n6.d SocketFactory socketFactory) {
            l0.p(socketFactory, "socketFactory");
            if ((!(socketFactory instanceof SSLSocketFactory)) == true) {
                if ((!l0.g(socketFactory, this.f15738p)) != false) {
                    this.D = null;
                }
                this.f15738p = socketFactory;
                return this;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
        }

        @n6.e
        public final Proxy P() {
            return this.f15735m;
        }

        @n6.d
        @v3.k(level = v3.m.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        public final a P0(@n6.d SSLSocketFactory sSLSocketFactory) {
            l0.p(sSLSocketFactory, "sslSocketFactory");
            if ((!l0.g(sSLSocketFactory, this.f15739q)) != false) {
                this.D = null;
            }
            this.f15739q = sSLSocketFactory;
            j.a aVar = c6.j.f8005e;
            X509TrustManager s6 = aVar.g().s(sSLSocketFactory);
            if (s6 != null) {
                this.f15740r = s6;
                c6.j g7 = aVar.g();
                X509TrustManager x509TrustManager = this.f15740r;
                l0.m(x509TrustManager);
                this.f15745w = g7.d(x509TrustManager);
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + aVar.g() + ", sslSocketFactory is " + sSLSocketFactory.getClass());
        }

        @n6.d
        public final r5.b Q() {
            return this.f15737o;
        }

        @n6.d
        public final a Q0(@n6.d SSLSocketFactory sSLSocketFactory, @n6.d X509TrustManager x509TrustManager) {
            l0.p(sSLSocketFactory, "sslSocketFactory");
            l0.p(x509TrustManager, "trustManager");
            if ((!l0.g(sSLSocketFactory, this.f15739q)) != false || (!l0.g(x509TrustManager, this.f15740r)) != false) {
                this.D = null;
            }
            this.f15739q = sSLSocketFactory;
            this.f15745w = g6.c.f10088a.a(x509TrustManager);
            this.f15740r = x509TrustManager;
            return this;
        }

        @n6.e
        public final ProxySelector R() {
            return this.f15736n;
        }

        @n6.d
        public final a R0(long j7, @n6.d TimeUnit timeUnit) {
            l0.p(timeUnit, "unit");
            this.A = s5.d.j("timeout", j7, timeUnit);
            return this;
        }

        public final int S() {
            return this.f15748z;
        }

        @n6.d
        @IgnoreJRERequirement
        public final a S0(@n6.d Duration duration) {
            l0.p(duration, v.h.f17253b);
            R0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final boolean T() {
            return this.f15728f;
        }

        @n6.e
        public final x5.i U() {
            return this.D;
        }

        @n6.d
        public final SocketFactory V() {
            return this.f15738p;
        }

        @n6.e
        public final SSLSocketFactory W() {
            return this.f15739q;
        }

        public final int X() {
            return this.A;
        }

        @n6.e
        public final X509TrustManager Y() {
            return this.f15740r;
        }

        @n6.d
        public final a Z(@n6.d HostnameVerifier hostnameVerifier) {
            l0.p(hostnameVerifier, "hostnameVerifier");
            if ((!l0.g(hostnameVerifier, this.f15743u)) != false) {
                this.D = null;
            }
            this.f15743u = hostnameVerifier;
            return this;
        }

        @s4.h(name = "-addInterceptor")
        @n6.d
        public final a a(@n6.d t4.l<? super w.a, f0> lVar) {
            l0.p(lVar, "block");
            return c(new C0229a(lVar));
        }

        @n6.d
        public final List<w> a0() {
            return this.f15725c;
        }

        @s4.h(name = "-addNetworkInterceptor")
        @n6.d
        public final a b(@n6.d t4.l<? super w.a, f0> lVar) {
            l0.p(lVar, "block");
            return d(new b(lVar));
        }

        @n6.d
        public final a b0(long j7) {
            if (j7 >= 0) {
                this.C = j7;
                return this;
            }
            throw new IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + j7).toString());
        }

        @n6.d
        public final a c(@n6.d w wVar) {
            l0.p(wVar, "interceptor");
            this.f15725c.add(wVar);
            return this;
        }

        @n6.d
        public final List<w> c0() {
            return this.f15726d;
        }

        @n6.d
        public final a d(@n6.d w wVar) {
            l0.p(wVar, "interceptor");
            this.f15726d.add(wVar);
            return this;
        }

        @n6.d
        public final a d0(long j7, @n6.d TimeUnit timeUnit) {
            l0.p(timeUnit, "unit");
            this.B = s5.d.j("interval", j7, timeUnit);
            return this;
        }

        @n6.d
        public final a e(@n6.d r5.b bVar) {
            l0.p(bVar, "authenticator");
            this.f15729g = bVar;
            return this;
        }

        @n6.d
        @IgnoreJRERequirement
        public final a e0(@n6.d Duration duration) {
            l0.p(duration, v.h.f17253b);
            d0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @n6.d
        public final b0 f() {
            return new b0(this);
        }

        @n6.d
        public final a f0(@n6.d List<? extends c0> list) {
            l0.p(list, "protocols");
            List T5 = x3.e0.T5(list);
            c0 c0Var = c0.H2_PRIOR_KNOWLEDGE;
            if (!(T5.contains(c0Var) || T5.contains(c0.HTTP_1_1))) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + T5).toString());
            }
            if (!(!T5.contains(c0Var) || T5.size() <= 1)) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + T5).toString());
            } else if ((!T5.contains(c0.HTTP_1_0)) != true) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + T5).toString());
            } else if ((!T5.contains(null)) == true) {
                T5.remove(c0.SPDY_3);
                if ((!l0.g(T5, this.f15742t)) != false) {
                    this.D = null;
                }
                List<? extends c0> unmodifiableList = Collections.unmodifiableList(T5);
                l0.o(unmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
                this.f15742t = unmodifiableList;
                return this;
            } else {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
        }

        @n6.d
        public final a g(@n6.e c cVar) {
            this.f15733k = cVar;
            return this;
        }

        @n6.d
        public final a g0(@n6.e Proxy proxy) {
            if ((!l0.g(proxy, this.f15735m)) != false) {
                this.D = null;
            }
            this.f15735m = proxy;
            return this;
        }

        @n6.d
        public final a h(long j7, @n6.d TimeUnit timeUnit) {
            l0.p(timeUnit, "unit");
            this.f15746x = s5.d.j("timeout", j7, timeUnit);
            return this;
        }

        @n6.d
        public final a h0(@n6.d r5.b bVar) {
            l0.p(bVar, "proxyAuthenticator");
            if ((!l0.g(bVar, this.f15737o)) != false) {
                this.D = null;
            }
            this.f15737o = bVar;
            return this;
        }

        @n6.d
        @IgnoreJRERequirement
        public final a i(@n6.d Duration duration) {
            l0.p(duration, v.h.f17253b);
            h(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @n6.d
        public final a i0(@n6.d ProxySelector proxySelector) {
            l0.p(proxySelector, "proxySelector");
            if ((!l0.g(proxySelector, this.f15736n)) != false) {
                this.D = null;
            }
            this.f15736n = proxySelector;
            return this;
        }

        @n6.d
        public final a j(@n6.d g gVar) {
            l0.p(gVar, "certificatePinner");
            if ((!l0.g(gVar, this.f15744v)) != false) {
                this.D = null;
            }
            this.f15744v = gVar;
            return this;
        }

        @n6.d
        public final a j0(long j7, @n6.d TimeUnit timeUnit) {
            l0.p(timeUnit, "unit");
            this.f15748z = s5.d.j("timeout", j7, timeUnit);
            return this;
        }

        @n6.d
        public final a k(long j7, @n6.d TimeUnit timeUnit) {
            l0.p(timeUnit, "unit");
            this.f15747y = s5.d.j("timeout", j7, timeUnit);
            return this;
        }

        @n6.d
        @IgnoreJRERequirement
        public final a k0(@n6.d Duration duration) {
            l0.p(duration, v.h.f17253b);
            j0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @n6.d
        @IgnoreJRERequirement
        public final a l(@n6.d Duration duration) {
            l0.p(duration, v.h.f17253b);
            k(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @n6.d
        public final a l0(boolean z6) {
            this.f15728f = z6;
            return this;
        }

        @n6.d
        public final a m(@n6.d k kVar) {
            l0.p(kVar, "connectionPool");
            this.f15724b = kVar;
            return this;
        }

        public final void m0(@n6.d r5.b bVar) {
            l0.p(bVar, "<set-?>");
            this.f15729g = bVar;
        }

        @n6.d
        public final a n(@n6.d List<l> list) {
            l0.p(list, "connectionSpecs");
            if ((!l0.g(list, this.f15741s)) != false) {
                this.D = null;
            }
            this.f15741s = s5.d.c0(list);
            return this;
        }

        public final void n0(@n6.e c cVar) {
            this.f15733k = cVar;
        }

        @n6.d
        public final a o(@n6.d n nVar) {
            l0.p(nVar, "cookieJar");
            this.f15732j = nVar;
            return this;
        }

        public final void o0(int i7) {
            this.f15746x = i7;
        }

        @n6.d
        public final a p(@n6.d p pVar) {
            l0.p(pVar, "dispatcher");
            this.f15723a = pVar;
            return this;
        }

        public final void p0(@n6.e g6.c cVar) {
            this.f15745w = cVar;
        }

        @n6.d
        public final a q(@n6.d q qVar) {
            l0.p(qVar, "dns");
            if ((!l0.g(qVar, this.f15734l)) != false) {
                this.D = null;
            }
            this.f15734l = qVar;
            return this;
        }

        public final void q0(@n6.d g gVar) {
            l0.p(gVar, "<set-?>");
            this.f15744v = gVar;
        }

        @n6.d
        public final a r(@n6.d r rVar) {
            l0.p(rVar, "eventListener");
            this.f15727e = s5.d.e(rVar);
            return this;
        }

        public final void r0(int i7) {
            this.f15747y = i7;
        }

        @n6.d
        public final a s(@n6.d r.c cVar) {
            l0.p(cVar, "eventListenerFactory");
            this.f15727e = cVar;
            return this;
        }

        public final void s0(@n6.d k kVar) {
            l0.p(kVar, "<set-?>");
            this.f15724b = kVar;
        }

        @n6.d
        public final a t(boolean z6) {
            this.f15730h = z6;
            return this;
        }

        public final void t0(@n6.d List<l> list) {
            l0.p(list, "<set-?>");
            this.f15741s = list;
        }

        @n6.d
        public final a u(boolean z6) {
            this.f15731i = z6;
            return this;
        }

        public final void u0(@n6.d n nVar) {
            l0.p(nVar, "<set-?>");
            this.f15732j = nVar;
        }

        @n6.d
        public final r5.b v() {
            return this.f15729g;
        }

        public final void v0(@n6.d p pVar) {
            l0.p(pVar, "<set-?>");
            this.f15723a = pVar;
        }

        @n6.e
        public final c w() {
            return this.f15733k;
        }

        public final void w0(@n6.d q qVar) {
            l0.p(qVar, "<set-?>");
            this.f15734l = qVar;
        }

        public final int x() {
            return this.f15746x;
        }

        public final void x0(@n6.d r.c cVar) {
            l0.p(cVar, "<set-?>");
            this.f15727e = cVar;
        }

        @n6.e
        public final g6.c y() {
            return this.f15745w;
        }

        public final void y0(boolean z6) {
            this.f15730h = z6;
        }

        @n6.d
        public final g z() {
            return this.f15744v;
        }

        public final void z0(boolean z6) {
            this.f15731i = z6;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@n6.d b0 b0Var) {
            this();
            l0.p(b0Var, "okHttpClient");
            this.f15723a = b0Var.V();
            this.f15724b = b0Var.S();
            x3.b0.o0(this.f15725c, b0Var.c0());
            x3.b0.o0(this.f15726d, b0Var.e0());
            this.f15727e = b0Var.X();
            this.f15728f = b0Var.m0();
            this.f15729g = b0Var.M();
            this.f15730h = b0Var.Y();
            this.f15731i = b0Var.Z();
            this.f15732j = b0Var.U();
            this.f15733k = b0Var.N();
            this.f15734l = b0Var.W();
            this.f15735m = b0Var.i0();
            this.f15736n = b0Var.k0();
            this.f15737o = b0Var.j0();
            this.f15738p = b0Var.n0();
            this.f15739q = b0Var.A;
            this.f15740r = b0Var.r0();
            this.f15741s = b0Var.T();
            this.f15742t = b0Var.h0();
            this.f15743u = b0Var.b0();
            this.f15744v = b0Var.Q();
            this.f15745w = b0Var.P();
            this.f15746x = b0Var.O();
            this.f15747y = b0Var.R();
            this.f15748z = b0Var.l0();
            this.A = b0Var.q0();
            this.B = b0Var.g0();
            this.C = b0Var.d0();
            this.D = b0Var.a0();
        }
    }

    public b0() {
        this(new a());
    }
}
