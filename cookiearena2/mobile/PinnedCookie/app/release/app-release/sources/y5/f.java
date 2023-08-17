package y5;

import s4.m;
import u4.l0;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f18865a = new f();

    @m
    public static final boolean b(@n6.d String str) {
        l0.p(str, "method");
        return (l0.g(str, "GET") || l0.g(str, "HEAD")) ? false : true;
    }

    @m
    public static final boolean e(@n6.d String str) {
        l0.p(str, "method");
        return l0.g(str, "POST") || l0.g(str, "PUT") || l0.g(str, "PATCH") || l0.g(str, "PROPPATCH") || l0.g(str, "REPORT");
    }

    public final boolean a(@n6.d String str) {
        l0.p(str, "method");
        return l0.g(str, "POST") || l0.g(str, "PATCH") || l0.g(str, "PUT") || l0.g(str, "DELETE") || l0.g(str, "MOVE");
    }

    public final boolean c(@n6.d String str) {
        l0.p(str, "method");
        return !l0.g(str, "PROPFIND");
    }

    public final boolean d(@n6.d String str) {
        l0.p(str, "method");
        return l0.g(str, "PROPFIND");
    }
}
