package s2;

import u4.r1;
import v3.m2;
@r1({"SMAP\nActivityNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigatorDestinationBuilder.kt\nandroidx/navigation/ActivityNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,101:1\n161#2:102\n161#2:103\n*S KotlinDebug\n*F\n+ 1 ActivityNavigatorDestinationBuilder.kt\nandroidx/navigation/ActivityNavigatorDestinationBuilderKt\n*L\n41#1:102\n54#1:103\n*E\n"})
/* loaded from: classes.dex */
public final class f {
    @v3.k(message = "Use routes to build your ActivityDestination instead", replaceWith = @v3.b1(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void a(@n6.d l0 l0Var, @d.d0 int i7, @n6.d t4.l<? super e, m2> lVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(lVar, "builder");
        e eVar = new e((d) l0Var.n().e(d.class), i7);
        lVar.O(eVar);
        l0Var.m(eVar);
    }

    public static final void b(@n6.d l0 l0Var, @n6.d String str, @n6.d t4.l<? super e, m2> lVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(str, "route");
        u4.l0.p(lVar, "builder");
        e eVar = new e((d) l0Var.n().e(d.class), str);
        lVar.O(eVar);
        l0Var.m(eVar);
    }
}
