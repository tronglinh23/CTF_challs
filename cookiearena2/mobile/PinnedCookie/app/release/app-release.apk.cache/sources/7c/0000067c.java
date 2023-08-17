package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import d.o0;
import d.q0;

/* loaded from: classes.dex */
public abstract class b0 extends RecyclerView.r {

    /* renamed from: d  reason: collision with root package name */
    public static final float f5232d = 100.0f;

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f5233a;

    /* renamed from: b  reason: collision with root package name */
    public Scroller f5234b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView.t f5235c = new a();

    /* loaded from: classes.dex */
    public class a extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5236a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            super.onScrollStateChanged(recyclerView, i7);
            if (i7 == 0 && this.f5236a) {
                this.f5236a = false;
                b0.this.l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            if (i7 == 0 && i8 == 0) {
                return;
            }
            this.f5236a = true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends q {
        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.q
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.q, androidx.recyclerview.widget.RecyclerView.b0
        public void onTargetFound(View view, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
            b0 b0Var = b0.this;
            RecyclerView recyclerView = b0Var.f5233a;
            if (recyclerView == null) {
                return;
            }
            int[] c7 = b0Var.c(recyclerView.getLayoutManager(), view);
            int i7 = c7[0];
            int i8 = c7[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i7), Math.abs(i8)));
            if (calculateTimeForDeceleration > 0) {
                aVar.l(i7, i8, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i7, int i8) {
        RecyclerView.o layoutManager = this.f5233a.getLayoutManager();
        if (layoutManager == null || this.f5233a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f5233a.getMinFlingVelocity();
        return (Math.abs(i8) > minFlingVelocity || Math.abs(i7) > minFlingVelocity) && k(layoutManager, i7, i8);
    }

    public void b(@q0 RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f5233a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            g();
        }
        this.f5233a = recyclerView;
        if (recyclerView != null) {
            j();
            this.f5234b = new Scroller(this.f5233a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    @q0
    public abstract int[] c(@o0 RecyclerView.o oVar, @o0 View view);

    public int[] d(int i7, int i8) {
        this.f5234b.fling(0, 0, i7, i8, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f5234b.getFinalX(), this.f5234b.getFinalY()};
    }

    @q0
    public RecyclerView.b0 e(RecyclerView.o oVar) {
        return f(oVar);
    }

    @q0
    @Deprecated
    public q f(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.b0.b) {
            return new b(this.f5233a.getContext());
        }
        return null;
    }

    public final void g() {
        this.f5233a.removeOnScrollListener(this.f5235c);
        this.f5233a.setOnFlingListener(null);
    }

    @q0
    public abstract View h(RecyclerView.o oVar);

    public abstract int i(RecyclerView.o oVar, int i7, int i8);

    public final void j() throws IllegalStateException {
        if (this.f5233a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f5233a.addOnScrollListener(this.f5235c);
        this.f5233a.setOnFlingListener(this);
    }

    public final boolean k(@o0 RecyclerView.o oVar, int i7, int i8) {
        RecyclerView.b0 e7;
        int i9;
        if (!(oVar instanceof RecyclerView.b0.b) || (e7 = e(oVar)) == null || (i9 = i(oVar, i7, i8)) == -1) {
            return false;
        }
        e7.setTargetPosition(i9);
        oVar.startSmoothScroll(e7);
        return true;
    }

    public void l() {
        RecyclerView.o layoutManager;
        View h7;
        RecyclerView recyclerView = this.f5233a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (h7 = h(layoutManager)) == null) {
            return;
        }
        int[] c7 = c(layoutManager, h7);
        int i7 = c7[0];
        if (i7 == 0 && c7[1] == 0) {
            return;
        }
        this.f5233a.smoothScrollBy(i7, c7[1]);
    }
}