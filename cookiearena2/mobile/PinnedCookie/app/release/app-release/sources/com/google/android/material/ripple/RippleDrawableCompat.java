package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import d.b1;
import d.l;
import d.o0;
import d.q0;
import q0.n;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class RippleDrawableCompat extends Drawable implements Shapeable, n {
    private RippleDrawableCompatState drawableState;

    /* loaded from: classes.dex */
    public static final class RippleDrawableCompatState extends Drawable.ConstantState {
        @o0
        MaterialShapeDrawable delegate;
        boolean shouldDrawDelegate;

        public RippleDrawableCompatState(MaterialShapeDrawable materialShapeDrawable) {
            this.delegate = materialShapeDrawable;
            this.shouldDrawDelegate = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public RippleDrawableCompat newDrawable() {
            return new RippleDrawableCompat(new RippleDrawableCompatState(this));
        }

        public RippleDrawableCompatState(@o0 RippleDrawableCompatState rippleDrawableCompatState) {
            this.delegate = (MaterialShapeDrawable) rippleDrawableCompatState.delegate.getConstantState().newDrawable();
            this.shouldDrawDelegate = rippleDrawableCompatState.shouldDrawDelegate;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RippleDrawableCompatState rippleDrawableCompatState = this.drawableState;
        if (rippleDrawableCompatState.shouldDrawDelegate) {
            rippleDrawableCompatState.delegate.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @q0
    public Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.drawableState.delegate.getOpacity();
    }

    @Override // com.google.android.material.shape.Shapeable
    @o0
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.drawableState.delegate.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@o0 Rect rect) {
        super.onBoundsChange(rect);
        this.drawableState.delegate.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@o0 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.drawableState.delegate.setState(iArr)) {
            onStateChange = true;
        }
        boolean shouldDrawRippleCompat = RippleUtils.shouldDrawRippleCompat(iArr);
        RippleDrawableCompatState rippleDrawableCompatState = this.drawableState;
        if (rippleDrawableCompatState.shouldDrawDelegate != shouldDrawRippleCompat) {
            rippleDrawableCompatState.shouldDrawDelegate = shouldDrawRippleCompat;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.drawableState.delegate.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@q0 ColorFilter colorFilter) {
        this.drawableState.delegate.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@o0 ShapeAppearanceModel shapeAppearanceModel) {
        this.drawableState.delegate.setShapeAppearanceModel(shapeAppearanceModel);
    }

    @Override // android.graphics.drawable.Drawable, q0.n
    public void setTint(@l int i7) {
        this.drawableState.delegate.setTint(i7);
    }

    @Override // android.graphics.drawable.Drawable, q0.n
    public void setTintList(@q0 ColorStateList colorStateList) {
        this.drawableState.delegate.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, q0.n
    public void setTintMode(@q0 PorterDuff.Mode mode) {
        this.drawableState.delegate.setTintMode(mode);
    }

    public RippleDrawableCompat(ShapeAppearanceModel shapeAppearanceModel) {
        this(new RippleDrawableCompatState(new MaterialShapeDrawable(shapeAppearanceModel)));
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public RippleDrawableCompat mutate() {
        this.drawableState = new RippleDrawableCompatState(this.drawableState);
        return this;
    }

    private RippleDrawableCompat(RippleDrawableCompatState rippleDrawableCompatState) {
        this.drawableState = rippleDrawableCompatState;
    }
}
