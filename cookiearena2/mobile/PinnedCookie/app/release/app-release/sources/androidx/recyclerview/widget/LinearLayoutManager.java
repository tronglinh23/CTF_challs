package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.u0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import d.b1;
import d.o0;
import java.util.List;
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements m.j, RecyclerView.b0.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    int mOrientation;
    w mOrientationHelper;
    d mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public w f5024a;

        /* renamed from: b  reason: collision with root package name */
        public int f5025b;

        /* renamed from: c  reason: collision with root package name */
        public int f5026c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5027d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5028e;

        public a() {
            e();
        }

        public void a() {
            this.f5026c = this.f5027d ? this.f5024a.i() : this.f5024a.n();
        }

        public void b(View view, int i7) {
            if (this.f5027d) {
                this.f5026c = this.f5024a.d(view) + this.f5024a.p();
            } else {
                this.f5026c = this.f5024a.g(view);
            }
            this.f5025b = i7;
        }

        public void c(View view, int i7) {
            int p6 = this.f5024a.p();
            if (p6 >= 0) {
                b(view, i7);
                return;
            }
            this.f5025b = i7;
            if (this.f5027d) {
                int i8 = (this.f5024a.i() - p6) - this.f5024a.d(view);
                this.f5026c = this.f5024a.i() - i8;
                if (i8 > 0) {
                    int e7 = this.f5026c - this.f5024a.e(view);
                    int n7 = this.f5024a.n();
                    int min = e7 - (n7 + Math.min(this.f5024a.g(view) - n7, 0));
                    if (min < 0) {
                        this.f5026c += Math.min(i8, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g7 = this.f5024a.g(view);
            int n8 = g7 - this.f5024a.n();
            this.f5026c = g7;
            if (n8 > 0) {
                int i9 = (this.f5024a.i() - Math.min(0, (this.f5024a.i() - p6) - this.f5024a.d(view))) - (g7 + this.f5024a.e(view));
                if (i9 < 0) {
                    this.f5026c -= Math.min(n8, -i9);
                }
            }
        }

        public boolean d(View view, RecyclerView.c0 c0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.e() && pVar.b() >= 0 && pVar.b() < c0Var.d();
        }

        public void e() {
            this.f5025b = -1;
            this.f5026c = Integer.MIN_VALUE;
            this.f5027d = false;
            this.f5028e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f5025b + ", mCoordinate=" + this.f5026c + ", mLayoutFromEnd=" + this.f5027d + ", mValid=" + this.f5028e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f5029a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5030b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5031c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5032d;

        public void a() {
            this.f5029a = 0;
            this.f5030b = false;
            this.f5031c = false;
            this.f5032d = false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: n  reason: collision with root package name */
        public static final String f5033n = "LLM#LayoutState";

        /* renamed from: o  reason: collision with root package name */
        public static final int f5034o = -1;

        /* renamed from: p  reason: collision with root package name */
        public static final int f5035p = 1;

        /* renamed from: q  reason: collision with root package name */
        public static final int f5036q = Integer.MIN_VALUE;

        /* renamed from: r  reason: collision with root package name */
        public static final int f5037r = -1;

        /* renamed from: s  reason: collision with root package name */
        public static final int f5038s = 1;

        /* renamed from: t  reason: collision with root package name */
        public static final int f5039t = Integer.MIN_VALUE;

        /* renamed from: b  reason: collision with root package name */
        public int f5041b;

        /* renamed from: c  reason: collision with root package name */
        public int f5042c;

        /* renamed from: d  reason: collision with root package name */
        public int f5043d;

        /* renamed from: e  reason: collision with root package name */
        public int f5044e;

        /* renamed from: f  reason: collision with root package name */
        public int f5045f;

        /* renamed from: g  reason: collision with root package name */
        public int f5046g;

        /* renamed from: k  reason: collision with root package name */
        public int f5050k;

        /* renamed from: m  reason: collision with root package name */
        public boolean f5052m;

        /* renamed from: a  reason: collision with root package name */
        public boolean f5040a = true;

        /* renamed from: h  reason: collision with root package name */
        public int f5047h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f5048i = 0;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5049j = false;

        /* renamed from: l  reason: collision with root package name */
        public List<RecyclerView.f0> f5051l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View g7 = g(view);
            if (g7 == null) {
                this.f5043d = -1;
            } else {
                this.f5043d = ((RecyclerView.p) g7.getLayoutParams()).b();
            }
        }

        public boolean c(RecyclerView.c0 c0Var) {
            int i7 = this.f5043d;
            return i7 >= 0 && i7 < c0Var.d();
        }

        public void d() {
            StringBuilder sb = new StringBuilder();
            sb.append("avail:");
            sb.append(this.f5042c);
            sb.append(", ind:");
            sb.append(this.f5043d);
            sb.append(", dir:");
            sb.append(this.f5044e);
            sb.append(", offset:");
            sb.append(this.f5041b);
            sb.append(", layoutDir:");
            sb.append(this.f5045f);
        }

        public View e(RecyclerView.w wVar) {
            if (this.f5051l != null) {
                return f();
            }
            View p6 = wVar.p(this.f5043d);
            this.f5043d += this.f5044e;
            return p6;
        }

        public final View f() {
            int size = this.f5051l.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = this.f5051l.get(i7).itemView;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.e() && this.f5043d == pVar.b()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View g(View view) {
            int b7;
            int size = this.f5051l.size();
            View view2 = null;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < size; i8++) {
                View view3 = this.f5051l.get(i8).itemView;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.e() && (b7 = (pVar.b() - this.f5043d) * this.f5044e) >= 0 && b7 < i7) {
                    view2 = view3;
                    if (b7 == 0) {
                        break;
                    }
                    i7 = b7;
                }
            }
            return view2;
        }
    }

    @b1({b1.a.LIBRARY})
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public int f5053k;

        /* renamed from: l  reason: collision with root package name */
        public int f5054l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f5055m;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<d> {
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

        public d() {
        }

        public boolean a() {
            return this.f5053k >= 0;
        }

        public void b() {
            this.f5053k = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f5053k);
            parcel.writeInt(this.f5054l);
            parcel.writeInt(this.f5055m ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.f5053k = parcel.readInt();
            this.f5054l = parcel.readInt();
            this.f5055m = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f5053k = dVar.f5053k;
            this.f5054l = dVar.f5054l;
            this.f5055m = dVar.f5055m;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public final void A(RecyclerView.w wVar, int i7, int i8) {
        if (i7 < 0) {
            return;
        }
        int i9 = i7 - i8;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (this.mOrientationHelper.d(childAt) > i9 || this.mOrientationHelper.q(childAt) > i9) {
                    y(wVar, 0, i10);
                    return;
                }
            }
            return;
        }
        int i11 = childCount - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            if (this.mOrientationHelper.d(childAt2) > i9 || this.mOrientationHelper.q(childAt2) > i9) {
                y(wVar, i11, i12);
                return;
            }
        }
    }

    public final void B() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public final boolean C(RecyclerView.w wVar, RecyclerView.c0 c0Var, a aVar) {
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.d(focusedChild, c0Var)) {
            aVar.c(focusedChild, getPosition(focusedChild));
            return true;
        } else if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        } else {
            View p6 = aVar.f5027d ? p(wVar, c0Var) : q(wVar, c0Var);
            if (p6 != null) {
                aVar.b(p6, getPosition(p6));
                if (!c0Var.j() && supportsPredictiveItemAnimations()) {
                    if (this.mOrientationHelper.g(p6) >= this.mOrientationHelper.i() || this.mOrientationHelper.d(p6) < this.mOrientationHelper.n()) {
                        aVar.f5026c = aVar.f5027d ? this.mOrientationHelper.i() : this.mOrientationHelper.n();
                    }
                }
                return true;
            }
            return false;
        }
    }

    public final boolean D(RecyclerView.c0 c0Var, a aVar) {
        int i7;
        if (!c0Var.j() && (i7 = this.mPendingScrollPosition) != -1) {
            if (i7 >= 0 && i7 < c0Var.d()) {
                aVar.f5025b = this.mPendingScrollPosition;
                d dVar = this.mPendingSavedState;
                if (dVar != null && dVar.a()) {
                    boolean z6 = this.mPendingSavedState.f5055m;
                    aVar.f5027d = z6;
                    if (z6) {
                        aVar.f5026c = this.mOrientationHelper.i() - this.mPendingSavedState.f5054l;
                    } else {
                        aVar.f5026c = this.mOrientationHelper.n() + this.mPendingSavedState.f5054l;
                    }
                    return true;
                } else if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z7 = this.mShouldReverseLayout;
                    aVar.f5027d = z7;
                    if (z7) {
                        aVar.f5026c = this.mOrientationHelper.i() - this.mPendingScrollPositionOffset;
                    } else {
                        aVar.f5026c = this.mOrientationHelper.n() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                } else {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition == null) {
                        if (getChildCount() > 0) {
                            aVar.f5027d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                        }
                        aVar.a();
                    } else if (this.mOrientationHelper.e(findViewByPosition) > this.mOrientationHelper.o()) {
                        aVar.a();
                        return true;
                    } else if (this.mOrientationHelper.g(findViewByPosition) - this.mOrientationHelper.n() < 0) {
                        aVar.f5026c = this.mOrientationHelper.n();
                        aVar.f5027d = false;
                        return true;
                    } else if (this.mOrientationHelper.i() - this.mOrientationHelper.d(findViewByPosition) < 0) {
                        aVar.f5026c = this.mOrientationHelper.i();
                        aVar.f5027d = true;
                        return true;
                    } else {
                        aVar.f5026c = aVar.f5027d ? this.mOrientationHelper.d(findViewByPosition) + this.mOrientationHelper.p() : this.mOrientationHelper.g(findViewByPosition);
                    }
                    return true;
                }
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void E(RecyclerView.w wVar, RecyclerView.c0 c0Var, a aVar) {
        if (D(c0Var, aVar) || C(wVar, c0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f5025b = this.mStackFromEnd ? c0Var.d() - 1 : 0;
    }

    public final void F(int i7, int i8, boolean z6, RecyclerView.c0 c0Var) {
        int n7;
        this.mLayoutState.f5052m = resolveIsInfinite();
        this.mLayoutState.f5045f = i7;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0Var, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z7 = i7 == 1;
        c cVar = this.mLayoutState;
        int i9 = z7 ? max2 : max;
        cVar.f5047h = i9;
        if (!z7) {
            max = max2;
        }
        cVar.f5048i = max;
        if (z7) {
            cVar.f5047h = i9 + this.mOrientationHelper.j();
            View t6 = t();
            c cVar2 = this.mLayoutState;
            cVar2.f5044e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(t6);
            c cVar3 = this.mLayoutState;
            cVar2.f5043d = position + cVar3.f5044e;
            cVar3.f5041b = this.mOrientationHelper.d(t6);
            n7 = this.mOrientationHelper.d(t6) - this.mOrientationHelper.i();
        } else {
            View u6 = u();
            this.mLayoutState.f5047h += this.mOrientationHelper.n();
            c cVar4 = this.mLayoutState;
            cVar4.f5044e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(u6);
            c cVar5 = this.mLayoutState;
            cVar4.f5043d = position2 + cVar5.f5044e;
            cVar5.f5041b = this.mOrientationHelper.g(u6);
            n7 = (-this.mOrientationHelper.g(u6)) + this.mOrientationHelper.n();
        }
        c cVar6 = this.mLayoutState;
        cVar6.f5042c = i8;
        if (z6) {
            cVar6.f5042c = i8 - n7;
        }
        cVar6.f5046g = n7;
    }

    public final void G(int i7, int i8) {
        this.mLayoutState.f5042c = this.mOrientationHelper.i() - i8;
        c cVar = this.mLayoutState;
        cVar.f5044e = this.mShouldReverseLayout ? -1 : 1;
        cVar.f5043d = i7;
        cVar.f5045f = 1;
        cVar.f5041b = i8;
        cVar.f5046g = Integer.MIN_VALUE;
    }

    public final void H(a aVar) {
        G(aVar.f5025b, aVar.f5026c);
    }

    public final void I(int i7, int i8) {
        this.mLayoutState.f5042c = i8 - this.mOrientationHelper.n();
        c cVar = this.mLayoutState;
        cVar.f5043d = i7;
        cVar.f5044e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f5045f = -1;
        cVar.f5041b = i8;
        cVar.f5046g = Integer.MIN_VALUE;
    }

    public final void J(a aVar) {
        I(aVar.f5025b, aVar.f5026c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@o0 RecyclerView.c0 c0Var, @o0 int[] iArr) {
        int i7;
        int extraLayoutSpace = getExtraLayoutSpace(c0Var);
        if (this.mLayoutState.f5045f == -1) {
            i7 = 0;
        } else {
            i7 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void collectAdjacentPrefetchPositions(int i7, int i8, RecyclerView.c0 c0Var, RecyclerView.o.c cVar) {
        if (this.mOrientation != 0) {
            i7 = i8;
        }
        if (getChildCount() == 0 || i7 == 0) {
            return;
        }
        ensureLayoutState();
        F(i7 > 0 ? 1 : -1, Math.abs(i7), true, c0Var);
        collectPrefetchPositionsForLayoutState(c0Var, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void collectInitialPrefetchPositions(int i7, RecyclerView.o.c cVar) {
        boolean z6;
        int i8;
        d dVar = this.mPendingSavedState;
        if (dVar == null || !dVar.a()) {
            B();
            z6 = this.mShouldReverseLayout;
            i8 = this.mPendingScrollPosition;
            if (i8 == -1) {
                i8 = z6 ? i7 - 1 : 0;
            }
        } else {
            d dVar2 = this.mPendingSavedState;
            z6 = dVar2.f5055m;
            i8 = dVar2.f5053k;
        }
        int i9 = z6 ? -1 : 1;
        for (int i10 = 0; i10 < this.mInitialPrefetchItemCount && i8 >= 0 && i8 < i7; i10++) {
            cVar.a(i8, 0);
            i8 += i9;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.c0 c0Var, c cVar, RecyclerView.o.c cVar2) {
        int i7 = cVar.f5043d;
        if (i7 < 0 || i7 >= c0Var.d()) {
            return;
        }
        cVar2.a(i7, Math.max(0, cVar.f5046g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollExtent(RecyclerView.c0 c0Var) {
        return g(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollOffset(RecyclerView.c0 c0Var) {
        return h(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollRange(RecyclerView.c0 c0Var) {
        return i(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    public PointF computeScrollVectorForPosition(int i7) {
        if (getChildCount() == 0) {
            return null;
        }
        int i8 = (i7 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i8, 0.0f) : new PointF(0.0f, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollExtent(RecyclerView.c0 c0Var) {
        return g(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollOffset(RecyclerView.c0 c0Var) {
        return h(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollRange(RecyclerView.c0 c0Var) {
        return i(c0Var);
    }

    public int convertFocusDirectionToLayoutDirection(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 17 ? i7 != 33 ? i7 != 66 ? (i7 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public c createLayoutState() {
        return new c();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.w wVar, c cVar, RecyclerView.c0 c0Var, boolean z6) {
        int i7 = cVar.f5042c;
        int i8 = cVar.f5046g;
        if (i8 != Integer.MIN_VALUE) {
            if (i7 < 0) {
                cVar.f5046g = i8 + i7;
            }
            x(wVar, cVar);
        }
        int i9 = cVar.f5042c + cVar.f5047h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f5052m && i9 <= 0) || !cVar.c(c0Var)) {
                break;
            }
            bVar.a();
            layoutChunk(wVar, c0Var, cVar, bVar);
            if (!bVar.f5030b) {
                cVar.f5041b += bVar.f5029a * cVar.f5045f;
                if (!bVar.f5031c || cVar.f5051l != null || !c0Var.j()) {
                    int i10 = cVar.f5042c;
                    int i11 = bVar.f5029a;
                    cVar.f5042c = i10 - i11;
                    i9 -= i11;
                }
                int i12 = cVar.f5046g;
                if (i12 != Integer.MIN_VALUE) {
                    int i13 = i12 + bVar.f5029a;
                    cVar.f5046g = i13;
                    int i14 = cVar.f5042c;
                    if (i14 < 0) {
                        cVar.f5046g = i13 + i14;
                    }
                    x(wVar, cVar);
                }
                if (z6 && bVar.f5032d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i7 - cVar.f5042c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z6, boolean z7) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z6, z7) : findOneVisibleChild(getChildCount() - 1, -1, z6, z7);
    }

    public View findFirstVisibleChildClosestToStart(boolean z6, boolean z7) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z6, z7) : findOneVisibleChild(0, getChildCount(), z6, z7);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i7, int i8) {
        int i9;
        int i10;
        ensureLayoutState();
        if ((i8 > i7 ? (char) 1 : i8 < i7 ? (char) 65535 : (char) 0) == 0) {
            return getChildAt(i7);
        }
        if (this.mOrientationHelper.g(getChildAt(i7)) < this.mOrientationHelper.n()) {
            i9 = 16644;
            i10 = 16388;
        } else {
            i9 = 4161;
            i10 = u0.I;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i7, i8, i9, i10) : this.mVerticalBoundCheck.a(i7, i8, i9, i10);
    }

    public View findOneVisibleChild(int i7, int i8, boolean z6, boolean z7) {
        ensureLayoutState();
        int i9 = z6 ? 24579 : 320;
        int i10 = z7 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i7, i8, i9, i10) : this.mVerticalBoundCheck.a(i7, i8, i9, i10);
    }

    public View findReferenceChild(RecyclerView.w wVar, RecyclerView.c0 c0Var, int i7, int i8, int i9) {
        ensureLayoutState();
        int n7 = this.mOrientationHelper.n();
        int i10 = this.mOrientationHelper.i();
        int i11 = i8 > i7 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i7 != i8) {
            View childAt = getChildAt(i7);
            int position = getPosition(childAt);
            if (position >= 0 && position < i9) {
                if (((RecyclerView.p) childAt.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.g(childAt) < i10 && this.mOrientationHelper.d(childAt) >= n7) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i7 += i11;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View findViewByPosition(int i7) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i7 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i7) {
                return childAt;
            }
        }
        return super.findViewByPosition(i7);
    }

    public final int g(RecyclerView.c0 c0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return z.a(c0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.c0 c0Var) {
        if (c0Var.h()) {
            return this.mOrientationHelper.o();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public final int h(RecyclerView.c0 c0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return z.b(c0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public final int i(RecyclerView.c0 c0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return z.c(c0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public final View j() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    public final View k(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return findReferenceChild(wVar, c0Var, 0, getChildCount(), c0Var.d());
    }

    public final View l() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    public void layoutChunk(RecyclerView.w wVar, RecyclerView.c0 c0Var, c cVar, b bVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        int f7;
        View e7 = cVar.e(wVar);
        if (e7 == null) {
            bVar.f5030b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) e7.getLayoutParams();
        if (cVar.f5051l == null) {
            if (this.mShouldReverseLayout == (cVar.f5045f == -1)) {
                addView(e7);
            } else {
                addView(e7, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f5045f == -1)) {
                addDisappearingView(e7);
            } else {
                addDisappearingView(e7, 0);
            }
        }
        measureChildWithMargins(e7, 0, 0);
        bVar.f5029a = this.mOrientationHelper.e(e7);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                f7 = getWidth() - getPaddingRight();
                i10 = f7 - this.mOrientationHelper.f(e7);
            } else {
                i10 = getPaddingLeft();
                f7 = this.mOrientationHelper.f(e7) + i10;
            }
            if (cVar.f5045f == -1) {
                int i11 = cVar.f5041b;
                i9 = i11;
                i8 = f7;
                i7 = i11 - bVar.f5029a;
            } else {
                int i12 = cVar.f5041b;
                i7 = i12;
                i8 = f7;
                i9 = bVar.f5029a + i12;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f8 = this.mOrientationHelper.f(e7) + paddingTop;
            if (cVar.f5045f == -1) {
                int i13 = cVar.f5041b;
                i8 = i13;
                i7 = paddingTop;
                i9 = f8;
                i10 = i13 - bVar.f5029a;
            } else {
                int i14 = cVar.f5041b;
                i7 = paddingTop;
                i8 = bVar.f5029a + i14;
                i9 = f8;
                i10 = i14;
            }
        }
        layoutDecoratedWithMargins(e7, i10, i7, i8, i9);
        if (pVar.e() || pVar.d()) {
            bVar.f5031c = true;
        }
        bVar.f5032d = e7.hasFocusable();
    }

    public final View m(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return findReferenceChild(wVar, c0Var, getChildCount() - 1, -1, c0Var.d());
    }

    public final View n() {
        return this.mShouldReverseLayout ? j() : l();
    }

    public final View o() {
        return this.mShouldReverseLayout ? l() : j();
    }

    public void onAnchorReady(RecyclerView.w wVar, RecyclerView.c0 c0Var, a aVar, int i7) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.onDetachedFromWindow(recyclerView, wVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(wVar);
            wVar.d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View onFocusSearchFailed(View view, int i7, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        int convertFocusDirectionToLayoutDirection;
        B();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i7)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        F(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.o() * 0.33333334f), false, c0Var);
        c cVar = this.mLayoutState;
        cVar.f5046g = Integer.MIN_VALUE;
        cVar.f5040a = false;
        fill(wVar, cVar, c0Var, true);
        View o6 = convertFocusDirectionToLayoutDirection == -1 ? o() : n();
        View u6 = convertFocusDirectionToLayoutDirection == -1 ? u() : t();
        if (u6.hasFocusable()) {
            if (o6 == null) {
                return null;
            }
            return u6;
        }
        return o6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        int i7;
        int i8;
        int i9;
        int i10;
        int r6;
        int i11;
        View findViewByPosition;
        int g7;
        int i12;
        int i13 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && c0Var.d() == 0) {
            removeAndRecycleAllViews(wVar);
            return;
        }
        d dVar = this.mPendingSavedState;
        if (dVar != null && dVar.a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f5053k;
        }
        ensureLayoutState();
        this.mLayoutState.f5040a = false;
        B();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (!aVar.f5028e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            aVar.e();
            a aVar2 = this.mAnchorInfo;
            aVar2.f5027d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            E(wVar, c0Var, aVar2);
            this.mAnchorInfo.f5028e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.g(focusedChild) >= this.mOrientationHelper.i() || this.mOrientationHelper.d(focusedChild) <= this.mOrientationHelper.n())) {
            this.mAnchorInfo.c(focusedChild, getPosition(focusedChild));
        }
        c cVar = this.mLayoutState;
        cVar.f5045f = cVar.f5050k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0Var, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.n();
        int max2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.j();
        if (c0Var.j() && (i11 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i11)) != null) {
            if (this.mShouldReverseLayout) {
                i12 = this.mOrientationHelper.i() - this.mOrientationHelper.d(findViewByPosition);
                g7 = this.mPendingScrollPositionOffset;
            } else {
                g7 = this.mOrientationHelper.g(findViewByPosition) - this.mOrientationHelper.n();
                i12 = this.mPendingScrollPositionOffset;
            }
            int i14 = i12 - g7;
            if (i14 > 0) {
                max += i14;
            } else {
                max2 -= i14;
            }
        }
        a aVar3 = this.mAnchorInfo;
        if (!aVar3.f5027d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i13 = 1;
        }
        onAnchorReady(wVar, c0Var, aVar3, i13);
        detachAndScrapAttachedViews(wVar);
        this.mLayoutState.f5052m = resolveIsInfinite();
        this.mLayoutState.f5049j = c0Var.j();
        this.mLayoutState.f5048i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.f5027d) {
            J(aVar4);
            c cVar2 = this.mLayoutState;
            cVar2.f5047h = max;
            fill(wVar, cVar2, c0Var, false);
            c cVar3 = this.mLayoutState;
            i8 = cVar3.f5041b;
            int i15 = cVar3.f5043d;
            int i16 = cVar3.f5042c;
            if (i16 > 0) {
                max2 += i16;
            }
            H(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.f5047h = max2;
            cVar4.f5043d += cVar4.f5044e;
            fill(wVar, cVar4, c0Var, false);
            c cVar5 = this.mLayoutState;
            i7 = cVar5.f5041b;
            int i17 = cVar5.f5042c;
            if (i17 > 0) {
                I(i15, i8);
                c cVar6 = this.mLayoutState;
                cVar6.f5047h = i17;
                fill(wVar, cVar6, c0Var, false);
                i8 = this.mLayoutState.f5041b;
            }
        } else {
            H(aVar4);
            c cVar7 = this.mLayoutState;
            cVar7.f5047h = max2;
            fill(wVar, cVar7, c0Var, false);
            c cVar8 = this.mLayoutState;
            i7 = cVar8.f5041b;
            int i18 = cVar8.f5043d;
            int i19 = cVar8.f5042c;
            if (i19 > 0) {
                max += i19;
            }
            J(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.f5047h = max;
            cVar9.f5043d += cVar9.f5044e;
            fill(wVar, cVar9, c0Var, false);
            c cVar10 = this.mLayoutState;
            i8 = cVar10.f5041b;
            int i20 = cVar10.f5042c;
            if (i20 > 0) {
                G(i18, i7);
                c cVar11 = this.mLayoutState;
                cVar11.f5047h = i20;
                fill(wVar, cVar11, c0Var, false);
                i7 = this.mLayoutState.f5041b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int r7 = r(i7, wVar, c0Var, true);
                i9 = i8 + r7;
                i10 = i7 + r7;
                r6 = s(i9, wVar, c0Var, false);
            } else {
                int s6 = s(i8, wVar, c0Var, true);
                i9 = i8 + s6;
                i10 = i7 + s6;
                r6 = r(i10, wVar, c0Var, false);
            }
            i8 = i9 + r6;
            i7 = i10 + r6;
        }
        v(wVar, c0Var, i8, i7);
        if (c0Var.j()) {
            this.mAnchorInfo.e();
        } else {
            this.mOrientationHelper.u();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.c0 c0Var) {
        super.onLayoutCompleted(c0Var);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.mPendingSavedState = (d) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new d(this.mPendingSavedState);
        }
        d dVar = new d();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z6 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            dVar.f5055m = z6;
            if (z6) {
                View t6 = t();
                dVar.f5054l = this.mOrientationHelper.i() - this.mOrientationHelper.d(t6);
                dVar.f5053k = getPosition(t6);
            } else {
                View u6 = u();
                dVar.f5053k = getPosition(u6);
                dVar.f5054l = this.mOrientationHelper.g(u6) - this.mOrientationHelper.n();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    public final View p(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return this.mShouldReverseLayout ? k(wVar, c0Var) : m(wVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.m.j
    public void prepareForDrop(@o0 View view, @o0 View view2, int i7, int i8) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        B();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        boolean z6 = position < position2 ? true : true;
        if (this.mShouldReverseLayout) {
            if (z6) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - (this.mOrientationHelper.g(view2) + this.mOrientationHelper.e(view)));
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - this.mOrientationHelper.d(view2));
            }
        } else if (z6) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.g(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.d(view2) - this.mOrientationHelper.e(view));
        }
    }

    public final View q(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return this.mShouldReverseLayout ? m(wVar, c0Var) : k(wVar, c0Var);
    }

    public final int r(int i7, RecyclerView.w wVar, RecyclerView.c0 c0Var, boolean z6) {
        int i8;
        int i9 = this.mOrientationHelper.i() - i7;
        if (i9 > 0) {
            int i10 = -scrollBy(-i9, wVar, c0Var);
            int i11 = i7 + i10;
            if (!z6 || (i8 = this.mOrientationHelper.i() - i11) <= 0) {
                return i10;
            }
            this.mOrientationHelper.t(i8);
            return i8 + i10;
        }
        return 0;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.l() == 0 && this.mOrientationHelper.h() == 0;
    }

    public final int s(int i7, RecyclerView.w wVar, RecyclerView.c0 c0Var, boolean z6) {
        int n7;
        int n8 = i7 - this.mOrientationHelper.n();
        if (n8 > 0) {
            int i8 = -scrollBy(n8, wVar, c0Var);
            int i9 = i7 + i8;
            if (!z6 || (n7 = i9 - this.mOrientationHelper.n()) <= 0) {
                return i8;
            }
            this.mOrientationHelper.t(-n7);
            return i8 - n7;
        }
        return 0;
    }

    public int scrollBy(int i7, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (getChildCount() == 0 || i7 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f5040a = true;
        int i8 = i7 > 0 ? 1 : -1;
        int abs = Math.abs(i7);
        F(i8, abs, true, c0Var);
        c cVar = this.mLayoutState;
        int fill = cVar.f5046g + fill(wVar, cVar, c0Var, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i7 = i8 * fill;
        }
        this.mOrientationHelper.t(-i7);
        this.mLayoutState.f5050k = i7;
        return i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i7, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i7, wVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void scrollToPosition(int i7) {
        this.mPendingScrollPosition = i7;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            dVar.b();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i7, int i8) {
        this.mPendingScrollPosition = i7;
        this.mPendingScrollPositionOffset = i8;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            dVar.b();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i7, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i7, wVar, c0Var);
    }

    public void setInitialPrefetchItemCount(int i7) {
        this.mInitialPrefetchItemCount = i7;
    }

    public void setOrientation(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i7);
        }
        assertNotInLayoutOrScroll(null);
        if (i7 != this.mOrientation || this.mOrientationHelper == null) {
            w b7 = w.b(this, i7);
            this.mOrientationHelper = b7;
            this.mAnchorInfo.f5024a = b7;
            this.mOrientation = i7;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z6) {
        this.mRecycleChildrenOnDetach = z6;
    }

    public void setReverseLayout(boolean z6) {
        assertNotInLayoutOrScroll(null);
        if (z6 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z6;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z6) {
        this.mSmoothScrollbarEnabled = z6;
    }

    public void setStackFromEnd(boolean z6) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z6) {
            return;
        }
        this.mStackFromEnd = z6;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i7) {
        q qVar = new q(recyclerView.getContext());
        qVar.setTargetPosition(i7);
        startSmoothScroll(qVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public final View t() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    public final View u() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    public final void v(RecyclerView.w wVar, RecyclerView.c0 c0Var, int i7, int i8) {
        if (!c0Var.n() || getChildCount() == 0 || c0Var.j() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.f0> l7 = wVar.l();
        int size = l7.size();
        int position = getPosition(getChildAt(0));
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView.f0 f0Var = l7.get(i11);
            if (!f0Var.isRemoved()) {
                if ((f0Var.getLayoutPosition() < position) != this.mShouldReverseLayout ? true : true) {
                    i9 += this.mOrientationHelper.e(f0Var.itemView);
                } else {
                    i10 += this.mOrientationHelper.e(f0Var.itemView);
                }
            }
        }
        this.mLayoutState.f5051l = l7;
        if (i9 > 0) {
            I(getPosition(u()), i7);
            c cVar = this.mLayoutState;
            cVar.f5047h = i9;
            cVar.f5042c = 0;
            cVar.a();
            fill(wVar, this.mLayoutState, c0Var, false);
        }
        if (i10 > 0) {
            G(getPosition(t()), i8);
            c cVar2 = this.mLayoutState;
            cVar2.f5047h = i10;
            cVar2.f5042c = 0;
            cVar2.a();
            fill(wVar, this.mLayoutState, c0Var, false);
        }
        this.mLayoutState.f5051l = null;
    }

    public void validateChildOrder() {
        StringBuilder sb = new StringBuilder();
        sb.append("validating child count ");
        sb.append(getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int g7 = this.mOrientationHelper.g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i7 = 1; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                int position2 = getPosition(childAt);
                int g8 = this.mOrientationHelper.g(childAt);
                if (position2 < position) {
                    w();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("detected invalid position. loc invalid? ");
                    sb2.append(g8 < g7);
                    throw new RuntimeException(sb2.toString());
                } else if (g8 > g7) {
                    w();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i8 = 1; i8 < getChildCount(); i8++) {
            View childAt2 = getChildAt(i8);
            int position3 = getPosition(childAt2);
            int g9 = this.mOrientationHelper.g(childAt2);
            if (position3 < position) {
                w();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("detected invalid position. loc invalid? ");
                sb3.append(g9 < g7);
                throw new RuntimeException(sb3.toString());
            } else if (g9 < g7) {
                w();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public final void w() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            StringBuilder sb = new StringBuilder();
            sb.append("item ");
            sb.append(getPosition(childAt));
            sb.append(", coord:");
            sb.append(this.mOrientationHelper.g(childAt));
        }
    }

    public final void x(RecyclerView.w wVar, c cVar) {
        if (!cVar.f5040a || cVar.f5052m) {
            return;
        }
        int i7 = cVar.f5046g;
        int i8 = cVar.f5048i;
        if (cVar.f5045f == -1) {
            z(wVar, i7, i8);
        } else {
            A(wVar, i7, i8);
        }
    }

    public final void y(RecyclerView.w wVar, int i7, int i8) {
        if (i7 == i8) {
            return;
        }
        if (i8 <= i7) {
            while (i7 > i8) {
                removeAndRecycleViewAt(i7, wVar);
                i7--;
            }
            return;
        }
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            removeAndRecycleViewAt(i9, wVar);
        }
    }

    public final void z(RecyclerView.w wVar, int i7, int i8) {
        int childCount = getChildCount();
        if (i7 < 0) {
            return;
        }
        int h7 = (this.mOrientationHelper.h() - i7) + i8;
        if (this.mShouldReverseLayout) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (this.mOrientationHelper.g(childAt) < h7 || this.mOrientationHelper.r(childAt) < h7) {
                    y(wVar, 0, i9);
                    return;
                }
            }
            return;
        }
        int i10 = childCount - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            View childAt2 = getChildAt(i11);
            if (this.mOrientationHelper.g(childAt2) < h7 || this.mOrientationHelper.r(childAt2) < h7) {
                y(wVar, i10, i11);
                return;
            }
        }
    }

    public LinearLayoutManager(Context context, int i7, boolean z6) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i7);
        setReverseLayout(z6);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i7, i8);
        setOrientation(properties.f5119a);
        setReverseLayout(properties.f5121c);
        setStackFromEnd(properties.f5122d);
    }
}
