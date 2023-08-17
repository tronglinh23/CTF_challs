package u5;

import i5.b0;
import i6.a0;
import i6.m;
import i6.m0;
import i6.n;
import i6.o;
import i6.o0;
import i6.q0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import r5.c0;
import r5.d0;
import r5.f0;
import r5.g0;
import r5.r;
import r5.u;
import r5.w;
import u.v;
import u4.l0;
import u5.c;
import y5.f;
import y5.h;
/* loaded from: classes.dex */
public final class a implements w {

    /* renamed from: c  reason: collision with root package name */
    public static final C0250a f17523c = new C0250a(null);
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final r5.c f17524b;

    /* renamed from: u5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0250a {
        public C0250a() {
        }

        public final u c(u uVar, u uVar2) {
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i7 = 0; i7 < size; i7++) {
                String i8 = uVar.i(i7);
                String o6 = uVar.o(i7);
                if ((!b0.L1("Warning", i8, true) || !b0.v2(o6, "1", false, 2, null)) && (d(i8) || !e(i8) || uVar2.d(i8) == null)) {
                    aVar.g(i8, o6);
                }
            }
            int size2 = uVar2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                String i10 = uVar2.i(i9);
                if (!d(i10) && e(i10)) {
                    aVar.g(i10, uVar2.o(i9));
                }
            }
            return aVar.i();
        }

        public final boolean d(String str) {
            return b0.L1("Content-Length", str, true) || b0.L1("Content-Encoding", str, true) || b0.L1("Content-Type", str, true);
        }

        public final boolean e(String str) {
            return (b0.L1("Connection", str, true) || b0.L1("Keep-Alive", str, true) || b0.L1("Proxy-Authenticate", str, true) || b0.L1("Proxy-Authorization", str, true) || b0.L1("TE", str, true) || b0.L1("Trailers", str, true) || b0.L1("Transfer-Encoding", str, true) || b0.L1("Upgrade", str, true)) ? false : true;
        }

        public final f0 f(f0 f0Var) {
            return (f0Var != null ? f0Var.A() : null) != null ? f0Var.z0().b(null).c() : f0Var;
        }

        public /* synthetic */ C0250a(u4.w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements o0 {

        /* renamed from: k  reason: collision with root package name */
        public boolean f17525k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o f17526l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ u5.b f17527m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ n f17528n;

        public b(o oVar, u5.b bVar, n nVar) {
            this.f17526l = oVar;
            this.f17527m = bVar;
            this.f17528n = nVar;
        }

        @Override // i6.o0
        @n6.d
        public q0 c() {
            return this.f17526l.c();
        }

        @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f17525k && !s5.d.t(this, 100, TimeUnit.MILLISECONDS)) {
                this.f17525k = true;
                this.f17527m.b();
            }
            this.f17526l.close();
        }

        @Override // i6.o0
        public long l0(@n6.d m mVar, long j7) throws IOException {
            l0.p(mVar, "sink");
            try {
                long l02 = this.f17526l.l0(mVar, j7);
                if (l02 != -1) {
                    mVar.A(this.f17528n.j(), mVar.a1() - l02, l02);
                    this.f17528n.u0();
                    return l02;
                }
                if (!this.f17525k) {
                    this.f17525k = true;
                    this.f17528n.close();
                }
                return -1L;
            } catch (IOException e7) {
                if (!this.f17525k) {
                    this.f17525k = true;
                    this.f17527m.b();
                }
                throw e7;
            }
        }
    }

    public a(@n6.e r5.c cVar) {
        this.f17524b = cVar;
    }

    @Override // r5.w
    @n6.d
    public f0 a(@n6.d w.a aVar) throws IOException {
        r rVar;
        g0 A;
        g0 A2;
        l0.p(aVar, "chain");
        r5.e call = aVar.call();
        r5.c cVar = this.f17524b;
        f0 h7 = cVar != null ? cVar.h(aVar.a()) : null;
        c b7 = new c.b(System.currentTimeMillis(), aVar.a(), h7).b();
        d0 b8 = b7.b();
        f0 a7 = b7.a();
        r5.c cVar2 = this.f17524b;
        if (cVar2 != null) {
            cVar2.X(b7);
        }
        x5.e eVar = call instanceof x5.e ? call : null;
        if (eVar == null || (rVar = eVar.t()) == null) {
            rVar = r.f16028a;
        }
        if (h7 != null && a7 == null && (A2 = h7.A()) != null) {
            s5.d.l(A2);
        }
        if (b8 == null && a7 == null) {
            f0 c7 = new f0.a().E(aVar.a()).B(c0.HTTP_1_1).g(v.g.f17244l).y("Unsatisfiable Request (only-if-cached)").b(s5.d.f16653c).F(-1L).C(System.currentTimeMillis()).c();
            rVar.A(call, c7);
            return c7;
        } else if (b8 == null) {
            l0.m(a7);
            f0 c8 = a7.z0().d(f17523c.f(a7)).c();
            rVar.b(call, c8);
            return c8;
        } else {
            if (a7 != null) {
                rVar.a(call, a7);
            } else if (this.f17524b != null) {
                rVar.c(call);
            }
            try {
                f0 h8 = aVar.h(b8);
                if (h8 == null && h7 != null && A != null) {
                }
                if (a7 != null) {
                    if (h8 != null && h8.L() == 304) {
                        f0.a z02 = a7.z0();
                        C0250a c0250a = f17523c;
                        f0 c9 = z02.w(c0250a.c(a7.d0(), h8.d0())).F(h8.T0()).C(h8.M0()).d(c0250a.f(a7)).z(c0250a.f(h8)).c();
                        g0 A3 = h8.A();
                        l0.m(A3);
                        A3.close();
                        r5.c cVar3 = this.f17524b;
                        l0.m(cVar3);
                        cVar3.S();
                        this.f17524b.Z(a7, c9);
                        rVar.b(call, c9);
                        return c9;
                    }
                    g0 A4 = a7.A();
                    if (A4 != null) {
                        s5.d.l(A4);
                    }
                }
                l0.m(h8);
                f0.a z03 = h8.z0();
                C0250a c0250a2 = f17523c;
                f0 c10 = z03.d(c0250a2.f(a7)).z(c0250a2.f(h8)).c();
                if (this.f17524b != null) {
                    if (y5.e.c(c10) && c.f17529c.a(c10, b8)) {
                        f0 b9 = b(this.f17524b.E(c10), c10);
                        if (a7 != null) {
                            rVar.c(call);
                        }
                        return b9;
                    } else if (f.f18865a.a(b8.m())) {
                        try {
                            this.f17524b.I(b8);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c10;
            } finally {
                if (h7 != null && (A = h7.A()) != null) {
                    s5.d.l(A);
                }
            }
        }
    }

    public final f0 b(u5.b bVar, f0 f0Var) throws IOException {
        if (bVar == null) {
            return f0Var;
        }
        m0 a7 = bVar.a();
        g0 A = f0Var.A();
        l0.m(A);
        b bVar2 = new b(A.I(), bVar, a0.c(a7));
        return f0Var.z0().b(new h(f0.X(f0Var, "Content-Type", null, 2, null), f0Var.A().i(), a0.d(bVar2))).c();
    }

    @n6.e
    public final r5.c c() {
        return this.f17524b;
    }
}
