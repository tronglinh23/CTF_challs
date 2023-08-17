package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.b1;
import d.f;
import d.g1;
import d.o0;
import d.r;

/* loaded from: classes.dex */
public class ShapeAppearanceModel {
    public static final CornerSize PILL = new RelativeCornerSize(0.5f);
    EdgeTreatment bottomEdge;
    CornerTreatment bottomLeftCorner;
    CornerSize bottomLeftCornerSize;
    CornerTreatment bottomRightCorner;
    CornerSize bottomRightCornerSize;
    EdgeTreatment leftEdge;
    EdgeTreatment rightEdge;
    EdgeTreatment topEdge;
    CornerTreatment topLeftCorner;
    CornerSize topLeftCornerSize;
    CornerTreatment topRightCorner;
    CornerSize topRightCornerSize;

    /* loaded from: classes.dex */
    public static final class Builder {
        @o0
        private EdgeTreatment bottomEdge;
        @o0
        private CornerTreatment bottomLeftCorner;
        @o0
        private CornerSize bottomLeftCornerSize;
        @o0
        private CornerTreatment bottomRightCorner;
        @o0
        private CornerSize bottomRightCornerSize;
        @o0
        private EdgeTreatment leftEdge;
        @o0
        private EdgeTreatment rightEdge;
        @o0
        private EdgeTreatment topEdge;
        @o0
        private CornerTreatment topLeftCorner;
        @o0
        private CornerSize topLeftCornerSize;
        @o0
        private CornerTreatment topRightCorner;
        @o0
        private CornerSize topRightCornerSize;

        public Builder() {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        }

        private static float compatCornerTreatmentSize(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).radius;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).size;
            }
            return -1.0f;
        }

        @o0
        public ShapeAppearanceModel build() {
            return new ShapeAppearanceModel(this);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setAllCornerSizes(@o0 CornerSize cornerSize) {
            return setTopLeftCornerSize(cornerSize).setTopRightCornerSize(cornerSize).setBottomRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setAllCorners(int i7, @r float f7) {
            return setAllCorners(MaterialShapeUtils.createCornerTreatment(i7)).setAllCornerSizes(f7);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setAllEdges(@o0 EdgeTreatment edgeTreatment) {
            return setLeftEdge(edgeTreatment).setTopEdge(edgeTreatment).setRightEdge(edgeTreatment).setBottomEdge(edgeTreatment);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setBottomEdge(@o0 EdgeTreatment edgeTreatment) {
            this.bottomEdge = edgeTreatment;
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setBottomLeftCorner(int i7, @r float f7) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i7)).setBottomLeftCornerSize(f7);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setBottomLeftCornerSize(@r float f7) {
            this.bottomLeftCornerSize = new AbsoluteCornerSize(f7);
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setBottomRightCorner(int i7, @r float f7) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i7)).setBottomRightCornerSize(f7);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setBottomRightCornerSize(@r float f7) {
            this.bottomRightCornerSize = new AbsoluteCornerSize(f7);
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setLeftEdge(@o0 EdgeTreatment edgeTreatment) {
            this.leftEdge = edgeTreatment;
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setRightEdge(@o0 EdgeTreatment edgeTreatment) {
            this.rightEdge = edgeTreatment;
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setTopEdge(@o0 EdgeTreatment edgeTreatment) {
            this.topEdge = edgeTreatment;
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setTopLeftCorner(int i7, @r float f7) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i7)).setTopLeftCornerSize(f7);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setTopLeftCornerSize(@r float f7) {
            this.topLeftCornerSize = new AbsoluteCornerSize(f7);
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setTopRightCorner(int i7, @r float f7) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i7)).setTopRightCornerSize(f7);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setTopRightCornerSize(@r float f7) {
            this.topRightCornerSize = new AbsoluteCornerSize(f7);
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setBottomLeftCornerSize(@o0 CornerSize cornerSize) {
            this.bottomLeftCornerSize = cornerSize;
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setBottomRightCornerSize(@o0 CornerSize cornerSize) {
            this.bottomRightCornerSize = cornerSize;
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setTopLeftCornerSize(@o0 CornerSize cornerSize) {
            this.topLeftCornerSize = cornerSize;
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setTopRightCornerSize(@o0 CornerSize cornerSize) {
            this.topRightCornerSize = cornerSize;
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setAllCorners(@o0 CornerTreatment cornerTreatment) {
            return setTopLeftCorner(cornerTreatment).setTopRightCorner(cornerTreatment).setBottomRightCorner(cornerTreatment).setBottomLeftCorner(cornerTreatment);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setBottomLeftCorner(int i7, @o0 CornerSize cornerSize) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i7)).setBottomLeftCornerSize(cornerSize);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setBottomRightCorner(int i7, @o0 CornerSize cornerSize) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i7)).setBottomRightCornerSize(cornerSize);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setTopLeftCorner(int i7, @o0 CornerSize cornerSize) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i7)).setTopLeftCornerSize(cornerSize);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setTopRightCorner(int i7, @o0 CornerSize cornerSize) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i7)).setTopRightCornerSize(cornerSize);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setAllCornerSizes(@r float f7) {
            return setTopLeftCornerSize(f7).setTopRightCornerSize(f7).setBottomRightCornerSize(f7).setBottomLeftCornerSize(f7);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setBottomLeftCorner(@o0 CornerTreatment cornerTreatment) {
            this.bottomLeftCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setBottomLeftCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setBottomRightCorner(@o0 CornerTreatment cornerTreatment) {
            this.bottomRightCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setBottomRightCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setTopLeftCorner(@o0 CornerTreatment cornerTreatment) {
            this.topLeftCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setTopLeftCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setTopRightCorner(@o0 CornerTreatment cornerTreatment) {
            this.topRightCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setTopRightCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        public Builder(@o0 ShapeAppearanceModel shapeAppearanceModel) {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.topLeftCorner = shapeAppearanceModel.topLeftCorner;
            this.topRightCorner = shapeAppearanceModel.topRightCorner;
            this.bottomRightCorner = shapeAppearanceModel.bottomRightCorner;
            this.bottomLeftCorner = shapeAppearanceModel.bottomLeftCorner;
            this.topLeftCornerSize = shapeAppearanceModel.topLeftCornerSize;
            this.topRightCornerSize = shapeAppearanceModel.topRightCornerSize;
            this.bottomRightCornerSize = shapeAppearanceModel.bottomRightCornerSize;
            this.bottomLeftCornerSize = shapeAppearanceModel.bottomLeftCornerSize;
            this.topEdge = shapeAppearanceModel.topEdge;
            this.rightEdge = shapeAppearanceModel.rightEdge;
            this.bottomEdge = shapeAppearanceModel.bottomEdge;
            this.leftEdge = shapeAppearanceModel.leftEdge;
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public interface CornerSizeUnaryOperator {
        @o0
        CornerSize apply(@o0 CornerSize cornerSize);
    }

    @o0
    public static Builder builder() {
        return new Builder();
    }

    @o0
    private static CornerSize getCornerSize(TypedArray typedArray, int i7, @o0 CornerSize cornerSize) {
        TypedValue peekValue = typedArray.peekValue(i7);
        if (peekValue == null) {
            return cornerSize;
        }
        int i8 = peekValue.type;
        return i8 == 5 ? new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i8 == 6 ? new RelativeCornerSize(peekValue.getFraction(1.0f, 1.0f)) : cornerSize;
    }

    @o0
    public EdgeTreatment getBottomEdge() {
        return this.bottomEdge;
    }

    @o0
    public CornerTreatment getBottomLeftCorner() {
        return this.bottomLeftCorner;
    }

    @o0
    public CornerSize getBottomLeftCornerSize() {
        return this.bottomLeftCornerSize;
    }

    @o0
    public CornerTreatment getBottomRightCorner() {
        return this.bottomRightCorner;
    }

    @o0
    public CornerSize getBottomRightCornerSize() {
        return this.bottomRightCornerSize;
    }

    @o0
    public EdgeTreatment getLeftEdge() {
        return this.leftEdge;
    }

    @o0
    public EdgeTreatment getRightEdge() {
        return this.rightEdge;
    }

    @o0
    public EdgeTreatment getTopEdge() {
        return this.topEdge;
    }

    @o0
    public CornerTreatment getTopLeftCorner() {
        return this.topLeftCorner;
    }

    @o0
    public CornerSize getTopLeftCornerSize() {
        return this.topLeftCornerSize;
    }

    @o0
    public CornerTreatment getTopRightCorner() {
        return this.topRightCorner;
    }

    @o0
    public CornerSize getTopRightCornerSize() {
        return this.topRightCornerSize;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean isRoundRect(@o0 RectF rectF) {
        boolean z6 = this.leftEdge.getClass().equals(EdgeTreatment.class) && this.rightEdge.getClass().equals(EdgeTreatment.class) && this.topEdge.getClass().equals(EdgeTreatment.class) && this.bottomEdge.getClass().equals(EdgeTreatment.class);
        float cornerSize = this.topLeftCornerSize.getCornerSize(rectF);
        return z6 && ((this.topRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.topRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomLeftCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomLeftCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0) && ((this.topRightCorner instanceof RoundedCornerTreatment) && (this.topLeftCorner instanceof RoundedCornerTreatment) && (this.bottomRightCorner instanceof RoundedCornerTreatment) && (this.bottomLeftCorner instanceof RoundedCornerTreatment));
    }

    @o0
    public Builder toBuilder() {
        return new Builder(this);
    }

    @o0
    public ShapeAppearanceModel withCornerSize(float f7) {
        return toBuilder().setAllCornerSizes(f7).build();
    }

    @b1({b1.a.LIBRARY_GROUP})
    @o0
    public ShapeAppearanceModel withTransformedCornerSizes(@o0 CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return toBuilder().setTopLeftCornerSize(cornerSizeUnaryOperator.apply(getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeUnaryOperator.apply(getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeUnaryOperator.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeUnaryOperator.apply(getBottomRightCornerSize())).build();
    }

    private ShapeAppearanceModel(@o0 Builder builder) {
        this.topLeftCorner = builder.topLeftCorner;
        this.topRightCorner = builder.topRightCorner;
        this.bottomRightCorner = builder.bottomRightCorner;
        this.bottomLeftCorner = builder.bottomLeftCorner;
        this.topLeftCornerSize = builder.topLeftCornerSize;
        this.topRightCornerSize = builder.topRightCornerSize;
        this.bottomRightCornerSize = builder.bottomRightCornerSize;
        this.bottomLeftCornerSize = builder.bottomLeftCornerSize;
        this.topEdge = builder.topEdge;
        this.rightEdge = builder.rightEdge;
        this.bottomEdge = builder.bottomEdge;
        this.leftEdge = builder.leftEdge;
    }

    @o0
    public static Builder builder(@o0 Context context, AttributeSet attributeSet, @f int i7, @g1 int i8) {
        return builder(context, attributeSet, i7, i8, 0);
    }

    @o0
    public ShapeAppearanceModel withCornerSize(@o0 CornerSize cornerSize) {
        return toBuilder().setAllCornerSizes(cornerSize).build();
    }

    @o0
    public static Builder builder(@o0 Context context, AttributeSet attributeSet, @f int i7, @g1 int i8, int i9) {
        return builder(context, attributeSet, i7, i8, new AbsoluteCornerSize(i9));
    }

    @o0
    public static Builder builder(@o0 Context context, AttributeSet attributeSet, @f int i7, @g1 int i8, @o0 CornerSize cornerSize) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i7, i8);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return builder(context, resourceId, resourceId2, cornerSize);
    }

    @o0
    public static Builder builder(Context context, @g1 int i7, @g1 int i8) {
        return builder(context, i7, i8, 0);
    }

    @o0
    private static Builder builder(Context context, @g1 int i7, @g1 int i8, int i9) {
        return builder(context, i7, i8, new AbsoluteCornerSize(i9));
    }

    @o0
    private static Builder builder(Context context, @g1 int i7, @g1 int i8, @o0 CornerSize cornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i7);
        if (i8 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i8);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.ShapeAppearance);
        try {
            int i9 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i10 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i9);
            int i11 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i9);
            int i12 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i9);
            int i13 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i9);
            CornerSize cornerSize2 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, cornerSize);
            CornerSize cornerSize3 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, cornerSize2);
            CornerSize cornerSize4 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, cornerSize2);
            CornerSize cornerSize5 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, cornerSize2);
            return new Builder().setTopLeftCorner(i10, cornerSize3).setTopRightCorner(i11, cornerSize4).setBottomRightCorner(i12, cornerSize5).setBottomLeftCorner(i13, getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, cornerSize2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ShapeAppearanceModel() {
        this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
    }
}