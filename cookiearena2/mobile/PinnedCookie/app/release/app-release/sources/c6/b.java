package c6;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import d6.k;
import d6.l;
import d6.m;
import d6.n;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import r5.c0;
import u4.l0;
import u4.w;
@s5.c
/* loaded from: classes.dex */
public final class b extends j {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f7974h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f7975i = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public final List<m> f7976f;

    /* renamed from: g  reason: collision with root package name */
    public final d6.j f7977g;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.e
        public final j a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f7974h;
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    /* renamed from: c6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0089b implements g6.e {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f7978a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f7979b;

        public C0089b(@n6.d X509TrustManager x509TrustManager, @n6.d Method method) {
            l0.p(x509TrustManager, "trustManager");
            l0.p(method, "findByIssuerAndSignatureMethod");
            this.f7978a = x509TrustManager;
            this.f7979b = method;
        }

        public static /* synthetic */ C0089b e(C0089b c0089b, X509TrustManager x509TrustManager, Method method, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                x509TrustManager = c0089b.f7978a;
            }
            if ((i7 & 2) != 0) {
                method = c0089b.f7979b;
            }
            return c0089b.d(x509TrustManager, method);
        }

        @Override // g6.e
        @n6.e
        public X509Certificate a(@n6.d X509Certificate x509Certificate) {
            l0.p(x509Certificate, "cert");
            try {
                Object invoke = this.f7979b.invoke(this.f7978a, x509Certificate);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e7) {
                throw new AssertionError("unable to get issues and signature", e7);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final X509TrustManager b() {
            return this.f7978a;
        }

        public final Method c() {
            return this.f7979b;
        }

        @n6.d
        public final C0089b d(@n6.d X509TrustManager x509TrustManager, @n6.d Method method) {
            l0.p(x509TrustManager, "trustManager");
            l0.p(method, "findByIssuerAndSignatureMethod");
            return new C0089b(x509TrustManager, method);
        }

        public boolean equals(@n6.e Object obj) {
            if (this != obj) {
                if (obj instanceof C0089b) {
                    C0089b c0089b = (C0089b) obj;
                    return l0.g(this.f7978a, c0089b.f7978a) && l0.g(this.f7979b, c0089b.f7979b);
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f7978a;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f7979b;
            return hashCode + (method != null ? method.hashCode() : 0);
        }

        @n6.d
        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f7978a + ", findByIssuerAndSignatureMethod=" + this.f7979b + ")";
        }
    }

    static {
        boolean z6 = false;
        if (j.f8005e.h() && Build.VERSION.SDK_INT < 30) {
            z6 = true;
        }
        f7974h = z6;
    }

    public b() {
        List N = x3.w.N(n.a.b(n.f8559j, null, 1, null), new l(d6.h.f8542g.d()), new l(k.f8556b.a()), new l(d6.i.f8550b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : N) {
            if (((m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f7976f = arrayList;
        this.f7977g = d6.j.f8551d.a();
    }

    @Override // c6.j
    @n6.d
    public g6.c d(@n6.d X509TrustManager x509TrustManager) {
        l0.p(x509TrustManager, "trustManager");
        d6.d a7 = d6.d.f8533d.a(x509TrustManager);
        return a7 != null ? a7 : super.d(x509TrustManager);
    }

    @Override // c6.j
    @n6.d
    public g6.e e(@n6.d X509TrustManager x509TrustManager) {
        l0.p(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            l0.o(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0089b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.e(x509TrustManager);
        }
    }

    @Override // c6.j
    public void f(@n6.d SSLSocket sSLSocket, @n6.e String str, @n6.d List<c0> list) {
        Object obj;
        l0.p(sSLSocket, "sslSocket");
        l0.p(list, "protocols");
        Iterator<T> it = this.f7976f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.e(sSLSocket, str, list);
        }
    }

    @Override // c6.j
    public void g(@n6.d Socket socket, @n6.d InetSocketAddress inetSocketAddress, int i7) throws IOException {
        l0.p(socket, "socket");
        l0.p(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i7);
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e7;
            }
            throw new IOException("Exception in connect", e7);
        }
    }

    @Override // c6.j
    @n6.e
    public String j(@n6.d SSLSocket sSLSocket) {
        Object obj;
        l0.p(sSLSocket, "sslSocket");
        Iterator<T> it = this.f7976f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // c6.j
    @n6.e
    public Object k(@n6.d String str) {
        l0.p(str, "closer");
        return this.f7977g.a(str);
    }

    @Override // c6.j
    public boolean l(@n6.d String str) {
        l0.p(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // c6.j
    public void o(@n6.d String str, @n6.e Object obj) {
        l0.p(str, "message");
        if (this.f7977g.b(obj)) {
            return;
        }
        j.n(this, str, 5, null, 4, null);
    }

    @Override // c6.j
    @n6.e
    public X509TrustManager s(@n6.d SSLSocketFactory sSLSocketFactory) {
        Object obj;
        l0.p(sSLSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f7976f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).d(sSLSocketFactory)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.c(sSLSocketFactory);
        }
        return null;
    }
}
