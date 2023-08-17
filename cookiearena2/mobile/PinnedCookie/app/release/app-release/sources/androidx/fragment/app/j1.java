package androidx.fragment.app;

import android.view.View;
/* loaded from: classes.dex */
public final class j1 {
    @n6.d
    public static final <F extends Fragment> F a(@n6.d View view) {
        u4.l0.p(view, "<this>");
        F f7 = (F) FragmentManager.q0(view);
        u4.l0.o(f7, "findFragment(this)");
        return f7;
    }
}
