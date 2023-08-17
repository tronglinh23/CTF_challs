package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.n;
import androidx.core.view.h4;
import d.b1;
import f.a;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements k0, androidx.core.view.i1, androidx.core.view.g1, androidx.core.view.h1 {
    public static final String G = "ActionBarOverlayLayout";
    public static final int H = 600;
    public static final int[] I = {a.b.f8848d, 16842841};
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final AnimatorListenerAdapter C;
    public final Runnable D;
    public final Runnable E;
    public final androidx.core.view.j1 F;

    /* renamed from: b  reason: collision with root package name */
    public int f1237b;

    /* renamed from: c  reason: collision with root package name */
    public int f1238c;

    /* renamed from: d  reason: collision with root package name */
    public ContentFrameLayout f1239d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContainer f1240e;

    /* renamed from: f  reason: collision with root package name */
    public l0 f1241f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1242g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1243h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1244i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1245j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1246k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1247l;

    /* renamed from: m  reason: collision with root package name */
    public int f1248m;

    /* renamed from: n  reason: collision with root package name */
    public int f1249n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f1250o;

    /* renamed from: p  reason: collision with root package name */
    public final Rect f1251p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f1252q;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f1253r;

    /* renamed from: s  reason: collision with root package name */
    public final Rect f1254s;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f1255t;

    /* renamed from: u  reason: collision with root package name */
    public final Rect f1256u;
    @d.o0

    /* renamed from: v  reason: collision with root package name */
    public h4 f1257v;
    @d.o0

    /* renamed from: w  reason: collision with root package name */
    public h4 f1258w;
    @d.o0

    /* renamed from: x  reason: collision with root package name */
    public h4 f1259x;
    @d.o0

    /* renamed from: y  reason: collision with root package name */
    public h4 f1260y;

    /* renamed from: z  reason: collision with root package name */
    public d f1261z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.f1247l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.f1247l = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.s();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f1240e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.s();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f1240e.animate().translationY(-ActionBarOverlayLayout.this.f1240e.getHeight()).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c(int i7);

        void d();

        void e(boolean z6);

        void f();
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i7, int i8) {
            super(i7, i8);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ActionBarOverlayLayout(@d.o0 Context context) {
        this(context, null);
    }

    public final boolean A(float f7) {
        this.A.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.A.getFinalY() > this.f1240e.getHeight();
    }

    @Override // androidx.appcompat.widget.k0
    public void a(Menu menu, n.a aVar) {
        y();
        this.f1241f.a(menu, aVar);
    }

    public final void b() {
        s();
        this.E.run();
    }

    @Override // androidx.appcompat.widget.k0
    public boolean c() {
        y();
        return this.f1241f.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.k0
    public void d() {
        y();
        this.f1241f.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1242g == null || this.f1243h) {
            return;
        }
        int bottom = this.f1240e.getVisibility() == 0 ? (int) (this.f1240e.getBottom() + this.f1240e.getTranslationY() + 0.5f) : 0;
        this.f1242g.setBounds(0, bottom, getWidth(), this.f1242g.getIntrinsicHeight() + bottom);
        this.f1242g.draw(canvas);
    }

    @Override // androidx.appcompat.widget.k0
    public boolean e() {
        y();
        return this.f1241f.e();
    }

    @Override // androidx.appcompat.widget.k0
    public boolean f() {
        y();
        return this.f1241f.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(@d.o0 android.view.View r3, @d.o0 android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.g(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1240e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, androidx.core.view.i1
    public int getNestedScrollAxes() {
        return this.F.a();
    }

    @Override // androidx.appcompat.widget.k0
    public CharSequence getTitle() {
        y();
        return this.f1241f.getTitle();
    }

    @Override // androidx.appcompat.widget.k0
    public boolean h() {
        y();
        return this.f1241f.h();
    }

    @Override // androidx.appcompat.widget.k0
    public boolean i() {
        y();
        return this.f1241f.i();
    }

    @Override // androidx.appcompat.widget.k0
    public boolean j() {
        y();
        return this.f1241f.j();
    }

    @Override // androidx.appcompat.widget.k0
    public boolean k() {
        y();
        return this.f1241f.k();
    }

    @Override // androidx.appcompat.widget.k0
    public void l(SparseArray<Parcelable> sparseArray) {
        y();
        this.f1241f.E(sparseArray);
    }

    @Override // androidx.appcompat.widget.k0
    public void m(int i7) {
        y();
        if (i7 == 2) {
            this.f1241f.O();
        } else if (i7 == 5) {
            this.f1241f.Q();
        } else if (i7 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public void n() {
        y();
        this.f1241f.m();
    }

    @Override // androidx.appcompat.widget.k0
    public void o(SparseArray<Parcelable> sparseArray) {
        y();
        this.f1241f.u(sparseArray);
    }

    @Override // android.view.View
    @d.w0(21)
    public WindowInsets onApplyWindowInsets(@d.o0 WindowInsets windowInsets) {
        y();
        h4 L = h4.L(windowInsets, this);
        boolean g7 = g(this.f1240e, new Rect(L.p(), L.r(), L.q(), L.o()), true, true, false, true);
        androidx.core.view.u1.o(this, L, this.f1250o);
        Rect rect = this.f1250o;
        h4 x6 = L.x(rect.left, rect.top, rect.right, rect.bottom);
        this.f1257v = x6;
        boolean z6 = true;
        if (!this.f1258w.equals(x6)) {
            this.f1258w = this.f1257v;
            g7 = true;
        }
        if (this.f1251p.equals(this.f1250o)) {
            z6 = g7;
        } else {
            this.f1251p.set(this.f1250o);
        }
        if (z6) {
            requestLayout();
        }
        return L.a().c().b().J();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t(getContext());
        androidx.core.view.u1.v1(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        int measuredHeight;
        y();
        measureChildWithMargins(this.f1240e, i7, 0, i8, 0);
        e eVar = (e) this.f1240e.getLayoutParams();
        int max = Math.max(0, this.f1240e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f1240e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1240e.getMeasuredState());
        boolean z6 = (androidx.core.view.u1.C0(this) & 256) != 0;
        if (z6) {
            measuredHeight = this.f1237b;
            if (this.f1245j && this.f1240e.getTabContainer() != null) {
                measuredHeight += this.f1237b;
            }
        } else {
            measuredHeight = this.f1240e.getVisibility() != 8 ? this.f1240e.getMeasuredHeight() : 0;
        }
        this.f1252q.set(this.f1250o);
        h4 h4Var = this.f1257v;
        this.f1259x = h4Var;
        if (this.f1244i || z6) {
            this.f1259x = new h4.b(this.f1259x).h(p0.v0.d(h4Var.p(), this.f1259x.r() + measuredHeight, this.f1259x.q(), this.f1259x.o() + 0)).a();
        } else {
            Rect rect = this.f1252q;
            rect.top += measuredHeight;
            rect.bottom += 0;
            this.f1259x = h4Var.x(0, measuredHeight, 0, 0);
        }
        g(this.f1239d, this.f1252q, true, true, true, true);
        if (!this.f1260y.equals(this.f1259x)) {
            h4 h4Var2 = this.f1259x;
            this.f1260y = h4Var2;
            androidx.core.view.u1.p(this.f1239d, h4Var2);
        }
        measureChildWithMargins(this.f1239d, i7, 0, i8, 0);
        e eVar2 = (e) this.f1239d.getLayoutParams();
        int max3 = Math.max(max, this.f1239d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f1239d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1239d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public boolean onNestedFling(View view, float f7, float f8, boolean z6) {
        if (this.f1246k && z6) {
            if (A(f8)) {
                b();
            } else {
                z();
            }
            this.f1247l = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
    }

    @Override // androidx.core.view.h1
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        onNestedScroll(view, i7, i8, i9, i10, i11);
    }

    @Override // androidx.core.view.g1
    public void onNestedScrollAccepted(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // androidx.core.view.g1
    public boolean onStartNestedScroll(View view, View view2, int i7, int i8) {
        return i8 == 0 && onStartNestedScroll(view, view2, i7);
    }

    @Override // androidx.core.view.g1
    public void onStopNestedScroll(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        y();
        int i8 = this.f1249n ^ i7;
        this.f1249n = i7;
        boolean z6 = (i7 & 4) == 0;
        boolean z7 = (i7 & 256) != 0;
        d dVar = this.f1261z;
        if (dVar != null) {
            dVar.e(!z7);
            if (z6 || !z7) {
                this.f1261z.a();
            } else {
                this.f1261z.f();
            }
        }
        if ((i8 & 256) == 0 || this.f1261z == null) {
            return;
        }
        androidx.core.view.u1.v1(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.f1238c = i7;
        d dVar = this.f1261z;
        if (dVar != null) {
            dVar.c(i7);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: p  reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: q  reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final l0 r(View view) {
        if (view instanceof l0) {
            return (l0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void s() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void setActionBarHideOffset(int i7) {
        s();
        this.f1240e.setTranslationY(-Math.max(0, Math.min(i7, this.f1240e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f1261z = dVar;
        if (getWindowToken() != null) {
            this.f1261z.c(this.f1238c);
            int i7 = this.f1249n;
            if (i7 != 0) {
                onWindowSystemUiVisibilityChanged(i7);
                androidx.core.view.u1.v1(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z6) {
        this.f1245j = z6;
    }

    public void setHideOnContentScrollEnabled(boolean z6) {
        if (z6 != this.f1246k) {
            this.f1246k = z6;
            if (z6) {
                return;
            }
            s();
            setActionBarHideOffset(0);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public void setIcon(int i7) {
        y();
        this.f1241f.setIcon(i7);
    }

    @Override // androidx.appcompat.widget.k0
    public void setLogo(int i7) {
        y();
        this.f1241f.setLogo(i7);
    }

    public void setOverlayMode(boolean z6) {
        this.f1244i = z6;
        this.f1243h = z6 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z6) {
    }

    @Override // androidx.appcompat.widget.k0
    public void setUiOptions(int i7) {
    }

    @Override // androidx.appcompat.widget.k0
    public void setWindowCallback(Window.Callback callback) {
        y();
        this.f1241f.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.k0
    public void setWindowTitle(CharSequence charSequence) {
        y();
        this.f1241f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(I);
        this.f1237b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1242g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1243h = context.getApplicationInfo().targetSdkVersion < 19;
        this.A = new OverScroller(context);
    }

    public boolean u() {
        return this.f1246k;
    }

    public boolean v() {
        return this.f1244i;
    }

    public final void w() {
        s();
        postDelayed(this.E, 600L);
    }

    public final void x() {
        s();
        postDelayed(this.D, 600L);
    }

    public void y() {
        if (this.f1239d == null) {
            this.f1239d = (ContentFrameLayout) findViewById(a.g.f9133b);
            this.f1240e = (ActionBarContainer) findViewById(a.g.f9135c);
            this.f1241f = r(findViewById(a.g.f9131a));
        }
    }

    public final void z() {
        s();
        this.D.run();
    }

    public ActionBarOverlayLayout(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1238c = 0;
        this.f1250o = new Rect();
        this.f1251p = new Rect();
        this.f1252q = new Rect();
        this.f1253r = new Rect();
        this.f1254s = new Rect();
        this.f1255t = new Rect();
        this.f1256u = new Rect();
        h4 h4Var = h4.f3606c;
        this.f1257v = h4Var;
        this.f1258w = h4Var;
        this.f1259x = h4Var;
        this.f1260y = h4Var;
        this.C = new a();
        this.D = new b();
        this.E = new c();
        t(context);
        this.F = new androidx.core.view.j1(this);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // androidx.core.view.g1
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr, int i9) {
        if (i9 == 0) {
            onNestedPreScroll(view, i7, i8, iArr);
        }
    }

    @Override // androidx.core.view.g1
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i7, i8, i9, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        this.F.b(view, view2, i7);
        this.f1248m = getActionBarHideOffset();
        s();
        d dVar = this.f1261z;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f1240e.getVisibility() != 0) {
            return false;
        }
        return this.f1246k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public void onStopNestedScroll(View view) {
        if (this.f1246k && !this.f1247l) {
            if (this.f1248m <= this.f1240e.getHeight()) {
                x();
            } else {
                w();
            }
        }
        d dVar = this.f1261z;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        int i11 = this.f1248m + i8;
        this.f1248m = i11;
        setActionBarHideOffset(i11);
    }

    @Override // androidx.appcompat.widget.k0
    public void setIcon(Drawable drawable) {
        y();
        this.f1241f.setIcon(drawable);
    }
}
