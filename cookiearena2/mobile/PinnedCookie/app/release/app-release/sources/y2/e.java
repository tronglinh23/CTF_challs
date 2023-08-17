package y2;

import android.view.Menu;
import java.util.Set;
import s2.k0;
import u4.d0;
import u4.l0;
import u4.n0;
import u4.r1;
import y2.d;
/* loaded from: classes.dex */
public final class e {

    @r1({"SMAP\nAppBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt$AppBarConfiguration$1\n*L\n1#1,307:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.a<Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f18769l = new a();

        public a() {
            super(0);
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            return Boolean.FALSE;
        }
    }

    @r1({"SMAP\nAppBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt$AppBarConfiguration$2\n*L\n1#1,307:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.a<Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f18770l = new b();

        public b() {
            super(0);
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            return Boolean.FALSE;
        }
    }

    @r1({"SMAP\nAppBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt$AppBarConfiguration$3\n*L\n1#1,307:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.a<Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public static final c f18771l = new c();

        public c() {
            super(0);
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements d.b, d0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.a f18772a;

        public d(t4.a aVar) {
            l0.p(aVar, "function");
            this.f18772a = aVar;
        }

        @Override // u4.d0
        @n6.d
        public final v3.v<?> a() {
            return this.f18772a;
        }

        @Override // y2.d.b
        public final /* synthetic */ boolean b() {
            return ((Boolean) this.f18772a.n()).booleanValue();
        }

        public final boolean equals(@n6.e Object obj) {
            if ((obj instanceof d.b) && (obj instanceof d0)) {
                return l0.g(a(), ((d0) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    @n6.d
    public static final y2.d a(@n6.d Menu menu, @n6.e androidx.customview.widget.c cVar, @n6.d t4.a<Boolean> aVar) {
        l0.p(menu, "topLevelMenu");
        l0.p(aVar, "fallbackOnNavigateUpListener");
        return new d.a(menu).d(cVar).c(new d(aVar)).a();
    }

    @n6.d
    public static final y2.d b(@n6.d Set<Integer> set, @n6.e androidx.customview.widget.c cVar, @n6.d t4.a<Boolean> aVar) {
        l0.p(set, "topLevelDestinationIds");
        l0.p(aVar, "fallbackOnNavigateUpListener");
        return new d.a(set).d(cVar).c(new d(aVar)).a();
    }

    @n6.d
    public static final y2.d c(@n6.d k0 k0Var, @n6.e androidx.customview.widget.c cVar, @n6.d t4.a<Boolean> aVar) {
        l0.p(k0Var, "navGraph");
        l0.p(aVar, "fallbackOnNavigateUpListener");
        return new d.a(k0Var).d(cVar).c(new d(aVar)).a();
    }

    public static /* synthetic */ y2.d d(Menu menu, androidx.customview.widget.c cVar, t4.a aVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            cVar = null;
        }
        if ((i7 & 4) != 0) {
            aVar = b.f18770l;
        }
        l0.p(menu, "topLevelMenu");
        l0.p(aVar, "fallbackOnNavigateUpListener");
        return new d.a(menu).d(cVar).c(new d(aVar)).a();
    }

    public static /* synthetic */ y2.d e(Set set, androidx.customview.widget.c cVar, t4.a aVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            cVar = null;
        }
        if ((i7 & 4) != 0) {
            aVar = c.f18771l;
        }
        l0.p(set, "topLevelDestinationIds");
        l0.p(aVar, "fallbackOnNavigateUpListener");
        return new d.a(set).d(cVar).c(new d(aVar)).a();
    }

    public static /* synthetic */ y2.d f(k0 k0Var, androidx.customview.widget.c cVar, t4.a aVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            cVar = null;
        }
        if ((i7 & 4) != 0) {
            aVar = a.f18769l;
        }
        l0.p(k0Var, "navGraph");
        l0.p(aVar, "fallbackOnNavigateUpListener");
        return new d.a(k0Var).d(cVar).c(new d(aVar)).a();
    }
}
