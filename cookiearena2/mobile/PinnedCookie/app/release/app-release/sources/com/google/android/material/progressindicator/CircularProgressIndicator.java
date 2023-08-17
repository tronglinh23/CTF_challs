package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.R;
import d.b1;
import d.f;
import d.o0;
import d.q0;
import d.u0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_CircularProgressIndicator;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @b1({b1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(@o0 Context context) {
        this(context, null);
    }

    private void initializeDrawables() {
        setIndeterminateDrawable(IndeterminateDrawable.createCircularDrawable(getContext(), (CircularProgressIndicatorSpec) this.spec));
        setProgressDrawable(DeterminateDrawable.createCircularDrawable(getContext(), (CircularProgressIndicatorSpec) this.spec));
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorDirection;
    }

    @u0
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorInset;
    }

    @u0
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorSize;
    }

    public void setIndicatorDirection(int i7) {
        ((CircularProgressIndicatorSpec) this.spec).indicatorDirection = i7;
        invalidate();
    }

    public void setIndicatorInset(@u0 int i7) {
        S s6 = this.spec;
        if (((CircularProgressIndicatorSpec) s6).indicatorInset != i7) {
            ((CircularProgressIndicatorSpec) s6).indicatorInset = i7;
            invalidate();
        }
    }

    public void setIndicatorSize(@u0 int i7) {
        int max = Math.max(i7, getTrackThickness() * 2);
        S s6 = this.spec;
        if (((CircularProgressIndicatorSpec) s6).indicatorSize != max) {
            ((CircularProgressIndicatorSpec) s6).indicatorSize = max;
            ((CircularProgressIndicatorSpec) s6).validateSpec();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i7) {
        super.setTrackThickness(i7);
        ((CircularProgressIndicatorSpec) this.spec).validateSpec();
    }

    public CircularProgressIndicator(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public CircularProgressIndicatorSpec createSpec(@o0 Context context, @o0 AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public CircularProgressIndicator(@o0 Context context, @q0 AttributeSet attributeSet, @f int i7) {
        super(context, attributeSet, i7, DEF_STYLE_RES);
        initializeDrawables();
    }
}
