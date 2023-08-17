package e6;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import n6.d;
import n6.e;
import x3.v;

/* loaded from: classes.dex */
public final class a extends ProxySelector {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8805a = new a();

    @Override // java.net.ProxySelector
    public void connectFailed(@e URI uri, @e SocketAddress socketAddress, @e IOException iOException) {
    }

    @Override // java.net.ProxySelector
    @d
    public List<Proxy> select(@e URI uri) {
        if (uri != null) {
            return v.k(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}