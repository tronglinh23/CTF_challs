package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.cardview.widget.g;
import com.google.android.material.color.utilities.Contrast;
import d.b1;
import d.o0;
import d.x;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class RelativeCornerSize implements CornerSize {
    private final float percent;

    public RelativeCornerSize(@x(from = 0.0d, to = 1.0d) float f7) {
        this.percent = f7;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @o0
    public static RelativeCornerSize createFromCornerSize(@o0 RectF rectF, @o0 CornerSize cornerSize) {
        return cornerSize instanceof RelativeCornerSize ? (RelativeCornerSize) cornerSize : new RelativeCornerSize(cornerSize.getCornerSize(rectF) / getMaxCornerSize(rectF));
    }

    private static float getMaxCornerSize(@o0 RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelativeCornerSize) && this.percent == ((RelativeCornerSize) obj).percent;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@o0 RectF rectF) {
        return this.percent * getMaxCornerSize(rectF);
    }

    @x(from = g.f1896q, to = Contrast.RATIO_MIN)
    public float getRelativePercent() {
        return this.percent;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.percent)});
    }
}