package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class n extends s1 {

    /* renamed from: k  reason: collision with root package name */
    public static final String f6704k = "android:fade:transitionAlpha";

    /* renamed from: l  reason: collision with root package name */
    public static final String f6705l = "Fade";

    /* renamed from: m  reason: collision with root package name */
    public static final int f6706m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f6707n = 2;

    /* loaded from: classes.dex */
    public class a extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f6708a;

        public a(View view) {
            this.f6708a = view;
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionEnd(@d.o0 j0 j0Var) {
            e1.h(this.f6708a, 1.0f);
            e1.a(this.f6708a);
            j0Var.removeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f6710a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6711b = false;

        public b(View view) {
            this.f6710a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e1.h(this.f6710a, 1.0f);
            if (this.f6711b) {
                this.f6710a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (androidx.core.view.u1.L0(this.f6710a) && this.f6710a.getLayerType() == 0) {
                this.f6711b = true;
                this.f6710a.setLayerType(2, null);
            }
        }
    }

    public n(int i7) {
        setMode(i7);
    }

    public static float B(r0 r0Var, float f7) {
        Float f8;
        return (r0Var == null || (f8 = (Float) r0Var.f6756a.get(f6704k)) == null) ? f7 : f8.floatValue();
    }

    public final Animator A(View view, float f7, float f8) {
        if (f7 == f8) {
            return null;
        }
        e1.h(view, f7);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, e1.f6523c, f8);
        ofFloat.addListener(new b(view));
        addListener(new a(view));
        return ofFloat;
    }

    @Override // androidx.transition.s1, androidx.transition.j0
    public void captureStartValues(@d.o0 r0 r0Var) {
        super.captureStartValues(r0Var);
        r0Var.f6756a.put(f6704k, Float.valueOf(e1.c(r0Var.f6757b)));
    }

    @Override // androidx.transition.s1
    @d.q0
    public Animator onAppear(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        float B = B(r0Var, 0.0f);
        return A(view, B != 1.0f ? B : 0.0f, 1.0f);
    }

    @Override // androidx.transition.s1
    @d.q0
    public Animator onDisappear(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        e1.e(view);
        return A(view, B(r0Var, 1.0f), 0.0f);
    }

    public n() {
    }

    @SuppressLint({"RestrictedApi"})
    public n(@d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f6606f);
        setMode(m0.p.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        obtainStyledAttributes.recycle();
    }
}
