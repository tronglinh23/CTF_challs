package d6;

import d6.m;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import r5.c0;
import u4.l0;
/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    public m f8557a;

    /* renamed from: b  reason: collision with root package name */
    public final a f8558b;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(@n6.d SSLSocket sSLSocket);

        @n6.d
        m b(@n6.d SSLSocket sSLSocket);
    }

    public l(@n6.d a aVar) {
        l0.p(aVar, "socketAdapterFactory");
        this.f8558b = aVar;
    }

    @Override // d6.m
    public boolean a(@n6.d SSLSocket sSLSocket) {
        l0.p(sSLSocket, "sslSocket");
        return this.f8558b.a(sSLSocket);
    }

    @Override // d6.m
    @n6.e
    public String b(@n6.d SSLSocket sSLSocket) {
        l0.p(sSLSocket, "sslSocket");
        m f7 = f(sSLSocket);
        if (f7 != null) {
            return f7.b(sSLSocket);
        }
        return null;
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
        m f7 = f(sSLSocket);
        if (f7 != null) {
            f7.e(sSLSocket, str, list);
        }
    }

    public final synchronized m f(SSLSocket sSLSocket) {
        if (this.f8557a == null && this.f8558b.a(sSLSocket)) {
            this.f8557a = this.f8558b.b(sSLSocket);
        }
        return this.f8557a;
    }

    @Override // d6.m
    public boolean isSupported() {
        return true;
    }
}
