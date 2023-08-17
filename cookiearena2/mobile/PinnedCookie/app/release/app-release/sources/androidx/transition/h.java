package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class h extends j0 {

    /* renamed from: l  reason: collision with root package name */
    public static final String f6579l = "android:clipBounds:bounds";

    /* renamed from: k  reason: collision with root package name */
    public static final String f6578k = "android:clipBounds:clip";

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f6580m = {f6578k};

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f6581a;

        public a(View view) {
            this.f6581a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            androidx.core.view.u1.M1(this.f6581a, null);
        }
    }

    public h() {
    }

    @Override // androidx.transition.j0
    public void captureEndValues(@d.o0 r0 r0Var) {
        captureValues(r0Var);
    }

    @Override // androidx.transition.j0
    public void captureStartValues(@d.o0 r0 r0Var) {
        captureValues(r0Var);
    }

    public final void captureValues(r0 r0Var) {
        View view = r0Var.f6757b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect P = androidx.core.view.u1.P(view);
        r0Var.f6756a.put(f6578k, P);
        if (P == null) {
            r0Var.f6756a.put(f6579l, new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.j0
    @d.q0
    public Animator createAnimator(@d.o0 ViewGroup viewGroup, @d.q0 r0 r0Var, @d.q0 r0 r0Var2) {
        ObjectAnimator objectAnimator = null;
        if (r0Var != null && r0Var2 != null && r0Var.f6756a.containsKey(f6578k) && r0Var2.f6756a.containsKey(f6578k)) {
            Rect rect = (Rect) r0Var.f6756a.get(f6578k);
            Rect rect2 = (Rect) r0Var2.f6756a.get(f6578k);
            boolean z6 = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) r0Var.f6756a.get(f6579l);
            } else if (rect2 == null) {
                rect2 = (Rect) r0Var2.f6756a.get(f6579l);
            }
            if (rect.equals(rect2)) {
                return null;
            }
            androidx.core.view.u1.M1(r0Var2.f6757b, rect);
            objectAnimator = ObjectAnimator.ofObject(r0Var2.f6757b, (Property<View, V>) e1.f6524d, (TypeEvaluator) new e0(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z6) {
                objectAnimator.addListener(new a(r0Var2.f6757b));
            }
        }
        return objectAnimator;
    }

    @Override // androidx.transition.j0
    @d.o0
    public String[] getTransitionProperties() {
        return f6580m;
    }

    public h(@d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
