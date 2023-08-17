package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import d.b1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class h0 extends s1 {

    /* renamed from: o  reason: collision with root package name */
    public static final String f6585o = "android:slide:screenPosition";

    /* renamed from: k  reason: collision with root package name */
    public g f6592k;

    /* renamed from: l  reason: collision with root package name */
    public int f6593l;

    /* renamed from: m  reason: collision with root package name */
    public static final TimeInterpolator f6583m = new DecelerateInterpolator();

    /* renamed from: n  reason: collision with root package name */
    public static final TimeInterpolator f6584n = new AccelerateInterpolator();

    /* renamed from: p  reason: collision with root package name */
    public static final g f6586p = new a();

    /* renamed from: q  reason: collision with root package name */
    public static final g f6587q = new b();

    /* renamed from: r  reason: collision with root package name */
    public static final g f6588r = new c();

    /* renamed from: s  reason: collision with root package name */
    public static final g f6589s = new d();

    /* renamed from: t  reason: collision with root package name */
    public static final g f6590t = new e();

    /* renamed from: u  reason: collision with root package name */
    public static final g f6591u = new f();

    /* loaded from: classes.dex */
    public class a extends h {
        public a() {
            super(null);
        }

        @Override // androidx.transition.h0.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    public class b extends h {
        public b() {
            super(null);
        }

        @Override // androidx.transition.h0.g
        public float b(ViewGroup viewGroup, View view) {
            return androidx.core.view.u1.Z(viewGroup) == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    public class c extends i {
        public c() {
            super(null);
        }

        @Override // androidx.transition.h0.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public class d extends h {
        public d() {
            super(null);
        }

        @Override // androidx.transition.h0.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    public class e extends h {
        public e() {
            super(null);
        }

        @Override // androidx.transition.h0.g
        public float b(ViewGroup viewGroup, View view) {
            return androidx.core.view.u1.Z(viewGroup) == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    public class f extends i {
        public f() {
            super(null);
        }

        @Override // androidx.transition.h0.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* loaded from: classes.dex */
    public static abstract class h implements g {
        public h() {
        }

        @Override // androidx.transition.h0.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i implements g {
        public i() {
        }

        @Override // androidx.transition.h0.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface j {
    }

    public h0() {
        this.f6592k = f6591u;
        this.f6593l = 80;
        B(80);
    }

    private void captureValues(r0 r0Var) {
        int[] iArr = new int[2];
        r0Var.f6757b.getLocationOnScreen(iArr);
        r0Var.f6756a.put(f6585o, iArr);
    }

    public int A() {
        return this.f6593l;
    }

    public void B(int i7) {
        if (i7 == 3) {
            this.f6592k = f6586p;
        } else if (i7 == 5) {
            this.f6592k = f6589s;
        } else if (i7 == 48) {
            this.f6592k = f6588r;
        } else if (i7 == 80) {
            this.f6592k = f6591u;
        } else if (i7 == 8388611) {
            this.f6592k = f6587q;
        } else if (i7 != 8388613) {
            throw new IllegalArgumentException("Invalid slide direction");
        } else {
            this.f6592k = f6590t;
        }
        this.f6593l = i7;
        g0 g0Var = new g0();
        g0Var.k(i7);
        setPropagation(g0Var);
    }

    @Override // androidx.transition.s1, androidx.transition.j0
    public void captureEndValues(@d.o0 r0 r0Var) {
        super.captureEndValues(r0Var);
        captureValues(r0Var);
    }

    @Override // androidx.transition.s1, androidx.transition.j0
    public void captureStartValues(@d.o0 r0 r0Var) {
        super.captureStartValues(r0Var);
        captureValues(r0Var);
    }

    @Override // androidx.transition.s1
    @d.q0
    public Animator onAppear(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        if (r0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) r0Var2.f6756a.get(f6585o);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return t0.a(view, r0Var2, iArr[0], iArr[1], this.f6592k.b(viewGroup, view), this.f6592k.a(viewGroup, view), translationX, translationY, f6583m, this);
    }

    @Override // androidx.transition.s1
    @d.q0
    public Animator onDisappear(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        if (r0Var == null) {
            return null;
        }
        int[] iArr = (int[]) r0Var.f6756a.get(f6585o);
        return t0.a(view, r0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f6592k.b(viewGroup, view), this.f6592k.a(viewGroup, view), f6584n, this);
    }

    public h0(int i7) {
        this.f6592k = f6591u;
        this.f6593l = 80;
        B(i7);
    }

    @SuppressLint({"RestrictedApi"})
    public h0(@d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6592k = f6591u;
        this.f6593l = 80;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f6608h);
        int k7 = m0.p.k(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        B(k7);
    }
}
