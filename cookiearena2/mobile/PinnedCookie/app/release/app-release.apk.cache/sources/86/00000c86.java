package com.google.android.material.shape;

import d.o0;

/* loaded from: classes.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f7, boolean z6) {
        this.size = f7;
        this.inside = z6;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f7, float f8, float f9, @o0 ShapePath shapePath) {
        if (!this.inside) {
            float f10 = this.size;
            shapePath.lineTo(f8 - (f10 * f9), 0.0f, f8, (-f10) * f9);
            shapePath.lineTo(f8 + (this.size * f9), 0.0f, f7, 0.0f);
            return;
        }
        shapePath.lineTo(f8 - (this.size * f9), 0.0f);
        float f11 = this.size;
        shapePath.lineTo(f8, f11 * f9, (f11 * f9) + f8, 0.0f);
        shapePath.lineTo(f7, 0.0f);
    }
}