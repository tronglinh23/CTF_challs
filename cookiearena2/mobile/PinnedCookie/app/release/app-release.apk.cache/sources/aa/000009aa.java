package com.google.android.material.carousel;

import android.graphics.RectF;
import androidx.cardview.widget.g;
import com.google.android.material.color.utilities.Contrast;
import d.o0;
import d.q0;
import d.x;

/* loaded from: classes.dex */
interface Maskable {
    @o0
    RectF getMaskRectF();

    @x(from = g.f1896q, to = Contrast.RATIO_MIN)
    float getMaskXPercentage();

    void setMaskXPercentage(@x(from = 0.0d, to = 1.0d) float f7);

    void setOnMaskChangedListener(@q0 OnMaskChangedListener onMaskChangedListener);
}