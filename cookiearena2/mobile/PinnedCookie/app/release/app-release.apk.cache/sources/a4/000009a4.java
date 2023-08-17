package com.google.android.material.carousel;

import android.view.View;
import androidx.cardview.widget.g;
import com.google.android.material.color.utilities.Contrast;
import d.o0;
import d.x;

/* loaded from: classes.dex */
public abstract class CarouselStrategy {
    @x(from = g.f1896q, to = Contrast.RATIO_MIN)
    public static float getChildMaskPercentage(float f7, float f8, float f9) {
        return 1.0f - ((f7 - f9) / (f8 - f9));
    }

    public abstract KeylineState onFirstChildMeasuredWithMargins(@o0 Carousel carousel, @o0 View view);
}