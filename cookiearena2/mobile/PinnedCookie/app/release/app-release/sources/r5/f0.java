package r5;

import com.google.android.material.card.MaterialCardViewHelper;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import r5.u;
import u4.l0;
import v3.b1;
/* loaded from: classes.dex */
public final class f0 implements Closeable {

    /* renamed from: k  reason: collision with root package name */
    public d f15844k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final d0 f15845l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final c0 f15846m;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final String f15847n;

    /* renamed from: o  reason: collision with root package name */
    public final int f15848o;
    @n6.e

    /* renamed from: p  reason: collision with root package name */
    public final t f15849p;
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public final u f15850q;
    @n6.e

    /* renamed from: r  reason: collision with root package name */
    public final g0 f15851r;
    @n6.e

    /* renamed from: s  reason: collision with root package name */
    public final f0 f15852s;
    @n6.e

    /* renamed from: t  reason: collision with root package name */
    public final f0 f15853t;
    @n6.e

    /* renamed from: u  reason: collision with root package name */
    public final f0 f15854u;

    /* renamed from: v  reason: collision with root package name */
    public final long f15855v;

    /* renamed from: w  reason: collision with root package name */
    public final long f15856w;
    @n6.e

    /* renamed from: x  reason: collision with root package name */
    public final x5.c f15857x;

    public f0(@n6.d d0 d0Var, @n6.d c0 c0Var, @n6.d String str, int i7, @n6.e t tVar, @n6.d u uVar, @n6.e g0 g0Var, @n6.e f0 f0Var, @n6.e f0 f0Var2, @n6.e f0 f0Var3, long j7, long j8, @n6.e x5.c cVar) {
        l0.p(d0Var, "request");
        l0.p(c0Var, "protocol");
        l0.p(str, "message");
        l0.p(uVar, "headers");
        this.f15845l = d0Var;
        this.f15846m = c0Var;
        this.f15847n = str;
        this.f15848o = i7;
        this.f15849p = tVar;
        this.f15850q = uVar;
        this.f15851r = g0Var;
        this.f15852s = f0Var;
        this.f15853t = f0Var2;
        this.f15854u = f0Var3;
        this.f15855v = j7;
        this.f15856w = j8;
        this.f15857x = cVar;
    }

    public static /* synthetic */ String X(f0 f0Var, String str, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        return f0Var.S(str, str2);
    }

    @s4.h(name = y0.c.f18717e)
    @n6.e
    public final g0 A() {
        return this.f15851r;
    }

    @s4.h(name = "cacheControl")
    @n6.d
    public final d C() {
        d dVar = this.f15844k;
        if (dVar == null) {
            d c7 = d.f15802p.c(this.f15850q);
            this.f15844k = c7;
            return c7;
        }
        return dVar;
    }

    @n6.d
    public final g0 C0(long j7) throws IOException {
        g0 g0Var = this.f15851r;
        l0.m(g0Var);
        i6.o A0 = g0Var.I().A0();
        i6.m mVar = new i6.m();
        A0.G(j7);
        mVar.N(A0, Math.min(j7, A0.j().a1()));
        return g0.f15882l.a(mVar, this.f15851r.k(), mVar.a1());
    }

    @s4.h(name = "cacheResponse")
    @n6.e
    public final f0 E() {
        return this.f15853t;
    }

    @s4.h(name = "priorResponse")
    @n6.e
    public final f0 E0() {
        return this.f15854u;
    }

    @n6.d
    public final List<h> I() {
        String str;
        u uVar = this.f15850q;
        int i7 = this.f15848o;
        if (i7 == 401) {
            str = "WWW-Authenticate";
        } else if (i7 != 407) {
            return x3.w.E();
        } else {
            str = "Proxy-Authenticate";
        }
        return y5.e.b(uVar, str);
    }

    @s4.h(name = "protocol")
    @n6.d
    public final c0 I0() {
        return this.f15846m;
    }

    @s4.h(name = "code")
    public final int L() {
        return this.f15848o;
    }

    @s4.h(name = "receivedResponseAtMillis")
    public final long M0() {
        return this.f15856w;
    }

    @s4.h(name = "exchange")
    @n6.e
    public final x5.c O() {
        return this.f15857x;
    }

    @s4.h(name = "request")
    @n6.d
    public final d0 O0() {
        return this.f15845l;
    }

    @s4.h(name = "handshake")
    @n6.e
    public final t Q() {
        return this.f15849p;
    }

    @s4.i
    @n6.e
    public final String R(@n6.d String str) {
        return X(this, str, null, 2, null);
    }

    @s4.i
    @n6.e
    public final String S(@n6.d String str, @n6.e String str2) {
        l0.p(str, "name");
        String d7 = this.f15850q.d(str);
        return d7 != null ? d7 : str2;
    }

    @s4.h(name = "sentRequestAtMillis")
    public final long T0() {
        return this.f15855v;
    }

    @n6.d
    public final u U0() throws IOException {
        x5.c cVar = this.f15857x;
        if (cVar != null) {
            return cVar.u();
        }
        throw new IllegalStateException("trailers not available".toString());
    }

    @n6.d
    public final List<String> Z(@n6.d String str) {
        l0.p(str, "name");
        return this.f15850q.p(str);
    }

    @s4.h(name = "-deprecated_body")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = y0.c.f18717e, imports = {}))
    @n6.e
    public final g0 a() {
        return this.f15851r;
    }

    @s4.h(name = "-deprecated_cacheControl")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "cacheControl", imports = {}))
    public final d b() {
        return C();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g0 g0Var = this.f15851r;
        if (g0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        g0Var.close();
    }

    @s4.h(name = "-deprecated_cacheResponse")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "cacheResponse", imports = {}))
    @n6.e
    public final f0 d() {
        return this.f15853t;
    }

    @s4.h(name = "headers")
    @n6.d
    public final u d0() {
        return this.f15850q;
    }

    @s4.h(name = "-deprecated_code")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "code", imports = {}))
    public final int e() {
        return this.f15848o;
    }

    @s4.h(name = "-deprecated_handshake")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "handshake", imports = {}))
    @n6.e
    public final t f() {
        return this.f15849p;
    }

    public final boolean f0() {
        int i7 = this.f15848o;
        if (i7 != 307 && i7 != 308) {
            switch (i7) {
                case MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @s4.h(name = "-deprecated_headers")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "headers", imports = {}))
    public final u h() {
        return this.f15850q;
    }

    @s4.h(name = "-deprecated_message")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "message", imports = {}))
    public final String i() {
        return this.f15847n;
    }

    @s4.h(name = "-deprecated_networkResponse")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "networkResponse", imports = {}))
    @n6.e
    public final f0 k() {
        return this.f15852s;
    }

    @s4.h(name = "-deprecated_priorResponse")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "priorResponse", imports = {}))
    @n6.e
    public final f0 l() {
        return this.f15854u;
    }

    @s4.h(name = "-deprecated_protocol")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "protocol", imports = {}))
    public final c0 m() {
        return this.f15846m;
    }

    @s4.h(name = "-deprecated_receivedResponseAtMillis")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "receivedResponseAtMillis", imports = {}))
    public final long p() {
        return this.f15856w;
    }

    public final boolean p0() {
        int i7 = this.f15848o;
        return 200 <= i7 && 299 >= i7;
    }

    @s4.h(name = "message")
    @n6.d
    public final String q0() {
        return this.f15847n;
    }

    @s4.h(name = "-deprecated_request")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "request", imports = {}))
    public final d0 t() {
        return this.f15845l;
    }

    @n6.d
    public String toString() {
        return "Response{protocol=" + this.f15846m + ", code=" + this.f15848o + ", message=" + this.f15847n + ", url=" + this.f15845l.q() + '}';
    }

    @s4.h(name = "-deprecated_sentRequestAtMillis")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "sentRequestAtMillis", imports = {}))
    public final long u() {
        return this.f15855v;
    }

    @s4.h(name = "networkResponse")
    @n6.e
    public final f0 w0() {
        return this.f15852s;
    }

    @n6.d
    public final a z0() {
        return new a(this);
    }

    /* loaded from: classes.dex */
    public static class a {
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public d0 f15858a;
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public c0 f15859b;

        /* renamed from: c  reason: collision with root package name */
        public int f15860c;
        @n6.e

        /* renamed from: d  reason: collision with root package name */
        public String f15861d;
        @n6.e

        /* renamed from: e  reason: collision with root package name */
        public t f15862e;
        @n6.d

        /* renamed from: f  reason: collision with root package name */
        public u.a f15863f;
        @n6.e

        /* renamed from: g  reason: collision with root package name */
        public g0 f15864g;
        @n6.e

        /* renamed from: h  reason: collision with root package name */
        public f0 f15865h;
        @n6.e

        /* renamed from: i  reason: collision with root package name */
        public f0 f15866i;
        @n6.e

        /* renamed from: j  reason: collision with root package name */
        public f0 f15867j;

        /* renamed from: k  reason: collision with root package name */
        public long f15868k;

        /* renamed from: l  reason: collision with root package name */
        public long f15869l;
        @n6.e

        /* renamed from: m  reason: collision with root package name */
        public x5.c f15870m;

        public a() {
            this.f15860c = -1;
            this.f15863f = new u.a();
        }

        @n6.d
        public a A(@n6.e f0 f0Var) {
            e(f0Var);
            this.f15867j = f0Var;
            return this;
        }

        @n6.d
        public a B(@n6.d c0 c0Var) {
            l0.p(c0Var, "protocol");
            this.f15859b = c0Var;
            return this;
        }

        @n6.d
        public a C(long j7) {
            this.f15869l = j7;
            return this;
        }

        @n6.d
        public a D(@n6.d String str) {
            l0.p(str, "name");
            this.f15863f.l(str);
            return this;
        }

        @n6.d
        public a E(@n6.d d0 d0Var) {
            l0.p(d0Var, "request");
            this.f15858a = d0Var;
            return this;
        }

        @n6.d
        public a F(long j7) {
            this.f15868k = j7;
            return this;
        }

        public final void G(@n6.e g0 g0Var) {
            this.f15864g = g0Var;
        }

        public final void H(@n6.e f0 f0Var) {
            this.f15866i = f0Var;
        }

        public final void I(int i7) {
            this.f15860c = i7;
        }

        public final void J(@n6.e x5.c cVar) {
            this.f15870m = cVar;
        }

        public final void K(@n6.e t tVar) {
            this.f15862e = tVar;
        }

        public final void L(@n6.d u.a aVar) {
            l0.p(aVar, "<set-?>");
            this.f15863f = aVar;
        }

        public final void M(@n6.e String str) {
            this.f15861d = str;
        }

        public final void N(@n6.e f0 f0Var) {
            this.f15865h = f0Var;
        }

        public final void O(@n6.e f0 f0Var) {
            this.f15867j = f0Var;
        }

        public final void P(@n6.e c0 c0Var) {
            this.f15859b = c0Var;
        }

        public final void Q(long j7) {
            this.f15869l = j7;
        }

        public final void R(@n6.e d0 d0Var) {
            this.f15858a = d0Var;
        }

        public final void S(long j7) {
            this.f15868k = j7;
        }

        @n6.d
        public a a(@n6.d String str, @n6.d String str2) {
            l0.p(str, "name");
            l0.p(str2, "value");
            this.f15863f.b(str, str2);
            return this;
        }

        @n6.d
        public a b(@n6.e g0 g0Var) {
            this.f15864g = g0Var;
            return this;
        }

        @n6.d
        public f0 c() {
            int i7 = this.f15860c;
            if (!(i7 >= 0)) {
                throw new IllegalStateException(("code < 0: " + this.f15860c).toString());
            }
            d0 d0Var = this.f15858a;
            if (d0Var != null) {
                c0 c0Var = this.f15859b;
                if (c0Var != null) {
                    String str = this.f15861d;
                    if (str != null) {
                        return new f0(d0Var, c0Var, str, i7, this.f15862e, this.f15863f.i(), this.f15864g, this.f15865h, this.f15866i, this.f15867j, this.f15868k, this.f15869l, this.f15870m);
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }

        @n6.d
        public a d(@n6.e f0 f0Var) {
            f("cacheResponse", f0Var);
            this.f15866i = f0Var;
            return this;
        }

        public final void e(f0 f0Var) {
            if (f0Var != null) {
                if (!(f0Var.A() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        public final void f(String str, f0 f0Var) {
            if (f0Var != null) {
                if (!(f0Var.A() == null)) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (!(f0Var.w0() == null)) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (!(f0Var.E() == null)) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (f0Var.E0() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        @n6.d
        public a g(int i7) {
            this.f15860c = i7;
            return this;
        }

        @n6.e
        public final g0 h() {
            return this.f15864g;
        }

        @n6.e
        public final f0 i() {
            return this.f15866i;
        }

        public final int j() {
            return this.f15860c;
        }

        @n6.e
        public final x5.c k() {
            return this.f15870m;
        }

        @n6.e
        public final t l() {
            return this.f15862e;
        }

        @n6.d
        public final u.a m() {
            return this.f15863f;
        }

        @n6.e
        public final String n() {
            return this.f15861d;
        }

        @n6.e
        public final f0 o() {
            return this.f15865h;
        }

        @n6.e
        public final f0 p() {
            return this.f15867j;
        }

        @n6.e
        public final c0 q() {
            return this.f15859b;
        }

        public final long r() {
            return this.f15869l;
        }

        @n6.e
        public final d0 s() {
            return this.f15858a;
        }

        public final long t() {
            return this.f15868k;
        }

        @n6.d
        public a u(@n6.e t tVar) {
            this.f15862e = tVar;
            return this;
        }

        @n6.d
        public a v(@n6.d String str, @n6.d String str2) {
            l0.p(str, "name");
            l0.p(str2, "value");
            this.f15863f.m(str, str2);
            return this;
        }

        @n6.d
        public a w(@n6.d u uVar) {
            l0.p(uVar, "headers");
            this.f15863f = uVar.k();
            return this;
        }

        public final void x(@n6.d x5.c cVar) {
            l0.p(cVar, "deferredTrailers");
            this.f15870m = cVar;
        }

        @n6.d
        public a y(@n6.d String str) {
            l0.p(str, "message");
            this.f15861d = str;
            return this;
        }

        @n6.d
        public a z(@n6.e f0 f0Var) {
            f("networkResponse", f0Var);
            this.f15865h = f0Var;
            return this;
        }

        public a(@n6.d f0 f0Var) {
            l0.p(f0Var, "response");
            this.f15860c = -1;
            this.f15858a = f0Var.O0();
            this.f15859b = f0Var.I0();
            this.f15860c = f0Var.L();
            this.f15861d = f0Var.q0();
            this.f15862e = f0Var.Q();
            this.f15863f = f0Var.d0().k();
            this.f15864g = f0Var.A();
            this.f15865h = f0Var.w0();
            this.f15866i = f0Var.E();
            this.f15867j = f0Var.E0();
            this.f15868k = f0Var.T0();
            this.f15869l = f0Var.M0();
            this.f15870m = f0Var.O();
        }
    }
}
