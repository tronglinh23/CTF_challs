package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.h4;
import com.google.android.material.color.utilities.Contrast;
import d.b1;
import f0.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class g3 {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f3567b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final String f3568c = "WindowInsetsAnimCompat";

    /* renamed from: a  reason: collision with root package name */
    public e f3569a;

    /* loaded from: classes.dex */
    public static abstract class b {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        @d.b1({b1.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        public b(int i7) {
            this.mDispatchMode = i7;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public void onEnd(@d.o0 g3 g3Var) {
        }

        public void onPrepare(@d.o0 g3 g3Var) {
        }

        @d.o0
        public abstract h4 onProgress(@d.o0 h4 h4Var, @d.o0 List<g3> list);

        @d.o0
        public a onStart(@d.o0 g3 g3Var, @d.o0 a aVar) {
            return aVar;
        }
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: f  reason: collision with root package name */
        public static final Interpolator f3572f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: g  reason: collision with root package name */
        public static final Interpolator f3573g = new b2.a();

        /* renamed from: h  reason: collision with root package name */
        public static final Interpolator f3574h = new DecelerateInterpolator();

        @d.w0(21)
        /* loaded from: classes.dex */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: c  reason: collision with root package name */
            public static final int f3575c = 160;

            /* renamed from: a  reason: collision with root package name */
            public final b f3576a;

            /* renamed from: b  reason: collision with root package name */
            public h4 f3577b;

            /* renamed from: androidx.core.view.g3$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0036a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ g3 f3578a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ h4 f3579b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ h4 f3580c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ int f3581d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ View f3582e;

                public C0036a(g3 g3Var, h4 h4Var, h4 h4Var2, int i7, View view) {
                    this.f3578a = g3Var;
                    this.f3579b = h4Var;
                    this.f3580c = h4Var2;
                    this.f3581d = i7;
                    this.f3582e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f3578a.i(valueAnimator.getAnimatedFraction());
                    c.o(this.f3582e, c.s(this.f3579b, this.f3580c, this.f3578a.d(), this.f3581d), Collections.singletonList(this.f3578a));
                }
            }

            /* loaded from: classes.dex */
            public class b extends AnimatorListenerAdapter {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ g3 f3584a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ View f3585b;

                public b(g3 g3Var, View view) {
                    this.f3584a = g3Var;
                    this.f3585b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f3584a.i(1.0f);
                    c.m(this.f3585b, this.f3584a);
                }
            }

            /* renamed from: androidx.core.view.g3$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0037c implements Runnable {

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ View f3587k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ g3 f3588l;

                /* renamed from: m  reason: collision with root package name */
                public final /* synthetic */ a f3589m;

                /* renamed from: n  reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f3590n;

                public RunnableC0037c(View view, g3 g3Var, a aVar, ValueAnimator valueAnimator) {
                    this.f3587k = view;
                    this.f3588l = g3Var;
                    this.f3589m = aVar;
                    this.f3590n = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.p(this.f3587k, this.f3588l, this.f3589m);
                    this.f3590n.start();
                }
            }

            public a(@d.o0 View view, @d.o0 b bVar) {
                this.f3576a = bVar;
                h4 o02 = u1.o0(view);
                this.f3577b = o02 != null ? new h4.b(o02).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int i7;
                if (!view.isLaidOut()) {
                    this.f3577b = h4.L(windowInsets, view);
                    return c.q(view, windowInsets);
                }
                h4 L = h4.L(windowInsets, view);
                if (this.f3577b == null) {
                    this.f3577b = u1.o0(view);
                }
                if (this.f3577b == null) {
                    this.f3577b = L;
                    return c.q(view, windowInsets);
                }
                b r6 = c.r(view);
                if ((r6 == null || !Objects.equals(r6.mDispachedInsets, windowInsets)) && (i7 = c.i(L, this.f3577b)) != 0) {
                    h4 h4Var = this.f3577b;
                    g3 g3Var = new g3(i7, c.k(i7, L, h4Var), 160L);
                    g3Var.i(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(g3Var.b());
                    a j7 = c.j(L, h4Var, i7);
                    c.n(view, g3Var, windowInsets, false);
                    duration.addUpdateListener(new C0036a(g3Var, L, h4Var, i7, view));
                    duration.addListener(new b(g3Var, view));
                    n1.a(view, new RunnableC0037c(view, g3Var, j7, duration));
                    this.f3577b = L;
                    return c.q(view, windowInsets);
                }
                return c.q(view, windowInsets);
            }
        }

        public c(int i7, @d.q0 Interpolator interpolator, long j7) {
            super(i7, interpolator, j7);
        }

        @SuppressLint({"WrongConstant"})
        public static int i(@d.o0 h4 h4Var, @d.o0 h4 h4Var2) {
            int i7 = 0;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if (!h4Var.f(i8).equals(h4Var2.f(i8))) {
                    i7 |= i8;
                }
            }
            return i7;
        }

        @d.o0
        public static a j(@d.o0 h4 h4Var, @d.o0 h4 h4Var2, int i7) {
            p0.v0 f7 = h4Var.f(i7);
            p0.v0 f8 = h4Var2.f(i7);
            return new a(p0.v0.d(Math.min(f7.f14585a, f8.f14585a), Math.min(f7.f14586b, f8.f14586b), Math.min(f7.f14587c, f8.f14587c), Math.min(f7.f14588d, f8.f14588d)), p0.v0.d(Math.max(f7.f14585a, f8.f14585a), Math.max(f7.f14586b, f8.f14586b), Math.max(f7.f14587c, f8.f14587c), Math.max(f7.f14588d, f8.f14588d)));
        }

        public static Interpolator k(int i7, h4 h4Var, h4 h4Var2) {
            return (i7 & 8) != 0 ? h4Var.f(h4.m.d()).f14588d > h4Var2.f(h4.m.d()).f14588d ? f3572f : f3573g : f3574h;
        }

        @d.o0
        public static View.OnApplyWindowInsetsListener l(@d.o0 View view, @d.o0 b bVar) {
            return new a(view, bVar);
        }

        public static void m(@d.o0 View view, @d.o0 g3 g3Var) {
            b r6 = r(view);
            if (r6 != null) {
                r6.onEnd(g3Var);
                if (r6.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    m(viewGroup.getChildAt(i7), g3Var);
                }
            }
        }

        public static void n(View view, g3 g3Var, WindowInsets windowInsets, boolean z6) {
            b r6 = r(view);
            if (r6 != null) {
                r6.mDispachedInsets = windowInsets;
                if (!z6) {
                    r6.onPrepare(g3Var);
                    z6 = r6.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    n(viewGroup.getChildAt(i7), g3Var, windowInsets, z6);
                }
            }
        }

        public static void o(@d.o0 View view, @d.o0 h4 h4Var, @d.o0 List<g3> list) {
            b r6 = r(view);
            if (r6 != null) {
                h4Var = r6.onProgress(h4Var, list);
                if (r6.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    o(viewGroup.getChildAt(i7), h4Var, list);
                }
            }
        }

        public static void p(View view, g3 g3Var, a aVar) {
            b r6 = r(view);
            if (r6 != null) {
                r6.onStart(g3Var, aVar);
                if (r6.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    p(viewGroup.getChildAt(i7), g3Var, aVar);
                }
            }
        }

        @d.o0
        public static WindowInsets q(@d.o0 View view, @d.o0 WindowInsets windowInsets) {
            return view.getTag(a.e.f9702h0) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @d.q0
        public static b r(View view) {
            Object tag = view.getTag(a.e.f9718p0);
            if (tag instanceof a) {
                return ((a) tag).f3576a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        public static h4 s(h4 h4Var, h4 h4Var2, float f7, int i7) {
            h4.b bVar = new h4.b(h4Var);
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) == 0) {
                    bVar.c(i8, h4Var.f(i8));
                } else {
                    p0.v0 f8 = h4Var.f(i8);
                    p0.v0 f9 = h4Var2.f(i8);
                    float f10 = 1.0f - f7;
                    bVar.c(i8, h4.z(f8, (int) (((f8.f14585a - f9.f14585a) * f10) + 0.5d), (int) (((f8.f14586b - f9.f14586b) * f10) + 0.5d), (int) (((f8.f14587c - f9.f14587c) * f10) + 0.5d), (int) (((f8.f14588d - f9.f14588d) * f10) + 0.5d)));
                }
            }
            return bVar.a();
        }

        public static void t(@d.o0 View view, @d.q0 b bVar) {
            Object tag = view.getTag(a.e.f9702h0);
            if (bVar == null) {
                view.setTag(a.e.f9718p0, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener l7 = l(view, bVar);
            view.setTag(a.e.f9718p0, l7);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(l7);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f3597a;

        /* renamed from: b  reason: collision with root package name */
        public float f3598b;
        @d.q0

        /* renamed from: c  reason: collision with root package name */
        public final Interpolator f3599c;

        /* renamed from: d  reason: collision with root package name */
        public final long f3600d;

        /* renamed from: e  reason: collision with root package name */
        public float f3601e;

        public e(int i7, @d.q0 Interpolator interpolator, long j7) {
            this.f3597a = i7;
            this.f3599c = interpolator;
            this.f3600d = j7;
        }

        public float a() {
            return this.f3601e;
        }

        public long b() {
            return this.f3600d;
        }

        public float c() {
            return this.f3598b;
        }

        public float d() {
            Interpolator interpolator = this.f3599c;
            return interpolator != null ? interpolator.getInterpolation(this.f3598b) : this.f3598b;
        }

        @d.q0
        public Interpolator e() {
            return this.f3599c;
        }

        public int f() {
            return this.f3597a;
        }

        public void g(float f7) {
            this.f3601e = f7;
        }

        public void h(float f7) {
            this.f3598b = f7;
        }
    }

    public g3(int i7, @d.q0 Interpolator interpolator, long j7) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3569a = new d(i7, interpolator, j7);
        } else {
            this.f3569a = new c(i7, interpolator, j7);
        }
    }

    public static void h(@d.o0 View view, @d.q0 b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.l(view, bVar);
        } else {
            c.t(view, bVar);
        }
    }

    @d.w0(30)
    public static g3 j(WindowInsetsAnimation windowInsetsAnimation) {
        return new g3(windowInsetsAnimation);
    }

    @d.x(from = androidx.cardview.widget.g.f1896q, to = Contrast.RATIO_MIN)
    public float a() {
        return this.f3569a.a();
    }

    public long b() {
        return this.f3569a.b();
    }

    @d.x(from = androidx.cardview.widget.g.f1896q, to = Contrast.RATIO_MIN)
    public float c() {
        return this.f3569a.c();
    }

    public float d() {
        return this.f3569a.d();
    }

    @d.q0
    public Interpolator e() {
        return this.f3569a.e();
    }

    public int f() {
        return this.f3569a.f();
    }

    public void g(@d.x(from = 0.0d, to = 1.0d) float f7) {
        this.f3569a.g(f7);
    }

    public void i(@d.x(from = 0.0d, to = 1.0d) float f7) {
        this.f3569a.h(f7);
    }

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class d extends e {
        @d.o0

        /* renamed from: f  reason: collision with root package name */
        public final WindowInsetsAnimation f3592f;

        @d.w0(30)
        /* loaded from: classes.dex */
        public static class a extends WindowInsetsAnimation.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final b f3593a;

            /* renamed from: b  reason: collision with root package name */
            public List<g3> f3594b;

            /* renamed from: c  reason: collision with root package name */
            public ArrayList<g3> f3595c;

            /* renamed from: d  reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, g3> f3596d;

            public a(@d.o0 b bVar) {
                super(bVar.getDispatchMode());
                this.f3596d = new HashMap<>();
                this.f3593a = bVar;
            }

            @d.o0
            public final g3 a(@d.o0 WindowInsetsAnimation windowInsetsAnimation) {
                g3 g3Var = this.f3596d.get(windowInsetsAnimation);
                if (g3Var == null) {
                    g3 j7 = g3.j(windowInsetsAnimation);
                    this.f3596d.put(windowInsetsAnimation, j7);
                    return j7;
                }
                return g3Var;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(@d.o0 WindowInsetsAnimation windowInsetsAnimation) {
                this.f3593a.onEnd(a(windowInsetsAnimation));
                this.f3596d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(@d.o0 WindowInsetsAnimation windowInsetsAnimation) {
                this.f3593a.onPrepare(a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @d.o0
            public WindowInsets onProgress(@d.o0 WindowInsets windowInsets, @d.o0 List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<g3> arrayList = this.f3595c;
                if (arrayList == null) {
                    ArrayList<g3> arrayList2 = new ArrayList<>(list.size());
                    this.f3595c = arrayList2;
                    this.f3594b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a7 = u3.a(list.get(size));
                    g3 a8 = a(a7);
                    fraction = a7.getFraction();
                    a8.i(fraction);
                    this.f3595c.add(a8);
                }
                return this.f3593a.onProgress(h4.K(windowInsets), this.f3594b).J();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @d.o0
            public WindowInsetsAnimation.Bounds onStart(@d.o0 WindowInsetsAnimation windowInsetsAnimation, @d.o0 WindowInsetsAnimation.Bounds bounds) {
                return this.f3593a.onStart(a(windowInsetsAnimation), a.e(bounds)).d();
            }
        }

        public d(@d.o0 WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f3592f = windowInsetsAnimation;
        }

        @d.o0
        public static WindowInsetsAnimation.Bounds i(@d.o0 a aVar) {
            k3.a();
            return j3.a(aVar.a().h(), aVar.b().h());
        }

        @d.o0
        public static p0.v0 j(@d.o0 WindowInsetsAnimation.Bounds bounds) {
            Insets upperBound;
            upperBound = bounds.getUpperBound();
            return p0.v0.g(upperBound);
        }

        @d.o0
        public static p0.v0 k(@d.o0 WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return p0.v0.g(lowerBound);
        }

        public static void l(@d.o0 View view, @d.q0 b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.g3.e
        public long b() {
            long durationMillis;
            durationMillis = this.f3592f.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.g3.e
        public float c() {
            float fraction;
            fraction = this.f3592f.getFraction();
            return fraction;
        }

        @Override // androidx.core.view.g3.e
        public float d() {
            float interpolatedFraction;
            interpolatedFraction = this.f3592f.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.g3.e
        @d.q0
        public Interpolator e() {
            Interpolator interpolator;
            interpolator = this.f3592f.getInterpolator();
            return interpolator;
        }

        @Override // androidx.core.view.g3.e
        public int f() {
            int typeMask;
            typeMask = this.f3592f.getTypeMask();
            return typeMask;
        }

        @Override // androidx.core.view.g3.e
        public void h(float f7) {
            this.f3592f.setFraction(f7);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(int i7, Interpolator interpolator, long j7) {
            this(t3.a(i7, interpolator, j7));
            i3.a();
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final p0.v0 f3570a;

        /* renamed from: b  reason: collision with root package name */
        public final p0.v0 f3571b;

        public a(@d.o0 p0.v0 v0Var, @d.o0 p0.v0 v0Var2) {
            this.f3570a = v0Var;
            this.f3571b = v0Var2;
        }

        @d.o0
        @d.w0(30)
        public static a e(@d.o0 WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        @d.o0
        public p0.v0 a() {
            return this.f3570a;
        }

        @d.o0
        public p0.v0 b() {
            return this.f3571b;
        }

        @d.o0
        public a c(@d.o0 p0.v0 v0Var) {
            return new a(h4.z(this.f3570a, v0Var.f14585a, v0Var.f14586b, v0Var.f14587c, v0Var.f14588d), h4.z(this.f3571b, v0Var.f14585a, v0Var.f14586b, v0Var.f14587c, v0Var.f14588d));
        }

        @d.o0
        @d.w0(30)
        public WindowInsetsAnimation.Bounds d() {
            return d.i(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f3570a + " upper=" + this.f3571b + "}";
        }

        @d.w0(30)
        public a(@d.o0 WindowInsetsAnimation.Bounds bounds) {
            this.f3570a = d.k(bounds);
            this.f3571b = d.j(bounds);
        }
    }

    @d.w0(30)
    public g3(@d.o0 WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3569a = new d(windowInsetsAnimation);
        }
    }
}
