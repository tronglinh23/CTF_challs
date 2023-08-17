package d6;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import r5.c0;
import u4.l0;

/* loaded from: classes.dex */
public interface m {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(@n6.d m mVar, @n6.d SSLSocketFactory sSLSocketFactory) {
            l0.p(sSLSocketFactory, "sslSocketFactory");
            return false;
        }

        @n6.e
        public static X509TrustManager b(@n6.d m mVar, @n6.d SSLSocketFactory sSLSocketFactory) {
            l0.p(sSLSocketFactory, "sslSocketFactory");
            return null;
        }
    }

    boolean a(@n6.d SSLSocket sSLSocket);

    @n6.e
    String b(@n6.d SSLSocket sSLSocket);

    @n6.e
    X509TrustManager c(@n6.d SSLSocketFactory sSLSocketFactory);

    boolean d(@n6.d SSLSocketFactory sSLSocketFactory);

    void e(@n6.d SSLSocket sSLSocket, @n6.e String str, @n6.d List<? extends c0> list);

    boolean isSupported();
}