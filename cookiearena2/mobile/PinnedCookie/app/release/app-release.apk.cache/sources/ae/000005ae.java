package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import j2.a;

@s4.h(name = "ViewTreeLifecycleOwner")
/* loaded from: classes.dex */
public final class g1 {

    /* loaded from: classes.dex */
    public static final class a extends u4.n0 implements t4.l<View, View> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f4752l = new a();

        public a() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final View O(@n6.d View view) {
            u4.l0.p(view, "currentView");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u4.n0 implements t4.l<View, z> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f4753l = new b();

        public b() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final z O(@n6.d View view) {
            u4.l0.p(view, "viewParent");
            Object tag = view.getTag(a.C0134a.f11418a);
            if (tag instanceof z) {
                return (z) tag;
            }
            return null;
        }
    }

    @s4.h(name = "get")
    @n6.e
    public static final z a(@n6.d View view) {
        u4.l0.p(view, "<this>");
        return (z) f5.u.F0(f5.u.p1(f5.s.l(view, a.f4752l), b.f4753l));
    }

    @s4.h(name = "set")
    public static final void b(@n6.d View view, @n6.e z zVar) {
        u4.l0.p(view, "<this>");
        view.setTag(a.C0134a.f11418a, zVar);
    }
}