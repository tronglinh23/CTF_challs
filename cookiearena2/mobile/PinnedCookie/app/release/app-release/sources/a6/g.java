package a6;

import i6.m0;
import i6.o0;
import i6.q0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import r5.b0;
import r5.c0;
import r5.d0;
import r5.f0;
import r5.u;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class g implements y5.d {

    /* renamed from: c  reason: collision with root package name */
    public volatile i f409c;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f410d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f411e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public final x5.f f412f;

    /* renamed from: g  reason: collision with root package name */
    public final y5.g f413g;

    /* renamed from: h  reason: collision with root package name */
    public final f f414h;

    /* renamed from: s  reason: collision with root package name */
    public static final a f408s = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final String f398i = "connection";

    /* renamed from: j  reason: collision with root package name */
    public static final String f399j = "host";

    /* renamed from: k  reason: collision with root package name */
    public static final String f400k = "keep-alive";

    /* renamed from: l  reason: collision with root package name */
    public static final String f401l = "proxy-connection";

    /* renamed from: n  reason: collision with root package name */
    public static final String f403n = "te";

    /* renamed from: m  reason: collision with root package name */
    public static final String f402m = "transfer-encoding";

    /* renamed from: o  reason: collision with root package name */
    public static final String f404o = "encoding";

    /* renamed from: p  reason: collision with root package name */
    public static final String f405p = "upgrade";

    /* renamed from: q  reason: collision with root package name */
    public static final List<String> f406q = s5.d.z(f398i, f399j, f400k, f401l, f403n, f402m, f404o, f405p, c.f240f, c.f241g, c.f242h, c.f243i);

    /* renamed from: r  reason: collision with root package name */
    public static final List<String> f407r = s5.d.z(f398i, f399j, f400k, f401l, f403n, f402m, f404o, f405p);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.d
        public final List<c> a(@n6.d d0 d0Var) {
            l0.p(d0Var, "request");
            u k7 = d0Var.k();
            ArrayList arrayList = new ArrayList(k7.size() + 4);
            arrayList.add(new c(c.f245k, d0Var.m()));
            arrayList.add(new c(c.f246l, y5.i.f18878a.c(d0Var.q())));
            String i7 = d0Var.i("Host");
            if (i7 != null) {
                arrayList.add(new c(c.f248n, i7));
            }
            arrayList.add(new c(c.f247m, d0Var.q().X()));
            int size = k7.size();
            for (int i8 = 0; i8 < size; i8++) {
                String i9 = k7.i(i8);
                Locale locale = Locale.US;
                l0.o(locale, "Locale.US");
                if (i9 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = i9.toLowerCase(locale);
                l0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!g.f406q.contains(lowerCase) || (l0.g(lowerCase, g.f403n) && l0.g(k7.o(i8), "trailers"))) {
                    arrayList.add(new c(lowerCase, k7.o(i8)));
                }
            }
            return arrayList;
        }

        @n6.d
        public final f0.a b(@n6.d u uVar, @n6.d c0 c0Var) {
            l0.p(uVar, "headerBlock");
            l0.p(c0Var, "protocol");
            u.a aVar = new u.a();
            int size = uVar.size();
            y5.k kVar = null;
            for (int i7 = 0; i7 < size; i7++) {
                String i8 = uVar.i(i7);
                String o6 = uVar.o(i7);
                if (l0.g(i8, c.f239e)) {
                    kVar = y5.k.f18886h.b("HTTP/1.1 " + o6);
                } else if (!g.f407r.contains(i8)) {
                    aVar.g(i8, o6);
                }
            }
            if (kVar != null) {
                return new f0.a().B(c0Var).g(kVar.f18888b).y(kVar.f18889c).w(aVar.i());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public g(@n6.d b0 b0Var, @n6.d x5.f fVar, @n6.d y5.g gVar, @n6.d f fVar2) {
        l0.p(b0Var, "client");
        l0.p(fVar, f398i);
        l0.p(gVar, "chain");
        l0.p(fVar2, "http2Connection");
        this.f412f = fVar;
        this.f413g = gVar;
        this.f414h = fVar2;
        List<c0> h02 = b0Var.h0();
        c0 c0Var = c0.H2_PRIOR_KNOWLEDGE;
        this.f410d = h02.contains(c0Var) ? c0Var : c0.HTTP_2;
    }

    @Override // y5.d
    public void a() {
        i iVar = this.f409c;
        l0.m(iVar);
        iVar.o().close();
    }

    @Override // y5.d
    @n6.d
    public o0 b(@n6.d f0 f0Var) {
        l0.p(f0Var, "response");
        i iVar = this.f409c;
        l0.m(iVar);
        return iVar.r();
    }

    @Override // y5.d
    public void c() {
        this.f414h.flush();
    }

    @Override // y5.d
    public void cancel() {
        this.f411e = true;
        i iVar = this.f409c;
        if (iVar != null) {
            iVar.f(b.CANCEL);
        }
    }

    @Override // y5.d
    public void d(@n6.d d0 d0Var) {
        l0.p(d0Var, "request");
        if (this.f409c != null) {
            return;
        }
        this.f409c = this.f414h.Y0(f408s.a(d0Var), d0Var.f() != null);
        if (this.f411e) {
            i iVar = this.f409c;
            l0.m(iVar);
            iVar.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        i iVar2 = this.f409c;
        l0.m(iVar2);
        q0 x6 = iVar2.x();
        long o6 = this.f413g.o();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x6.i(o6, timeUnit);
        i iVar3 = this.f409c;
        l0.m(iVar3);
        iVar3.L().i(this.f413g.q(), timeUnit);
    }

    @Override // y5.d
    public long e(@n6.d f0 f0Var) {
        l0.p(f0Var, "response");
        if (y5.e.c(f0Var)) {
            return s5.d.x(f0Var);
        }
        return 0L;
    }

    @Override // y5.d
    @n6.d
    public m0 f(@n6.d d0 d0Var, long j7) {
        l0.p(d0Var, "request");
        i iVar = this.f409c;
        l0.m(iVar);
        return iVar.o();
    }

    @Override // y5.d
    @n6.d
    public u g() {
        i iVar = this.f409c;
        l0.m(iVar);
        return iVar.I();
    }

    @Override // y5.d
    @n6.e
    public f0.a h(boolean z6) {
        i iVar = this.f409c;
        l0.m(iVar);
        f0.a b7 = f408s.b(iVar.H(), this.f410d);
        if (z6 && b7.j() == 100) {
            return null;
        }
        return b7;
    }

    @Override // y5.d
    @n6.d
    public x5.f i() {
        return this.f412f;
    }
}
