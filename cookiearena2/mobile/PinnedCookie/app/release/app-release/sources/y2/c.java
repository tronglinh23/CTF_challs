package y2;

import androidx.appcompat.app.AppCompatActivity;
import s2.w;
import u4.l0;
import u4.r1;
import y2.d;
import y2.e;
@r1({"SMAP\nActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activity.kt\nandroidx/navigation/ui/ActivityKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,78:1\n249#2,8:79\n249#2,8:87\n*S KotlinDebug\n*F\n+ 1 Activity.kt\nandroidx/navigation/ui/ActivityKt\n*L\n49#1:79,8\n74#1:87,8\n*E\n"})
/* loaded from: classes.dex */
public final class c {
    public static final void a(@n6.d AppCompatActivity appCompatActivity, @n6.d w wVar, @n6.e s1.a aVar) {
        l0.p(appCompatActivity, "<this>");
        l0.p(wVar, "navController");
        q.o(appCompatActivity, wVar, new d.a(wVar.P()).d(aVar).c(new e.d(e.a.f18769l)).a());
    }

    public static final void b(@n6.d AppCompatActivity appCompatActivity, @n6.d w wVar, @n6.d d dVar) {
        l0.p(appCompatActivity, "<this>");
        l0.p(wVar, "navController");
        l0.p(dVar, "configuration");
        q.o(appCompatActivity, wVar, dVar);
    }

    public static /* synthetic */ void c(AppCompatActivity appCompatActivity, w wVar, d dVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            dVar = new d.a(wVar.P()).d(null).c(new e.d(e.a.f18769l)).a();
        }
        b(appCompatActivity, wVar, dVar);
    }
}
