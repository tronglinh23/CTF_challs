package s5;

import javax.net.ssl.SSLSocket;
import n6.e;
import r5.d0;
import r5.f0;
import r5.l;
import r5.m;
import r5.u;
import r5.v;
import s4.h;
import u4.l0;
@h(name = "Internal")
/* loaded from: classes.dex */
public final class b {
    @n6.d
    public static final u.a a(@n6.d u.a aVar, @n6.d String str) {
        l0.p(aVar, "builder");
        l0.p(str, "line");
        return aVar.f(str);
    }

    @n6.d
    public static final u.a b(@n6.d u.a aVar, @n6.d String str, @n6.d String str2) {
        l0.p(aVar, "builder");
        l0.p(str, "name");
        l0.p(str2, "value");
        return aVar.g(str, str2);
    }

    public static final void c(@n6.d l lVar, @n6.d SSLSocket sSLSocket, boolean z6) {
        l0.p(lVar, "connectionSpec");
        l0.p(sSLSocket, "sslSocket");
        lVar.f(sSLSocket, z6);
    }

    @e
    public static final f0 d(@n6.d r5.c cVar, @n6.d d0 d0Var) {
        l0.p(cVar, "cache");
        l0.p(d0Var, "request");
        return cVar.h(d0Var);
    }

    @n6.d
    public static final String e(@n6.d m mVar, boolean z6) {
        l0.p(mVar, "cookie");
        return mVar.y(z6);
    }

    @e
    public static final m f(long j7, @n6.d v vVar, @n6.d String str) {
        l0.p(vVar, "url");
        l0.p(str, "setCookie");
        return m.f15995n.f(j7, vVar, str);
    }
}
