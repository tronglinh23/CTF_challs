package x5;

import i0.k0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import r5.h0;
import r5.r;
import r5.v;
import u4.l0;
import u4.n0;
import u4.w;
import x3.b0;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: i  reason: collision with root package name */
    public static final a f18490i = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Proxy> f18491a;

    /* renamed from: b  reason: collision with root package name */
    public int f18492b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends InetSocketAddress> f18493c;

    /* renamed from: d  reason: collision with root package name */
    public final List<h0> f18494d;

    /* renamed from: e  reason: collision with root package name */
    public final r5.a f18495e;

    /* renamed from: f  reason: collision with root package name */
    public final i f18496f;

    /* renamed from: g  reason: collision with root package name */
    public final r5.e f18497g;

    /* renamed from: h  reason: collision with root package name */
    public final r f18498h;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.d
        public final String a(@n6.d InetSocketAddress inetSocketAddress) {
            l0.p(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                l0.o(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = inetSocketAddress.getHostName();
            l0.o(hostName, "hostName");
            return hostName;
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f18499a;
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public final List<h0> f18500b;

        public b(@n6.d List<h0> list) {
            l0.p(list, "routes");
            this.f18500b = list;
        }

        @n6.d
        public final List<h0> a() {
            return this.f18500b;
        }

        public final boolean b() {
            return this.f18499a < this.f18500b.size();
        }

        @n6.d
        public final h0 c() {
            if (b()) {
                List<h0> list = this.f18500b;
                int i7 = this.f18499a;
                this.f18499a = i7 + 1;
                return list.get(i7);
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.a<List<? extends Proxy>> {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Proxy f18502m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ v f18503n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Proxy proxy, v vVar) {
            super(0);
            this.f18502m = proxy;
            this.f18503n = vVar;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final List<Proxy> n() {
            Proxy proxy = this.f18502m;
            if (proxy != null) {
                return x3.v.k(proxy);
            }
            URI Z = this.f18503n.Z();
            if (Z.getHost() == null) {
                return s5.d.z(Proxy.NO_PROXY);
            }
            List<Proxy> select = k.this.f18495e.t().select(Z);
            return select == null || select.isEmpty() ? s5.d.z(Proxy.NO_PROXY) : s5.d.c0(select);
        }
    }

    public k(@n6.d r5.a aVar, @n6.d i iVar, @n6.d r5.e eVar, @n6.d r rVar) {
        l0.p(aVar, "address");
        l0.p(iVar, "routeDatabase");
        l0.p(eVar, k0.E0);
        l0.p(rVar, "eventListener");
        this.f18495e = aVar;
        this.f18496f = iVar;
        this.f18497g = eVar;
        this.f18498h = rVar;
        this.f18491a = x3.w.E();
        this.f18493c = x3.w.E();
        this.f18494d = new ArrayList();
        g(aVar.w(), aVar.r());
    }

    public final boolean b() {
        return c() || (this.f18494d.isEmpty() ^ true);
    }

    public final boolean c() {
        return this.f18492b < this.f18491a.size();
    }

    @n6.d
    public final b d() throws IOException {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                Proxy e7 = e();
                Iterator<? extends InetSocketAddress> it = this.f18493c.iterator();
                while (it.hasNext()) {
                    h0 h0Var = new h0(this.f18495e, e7, it.next());
                    if (this.f18496f.c(h0Var)) {
                        this.f18494d.add(h0Var);
                    } else {
                        arrayList.add(h0Var);
                    }
                }
                if ((!arrayList.isEmpty()) != false) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                b0.o0(arrayList, this.f18494d);
                this.f18494d.clear();
            }
            return new b(arrayList);
        }
        throw new NoSuchElementException();
    }

    public final Proxy e() throws IOException {
        if (c()) {
            List<? extends Proxy> list = this.f18491a;
            int i7 = this.f18492b;
            this.f18492b = i7 + 1;
            Proxy proxy = list.get(i7);
            f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f18495e.w().F() + "; exhausted proxy configurations: " + this.f18491a);
    }

    public final void f(Proxy proxy) throws IOException {
        String F;
        int N;
        ArrayList arrayList = new ArrayList();
        this.f18493c = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            F = this.f18495e.w().F();
            N = this.f18495e.w().N();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            F = f18490i.a(inetSocketAddress);
            N = inetSocketAddress.getPort();
        }
        if (1 > N || 65535 < N) {
            throw new SocketException("No route to " + F + ':' + N + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(F, N));
        } else {
            this.f18498h.n(this.f18497g, F);
            List<InetAddress> a7 = this.f18495e.n().a(F);
            if (a7.isEmpty()) {
                throw new UnknownHostException(this.f18495e.n() + " returned no addresses for " + F);
            }
            this.f18498h.m(this.f18497g, F, a7);
            Iterator<InetAddress> it = a7.iterator();
            while (it.hasNext()) {
                arrayList.add(new InetSocketAddress(it.next(), N));
            }
        }
    }

    public final void g(v vVar, Proxy proxy) {
        c cVar = new c(proxy, vVar);
        this.f18498h.p(this.f18497g, vVar);
        List<Proxy> n7 = cVar.n();
        this.f18491a = n7;
        this.f18492b = 0;
        this.f18498h.o(this.f18497g, vVar, n7);
    }
}
