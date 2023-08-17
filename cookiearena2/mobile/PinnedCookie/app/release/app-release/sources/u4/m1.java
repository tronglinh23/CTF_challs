package u4;

import java.util.List;
/* loaded from: classes.dex */
public class m1 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f17444a = "kotlin.jvm.functions.";

    public e5.d a(Class cls) {
        return new u(cls);
    }

    public e5.d b(Class cls, String str) {
        return new u(cls);
    }

    public e5.i c(g0 g0Var) {
        return g0Var;
    }

    public e5.d d(Class cls) {
        return new u(cls);
    }

    public e5.d e(Class cls, String str) {
        return new u(cls);
    }

    public e5.h f(Class cls, String str) {
        return new b1(cls, str);
    }

    @v3.g1(version = "1.6")
    public e5.s g(e5.s sVar) {
        w1 w1Var = (w1) sVar;
        return new w1(sVar.N(), sVar.f(), w1Var.y(), w1Var.u() | 2);
    }

    public e5.k h(u0 u0Var) {
        return u0Var;
    }

    public e5.l i(w0 w0Var) {
        return w0Var;
    }

    public e5.m j(y0 y0Var) {
        return y0Var;
    }

    @v3.g1(version = "1.6")
    public e5.s k(e5.s sVar) {
        w1 w1Var = (w1) sVar;
        return new w1(sVar.N(), sVar.f(), w1Var.y(), w1Var.u() | 4);
    }

    @v3.g1(version = "1.6")
    public e5.s l(e5.s sVar, e5.s sVar2) {
        return new w1(sVar.N(), sVar.f(), sVar2, ((w1) sVar).u());
    }

    public e5.p m(d1 d1Var) {
        return d1Var;
    }

    public e5.q n(f1 f1Var) {
        return f1Var;
    }

    public e5.r o(h1 h1Var) {
        return h1Var;
    }

    @v3.g1(version = "1.3")
    public String p(e0 e0Var) {
        String obj = e0Var.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith(f17444a) ? obj.substring(21) : obj;
    }

    @v3.g1(version = "1.1")
    public String q(n0 n0Var) {
        return p(n0Var);
    }

    @v3.g1(version = "1.4")
    public void r(e5.t tVar, List<e5.s> list) {
        ((v1) tVar).c(list);
    }

    @v3.g1(version = "1.4")
    public e5.s s(e5.g gVar, List<e5.u> list, boolean z6) {
        return new w1(gVar, list, z6);
    }

    @v3.g1(version = "1.4")
    public e5.t t(Object obj, String str, e5.v vVar, boolean z6) {
        return new v1(obj, str, vVar, z6);
    }
}
