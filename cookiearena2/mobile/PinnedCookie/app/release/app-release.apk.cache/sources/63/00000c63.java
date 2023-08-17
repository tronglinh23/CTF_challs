package com.google.android.material.shape;

import d.o0;

/* loaded from: classes.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@o0 ShapePath shapePath, float f7, float f8, float f9) {
        shapePath.reset(0.0f, f9 * f8, 180.0f, 180.0f - f7);
        double d7 = f9;
        double d8 = f8;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f7)) * d7 * d8), (float) (Math.sin(Math.toRadians(90.0f - f7)) * d7 * d8));
    }

    @Deprecated
    public CutCornerTreatment(float f7) {
        this.size = f7;
    }
}