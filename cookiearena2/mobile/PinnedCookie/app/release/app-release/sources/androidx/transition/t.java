package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.transition.d0;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class t extends ViewGroup implements q {

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f6794b;

    /* renamed from: c  reason: collision with root package name */
    public View f6795c;

    /* renamed from: d  reason: collision with root package name */
    public final View f6796d;

    /* renamed from: e  reason: collision with root package name */
    public int f6797e;
    @d.q0

    /* renamed from: f  reason: collision with root package name */
    public Matrix f6798f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f6799g;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            androidx.core.view.u1.n1(t.this);
            t tVar = t.this;
            ViewGroup viewGroup = tVar.f6794b;
            if (viewGroup == null || (view = tVar.f6795c) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            androidx.core.view.u1.n1(t.this.f6794b);
            t tVar2 = t.this;
            tVar2.f6794b = null;
            tVar2.f6795c = null;
            return true;
        }
    }

    public t(View view) {
        super(view.getContext());
        this.f6799g = new a();
        this.f6796d = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    public static t b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i7;
        r rVar;
        if (view.getParent() instanceof ViewGroup) {
            r b7 = r.b(viewGroup);
            t e7 = e(view);
            if (e7 == null || (rVar = (r) e7.getParent()) == b7) {
                i7 = 0;
            } else {
                i7 = e7.f6797e;
                rVar.removeView(e7);
                e7 = null;
            }
            if (e7 == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    c(view, viewGroup, matrix);
                }
                e7 = new t(view);
                e7.h(matrix);
                if (b7 == null) {
                    b7 = new r(viewGroup);
                } else {
                    b7.g();
                }
                d(viewGroup, b7);
                d(viewGroup, e7);
                b7.a(e7);
                e7.f6797e = i7;
            } else if (matrix != null) {
                e7.h(matrix);
            }
            e7.f6797e++;
            return e7;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    public static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        e1.j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        e1.k(viewGroup, matrix);
    }

    public static void d(View view, View view2) {
        e1.g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    public static t e(View view) {
        return (t) view.getTag(d0.g.f6071v0);
    }

    public static void f(View view) {
        t e7 = e(view);
        if (e7 != null) {
            int i7 = e7.f6797e - 1;
            e7.f6797e = i7;
            if (i7 <= 0) {
                ((r) e7.getParent()).removeView(e7);
            }
        }
    }

    public static void g(@d.o0 View view, @d.q0 t tVar) {
        view.setTag(d0.g.f6071v0, tVar);
    }

    @Override // androidx.transition.q
    public void a(ViewGroup viewGroup, View view) {
        this.f6794b = viewGroup;
        this.f6795c = view;
    }

    public void h(@d.o0 Matrix matrix) {
        this.f6798f = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.f6796d, this);
        this.f6796d.getViewTreeObserver().addOnPreDrawListener(this.f6799g);
        e1.i(this.f6796d, 4);
        if (this.f6796d.getParent() != null) {
            ((View) this.f6796d.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f6796d.getViewTreeObserver().removeOnPreDrawListener(this.f6799g);
        e1.i(this.f6796d, 0);
        g(this.f6796d, null);
        if (this.f6796d.getParent() != null) {
            ((View) this.f6796d.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        f.a(canvas, true);
        canvas.setMatrix(this.f6798f);
        e1.i(this.f6796d, 0);
        this.f6796d.invalidate();
        e1.i(this.f6796d, 4);
        drawChild(canvas, this.f6796d, getDrawingTime());
        f.a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
    }

    @Override // android.view.View, androidx.transition.q
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (e(this.f6796d) == this) {
            e1.i(this.f6796d, i7 == 0 ? 4 : 0);
        }
    }
}
