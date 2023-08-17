package s2;
/* loaded from: classes.dex */
public final class n0 {
    public static final boolean a(@n6.d k0 k0Var, @d.d0 int i7) {
        u4.l0.p(k0Var, "<this>");
        return k0Var.S(i7) != null;
    }

    public static final boolean b(@n6.d k0 k0Var, @n6.d String str) {
        u4.l0.p(k0Var, "<this>");
        u4.l0.p(str, "route");
        return k0Var.U(str) != null;
    }

    @n6.d
    public static final g0 c(@n6.d k0 k0Var, @d.d0 int i7) {
        u4.l0.p(k0Var, "<this>");
        g0 S = k0Var.S(i7);
        if (S != null) {
            return S;
        }
        throw new IllegalArgumentException("No destination for " + i7 + " was found in " + k0Var);
    }

    @n6.d
    public static final g0 d(@n6.d k0 k0Var, @n6.d String str) {
        u4.l0.p(k0Var, "<this>");
        u4.l0.p(str, "route");
        g0 U = k0Var.U(str);
        if (U != null) {
            return U;
        }
        throw new IllegalArgumentException("No destination for " + str + " was found in " + k0Var);
    }

    public static final void e(@n6.d k0 k0Var, @n6.d g0 g0Var) {
        u4.l0.p(k0Var, "<this>");
        u4.l0.p(g0Var, "node");
        k0Var.d0(g0Var);
    }

    public static final void f(@n6.d k0 k0Var, @n6.d g0 g0Var) {
        u4.l0.p(k0Var, "<this>");
        u4.l0.p(g0Var, "node");
        k0Var.P(g0Var);
    }

    public static final void g(@n6.d k0 k0Var, @n6.d k0 k0Var2) {
        u4.l0.p(k0Var, "<this>");
        u4.l0.p(k0Var2, "other");
        k0Var.O(k0Var2);
    }
}
