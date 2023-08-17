package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class j extends j0 {

    /* renamed from: k  reason: collision with root package name */
    public static final String f6636k = "android:changeScroll:x";

    /* renamed from: l  reason: collision with root package name */
    public static final String f6637l = "android:changeScroll:y";

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f6638m = {f6636k, f6637l};

    public j() {
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
        r0Var.f6756a.put(f6636k, Integer.valueOf(r0Var.f6757b.getScrollX()));
        r0Var.f6756a.put(f6637l, Integer.valueOf(r0Var.f6757b.getScrollY()));
    }

    @Override // androidx.transition.j0
    @d.q0
    public Animator createAnimator(@d.o0 ViewGroup viewGroup, @d.q0 r0 r0Var, @d.q0 r0 r0Var2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (r0Var == null || r0Var2 == null) {
            return null;
        }
        View view = r0Var2.f6757b;
        int intValue = ((Integer) r0Var.f6756a.get(f6636k)).intValue();
        int intValue2 = ((Integer) r0Var2.f6756a.get(f6636k)).intValue();
        int intValue3 = ((Integer) r0Var.f6756a.get(f6637l)).intValue();
        int intValue4 = ((Integer) r0Var2.f6756a.get(f6637l)).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return q0.c(objectAnimator, objectAnimator2);
    }

    @Override // androidx.transition.j0
    @d.q0
    public String[] getTransitionProperties() {
        return f6638m;
    }

    public j(@d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
