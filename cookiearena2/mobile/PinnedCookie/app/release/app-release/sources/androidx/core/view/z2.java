package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f3884e = 2113929216;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<View> f3885a;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f3886b = null;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f3887c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f3888d = -1;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a3 f3889a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f3890b;

        public a(a3 a3Var, View view) {
            this.f3889a = a3Var;
            this.f3890b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3889a.a(this.f3890b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3889a.b(this.f3890b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3889a.c(this.f3890b);
        }
    }

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        @d.u
        public static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        @d.u
        public static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    @d.w0(18)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static Interpolator a(ViewPropertyAnimator viewPropertyAnimator) {
            return (Interpolator) viewPropertyAnimator.getInterpolator();
        }
    }

    @d.w0(19)
    /* loaded from: classes.dex */
    public static class d {
        @d.u
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class e {
        @d.u
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f7) {
            return viewPropertyAnimator.translationZ(f7);
        }

        @d.u
        public static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator, float f7) {
            return viewPropertyAnimator.translationZBy(f7);
        }

        @d.u
        public static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, float f7) {
            return viewPropertyAnimator.z(f7);
        }

        @d.u
        public static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator, float f7) {
            return viewPropertyAnimator.zBy(f7);
        }
    }

    /* loaded from: classes.dex */
    public static class f implements a3 {

        /* renamed from: a  reason: collision with root package name */
        public z2 f3892a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3893b;

        public f(z2 z2Var) {
            this.f3892a = z2Var;
        }

        @Override // androidx.core.view.a3
        public void a(@d.o0 View view) {
            Object tag = view.getTag(z2.f3884e);
            a3 a3Var = tag instanceof a3 ? (a3) tag : null;
            if (a3Var != null) {
                a3Var.a(view);
            }
        }

        @Override // androidx.core.view.a3
        @SuppressLint({"WrongConstant"})
        public void b(@d.o0 View view) {
            int i7 = this.f3892a.f3888d;
            if (i7 > -1) {
                view.setLayerType(i7, null);
                this.f3892a.f3888d = -1;
            }
            z2 z2Var = this.f3892a;
            Runnable runnable = z2Var.f3887c;
            if (runnable != null) {
                z2Var.f3887c = null;
                runnable.run();
            }
            Object tag = view.getTag(z2.f3884e);
            a3 a3Var = tag instanceof a3 ? (a3) tag : null;
            if (a3Var != null) {
                a3Var.b(view);
            }
            this.f3893b = true;
        }

        @Override // androidx.core.view.a3
        public void c(@d.o0 View view) {
            this.f3893b = false;
            if (this.f3892a.f3888d > -1) {
                view.setLayerType(2, null);
            }
            z2 z2Var = this.f3892a;
            Runnable runnable = z2Var.f3886b;
            if (runnable != null) {
                z2Var.f3886b = null;
                runnable.run();
            }
            Object tag = view.getTag(z2.f3884e);
            a3 a3Var = tag instanceof a3 ? (a3) tag : null;
            if (a3Var != null) {
                a3Var.c(view);
            }
        }
    }

    public z2(View view) {
        this.f3885a = new WeakReference<>(view);
    }

    @d.o0
    public z2 A(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().translationXBy(f7);
        }
        return this;
    }

    @d.o0
    public z2 B(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().translationY(f7);
        }
        return this;
    }

    @d.o0
    public z2 C(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().translationYBy(f7);
        }
        return this;
    }

    @d.o0
    public z2 D(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            e.a(view.animate(), f7);
        }
        return this;
    }

    @d.o0
    public z2 E(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            e.b(view.animate(), f7);
        }
        return this;
    }

    @d.o0
    public z2 F(@d.o0 Runnable runnable) {
        View view = this.f3885a.get();
        if (view != null) {
            b.a(view.animate(), runnable);
        }
        return this;
    }

    @SuppressLint({"WrongConstant"})
    @d.o0
    public z2 G() {
        View view = this.f3885a.get();
        if (view != null) {
            b.b(view.animate());
        }
        return this;
    }

    @d.o0
    public z2 H(@d.o0 Runnable runnable) {
        View view = this.f3885a.get();
        if (view != null) {
            b.c(view.animate(), runnable);
        }
        return this;
    }

    @d.o0
    public z2 I(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().x(f7);
        }
        return this;
    }

    @d.o0
    public z2 J(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().xBy(f7);
        }
        return this;
    }

    @d.o0
    public z2 K(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().y(f7);
        }
        return this;
    }

    @d.o0
    public z2 L(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().yBy(f7);
        }
        return this;
    }

    @d.o0
    public z2 M(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            e.c(view.animate(), f7);
        }
        return this;
    }

    @d.o0
    public z2 N(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            e.d(view.animate(), f7);
        }
        return this;
    }

    @d.o0
    public z2 b(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().alpha(f7);
        }
        return this;
    }

    @d.o0
    public z2 c(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().alphaBy(f7);
        }
        return this;
    }

    public void d() {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long e() {
        View view = this.f3885a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @d.q0
    public Interpolator f() {
        View view = this.f3885a.get();
        if (view != null) {
            return c.a(view.animate());
        }
        return null;
    }

    public long g() {
        View view = this.f3885a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @d.o0
    public z2 i(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().rotation(f7);
        }
        return this;
    }

    @d.o0
    public z2 j(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().rotationBy(f7);
        }
        return this;
    }

    @d.o0
    public z2 k(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().rotationX(f7);
        }
        return this;
    }

    @d.o0
    public z2 l(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().rotationXBy(f7);
        }
        return this;
    }

    @d.o0
    public z2 m(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().rotationY(f7);
        }
        return this;
    }

    @d.o0
    public z2 n(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().rotationYBy(f7);
        }
        return this;
    }

    @d.o0
    public z2 o(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().scaleX(f7);
        }
        return this;
    }

    @d.o0
    public z2 p(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().scaleXBy(f7);
        }
        return this;
    }

    @d.o0
    public z2 q(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().scaleY(f7);
        }
        return this;
    }

    @d.o0
    public z2 r(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().scaleYBy(f7);
        }
        return this;
    }

    @d.o0
    public z2 s(long j7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().setDuration(j7);
        }
        return this;
    }

    @d.o0
    public z2 t(@d.q0 Interpolator interpolator) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @d.o0
    public z2 u(@d.q0 a3 a3Var) {
        View view = this.f3885a.get();
        if (view != null) {
            v(view, a3Var);
        }
        return this;
    }

    public final void v(View view, a3 a3Var) {
        if (a3Var != null) {
            view.animate().setListener(new a(a3Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @d.o0
    public z2 w(long j7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().setStartDelay(j7);
        }
        return this;
    }

    @d.o0
    public z2 x(@d.q0 final c3 c3Var) {
        final View view = this.f3885a.get();
        if (view != null) {
            d.a(view.animate(), c3Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.y2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    c3.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void y() {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @d.o0
    public z2 z(float f7) {
        View view = this.f3885a.get();
        if (view != null) {
            view.animate().translationX(f7);
        }
        return this;
    }
}
