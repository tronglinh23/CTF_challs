package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.transition.j0;
import d.b1;
import java.util.ArrayList;
import java.util.List;
import z0.j;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class p extends androidx.fragment.app.y0 {

    /* loaded from: classes.dex */
    public class a extends j0.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f6728a;

        public a(Rect rect) {
            this.f6728a = rect;
        }

        @Override // androidx.transition.j0.f
        public Rect a(@d.o0 j0 j0Var) {
            return this.f6728a;
        }
    }

    /* loaded from: classes.dex */
    public class b implements j0.h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f6730a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f6731b;

        public b(View view, ArrayList arrayList) {
            this.f6730a = view;
            this.f6731b = arrayList;
        }

        @Override // androidx.transition.j0.h
        public void onTransitionCancel(@d.o0 j0 j0Var) {
        }

        @Override // androidx.transition.j0.h
        public void onTransitionEnd(@d.o0 j0 j0Var) {
            j0Var.removeListener(this);
            this.f6730a.setVisibility(8);
            int size = this.f6731b.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((View) this.f6731b.get(i7)).setVisibility(0);
            }
        }

        @Override // androidx.transition.j0.h
        public void onTransitionPause(@d.o0 j0 j0Var) {
        }

        @Override // androidx.transition.j0.h
        public void onTransitionResume(@d.o0 j0 j0Var) {
        }

        @Override // androidx.transition.j0.h
        public void onTransitionStart(@d.o0 j0 j0Var) {
            j0Var.removeListener(this);
            j0Var.addListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f6733a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f6734b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f6735c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f6736d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f6737e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f6738f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f6733a = obj;
            this.f6734b = arrayList;
            this.f6735c = obj2;
            this.f6736d = arrayList2;
            this.f6737e = obj3;
            this.f6738f = arrayList3;
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionEnd(@d.o0 j0 j0Var) {
            j0Var.removeListener(this);
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionStart(@d.o0 j0 j0Var) {
            Object obj = this.f6733a;
            if (obj != null) {
                p.this.n(obj, this.f6734b, null);
            }
            Object obj2 = this.f6735c;
            if (obj2 != null) {
                p.this.n(obj2, this.f6736d, null);
            }
            Object obj3 = this.f6737e;
            if (obj3 != null) {
                p.this.n(obj3, this.f6738f, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements j.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j0 f6740a;

        public d(j0 j0Var) {
            this.f6740a = j0Var;
        }

        @Override // z0.j.b
        public void onCancel() {
            this.f6740a.cancel();
        }
    }

    /* loaded from: classes.dex */
    public class e implements j0.h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f6742a;

        public e(Runnable runnable) {
            this.f6742a = runnable;
        }

        @Override // androidx.transition.j0.h
        public void onTransitionCancel(@d.o0 j0 j0Var) {
        }

        @Override // androidx.transition.j0.h
        public void onTransitionEnd(@d.o0 j0 j0Var) {
            this.f6742a.run();
        }

        @Override // androidx.transition.j0.h
        public void onTransitionPause(@d.o0 j0 j0Var) {
        }

        @Override // androidx.transition.j0.h
        public void onTransitionResume(@d.o0 j0 j0Var) {
        }

        @Override // androidx.transition.j0.h
        public void onTransitionStart(@d.o0 j0 j0Var) {
        }
    }

    /* loaded from: classes.dex */
    public class f extends j0.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f6744a;

        public f(Rect rect) {
            this.f6744a = rect;
        }

        @Override // androidx.transition.j0.f
        public Rect a(@d.o0 j0 j0Var) {
            Rect rect = this.f6744a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f6744a;
        }
    }

    public static boolean x(j0 j0Var) {
        return (androidx.fragment.app.y0.i(j0Var.getTargetIds()) && androidx.fragment.app.y0.i(j0Var.getTargetNames()) && androidx.fragment.app.y0.i(j0Var.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.y0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((j0) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.y0
    public void b(Object obj, ArrayList<View> arrayList) {
        j0 j0Var = (j0) obj;
        if (j0Var == null) {
            return;
        }
        int i7 = 0;
        if (j0Var instanceof o0) {
            o0 o0Var = (o0) j0Var;
            int I = o0Var.I();
            while (i7 < I) {
                b(o0Var.H(i7), arrayList);
                i7++;
            }
        } else if (x(j0Var) || !androidx.fragment.app.y0.i(j0Var.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i7 < size) {
                j0Var.addTarget(arrayList.get(i7));
                i7++;
            }
        }
    }

    @Override // androidx.fragment.app.y0
    public void c(ViewGroup viewGroup, Object obj) {
        m0.b(viewGroup, (j0) obj);
    }

    @Override // androidx.fragment.app.y0
    public boolean e(Object obj) {
        return obj instanceof j0;
    }

    @Override // androidx.fragment.app.y0
    public Object f(Object obj) {
        if (obj != null) {
            return ((j0) obj).mo0clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.y0
    public Object j(Object obj, Object obj2, Object obj3) {
        j0 j0Var = (j0) obj;
        j0 j0Var2 = (j0) obj2;
        j0 j0Var3 = (j0) obj3;
        if (j0Var != null && j0Var2 != null) {
            j0Var = new o0().E(j0Var).E(j0Var2).R(1);
        } else if (j0Var == null) {
            j0Var = j0Var2 != null ? j0Var2 : null;
        }
        if (j0Var3 != null) {
            o0 o0Var = new o0();
            if (j0Var != null) {
                o0Var.E(j0Var);
            }
            o0Var.E(j0Var3);
            return o0Var;
        }
        return j0Var;
    }

    @Override // androidx.fragment.app.y0
    public Object k(Object obj, Object obj2, Object obj3) {
        o0 o0Var = new o0();
        if (obj != null) {
            o0Var.E((j0) obj);
        }
        if (obj2 != null) {
            o0Var.E((j0) obj2);
        }
        if (obj3 != null) {
            o0Var.E((j0) obj3);
        }
        return o0Var;
    }

    @Override // androidx.fragment.app.y0
    public void m(Object obj, View view) {
        if (obj != null) {
            ((j0) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.y0
    public void n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        j0 j0Var = (j0) obj;
        int i7 = 0;
        if (j0Var instanceof o0) {
            o0 o0Var = (o0) j0Var;
            int I = o0Var.I();
            while (i7 < I) {
                n(o0Var.H(i7), arrayList, arrayList2);
                i7++;
            }
        } else if (!x(j0Var)) {
            List<View> targets = j0Var.getTargets();
            if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i7 < size) {
                    j0Var.addTarget(arrayList2.get(i7));
                    i7++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    j0Var.removeTarget(arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.y0
    public void o(Object obj, View view, ArrayList<View> arrayList) {
        ((j0) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.y0
    public void p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((j0) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.y0
    public void q(Object obj, Rect rect) {
        if (obj != null) {
            ((j0) obj).setEpicenterCallback(new f(rect));
        }
    }

    @Override // androidx.fragment.app.y0
    public void r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((j0) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.y0
    public void s(@d.o0 Fragment fragment, @d.o0 Object obj, @d.o0 z0.j jVar, @d.o0 Runnable runnable) {
        j0 j0Var = (j0) obj;
        jVar.d(new d(j0Var));
        j0Var.addListener(new e(runnable));
    }

    @Override // androidx.fragment.app.y0
    public void u(Object obj, View view, ArrayList<View> arrayList) {
        o0 o0Var = (o0) obj;
        List<View> targets = o0Var.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            androidx.fragment.app.y0.d(targets, arrayList.get(i7));
        }
        targets.add(view);
        arrayList.add(view);
        b(o0Var, arrayList);
    }

    @Override // androidx.fragment.app.y0
    public void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        o0 o0Var = (o0) obj;
        if (o0Var != null) {
            o0Var.getTargets().clear();
            o0Var.getTargets().addAll(arrayList2);
            n(o0Var, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.y0
    public Object w(Object obj) {
        if (obj == null) {
            return null;
        }
        o0 o0Var = new o0();
        o0Var.E((j0) obj);
        return o0Var;
    }
}
