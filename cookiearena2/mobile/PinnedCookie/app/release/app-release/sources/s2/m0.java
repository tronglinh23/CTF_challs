package s2;

import v3.m2;
/* loaded from: classes.dex */
public final class m0 {
    @n6.d
    @v3.k(message = "Use routes to build your NavGraph instead", replaceWith = @v3.b1(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final k0 a(@n6.d e1 e1Var, @d.d0 int i7, @d.d0 int i8, @n6.d t4.l<? super l0, m2> lVar) {
        u4.l0.p(e1Var, "<this>");
        u4.l0.p(lVar, "builder");
        l0 l0Var = new l0(e1Var, i7, i8);
        lVar.O(l0Var);
        return l0Var.c();
    }

    @n6.d
    public static final k0 b(@n6.d e1 e1Var, @n6.d String str, @n6.e String str2, @n6.d t4.l<? super l0, m2> lVar) {
        u4.l0.p(e1Var, "<this>");
        u4.l0.p(str, "startDestination");
        u4.l0.p(lVar, "builder");
        l0 l0Var = new l0(e1Var, str, str2);
        lVar.O(l0Var);
        return l0Var.c();
    }

    @v3.k(message = "Use routes to build your nested NavGraph instead", replaceWith = @v3.b1(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void c(@n6.d l0 l0Var, @d.d0 int i7, @d.d0 int i8, @n6.d t4.l<? super l0, m2> lVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(lVar, "builder");
        l0 l0Var2 = new l0(l0Var.n(), i7, i8);
        lVar.O(l0Var2);
        l0Var.m(l0Var2);
    }

    public static final void d(@n6.d l0 l0Var, @n6.d String str, @n6.d String str2, @n6.d t4.l<? super l0, m2> lVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(str, "startDestination");
        u4.l0.p(str2, "route");
        u4.l0.p(lVar, "builder");
        l0 l0Var2 = new l0(l0Var.n(), str, str2);
        lVar.O(l0Var2);
        l0Var.m(l0Var2);
    }

    public static /* synthetic */ k0 e(e1 e1Var, int i7, int i8, t4.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        u4.l0.p(e1Var, "<this>");
        u4.l0.p(lVar, "builder");
        l0 l0Var = new l0(e1Var, i7, i8);
        lVar.O(l0Var);
        return l0Var.c();
    }

    public static /* synthetic */ k0 f(e1 e1Var, String str, String str2, t4.l lVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        u4.l0.p(e1Var, "<this>");
        u4.l0.p(str, "startDestination");
        u4.l0.p(lVar, "builder");
        l0 l0Var = new l0(e1Var, str, str2);
        lVar.O(l0Var);
        return l0Var.c();
    }
}
