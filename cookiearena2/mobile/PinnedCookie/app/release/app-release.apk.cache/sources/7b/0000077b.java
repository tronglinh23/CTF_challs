package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.d0;
import androidx.transition.j0;

/* loaded from: classes.dex */
public class t0 {

    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements j0.h {

        /* renamed from: a  reason: collision with root package name */
        public final View f6801a;

        /* renamed from: b  reason: collision with root package name */
        public final View f6802b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6803c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6804d;

        /* renamed from: e  reason: collision with root package name */
        public int[] f6805e;

        /* renamed from: f  reason: collision with root package name */
        public float f6806f;

        /* renamed from: g  reason: collision with root package name */
        public float f6807g;

        /* renamed from: h  reason: collision with root package name */
        public final float f6808h;

        /* renamed from: i  reason: collision with root package name */
        public final float f6809i;

        public a(View view, View view2, int i7, int i8, float f7, float f8) {
            this.f6802b = view;
            this.f6801a = view2;
            this.f6803c = i7 - Math.round(view.getTranslationX());
            this.f6804d = i8 - Math.round(view.getTranslationY());
            this.f6808h = f7;
            this.f6809i = f8;
            int[] iArr = (int[]) view2.getTag(d0.g.T1);
            this.f6805e = iArr;
            if (iArr != null) {
                view2.setTag(d0.g.T1, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f6805e == null) {
                this.f6805e = new int[2];
            }
            this.f6805e[0] = Math.round(this.f6803c + this.f6802b.getTranslationX());
            this.f6805e[1] = Math.round(this.f6804d + this.f6802b.getTranslationY());
            this.f6801a.setTag(d0.g.T1, this.f6805e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f6806f = this.f6802b.getTranslationX();
            this.f6807g = this.f6802b.getTranslationY();
            this.f6802b.setTranslationX(this.f6808h);
            this.f6802b.setTranslationY(this.f6809i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f6802b.setTranslationX(this.f6806f);
            this.f6802b.setTranslationY(this.f6807g);
        }

        @Override // androidx.transition.j0.h
        public void onTransitionCancel(@d.o0 j0 j0Var) {
        }

        @Override // androidx.transition.j0.h
        public void onTransitionEnd(@d.o0 j0 j0Var) {
            this.f6802b.setTranslationX(this.f6808h);
            this.f6802b.setTranslationY(this.f6809i);
            j0Var.removeListener(this);
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

    @d.q0
    public static Animator a(@d.o0 View view, @d.o0 r0 r0Var, int i7, int i8, float f7, float f8, float f9, float f10, @d.q0 TimeInterpolator timeInterpolator, @d.o0 j0 j0Var) {
        float f11;
        float f12;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) r0Var.f6757b.getTag(d0.g.T1)) != null) {
            f11 = (r4[0] - i7) + translationX;
            f12 = (r4[1] - i8) + translationY;
        } else {
            f11 = f7;
            f12 = f8;
        }
        int round = i7 + Math.round(f11 - translationX);
        int round2 = i8 + Math.round(f12 - translationY);
        view.setTranslationX(f11);
        view.setTranslationY(f12);
        if (f11 == f9 && f12 == f10) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f11, f9), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f12, f10));
        a aVar = new a(view, r0Var.f6757b, round, round2, translationX, translationY);
        j0Var.addListener(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        androidx.transition.a.a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}