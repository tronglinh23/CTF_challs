package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import com.google.android.material.R;
import d.o0;
import k0.d;

@Deprecated
/* loaded from: classes.dex */
public class ShadowDrawableWrapper extends DrawableWrapper {
    static final double COS_45 = Math.cos(Math.toRadians(45.0d));
    static final float SHADOW_BOTTOM_SCALE = 1.0f;
    static final float SHADOW_HORIZ_SCALE = 0.5f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    static final float SHADOW_TOP_SCALE = 0.25f;
    private boolean addPaddingForCorners;
    @o0
    final RectF contentBounds;
    float cornerRadius;
    @o0
    final Paint cornerShadowPaint;
    Path cornerShadowPath;
    private boolean dirty;
    @o0
    final Paint edgeShadowPaint;
    float maxShadowSize;
    private boolean printedShadowClipWarning;
    float rawMaxShadowSize;
    float rawShadowSize;
    private float rotation;
    private final int shadowEndColor;
    private final int shadowMiddleColor;
    float shadowSize;
    private final int shadowStartColor;

    public ShadowDrawableWrapper(Context context, Drawable drawable, float f7, float f8, float f9) {
        super(drawable);
        this.dirty = true;
        this.addPaddingForCorners = true;
        this.printedShadowClipWarning = false;
        this.shadowStartColor = d.f(context, R.color.design_fab_shadow_start_color);
        this.shadowMiddleColor = d.f(context, R.color.design_fab_shadow_mid_color);
        this.shadowEndColor = d.f(context, R.color.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.cornerShadowPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.cornerRadius = Math.round(f7);
        this.contentBounds = new RectF();
        Paint paint2 = new Paint(paint);
        this.edgeShadowPaint = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f8, f9);
    }

    private void buildComponents(@o0 Rect rect) {
        float f7 = this.rawMaxShadowSize;
        float f8 = 1.5f * f7;
        this.contentBounds.set(rect.left + f7, rect.top + f8, rect.right - f7, rect.bottom - f8);
        Drawable wrappedDrawable = getWrappedDrawable();
        RectF rectF = this.contentBounds;
        wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        buildShadowCorners();
    }

    private void buildShadowCorners() {
        float f7 = this.cornerRadius;
        RectF rectF = new RectF(-f7, -f7, f7, f7);
        RectF rectF2 = new RectF(rectF);
        float f8 = this.shadowSize;
        rectF2.inset(-f8, -f8);
        Path path = this.cornerShadowPath;
        if (path == null) {
            this.cornerShadowPath = new Path();
        } else {
            path.reset();
        }
        this.cornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
        this.cornerShadowPath.moveTo(-this.cornerRadius, 0.0f);
        this.cornerShadowPath.rLineTo(-this.shadowSize, 0.0f);
        this.cornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
        this.cornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
        this.cornerShadowPath.close();
        float f9 = -rectF2.top;
        if (f9 > 0.0f) {
            float f10 = this.cornerRadius / f9;
            this.cornerShadowPaint.setShader(new RadialGradient(0.0f, 0.0f, f9, new int[]{0, this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{0.0f, f10, ((1.0f - f10) / 2.0f) + f10, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.edgeShadowPaint.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.edgeShadowPaint.setAntiAlias(false);
    }

    public static float calculateHorizontalPadding(float f7, float f8, boolean z6) {
        return z6 ? (float) (f7 + ((1.0d - COS_45) * f8)) : f7;
    }

    public static float calculateVerticalPadding(float f7, float f8, boolean z6) {
        return z6 ? (float) ((f7 * 1.5f) + ((1.0d - COS_45) * f8)) : f7 * 1.5f;
    }

    private void drawShadow(@o0 Canvas canvas) {
        int i7;
        float f7;
        int i8;
        float f8;
        float f9;
        float f10;
        int save = canvas.save();
        canvas.rotate(this.rotation, this.contentBounds.centerX(), this.contentBounds.centerY());
        float f11 = this.cornerRadius;
        float f12 = (-f11) - this.shadowSize;
        float f13 = f11 * 2.0f;
        boolean z6 = this.contentBounds.width() - f13 > 0.0f;
        boolean z7 = this.contentBounds.height() - f13 > 0.0f;
        float f14 = this.rawShadowSize;
        float f15 = f11 / ((f14 - (0.5f * f14)) + f11);
        float f16 = f11 / ((f14 - (0.25f * f14)) + f11);
        float f17 = f11 / ((f14 - (f14 * 1.0f)) + f11);
        int save2 = canvas.save();
        RectF rectF = this.contentBounds;
        canvas.translate(rectF.left + f11, rectF.top + f11);
        canvas.scale(f15, f16);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z6) {
            canvas.scale(1.0f / f15, 1.0f);
            i7 = save2;
            f7 = f17;
            i8 = save;
            f8 = f16;
            canvas.drawRect(0.0f, f12, this.contentBounds.width() - f13, -this.cornerRadius, this.edgeShadowPaint);
        } else {
            i7 = save2;
            f7 = f17;
            i8 = save;
            f8 = f16;
        }
        canvas.restoreToCount(i7);
        int save3 = canvas.save();
        RectF rectF2 = this.contentBounds;
        canvas.translate(rectF2.right - f11, rectF2.bottom - f11);
        float f18 = f7;
        canvas.scale(f15, f18);
        canvas.rotate(180.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z6) {
            canvas.scale(1.0f / f15, 1.0f);
            f9 = f8;
            f10 = f18;
            canvas.drawRect(0.0f, f12, this.contentBounds.width() - f13, (-this.cornerRadius) + this.shadowSize, this.edgeShadowPaint);
        } else {
            f9 = f8;
            f10 = f18;
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.contentBounds;
        canvas.translate(rectF3.left + f11, rectF3.bottom - f11);
        canvas.scale(f15, f10);
        canvas.rotate(270.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z7) {
            canvas.scale(1.0f / f10, 1.0f);
            canvas.drawRect(0.0f, f12, this.contentBounds.height() - f13, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.contentBounds;
        canvas.translate(rectF4.right - f11, rectF4.top + f11);
        float f19 = f9;
        canvas.scale(f15, f19);
        canvas.rotate(90.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z7) {
            canvas.scale(1.0f / f19, 1.0f);
            canvas.drawRect(0.0f, f12, this.contentBounds.height() - f13, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(i8);
    }

    private static int toEven(float f7) {
        int round = Math.round(f7);
        return round % 2 == 1 ? round - 1 : round;
    }

    public void draw(@o0 Canvas canvas) {
        if (this.dirty) {
            buildComponents(getBounds());
            this.dirty = false;
        }
        drawShadow(canvas);
        super.draw(canvas);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public float getMaxShadowSize() {
        return this.rawMaxShadowSize;
    }

    public float getMinHeight() {
        float f7 = this.rawMaxShadowSize;
        return (Math.max(f7, this.cornerRadius + ((f7 * 1.5f) / 2.0f)) * 2.0f) + (this.rawMaxShadowSize * 1.5f * 2.0f);
    }

    public float getMinWidth() {
        float f7 = this.rawMaxShadowSize;
        return (Math.max(f7, this.cornerRadius + (f7 / 2.0f)) * 2.0f) + (this.rawMaxShadowSize * 2.0f);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(@o0 Rect rect) {
        int ceil = (int) Math.ceil(calculateVerticalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        int ceil2 = (int) Math.ceil(calculateHorizontalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float getShadowSize() {
        return this.rawShadowSize;
    }

    public void onBoundsChange(Rect rect) {
        this.dirty = true;
    }

    public void setAddPaddingForCorners(boolean z6) {
        this.addPaddingForCorners = z6;
        invalidateSelf();
    }

    public void setAlpha(int i7) {
        super.setAlpha(i7);
        this.cornerShadowPaint.setAlpha(i7);
        this.edgeShadowPaint.setAlpha(i7);
    }

    public void setCornerRadius(float f7) {
        float round = Math.round(f7);
        if (this.cornerRadius == round) {
            return;
        }
        this.cornerRadius = round;
        this.dirty = true;
        invalidateSelf();
    }

    public void setMaxShadowSize(float f7) {
        setShadowSize(this.rawShadowSize, f7);
    }

    public final void setRotation(float f7) {
        if (this.rotation != f7) {
            this.rotation = f7;
            invalidateSelf();
        }
    }

    public void setShadowSize(float f7, float f8) {
        if (f7 >= 0.0f && f8 >= 0.0f) {
            float even = toEven(f7);
            float even2 = toEven(f8);
            if (even > even2) {
                if (!this.printedShadowClipWarning) {
                    this.printedShadowClipWarning = true;
                }
                even = even2;
            }
            if (this.rawShadowSize == even && this.rawMaxShadowSize == even2) {
                return;
            }
            this.rawShadowSize = even;
            this.rawMaxShadowSize = even2;
            this.shadowSize = Math.round(even * 1.5f);
            this.maxShadowSize = even2;
            this.dirty = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("invalid shadow size");
    }

    public void setShadowSize(float f7) {
        setShadowSize(f7, this.rawMaxShadowSize);
    }
}