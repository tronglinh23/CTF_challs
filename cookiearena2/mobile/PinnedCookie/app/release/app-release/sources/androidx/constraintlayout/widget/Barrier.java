package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.k;
/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: n  reason: collision with root package name */
    public static final int f2017n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f2018o = 2;

    /* renamed from: p  reason: collision with root package name */
    public static final int f2019p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f2020q = 3;

    /* renamed from: r  reason: collision with root package name */
    public static final int f2021r = 5;

    /* renamed from: s  reason: collision with root package name */
    public static final int f2022s = 6;

    /* renamed from: k  reason: collision with root package name */
    public int f2023k;

    /* renamed from: l  reason: collision with root package name */
    public int f2024l;

    /* renamed from: m  reason: collision with root package name */
    public y.a f2025m;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.b
    public void B(y.e widget, boolean isRtl) {
        K(widget, this.f2023k, isRtl);
    }

    @Deprecated
    public boolean J() {
        return this.f2025m.o2();
    }

    public final void K(y.e widget, int type, boolean isRtl) {
        this.f2024l = type;
        if (isRtl) {
            int i7 = this.f2023k;
            if (i7 == 5) {
                this.f2024l = 1;
            } else if (i7 == 6) {
                this.f2024l = 0;
            }
        } else {
            int i8 = this.f2023k;
            if (i8 == 5) {
                this.f2024l = 0;
            } else if (i8 == 6) {
                this.f2024l = 1;
            }
        }
        if (widget instanceof y.a) {
            ((y.a) widget).u2(this.f2024l);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f2025m.o2();
    }

    public int getMargin() {
        return this.f2025m.q2();
    }

    public int getType() {
        return this.f2023k;
    }

    public void setAllowsGoneWidget(boolean supportGone) {
        this.f2025m.t2(supportGone);
    }

    public void setDpMargin(int margin) {
        this.f2025m.v2((int) ((margin * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int margin) {
        this.f2025m.v2(margin);
    }

    public void setType(int type) {
        this.f2023k = type;
    }

    @Override // androidx.constraintlayout.widget.b
    public void y(AttributeSet attrs) {
        super.y(attrs);
        this.f2025m = new y.a();
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.Y6) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.m.X6) {
                    this.f2025m.t2(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == k.m.Z6) {
                    this.f2025m.v2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2144e = this.f2025m;
        I();
    }

    @Override // androidx.constraintlayout.widget.b
    public void z(e.a constraint, y.j child, ConstraintLayout.b layoutParams, SparseArray<y.e> mapIdToWidget) {
        super.z(constraint, child, layoutParams, mapIdToWidget);
        if (child instanceof y.a) {
            y.a aVar = (y.a) child;
            K(aVar, constraint.f2267e.f2337h0, ((y.f) child.U()).O2());
            aVar.t2(constraint.f2267e.f2353p0);
            aVar.v2(constraint.f2267e.f2339i0);
        }
    }

    public Barrier(Context context, AttributeSet attrs) {
        super(context, attrs);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        super.setVisibility(8);
    }
}
