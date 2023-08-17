package com.google.android.material.shape;

import android.graphics.RectF;
import d.b1;
import d.o0;
import java.util.Arrays;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class AdjustedCornerSize implements CornerSize {
    private final float adjustment;
    private final CornerSize other;

    public AdjustedCornerSize(float f7, @o0 CornerSize cornerSize) {
        while (cornerSize instanceof AdjustedCornerSize) {
            cornerSize = ((AdjustedCornerSize) cornerSize).other;
            f7 += ((AdjustedCornerSize) cornerSize).adjustment;
        }
        this.other = cornerSize;
        this.adjustment = f7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdjustedCornerSize) {
            AdjustedCornerSize adjustedCornerSize = (AdjustedCornerSize) obj;
            return this.other.equals(adjustedCornerSize.other) && this.adjustment == adjustedCornerSize.adjustment;
        }
        return false;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@o0 RectF rectF) {
        return Math.max(0.0f, this.other.getCornerSize(rectF) + this.adjustment);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.other, Float.valueOf(this.adjustment)});
    }
}
