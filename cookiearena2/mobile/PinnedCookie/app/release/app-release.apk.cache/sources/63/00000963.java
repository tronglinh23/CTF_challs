package com.google.android.material.bottomappbar;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;
import d.b1;
import d.o0;
import d.x;

/* loaded from: classes.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize = -1.0f;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f7, float f8, float f9) {
        this.fabMargin = f7;
        this.roundedCornerRadius = f8;
        setCradleVerticalOffset(f9);
        this.horizontalOffset = 0.0f;
    }

    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f7, float f8, float f9, @o0 ShapePath shapePath) {
        float f10;
        float f11;
        float f12 = this.fabDiameter;
        if (f12 == 0.0f) {
            shapePath.lineTo(f7, 0.0f);
            return;
        }
        float f13 = ((this.fabMargin * 2.0f) + f12) / 2.0f;
        float f14 = f9 * this.roundedCornerRadius;
        float f15 = f8 + this.horizontalOffset;
        float f16 = (this.cradleVerticalOffset * f9) + ((1.0f - f9) * f13);
        if (f16 / f13 >= 1.0f) {
            shapePath.lineTo(f7, 0.0f);
            return;
        }
        float f17 = this.fabCornerSize;
        float f18 = f17 * f9;
        boolean z6 = f17 == -1.0f || Math.abs((f17 * 2.0f) - f12) < 0.1f;
        if (z6) {
            f10 = f16;
            f11 = 0.0f;
        } else {
            f11 = ROUNDED_CORNER_FAB_OFFSET;
            f10 = 0.0f;
        }
        float f19 = f13 + f14;
        float f20 = f10 + f14;
        float sqrt = (float) Math.sqrt((f19 * f19) - (f20 * f20));
        float f21 = f15 - sqrt;
        float f22 = f15 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f20));
        float f23 = (90.0f - degrees) + f11;
        shapePath.lineTo(f21, 0.0f);
        float f24 = f14 * 2.0f;
        shapePath.addArc(f21 - f14, 0.0f, f21 + f14, f24, 270.0f, degrees);
        if (z6) {
            shapePath.addArc(f15 - f13, (-f13) - f10, f15 + f13, f13 - f10, 180.0f - f23, (f23 * 2.0f) - 180.0f);
        } else {
            float f25 = this.fabMargin;
            float f26 = f18 * 2.0f;
            float f27 = f15 - f13;
            shapePath.addArc(f27, -(f18 + f25), f27 + f25 + f26, f25 + f18, 180.0f - f23, ((f23 * 2.0f) - 180.0f) / 2.0f);
            float f28 = f15 + f13;
            float f29 = this.fabMargin;
            shapePath.lineTo(f28 - ((f29 / 2.0f) + f18), f29 + f18);
            float f30 = this.fabMargin;
            shapePath.addArc(f28 - (f26 + f30), -(f18 + f30), f28, f30 + f18, 90.0f, f23 - 90.0f);
        }
        shapePath.addArc(f22 - f14, 0.0f, f22 + f14, f24, 270.0f - degrees, degrees);
        shapePath.lineTo(f7, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.fabCornerSize;
    }

    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public float getFabDiameter() {
        return this.fabDiameter;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    public void setCradleVerticalOffset(@x(from = 0.0d) float f7) {
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.cradleVerticalOffset = f7;
    }

    public void setFabCornerSize(float f7) {
        this.fabCornerSize = f7;
    }

    public void setFabCradleMargin(float f7) {
        this.fabMargin = f7;
    }

    public void setFabCradleRoundedCornerRadius(float f7) {
        this.roundedCornerRadius = f7;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void setFabDiameter(float f7) {
        this.fabDiameter = f7;
    }

    public void setHorizontalOffset(float f7) {
        this.horizontalOffset = f7;
    }
}