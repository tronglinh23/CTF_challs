package androidx.activity;

import android.view.View;
import android.view.ViewParent;
import androidx.activity.x;
import u4.l0;
import u4.n0;
@s4.h(name = "ViewTreeOnBackPressedDispatcherOwner")
/* loaded from: classes.dex */
public final class y {

    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.l<View, View> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f622l = new a();

        public a() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final View O(@n6.d View view) {
            l0.p(view, "it");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.l<View, t> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f623l = new b();

        public b() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final t O(@n6.d View view) {
            l0.p(view, "it");
            Object tag = view.getTag(x.a.f621a);
            if (tag instanceof t) {
                return (t) tag;
            }
            return null;
        }
    }

    @s4.h(name = "get")
    @n6.e
    public static final t a(@n6.d View view) {
        l0.p(view, "<this>");
        return (t) f5.u.F0(f5.u.p1(f5.s.l(view, a.f622l), b.f623l));
    }

    @s4.h(name = "set")
    public static final void b(@n6.d View view, @n6.d t tVar) {
        l0.p(view, "<this>");
        l0.p(tVar, "onBackPressedDispatcherOwner");
        view.setTag(x.a.f621a, tVar);
    }
}
