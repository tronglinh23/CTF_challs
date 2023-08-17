package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
@d.w0(21)
/* loaded from: classes.dex */
public class x0 extends y0 {

    /* loaded from: classes.dex */
    public class a extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f4565a;

        public a(Rect rect) {
            this.f4565a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f4565a;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f4567a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4568b;

        public b(View view, ArrayList arrayList) {
            this.f4567a = view;
            this.f4568b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f4567a.setVisibility(8);
            int size = this.f4568b.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((View) this.f4568b.get(i7)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f4570a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4571b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f4572c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4573d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f4574e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4575f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4570a = obj;
            this.f4571b = arrayList;
            this.f4572c = obj2;
            this.f4573d = arrayList2;
            this.f4574e = obj3;
            this.f4575f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f4570a;
            if (obj != null) {
                x0.this.n(obj, this.f4571b, null);
            }
            Object obj2 = this.f4572c;
            if (obj2 != null) {
                x0.this.n(obj2, this.f4573d, null);
            }
            Object obj3 = this.f4574e;
            if (obj3 != null) {
                x0.this.n(obj3, this.f4575f, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f4577a;

        public d(Runnable runnable) {
            this.f4577a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f4577a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* loaded from: classes.dex */
    public class e extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f4579a;

        public e(Rect rect) {
            this.f4579a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f4579a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f4579a;
        }
    }

    public static boolean x(Transition transition) {
        return (y0.i(transition.getTargetIds()) && y0.i(transition.getTargetNames()) && y0.i(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.y0
    public void a(@d.o0 Object obj, @d.o0 View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.y0
    public void b(@d.o0 Object obj, @d.o0 ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i7 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i7 < transitionCount) {
                b(transitionSet.getTransitionAt(i7), arrayList);
                i7++;
            }
        } else if (x(transition) || !y0.i(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i7 < size) {
                transition.addTarget(arrayList.get(i7));
                i7++;
            }
        }
    }

    @Override // androidx.fragment.app.y0
    public void c(@d.o0 ViewGroup viewGroup, @d.q0 Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.y0
    public boolean e(@d.o0 Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.y0
    public Object f(@d.q0 Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.y0
    public Object j(@d.q0 Object obj, @d.q0 Object obj2, @d.q0 Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.y0
    public Object k(@d.q0 Object obj, @d.q0 Object obj2, @d.q0 Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.y0
    public void m(@d.o0 Object obj, @d.o0 View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.y0
    public void n(@d.o0 Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i7 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i7 < transitionCount) {
                n(transitionSet.getTransitionAt(i7), arrayList, arrayList2);
                i7++;
            }
        } else if (!x(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i7 < size) {
                transition.addTarget(arrayList2.get(i7));
                i7++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.y0
    public void o(@d.o0 Object obj, @d.o0 View view, @d.o0 ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.y0
    public void p(@d.o0 Object obj, @d.q0 Object obj2, @d.q0 ArrayList<View> arrayList, @d.q0 Object obj3, @d.q0 ArrayList<View> arrayList2, @d.q0 Object obj4, @d.q0 ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.y0
    public void q(@d.o0 Object obj, @d.o0 Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // androidx.fragment.app.y0
    public void r(@d.o0 Object obj, @d.q0 View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.y0
    public void s(@d.o0 Fragment fragment, @d.o0 Object obj, @d.o0 z0.j jVar, @d.o0 Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // androidx.fragment.app.y0
    public void u(@d.o0 Object obj, @d.o0 View view, @d.o0 ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            y0.d(targets, arrayList.get(i7));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.y0
    public void v(@d.q0 Object obj, @d.q0 ArrayList<View> arrayList, @d.q0 ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            n(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.y0
    public Object w(@d.q0 Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
