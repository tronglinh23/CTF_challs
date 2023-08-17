package y5;

import i5.b0;
import i6.a0;
import i6.n;
import java.io.IOException;
import java.net.ProtocolException;
import r5.d0;
import r5.e0;
import r5.f0;
import r5.g0;
import r5.w;
import u4.l0;
/* loaded from: classes.dex */
public final class b implements w {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18854b;

    public b(boolean z6) {
        this.f18854b = z6;
    }

    @Override // r5.w
    @n6.d
    public f0 a(@n6.d w.a aVar) throws IOException {
        boolean z6;
        f0.a aVar2;
        l0.p(aVar, "chain");
        g gVar = (g) aVar;
        x5.c n7 = gVar.n();
        l0.m(n7);
        d0 p6 = gVar.p();
        e0 f7 = p6.f();
        long currentTimeMillis = System.currentTimeMillis();
        n7.w(p6);
        if (!f.b(p6.m()) || f7 == null) {
            n7.o();
            z6 = true;
            aVar2 = null;
        } else {
            if (b0.L1("100-continue", p6.i("Expect"), true)) {
                n7.f();
                aVar2 = n7.q(true);
                n7.s();
                z6 = false;
            } else {
                z6 = true;
                aVar2 = null;
            }
            if (aVar2 != null) {
                n7.o();
                if (!n7.h().C()) {
                    n7.n();
                }
            } else if (f7.p()) {
                n7.f();
                f7.r(a0.c(n7.c(p6, true)));
            } else {
                n c7 = a0.c(n7.c(p6, false));
                f7.r(c7);
                c7.close();
            }
        }
        if (f7 == null || !f7.p()) {
            n7.e();
        }
        if (aVar2 == null) {
            aVar2 = n7.q(false);
            l0.m(aVar2);
            if (z6) {
                n7.s();
                z6 = false;
            }
        }
        f0 c8 = aVar2.E(p6).u(n7.h().b()).F(currentTimeMillis).C(System.currentTimeMillis()).c();
        int L = c8.L();
        if (L == 100) {
            f0.a q6 = n7.q(false);
            l0.m(q6);
            if (z6) {
                n7.s();
            }
            c8 = q6.E(p6).u(n7.h().b()).F(currentTimeMillis).C(System.currentTimeMillis()).c();
            L = c8.L();
        }
        n7.r(c8);
        f0 c9 = (this.f18854b && L == 101) ? c8.z0().b(s5.d.f16653c).c() : c8.z0().b(n7.p(c8)).c();
        if (b0.L1("close", c9.O0().i("Connection"), true) || b0.L1("close", f0.X(c9, "Connection", null, 2, null), true)) {
            n7.n();
        }
        if (L == 204 || L == 205) {
            g0 A = c9.A();
            if ((A != null ? A.i() : -1L) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(L);
                sb.append(" had non-zero Content-Length: ");
                g0 A2 = c9.A();
                sb.append(A2 != null ? Long.valueOf(A2.i()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return c9;
    }
}
