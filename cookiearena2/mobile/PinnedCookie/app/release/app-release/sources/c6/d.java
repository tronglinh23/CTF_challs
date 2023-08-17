package c6;

import java.security.KeyStore;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import r5.c0;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f7983g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f7984h;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f7985f;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public static /* synthetic */ boolean b(a aVar, int i7, int i8, int i9, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                i8 = 0;
            }
            if ((i10 & 4) != 0) {
                i9 = 0;
            }
            return aVar.a(i7, i8, i9);
        }

        public final boolean a(int i7, int i8, int i9) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i7 ? version.major() > i7 : version.minor() != i8 ? version.minor() > i8 : version.patch() >= i9;
        }

        @n6.e
        public final d c() {
            w wVar = null;
            if (d()) {
                return new d(wVar);
            }
            return null;
        }

        public final boolean d() {
            return d.f7983g;
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final b f7986a = new b();

        public final boolean a(@n6.e String str, @n6.e SSLSession sSLSession) {
            return true;
        }

        public boolean b(@n6.e X509Certificate[] x509CertificateArr, @n6.e String str, @n6.e SSLSession sSLSession) {
            return true;
        }
    }

    static {
        a aVar = new a(null);
        f7984h = aVar;
        boolean z6 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.a(2, 1, 0)) {
                    z6 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f7983g = z6;
    }

    public d() {
        Provider newProvider = Conscrypt.newProvider();
        l0.o(newProvider, "Conscrypt.newProvider()");
        this.f7985f = newProvider;
    }

    @Override // c6.j
    public void f(@n6.d SSLSocket sSLSocket, @n6.e String str, @n6.d List<c0> list) {
        l0.p(sSLSocket, "sslSocket");
        l0.p(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.f(sSLSocket, str, list);
            return;
        }
        Conscrypt.setUseSessionTickets(sSLSocket, true);
        Object[] array = j.f8005e.b(list).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
    }

    @Override // c6.j
    @n6.e
    public String j(@n6.d SSLSocket sSLSocket) {
        l0.p(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.j(sSLSocket);
    }

    @Override // c6.j
    @n6.d
    public SSLContext p() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f7985f);
        l0.o(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // c6.j
    @n6.d
    public SSLSocketFactory q(@n6.d X509TrustManager x509TrustManager) {
        l0.p(x509TrustManager, "trustManager");
        SSLContext p6 = p();
        p6.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = p6.getSocketFactory();
        l0.o(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // c6.j
    @n6.d
    public X509TrustManager r() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        l0.o(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        l0.m(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f7986a);
                return x509TrustManager;
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
        return null;
    }

    public /* synthetic */ d(w wVar) {
        this();
    }
}
