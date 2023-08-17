package h3;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.core.view.h4;
import androidx.core.view.u1;
import androidx.customview.widget.d;
import androidx.transition.m0;
import androidx.window.layout.l;
import androidx.window.layout.s;
import d.o0;
import d.q0;
import d.u0;
import d.v;
import h1.f0;
import h3.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p0.v0;
/* loaded from: classes.dex */
public class b extends ViewGroup implements androidx.customview.widget.c {
    public static final String C = "SlidingPaneLayout";
    public static final int D = 400;
    public static final String E = "androidx.slidingpanelayout.widget.SlidingPaneLayout";
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    public static boolean J;
    public Field A;
    public boolean B;

    /* renamed from: b  reason: collision with root package name */
    public int f10271b;

    /* renamed from: c  reason: collision with root package name */
    public int f10272c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f10273d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f10274e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10275f;

    /* renamed from: g  reason: collision with root package name */
    public View f10276g;

    /* renamed from: h  reason: collision with root package name */
    public float f10277h;

    /* renamed from: i  reason: collision with root package name */
    public float f10278i;

    /* renamed from: j  reason: collision with root package name */
    public int f10279j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10280k;

    /* renamed from: l  reason: collision with root package name */
    public int f10281l;

    /* renamed from: m  reason: collision with root package name */
    public float f10282m;

    /* renamed from: n  reason: collision with root package name */
    public float f10283n;

    /* renamed from: o  reason: collision with root package name */
    public final List<f> f10284o;
    @q0

    /* renamed from: p  reason: collision with root package name */
    public f f10285p;

    /* renamed from: q  reason: collision with root package name */
    public final androidx.customview.widget.d f10286q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f10287r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10288s;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f10289t;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<c> f10290u;

    /* renamed from: v  reason: collision with root package name */
    public int f10291v;

    /* renamed from: w  reason: collision with root package name */
    public l f10292w;

    /* renamed from: x  reason: collision with root package name */
    public a.InterfaceC0117a f10293x;

    /* renamed from: y  reason: collision with root package name */
    public h3.a f10294y;

    /* renamed from: z  reason: collision with root package name */
    public Method f10295z;

    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0117a {
        public a() {
        }

        @Override // h3.a.InterfaceC0117a
        public void a(@o0 l lVar) {
            b.this.f10292w = lVar;
            androidx.transition.g gVar = new androidx.transition.g();
            gVar.setDuration(300L);
            gVar.setInterpolator(i1.b.b(0.2f, 0.0f, 0.0f, 1.0f));
            m0.b(b.this, gVar);
            b.this.requestLayout();
        }
    }

    /* renamed from: h3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0122b extends androidx.core.view.a {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f10297a = new Rect();

        public C0122b() {
        }

        public final void c(f0 f0Var, f0 f0Var2) {
            Rect rect = this.f10297a;
            f0Var2.t(rect);
            f0Var.X0(rect);
            f0Var.e2(f0Var2.G0());
            f0Var.D1(f0Var2.P());
            f0Var.b1(f0Var2.w());
            f0Var.f1(f0Var2.A());
            f0Var.l1(f0Var2.s0());
            f0Var.c1(f0Var2.n0());
            f0Var.n1(f0Var2.t0());
            f0Var.o1(f0Var2.u0());
            f0Var.T0(f0Var2.k0());
            f0Var.N1(f0Var2.C0());
            f0Var.y1(f0Var2.x0());
            f0Var.a(f0Var2.p());
            f0Var.B1(f0Var2.N());
        }

        public boolean d(View view) {
            return b.this.m(view);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(b.E);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, f0 f0Var) {
            f0 K0 = f0.K0(f0Var);
            super.onInitializeAccessibilityNodeInfo(view, K0);
            c(f0Var, K0);
            K0.N0();
            f0Var.b1(b.E);
            f0Var.P1(view);
            ViewParent l02 = u1.l0(view);
            if (l02 instanceof View) {
                f0Var.F1((View) l02);
            }
            int childCount = b.this.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = b.this.getChildAt(i7);
                if (!d(childAt) && childAt.getVisibility() == 0) {
                    u1.R1(childAt, 1);
                    f0Var.c(childAt);
                }
            }
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (d(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final View f10299k;

        public c(View view) {
            this.f10299k = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10299k.getParent() == b.this) {
                this.f10299k.setLayerType(0, null);
                b.this.l(this.f10299k);
            }
            b.this.f10290u.remove(this);
        }
    }

    /* loaded from: classes.dex */
    public class d extends d.c {
        public d() {
        }

        public final boolean a() {
            b bVar = b.this;
            if (bVar.f10280k || bVar.getLockMode() == 3) {
                return false;
            }
            if (b.this.isOpen() && b.this.getLockMode() == 1) {
                return false;
            }
            return b.this.isOpen() || b.this.getLockMode() != 2;
        }

        @Override // androidx.customview.widget.d.c
        public int clampViewPositionHorizontal(View view, int i7, int i8) {
            e eVar = (e) b.this.f10276g.getLayoutParams();
            if (b.this.n()) {
                int width = b.this.getWidth() - ((b.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin) + b.this.f10276g.getWidth());
                return Math.max(Math.min(i7, width), width - b.this.f10279j);
            }
            int paddingLeft = b.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            return Math.min(Math.max(i7, paddingLeft), b.this.f10279j + paddingLeft);
        }

        @Override // androidx.customview.widget.d.c
        public int clampViewPositionVertical(View view, int i7, int i8) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int getViewHorizontalDragRange(View view) {
            return b.this.f10279j;
        }

        @Override // androidx.customview.widget.d.c
        public void onEdgeDragStarted(int i7, int i8) {
            if (a()) {
                b bVar = b.this;
                bVar.f10286q.d(bVar.f10276g, i8);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void onEdgeTouched(int i7, int i8) {
            if (a()) {
                b bVar = b.this;
                bVar.f10286q.d(bVar.f10276g, i8);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void onViewCaptured(View view, int i7) {
            b.this.v();
        }

        @Override // androidx.customview.widget.d.c
        public void onViewDragStateChanged(int i7) {
            if (b.this.f10286q.F() == 0) {
                b bVar = b.this;
                if (bVar.f10277h != 1.0f) {
                    bVar.g(bVar.f10276g);
                    b.this.f10287r = true;
                    return;
                }
                bVar.A(bVar.f10276g);
                b bVar2 = b.this;
                bVar2.f(bVar2.f10276g);
                b.this.f10287r = false;
            }
        }

        @Override // androidx.customview.widget.d.c
        public void onViewPositionChanged(View view, int i7, int i8, int i9, int i10) {
            b.this.q(i7);
            b.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public void onViewReleased(View view, float f7, float f8) {
            int paddingLeft;
            e eVar = (e) view.getLayoutParams();
            if (b.this.n()) {
                int paddingRight = b.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                if (f7 < 0.0f || (f7 == 0.0f && b.this.f10277h > 0.5f)) {
                    paddingRight += b.this.f10279j;
                }
                paddingLeft = (b.this.getWidth() - paddingRight) - b.this.f10276g.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + b.this.getPaddingLeft();
                int i7 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                if (i7 > 0 || (i7 == 0 && b.this.f10277h > 0.5f)) {
                    paddingLeft += b.this.f10279j;
                }
            }
            b.this.f10286q.V(paddingLeft, view.getTop());
            b.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public boolean tryCaptureView(View view, int i7) {
            if (a()) {
                return ((e) view.getLayoutParams()).f10304b;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(@o0 View view, float f7);

        void b(@o0 View view);

        void c(@o0 View view);
    }

    /* loaded from: classes.dex */
    public static class g extends o1.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public boolean f10307k;

        /* renamed from: l  reason: collision with root package name */
        public int f10308l;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i7) {
                return new g[i7];
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // o1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f10307k ? 1 : 0);
            parcel.writeInt(this.f10308l);
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10307k = parcel.readInt() != 0;
            this.f10308l = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public static class h implements f {
        @Override // h3.b.f
        public void a(@o0 View view, float f7) {
        }

        @Override // h3.b.f
        public void b(@o0 View view) {
        }

        @Override // h3.b.f
        public void c(@o0 View view) {
        }
    }

    /* loaded from: classes.dex */
    public static class i extends FrameLayout {
        public i(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        J = Build.VERSION.SDK_INT >= 29;
    }

    public b(@o0 Context context) {
        this(context, null);
    }

    public static boolean B(View view) {
        return view.isOpaque();
    }

    private v0 getSystemGestureInsets() {
        h4 o02;
        if (!J || (o02 = u1.o0(this)) == null) {
            return null;
        }
        return o02.n();
    }

    @q0
    public static Activity i(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static Rect j(@o0 l lVar, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i7 = iArr[0];
        Rect rect = new Rect(i7, iArr[1], view.getWidth() + i7, iArr[1] + view.getWidth());
        Rect rect2 = new Rect(lVar.getBounds());
        boolean intersect = rect2.intersect(rect);
        if (!(rect2.width() == 0 && rect2.height() == 0) && intersect) {
            rect2.offset(-iArr[0], -iArr[1]);
            return rect2;
        }
        return null;
    }

    public static int k(View view) {
        return view instanceof i ? u1.f0(((i) view).getChildAt(0)) : u1.f0(view);
    }

    public static int p(@o0 View view, int i7, int i8) {
        e eVar = (e) view.getLayoutParams();
        return ((ViewGroup.MarginLayoutParams) eVar).width == 0 && (eVar.f10303a > 0.0f ? 1 : (eVar.f10303a == 0.0f ? 0 : -1)) > 0 ? ViewGroup.getChildMeasureSpec(i7, i8, ((ViewGroup.MarginLayoutParams) eVar).height) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
    }

    private void setFoldingFeatureObserver(h3.a aVar) {
        this.f10294y = aVar;
        aVar.f(this.f10293x);
    }

    public void A(View view) {
        int i7;
        int i8;
        int i9;
        int i10;
        View childAt;
        boolean z6;
        View view2 = view;
        boolean n7 = n();
        int width = n7 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = n7 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !B(view)) {
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
        } else {
            i7 = view.getLeft();
            i8 = view.getRight();
            i9 = view.getTop();
            i10 = view.getBottom();
        }
        int childCount = getChildCount();
        int i11 = 0;
        while (i11 < childCount && (childAt = getChildAt(i11)) != view2) {
            if (childAt.getVisibility() == 8) {
                z6 = n7;
            } else {
                z6 = n7;
                childAt.setVisibility((Math.max(n7 ? paddingLeft : width, childAt.getLeft()) < i7 || Math.max(paddingTop, childAt.getTop()) < i9 || Math.min(n7 ? width : paddingLeft, childAt.getRight()) > i8 || Math.min(height, childAt.getBottom()) > i10) ? 0 : 4);
            }
            i11++;
            view2 = view;
            n7 = z6;
        }
    }

    public void a(@o0 f fVar) {
        this.f10284o.add(fVar);
    }

    @Override // android.view.ViewGroup
    public void addView(@o0 View view, int i7, @q0 ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new i(view), i7, layoutParams);
        } else {
            super.addView(view, i7, layoutParams);
        }
    }

    public boolean b(View view, boolean z6, int i7, int i8, int i9) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i11 = i8 + scrollX;
                if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && (i10 = i9 + scrollY) >= childAt.getTop() && i10 < childAt.getBottom() && b(childAt, true, i7, i11 - childAt.getLeft(), i10 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z6) {
            if (view.canScrollHorizontally(n() ? i7 : -i7)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean c() {
        return this.f10275f;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.c
    public void close() {
        d();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f10286q.o(true)) {
            if (this.f10275f) {
                u1.n1(this);
            } else {
                this.f10286q.a();
            }
        }
    }

    public boolean d() {
        return e(0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i7;
        int i8;
        super.draw(canvas);
        Drawable drawable = n() ? this.f10274e : this.f10273d;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (n()) {
            i8 = childAt.getRight();
            i7 = intrinsicWidth + i8;
        } else {
            int left = childAt.getLeft();
            int i9 = left - intrinsicWidth;
            i7 = left;
            i8 = i9;
        }
        drawable.setBounds(i8, top, i7, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j7) {
        if (n() ^ isOpen()) {
            this.f10286q.T(1);
            v0 systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                androidx.customview.widget.d dVar = this.f10286q;
                dVar.S(Math.max(dVar.A(), systemGestureInsets.f14585a));
            }
        } else {
            this.f10286q.T(2);
            v0 systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                androidx.customview.widget.d dVar2 = this.f10286q;
                dVar2.S(Math.max(dVar2.A(), systemGestureInsets2.f14587c));
            }
        }
        e eVar = (e) view.getLayoutParams();
        int save = canvas.save();
        if (this.f10275f && !eVar.f10304b && this.f10276g != null) {
            canvas.getClipBounds(this.f10289t);
            if (n()) {
                Rect rect = this.f10289t;
                rect.left = Math.max(rect.left, this.f10276g.getRight());
            } else {
                Rect rect2 = this.f10289t;
                rect2.right = Math.min(rect2.right, this.f10276g.getLeft());
            }
            canvas.clipRect(this.f10289t);
        }
        boolean drawChild = super.drawChild(canvas, view, j7);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final boolean e(int i7) {
        if (!this.f10275f) {
            this.f10287r = false;
        }
        if (this.f10288s || y(1.0f, i7)) {
            this.f10287r = false;
            return true;
        }
        return false;
    }

    public void f(@o0 View view) {
        Iterator<f> it = this.f10284o.iterator();
        while (it.hasNext()) {
            it.next().c(view);
        }
        sendAccessibilityEvent(32);
    }

    public void g(@o0 View view) {
        Iterator<f> it = this.f10284o.iterator();
        while (it.hasNext()) {
            it.next().b(view);
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    @d.l
    @Deprecated
    public int getCoveredFadeColor() {
        return this.f10272c;
    }

    public final int getLockMode() {
        return this.f10291v;
    }

    @u0
    public int getParallaxDistance() {
        return this.f10281l;
    }

    @d.l
    @Deprecated
    public int getSliderFadeColor() {
        return this.f10271b;
    }

    public void h(@o0 View view) {
        Iterator<f> it = this.f10284o.iterator();
        while (it.hasNext()) {
            it.next().a(view, this.f10277h);
        }
    }

    @Override // androidx.customview.widget.c
    public boolean isOpen() {
        return !this.f10275f || this.f10277h == 0.0f;
    }

    public void l(View view) {
        u1.V1(view, ((e) view.getLayoutParams()).f10306d);
    }

    public boolean m(View view) {
        if (view == null) {
            return false;
        }
        return this.f10275f && ((e) view.getLayoutParams()).f10305c && this.f10277h > 0.0f;
    }

    public boolean n() {
        return u1.Z(this) == 1;
    }

    public boolean o() {
        return this.f10275f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Activity i7;
        super.onAttachedToWindow();
        this.f10288s = true;
        if (this.f10294y == null || (i7 = i(getContext())) == null) {
            return;
        }
        this.f10294y.e(i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10288s = true;
        h3.a aVar = this.f10294y;
        if (aVar != null) {
            aVar.g();
        }
        int size = this.f10290u.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f10290u.get(i7).run();
        }
        this.f10290u.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f10275f && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f10287r = this.f10286q.L(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f10275f || (this.f10280k && actionMasked != 0)) {
            this.f10286q.c();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f10286q.c();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f10280k = false;
                float x6 = motionEvent.getX();
                float y6 = motionEvent.getY();
                this.f10282m = x6;
                this.f10283n = y6;
                if (this.f10286q.L(this.f10276g, (int) x6, (int) y6) && m(this.f10276g)) {
                    z6 = true;
                    return this.f10286q.W(motionEvent) || z6;
                }
            } else if (actionMasked == 2) {
                float x7 = motionEvent.getX();
                float y7 = motionEvent.getY();
                float abs = Math.abs(x7 - this.f10282m);
                float abs2 = Math.abs(y7 - this.f10283n);
                if (abs > this.f10286q.E() && abs2 > abs) {
                    this.f10286q.c();
                    this.f10280k = true;
                    return false;
                }
            }
            z6 = false;
            if (this.f10286q.W(motionEvent)) {
                return true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean n7 = n();
        int i16 = i9 - i7;
        int paddingRight = n7 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = n7 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f10288s) {
            this.f10277h = (this.f10275f && this.f10287r) ? 0.0f : 1.0f;
        }
        int i17 = paddingRight;
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                i11 = i17;
            } else {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (eVar.f10304b) {
                    int i19 = i16 - paddingLeft;
                    int min = (Math.min(paddingRight, i19) - i17) - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    this.f10279j = min;
                    int i20 = n7 ? ((ViewGroup.MarginLayoutParams) eVar).rightMargin : ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    eVar.f10305c = ((i17 + i20) + min) + (measuredWidth / 2) > i19;
                    int i21 = (int) (min * this.f10277h);
                    this.f10277h = i21 / min;
                    i11 = i17 + i20 + i21;
                    i12 = 0;
                } else if (!this.f10275f || (i13 = this.f10281l) == 0) {
                    i11 = paddingRight;
                    i12 = 0;
                } else {
                    i12 = (int) ((1.0f - this.f10277h) * i13);
                    i11 = paddingRight;
                }
                if (n7) {
                    i15 = (i16 - i11) + i12;
                    i14 = i15 - measuredWidth;
                } else {
                    i14 = i11 - i12;
                    i15 = i14 + measuredWidth;
                }
                childAt.layout(i14, paddingTop, i15, childAt.getMeasuredHeight() + paddingTop);
                l lVar = this.f10292w;
                paddingRight += childAt.getWidth() + Math.abs((lVar != null && lVar.a() == l.b.f7070c && this.f10292w.b()) ? this.f10292w.getBounds().width() : 0);
            }
            i18++;
            i17 = i11;
        }
        if (this.f10288s) {
            if (this.f10275f && this.f10281l != 0) {
                t(this.f10277h);
            }
            A(this.f10276g);
        }
        this.f10288s = false;
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        int paddingTop;
        int i9;
        int i10;
        int i11;
        int i12;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        ?? r8 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            i9 = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = i9;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i9 = 0;
        }
        int max = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e(C, "onMeasure: More than two child views are not supported.");
        }
        this.f10276g = null;
        int i13 = 0;
        boolean z6 = false;
        int i14 = max;
        float f7 = 0.0f;
        while (true) {
            i10 = 8;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            e eVar = (e) childAt.getLayoutParams();
            int i15 = size;
            if (childAt.getVisibility() == 8) {
                eVar.f10305c = r8;
            } else {
                float f8 = eVar.f10303a;
                if (f8 > 0.0f) {
                    f7 += f8;
                    if (((ViewGroup.MarginLayoutParams) eVar).width == 0) {
                    }
                }
                int max2 = Math.max(max - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin), (int) r8);
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).width;
                childAt.measure(i16 == -2 ? View.MeasureSpec.makeMeasureSpec(max2, mode == 0 ? mode : Integer.MIN_VALUE) : i16 == -1 ? View.MeasureSpec.makeMeasureSpec(max2, mode) : View.MeasureSpec.makeMeasureSpec(i16, 1073741824), ViewGroup.getChildMeasureSpec(i8, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) eVar).height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i9) {
                    if (mode2 == Integer.MIN_VALUE) {
                        i9 = Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        i9 = measuredHeight;
                    }
                }
                i14 -= measuredWidth;
                if (i13 != 0) {
                    boolean z7 = i14 < 0;
                    eVar.f10304b = z7;
                    z6 |= z7;
                    if (z7) {
                        this.f10276g = childAt;
                    }
                }
            }
            i13++;
            size = i15;
            r8 = 0;
        }
        int i17 = size;
        int i18 = i14;
        if (z6 || f7 > 0.0f) {
            int i19 = 0;
            while (i19 < childCount) {
                View childAt2 = getChildAt(i19);
                if (childAt2.getVisibility() != i10) {
                    e eVar2 = (e) childAt2.getLayoutParams();
                    int measuredWidth2 = ((ViewGroup.MarginLayoutParams) eVar2).width == 0 && (eVar2.f10303a > 0.0f ? 1 : (eVar2.f10303a == 0.0f ? 0 : -1)) > 0 ? 0 : childAt2.getMeasuredWidth();
                    if (z6) {
                        i11 = max - (((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
                        i12 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                    } else if (eVar2.f10303a > 0.0f) {
                        i11 = measuredWidth2 + ((int) ((eVar2.f10303a * Math.max(0, i18)) / f7));
                        i12 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                    } else {
                        i11 = measuredWidth2;
                        i12 = 0;
                    }
                    int p6 = p(childAt2, i8, getPaddingTop() + getPaddingBottom());
                    if (measuredWidth2 != i11) {
                        childAt2.measure(i12, p6);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > i9) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 != 0) {
                            }
                            i9 = measuredHeight2;
                        }
                    }
                }
                i19++;
                i10 = 8;
            }
        }
        ArrayList<Rect> z8 = z();
        if (z8 != null && !z6) {
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = z8.get(i20);
                    e eVar3 = (e) childAt3.getLayoutParams();
                    int i21 = ((ViewGroup.MarginLayoutParams) eVar3).leftMargin + ((ViewGroup.MarginLayoutParams) eVar3).rightMargin;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), makeMeasureSpec);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1 || (k(childAt3) != 0 && rect.width() < k(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(max - i21, 1073741824), makeMeasureSpec);
                        if (i20 != 0) {
                            eVar3.f10304b = true;
                            this.f10276g = childAt3;
                            z6 = true;
                        }
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), makeMeasureSpec);
                    }
                }
            }
        }
        setMeasuredDimension(i17, i9 + getPaddingTop() + getPaddingBottom());
        this.f10275f = z6;
        if (this.f10286q.F() == 0 || z6) {
            return;
        }
        this.f10286q.a();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (gVar.f10307k) {
            r();
        } else {
            d();
        }
        this.f10287r = gVar.f10307k;
        setLockMode(gVar.f10308l);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f10307k = o() ? isOpen() : this.f10287r;
        gVar.f10308l = this.f10291v;
        return gVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 != i9) {
            this.f10288s = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f10275f) {
            this.f10286q.M(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                float x6 = motionEvent.getX();
                float y6 = motionEvent.getY();
                this.f10282m = x6;
                this.f10283n = y6;
            } else if (actionMasked == 1 && m(this.f10276g)) {
                float x7 = motionEvent.getX();
                float y7 = motionEvent.getY();
                float f7 = x7 - this.f10282m;
                float f8 = y7 - this.f10283n;
                int E2 = this.f10286q.E();
                if ((f7 * f7) + (f8 * f8) < E2 * E2 && this.f10286q.L(this.f10276g, (int) x7, (int) y7)) {
                    e(0);
                }
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.customview.widget.c
    public void open() {
        r();
    }

    public void q(int i7) {
        if (this.f10276g == null) {
            this.f10277h = 0.0f;
            return;
        }
        boolean n7 = n();
        e eVar = (e) this.f10276g.getLayoutParams();
        int width = this.f10276g.getWidth();
        if (n7) {
            i7 = (getWidth() - i7) - width;
        }
        float paddingRight = (i7 - ((n7 ? getPaddingRight() : getPaddingLeft()) + (n7 ? ((ViewGroup.MarginLayoutParams) eVar).rightMargin : ((ViewGroup.MarginLayoutParams) eVar).leftMargin))) / this.f10279j;
        this.f10277h = paddingRight;
        if (this.f10281l != 0) {
            t(paddingRight);
        }
        h(this.f10276g);
    }

    public boolean r() {
        return s(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@o0 View view) {
        if (view.getParent() instanceof i) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f10275f) {
            return;
        }
        this.f10287r = view == this.f10276g;
    }

    public final boolean s(int i7) {
        if (!this.f10275f) {
            this.f10287r = true;
        }
        if (this.f10288s || y(0.0f, i7)) {
            this.f10287r = true;
            return true;
        }
        return false;
    }

    @Deprecated
    public void setCoveredFadeColor(@d.l int i7) {
        this.f10272c = i7;
    }

    public final void setLockMode(int i7) {
        this.f10291v = i7;
    }

    @Deprecated
    public void setPanelSlideListener(@q0 f fVar) {
        f fVar2 = this.f10285p;
        if (fVar2 != null) {
            u(fVar2);
        }
        if (fVar != null) {
            a(fVar);
        }
        this.f10285p = fVar;
    }

    public void setParallaxDistance(@u0 int i7) {
        this.f10281l = i7;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@q0 Drawable drawable) {
        this.f10273d = drawable;
    }

    public void setShadowDrawableRight(@q0 Drawable drawable) {
        this.f10274e = drawable;
    }

    @Deprecated
    public void setShadowResource(@v int i7) {
        setShadowDrawableLeft(getResources().getDrawable(i7));
    }

    public void setShadowResourceLeft(int i7) {
        setShadowDrawableLeft(k0.d.i(getContext(), i7));
    }

    public void setShadowResourceRight(int i7) {
        setShadowDrawableRight(k0.d.i(getContext(), i7));
    }

    @Deprecated
    public void setSliderFadeColor(@d.l int i7) {
        this.f10271b = i7;
    }

    public final void t(float f7) {
        boolean n7 = n();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != this.f10276g) {
                float f8 = 1.0f - this.f10278i;
                int i8 = this.f10281l;
                this.f10278i = f7;
                int i9 = ((int) (f8 * i8)) - ((int) ((1.0f - f7) * i8));
                if (n7) {
                    i9 = -i9;
                }
                childAt.offsetLeftAndRight(i9);
            }
        }
    }

    public void u(@o0 f fVar) {
        this.f10284o.remove(fVar);
    }

    public void v() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Deprecated
    public void w() {
        d();
    }

    @Deprecated
    public void x() {
        r();
    }

    public boolean y(float f7, int i7) {
        int paddingLeft;
        if (this.f10275f) {
            boolean n7 = n();
            e eVar = (e) this.f10276g.getLayoutParams();
            if (n7) {
                paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin) + (f7 * this.f10279j)) + this.f10276g.getWidth()));
            } else {
                paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + (f7 * this.f10279j));
            }
            androidx.customview.widget.d dVar = this.f10286q;
            View view = this.f10276g;
            if (dVar.X(view, paddingLeft, view.getTop())) {
                v();
                u1.n1(this);
                return true;
            }
            return false;
        }
        return false;
    }

    public final ArrayList<Rect> z() {
        Rect j7;
        l lVar = this.f10292w;
        if (lVar == null || !lVar.b() || this.f10292w.getBounds().left == 0 || this.f10292w.getBounds().top != 0 || (j7 = j(this.f10292w, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), j7.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList<>(Arrays.asList(rect, new Rect(Math.min(width, j7.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: e  reason: collision with root package name */
        public static final int[] f10302e = {16843137};

        /* renamed from: a  reason: collision with root package name */
        public float f10303a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10304b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10305c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f10306d;

        public e() {
            super(-1, -1);
            this.f10303a = 0.0f;
        }

        public e(int i7, int i8) {
            super(i7, i8);
            this.f10303a = 0.0f;
        }

        public e(@o0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10303a = 0.0f;
        }

        public e(@o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10303a = 0.0f;
        }

        public e(@o0 e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f10303a = 0.0f;
            this.f10303a = eVar.f10303a;
        }

        public e(@o0 Context context, @q0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10303a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10302e);
            this.f10303a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public b(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(@o0 Context context, @q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f10271b = 0;
        this.f10277h = 1.0f;
        this.f10284o = new CopyOnWriteArrayList();
        this.f10288s = true;
        this.f10289t = new Rect();
        this.f10290u = new ArrayList<>();
        this.f10293x = new a();
        float f7 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        u1.B1(this, new C0122b());
        u1.R1(this, 1);
        androidx.customview.widget.d p6 = androidx.customview.widget.d.p(this, 0.5f, new d());
        this.f10286q = p6;
        p6.U(f7 * 400.0f);
        setFoldingFeatureObserver(new h3.a(s.b(context), k0.d.l(context)));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }
}
