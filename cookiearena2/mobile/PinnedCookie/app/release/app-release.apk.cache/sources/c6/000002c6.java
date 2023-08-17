package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.k;
import androidx.core.view.u1;
import d.o0;
import d.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import y.d;
import y.e;
import z.b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static m sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.b> mConstraintHelpers;
    protected androidx.constraintlayout.widget.c mConstraintLayoutSpec;
    private e mConstraintSet;
    private int mConstraintSetId;
    private g mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected y.f mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    c mMeasurer;
    private q.f mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<y.e> mTempMapIdToWidget;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2026a;

        static {
            int[] iArr = new int[e.b.values().length];
            f2026a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2026a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2026a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2026a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements b.InterfaceC0268b {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f2114a;

        /* renamed from: b  reason: collision with root package name */
        public int f2115b;

        /* renamed from: c  reason: collision with root package name */
        public int f2116c;

        /* renamed from: d  reason: collision with root package name */
        public int f2117d;

        /* renamed from: e  reason: collision with root package name */
        public int f2118e;

        /* renamed from: f  reason: collision with root package name */
        public int f2119f;

        /* renamed from: g  reason: collision with root package name */
        public int f2120g;

        public c(ConstraintLayout l7) {
            this.f2114a = l7;
        }

        @Override // z.b.InterfaceC0268b
        public final void a() {
            int childCount = this.f2114a.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f2114a.getChildAt(i7);
                if (childAt instanceof j) {
                    ((j) childAt).b(this.f2114a);
                }
            }
            int size = this.f2114a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i8 = 0; i8 < size; i8++) {
                    ((androidx.constraintlayout.widget.b) this.f2114a.mConstraintHelpers.get(i8)).E(this.f2114a);
                }
            }
        }

        @Override // z.b.InterfaceC0268b
        @SuppressLint({"WrongCall"})
        public final void b(y.e widget, b.a measure) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i7;
            int i8;
            int i9;
            if (widget == null) {
                return;
            }
            if (widget.l0() == 8 && !widget.C0()) {
                measure.f18908e = 0;
                measure.f18909f = 0;
                measure.f18910g = 0;
            } else if (widget.U() == null) {
            } else {
                e.b bVar = measure.f18904a;
                e.b bVar2 = measure.f18905b;
                int i10 = measure.f18906c;
                int i11 = measure.f18907d;
                int i12 = this.f2115b + this.f2116c;
                int i13 = this.f2117d;
                View view = (View) widget.w();
                int[] iArr = a.f2026a;
                int i14 = iArr[bVar.ordinal()];
                if (i14 == 1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                } else if (i14 == 2) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2119f, i13, -2);
                } else if (i14 == 3) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2119f, i13 + widget.I(), -1);
                } else if (i14 != 4) {
                    makeMeasureSpec = 0;
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2119f, i13, -2);
                    boolean z6 = widget.f18620w == 1;
                    int i15 = measure.f18913j;
                    if (i15 == b.a.f18902l || i15 == b.a.f18903m) {
                        if (measure.f18913j == b.a.f18903m || !z6 || (z6 && (view.getMeasuredHeight() == widget.D())) || (view instanceof j) || widget.G0()) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(widget.m0(), 1073741824);
                        }
                    }
                }
                int i16 = iArr[bVar2.ordinal()];
                if (i16 == 1) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                } else if (i16 == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2120g, i12, -2);
                } else if (i16 == 3) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2120g, i12 + widget.k0(), -1);
                } else if (i16 != 4) {
                    makeMeasureSpec2 = 0;
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2120g, i12, -2);
                    boolean z7 = widget.f18622x == 1;
                    int i17 = measure.f18913j;
                    if (i17 == b.a.f18902l || i17 == b.a.f18903m) {
                        if (measure.f18913j == b.a.f18903m || !z7 || (z7 && (view.getMeasuredWidth() == widget.m0())) || (view instanceof j) || widget.H0()) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(widget.D(), 1073741824);
                        }
                    }
                }
                y.f fVar = (y.f) widget.U();
                if (fVar != null && y.k.b(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == widget.m0() && view.getMeasuredWidth() < fVar.m0() && view.getMeasuredHeight() == widget.D() && view.getMeasuredHeight() < fVar.D() && view.getBaseline() == widget.t() && !widget.F0()) {
                    if (d(widget.J(), makeMeasureSpec, widget.m0()) && d(widget.K(), makeMeasureSpec2, widget.D())) {
                        measure.f18908e = widget.m0();
                        measure.f18909f = widget.D();
                        measure.f18910g = widget.t();
                        return;
                    }
                }
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                boolean z8 = bVar == bVar3;
                boolean z9 = bVar2 == bVar3;
                e.b bVar4 = e.b.MATCH_PARENT;
                boolean z10 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
                boolean z11 = bVar == bVar4 || bVar == e.b.FIXED;
                boolean z12 = z8 && widget.f18587f0 > 0.0f;
                boolean z13 = z9 && widget.f18587f0 > 0.0f;
                if (view == null) {
                    return;
                }
                b bVar5 = (b) view.getLayoutParams();
                int i18 = measure.f18913j;
                if (i18 != b.a.f18902l && i18 != b.a.f18903m && z8 && widget.f18620w == 0 && z9 && widget.f18622x == 0) {
                    i9 = -1;
                    i8 = 0;
                    baseline = 0;
                    max = 0;
                } else {
                    if ((view instanceof o) && (widget instanceof y.n)) {
                        ((o) view).J((y.n) widget, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    widget.J1(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i19 = widget.f18626z;
                    max = i19 > 0 ? Math.max(i19, measuredWidth) : measuredWidth;
                    int i20 = widget.A;
                    if (i20 > 0) {
                        max = Math.min(i20, max);
                    }
                    int i21 = widget.C;
                    if (i21 > 0) {
                        i8 = Math.max(i21, measuredHeight);
                        i7 = makeMeasureSpec;
                    } else {
                        i7 = makeMeasureSpec;
                        i8 = measuredHeight;
                    }
                    int i22 = widget.D;
                    if (i22 > 0) {
                        i8 = Math.min(i22, i8);
                    }
                    if (!y.k.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                        if (z12 && z10) {
                            max = (int) ((i8 * widget.f18587f0) + 0.5f);
                        } else if (z13 && z11) {
                            i8 = (int) ((max / widget.f18587f0) + 0.5f);
                        }
                    }
                    if (measuredWidth != max || measuredHeight != i8) {
                        int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i7;
                        if (measuredHeight != i8) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        }
                        view.measure(makeMeasureSpec3, makeMeasureSpec2);
                        widget.J1(makeMeasureSpec3, makeMeasureSpec2);
                        max = view.getMeasuredWidth();
                        i8 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i9 = -1;
                }
                boolean z14 = baseline != i9;
                measure.f18912i = (max == measure.f18906c && i8 == measure.f18907d) ? false : true;
                if (bVar5.f2043g0) {
                    z14 = true;
                }
                if (z14 && baseline != -1 && widget.t() != baseline) {
                    measure.f18912i = true;
                }
                measure.f18908e = max;
                measure.f18909f = i8;
                measure.f18911h = z14;
                measure.f18910g = baseline;
            }
        }

        public void c(int widthSpec, int heightSpec, int top, int bottom, int width, int height) {
            this.f2115b = top;
            this.f2116c = bottom;
            this.f2117d = width;
            this.f2118e = height;
            this.f2119f = widthSpec;
            this.f2120g = heightSpec;
        }

        public final boolean d(int lastMeasureSpec, int spec, int widgetSize) {
            if (lastMeasureSpec == spec) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(lastMeasureSpec);
            View.MeasureSpec.getSize(lastMeasureSpec);
            int mode2 = View.MeasureSpec.getMode(spec);
            int size = View.MeasureSpec.getSize(spec);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && widgetSize == size;
            }
            return false;
        }
    }

    public ConstraintLayout(@o0 Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new y.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        b(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static m getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new m();
        }
        return sSharedValues;
    }

    public final y.e a(int id) {
        if (id == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(id);
        if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f2073v0;
    }

    public void applyConstraintsFromLayoutParams(boolean isInEditMode, View child, y.e widget, b layoutParams, SparseArray<y.e> idToWidget) {
        y.e eVar;
        y.e eVar2;
        y.e eVar3;
        y.e eVar4;
        int i7;
        layoutParams.e();
        layoutParams.f2075w0 = false;
        widget.b2(child.getVisibility());
        if (layoutParams.f2049j0) {
            widget.H1(true);
            widget.b2(8);
        }
        widget.h1(child);
        if (child instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) child).B(widget, this.mLayoutWidget.O2());
        }
        if (layoutParams.f2045h0) {
            y.h hVar = (y.h) widget;
            int i8 = layoutParams.f2067s0;
            int i9 = layoutParams.f2069t0;
            float f7 = layoutParams.f2071u0;
            if (f7 != -1.0f) {
                hVar.y2(f7);
                return;
            } else if (i8 != -1) {
                hVar.w2(i8);
                return;
            } else if (i9 != -1) {
                hVar.x2(i9);
                return;
            } else {
                return;
            }
        }
        int i10 = layoutParams.f2053l0;
        int i11 = layoutParams.f2055m0;
        int i12 = layoutParams.f2057n0;
        int i13 = layoutParams.f2059o0;
        int i14 = layoutParams.f2061p0;
        int i15 = layoutParams.f2063q0;
        float f8 = layoutParams.f2065r0;
        int i16 = layoutParams.f2060p;
        if (i16 != -1) {
            y.e eVar5 = idToWidget.get(i16);
            if (eVar5 != null) {
                widget.m(eVar5, layoutParams.f2064r, layoutParams.f2062q);
            }
        } else {
            if (i10 != -1) {
                y.e eVar6 = idToWidget.get(i10);
                if (eVar6 != null) {
                    d.b bVar = d.b.LEFT;
                    widget.v0(bVar, eVar6, bVar, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i14);
                }
            } else if (i11 != -1 && (eVar = idToWidget.get(i11)) != null) {
                widget.v0(d.b.LEFT, eVar, d.b.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i14);
            }
            if (i12 != -1) {
                y.e eVar7 = idToWidget.get(i12);
                if (eVar7 != null) {
                    widget.v0(d.b.RIGHT, eVar7, d.b.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i15);
                }
            } else if (i13 != -1 && (eVar2 = idToWidget.get(i13)) != null) {
                d.b bVar2 = d.b.RIGHT;
                widget.v0(bVar2, eVar2, bVar2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i15);
            }
            int i17 = layoutParams.f2046i;
            if (i17 != -1) {
                y.e eVar8 = idToWidget.get(i17);
                if (eVar8 != null) {
                    d.b bVar3 = d.b.TOP;
                    widget.v0(bVar3, eVar8, bVar3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f2076x);
                }
            } else {
                int i18 = layoutParams.f2048j;
                if (i18 != -1 && (eVar3 = idToWidget.get(i18)) != null) {
                    widget.v0(d.b.TOP, eVar3, d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f2076x);
                }
            }
            int i19 = layoutParams.f2050k;
            if (i19 != -1) {
                y.e eVar9 = idToWidget.get(i19);
                if (eVar9 != null) {
                    widget.v0(d.b.BOTTOM, eVar9, d.b.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f2078z);
                }
            } else {
                int i20 = layoutParams.f2052l;
                if (i20 != -1 && (eVar4 = idToWidget.get(i20)) != null) {
                    d.b bVar4 = d.b.BOTTOM;
                    widget.v0(bVar4, eVar4, bVar4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f2078z);
                }
            }
            int i21 = layoutParams.f2054m;
            if (i21 != -1) {
                e(widget, layoutParams, idToWidget, i21, d.b.BASELINE);
            } else {
                int i22 = layoutParams.f2056n;
                if (i22 != -1) {
                    e(widget, layoutParams, idToWidget, i22, d.b.TOP);
                } else {
                    int i23 = layoutParams.f2058o;
                    if (i23 != -1) {
                        e(widget, layoutParams, idToWidget, i23, d.b.BOTTOM);
                    }
                }
            }
            if (f8 >= 0.0f) {
                widget.A1(f8);
            }
            float f9 = layoutParams.H;
            if (f9 >= 0.0f) {
                widget.V1(f9);
            }
        }
        if (isInEditMode && ((i7 = layoutParams.X) != -1 || layoutParams.Y != -1)) {
            widget.R1(i7, layoutParams.Y);
        }
        if (layoutParams.f2039e0) {
            widget.D1(e.b.FIXED);
            widget.c2(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                widget.D1(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
            if (layoutParams.f2031a0) {
                widget.D1(e.b.MATCH_CONSTRAINT);
            } else {
                widget.D1(e.b.MATCH_PARENT);
            }
            widget.r(d.b.LEFT).f18536g = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            widget.r(d.b.RIGHT).f18536g = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            widget.D1(e.b.MATCH_CONSTRAINT);
            widget.c2(0);
        }
        if (layoutParams.f2041f0) {
            widget.Y1(e.b.FIXED);
            widget.y1(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                widget.Y1(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            if (layoutParams.f2033b0) {
                widget.Y1(e.b.MATCH_CONSTRAINT);
            } else {
                widget.Y1(e.b.MATCH_PARENT);
            }
            widget.r(d.b.TOP).f18536g = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            widget.r(d.b.BOTTOM).f18536g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            widget.Y1(e.b.MATCH_CONSTRAINT);
            widget.y1(0);
        }
        widget.n1(layoutParams.I);
        widget.F1(layoutParams.L);
        widget.a2(layoutParams.M);
        widget.B1(layoutParams.N);
        widget.W1(layoutParams.O);
        widget.e2(layoutParams.f2037d0);
        widget.E1(layoutParams.P, layoutParams.R, layoutParams.T, layoutParams.V);
        widget.Z1(layoutParams.Q, layoutParams.S, layoutParams.U, layoutParams.W);
    }

    public final void b(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.mLayoutWidget.h1(this);
        this.mLayoutWidget.U2(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.x6, defStyleAttr, defStyleRes);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.O6) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == k.m.P6) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == k.m.M6) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == k.m.N6) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == k.m.H8) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == k.m.C7) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == k.m.g7) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.mConstraintSet = eVar;
                        eVar.w0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.V2(this.mOptimizationLevel);
    }

    public final void c() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p6) {
        return p6 instanceof b;
    }

    public final void d() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            y.e viewWidget = getViewWidget(getChildAt(i7));
            if (viewWidget != null) {
                viewWidget.R0();
            }
        }
        if (isInEditMode) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    a(childAt.getId()).j1(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt2 = getChildAt(i9);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof f)) {
                    this.mConstraintSet = ((f) childAt2).getConstraintSet();
                }
            }
        }
        e eVar = this.mConstraintSet;
        if (eVar != null) {
            eVar.t(this, true);
        }
        this.mLayoutWidget.p2();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.mConstraintHelpers.get(i10).G(this);
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt3 = getChildAt(i11);
            if (childAt3 instanceof j) {
                ((j) childAt3).c(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt4 = getChildAt(i12);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt5 = getChildAt(i13);
            y.e viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.mLayoutWidget.b(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, bVar, this.mTempMapIdToWidget);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.mConstraintHelpers.get(i7).F(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i9 = (int) ((parseInt / 1080.0f) * width);
                        int i10 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(u0.a.f17311c);
                        float f7 = i9;
                        float f8 = i10;
                        float f9 = i9 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f7, f8, f9, f8, paint);
                        float parseInt4 = i10 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f9, f8, f9, parseInt4, paint);
                        canvas.drawLine(f9, parseInt4, f7, parseInt4, paint);
                        canvas.drawLine(f7, parseInt4, f7, f8, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f7, f8, f9, parseInt4, paint);
                        canvas.drawLine(f7, parseInt4, f9, f8, paint);
                    }
                }
            }
        }
    }

    public final void e(y.e widget, b layoutParams, SparseArray<y.e> idToWidget, int baselineTarget, d.b type) {
        View view = this.mChildrenByIds.get(baselineTarget);
        y.e eVar = idToWidget.get(baselineTarget);
        if (eVar == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        layoutParams.f2043g0 = true;
        d.b bVar = d.b.BASELINE;
        if (type == bVar) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f2043g0 = true;
            bVar2.f2073v0.x1(true);
        }
        widget.r(bVar).b(eVar.r(type), layoutParams.D, layoutParams.C, true);
        widget.x1(true);
        widget.r(d.b.TOP).x();
        widget.r(d.b.BOTTOM).x();
    }

    public final boolean f() {
        int childCount = getChildCount();
        boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            } else if (getChildAt(i7).isLayoutRequested()) {
                z6 = true;
                break;
            } else {
                i7++;
            }
        }
        if (z6) {
            d();
        }
        return z6;
    }

    public void fillMetrics(q.f metrics) {
        this.mMetrics = metrics;
        this.mLayoutWidget.E2(metrics);
    }

    @Override // android.view.View
    public void forceLayout() {
        c();
        super.forceLayout();
    }

    public Object getDesignInformation(int type, Object value) {
        if (type == 0 && (value instanceof String)) {
            String str = (String) value;
            HashMap<String, Integer> hashMap = this.mDesignIds;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.mDesignIds.get(str);
        }
        return null;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.H2();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.f18604o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.f18604o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.f18604o = e.V1;
            }
        }
        if (this.mLayoutWidget.y() == null) {
            y.f fVar = this.mLayoutWidget;
            fVar.j1(fVar.f18604o);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" setDebugName ");
            sb2.append(this.mLayoutWidget.y());
        }
        Iterator<y.e> it = this.mLayoutWidget.l2().iterator();
        while (it.hasNext()) {
            y.e next = it.next();
            View view = (View) next.w();
            if (view != null) {
                if (next.f18604o == null && (id = view.getId()) != -1) {
                    next.f18604o = getContext().getResources().getResourceEntryName(id);
                }
                if (next.y() == null) {
                    next.j1(next.f18604o);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(" setDebugName ");
                    sb3.append(next.y());
                }
            }
        }
        this.mLayoutWidget.b0(sb);
        return sb.toString();
    }

    public View getViewById(int id) {
        return this.mChildrenByIds.get(id);
    }

    public final y.e getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).f2073v0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).f2073v0;
            }
            return null;
        }
        return null;
    }

    public boolean isRtl() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int layoutDescription) {
        if (layoutDescription == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, layoutDescription);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            b bVar = (b) childAt.getLayoutParams();
            y.e eVar = bVar.f2073v0;
            if ((childAt.getVisibility() != 8 || bVar.f2045h0 || bVar.f2047i0 || bVar.f2051k0 || isInEditMode) && !bVar.f2049j0) {
                int o02 = eVar.o0();
                int p02 = eVar.p0();
                int m02 = eVar.m0() + o02;
                int D = eVar.D() + p02;
                childAt.layout(o02, p02, m02, D);
                if ((childAt instanceof j) && (content = ((j) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(o02, p02, m02, D);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                this.mConstraintHelpers.get(i8).D(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.mOnMeasureWidthMeasureSpec == widthMeasureSpec) {
            int i7 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i8 = 0;
            while (true) {
                if (i8 >= childCount) {
                    break;
                } else if (getChildAt(i8).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i8++;
                }
            }
        }
        boolean z6 = this.mDirtyHierarchy;
        this.mOnMeasureWidthMeasureSpec = widthMeasureSpec;
        this.mOnMeasureHeightMeasureSpec = heightMeasureSpec;
        this.mLayoutWidget.Y2(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (f()) {
                this.mLayoutWidget.a3();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, widthMeasureSpec, heightMeasureSpec);
        resolveMeasuredDimension(widthMeasureSpec, heightMeasureSpec, this.mLayoutWidget.m0(), this.mLayoutWidget.D(), this.mLayoutWidget.P2(), this.mLayoutWidget.N2());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        y.e viewWidget = getViewWidget(view);
        if ((view instanceof i) && !(viewWidget instanceof y.h)) {
            b bVar = (b) view.getLayoutParams();
            y.h hVar = new y.h();
            bVar.f2073v0 = hVar;
            bVar.f2045h0 = true;
            hVar.B2(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.I();
            ((b) view.getLayoutParams()).f2047i0 = true;
            if (!this.mConstraintHelpers.contains(bVar2)) {
                this.mConstraintHelpers.add(bVar2);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.o2(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int id) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, id);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        c();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int widthMeasureSpec, int heightMeasureSpec, int measuredWidth, int measuredHeight, boolean isWidthMeasuredTooSmall, boolean isHeightMeasuredTooSmall) {
        c cVar = this.mMeasurer;
        int i7 = cVar.f2118e;
        int resolveSizeAndState = View.resolveSizeAndState(measuredWidth + cVar.f2117d, widthMeasureSpec, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(measuredHeight + i7, heightMeasureSpec, 0);
        int i8 = resolveSizeAndState & u1.f3815s;
        int i9 = resolveSizeAndState2 & u1.f3815s;
        int min = Math.min(this.mMaxWidth, i8);
        int min2 = Math.min(this.mMaxHeight, i9);
        if (isWidthMeasuredTooSmall) {
            min |= 16777216;
        }
        if (isHeightMeasuredTooSmall) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    public void resolveSystem(y.f layout, int optimizationLevel, int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i7 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.c(widthMeasureSpec, heightMeasureSpec, max, max2, paddingWidth, i7);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? isRtl() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i8 = size - paddingWidth;
        int i9 = size2 - i7;
        setSelfDimensionBehaviour(layout, mode, i8, mode2, i9);
        layout.Q2(optimizationLevel, mode, i8, mode2, i9, this.mLastMeasureWidth, this.mLastMeasureHeight, max5, max);
    }

    public void setConstraintSet(e set) {
        this.mConstraintSet = set;
    }

    public void setDesignInformation(int type, Object value1, Object value2) {
        if (type == 0 && (value1 instanceof String) && (value2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) value1;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) value2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int id) {
        this.mChildrenByIds.remove(getId());
        super.setId(id);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int value) {
        if (value == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = value;
        requestLayout();
    }

    public void setMaxWidth(int value) {
        if (value == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = value;
        requestLayout();
    }

    public void setMinHeight(int value) {
        if (value == this.mMinHeight) {
            return;
        }
        this.mMinHeight = value;
        requestLayout();
    }

    public void setMinWidth(int value) {
        if (value == this.mMinWidth) {
            return;
        }
        this.mMinWidth = value;
        requestLayout();
    }

    public void setOnConstraintsChanged(g constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.d(constraintsChangedListener);
        }
    }

    public void setOptimizationLevel(int level) {
        this.mOptimizationLevel = level;
        this.mLayoutWidget.V2(level);
    }

    public void setSelfDimensionBehaviour(y.f layout, int widthMode, int widthSize, int heightMode, int heightSize) {
        e.b bVar;
        c cVar = this.mMeasurer;
        int i7 = cVar.f2118e;
        int i8 = cVar.f2117d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (widthMode == Integer.MIN_VALUE) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                widthSize = Math.max(0, this.mMinWidth);
            }
        } else if (widthMode == 0) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                widthSize = Math.max(0, this.mMinWidth);
            }
            widthSize = 0;
        } else if (widthMode != 1073741824) {
            bVar = bVar2;
            widthSize = 0;
        } else {
            widthSize = Math.min(this.mMaxWidth - i8, widthSize);
            bVar = bVar2;
        }
        if (heightMode == Integer.MIN_VALUE) {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                heightSize = Math.max(0, this.mMinHeight);
            }
        } else if (heightMode != 0) {
            if (heightMode == 1073741824) {
                heightSize = Math.min(this.mMaxHeight - i7, heightSize);
            }
            heightSize = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                heightSize = Math.max(0, this.mMinHeight);
            }
            heightSize = 0;
        }
        if (widthSize != layout.m0() || heightSize != layout.D()) {
            layout.M2();
        }
        layout.f2(0);
        layout.g2(0);
        layout.M1(this.mMaxWidth - i8);
        layout.L1(this.mMaxHeight - i7);
        layout.P1(0);
        layout.O1(0);
        layout.D1(bVar);
        layout.c2(widthSize);
        layout.Y1(bVar2);
        layout.y1(heightSize);
        layout.P1(this.mMinWidth - i8);
        layout.O1(this.mMinHeight - i7);
    }

    public void setState(int id, int screenWidth, int screenHeight) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.e(id, screenWidth, screenHeight);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attrs) {
        return new b(getContext(), attrs);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p6) {
        return new b(p6);
    }

    public ConstraintLayout(@o0 Context context, @q0 AttributeSet attrs) {
        super(context, attrs);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new y.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        b(attrs, 0, 0);
    }

    public ConstraintLayout(@o0 Context context, @q0 AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new y.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        b(attrs, defStyleAttr, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@o0 Context context, @q0 AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new y.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        b(attrs, defStyleAttr, defStyleRes);
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public static final int A0 = Integer.MIN_VALUE;
        public static final int B0 = 0;
        public static final int C0 = 1;
        public static final int D0 = 1;
        public static final int E0 = 2;
        public static final int F0 = 3;
        public static final int G0 = 4;
        public static final int H0 = 5;
        public static final int I0 = 6;
        public static final int J0 = 7;
        public static final int K0 = 8;
        public static final int L0 = 1;
        public static final int M0 = 0;
        public static final int N0 = 2;
        public static final int O0 = 0;
        public static final int P0 = 1;
        public static final int Q0 = 2;
        public static final int R0 = 0;
        public static final int S0 = 1;
        public static final int T0 = 2;
        public static final int U0 = 3;

        /* renamed from: x0  reason: collision with root package name */
        public static final int f2027x0 = 0;

        /* renamed from: y0  reason: collision with root package name */
        public static final int f2028y0 = 0;

        /* renamed from: z0  reason: collision with root package name */
        public static final int f2029z0 = -1;
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean F;
        public float G;
        public float H;
        public String I;
        public float J;
        public int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* renamed from: a  reason: collision with root package name */
        public int f2030a;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f2031a0;

        /* renamed from: b  reason: collision with root package name */
        public int f2032b;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f2033b0;

        /* renamed from: c  reason: collision with root package name */
        public float f2034c;

        /* renamed from: c0  reason: collision with root package name */
        public String f2035c0;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2036d;

        /* renamed from: d0  reason: collision with root package name */
        public int f2037d0;

        /* renamed from: e  reason: collision with root package name */
        public int f2038e;

        /* renamed from: e0  reason: collision with root package name */
        public boolean f2039e0;

        /* renamed from: f  reason: collision with root package name */
        public int f2040f;

        /* renamed from: f0  reason: collision with root package name */
        public boolean f2041f0;

        /* renamed from: g  reason: collision with root package name */
        public int f2042g;

        /* renamed from: g0  reason: collision with root package name */
        public boolean f2043g0;

        /* renamed from: h  reason: collision with root package name */
        public int f2044h;

        /* renamed from: h0  reason: collision with root package name */
        public boolean f2045h0;

        /* renamed from: i  reason: collision with root package name */
        public int f2046i;

        /* renamed from: i0  reason: collision with root package name */
        public boolean f2047i0;

        /* renamed from: j  reason: collision with root package name */
        public int f2048j;

        /* renamed from: j0  reason: collision with root package name */
        public boolean f2049j0;

        /* renamed from: k  reason: collision with root package name */
        public int f2050k;

        /* renamed from: k0  reason: collision with root package name */
        public boolean f2051k0;

        /* renamed from: l  reason: collision with root package name */
        public int f2052l;

        /* renamed from: l0  reason: collision with root package name */
        public int f2053l0;

        /* renamed from: m  reason: collision with root package name */
        public int f2054m;

        /* renamed from: m0  reason: collision with root package name */
        public int f2055m0;

        /* renamed from: n  reason: collision with root package name */
        public int f2056n;

        /* renamed from: n0  reason: collision with root package name */
        public int f2057n0;

        /* renamed from: o  reason: collision with root package name */
        public int f2058o;

        /* renamed from: o0  reason: collision with root package name */
        public int f2059o0;

        /* renamed from: p  reason: collision with root package name */
        public int f2060p;

        /* renamed from: p0  reason: collision with root package name */
        public int f2061p0;

        /* renamed from: q  reason: collision with root package name */
        public int f2062q;

        /* renamed from: q0  reason: collision with root package name */
        public int f2063q0;

        /* renamed from: r  reason: collision with root package name */
        public float f2064r;

        /* renamed from: r0  reason: collision with root package name */
        public float f2065r0;

        /* renamed from: s  reason: collision with root package name */
        public int f2066s;

        /* renamed from: s0  reason: collision with root package name */
        public int f2067s0;

        /* renamed from: t  reason: collision with root package name */
        public int f2068t;

        /* renamed from: t0  reason: collision with root package name */
        public int f2069t0;

        /* renamed from: u  reason: collision with root package name */
        public int f2070u;

        /* renamed from: u0  reason: collision with root package name */
        public float f2071u0;

        /* renamed from: v  reason: collision with root package name */
        public int f2072v;

        /* renamed from: v0  reason: collision with root package name */
        public y.e f2073v0;

        /* renamed from: w  reason: collision with root package name */
        public int f2074w;

        /* renamed from: w0  reason: collision with root package name */
        public boolean f2075w0;

        /* renamed from: x  reason: collision with root package name */
        public int f2076x;

        /* renamed from: y  reason: collision with root package name */
        public int f2077y;

        /* renamed from: z  reason: collision with root package name */
        public int f2078z;

        /* loaded from: classes.dex */
        public static class a {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 31;
            public static final int G = 32;
            public static final int H = 33;
            public static final int I = 34;
            public static final int J = 35;
            public static final int K = 36;
            public static final int L = 37;
            public static final int M = 38;
            public static final int N = 39;
            public static final int O = 40;
            public static final int P = 41;
            public static final int Q = 42;
            public static final int R = 43;
            public static final int S = 44;
            public static final int T = 45;
            public static final int U = 46;
            public static final int V = 47;
            public static final int W = 48;
            public static final int X = 49;
            public static final int Y = 50;
            public static final int Z = 51;

            /* renamed from: a  reason: collision with root package name */
            public static final int f2079a = 0;

            /* renamed from: a0  reason: collision with root package name */
            public static final int f2080a0 = 52;

            /* renamed from: b  reason: collision with root package name */
            public static final int f2081b = 1;

            /* renamed from: b0  reason: collision with root package name */
            public static final int f2082b0 = 53;

            /* renamed from: c  reason: collision with root package name */
            public static final int f2083c = 2;

            /* renamed from: c0  reason: collision with root package name */
            public static final int f2084c0 = 54;

            /* renamed from: d  reason: collision with root package name */
            public static final int f2085d = 3;

            /* renamed from: d0  reason: collision with root package name */
            public static final int f2086d0 = 55;

            /* renamed from: e  reason: collision with root package name */
            public static final int f2087e = 4;

            /* renamed from: e0  reason: collision with root package name */
            public static final int f2088e0 = 64;

            /* renamed from: f  reason: collision with root package name */
            public static final int f2089f = 5;

            /* renamed from: f0  reason: collision with root package name */
            public static final int f2090f0 = 65;

            /* renamed from: g  reason: collision with root package name */
            public static final int f2091g = 6;

            /* renamed from: g0  reason: collision with root package name */
            public static final int f2092g0 = 66;

            /* renamed from: h  reason: collision with root package name */
            public static final int f2093h = 7;

            /* renamed from: h0  reason: collision with root package name */
            public static final int f2094h0 = 67;

            /* renamed from: i  reason: collision with root package name */
            public static final int f2095i = 8;

            /* renamed from: i0  reason: collision with root package name */
            public static final SparseIntArray f2096i0;

            /* renamed from: j  reason: collision with root package name */
            public static final int f2097j = 9;

            /* renamed from: k  reason: collision with root package name */
            public static final int f2098k = 10;

            /* renamed from: l  reason: collision with root package name */
            public static final int f2099l = 11;

            /* renamed from: m  reason: collision with root package name */
            public static final int f2100m = 12;

            /* renamed from: n  reason: collision with root package name */
            public static final int f2101n = 13;

            /* renamed from: o  reason: collision with root package name */
            public static final int f2102o = 14;

            /* renamed from: p  reason: collision with root package name */
            public static final int f2103p = 15;

            /* renamed from: q  reason: collision with root package name */
            public static final int f2104q = 16;

            /* renamed from: r  reason: collision with root package name */
            public static final int f2105r = 17;

            /* renamed from: s  reason: collision with root package name */
            public static final int f2106s = 18;

            /* renamed from: t  reason: collision with root package name */
            public static final int f2107t = 19;

            /* renamed from: u  reason: collision with root package name */
            public static final int f2108u = 20;

            /* renamed from: v  reason: collision with root package name */
            public static final int f2109v = 21;

            /* renamed from: w  reason: collision with root package name */
            public static final int f2110w = 22;

            /* renamed from: x  reason: collision with root package name */
            public static final int f2111x = 23;

            /* renamed from: y  reason: collision with root package name */
            public static final int f2112y = 24;

            /* renamed from: z  reason: collision with root package name */
            public static final int f2113z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2096i0 = sparseIntArray;
                sparseIntArray.append(k.m.s8, 64);
                sparseIntArray.append(k.m.V7, 65);
                sparseIntArray.append(k.m.e8, 8);
                sparseIntArray.append(k.m.f8, 9);
                sparseIntArray.append(k.m.h8, 10);
                sparseIntArray.append(k.m.i8, 11);
                sparseIntArray.append(k.m.o8, 12);
                sparseIntArray.append(k.m.n8, 13);
                sparseIntArray.append(k.m.L7, 14);
                sparseIntArray.append(k.m.K7, 15);
                sparseIntArray.append(k.m.G7, 16);
                sparseIntArray.append(k.m.I7, 52);
                sparseIntArray.append(k.m.H7, 53);
                sparseIntArray.append(k.m.M7, 2);
                sparseIntArray.append(k.m.O7, 3);
                sparseIntArray.append(k.m.N7, 4);
                sparseIntArray.append(k.m.x8, 49);
                sparseIntArray.append(k.m.y8, 50);
                sparseIntArray.append(k.m.S7, 5);
                sparseIntArray.append(k.m.T7, 6);
                sparseIntArray.append(k.m.U7, 7);
                sparseIntArray.append(k.m.B7, 67);
                sparseIntArray.append(k.m.y6, 1);
                sparseIntArray.append(k.m.j8, 17);
                sparseIntArray.append(k.m.k8, 18);
                sparseIntArray.append(k.m.R7, 19);
                sparseIntArray.append(k.m.Q7, 20);
                sparseIntArray.append(k.m.C8, 21);
                sparseIntArray.append(k.m.F8, 22);
                sparseIntArray.append(k.m.D8, 23);
                sparseIntArray.append(k.m.A8, 24);
                sparseIntArray.append(k.m.E8, 25);
                sparseIntArray.append(k.m.B8, 26);
                sparseIntArray.append(k.m.z8, 55);
                sparseIntArray.append(k.m.G8, 54);
                sparseIntArray.append(k.m.a8, 29);
                sparseIntArray.append(k.m.p8, 30);
                sparseIntArray.append(k.m.P7, 44);
                sparseIntArray.append(k.m.c8, 45);
                sparseIntArray.append(k.m.r8, 46);
                sparseIntArray.append(k.m.b8, 47);
                sparseIntArray.append(k.m.q8, 48);
                sparseIntArray.append(k.m.E7, 27);
                sparseIntArray.append(k.m.D7, 28);
                sparseIntArray.append(k.m.t8, 31);
                sparseIntArray.append(k.m.W7, 32);
                sparseIntArray.append(k.m.v8, 33);
                sparseIntArray.append(k.m.u8, 34);
                sparseIntArray.append(k.m.w8, 35);
                sparseIntArray.append(k.m.Y7, 36);
                sparseIntArray.append(k.m.X7, 37);
                sparseIntArray.append(k.m.Z7, 38);
                sparseIntArray.append(k.m.d8, 39);
                sparseIntArray.append(k.m.m8, 40);
                sparseIntArray.append(k.m.g8, 41);
                sparseIntArray.append(k.m.J7, 42);
                sparseIntArray.append(k.m.F7, 43);
                sparseIntArray.append(k.m.l8, 51);
                sparseIntArray.append(k.m.I8, 66);
            }
        }

        public b(b source) {
            super((ViewGroup.MarginLayoutParams) source);
            this.f2030a = -1;
            this.f2032b = -1;
            this.f2034c = -1.0f;
            this.f2036d = true;
            this.f2038e = -1;
            this.f2040f = -1;
            this.f2042g = -1;
            this.f2044h = -1;
            this.f2046i = -1;
            this.f2048j = -1;
            this.f2050k = -1;
            this.f2052l = -1;
            this.f2054m = -1;
            this.f2056n = -1;
            this.f2058o = -1;
            this.f2060p = -1;
            this.f2062q = 0;
            this.f2064r = 0.0f;
            this.f2066s = -1;
            this.f2068t = -1;
            this.f2070u = -1;
            this.f2072v = -1;
            this.f2074w = Integer.MIN_VALUE;
            this.f2076x = Integer.MIN_VALUE;
            this.f2077y = Integer.MIN_VALUE;
            this.f2078z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f2031a0 = false;
            this.f2033b0 = false;
            this.f2035c0 = null;
            this.f2037d0 = 0;
            this.f2039e0 = true;
            this.f2041f0 = true;
            this.f2043g0 = false;
            this.f2045h0 = false;
            this.f2047i0 = false;
            this.f2049j0 = false;
            this.f2051k0 = false;
            this.f2053l0 = -1;
            this.f2055m0 = -1;
            this.f2057n0 = -1;
            this.f2059o0 = -1;
            this.f2061p0 = Integer.MIN_VALUE;
            this.f2063q0 = Integer.MIN_VALUE;
            this.f2065r0 = 0.5f;
            this.f2073v0 = new y.e();
            this.f2075w0 = false;
            this.f2030a = source.f2030a;
            this.f2032b = source.f2032b;
            this.f2034c = source.f2034c;
            this.f2036d = source.f2036d;
            this.f2038e = source.f2038e;
            this.f2040f = source.f2040f;
            this.f2042g = source.f2042g;
            this.f2044h = source.f2044h;
            this.f2046i = source.f2046i;
            this.f2048j = source.f2048j;
            this.f2050k = source.f2050k;
            this.f2052l = source.f2052l;
            this.f2054m = source.f2054m;
            this.f2056n = source.f2056n;
            this.f2058o = source.f2058o;
            this.f2060p = source.f2060p;
            this.f2062q = source.f2062q;
            this.f2064r = source.f2064r;
            this.f2066s = source.f2066s;
            this.f2068t = source.f2068t;
            this.f2070u = source.f2070u;
            this.f2072v = source.f2072v;
            this.f2074w = source.f2074w;
            this.f2076x = source.f2076x;
            this.f2077y = source.f2077y;
            this.f2078z = source.f2078z;
            this.A = source.A;
            this.B = source.B;
            this.C = source.C;
            this.D = source.D;
            this.G = source.G;
            this.H = source.H;
            this.I = source.I;
            this.J = source.J;
            this.K = source.K;
            this.L = source.L;
            this.M = source.M;
            this.N = source.N;
            this.O = source.O;
            this.f2031a0 = source.f2031a0;
            this.f2033b0 = source.f2033b0;
            this.P = source.P;
            this.Q = source.Q;
            this.R = source.R;
            this.T = source.T;
            this.S = source.S;
            this.U = source.U;
            this.V = source.V;
            this.W = source.W;
            this.X = source.X;
            this.Y = source.Y;
            this.Z = source.Z;
            this.f2039e0 = source.f2039e0;
            this.f2041f0 = source.f2041f0;
            this.f2043g0 = source.f2043g0;
            this.f2045h0 = source.f2045h0;
            this.f2053l0 = source.f2053l0;
            this.f2055m0 = source.f2055m0;
            this.f2057n0 = source.f2057n0;
            this.f2059o0 = source.f2059o0;
            this.f2061p0 = source.f2061p0;
            this.f2063q0 = source.f2063q0;
            this.f2065r0 = source.f2065r0;
            this.f2035c0 = source.f2035c0;
            this.f2037d0 = source.f2037d0;
            this.f2073v0 = source.f2073v0;
            this.E = source.E;
            this.F = source.F;
        }

        public String a() {
            return this.f2035c0;
        }

        public y.e b() {
            return this.f2073v0;
        }

        public void c() {
            y.e eVar = this.f2073v0;
            if (eVar != null) {
                eVar.R0();
            }
        }

        public void d(String text) {
            this.f2073v0.j1(text);
        }

        public void e() {
            this.f2045h0 = false;
            this.f2039e0 = true;
            this.f2041f0 = true;
            int i7 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i7 == -2 && this.f2031a0) {
                this.f2039e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i8 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i8 == -2 && this.f2033b0) {
                this.f2041f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i7 == 0 || i7 == -1) {
                this.f2039e0 = false;
                if (i7 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f2031a0 = true;
                }
            }
            if (i8 == 0 || i8 == -1) {
                this.f2041f0 = false;
                if (i8 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f2033b0 = true;
                }
            }
            if (this.f2034c == -1.0f && this.f2030a == -1 && this.f2032b == -1) {
                return;
            }
            this.f2045h0 = true;
            this.f2039e0 = true;
            this.f2041f0 = true;
            if (!(this.f2073v0 instanceof y.h)) {
                this.f2073v0 = new y.h();
            }
            ((y.h) this.f2073v0).B2(this.Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(Context c7, AttributeSet attrs) {
            super(c7, attrs);
            this.f2030a = -1;
            this.f2032b = -1;
            this.f2034c = -1.0f;
            this.f2036d = true;
            this.f2038e = -1;
            this.f2040f = -1;
            this.f2042g = -1;
            this.f2044h = -1;
            this.f2046i = -1;
            this.f2048j = -1;
            this.f2050k = -1;
            this.f2052l = -1;
            this.f2054m = -1;
            this.f2056n = -1;
            this.f2058o = -1;
            this.f2060p = -1;
            this.f2062q = 0;
            this.f2064r = 0.0f;
            this.f2066s = -1;
            this.f2068t = -1;
            this.f2070u = -1;
            this.f2072v = -1;
            this.f2074w = Integer.MIN_VALUE;
            this.f2076x = Integer.MIN_VALUE;
            this.f2077y = Integer.MIN_VALUE;
            this.f2078z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f2031a0 = false;
            this.f2033b0 = false;
            this.f2035c0 = null;
            this.f2037d0 = 0;
            this.f2039e0 = true;
            this.f2041f0 = true;
            this.f2043g0 = false;
            this.f2045h0 = false;
            this.f2047i0 = false;
            this.f2049j0 = false;
            this.f2051k0 = false;
            this.f2053l0 = -1;
            this.f2055m0 = -1;
            this.f2057n0 = -1;
            this.f2059o0 = -1;
            this.f2061p0 = Integer.MIN_VALUE;
            this.f2063q0 = Integer.MIN_VALUE;
            this.f2065r0 = 0.5f;
            this.f2073v0 = new y.e();
            this.f2075w0 = false;
            TypedArray obtainStyledAttributes = c7.obtainStyledAttributes(attrs, k.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                int i8 = a.f2096i0.get(index);
                switch (i8) {
                    case 1:
                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2060p);
                        this.f2060p = resourceId;
                        if (resourceId == -1) {
                            this.f2060p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f2062q = obtainStyledAttributes.getDimensionPixelSize(index, this.f2062q);
                        break;
                    case 4:
                        float f7 = obtainStyledAttributes.getFloat(index, this.f2064r) % 360.0f;
                        this.f2064r = f7;
                        if (f7 < 0.0f) {
                            this.f2064r = (360.0f - f7) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f2030a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2030a);
                        break;
                    case 6:
                        this.f2032b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2032b);
                        break;
                    case 7:
                        this.f2034c = obtainStyledAttributes.getFloat(index, this.f2034c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2038e);
                        this.f2038e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2038e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2040f);
                        this.f2040f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2040f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2042g);
                        this.f2042g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2042g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2044h);
                        this.f2044h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2044h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2046i);
                        this.f2046i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2046i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2048j);
                        this.f2048j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2048j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2050k);
                        this.f2050k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2050k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2052l);
                        this.f2052l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2052l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2054m);
                        this.f2054m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2054m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2066s);
                        this.f2066s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2066s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2068t);
                        this.f2068t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2068t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2070u);
                        this.f2070u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2070u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2072v);
                        this.f2072v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2072v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f2074w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2074w);
                        break;
                    case 22:
                        this.f2076x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2076x);
                        break;
                    case 23:
                        this.f2077y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2077y);
                        break;
                    case 24:
                        this.f2078z = obtainStyledAttributes.getDimensionPixelSize(index, this.f2078z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.f2031a0 = obtainStyledAttributes.getBoolean(index, this.f2031a0);
                        break;
                    case 28:
                        this.f2033b0 = obtainStyledAttributes.getBoolean(index, this.f2033b0);
                        break;
                    case 29:
                        this.G = obtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = obtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        int i9 = obtainStyledAttributes.getInt(index, 0);
                        this.P = i9;
                        if (i9 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i10 = obtainStyledAttributes.getInt(index, 0);
                        this.Q = i10;
                        if (i10 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i8) {
                            case 44:
                                e.C0(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.L = obtainStyledAttributes.getFloat(index, this.L);
                                continue;
                            case 46:
                                this.M = obtainStyledAttributes.getFloat(index, this.M);
                                continue;
                            case 47:
                                this.N = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.O = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                continue;
                            case 50:
                                this.Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                continue;
                            case 51:
                                this.f2035c0 = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f2056n);
                                this.f2056n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f2056n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f2058o);
                                this.f2058o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f2058o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i8) {
                                    case 64:
                                        e.A0(this, obtainStyledAttributes, index, 0);
                                        this.E = true;
                                        continue;
                                    case 65:
                                        e.A0(this, obtainStyledAttributes, index, 1);
                                        this.F = true;
                                        continue;
                                    case 66:
                                        this.f2037d0 = obtainStyledAttributes.getInt(index, this.f2037d0);
                                        continue;
                                    case 67:
                                        this.f2036d = obtainStyledAttributes.getBoolean(index, this.f2036d);
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            e();
        }

        public b(int width, int height) {
            super(width, height);
            this.f2030a = -1;
            this.f2032b = -1;
            this.f2034c = -1.0f;
            this.f2036d = true;
            this.f2038e = -1;
            this.f2040f = -1;
            this.f2042g = -1;
            this.f2044h = -1;
            this.f2046i = -1;
            this.f2048j = -1;
            this.f2050k = -1;
            this.f2052l = -1;
            this.f2054m = -1;
            this.f2056n = -1;
            this.f2058o = -1;
            this.f2060p = -1;
            this.f2062q = 0;
            this.f2064r = 0.0f;
            this.f2066s = -1;
            this.f2068t = -1;
            this.f2070u = -1;
            this.f2072v = -1;
            this.f2074w = Integer.MIN_VALUE;
            this.f2076x = Integer.MIN_VALUE;
            this.f2077y = Integer.MIN_VALUE;
            this.f2078z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f2031a0 = false;
            this.f2033b0 = false;
            this.f2035c0 = null;
            this.f2037d0 = 0;
            this.f2039e0 = true;
            this.f2041f0 = true;
            this.f2043g0 = false;
            this.f2045h0 = false;
            this.f2047i0 = false;
            this.f2049j0 = false;
            this.f2051k0 = false;
            this.f2053l0 = -1;
            this.f2055m0 = -1;
            this.f2057n0 = -1;
            this.f2059o0 = -1;
            this.f2061p0 = Integer.MIN_VALUE;
            this.f2063q0 = Integer.MIN_VALUE;
            this.f2065r0 = 0.5f;
            this.f2073v0 = new y.e();
            this.f2075w0 = false;
        }

        public b(ViewGroup.LayoutParams source) {
            super(source);
            this.f2030a = -1;
            this.f2032b = -1;
            this.f2034c = -1.0f;
            this.f2036d = true;
            this.f2038e = -1;
            this.f2040f = -1;
            this.f2042g = -1;
            this.f2044h = -1;
            this.f2046i = -1;
            this.f2048j = -1;
            this.f2050k = -1;
            this.f2052l = -1;
            this.f2054m = -1;
            this.f2056n = -1;
            this.f2058o = -1;
            this.f2060p = -1;
            this.f2062q = 0;
            this.f2064r = 0.0f;
            this.f2066s = -1;
            this.f2068t = -1;
            this.f2070u = -1;
            this.f2072v = -1;
            this.f2074w = Integer.MIN_VALUE;
            this.f2076x = Integer.MIN_VALUE;
            this.f2077y = Integer.MIN_VALUE;
            this.f2078z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f2031a0 = false;
            this.f2033b0 = false;
            this.f2035c0 = null;
            this.f2037d0 = 0;
            this.f2039e0 = true;
            this.f2041f0 = true;
            this.f2043g0 = false;
            this.f2045h0 = false;
            this.f2047i0 = false;
            this.f2049j0 = false;
            this.f2051k0 = false;
            this.f2053l0 = -1;
            this.f2055m0 = -1;
            this.f2057n0 = -1;
            this.f2059o0 = -1;
            this.f2061p0 = Integer.MIN_VALUE;
            this.f2063q0 = Integer.MIN_VALUE;
            this.f2065r0 = 0.5f;
            this.f2073v0 = new y.e();
            this.f2075w0 = false;
        }
    }
}