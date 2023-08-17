package c0;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.m;
import c0.b0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final s f7339a;

    /* renamed from: c  reason: collision with root package name */
    public HashSet<View> f7341c;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<b0.b> f7343e;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<b0> f7340b = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public String f7342d = "ViewTransitionController";

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<b0.b> f7344f = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements m.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b0 f7345b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f7346c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f7347d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f7348e;

        public a(final b0 val$viewTransition, final int val$listen_for_id, final boolean val$isSet, final int val$listen_for_value) {
            this.f7345b = val$viewTransition;
            this.f7346c = val$listen_for_id;
            this.f7347d = val$isSet;
            this.f7348e = val$listen_for_value;
        }

        @Override // androidx.constraintlayout.widget.m.a
        public void a(int id, int value, int oldValue) {
            int h7 = this.f7345b.h();
            this.f7345b.r(value);
            if (this.f7346c != id || h7 == value) {
                return;
            }
            if (this.f7347d) {
                if (this.f7348e == value) {
                    int childCount = c0.this.f7339a.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = c0.this.f7339a.getChildAt(i7);
                        if (this.f7345b.m(childAt)) {
                            int currentState = c0.this.f7339a.getCurrentState();
                            androidx.constraintlayout.widget.e Z = c0.this.f7339a.Z(currentState);
                            b0 b0Var = this.f7345b;
                            c0 c0Var = c0.this;
                            b0Var.c(c0Var, c0Var.f7339a, currentState, Z, childAt);
                        }
                    }
                }
            } else if (this.f7348e != value) {
                int childCount2 = c0.this.f7339a.getChildCount();
                for (int i8 = 0; i8 < childCount2; i8++) {
                    View childAt2 = c0.this.f7339a.getChildAt(i8);
                    if (this.f7345b.m(childAt2)) {
                        int currentState2 = c0.this.f7339a.getCurrentState();
                        androidx.constraintlayout.widget.e Z2 = c0.this.f7339a.Z(currentState2);
                        b0 b0Var2 = this.f7345b;
                        c0 c0Var2 = c0.this;
                        b0Var2.c(c0Var2, c0Var2.f7339a, currentState2, Z2, childAt2);
                    }
                }
            }
        }
    }

    public c0(s layout) {
        this.f7339a = layout;
    }

    public void b(b0 viewTransition) {
        this.f7340b.add(viewTransition);
        this.f7341c = null;
        if (viewTransition.j() == 4) {
            i(viewTransition, true);
        } else if (viewTransition.j() == 5) {
            i(viewTransition, false);
        }
    }

    public void c(b0.b animation) {
        if (this.f7343e == null) {
            this.f7343e = new ArrayList<>();
        }
        this.f7343e.add(animation);
    }

    public void d() {
        ArrayList<b0.b> arrayList = this.f7343e;
        if (arrayList == null) {
            return;
        }
        Iterator<b0.b> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f7343e.removeAll(this.f7344f);
        this.f7344f.clear();
        if (this.f7343e.isEmpty()) {
            this.f7343e = null;
        }
    }

    public boolean e(int viewTransitionId, o motionController) {
        Iterator<b0> it = this.f7340b.iterator();
        while (it.hasNext()) {
            b0 next = it.next();
            if (next.e() == viewTransitionId) {
                next.f7306g.a(motionController);
                return true;
            }
        }
        return false;
    }

    public void f(int id, boolean enable) {
        Iterator<b0> it = this.f7340b.iterator();
        while (it.hasNext()) {
            b0 next = it.next();
            if (next.e() == id) {
                next.o(enable);
                return;
            }
        }
    }

    public void g() {
        this.f7339a.invalidate();
    }

    public boolean h(int id) {
        Iterator<b0> it = this.f7340b.iterator();
        while (it.hasNext()) {
            b0 next = it.next();
            if (next.e() == id) {
                return next.k();
            }
        }
        return false;
    }

    public final void i(b0 viewTransition, boolean isSet) {
        ConstraintLayout.getSharedValues().a(viewTransition.i(), new a(viewTransition, viewTransition.i(), isSet, viewTransition.g()));
    }

    public void j(int id) {
        b0 b0Var;
        Iterator<b0> it = this.f7340b.iterator();
        while (true) {
            if (!it.hasNext()) {
                b0Var = null;
                break;
            }
            b0Var = it.next();
            if (b0Var.e() == id) {
                break;
            }
        }
        if (b0Var != null) {
            this.f7341c = null;
            this.f7340b.remove(b0Var);
        }
    }

    public void k(b0.b animation) {
        this.f7344f.add(animation);
    }

    public void l(MotionEvent event) {
        b0 b0Var;
        int currentState = this.f7339a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.f7341c == null) {
            this.f7341c = new HashSet<>();
            Iterator<b0> it = this.f7340b.iterator();
            while (it.hasNext()) {
                b0 next = it.next();
                int childCount = this.f7339a.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.f7339a.getChildAt(i7);
                    if (next.m(childAt)) {
                        childAt.getId();
                        this.f7341c.add(childAt);
                    }
                }
            }
        }
        float x6 = event.getX();
        float y6 = event.getY();
        Rect rect = new Rect();
        int action = event.getAction();
        ArrayList<b0.b> arrayList = this.f7343e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<b0.b> it2 = this.f7343e.iterator();
            while (it2.hasNext()) {
                it2.next().d(action, x6, y6);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.e Z = this.f7339a.Z(currentState);
            Iterator<b0> it3 = this.f7340b.iterator();
            while (it3.hasNext()) {
                b0 next2 = it3.next();
                if (next2.u(action)) {
                    Iterator<View> it4 = this.f7341c.iterator();
                    while (it4.hasNext()) {
                        View next3 = it4.next();
                        if (next2.m(next3)) {
                            next3.getHitRect(rect);
                            if (rect.contains((int) x6, (int) y6)) {
                                b0Var = next2;
                                next2.c(this, this.f7339a, currentState, Z, next3);
                            } else {
                                b0Var = next2;
                            }
                            next2 = b0Var;
                        }
                    }
                }
            }
        }
    }

    public void m(int id, View... views) {
        ArrayList arrayList = new ArrayList();
        Iterator<b0> it = this.f7340b.iterator();
        b0 b0Var = null;
        while (it.hasNext()) {
            b0 next = it.next();
            if (next.e() == id) {
                for (View view : views) {
                    if (next.d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    n(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                b0Var = next;
            }
        }
        if (b0Var == null) {
            Log.e(this.f7342d, " Could not find ViewTransition");
        }
    }

    public final void n(b0 vt, View... view) {
        int currentState = this.f7339a.getCurrentState();
        if (vt.f7305f == 2) {
            vt.c(this, this.f7339a, currentState, null, view);
        } else if (currentState != -1) {
            androidx.constraintlayout.widget.e Z = this.f7339a.Z(currentState);
            if (Z == null) {
                return;
            }
            vt.c(this, this.f7339a, currentState, Z, view);
        } else {
            Log.w(this.f7342d, "No support for ViewTransition within transition yet. Currently: " + this.f7339a.toString());
        }
    }
}
