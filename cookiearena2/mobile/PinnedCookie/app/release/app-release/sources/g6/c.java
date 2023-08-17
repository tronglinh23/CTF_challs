package g6;

import c6.j;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f10088a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.d
        public final c a(@n6.d X509TrustManager x509TrustManager) {
            l0.p(x509TrustManager, "trustManager");
            return j.f8005e.g().d(x509TrustManager);
        }

        @n6.d
        public final c b(@n6.d X509Certificate... x509CertificateArr) {
            l0.p(x509CertificateArr, "caCerts");
            return new g6.a(new b((X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)));
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    @n6.d
    public abstract List<Certificate> a(@n6.d List<? extends Certificate> list, @n6.d String str) throws SSLPeerUnverifiedException;
}
