package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import d.l;
import d.o0;
import d.q0;
import d.u0;
import o.a;
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {16842801};
    private static final e IMPL;
    private final d mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f1880a;

        public a() {
        }

        @Override // androidx.cardview.widget.d
        public View a() {
            return CardView.this;
        }

        @Override // androidx.cardview.widget.d
        public void b(int i7, int i8) {
            CardView cardView = CardView.this;
            if (i7 > cardView.mUserSetMinWidth) {
                CardView.super.setMinimumWidth(i7);
            }
            CardView cardView2 = CardView.this;
            if (i8 > cardView2.mUserSetMinHeight) {
                CardView.super.setMinimumHeight(i8);
            }
        }

        @Override // androidx.cardview.widget.d
        public void c(Drawable drawable) {
            this.f1880a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.d
        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.d
        public boolean e() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.d
        public Drawable f() {
            return this.f1880a;
        }

        @Override // androidx.cardview.widget.d
        public void setShadowPadding(int i7, int i8, int i9, int i10) {
            CardView.this.mShadowBounds.set(i7, i8, i9, i10);
            CardView cardView = CardView.this;
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i7 + rect.left, i8 + rect.top, i9 + rect.right, i10 + rect.bottom);
        }
    }

    static {
        b bVar = new b();
        IMPL = bVar;
        bVar.g();
    }

    public CardView(@o0 Context context) {
        this(context, null);
    }

    @o0
    public ColorStateList getCardBackgroundColor() {
        return IMPL.b(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.e(this.mCardViewDelegate);
    }

    @u0
    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    @u0
    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    @u0
    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    @u0
    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.a(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.h(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        if (IMPL instanceof b) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.j(this.mCardViewDelegate)), View.MeasureSpec.getSize(i7)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.i(this.mCardViewDelegate)), View.MeasureSpec.getSize(i8)), mode2);
        }
        super.onMeasure(i7, i8);
    }

    public void setCardBackgroundColor(@l int i7) {
        IMPL.n(this.mCardViewDelegate, ColorStateList.valueOf(i7));
    }

    public void setCardElevation(float f7) {
        IMPL.l(this.mCardViewDelegate, f7);
    }

    public void setContentPadding(@u0 int i7, @u0 int i8, @u0 int i9, @u0 int i10) {
        this.mContentPadding.set(i7, i8, i9, i10);
        IMPL.f(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f7) {
        IMPL.o(this.mCardViewDelegate, f7);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i7) {
        this.mUserSetMinHeight = i7;
        super.setMinimumHeight(i7);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i7) {
        this.mUserSetMinWidth = i7;
        super.setMinimumWidth(i7);
    }

    @Override // android.view.View
    public void setPadding(int i7, int i8, int i9, int i10) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i7, int i8, int i9, int i10) {
    }

    public void setPreventCornerOverlap(boolean z6) {
        if (z6 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z6;
            IMPL.m(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f7) {
        IMPL.d(this.mCardViewDelegate, f7);
    }

    public void setUseCompatPadding(boolean z6) {
        if (this.mCompatPadding != z6) {
            this.mCompatPadding = z6;
            IMPL.k(this.mCardViewDelegate);
        }
    }

    public CardView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0195a.f14232g);
    }

    public void setCardBackgroundColor(@q0 ColorStateList colorStateList) {
        IMPL.n(this.mCardViewDelegate, colorStateList);
    }

    public CardView(@o0 Context context, @q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        a aVar = new a();
        this.mCardViewDelegate = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.e.f14249a, i7, a.d.f14246b);
        if (obtainStyledAttributes.hasValue(a.e.f14252d)) {
            valueOf = obtainStyledAttributes.getColorStateList(a.e.f14252d);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(a.b.f14239b);
            } else {
                color = getResources().getColor(a.b.f14238a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(a.e.f14253e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(a.e.f14254f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(a.e.f14255g, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(a.e.f14257i, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(a.e.f14256h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.e.f14258j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(a.e.f14260l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(a.e.f14262n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(a.e.f14261m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(a.e.f14259k, dimensionPixelSize);
        float f7 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(a.e.f14250b, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(a.e.f14251c, 0);
        obtainStyledAttributes.recycle();
        IMPL.c(aVar, context, colorStateList, dimension, dimension2, f7);
    }
}
