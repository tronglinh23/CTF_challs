package com.google.android.material.shape;

import d.o0;
/* loaded from: classes.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    float radius;

    public RoundedCornerTreatment() {
        this.radius = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@o0 ShapePath shapePath, float f7, float f8, float f9) {
        shapePath.reset(0.0f, f9 * f8, 180.0f, 180.0f - f7);
        float f10 = f9 * 2.0f * f8;
        shapePath.addArc(0.0f, 0.0f, f10, f10, 180.0f, f7);
    }

    @Deprecated
    public RoundedCornerTreatment(float f7) {
        this.radius = f7;
    }
}
