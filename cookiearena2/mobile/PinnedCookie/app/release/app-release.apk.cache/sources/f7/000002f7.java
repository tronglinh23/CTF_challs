package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.g0;
import androidx.core.view.g1;
import androidx.core.view.h1;
import androidx.core.view.h4;
import androidx.core.view.j1;
import androidx.core.view.k1;
import androidx.core.view.m0;
import androidx.core.view.u1;
import com.google.android.material.color.utilities.Contrast;
import d.b1;
import d.d0;
import d.l;
import d.l1;
import d.o0;
import d.q0;
import d.v;
import d.x;
import e0.a;
import g1.n;
import g1.r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements g1, h1 {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<c>>> sConstructors;
    private static final r.a<Rect> sRectPool;
    private k1 mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final androidx.coordinatorlayout.widget.a<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private h4 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final j1 mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private h mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    /* loaded from: classes.dex */
    public class a implements k1 {
        public a() {
        }

        @Override // androidx.core.view.k1
        public h4 onApplyWindowInsets(View view, h4 h4Var) {
            return CoordinatorLayout.this.setWindowInsets(h4Var);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        @o0
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        @q0
        public static Object getTag(@o0 View view) {
            return ((g) view.getLayoutParams()).f3477r;
        }

        public static void setTag(@o0 View view, @q0 Object obj) {
            ((g) view.getLayoutParams()).f3477r = obj;
        }

        public boolean blocksInteractionBelow(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6) {
            return getScrimOpacity(coordinatorLayout, v6) > 0.0f;
        }

        public boolean getInsetDodgeRect(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 Rect rect) {
            return false;
        }

        @l
        public int getScrimColor(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6) {
            return u1.f3816t;
        }

        @x(from = androidx.cardview.widget.g.f1896q, to = Contrast.RATIO_MIN)
        public float getScrimOpacity(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6) {
            return 0.0f;
        }

        public boolean layoutDependsOn(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view) {
            return false;
        }

        @o0
        public h4 onApplyWindowInsets(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 h4 h4Var) {
            return h4Var;
        }

        public void onAttachedToLayoutParams(@o0 g gVar) {
        }

        public boolean onDependentViewChanged(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view) {
            return false;
        }

        public void onDependentViewRemoved(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, int i7) {
            return false;
        }

        public boolean onMeasureChild(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, int i7, int i8, int i9, int i10) {
            return false;
        }

        public boolean onNestedFling(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, float f7, float f8, boolean z6) {
            return false;
        }

        public boolean onNestedPreFling(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, float f7, float f8) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, int i7, int i8, @o0 int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, int i7, int i8, int i9, int i10) {
        }

        @Deprecated
        public void onNestedScrollAccepted(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, @o0 View view2, int i7) {
        }

        public boolean onRequestChildRectangleOnScreen(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 Rect rect, boolean z6) {
            return false;
        }

        public void onRestoreInstanceState(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 Parcelable parcelable) {
        }

        @q0
        public Parcelable onSaveInstanceState(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, @o0 View view2, int i7) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view) {
        }

        public boolean onTouchEvent(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, int i7, int i8, @o0 int[] iArr, int i9) {
            if (i9 == 0) {
                onNestedPreScroll(coordinatorLayout, v6, view, i7, i8, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, int i7, int i8, int i9, int i10, int i11) {
            if (i11 == 0) {
                onNestedScroll(coordinatorLayout, v6, view, i7, i8, i9, i10);
            }
        }

        public void onNestedScrollAccepted(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, @o0 View view2, int i7, int i8) {
            if (i8 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v6, view, view2, i7);
            }
        }

        public boolean onStartNestedScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, @o0 View view2, int i7, int i8) {
            if (i8 == 0) {
                return onStartNestedScroll(coordinatorLayout, v6, view, view2, i7);
            }
            return false;
        }

        public void onStopNestedScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, int i7) {
            if (i7 == 0) {
                onStopNestedScroll(coordinatorLayout, v6, view);
            }
        }

        public void onNestedScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, int i7, int i8, int i9, int i10, int i11, @o0 int[] iArr) {
            iArr[0] = iArr[0] + i9;
            iArr[1] = iArr[1] + i10;
            onNestedScroll(coordinatorLayout, v6, view, i7, i8, i9, i10, i11);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    /* loaded from: classes.dex */
    public class f implements ViewGroup.OnHierarchyChangeListener {
        public f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements ViewTreeObserver.OnPreDrawListener {
        public h() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class j implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float F0 = u1.F0(view);
            float F02 = u1.F0(view2);
            if (F0 > F02) {
                return -1;
            }
            return F0 < F02 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r02 != null ? r02.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new j();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new r.c(12);
    }

    public CoordinatorLayout(@o0 Context context) {
        this(context, null);
    }

    @o0
    public static Rect a() {
        Rect b7 = sRectPool.b();
        return b7 == null ? new Rect() : b7;
    }

    public static int b(int i7, int i8, int i9) {
        return i7 < i8 ? i8 : i7 > i9 ? i9 : i7;
    }

    public static void o(@o0 Rect rect) {
        rect.setEmpty();
        sRectPool.a(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = sConstructors;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e7) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e7);
        }
    }

    public static int q(int i7) {
        if (i7 == 0) {
            return 17;
        }
        return i7;
    }

    public static int r(int i7) {
        if ((i7 & 7) == 0) {
            i7 |= m0.f3714b;
        }
        return (i7 & g0.f1602o) == 0 ? i7 | 48 : i7;
    }

    public static int s(int i7) {
        if (i7 == 0) {
            return 8388661;
        }
        return i7;
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    public final void c(g gVar, Rect rect, int i7, int i8) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i7) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i8) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        rect.set(max, max2, i7 + max, i8 + max2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public final h4 d(h4 h4Var) {
        c f7;
        if (h4Var.A()) {
            return h4Var;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (u1.U(childAt) && (f7 = ((g) childAt.getLayoutParams()).f()) != null) {
                h4Var = f7.onApplyWindowInsets(this, childAt, h4Var);
                if (h4Var.A()) {
                    break;
                }
            }
        }
        return h4Var;
    }

    public void dispatchDependentViewsChanged(@o0 View view) {
        List g7 = this.mChildDag.g(view);
        if (g7 == null || g7.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < g7.size(); i7++) {
            View view2 = (View) g7.get(i7);
            c f7 = ((g) view2.getLayoutParams()).f();
            if (f7 != null) {
                f7.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(@o0 View view, @o0 View view2) {
        boolean z6 = false;
        if (view.getVisibility() == 0 && view2.getVisibility() == 0) {
            Rect a7 = a();
            getChildRect(view, view.getParent() != this, a7);
            Rect a8 = a();
            getChildRect(view2, view2.getParent() != this, a8);
            try {
                if (a7.left <= a8.right && a7.top <= a8.bottom && a7.right >= a8.left) {
                    if (a7.bottom >= a8.top) {
                        z6 = true;
                    }
                }
                return z6;
            } finally {
                o(a7);
                o(a8);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j7) {
        g gVar = (g) view.getLayoutParams();
        c cVar = gVar.f3460a;
        if (cVar != null) {
            float scrimOpacity = cVar.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(gVar.f3460a.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(b(Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        boolean z6 = false;
        if (drawable != null && drawable.isStateful()) {
            z6 = false | drawable.setState(drawableState);
        }
        if (z6) {
            invalidate();
        }
    }

    public final void e(View view, int i7, Rect rect, Rect rect2, g gVar, int i8, int i9) {
        int d7 = m0.d(q(gVar.f3462c), i7);
        int d8 = m0.d(r(gVar.f3463d), i7);
        int i10 = d7 & 7;
        int i11 = d7 & g0.f1602o;
        int i12 = d8 & 7;
        int i13 = d8 & g0.f1602o;
        int width = i12 != 1 ? i12 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i13 != 16 ? i13 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i10 == 1) {
            width -= i8 / 2;
        } else if (i10 != 5) {
            width -= i8;
        }
        if (i11 == 16) {
            height -= i9 / 2;
        } else if (i11 != 80) {
            height -= i9;
        }
        rect2.set(width, height, i8 + width, i9 + height);
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            } else if (h(getChildAt(i7))) {
                z6 = true;
                break;
            } else {
                i7++;
            }
        }
        if (z6 != this.mNeedsPreDrawListener) {
            if (z6) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    public final int f(int i7) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e(TAG, "No keylines defined for " + this + " - attempted index lookup " + i7);
            return 0;
        } else if (i7 < 0 || i7 >= iArr.length) {
            Log.e(TAG, "Keyline index " + i7 + " out of range for " + this);
            return 0;
        } else {
            return iArr[i7];
        }
    }

    public final void g(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i7) : i7));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public void getChildRect(View view, boolean z6, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z6) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @o0
    public List<View> getDependencies(@o0 View view) {
        List<View> h7 = this.mChildDag.h(view);
        this.mTempDependenciesList.clear();
        if (h7 != null) {
            this.mTempDependenciesList.addAll(h7);
        }
        return this.mTempDependenciesList;
    }

    @l1
    public final List<View> getDependencySortedChildren() {
        n();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    @o0
    public List<View> getDependents(@o0 View view) {
        List g7 = this.mChildDag.g(view);
        this.mTempDependenciesList.clear();
        if (g7 != null) {
            this.mTempDependenciesList.addAll(g7);
        }
        return this.mTempDependenciesList;
    }

    public void getDescendantRect(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    public void getDesiredAnchoredChildRect(View view, int i7, Rect rect, Rect rect2) {
        g gVar = (g) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        e(view, i7, rect, rect2, gVar, measuredWidth, measuredHeight);
        c(gVar, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((g) view.getLayoutParams()).h());
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public final h4 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup, androidx.core.view.i1
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.a();
    }

    public g getResolvedLayoutParams(View view) {
        g gVar = (g) view.getLayoutParams();
        if (!gVar.f3461b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e(TAG, "Attached behavior class is null");
                }
                gVar.q(behavior);
                gVar.f3461b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        gVar.q(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e7) {
                        Log.e(TAG, "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e7);
                    }
                }
                gVar.f3461b = true;
            }
        }
        return gVar;
    }

    @q0
    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public final boolean h(View view) {
        return this.mChildDag.j(view);
    }

    public final void i(View view, int i7) {
        g gVar = (g) view.getLayoutParams();
        Rect a7 = a();
        a7.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        if (this.mLastInsets != null && u1.U(this) && !u1.U(view)) {
            a7.left += this.mLastInsets.p();
            a7.top += this.mLastInsets.r();
            a7.right -= this.mLastInsets.q();
            a7.bottom -= this.mLastInsets.o();
        }
        Rect a8 = a();
        m0.b(r(gVar.f3462c), view.getMeasuredWidth(), view.getMeasuredHeight(), a7, a8, i7);
        view.layout(a8.left, a8.top, a8.right, a8.bottom);
        o(a7);
        o(a8);
    }

    public boolean isPointInChildBounds(@o0 View view, int i7, int i8) {
        Rect a7 = a();
        getDescendantRect(view, a7);
        try {
            return a7.contains(i7, i8);
        } finally {
            o(a7);
        }
    }

    public final void j(View view, View view2, int i7) {
        Rect a7 = a();
        Rect a8 = a();
        try {
            getDescendantRect(view2, a7);
            getDesiredAnchoredChildRect(view, i7, a7, a8);
            view.layout(a8.left, a8.top, a8.right, a8.bottom);
        } finally {
            o(a7);
            o(a8);
        }
    }

    public final void k(View view, int i7, int i8) {
        g gVar = (g) view.getLayoutParams();
        int d7 = m0.d(s(gVar.f3462c), i8);
        int i9 = d7 & 7;
        int i10 = d7 & g0.f1602o;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i8 == 1) {
            i7 = width - i7;
        }
        int f7 = f(i7) - measuredWidth;
        if (i9 == 1) {
            f7 += measuredWidth / 2;
        } else if (i9 == 5) {
            f7 += measuredWidth;
        }
        int i11 = 0;
        if (i10 == 16) {
            i11 = 0 + (measuredHeight / 2);
        } else if (i10 == 80) {
            i11 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(f7, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    public final void l(View view, Rect rect, int i7) {
        boolean z6;
        boolean z7;
        int width;
        int i8;
        int i9;
        int i10;
        int height;
        int i11;
        int i12;
        int i13;
        if (u1.U0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            g gVar = (g) view.getLayoutParams();
            c f7 = gVar.f();
            Rect a7 = a();
            Rect a8 = a();
            a8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f7 == null || !f7.getInsetDodgeRect(this, view, a7)) {
                a7.set(a8);
            } else if (!a8.contains(a7)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a7.toShortString() + " | Bounds:" + a8.toShortString());
            }
            o(a8);
            if (a7.isEmpty()) {
                o(a7);
                return;
            }
            int d7 = m0.d(gVar.f3467h, i7);
            boolean z8 = true;
            if ((d7 & 48) != 48 || (i12 = (a7.top - ((ViewGroup.MarginLayoutParams) gVar).topMargin) - gVar.f3469j) >= (i13 = rect.top)) {
                z6 = false;
            } else {
                u(view, i13 - i12);
                z6 = true;
            }
            if ((d7 & 80) == 80 && (height = ((getHeight() - a7.bottom) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) + gVar.f3469j) < (i11 = rect.bottom)) {
                u(view, height - i11);
                z6 = true;
            }
            if (!z6) {
                u(view, 0);
            }
            if ((d7 & 3) != 3 || (i9 = (a7.left - ((ViewGroup.MarginLayoutParams) gVar).leftMargin) - gVar.f3468i) >= (i10 = rect.left)) {
                z7 = false;
            } else {
                t(view, i10 - i9);
                z7 = true;
            }
            if ((d7 & 5) != 5 || (width = ((getWidth() - a7.right) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin) + gVar.f3468i) >= (i8 = rect.right)) {
                z8 = z7;
            } else {
                t(view, width - i8);
            }
            if (!z8) {
                t(view, 0);
            }
            o(a7);
        }
    }

    public final boolean m(MotionEvent motionEvent, int i7) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        g(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z6 = false;
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view = list.get(i8);
            g gVar = (g) view.getLayoutParams();
            c f7 = gVar.f();
            if (!(z6 || z7) || actionMasked == 0) {
                if (!z6 && f7 != null) {
                    if (i7 == 0) {
                        z6 = f7.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i7 == 1) {
                        z6 = f7.onTouchEvent(this, view, motionEvent);
                    }
                    if (z6) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean c7 = gVar.c();
                boolean j7 = gVar.j(this, view);
                z7 = j7 && !c7;
                if (j7 && !z7) {
                    break;
                }
            } else if (f7 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i7 == 0) {
                    f7.onInterceptTouchEvent(this, view, motionEvent2);
                } else if (i7 == 1) {
                    f7.onTouchEvent(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z6;
    }

    public final void n() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.c();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            g resolvedLayoutParams = getResolvedLayoutParams(childAt);
            resolvedLayoutParams.d(this, childAt);
            this.mChildDag.b(childAt);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (i8 != i7) {
                    View childAt2 = getChildAt(i8);
                    if (resolvedLayoutParams.b(this, childAt, childAt2)) {
                        if (!this.mChildDag.d(childAt2)) {
                            this.mChildDag.b(childAt2);
                        }
                        this.mChildDag.a(childAt2, childAt);
                    }
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.i());
        Collections.reverse(this.mDependencySortedChildren);
    }

    public void offsetChildToAnchor(View view, int i7) {
        c f7;
        g gVar = (g) view.getLayoutParams();
        if (gVar.f3470k != null) {
            Rect a7 = a();
            Rect a8 = a();
            Rect a9 = a();
            getDescendantRect(gVar.f3470k, a7);
            getChildRect(view, false, a8);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            e(view, i7, a7, a9, gVar, measuredWidth, measuredHeight);
            boolean z6 = (a9.left == a8.left && a9.top == a8.top) ? false : true;
            c(gVar, a9, measuredWidth, measuredHeight);
            int i8 = a9.left - a8.left;
            int i9 = a9.top - a8.top;
            if (i8 != 0) {
                u1.e1(view, i8);
            }
            if (i9 != 0) {
                u1.f1(view, i9);
            }
            if (z6 && (f7 = gVar.f()) != null) {
                f7.onDependentViewChanged(this, view, gVar.f3470k);
            }
            o(a7);
            o(a8);
            o(a9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && u1.U(this)) {
            u1.v1(this);
        }
        this.mIsAttachedToWindow = true;
    }

    public final void onChildViewsChanged(int i7) {
        boolean z6;
        int Z = u1.Z(this);
        int size = this.mDependencySortedChildren.size();
        Rect a7 = a();
        Rect a8 = a();
        Rect a9 = a();
        for (int i8 = 0; i8 < size; i8++) {
            View view = this.mDependencySortedChildren.get(i8);
            g gVar = (g) view.getLayoutParams();
            if (i7 != 0 || view.getVisibility() != 8) {
                for (int i9 = 0; i9 < i8; i9++) {
                    if (gVar.f3471l == this.mDependencySortedChildren.get(i9)) {
                        offsetChildToAnchor(view, Z);
                    }
                }
                getChildRect(view, true, a8);
                if (gVar.f3466g != 0 && !a8.isEmpty()) {
                    int d7 = m0.d(gVar.f3466g, Z);
                    int i10 = d7 & g0.f1602o;
                    if (i10 == 48) {
                        a7.top = Math.max(a7.top, a8.bottom);
                    } else if (i10 == 80) {
                        a7.bottom = Math.max(a7.bottom, getHeight() - a8.top);
                    }
                    int i11 = d7 & 7;
                    if (i11 == 3) {
                        a7.left = Math.max(a7.left, a8.right);
                    } else if (i11 == 5) {
                        a7.right = Math.max(a7.right, getWidth() - a8.left);
                    }
                }
                if (gVar.f3467h != 0 && view.getVisibility() == 0) {
                    l(view, a7, Z);
                }
                if (i7 != 2) {
                    getLastChildRect(view, a9);
                    if (!a9.equals(a8)) {
                        recordLastChildRect(view, a8);
                    }
                }
                for (int i12 = i8 + 1; i12 < size; i12++) {
                    View view2 = this.mDependencySortedChildren.get(i12);
                    g gVar2 = (g) view2.getLayoutParams();
                    c f7 = gVar2.f();
                    if (f7 != null && f7.layoutDependsOn(this, view2, view)) {
                        if (i7 == 0 && gVar2.g()) {
                            gVar2.l();
                        } else {
                            if (i7 != 2) {
                                z6 = f7.onDependentViewChanged(this, view2, view);
                            } else {
                                f7.onDependentViewRemoved(this, view2, view);
                                z6 = true;
                            }
                            if (i7 == 1) {
                                gVar2.r(z6);
                            }
                        }
                    }
                }
            }
        }
        o(a7);
        o(a8);
        o(a9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        h4 h4Var = this.mLastInsets;
        int r6 = h4Var != null ? h4Var.r() : 0;
        if (r6 > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), r6);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            p(true);
        }
        boolean m7 = m(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            p(true);
        }
        return m7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        c f7;
        int Z = u1.Z(this);
        int size = this.mDependencySortedChildren.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.mDependencySortedChildren.get(i11);
            if (view.getVisibility() != 8 && ((f7 = ((g) view.getLayoutParams()).f()) == null || !f7.onLayoutChild(this, view, Z))) {
                onLayoutChild(view, Z);
            }
        }
    }

    public void onLayoutChild(@o0 View view, int i7) {
        g gVar = (g) view.getLayoutParams();
        if (gVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = gVar.f3470k;
        if (view2 != null) {
            j(view, view2, i7);
            return;
        }
        int i8 = gVar.f3464e;
        if (i8 >= 0) {
            k(view, i8, i7);
        } else {
            i(view, i7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.onMeasureChild(r30, r20, r11, r21, r23, 0) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public void onMeasureChild(View view, int i7, int i8, int i9, int i10) {
        measureChildWithMargins(view, i7, i8, i9, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public boolean onNestedFling(View view, float f7, float f8, boolean z6) {
        c f9;
        int childCount = getChildCount();
        boolean z7 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (f9 = gVar.f()) != null) {
                    z7 |= f9.onNestedFling(this, childAt, view, f7, f8, z6);
                }
            }
        }
        if (z7) {
            onChildViewsChanged(1);
        }
        return z7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public boolean onNestedPreFling(View view, float f7, float f8) {
        c f9;
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (f9 = gVar.f()) != null) {
                    z6 |= f9.onNestedPreFling(this, childAt, view, f7, f8);
                }
            }
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        onNestedPreScroll(view, i7, i8, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        onNestedScroll(view, i7, i8, i9, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        onNestedScrollAccepted(view, view2, i7, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        SparseArray<Parcelable> sparseArray = iVar.f3479k;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            c f7 = getResolvedLayoutParams(childAt).f();
            if (id != -1 && f7 != null && (parcelable2 = sparseArray.get(id)) != null) {
                f7.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        i iVar = new i(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            c f7 = ((g) childAt.getLayoutParams()).f();
            if (id != -1 && f7 != null && (onSaveInstanceState = f7.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        iVar.f3479k = sparseArray;
        return iVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return onStartNestedScroll(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.mBehaviorTouchView
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.mBehaviorTouchView
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.g) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.mBehaviorTouchView
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
            goto L2c
        L2b:
            r6 = r5
        L2c:
            android.view.View r7 = r0.mBehaviorTouchView
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.p(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(boolean z6) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            c f7 = ((g) childAt.getLayoutParams()).f();
            if (f7 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z6) {
                    f7.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    f7.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            ((g) getChildAt(i8).getLayoutParams()).n();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((g) view.getLayoutParams()).s(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        c f7 = ((g) view.getLayoutParams()).f();
        if (f7 == null || !f7.onRequestChildRectangleOnScreen(this, view, rect, z6)) {
            return super.requestChildRectangleOnScreen(view, rect, z6);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (!z6 || this.mDisallowInterceptReset) {
            return;
        }
        p(false);
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z6) {
        super.setFitsSystemWindows(z6);
        v();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@q0 Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                q0.c.m(this.mStatusBarBackground, u1.Z(this));
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            u1.n1(this);
        }
    }

    public void setStatusBarBackgroundColor(@l int i7) {
        setStatusBarBackground(new ColorDrawable(i7));
    }

    public void setStatusBarBackgroundResource(@v int i7) {
        setStatusBarBackground(i7 != 0 ? k0.d.i(getContext(), i7) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z6 = i7 == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z6) {
            return;
        }
        this.mStatusBarBackground.setVisible(z6, false);
    }

    public final h4 setWindowInsets(h4 h4Var) {
        if (n.a(this.mLastInsets, h4Var)) {
            return h4Var;
        }
        this.mLastInsets = h4Var;
        boolean z6 = h4Var != null && h4Var.r() > 0;
        this.mDrawStatusBarBackground = z6;
        setWillNotDraw(!z6 && getBackground() == null);
        h4 d7 = d(h4Var);
        requestLayout();
        return d7;
    }

    public final void t(View view, int i7) {
        g gVar = (g) view.getLayoutParams();
        int i8 = gVar.f3468i;
        if (i8 != i7) {
            u1.e1(view, i7 - i8);
            gVar.f3468i = i7;
        }
    }

    public final void u(View view, int i7) {
        g gVar = (g) view.getLayoutParams();
        int i8 = gVar.f3469j;
        if (i8 != i7) {
            u1.f1(view, i7 - i8);
            gVar.f3469j = i7;
        }
    }

    public final void v() {
        if (!u1.U(this)) {
            u1.a2(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new a();
        }
        u1.a2(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    public CoordinatorLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0098a.f8566b);
    }

    @Override // android.view.ViewGroup
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // androidx.core.view.g1
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr, int i9) {
        c f7;
        int childCount = getChildCount();
        boolean z6 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(i9) && (f7 = gVar.f()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f7.onNestedPreScroll(this, childAt, view, i7, i8, iArr2, i9);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i10 = i7 > 0 ? Math.max(i10, iArr3[0]) : Math.min(i10, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i11 = i8 > 0 ? Math.max(i11, iArr4[1]) : Math.min(i11, iArr4[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
        if (z6) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.g1
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11) {
        onNestedScroll(view, i7, i8, i9, i10, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.g1
    public void onNestedScrollAccepted(View view, View view2, int i7, int i8) {
        c f7;
        this.mNestedScrollingParentHelper.c(view, view2, i7, i8);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(i8) && (f7 = gVar.f()) != null) {
                f7.onNestedScrollAccepted(this, childAt, view, view2, i7, i8);
            }
        }
    }

    @Override // androidx.core.view.g1
    public boolean onStartNestedScroll(View view, View view2, int i7, int i8) {
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                c f7 = gVar.f();
                if (f7 != null) {
                    boolean onStartNestedScroll = f7.onStartNestedScroll(this, childAt, view, view2, i7, i8);
                    z6 |= onStartNestedScroll;
                    gVar.t(i8, onStartNestedScroll);
                } else {
                    gVar.t(i8, false);
                }
            }
        }
        return z6;
    }

    @Override // androidx.core.view.g1
    public void onStopNestedScroll(View view, int i7) {
        this.mNestedScrollingParentHelper.e(view, i7);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(i7)) {
                c f7 = gVar.f();
                if (f7 != null) {
                    f7.onStopNestedScroll(this, childAt, view, i7);
                }
                gVar.m(i7);
                gVar.l();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    public CoordinatorLayout(@o0 Context context, @q0 AttributeSet attributeSet, @d.f int i7) {
        super(context, attributeSet, i7);
        TypedArray obtainStyledAttributes;
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new androidx.coordinatorlayout.widget.a<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new j1(this);
        if (i7 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f8695g, 0, a.i.f8688h);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f8695g, i7, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i7 == 0) {
                saveAttributeDataForStyleable(context, a.j.f8695g, attributeSet, obtainStyledAttributes, 0, a.i.f8688h);
            } else {
                saveAttributeDataForStyleable(context, a.j.f8695g, attributeSet, obtainStyledAttributes, i7, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(a.j.f8696h, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f7 = resources.getDisplayMetrics().density;
            int length = this.mKeylines.length;
            for (int i8 = 0; i8 < length; i8++) {
                this.mKeylines[i8] = (int) (r12[i8] * f7);
            }
        }
        this.mStatusBarBackground = obtainStyledAttributes.getDrawable(a.j.f8697i);
        obtainStyledAttributes.recycle();
        v();
        super.setOnHierarchyChangeListener(new f());
        if (u1.V(this) == 0) {
            u1.R1(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // androidx.core.view.h1
    public void onNestedScroll(@o0 View view, int i7, int i8, int i9, int i10, int i11, @o0 int[] iArr) {
        c f7;
        boolean z6;
        int min;
        int childCount = getChildCount();
        boolean z7 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(i11) && (f7 = gVar.f()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f7.onNestedScroll(this, childAt, view, i7, i8, i9, i10, i11, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i12 = i9 > 0 ? Math.max(i12, iArr3[0]) : Math.min(i12, iArr3[0]);
                    if (i10 > 0) {
                        z6 = true;
                        min = Math.max(i13, this.mBehaviorConsumed[1]);
                    } else {
                        z6 = true;
                        min = Math.min(i13, this.mBehaviorConsumed[1]);
                    }
                    i13 = min;
                    z7 = z6;
                }
            }
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (z7) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class i extends o1.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public SparseArray<Parcelable> f3479k;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i7) {
                return new i[i7];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3479k = new SparseArray<>(readInt);
            for (int i7 = 0; i7 < readInt; i7++) {
                this.f3479k.append(iArr[i7], readParcelableArray[i7]);
            }
        }

        @Override // o1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            SparseArray<Parcelable> sparseArray = this.f3479k;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr[i8] = this.f3479k.keyAt(i8);
                parcelableArr[i8] = this.f3479k.valueAt(i8);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i7);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f3460a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3461b;

        /* renamed from: c  reason: collision with root package name */
        public int f3462c;

        /* renamed from: d  reason: collision with root package name */
        public int f3463d;

        /* renamed from: e  reason: collision with root package name */
        public int f3464e;

        /* renamed from: f  reason: collision with root package name */
        public int f3465f;

        /* renamed from: g  reason: collision with root package name */
        public int f3466g;

        /* renamed from: h  reason: collision with root package name */
        public int f3467h;

        /* renamed from: i  reason: collision with root package name */
        public int f3468i;

        /* renamed from: j  reason: collision with root package name */
        public int f3469j;

        /* renamed from: k  reason: collision with root package name */
        public View f3470k;

        /* renamed from: l  reason: collision with root package name */
        public View f3471l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f3472m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f3473n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f3474o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f3475p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f3476q;

        /* renamed from: r  reason: collision with root package name */
        public Object f3477r;

        public g(int i7, int i8) {
            super(i7, i8);
            this.f3461b = false;
            this.f3462c = 0;
            this.f3463d = 0;
            this.f3464e = -1;
            this.f3465f = -1;
            this.f3466g = 0;
            this.f3467h = 0;
            this.f3476q = new Rect();
        }

        public boolean a() {
            return this.f3470k == null && this.f3465f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f3471l || u(view2, u1.Z(coordinatorLayout)) || ((cVar = this.f3460a) != null && cVar.layoutDependsOn(coordinatorLayout, view, view2));
        }

        public boolean c() {
            if (this.f3460a == null) {
                this.f3472m = false;
            }
            return this.f3472m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3465f == -1) {
                this.f3471l = null;
                this.f3470k = null;
                return null;
            }
            if (this.f3470k == null || !v(view, coordinatorLayout)) {
                o(view, coordinatorLayout);
            }
            return this.f3470k;
        }

        @d0
        public int e() {
            return this.f3465f;
        }

        @q0
        public c f() {
            return this.f3460a;
        }

        public boolean g() {
            return this.f3475p;
        }

        public Rect h() {
            return this.f3476q;
        }

        public void i() {
            this.f3471l = null;
            this.f3470k = null;
        }

        public boolean j(CoordinatorLayout coordinatorLayout, View view) {
            boolean z6 = this.f3472m;
            if (z6) {
                return true;
            }
            c cVar = this.f3460a;
            boolean blocksInteractionBelow = (cVar != null ? cVar.blocksInteractionBelow(coordinatorLayout, view) : false) | z6;
            this.f3472m = blocksInteractionBelow;
            return blocksInteractionBelow;
        }

        public boolean k(int i7) {
            if (i7 != 0) {
                if (i7 != 1) {
                    return false;
                }
                return this.f3474o;
            }
            return this.f3473n;
        }

        public void l() {
            this.f3475p = false;
        }

        public void m(int i7) {
            t(i7, false);
        }

        public void n() {
            this.f3472m = false;
        }

        public final void o(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f3465f);
            this.f3470k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f3471l = null;
                    this.f3470k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3465f) + " to anchor view " + view);
            } else if (findViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f3471l = null;
                this.f3470k = null;
            } else {
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                        this.f3471l = null;
                        this.f3470k = null;
                        return;
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.f3471l = findViewById;
            }
        }

        public void p(@d0 int i7) {
            i();
            this.f3465f = i7;
        }

        public void q(@q0 c cVar) {
            c cVar2 = this.f3460a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.onDetachedFromLayoutParams();
                }
                this.f3460a = cVar;
                this.f3477r = null;
                this.f3461b = true;
                if (cVar != null) {
                    cVar.onAttachedToLayoutParams(this);
                }
            }
        }

        public void r(boolean z6) {
            this.f3475p = z6;
        }

        public void s(Rect rect) {
            this.f3476q.set(rect);
        }

        public void t(int i7, boolean z6) {
            if (i7 == 0) {
                this.f3473n = z6;
            } else if (i7 != 1) {
            } else {
                this.f3474o = z6;
            }
        }

        public final boolean u(View view, int i7) {
            int d7 = m0.d(((g) view.getLayoutParams()).f3466g, i7);
            return d7 != 0 && (m0.d(this.f3467h, i7) & d7) == d7;
        }

        public final boolean v(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3470k.getId() != this.f3465f) {
                return false;
            }
            View view2 = this.f3470k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f3471l = null;
                    this.f3470k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f3471l = view2;
            return true;
        }

        public g(@o0 Context context, @q0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3461b = false;
            this.f3462c = 0;
            this.f3463d = 0;
            this.f3464e = -1;
            this.f3465f = -1;
            this.f3466g = 0;
            this.f3467h = 0;
            this.f3476q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f8698j);
            this.f3462c = obtainStyledAttributes.getInteger(a.j.f8699k, 0);
            this.f3465f = obtainStyledAttributes.getResourceId(a.j.f8700l, -1);
            this.f3463d = obtainStyledAttributes.getInteger(a.j.f8701m, 0);
            this.f3464e = obtainStyledAttributes.getInteger(a.j.f8705q, -1);
            this.f3466g = obtainStyledAttributes.getInt(a.j.f8704p, 0);
            this.f3467h = obtainStyledAttributes.getInt(a.j.f8703o, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(a.j.f8702n);
            this.f3461b = hasValue;
            if (hasValue) {
                this.f3460a = CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(a.j.f8702n));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f3460a;
            if (cVar != null) {
                cVar.onAttachedToLayoutParams(this);
            }
        }

        public g(g gVar) {
            super((ViewGroup.MarginLayoutParams) gVar);
            this.f3461b = false;
            this.f3462c = 0;
            this.f3463d = 0;
            this.f3464e = -1;
            this.f3465f = -1;
            this.f3466g = 0;
            this.f3467h = 0;
            this.f3476q = new Rect();
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3461b = false;
            this.f3462c = 0;
            this.f3463d = 0;
            this.f3464e = -1;
            this.f3465f = -1;
            this.f3466g = 0;
            this.f3467h = 0;
            this.f3476q = new Rect();
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3461b = false;
            this.f3462c = 0;
            this.f3463d = 0;
            this.f3464e = -1;
            this.f3465f = -1;
            this.f3466g = 0;
            this.f3467h = 0;
            this.f3476q = new Rect();
        }
    }
}