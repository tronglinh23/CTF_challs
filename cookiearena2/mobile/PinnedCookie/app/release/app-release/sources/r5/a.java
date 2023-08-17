package r5;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import r5.v;
import u4.l0;
import v3.b1;
/* loaded from: classes.dex */
public final class a {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final v f15690a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final List<c0> f15691b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final List<l> f15692c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final q f15693d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public final SocketFactory f15694e;
    @n6.e

    /* renamed from: f  reason: collision with root package name */
    public final SSLSocketFactory f15695f;
    @n6.e

    /* renamed from: g  reason: collision with root package name */
    public final HostnameVerifier f15696g;
    @n6.e

    /* renamed from: h  reason: collision with root package name */
    public final g f15697h;
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public final b f15698i;
    @n6.e

    /* renamed from: j  reason: collision with root package name */
    public final Proxy f15699j;
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final ProxySelector f15700k;

    public a(@n6.d String str, int i7, @n6.d q qVar, @n6.d SocketFactory socketFactory, @n6.e SSLSocketFactory sSLSocketFactory, @n6.e HostnameVerifier hostnameVerifier, @n6.e g gVar, @n6.d b bVar, @n6.e Proxy proxy, @n6.d List<? extends c0> list, @n6.d List<l> list2, @n6.d ProxySelector proxySelector) {
        l0.p(str, "uriHost");
        l0.p(qVar, "dns");
        l0.p(socketFactory, "socketFactory");
        l0.p(bVar, "proxyAuthenticator");
        l0.p(list, "protocols");
        l0.p(list2, "connectionSpecs");
        l0.p(proxySelector, "proxySelector");
        this.f15693d = qVar;
        this.f15694e = socketFactory;
        this.f15695f = sSLSocketFactory;
        this.f15696g = hostnameVerifier;
        this.f15697h = gVar;
        this.f15698i = bVar;
        this.f15699j = proxy;
        this.f15700k = proxySelector;
        this.f15690a = new v.a().M(sSLSocketFactory != null ? "https" : "http").x(str).D(i7).h();
        this.f15691b = s5.d.c0(list);
        this.f15692c = s5.d.c0(list2);
    }

    @s4.h(name = "-deprecated_certificatePinner")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "certificatePinner", imports = {}))
    @n6.e
    public final g a() {
        return this.f15697h;
    }

    @s4.h(name = "-deprecated_connectionSpecs")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "connectionSpecs", imports = {}))
    public final List<l> b() {
        return this.f15692c;
    }

    @s4.h(name = "-deprecated_dns")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "dns", imports = {}))
    public final q c() {
        return this.f15693d;
    }

    @s4.h(name = "-deprecated_hostnameVerifier")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "hostnameVerifier", imports = {}))
    @n6.e
    public final HostnameVerifier d() {
        return this.f15696g;
    }

    @s4.h(name = "-deprecated_protocols")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "protocols", imports = {}))
    public final List<c0> e() {
        return this.f15691b;
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l0.g(this.f15690a, aVar.f15690a) && o(aVar)) {
                return true;
            }
        }
        return false;
    }

    @s4.h(name = "-deprecated_proxy")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxy", imports = {}))
    @n6.e
    public final Proxy f() {
        return this.f15699j;
    }

    @s4.h(name = "-deprecated_proxyAuthenticator")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxyAuthenticator", imports = {}))
    public final b g() {
        return this.f15698i;
    }

    @s4.h(name = "-deprecated_proxySelector")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxySelector", imports = {}))
    public final ProxySelector h() {
        return this.f15700k;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f15690a.hashCode()) * 31) + this.f15693d.hashCode()) * 31) + this.f15698i.hashCode()) * 31) + this.f15691b.hashCode()) * 31) + this.f15692c.hashCode()) * 31) + this.f15700k.hashCode()) * 31) + Objects.hashCode(this.f15699j)) * 31) + Objects.hashCode(this.f15695f)) * 31) + Objects.hashCode(this.f15696g)) * 31) + Objects.hashCode(this.f15697h);
    }

    @s4.h(name = "-deprecated_socketFactory")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "socketFactory", imports = {}))
    public final SocketFactory i() {
        return this.f15694e;
    }

    @s4.h(name = "-deprecated_sslSocketFactory")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "sslSocketFactory", imports = {}))
    @n6.e
    public final SSLSocketFactory j() {
        return this.f15695f;
    }

    @s4.h(name = "-deprecated_url")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "url", imports = {}))
    public final v k() {
        return this.f15690a;
    }

    @s4.h(name = "certificatePinner")
    @n6.e
    public final g l() {
        return this.f15697h;
    }

    @s4.h(name = "connectionSpecs")
    @n6.d
    public final List<l> m() {
        return this.f15692c;
    }

    @s4.h(name = "dns")
    @n6.d
    public final q n() {
        return this.f15693d;
    }

    public final boolean o(@n6.d a aVar) {
        l0.p(aVar, "that");
        return l0.g(this.f15693d, aVar.f15693d) && l0.g(this.f15698i, aVar.f15698i) && l0.g(this.f15691b, aVar.f15691b) && l0.g(this.f15692c, aVar.f15692c) && l0.g(this.f15700k, aVar.f15700k) && l0.g(this.f15699j, aVar.f15699j) && l0.g(this.f15695f, aVar.f15695f) && l0.g(this.f15696g, aVar.f15696g) && l0.g(this.f15697h, aVar.f15697h) && this.f15690a.N() == aVar.f15690a.N();
    }

    @s4.h(name = "hostnameVerifier")
    @n6.e
    public final HostnameVerifier p() {
        return this.f15696g;
    }

    @s4.h(name = "protocols")
    @n6.d
    public final List<c0> q() {
        return this.f15691b;
    }

    @s4.h(name = "proxy")
    @n6.e
    public final Proxy r() {
        return this.f15699j;
    }

    @s4.h(name = "proxyAuthenticator")
    @n6.d
    public final b s() {
        return this.f15698i;
    }

    @s4.h(name = "proxySelector")
    @n6.d
    public final ProxySelector t() {
        return this.f15700k;
    }

    @n6.d
    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f15690a.F());
        sb2.append(':');
        sb2.append(this.f15690a.N());
        sb2.append(", ");
        if (this.f15699j != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f15699j;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f15700k;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append("}");
        return sb2.toString();
    }

    @s4.h(name = "socketFactory")
    @n6.d
    public final SocketFactory u() {
        return this.f15694e;
    }

    @s4.h(name = "sslSocketFactory")
    @n6.e
    public final SSLSocketFactory v() {
        return this.f15695f;
    }

    @s4.h(name = "url")
    @n6.d
    public final v w() {
        return this.f15690a;
    }
}
