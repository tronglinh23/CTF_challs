package s2;
/* loaded from: classes.dex */
public final class f1 {
    @n6.d
    public static final <T extends d1<? extends g0>> T a(@n6.d e1 e1Var, @n6.d e5.d<T> dVar) {
        u4.l0.p(e1Var, "<this>");
        u4.l0.p(dVar, "clazz");
        return (T) e1Var.e(s4.a.d(dVar));
    }

    @n6.d
    public static final <T extends d1<? extends g0>> T b(@n6.d e1 e1Var, @n6.d String str) {
        u4.l0.p(e1Var, "<this>");
        u4.l0.p(str, "name");
        return (T) e1Var.f(str);
    }

    public static final void c(@n6.d e1 e1Var, @n6.d d1<? extends g0> d1Var) {
        u4.l0.p(e1Var, "<this>");
        u4.l0.p(d1Var, "navigator");
        e1Var.c(d1Var);
    }

    @n6.e
    public static final d1<? extends g0> d(@n6.d e1 e1Var, @n6.d String str, @n6.d d1<? extends g0> d1Var) {
        u4.l0.p(e1Var, "<this>");
        u4.l0.p(str, "name");
        u4.l0.p(d1Var, "navigator");
        return e1Var.b(str, d1Var);
    }
}
