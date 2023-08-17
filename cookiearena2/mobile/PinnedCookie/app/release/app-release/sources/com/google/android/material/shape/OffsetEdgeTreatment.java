package com.google.android.material.shape;

import d.o0;
/* loaded from: classes.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {
    private final float offset;
    private final EdgeTreatment other;

    public OffsetEdgeTreatment(@o0 EdgeTreatment edgeTreatment, float f7) {
        this.other = edgeTreatment;
        this.offset = f7;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public boolean forceIntersection() {
        return this.other.forceIntersection();
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f7, float f8, float f9, @o0 ShapePath shapePath) {
        this.other.getEdgePath(f7, f8 - this.offset, f9, shapePath);
    }
}
