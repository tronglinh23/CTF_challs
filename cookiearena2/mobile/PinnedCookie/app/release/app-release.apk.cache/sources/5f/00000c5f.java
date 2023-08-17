package com.google.android.material.shape;

import android.graphics.RectF;
import d.b1;
import d.o0;
import java.util.Arrays;

@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class ClampedCornerSize implements CornerSize {
    private final float target;

    public ClampedCornerSize(float f7) {
        this.target = f7;
    }

    @o0
    public static ClampedCornerSize createFromCornerSize(@o0 AbsoluteCornerSize absoluteCornerSize) {
        return new ClampedCornerSize(absoluteCornerSize.getCornerSize());
    }

    private static float getMaxCornerSize(@o0 RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClampedCornerSize) && this.target == ((ClampedCornerSize) obj).target;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@o0 RectF rectF) {
        return Math.min(this.target, getMaxCornerSize(rectF));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.target)});
    }
}