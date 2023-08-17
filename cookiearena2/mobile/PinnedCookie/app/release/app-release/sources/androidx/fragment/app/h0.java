package androidx.fragment.app;

import v3.m2;
/* loaded from: classes.dex */
public final class h0 {
    public static final void a(@n6.d FragmentManager fragmentManager, boolean z6, @n6.d t4.l<? super u0, m2> lVar) {
        u4.l0.p(fragmentManager, "<this>");
        u4.l0.p(lVar, y0.c.f18717e);
        u0 u6 = fragmentManager.u();
        u4.l0.o(u6, "beginTransaction()");
        lVar.O(u6);
        if (z6) {
            u6.r();
        } else {
            u6.q();
        }
    }

    public static /* synthetic */ void b(FragmentManager fragmentManager, boolean z6, t4.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        u4.l0.p(fragmentManager, "<this>");
        u4.l0.p(lVar, y0.c.f18717e);
        u0 u6 = fragmentManager.u();
        u4.l0.o(u6, "beginTransaction()");
        lVar.O(u6);
        if (z6) {
            u6.r();
        } else {
            u6.q();
        }
    }

    @d.l0
    public static final void c(@n6.d FragmentManager fragmentManager, boolean z6, @n6.d t4.l<? super u0, m2> lVar) {
        u4.l0.p(fragmentManager, "<this>");
        u4.l0.p(lVar, y0.c.f18717e);
        u0 u6 = fragmentManager.u();
        u4.l0.o(u6, "beginTransaction()");
        lVar.O(u6);
        if (z6) {
            u6.t();
        } else {
            u6.s();
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, boolean z6, t4.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        u4.l0.p(fragmentManager, "<this>");
        u4.l0.p(lVar, y0.c.f18717e);
        u0 u6 = fragmentManager.u();
        u4.l0.o(u6, "beginTransaction()");
        lVar.O(u6);
        if (z6) {
            u6.t();
        } else {
            u6.s();
        }
    }

    @v3.k(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void e(@n6.d FragmentManager fragmentManager, boolean z6, boolean z7, @n6.d t4.l<? super u0, m2> lVar) {
        u4.l0.p(fragmentManager, "<this>");
        u4.l0.p(lVar, y0.c.f18717e);
        u0 u6 = fragmentManager.u();
        u4.l0.o(u6, "beginTransaction()");
        lVar.O(u6);
        if (z6) {
            if (z7) {
                u6.t();
            } else {
                u6.s();
            }
        } else if (z7) {
            u6.r();
        } else {
            u6.q();
        }
    }

    public static /* synthetic */ void f(FragmentManager fragmentManager, boolean z6, boolean z7, t4.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        u4.l0.p(fragmentManager, "<this>");
        u4.l0.p(lVar, y0.c.f18717e);
        u0 u6 = fragmentManager.u();
        u4.l0.o(u6, "beginTransaction()");
        lVar.O(u6);
        if (z6) {
            if (z7) {
                u6.t();
            } else {
                u6.s();
            }
        } else if (z7) {
            u6.r();
        } else {
            u6.q();
        }
    }
}
