package c6;

import i6.m;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import r5.b0;
import r5.c0;
import u4.l0;
import u4.w;
import x3.x;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public static volatile j f8001a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final int f8002b = 4;

    /* renamed from: c  reason: collision with root package name */
    public static final int f8003c = 5;

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f8004d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f8005e;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public static /* synthetic */ void m(a aVar, j jVar, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                jVar = aVar.f();
            }
            aVar.l(jVar);
        }

        @n6.d
        public final List<String> b(@n6.d List<? extends c0> list) {
            l0.p(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((c0) obj) != c0.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(x.Y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((c0) it.next()).toString());
            }
            return arrayList2;
        }

        @n6.d
        public final byte[] c(@n6.d List<? extends c0> list) {
            l0.p(list, "protocols");
            m mVar = new m();
            for (String str : b(list)) {
                mVar.e0(str.length());
                mVar.H0(str);
            }
            return mVar.V();
        }

        public final j d() {
            d6.e.f8539d.b();
            j a7 = c6.a.f7972h.a();
            if (a7 != null) {
                return a7;
            }
            j a8 = b.f7975i.a();
            l0.m(a8);
            return a8;
        }

        public final j e() {
            i a7;
            c a8;
            d c7;
            if (!j() || (c7 = d.f7984h.c()) == null) {
                if (!i() || (a8 = c.f7981h.a()) == null) {
                    if (!k() || (a7 = i.f7999h.a()) == null) {
                        h a9 = h.f7997g.a();
                        if (a9 != null) {
                            return a9;
                        }
                        j a10 = e.f7987k.a();
                        return a10 != null ? a10 : new j();
                    }
                    return a7;
                }
                return a8;
            }
            return c7;
        }

        public final j f() {
            return h() ? d() : e();
        }

        @n6.d
        @s4.m
        public final j g() {
            return j.f8001a;
        }

        public final boolean h() {
            return l0.g("Dalvik", System.getProperty("java.vm.name"));
        }

        public final boolean i() {
            Provider provider = Security.getProviders()[0];
            l0.o(provider, "Security.getProviders()[0]");
            return l0.g("BC", provider.getName());
        }

        public final boolean j() {
            Provider provider = Security.getProviders()[0];
            l0.o(provider, "Security.getProviders()[0]");
            return l0.g("Conscrypt", provider.getName());
        }

        public final boolean k() {
            Provider provider = Security.getProviders()[0];
            l0.o(provider, "Security.getProviders()[0]");
            return l0.g("OpenJSSE", provider.getName());
        }

        public final void l(@n6.d j jVar) {
            l0.p(jVar, "platform");
            j.f8001a = jVar;
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f8005e = aVar;
        f8001a = aVar.f();
        f8004d = Logger.getLogger(b0.class.getName());
    }

    @n6.d
    @s4.m
    public static final j h() {
        return f8005e.g();
    }

    public static /* synthetic */ void n(j jVar, String str, int i7, Throwable th, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i8 & 2) != 0) {
            i7 = 4;
        }
        if ((i8 & 4) != 0) {
            th = null;
        }
        jVar.m(str, i7, th);
    }

    public void c(@n6.d SSLSocket sSLSocket) {
        l0.p(sSLSocket, "sslSocket");
    }

    @n6.d
    public g6.c d(@n6.d X509TrustManager x509TrustManager) {
        l0.p(x509TrustManager, "trustManager");
        return new g6.a(e(x509TrustManager));
    }

    @n6.d
    public g6.e e(@n6.d X509TrustManager x509TrustManager) {
        l0.p(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        l0.o(acceptedIssuers, "trustManager.acceptedIssuers");
        return new g6.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void f(@n6.d SSLSocket sSLSocket, @n6.e String str, @n6.d List<c0> list) {
        l0.p(sSLSocket, "sslSocket");
        l0.p(list, "protocols");
    }

    public void g(@n6.d Socket socket, @n6.d InetSocketAddress inetSocketAddress, int i7) throws IOException {
        l0.p(socket, "socket");
        l0.p(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i7);
    }

    @n6.d
    public final String i() {
        return "OkHttp";
    }

    @n6.e
    public String j(@n6.d SSLSocket sSLSocket) {
        l0.p(sSLSocket, "sslSocket");
        return null;
    }

    @n6.e
    public Object k(@n6.d String str) {
        l0.p(str, "closer");
        if (f8004d.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean l(@n6.d String str) {
        l0.p(str, "hostname");
        return true;
    }

    public void m(@n6.d String str, int i7, @n6.e Throwable th) {
        l0.p(str, "message");
        f8004d.log(i7 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void o(@n6.d String str, @n6.e Object obj) {
        l0.p(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m(str, 5, (Throwable) obj);
    }

    @n6.d
    public SSLContext p() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        l0.o(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    @n6.d
    public SSLSocketFactory q(@n6.d X509TrustManager x509TrustManager) {
        l0.p(x509TrustManager, "trustManager");
        try {
            SSLContext p6 = p();
            p6.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = p6.getSocketFactory();
            l0.o(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e7) {
            throw new AssertionError("No System TLS: " + e7, e7);
        }
    }

    @n6.d
    public X509TrustManager r() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    @n6.e
    public X509TrustManager s(@n6.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, "sslSocketFactory");
        try {
            Class<?> cls = Class.forName("sun.security.ssl.SSLContextImpl");
            l0.o(cls, "sslContextClass");
            Object Q = s5.d.Q(sSLSocketFactory, cls, "context");
            if (Q != null) {
                return (X509TrustManager) s5.d.Q(Q, X509TrustManager.class, "trustManager");
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @n6.d
    public String toString() {
        String simpleName = getClass().getSimpleName();
        l0.o(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}