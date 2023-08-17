package y2;

import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import s2.w;
import u4.l0;
import u4.r1;
import y2.d;
import y2.e;
@r1({"SMAP\nCollapsingToolbarLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollapsingToolbarLayout.kt\nandroidx/navigation/ui/CollapsingToolbarLayoutKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,79:1\n249#2,8:80\n249#2,8:88\n*S KotlinDebug\n*F\n+ 1 CollapsingToolbarLayout.kt\nandroidx/navigation/ui/CollapsingToolbarLayoutKt\n*L\n50#1:80,8\n75#1:88,8\n*E\n"})
/* loaded from: classes.dex */
public final class g {
    public static final void a(@n6.d CollapsingToolbarLayout collapsingToolbarLayout, @n6.d Toolbar toolbar, @n6.d w wVar, @n6.e s1.a aVar) {
        l0.p(collapsingToolbarLayout, "<this>");
        l0.p(toolbar, "toolbar");
        l0.p(wVar, "navController");
        q.v(collapsingToolbarLayout, toolbar, wVar, new d.a(wVar.P()).d(aVar).c(new e.d(e.a.f18769l)).a());
    }

    public static final void b(@n6.d CollapsingToolbarLayout collapsingToolbarLayout, @n6.d Toolbar toolbar, @n6.d w wVar, @n6.d d dVar) {
        l0.p(collapsingToolbarLayout, "<this>");
        l0.p(toolbar, "toolbar");
        l0.p(wVar, "navController");
        l0.p(dVar, "configuration");
        q.v(collapsingToolbarLayout, toolbar, wVar, dVar);
    }

    public static /* synthetic */ void c(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, w wVar, d dVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            dVar = new d.a(wVar.P()).d(null).c(new e.d(e.a.f18769l)).a();
        }
        b(collapsingToolbarLayout, toolbar, wVar, dVar);
    }
}
