package d6;

import d6.l;
import d6.m;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import r5.c0;
import u4.l0;
import u4.w;

/* loaded from: classes.dex */
public final class i implements m {

    /* renamed from: b  reason: collision with root package name */
    public static final b f8550b = new b(null);
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final l.a f8549a = new a();

    /* loaded from: classes.dex */
    public static final class a implements l.a {
        @Override // d6.l.a
        public boolean a(@n6.d SSLSocket sSLSocket) {
            l0.p(sSLSocket, "sslSocket");
            return c6.c.f7981h.b() && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // d6.l.a
        @n6.d
        public m b(@n6.d SSLSocket sSLSocket) {
            l0.p(sSLSocket, "sslSocket");
            return new i();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        @n6.d
        public final l.a a() {
            return i.f8549a;
        }

        public /* synthetic */ b(w wVar) {
            this();
        }
    }

    @Override // d6.m
    public boolean a(@n6.d SSLSocket sSLSocket) {
        l0.p(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // d6.m
    @n6.e
    public String b(@n6.d SSLSocket sSLSocket) {
        l0.p(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // d6.m
    @n6.e
    public X509TrustManager c(@n6.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, "sslSocketFactory");
        return m.a.b(this, sSLSocketFactory);
    }

    @Override // d6.m
    public boolean d(@n6.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, "sslSocketFactory");
        return m.a.a(this, sSLSocketFactory);
    }

    @Override // d6.m
    public void e(@n6.d SSLSocket sSLSocket, @n6.e String str, @n6.d List<? extends c0> list) {
        l0.p(sSLSocket, "sslSocket");
        l0.p(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            l0.o(parameters, "sslParameters");
            Object[] array = c6.j.f8005e.b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // d6.m
    public boolean isSupported() {
        return c6.c.f7981h.b();
    }
}