package androidx.core.view;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.o5;

/* loaded from: classes.dex */
public final class o5 {
    @Deprecated

    /* renamed from: b */
    public static final int f3770b = 0;

    /* renamed from: c */
    public static final int f3771c = 1;
    @Deprecated

    /* renamed from: d */
    public static final int f3772d = 1;

    /* renamed from: e */
    public static final int f3773e = 2;

    /* renamed from: a */
    public final e f3774a;

    @d.w0(20)
    /* loaded from: classes.dex */
    public static class a extends e {
        @d.o0

        /* renamed from: a */
        public final Window f3775a;
        @d.o0

        /* renamed from: b */
        public final View f3776b;

        public a(@d.o0 Window window, @d.o0 View view) {
            this.f3775a = window;
            this.f3776b = view;
        }

        public static /* synthetic */ void l(View view) {
            n(view);
        }

        public static /* synthetic */ void n(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // androidx.core.view.o5.e
        public void a(f fVar) {
        }

        @Override // androidx.core.view.o5.e
        public void b(int i7, long j7, Interpolator interpolator, CancellationSignal cancellationSignal, v3 v3Var) {
        }

        @Override // androidx.core.view.o5.e
        public int c() {
            return 0;
        }

        @Override // androidx.core.view.o5.e
        public void d(int i7) {
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    m(i8);
                }
            }
        }

        @Override // androidx.core.view.o5.e
        public void g(@d.o0 f fVar) {
        }

        @Override // androidx.core.view.o5.e
        public void j(int i7) {
            if (i7 == 0) {
                r(6144);
            } else if (i7 == 1) {
                r(4096);
                o(2048);
            } else if (i7 != 2) {
            } else {
                r(2048);
                o(4096);
            }
        }

        @Override // androidx.core.view.o5.e
        public void k(int i7) {
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    q(i8);
                }
            }
        }

        public final void m(int i7) {
            if (i7 == 1) {
                o(4);
            } else if (i7 == 2) {
                o(2);
            } else if (i7 != 8) {
            } else {
                ((InputMethodManager) this.f3775a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f3775a.getDecorView().getWindowToken(), 0);
            }
        }

        public void o(int i7) {
            View decorView = this.f3775a.getDecorView();
            decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
        }

        public void p(int i7) {
            this.f3775a.addFlags(i7);
        }

        public final void q(int i7) {
            if (i7 == 1) {
                r(4);
                s(1024);
            } else if (i7 == 2) {
                r(2);
            } else if (i7 != 8) {
            } else {
                final View view = this.f3776b;
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = this.f3775a.getCurrentFocus();
                }
                if (view == null) {
                    view = this.f3775a.findViewById(16908290);
                }
                if (view == null || !view.hasWindowFocus()) {
                    return;
                }
                view.post(new Runnable() { // from class: androidx.core.view.n5
                    @Override // java.lang.Runnable
                    public final void run() {
                        o5.a.l(view);
                    }
                });
            }
        }

        public void r(int i7) {
            View decorView = this.f3775a.getDecorView();
            decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
        }

        public void s(int i7) {
            this.f3775a.clearFlags(i7);
        }
    }

    @d.w0(23)
    /* loaded from: classes.dex */
    public static class b extends a {
        public b(@d.o0 Window window, @d.q0 View view) {
            super(window, view);
        }

        @Override // androidx.core.view.o5.e
        public boolean f() {
            return (this.f3775a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.o5.e
        public void i(boolean z6) {
            if (!z6) {
                r(8192);
                return;
            }
            s(67108864);
            p(Integer.MIN_VALUE);
            o(8192);
        }
    }

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class c extends b {
        public c(@d.o0 Window window, @d.q0 View view) {
            super(window, view);
        }

        @Override // androidx.core.view.o5.e
        public boolean e() {
            return (this.f3775a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.o5.e
        public void h(boolean z6) {
            if (!z6) {
                r(16);
                return;
            }
            s(134217728);
            p(Integer.MIN_VALUE);
            o(16);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public void a(f fVar) {
        }

        public void b(int i7, long j7, Interpolator interpolator, CancellationSignal cancellationSignal, v3 v3Var) {
        }

        public int c() {
            return 0;
        }

        public void d(int i7) {
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            return false;
        }

        public void g(@d.o0 f fVar) {
        }

        public void h(boolean z6) {
        }

        public void i(boolean z6) {
        }

        public void j(int i7) {
        }

        public void k(int i7) {
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(@d.o0 o5 o5Var, int i7);
    }

    @d.w0(30)
    @Deprecated
    public o5(@d.o0 WindowInsetsController windowInsetsController) {
        this.f3774a = new d(windowInsetsController, this);
    }

    @d.o0
    @d.w0(30)
    @Deprecated
    public static o5 l(@d.o0 WindowInsetsController windowInsetsController) {
        return new o5(windowInsetsController);
    }

    public void a(@d.o0 f fVar) {
        this.f3774a.a(fVar);
    }

    public void b(int i7, long j7, @d.q0 Interpolator interpolator, @d.q0 CancellationSignal cancellationSignal, @d.o0 v3 v3Var) {
        this.f3774a.b(i7, j7, interpolator, cancellationSignal, v3Var);
    }

    @SuppressLint({"WrongConstant"})
    public int c() {
        return this.f3774a.c();
    }

    public void d(int i7) {
        this.f3774a.d(i7);
    }

    public boolean e() {
        return this.f3774a.e();
    }

    public boolean f() {
        return this.f3774a.f();
    }

    public void g(@d.o0 f fVar) {
        this.f3774a.g(fVar);
    }

    public void h(boolean z6) {
        this.f3774a.h(z6);
    }

    public void i(boolean z6) {
        this.f3774a.i(z6);
    }

    public void j(int i7) {
        this.f3774a.j(i7);
    }

    public void k(int i7) {
        this.f3774a.k(i7);
    }

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a */
        public final o5 f3777a;

        /* renamed from: b */
        public final WindowInsetsController f3778b;

        /* renamed from: c */
        public final androidx.collection.m<f, WindowInsetsController.OnControllableInsetsChangedListener> f3779c;

        /* renamed from: d */
        public Window f3780d;

        /* loaded from: classes.dex */
        public class a implements WindowInsetsAnimationControlListener {

            /* renamed from: a */
            public g4 f3781a = null;

            /* renamed from: b */
            public final /* synthetic */ v3 f3782b;

            public a(v3 v3Var) {
                d.this = r1;
                this.f3782b = v3Var;
            }

            @Override // android.view.WindowInsetsAnimationControlListener
            public void onCancelled(@d.q0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f3782b.b(windowInsetsAnimationController == null ? null : this.f3781a);
            }

            @Override // android.view.WindowInsetsAnimationControlListener
            public void onFinished(@d.o0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f3782b.a(this.f3781a);
            }

            @Override // android.view.WindowInsetsAnimationControlListener
            public void onReady(@d.o0 WindowInsetsAnimationController windowInsetsAnimationController, int i7) {
                g4 g4Var = new g4(windowInsetsAnimationController);
                this.f3781a = g4Var;
                this.f3782b.c(g4Var, i7);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(@d.o0 android.view.Window r2, @d.o0 androidx.core.view.o5 r3) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = androidx.core.view.z5.a(r2)
                r1.<init>(r0, r3)
                r1.f3780d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.o5.d.<init>(android.view.Window, androidx.core.view.o5):void");
        }

        public static /* synthetic */ void l(d dVar, f fVar, WindowInsetsController windowInsetsController, int i7) {
            dVar.m(fVar, windowInsetsController, i7);
        }

        public /* synthetic */ void m(f fVar, WindowInsetsController windowInsetsController, int i7) {
            if (this.f3778b == windowInsetsController) {
                fVar.a(this.f3777a, i7);
            }
        }

        @Override // androidx.core.view.o5.e
        public void a(@d.o0 final f fVar) {
            if (this.f3779c.containsKey(fVar)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.a6
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i7) {
                    o5.d.l(o5.d.this, fVar, windowInsetsController, i7);
                }
            };
            this.f3779c.put(fVar, onControllableInsetsChangedListener);
            this.f3778b.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }

        @Override // androidx.core.view.o5.e
        public void b(int i7, long j7, @d.q0 Interpolator interpolator, @d.q0 CancellationSignal cancellationSignal, @d.o0 v3 v3Var) {
            this.f3778b.controlWindowInsetsAnimation(i7, j7, interpolator, cancellationSignal, new a(v3Var));
        }

        @Override // androidx.core.view.o5.e
        @SuppressLint({"WrongConstant"})
        public int c() {
            int systemBarsBehavior;
            systemBarsBehavior = this.f3778b.getSystemBarsBehavior();
            return systemBarsBehavior;
        }

        @Override // androidx.core.view.o5.e
        public void d(int i7) {
            this.f3778b.hide(i7);
        }

        @Override // androidx.core.view.o5.e
        public boolean e() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f3778b.getSystemBarsAppearance();
            return (systemBarsAppearance & 16) != 0;
        }

        @Override // androidx.core.view.o5.e
        public boolean f() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f3778b.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        @Override // androidx.core.view.o5.e
        public void g(@d.o0 f fVar) {
            WindowInsetsController.OnControllableInsetsChangedListener a7 = r5.a(this.f3779c.remove(fVar));
            if (a7 != null) {
                this.f3778b.removeOnControllableInsetsChangedListener(a7);
            }
        }

        @Override // androidx.core.view.o5.e
        public void h(boolean z6) {
            if (z6) {
                if (this.f3780d != null) {
                    n(16);
                }
                this.f3778b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f3780d != null) {
                o(16);
            }
            this.f3778b.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.o5.e
        public void i(boolean z6) {
            if (z6) {
                if (this.f3780d != null) {
                    n(8192);
                }
                this.f3778b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f3780d != null) {
                o(8192);
            }
            this.f3778b.setSystemBarsAppearance(0, 8);
        }

        @Override // androidx.core.view.o5.e
        public void j(int i7) {
            this.f3778b.setSystemBarsBehavior(i7);
        }

        @Override // androidx.core.view.o5.e
        public void k(int i7) {
            Window window = this.f3780d;
            if (window != null && (i7 & 8) != 0 && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f3778b.show(i7);
        }

        public void n(int i7) {
            View decorView = this.f3780d.getDecorView();
            decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
        }

        public void o(int i7) {
            View decorView = this.f3780d.getDecorView();
            decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
        }

        public d(@d.o0 WindowInsetsController windowInsetsController, @d.o0 o5 o5Var) {
            this.f3779c = new androidx.collection.m<>();
            this.f3778b = windowInsetsController;
            this.f3777a = o5Var;
        }
    }

    public o5(@d.o0 Window window, @d.o0 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3774a = new d(window, this);
        } else {
            this.f3774a = new c(window, view);
        }
    }
}