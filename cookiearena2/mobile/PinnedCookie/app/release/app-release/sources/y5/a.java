package y5;

import i5.b0;
import i6.a0;
import i6.v;
import java.io.IOException;
import java.util.List;
import r5.d0;
import r5.e0;
import r5.f0;
import r5.g0;
import r5.m;
import r5.n;
import r5.w;
import r5.x;
import u4.l0;
/* loaded from: classes.dex */
public final class a implements w {

    /* renamed from: b  reason: collision with root package name */
    public final n f18853b;

    public a(@n6.d n nVar) {
        l0.p(nVar, "cookieJar");
        this.f18853b = nVar;
    }

    @Override // r5.w
    @n6.d
    public f0 a(@n6.d w.a aVar) throws IOException {
        g0 A;
        l0.p(aVar, "chain");
        d0 a7 = aVar.a();
        d0.a n7 = a7.n();
        e0 f7 = a7.f();
        if (f7 != null) {
            x b7 = f7.b();
            if (b7 != null) {
                n7.n("Content-Type", b7.toString());
            }
            long a8 = f7.a();
            if (a8 != -1) {
                n7.n("Content-Length", String.valueOf(a8));
                n7.t("Transfer-Encoding");
            } else {
                n7.n("Transfer-Encoding", "chunked");
                n7.t("Content-Length");
            }
        }
        boolean z6 = false;
        if (a7.i("Host") == null) {
            n7.n("Host", s5.d.b0(a7.q(), false, 1, null));
        }
        if (a7.i("Connection") == null) {
            n7.n("Connection", "Keep-Alive");
        }
        if (a7.i("Accept-Encoding") == null && a7.i("Range") == null) {
            n7.n("Accept-Encoding", "gzip");
            z6 = true;
        }
        List<m> b8 = this.f18853b.b(a7.q());
        if ((!b8.isEmpty()) != false) {
            n7.n("Cookie", b(b8));
        }
        if (a7.i("User-Agent") == null) {
            n7.n("User-Agent", s5.d.f16660j);
        }
        f0 h7 = aVar.h(n7.b());
        e.g(this.f18853b, a7.q(), h7.d0());
        f0.a E = h7.z0().E(a7);
        if (z6 && b0.L1("gzip", f0.X(h7, "Content-Encoding", null, 2, null), true) && e.c(h7) && (A = h7.A()) != null) {
            v vVar = new v(A.I());
            E.w(h7.d0().k().l("Content-Encoding").l("Content-Length").i());
            E.b(new h(f0.X(h7, "Content-Type", null, 2, null), -1L, a0.d(vVar)));
        }
        return E.c();
    }

    public final String b(List<m> list) {
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        for (Object obj : list) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                x3.w.W();
            }
            m mVar = (m) obj;
            if (i7 > 0) {
                sb.append("; ");
            }
            sb.append(mVar.s());
            sb.append('=');
            sb.append(mVar.z());
            i7 = i8;
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
