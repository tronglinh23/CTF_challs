package y5;

import java.net.Proxy;
import r5.d0;
import r5.v;
import u4.l0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f18878a = new i();

    @n6.d
    public final String a(@n6.d d0 d0Var, @n6.d Proxy.Type type) {
        l0.p(d0Var, "request");
        l0.p(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(d0Var.m());
        sb.append(' ');
        i iVar = f18878a;
        if (iVar.b(d0Var, type)) {
            sb.append(d0Var.q());
        } else {
            sb.append(iVar.c(d0Var.q()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final boolean b(d0 d0Var, Proxy.Type type) {
        return !d0Var.l() && type == Proxy.Type.HTTP;
    }

    @n6.d
    public final String c(@n6.d v vVar) {
        l0.p(vVar, "url");
        String x6 = vVar.x();
        String z6 = vVar.z();
        if (z6 != null) {
            return x6 + '?' + z6;
        }
        return x6;
    }
}