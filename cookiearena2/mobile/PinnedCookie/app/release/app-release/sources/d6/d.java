package d6;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class d extends g6.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f8533d = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public final X509TrustManager f8534b;

    /* renamed from: c  reason: collision with root package name */
    public final X509TrustManagerExtensions f8535c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @s5.c
        @n6.e
        public final d a(@n6.d X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            l0.p(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new d(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public d(@n6.d X509TrustManager x509TrustManager, @n6.d X509TrustManagerExtensions x509TrustManagerExtensions) {
        l0.p(x509TrustManager, "trustManager");
        l0.p(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f8534b = x509TrustManager;
        this.f8535c = x509TrustManagerExtensions;
    }

    @Override // g6.c
    @s5.c
    @n6.d
    public List<Certificate> a(@n6.d List<? extends Certificate> list, @n6.d String str) throws SSLPeerUnverifiedException {
        l0.p(list, "chain");
        l0.p(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f8535c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                l0.o(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e7) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e7.getMessage());
                sSLPeerUnverifiedException.initCause(e7);
                throw sSLPeerUnverifiedException;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public boolean equals(@n6.e Object obj) {
        return (obj instanceof d) && ((d) obj).f8534b == this.f8534b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f8534b);
    }
}
