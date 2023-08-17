package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.r0;
import androidx.core.view.u1;
import com.google.android.material.R;
import d.b1;
import d.o0;
import d.q0;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private int rowCount;
    private boolean singleLine;

    public FlowLayout(@o0 Context context) {
        this(context, null);
    }

    private static int getMeasuredDimension(int i7, int i8, int i9) {
        return i8 != Integer.MIN_VALUE ? i8 != 1073741824 ? i9 : i7 : Math.min(i9, i7);
    }

    private void loadFromAttributes(@o0 Context context, @q0 AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FlowLayout, 0, 0);
        this.lineSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_lineSpacing, 0);
        this.itemSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.itemSpacing;
    }

    public int getLineSpacing() {
        return this.lineSpacing;
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public int getRowIndex(@o0 View view) {
        Object tag = view.getTag(R.id.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean isSingleLine() {
        return this.singleLine;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        if (getChildCount() == 0) {
            this.rowCount = 0;
            return;
        }
        this.rowCount = 1;
        boolean z7 = u1.Z(this) == 1;
        int paddingRight = z7 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z7 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i13 = (i9 - i7) - paddingLeft;
        int i14 = paddingRight;
        int i15 = paddingTop;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = r0.c(marginLayoutParams);
                    i11 = r0.b(marginLayoutParams);
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                int measuredWidth = i14 + i12 + childAt.getMeasuredWidth();
                if (!this.singleLine && measuredWidth > i13) {
                    i15 = this.lineSpacing + paddingTop;
                    this.rowCount++;
                    i14 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.rowCount - 1));
                int i17 = i14 + i12;
                int measuredWidth2 = childAt.getMeasuredWidth() + i17;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z7) {
                    childAt.layout(i13 - measuredWidth2, i15, (i13 - i14) - i12, measuredHeight);
                } else {
                    childAt.layout(i17, i15, measuredWidth2, measuredHeight);
                }
                i14 += i12 + i11 + childAt.getMeasuredWidth() + this.itemSpacing;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i8);
        int i12 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i12 - getPaddingRight();
        int i13 = paddingTop;
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i7, i8);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i9 = marginLayoutParams.leftMargin + 0;
                    i10 = marginLayoutParams.rightMargin + 0;
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                int i16 = paddingLeft;
                if (paddingLeft + i9 + childAt.getMeasuredWidth() <= paddingRight || isSingleLine()) {
                    i11 = i16;
                } else {
                    i11 = getPaddingLeft();
                    i13 = this.lineSpacing + paddingTop;
                }
                int measuredWidth = i11 + i9 + childAt.getMeasuredWidth();
                int measuredHeight = i13 + childAt.getMeasuredHeight();
                if (measuredWidth > i14) {
                    i14 = measuredWidth;
                }
                paddingLeft = i11 + i9 + i10 + childAt.getMeasuredWidth() + this.itemSpacing;
                if (i15 == getChildCount() - 1) {
                    i14 += i10;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(getMeasuredDimension(size, mode, i14 + getPaddingRight()), getMeasuredDimension(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i7) {
        this.itemSpacing = i7;
    }

    public void setLineSpacing(int i7) {
        this.lineSpacing = i7;
    }

    public void setSingleLine(boolean z6) {
        this.singleLine = z6;
    }

    public FlowLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }
}
