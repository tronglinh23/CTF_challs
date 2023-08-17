package s2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import s2.j1;
/* loaded from: classes.dex */
public final class c1 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final c1 f16269a = new c1();

    /* loaded from: classes.dex */
    public static final class a extends u4.n0 implements t4.l<View, View> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f16270l = new a();

        public a() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final View O(@n6.d View view) {
            u4.l0.p(view, "it");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u4.n0 implements t4.l<View, w> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f16271l = new b();

        public b() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final w O(@n6.d View view) {
            u4.l0.p(view, "it");
            return c1.f16269a.m(view);
        }
    }

    @n6.d
    @s4.i
    @s4.m
    public static final View.OnClickListener d(@d.d0 int i7) {
        return g(i7, null, 2, null);
    }

    @n6.d
    @s4.i
    @s4.m
    public static final View.OnClickListener e(@d.d0 final int i7, @n6.e final Bundle bundle) {
        return new View.OnClickListener() { // from class: s2.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c1.h(i7, bundle, view);
            }
        };
    }

    @n6.d
    @s4.m
    public static final View.OnClickListener f(@n6.d final j0 j0Var) {
        u4.l0.p(j0Var, "directions");
        return new View.OnClickListener() { // from class: s2.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c1.i(j0.this, view);
            }
        };
    }

    public static /* synthetic */ View.OnClickListener g(int i7, Bundle bundle, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            bundle = null;
        }
        return e(i7, bundle);
    }

    public static final void h(int i7, Bundle bundle, View view) {
        u4.l0.o(view, "view");
        k(view).c0(i7, bundle);
    }

    public static final void i(j0 j0Var, View view) {
        u4.l0.p(j0Var, "$directions");
        u4.l0.o(view, "view");
        k(view).q0(j0Var);
    }

    @n6.d
    @s4.m
    public static final w j(@n6.d Activity activity, @d.d0 int i7) {
        u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
        View K = i0.b.K(activity, i7);
        u4.l0.o(K, "requireViewById<View>(activity, viewId)");
        w l7 = f16269a.l(K);
        if (l7 != null) {
            return l7;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i7);
    }

    @n6.d
    @s4.m
    public static final w k(@n6.d View view) {
        u4.l0.p(view, "view");
        w l7 = f16269a.l(view);
        if (l7 != null) {
            return l7;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    @s4.m
    public static final void n(@n6.d View view, @n6.e w wVar) {
        u4.l0.p(view, "view");
        view.setTag(j1.b.f16359a, wVar);
    }

    public final w l(View view) {
        return (w) f5.u.F0(f5.u.p1(f5.s.l(view, a.f16270l), b.f16271l));
    }

    public final w m(View view) {
        Object tag = view.getTag(j1.b.f16359a);
        if (tag instanceof WeakReference) {
            return (w) ((WeakReference) tag).get();
        }
        if (tag instanceof w) {
            return (w) tag;
        }
        return null;
    }
}
