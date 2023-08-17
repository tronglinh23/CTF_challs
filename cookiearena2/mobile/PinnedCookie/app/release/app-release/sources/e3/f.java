package e3;

import android.view.View;
import android.view.ViewParent;
import e3.a;
import f5.s;
import f5.u;
import s4.h;
import t4.l;
import u4.l0;
import u4.n0;
@h(name = "ViewTreeSavedStateRegistryOwner")
/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    public static final class a extends n0 implements l<View, View> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f8752l = new a();

        public a() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final View O(@n6.d View view) {
            l0.p(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements l<View, d> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f8753l = new b();

        public b() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final d O(@n6.d View view) {
            l0.p(view, "view");
            Object tag = view.getTag(a.C0101a.f8746a);
            if (tag instanceof d) {
                return (d) tag;
            }
            return null;
        }
    }

    @h(name = "get")
    @n6.e
    public static final d a(@n6.d View view) {
        l0.p(view, "<this>");
        return (d) u.F0(u.p1(s.l(view, a.f8752l), b.f8753l));
    }

    @h(name = "set")
    public static final void b(@n6.d View view, @n6.e d dVar) {
        l0.p(view, "<this>");
        view.setTag(a.C0101a.f8746a, dVar);
    }
}
