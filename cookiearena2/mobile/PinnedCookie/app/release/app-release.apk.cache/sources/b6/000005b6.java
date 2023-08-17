package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import k2.f;

@s4.h(name = "ViewTreeViewModelStoreOwner")
/* loaded from: classes.dex */
public final class i1 {

    /* loaded from: classes.dex */
    public static final class a extends u4.n0 implements t4.l<View, View> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f4756l = new a();

        public a() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final View O(@n6.d View view) {
            u4.l0.p(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u4.n0 implements t4.l<View, f1> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f4757l = new b();

        public b() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final f1 O(@n6.d View view) {
            u4.l0.p(view, "view");
            Object tag = view.getTag(f.a.f11629a);
            if (tag instanceof f1) {
                return (f1) tag;
            }
            return null;
        }
    }

    @s4.h(name = "get")
    @n6.e
    public static final f1 a(@n6.d View view) {
        u4.l0.p(view, "<this>");
        return (f1) f5.u.F0(f5.u.p1(f5.s.l(view, a.f4756l), b.f4757l));
    }

    @s4.h(name = "set")
    public static final void b(@n6.d View view, @n6.e f1 f1Var) {
        u4.l0.p(view, "<this>");
        view.setTag(f.a.f11629a, f1Var);
    }
}