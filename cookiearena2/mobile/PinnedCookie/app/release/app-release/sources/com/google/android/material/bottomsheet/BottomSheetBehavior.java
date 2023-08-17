package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.cardview.widget.g;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u1;
import androidx.customview.widget.d;
import com.google.android.material.R;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import d.b1;
import d.f1;
import d.l1;
import d.o0;
import d.q0;
import d.u0;
import d.x;
import h1.f0;
import h1.q0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int CORNER_ANIMATION_DURATION = 500;
    @l1
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    @l1
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    private static final int VIEW_INDEX_BOTTOM_SHEET = 0;
    @q0
    WeakReference<View> accessibilityDelegateViewRef;
    int activePointerId;
    @q0
    private ColorStateList backgroundTint;
    @o0
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final d.c dragCallback;
    private boolean draggable;
    float elevation;
    @l1
    final SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;
    @q0
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;
    @q0
    private ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;
    @q0
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    @q0
    private VelocityTracker velocityTracker;
    @q0
    d viewDragHelper;
    @q0
    WeakReference<V> viewRef;

    /* loaded from: classes.dex */
    public static abstract class BottomSheetCallback {
        public void onLayout(@o0 View view) {
        }

        public abstract void onSlide(@o0 View view, float f7);

        public abstract void onStateChanged(@o0 View view, int i7);
    }

    @b1({b1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface SaveFlags {
    }

    /* loaded from: classes.dex */
    public static class SavedState extends o1.a {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
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
            @q0
            public SavedState createFromParcel(@o0 Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        public SavedState(@o0 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // o1.a, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, @o0 BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i7) {
            super(parcelable);
            this.state = i7;
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface StableState {
    }

    @b1({b1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface State {
    }

    /* loaded from: classes.dex */
    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        private StateSettlingTracker() {
            this.continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    StateSettlingTracker.this.isContinueSettlingRunnablePosted = false;
                    d dVar = BottomSheetBehavior.this.viewDragHelper;
                    if (dVar != null && dVar.o(true)) {
                        StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                        stateSettlingTracker.continueSettlingToState(stateSettlingTracker.targetState);
                        return;
                    }
                    StateSettlingTracker stateSettlingTracker2 = StateSettlingTracker.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.state == 2) {
                        bottomSheetBehavior.setStateInternal(stateSettlingTracker2.targetState);
                    }
                }
            };
        }

        public void continueSettlingToState(int i7) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.targetState = i7;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            u1.p1(BottomSheetBehavior.this.viewRef.get(), this.continueSettlingRunnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new d.c() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            private long viewCapturedMillis;

            private boolean releasedLow(@o0 View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.parentHeight + bottomSheetBehavior.getExpandedOffset()) / 2;
            }

            @Override // androidx.customview.widget.d.c
            public int clampViewPositionHorizontal(@o0 View view, int i7, int i8) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.d.c
            public int clampViewPositionVertical(@o0 View view, int i7, int i8) {
                return x0.a.e(i7, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.d.c
            public int getViewVerticalDragRange(@o0 View view) {
                return BottomSheetBehavior.this.canBeHiddenByDragging() ? BottomSheetBehavior.this.parentHeight : BottomSheetBehavior.this.collapsedOffset;
            }

            @Override // androidx.customview.widget.d.c
            public void onViewDragStateChanged(int i7) {
                if (i7 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.d.c
            public void onViewPositionChanged(@o0 View view, int i7, int i8, int i9, int i10) {
                BottomSheetBehavior.this.dispatchOnSlide(i8);
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
                if (r7.this$0.shouldExpandOnUpwardDrag(r0, (r9 * 100.0f) / r10.parentHeight) != false) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
                if (r9 > r7.this$0.halfExpandedOffset) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
                if (java.lang.Math.abs(r8.getTop() - r7.this$0.getExpandedOffset()) < java.lang.Math.abs(r8.getTop() - r7.this$0.halfExpandedOffset)) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
                if (r7.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
                if (java.lang.Math.abs(r9 - r7.this$0.fitToContentsOffset) < java.lang.Math.abs(r9 - r7.this$0.collapsedOffset)) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x010d, code lost:
                if (r7.this$0.shouldSkipHalfExpandedStateWhenDragging() != false) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0127, code lost:
                if (r7.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
             */
            @Override // androidx.customview.widget.d.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onViewReleased(@d.o0 android.view.View r8, float r9, float r10) {
                /*
                    Method dump skipped, instructions count: 308
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass4.onViewReleased(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.d.c
            public boolean tryCaptureView(@o0 View view, int i7) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i8 = bottomSheetBehavior.state;
                if (i8 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i8 == 3 && bottomSheetBehavior.activePointerId == i7) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
    }

    private int addAccessibilityActionForState(View view, @f1 int i7, int i8) {
        return u1.c(view, view.getResources().getString(i7), createAccessibilityViewCommandForState(i8));
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - calculatePeekHeight;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) (this.parentHeight * (1.0f - this.halfExpandedRatio));
    }

    private int calculatePeekHeight() {
        int i7;
        return this.peekHeightAuto ? Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom : (this.gestureInsetBottomIgnored || this.paddingBottomSystemWindowInsets || (i7 = this.gestureInsetBottom) <= 0) ? this.peekHeight + this.insetBottom : Math.max(this.peekHeight, i7 + this.peekHeightGestureInsetBuffer);
    }

    private float calculateSlideOffsetWithTop(int i7) {
        float f7;
        float f8;
        int i8 = this.collapsedOffset;
        if (i7 > i8 || i8 == getExpandedOffset()) {
            int i9 = this.collapsedOffset;
            f7 = i9 - i7;
            f8 = this.parentHeight - i9;
        } else {
            int i10 = this.collapsedOffset;
            f7 = i10 - i7;
            f8 = i10 - getExpandedOffset();
        }
        return f7 / f8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canBeHiddenByDragging() {
        return isHideable() && isHideableWhenDragging();
    }

    private void clearAccessibilityAction(View view, int i7) {
        if (view == null) {
            return;
        }
        u1.r1(view, 524288);
        u1.r1(view, 262144);
        u1.r1(view, 1048576);
        int i8 = this.expandHalfwayActionIds.get(i7, -1);
        if (i8 != -1) {
            u1.r1(view, i8);
            this.expandHalfwayActionIds.delete(i7);
        }
    }

    private h1.q0 createAccessibilityViewCommandForState(final int i7) {
        return new h1.q0() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            @Override // h1.q0
            public boolean perform(@o0 View view, @q0 q0.a aVar) {
                BottomSheetBehavior.this.setState(i7);
                return true;
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(@o0 Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(floatValue);
                }
            }
        });
    }

    @o0
    public static <V extends View> BottomSheetBehavior<V> from(@o0 V v6) {
        ViewGroup.LayoutParams layoutParams = v6.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            CoordinatorLayout.c f7 = ((CoordinatorLayout.g) layoutParams).f();
            if (f7 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f7;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int getChildMeasureSpec(int i7, int i8, int i9, int i10) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i8, i10);
        if (i9 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i9 = Math.min(size, i9);
            }
            return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i9), 1073741824);
    }

    private int getTopOffsetForState(int i7) {
        if (i7 != 3) {
            if (i7 != 4) {
                if (i7 != 5) {
                    if (i7 == 6) {
                        return this.halfExpandedOffset;
                    }
                    throw new IllegalArgumentException("Invalid state to get top offset: " + i7);
                }
                return this.parentHeight;
            }
            return this.collapsedOffset;
        }
        return getExpandedOffset();
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        return this.state == 3 && (this.shouldRemoveExpandedCorners || getExpandedOffset() == 0);
    }

    private boolean isLayouting(V v6) {
        ViewParent parent = v6.getParent();
        return parent != null && parent.isLayoutRequested() && u1.O0(v6);
    }

    private void replaceAccessibilityActionForState(View view, f0.a aVar, int i7) {
        u1.u1(view, aVar, null, createAccessibilityViewCommandForState(i7));
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(@o0 SavedState savedState) {
        int i7 = this.saveFlags;
        if (i7 == 0) {
            return;
        }
        if (i7 == -1 || (i7 & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i7 == -1 || (i7 & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i7 == -1 || (i7 & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i7 == -1 || (i7 & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void runAfterLayout(V v6, Runnable runnable) {
        if (isLayouting(v6)) {
            v6.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setWindowInsetsListener(@o0 View view) {
        final boolean z6 = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) ? false : true;
        if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || this.marginLeftSystemWindowInsets || this.marginRightSystemWindowInsets || this.marginTopSystemWindowInsets || z6) {
            ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
                /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
                @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public androidx.core.view.h4 onApplyWindowInsets(android.view.View r11, androidx.core.view.h4 r12, com.google.android.material.internal.ViewUtils.RelativePadding r13) {
                    /*
                        r10 = this;
                        int r0 = androidx.core.view.h4.m.i()
                        p0.v0 r0 = r12.f(r0)
                        int r1 = androidx.core.view.h4.m.f()
                        p0.v0 r1 = r12.f(r1)
                        com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        int r3 = r0.f14586b
                        com.google.android.material.bottomsheet.BottomSheetBehavior.access$302(r2, r3)
                        boolean r2 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r11)
                        int r3 = r11.getPaddingBottom()
                        int r4 = r11.getPaddingLeft()
                        int r5 = r11.getPaddingRight()
                        com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$400(r6)
                        if (r6 == 0) goto L41
                        com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        int r6 = r12.o()
                        com.google.android.material.bottomsheet.BottomSheetBehavior.access$502(r3, r6)
                        int r3 = r13.bottom
                        com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$500(r6)
                        int r3 = r3 + r6
                    L41:
                        com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$600(r6)
                        if (r6 == 0) goto L53
                        if (r2 == 0) goto L4e
                        int r4 = r13.end
                        goto L50
                    L4e:
                        int r4 = r13.start
                    L50:
                        int r6 = r0.f14585a
                        int r4 = r4 + r6
                    L53:
                        com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$700(r6)
                        if (r6 == 0) goto L66
                        if (r2 == 0) goto L60
                        int r13 = r13.start
                        goto L62
                    L60:
                        int r13 = r13.end
                    L62:
                        int r2 = r0.f14587c
                        int r5 = r13 + r2
                    L66:
                        android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                        android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                        com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$800(r2)
                        r6 = 0
                        r7 = 1
                        if (r2 == 0) goto L80
                        int r2 = r13.leftMargin
                        int r8 = r0.f14585a
                        if (r2 == r8) goto L80
                        r13.leftMargin = r8
                        r2 = r7
                        goto L81
                    L80:
                        r2 = r6
                    L81:
                        com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$900(r8)
                        if (r8 == 0) goto L92
                        int r8 = r13.rightMargin
                        int r9 = r0.f14587c
                        if (r8 == r9) goto L92
                        r13.rightMargin = r9
                        r2 = r7
                    L92:
                        com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$1000(r8)
                        if (r8 == 0) goto La3
                        int r8 = r13.topMargin
                        int r0 = r0.f14586b
                        if (r8 == r0) goto La3
                        r13.topMargin = r0
                        goto La4
                    La3:
                        r7 = r2
                    La4:
                        if (r7 == 0) goto La9
                        r11.setLayoutParams(r13)
                    La9:
                        int r13 = r11.getPaddingTop()
                        r11.setPadding(r4, r13, r5, r3)
                        boolean r11 = r2
                        if (r11 == 0) goto Lbb
                        com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        int r13 = r1.f14588d
                        com.google.android.material.bottomsheet.BottomSheetBehavior.access$1102(r11, r13)
                    Lbb:
                        com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$400(r11)
                        if (r11 != 0) goto Lc7
                        boolean r11 = r2
                        if (r11 == 0) goto Lcc
                    Lc7:
                        com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        com.google.android.material.bottomsheet.BottomSheetBehavior.access$1200(r11, r6)
                    Lcc:
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass3.onApplyWindowInsets(android.view.View, androidx.core.view.h4, com.google.android.material.internal.ViewUtils$RelativePadding):androidx.core.view.h4");
                }
            });
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        return this.viewDragHelper != null && (this.draggable || this.state == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i7, boolean z6) {
        int topOffsetForState = getTopOffsetForState(i7);
        d dVar = this.viewDragHelper;
        if (!(dVar != null && (!z6 ? !dVar.X(view, view.getLeft(), topOffsetForState) : !dVar.V(view.getLeft(), topOffsetForState)))) {
            setStateInternal(i7);
            return;
        }
        setStateInternal(2);
        updateDrawableForTargetState(i7, true);
        this.stateSettlingTracker.continueSettlingToState(i7);
    }

    private void updateAccessibilityActions() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            updateAccessibilityActions(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.accessibilityDelegateViewRef;
        if (weakReference2 != null) {
            updateAccessibilityActions(weakReference2.get(), 1);
        }
    }

    private void updateDrawableForTargetState(int i7, boolean z6) {
        boolean isExpandedAndShouldRemoveCorners;
        ValueAnimator valueAnimator;
        if (i7 == 2 || this.expandedCornersRemoved == (isExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners()) || this.materialShapeDrawable == null) {
            return;
        }
        this.expandedCornersRemoved = isExpandedAndShouldRemoveCorners;
        if (!z6 || (valueAnimator = this.interpolatorAnimator) == null) {
            ValueAnimator valueAnimator2 = this.interpolatorAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.interpolatorAnimator.cancel();
            }
            this.materialShapeDrawable.setInterpolation(this.expandedCornersRemoved ? 0.0f : 1.0f);
        } else if (valueAnimator.isRunning()) {
            this.interpolatorAnimator.reverse();
        } else {
            float f7 = isExpandedAndShouldRemoveCorners ? 0.0f : 1.0f;
            this.interpolatorAnimator.setFloatValues(1.0f - f7, f7);
            this.interpolatorAnimator.start();
        }
    }

    private void updateImportantForAccessibility(boolean z6) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                }
                this.importantForAccessibilityMap = new HashMap(childCount);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if (childAt != this.viewRef.get()) {
                    if (z6) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            u1.R1(childAt, 4);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        u1.R1(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
            if (!z6) {
                this.importantForAccessibilityMap = null;
            } else if (this.updateImportantForAccessibilityOnSiblings) {
                this.viewRef.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z6) {
        V v6;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v6 = this.viewRef.get()) == null) {
                return;
            }
            if (z6) {
                setState(4);
            } else {
                v6.requestLayout();
            }
        }
    }

    public void addBottomSheetCallback(@o0 BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    public float calculateSlideOffset() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return calculateSlideOffsetWithTop(this.viewRef.get().getTop());
    }

    @b1({b1.a.LIBRARY_GROUP})
    @l1
    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int i7) {
        V v6 = this.viewRef.get();
        if (v6 == null || this.callbacks.isEmpty()) {
            return;
        }
        float calculateSlideOffsetWithTop = calculateSlideOffsetWithTop(i7);
        for (int i8 = 0; i8 < this.callbacks.size(); i8++) {
            this.callbacks.get(i8).onSlide(v6, calculateSlideOffsetWithTop);
        }
    }

    @d.q0
    @l1
    public View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (u1.W0(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i7));
                if (findScrollingChild != null) {
                    return findScrollingChild;
                }
            }
        }
        return null;
    }

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    @x(from = g.f1896q, to = Contrast.RATIO_MIN)
    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.lastStableState;
    }

    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    @u0
    public int getMaxHeight() {
        return this.maxHeight;
    }

    @u0
    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    @l1
    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public int getSignificantVelocityThreshold() {
        return this.significantVelocityThreshold;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean isHideableWhenDragging() {
        return true;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(@o0 CoordinatorLayout.g gVar) {
        super.onAttachedToLayoutParams(gVar);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 MotionEvent motionEvent) {
        d dVar;
        if (!v6.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x6 = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x6, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v6, x6, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (this.ignoreEvents || (dVar = this.viewDragHelper) == null || !dVar.W(motionEvent)) {
            WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            return (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || Math.abs(((float) this.initialY) - motionEvent.getY()) <= ((float) this.viewDragHelper.E())) ? false : true;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, int i7) {
        if (u1.U(coordinatorLayout) && !u1.U(v6)) {
            v6.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v6);
            u1.y2(v6, new InsetsAnimationCallback(v6));
            this.viewRef = new WeakReference<>(v6);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                u1.I1(v6, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float f7 = this.elevation;
                if (f7 == -1.0f) {
                    f7 = u1.R(v6);
                }
                materialShapeDrawable2.setElevation(f7);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    u1.J1(v6, colorStateList);
                }
            }
            updateAccessibilityActions();
            if (u1.V(v6) == 0) {
                u1.R1(v6, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = d.q(coordinatorLayout, this.dragCallback);
        }
        int top = v6.getTop();
        coordinatorLayout.onLayoutChild(v6, i7);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v6.getHeight();
        this.childHeight = height;
        int i8 = this.parentHeight;
        int i9 = i8 - height;
        int i10 = this.insetTop;
        if (i9 < i10) {
            if (this.paddingTopSystemWindowInsets) {
                this.childHeight = i8;
            } else {
                this.childHeight = i8 - i10;
            }
        }
        this.fitToContentsOffset = Math.max(0, i8 - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i11 = this.state;
        if (i11 == 3) {
            u1.f1(v6, getExpandedOffset());
        } else if (i11 == 6) {
            u1.f1(v6, this.halfExpandedOffset);
        } else if (this.hideable && i11 == 5) {
            u1.f1(v6, this.parentHeight);
        } else if (i11 == 4) {
            u1.f1(v6, this.collapsedOffset);
        } else if (i11 == 1 || i11 == 2) {
            u1.f1(v6, top - v6.getTop());
        }
        updateDrawableForTargetState(this.state, false);
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v6));
        for (int i12 = 0; i12 < this.callbacks.size(); i12++) {
            this.callbacks.get(i12).onLayout(v6);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v6.getLayoutParams();
        v6.measure(getChildMeasureSpec(i7, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i9, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, float f7, float f8) {
        WeakReference<View> weakReference;
        if (isNestedScrollingCheckEnabled() && (weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get()) {
            return this.state != 3 || super.onNestedPreFling(coordinatorLayout, v6, view, f7, f8);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, int i7, int i8, @o0 int[] iArr, int i9) {
        if (i9 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view == view2) {
            int top = v6.getTop();
            int i10 = top - i8;
            if (i8 > 0) {
                if (i10 < getExpandedOffset()) {
                    int expandedOffset = top - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    u1.f1(v6, -expandedOffset);
                    setStateInternal(3);
                } else if (!this.draggable) {
                    return;
                } else {
                    iArr[1] = i8;
                    u1.f1(v6, -i8);
                    setStateInternal(1);
                }
            } else if (i8 < 0 && !view.canScrollVertically(-1)) {
                if (i10 > this.collapsedOffset && !canBeHiddenByDragging()) {
                    int i11 = top - this.collapsedOffset;
                    iArr[1] = i11;
                    u1.f1(v6, -i11);
                    setStateInternal(4);
                } else if (!this.draggable) {
                    return;
                } else {
                    iArr[1] = i8;
                    u1.f1(v6, -i8);
                    setStateInternal(1);
                }
            }
            dispatchOnSlide(v6.getTop());
            this.lastNestedScrollDy = i8;
            this.nestedScrolled = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, int i7, int i8, int i9, int i10, int i11, @o0 int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v6, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i7 = savedState.state;
        if (i7 == 1 || i7 == 2) {
            this.state = 4;
            this.lastStableState = 4;
            return;
        }
        this.state = i7;
        this.lastStableState = i7;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @o0
    public Parcelable onSaveInstanceState(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v6), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 View view, @o0 View view2, int i7, int i8) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i7 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r4.getTop() <= r2.halfExpandedOffset) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.fitToContentsOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
        if (shouldSkipHalfExpandedStateWhenDragging() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.halfExpandedOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
        r0 = 6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopNestedScroll(@d.o0 androidx.coordinatorlayout.widget.CoordinatorLayout r3, @d.o0 V r4, @d.o0 android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.getExpandedOffset()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.setStateInternal(r0)
            return
        Lf:
            boolean r3 = r2.isNestedScrollingCheckEnabled()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.nestedScrollingChildRef
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.nestedScrolled
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.lastNestedScrollDy
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.halfExpandedOffset
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.hideable
            if (r3 == 0) goto L49
            float r3 = r2.getYVelocity()
            boolean r3 = r2.shouldHide(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.lastNestedScrollDy
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.fitToContents
            if (r1 == 0) goto L68
            int r5 = r2.fitToContentsOffset
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.halfExpandedOffset
            if (r3 >= r1) goto L7e
            int r1 = r2.collapsedOffset
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.shouldSkipHalfExpandedStateWhenDragging()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.halfExpandedOffset
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.startSettling(r4, r0, r3)
            r2.nestedScrolled = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 MotionEvent motionEvent) {
        if (v6.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.state == 1 && actionMasked == 0) {
                return true;
            }
            if (shouldHandleDraggingWithHelper()) {
                this.viewDragHelper.M(motionEvent);
            }
            if (actionMasked == 0) {
                reset();
            }
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
            if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.E()) {
                this.viewDragHelper.d(v6, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.ignoreEvents;
        }
        return false;
    }

    public void removeBottomSheetCallback(@o0 BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    public void setAccessibilityDelegateView(@d.q0 View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.accessibilityDelegateViewRef) == null) {
            this.accessibilityDelegateViewRef = new WeakReference<>(view);
            updateAccessibilityActions(view, 1);
            return;
        }
        clearAccessibilityAction(weakReference.get(), 1);
        this.accessibilityDelegateViewRef = null;
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setDraggable(boolean z6) {
        this.draggable = z6;
    }

    public void setExpandedOffset(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.expandedOffset = i7;
        updateDrawableForTargetState(this.state, true);
    }

    public void setFitToContents(boolean z6) {
        if (this.fitToContents == z6) {
            return;
        }
        this.fitToContents = z6;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateDrawableForTargetState(this.state, true);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z6) {
        this.gestureInsetBottomIgnored = z6;
    }

    public void setHalfExpandedRatio(@x(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f7) {
        if (f7 <= 0.0f || f7 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f7;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideFriction(float f7) {
        this.hideFriction = f7;
    }

    public void setHideable(boolean z6) {
        if (this.hideable != z6) {
            this.hideable = z6;
            if (!z6 && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void setHideableInternal(boolean z6) {
        this.hideable = z6;
    }

    public void setMaxHeight(@u0 int i7) {
        this.maxHeight = i7;
    }

    public void setMaxWidth(@u0 int i7) {
        this.maxWidth = i7;
    }

    public void setPeekHeight(int i7) {
        setPeekHeight(i7, false);
    }

    public void setSaveFlags(int i7) {
        this.saveFlags = i7;
    }

    public void setSignificantVelocityThreshold(int i7) {
        this.significantVelocityThreshold = i7;
    }

    public void setSkipCollapsed(boolean z6) {
        this.skipCollapsed = z6;
    }

    public void setState(int i7) {
        if (i7 == 1 || i7 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i7 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.hideable && i7 == 5) {
            Log.w(TAG, "Cannot set state: " + i7);
        } else {
            final int i8 = (i7 == 6 && this.fitToContents && getTopOffsetForState(i7) <= this.fitToContentsOffset) ? 3 : i7;
            WeakReference<V> weakReference = this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                setStateInternal(i7);
                return;
            }
            final V v6 = this.viewRef.get();
            runAfterLayout(v6, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public void run() {
                    BottomSheetBehavior.this.startSettling(v6, i8, false);
                }
            });
        }
    }

    public void setStateInternal(int i7) {
        V v6;
        if (this.state == i7) {
            return;
        }
        this.state = i7;
        if (i7 == 4 || i7 == 3 || i7 == 6 || (this.hideable && i7 == 5)) {
            this.lastStableState = i7;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v6 = weakReference.get()) == null) {
            return;
        }
        if (i7 == 3) {
            updateImportantForAccessibility(true);
        } else if (i7 == 6 || i7 == 5 || i7 == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i7, true);
        for (int i8 = 0; i8 < this.callbacks.size(); i8++) {
            this.callbacks.get(i8).onStateChanged(v6, i7);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z6) {
        this.updateImportantForAccessibilityOnSiblings = z6;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean shouldExpandOnUpwardDrag(long j7, @x(from = 0.0d, to = 100.0d) float f7) {
        return false;
    }

    public boolean shouldHide(@o0 View view, float f7) {
        if (this.skipCollapsed) {
            return true;
        }
        if (isHideableWhenDragging() && view.getTop() >= this.collapsedOffset) {
            return Math.abs((((float) view.getTop()) + (f7 * this.hideFriction)) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > 0.5f;
        }
        return false;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    public final void setPeekHeight(int i7, boolean z6) {
        boolean z7 = true;
        if (i7 == -1) {
            if (!this.peekHeightAuto) {
                this.peekHeightAuto = true;
            }
            z7 = false;
        } else {
            if (this.peekHeightAuto || this.peekHeight != i7) {
                this.peekHeightAuto = false;
                this.peekHeight = Math.max(0, i7);
            }
            z7 = false;
        }
        if (z7) {
            updatePeekHeight(z6);
        }
    }

    private void updateAccessibilityActions(View view, int i7) {
        if (view == null) {
            return;
        }
        clearAccessibilityAction(view, i7);
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionIds.put(i7, addAccessibilityActionForState(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.hideable && isHideableWhenDragging() && this.state != 5) {
            replaceAccessibilityActionForState(view, f0.a.f10228z, 5);
        }
        int i8 = this.state;
        if (i8 == 3) {
            replaceAccessibilityActionForState(view, f0.a.f10227y, this.fitToContents ? 4 : 6);
        } else if (i8 == 4) {
            replaceAccessibilityActionForState(view, f0.a.f10226x, this.fitToContents ? 3 : 6);
        } else if (i8 != 6) {
        } else {
            replaceAccessibilityActionForState(view, f0.a.f10227y, 4);
            replaceAccessibilityActionForState(view, f0.a.f10226x, 3);
        }
    }

    public BottomSheetBehavior(@o0 Context context, @d.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        int i7;
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new d.c() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            private long viewCapturedMillis;

            private boolean releasedLow(@o0 View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.parentHeight + bottomSheetBehavior.getExpandedOffset()) / 2;
            }

            @Override // androidx.customview.widget.d.c
            public int clampViewPositionHorizontal(@o0 View view, int i72, int i8) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.d.c
            public int clampViewPositionVertical(@o0 View view, int i72, int i8) {
                return x0.a.e(i72, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.d.c
            public int getViewVerticalDragRange(@o0 View view) {
                return BottomSheetBehavior.this.canBeHiddenByDragging() ? BottomSheetBehavior.this.parentHeight : BottomSheetBehavior.this.collapsedOffset;
            }

            @Override // androidx.customview.widget.d.c
            public void onViewDragStateChanged(int i72) {
                if (i72 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.d.c
            public void onViewPositionChanged(@o0 View view, int i72, int i8, int i9, int i10) {
                BottomSheetBehavior.this.dispatchOnSlide(i8);
            }

            @Override // androidx.customview.widget.d.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onViewReleased(@d.o0 android.view.View r8, float r9, float r10) {
                /*
                    Method dump skipped, instructions count: 308
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass4.onViewReleased(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.d.c
            public boolean tryCaptureView(@o0 View view, int i72) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i8 = bottomSheetBehavior.state;
                if (i8 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i8 == 3 && bottomSheetBehavior.activePointerId == i72) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_backgroundTint)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_android_maxWidth, -1));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_android_maxHeight, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null && (i7 = peekValue.data) == -1) {
            setPeekHeight(i7);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 != null && peekValue2.type == 16) {
            setExpandedOffset(peekValue2.data);
        } else {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        setSignificantVelocityThreshold(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.paddingTopSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.marginLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.marginTopSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.shouldRemoveExpandedCorners = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
