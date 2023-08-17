package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import d.l;
import d.o0;
import d.x;
/* loaded from: classes.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    protected DrawableWithAnimatedVisibilityChange drawable;
    S spec;

    public DrawingDelegate(S s6) {
        this.spec = s6;
    }

    public abstract void adjustCanvas(@o0 Canvas canvas, @o0 Rect rect, @x(from = 0.0d, to = 1.0d) float f7);

    public abstract void fillIndicator(@o0 Canvas canvas, @o0 Paint paint, @x(from = 0.0d, to = 1.0d) float f7, @x(from = 0.0d, to = 1.0d) float f8, @l int i7);

    public abstract void fillTrack(@o0 Canvas canvas, @o0 Paint paint);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public void registerDrawable(@o0 DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        this.drawable = drawableWithAnimatedVisibilityChange;
    }

    public void validateSpecAndAdjustCanvas(@o0 Canvas canvas, @o0 Rect rect, @x(from = 0.0d, to = 1.0d) float f7) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f7);
    }
}
