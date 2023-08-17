package com.google.android.material.shape;

import android.graphics.RectF;
import d.o0;
/* loaded from: classes.dex */
public class CornerTreatment {
    @Deprecated
    public void getCornerPath(float f7, float f8, @o0 ShapePath shapePath) {
    }

    public void getCornerPath(@o0 ShapePath shapePath, float f7, float f8, float f9) {
        getCornerPath(f7, f8, shapePath);
    }

    public void getCornerPath(@o0 ShapePath shapePath, float f7, float f8, @o0 RectF rectF, @o0 CornerSize cornerSize) {
        getCornerPath(shapePath, f7, f8, cornerSize.getCornerSize(rectF));
    }
}
