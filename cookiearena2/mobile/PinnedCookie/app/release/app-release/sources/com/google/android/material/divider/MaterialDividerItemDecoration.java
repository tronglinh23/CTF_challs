package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.u1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import d.l;
import d.n;
import d.o0;
import d.q;
import d.q0;
import d.u0;
import k0.d;
import q0.c;
/* loaded from: classes.dex */
public class MaterialDividerItemDecoration extends RecyclerView.n {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialDivider;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    @l
    private int color;
    @o0
    private Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final Rect tempRect;
    private int thickness;

    public MaterialDividerItemDecoration(@o0 Context context, int i7) {
        this(context, null, i7);
    }

    private void drawForHorizontalOrientation(@o0 Canvas canvas, @o0 RecyclerView recyclerView) {
        int height;
        int i7;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i7 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i7, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i7 = 0;
        }
        int i8 = i7 + this.insetStart;
        int i9 = height - this.insetEnd;
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int round = this.tempRect.right + Math.round(childAt.getTranslationX());
                this.dividerDrawable.setBounds(round - this.thickness, i8, round, i9);
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void drawForVerticalOrientation(@o0 Canvas canvas, @o0 RecyclerView recyclerView) {
        int width;
        int i7;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i7 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i7, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i7 = 0;
        }
        boolean z6 = u1.Z(recyclerView) == 1;
        int i8 = i7 + (z6 ? this.insetEnd : this.insetStart);
        int i9 = width - (z6 ? this.insetStart : this.insetEnd);
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int round = this.tempRect.bottom + Math.round(childAt.getTranslationY());
                this.dividerDrawable.setBounds(i8, round - this.thickness, i9, round);
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @l
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

    @u0
    public int getDividerThickness() {
        return this.thickness;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@o0 Rect rect, @o0 View view, @o0 RecyclerView recyclerView, @o0 RecyclerView.c0 c0Var) {
        rect.set(0, 0, 0, 0);
        if (shouldDrawDivider(recyclerView, view)) {
            if (this.orientation == 1) {
                rect.bottom = this.thickness;
            } else {
                rect.right = this.thickness;
            }
        }
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 RecyclerView.c0 c0Var) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, recyclerView);
        } else {
            drawForHorizontalOrientation(canvas, recyclerView);
        }
    }

    public void setDividerColor(@l int i7) {
        this.color = i7;
        Drawable r6 = c.r(this.dividerDrawable);
        this.dividerDrawable = r6;
        c.n(r6, i7);
    }

    public void setDividerColorResource(@o0 Context context, @n int i7) {
        setDividerColor(d.f(context, i7));
    }

    public void setDividerInsetEnd(@u0 int i7) {
        this.insetEnd = i7;
    }

    public void setDividerInsetEndResource(@o0 Context context, @q int i7) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i7));
    }

    public void setDividerInsetStart(@u0 int i7) {
        this.insetStart = i7;
    }

    public void setDividerInsetStartResource(@o0 Context context, @q int i7) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i7));
    }

    public void setDividerThickness(@u0 int i7) {
        this.thickness = i7;
    }

    public void setDividerThicknessResource(@o0 Context context, @q int i7) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i7));
    }

    public void setLastItemDecorated(boolean z6) {
        this.lastItemDecorated = z6;
    }

    public void setOrientation(int i7) {
        if (i7 == 0 || i7 == 1) {
            this.orientation = i7;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i7 + ". It should be either HORIZONTAL or VERTICAL");
    }

    public boolean shouldDrawDivider(int i7, @q0 RecyclerView.g<?> gVar) {
        return true;
    }

    public MaterialDividerItemDecoration(@o0 Context context, @q0 AttributeSet attributeSet, int i7) {
        this(context, attributeSet, R.attr.materialDividerStyle, i7);
    }

    private boolean shouldDrawDivider(@o0 RecyclerView recyclerView, @o0 View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.g adapter = recyclerView.getAdapter();
        boolean z6 = adapter != null && childAdapterPosition == adapter.getItemCount() - 1;
        if (childAdapterPosition != -1) {
            return (!z6 || this.lastItemDecorated) && shouldDrawDivider(childAdapterPosition, adapter);
        }
        return false;
    }

    public MaterialDividerItemDecoration(@o0 Context context, @q0 AttributeSet attributeSet, int i7, int i8) {
        this.tempRect = new Rect();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.MaterialDivider, i7, DEF_STYLE_RES, new int[0]);
        this.color = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.thickness = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.insetStart = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.lastItemDecorated = obtainStyledAttributes.getBoolean(R.styleable.MaterialDivider_lastItemDecorated, true);
        obtainStyledAttributes.recycle();
        this.dividerDrawable = new ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i8);
    }
}
