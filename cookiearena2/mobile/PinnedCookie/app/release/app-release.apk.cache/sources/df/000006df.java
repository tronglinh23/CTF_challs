package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d.o0;
import d.q0;

/* loaded from: classes.dex */
public class x extends b0 {

    /* renamed from: g  reason: collision with root package name */
    public static final int f5632g = 100;
    @q0

    /* renamed from: e  reason: collision with root package name */
    public w f5633e;
    @q0

    /* renamed from: f  reason: collision with root package name */
    public w f5634f;

    /* loaded from: classes.dex */
    public class a extends q {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.q
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.q
        public int calculateTimeForScrolling(int i7) {
            return Math.min(100, super.calculateTimeForScrolling(i7));
        }

        @Override // androidx.recyclerview.widget.q, androidx.recyclerview.widget.RecyclerView.b0
        public void onTargetFound(View view, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
            x xVar = x.this;
            int[] c7 = xVar.c(xVar.f5233a.getLayoutManager(), view);
            int i7 = c7[0];
            int i8 = c7[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i7), Math.abs(i8)));
            if (calculateTimeForDeceleration > 0) {
                aVar.l(i7, i8, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    @Override // androidx.recyclerview.widget.b0
    @q0
    public int[] c(@o0 RecyclerView.o oVar, @o0 View view) {
        int[] iArr = new int[2];
        if (oVar.canScrollHorizontally()) {
            iArr[0] = m(oVar, view, o(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.canScrollVertically()) {
            iArr[1] = m(oVar, view, q(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.b0
    public q f(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.b0.b) {
            return new a(this.f5233a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.b0
    @q0
    public View h(RecyclerView.o oVar) {
        if (oVar.canScrollVertically()) {
            return n(oVar, q(oVar));
        }
        if (oVar.canScrollHorizontally()) {
            return n(oVar, o(oVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.b0
    public int i(RecyclerView.o oVar, int i7, int i8) {
        w p6;
        int itemCount = oVar.getItemCount();
        if (itemCount == 0 || (p6 = p(oVar)) == null) {
            return -1;
        }
        int childCount = oVar.getChildCount();
        View view = null;
        int i9 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = oVar.getChildAt(i11);
            if (childAt != null) {
                int m7 = m(oVar, childAt, p6);
                if (m7 <= 0 && m7 > i10) {
                    view2 = childAt;
                    i10 = m7;
                }
                if (m7 >= 0 && m7 < i9) {
                    view = childAt;
                    i9 = m7;
                }
            }
        }
        boolean r6 = r(oVar, i7, i8);
        if (!r6 || view == null) {
            if (r6 || view2 == null) {
                if (r6) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int position = oVar.getPosition(view) + (s(oVar) == r6 ? -1 : 1);
                if (position < 0 || position >= itemCount) {
                    return -1;
                }
                return position;
            }
            return oVar.getPosition(view2);
        }
        return oVar.getPosition(view);
    }

    public final int m(@o0 RecyclerView.o oVar, @o0 View view, w wVar) {
        return (wVar.g(view) + (wVar.e(view) / 2)) - (wVar.n() + (wVar.o() / 2));
    }

    @q0
    public final View n(RecyclerView.o oVar, w wVar) {
        int childCount = oVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int n7 = wVar.n() + (wVar.o() / 2);
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = oVar.getChildAt(i8);
            int abs = Math.abs((wVar.g(childAt) + (wVar.e(childAt) / 2)) - n7);
            if (abs < i7) {
                view = childAt;
                i7 = abs;
            }
        }
        return view;
    }

    @o0
    public final w o(@o0 RecyclerView.o oVar) {
        w wVar = this.f5634f;
        if (wVar == null || wVar.f5629a != oVar) {
            this.f5634f = w.a(oVar);
        }
        return this.f5634f;
    }

    @q0
    public final w p(RecyclerView.o oVar) {
        if (oVar.canScrollVertically()) {
            return q(oVar);
        }
        if (oVar.canScrollHorizontally()) {
            return o(oVar);
        }
        return null;
    }

    @o0
    public final w q(@o0 RecyclerView.o oVar) {
        w wVar = this.f5633e;
        if (wVar == null || wVar.f5629a != oVar) {
            this.f5633e = w.c(oVar);
        }
        return this.f5633e;
    }

    public final boolean r(RecyclerView.o oVar, int i7, int i8) {
        return oVar.canScrollHorizontally() ? i7 > 0 : i8 > 0;
    }

    public final boolean s(RecyclerView.o oVar) {
        PointF computeScrollVectorForPosition;
        int itemCount = oVar.getItemCount();
        if (!(oVar instanceof RecyclerView.b0.b) || (computeScrollVectorForPosition = ((RecyclerView.b0.b) oVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f;
    }
}