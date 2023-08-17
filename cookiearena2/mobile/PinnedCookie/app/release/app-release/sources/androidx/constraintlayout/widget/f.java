package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.k;
/* loaded from: classes.dex */
public class f extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    public static final String f2452c = "Constraints";

    /* renamed from: b  reason: collision with root package name */
    public e f2453b;

    public f(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attrs) {
        return new a(getContext(), attrs);
    }

    public final void c(AttributeSet attrs) {
    }

    public e getConstraintSet() {
        if (this.f2453b == null) {
            this.f2453b = new e();
        }
        this.f2453b.J(this);
        return this.f2453b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l7, int t6, int r6, int b7) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p6) {
        return new ConstraintLayout.b(p6);
    }

    public f(Context context, AttributeSet attrs) {
        super(context, attrs);
        c(attrs);
        super.setVisibility(8);
    }

    public f(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        c(attrs);
        super.setVisibility(8);
    }

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public float V0;
        public boolean W0;
        public float X0;
        public float Y0;
        public float Z0;

        /* renamed from: a1  reason: collision with root package name */
        public float f2454a1;

        /* renamed from: b1  reason: collision with root package name */
        public float f2455b1;

        /* renamed from: c1  reason: collision with root package name */
        public float f2456c1;

        /* renamed from: d1  reason: collision with root package name */
        public float f2457d1;

        /* renamed from: e1  reason: collision with root package name */
        public float f2458e1;

        /* renamed from: f1  reason: collision with root package name */
        public float f2459f1;

        /* renamed from: g1  reason: collision with root package name */
        public float f2460g1;

        /* renamed from: h1  reason: collision with root package name */
        public float f2461h1;

        public a(int width, int height) {
            super(width, height);
            this.V0 = 1.0f;
            this.W0 = false;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.f2454a1 = 0.0f;
            this.f2455b1 = 1.0f;
            this.f2456c1 = 1.0f;
            this.f2457d1 = 0.0f;
            this.f2458e1 = 0.0f;
            this.f2459f1 = 0.0f;
            this.f2460g1 = 0.0f;
            this.f2461h1 = 0.0f;
        }

        public a(a source) {
            super((ConstraintLayout.b) source);
            this.V0 = 1.0f;
            this.W0 = false;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.f2454a1 = 0.0f;
            this.f2455b1 = 1.0f;
            this.f2456c1 = 1.0f;
            this.f2457d1 = 0.0f;
            this.f2458e1 = 0.0f;
            this.f2459f1 = 0.0f;
            this.f2460g1 = 0.0f;
            this.f2461h1 = 0.0f;
        }

        public a(Context c7, AttributeSet attrs) {
            super(c7, attrs);
            this.V0 = 1.0f;
            this.W0 = false;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.f2454a1 = 0.0f;
            this.f2455b1 = 1.0f;
            this.f2456c1 = 1.0f;
            this.f2457d1 = 0.0f;
            this.f2458e1 = 0.0f;
            this.f2459f1 = 0.0f;
            this.f2460g1 = 0.0f;
            this.f2461h1 = 0.0f;
            TypedArray obtainStyledAttributes = c7.obtainStyledAttributes(attrs, k.m.Wa);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.mb) {
                    this.V0 = obtainStyledAttributes.getFloat(index, this.V0);
                } else if (index == k.m.zb) {
                    this.X0 = obtainStyledAttributes.getFloat(index, this.X0);
                    this.W0 = true;
                } else if (index == k.m.ub) {
                    this.Z0 = obtainStyledAttributes.getFloat(index, this.Z0);
                } else if (index == k.m.vb) {
                    this.f2454a1 = obtainStyledAttributes.getFloat(index, this.f2454a1);
                } else if (index == k.m.tb) {
                    this.Y0 = obtainStyledAttributes.getFloat(index, this.Y0);
                } else if (index == k.m.rb) {
                    this.f2455b1 = obtainStyledAttributes.getFloat(index, this.f2455b1);
                } else if (index == k.m.sb) {
                    this.f2456c1 = obtainStyledAttributes.getFloat(index, this.f2456c1);
                } else if (index == k.m.nb) {
                    this.f2457d1 = obtainStyledAttributes.getFloat(index, this.f2457d1);
                } else if (index == k.m.ob) {
                    this.f2458e1 = obtainStyledAttributes.getFloat(index, this.f2458e1);
                } else if (index == k.m.pb) {
                    this.f2459f1 = obtainStyledAttributes.getFloat(index, this.f2459f1);
                } else if (index == k.m.qb) {
                    this.f2460g1 = obtainStyledAttributes.getFloat(index, this.f2460g1);
                } else if (index == k.m.yb) {
                    this.f2461h1 = obtainStyledAttributes.getFloat(index, this.f2461h1);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
