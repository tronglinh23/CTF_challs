package c6;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import d6.k;
import d6.l;
import d6.m;
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
public final class a extends j {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f7971g;

    /* renamed from: h  reason: collision with root package name */
    public static final C0088a f7972h = new C0088a(null);

    /* renamed from: f  reason: collision with root package name */
    public final List<m> f7973f;

    /* renamed from: c6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0088a {
        public C0088a() {
        }

        @n6.e
        public final j a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f7971g;
        }

        public /* synthetic */ C0088a(w wVar) {
            this();
        }
    }

    static {
        f7971g = j.f8005e.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List N = x3.w.N(d6.c.f8532a.a(), new l(d6.h.f8542g.d()), new l(k.f8556b.a()), new l(d6.i.f8550b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : N) {
            if (((m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f7973f = arrayList;
    }

    @Override // c6.j
    @n6.d
    public g6.c d(@n6.d X509TrustManager x509TrustManager) {
        l0.p(x509TrustManager, "trustManager");
        d6.d a7 = d6.d.f8533d.a(x509TrustManager);
        return a7 != null ? a7 : super.d(x509TrustManager);
    }

    @Override // c6.j
    public void f(@n6.d SSLSocket sSLSocket, @n6.e String str, @n6.d List<? extends c0> list) {
        Object obj;
        l0.p(sSLSocket, "sslSocket");
        l0.p(list, "protocols");
        Iterator<T> it = this.f7973f.iterator();
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
    @n6.e
    public String j(@n6.d SSLSocket sSLSocket) {
        Object obj;
        l0.p(sSLSocket, "sslSocket");
        Iterator<T> it = this.f7973f.iterator();
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
    @SuppressLint({"NewApi"})
    public boolean l(@n6.d String str) {
        l0.p(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // c6.j
    @n6.e
    public X509TrustManager s(@n6.d SSLSocketFactory sSLSocketFactory) {
        Object obj;
        l0.p(sSLSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f7973f.iterator();
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
