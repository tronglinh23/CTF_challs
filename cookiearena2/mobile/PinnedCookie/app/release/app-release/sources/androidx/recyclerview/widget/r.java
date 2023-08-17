package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d.o0;
import d.q0;
/* loaded from: classes.dex */
public class r extends b0 {

    /* renamed from: g  reason: collision with root package name */
    public static final float f5588g = 1.0f;
    @q0

    /* renamed from: e  reason: collision with root package name */
    public w f5589e;
    @q0

    /* renamed from: f  reason: collision with root package name */
    public w f5590f;

    @Override // androidx.recyclerview.widget.b0
    public int[] c(@o0 RecyclerView.o oVar, @o0 View view) {
        int[] iArr = new int[2];
        if (oVar.canScrollHorizontally()) {
            iArr[0] = n(oVar, view, q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.canScrollVertically()) {
            iArr[1] = n(oVar, view, r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.b0
    public View h(RecyclerView.o oVar) {
        if (oVar.canScrollVertically()) {
            return p(oVar, r(oVar));
        }
        if (oVar.canScrollHorizontally()) {
            return p(oVar, q(oVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.b0
    public int i(RecyclerView.o oVar, int i7, int i8) {
        int itemCount;
        View h7;
        int position;
        int i9;
        PointF computeScrollVectorForPosition;
        int i10;
        int i11;
        if (!(oVar instanceof RecyclerView.b0.b) || (itemCount = oVar.getItemCount()) == 0 || (h7 = h(oVar)) == null || (position = oVar.getPosition(h7)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.b0.b) oVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (oVar.canScrollHorizontally()) {
            i10 = o(oVar, q(oVar), i7, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i10 = -i10;
            }
        } else {
            i10 = 0;
        }
        if (oVar.canScrollVertically()) {
            i11 = o(oVar, r(oVar), 0, i8);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i11 = -i11;
            }
        } else {
            i11 = 0;
        }
        if (oVar.canScrollVertically()) {
            i10 = i11;
        }
        if (i10 == 0) {
            return -1;
        }
        int i12 = position + i10;
        int i13 = i12 >= 0 ? i12 : 0;
        return i13 >= itemCount ? i9 : i13;
    }

    public final float m(RecyclerView.o oVar, w wVar) {
        int childCount = oVar.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        int i7 = Integer.MIN_VALUE;
        int i8 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = oVar.getChildAt(i9);
            int position = oVar.getPosition(childAt);
            if (position != -1) {
                if (position < i8) {
                    view = childAt;
                    i8 = position;
                }
                if (position > i7) {
                    view2 = childAt;
                    i7 = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(wVar.d(view), wVar.d(view2)) - Math.min(wVar.g(view), wVar.g(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i7 - i8) + 1);
    }

    public final int n(@o0 RecyclerView.o oVar, @o0 View view, w wVar) {
        return (wVar.g(view) + (wVar.e(view) / 2)) - (wVar.n() + (wVar.o() / 2));
    }

    public final int o(RecyclerView.o oVar, w wVar, int i7, int i8) {
        int[] d7 = d(i7, i8);
        float m7 = m(oVar, wVar);
        if (m7 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(d7[0]) > Math.abs(d7[1]) ? d7[0] : d7[1]) / m7);
    }

    @q0
    public final View p(RecyclerView.o oVar, w wVar) {
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
    public final w q(@o0 RecyclerView.o oVar) {
        w wVar = this.f5590f;
        if (wVar == null || wVar.f5629a != oVar) {
            this.f5590f = w.a(oVar);
        }
        return this.f5590f;
    }

    @o0
    public final w r(@o0 RecyclerView.o oVar) {
        w wVar = this.f5589e;
        if (wVar == null || wVar.f5629a != oVar) {
            this.f5589e = w.c(oVar);
        }
        return this.f5589e;
    }
}
