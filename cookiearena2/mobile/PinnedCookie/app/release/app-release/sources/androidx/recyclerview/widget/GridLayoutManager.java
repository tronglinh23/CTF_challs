package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h1.f0;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f5005j = false;

    /* renamed from: k  reason: collision with root package name */
    public static final String f5006k = "GridLayoutManager";

    /* renamed from: l  reason: collision with root package name */
    public static final int f5007l = -1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5008a;

    /* renamed from: b  reason: collision with root package name */
    public int f5009b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f5010c;

    /* renamed from: d  reason: collision with root package name */
    public View[] f5011d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseIntArray f5012e;

    /* renamed from: f  reason: collision with root package name */
    public final SparseIntArray f5013f;

    /* renamed from: g  reason: collision with root package name */
    public c f5014g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f5015h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5016i;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i7, int i8) {
            return i7 % i8;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i7) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f5020a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f5021b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        public boolean f5022c = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5023d = false;

        public static int a(SparseIntArray sparseIntArray, int i7) {
            int size = sparseIntArray.size() - 1;
            int i8 = 0;
            while (i8 <= size) {
                int i9 = (i8 + size) >>> 1;
                if (sparseIntArray.keyAt(i9) < i7) {
                    i8 = i9 + 1;
                } else {
                    size = i9 - 1;
                }
            }
            int i10 = i8 - 1;
            if (i10 < 0 || i10 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i10);
        }

        public int b(int i7, int i8) {
            if (this.f5023d) {
                int i9 = this.f5021b.get(i7, -1);
                if (i9 != -1) {
                    return i9;
                }
                int d7 = d(i7, i8);
                this.f5021b.put(i7, d7);
                return d7;
            }
            return d(i7, i8);
        }

        public int c(int i7, int i8) {
            if (this.f5022c) {
                int i9 = this.f5020a.get(i7, -1);
                if (i9 != -1) {
                    return i9;
                }
                int e7 = e(i7, i8);
                this.f5020a.put(i7, e7);
                return e7;
            }
            return e(i7, i8);
        }

        public int d(int i7, int i8) {
            int i9;
            int i10;
            int i11;
            int a7;
            if (!this.f5023d || (a7 = a(this.f5021b, i7)) == -1) {
                i9 = 0;
                i10 = 0;
                i11 = 0;
            } else {
                i9 = this.f5021b.get(a7);
                i10 = a7 + 1;
                i11 = c(a7, i8) + f(a7);
                if (i11 == i8) {
                    i9++;
                    i11 = 0;
                }
            }
            int f7 = f(i7);
            while (i10 < i7) {
                int f8 = f(i10);
                i11 += f8;
                if (i11 == i8) {
                    i9++;
                    i11 = 0;
                } else if (i11 > i8) {
                    i9++;
                    i11 = f8;
                }
                i10++;
            }
            return i11 + f7 > i8 ? i9 + 1 : i9;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f5022c
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f5020a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f5020a
                int r3 = r3.get(r2)
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.e(int, int):int");
        }

        public abstract int f(int i7);

        public void g() {
            this.f5021b.clear();
        }

        public void h() {
            this.f5020a.clear();
        }

        public boolean i() {
            return this.f5023d;
        }

        public boolean j() {
            return this.f5022c;
        }

        public void k(boolean z6) {
            if (!z6) {
                this.f5021b.clear();
            }
            this.f5023d = z6;
        }

        public void l(boolean z6) {
            if (!z6) {
                this.f5021b.clear();
            }
            this.f5022c = z6;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f5008a = false;
        this.f5009b = -1;
        this.f5012e = new SparseIntArray();
        this.f5013f = new SparseIntArray();
        this.f5014g = new a();
        this.f5015h = new Rect();
        d0(RecyclerView.o.getProperties(context, attributeSet, i7, i8).f5120b);
    }

    public static int[] N(int[] iArr, int i7, int i8) {
        int i9;
        if (iArr == null || iArr.length != i7 + 1 || iArr[iArr.length - 1] != i8) {
            iArr = new int[i7 + 1];
        }
        int i10 = 0;
        iArr[0] = 0;
        int i11 = i8 / i7;
        int i12 = i8 % i7;
        int i13 = 0;
        for (int i14 = 1; i14 <= i7; i14++) {
            i10 += i12;
            if (i10 <= 0 || i7 - i10 >= i12) {
                i9 = i11;
            } else {
                i9 = i11 + 1;
                i10 -= i7;
            }
            i13 += i9;
            iArr[i14] = i13;
        }
        return iArr;
    }

    public final void K(RecyclerView.w wVar, RecyclerView.c0 c0Var, int i7, boolean z6) {
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        if (z6) {
            i10 = 1;
            i9 = i7;
            i8 = 0;
        } else {
            i8 = i7 - 1;
            i9 = -1;
            i10 = -1;
        }
        while (i8 != i9) {
            View view = this.f5011d[i8];
            b bVar = (b) view.getLayoutParams();
            int X = X(wVar, c0Var, getPosition(view));
            bVar.f5019f = X;
            bVar.f5018e = i11;
            i11 += X;
            i8 += i10;
        }
    }

    public final void L() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            b bVar = (b) getChildAt(i7).getLayoutParams();
            int b7 = bVar.b();
            this.f5012e.put(b7, bVar.i());
            this.f5013f.put(b7, bVar.h());
        }
    }

    public final void M(int i7) {
        this.f5010c = N(this.f5010c, this.f5009b, i7);
    }

    public final void O() {
        this.f5012e.clear();
        this.f5013f.clear();
    }

    public final int P(RecyclerView.c0 c0Var) {
        if (getChildCount() != 0 && c0Var.d() != 0) {
            ensureLayoutState();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled, true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled, true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                int b7 = this.f5014g.b(getPosition(findFirstVisibleChildClosestToStart), this.f5009b);
                int b8 = this.f5014g.b(getPosition(findFirstVisibleChildClosestToEnd), this.f5009b);
                int max = this.mShouldReverseLayout ? Math.max(0, ((this.f5014g.b(c0Var.d() - 1, this.f5009b) + 1) - Math.max(b7, b8)) - 1) : Math.max(0, Math.min(b7, b8));
                if (isSmoothScrollbarEnabled) {
                    return Math.round((max * (Math.abs(this.mOrientationHelper.d(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.g(findFirstVisibleChildClosestToStart)) / ((this.f5014g.b(getPosition(findFirstVisibleChildClosestToEnd), this.f5009b) - this.f5014g.b(getPosition(findFirstVisibleChildClosestToStart), this.f5009b)) + 1))) + (this.mOrientationHelper.n() - this.mOrientationHelper.g(findFirstVisibleChildClosestToStart)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int Q(RecyclerView.c0 c0Var) {
        if (getChildCount() != 0 && c0Var.d() != 0) {
            ensureLayoutState();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                if (isSmoothScrollbarEnabled()) {
                    int d7 = this.mOrientationHelper.d(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.g(findFirstVisibleChildClosestToStart);
                    int b7 = this.f5014g.b(getPosition(findFirstVisibleChildClosestToStart), this.f5009b);
                    return (int) ((d7 / ((this.f5014g.b(getPosition(findFirstVisibleChildClosestToEnd), this.f5009b) - b7) + 1)) * (this.f5014g.b(c0Var.d() - 1, this.f5009b) + 1));
                }
                return this.f5014g.b(c0Var.d() - 1, this.f5009b) + 1;
            }
        }
        return 0;
    }

    public final void R(RecyclerView.w wVar, RecyclerView.c0 c0Var, LinearLayoutManager.a aVar, int i7) {
        boolean z6 = i7 == 1;
        int W = W(wVar, c0Var, aVar.f5025b);
        if (z6) {
            while (W > 0) {
                int i8 = aVar.f5025b;
                if (i8 <= 0) {
                    return;
                }
                int i9 = i8 - 1;
                aVar.f5025b = i9;
                W = W(wVar, c0Var, i9);
            }
            return;
        }
        int d7 = c0Var.d() - 1;
        int i10 = aVar.f5025b;
        while (i10 < d7) {
            int i11 = i10 + 1;
            int W2 = W(wVar, c0Var, i11);
            if (W2 <= W) {
                break;
            }
            i10 = i11;
            W = W2;
        }
        aVar.f5025b = i10;
    }

    public final void S() {
        View[] viewArr = this.f5011d;
        if (viewArr == null || viewArr.length != this.f5009b) {
            this.f5011d = new View[this.f5009b];
        }
    }

    public int T(int i7, int i8) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f5010c;
            return iArr[i8 + i7] - iArr[i7];
        }
        int[] iArr2 = this.f5010c;
        int i9 = this.f5009b;
        return iArr2[i9 - i7] - iArr2[(i9 - i7) - i8];
    }

    public int U() {
        return this.f5009b;
    }

    public final int V(RecyclerView.w wVar, RecyclerView.c0 c0Var, int i7) {
        if (c0Var.j()) {
            int g7 = wVar.g(i7);
            if (g7 == -1) {
                Log.w(f5006k, "Cannot find span size for pre layout position. " + i7);
                return 0;
            }
            return this.f5014g.b(g7, this.f5009b);
        }
        return this.f5014g.b(i7, this.f5009b);
    }

    public final int W(RecyclerView.w wVar, RecyclerView.c0 c0Var, int i7) {
        if (c0Var.j()) {
            int i8 = this.f5013f.get(i7, -1);
            if (i8 != -1) {
                return i8;
            }
            int g7 = wVar.g(i7);
            if (g7 == -1) {
                Log.w(f5006k, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
                return 0;
            }
            return this.f5014g.c(g7, this.f5009b);
        }
        return this.f5014g.c(i7, this.f5009b);
    }

    public final int X(RecyclerView.w wVar, RecyclerView.c0 c0Var, int i7) {
        if (c0Var.j()) {
            int i8 = this.f5012e.get(i7, -1);
            if (i8 != -1) {
                return i8;
            }
            int g7 = wVar.g(i7);
            if (g7 == -1) {
                Log.w(f5006k, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
                return 1;
            }
            return this.f5014g.f(g7);
        }
        return this.f5014g.f(i7);
    }

    public c Y() {
        return this.f5014g;
    }

    public final void Z(float f7, int i7) {
        M(Math.max(Math.round(f7 * this.f5009b), i7));
    }

    public boolean a0() {
        return this.f5016i;
    }

    public final void b0(View view, int i7, boolean z6) {
        int i8;
        int i9;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f5124b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int T = T(bVar.f5018e, bVar.f5019f);
        if (this.mOrientation == 1) {
            i9 = RecyclerView.o.getChildMeasureSpec(T, i7, i11, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i8 = RecyclerView.o.getChildMeasureSpec(this.mOrientationHelper.o(), getHeightMode(), i10, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int childMeasureSpec = RecyclerView.o.getChildMeasureSpec(T, i7, i10, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int childMeasureSpec2 = RecyclerView.o.getChildMeasureSpec(this.mOrientationHelper.o(), getWidthMode(), i11, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i8 = childMeasureSpec;
            i9 = childMeasureSpec2;
        }
        c0(view, i9, i8, z6);
    }

    public final void c0(View view, int i7, int i8, boolean z6) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z6 ? shouldReMeasureChild(view, i7, i8, pVar) : shouldMeasureChild(view, i7, i8, pVar)) {
            view.measure(i7, i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(RecyclerView.c0 c0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i7 = this.f5009b;
        for (int i8 = 0; i8 < this.f5009b && cVar.c(c0Var) && i7 > 0; i8++) {
            int i9 = cVar.f5043d;
            cVar2.a(i9, Math.max(0, cVar.f5046g));
            i7 -= this.f5014g.f(i9);
            cVar.f5043d += cVar.f5044e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollOffset(RecyclerView.c0 c0Var) {
        return this.f5016i ? P(c0Var) : super.computeHorizontalScrollOffset(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollRange(RecyclerView.c0 c0Var) {
        return this.f5016i ? Q(c0Var) : super.computeHorizontalScrollRange(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollOffset(RecyclerView.c0 c0Var) {
        return this.f5016i ? P(c0Var) : super.computeVerticalScrollOffset(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollRange(RecyclerView.c0 c0Var) {
        return this.f5016i ? Q(c0Var) : super.computeVerticalScrollRange(c0Var);
    }

    public void d0(int i7) {
        if (i7 == this.f5009b) {
            return;
        }
        this.f5008a = true;
        if (i7 >= 1) {
            this.f5009b = i7;
            this.f5014g.h();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i7);
    }

    public void e0(c cVar) {
        this.f5014g = cVar;
    }

    public void f0(boolean z6) {
        this.f5016i = z6;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
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
            if (position >= 0 && position < i9 && W(wVar, c0Var, position) == 0) {
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

    public final void g0() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        M(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getColumnCountForAccessibility(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (this.mOrientation == 1) {
            return this.f5009b;
        }
        if (c0Var.d() < 1) {
            return 0;
        }
        return V(wVar, c0Var, c0Var.d() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getRowCountForAccessibility(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (this.mOrientation == 0) {
            return this.f5009b;
        }
        if (c0Var.d() < 1) {
            return 0;
        }
        return V(wVar, c0Var, c0Var.d() - 1) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.f5030b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void layoutChunk(androidx.recyclerview.widget.RecyclerView.w r18, androidx.recyclerview.widget.RecyclerView.c0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$c0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.w wVar, RecyclerView.c0 c0Var, LinearLayoutManager.a aVar, int i7) {
        super.onAnchorReady(wVar, c0Var, aVar, i7);
        g0();
        if (c0Var.d() > 0 && !c0Var.j()) {
            R(wVar, c0Var, aVar, i7);
        }
        S();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == (r2 > r7)) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.c0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$c0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.w wVar, RecyclerView.c0 c0Var, View view, h1.f0 f0Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, f0Var);
            return;
        }
        b bVar = (b) layoutParams;
        int V = V(wVar, c0Var, bVar.b());
        if (this.mOrientation == 0) {
            f0Var.e1(f0.e.h(bVar.h(), bVar.i(), V, 1, false, false));
        } else {
            f0Var.e1(f0.e.h(V, 1, bVar.h(), bVar.i(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsAdded(RecyclerView recyclerView, int i7, int i8) {
        this.f5014g.h();
        this.f5014g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f5014g.h();
        this.f5014g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsMoved(RecyclerView recyclerView, int i7, int i8, int i9) {
        this.f5014g.h();
        this.f5014g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsRemoved(RecyclerView recyclerView, int i7, int i8) {
        this.f5014g.h();
        this.f5014g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsUpdated(RecyclerView recyclerView, int i7, int i8, Object obj) {
        this.f5014g.h();
        this.f5014g.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (c0Var.j()) {
            L();
        }
        super.onLayoutChildren(wVar, c0Var);
        O();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.c0 c0Var) {
        super.onLayoutCompleted(c0Var);
        this.f5008a = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i7, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        g0();
        S();
        return super.scrollHorizontallyBy(i7, wVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i7, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        g0();
        S();
        return super.scrollVerticallyBy(i7, wVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void setMeasuredDimension(Rect rect, int i7, int i8) {
        int chooseSize;
        int chooseSize2;
        if (this.f5010c == null) {
            super.setMeasuredDimension(rect, i7, i8);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.o.chooseSize(i8, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f5010c;
            chooseSize = RecyclerView.o.chooseSize(i7, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.o.chooseSize(i7, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f5010c;
            chooseSize2 = RecyclerView.o.chooseSize(i8, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z6) {
        if (z6) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f5008a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.p {

        /* renamed from: g  reason: collision with root package name */
        public static final int f5017g = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f5018e;

        /* renamed from: f  reason: collision with root package name */
        public int f5019f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5018e = -1;
            this.f5019f = 0;
        }

        public int h() {
            return this.f5018e;
        }

        public int i() {
            return this.f5019f;
        }

        public b(int i7, int i8) {
            super(i7, i8);
            this.f5018e = -1;
            this.f5019f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5018e = -1;
            this.f5019f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5018e = -1;
            this.f5019f = 0;
        }

        public b(RecyclerView.p pVar) {
            super(pVar);
            this.f5018e = -1;
            this.f5019f = 0;
        }
    }

    public GridLayoutManager(Context context, int i7) {
        super(context);
        this.f5008a = false;
        this.f5009b = -1;
        this.f5012e = new SparseIntArray();
        this.f5013f = new SparseIntArray();
        this.f5014g = new a();
        this.f5015h = new Rect();
        d0(i7);
    }

    public GridLayoutManager(Context context, int i7, int i8, boolean z6) {
        super(context, i8, z6);
        this.f5008a = false;
        this.f5009b = -1;
        this.f5012e = new SparseIntArray();
        this.f5013f = new SparseIntArray();
        this.f5014g = new a();
        this.f5015h = new Rect();
        d0(i7);
    }
}
