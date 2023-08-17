package androidx.fragment.app;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class v0 {
    public static final /* synthetic */ <F extends Fragment> u0 a(u0 u0Var, @d.d0 int i7, String str, Bundle bundle) {
        u4.l0.p(u0Var, "<this>");
        u4.l0.y(4, "F");
        u0 i8 = u0Var.i(i7, Fragment.class, bundle, str);
        u4.l0.o(i8, "add(containerViewId, F::class.java, args, tag)");
        return i8;
    }

    public static final /* synthetic */ <F extends Fragment> u0 b(u0 u0Var, String str, Bundle bundle) {
        u4.l0.p(u0Var, "<this>");
        u4.l0.p(str, "tag");
        u4.l0.y(4, "F");
        u0 l7 = u0Var.l(Fragment.class, bundle, str);
        u4.l0.o(l7, "add(F::class.java, args, tag)");
        return l7;
    }

    public static /* synthetic */ u0 c(u0 u0Var, int i7, String str, Bundle bundle, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        if ((i8 & 4) != 0) {
            bundle = null;
        }
        u4.l0.p(u0Var, "<this>");
        u4.l0.y(4, "F");
        u0 i9 = u0Var.i(i7, Fragment.class, bundle, str);
        u4.l0.o(i9, "add(containerViewId, F::class.java, args, tag)");
        return i9;
    }

    public static /* synthetic */ u0 d(u0 u0Var, String str, Bundle bundle, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            bundle = null;
        }
        u4.l0.p(u0Var, "<this>");
        u4.l0.p(str, "tag");
        u4.l0.y(4, "F");
        u0 l7 = u0Var.l(Fragment.class, bundle, str);
        u4.l0.o(l7, "add(F::class.java, args, tag)");
        return l7;
    }

    public static final /* synthetic */ <F extends Fragment> u0 e(u0 u0Var, @d.d0 int i7, String str, Bundle bundle) {
        u4.l0.p(u0Var, "<this>");
        u4.l0.y(4, "F");
        u0 F = u0Var.F(i7, Fragment.class, bundle, str);
        u4.l0.o(F, "replace(containerViewId, F::class.java, args, tag)");
        return F;
    }

    public static /* synthetic */ u0 f(u0 u0Var, int i7, String str, Bundle bundle, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        if ((i8 & 4) != 0) {
            bundle = null;
        }
        u4.l0.p(u0Var, "<this>");
        u4.l0.y(4, "F");
        u0 F = u0Var.F(i7, Fragment.class, bundle, str);
        u4.l0.o(F, "replace(containerViewId, F::class.java, args, tag)");
        return F;
    }
}
