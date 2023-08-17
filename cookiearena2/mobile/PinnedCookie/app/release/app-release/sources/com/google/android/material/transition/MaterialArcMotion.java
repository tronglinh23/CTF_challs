package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.transition.z;
import d.o0;
/* loaded from: classes.dex */
public final class MaterialArcMotion extends z {
    private static PointF getControlPoint(float f7, float f8, float f9, float f10) {
        return f8 > f10 ? new PointF(f9, f8) : new PointF(f7, f10);
    }

    @Override // androidx.transition.z
    @o0
    public Path getPath(float f7, float f8, float f9, float f10) {
        Path path = new Path();
        path.moveTo(f7, f8);
        PointF controlPoint = getControlPoint(f7, f8, f9, f10);
        path.quadTo(controlPoint.x, controlPoint.y, f9, f10);
        return path;
    }
}
