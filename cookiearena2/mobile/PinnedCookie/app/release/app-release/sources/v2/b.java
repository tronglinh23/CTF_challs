package v2;

import androidx.fragment.app.m;
import androidx.navigation.fragment.DialogFragmentNavigator;
import d.d0;
import s2.l0;
import t4.l;
import u4.l1;
import u4.r1;
import v3.b1;
import v3.k;
import v3.m2;
@r1({"SMAP\nDialogFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,143:1\n55#1,3:144\n58#1,4:148\n80#1,3:153\n83#1,4:157\n161#2:147\n161#2:152\n161#2:156\n161#2:161\n*S KotlinDebug\n*F\n+ 1 DialogFragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilderKt\n*L\n39#1:144,3\n39#1:148,4\n69#1:153,3\n69#1:157,4\n39#1:147\n57#1:152\n69#1:156\n82#1:161\n*E\n"})
/* loaded from: classes.dex */
public final class b {
    @k(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @b1(expression = "dialog<F>(route = id.toString())", imports = {}))
    public static final /* synthetic */ <F extends m> void a(l0 l0Var, @d0 int i7) {
        u4.l0.p(l0Var, "<this>");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) l0Var.n().e(DialogFragmentNavigator.class);
        u4.l0.y(4, "F");
        l0Var.m(new androidx.navigation.fragment.b(dialogFragmentNavigator, i7, l1.d(m.class)));
    }

    @k(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @b1(expression = "dialog<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final /* synthetic */ <F extends m> void b(l0 l0Var, @d0 int i7, l<? super androidx.navigation.fragment.b, m2> lVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(lVar, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) l0Var.n().e(DialogFragmentNavigator.class);
        u4.l0.y(4, "F");
        androidx.navigation.fragment.b bVar = new androidx.navigation.fragment.b(dialogFragmentNavigator, i7, l1.d(m.class));
        lVar.O(bVar);
        l0Var.m(bVar);
    }

    public static final /* synthetic */ <F extends m> void c(l0 l0Var, String str) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(str, "route");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) l0Var.n().e(DialogFragmentNavigator.class);
        u4.l0.y(4, "F");
        l0Var.m(new androidx.navigation.fragment.b(dialogFragmentNavigator, str, l1.d(m.class)));
    }

    public static final /* synthetic */ <F extends m> void d(l0 l0Var, String str, l<? super androidx.navigation.fragment.b, m2> lVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(str, "route");
        u4.l0.p(lVar, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) l0Var.n().e(DialogFragmentNavigator.class);
        u4.l0.y(4, "F");
        androidx.navigation.fragment.b bVar = new androidx.navigation.fragment.b(dialogFragmentNavigator, str, l1.d(m.class));
        lVar.O(bVar);
        l0Var.m(bVar);
    }
}
