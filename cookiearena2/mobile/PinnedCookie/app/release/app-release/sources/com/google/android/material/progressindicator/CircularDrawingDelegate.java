package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import d.l;
import d.o0;
import d.x;
/* loaded from: classes.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private float adjustedRadius;
    private int arcDirectionFactor;
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    public CircularDrawingDelegate(@o0 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.arcDirectionFactor = 1;
    }

    private void drawRoundedEnd(Canvas canvas, Paint paint, float f7, float f8, float f9) {
        canvas.save();
        canvas.rotate(f9);
        float f10 = this.adjustedRadius;
        float f11 = f7 / 2.0f;
        canvas.drawRoundRect(new RectF(f10 - f11, f8, f10 + f11, -f8), f8, f8, paint);
        canvas.restore();
    }

    private int getSize() {
        S s6 = this.spec;
        return ((CircularProgressIndicatorSpec) s6).indicatorSize + (((CircularProgressIndicatorSpec) s6).indicatorInset * 2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@o0 Canvas canvas, @o0 Rect rect, @x(from = 0.0d, to = 1.0d) float f7) {
        float width = rect.width() / getPreferredWidth();
        float height = rect.height() / getPreferredHeight();
        S s6 = this.spec;
        float f8 = (((CircularProgressIndicatorSpec) s6).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s6).indicatorInset;
        canvas.translate((f8 * width) + rect.left, (f8 * height) + rect.top);
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f9 = -f8;
        canvas.clipRect(f9, f9, f8, f8);
        this.arcDirectionFactor = ((CircularProgressIndicatorSpec) this.spec).indicatorDirection == 0 ? 1 : -1;
        this.displayedTrackThickness = ((CircularProgressIndicatorSpec) r8).trackThickness * f7;
        this.displayedCornerRadius = ((CircularProgressIndicatorSpec) r8).trackCornerRadius * f7;
        this.adjustedRadius = (((CircularProgressIndicatorSpec) r8).indicatorSize - ((CircularProgressIndicatorSpec) r8).trackThickness) / 2.0f;
        if ((this.drawable.isShowing() && ((CircularProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (this.drawable.isHiding() && ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
            this.adjustedRadius += ((1.0f - f7) * ((CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f;
        } else if ((this.drawable.isShowing() && ((CircularProgressIndicatorSpec) this.spec).showAnimationBehavior == 1) || (this.drawable.isHiding() && ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 2)) {
            this.adjustedRadius -= ((1.0f - f7) * ((CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@o0 Canvas canvas, @o0 Paint paint, @x(from = 0.0d, to = 1.0d) float f7, @x(from = 0.0d, to = 1.0d) float f8, @l int i7) {
        if (f7 == f8) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i7);
        paint.setStrokeWidth(this.displayedTrackThickness);
        int i8 = this.arcDirectionFactor;
        float f9 = f7 * 360.0f * i8;
        float f10 = (f8 >= f7 ? f8 - f7 : (1.0f + f8) - f7) * 360.0f * i8;
        float f11 = this.adjustedRadius;
        canvas.drawArc(new RectF(-f11, -f11, f11, f11), f9, f10, false, paint);
        if (this.displayedCornerRadius <= 0.0f || Math.abs(f10) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        drawRoundedEnd(canvas, paint, this.displayedTrackThickness, this.displayedCornerRadius, f9);
        drawRoundedEnd(canvas, paint, this.displayedTrackThickness, this.displayedCornerRadius, f9 + f10);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@o0 Canvas canvas, @o0 Paint paint) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(((CircularProgressIndicatorSpec) this.spec).trackColor, this.drawable.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(compositeARGBWithAlpha);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f7 = this.adjustedRadius;
        canvas.drawArc(new RectF(-f7, -f7, f7, f7), 0.0f, 360.0f, false, paint);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return getSize();
    }
}
