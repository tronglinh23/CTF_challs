package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.view.WindowInsetsAnimationController;
import com.google.android.material.color.utilities.Contrast;

/* loaded from: classes.dex */
public final class g4 {

    /* renamed from: a  reason: collision with root package name */
    public final b f3602a;

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsAnimationController f3603a;

        public a(@d.o0 WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f3603a = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.g4.b
        public void a(boolean z6) {
            this.f3603a.finish(z6);
        }

        @Override // androidx.core.view.g4.b
        public float b() {
            float currentAlpha;
            currentAlpha = this.f3603a.getCurrentAlpha();
            return currentAlpha;
        }

        @Override // androidx.core.view.g4.b
        public float c() {
            float currentFraction;
            currentFraction = this.f3603a.getCurrentFraction();
            return currentFraction;
        }

        @Override // androidx.core.view.g4.b
        @d.o0
        public p0.v0 d() {
            Insets currentInsets;
            currentInsets = this.f3603a.getCurrentInsets();
            return p0.v0.g(currentInsets);
        }

        @Override // androidx.core.view.g4.b
        @d.o0
        public p0.v0 e() {
            Insets hiddenStateInsets;
            hiddenStateInsets = this.f3603a.getHiddenStateInsets();
            return p0.v0.g(hiddenStateInsets);
        }

        @Override // androidx.core.view.g4.b
        @d.o0
        public p0.v0 f() {
            Insets shownStateInsets;
            shownStateInsets = this.f3603a.getShownStateInsets();
            return p0.v0.g(shownStateInsets);
        }

        @Override // androidx.core.view.g4.b
        @SuppressLint({"WrongConstant"})
        public int g() {
            int types;
            types = this.f3603a.getTypes();
            return types;
        }

        @Override // androidx.core.view.g4.b
        public boolean h() {
            boolean isCancelled;
            isCancelled = this.f3603a.isCancelled();
            return isCancelled;
        }

        @Override // androidx.core.view.g4.b
        public boolean i() {
            boolean isFinished;
            isFinished = this.f3603a.isFinished();
            return isFinished;
        }

        @Override // androidx.core.view.g4.b
        public void j(@d.q0 p0.v0 v0Var, float f7, float f8) {
            this.f3603a.setInsetsAndAlpha(v0Var == null ? null : v0Var.h(), f7, f8);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public void a(boolean z6) {
        }

        public float b() {
            return 0.0f;
        }

        @d.x(from = androidx.cardview.widget.g.f1896q, to = Contrast.RATIO_MIN)
        public float c() {
            return 0.0f;
        }

        @d.o0
        public p0.v0 d() {
            return p0.v0.f14584e;
        }

        @d.o0
        public p0.v0 e() {
            return p0.v0.f14584e;
        }

        @d.o0
        public p0.v0 f() {
            return p0.v0.f14584e;
        }

        public int g() {
            return 0;
        }

        public boolean h() {
            return true;
        }

        public boolean i() {
            return false;
        }

        public void j(@d.q0 p0.v0 v0Var, @d.x(from = 0.0d, to = 1.0d) float f7, @d.x(from = 0.0d, to = 1.0d) float f8) {
        }
    }

    @d.w0(30)
    public g4(@d.o0 WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f3602a = new a(windowInsetsAnimationController);
    }

    public void a(boolean z6) {
        this.f3602a.a(z6);
    }

    public float b() {
        return this.f3602a.b();
    }

    @d.x(from = androidx.cardview.widget.g.f1896q, to = Contrast.RATIO_MIN)
    public float c() {
        return this.f3602a.c();
    }

    @d.o0
    public p0.v0 d() {
        return this.f3602a.d();
    }

    @d.o0
    public p0.v0 e() {
        return this.f3602a.e();
    }

    @d.o0
    public p0.v0 f() {
        return this.f3602a.f();
    }

    public int g() {
        return this.f3602a.g();
    }

    public boolean h() {
        return this.f3602a.h();
    }

    public boolean i() {
        return this.f3602a.i();
    }

    public boolean j() {
        return (i() || h()) ? false : true;
    }

    public void k(@d.q0 p0.v0 v0Var, @d.x(from = 0.0d, to = 1.0d) float f7, @d.x(from = 0.0d, to = 1.0d) float f8) {
        this.f3602a.j(v0Var, f7, f8);
    }
}