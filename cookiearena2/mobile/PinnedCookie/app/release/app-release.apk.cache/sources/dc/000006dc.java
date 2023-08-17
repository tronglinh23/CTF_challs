package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: d  reason: collision with root package name */
    public static final int f5626d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public static final int f5627e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f5628f = 1;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.o f5629a;

    /* renamed from: b  reason: collision with root package name */
    public int f5630b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f5631c;

    /* loaded from: classes.dex */
    public static class a extends w {
        public a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.w
        public int d(View view) {
            return this.f5629a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f5629a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f5629a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int g(View view) {
            return this.f5629a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int h() {
            return this.f5629a.getWidth();
        }

        @Override // androidx.recyclerview.widget.w
        public int i() {
            return this.f5629a.getWidth() - this.f5629a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.w
        public int j() {
            return this.f5629a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.w
        public int l() {
            return this.f5629a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.w
        public int m() {
            return this.f5629a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.w
        public int n() {
            return this.f5629a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.w
        public int o() {
            return (this.f5629a.getWidth() - this.f5629a.getPaddingLeft()) - this.f5629a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.w
        public int q(View view) {
            this.f5629a.getTransformedBoundingBox(view, true, this.f5631c);
            return this.f5631c.right;
        }

        @Override // androidx.recyclerview.widget.w
        public int r(View view) {
            this.f5629a.getTransformedBoundingBox(view, true, this.f5631c);
            return this.f5631c.left;
        }

        @Override // androidx.recyclerview.widget.w
        public void s(View view, int i7) {
            view.offsetLeftAndRight(i7);
        }

        @Override // androidx.recyclerview.widget.w
        public void t(int i7) {
            this.f5629a.offsetChildrenHorizontal(i7);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends w {
        public b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.w
        public int d(View view) {
            return this.f5629a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f5629a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f5629a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int g(View view) {
            return this.f5629a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int h() {
            return this.f5629a.getHeight();
        }

        @Override // androidx.recyclerview.widget.w
        public int i() {
            return this.f5629a.getHeight() - this.f5629a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.w
        public int j() {
            return this.f5629a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.w
        public int l() {
            return this.f5629a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.w
        public int m() {
            return this.f5629a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.w
        public int n() {
            return this.f5629a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.w
        public int o() {
            return (this.f5629a.getHeight() - this.f5629a.getPaddingTop()) - this.f5629a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.w
        public int q(View view) {
            this.f5629a.getTransformedBoundingBox(view, true, this.f5631c);
            return this.f5631c.bottom;
        }

        @Override // androidx.recyclerview.widget.w
        public int r(View view) {
            this.f5629a.getTransformedBoundingBox(view, true, this.f5631c);
            return this.f5631c.top;
        }

        @Override // androidx.recyclerview.widget.w
        public void s(View view, int i7) {
            view.offsetTopAndBottom(i7);
        }

        @Override // androidx.recyclerview.widget.w
        public void t(int i7) {
            this.f5629a.offsetChildrenVertical(i7);
        }
    }

    public /* synthetic */ w(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static w a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static w b(RecyclerView.o oVar, int i7) {
        if (i7 != 0) {
            if (i7 == 1) {
                return c(oVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return a(oVar);
    }

    public static w c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.o k() {
        return this.f5629a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.f5630b) {
            return 0;
        }
        return o() - this.f5630b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(View view, int i7);

    public abstract void t(int i7);

    public void u() {
        this.f5630b = o();
    }

    public w(RecyclerView.o oVar) {
        this.f5630b = Integer.MIN_VALUE;
        this.f5631c = new Rect();
        this.f5629a = oVar;
    }
}