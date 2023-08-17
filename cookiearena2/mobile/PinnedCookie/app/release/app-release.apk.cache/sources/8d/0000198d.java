package r5;

import java.net.InetSocketAddress;
import java.net.Proxy;
import u4.l0;
import v3.b1;

/* loaded from: classes.dex */
public final class h0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final a f15893a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f15894b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f15895c;

    public h0(@n6.d a aVar, @n6.d Proxy proxy, @n6.d InetSocketAddress inetSocketAddress) {
        l0.p(aVar, "address");
        l0.p(proxy, "proxy");
        l0.p(inetSocketAddress, "socketAddress");
        this.f15893a = aVar;
        this.f15894b = proxy;
        this.f15895c = inetSocketAddress;
    }

    @s4.h(name = "-deprecated_address")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "address", imports = {}))
    public final a a() {
        return this.f15893a;
    }

    @s4.h(name = "-deprecated_proxy")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxy", imports = {}))
    public final Proxy b() {
        return this.f15894b;
    }

    @s4.h(name = "-deprecated_socketAddress")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "socketAddress", imports = {}))
    public final InetSocketAddress c() {
        return this.f15895c;
    }

    @s4.h(name = "address")
    @n6.d
    public final a d() {
        return this.f15893a;
    }

    @s4.h(name = "proxy")
    @n6.d
    public final Proxy e() {
        return this.f15894b;
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            if (l0.g(h0Var.f15893a, this.f15893a) && l0.g(h0Var.f15894b, this.f15894b) && l0.g(h0Var.f15895c, this.f15895c)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f15893a.v() != null && this.f15894b.type() == Proxy.Type.HTTP;
    }

    @s4.h(name = "socketAddress")
    @n6.d
    public final InetSocketAddress g() {
        return this.f15895c;
    }

    public int hashCode() {
        return ((((527 + this.f15893a.hashCode()) * 31) + this.f15894b.hashCode()) * 31) + this.f15895c.hashCode();
    }

    @n6.d
    public String toString() {
        return "Route{" + this.f15895c + '}';
    }
}