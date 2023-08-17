package s1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.g0;
import androidx.core.view.h4;
import androidx.core.view.m0;
import androidx.core.view.u1;
import androidx.customview.widget.d;
import d.b1;
import d.l;
import d.o0;
import d.v;
import h1.f0;
import h1.q0;
import java.util.ArrayList;
import java.util.List;
import p0.v0;
import r1.a;
/* loaded from: classes.dex */
public class a extends ViewGroup implements androidx.customview.widget.c {
    public static final String M = "DrawerLayout";
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 0;
    public static final int S = 1;
    public static final int T = 2;
    public static final int U = 3;
    public static final int V = 64;
    public static final int W = -1728053248;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f16195a0 = 160;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f16196b0 = 400;

    /* renamed from: c0  reason: collision with root package name */
    public static final boolean f16197c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public static final boolean f16198d0 = true;

    /* renamed from: e0  reason: collision with root package name */
    public static final float f16199e0 = 1.0f;

    /* renamed from: g0  reason: collision with root package name */
    public static final boolean f16201g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final boolean f16202h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final String f16203i0 = "androidx.drawerlayout.widget.DrawerLayout";

    /* renamed from: j0  reason: collision with root package name */
    public static boolean f16204j0;
    public CharSequence A;
    public CharSequence B;
    public Object C;
    public boolean D;
    public Drawable E;
    public Drawable F;
    public Drawable G;
    public Drawable H;
    public final ArrayList<View> I;
    public Rect J;
    public Matrix K;
    public final q0 L;

    /* renamed from: b  reason: collision with root package name */
    public final d f16205b;

    /* renamed from: c  reason: collision with root package name */
    public float f16206c;

    /* renamed from: d  reason: collision with root package name */
    public int f16207d;

    /* renamed from: e  reason: collision with root package name */
    public int f16208e;

    /* renamed from: f  reason: collision with root package name */
    public float f16209f;

    /* renamed from: g  reason: collision with root package name */
    public Paint f16210g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.customview.widget.d f16211h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.customview.widget.d f16212i;

    /* renamed from: j  reason: collision with root package name */
    public final i f16213j;

    /* renamed from: k  reason: collision with root package name */
    public final i f16214k;

    /* renamed from: l  reason: collision with root package name */
    public int f16215l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16216m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16217n;

    /* renamed from: o  reason: collision with root package name */
    public int f16218o;

    /* renamed from: p  reason: collision with root package name */
    public int f16219p;

    /* renamed from: q  reason: collision with root package name */
    public int f16220q;

    /* renamed from: r  reason: collision with root package name */
    public int f16221r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f16222s;
    @d.q0

    /* renamed from: t  reason: collision with root package name */
    public e f16223t;

    /* renamed from: u  reason: collision with root package name */
    public List<e> f16224u;

    /* renamed from: v  reason: collision with root package name */
    public float f16225v;

    /* renamed from: w  reason: collision with root package name */
    public float f16226w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f16227x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f16228y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f16229z;
    public static final int[] N = {16843828};

    /* renamed from: f0  reason: collision with root package name */
    public static final int[] f16200f0 = {16842931};

    /* renamed from: s1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0238a implements q0 {
        public C0238a() {
        }

        @Override // h1.q0
        public boolean perform(@o0 View view, @d.q0 q0.a aVar) {
            if (!a.this.D(view) || a.this.r(view) == 2) {
                return false;
            }
            a.this.f(view);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnApplyWindowInsetsListener {
        public b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((a) view).S(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* loaded from: classes.dex */
    public class c extends androidx.core.view.a {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f16232a = new Rect();

        public c() {
        }

        public final void c(f0 f0Var, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (a.A(childAt)) {
                    f0Var.c(childAt);
                }
            }
        }

        public final void d(f0 f0Var, f0 f0Var2) {
            Rect rect = this.f16232a;
            f0Var2.t(rect);
            f0Var.X0(rect);
            f0Var.e2(f0Var2.G0());
            f0Var.D1(f0Var2.P());
            f0Var.b1(f0Var2.w());
            f0Var.f1(f0Var2.A());
            f0Var.l1(f0Var2.s0());
            f0Var.o1(f0Var2.u0());
            f0Var.T0(f0Var2.k0());
            f0Var.N1(f0Var2.C0());
            f0Var.a(f0Var2.p());
        }

        @Override // androidx.core.view.a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View p6 = a.this.p();
                if (p6 != null) {
                    CharSequence s6 = a.this.s(a.this.t(p6));
                    if (s6 != null) {
                        text.add(s6);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(a.f16203i0);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, f0 f0Var) {
            if (a.f16201g0) {
                super.onInitializeAccessibilityNodeInfo(view, f0Var);
            } else {
                f0 K0 = f0.K0(f0Var);
                super.onInitializeAccessibilityNodeInfo(view, K0);
                f0Var.P1(view);
                ViewParent l02 = u1.l0(view);
                if (l02 instanceof View) {
                    f0Var.F1((View) l02);
                }
                d(f0Var, K0);
                K0.N0();
                c(f0Var, (ViewGroup) view);
            }
            f0Var.b1(a.f16203i0);
            f0Var.n1(false);
            f0Var.o1(false);
            f0Var.P0(f0.a.f10208f);
            f0Var.P0(f0.a.f10209g);
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (a.f16201g0 || a.A(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends androidx.core.view.a {
        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, f0 f0Var) {
            super.onInitializeAccessibilityNodeInfo(view, f0Var);
            if (a.A(view)) {
                return;
            }
            f0Var.F1(null);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(int i7);

        void b(@o0 View view, float f7);

        void c(@o0 View view);

        void d(@o0 View view);
    }

    /* loaded from: classes.dex */
    public static abstract class h implements e {
        @Override // s1.a.e
        public void a(int i7) {
        }

        @Override // s1.a.e
        public void b(View view, float f7) {
        }

        @Override // s1.a.e
        public void c(View view) {
        }

        @Override // s1.a.e
        public void d(View view) {
        }
    }

    /* loaded from: classes.dex */
    public class i extends d.c {

        /* renamed from: a  reason: collision with root package name */
        public final int f16246a;

        /* renamed from: b  reason: collision with root package name */
        public androidx.customview.widget.d f16247b;

        /* renamed from: c  reason: collision with root package name */
        public final Runnable f16248c = new RunnableC0240a();

        /* renamed from: s1.a$i$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0240a implements Runnable {
            public RunnableC0240a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.b();
            }
        }

        public i(int i7) {
            this.f16246a = i7;
        }

        public final void a() {
            View n7 = a.this.n(this.f16246a == 3 ? 5 : 3);
            if (n7 != null) {
                a.this.f(n7);
            }
        }

        public void b() {
            View n7;
            int width;
            int B = this.f16247b.B();
            boolean z6 = this.f16246a == 3;
            if (z6) {
                n7 = a.this.n(3);
                width = (n7 != null ? -n7.getWidth() : 0) + B;
            } else {
                n7 = a.this.n(5);
                width = a.this.getWidth() - B;
            }
            if (n7 != null) {
                if (((!z6 || n7.getLeft() >= width) && (z6 || n7.getLeft() <= width)) || a.this.r(n7) != 0) {
                    return;
                }
                f fVar = (f) n7.getLayoutParams();
                this.f16247b.X(n7, width, n7.getTop());
                fVar.f16239c = true;
                a.this.invalidate();
                a();
                a.this.b();
            }
        }

        public void c() {
            a.this.removeCallbacks(this.f16248c);
        }

        @Override // androidx.customview.widget.d.c
        public int clampViewPositionHorizontal(View view, int i7, int i8) {
            if (a.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i7, 0));
            }
            int width = a.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i7, width));
        }

        @Override // androidx.customview.widget.d.c
        public int clampViewPositionVertical(View view, int i7, int i8) {
            return view.getTop();
        }

        public void d(androidx.customview.widget.d dVar) {
            this.f16247b = dVar;
        }

        @Override // androidx.customview.widget.d.c
        public int getViewHorizontalDragRange(View view) {
            if (a.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.d.c
        public void onEdgeDragStarted(int i7, int i8) {
            View n7 = (i7 & 1) == 1 ? a.this.n(3) : a.this.n(5);
            if (n7 == null || a.this.r(n7) != 0) {
                return;
            }
            this.f16247b.d(n7, i8);
        }

        @Override // androidx.customview.widget.d.c
        public boolean onEdgeLock(int i7) {
            return false;
        }

        @Override // androidx.customview.widget.d.c
        public void onEdgeTouched(int i7, int i8) {
            a.this.postDelayed(this.f16248c, 160L);
        }

        @Override // androidx.customview.widget.d.c
        public void onViewCaptured(View view, int i7) {
            ((f) view.getLayoutParams()).f16239c = false;
            a();
        }

        @Override // androidx.customview.widget.d.c
        public void onViewDragStateChanged(int i7) {
            a.this.b0(i7, this.f16247b.z());
        }

        @Override // androidx.customview.widget.d.c
        public void onViewPositionChanged(View view, int i7, int i8, int i9, int i10) {
            float width = (a.this.c(view, 3) ? i7 + r3 : a.this.getWidth() - i7) / view.getWidth();
            a.this.Y(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            a.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public void onViewReleased(View view, float f7, float f8) {
            int i7;
            float u6 = a.this.u(view);
            int width = view.getWidth();
            if (a.this.c(view, 3)) {
                int i8 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                i7 = (i8 > 0 || (i8 == 0 && u6 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = a.this.getWidth();
                if (f7 < 0.0f || (f7 == 0.0f && u6 > 0.5f)) {
                    width2 -= width;
                }
                i7 = width2;
            }
            this.f16247b.V(i7, view.getTop());
            a.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public boolean tryCaptureView(View view, int i7) {
            return a.this.E(view) && a.this.c(view, this.f16246a) && a.this.r(view) == 0;
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        f16201g0 = true;
        f16202h0 = true;
        f16204j0 = i7 >= 29;
    }

    public a(@o0 Context context) {
        this(context, null);
    }

    public static boolean A(View view) {
        return (u1.V(view) == 4 || u1.V(view) == 2) ? false : true;
    }

    public static String w(int i7) {
        return (i7 & 3) == 3 ? "LEFT" : (i7 & 5) == 5 ? "RIGHT" : Integer.toHexString(i7);
    }

    public static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public boolean B(View view) {
        return ((f) view.getLayoutParams()).f16237a == 0;
    }

    public boolean C(int i7) {
        View n7 = n(i7);
        if (n7 != null) {
            return D(n7);
        }
        return false;
    }

    public boolean D(@o0 View view) {
        if (E(view)) {
            return (((f) view.getLayoutParams()).f16240d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean E(View view) {
        int d7 = m0.d(((f) view.getLayoutParams()).f16237a, u1.Z(view));
        return ((d7 & 3) == 0 && (d7 & 5) == 0) ? false : true;
    }

    public boolean F(int i7) {
        View n7 = n(i7);
        if (n7 != null) {
            return G(n7);
        }
        return false;
    }

    public boolean G(@o0 View view) {
        if (E(view)) {
            return ((f) view.getLayoutParams()).f16238b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean H(float f7, float f8, View view) {
        if (this.J == null) {
            this.J = new Rect();
        }
        view.getHitRect(this.J);
        return this.J.contains((int) f7, (int) f8);
    }

    public final void I(Drawable drawable, int i7) {
        if (drawable == null || !q0.c.h(drawable)) {
            return;
        }
        q0.c.m(drawable, i7);
    }

    public void J(View view, float f7) {
        float u6 = u(view);
        float width = view.getWidth();
        int i7 = ((int) (width * f7)) - ((int) (u6 * width));
        if (!c(view, 3)) {
            i7 = -i7;
        }
        view.offsetLeftAndRight(i7);
        Y(view, f7);
    }

    public void K(int i7) {
        L(i7, true);
    }

    public void L(int i7, boolean z6) {
        View n7 = n(i7);
        if (n7 != null) {
            N(n7, z6);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i7));
    }

    public void M(@o0 View view) {
        N(view, true);
    }

    public void N(@o0 View view, boolean z6) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f16217n) {
            fVar.f16238b = 1.0f;
            fVar.f16240d = 1;
            a0(view, true);
            Z(view);
        } else if (z6) {
            fVar.f16240d |= 2;
            if (c(view, 3)) {
                this.f16211h.X(view, 0, view.getTop());
            } else {
                this.f16212i.X(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            J(view, 1.0f);
            b0(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void O(@o0 e eVar) {
        List<e> list;
        if (eVar == null || (list = this.f16224u) == null) {
            return;
        }
        list.remove(eVar);
    }

    public final Drawable P() {
        int Z = u1.Z(this);
        if (Z == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                I(drawable, Z);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                I(drawable2, Z);
                return this.F;
            }
        }
        return this.G;
    }

    public final Drawable Q() {
        int Z = u1.Z(this);
        if (Z == 0) {
            Drawable drawable = this.F;
            if (drawable != null) {
                I(drawable, Z);
                return this.F;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                I(drawable2, Z);
                return this.E;
            }
        }
        return this.H;
    }

    public final void R() {
        if (f16202h0) {
            return;
        }
        this.f16228y = P();
        this.f16229z = Q();
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void S(Object obj, boolean z6) {
        this.C = obj;
        this.D = z6;
        setWillNotDraw(!z6 && getBackground() == null);
        requestLayout();
    }

    public void T(int i7, int i8) {
        View n7;
        int d7 = m0.d(i8, u1.Z(this));
        if (i8 == 3) {
            this.f16218o = i7;
        } else if (i8 == 5) {
            this.f16219p = i7;
        } else if (i8 == 8388611) {
            this.f16220q = i7;
        } else if (i8 == 8388613) {
            this.f16221r = i7;
        }
        if (i7 != 0) {
            (d7 == 3 ? this.f16211h : this.f16212i).c();
        }
        if (i7 != 1) {
            if (i7 == 2 && (n7 = n(d7)) != null) {
                M(n7);
                return;
            }
            return;
        }
        View n8 = n(d7);
        if (n8 != null) {
            f(n8);
        }
    }

    public void U(int i7, @o0 View view) {
        if (E(view)) {
            T(i7, ((f) view.getLayoutParams()).f16237a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void V(@v int i7, int i8) {
        W(k0.d.i(getContext(), i7), i8);
    }

    public void W(Drawable drawable, int i7) {
        if (f16202h0) {
            return;
        }
        if ((i7 & m0.f3714b) == 8388611) {
            this.E = drawable;
        } else if ((i7 & 8388613) == 8388613) {
            this.F = drawable;
        } else if ((i7 & 3) == 3) {
            this.G = drawable;
        } else if ((i7 & 5) != 5) {
            return;
        } else {
            this.H = drawable;
        }
        R();
        invalidate();
    }

    public void X(int i7, @d.q0 CharSequence charSequence) {
        int d7 = m0.d(i7, u1.Z(this));
        if (d7 == 3) {
            this.A = charSequence;
        } else if (d7 == 5) {
            this.B = charSequence;
        }
    }

    public void Y(View view, float f7) {
        f fVar = (f) view.getLayoutParams();
        if (f7 == fVar.f16238b) {
            return;
        }
        fVar.f16238b = f7;
        l(view, f7);
    }

    public final void Z(View view) {
        f0.a aVar = f0.a.f10228z;
        u1.r1(view, aVar.b());
        if (!D(view) || r(view) == 2) {
            return;
        }
        u1.u1(view, aVar, null, this.L);
    }

    public void a(@o0 e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f16224u == null) {
            this.f16224u = new ArrayList();
        }
        this.f16224u.add(eVar);
    }

    public final void a0(View view, boolean z6) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((z6 || E(childAt)) && !(z6 && childAt == view)) {
                u1.R1(childAt, 4);
            } else {
                u1.R1(childAt, 1);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i7, int i8) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (!E(childAt)) {
                this.I.add(childAt);
            } else if (D(childAt)) {
                childAt.addFocusables(arrayList, i7, i8);
                z6 = true;
            }
        }
        if (!z6) {
            int size = this.I.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.I.get(i10);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i7, i8);
                }
            }
        }
        this.I.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (o() != null || E(view)) {
            u1.R1(view, 4);
        } else {
            u1.R1(view, 1);
        }
        if (f16201g0) {
            return;
        }
        u1.B1(view, this.f16205b);
    }

    public void b() {
        if (this.f16222s) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.f16222s = true;
    }

    public void b0(int i7, View view) {
        int i8;
        int F = this.f16211h.F();
        int F2 = this.f16212i.F();
        if (F == 1 || F2 == 1) {
            i8 = 1;
        } else {
            i8 = 2;
            if (F != 2 && F2 != 2) {
                i8 = 0;
            }
        }
        if (view != null && i7 == 0) {
            float f7 = ((f) view.getLayoutParams()).f16238b;
            if (f7 == 0.0f) {
                j(view);
            } else if (f7 == 1.0f) {
                k(view);
            }
        }
        if (i8 != this.f16215l) {
            this.f16215l = i8;
            List<e> list = this.f16224u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f16224u.get(size).a(i8);
                }
            }
        }
    }

    public boolean c(View view, int i7) {
        return (t(view) & i7) == i7;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.c
    public void close() {
        d(m0.f3714b);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f7 = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            f7 = Math.max(f7, ((f) getChildAt(i7).getLayoutParams()).f16238b);
        }
        this.f16209f = f7;
        boolean o6 = this.f16211h.o(true);
        boolean o7 = this.f16212i.o(true);
        if (o6 || o7) {
            u1.n1(this);
        }
    }

    public void d(int i7) {
        e(i7, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f16209f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            for (int i7 = childCount - 1; i7 >= 0; i7--) {
                View childAt = getChildAt(i7);
                if (H(x6, y6, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j7) {
        int height = getHeight();
        boolean B = B(view);
        int width = getWidth();
        int save = canvas.save();
        int i7 = 0;
        if (B) {
            int childCount = getChildCount();
            int i8 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i8) {
                            i8 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i8, 0, width, getHeight());
            i7 = i8;
        }
        boolean drawChild = super.drawChild(canvas, view, j7);
        canvas.restoreToCount(save);
        float f7 = this.f16209f;
        if (f7 > 0.0f && B) {
            this.f16210g.setColor((this.f16208e & u1.f3815s) | (((int) ((((-16777216) & r2) >>> 24) * f7)) << 24));
            canvas.drawRect(i7, 0.0f, width, getHeight(), this.f16210g);
        } else if (this.f16228y != null && c(view, 3)) {
            int intrinsicWidth = this.f16228y.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f16211h.B(), 1.0f));
            this.f16228y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f16228y.setAlpha((int) (max * 255.0f));
            this.f16228y.draw(canvas);
        } else if (this.f16229z != null && c(view, 5)) {
            int intrinsicWidth2 = this.f16229z.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f16212i.B(), 1.0f));
            this.f16229z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f16229z.setAlpha((int) (max2 * 255.0f));
            this.f16229z.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i7, boolean z6) {
        View n7 = n(i7);
        if (n7 != null) {
            g(n7, z6);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i7));
    }

    public void f(@o0 View view) {
        g(view, true);
    }

    public void g(@o0 View view, boolean z6) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f16217n) {
            fVar.f16238b = 0.0f;
            fVar.f16240d = 0;
        } else if (z6) {
            fVar.f16240d |= 4;
            if (c(view, 3)) {
                this.f16211h.X(view, -view.getWidth(), view.getTop());
            } else {
                this.f16212i.X(view, getWidth(), view.getTop());
            }
        } else {
            J(view, 0.0f);
            b0(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (f16202h0) {
            return this.f16206c;
        }
        return 0.0f;
    }

    @d.q0
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f16227x;
    }

    public void h() {
        i(false);
    }

    public void i(boolean z6) {
        int childCount = getChildCount();
        boolean z7 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            f fVar = (f) childAt.getLayoutParams();
            if (E(childAt) && (!z6 || fVar.f16239c)) {
                z7 |= c(childAt, 3) ? this.f16211h.X(childAt, -childAt.getWidth(), childAt.getTop()) : this.f16212i.X(childAt, getWidth(), childAt.getTop());
                fVar.f16239c = false;
            }
        }
        this.f16213j.c();
        this.f16214k.c();
        if (z7) {
            invalidate();
        }
    }

    @Override // androidx.customview.widget.c
    public boolean isOpen() {
        return C(m0.f3714b);
    }

    public void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f16240d & 1) == 1) {
            fVar.f16240d = 0;
            List<e> list = this.f16224u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f16224u.get(size).d(view);
                }
            }
            a0(view, false);
            Z(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    public void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f16240d & 1) == 0) {
            fVar.f16240d = 1;
            List<e> list = this.f16224u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f16224u.get(size).c(view);
                }
            }
            a0(view, true);
            Z(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void l(View view, float f7) {
        List<e> list = this.f16224u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f16224u.get(size).b(view, f7);
            }
        }
    }

    public final boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v6 = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v6);
            v6.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    public View n(int i7) {
        int d7 = m0.d(i7, u1.Z(this)) & 7;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if ((t(childAt) & 7) == d7) {
                return childAt;
            }
        }
        return null;
    }

    public View o() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((((f) childAt.getLayoutParams()).f16240d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16217n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16217n = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.D || this.f16227x == null) {
            return;
        }
        Object obj = this.C;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f16227x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f16227x.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L13;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            androidx.customview.widget.d r1 = r6.f16211h
            boolean r1 = r1.W(r7)
            androidx.customview.widget.d r2 = r6.f16212i
            boolean r2 = r2.W(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            androidx.customview.widget.d r7 = r6.f16211h
            boolean r7 = r7.f(r4)
            if (r7 == 0) goto L36
            s1.a$i r7 = r6.f16213j
            r7.c()
            s1.a$i r7 = r6.f16214k
            r7.c()
            goto L36
        L31:
            r6.i(r2)
            r6.f16222s = r3
        L36:
            r7 = r3
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f16225v = r0
            r6.f16226w = r7
            float r4 = r6.f16209f
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            androidx.customview.widget.d r4 = r6.f16211h
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.v(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L5d
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r6.f16222s = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.y()
            if (r7 != 0) goto L70
            boolean r7 = r6.f16222s
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.a.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 == 4 && z()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (i7 == 4) {
            View p6 = p();
            if (p6 != null && r(p6) == 0) {
                h();
            }
            return p6 != null;
        }
        return super.onKeyUp(i7, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        WindowInsets rootWindowInsets;
        float f7;
        int i11;
        boolean z7 = true;
        this.f16216m = true;
        int i12 = i9 - i7;
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i14 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i14, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i14, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f8 = measuredWidth;
                        i11 = (-measuredWidth) + ((int) (fVar.f16238b * f8));
                        f7 = (measuredWidth + i11) / f8;
                    } else {
                        float f9 = measuredWidth;
                        f7 = (i12 - r11) / f9;
                        i11 = i12 - ((int) (fVar.f16238b * f9));
                    }
                    boolean z8 = f7 != fVar.f16238b ? z7 : false;
                    int i15 = fVar.f16237a & g0.f1602o;
                    if (i15 == 16) {
                        int i16 = i10 - i8;
                        int i17 = (i16 - measuredHeight) / 2;
                        int i18 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i17 < i18) {
                            i17 = i18;
                        } else {
                            int i19 = i17 + measuredHeight;
                            int i20 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i19 > i16 - i20) {
                                i17 = (i16 - i20) - measuredHeight;
                            }
                        }
                        childAt.layout(i11, i17, measuredWidth + i11, measuredHeight + i17);
                    } else if (i15 != 80) {
                        int i21 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        childAt.layout(i11, i21, measuredWidth + i11, measuredHeight + i21);
                    } else {
                        int i22 = i10 - i8;
                        childAt.layout(i11, (i22 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i11, i22 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    }
                    if (z8) {
                        Y(childAt, f7);
                    }
                    int i23 = fVar.f16238b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i23) {
                        childAt.setVisibility(i23);
                    }
                }
            }
            i13++;
            z7 = true;
        }
        if (f16204j0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            v0 n7 = h4.K(rootWindowInsets).n();
            androidx.customview.widget.d dVar = this.f16211h;
            dVar.S(Math.max(dVar.A(), n7.f14585a));
            androidx.customview.widget.d dVar2 = this.f16212i;
            dVar2.S(Math.max(dVar2.A(), n7.f14587c));
        }
        this.f16216m = false;
        this.f16217n = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z6 = this.C != null && u1.U(this);
        int Z = u1.Z(this);
        int childCount = getChildCount();
        boolean z7 = false;
        boolean z8 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z6) {
                    int d7 = m0.d(fVar.f16237a, Z);
                    if (u1.U(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.C;
                        if (d7 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (d7 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.C;
                        if (d7 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (d7 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else if (!E(childAt)) {
                    throw new IllegalStateException("Child " + childAt + " at index " + i9 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                } else {
                    if (f16202h0) {
                        float R2 = u1.R(childAt);
                        float f7 = this.f16206c;
                        if (R2 != f7) {
                            u1.N1(childAt, f7);
                        }
                    }
                    int t6 = t(childAt) & 7;
                    boolean z9 = t6 == 3;
                    if ((z9 && z7) || (!z9 && z8)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(t6) + " but this " + M + " already has a drawer view along that edge");
                    }
                    if (z9) {
                        z7 = true;
                    } else {
                        z8 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i7, this.f16207d + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i8, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View n7;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        int i7 = gVar.f16241k;
        if (i7 != 0 && (n7 = n(i7)) != null) {
            M(n7);
        }
        int i8 = gVar.f16242l;
        if (i8 != 3) {
            T(i8, 3);
        }
        int i9 = gVar.f16243m;
        if (i9 != 3) {
            T(i9, 5);
        }
        int i10 = gVar.f16244n;
        if (i10 != 3) {
            T(i10, m0.f3714b);
        }
        int i11 = gVar.f16245o;
        if (i11 != 3) {
            T(i11, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i7) {
        R();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            f fVar = (f) getChildAt(i7).getLayoutParams();
            int i8 = fVar.f16240d;
            boolean z6 = i8 == 1;
            boolean z7 = i8 == 2;
            if (z6 || z7) {
                gVar.f16241k = fVar.f16237a;
                break;
            }
        }
        gVar.f16242l = this.f16218o;
        gVar.f16243m = this.f16219p;
        gVar.f16244n = this.f16220q;
        gVar.f16245o = this.f16221r;
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.customview.widget.d r0 = r6.f16211h
            r0.M(r7)
            androidx.customview.widget.d r0 = r6.f16212i
            r0.M(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6d
        L1a:
            r6.i(r2)
            r6.f16222s = r1
            goto L6d
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            androidx.customview.widget.d r3 = r6.f16211h
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.v(r4, r5)
            if (r3 == 0) goto L5a
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L5a
            float r3 = r6.f16225v
            float r0 = r0 - r3
            float r3 = r6.f16226w
            float r7 = r7 - r3
            androidx.customview.widget.d r3 = r6.f16211h
            int r3 = r3.E()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5a
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L5a
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L5b
        L5a:
            r1 = r2
        L5b:
            r6.i(r1)
            goto L6d
        L5f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f16225v = r0
            r6.f16226w = r7
            r6.f16222s = r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.customview.widget.c
    public void open() {
        K(m0.f3714b);
    }

    public View p() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i7) {
        int Z = u1.Z(this);
        if (i7 == 3) {
            int i8 = this.f16218o;
            if (i8 != 3) {
                return i8;
            }
            int i9 = Z == 0 ? this.f16220q : this.f16221r;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        } else if (i7 == 5) {
            int i10 = this.f16219p;
            if (i10 != 3) {
                return i10;
            }
            int i11 = Z == 0 ? this.f16221r : this.f16220q;
            if (i11 != 3) {
                return i11;
            }
            return 0;
        } else if (i7 == 8388611) {
            int i12 = this.f16220q;
            if (i12 != 3) {
                return i12;
            }
            int i13 = Z == 0 ? this.f16218o : this.f16219p;
            if (i13 != 3) {
                return i13;
            }
            return 0;
        } else if (i7 != 8388613) {
            return 0;
        } else {
            int i14 = this.f16221r;
            if (i14 != 3) {
                return i14;
            }
            int i15 = Z == 0 ? this.f16219p : this.f16218o;
            if (i15 != 3) {
                return i15;
            }
            return 0;
        }
    }

    public int r(@o0 View view) {
        if (E(view)) {
            return q(((f) view.getLayoutParams()).f16237a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (z6) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f16216m) {
            return;
        }
        super.requestLayout();
    }

    @d.q0
    public CharSequence s(int i7) {
        int d7 = m0.d(i7, u1.Z(this));
        if (d7 == 3) {
            return this.A;
        }
        if (d7 == 5) {
            return this.B;
        }
        return null;
    }

    public void setDrawerElevation(float f7) {
        this.f16206c = f7;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (E(childAt)) {
                u1.N1(childAt, this.f16206c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f16223t;
        if (eVar2 != null) {
            O(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f16223t = eVar;
    }

    public void setDrawerLockMode(int i7) {
        T(i7, 3);
        T(i7, 5);
    }

    public void setScrimColor(@l int i7) {
        this.f16208e = i7;
        invalidate();
    }

    public void setStatusBarBackground(@d.q0 Drawable drawable) {
        this.f16227x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@l int i7) {
        this.f16227x = new ColorDrawable(i7);
        invalidate();
    }

    public int t(View view) {
        return m0.d(((f) view.getLayoutParams()).f16237a, u1.Z(this));
    }

    public float u(View view) {
        return ((f) view.getLayoutParams()).f16238b;
    }

    public final MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.K == null) {
                this.K = new Matrix();
            }
            matrix.invert(this.K);
            obtain.transform(this.K);
        }
        return obtain;
    }

    public final boolean y() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (((f) getChildAt(i7).getLayoutParams()).f16239c) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        return p() != null;
    }

    public a(@o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0224a.f15454b);
    }

    public a(@o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f16205b = new d();
        this.f16208e = W;
        this.f16210g = new Paint();
        this.f16217n = true;
        this.f16218o = 3;
        this.f16219p = 3;
        this.f16220q = 3;
        this.f16221r = 3;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.L = new C0238a();
        setDescendantFocusability(262144);
        float f7 = getResources().getDisplayMetrics().density;
        this.f16207d = (int) ((64.0f * f7) + 0.5f);
        float f8 = f7 * 400.0f;
        i iVar = new i(3);
        this.f16213j = iVar;
        i iVar2 = new i(5);
        this.f16214k = iVar2;
        androidx.customview.widget.d p6 = androidx.customview.widget.d.p(this, 1.0f, iVar);
        this.f16211h = p6;
        p6.T(1);
        p6.U(f8);
        iVar.d(p6);
        androidx.customview.widget.d p7 = androidx.customview.widget.d.p(this, 1.0f, iVar2);
        this.f16212i = p7;
        p7.T(2);
        p7.U(f8);
        iVar2.d(p7);
        setFocusableInTouchMode(true);
        u1.R1(this, 1);
        u1.B1(this, new c());
        setMotionEventSplittingEnabled(false);
        if (u1.U(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(N);
            try {
                this.f16227x = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.j.f15569g, i7, 0);
        try {
            if (obtainStyledAttributes2.hasValue(a.j.f15570h)) {
                this.f16206c = obtainStyledAttributes2.getDimension(a.j.f15570h, 0.0f);
            } else {
                this.f16206c = getResources().getDimension(a.c.f15478h);
            }
            obtainStyledAttributes2.recycle();
            this.I = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i7) {
        this.f16227x = i7 != 0 ? k0.d.i(getContext(), i7) : null;
        invalidate();
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: e  reason: collision with root package name */
        public static final int f16234e = 1;

        /* renamed from: f  reason: collision with root package name */
        public static final int f16235f = 2;

        /* renamed from: g  reason: collision with root package name */
        public static final int f16236g = 4;

        /* renamed from: a  reason: collision with root package name */
        public int f16237a;

        /* renamed from: b  reason: collision with root package name */
        public float f16238b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f16239c;

        /* renamed from: d  reason: collision with root package name */
        public int f16240d;

        public f(@o0 Context context, @d.q0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16237a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f16200f0);
            this.f16237a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(int i7, int i8) {
            super(i7, i8);
            this.f16237a = 0;
        }

        public f(int i7, int i8, int i9) {
            this(i7, i8);
            this.f16237a = i9;
        }

        public f(@o0 f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f16237a = 0;
            this.f16237a = fVar.f16237a;
        }

        public f(@o0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16237a = 0;
        }

        public f(@o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f16237a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* loaded from: classes.dex */
    public static class g extends o1.a {
        public static final Parcelable.Creator<g> CREATOR = new C0239a();

        /* renamed from: k  reason: collision with root package name */
        public int f16241k;

        /* renamed from: l  reason: collision with root package name */
        public int f16242l;

        /* renamed from: m  reason: collision with root package name */
        public int f16243m;

        /* renamed from: n  reason: collision with root package name */
        public int f16244n;

        /* renamed from: o  reason: collision with root package name */
        public int f16245o;

        /* renamed from: s1.a$g$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0239a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i7) {
                return new g[i7];
            }
        }

        public g(@o0 Parcel parcel, @d.q0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16241k = 0;
            this.f16241k = parcel.readInt();
            this.f16242l = parcel.readInt();
            this.f16243m = parcel.readInt();
            this.f16244n = parcel.readInt();
            this.f16245o = parcel.readInt();
        }

        @Override // o1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f16241k);
            parcel.writeInt(this.f16242l);
            parcel.writeInt(this.f16243m);
            parcel.writeInt(this.f16244n);
            parcel.writeInt(this.f16245o);
        }

        public g(@o0 Parcelable parcelable) {
            super(parcelable);
            this.f16241k = 0;
        }
    }
}
