package y5;

import com.google.android.material.card.MaterialCardViewHelper;
import i5.o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import r5.b0;
import r5.d0;
import r5.e0;
import r5.f0;
import r5.h0;
import r5.v;
import r5.w;
import u4.l0;
/* loaded from: classes.dex */
public final class j implements w {

    /* renamed from: c  reason: collision with root package name */
    public static final int f18879c = 20;

    /* renamed from: d  reason: collision with root package name */
    public static final a f18880d = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public final b0 f18881b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    public j(@n6.d b0 b0Var) {
        l0.p(b0Var, "client");
        this.f18881b = b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        r7 = r0;
        r0 = r1.v();
        r6 = c(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r6 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (r0.l() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        r1.G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        r1.p(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        r0 = r6.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r0.q() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        r1.p(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
        r0 = r7.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        s5.d.l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
        if (r8 > 20) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        r0 = r0.z0().A(r7.z0().b(null).c()).c();
     */
    @Override // r5.w
    @n6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r5.f0 a(@n6.d r5.w.a r11) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            u4.l0.p(r11, r0)
            y5.g r11 = (y5.g) r11
            r5.d0 r0 = r11.p()
            x5.e r1 = r11.l()
            java.util.List r2 = x3.w.E()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.o(r0, r6)
            boolean r6 = r1.i()     // Catch: java.lang.Throwable -> Ld7
            if (r6 != 0) goto Lcf
            r5.f0 r0 = r11.h(r0)     // Catch: java.io.IOException -> L95 x5.j -> Lad java.lang.Throwable -> Ld7
            if (r7 == 0) goto L40
            r5.f0$a r0 = r0.z0()     // Catch: java.lang.Throwable -> Ld7
            r5.f0$a r6 = r7.z0()     // Catch: java.lang.Throwable -> Ld7
            r5.f0$a r6 = r6.b(r4)     // Catch: java.lang.Throwable -> Ld7
            r5.f0 r6 = r6.c()     // Catch: java.lang.Throwable -> Ld7
            r5.f0$a r0 = r0.A(r6)     // Catch: java.lang.Throwable -> Ld7
            r5.f0 r0 = r0.c()     // Catch: java.lang.Throwable -> Ld7
        L40:
            r7 = r0
            x5.c r0 = r1.v()     // Catch: java.lang.Throwable -> Ld7
            r5.d0 r6 = r10.c(r7, r0)     // Catch: java.lang.Throwable -> Ld7
            if (r6 != 0) goto L5a
            if (r0 == 0) goto L56
            boolean r11 = r0.l()     // Catch: java.lang.Throwable -> Ld7
            if (r11 == 0) goto L56
            r1.G()     // Catch: java.lang.Throwable -> Ld7
        L56:
            r1.p(r3)
            return r7
        L5a:
            r5.e0 r0 = r6.f()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L6a
            boolean r0 = r0.q()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L6a
            r1.p(r3)
            return r7
        L6a:
            r5.g0 r0 = r7.A()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L73
            s5.d.l(r0)     // Catch: java.lang.Throwable -> Ld7
        L73:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L7e
            r1.p(r5)
            r0 = r6
            goto L18
        L7e:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld7
            r0.<init>()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld7
            r0.append(r8)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld7
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld7
            throw r11     // Catch: java.lang.Throwable -> Ld7
        L95:
            r6 = move-exception
            boolean r9 = r6 instanceof a6.a     // Catch: java.lang.Throwable -> Ld7
            if (r9 != 0) goto L9c
            r9 = r5
            goto L9d
        L9c:
            r9 = r3
        L9d:
            boolean r9 = r10.e(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> Ld7
            if (r9 == 0) goto La8
            java.util.List r2 = x3.e0.A4(r2, r6)     // Catch: java.lang.Throwable -> Ld7
            goto Lc0
        La8:
            java.lang.Throwable r11 = s5.d.j0(r6, r2)     // Catch: java.lang.Throwable -> Ld7
            throw r11     // Catch: java.lang.Throwable -> Ld7
        Lad:
            r6 = move-exception
            java.io.IOException r9 = r6.c()     // Catch: java.lang.Throwable -> Ld7
            boolean r9 = r10.e(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> Ld7
            if (r9 == 0) goto Lc6
            java.io.IOException r6 = r6.b()     // Catch: java.lang.Throwable -> Ld7
            java.util.List r2 = x3.e0.A4(r2, r6)     // Catch: java.lang.Throwable -> Ld7
        Lc0:
            r1.p(r5)
            r6 = r3
            goto L19
        Lc6:
            java.io.IOException r11 = r6.b()     // Catch: java.lang.Throwable -> Ld7
            java.lang.Throwable r11 = s5.d.j0(r11, r2)     // Catch: java.lang.Throwable -> Ld7
            throw r11     // Catch: java.lang.Throwable -> Ld7
        Lcf:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld7
            throw r11     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r11 = move-exception
            r1.p(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.j.a(r5.w$a):r5.f0");
    }

    public final d0 b(f0 f0Var, String str) {
        String X;
        v W;
        if (!this.f18881b.Y() || (X = f0.X(f0Var, "Location", null, 2, null)) == null || (W = f0Var.O0().q().W(X)) == null) {
            return null;
        }
        if (l0.g(W.X(), f0Var.O0().q().X()) || this.f18881b.Z()) {
            d0.a n7 = f0Var.O0().n();
            if (f.b(str)) {
                int L = f0Var.L();
                f fVar = f.f18865a;
                boolean z6 = fVar.d(str) || L == 308 || L == 307;
                if (!fVar.c(str) || L == 308 || L == 307) {
                    n7.p(str, z6 ? f0Var.O0().f() : null);
                } else {
                    n7.p("GET", null);
                }
                if (!z6) {
                    n7.t("Transfer-Encoding");
                    n7.t("Content-Length");
                    n7.t("Content-Type");
                }
            }
            if (!s5.d.i(f0Var.O0().q(), W)) {
                n7.t("Authorization");
            }
            return n7.D(W).b();
        }
        return null;
    }

    public final d0 c(f0 f0Var, x5.c cVar) throws IOException {
        x5.f h7;
        h0 c7 = (cVar == null || (h7 = cVar.h()) == null) ? null : h7.c();
        int L = f0Var.L();
        String m7 = f0Var.O0().m();
        if (L != 307 && L != 308) {
            if (L != 401) {
                if (L == 421) {
                    e0 f7 = f0Var.O0().f();
                    if ((f7 == null || !f7.q()) && cVar != null && cVar.k()) {
                        cVar.h().F();
                        return f0Var.O0();
                    }
                    return null;
                } else if (L == 503) {
                    f0 E0 = f0Var.E0();
                    if ((E0 == null || E0.L() != 503) && g(f0Var, Integer.MAX_VALUE) == 0) {
                        return f0Var.O0();
                    }
                    return null;
                } else if (L == 407) {
                    l0.m(c7);
                    if (c7.e().type() == Proxy.Type.HTTP) {
                        return this.f18881b.j0().a(c7, f0Var);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                } else if (L == 408) {
                    if (this.f18881b.m0()) {
                        e0 f8 = f0Var.O0().f();
                        if (f8 == null || !f8.q()) {
                            f0 E02 = f0Var.E0();
                            if ((E02 == null || E02.L() != 408) && g(f0Var, 0) <= 0) {
                                return f0Var.O0();
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                } else {
                    switch (L) {
                        case MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION /* 300 */:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                }
            } else {
                return this.f18881b.M().a(c7, f0Var);
            }
        }
        return b(f0Var, m7);
    }

    public final boolean d(IOException iOException, boolean z6) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z6 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    public final boolean e(IOException iOException, x5.e eVar, d0 d0Var, boolean z6) {
        if (this.f18881b.m0()) {
            return !(z6 && f(iOException, d0Var)) && d(iOException, z6) && eVar.D();
        }
        return false;
    }

    public final boolean f(IOException iOException, d0 d0Var) {
        e0 f7 = d0Var.f();
        return (f7 != null && f7.q()) || (iOException instanceof FileNotFoundException);
    }

    public final int g(f0 f0Var, int i7) {
        String X = f0.X(f0Var, "Retry-After", null, 2, null);
        if (X != null) {
            if (new o("\\d+").k(X)) {
                Integer valueOf = Integer.valueOf(X);
                l0.o(valueOf, "Integer.valueOf(header)");
                return valueOf.intValue();
            }
            return Integer.MAX_VALUE;
        }
        return i7;
    }
}
