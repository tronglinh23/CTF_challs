package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.e1;
import androidx.core.view.h4;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import d.b1;
import d.d0;
import d.l;
import d.l1;
import d.o0;
import d.q0;
import d.r;
import d.v;
import d.w0;
import g1.n;
import h1.f0;
import h1.q0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private static final int DEF_STYLE_RES = R.style.Widget_Design_AppBarLayout;
    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE = 0;
    private final float appBarElevation;
    private Behavior behavior;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private boolean haveChildWithInterpolator;
    @q0
    private h4 lastInsets;
    private boolean liftOnScroll;
    @q0
    private final ColorStateList liftOnScrollColor;
    @q0
    private ValueAnimator liftOnScrollColorAnimator;
    private final long liftOnScrollColorDuration;
    private final TimeInterpolator liftOnScrollColorInterpolator;
    @q0
    private ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    private final List<LiftOnScrollListener> liftOnScrollListeners;
    @q0
    private WeakReference<View> liftOnScrollTargetView;
    @d0
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List<BaseOnOffsetChangedListener> listeners;
    private int pendingAction;
    @q0
    private Drawable statusBarForeground;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        private static final double EXPAND_BY_KEY_EVENT_THRESHOLD_PERCENTAGE = 0.1d;
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        private boolean coordinatorLayoutA11yScrollable;
        @q0
        private WeakReference<View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        private int offsetDelta;
        private BaseDragCallback onDragCallback;
        private SavedState savedState;

        /* loaded from: classes.dex */
        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            public abstract boolean canDrag(@o0 T t6);
        }

        public BaseBehavior() {
        }

        private boolean addAccessibilityScrollActions(final CoordinatorLayout coordinatorLayout, @o0 final T t6, @o0 final View view) {
            boolean z6 = false;
            if (getTopBottomOffsetForScrollingSibling() != (-t6.getTotalScrollRange())) {
                addActionToExpand(coordinatorLayout, t6, f0.a.f10220r, false);
                z6 = true;
            }
            if (getTopBottomOffsetForScrollingSibling() != 0) {
                if (!view.canScrollVertically(-1)) {
                    addActionToExpand(coordinatorLayout, t6, f0.a.f10221s, true);
                    return true;
                }
                final int i7 = -t6.getDownNestedPreScrollRange();
                if (i7 != 0) {
                    u1.u1(coordinatorLayout, f0.a.f10221s, null, new h1.q0() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.3
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // h1.q0
                        public boolean perform(@o0 View view2, @q0 q0.a aVar) {
                            BaseBehavior.this.onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) t6, view, 0, i7, new int[]{0, 0}, 1);
                            return true;
                        }
                    });
                    return true;
                }
            }
            return z6;
        }

        private void addActionToExpand(CoordinatorLayout coordinatorLayout, @o0 final T t6, @o0 f0.a aVar, final boolean z6) {
            u1.u1(coordinatorLayout, aVar, null, new h1.q0() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.4
                @Override // h1.q0
                public boolean perform(@o0 View view, @d.q0 q0.a aVar2) {
                    t6.setExpanded(z6);
                    return true;
                }
            });
        }

        private void animateOffsetTo(CoordinatorLayout coordinatorLayout, @o0 T t6, int i7, float f7) {
            int abs = Math.abs(getTopBottomOffsetForScrollingSibling() - i7);
            float abs2 = Math.abs(f7);
            animateOffsetWithDuration(coordinatorLayout, t6, i7, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t6.getHeight()) + 1.0f) * 150.0f));
        }

        private void animateOffsetWithDuration(final CoordinatorLayout coordinatorLayout, final T t6, int i7, int i8) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            if (topBottomOffsetForScrollingSibling == i7) {
                ValueAnimator valueAnimator = this.offsetAnimator;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.offsetAnimator.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.offsetAnimator;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.offsetAnimator = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                this.offsetAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(@o0 ValueAnimator valueAnimator4) {
                        BaseBehavior.this.setHeaderTopBottomOffset(coordinatorLayout, t6, ((Integer) valueAnimator4.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.offsetAnimator.setDuration(Math.min(i8, 600));
            this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i7);
            this.offsetAnimator.start();
        }

        private int calculateSnapOffset(int i7, int i8, int i9) {
            return i7 < (i8 + i9) / 2 ? i8 : i9;
        }

        private boolean canScrollChildren(@o0 CoordinatorLayout coordinatorLayout, @o0 T t6, @o0 View view) {
            return t6.hasScrollableChildren() && coordinatorLayout.getHeight() - view.getHeight() <= t6.getHeight();
        }

        private static boolean checkFlag(int i7, int i8) {
            return (i7 & i8) == i8;
        }

        private boolean childrenHaveScrollFlags(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                if (((LayoutParams) appBarLayout.getChildAt(i7).getLayoutParams()).scrollFlags != 0) {
                    return true;
                }
            }
            return false;
        }

        private void controlExpansionOnKeyPress(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                    if (view.getScrollY() < view.getMeasuredHeight() * EXPAND_BY_KEY_EVENT_THRESHOLD_PERCENTAGE) {
                        appBarLayout.setExpanded(true);
                    }
                } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                    appBarLayout.setExpanded(false);
                }
            }
        }

        @d.q0
        private View findFirstScrollingChild(@o0 CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if ((childAt instanceof e1) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @d.q0
        private static View getAppBarChildOnOffset(@o0 AppBarLayout appBarLayout, int i7) {
            int abs = Math.abs(i7);
            int childCount = appBarLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = appBarLayout.getChildAt(i8);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int getChildIndexOnOffset(@o0 T t6, int i7) {
            int childCount = t6.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = t6.getChildAt(i8);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (checkFlag(layoutParams.getScrollFlags(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i9 = -i7;
                if (top <= i9 && bottom >= i9) {
                    return i8;
                }
            }
            return -1;
        }

        @d.q0
        private View getChildWithScrollingBehavior(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if (((CoordinatorLayout.g) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int interpolateOffset(@o0 T t6, int i7) {
            int abs = Math.abs(i7);
            int childCount = t6.getChildCount();
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= childCount) {
                    break;
                }
                View childAt = t6.getChildAt(i9);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i9++;
                } else if (scrollInterpolator != null) {
                    int scrollFlags = layoutParams.getScrollFlags();
                    if ((scrollFlags & 1) != 0) {
                        i8 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if ((scrollFlags & 2) != 0) {
                            i8 -= u1.e0(childAt);
                        }
                    }
                    if (u1.U(childAt)) {
                        i8 -= t6.getTopInset();
                    }
                    if (i8 > 0) {
                        float f7 = i8;
                        return Integer.signum(i7) * (childAt.getTop() + Math.round(f7 * scrollInterpolator.getInterpolation((abs - childAt.getTop()) / f7)));
                    }
                }
            }
            return i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$onLayoutChild$0(View view, AppBarLayout appBarLayout, View view2, KeyEvent keyEvent) {
            controlExpansionOnKeyPress(keyEvent, view, appBarLayout);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$onLayoutChild$1(View view, AppBarLayout appBarLayout, View view2, int i7, KeyEvent keyEvent) {
            controlExpansionOnKeyPress(keyEvent, view, appBarLayout);
            return false;
        }

        private boolean shouldJumpElevationState(@o0 CoordinatorLayout coordinatorLayout, @o0 T t6) {
            List<View> dependents = coordinatorLayout.getDependents(t6);
            int size = dependents.size();
            for (int i7 = 0; i7 < size; i7++) {
                CoordinatorLayout.c f7 = ((CoordinatorLayout.g) dependents.get(i7).getLayoutParams()).f();
                if (f7 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f7).getOverlayTop() != 0;
                }
            }
            return false;
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, @o0 T t6) {
            int topInset = t6.getTopInset() + t6.getPaddingTop();
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling() - topInset;
            int childIndexOnOffset = getChildIndexOnOffset(t6, topBottomOffsetForScrollingSibling);
            if (childIndexOnOffset >= 0) {
                View childAt = t6.getChildAt(childIndexOnOffset);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int scrollFlags = layoutParams.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int i7 = -childAt.getTop();
                    int i8 = -childAt.getBottom();
                    if (childIndexOnOffset == 0 && u1.U(t6) && u1.U(childAt)) {
                        i7 -= t6.getTopInset();
                    }
                    if (checkFlag(scrollFlags, 2)) {
                        i8 += u1.e0(childAt);
                    } else if (checkFlag(scrollFlags, 5)) {
                        int e02 = u1.e0(childAt) + i8;
                        if (topBottomOffsetForScrollingSibling < e02) {
                            i7 = e02;
                        } else {
                            i8 = e02;
                        }
                    }
                    if (checkFlag(scrollFlags, 32)) {
                        i7 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        i8 -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    animateOffsetTo(coordinatorLayout, t6, x0.a.e(calculateSnapOffset(topBottomOffsetForScrollingSibling, i8, i7) + topInset, -t6.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void updateAccessibilityActions(CoordinatorLayout coordinatorLayout, @o0 T t6) {
            View childWithScrollingBehavior;
            u1.r1(coordinatorLayout, f0.a.f10220r.b());
            u1.r1(coordinatorLayout, f0.a.f10221s.b());
            if (t6.getTotalScrollRange() == 0 || (childWithScrollingBehavior = getChildWithScrollingBehavior(coordinatorLayout)) == null || !childrenHaveScrollFlags(t6)) {
                return;
            }
            if (!u1.G0(coordinatorLayout)) {
                u1.B1(coordinatorLayout, new androidx.core.view.a() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                    @Override // androidx.core.view.a
                    public void onInitializeAccessibilityNodeInfo(View view, @o0 f0 f0Var) {
                        super.onInitializeAccessibilityNodeInfo(view, f0Var);
                        f0Var.M1(BaseBehavior.this.coordinatorLayoutA11yScrollable);
                        f0Var.b1(ScrollView.class.getName());
                    }
                });
            }
            this.coordinatorLayoutA11yScrollable = addAccessibilityScrollActions(coordinatorLayout, t6, childWithScrollingBehavior);
        }

        private void updateAppBarLayoutDrawableState(@o0 CoordinatorLayout coordinatorLayout, @o0 T t6, int i7, int i8, boolean z6) {
            View appBarChildOnOffset = getAppBarChildOnOffset(t6, i7);
            boolean z7 = false;
            if (appBarChildOnOffset != null) {
                int scrollFlags = ((LayoutParams) appBarChildOnOffset.getLayoutParams()).getScrollFlags();
                if ((scrollFlags & 1) != 0) {
                    int e02 = u1.e0(appBarChildOnOffset);
                    if (i8 <= 0 || (scrollFlags & 12) == 0 ? !((scrollFlags & 2) == 0 || (-i7) < (appBarChildOnOffset.getBottom() - e02) - t6.getTopInset()) : (-i7) >= (appBarChildOnOffset.getBottom() - e02) - t6.getTopInset()) {
                        z7 = true;
                    }
                }
            }
            if (t6.isLiftOnScroll()) {
                z7 = t6.shouldLift(findFirstScrollingChild(coordinatorLayout));
            }
            boolean liftedState = t6.setLiftedState(z7);
            if (z6 || (liftedState && shouldJumpElevationState(coordinatorLayout, t6))) {
                t6.jumpDrawablesToCurrentState();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public /* bridge */ /* synthetic */ boolean canDragView(View view) {
            return canDragView((BaseBehavior<T>) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public /* bridge */ /* synthetic */ int getMaxDragOffset(@o0 View view) {
            return getMaxDragOffset((BaseBehavior<T>) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public /* bridge */ /* synthetic */ int getScrollRangeForDragFling(@o0 View view) {
            return getScrollRangeForDragFling((BaseBehavior<T>) ((AppBarLayout) view));
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        @l1
        public boolean isOffsetAnimatorRunning() {
            ValueAnimator valueAnimator = this.offsetAnimator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public /* bridge */ /* synthetic */ void onFlingFinished(@o0 CoordinatorLayout coordinatorLayout, @o0 View view) {
            onFlingFinished(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i7) {
            return onLayoutChild(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i7, int i8, int i9, int i10) {
            return onMeasureChild(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i7, i8, i9, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @o0 View view, View view2, int i7, int i8, int[] iArr, int i9) {
            onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i7, i8, iArr, i9);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @o0 View view, View view2, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
            onNestedScroll(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i7, i8, i9, i10, i11, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, Parcelable parcelable) {
            onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), parcelable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@o0 CoordinatorLayout coordinatorLayout, @o0 View view) {
            return onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 View view2, View view3, int i7, int i8) {
            return onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, view3, i7, i8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @o0 View view, View view2, int i7) {
            onStopNestedScroll(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i7);
        }

        public void restoreScrollState(@d.q0 SavedState savedState, boolean z6) {
            if (this.savedState == null || z6) {
                this.savedState = savedState;
            }
        }

        @d.q0
        public SavedState saveScrollState(@d.q0 Parcelable parcelable, @o0 T t6) {
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t6.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = t6.getChildAt(i7);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = o1.a.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z6 = topAndBottomOffset == 0;
                    savedState.fullyExpanded = z6;
                    savedState.fullyScrolled = !z6 && (-topAndBottomOffset) >= t6.getTotalScrollRange();
                    savedState.firstVisibleChildIndex = i7;
                    savedState.firstVisibleChildAtMinimumHeight = bottom == u1.e0(childAt) + t6.getTopInset();
                    savedState.firstVisibleChildPercentageShown = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public void setDragCallback(@d.q0 BaseDragCallback baseDragCallback) {
            this.onDragCallback = baseDragCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public /* bridge */ /* synthetic */ int setHeaderTopBottomOffset(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i7, int i8, int i9) {
            return setHeaderTopBottomOffset(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i7, i8, i9);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean canDragView(T t6) {
            BaseDragCallback baseDragCallback = this.onDragCallback;
            if (baseDragCallback != null) {
                return baseDragCallback.canDrag(t6);
            }
            WeakReference<View> weakReference = this.lastNestedScrollingChildRef;
            if (weakReference != null) {
                View view = weakReference.get();
                return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        public int getMaxDragOffset(@o0 T t6) {
            return -t6.getDownNestedScrollRange();
        }

        public int getScrollRangeForDragFling(@o0 T t6) {
            return t6.getTotalScrollRange();
        }

        public void onFlingFinished(@o0 CoordinatorLayout coordinatorLayout, @o0 T t6) {
            snapToChildIfNeeded(coordinatorLayout, t6);
            if (t6.isLiftOnScroll()) {
                t6.setLiftedState(t6.shouldLift(findFirstScrollingChild(coordinatorLayout)));
            }
        }

        public boolean onLayoutChild(@o0 CoordinatorLayout coordinatorLayout, @o0 final T t6, int i7) {
            int round;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) t6, i7);
            int pendingAction = t6.getPendingAction();
            SavedState savedState = this.savedState;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z6 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i8 = -t6.getUpNestedPreScrollRange();
                        if (z6) {
                            animateOffsetTo(coordinatorLayout, t6, i8, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t6, i8);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z6) {
                            animateOffsetTo(coordinatorLayout, t6, 0, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t6, 0);
                        }
                    }
                }
            } else if (savedState.fullyScrolled) {
                setHeaderTopBottomOffset(coordinatorLayout, t6, -t6.getTotalScrollRange());
            } else if (savedState.fullyExpanded) {
                setHeaderTopBottomOffset(coordinatorLayout, t6, 0);
            } else {
                View childAt = t6.getChildAt(savedState.firstVisibleChildIndex);
                int i9 = -childAt.getBottom();
                if (this.savedState.firstVisibleChildAtMinimumHeight) {
                    round = u1.e0(childAt) + t6.getTopInset();
                } else {
                    round = Math.round(childAt.getHeight() * this.savedState.firstVisibleChildPercentageShown);
                }
                setHeaderTopBottomOffset(coordinatorLayout, t6, i9 + round);
            }
            t6.resetPendingAction();
            this.savedState = null;
            setTopAndBottomOffset(x0.a.e(getTopAndBottomOffset(), -t6.getTotalScrollRange(), 0));
            updateAppBarLayoutDrawableState(coordinatorLayout, t6, getTopAndBottomOffset(), 0, true);
            t6.onOffsetChanged(getTopAndBottomOffset());
            updateAccessibilityActions(coordinatorLayout, t6);
            final View findFirstScrollingChild = findFirstScrollingChild(coordinatorLayout);
            if (findFirstScrollingChild != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    findFirstScrollingChild.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: com.google.android.material.appbar.c
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
                            boolean lambda$onLayoutChild$0;
                            lambda$onLayoutChild$0 = AppBarLayout.BaseBehavior.this.lambda$onLayoutChild$0(findFirstScrollingChild, t6, view, keyEvent);
                            return lambda$onLayoutChild$0;
                        }
                    });
                } else {
                    findFirstScrollingChild.setOnKeyListener(new View.OnKeyListener() { // from class: com.google.android.material.appbar.d
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                            boolean lambda$onLayoutChild$1;
                            lambda$onLayoutChild$1 = AppBarLayout.BaseBehavior.this.lambda$onLayoutChild$1(findFirstScrollingChild, t6, view, i10, keyEvent);
                            return lambda$onLayoutChild$1;
                        }
                    });
                }
            }
            return onLayoutChild;
        }

        public boolean onMeasureChild(@o0 CoordinatorLayout coordinatorLayout, @o0 T t6, int i7, int i8, int i9, int i10) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) t6.getLayoutParams())).height == -2) {
                coordinatorLayout.onMeasureChild(t6, i7, i8, View.MeasureSpec.makeMeasureSpec(0, 0), i10);
                return true;
            }
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) t6, i7, i8, i9, i10);
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @o0 T t6, View view, int i7, int i8, int[] iArr, int i9) {
            int i10;
            int i11;
            if (i8 != 0) {
                if (i8 < 0) {
                    i10 = -t6.getTotalScrollRange();
                    i11 = t6.getDownNestedPreScrollRange() + i10;
                } else {
                    i10 = -t6.getUpNestedPreScrollRange();
                    i11 = 0;
                }
                int i12 = i10;
                int i13 = i11;
                if (i12 != i13) {
                    iArr[1] = scroll(coordinatorLayout, t6, i8, i12, i13);
                }
            }
            if (t6.isLiftOnScroll()) {
                t6.setLiftedState(t6.shouldLift(view));
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @o0 T t6, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
            if (i10 < 0) {
                iArr[1] = scroll(coordinatorLayout, t6, i10, -t6.getDownNestedScrollRange(), 0);
            }
            if (i10 == 0) {
                updateAccessibilityActions(coordinatorLayout, t6);
            }
        }

        public void onRestoreInstanceState(@o0 CoordinatorLayout coordinatorLayout, @o0 T t6, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                restoreScrollState((SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) t6, this.savedState.getSuperState());
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) t6, parcelable);
            this.savedState = null;
        }

        public Parcelable onSaveInstanceState(@o0 CoordinatorLayout coordinatorLayout, @o0 T t6) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) t6);
            SavedState saveScrollState = saveScrollState(onSaveInstanceState, t6);
            return saveScrollState == null ? onSaveInstanceState : saveScrollState;
        }

        public boolean onStartNestedScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 T t6, @o0 View view, View view2, int i7, int i8) {
            ValueAnimator valueAnimator;
            boolean z6 = (i7 & 2) != 0 && (t6.isLiftOnScroll() || canScrollChildren(coordinatorLayout, t6, view));
            if (z6 && (valueAnimator = this.offsetAnimator) != null) {
                valueAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = i8;
            return z6;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @o0 T t6, View view, int i7) {
            if (this.lastStartedType == 0 || i7 == 1) {
                snapToChildIfNeeded(coordinatorLayout, t6);
                if (t6.isLiftOnScroll()) {
                    t6.setLiftedState(t6.shouldLift(view));
                }
            }
            this.lastNestedScrollingChildRef = new WeakReference<>(view);
        }

        public int setHeaderTopBottomOffset(@o0 CoordinatorLayout coordinatorLayout, @o0 T t6, int i7, int i8, int i9) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int i10 = 0;
            if (i8 != 0 && topBottomOffsetForScrollingSibling >= i8 && topBottomOffsetForScrollingSibling <= i9) {
                int e7 = x0.a.e(i7, i8, i9);
                if (topBottomOffsetForScrollingSibling != e7) {
                    int interpolateOffset = t6.hasChildWithInterpolator() ? interpolateOffset(t6, e7) : e7;
                    boolean topAndBottomOffset = setTopAndBottomOffset(interpolateOffset);
                    int i11 = topBottomOffsetForScrollingSibling - e7;
                    this.offsetDelta = e7 - interpolateOffset;
                    if (topAndBottomOffset) {
                        while (i10 < t6.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) t6.getChildAt(i10).getLayoutParams();
                            ChildScrollEffect scrollEffect = layoutParams.getScrollEffect();
                            if (scrollEffect != null && (layoutParams.getScrollFlags() & 1) != 0) {
                                scrollEffect.onOffsetChanged(t6, t6.getChildAt(i10), getTopAndBottomOffset());
                            }
                            i10++;
                        }
                    }
                    if (!topAndBottomOffset && t6.hasChildWithInterpolator()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t6);
                    }
                    t6.onOffsetChanged(getTopAndBottomOffset());
                    updateAppBarLayoutDrawableState(coordinatorLayout, t6, e7, e7 < topBottomOffsetForScrollingSibling ? -1 : 1, false);
                    i10 = i11;
                }
            } else {
                this.offsetDelta = 0;
            }
            updateAccessibilityActions(coordinatorLayout, t6);
            return i10;
        }

        /* loaded from: classes.dex */
        public static class SavedState extends o1.a {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.1
                @Override // android.os.Parcelable.Creator
                @o0
                public SavedState[] newArray(int i7) {
                    return new SavedState[i7];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                @o0
                public SavedState createFromParcel(@o0 Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @d.q0
                public SavedState createFromParcel(@o0 Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            };
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;
            boolean fullyExpanded;
            boolean fullyScrolled;

            public SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.fullyScrolled = parcel.readByte() != 0;
                this.fullyExpanded = parcel.readByte() != 0;
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != 0;
            }

            @Override // o1.a, android.os.Parcelable
            public void writeToParcel(@o0 Parcel parcel, int i7) {
                super.writeToParcel(parcel, i7);
                parcel.writeByte(this.fullyScrolled ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.fullyExpanded ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void onOffsetChanged(T t6, int i7);
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* loaded from: classes.dex */
        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@o0 CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, int i7) {
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i7);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@o0 CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, int i7, int i8, int i9, int i10) {
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i7, i8, i9, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, View view, int i7, int i8, int[] iArr, int i9) {
            super.onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i7, i8, iArr, i9);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i7, i8, i9, i10, i11, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@o0 CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@o0 CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, @o0 View view, View view2, int i7, int i8) {
            return super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, view2, i7, i8);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, View view, int i7) {
            super.onStopNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i7);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onTouchEvent(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(@d.q0 BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z6) {
            super.setHorizontalOffsetEnabled(z6);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i7) {
            return super.setLeftAndRightOffset(i7);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i7) {
            return super.setTopAndBottomOffset(i7);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z6) {
            super.setVerticalOffsetEnabled(z6);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(@o0 AppBarLayout appBarLayout, @o0 View view, float f7);
    }

    /* loaded from: classes.dex */
    public static class CompressChildScrollEffect extends ChildScrollEffect {
        private static final float COMPRESS_DISTANCE_FACTOR = 0.3f;
        private final Rect relativeRect = new Rect();
        private final Rect ghostRect = new Rect();

        private static void updateRelativeRect(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        public void onOffsetChanged(@o0 AppBarLayout appBarLayout, @o0 View view, float f7) {
            updateRelativeRect(this.relativeRect, appBarLayout, view);
            float abs = this.relativeRect.top - Math.abs(f7);
            if (abs > 0.0f) {
                u1.M1(view, null);
                view.setTranslationY(0.0f);
                return;
            }
            float d7 = 1.0f - x0.a.d(Math.abs(abs / this.relativeRect.height()), 0.0f, 1.0f);
            float height = (-abs) - ((this.relativeRect.height() * COMPRESS_DISTANCE_FACTOR) * (1.0f - (d7 * d7)));
            view.setTranslationY(height);
            view.getDrawingRect(this.ghostRect);
            this.ghostRect.offset(0, (int) (-height));
            u1.M1(view, this.ghostRect);
        }
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams {
        static final int COLLAPSIBLE_FLAGS = 10;
        static final int FLAG_QUICK_RETURN = 5;
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        private ChildScrollEffect scrollEffect;
        int scrollFlags;
        Interpolator scrollInterpolator;

        @b1({b1.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface ScrollEffect {
        }

        @b1({b1.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.scrollFlags = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
            this.scrollFlags = obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            setScrollEffect(obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            if (obtainStyledAttributes.hasValue(R.styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.scrollInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(R.styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        @d.q0
        private ChildScrollEffect createScrollEffectFromInt(int i7) {
            if (i7 != 1) {
                return null;
            }
            return new CompressChildScrollEffect();
        }

        @d.q0
        public ChildScrollEffect getScrollEffect() {
            return this.scrollEffect;
        }

        public int getScrollFlags() {
            return this.scrollFlags;
        }

        public Interpolator getScrollInterpolator() {
            return this.scrollInterpolator;
        }

        public boolean isCollapsible() {
            int i7 = this.scrollFlags;
            return (i7 & 1) == 1 && (i7 & 10) != 0;
        }

        public void setScrollEffect(@d.q0 ChildScrollEffect childScrollEffect) {
            this.scrollEffect = childScrollEffect;
        }

        public void setScrollFlags(int i7) {
            this.scrollFlags = i7;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.scrollInterpolator = interpolator;
        }

        public void setScrollEffect(int i7) {
            this.scrollEffect = createScrollEffectFromInt(i7);
        }

        public LayoutParams(int i7, int i8) {
            super(i7, i8);
            this.scrollFlags = 1;
        }

        public LayoutParams(int i7, int i8, float f7) {
            super(i7, i8, f7);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.scrollFlags = 1;
        }

        @w0(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        @w0(19)
        public LayoutParams(@o0 LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.scrollFlags = 1;
            this.scrollFlags = layoutParams.scrollFlags;
            this.scrollEffect = layoutParams.scrollEffect;
            this.scrollInterpolator = layoutParams.scrollInterpolator;
        }
    }

    /* loaded from: classes.dex */
    public interface LiftOnScrollListener {
        void onUpdate(@r float f7, @l int i7);
    }

    /* loaded from: classes.dex */
    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(AppBarLayout appBarLayout, int i7);
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        private static int getAppBarLayoutOffset(@o0 AppBarLayout appBarLayout) {
            CoordinatorLayout.c f7 = ((CoordinatorLayout.g) appBarLayout.getLayoutParams()).f();
            if (f7 instanceof BaseBehavior) {
                return ((BaseBehavior) f7).getTopBottomOffsetForScrollingSibling();
            }
            return 0;
        }

        private void offsetChildAsNeeded(@o0 View view, @o0 View view2) {
            CoordinatorLayout.c f7 = ((CoordinatorLayout.g) view2.getLayoutParams()).f();
            if (f7 instanceof BaseBehavior) {
                u1.f1(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f7).offsetDelta) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2));
            }
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @d.q0
        public /* bridge */ /* synthetic */ View findFirstDependency(@o0 List list) {
            return findFirstDependency((List<View>) list);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public float getOverlapRatioForOffset(View view) {
            int i7;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + appBarLayoutOffset > downNestedPreScrollRange) && (i7 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (appBarLayoutOffset / i7) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public int getScrollRange(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.getScrollRange(view);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onDependentViewRemoved(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 View view2) {
            if (view2 instanceof AppBarLayout) {
                u1.r1(coordinatorLayout, f0.a.f10220r.b());
                u1.r1(coordinatorLayout, f0.a.f10221s.b());
                u1.B1(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i7) {
            return super.onLayoutChild(coordinatorLayout, view, i7);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i7, int i8, int i9, int i10) {
            return super.onMeasureChild(coordinatorLayout, view, i7, i8, i9, i10);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onRequestChildRectangleOnScreen(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 Rect rect, boolean z6) {
            AppBarLayout findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
            if (findFirstDependency != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.tempRect1;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    findFirstDependency.setExpanded(false, !z6);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z6) {
            super.setHorizontalOffsetEnabled(z6);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i7) {
            return super.setLeftAndRightOffset(i7);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i7) {
            return super.setTopAndBottomOffset(i7);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z6) {
            super.setVerticalOffsetEnabled(z6);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Layout);
            setOverlayTop(obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @d.q0
        public AppBarLayout findFirstDependency(@o0 List<View> list) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = list.get(i7);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    public AppBarLayout(@o0 Context context) {
        this(context, null);
    }

    private void clearLiftOnScrollTargetView() {
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    @d.q0
    private View findLiftOnScrollTargetView(@d.q0 View view) {
        int i7;
        if (this.liftOnScrollTargetView == null && (i7 = this.liftOnScrollTargetViewId) != -1) {
            View findViewById = view != null ? view.findViewById(i7) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (findViewById != null) {
                this.liftOnScrollTargetView = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean hasCollapsibleChild() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (((LayoutParams) getChildAt(i7).getLayoutParams()).isCollapsible()) {
                return true;
            }
        }
        return false;
    }

    private void initializeLiftOnScrollWithColor(final MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.setAlpha(this.lifted ? 255 : 0);
        materialShapeDrawable.setFillColor(this.liftOnScrollColor);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.lambda$initializeLiftOnScrollWithColor$0(materialShapeDrawable, valueAnimator);
            }
        };
    }

    private void initializeLiftOnScrollWithElevation(Context context, final MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.initializeElevationOverlay(context);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.lambda$initializeLiftOnScrollWithElevation$1(materialShapeDrawable, valueAnimator);
            }
        };
    }

    private void invalidateScrollRanges() {
        Behavior behavior = this.behavior;
        BaseBehavior.SavedState saveScrollState = (behavior == null || this.totalScrollRange == -1 || this.pendingAction != 0) ? null : behavior.saveScrollState(o1.a.EMPTY_STATE, this);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        if (saveScrollState != null) {
            this.behavior.restoreScrollState(saveScrollState, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithColor$0(MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setAlpha(floatValue);
        for (LiftOnScrollListener liftOnScrollListener : this.liftOnScrollListeners) {
            if (materialShapeDrawable.getFillColor() != null) {
                liftOnScrollListener.onUpdate(0.0f, materialShapeDrawable.getFillColor().withAlpha(floatValue).getDefaultColor());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithElevation$1(MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setElevation(floatValue);
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(floatValue);
        }
        Iterator<LiftOnScrollListener> it = this.liftOnScrollListeners.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(floatValue, materialShapeDrawable.getResolvedTintColor());
        }
    }

    private boolean setLiftableState(boolean z6) {
        if (this.liftable != z6) {
            this.liftable = z6;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    private boolean shouldDrawStatusBarForeground() {
        return this.statusBarForeground != null && getTopInset() > 0;
    }

    private boolean shouldOffsetFirstChild() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return (childAt.getVisibility() == 8 || u1.U(childAt)) ? false : true;
        }
        return false;
    }

    private void startLiftOnScrollColorAnimation(float f7, float f8) {
        ValueAnimator valueAnimator = this.liftOnScrollColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f8);
        this.liftOnScrollColorAnimator = ofFloat;
        ofFloat.setDuration(this.liftOnScrollColorDuration);
        this.liftOnScrollColorAnimator.setInterpolator(this.liftOnScrollColorInterpolator);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.liftOnScrollColorUpdateListener;
        if (animatorUpdateListener != null) {
            this.liftOnScrollColorAnimator.addUpdateListener(animatorUpdateListener);
        }
        this.liftOnScrollColorAnimator.start();
    }

    private void updateWillNotDraw() {
        setWillNotDraw(!shouldDrawStatusBarForeground());
    }

    public void addLiftOnScrollListener(@o0 LiftOnScrollListener liftOnScrollListener) {
        this.liftOnScrollListeners.add(liftOnScrollListener);
    }

    public void addOnOffsetChangedListener(@d.q0 BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        if (this.listeners == null) {
            this.listeners = new ArrayList();
        }
        if (baseOnOffsetChangedListener == null || this.listeners.contains(baseOnOffsetChangedListener)) {
            return;
        }
        this.listeners.add(baseOnOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void clearLiftOnScrollListener() {
        this.liftOnScrollListeners.clear();
    }

    @Override // android.view.View
    public void draw(@o0 Canvas canvas) {
        super.draw(canvas);
        if (shouldDrawStatusBarForeground()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.currentOffset);
            this.statusBarForeground.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarForeground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @o0
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.behavior = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i7;
        int e02;
        int i8 = this.downPreScrollRange;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i10 = layoutParams.scrollFlags;
                if ((i10 & 5) == 5) {
                    int i11 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i10 & 8) != 0) {
                        e02 = u1.e0(childAt);
                    } else if ((i10 & 2) != 0) {
                        e02 = measuredHeight - u1.e0(childAt);
                    } else {
                        i7 = i11 + measuredHeight;
                        if (childCount == 0 && u1.U(childAt)) {
                            i7 = Math.min(i7, measuredHeight - getTopInset());
                        }
                        i9 += i7;
                    }
                    i7 = i11 + e02;
                    if (childCount == 0) {
                        i7 = Math.min(i7, measuredHeight - getTopInset());
                    }
                    i9 += i7;
                } else if (i9 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i9);
        this.downPreScrollRange = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i7 = this.downScrollRange;
        if (i7 != -1) {
            return i7;
        }
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int i10 = layoutParams.scrollFlags;
                if ((i10 & 1) == 0) {
                    break;
                }
                i9 += measuredHeight;
                if ((i10 & 2) != 0) {
                    i9 -= u1.e0(childAt);
                    break;
                }
            }
            i8++;
        }
        int max = Math.max(0, i9);
        this.downScrollRange = max;
        return max;
    }

    @d0
    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int e02 = u1.e0(this);
        if (e02 == 0) {
            int childCount = getChildCount();
            e02 = childCount >= 1 ? u1.e0(getChildAt(childCount - 1)) : 0;
            if (e02 == 0) {
                return getHeight() / 3;
            }
        }
        return (e02 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.pendingAction;
    }

    @d.q0
    public Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @l1
    public final int getTopInset() {
        h4 h4Var = this.lastInsets;
        if (h4Var != null) {
            return h4Var.r();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i7 = this.totalScrollRange;
        if (i7 != -1) {
            return i7;
        }
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i10 = layoutParams.scrollFlags;
                if ((i10 & 1) == 0) {
                    break;
                }
                i9 += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if (i8 == 0 && u1.U(childAt)) {
                    i9 -= getTopInset();
                }
                if ((i10 & 2) != 0) {
                    i9 -= u1.e0(childAt);
                    break;
                }
            }
            i8++;
        }
        int max = Math.max(0, i9);
        this.totalScrollRange = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    public boolean hasScrollableChildren() {
        return getTotalScrollRange() != 0;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public boolean isLifted() {
        return this.lifted;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i7) {
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + iArr.length);
        boolean z6 = this.liftable;
        int i8 = R.attr.state_liftable;
        if (!z6) {
            i8 = -i8;
        }
        iArr[0] = i8;
        iArr[1] = (z6 && this.lifted) ? R.attr.state_lifted : -R.attr.state_lifted;
        int i9 = R.attr.state_collapsible;
        if (!z6) {
            i9 = -i9;
        }
        iArr[2] = i9;
        iArr[3] = (z6 && this.lifted) ? R.attr.state_collapsed : -R.attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearLiftOnScrollTargetView();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        boolean z7 = true;
        if (u1.U(this) && shouldOffsetFirstChild()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                u1.f1(getChildAt(childCount), topInset);
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int childCount2 = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i11).getLayoutParams()).getScrollInterpolator() != null) {
                this.haveChildWithInterpolator = true;
                break;
            } else {
                i11++;
            }
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.liftableOverride) {
            return;
        }
        if (!this.liftOnScroll && !hasCollapsibleChild()) {
            z7 = false;
        }
        setLiftableState(z7);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i8);
        if (mode != 1073741824 && u1.U(this) && shouldOffsetFirstChild()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = x0.a.e(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i8));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        invalidateScrollRanges();
    }

    public void onOffsetChanged(int i7) {
        this.currentOffset = i7;
        if (!willNotDraw()) {
            u1.n1(this);
        }
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = this.listeners.get(i8);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.onOffsetChanged(this, i7);
                }
            }
        }
    }

    public h4 onWindowInsetChanged(h4 h4Var) {
        h4 h4Var2 = u1.U(this) ? h4Var : null;
        if (!n.a(this.lastInsets, h4Var2)) {
            this.lastInsets = h4Var2;
            updateWillNotDraw();
            requestLayout();
        }
        return h4Var;
    }

    public boolean removeLiftOnScrollListener(@o0 LiftOnScrollListener liftOnScrollListener) {
        return this.liftOnScrollListeners.remove(liftOnScrollListener);
    }

    public void removeOnOffsetChangedListener(@d.q0 BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list == null || baseOnOffsetChangedListener == null) {
            return;
        }
        list.remove(baseOnOffsetChangedListener);
    }

    public void resetPendingAction() {
        this.pendingAction = 0;
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f7) {
        super.setElevation(f7);
        MaterialShapeUtils.setElevation(this, f7);
    }

    public void setExpanded(boolean z6) {
        setExpanded(z6, u1.U0(this));
    }

    public void setLiftOnScroll(boolean z6) {
        this.liftOnScroll = z6;
    }

    public void setLiftOnScrollTargetView(@d.q0 View view) {
        this.liftOnScrollTargetViewId = -1;
        if (view == null) {
            clearLiftOnScrollTargetView();
        } else {
            this.liftOnScrollTargetView = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(@d0 int i7) {
        this.liftOnScrollTargetViewId = i7;
        clearLiftOnScrollTargetView();
    }

    public boolean setLiftable(boolean z6) {
        this.liftableOverride = true;
        return setLiftableState(z6);
    }

    public void setLiftableOverrideEnabled(boolean z6) {
        this.liftableOverride = z6;
    }

    public boolean setLifted(boolean z6) {
        return setLiftedState(z6, true);
    }

    public boolean setLiftedState(boolean z6) {
        return setLiftedState(z6, !this.liftableOverride);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i7) {
        if (i7 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i7);
    }

    public void setStatusBarForeground(@d.q0 Drawable drawable) {
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.statusBarForeground = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                q0.c.m(this.statusBarForeground, u1.Z(this));
                this.statusBarForeground.setVisible(getVisibility() == 0, false);
                this.statusBarForeground.setCallback(this);
            }
            updateWillNotDraw();
            u1.n1(this);
        }
    }

    public void setStatusBarForegroundColor(@l int i7) {
        setStatusBarForeground(new ColorDrawable(i7));
    }

    public void setStatusBarForegroundResource(@v int i7) {
        setStatusBarForeground(g.a.b(getContext(), i7));
    }

    @Deprecated
    public void setTargetElevation(float f7) {
        ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, f7);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z6 = i7 == 0;
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
    }

    public boolean shouldLift(@d.q0 View view) {
        View findLiftOnScrollTargetView = findLiftOnScrollTargetView(view);
        if (findLiftOnScrollTargetView != null) {
            view = findLiftOnScrollTargetView;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(@o0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.statusBarForeground;
    }

    public AppBarLayout(@o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public void setExpanded(boolean z6, boolean z7) {
        setExpanded(z6, z7, true);
    }

    public boolean setLiftedState(boolean z6, boolean z7) {
        if (!z7 || this.lifted == z6) {
            return false;
        }
        this.lifted = z6;
        refreshDrawableState();
        if (this.liftOnScroll && (getBackground() instanceof MaterialShapeDrawable)) {
            if (this.liftOnScrollColor != null) {
                startLiftOnScrollColorAnimation(z6 ? 0.0f : 255.0f, z6 ? 255.0f : 0.0f);
                return true;
            }
            startLiftOnScrollColorAnimation(z6 ? 0.0f : this.appBarElevation, z6 ? this.appBarElevation : 0.0f);
            return true;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBarLayout(@d.o0 android.content.Context r9, @d.q0 android.util.AttributeSet r10, int r11) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void setExpanded(boolean z6, boolean z7, boolean z8) {
        this.pendingAction = (z6 ? 1 : 2) | (z7 ? 4 : 0) | (z8 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        removeOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        addOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
