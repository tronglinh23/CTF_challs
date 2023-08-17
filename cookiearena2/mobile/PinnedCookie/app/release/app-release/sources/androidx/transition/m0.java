package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class m0 {

    /* renamed from: c  reason: collision with root package name */
    public static final String f6694c = "TransitionManager";

    /* renamed from: d  reason: collision with root package name */
    public static j0 f6695d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<j0>>>> f6696e = new ThreadLocal<>();

    /* renamed from: f  reason: collision with root package name */
    public static ArrayList<ViewGroup> f6697f = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public androidx.collection.a<f0, j0> f6698a = new androidx.collection.a<>();

    /* renamed from: b  reason: collision with root package name */
    public androidx.collection.a<f0, androidx.collection.a<f0, j0>> f6699b = new androidx.collection.a<>();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public j0 f6700b;

        /* renamed from: c  reason: collision with root package name */
        public ViewGroup f6701c;

        /* renamed from: androidx.transition.m0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0069a extends l0 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ androidx.collection.a f6702a;

            public C0069a(androidx.collection.a aVar) {
                this.f6702a = aVar;
            }

            @Override // androidx.transition.l0, androidx.transition.j0.h
            public void onTransitionEnd(@d.o0 j0 j0Var) {
                ((ArrayList) this.f6702a.get(a.this.f6701c)).remove(j0Var);
                j0Var.removeListener(this);
            }
        }

        public a(j0 j0Var, ViewGroup viewGroup) {
            this.f6700b = j0Var;
            this.f6701c = viewGroup;
        }

        public final void a() {
            this.f6701c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f6701c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (m0.f6697f.remove(this.f6701c)) {
                androidx.collection.a<ViewGroup, ArrayList<j0>> e7 = m0.e();
                ArrayList<j0> arrayList = e7.get(this.f6701c);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    e7.put(this.f6701c, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.f6700b);
                this.f6700b.addListener(new C0069a(e7));
                this.f6700b.captureValues(this.f6701c, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((j0) it.next()).resume(this.f6701c);
                    }
                }
                this.f6700b.playTransition(this.f6701c);
                return true;
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            m0.f6697f.remove(this.f6701c);
            ArrayList<j0> arrayList = m0.e().get(this.f6701c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<j0> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().resume(this.f6701c);
                }
            }
            this.f6700b.clearValues(true);
        }
    }

    public static void a(@d.o0 ViewGroup viewGroup) {
        b(viewGroup, null);
    }

    public static void b(@d.o0 ViewGroup viewGroup, @d.q0 j0 j0Var) {
        if (f6697f.contains(viewGroup) || !androidx.core.view.u1.U0(viewGroup)) {
            return;
        }
        f6697f.add(viewGroup);
        if (j0Var == null) {
            j0Var = f6695d;
        }
        j0 mo0clone = j0Var.mo0clone();
        j(viewGroup, mo0clone);
        f0.g(viewGroup, null);
        i(viewGroup, mo0clone);
    }

    public static void c(f0 f0Var, j0 j0Var) {
        ViewGroup e7 = f0Var.e();
        if (f6697f.contains(e7)) {
            return;
        }
        f0 c7 = f0.c(e7);
        if (j0Var == null) {
            if (c7 != null) {
                c7.b();
            }
            f0Var.a();
            return;
        }
        f6697f.add(e7);
        j0 mo0clone = j0Var.mo0clone();
        if (c7 != null && c7.f()) {
            mo0clone.setCanRemoveViews(true);
        }
        j(e7, mo0clone);
        f0Var.a();
        i(e7, mo0clone);
    }

    public static void d(ViewGroup viewGroup) {
        f6697f.remove(viewGroup);
        ArrayList<j0> arrayList = e().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((j0) arrayList2.get(size)).forceToEnd(viewGroup);
        }
    }

    public static androidx.collection.a<ViewGroup, ArrayList<j0>> e() {
        androidx.collection.a<ViewGroup, ArrayList<j0>> aVar;
        WeakReference<androidx.collection.a<ViewGroup, ArrayList<j0>>> weakReference = f6696e.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            androidx.collection.a<ViewGroup, ArrayList<j0>> aVar2 = new androidx.collection.a<>();
            f6696e.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }

    public static void g(@d.o0 f0 f0Var) {
        c(f0Var, f6695d);
    }

    public static void h(@d.o0 f0 f0Var, @d.q0 j0 j0Var) {
        c(f0Var, j0Var);
    }

    public static void i(ViewGroup viewGroup, j0 j0Var) {
        if (j0Var == null || viewGroup == null) {
            return;
        }
        a aVar = new a(j0Var, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void j(ViewGroup viewGroup, j0 j0Var) {
        ArrayList<j0> arrayList = e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<j0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (j0Var != null) {
            j0Var.captureValues(viewGroup, true);
        }
        f0 c7 = f0.c(viewGroup);
        if (c7 != null) {
            c7.b();
        }
    }

    public final j0 f(f0 f0Var) {
        f0 c7;
        androidx.collection.a<f0, j0> aVar;
        j0 j0Var;
        ViewGroup e7 = f0Var.e();
        if (e7 == null || (c7 = f0.c(e7)) == null || (aVar = this.f6699b.get(f0Var)) == null || (j0Var = aVar.get(c7)) == null) {
            j0 j0Var2 = this.f6698a.get(f0Var);
            return j0Var2 != null ? j0Var2 : f6695d;
        }
        return j0Var;
    }

    public void k(@d.o0 f0 f0Var, @d.o0 f0 f0Var2, @d.q0 j0 j0Var) {
        androidx.collection.a<f0, j0> aVar = this.f6699b.get(f0Var2);
        if (aVar == null) {
            aVar = new androidx.collection.a<>();
            this.f6699b.put(f0Var2, aVar);
        }
        aVar.put(f0Var, j0Var);
    }

    public void l(@d.o0 f0 f0Var, @d.q0 j0 j0Var) {
        this.f6698a.put(f0Var, j0Var);
    }

    public void m(@d.o0 f0 f0Var) {
        c(f0Var, f(f0Var));
    }
}
