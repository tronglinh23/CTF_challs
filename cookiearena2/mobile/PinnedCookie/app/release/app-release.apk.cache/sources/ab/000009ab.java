package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;
import d.b1;
import d.l1;
import d.o0;
import d.q0;
import d.u;
import d.w0;

/* loaded from: classes.dex */
public class MaskableFrameLayout extends FrameLayout implements Maskable, Shapeable {
    private final RectF maskRect;
    private float maskXPercentage;
    private final MaskableDelegate maskableDelegate;
    @q0
    private OnMaskChangedListener onMaskChangedListener;
    @q0
    private Boolean savedForceCompatClippingEnabled;
    @o0
    private ShapeAppearanceModel shapeAppearanceModel;

    /* loaded from: classes.dex */
    public static abstract class MaskableDelegate {
        boolean forceCompatClippingEnabled;
        RectF maskBounds;
        @q0
        ShapeAppearanceModel shapeAppearanceModel;
        final Path shapePath;

        private MaskableDelegate() {
            this.forceCompatClippingEnabled = false;
            this.maskBounds = new RectF();
            this.shapePath = new Path();
        }

        private void updateShapePath() {
            if (this.maskBounds.isEmpty() || this.shapeAppearanceModel == null) {
                return;
            }
            ShapeAppearancePathProvider.getInstance().calculatePath(this.shapeAppearanceModel, 1.0f, this.maskBounds, this.shapePath);
        }

        public abstract void invalidateClippingMethod(View view);

        public boolean isForceCompatClippingEnabled() {
            return this.forceCompatClippingEnabled;
        }

        public void maybeClip(Canvas canvas, CanvasCompat.CanvasOperation canvasOperation) {
            if (!shouldUseCompatClipping() || this.shapePath.isEmpty()) {
                canvasOperation.run(canvas);
                return;
            }
            canvas.save();
            canvas.clipPath(this.shapePath);
            canvasOperation.run(canvas);
            canvas.restore();
        }

        public void onMaskChanged(View view, RectF rectF) {
            this.maskBounds = rectF;
            updateShapePath();
            invalidateClippingMethod(view);
        }

        public void onShapeAppearanceChanged(View view, @o0 ShapeAppearanceModel shapeAppearanceModel) {
            this.shapeAppearanceModel = shapeAppearanceModel;
            updateShapePath();
            invalidateClippingMethod(view);
        }

        public void setForceCompatClippingEnabled(View view, boolean z6) {
            if (z6 != this.forceCompatClippingEnabled) {
                this.forceCompatClippingEnabled = z6;
                invalidateClippingMethod(view);
            }
        }

        public abstract boolean shouldUseCompatClipping();
    }

    /* loaded from: classes.dex */
    public static class MaskableDelegateV14 extends MaskableDelegate {
        private MaskableDelegateV14() {
            super();
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegate
        public void invalidateClippingMethod(View view) {
            if (this.shapeAppearanceModel == null || this.maskBounds.isEmpty() || !shouldUseCompatClipping()) {
                return;
            }
            view.invalidate();
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegate
        public boolean shouldUseCompatClipping() {
            return true;
        }
    }

    @w0(22)
    /* loaded from: classes.dex */
    public static class MaskableDelegateV22 extends MaskableDelegate {
        private boolean isShapeRoundRect;

        public MaskableDelegateV22(View view) {
            super();
            this.isShapeRoundRect = false;
            initMaskOutlineProvider(view);
        }

        public float getCornerRadiusFromShapeAppearance(@o0 ShapeAppearanceModel shapeAppearanceModel, @o0 RectF rectF) {
            return shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF);
        }

        @u
        private void initMaskOutlineProvider(View view) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegateV22.1
                {
                    MaskableDelegateV22.this = this;
                }

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    MaskableDelegateV22 maskableDelegateV22 = MaskableDelegateV22.this;
                    if (maskableDelegateV22.shapeAppearanceModel == null || maskableDelegateV22.maskBounds.isEmpty()) {
                        return;
                    }
                    MaskableDelegateV22 maskableDelegateV222 = MaskableDelegateV22.this;
                    RectF rectF = maskableDelegateV222.maskBounds;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, maskableDelegateV222.getCornerRadiusFromShapeAppearance(maskableDelegateV222.shapeAppearanceModel, rectF));
                }
            });
        }

        private void updateIsShapeRoundRect() {
            ShapeAppearanceModel shapeAppearanceModel;
            if (this.maskBounds.isEmpty() || (shapeAppearanceModel = this.shapeAppearanceModel) == null) {
                return;
            }
            this.isShapeRoundRect = shapeAppearanceModel.isRoundRect(this.maskBounds);
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegate
        public void invalidateClippingMethod(View view) {
            updateIsShapeRoundRect();
            view.setClipToOutline(!shouldUseCompatClipping());
            if (shouldUseCompatClipping()) {
                view.invalidate();
            } else {
                view.invalidateOutline();
            }
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegate
        public boolean shouldUseCompatClipping() {
            return !this.isShapeRoundRect || this.forceCompatClippingEnabled;
        }
    }

    @w0(33)
    /* loaded from: classes.dex */
    public static class MaskableDelegateV33 extends MaskableDelegate {
        public MaskableDelegateV33(View view) {
            super();
            initMaskOutlineProvider(view);
        }

        @u
        private void initMaskOutlineProvider(View view) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegateV33.1
                {
                    MaskableDelegateV33.this = this;
                }

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (MaskableDelegateV33.this.shapePath.isEmpty()) {
                        return;
                    }
                    outline.setPath(MaskableDelegateV33.this.shapePath);
                }
            });
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegate
        public void invalidateClippingMethod(View view) {
            view.setClipToOutline(!shouldUseCompatClipping());
            if (shouldUseCompatClipping()) {
                view.invalidate();
            } else {
                view.invalidateOutline();
            }
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegate
        public boolean shouldUseCompatClipping() {
            return this.forceCompatClippingEnabled;
        }
    }

    public MaskableFrameLayout(@o0 Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(MaskableFrameLayout maskableFrameLayout, Canvas canvas) {
        maskableFrameLayout.lambda$dispatchDraw$1(canvas);
    }

    public static /* synthetic */ CornerSize b(CornerSize cornerSize) {
        return lambda$setShapeAppearanceModel$0(cornerSize);
    }

    private MaskableDelegate createMaskableDelegate() {
        return Build.VERSION.SDK_INT >= 33 ? new MaskableDelegateV33(this) : new MaskableDelegateV22(this);
    }

    public /* synthetic */ void lambda$dispatchDraw$1(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public static /* synthetic */ CornerSize lambda$setShapeAppearanceModel$0(CornerSize cornerSize) {
        return cornerSize instanceof AbsoluteCornerSize ? ClampedCornerSize.createFromCornerSize((AbsoluteCornerSize) cornerSize) : cornerSize;
    }

    private void onMaskChanged() {
        if (getWidth() == 0) {
            return;
        }
        float lerp = AnimationUtils.lerp(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.maskXPercentage);
        this.maskRect.set(lerp, 0.0f, getWidth() - lerp, getHeight());
        this.maskableDelegate.onMaskChanged(this, this.maskRect);
        OnMaskChangedListener onMaskChangedListener = this.onMaskChangedListener;
        if (onMaskChangedListener != null) {
            onMaskChangedListener.onMaskChanged(this.maskRect);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.maskableDelegate.maybeClip(canvas, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.carousel.a
            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public final void run(Canvas canvas2) {
                MaskableFrameLayout.a(MaskableFrameLayout.this, canvas2);
            }
        });
    }

    @Override // com.google.android.material.carousel.Maskable
    @o0
    public RectF getMaskRectF() {
        return this.maskRect;
    }

    @Override // com.google.android.material.carousel.Maskable
    public float getMaskXPercentage() {
        return this.maskXPercentage;
    }

    @Override // com.google.android.material.shape.Shapeable
    @o0
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.savedForceCompatClippingEnabled;
        if (bool != null) {
            this.maskableDelegate.setForceCompatClippingEnabled(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.savedForceCompatClippingEnabled = Boolean.valueOf(this.maskableDelegate.isForceCompatClippingEnabled());
        this.maskableDelegate.setForceCompatClippingEnabled(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        onMaskChanged();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.maskRect.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.maskRect.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @b1({b1.a.LIBRARY_GROUP})
    @l1
    public void setForceCompatClipping(boolean z6) {
        this.maskableDelegate.setForceCompatClippingEnabled(this, z6);
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setMaskXPercentage(float f7) {
        float d7 = x0.a.d(f7, 0.0f, 1.0f);
        if (this.maskXPercentage != d7) {
            this.maskXPercentage = d7;
            onMaskChanged();
        }
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setOnMaskChangedListener(@q0 OnMaskChangedListener onMaskChangedListener) {
        this.onMaskChangedListener = onMaskChangedListener;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@o0 ShapeAppearanceModel shapeAppearanceModel) {
        ShapeAppearanceModel withTransformedCornerSizes = shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.carousel.b
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                return MaskableFrameLayout.b(cornerSize);
            }
        });
        this.shapeAppearanceModel = withTransformedCornerSizes;
        this.maskableDelegate.onShapeAppearanceChanged(this, withTransformedCornerSizes);
    }

    public MaskableFrameLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.maskXPercentage = 0.0f;
        this.maskRect = new RectF();
        this.maskableDelegate = createMaskableDelegate();
        this.savedForceCompatClippingEnabled = null;
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context, attributeSet, i7, 0, 0).build());
    }
}