package t5;

import i5.b0;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import n6.d;
import n6.e;
import r5.d0;
import r5.f0;
import r5.h;
import r5.h0;
import r5.o;
import r5.q;
import r5.v;
import u4.l0;
import u4.w;
import x3.e0;
/* loaded from: classes.dex */
public final class b implements r5.b {

    /* renamed from: d  reason: collision with root package name */
    public final q f16860d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [r5.q, u4.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.b.<init>():void");
    }

    @Override // r5.b
    @e
    public d0 a(@e h0 h0Var, @d f0 f0Var) throws IOException {
        Proxy proxy;
        q qVar;
        PasswordAuthentication requestPasswordAuthentication;
        r5.a d7;
        l0.p(f0Var, "response");
        List<h> I = f0Var.I();
        d0 O0 = f0Var.O0();
        v q6 = O0.q();
        boolean z6 = f0Var.L() == 407;
        if (h0Var == null || (proxy = h0Var.e()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : I) {
            if (b0.L1("Basic", hVar.h(), true)) {
                if (h0Var == null || (d7 = h0Var.d()) == null || (qVar = d7.n()) == null) {
                    qVar = this.f16860d;
                }
                if (z6) {
                    SocketAddress address = proxy.address();
                    if (address == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    l0.o(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, q6, qVar), inetSocketAddress.getPort(), q6.X(), hVar.g(), hVar.h(), q6.a0(), Authenticator.RequestorType.PROXY);
                } else {
                    String F = q6.F();
                    l0.o(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(F, b(proxy, q6, qVar), q6.N(), q6.X(), hVar.g(), hVar.h(), q6.a0(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z6 ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    l0.o(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    l0.o(password, "auth.password");
                    return O0.n().n(str, o.b(userName, new String(password), hVar.f())).b();
                }
            }
        }
        return null;
    }

    public final InetAddress b(Proxy proxy, v vVar, q qVar) throws IOException {
        Proxy.Type type = proxy.type();
        if (type != null && a.f16859a[type.ordinal()] == 1) {
            return (InetAddress) e0.w2(qVar.a(vVar.F()));
        }
        SocketAddress address = proxy.address();
        if (address != null) {
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            l0.o(address2, "(address() as InetSocketAddress).address");
            return address2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
    }

    public b(@d q qVar) {
        l0.p(qVar, "defaultDns");
        this.f16860d = qVar;
    }

    public /* synthetic */ b(q qVar, int i7, w wVar) {
        this((i7 & 1) != 0 ? q.f16025a : qVar);
    }
}
