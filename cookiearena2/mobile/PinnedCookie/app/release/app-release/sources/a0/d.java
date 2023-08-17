package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.g;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.k;
/* loaded from: classes.dex */
public class d extends androidx.constraintlayout.widget.b {
    public static final String C = "Layer";
    public boolean A;
    public boolean B;

    /* renamed from: k  reason: collision with root package name */
    public float f37k;

    /* renamed from: l  reason: collision with root package name */
    public float f38l;

    /* renamed from: m  reason: collision with root package name */
    public float f39m;

    /* renamed from: n  reason: collision with root package name */
    public ConstraintLayout f40n;

    /* renamed from: o  reason: collision with root package name */
    public float f41o;

    /* renamed from: p  reason: collision with root package name */
    public float f42p;

    /* renamed from: q  reason: collision with root package name */
    public float f43q;

    /* renamed from: r  reason: collision with root package name */
    public float f44r;

    /* renamed from: s  reason: collision with root package name */
    public float f45s;

    /* renamed from: t  reason: collision with root package name */
    public float f46t;

    /* renamed from: u  reason: collision with root package name */
    public float f47u;

    /* renamed from: v  reason: collision with root package name */
    public float f48v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f49w;

    /* renamed from: x  reason: collision with root package name */
    public View[] f50x;

    /* renamed from: y  reason: collision with root package name */
    public float f51y;

    /* renamed from: z  reason: collision with root package name */
    public float f52z;

    public d(Context context) {
        super(context);
        this.f37k = Float.NaN;
        this.f38l = Float.NaN;
        this.f39m = Float.NaN;
        this.f41o = 1.0f;
        this.f42p = 1.0f;
        this.f43q = Float.NaN;
        this.f44r = Float.NaN;
        this.f45s = Float.NaN;
        this.f46t = Float.NaN;
        this.f47u = Float.NaN;
        this.f48v = Float.NaN;
        this.f49w = true;
        this.f50x = null;
        this.f51y = 0.0f;
        this.f52z = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.b
    public void D(ConstraintLayout container) {
        K();
        this.f43q = Float.NaN;
        this.f44r = Float.NaN;
        y.e b7 = ((ConstraintLayout.b) getLayoutParams()).b();
        b7.c2(0);
        b7.y1(0);
        J();
        layout(((int) this.f47u) - getPaddingLeft(), ((int) this.f48v) - getPaddingTop(), ((int) this.f45s) + getPaddingRight(), ((int) this.f46t) + getPaddingBottom());
        L();
    }

    @Override // androidx.constraintlayout.widget.b
    public void F(ConstraintLayout container) {
        this.f40n = container;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f39m = rotation;
        } else if (Float.isNaN(this.f39m)) {
        } else {
            this.f39m = rotation;
        }
    }

    public void J() {
        if (this.f40n == null) {
            return;
        }
        if (this.f49w || Float.isNaN(this.f43q) || Float.isNaN(this.f44r)) {
            if (!Float.isNaN(this.f37k) && !Float.isNaN(this.f38l)) {
                this.f44r = this.f38l;
                this.f43q = this.f37k;
                return;
            }
            View[] w6 = w(this.f40n);
            int left = w6[0].getLeft();
            int top = w6[0].getTop();
            int right = w6[0].getRight();
            int bottom = w6[0].getBottom();
            for (int i7 = 0; i7 < this.f2142c; i7++) {
                View view = w6[i7];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f45s = right;
            this.f46t = bottom;
            this.f47u = left;
            this.f48v = top;
            if (Float.isNaN(this.f37k)) {
                this.f43q = (left + right) / 2;
            } else {
                this.f43q = this.f37k;
            }
            if (Float.isNaN(this.f38l)) {
                this.f44r = (top + bottom) / 2;
            } else {
                this.f44r = this.f38l;
            }
        }
    }

    public final void K() {
        int i7;
        if (this.f40n == null || (i7 = this.f2142c) == 0) {
            return;
        }
        View[] viewArr = this.f50x;
        if (viewArr == null || viewArr.length != i7) {
            this.f50x = new View[i7];
        }
        for (int i8 = 0; i8 < this.f2142c; i8++) {
            this.f50x[i8] = this.f40n.getViewById(this.f2141b[i8]);
        }
    }

    public final void L() {
        if (this.f40n == null) {
            return;
        }
        if (this.f50x == null) {
            K();
        }
        J();
        double radians = Float.isNaN(this.f39m) ? g.f1896q : Math.toRadians(this.f39m);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f7 = this.f41o;
        float f8 = f7 * cos;
        float f9 = this.f42p;
        float f10 = (-f9) * sin;
        float f11 = f7 * sin;
        float f12 = f9 * cos;
        for (int i7 = 0; i7 < this.f2142c; i7++) {
            View view = this.f50x[i7];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f13 = left - this.f43q;
            float f14 = top - this.f44r;
            float f15 = (((f8 * f13) + (f10 * f14)) - f13) + this.f51y;
            float f16 = (((f13 * f11) + (f12 * f14)) - f14) + this.f52z;
            view.setTranslationX(f15);
            view.setTranslationY(f16);
            view.setScaleY(this.f42p);
            view.setScaleX(this.f41o);
            if (!Float.isNaN(this.f39m)) {
                view.setRotation(this.f39m);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40n = (ConstraintLayout) getParent();
        if (this.A || this.B) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i7 = 0; i7 < this.f2142c; i7++) {
                View viewById = this.f40n.getViewById(this.f2141b[i7]);
                if (viewById != null) {
                    if (this.A) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.B && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void r(ConstraintLayout container) {
        q(container);
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        p();
    }

    @Override // android.view.View
    public void setPivotX(float pivotX) {
        this.f37k = pivotX;
        L();
    }

    @Override // android.view.View
    public void setPivotY(float pivotY) {
        this.f38l = pivotY;
        L();
    }

    @Override // android.view.View
    public void setRotation(float angle) {
        this.f39m = angle;
        L();
    }

    @Override // android.view.View
    public void setScaleX(float scaleX) {
        this.f41o = scaleX;
        L();
    }

    @Override // android.view.View
    public void setScaleY(float scaleY) {
        this.f42p = scaleY;
        L();
    }

    @Override // android.view.View
    public void setTranslationX(float dx) {
        this.f51y = dx;
        L();
    }

    @Override // android.view.View
    public void setTranslationY(float dy) {
        this.f52z = dy;
        L();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        p();
    }

    @Override // androidx.constraintlayout.widget.b
    public void y(AttributeSet attrs) {
        super.y(attrs);
        this.f2145f = false;
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.E6) {
                    this.A = true;
                } else if (index == k.m.U6) {
                    this.B = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public d(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f37k = Float.NaN;
        this.f38l = Float.NaN;
        this.f39m = Float.NaN;
        this.f41o = 1.0f;
        this.f42p = 1.0f;
        this.f43q = Float.NaN;
        this.f44r = Float.NaN;
        this.f45s = Float.NaN;
        this.f46t = Float.NaN;
        this.f47u = Float.NaN;
        this.f48v = Float.NaN;
        this.f49w = true;
        this.f50x = null;
        this.f51y = 0.0f;
        this.f52z = 0.0f;
    }

    public d(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f37k = Float.NaN;
        this.f38l = Float.NaN;
        this.f39m = Float.NaN;
        this.f41o = 1.0f;
        this.f42p = 1.0f;
        this.f43q = Float.NaN;
        this.f44r = Float.NaN;
        this.f45s = Float.NaN;
        this.f46t = Float.NaN;
        this.f47u = Float.NaN;
        this.f48v = Float.NaN;
        this.f49w = true;
        this.f50x = null;
        this.f51y = 0.0f;
        this.f52z = 0.0f;
    }
}
