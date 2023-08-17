package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.c1;
import androidx.core.view.d1;
import androidx.core.view.f1;
import androidx.core.view.q1;
import androidx.core.view.q2;
import androidx.core.view.u1;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.h0;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.y;
import c3.a;
import d.b1;
import d.l1;
import d.o0;
import d.q0;
import d.u0;
import h1.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z0.w0;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements q1, c1, d1 {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    androidx.recyclerview.widget.y mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    g mAdapter;
    androidx.recyclerview.widget.a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private j mChildDrawingOrderCallback;
    androidx.recyclerview.widget.g mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    @o0
    private k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    @l1
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.l mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    l mItemAnimator;
    private l.c mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    @l1
    o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final y mObserver;
    private List<q> mOnChildAttachStateListeners;
    private r mOnFlingListener;
    private final ArrayList<s> mOnItemTouchListeners;
    @l1
    final List<f0> mPendingAccessibilityImportanceChange;
    private z mPendingSavedState;
    boolean mPostedAnimatorRunner;
    l.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final w mRecycler;
    x mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private t mScrollListener;
    private List<t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private f1 mScrollingChildHelper;
    final c0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final e0 mViewFlinger;
    private final h0.b mViewInfoProcessCallback;
    final h0 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a0 implements s {
        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean a(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void c(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void e(boolean z6) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.x();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b0 {
        private o mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: h  reason: collision with root package name */
            public static final int f5058h = Integer.MIN_VALUE;

            /* renamed from: a  reason: collision with root package name */
            public int f5059a;

            /* renamed from: b  reason: collision with root package name */
            public int f5060b;

            /* renamed from: c  reason: collision with root package name */
            public int f5061c;

            /* renamed from: d  reason: collision with root package name */
            public int f5062d;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f5063e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f5064f;

            /* renamed from: g  reason: collision with root package name */
            public int f5065g;

            public a(@u0 int i7, @u0 int i8) {
                this(i7, i8, Integer.MIN_VALUE, null);
            }

            public int a() {
                return this.f5061c;
            }

            @u0
            public int b() {
                return this.f5059a;
            }

            @u0
            public int c() {
                return this.f5060b;
            }

            @q0
            public Interpolator d() {
                return this.f5063e;
            }

            public boolean e() {
                return this.f5062d >= 0;
            }

            public void f(int i7) {
                this.f5062d = i7;
            }

            public void g(RecyclerView recyclerView) {
                int i7 = this.f5062d;
                if (i7 >= 0) {
                    this.f5062d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i7);
                    this.f5064f = false;
                } else if (!this.f5064f) {
                    this.f5065g = 0;
                } else {
                    m();
                    recyclerView.mViewFlinger.f(this.f5059a, this.f5060b, this.f5061c, this.f5063e);
                    int i8 = this.f5065g + 1;
                    this.f5065g = i8;
                    if (i8 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f5064f = false;
                }
            }

            public void h(int i7) {
                this.f5064f = true;
                this.f5061c = i7;
            }

            public void i(@u0 int i7) {
                this.f5064f = true;
                this.f5059a = i7;
            }

            public void j(@u0 int i7) {
                this.f5064f = true;
                this.f5060b = i7;
            }

            public void k(@q0 Interpolator interpolator) {
                this.f5064f = true;
                this.f5063e = interpolator;
            }

            public void l(@u0 int i7, @u0 int i8, int i9, @q0 Interpolator interpolator) {
                this.f5059a = i7;
                this.f5060b = i8;
                this.f5061c = i9;
                this.f5063e = interpolator;
                this.f5064f = true;
            }

            public final void m() {
                if (this.f5063e != null && this.f5061c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f5061c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public a(@u0 int i7, @u0 int i8, int i9) {
                this(i7, i8, i9, null);
            }

            public a(@u0 int i7, @u0 int i8, int i9, @q0 Interpolator interpolator) {
                this.f5062d = -1;
                this.f5064f = false;
                this.f5065g = 0;
                this.f5059a = i7;
                this.f5060b = i8;
                this.f5061c = i9;
                this.f5063e = interpolator;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            @q0
            PointF computeScrollVectorForPosition(int i7);
        }

        @q0
        public PointF computeScrollVectorForPosition(int i7) {
            o layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i7);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i7) {
            return this.mRecyclerView.mLayout.findViewByPosition(i7);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        @q0
        public o getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i7) {
            this.mRecyclerView.scrollToPosition(i7);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(@o0 PointF pointF) {
            float f7 = pointF.x;
            float f8 = pointF.y;
            float sqrt = (float) Math.sqrt((f7 * f7) + (f8 * f8));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void onAnimation(int i7, int i8) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f7 = computeScrollVectorForPosition.x;
                if (f7 != 0.0f || computeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f7), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.g(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i7, i8, recyclerView.mState, this.mRecyclingAction);
                boolean e7 = this.mRecyclingAction.e();
                this.mRecyclingAction.g(recyclerView);
                if (e7 && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.e();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        public abstract void onSeekTargetStep(@u0 int i7, @u0 int i8, @o0 c0 c0Var, @o0 a aVar);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(@o0 View view, @o0 c0 c0Var, @o0 a aVar);

        public void setTargetPosition(int i7) {
            this.mTargetPosition = i7;
        }

        public void start(RecyclerView recyclerView, o oVar) {
            recyclerView.mViewFlinger.g();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = oVar;
            int i7 = this.mTargetPosition;
            if (i7 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f5069a = i7;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.e();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f5069a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public static class c0 {

        /* renamed from: r  reason: collision with root package name */
        public static final int f5066r = 1;

        /* renamed from: s  reason: collision with root package name */
        public static final int f5067s = 2;

        /* renamed from: t  reason: collision with root package name */
        public static final int f5068t = 4;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<Object> f5070b;

        /* renamed from: m  reason: collision with root package name */
        public int f5081m;

        /* renamed from: n  reason: collision with root package name */
        public long f5082n;

        /* renamed from: o  reason: collision with root package name */
        public int f5083o;

        /* renamed from: p  reason: collision with root package name */
        public int f5084p;

        /* renamed from: q  reason: collision with root package name */
        public int f5085q;

        /* renamed from: a  reason: collision with root package name */
        public int f5069a = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f5071c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f5072d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f5073e = 1;

        /* renamed from: f  reason: collision with root package name */
        public int f5074f = 0;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5075g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5076h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5077i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5078j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f5079k = false;

        /* renamed from: l  reason: collision with root package name */
        public boolean f5080l = false;

        public void a(int i7) {
            if ((this.f5073e & i7) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.f5073e));
        }

        public boolean b() {
            return this.f5075g;
        }

        public <T> T c(int i7) {
            SparseArray<Object> sparseArray = this.f5070b;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i7);
        }

        public int d() {
            return this.f5076h ? this.f5071c - this.f5072d : this.f5074f;
        }

        public int e() {
            return this.f5084p;
        }

        public int f() {
            return this.f5085q;
        }

        public int g() {
            return this.f5069a;
        }

        public boolean h() {
            return this.f5069a != -1;
        }

        public boolean i() {
            return this.f5078j;
        }

        public boolean j() {
            return this.f5076h;
        }

        public void k(g gVar) {
            this.f5073e = 1;
            this.f5074f = gVar.getItemCount();
            this.f5076h = false;
            this.f5077i = false;
            this.f5078j = false;
        }

        public void l(int i7, Object obj) {
            if (this.f5070b == null) {
                this.f5070b = new SparseArray<>();
            }
            this.f5070b.put(i7, obj);
        }

        public void m(int i7) {
            SparseArray<Object> sparseArray = this.f5070b;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i7);
        }

        public boolean n() {
            return this.f5080l;
        }

        public boolean o() {
            return this.f5079k;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f5069a + ", mData=" + this.f5070b + ", mItemCount=" + this.f5074f + ", mIsMeasuring=" + this.f5078j + ", mPreviousLayoutItemCount=" + this.f5071c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5072d + ", mStructureChanged=" + this.f5075g + ", mInPreLayout=" + this.f5076h + ", mRunSimpleAnimations=" + this.f5079k + ", mRunPredictiveAnimations=" + this.f5080l + '}';
        }
    }

    /* loaded from: classes.dex */
    public class d implements h0.b {
        public d() {
        }

        @Override // androidx.recyclerview.widget.h0.b
        public void a(f0 f0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.removeAndRecycleView(f0Var.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.h0.b
        public void b(f0 f0Var, l.d dVar, l.d dVar2) {
            RecyclerView.this.animateAppearance(f0Var, dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.h0.b
        public void c(f0 f0Var, @o0 l.d dVar, @q0 l.d dVar2) {
            RecyclerView.this.mRecycler.K(f0Var);
            RecyclerView.this.animateDisappearance(f0Var, dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.h0.b
        public void d(f0 f0Var, @o0 l.d dVar, @o0 l.d dVar2) {
            f0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.b(f0Var, f0Var, dVar, dVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.d(f0Var, dVar, dVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d0 {
        @q0
        public abstract View a(@o0 w wVar, int i7, int i8);
    }

    /* loaded from: classes.dex */
    public class e implements g.b {
        public e() {
        }

        @Override // androidx.recyclerview.widget.g.b
        public View a(int i7) {
            return RecyclerView.this.getChildAt(i7);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void b(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.g.b
        public f0 c(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void d(int i7) {
            f0 childViewHolderInt;
            View a7 = a(i7);
            if (a7 != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(a7)) != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i7);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void e(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.g.b
        public void f(View view, int i7) {
            RecyclerView.this.addView(view, i7);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.g.b
        public int g() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.g.b
        public void h(int i7) {
            View childAt = RecyclerView.this.getChildAt(i7);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i7);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void i() {
            int g7 = g();
            for (int i7 = 0; i7 < g7; i7++) {
                View a7 = a(i7);
                RecyclerView.this.dispatchChildDetached(a7);
                a7.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.g.b
        public void j(View view, int i7, ViewGroup.LayoutParams layoutParams) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i7, layoutParams);
        }

        @Override // androidx.recyclerview.widget.g.b
        public int k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* loaded from: classes.dex */
    public class e0 implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public int f5088k;

        /* renamed from: l  reason: collision with root package name */
        public int f5089l;

        /* renamed from: m  reason: collision with root package name */
        public OverScroller f5090m;

        /* renamed from: n  reason: collision with root package name */
        public Interpolator f5091n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f5092o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f5093p;

        public e0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f5091n = interpolator;
            this.f5092o = false;
            this.f5093p = false;
            this.f5090m = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i7, int i8, int i9, int i10) {
            int i11;
            int abs = Math.abs(i7);
            int abs2 = Math.abs(i8);
            boolean z6 = abs > abs2;
            int sqrt = (int) Math.sqrt((i9 * i9) + (i10 * i10));
            int sqrt2 = (int) Math.sqrt((i7 * i7) + (i8 * i8));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z6 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i12 = width / 2;
            float f7 = width;
            float f8 = i12;
            float b7 = f8 + (b(Math.min(1.0f, (sqrt2 * 1.0f) / f7)) * f8);
            if (sqrt > 0) {
                i11 = Math.round(Math.abs(b7 / sqrt) * 1000.0f) * 4;
            } else {
                if (!z6) {
                    abs = abs2;
                }
                i11 = (int) (((abs / f7) + 1.0f) * 300.0f);
            }
            return Math.min(i11, (int) RecyclerView.MAX_SCROLL_DURATION);
        }

        public final float b(float f7) {
            return (float) Math.sin((f7 - 0.5f) * 0.47123894f);
        }

        public void c(int i7, int i8) {
            RecyclerView.this.setScrollState(2);
            this.f5089l = 0;
            this.f5088k = 0;
            Interpolator interpolator = this.f5091n;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f5091n = interpolator2;
                this.f5090m = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f5090m.fling(0, 0, i7, i8, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        public final void d() {
            RecyclerView.this.removeCallbacks(this);
            u1.p1(RecyclerView.this, this);
        }

        public void e() {
            if (this.f5092o) {
                this.f5093p = true;
            } else {
                d();
            }
        }

        public void f(int i7, int i8, int i9, @q0 Interpolator interpolator) {
            if (i9 == Integer.MIN_VALUE) {
                i9 = a(i7, i8, 0, 0);
            }
            int i10 = i9;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f5091n != interpolator) {
                this.f5091n = interpolator;
                this.f5090m = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f5089l = 0;
            this.f5088k = 0;
            RecyclerView.this.setScrollState(2);
            this.f5090m.startScroll(0, 0, i7, i8, i10);
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f5090m.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i7;
            int i8;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                g();
                return;
            }
            this.f5093p = false;
            this.f5092o = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f5090m;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i9 = currX - this.f5088k;
                int i10 = currY - this.f5089l;
                this.f5088k = currX;
                this.f5089l = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i9, i10, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i9 -= iArr2[0];
                    i10 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i9, i10);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i9, i10, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i8 = iArr4[0];
                    i7 = iArr4[1];
                    i9 -= i8;
                    i10 -= i7;
                    b0 b0Var = recyclerView4.mLayout.mSmoothScroller;
                    if (b0Var != null && !b0Var.isPendingInitialRun() && b0Var.isRunning()) {
                        int d7 = RecyclerView.this.mState.d();
                        if (d7 == 0) {
                            b0Var.stop();
                        } else if (b0Var.getTargetPosition() >= d7) {
                            b0Var.setTargetPosition(d7 - 1);
                            b0Var.onAnimation(i8, i7);
                        } else {
                            b0Var.onAnimation(i8, i7);
                        }
                    }
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i8, i7, i9, i10, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i11 = i9 - iArr6[0];
                int i12 = i10 - iArr6[1];
                if (i8 != 0 || i7 != 0) {
                    recyclerView6.dispatchOnScrolled(i8, i7);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z6 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
                b0 b0Var2 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((b0Var2 != null && b0Var2.isPendingInitialRun()) || !z6) {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.l lVar = recyclerView7.mGapWorker;
                    if (lVar != null) {
                        lVar.f(recyclerView7, i8, i7);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                        if (i12 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i12 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i13, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.b();
                    }
                }
            }
            b0 b0Var3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (b0Var3 != null && b0Var3.isPendingInitialRun()) {
                b0Var3.onAnimation(0, 0);
            }
            this.f5092o = false;
            if (this.f5093p) {
                d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    /* loaded from: classes.dex */
    public class f implements a.InterfaceC0062a {
        public f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0062a
        public void a(int i7, int i8) {
            RecyclerView.this.offsetPositionRecordsForMove(i7, i8);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0062a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0062a
        public f0 c(int i7) {
            f0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i7, true);
            if (findViewHolderForPosition == null || RecyclerView.this.mChildHelper.n(findViewHolderForPosition.itemView)) {
                return null;
            }
            return findViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0062a
        public void d(int i7, int i8) {
            RecyclerView.this.offsetPositionRecordsForRemove(i7, i8, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0062a
        public void e(int i7, int i8) {
            RecyclerView.this.offsetPositionRecordsForInsert(i7, i8);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0062a
        public void f(int i7, int i8) {
            RecyclerView.this.offsetPositionRecordsForRemove(i7, i8, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f5072d += i8;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0062a
        public void g(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0062a
        public void h(int i7, int i8, Object obj) {
            RecyclerView.this.viewRangeUpdate(i7, i8, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        public void i(a.b bVar) {
            int i7 = bVar.f5224a;
            if (i7 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, bVar.f5225b, bVar.f5227d);
            } else if (i7 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, bVar.f5225b, bVar.f5227d);
            } else if (i7 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, bVar.f5225b, bVar.f5227d, bVar.f5226c);
            } else if (i7 != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, bVar.f5225b, bVar.f5227d, 1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        @o0
        public final View itemView;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        f0 mShadowedHolder = null;
        f0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        @l1
        int mPendingAccessibilityState = -1;

        public f0(@o0 View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        public final void a() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                a();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i7) {
            this.mFlags = i7 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && u1.M0(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i7, int i8, boolean z6) {
            addFlags(8);
            offsetPosition(i8, z6);
            this.mPosition = i7;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i7 = this.mPreLayoutPosition;
            return i7 == -1 ? this.mPosition : i7;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i7 = this.mPreLayoutPosition;
            return i7 == -1 ? this.mPosition : i7;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
            }
            return FULLUPDATE_PAYLOADS;
        }

        public boolean hasAnyOfTheFlags(int i7) {
            return (i7 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !u1.M0(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i7, boolean z6) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z6) {
                this.mPreLayoutPosition += i7;
            }
            this.mPosition += i7;
            if (this.itemView.getLayoutParams() != null) {
                ((p) this.itemView.getLayoutParams()).f5125c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i7 = this.mPendingAccessibilityState;
            if (i7 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i7;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = u1.V(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i7, int i8) {
            this.mFlags = (i7 & i8) | (this.mFlags & (~i8));
        }

        public final void setIsRecyclable(boolean z6) {
            int i7 = this.mIsRecyclableCount;
            int i8 = z6 ? i7 - 1 : i7 + 1;
            this.mIsRecyclableCount = i8;
            if (i8 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z6 && i8 == 1) {
                this.mFlags |= 16;
            } else if (z6 && i8 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(w wVar, boolean z6) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z6;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.K(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g<VH extends f0> {
        private final h mObservable = new h();
        private boolean mHasStableIds = false;

        public final void bindViewHolder(@o0 VH vh, int i7) {
            vh.mPosition = i7;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i7);
            }
            vh.setFlags(1, 519);
            w0.b(RecyclerView.TRACE_BIND_VIEW_TAG);
            onBindViewHolder(vh, i7, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f5125c = true;
            }
            w0.d();
        }

        @o0
        public final VH createViewHolder(@o0 ViewGroup viewGroup, int i7) {
            try {
                w0.b(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i7);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i7;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                w0.d();
            }
        }

        public abstract int getItemCount();

        public long getItemId(int i7) {
            return -1L;
        }

        public int getItemViewType(int i7) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i7) {
            this.mObservable.d(i7, 1);
        }

        public final void notifyItemInserted(int i7) {
            this.mObservable.f(i7, 1);
        }

        public final void notifyItemMoved(int i7, int i8) {
            this.mObservable.c(i7, i8);
        }

        public final void notifyItemRangeChanged(int i7, int i8) {
            this.mObservable.d(i7, i8);
        }

        public final void notifyItemRangeInserted(int i7, int i8) {
            this.mObservable.f(i7, i8);
        }

        public final void notifyItemRangeRemoved(int i7, int i8) {
            this.mObservable.g(i7, i8);
        }

        public final void notifyItemRemoved(int i7) {
            this.mObservable.g(i7, 1);
        }

        public void onAttachedToRecyclerView(@o0 RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@o0 VH vh, int i7);

        public void onBindViewHolder(@o0 VH vh, int i7, @o0 List<Object> list) {
            onBindViewHolder(vh, i7);
        }

        @o0
        public abstract VH onCreateViewHolder(@o0 ViewGroup viewGroup, int i7);

        public void onDetachedFromRecyclerView(@o0 RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@o0 VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(@o0 VH vh) {
        }

        public void onViewDetachedFromWindow(@o0 VH vh) {
        }

        public void onViewRecycled(@o0 VH vh) {
        }

        public void registerAdapterDataObserver(@o0 i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z6) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z6;
        }

        public void unregisterAdapterDataObserver(@o0 i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }

        public final void notifyItemChanged(int i7, @q0 Object obj) {
            this.mObservable.e(i7, 1, obj);
        }

        public final void notifyItemRangeChanged(int i7, int i8, @q0 Object obj) {
            this.mObservable.e(i7, i8, obj);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Observable<i> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void c(int i7, int i8) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i7, i8, 1);
            }
        }

        public void d(int i7, int i8) {
            e(i7, i8, null);
        }

        public void e(int i7, int i8, @q0 Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i7, i8, obj);
            }
        }

        public void f(int i7, int i8) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i7, i8);
            }
        }

        public void g(int i7, int i8) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i7, i8);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i7, int i8) {
        }

        public void onItemRangeInserted(int i7, int i8) {
        }

        public void onItemRangeMoved(int i7, int i8, int i9) {
        }

        public void onItemRangeRemoved(int i7, int i8) {
        }

        public void onItemRangeChanged(int i7, int i8, @q0 Object obj) {
            onItemRangeChanged(i7, i8);
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        int a(int i7, int i8);
    }

    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public static final int f5096a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final int f5097b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f5098c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static final int f5099d = 3;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        @o0
        public EdgeEffect a(@o0 RecyclerView recyclerView, int i7) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {

        /* renamed from: g  reason: collision with root package name */
        public static final int f5100g = 2;

        /* renamed from: h  reason: collision with root package name */
        public static final int f5101h = 8;

        /* renamed from: i  reason: collision with root package name */
        public static final int f5102i = 4;

        /* renamed from: j  reason: collision with root package name */
        public static final int f5103j = 2048;

        /* renamed from: k  reason: collision with root package name */
        public static final int f5104k = 4096;

        /* renamed from: a  reason: collision with root package name */
        public c f5105a = null;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f5106b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public long f5107c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f5108d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f5109e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f5110f = 250;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        /* loaded from: classes.dex */
        public interface b {
            void a();
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(@o0 f0 f0Var);
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f5111a;

            /* renamed from: b  reason: collision with root package name */
            public int f5112b;

            /* renamed from: c  reason: collision with root package name */
            public int f5113c;

            /* renamed from: d  reason: collision with root package name */
            public int f5114d;

            /* renamed from: e  reason: collision with root package name */
            public int f5115e;

            @o0
            public d a(@o0 f0 f0Var) {
                return b(f0Var, 0);
            }

            @o0
            public d b(@o0 f0 f0Var, int i7) {
                View view = f0Var.itemView;
                this.f5111a = view.getLeft();
                this.f5112b = view.getTop();
                this.f5113c = view.getRight();
                this.f5114d = view.getBottom();
                return this;
            }
        }

        public static int e(f0 f0Var) {
            int i7 = f0Var.mFlags & 14;
            if (f0Var.isInvalid()) {
                return 4;
            }
            if ((i7 & 4) == 0) {
                int oldPosition = f0Var.getOldPosition();
                int adapterPosition = f0Var.getAdapterPosition();
                return (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) ? i7 : i7 | 2048;
            }
            return i7;
        }

        public void A(c cVar) {
            this.f5105a = cVar;
        }

        public void B(long j7) {
            this.f5109e = j7;
        }

        public void C(long j7) {
            this.f5108d = j7;
        }

        public abstract boolean a(@o0 f0 f0Var, @q0 d dVar, @o0 d dVar2);

        public abstract boolean b(@o0 f0 f0Var, @o0 f0 f0Var2, @o0 d dVar, @o0 d dVar2);

        public abstract boolean c(@o0 f0 f0Var, @o0 d dVar, @q0 d dVar2);

        public abstract boolean d(@o0 f0 f0Var, @o0 d dVar, @o0 d dVar2);

        public boolean f(@o0 f0 f0Var) {
            return true;
        }

        public boolean g(@o0 f0 f0Var, @o0 List<Object> list) {
            return f(f0Var);
        }

        public final void h(@o0 f0 f0Var) {
            t(f0Var);
            c cVar = this.f5105a;
            if (cVar != null) {
                cVar.a(f0Var);
            }
        }

        public final void i(@o0 f0 f0Var) {
            u(f0Var);
        }

        public final void j() {
            int size = this.f5106b.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f5106b.get(i7).a();
            }
            this.f5106b.clear();
        }

        public abstract void k(@o0 f0 f0Var);

        public abstract void l();

        public long m() {
            return this.f5107c;
        }

        public long n() {
            return this.f5110f;
        }

        public long o() {
            return this.f5109e;
        }

        public long p() {
            return this.f5108d;
        }

        public abstract boolean q();

        public final boolean r(@q0 b bVar) {
            boolean q6 = q();
            if (bVar != null) {
                if (q6) {
                    this.f5106b.add(bVar);
                } else {
                    bVar.a();
                }
            }
            return q6;
        }

        @o0
        public d s() {
            return new d();
        }

        public void t(@o0 f0 f0Var) {
        }

        public void u(@o0 f0 f0Var) {
        }

        @o0
        public d v(@o0 c0 c0Var, @o0 f0 f0Var) {
            return s().a(f0Var);
        }

        @o0
        public d w(@o0 c0 c0Var, @o0 f0 f0Var, int i7, @o0 List<Object> list) {
            return s().a(f0Var);
        }

        public abstract void x();

        public void y(long j7) {
            this.f5107c = j7;
        }

        public void z(long j7) {
            this.f5110f = j7;
        }
    }

    /* loaded from: classes.dex */
    public class m implements l.c {
        public m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.c
        public void a(f0 f0Var) {
            f0Var.setIsRecyclable(true);
            if (f0Var.mShadowedHolder != null && f0Var.mShadowingHolder == null) {
                f0Var.mShadowedHolder = null;
            }
            f0Var.mShadowingHolder = null;
            if (f0Var.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(f0Var.itemView) || !f0Var.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(f0Var.itemView, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class n {
        @Deprecated
        public void getItemOffsets(@o0 Rect rect, int i7, @o0 RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@o0 Canvas canvas, @o0 RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@o0 Canvas canvas, @o0 RecyclerView recyclerView) {
        }

        public void getItemOffsets(@o0 Rect rect, @o0 View view, @o0 RecyclerView recyclerView, @o0 c0 c0Var) {
            getItemOffsets(rect, ((p) view.getLayoutParams()).b(), recyclerView);
        }

        public void onDraw(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 c0 c0Var) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 c0 c0Var) {
            onDrawOver(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.g mChildHelper;
        private int mHeight;
        private int mHeightMode;
        g0 mHorizontalBoundCheck;
        private final g0.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        @q0
        b0 mSmoothScroller;
        g0 mVerticalBoundCheck;
        private final g0.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* loaded from: classes.dex */
        public class a implements g0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.g0.b
            public View a(int i7) {
                return o.this.getChildAt(i7);
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int b() {
                return o.this.getWidth() - o.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int c(View view) {
                return o.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int d() {
                return o.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int e(View view) {
                return o.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements g0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.g0.b
            public View a(int i7) {
                return o.this.getChildAt(i7);
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int b() {
                return o.this.getHeight() - o.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int c(View view) {
                return o.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int d() {
                return o.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int e(View view) {
                return o.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i7, int i8);
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f5119a;

            /* renamed from: b  reason: collision with root package name */
            public int f5120b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f5121c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f5122d;
        }

        public o() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new g0(aVar);
            this.mVerticalBoundCheck = new g0(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        public static int chooseSize(int i7, int i8, int i9) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i8, i9) : size : Math.min(size, Math.max(i8, i9));
        }

        public static boolean e(int i7, int i8, int i9) {
            int mode = View.MeasureSpec.getMode(i8);
            int size = View.MeasureSpec.getSize(i8);
            if (i9 <= 0 || i7 == i9) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i7;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i7;
                } else {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
            if (r3 >= 0) goto L8;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = r2
                goto L1e
            Lf:
                if (r3 < 0) goto L13
            L11:
                r2 = r0
                goto L1e
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto L11
            L18:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.getChildMeasureSpec(int, int, int, boolean):int");
        }

        public static d getProperties(@o0 Context context, @q0 AttributeSet attributeSet, int i7, int i8) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.P, i7, i8);
            dVar.f5119a = obtainStyledAttributes.getInt(a.j.Q, 1);
            dVar.f5120b = obtainStyledAttributes.getInt(a.j.f7942a0, 1);
            dVar.f5121c = obtainStyledAttributes.getBoolean(a.j.Z, false);
            dVar.f5122d = obtainStyledAttributes.getBoolean(a.j.f7944b0, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public final void a(View view, int i7, boolean z6) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z6 || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.p(childViewHolderInt);
            }
            p pVar = (p) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.c(view, i7, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int m7 = this.mChildHelper.m(view);
                if (i7 == -1) {
                    i7 = this.mChildHelper.g();
                }
                if (m7 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                } else if (m7 != i7) {
                    this.mRecyclerView.mLayout.moveView(m7, i7);
                }
            } else {
                this.mChildHelper.a(view, i7, false);
                pVar.f5125c = true;
                b0 b0Var = this.mSmoothScroller;
                if (b0Var != null && b0Var.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (pVar.f5126d) {
                childViewHolderInt.itemView.invalidate();
                pVar.f5126d = false;
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(@o0 View view, int i7, p pVar) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.p(childViewHolderInt);
            }
            this.mChildHelper.c(view, i7, pVar, childViewHolderInt.isRemoved());
        }

        public final void b(int i7, @o0 View view) {
            this.mChildHelper.d(i7);
        }

        public final int[] c(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i7 = left - paddingLeft;
            int min = Math.min(0, i7);
            int i8 = top - paddingTop;
            int min2 = Math.min(0, i8);
            int i9 = width2 - width;
            int max = Math.max(0, i9);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i7, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i9);
            }
            if (min2 == 0) {
                min2 = Math.min(i8, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public void calculateItemDecorationsForChild(@o0 View view, @o0 Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(p pVar) {
            return pVar != null;
        }

        public void collectAdjacentPrefetchPositions(int i7, int i8, c0 c0Var, c cVar) {
        }

        public void collectInitialPrefetchPositions(int i7, c cVar) {
        }

        public int computeHorizontalScrollExtent(@o0 c0 c0Var) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@o0 c0 c0Var) {
            return 0;
        }

        public int computeHorizontalScrollRange(@o0 c0 c0Var) {
            return 0;
        }

        public int computeVerticalScrollExtent(@o0 c0 c0Var) {
            return 0;
        }

        public int computeVerticalScrollOffset(@o0 c0 c0Var) {
            return 0;
        }

        public int computeVerticalScrollRange(@o0 c0 c0Var) {
            return 0;
        }

        public final boolean d(RecyclerView recyclerView, int i7, int i8) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i7 < width && rect.right - i7 > paddingLeft && rect.top - i8 < height && rect.bottom - i8 > paddingTop;
        }

        public void detachAndScrapAttachedViews(@o0 w wVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                f(wVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@o0 View view, @o0 w wVar) {
            f(wVar, this.mChildHelper.m(view), view);
        }

        public void detachAndScrapViewAt(int i7, @o0 w wVar) {
            f(wVar, i7, getChildAt(i7));
        }

        public void detachView(@o0 View view) {
            int m7 = this.mChildHelper.m(view);
            if (m7 >= 0) {
                b(m7, view);
            }
        }

        public void detachViewAt(int i7) {
            b(i7, getChildAt(i7));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, w wVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, wVar);
        }

        public void endAnimation(View view) {
            l lVar = this.mRecyclerView.mItemAnimator;
            if (lVar != null) {
                lVar.k(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public final void f(w wVar, int i7, View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i7);
                wVar.D(childViewHolderInt);
                return;
            }
            detachViewAt(i7);
            wVar.E(view);
            this.mRecyclerView.mViewInfoStore.k(childViewHolderInt);
        }

        @q0
        public View findContainingItemView(@o0 View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        @q0
        public View findViewByPosition(int i7) {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i7 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.j() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract p generateDefaultLayoutParams();

        public p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p) {
                return new p((p) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new p((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new p(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@o0 View view) {
            return ((p) view.getLayoutParams()).f5124b.bottom;
        }

        @q0
        public View getChildAt(int i7) {
            androidx.recyclerview.widget.g gVar = this.mChildHelper;
            if (gVar != null) {
                return gVar.f(i7);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.g gVar = this.mChildHelper;
            if (gVar != null) {
                return gVar.g();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(@o0 w wVar, @o0 c0 c0Var) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getDecoratedBottom(@o0 View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(@o0 View view, @o0 Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@o0 View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@o0 View view) {
            Rect rect = ((p) view.getLayoutParams()).f5124b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@o0 View view) {
            Rect rect = ((p) view.getLayoutParams()).f5124b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@o0 View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(@o0 View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        @q0
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @u0
        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@o0 View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return u1.Z(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(@o0 View view) {
            return ((p) view.getLayoutParams()).f5124b.left;
        }

        @u0
        public int getMinimumHeight() {
            return u1.e0(this.mRecyclerView);
        }

        @u0
        public int getMinimumWidth() {
            return u1.f0(this.mRecyclerView);
        }

        @u0
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @u0
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return u1.j0(recyclerView);
            }
            return 0;
        }

        @u0
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @u0
        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @u0
        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return u1.k0(recyclerView);
            }
            return 0;
        }

        @u0
        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@o0 View view) {
            return ((p) view.getLayoutParams()).b();
        }

        public int getRightDecorationWidth(@o0 View view) {
            return ((p) view.getLayoutParams()).f5124b.right;
        }

        public int getRowCountForAccessibility(@o0 w wVar, @o0 c0 c0Var) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollVertically()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getSelectionModeForAccessibility(@o0 w wVar, @o0 c0 c0Var) {
            return 0;
        }

        public int getTopDecorationHeight(@o0 View view) {
            return ((p) view.getLayoutParams()).f5124b.top;
        }

        public void getTransformedBoundingBox(@o0 View view, boolean z6, @o0 Rect rect) {
            Matrix matrix;
            if (z6) {
                Rect rect2 = ((p) view.getLayoutParams()).f5124b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        @u0
        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i7).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(@o0 View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
            }
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.q(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@o0 w wVar, @o0 c0 c0Var) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            b0 b0Var = this.mSmoothScroller;
            return b0Var != null && b0Var.isRunning();
        }

        public boolean isViewPartiallyVisible(@o0 View view, boolean z6, boolean z7) {
            boolean z8 = this.mHorizontalBoundCheck.b(view, 24579) && this.mVerticalBoundCheck.b(view, 24579);
            return z6 ? z8 : !z8;
        }

        public void layoutDecorated(@o0 View view, int i7, int i8, int i9, int i10) {
            Rect rect = ((p) view.getLayoutParams()).f5124b;
            view.layout(i7 + rect.left, i8 + rect.top, i9 - rect.right, i10 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@o0 View view, int i7, int i8, int i9, int i10) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f5124b;
            view.layout(i7 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i8 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i9 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i10 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public void measureChild(@o0 View view, int i7, int i8) {
            p pVar = (p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i9 = i7 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i10 = i8 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i9, ((ViewGroup.MarginLayoutParams) pVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i10, ((ViewGroup.MarginLayoutParams) pVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, pVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@o0 View view, int i7, int i8) {
            p pVar = (p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i9 = i7 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i10 = i8 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i9, ((ViewGroup.MarginLayoutParams) pVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) pVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, pVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i7, int i8) {
            View childAt = getChildAt(i7);
            if (childAt != null) {
                detachViewAt(i7);
                attachView(childAt, i8);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i7 + this.mRecyclerView.toString());
        }

        public void offsetChildrenHorizontal(@u0 int i7) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i7);
            }
        }

        public void offsetChildrenVertical(@u0 int i7) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i7);
            }
        }

        public void onAdapterChanged(@q0 g gVar, @q0 g gVar2) {
        }

        public boolean onAddFocusables(@o0 RecyclerView recyclerView, @o0 ArrayList<View> arrayList, int i7, int i8) {
            return false;
        }

        @d.i
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @q0
        public View onFocusSearchFailed(@o0 View view, int i7, @o0 w wVar, @o0 c0 c0Var) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@o0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(h1.f0 f0Var) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, f0Var);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, h1.f0 f0Var) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.n(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, f0Var);
        }

        @q0
        public View onInterceptFocusSearch(@o0 View view, int i7) {
            return null;
        }

        public void onItemsAdded(@o0 RecyclerView recyclerView, int i7, int i8) {
        }

        public void onItemsChanged(@o0 RecyclerView recyclerView) {
        }

        public void onItemsMoved(@o0 RecyclerView recyclerView, int i7, int i8, int i9) {
        }

        public void onItemsRemoved(@o0 RecyclerView recyclerView, int i7, int i8) {
        }

        public void onItemsUpdated(@o0 RecyclerView recyclerView, int i7, int i8) {
        }

        public void onLayoutChildren(w wVar, c0 c0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onLayoutCompleted(c0 c0Var) {
        }

        public void onMeasure(@o0 w wVar, @o0 c0 c0Var, int i7, int i8) {
            this.mRecyclerView.defaultOnMeasure(i7, i8);
        }

        @Deprecated
        public boolean onRequestChildFocus(@o0 RecyclerView recyclerView, @o0 View view, @q0 View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @q0
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i7) {
        }

        public void onSmoothScrollerStopped(b0 b0Var) {
            if (this.mSmoothScroller == b0Var) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i7, @q0 Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i7, bundle);
        }

        public boolean performAccessibilityActionForItem(@o0 w wVar, @o0 c0 c0Var, @o0 View view, int i7, @q0 Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                u1.p1(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.q(childCount);
            }
        }

        public void removeAndRecycleAllViews(@o0 w wVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, wVar);
                }
            }
        }

        public void removeAndRecycleScrapInt(w wVar) {
            int k7 = wVar.k();
            for (int i7 = k7 - 1; i7 >= 0; i7--) {
                View o6 = wVar.o(i7);
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(o6);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(o6, false);
                    }
                    l lVar = this.mRecyclerView.mItemAnimator;
                    if (lVar != null) {
                        lVar.k(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    wVar.z(o6);
                }
            }
            wVar.f();
            if (k7 > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@o0 View view, @o0 w wVar) {
            removeView(view);
            wVar.C(view);
        }

        public void removeAndRecycleViewAt(int i7, @o0 w wVar) {
            View childAt = getChildAt(i7);
            removeViewAt(i7);
            wVar.C(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@o0 View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            this.mChildHelper.p(view);
        }

        public void removeViewAt(int i7) {
            if (getChildAt(i7) != null) {
                this.mChildHelper.q(i7);
            }
        }

        public boolean requestChildRectangleOnScreen(@o0 RecyclerView recyclerView, @o0 View view, @o0 Rect rect, boolean z6) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z6, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i7, w wVar, c0 c0Var) {
            return 0;
        }

        public void scrollToPosition(int i7) {
        }

        public int scrollVerticallyBy(int i7, w wVar, c0 c0Var) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z6) {
            this.mAutoMeasure = z6;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z6) {
            if (z6 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z6;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.L();
                }
            }
        }

        public void setMeasureSpecs(int i7, int i8) {
            this.mWidth = View.MeasureSpec.getSize(i7);
            int mode = View.MeasureSpec.getMode(i7);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i8);
            int mode2 = View.MeasureSpec.getMode(i8);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i7, int i8) {
            setMeasuredDimension(chooseSize(i7, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i8, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i7, int i8) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i7, i8);
                return;
            }
            int i9 = Integer.MIN_VALUE;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MAX_VALUE;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i14 = rect.left;
                if (i14 < i12) {
                    i12 = i14;
                }
                int i15 = rect.right;
                if (i15 > i9) {
                    i9 = i15;
                }
                int i16 = rect.top;
                if (i16 < i10) {
                    i10 = i16;
                }
                int i17 = rect.bottom;
                if (i17 > i11) {
                    i11 = i17;
                }
            }
            this.mRecyclerView.mTempRect.set(i12, i10, i9, i11);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i7, i8);
        }

        public void setMeasurementCacheEnabled(boolean z6) {
            this.mMeasurementCacheEnabled = z6;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i7, int i8, p pVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && e(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) pVar).width) && e(view.getHeight(), i8, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i7, int i8, p pVar) {
            return (this.mMeasurementCacheEnabled && e(view.getMeasuredWidth(), i7, ((ViewGroup.MarginLayoutParams) pVar).width) && e(view.getMeasuredHeight(), i8, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, c0 c0Var, int i7) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(b0 b0Var) {
            b0 b0Var2 = this.mSmoothScroller;
            if (b0Var2 != null && b0Var != b0Var2 && b0Var2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = b0Var;
            b0Var.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@o0 View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            b0 b0Var = this.mSmoothScroller;
            if (b0Var != null) {
                b0Var.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i7) {
            a(view, i7, true);
        }

        public void addView(View view, int i7) {
            a(view, i7, false);
        }

        @d.i
        public void onDetachedFromWindow(RecyclerView recyclerView, w wVar) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(@o0 w wVar, @o0 c0 c0Var, @o0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z6 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z6 = false;
            }
            accessibilityEvent.setScrollable(z6);
            g gVar = this.mRecyclerView.mAdapter;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(@o0 w wVar, @o0 c0 c0Var, @o0 h1.f0 f0Var) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                f0Var.a(8192);
                f0Var.M1(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                f0Var.a(4096);
                f0Var.M1(true);
            }
            f0Var.d1(f0.d.f(getRowCountForAccessibility(wVar, c0Var), getColumnCountForAccessibility(wVar, c0Var), isLayoutHierarchical(wVar, c0Var), getSelectionModeForAccessibility(wVar, c0Var)));
        }

        public void onItemsUpdated(@o0 RecyclerView recyclerView, int i7, int i8, @q0 Object obj) {
            onItemsUpdated(recyclerView, i7, i8);
        }

        public boolean onRequestChildFocus(@o0 RecyclerView recyclerView, @o0 c0 c0Var, @o0 View view, @q0 View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(@o0 w wVar, @o0 c0 c0Var, int i7, @q0 Bundle bundle) {
            int height;
            int width;
            int i8;
            int i9;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return false;
            }
            if (i7 == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i8 = height;
                    i9 = width;
                }
                i8 = height;
                i9 = 0;
            } else if (i7 != 8192) {
                i9 = 0;
                i8 = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                    i8 = height;
                    i9 = width;
                }
                i8 = height;
                i9 = 0;
            }
            if (i8 == 0 && i9 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i9, i8, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(@o0 View view, int i7, @q0 Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i7, bundle);
        }

        public boolean requestChildRectangleOnScreen(@o0 RecyclerView recyclerView, @o0 View view, @o0 Rect rect, boolean z6, boolean z7) {
            int[] c7 = c(view, rect);
            int i7 = c7[0];
            int i8 = c7[1];
            if ((!z7 || d(recyclerView, i7, i8)) && !(i7 == 0 && i8 == 0)) {
                if (z6) {
                    recyclerView.scrollBy(i7, i8);
                } else {
                    recyclerView.smoothScrollBy(i7, i8);
                }
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public void onInitializeAccessibilityNodeInfoForItem(@o0 w wVar, @o0 c0 c0Var, @o0 View view, @o0 h1.f0 f0Var) {
            f0Var.e1(f0.e.h(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
        }

        public void attachView(@o0 View view, int i7) {
            attachView(view, i7, (p) view.getLayoutParams());
        }

        public p generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void setMeasuredDimension(int i7, int i8) {
            this.mRecyclerView.setMeasuredDimension(i7, i8);
        }

        public void attachView(@o0 View view) {
            attachView(view, -1);
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        void b(@o0 View view);

        void d(@o0 View view);
    }

    /* loaded from: classes.dex */
    public static abstract class r {
        public abstract boolean a(int i7, int i8);
    }

    /* loaded from: classes.dex */
    public interface s {
        boolean a(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent);

        void c(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent);

        void e(boolean z6);
    }

    /* loaded from: classes.dex */
    public static abstract class t {
        public void onScrollStateChanged(@o0 RecyclerView recyclerView, int i7) {
        }

        public void onScrolled(@o0 RecyclerView recyclerView, int i7, int i8) {
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface u {
    }

    /* loaded from: classes.dex */
    public static class v {

        /* renamed from: c  reason: collision with root package name */
        public static final int f5127c = 5;

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<a> f5128a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f5129b = 0;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<f0> f5130a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public int f5131b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f5132c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f5133d = 0;
        }

        public void a() {
            this.f5129b++;
        }

        public void b() {
            for (int i7 = 0; i7 < this.f5128a.size(); i7++) {
                this.f5128a.valueAt(i7).f5130a.clear();
            }
        }

        public void c() {
            this.f5129b--;
        }

        public void d(int i7, long j7) {
            a h7 = h(i7);
            h7.f5133d = k(h7.f5133d, j7);
        }

        public void e(int i7, long j7) {
            a h7 = h(i7);
            h7.f5132c = k(h7.f5132c, j7);
        }

        @q0
        public f0 f(int i7) {
            a aVar = this.f5128a.get(i7);
            if (aVar == null || aVar.f5130a.isEmpty()) {
                return null;
            }
            ArrayList<f0> arrayList = aVar.f5130a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public int g(int i7) {
            return h(i7).f5130a.size();
        }

        public final a h(int i7) {
            a aVar = this.f5128a.get(i7);
            if (aVar == null) {
                a aVar2 = new a();
                this.f5128a.put(i7, aVar2);
                return aVar2;
            }
            return aVar;
        }

        public void i(g gVar, g gVar2, boolean z6) {
            if (gVar != null) {
                c();
            }
            if (!z6 && this.f5129b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void j(f0 f0Var) {
            int itemViewType = f0Var.getItemViewType();
            ArrayList<f0> arrayList = h(itemViewType).f5130a;
            if (this.f5128a.get(itemViewType).f5131b <= arrayList.size()) {
                return;
            }
            f0Var.resetInternal();
            arrayList.add(f0Var);
        }

        public long k(long j7, long j8) {
            return j7 == 0 ? j8 : ((j7 / 4) * 3) + (j8 / 4);
        }

        public void l(int i7, int i8) {
            a h7 = h(i7);
            h7.f5131b = i8;
            ArrayList<f0> arrayList = h7.f5130a;
            while (arrayList.size() > i8) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public int m() {
            int i7 = 0;
            for (int i8 = 0; i8 < this.f5128a.size(); i8++) {
                ArrayList<f0> arrayList = this.f5128a.valueAt(i8).f5130a;
                if (arrayList != null) {
                    i7 += arrayList.size();
                }
            }
            return i7;
        }

        public boolean n(int i7, long j7, long j8) {
            long j9 = h(i7).f5133d;
            return j9 == 0 || j7 + j9 < j8;
        }

        public boolean o(int i7, long j7, long j8) {
            long j9 = h(i7).f5132c;
            return j9 == 0 || j7 + j9 < j8;
        }
    }

    /* loaded from: classes.dex */
    public final class w {

        /* renamed from: j  reason: collision with root package name */
        public static final int f5134j = 2;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<f0> f5135a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<f0> f5136b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<f0> f5137c;

        /* renamed from: d  reason: collision with root package name */
        public final List<f0> f5138d;

        /* renamed from: e  reason: collision with root package name */
        public int f5139e;

        /* renamed from: f  reason: collision with root package name */
        public int f5140f;

        /* renamed from: g  reason: collision with root package name */
        public v f5141g;

        /* renamed from: h  reason: collision with root package name */
        public d0 f5142h;

        public w() {
            ArrayList<f0> arrayList = new ArrayList<>();
            this.f5135a = arrayList;
            this.f5136b = null;
            this.f5137c = new ArrayList<>();
            this.f5138d = Collections.unmodifiableList(arrayList);
            this.f5139e = 2;
            this.f5140f = 2;
        }

        public void A() {
            for (int size = this.f5137c.size() - 1; size >= 0; size--) {
                B(size);
            }
            this.f5137c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.b();
            }
        }

        public void B(int i7) {
            a(this.f5137c.get(i7), true);
            this.f5137c.remove(i7);
        }

        public void C(@o0 View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            D(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.k(childViewHolderInt);
        }

        public void D(f0 f0Var) {
            boolean z6;
            boolean z7 = true;
            if (f0Var.isScrap() || f0Var.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(f0Var.isScrap());
                sb.append(" isAttached:");
                sb.append(f0Var.itemView.getParent() != null);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (f0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f0Var + RecyclerView.this.exceptionLabel());
            } else if (f0Var.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            } else {
                boolean doesTransientStatePreventRecycling = f0Var.doesTransientStatePreventRecycling();
                g gVar = RecyclerView.this.mAdapter;
                if ((gVar != null && doesTransientStatePreventRecycling && gVar.onFailedToRecycleView(f0Var)) || f0Var.isRecyclable()) {
                    if (this.f5140f <= 0 || f0Var.hasAnyOfTheFlags(526)) {
                        z6 = false;
                    } else {
                        int size = this.f5137c.size();
                        if (size >= this.f5140f && size > 0) {
                            B(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.d(f0Var.mPosition)) {
                            int i7 = size - 1;
                            while (i7 >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.d(this.f5137c.get(i7).mPosition)) {
                                    break;
                                }
                                i7--;
                            }
                            size = i7 + 1;
                        }
                        this.f5137c.add(size, f0Var);
                        z6 = true;
                    }
                    if (z6) {
                        z7 = false;
                    } else {
                        a(f0Var, true);
                    }
                    r1 = z6;
                } else {
                    z7 = false;
                }
                RecyclerView.this.mViewInfoStore.q(f0Var);
                if (r1 || z7 || !doesTransientStatePreventRecycling) {
                    return;
                }
                f0Var.mOwnerRecyclerView = null;
            }
        }

        public void E(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f5136b == null) {
                    this.f5136b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f5136b.add(childViewHolderInt);
            } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f5135a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
        }

        public void F(v vVar) {
            v vVar2 = this.f5141g;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.f5141g = vVar;
            if (vVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f5141g.a();
        }

        public void G(d0 d0Var) {
            this.f5142h = d0Var;
        }

        public void H(int i7) {
            this.f5139e = i7;
            L();
        }

        public final boolean I(@o0 f0 f0Var, int i7, int i8, long j7) {
            f0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = f0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j7 == Long.MAX_VALUE || this.f5141g.n(itemViewType, nanoTime, j7)) {
                RecyclerView.this.mAdapter.bindViewHolder(f0Var, i7);
                this.f5141g.d(f0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
                b(f0Var);
                if (RecyclerView.this.mState.j()) {
                    f0Var.mPreLayoutPosition = i8;
                    return true;
                }
                return true;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x020c  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0228 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
        @d.q0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.f0 J(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 615
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.J(int, boolean, long):androidx.recyclerview.widget.RecyclerView$f0");
        }

        public void K(f0 f0Var) {
            if (f0Var.mInChangeScrap) {
                this.f5136b.remove(f0Var);
            } else {
                this.f5135a.remove(f0Var);
            }
            f0Var.mScrapContainer = null;
            f0Var.mInChangeScrap = false;
            f0Var.clearReturnedFromScrapFlag();
        }

        public void L() {
            o oVar = RecyclerView.this.mLayout;
            this.f5140f = this.f5139e + (oVar != null ? oVar.mPrefetchMaxCountObserved : 0);
            for (int size = this.f5137c.size() - 1; size >= 0 && this.f5137c.size() > this.f5140f; size--) {
                B(size);
            }
        }

        public boolean M(f0 f0Var) {
            if (f0Var.isRemoved()) {
                return RecyclerView.this.mState.j();
            }
            int i7 = f0Var.mPosition;
            if (i7 >= 0 && i7 < RecyclerView.this.mAdapter.getItemCount()) {
                if (RecyclerView.this.mState.j() || RecyclerView.this.mAdapter.getItemViewType(f0Var.mPosition) == f0Var.getItemViewType()) {
                    return !RecyclerView.this.mAdapter.hasStableIds() || f0Var.getItemId() == RecyclerView.this.mAdapter.getItemId(f0Var.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f0Var + RecyclerView.this.exceptionLabel());
        }

        public void N(int i7, int i8) {
            int i9;
            int i10 = i8 + i7;
            for (int size = this.f5137c.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f5137c.get(size);
                if (f0Var != null && (i9 = f0Var.mPosition) >= i7 && i9 < i10) {
                    f0Var.addFlags(2);
                    B(size);
                }
            }
        }

        public void a(@o0 f0 f0Var, boolean z6) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(f0Var);
            View view = f0Var.itemView;
            androidx.recyclerview.widget.y yVar = RecyclerView.this.mAccessibilityDelegate;
            if (yVar != null) {
                androidx.core.view.a itemDelegate = yVar.getItemDelegate();
                u1.B1(view, itemDelegate instanceof y.a ? ((y.a) itemDelegate).c(view) : null);
            }
            if (z6) {
                h(f0Var);
            }
            f0Var.mOwnerRecyclerView = null;
            j().j(f0Var);
        }

        public final void b(f0 f0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = f0Var.itemView;
                if (u1.V(view) == 0) {
                    u1.R1(view, 1);
                }
                androidx.recyclerview.widget.y yVar = RecyclerView.this.mAccessibilityDelegate;
                if (yVar == null) {
                    return;
                }
                androidx.core.view.a itemDelegate = yVar.getItemDelegate();
                if (itemDelegate instanceof y.a) {
                    ((y.a) itemDelegate).d(view);
                }
                u1.B1(view, itemDelegate);
            }
        }

        public void c(@o0 View view, int i7) {
            p pVar;
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null) {
                throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.exceptionLabel());
            }
            int n7 = RecyclerView.this.mAdapterHelper.n(i7);
            if (n7 < 0 || n7 >= RecyclerView.this.mAdapter.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i7 + "(offset:" + n7 + ").state:" + RecyclerView.this.mState.d() + RecyclerView.this.exceptionLabel());
            }
            I(childViewHolderInt, n7, i7, Long.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams == null) {
                pVar = (p) RecyclerView.this.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(pVar);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                pVar = (p) layoutParams;
            } else {
                pVar = (p) RecyclerView.this.generateLayoutParams(layoutParams);
                childViewHolderInt.itemView.setLayoutParams(pVar);
            }
            pVar.f5125c = true;
            pVar.f5123a = childViewHolderInt;
            pVar.f5126d = childViewHolderInt.itemView.getParent() == null;
        }

        public void d() {
            this.f5135a.clear();
            A();
        }

        public void e() {
            int size = this.f5137c.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f5137c.get(i7).clearOldPosition();
            }
            int size2 = this.f5135a.size();
            for (int i8 = 0; i8 < size2; i8++) {
                this.f5135a.get(i8).clearOldPosition();
            }
            ArrayList<f0> arrayList = this.f5136b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    this.f5136b.get(i9).clearOldPosition();
                }
            }
        }

        public void f() {
            this.f5135a.clear();
            ArrayList<f0> arrayList = this.f5136b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int g(int i7) {
            if (i7 >= 0 && i7 < RecyclerView.this.mState.d()) {
                return !RecyclerView.this.mState.j() ? i7 : RecyclerView.this.mAdapterHelper.n(i7);
            }
            throw new IndexOutOfBoundsException("invalid position " + i7 + ". State item count is " + RecyclerView.this.mState.d() + RecyclerView.this.exceptionLabel());
        }

        public void h(@o0 f0 f0Var) {
            x xVar = RecyclerView.this.mRecyclerListener;
            if (xVar != null) {
                xVar.a(f0Var);
            }
            g gVar = RecyclerView.this.mAdapter;
            if (gVar != null) {
                gVar.onViewRecycled(f0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.q(f0Var);
            }
        }

        public f0 i(int i7) {
            int size;
            int n7;
            ArrayList<f0> arrayList = this.f5136b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i8 = 0; i8 < size; i8++) {
                    f0 f0Var = this.f5136b.get(i8);
                    if (!f0Var.wasReturnedFromScrap() && f0Var.getLayoutPosition() == i7) {
                        f0Var.addFlags(32);
                        return f0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (n7 = RecyclerView.this.mAdapterHelper.n(i7)) > 0 && n7 < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(n7);
                    for (int i9 = 0; i9 < size; i9++) {
                        f0 f0Var2 = this.f5136b.get(i9);
                        if (!f0Var2.wasReturnedFromScrap() && f0Var2.getItemId() == itemId) {
                            f0Var2.addFlags(32);
                            return f0Var2;
                        }
                    }
                }
            }
            return null;
        }

        public v j() {
            if (this.f5141g == null) {
                this.f5141g = new v();
            }
            return this.f5141g;
        }

        public int k() {
            return this.f5135a.size();
        }

        @o0
        public List<f0> l() {
            return this.f5138d;
        }

        public f0 m(long j7, int i7, boolean z6) {
            for (int size = this.f5135a.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f5135a.get(size);
                if (f0Var.getItemId() == j7 && !f0Var.wasReturnedFromScrap()) {
                    if (i7 == f0Var.getItemViewType()) {
                        f0Var.addFlags(32);
                        if (f0Var.isRemoved() && !RecyclerView.this.mState.j()) {
                            f0Var.setFlags(2, 14);
                        }
                        return f0Var;
                    } else if (!z6) {
                        this.f5135a.remove(size);
                        RecyclerView.this.removeDetachedView(f0Var.itemView, false);
                        z(f0Var.itemView);
                    }
                }
            }
            int size2 = this.f5137c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                f0 f0Var2 = this.f5137c.get(size2);
                if (f0Var2.getItemId() == j7 && !f0Var2.isAttachedToTransitionOverlay()) {
                    if (i7 == f0Var2.getItemViewType()) {
                        if (!z6) {
                            this.f5137c.remove(size2);
                        }
                        return f0Var2;
                    } else if (!z6) {
                        B(size2);
                        return null;
                    }
                }
            }
        }

        public f0 n(int i7, boolean z6) {
            View e7;
            int size = this.f5135a.size();
            for (int i8 = 0; i8 < size; i8++) {
                f0 f0Var = this.f5135a.get(i8);
                if (!f0Var.wasReturnedFromScrap() && f0Var.getLayoutPosition() == i7 && !f0Var.isInvalid() && (RecyclerView.this.mState.f5076h || !f0Var.isRemoved())) {
                    f0Var.addFlags(32);
                    return f0Var;
                }
            }
            if (z6 || (e7 = RecyclerView.this.mChildHelper.e(i7)) == null) {
                int size2 = this.f5137c.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    f0 f0Var2 = this.f5137c.get(i9);
                    if (!f0Var2.isInvalid() && f0Var2.getLayoutPosition() == i7 && !f0Var2.isAttachedToTransitionOverlay()) {
                        if (!z6) {
                            this.f5137c.remove(i9);
                        }
                        return f0Var2;
                    }
                }
                return null;
            }
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(e7);
            RecyclerView.this.mChildHelper.s(e7);
            int m7 = RecyclerView.this.mChildHelper.m(e7);
            if (m7 != -1) {
                RecyclerView.this.mChildHelper.d(m7);
                E(e7);
                childViewHolderInt.addFlags(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        public View o(int i7) {
            return this.f5135a.get(i7).itemView;
        }

        @o0
        public View p(int i7) {
            return q(i7, false);
        }

        public View q(int i7, boolean z6) {
            return J(i7, z6, Long.MAX_VALUE).itemView;
        }

        public final void r(ViewGroup viewGroup, boolean z6) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    r((ViewGroup) childAt, true);
                }
            }
            if (z6) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public final void s(f0 f0Var) {
            View view = f0Var.itemView;
            if (view instanceof ViewGroup) {
                r((ViewGroup) view, false);
            }
        }

        public void t() {
            int size = this.f5137c.size();
            for (int i7 = 0; i7 < size; i7++) {
                p pVar = (p) this.f5137c.get(i7).itemView.getLayoutParams();
                if (pVar != null) {
                    pVar.f5125c = true;
                }
            }
        }

        public void u() {
            int size = this.f5137c.size();
            for (int i7 = 0; i7 < size; i7++) {
                f0 f0Var = this.f5137c.get(i7);
                if (f0Var != null) {
                    f0Var.addFlags(6);
                    f0Var.addChangePayload(null);
                }
            }
            g gVar = RecyclerView.this.mAdapter;
            if (gVar == null || !gVar.hasStableIds()) {
                A();
            }
        }

        public void v(int i7, int i8) {
            int size = this.f5137c.size();
            for (int i9 = 0; i9 < size; i9++) {
                f0 f0Var = this.f5137c.get(i9);
                if (f0Var != null && f0Var.mPosition >= i7) {
                    f0Var.offsetPosition(i8, true);
                }
            }
        }

        public void w(int i7, int i8) {
            int i9;
            int i10;
            int i11;
            int i12;
            if (i7 < i8) {
                i9 = -1;
                i11 = i7;
                i10 = i8;
            } else {
                i9 = 1;
                i10 = i7;
                i11 = i8;
            }
            int size = this.f5137c.size();
            for (int i13 = 0; i13 < size; i13++) {
                f0 f0Var = this.f5137c.get(i13);
                if (f0Var != null && (i12 = f0Var.mPosition) >= i11 && i12 <= i10) {
                    if (i12 == i7) {
                        f0Var.offsetPosition(i8 - i7, false);
                    } else {
                        f0Var.offsetPosition(i9, false);
                    }
                }
            }
        }

        public void x(int i7, int i8, boolean z6) {
            int i9 = i7 + i8;
            for (int size = this.f5137c.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f5137c.get(size);
                if (f0Var != null) {
                    int i10 = f0Var.mPosition;
                    if (i10 >= i9) {
                        f0Var.offsetPosition(-i8, z6);
                    } else if (i10 >= i7) {
                        f0Var.addFlags(8);
                        B(size);
                    }
                }
            }
        }

        public void y(g gVar, g gVar2, boolean z6) {
            d();
            j().i(gVar, gVar2, z6);
        }

        public void z(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            D(childViewHolderInt);
        }
    }

    /* loaded from: classes.dex */
    public interface x {
        void a(@o0 f0 f0Var);
    }

    /* loaded from: classes.dex */
    public class y extends i {
        public y() {
        }

        public void a() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    u1.p1(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f5075g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.q()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i7, int i8, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.s(i7, i8, obj)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int i7, int i8) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.t(i7, i8)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeMoved(int i7, int i8, int i9) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.u(i7, i8, i9)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeRemoved(int i7, int i8) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.v(i7, i8)) {
                a();
            }
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
    }

    public RecyclerView(@o0 Context context) {
        this(context, null);
    }

    public static void clearNestedRecyclerViewIfNotNested(@o0 f0 f0Var) {
        WeakReference<RecyclerView> weakReference = f0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f0Var.itemView) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            f0Var.mNestedRecyclerView = null;
        }
    }

    @q0
    public static RecyclerView findNestedRecyclerView(@o0 View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i7));
                if (findNestedRecyclerView != null) {
                    return findNestedRecyclerView;
                }
            }
            return null;
        }
        return null;
    }

    public static f0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f5123a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f5124b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private f1 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new f1(this);
        }
        return this.mScrollingChildHelper;
    }

    public final void A(@o0 View view, @q0 View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f5125c) {
                Rect rect = pVar.f5124b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    public final void B() {
        c0 c0Var = this.mState;
        c0Var.f5082n = -1L;
        c0Var.f5081m = -1;
        c0Var.f5083o = -1;
    }

    public final void C() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        z();
    }

    public final void D() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        f0 findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            B();
            return;
        }
        this.mState.f5082n = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
        this.mState.f5081m = this.mDataSetHasChangedAfterLayout ? -1 : findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAdapterPosition();
        this.mState.f5083o = n(findContainingViewHolder.itemView);
    }

    public final void E(@q0 g gVar, boolean z6, boolean z7) {
        g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z6 || z7) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.z();
        g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.registerAdapterDataObserver(this.mObserver);
            gVar.onAttachedToRecyclerView(this);
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.onAdapterChanged(gVar3, this.mAdapter);
        }
        this.mRecycler.y(gVar3, this.mAdapter, z6);
        this.mState.f5075g = true;
    }

    public final void F() {
        this.mViewFlinger.g();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.stopSmoothScroller();
        }
    }

    public final void a(f0 f0Var) {
        View view = f0Var.itemView;
        boolean z6 = view.getParent() == this;
        this.mRecycler.K(getChildViewHolder(view));
        if (f0Var.isTmpDetached()) {
            this.mChildHelper.c(view, -1, view.getLayoutParams(), true);
        } else if (z6) {
            this.mChildHelper.k(view);
        } else {
            this.mChildHelper.b(view, true);
        }
    }

    public void absorbGlows(int i7, int i8) {
        if (i7 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i7);
            }
        } else if (i7 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i7);
            }
        }
        if (i8 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i8);
            }
        } else if (i8 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i8);
            }
        }
        if (i7 == 0 && i8 == 0) {
            return;
        }
        u1.n1(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i7, int i8) {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.onAddFocusables(this, arrayList, i7, i8)) {
            super.addFocusables(arrayList, i7, i8);
        }
    }

    public void addItemDecoration(@o0 n nVar, int i7) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i7 < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i7, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@o0 q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(@o0 s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(@o0 t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    public void animateAppearance(@o0 f0 f0Var, @q0 l.d dVar, @o0 l.d dVar2) {
        f0Var.setIsRecyclable(false);
        if (this.mItemAnimator.a(f0Var, dVar, dVar2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(@o0 f0 f0Var, @o0 l.d dVar, @q0 l.d dVar2) {
        a(f0Var);
        f0Var.setIsRecyclable(false);
        if (this.mItemAnimator.c(f0Var, dVar, dVar2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    public final void b(@o0 f0 f0Var, @o0 f0 f0Var2, @o0 l.d dVar, @o0 l.d dVar2, boolean z6, boolean z7) {
        f0Var.setIsRecyclable(false);
        if (z6) {
            a(f0Var);
        }
        if (f0Var != f0Var2) {
            if (z7) {
                a(f0Var2);
            }
            f0Var.mShadowedHolder = f0Var2;
            a(f0Var);
            this.mRecycler.K(f0Var);
            f0Var2.setIsRecyclable(false);
            f0Var2.mShadowingHolder = f0Var;
        }
        if (this.mItemAnimator.b(f0Var, f0Var2, dVar, dVar2)) {
            postAnimationRunner();
        }
    }

    public final void c() {
        C();
        setScrollState(0);
    }

    public boolean canReuseUpdatedViewHolder(f0 f0Var) {
        l lVar = this.mItemAnimator;
        return lVar == null || lVar.g(f0Var, f0Var.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.mLayout.checkLayoutParams((p) layoutParams);
    }

    public void clearOldPositions() {
        int j7 = this.mChildHelper.j();
        for (int i7 = 0; i7 < j7; i7++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i7));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.e();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.q1
    public int computeHorizontalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.q1
    public int computeHorizontalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.q1
    public int computeHorizontalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.q1
    public int computeVerticalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.q1
    public int computeVerticalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.q1
    public int computeVerticalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i7, int i8) {
        boolean z6;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i7 <= 0) {
            z6 = false;
        } else {
            this.mLeftGlow.onRelease();
            z6 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.mRightGlow.onRelease();
            z6 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i8 > 0) {
            this.mTopGlow.onRelease();
            z6 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i8 < 0) {
            this.mBottomGlow.onRelease();
            z6 |= this.mBottomGlow.isFinished();
        }
        if (z6) {
            u1.n1(this);
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            w0.b(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            w0.d();
        } else if (this.mAdapterHelper.q()) {
            if (!this.mAdapterHelper.p(4) || this.mAdapterHelper.p(11)) {
                if (this.mAdapterHelper.q()) {
                    w0.b(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    w0.d();
                    return;
                }
                return;
            }
            w0.b(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.x();
            if (!this.mLayoutWasDefered) {
                if (q()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.j();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            w0.d();
        }
    }

    public final void d(Context context, String str, AttributeSet attributeSet, int i7, int i8) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String o6 = o(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(o6, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i7), Integer.valueOf(i8)};
                } catch (NoSuchMethodException e7) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e8) {
                        e8.initCause(e7);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + o6, e8);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + o6, e9);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + o6, e10);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + o6, e11);
            } catch (InstantiationException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + o6, e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + o6, e13);
            }
        }
    }

    public void defaultOnMeasure(int i7, int i8) {
        setMeasuredDimension(o.chooseSize(i7, getPaddingLeft() + getPaddingRight(), u1.f0(this)), o.chooseSize(i8, getPaddingTop() + getPaddingBottom(), u1.e0(this)));
    }

    public void dispatchChildAttached(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        g gVar = this.mAdapter;
        if (gVar != null && childViewHolderInt != null) {
            gVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        g gVar = this.mAdapter;
        if (gVar != null && childViewHolderInt != null) {
            gVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).d(view);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            c0 c0Var = this.mState;
            c0Var.f5078j = false;
            if (c0Var.f5073e == 1) {
                g();
                this.mLayout.setExactMeasureSpecsFrom(this);
                h();
            } else if (!this.mAdapterHelper.r() && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                h();
            }
            i();
        }
    }

    @Override // android.view.View, androidx.core.view.e1
    public boolean dispatchNestedFling(float f7, float f8, boolean z6) {
        return getScrollingChildHelper().a(f7, f8, z6);
    }

    @Override // android.view.View, androidx.core.view.e1
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return getScrollingChildHelper().b(f7, f8);
    }

    @Override // android.view.View, androidx.core.view.e1
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i7, i8, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.e1
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().f(i7, i8, i9, i10, iArr);
    }

    public void dispatchOnScrollStateChanged(int i7) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.onScrollStateChanged(i7);
        }
        onScrollStateChanged(i7);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.onScrollStateChanged(this, i7);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i7);
            }
        }
    }

    public void dispatchOnScrolled(int i7, int i8) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i7, scrollY - i8);
        onScrolled(i7, i8);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.onScrolled(this, i7, i8);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i7, i8);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i7;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            f0 f0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (f0Var.itemView.getParent() == this && !f0Var.shouldIgnore() && (i7 = f0Var.mPendingAccessibilityState) != -1) {
                u1.R1(f0Var.itemView, i7);
                f0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z6;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z7 = false;
        for (int i7 = 0; i7 < size; i7++) {
            this.mItemDecorations.get(i7).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z6 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z6 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z6 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z6 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z7 = true;
            }
            z6 |= z7;
            canvas.restoreToCount(save4);
        }
        if ((z6 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.q()) ? z6 : true) {
            u1.n1(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j7) {
        return super.drawChild(canvas, view, j7);
    }

    public final boolean e(int i7, int i8) {
        l(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i7 && iArr[1] == i8) ? false : true;
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect a7 = this.mEdgeEffectFactory.a(this, 3);
        this.mBottomGlow = a7;
        if (this.mClipToPadding) {
            a7.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a7.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect a7 = this.mEdgeEffectFactory.a(this, 0);
        this.mLeftGlow = a7;
        if (this.mClipToPadding) {
            a7.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a7.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect a7 = this.mEdgeEffectFactory.a(this, 2);
        this.mRightGlow = a7;
        if (this.mClipToPadding) {
            a7.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a7.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect a7 = this.mEdgeEffectFactory.a(this, 1);
        this.mTopGlow = a7;
        if (this.mClipToPadding) {
            a7.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a7.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void f() {
        int i7 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i7 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        h1.b.i(obtain, i7);
        sendAccessibilityEventUnchecked(obtain);
    }

    public final void fillRemainingScrollValues(c0 c0Var) {
        if (getScrollState() != 2) {
            c0Var.f5084p = 0;
            c0Var.f5085q = 0;
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f5090m;
        c0Var.f5084p = overScroller.getFinalX() - overScroller.getCurrX();
        c0Var.f5085q = overScroller.getFinalY() - overScroller.getCurrY();
    }

    @q0
    public View findChildViewUnder(float f7, float f8) {
        for (int g7 = this.mChildHelper.g() - 1; g7 >= 0; g7--) {
            View f9 = this.mChildHelper.f(g7);
            float translationX = f9.getTranslationX();
            float translationY = f9.getTranslationY();
            if (f7 >= f9.getLeft() + translationX && f7 <= f9.getRight() + translationX && f8 >= f9.getTop() + translationY && f8 <= f9.getBottom() + translationY) {
                return f9;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    @d.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View findContainingItemView(@d.o0 android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    @q0
    public f0 findContainingViewHolder(@o0 View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    @q0
    public f0 findViewHolderForAdapterPosition(int i7) {
        f0 f0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int j7 = this.mChildHelper.j();
        for (int i8 = 0; i8 < j7; i8++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i8));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionFor(childViewHolderInt) == i7) {
                if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                f0Var = childViewHolderInt;
            }
        }
        return f0Var;
    }

    public f0 findViewHolderForItemId(long j7) {
        g gVar = this.mAdapter;
        f0 f0Var = null;
        if (gVar != null && gVar.hasStableIds()) {
            int j8 = this.mChildHelper.j();
            for (int i7 = 0; i7 < j8; i7++) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i7));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j7) {
                    if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    f0Var = childViewHolderInt;
                }
            }
        }
        return f0Var;
    }

    @q0
    public f0 findViewHolderForLayoutPosition(int i7) {
        return findViewHolderForPosition(i7, false);
    }

    @q0
    @Deprecated
    public f0 findViewHolderForPosition(int i7) {
        return findViewHolderForPosition(i7, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i7, int i8) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            int canScrollHorizontally = oVar.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (canScrollHorizontally == 0 || Math.abs(i7) < this.mMinFlingVelocity) {
                i7 = 0;
            }
            if (!canScrollVertically || Math.abs(i8) < this.mMinFlingVelocity) {
                i8 = 0;
            }
            if (i7 == 0 && i8 == 0) {
                return false;
            }
            float f7 = i7;
            float f8 = i8;
            if (!dispatchNestedPreFling(f7, f8)) {
                boolean z6 = canScrollHorizontally != 0 || canScrollVertically;
                dispatchNestedFling(f7, f8, z6);
                r rVar = this.mOnFlingListener;
                if (rVar != null && rVar.a(i7, i8)) {
                    return true;
                }
                if (z6) {
                    if (canScrollVertically) {
                        canScrollHorizontally = (canScrollHorizontally == true ? 1 : 0) | 2;
                    }
                    startNestedScroll(canScrollHorizontally, 1);
                    int i9 = this.mMaxFlingVelocity;
                    int max = Math.max(-i9, Math.min(i7, i9));
                    int i10 = this.mMaxFlingVelocity;
                    this.mViewFlinger.c(max, Math.max(-i10, Math.min(i8, i10)));
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i7) {
        View view2;
        boolean z6;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i7);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z7 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z7 && (i7 == 2 || i7 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i8 = i7 == 2 ? 130 : 33;
                z6 = focusFinder.findNextFocus(this, view, i8) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i7 = i8;
                }
            } else {
                z6 = false;
            }
            if (!z6 && this.mLayout.canScrollHorizontally()) {
                int i9 = (this.mLayout.getLayoutDirection() == 1) ^ (i7 == 2) ? 66 : 17;
                boolean z8 = focusFinder.findNextFocus(this, view, i9) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i7 = i9;
                }
                z6 = z8;
            }
            if (z6) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i7, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i7);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i7);
            if (findNextFocus == null && z7) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i7, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return t(view, view2, i7) ? view2 : super.focusSearch(view, i7);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i7);
        } else {
            A(view2, null);
            return view;
        }
    }

    public final void g() {
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f5078j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.f();
        onEnterLayoutOrScroll();
        w();
        D();
        c0 c0Var = this.mState;
        c0Var.f5077i = c0Var.f5079k && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c0Var.f5076h = c0Var.f5080l;
        c0Var.f5074f = this.mAdapter.getItemCount();
        l(this.mMinMaxLayoutPositions);
        if (this.mState.f5079k) {
            int g7 = this.mChildHelper.g();
            for (int i7 = 0; i7 < g7; i7++) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i7));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.e(childViewHolderInt, this.mItemAnimator.w(this.mState, childViewHolderInt, l.e(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f5077i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f5080l) {
            saveOldPositions();
            c0 c0Var2 = this.mState;
            boolean z6 = c0Var2.f5075g;
            c0Var2.f5075g = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c0Var2);
            this.mState.f5075g = z6;
            for (int i8 = 0; i8 < this.mChildHelper.g(); i8++) {
                f0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.f(i8));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.i(childViewHolderInt2)) {
                    int e7 = l.e(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        e7 |= 4096;
                    }
                    l.d w6 = this.mItemAnimator.w(this.mState, childViewHolderInt2, e7, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, w6);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, w6);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f5073e = 2;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @q0
    public g getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionFor(f0 f0Var) {
        if (f0Var.hasAnyOfTheFlags(524) || !f0Var.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.f(f0Var.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.mLayout;
        return oVar != null ? oVar.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(f0 f0Var) {
        return this.mAdapter.hasStableIds() ? f0Var.getItemId() : f0Var.mPosition;
    }

    public int getChildAdapterPosition(@o0 View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i7, int i8) {
        j jVar = this.mChildDrawingOrderCallback;
        return jVar == null ? super.getChildDrawingOrder(i7, i8) : jVar.a(i7, i8);
    }

    public long getChildItemId(@o0 View view) {
        f0 childViewHolderInt;
        g gVar = this.mAdapter;
        if (gVar == null || !gVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@o0 View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@o0 View view) {
        return getChildAdapterPosition(view);
    }

    public f0 getChildViewHolder(@o0 View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @q0
    public androidx.recyclerview.widget.y getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@o0 View view, @o0 Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @o0
    public k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @q0
    public l getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        p pVar = (p) view.getLayoutParams();
        if (pVar.f5125c) {
            if (this.mState.j() && (pVar.d() || pVar.f())) {
                return pVar.f5124b;
            }
            Rect rect = pVar.f5124b;
            rect.set(0, 0, 0, 0);
            int size = this.mItemDecorations.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.mTempRect.set(0, 0, 0, 0);
                this.mItemDecorations.get(i7).getItemOffsets(this.mTempRect, view, this, this.mState);
                int i8 = rect.left;
                Rect rect2 = this.mTempRect;
                rect.left = i8 + rect2.left;
                rect.top += rect2.top;
                rect.right += rect2.right;
                rect.bottom += rect2.bottom;
            }
            pVar.f5125c = false;
            return rect;
        }
        return pVar.f5124b;
    }

    @o0
    public n getItemDecorationAt(int i7) {
        int itemDecorationCount = getItemDecorationCount();
        if (i7 < 0 || i7 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i7 + " is an invalid index for size " + itemDecorationCount);
        }
        return this.mItemDecorations.get(i7);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @q0
    public o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    @q0
    public r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @o0
    public v getRecycledViewPool() {
        return this.mRecycler.j();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public final void h() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.k();
        this.mState.f5074f = this.mAdapter.getItemCount();
        c0 c0Var = this.mState;
        c0Var.f5072d = 0;
        c0Var.f5076h = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c0Var);
        c0 c0Var2 = this.mState;
        c0Var2.f5075g = false;
        this.mPendingSavedState = null;
        c0Var2.f5079k = c0Var2.f5079k && this.mItemAnimator != null;
        c0Var2.f5073e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View, androidx.core.view.e1
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.q();
    }

    public final void i() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        c0 c0Var = this.mState;
        c0Var.f5073e = 1;
        if (c0Var.f5079k) {
            for (int g7 = this.mChildHelper.g() - 1; g7 >= 0; g7--) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(g7));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    l.d v6 = this.mItemAnimator.v(this.mState, childViewHolderInt);
                    f0 g8 = this.mViewInfoStore.g(changedHolderKey);
                    if (g8 == null || g8.shouldIgnore()) {
                        this.mViewInfoStore.d(childViewHolderInt, v6);
                    } else {
                        boolean h7 = this.mViewInfoStore.h(g8);
                        boolean h8 = this.mViewInfoStore.h(childViewHolderInt);
                        if (h7 && g8 == childViewHolderInt) {
                            this.mViewInfoStore.d(childViewHolderInt, v6);
                        } else {
                            l.d n7 = this.mViewInfoStore.n(g8);
                            this.mViewInfoStore.d(childViewHolderInt, v6);
                            l.d m7 = this.mViewInfoStore.m(childViewHolderInt);
                            if (n7 == null) {
                                p(changedHolderKey, childViewHolderInt, g8);
                            } else {
                                b(g8, childViewHolderInt, n7, m7, h7, h8);
                            }
                        }
                    }
                }
            }
            this.mViewInfoStore.o(this.mViewInfoProcessCallback);
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        c0 c0Var2 = this.mState;
        c0Var2.f5071c = c0Var2.f5074f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c0Var2.f5079k = false;
        c0Var2.f5080l = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<f0> arrayList = this.mRecycler.f5136b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.mLayout;
        if (oVar.mPrefetchMaxObservedInInitialPrefetch) {
            oVar.mPrefetchMaxCountObserved = 0;
            oVar.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.L();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (e(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        y();
        B();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f());
    }

    @l1
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(a.c.f7852h), resources.getDimensionPixelSize(a.c.f7854j), resources.getDimensionPixelOffset(a.c.f7853i));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        l lVar = this.mItemAnimator;
        return lVar != null && lVar.q();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, androidx.core.view.e1
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    public final boolean j(MotionEvent motionEvent) {
        s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return k(motionEvent);
        }
        sVar.c(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    public void jumpToPositionForSmoothScroller(int i7) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i7);
        awakenScrollBars();
    }

    public final boolean k(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i7 = 0; i7 < size; i7++) {
            s sVar = this.mOnItemTouchListeners.get(i7);
            if (sVar.a(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    public final void l(int[] iArr) {
        int g7 = this.mChildHelper.g();
        if (g7 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        for (int i9 = 0; i9 < g7; i9++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i9));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i7) {
                    i7 = layoutPosition;
                }
                if (layoutPosition > i8) {
                    i8 = layoutPosition;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
    }

    @q0
    public final View m() {
        f0 findViewHolderForAdapterPosition;
        c0 c0Var = this.mState;
        int i7 = c0Var.f5081m;
        if (i7 == -1) {
            i7 = 0;
        }
        int d7 = c0Var.d();
        for (int i8 = i7; i8 < d7; i8++) {
            f0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i8);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(d7, i7);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    public void markItemDecorInsetsDirty() {
        int j7 = this.mChildHelper.j();
        for (int i7 = 0; i7 < j7; i7++) {
            ((p) this.mChildHelper.i(i7).getLayoutParams()).f5125c = true;
        }
        this.mRecycler.t();
    }

    public void markKnownViewsInvalid() {
        int j7 = this.mChildHelper.j();
        for (int i7 = 0; i7 < j7; i7++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i7));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.u();
    }

    public final int n(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public final String o(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    public void offsetChildrenHorizontal(@u0 int i7) {
        int g7 = this.mChildHelper.g();
        for (int i8 = 0; i8 < g7; i8++) {
            this.mChildHelper.f(i8).offsetLeftAndRight(i7);
        }
    }

    public void offsetChildrenVertical(@u0 int i7) {
        int g7 = this.mChildHelper.g();
        for (int i8 = 0; i8 < g7; i8++) {
            this.mChildHelper.f(i8).offsetTopAndBottom(i7);
        }
    }

    public void offsetPositionRecordsForInsert(int i7, int i8) {
        int j7 = this.mChildHelper.j();
        for (int i9 = 0; i9 < j7; i9++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i9));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i7) {
                childViewHolderInt.offsetPosition(i8, false);
                this.mState.f5075g = true;
            }
        }
        this.mRecycler.v(i7, i8);
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int j7 = this.mChildHelper.j();
        if (i7 < i8) {
            i11 = -1;
            i10 = i7;
            i9 = i8;
        } else {
            i9 = i7;
            i10 = i8;
            i11 = 1;
        }
        for (int i13 = 0; i13 < j7; i13++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i13));
            if (childViewHolderInt != null && (i12 = childViewHolderInt.mPosition) >= i10 && i12 <= i9) {
                if (i12 == i7) {
                    childViewHolderInt.offsetPosition(i8 - i7, false);
                } else {
                    childViewHolderInt.offsetPosition(i11, false);
                }
                this.mState.f5075g = true;
            }
        }
        this.mRecycler.w(i7, i8);
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i7, int i8, boolean z6) {
        int i9 = i7 + i8;
        int j7 = this.mChildHelper.j();
        for (int i10 = 0; i10 < j7; i10++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i11 = childViewHolderInt.mPosition;
                if (i11 >= i9) {
                    childViewHolderInt.offsetPosition(-i8, z6);
                    this.mState.f5075g = true;
                } else if (i11 >= i7) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i7 - 1, -i8, z6);
                    this.mState.f5075g = true;
                }
            }
        }
        this.mRecycler.x(i7, i8, z6);
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$o r1 = r5.mLayout
            if (r1 == 0) goto L1e
            r1.dispatchAttachedToWindow(r5)
        L1e:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L61
            java.lang.ThreadLocal<androidx.recyclerview.widget.l> r0 = androidx.recyclerview.widget.l.f5496o
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.l r1 = (androidx.recyclerview.widget.l) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.l r1 = new androidx.recyclerview.widget.l
            r1.<init>()
            r5.mGapWorker = r1
            android.view.Display r1 = androidx.core.view.u1.Q(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.l r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f5500m = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.l r0 = r5.mGapWorker
            r0.a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(@o0 View view) {
    }

    public void onChildDetachedFromWindow(@o0 View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.l lVar;
        super.onDetachedFromWindow();
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.l();
        }
        stopScroll();
        this.mIsAttached = false;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.j();
        if (!ALLOW_THREAD_GAP_WORK || (lVar = this.mGapWorker) == null) {
            return;
        }
        lVar.j(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.mItemDecorations.get(i7).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.scrollByInternal(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (k(motionEvent)) {
            c();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean canScrollHorizontally = oVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x6 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x6;
            this.mInitialTouchX = x6;
            int y6 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y6;
            this.mInitialTouchY = y6;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i7 = canScrollHorizontally;
            if (canScrollVertically) {
                i7 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i7, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x7 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y7 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i8 = x7 - this.mInitialTouchX;
                int i9 = y7 - this.mInitialTouchY;
                if (!canScrollHorizontally || Math.abs(i8) <= this.mTouchSlop) {
                    z6 = false;
                } else {
                    this.mLastTouchX = x7;
                    z6 = true;
                }
                if (canScrollVertically && Math.abs(i9) > this.mTouchSlop) {
                    this.mLastTouchY = y7;
                    z6 = true;
                }
                if (z6) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x8;
            this.mInitialTouchX = x8;
            int y8 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y8;
            this.mInitialTouchY = y8;
        } else if (actionMasked == 6) {
            u(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        w0.b(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        w0.d();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i7, i8);
            return;
        }
        boolean z6 = false;
        if (oVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i7, i8);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z6 = true;
            }
            if (z6 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f5073e == 1) {
                g();
            }
            this.mLayout.setMeasureSpecs(i7, i8);
            this.mState.f5078j = true;
            h();
            this.mLayout.setMeasuredDimensionFromChildren(i7, i8);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f5078j = true;
                h();
                this.mLayout.setMeasuredDimensionFromChildren(i7, i8);
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i7, i8);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                w();
                onExitLayoutOrScroll();
                c0 c0Var = this.mState;
                if (c0Var.f5080l) {
                    c0Var.f5076h = true;
                } else {
                    this.mAdapterHelper.k();
                    this.mState.f5076h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f5080l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.f5074f = gVar.getItemCount();
            } else {
                this.mState.f5074f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.onMeasure(this.mRecycler, this.mState, i7, i8);
            stopInterceptRequestLayout(false);
            this.mState.f5076h = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.mPendingSavedState = zVar;
        super.onRestoreInstanceState(zVar.getSuperState());
        o oVar = this.mLayout;
        if (oVar == null || (parcelable2 = this.mPendingSavedState.f5145k) == null) {
            return;
        }
        oVar.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.mPendingSavedState;
        if (zVar2 != null) {
            zVar.a(zVar2);
        } else {
            o oVar = this.mLayout;
            if (oVar != null) {
                zVar.f5145k = oVar.onSaveInstanceState();
            } else {
                zVar.f5145k = null;
            }
        }
        return zVar;
    }

    public void onScrollStateChanged(int i7) {
    }

    public void onScrolled(@u0 int i7, @u0 int i8) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 == i9 && i8 == i10) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(long j7, f0 f0Var, f0 f0Var2) {
        int g7 = this.mChildHelper.g();
        for (int i7 = 0; i7 < g7; i7++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i7));
            if (childViewHolderInt != f0Var && getChangedHolderKey(childViewHolderInt) == j7) {
                g gVar = this.mAdapter;
                if (gVar == null || !gVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + f0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + f0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f0Var2 + " cannot be found but it is necessary for " + f0Var + exceptionLabel());
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        u1.p1(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z6) {
        this.mDispatchItemsChangedEvent = z6 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public final boolean q() {
        int g7 = this.mChildHelper.g();
        for (int i7 = 0; i7 < g7; i7++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i7));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    public final void r() {
        if (u1.W(this) == 0) {
            u1.S1(this, 8);
        }
    }

    public void recordAnimationInfoIfBouncedHiddenView(f0 f0Var, l.d dVar) {
        f0Var.setFlags(0, 8192);
        if (this.mState.f5077i && f0Var.isUpdated() && !f0Var.isRemoved() && !f0Var.shouldIgnore()) {
            this.mViewInfoStore.c(getChangedHolderKey(f0Var), f0Var);
        }
        this.mViewInfoStore.e(f0Var, dVar);
    }

    public void removeAndRecycleViews() {
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.l();
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.d();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean r6 = this.mChildHelper.r(view);
        if (r6) {
            f0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.K(childViewHolderInt);
            this.mRecycler.D(childViewHolderInt);
        }
        stopInterceptRequestLayout(!r6);
        return r6;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z6) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z6);
    }

    public void removeItemDecoration(@o0 n nVar) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i7) {
        int itemDecorationCount = getItemDecorationCount();
        if (i7 >= 0 && i7 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i7));
            return;
        }
        throw new IndexOutOfBoundsException(i7 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@o0 q qVar) {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(qVar);
    }

    public void removeOnItemTouchListener(@o0 s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@o0 t tVar) {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public void repositionShadowingViews() {
        f0 f0Var;
        int g7 = this.mChildHelper.g();
        for (int i7 = 0; i7 < g7; i7++) {
            View f7 = this.mChildHelper.f(i7);
            f0 childViewHolder = getChildViewHolder(f7);
            if (childViewHolder != null && (f0Var = childViewHolder.mShadowingHolder) != null) {
                View view = f0Var.itemView;
                int left = f7.getLeft();
                int top = f7.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            A(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        int size = this.mOnItemTouchListeners.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.mOnItemTouchListeners.get(i7).e(z6);
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        this.mChildHelper = new androidx.recyclerview.widget.g(new e());
    }

    public void saveOldPositions() {
        int j7 = this.mChildHelper.j();
        for (int i7 = 0; i7 < j7; i7++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i7));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i7, int i8) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            boolean canScrollHorizontally = oVar.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (canScrollHorizontally || canScrollVertically) {
                if (!canScrollHorizontally) {
                    i7 = 0;
                }
                if (!canScrollVertically) {
                    i8 = 0;
                }
                scrollByInternal(i7, i8, null);
            }
        }
    }

    public boolean scrollByInternal(int i7, int i8, MotionEvent motionEvent) {
        int i9;
        int i10;
        int i11;
        int i12;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i7, i8, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i13 = iArr2[0];
            int i14 = iArr2[1];
            i9 = i14;
            i10 = i13;
            i11 = i7 - i13;
            i12 = i8 - i14;
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i10, i9, i11, i12, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i15 = iArr4[0];
        int i16 = i11 - i15;
        int i17 = iArr4[1];
        int i18 = i12 - i17;
        boolean z6 = (i15 == 0 && i17 == 0) ? false : true;
        int i19 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i20 = iArr5[0];
        this.mLastTouchX = i19 - i20;
        int i21 = this.mLastTouchY;
        int i22 = iArr5[1];
        this.mLastTouchY = i21 - i22;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i20;
        iArr6[1] = iArr6[1] + i22;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.b1.l(motionEvent, 8194)) {
                x(motionEvent.getX(), i16, motionEvent.getY(), i18);
            }
            considerReleasingGlowsOnScroll(i7, i8);
        }
        if (i10 != 0 || i9 != 0) {
            dispatchOnScrolled(i10, i9);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z6 && i10 == 0 && i9 == 0) ? false : true;
    }

    public void scrollStep(int i7, int i8, @q0 int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        w0.b(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i7 != 0 ? this.mLayout.scrollHorizontallyBy(i7, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i8 != 0 ? this.mLayout.scrollVerticallyBy(i8, this.mRecycler, this.mState) : 0;
        w0.d();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i7, int i8) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i7) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        oVar.scrollToPosition(i7);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@q0 androidx.recyclerview.widget.y yVar) {
        this.mAccessibilityDelegate = yVar;
        u1.B1(this, yVar);
    }

    public void setAdapter(@q0 g gVar) {
        setLayoutFrozen(false);
        E(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@q0 j jVar) {
        if (jVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = jVar;
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    @l1
    public boolean setChildImportantForAccessibilityInternal(f0 f0Var, int i7) {
        if (!isComputingLayout()) {
            u1.R1(f0Var.itemView, i7);
            return true;
        }
        f0Var.mPendingAccessibilityState = i7;
        this.mPendingAccessibilityImportanceChange.add(f0Var);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z6) {
        if (z6 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z6;
        super.setClipToPadding(z6);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@o0 k kVar) {
        g1.s.l(kVar);
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z6) {
        this.mHasFixedSize = z6;
    }

    public void setItemAnimator(@q0 l lVar) {
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.l();
            this.mItemAnimator.A(null);
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.A(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i7) {
        this.mRecycler.H(i7);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z6) {
        suppressLayout(z6);
    }

    public void setLayoutManager(@q0 o oVar) {
        if (oVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            l lVar = this.mItemAnimator;
            if (lVar != null) {
                lVar.l();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.d();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.d();
        }
        this.mChildHelper.o();
        this.mLayout = oVar;
        if (oVar != null) {
            if (oVar.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.mRecyclerView.exceptionLabel());
            }
            oVar.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.L();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View, androidx.core.view.e1
    public void setNestedScrollingEnabled(boolean z6) {
        getScrollingChildHelper().p(z6);
    }

    public void setOnFlingListener(@q0 r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(@q0 t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z6) {
        this.mPreserveFocusAfterLayout = z6;
    }

    public void setRecycledViewPool(@q0 v vVar) {
        this.mRecycler.F(vVar);
    }

    public void setRecyclerListener(@q0 x xVar) {
        this.mRecyclerListener = xVar;
    }

    void setScrollState(int i7) {
        if (i7 == this.mScrollState) {
            return;
        }
        this.mScrollState = i7;
        if (i7 != 2) {
            F();
        }
        dispatchOnScrollStateChanged(i7);
    }

    public void setScrollingTouchSlop(int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 != 0) {
            if (i7 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i7 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@q0 d0 d0Var) {
        this.mRecycler.G(d0Var);
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (isComputingLayout()) {
            int d7 = accessibilityEvent != null ? h1.b.d(accessibilityEvent) : 0;
            this.mEatenAccessibilityChangeFlags |= d7 != 0 ? d7 : 0;
            return true;
        }
        return false;
    }

    public void smoothScrollBy(@u0 int i7, @u0 int i8) {
        smoothScrollBy(i7, i8, null);
    }

    public void smoothScrollToPosition(int i7) {
        if (this.mLayoutSuppressed) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.smoothScrollToPosition(this, this.mState, i7);
        }
    }

    public void startInterceptRequestLayout() {
        int i7 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i7;
        if (i7 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View, androidx.core.view.e1
    public boolean startNestedScroll(int i7) {
        return getScrollingChildHelper().r(i7);
    }

    public void stopInterceptRequestLayout(boolean z6) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z6 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z6 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, androidx.core.view.e1
    public void stopNestedScroll() {
        getScrollingChildHelper().t();
    }

    public void stopScroll() {
        setScrollState(0);
        F();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z6) {
        if (z6 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z6) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(@q0 g gVar, boolean z6) {
        setLayoutFrozen(false);
        E(gVar, true, z6);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public final boolean t(View view, View view2, int i7) {
        int i8;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c7 = 65535;
        int i9 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i10 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i11 = rect2.left;
        if ((i10 < i11 || rect.right <= i11) && rect.right < rect2.right) {
            i8 = 1;
        } else {
            int i12 = rect.right;
            int i13 = rect2.right;
            i8 = ((i12 > i13 || i10 >= i13) && i10 > i11) ? -1 : 0;
        }
        int i14 = rect.top;
        int i15 = rect2.top;
        if ((i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom) {
            c7 = 1;
        } else {
            int i16 = rect.bottom;
            int i17 = rect2.bottom;
            if ((i16 <= i17 && i14 < i17) || i14 <= i15) {
                c7 = 0;
            }
        }
        if (i7 == 1) {
            return c7 < 0 || (c7 == 0 && i8 * i9 <= 0);
        } else if (i7 == 2) {
            return c7 > 0 || (c7 == 0 && i8 * i9 >= 0);
        } else if (i7 == 17) {
            return i8 < 0;
        } else if (i7 == 33) {
            return c7 < 0;
        } else if (i7 == 66) {
            return i8 > 0;
        } else if (i7 == 130) {
            return c7 > 0;
        } else {
            throw new IllegalArgumentException("Invalid direction: " + i7 + exceptionLabel());
        }
    }

    public final void u(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i7);
            int x6 = (int) (motionEvent.getX(i7) + 0.5f);
            this.mLastTouchX = x6;
            this.mInitialTouchX = x6;
            int y6 = (int) (motionEvent.getY(i7) + 0.5f);
            this.mLastTouchY = y6;
            this.mInitialTouchY = y6;
        }
    }

    public final boolean v() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    public void viewRangeUpdate(int i7, int i8, Object obj) {
        int i9;
        int j7 = this.mChildHelper.j();
        int i10 = i7 + i8;
        for (int i11 = 0; i11 < j7; i11++) {
            View i12 = this.mChildHelper.i(i11);
            f0 childViewHolderInt = getChildViewHolderInt(i12);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i9 = childViewHolderInt.mPosition) >= i7 && i9 < i10) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((p) i12.getLayoutParams()).f5125c = true;
            }
        }
        this.mRecycler.N(i7, i8);
    }

    public final void w() {
        boolean z6;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.z();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (v()) {
            this.mAdapterHelper.x();
        } else {
            this.mAdapterHelper.k();
        }
        boolean z7 = false;
        boolean z8 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f5079k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z6 = this.mDataSetHasChangedAfterLayout) || z8 || this.mLayout.mRequestedSimpleAnimations) && (!z6 || this.mAdapter.hasStableIds());
        c0 c0Var = this.mState;
        if (c0Var.f5079k && z8 && !this.mDataSetHasChangedAfterLayout && v()) {
            z7 = true;
        }
        c0Var.f5080l = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            k1.j.g(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            k1.j.g(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            k1.j.g(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            k1.j.g(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.u1.n1(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.x(float, float, float, float):void");
    }

    public final void y() {
        View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.n(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        f0 findViewHolderForItemId = (this.mState.f5082n == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f5082n);
        if (findViewHolderForItemId != null && !this.mChildHelper.n(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
            view = findViewHolderForItemId.itemView;
        } else if (this.mChildHelper.g() > 0) {
            view = m();
        }
        if (view != null) {
            int i7 = this.mState.f5083o;
            if (i7 != -1 && (findViewById = view.findViewById(i7)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    public final void z() {
        boolean z6;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z6 = this.mLeftGlow.isFinished();
        } else {
            z6 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z6 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z6 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z6 |= this.mBottomGlow.isFinished();
        }
        if (z6) {
            u1.n1(this);
        }
    }

    public RecyclerView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0087a.f7836r);
    }

    @Override // androidx.core.view.c1
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return getScrollingChildHelper().d(i7, i8, iArr, iArr2, i9);
    }

    @Override // androidx.core.view.c1
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr, int i11) {
        return getScrollingChildHelper().g(i7, i8, i9, i10, iArr, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    @d.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.f0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.g r0 = r5.mChildHelper
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.g r3 = r5.mChildHelper
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$f0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.g r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$f0");
    }

    @Override // androidx.core.view.c1
    public boolean hasNestedScrollingParent(int i7) {
        return getScrollingChildHelper().l(i7);
    }

    public void onExitLayoutOrScroll(boolean z6) {
        int i7 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i7;
        if (i7 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z6) {
                f();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(@u0 int i7, @u0 int i8, @q0 Interpolator interpolator) {
        smoothScrollBy(i7, i8, interpolator, Integer.MIN_VALUE);
    }

    @Override // androidx.core.view.c1
    public boolean startNestedScroll(int i7, int i8) {
        return getScrollingChildHelper().s(i7, i8);
    }

    @Override // androidx.core.view.c1
    public void stopNestedScroll(int i7) {
        getScrollingChildHelper().u(i7);
    }

    public RecyclerView(@o0 Context context, @q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mObserver = new y();
        this.mRecycler = new w();
        this.mViewInfoStore = new h0();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new k();
        this.mItemAnimator = new androidx.recyclerview.widget.h();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new e0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new l.b() : null;
        this.mState = new c0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = q2.b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = q2.e(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.A(this.mItemAnimatorListener);
        initAdapterManager();
        s();
        r();
        if (u1.V(this) == 0) {
            u1.R1(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.y(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.P, i7, 0);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            saveAttributeDataForStyleable(context, a.j.P, attributeSet, obtainStyledAttributes, i7, 0);
        }
        String string = obtainStyledAttributes.getString(a.j.Y);
        if (obtainStyledAttributes.getInt(a.j.S, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(a.j.R, true);
        boolean z6 = obtainStyledAttributes.getBoolean(a.j.T, false);
        this.mEnableFastScroller = z6;
        if (z6) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(a.j.W), obtainStyledAttributes.getDrawable(a.j.X), (StateListDrawable) obtainStyledAttributes.getDrawable(a.j.U), obtainStyledAttributes.getDrawable(a.j.V));
        }
        obtainStyledAttributes.recycle();
        d(context, string, attributeSet, i7, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        if (i8 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes2, i7, 0);
        }
        boolean z7 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z7);
    }

    @Override // androidx.core.view.d1
    public final void dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr, int i11, @o0 int[] iArr2) {
        getScrollingChildHelper().e(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    public void smoothScrollBy(@u0 int i7, @u0 int i8, @q0 Interpolator interpolator, int i9) {
        smoothScrollBy(i7, i8, interpolator, i9, false);
    }

    /* loaded from: classes.dex */
    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public f0 f5123a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f5124b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5125c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5126d;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5124b = new Rect();
            this.f5125c = true;
            this.f5126d = false;
        }

        public int a() {
            return this.f5123a.getAdapterPosition();
        }

        public int b() {
            return this.f5123a.getLayoutPosition();
        }

        @Deprecated
        public int c() {
            return this.f5123a.getPosition();
        }

        public boolean d() {
            return this.f5123a.isUpdated();
        }

        public boolean e() {
            return this.f5123a.isRemoved();
        }

        public boolean f() {
            return this.f5123a.isInvalid();
        }

        public boolean g() {
            return this.f5123a.needsUpdate();
        }

        public p(int i7, int i8) {
            super(i7, i8);
            this.f5124b = new Rect();
            this.f5125c = true;
            this.f5126d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5124b = new Rect();
            this.f5125c = true;
            this.f5126d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5124b = new Rect();
            this.f5125c = true;
            this.f5126d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f5124b = new Rect();
            this.f5125c = true;
            this.f5126d = false;
        }
    }

    @b1({b1.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class z extends o1.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public Parcelable f5145k;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<z> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i7) {
                return new z[i7];
            }
        }

        public z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5145k = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        public void a(z zVar) {
            this.f5145k = zVar.f5145k;
        }

        @Override // o1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeParcelable(this.f5145k, 0);
        }

        public z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public void smoothScrollBy(@u0 int i7, @u0 int i8, @q0 Interpolator interpolator, int i9, boolean z6) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            if (!oVar.canScrollHorizontally()) {
                i7 = 0;
            }
            if (!this.mLayout.canScrollVertically()) {
                i8 = 0;
            }
            if (i7 == 0 && i8 == 0) {
                return;
            }
            if (i9 == Integer.MIN_VALUE || i9 > 0) {
                if (z6) {
                    int i10 = i7 != 0 ? 1 : 0;
                    if (i8 != 0) {
                        i10 |= 2;
                    }
                    startNestedScroll(i10, 1);
                }
                this.mViewFlinger.f(i7, i8, i9, interpolator);
                return;
            }
            scrollBy(i7, i8);
        }
    }

    public void addItemDecoration(@o0 n nVar) {
        addItemDecoration(nVar, -1);
    }
}