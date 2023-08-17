package c6;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import r5.c0;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f7998g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f7999h;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f8000f;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.e
        public final i a() {
            w wVar = null;
            if (b()) {
                return new i(wVar);
            }
            return null;
        }

        public final boolean b() {
            return i.f7998g;
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f7999h = aVar;
        boolean z6 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z6 = true;
        } catch (ClassNotFoundException unused) {
        }
        f7998g = z6;
    }

    public i() {
        this.f8000f = new OpenJSSE();
    }

    @Override // c6.j
    public void f(@n6.d SSLSocket sSLSocket, @n6.e String str, @n6.d List<c0> list) {
        l0.p(sSLSocket, "sslSocket");
        l0.p(list, "protocols");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            super.f(sSLSocket, str, list);
            return;
        }
        org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
        SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
        if (sSLParameters instanceof SSLParameters) {
            SSLParameters sSLParameters2 = sSLParameters;
            Object[] array = j.f8005e.b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sSLParameters2.setApplicationProtocols((String[]) array);
            sSLSocket2.setSSLParameters(sSLParameters);
        }
    }

    @Override // c6.j
    @n6.e
    public String j(@n6.d SSLSocket sSLSocket) {
        l0.p(sSLSocket, "sslSocket");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
                return null;
            }
            return applicationProtocol;
        }
        return super.j(sSLSocket);
    }

    @Override // c6.j
    @n6.d
    public SSLContext p() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f8000f);
        l0.o(sSLContext, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // c6.j
    @n6.d
    public X509TrustManager r() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f8000f);
        trustManagerFactory.init((KeyStore) null);
        l0.o(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        l0.m(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        l0.o(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // c6.j
    @n6.e
    public X509TrustManager s(@n6.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
    }

    public /* synthetic */ i(w wVar) {
        this();
    }
}
