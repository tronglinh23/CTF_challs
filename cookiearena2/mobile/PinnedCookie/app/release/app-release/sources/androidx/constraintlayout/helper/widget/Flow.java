package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.k;
import androidx.constraintlayout.widget.o;
import y.e;
import y.g;
import y.j;
import y.n;
/* loaded from: classes.dex */
public class Flow extends o {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;

    /* renamed from: n  reason: collision with root package name */
    public static final String f2003n = "Flow";

    /* renamed from: o  reason: collision with root package name */
    public static final int f2004o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f2005p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f2006q = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final int f2007r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f2008s = 2;

    /* renamed from: t  reason: collision with root package name */
    public static final int f2009t = 0;

    /* renamed from: u  reason: collision with root package name */
    public static final int f2010u = 1;

    /* renamed from: v  reason: collision with root package name */
    public static final int f2011v = 2;

    /* renamed from: w  reason: collision with root package name */
    public static final int f2012w = 0;

    /* renamed from: x  reason: collision with root package name */
    public static final int f2013x = 1;

    /* renamed from: y  reason: collision with root package name */
    public static final int f2014y = 2;

    /* renamed from: z  reason: collision with root package name */
    public static final int f2015z = 0;

    /* renamed from: m  reason: collision with root package name */
    public g f2016m;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.b
    public void B(e widget, boolean isRtl) {
        this.f2016m.m2(isRtl);
    }

    @Override // androidx.constraintlayout.widget.o
    public void J(n layout, int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (layout == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        layout.v2(mode, size, mode2, size2);
        setMeasuredDimension(layout.q2(), layout.p2());
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        J(this.f2016m, widthMeasureSpec, heightMeasureSpec);
    }

    public void setFirstHorizontalBias(float bias) {
        this.f2016m.k3(bias);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int style) {
        this.f2016m.l3(style);
        requestLayout();
    }

    public void setFirstVerticalBias(float bias) {
        this.f2016m.m3(bias);
        requestLayout();
    }

    public void setFirstVerticalStyle(int style) {
        this.f2016m.n3(style);
        requestLayout();
    }

    public void setHorizontalAlign(int align) {
        this.f2016m.o3(align);
        requestLayout();
    }

    public void setHorizontalBias(float bias) {
        this.f2016m.p3(bias);
        requestLayout();
    }

    public void setHorizontalGap(int gap) {
        this.f2016m.q3(gap);
        requestLayout();
    }

    public void setHorizontalStyle(int style) {
        this.f2016m.r3(style);
        requestLayout();
    }

    public void setLastHorizontalBias(float bias) {
        this.f2016m.s3(bias);
        requestLayout();
    }

    public void setLastHorizontalStyle(int style) {
        this.f2016m.t3(style);
        requestLayout();
    }

    public void setLastVerticalBias(float bias) {
        this.f2016m.u3(bias);
        requestLayout();
    }

    public void setLastVerticalStyle(int style) {
        this.f2016m.v3(style);
        requestLayout();
    }

    public void setMaxElementsWrap(int max) {
        this.f2016m.w3(max);
        requestLayout();
    }

    public void setOrientation(int orientation) {
        this.f2016m.x3(orientation);
        requestLayout();
    }

    public void setPadding(int padding) {
        this.f2016m.B2(padding);
        requestLayout();
    }

    public void setPaddingBottom(int paddingBottom) {
        this.f2016m.C2(paddingBottom);
        requestLayout();
    }

    public void setPaddingLeft(int paddingLeft) {
        this.f2016m.E2(paddingLeft);
        requestLayout();
    }

    public void setPaddingRight(int paddingRight) {
        this.f2016m.F2(paddingRight);
        requestLayout();
    }

    public void setPaddingTop(int paddingTop) {
        this.f2016m.H2(paddingTop);
        requestLayout();
    }

    public void setVerticalAlign(int align) {
        this.f2016m.y3(align);
        requestLayout();
    }

    public void setVerticalBias(float bias) {
        this.f2016m.z3(bias);
        requestLayout();
    }

    public void setVerticalGap(int gap) {
        this.f2016m.A3(gap);
        requestLayout();
    }

    public void setVerticalStyle(int style) {
        this.f2016m.B3(style);
        requestLayout();
    }

    public void setWrapMode(int mode) {
        this.f2016m.C3(mode);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.o, androidx.constraintlayout.widget.b
    public void y(AttributeSet attrs) {
        super.y(attrs);
        this.f2016m = new g();
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.y6) {
                    this.f2016m.x3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.m.z6) {
                    this.f2016m.B2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == k.m.Q6) {
                    this.f2016m.G2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == k.m.R6) {
                    this.f2016m.D2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == k.m.A6) {
                    this.f2016m.E2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == k.m.B6) {
                    this.f2016m.H2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == k.m.C6) {
                    this.f2016m.F2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == k.m.D6) {
                    this.f2016m.C2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == k.m.A7) {
                    this.f2016m.C3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.m.q7) {
                    this.f2016m.r3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.m.z7) {
                    this.f2016m.B3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.m.k7) {
                    this.f2016m.l3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.m.s7) {
                    this.f2016m.t3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.m.m7) {
                    this.f2016m.n3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.m.u7) {
                    this.f2016m.v3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.m.o7) {
                    this.f2016m.p3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == k.m.j7) {
                    this.f2016m.k3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == k.m.r7) {
                    this.f2016m.s3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == k.m.l7) {
                    this.f2016m.m3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == k.m.t7) {
                    this.f2016m.u3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == k.m.x7) {
                    this.f2016m.z3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == k.m.n7) {
                    this.f2016m.o3(obtainStyledAttributes.getInt(index, 2));
                } else if (index == k.m.w7) {
                    this.f2016m.y3(obtainStyledAttributes.getInt(index, 2));
                } else if (index == k.m.p7) {
                    this.f2016m.q3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == k.m.y7) {
                    this.f2016m.A3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == k.m.v7) {
                    this.f2016m.w3(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2144e = this.f2016m;
        I();
    }

    @Override // androidx.constraintlayout.widget.b
    public void z(e.a constraint, j child, ConstraintLayout.b layoutParams, SparseArray<y.e> mapIdToWidget) {
        super.z(constraint, child, layoutParams, mapIdToWidget);
        if (child instanceof g) {
            g gVar = (g) child;
            int i7 = layoutParams.Z;
            if (i7 != -1) {
                gVar.x3(i7);
            }
        }
    }

    public Flow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Flow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
