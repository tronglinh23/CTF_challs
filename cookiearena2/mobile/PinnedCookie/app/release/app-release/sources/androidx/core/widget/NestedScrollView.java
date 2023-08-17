package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.d1;
import androidx.core.view.f1;
import androidx.core.view.h1;
import androidx.core.view.j1;
import androidx.core.view.q1;
import androidx.core.view.u1;
import d.b1;
import d.l1;
import d.o0;
import d.q0;
import d.u;
import d.w0;
import f0.a;
import h1.f0;
import h1.p0;
import java.util.ArrayList;
import k1.j;
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements h1, d1, q1 {
    public static final int C = 250;
    public static final float D = 0.5f;
    public static final String E = "NestedScrollView";
    public static final int F = 250;
    public static final float G = 0.015f;
    public static final float H = 0.35f;
    public static final float J = 4.0f;
    public static final int K = -1;
    public float A;
    public c B;

    /* renamed from: b  reason: collision with root package name */
    public final float f3894b;

    /* renamed from: c  reason: collision with root package name */
    public long f3895c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f3896d;

    /* renamed from: e  reason: collision with root package name */
    public OverScroller f3897e;
    @b1({b1.a.LIBRARY})
    @l1
    @o0

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f3898f;
    @b1({b1.a.LIBRARY})
    @l1
    @o0

    /* renamed from: g  reason: collision with root package name */
    public EdgeEffect f3899g;

    /* renamed from: h  reason: collision with root package name */
    public int f3900h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3901i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3902j;

    /* renamed from: k  reason: collision with root package name */
    public View f3903k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3904l;

    /* renamed from: m  reason: collision with root package name */
    public VelocityTracker f3905m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3906n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3907o;

    /* renamed from: p  reason: collision with root package name */
    public int f3908p;

    /* renamed from: q  reason: collision with root package name */
    public int f3909q;

    /* renamed from: r  reason: collision with root package name */
    public int f3910r;

    /* renamed from: s  reason: collision with root package name */
    public int f3911s;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f3912t;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f3913u;

    /* renamed from: v  reason: collision with root package name */
    public int f3914v;

    /* renamed from: w  reason: collision with root package name */
    public int f3915w;

    /* renamed from: x  reason: collision with root package name */
    public d f3916x;

    /* renamed from: y  reason: collision with root package name */
    public final j1 f3917y;

    /* renamed from: z  reason: collision with root package name */
    public final f1 f3918z;
    public static final float I = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final a L = new a();
    public static final int[] M = {16843130};

    /* loaded from: classes.dex */
    public static class a extends androidx.core.view.a {
        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            p0.N(accessibilityEvent, nestedScrollView.getScrollX());
            p0.P(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, f0 f0Var) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, f0Var);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            f0Var.b1(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            f0Var.M1(true);
            if (nestedScrollView.getScrollY() > 0) {
                f0Var.b(f0.a.f10221s);
                f0Var.b(f0.a.D);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                f0Var.b(f0.a.f10220r);
                f0Var.b(f0.a.F);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
            if (super.performAccessibilityAction(view, i7, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                int height = nestedScrollView.getHeight();
                Rect rect = new Rect();
                if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                    height = rect.height();
                }
                if (i7 != 4096) {
                    if (i7 == 8192 || i7 == 16908344) {
                        int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.R(0, max, true);
                            return true;
                        }
                        return false;
                    } else if (i7 != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.R(0, min, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    @w0(21)
    /* loaded from: classes.dex */
    public static class b {
        @u
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(@o0 NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10);
    }

    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public int f3919k;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i7) {
                return new d[i7];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @o0
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3919k + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f3919k);
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f3919k = parcel.readInt();
        }
    }

    public NestedScrollView(@o0 Context context) {
        this(context, null);
    }

    public static int e(int i7, int i8, int i9) {
        if (i8 >= i9 || i7 < 0) {
            return 0;
        }
        return i8 + i7 > i9 ? i9 - i8 : i7;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.A;
    }

    public static boolean x(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && x((View) parent, view2);
    }

    public final void A(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3911s) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f3900h = (int) motionEvent.getY(i7);
            this.f3911s = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f3905m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean B(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z6) {
        boolean z7;
        boolean z8;
        int overScrollMode = getOverScrollMode();
        boolean z9 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z10 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z11 = overScrollMode == 0 || (overScrollMode == 1 && z9);
        boolean z12 = overScrollMode == 0 || (overScrollMode == 1 && z10);
        int i15 = i9 + i7;
        int i16 = !z11 ? 0 : i13;
        int i17 = i10 + i8;
        int i18 = !z12 ? 0 : i14;
        int i19 = -i16;
        int i20 = i16 + i11;
        int i21 = -i18;
        int i22 = i18 + i12;
        if (i15 > i20) {
            i15 = i20;
            z7 = true;
        } else if (i15 < i19) {
            z7 = true;
            i15 = i19;
        } else {
            z7 = false;
        }
        if (i17 > i22) {
            i17 = i22;
            z8 = true;
        } else if (i17 < i21) {
            z8 = true;
            i17 = i21;
        } else {
            z8 = false;
        }
        if (z8 && !hasNestedScrollingParent(1)) {
            this.f3897e.springBack(i15, i17, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i15, i17, z7, z8);
        return z7 || z8;
    }

    public boolean C(int i7) {
        boolean z6 = i7 == 130;
        int height = getHeight();
        if (z6) {
            this.f3896d.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3896d;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3896d.top = getScrollY() - height;
            Rect rect2 = this.f3896d;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3896d;
        int i8 = rect3.top;
        int i9 = height + i8;
        rect3.bottom = i9;
        return G(i7, i8, i9);
    }

    public final void D() {
        VelocityTracker velocityTracker = this.f3905m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3905m = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f3898f
            float r0 = k1.j.d(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f3898f
            float r4 = -r4
            float r4 = k1.j.j(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f3898f
            float r5 = k1.j.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f3898f
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f3899g
            float r0 = k1.j.d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f3899g
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = k1.j.j(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f3899g
            float r5 = k1.j.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f3899g
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.E(int, float):int");
    }

    public final void F(boolean z6) {
        if (z6) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f3915w = getScrollY();
        u1.n1(this);
    }

    public final boolean G(int i7, int i8, int i9) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        boolean z6 = false;
        boolean z7 = i7 == 33;
        View l7 = l(z7, i8, i9);
        if (l7 == null) {
            l7 = this;
        }
        if (i8 < scrollY || i9 > i10) {
            H(z7 ? i8 - scrollY : i9 - i10, 0, 1, true);
            z6 = true;
        }
        if (l7 != findFocus()) {
            l7.requestFocus(i7);
        }
        return z6;
    }

    public final int H(int i7, int i8, int i9, boolean z6) {
        int i10;
        int i11;
        if (i9 == 1) {
            startNestedScroll(2, i9);
        }
        boolean z7 = false;
        if (dispatchNestedPreScroll(0, i7, this.f3913u, this.f3912t, i9)) {
            i10 = i7 - this.f3913u[1];
            i11 = this.f3912t[1] + 0;
        } else {
            i10 = i7;
            i11 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z8 = c() && !z6;
        boolean z9 = B(0, i10, 0, scrollY, 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(i9);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f3913u;
        iArr[1] = 0;
        dispatchNestedScroll(0, scrollY2, 0, i10 - scrollY2, this.f3912t, i9, iArr);
        int i12 = i11 + this.f3912t[1];
        int i13 = i10 - this.f3913u[1];
        int i14 = scrollY + i13;
        if (i14 < 0) {
            if (z8) {
                j.j(this.f3898f, (-i13) / getHeight(), i8 / getWidth());
                if (!this.f3899g.isFinished()) {
                    this.f3899g.onRelease();
                }
            }
        } else if (i14 > scrollRange && z8) {
            j.j(this.f3899g, i13 / getHeight(), 1.0f - (i8 / getWidth()));
            if (!this.f3898f.isFinished()) {
                this.f3898f.onRelease();
            }
        }
        if (this.f3898f.isFinished() && this.f3899g.isFinished()) {
            z7 = z9;
        } else {
            u1.n1(this);
        }
        if (z7 && i9 == 0) {
            this.f3905m.clear();
        }
        if (i9 == 1) {
            stopNestedScroll(i9);
            this.f3898f.onRelease();
            this.f3899g.onRelease();
        }
        return i12;
    }

    public final void I(View view) {
        view.getDrawingRect(this.f3896d);
        offsetDescendantRectToMyCoords(view, this.f3896d);
        int f7 = f(this.f3896d);
        if (f7 != 0) {
            scrollBy(0, f7);
        }
    }

    public final boolean J(Rect rect, boolean z6) {
        int f7 = f(rect);
        boolean z7 = f7 != 0;
        if (z7) {
            if (z6) {
                scrollBy(0, f7);
            } else {
                L(0, f7);
            }
        }
        return z7;
    }

    public final boolean K(@o0 EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        return o(-i7) < j.d(edgeEffect) * ((float) getHeight());
    }

    public final void L(int i7, int i8) {
        N(i7, i8, 250, false);
    }

    public final void M(int i7, int i8, int i9) {
        N(i7, i8, i9, false);
    }

    public final void N(int i7, int i8, int i9, boolean z6) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3895c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f3897e.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i8 + scrollY, Math.max(0, height - height2))) - scrollY, i9);
            F(z6);
        } else {
            if (!this.f3897e.isFinished()) {
                a();
            }
            scrollBy(i7, i8);
        }
        this.f3895c = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void O(int i7, int i8) {
        Q(i7, i8, 250, false);
    }

    public final void P(int i7, int i8, int i9) {
        Q(i7, i8, i9, false);
    }

    public void Q(int i7, int i8, int i9, boolean z6) {
        N(i7 - getScrollX(), i8 - getScrollY(), i9, z6);
    }

    public void R(int i7, int i8, boolean z6) {
        Q(i7, i8, 250, z6);
    }

    public final boolean S(MotionEvent motionEvent) {
        boolean z6;
        if (j.d(this.f3898f) != 0.0f) {
            j.j(this.f3898f, 0.0f, motionEvent.getX() / getWidth());
            z6 = true;
        } else {
            z6 = false;
        }
        if (j.d(this.f3899g) != 0.0f) {
            j.j(this.f3899g, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z6;
    }

    public final void a() {
        this.f3897e.abortAnimation();
        stopNestedScroll(1);
    }

    @Override // android.view.ViewGroup
    public void addView(@o0 View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i7) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !y(findNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            H(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f3896d);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3896d);
            H(f(this.f3896d), 0, 1, true);
            findNextFocus.requestFocus(i7);
        }
        if (findFocus != null && findFocus.isFocused() && v(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.q1
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.q1
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.q1
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f3897e.isFinished()) {
            return;
        }
        this.f3897e.computeScrollOffset();
        int currY = this.f3897e.getCurrY();
        int g7 = g(currY - this.f3915w);
        this.f3915w = currY;
        int[] iArr = this.f3913u;
        boolean z6 = false;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, g7, iArr, null, 1);
        int i7 = g7 - this.f3913u[1];
        int scrollRange = getScrollRange();
        if (i7 != 0) {
            int scrollY = getScrollY();
            B(0, i7, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i8 = i7 - scrollY2;
            int[] iArr2 = this.f3913u;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i8, this.f3912t, 1, iArr2);
            i7 = i8 - this.f3913u[1];
        }
        if (i7 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z6 = true;
            }
            if (z6) {
                if (i7 < 0) {
                    if (this.f3898f.isFinished()) {
                        this.f3898f.onAbsorb((int) this.f3897e.getCurrVelocity());
                    }
                } else if (this.f3899g.isFinished()) {
                    this.f3899g.onAbsorb((int) this.f3897e.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f3897e.isFinished()) {
            stopNestedScroll(1);
        } else {
            u1.n1(this);
        }
    }

    @Override // android.view.View, androidx.core.view.q1
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.q1
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.q1
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final boolean d() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || k(keyEvent);
    }

    @Override // android.view.View, androidx.core.view.e1
    public boolean dispatchNestedFling(float f7, float f8, boolean z6) {
        return this.f3918z.a(f7, f8, z6);
    }

    @Override // android.view.View, androidx.core.view.e1
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f3918z.b(f7, f8);
    }

    @Override // androidx.core.view.c1
    public boolean dispatchNestedPreScroll(int i7, int i8, @q0 int[] iArr, @q0 int[] iArr2, int i9) {
        return this.f3918z.d(i7, i8, iArr, iArr2, i9);
    }

    @Override // androidx.core.view.d1
    public void dispatchNestedScroll(int i7, int i8, int i9, int i10, @q0 int[] iArr, int i11, @o0 int[] iArr2) {
        this.f3918z.e(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    @Override // android.view.View
    public void draw(@o0 Canvas canvas) {
        int i7;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i8 = 0;
        if (!this.f3898f.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i7 = getPaddingLeft() + 0;
            } else {
                i7 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i7, min);
            this.f3898f.setSize(width, height);
            if (this.f3898f.draw(canvas)) {
                u1.n1(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f3899g.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i8 = 0 + getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i8 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f3899g.setSize(width2, height2);
        if (this.f3899g.draw(canvas)) {
            u1.n1(this);
        }
        canvas.restoreToCount(save2);
    }

    public int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i8 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i9 = rect.bottom;
        if (i9 > i8 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i8) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        } else if (rect.top >= scrollY || i9 >= i8) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i8 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public int g(int i7) {
        int height = getHeight();
        if (i7 > 0 && j.d(this.f3898f) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * j.j(this.f3898f, ((-i7) * 4.0f) / height, 0.5f));
            if (round != i7) {
                this.f3898f.finish();
            }
            return i7 - round;
        } else if (i7 >= 0 || j.d(this.f3899g) == 0.0f) {
            return i7;
        } else {
            float f7 = height;
            int round2 = Math.round((f7 / 4.0f) * j.j(this.f3899g, (i7 * 4.0f) / f7, 0.5f));
            if (round2 != i7) {
                this.f3899g.finish();
            }
            return i7 - round2;
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup, androidx.core.view.i1
    public int getNestedScrollAxes() {
        return this.f3917y.a();
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final void h(int i7) {
        if (i7 != 0) {
            if (this.f3907o) {
                L(0, i7);
            } else {
                scrollBy(0, i7);
            }
        }
    }

    @Override // androidx.core.view.c1
    public boolean hasNestedScrollingParent(int i7) {
        return this.f3918z.l(i7);
    }

    public final boolean i(int i7) {
        if (j.d(this.f3898f) != 0.0f) {
            if (K(this.f3898f, i7)) {
                this.f3898f.onAbsorb(i7);
            } else {
                m(-i7);
            }
        } else if (j.d(this.f3899g) == 0.0f) {
            return false;
        } else {
            int i8 = -i7;
            if (K(this.f3899g, i8)) {
                this.f3899g.onAbsorb(i8);
            } else {
                m(i8);
            }
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.e1
    public boolean isNestedScrollingEnabled() {
        return this.f3918z.m();
    }

    public final void j() {
        this.f3911s = -1;
        this.f3904l = false;
        D();
        stopNestedScroll(0);
        this.f3898f.onRelease();
        this.f3899g.onRelease();
    }

    public boolean k(@o0 KeyEvent keyEvent) {
        this.f3896d.setEmpty();
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? b(33) : n(33);
            } else if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? b(130) : n(130);
            } else if (keyCode != 62) {
                return false;
            } else {
                C(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
        } else {
            return false;
        }
    }

    public final View l(boolean z6, int i7, int i8) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z7 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i7 < bottom && top < i8) {
                boolean z8 = i7 < top && bottom < i8;
                if (view == null) {
                    view = view2;
                    z7 = z8;
                } else {
                    boolean z9 = (z6 && top < view.getTop()) || (!z6 && bottom > view.getBottom());
                    if (z7) {
                        if (z8) {
                            if (!z9) {
                            }
                            view = view2;
                        }
                    } else if (z8) {
                        view = view2;
                        z7 = true;
                    } else {
                        if (!z9) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    public void m(int i7) {
        if (getChildCount() > 0) {
            this.f3897e.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            F(true);
        }
    }

    @Override // android.view.ViewGroup
    public void measureChild(@o0 View view, int i7, int i8) {
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public boolean n(int i7) {
        int childCount;
        boolean z6 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f3896d;
        rect.top = 0;
        rect.bottom = height;
        if (z6 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3896d.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3896d;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3896d;
        return G(i7, rect3.top, rect3.bottom);
    }

    public final float o(int i7) {
        double log = Math.log((Math.abs(i7) * 0.35f) / (this.f3894b * 0.015f));
        float f7 = I;
        return (float) (this.f3894b * 0.015f * Math.exp((f7 / (f7 - 1.0d)) * log));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3902j = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@o0 MotionEvent motionEvent) {
        int i7;
        float f7;
        if (motionEvent.getAction() != 8 || this.f3904l) {
            return false;
        }
        if (androidx.core.view.b1.l(motionEvent, 2)) {
            f7 = motionEvent.getAxisValue(9);
            i7 = (int) motionEvent.getX();
        } else if (androidx.core.view.b1.l(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i7 = getWidth() / 2;
            f7 = axisValue;
        } else {
            i7 = 0;
            f7 = 0.0f;
        }
        if (f7 != 0.0f) {
            H(-((int) (f7 * getVerticalScrollFactorCompat())), i7, 1, androidx.core.view.b1.l(motionEvent, 8194));
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@o0 MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action == 2 && this.f3904l) {
            return true;
        }
        int i7 = action & 255;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    int i8 = this.f3911s;
                    if (i8 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i8);
                        if (findPointerIndex == -1) {
                            Log.e(E, "Invalid pointerId=" + i8 + " in onInterceptTouchEvent");
                        } else {
                            int y6 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y6 - this.f3900h) > this.f3908p && (2 & getNestedScrollAxes()) == 0) {
                                this.f3904l = true;
                                this.f3900h = y6;
                                s();
                                this.f3905m.addMovement(motionEvent);
                                this.f3914v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 6) {
                        A(motionEvent);
                    }
                }
            }
            this.f3904l = false;
            this.f3911s = -1;
            D();
            if (this.f3897e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                u1.n1(this);
            }
            stopNestedScroll(0);
        } else {
            int y7 = (int) motionEvent.getY();
            if (p((int) motionEvent.getX(), y7)) {
                this.f3900h = y7;
                this.f3911s = motionEvent.getPointerId(0);
                q();
                this.f3905m.addMovement(motionEvent);
                this.f3897e.computeScrollOffset();
                if (!S(motionEvent) && this.f3897e.isFinished()) {
                    z6 = false;
                }
                this.f3904l = z6;
                startNestedScroll(2, 0);
            } else {
                if (!S(motionEvent) && this.f3897e.isFinished()) {
                    z6 = false;
                }
                this.f3904l = z6;
                D();
            }
        }
        return this.f3904l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        int i11 = 0;
        this.f3901i = false;
        View view = this.f3903k;
        if (view != null && x(view, this)) {
            I(this.f3903k);
        }
        this.f3903k = null;
        if (!this.f3902j) {
            if (this.f3916x != null) {
                scrollTo(getScrollX(), this.f3916x.f3919k);
                this.f3916x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i11 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e7 = e(scrollY, paddingTop, i11);
            if (e7 != scrollY) {
                scrollTo(getScrollX(), e7);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3902j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f3906n && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public boolean onNestedFling(@o0 View view, float f7, float f8, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f8, true);
        m((int) f8);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public boolean onNestedPreFling(@o0 View view, float f7, float f8) {
        return dispatchNestedPreFling(f7, f8);
    }

    @Override // androidx.core.view.g1
    public void onNestedPreScroll(@o0 View view, int i7, int i8, @o0 int[] iArr, int i9) {
        dispatchNestedPreScroll(i7, i8, iArr, null, i9);
    }

    @Override // androidx.core.view.h1
    public void onNestedScroll(@o0 View view, int i7, int i8, int i9, int i10, int i11, @o0 int[] iArr) {
        z(i10, i11, iArr);
    }

    @Override // androidx.core.view.g1
    public void onNestedScrollAccepted(@o0 View view, @o0 View view2, int i7, int i8) {
        this.f3917y.c(view, view2, i7, i8);
        startNestedScroll(2, i8);
    }

    @Override // android.view.View
    public void onOverScrolled(int i7, int i8, boolean z6, boolean z7) {
        super.scrollTo(i7, i8);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i7) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i7);
        if (findNextFocus == null || v(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i7, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f3916x = dVar;
        requestLayout();
    }

    @Override // android.view.View
    @o0
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f3919k = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
        c cVar = this.B;
        if (cVar != null) {
            cVar.a(this, i7, i8, i9, i10);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !y(findFocus, 0, i10)) {
            return;
        }
        findFocus.getDrawingRect(this.f3896d);
        offsetDescendantRectToMyCoords(findFocus, this.f3896d);
        h(f(this.f3896d));
    }

    @Override // androidx.core.view.g1
    public boolean onStartNestedScroll(@o0 View view, @o0 View view2, int i7, int i8) {
        return (i7 & 2) != 0;
    }

    @Override // androidx.core.view.g1
    public void onStopNestedScroll(@o0 View view, int i7) {
        this.f3917y.e(view, i7);
        stopNestedScroll(i7);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@o0 MotionEvent motionEvent) {
        ViewParent parent;
        s();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3914v = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f3914v);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f3905m;
                velocityTracker.computeCurrentVelocity(1000, this.f3910r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f3911s);
                if (Math.abs(yVelocity) >= this.f3909q) {
                    if (!i(yVelocity)) {
                        int i7 = -yVelocity;
                        float f7 = i7;
                        if (!dispatchNestedPreFling(0.0f, f7)) {
                            dispatchNestedFling(0.0f, f7, true);
                            m(i7);
                        }
                    }
                } else if (this.f3897e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    u1.n1(this);
                }
                j();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3911s);
                if (findPointerIndex == -1) {
                    Log.e(E, "Invalid pointerId=" + this.f3911s + " in onTouchEvent");
                } else {
                    int y6 = (int) motionEvent.getY(findPointerIndex);
                    int i8 = this.f3900h - y6;
                    int E2 = i8 - E(i8, motionEvent.getX(findPointerIndex));
                    if (!this.f3904l && Math.abs(E2) > this.f3908p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f3904l = true;
                        E2 = E2 > 0 ? E2 - this.f3908p : E2 + this.f3908p;
                    }
                    if (this.f3904l) {
                        int H2 = H(E2, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f3900h = y6 - H2;
                        this.f3914v += H2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f3904l && getChildCount() > 0 && this.f3897e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    u1.n1(this);
                }
                j();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f3900h = (int) motionEvent.getY(actionIndex);
                this.f3911s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                A(motionEvent);
                this.f3900h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3911s));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f3904l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f3897e.isFinished()) {
                a();
            }
            t((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f3905m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i7, int i8) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i8 >= childAt.getTop() - scrollY && i8 < childAt.getBottom() - scrollY && i7 >= childAt.getLeft() && i7 < childAt.getRight();
        }
        return false;
    }

    public final void q() {
        VelocityTracker velocityTracker = this.f3905m;
        if (velocityTracker == null) {
            this.f3905m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void r() {
        this.f3897e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3908p = viewConfiguration.getScaledTouchSlop();
        this.f3909q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3910r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f3901i) {
            this.f3903k = view2;
        } else {
            I(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@o0 View view, Rect rect, boolean z6) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return J(rect, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        if (z6) {
            D();
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f3901i = true;
        super.requestLayout();
    }

    public final void s() {
        if (this.f3905m == null) {
            this.f3905m = VelocityTracker.obtain();
        }
    }

    @Override // android.view.View
    public void scrollTo(int i7, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int e7 = e(i7, width, width2);
            int e8 = e(i8, height, height2);
            if (e7 == getScrollX() && e8 == getScrollY()) {
                return;
            }
            super.scrollTo(e7, e8);
        }
    }

    public void setFillViewport(boolean z6) {
        if (z6 != this.f3906n) {
            this.f3906n = z6;
            requestLayout();
        }
    }

    @Override // android.view.View, androidx.core.view.e1
    public void setNestedScrollingEnabled(boolean z6) {
        this.f3918z.p(z6);
    }

    public void setOnScrollChangeListener(@q0 c cVar) {
        this.B = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z6) {
        this.f3907o = z6;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.c1
    public boolean startNestedScroll(int i7, int i8) {
        return this.f3918z.s(i7, i8);
    }

    @Override // androidx.core.view.c1
    public void stopNestedScroll(int i7) {
        this.f3918z.u(i7);
    }

    public final void t(int i7, int i8) {
        this.f3900h = i7;
        this.f3911s = i8;
        startNestedScroll(2, 0);
    }

    public boolean u() {
        return this.f3906n;
    }

    public final boolean v(View view) {
        return !y(view, 0, getHeight());
    }

    public boolean w() {
        return this.f3907o;
    }

    public final boolean y(View view, int i7, int i8) {
        view.getDrawingRect(this.f3896d);
        offsetDescendantRectToMyCoords(view, this.f3896d);
        return this.f3896d.bottom + i7 >= getScrollY() && this.f3896d.top - i7 <= getScrollY() + i8;
    }

    public final void z(int i7, int i8, @q0 int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3918z.e(0, scrollY2, 0, i7 - scrollY2, null, i8, iArr);
    }

    public NestedScrollView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0106a.f9637n);
    }

    @Override // android.view.View, androidx.core.view.e1
    public boolean dispatchNestedPreScroll(int i7, int i8, @q0 int[] iArr, @q0 int[] iArr2) {
        return dispatchNestedPreScroll(i7, i8, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.c1
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, @q0 int[] iArr, int i11) {
        return this.f3918z.g(i7, i8, i9, i10, iArr, i11);
    }

    @Override // android.view.View, androidx.core.view.e1
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public void onNestedPreScroll(@o0 View view, int i7, int i8, @o0 int[] iArr) {
        onNestedPreScroll(view, i7, i8, iArr, 0);
    }

    @Override // androidx.core.view.g1
    public void onNestedScroll(@o0 View view, int i7, int i8, int i9, int i10, int i11) {
        z(i10, i11, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public boolean onStartNestedScroll(@o0 View view, @o0 View view2, int i7) {
        return onStartNestedScroll(view, view2, i7, 0);
    }

    @Override // android.view.View, androidx.core.view.e1
    public boolean startNestedScroll(int i7) {
        return startNestedScroll(i7, 0);
    }

    @Override // android.view.View, androidx.core.view.e1
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public NestedScrollView(@o0 Context context, @q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f3896d = new Rect();
        this.f3901i = true;
        this.f3902j = false;
        this.f3903k = null;
        this.f3904l = false;
        this.f3907o = true;
        this.f3911s = -1;
        this.f3912t = new int[2];
        this.f3913u = new int[2];
        this.f3898f = j.a(context, attributeSet);
        this.f3899g = j.a(context, attributeSet);
        this.f3894b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        r();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M, i7, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3917y = new j1(this);
        this.f3918z = new f1(this);
        setNestedScrollingEnabled(true);
        u1.B1(this, L);
    }

    @Override // android.view.View, androidx.core.view.e1
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, @q0 int[] iArr) {
        return this.f3918z.f(i7, i8, i9, i10, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public void onNestedScroll(@o0 View view, int i7, int i8, int i9, int i10) {
        z(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public void onNestedScrollAccepted(@o0 View view, @o0 View view2, int i7) {
        onNestedScrollAccepted(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public void onStopNestedScroll(@o0 View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7) {
        if (getChildCount() <= 0) {
            super.addView(view, i7);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
