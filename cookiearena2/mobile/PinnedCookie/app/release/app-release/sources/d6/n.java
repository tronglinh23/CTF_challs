package d6;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class n extends h {

    /* renamed from: j  reason: collision with root package name */
    public static final a f8559j = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public final Class<? super SSLSocketFactory> f8560h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<?> f8561i;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public static /* synthetic */ m b(a aVar, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        @n6.e
        public final m a(@n6.d String str) {
            l0.p(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                l0.o(cls3, "paramsClass");
                return new n(cls, cls2, cls3);
            } catch (Exception e7) {
                c6.j.f8005e.g().m("unable to load android socket classes", 5, e7);
                return null;
            }
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@n6.d Class<? super SSLSocket> cls, @n6.d Class<? super SSLSocketFactory> cls2, @n6.d Class<?> cls3) {
        super(cls);
        l0.p(cls, "sslSocketClass");
        l0.p(cls2, "sslSocketFactoryClass");
        l0.p(cls3, "paramClass");
        this.f8560h = cls2;
        this.f8561i = cls3;
    }

    @Override // d6.h, d6.m
    @n6.e
    public X509TrustManager c(@n6.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, "sslSocketFactory");
        Object Q = s5.d.Q(sSLSocketFactory, this.f8561i, "sslParameters");
        l0.m(Q);
        X509TrustManager x509TrustManager = (X509TrustManager) s5.d.Q(Q, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) s5.d.Q(Q, X509TrustManager.class, "trustManager");
    }

    @Override // d6.h, d6.m
    public boolean d(@n6.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, "sslSocketFactory");
        return this.f8560h.isInstance(sSLSocketFactory);
    }
}
