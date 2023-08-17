package y2;

import androidx.appcompat.widget.Toolbar;
import s2.w;
import u4.l0;
import u4.r1;
import y2.d;
import y2.e;
@r1({"SMAP\nToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toolbar.kt\nandroidx/navigation/ui/ToolbarKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,74:1\n249#2,8:75\n249#2,8:83\n*S KotlinDebug\n*F\n+ 1 Toolbar.kt\nandroidx/navigation/ui/ToolbarKt\n*L\n47#1:75,8\n70#1:83,8\n*E\n"})
/* loaded from: classes.dex */
public final class u {
    public static final void a(@n6.d Toolbar toolbar, @n6.d w wVar, @n6.e s1.a aVar) {
        l0.p(toolbar, "<this>");
        l0.p(wVar, "navController");
        q.s(toolbar, wVar, new d.a(wVar.P()).d(aVar).c(new e.d(e.a.f18769l)).a());
    }

    public static final void b(@n6.d Toolbar toolbar, @n6.d w wVar, @n6.d d dVar) {
        l0.p(toolbar, "<this>");
        l0.p(wVar, "navController");
        l0.p(dVar, "configuration");
        q.s(toolbar, wVar, dVar);
    }

    public static /* synthetic */ void c(Toolbar toolbar, w wVar, d dVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            dVar = new d.a(wVar.P()).d(null).c(new e.d(e.a.f18769l)).a();
        }
        b(toolbar, wVar, dVar);
    }
}
