package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u1;
import androidx.customview.widget.d;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.sidesheet.SideSheetBehavior;
import d.b1;
import d.d0;
import d.o0;
import d.q0;
import h1.f0;
import h1.q0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements Sheet<SideSheetCallback> {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = R.string.side_sheet_accessibility_pane_title;
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SideSheet;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    @q0
    private ColorStateList backgroundTint;
    @o0
    private final Set<SideSheetCallback> callbacks;
    private int childWidth;
    @d0
    private int coplanarSiblingViewId;
    @q0
    private WeakReference<View> coplanarSiblingViewRef;
    private final d.c dragCallback;
    private boolean draggable;
    private float elevation;
    private float hideFriction;
    private boolean ignoreEvents;
    private int initialX;
    private int innerMargin;
    private int lastStableState;
    @q0
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private int parentWidth;
    private ShapeAppearanceModel shapeAppearanceModel;
    private SheetDelegate sheetDelegate;
    private int state;
    private final SideSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    @q0
    private VelocityTracker velocityTracker;
    @q0
    private androidx.customview.widget.d viewDragHelper;
    @q0
    private WeakReference<V> viewRef;

    /* loaded from: classes.dex */
    public static class SavedState extends o1.a {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.SavedState.1
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
        final int state;

        public SavedState(@o0 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // o1.a, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.state);
        }

        public SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, @o0 SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.state = ((SideSheetBehavior) sideSheetBehavior).state;
        }
    }

    /* loaded from: classes.dex */
    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.sidesheet.d
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.StateSettlingTracker.this.lambda$new$0();
            }
        };
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        public StateSettlingTracker() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            this.isContinueSettlingRunnablePosted = false;
            if (SideSheetBehavior.this.viewDragHelper != null && SideSheetBehavior.this.viewDragHelper.o(true)) {
                continueSettlingToState(this.targetState);
            } else if (SideSheetBehavior.this.state == 2) {
                SideSheetBehavior.this.setStateInternal(this.targetState);
            }
        }

        public void continueSettlingToState(int i7) {
            if (SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() == null) {
                return;
            }
            this.targetState = i7;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            u1.p1((View) SideSheetBehavior.this.viewRef.get(), this.continueSettlingRunnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    public SideSheetBehavior() {
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new d.c() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.d.c
            public int clampViewPositionHorizontal(@o0 View view, int i7, int i8) {
                return x0.a.e(i7, SideSheetBehavior.this.getExpandedOffset(), SideSheetBehavior.this.parentWidth);
            }

            @Override // androidx.customview.widget.d.c
            public int clampViewPositionVertical(@o0 View view, int i7, int i8) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.d.c
            public int getViewHorizontalDragRange(@o0 View view) {
                return SideSheetBehavior.this.parentWidth;
            }

            @Override // androidx.customview.widget.d.c
            public void onViewDragStateChanged(int i7) {
                if (i7 == 1 && SideSheetBehavior.this.draggable) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.d.c
            public void onViewPositionChanged(@o0 View view, int i7, int i8, int i9, int i10) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.dispatchOnSlide(view, i7);
            }

            @Override // androidx.customview.widget.d.c
            public void onViewReleased(@o0 View view, float f7, float f8) {
                int calculateTargetStateOnViewReleased = SideSheetBehavior.this.sheetDelegate.calculateTargetStateOnViewReleased(view, f7, f8);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view, calculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.d.c
            public boolean tryCaptureView(@o0 View view, int i7) {
                return (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view) ? false : true;
            }
        };
    }

    private int calculateCurrentOffset(int i7, V v6) {
        int i8 = this.state;
        if (i8 == 1 || i8 == 2) {
            return i7 - this.sheetDelegate.getOuterEdge(v6);
        }
        if (i8 != 3) {
            if (i8 == 5) {
                return this.sheetDelegate.getHiddenOffset();
            }
            throw new IllegalStateException("Unexpected value: " + this.state);
        }
        return 0;
    }

    private float calculateDragDistance(float f7, float f8) {
        return Math.abs(f7 - f8);
    }

    private void clearCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.coplanarSiblingViewRef = null;
    }

    private h1.q0 createAccessibilityViewCommandForState(final int i7) {
        return new h1.q0() { // from class: com.google.android.material.sidesheet.c
            @Override // h1.q0
            public final boolean perform(View view, q0.a aVar) {
                boolean lambda$createAccessibilityViewCommandForState$1;
                lambda$createAccessibilityViewCommandForState$1 = SideSheetBehavior.this.lambda$createAccessibilityViewCommandForState$1(i7, view, aVar);
                return lambda$createAccessibilityViewCommandForState$1;
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(@o0 Context context) {
        if (this.shapeAppearanceModel == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnSlide(@o0 View view, int i7) {
        if (this.callbacks.isEmpty()) {
            return;
        }
        float calculateSlideOffset = this.sheetDelegate.calculateSlideOffset(i7);
        Iterator<SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onSlide(view, calculateSlideOffset);
        }
    }

    private void ensureAccessibilityPaneTitleIsSet(View view) {
        if (u1.J(view) == null) {
            u1.E1(view, view.getResources().getString(DEFAULT_ACCESSIBILITY_PANE_TITLE));
        }
    }

    @o0
    public static <V extends View> SideSheetBehavior<V> from(@o0 V v6) {
        ViewGroup.LayoutParams layoutParams = v6.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            CoordinatorLayout.c f7 = ((CoordinatorLayout.g) layoutParams).f();
            if (f7 instanceof SideSheetBehavior) {
                return (SideSheetBehavior) f7;
            }
            throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
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

    private int getDefaultSheetEdge() {
        return 0;
    }

    private boolean isDraggedFarEnough(@o0 MotionEvent motionEvent) {
        return shouldHandleDraggingWithHelper() && calculateDragDistance((float) this.initialX, motionEvent.getX()) > ((float) this.viewDragHelper.E());
    }

    private boolean isLayingOut(@o0 V v6) {
        ViewParent parent = v6.getParent();
        return parent != null && parent.isLayoutRequested() && u1.O0(v6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createAccessibilityViewCommandForState$1(int i7, View view, q0.a aVar) {
        setState(i7);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setState$0(int i7) {
        V v6 = this.viewRef.get();
        if (v6 != null) {
            startSettling(v6, i7, false);
        }
    }

    private void maybeAssignCoplanarSiblingViewBasedId(@o0 CoordinatorLayout coordinatorLayout) {
        int i7;
        View findViewById;
        if (this.coplanarSiblingViewRef != null || (i7 = this.coplanarSiblingViewId) == -1 || (findViewById = coordinatorLayout.findViewById(i7)) == null) {
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(findViewById);
    }

    private void replaceAccessibilityActionForState(V v6, f0.a aVar, int i7) {
        u1.u1(v6, aVar, null, createAccessibilityViewCommandForState(i7));
    }

    private void resetVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void runAfterLayout(@o0 V v6, Runnable runnable) {
        if (isLayingOut(v6)) {
            v6.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setSheetEdge(int i7) {
        SheetDelegate sheetDelegate = this.sheetDelegate;
        if (sheetDelegate == null || sheetDelegate.getSheetEdge() != i7) {
            if (i7 == 0) {
                this.sheetDelegate = new RightSheetDelegate(this);
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i7 + ". Must be 0");
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        return this.viewDragHelper != null && (this.draggable || this.state == 1);
    }

    private boolean shouldInterceptTouchEvent(@o0 V v6) {
        return (v6.isShown() || u1.J(v6) != null) && this.draggable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i7, boolean z6) {
        if (!this.sheetDelegate.isSettling(view, i7, z6)) {
            setStateInternal(i7);
            return;
        }
        setStateInternal(2);
        this.stateSettlingTracker.continueSettlingToState(i7);
    }

    private void updateAccessibilityActions() {
        V v6;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v6 = weakReference.get()) == null) {
            return;
        }
        u1.r1(v6, 262144);
        u1.r1(v6, 1048576);
        if (this.state != 5) {
            replaceAccessibilityActionForState(v6, f0.a.f10228z, 5);
        }
        if (this.state != 3) {
            replaceAccessibilityActionForState(v6, f0.a.f10226x, 3);
        }
    }

    private void updateSheetVisibility(@o0 View view) {
        int i7 = this.state == 5 ? 4 : 0;
        if (view.getVisibility() != i7) {
            view.setVisibility(i7);
        }
    }

    public void expand() {
        setState(3);
    }

    public int getChildWidth() {
        return this.childWidth;
    }

    @d.q0
    public View getCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.sheetDelegate.getExpandedOffset();
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    public float getHideThreshold() {
        return 0.5f;
    }

    public int getInnerMargin() {
        return this.innerMargin;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.lastStableState;
    }

    public int getOuterEdgeOffsetForState(int i7) {
        if (i7 != 3) {
            if (i7 == 5) {
                return this.sheetDelegate.getHiddenOffset();
            }
            throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i7);
        }
        return getExpandedOffset();
    }

    public int getParentWidth() {
        return this.parentWidth;
    }

    public int getSignificantVelocityThreshold() {
        return 500;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
        return this.state;
    }

    @d.q0
    public androidx.customview.widget.d getViewDragHelper() {
        return this.viewDragHelper;
    }

    public float getXVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getXVelocity();
    }

    public void hide() {
        setState(5);
    }

    public boolean isDraggable() {
        return this.draggable;
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
        androidx.customview.widget.d dVar;
        if (!shouldInterceptTouchEvent(v6)) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.initialX = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.ignoreEvents) {
            this.ignoreEvents = false;
            return false;
        }
        return (this.ignoreEvents || (dVar = this.viewDragHelper) == null || !dVar.W(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, int i7) {
        if (u1.U(coordinatorLayout) && !u1.U(v6)) {
            v6.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
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
            updateSheetVisibility(v6);
            updateAccessibilityActions();
            if (u1.V(v6) == 0) {
                u1.R1(v6, 1);
            }
            ensureAccessibilityPaneTitleIsSet(v6);
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = androidx.customview.widget.d.q(coordinatorLayout, this.dragCallback);
        }
        int outerEdge = this.sheetDelegate.getOuterEdge(v6);
        coordinatorLayout.onLayoutChild(v6, i7);
        this.parentWidth = coordinatorLayout.getWidth();
        this.childWidth = v6.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v6.getLayoutParams();
        this.innerMargin = marginLayoutParams != null ? this.sheetDelegate.calculateInnerMargin(marginLayoutParams) : 0;
        u1.e1(v6, calculateCurrentOffset(outerEdge, v6));
        maybeAssignCoplanarSiblingViewBasedId(coordinatorLayout);
        for (SideSheetCallback sideSheetCallback : this.callbacks) {
            if (sideSheetCallback instanceof SideSheetCallback) {
                sideSheetCallback.onLayout(v6);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v6.getLayoutParams();
        v6.measure(getChildMeasureSpec(i7, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, -1, marginLayoutParams.width), getChildMeasureSpec(i9, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, -1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v6, savedState.getSuperState());
        }
        int i7 = savedState.state;
        if (i7 == 1 || i7 == 2) {
            i7 = 5;
        }
        this.state = i7;
        this.lastStableState = i7;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @o0
    public Parcelable onSaveInstanceState(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v6), (SideSheetBehavior<?>) this);
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
                resetVelocity();
            }
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
            if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && isDraggedFarEnough(motionEvent)) {
                this.viewDragHelper.d(v6, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.ignoreEvents;
        }
        return false;
    }

    public void setCoplanarSiblingView(@d.q0 View view) {
        this.coplanarSiblingViewId = -1;
        if (view == null) {
            clearCoplanarSiblingView();
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(view);
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v6 = weakReference.get();
            if (u1.U0(v6)) {
                v6.requestLayout();
            }
        }
    }

    public void setCoplanarSiblingViewId(@d0 int i7) {
        this.coplanarSiblingViewId = i7;
        clearCoplanarSiblingView();
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v6 = weakReference.get();
            if (i7 == -1 || !u1.U0(v6)) {
                return;
            }
            v6.requestLayout();
        }
    }

    public void setDraggable(boolean z6) {
        this.draggable = z6;
    }

    public void setHideFriction(float f7) {
        this.hideFriction = f7;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(final int i7) {
        if (i7 == 1 || i7 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i7 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i7);
        } else {
            runAfterLayout(this.viewRef.get(), new Runnable() { // from class: com.google.android.material.sidesheet.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.this.lambda$setState$0(i7);
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
        if (i7 == 3 || i7 == 5) {
            this.lastStableState = i7;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v6 = weakReference.get()) == null) {
            return;
        }
        updateSheetVisibility(v6);
        Iterator<SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v6, i7);
        }
        updateAccessibilityActions();
    }

    public boolean shouldHide(@o0 View view, float f7) {
        return this.sheetDelegate.shouldHide(view, f7);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void addCallback(@o0 SideSheetCallback sideSheetCallback) {
        this.callbacks.add(sideSheetCallback);
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void removeCallback(@o0 SideSheetCallback sideSheetCallback) {
        this.callbacks.remove(sideSheetCallback);
    }

    public SideSheetBehavior(@o0 Context context, @d.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new d.c() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.d.c
            public int clampViewPositionHorizontal(@o0 View view, int i7, int i8) {
                return x0.a.e(i7, SideSheetBehavior.this.getExpandedOffset(), SideSheetBehavior.this.parentWidth);
            }

            @Override // androidx.customview.widget.d.c
            public int clampViewPositionVertical(@o0 View view, int i7, int i8) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.d.c
            public int getViewHorizontalDragRange(@o0 View view) {
                return SideSheetBehavior.this.parentWidth;
            }

            @Override // androidx.customview.widget.d.c
            public void onViewDragStateChanged(int i7) {
                if (i7 == 1 && SideSheetBehavior.this.draggable) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.d.c
            public void onViewPositionChanged(@o0 View view, int i7, int i8, int i9, int i10) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.dispatchOnSlide(view, i7);
            }

            @Override // androidx.customview.widget.d.c
            public void onViewReleased(@o0 View view, float f7, float f8) {
                int calculateTargetStateOnViewReleased = SideSheetBehavior.this.sheetDelegate.calculateTargetStateOnViewReleased(view, f7, f8);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view, calculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.d.c
            public boolean tryCaptureView(@o0 View view, int i7) {
                return (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view) ? false : true;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SideSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_backgroundTint)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.SideSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModel = ShapeAppearanceModel.builder(context, attributeSet, 0, DEF_STYLE_RES).build();
        }
        if (obtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            setCoplanarSiblingViewId(obtainStyledAttributes.getResourceId(R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId, -1));
        }
        createMaterialShapeDrawableIfNeeded(context);
        this.elevation = obtainStyledAttributes.getDimension(R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        obtainStyledAttributes.recycle();
        setSheetEdge(getDefaultSheetEdge());
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
