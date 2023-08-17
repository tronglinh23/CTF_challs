package s2;

import u4.r1;
import v3.m2;
@r1({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/NavHostKt\n+ 2 NavController.kt\nandroidx/navigation/NavControllerKt\n+ 3 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n*L\n1#1,78:1\n2551#2:79\n2564#2:81\n42#3:80\n57#3,2:82\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/NavHostKt\n*L\n68#1:79\n77#1:81\n68#1:80\n77#1:82,2\n*E\n"})
/* loaded from: classes.dex */
public final class s0 {
    @n6.d
    @v3.k(message = "Use routes to create your NavGraph instead", replaceWith = @v3.b1(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final k0 a(@n6.d q0 q0Var, @d.d0 int i7, @d.d0 int i8, @n6.d t4.l<? super l0, m2> lVar) {
        u4.l0.p(q0Var, "<this>");
        u4.l0.p(lVar, "builder");
        l0 l0Var = new l0(q0Var.a().S(), i7, i8);
        lVar.O(l0Var);
        return l0Var.c();
    }

    @n6.d
    public static final k0 b(@n6.d q0 q0Var, @n6.d String str, @n6.e String str2, @n6.d t4.l<? super l0, m2> lVar) {
        u4.l0.p(q0Var, "<this>");
        u4.l0.p(str, "startDestination");
        u4.l0.p(lVar, "builder");
        l0 l0Var = new l0(q0Var.a().S(), str, str2);
        lVar.O(l0Var);
        return l0Var.c();
    }

    public static /* synthetic */ k0 c(q0 q0Var, int i7, int i8, t4.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        u4.l0.p(q0Var, "<this>");
        u4.l0.p(lVar, "builder");
        l0 l0Var = new l0(q0Var.a().S(), i7, i8);
        lVar.O(l0Var);
        return l0Var.c();
    }

    public static /* synthetic */ k0 d(q0 q0Var, String str, String str2, t4.l lVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        u4.l0.p(q0Var, "<this>");
        u4.l0.p(str, "startDestination");
        u4.l0.p(lVar, "builder");
        l0 l0Var = new l0(q0Var.a().S(), str, str2);
        lVar.O(l0Var);
        return l0Var.c();
    }
}
