package v2;

import androidx.fragment.app.Fragment;
import d.d0;
import s2.l0;
import t4.l;
import u4.l1;
import u4.r1;
import v3.b1;
import v3.k;
import v3.m2;
@r1({"SMAP\nFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,142:1\n55#1,3:143\n58#1,4:147\n81#1,3:152\n84#1,4:156\n161#2:146\n161#2:151\n161#2:155\n161#2:160\n*S KotlinDebug\n*F\n+ 1 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilderKt\n*L\n39#1:143,3\n39#1:147,4\n70#1:152,3\n70#1:156,4\n39#1:146\n57#1:151\n70#1:155\n83#1:160\n*E\n"})
/* loaded from: classes.dex */
public final class g {
    @k(message = "Use routes to create your FragmentDestination instead", replaceWith = @b1(expression = "fragment<F>(route = id.toString())", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void a(l0 l0Var, @d0 int i7) {
        u4.l0.p(l0Var, "<this>");
        androidx.navigation.fragment.d dVar = (androidx.navigation.fragment.d) l0Var.n().e(androidx.navigation.fragment.d.class);
        u4.l0.y(4, "F");
        l0Var.m(new androidx.navigation.fragment.e(dVar, i7, l1.d(Fragment.class)));
    }

    @k(message = "Use routes to create your FragmentDestination instead", replaceWith = @b1(expression = "fragment<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void b(l0 l0Var, @d0 int i7, l<? super androidx.navigation.fragment.e, m2> lVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(lVar, "builder");
        androidx.navigation.fragment.d dVar = (androidx.navigation.fragment.d) l0Var.n().e(androidx.navigation.fragment.d.class);
        u4.l0.y(4, "F");
        androidx.navigation.fragment.e eVar = new androidx.navigation.fragment.e(dVar, i7, l1.d(Fragment.class));
        lVar.O(eVar);
        l0Var.m(eVar);
    }

    public static final /* synthetic */ <F extends Fragment> void c(l0 l0Var, String str) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(str, "route");
        androidx.navigation.fragment.d dVar = (androidx.navigation.fragment.d) l0Var.n().e(androidx.navigation.fragment.d.class);
        u4.l0.y(4, "F");
        l0Var.m(new androidx.navigation.fragment.e(dVar, str, l1.d(Fragment.class)));
    }

    public static final /* synthetic */ <F extends Fragment> void d(l0 l0Var, String str, l<? super androidx.navigation.fragment.e, m2> lVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(str, "route");
        u4.l0.p(lVar, "builder");
        androidx.navigation.fragment.d dVar = (androidx.navigation.fragment.d) l0Var.n().e(androidx.navigation.fragment.d.class);
        u4.l0.y(4, "F");
        androidx.navigation.fragment.e eVar = new androidx.navigation.fragment.e(dVar, str, l1.d(Fragment.class));
        lVar.O(eVar);
        l0Var.m(eVar);
    }
}
