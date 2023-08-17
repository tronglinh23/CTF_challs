package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import d.l;
import d.n;
import d.o0;
import d.q;
import d.q0;
import d.u0;
import k0.d;
/* loaded from: classes.dex */
public class MaterialDivider extends View {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialDivider;
    @l
    private int color;
    @o0
    private final MaterialShapeDrawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private int thickness;

    public MaterialDivider(@o0 Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.color;
    }

    @u0
    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    @u0
    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    @Override // android.view.View
    public void onDraw(@o0 Canvas canvas) {
        int width;
        int i7;
        super.onDraw(canvas);
        boolean z6 = u1.Z(this) == 1;
        int i8 = z6 ? this.insetEnd : this.insetStart;
        if (z6) {
            width = getWidth();
            i7 = this.insetStart;
        } else {
            width = getWidth();
            i7 = this.insetEnd;
        }
        this.dividerDrawable.setBounds(i8, 0, width - i7, getBottom() - getTop());
        this.dividerDrawable.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i8);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i9 = this.thickness;
            if (i9 > 0 && measuredHeight != i9) {
                measuredHeight = i9;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@l int i7) {
        if (this.color != i7) {
            this.color = i7;
            this.dividerDrawable.setFillColor(ColorStateList.valueOf(i7));
            invalidate();
        }
    }

    public void setDividerColorResource(@n int i7) {
        setDividerColor(d.f(getContext(), i7));
    }

    public void setDividerInsetEnd(@u0 int i7) {
        this.insetEnd = i7;
    }

    public void setDividerInsetEndResource(@q int i7) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i7));
    }

    public void setDividerInsetStart(@u0 int i7) {
        this.insetStart = i7;
    }

    public void setDividerInsetStartResource(@q int i7) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i7));
    }

    public void setDividerThickness(@u0 int i7) {
        if (this.thickness != i7) {
            this.thickness = i7;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@q int i7) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i7));
    }

    public MaterialDivider(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialDivider(@d.o0 android.content.Context r8, @d.q0 android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.divider.MaterialDivider.DEF_STYLE_RES
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            r7.dividerDrawable = r0
            int[] r2 = com.google.android.material.R.styleable.MaterialDivider
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R.styleable.MaterialDivider_dividerThickness
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.google.android.material.R.dimen.material_divider_thickness
            int r0 = r0.getDimensionPixelSize(r1)
            int r10 = r9.getDimensionPixelSize(r10, r0)
            r7.thickness = r10
            int r10 = com.google.android.material.R.styleable.MaterialDivider_dividerInsetStart
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.insetStart = r10
            int r10 = com.google.android.material.R.styleable.MaterialDivider_dividerInsetEnd
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.insetEnd = r10
            int r10 = com.google.android.material.R.styleable.MaterialDivider_dividerColor
            android.content.res.ColorStateList r8 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r9, r10)
            int r8 = r8.getDefaultColor()
            r7.setDividerColor(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.divider.MaterialDivider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
