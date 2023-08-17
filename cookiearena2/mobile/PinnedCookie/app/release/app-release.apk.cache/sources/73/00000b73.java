package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import d.b1;
import d.o0;
import d.q0;

@b1({b1.a.f8134l})
/* loaded from: classes.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {
    @q0
    private Path path;

    public ClippableRoundedCornerLayout(@o0 Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.path == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void resetClipBoundsAndCornerRadius() {
        this.path = null;
        invalidate();
    }

    public void updateClipBoundsAndCornerRadius(@o0 Rect rect, float f7) {
        updateClipBoundsAndCornerRadius(rect.left, rect.top, rect.right, rect.bottom, f7);
    }

    public ClippableRoundedCornerLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void updateClipBoundsAndCornerRadius(float f7, float f8, float f9, float f10, float f11) {
        updateClipBoundsAndCornerRadius(new RectF(f7, f8, f9, f10), f11);
    }

    public ClippableRoundedCornerLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    public void updateClipBoundsAndCornerRadius(@o0 RectF rectF, float f7) {
        if (this.path == null) {
            this.path = new Path();
        }
        this.path.reset();
        this.path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        this.path.close();
        invalidate();
    }
}