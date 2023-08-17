package com.google.android.material.shape;

import d.o0;
/* loaded from: classes.dex */
public class EdgeTreatment {
    public boolean forceIntersection() {
        return false;
    }

    @Deprecated
    public void getEdgePath(float f7, float f8, @o0 ShapePath shapePath) {
        getEdgePath(f7, f7 / 2.0f, f8, shapePath);
    }

    public void getEdgePath(float f7, float f8, float f9, @o0 ShapePath shapePath) {
        shapePath.lineTo(f7, 0.0f);
    }
}
