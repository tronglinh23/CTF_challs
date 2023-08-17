package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import d.l;
import d.o0;
import d.x;
/* loaded from: classes.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private Path displayedTrackPath;
    private float displayedTrackThickness;
    private float trackLength;

    public LinearDrawingDelegate(@o0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@o0 Canvas canvas, @o0 Rect rect, @x(from = 0.0d, to = 1.0d) float f7) {
        this.trackLength = rect.width();
        float f8 = ((LinearProgressIndicatorSpec) this.spec).trackThickness;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - ((LinearProgressIndicatorSpec) this.spec).trackThickness) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.drawable.isShowing() && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 1) || (this.drawable.isHiding() && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.drawable.isShowing() || this.drawable.isHiding()) {
            canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.spec).trackThickness * (f7 - 1.0f)) / 2.0f);
        }
        float f9 = this.trackLength;
        canvas.clipRect((-f9) / 2.0f, (-f8) / 2.0f, f9 / 2.0f, f8 / 2.0f);
        S s6 = this.spec;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s6).trackThickness * f7;
        this.displayedCornerRadius = ((LinearProgressIndicatorSpec) s6).trackCornerRadius * f7;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@o0 Canvas canvas, @o0 Paint paint, @x(from = 0.0d, to = 1.0d) float f7, @x(from = 0.0d, to = 1.0d) float f8, @l int i7) {
        if (f7 == f8) {
            return;
        }
        float f9 = this.trackLength;
        float f10 = (-f9) / 2.0f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i7);
        canvas.save();
        canvas.clipPath(this.displayedTrackPath);
        float f11 = this.displayedTrackThickness;
        RectF rectF = new RectF(((f7 * f9) + f10) - (this.displayedCornerRadius * 2.0f), (-f11) / 2.0f, f10 + (f8 * f9), f11 / 2.0f);
        float f12 = this.displayedCornerRadius;
        canvas.drawRoundRect(rectF, f12, f12, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@o0 Canvas canvas, @o0 Paint paint) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(((LinearProgressIndicatorSpec) this.spec).trackColor, this.drawable.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(compositeARGBWithAlpha);
        Path path = new Path();
        this.displayedTrackPath = path;
        float f7 = this.trackLength;
        float f8 = this.displayedTrackThickness;
        RectF rectF = new RectF((-f7) / 2.0f, (-f8) / 2.0f, f7 / 2.0f, f8 / 2.0f);
        float f9 = this.displayedCornerRadius;
        path.addRoundRect(rectF, f9, f9, Path.Direction.CCW);
        canvas.drawPath(this.displayedTrackPath, paint);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.spec).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }
}
