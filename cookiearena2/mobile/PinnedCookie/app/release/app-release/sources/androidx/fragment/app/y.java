package androidx.fragment.app;

import android.os.Bundle;
import v3.m2;
/* loaded from: classes.dex */
public final class y {
    public static final void b(@n6.d Fragment fragment, @n6.d String str) {
        u4.l0.p(fragment, "<this>");
        u4.l0.p(str, "requestKey");
        fragment.getParentFragmentManager().d(str);
    }

    public static final void c(@n6.d Fragment fragment, @n6.d String str) {
        u4.l0.p(fragment, "<this>");
        u4.l0.p(str, "requestKey");
        fragment.getParentFragmentManager().b(str);
    }

    public static final void d(@n6.d Fragment fragment, @n6.d String str, @n6.d Bundle bundle) {
        u4.l0.p(fragment, "<this>");
        u4.l0.p(str, "requestKey");
        u4.l0.p(bundle, "result");
        fragment.getParentFragmentManager().c(str, bundle);
    }

    public static final void e(@n6.d Fragment fragment, @n6.d String str, @n6.d final t4.p<? super String, ? super Bundle, m2> pVar) {
        u4.l0.p(fragment, "<this>");
        u4.l0.p(str, "requestKey");
        u4.l0.p(pVar, "listener");
        fragment.getParentFragmentManager().a(str, fragment, new n0() { // from class: androidx.fragment.app.x
            @Override // androidx.fragment.app.n0
            public final void a(String str2, Bundle bundle) {
                y.f(t4.p.this, str2, bundle);
            }
        });
    }

    public static final void f(t4.p pVar, String str, Bundle bundle) {
        u4.l0.p(pVar, "$tmp0");
        u4.l0.p(str, "p0");
        u4.l0.p(bundle, "p1");
        pVar.J(str, bundle);
    }
}
