package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.j0;
import androidx.transition.r0;
import d.b1;
import d.o0;
import d.q0;
import java.util.Map;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class TextScale extends j0 {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    private void captureValues(@o0 r0 r0Var) {
        View view = r0Var.f6757b;
        if (view instanceof TextView) {
            r0Var.f6756a.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.j0
    public void captureEndValues(@o0 r0 r0Var) {
        captureValues(r0Var);
    }

    @Override // androidx.transition.j0
    public void captureStartValues(@o0 r0 r0Var) {
        captureValues(r0Var);
    }

    @Override // androidx.transition.j0
    public Animator createAnimator(@o0 ViewGroup viewGroup, @q0 r0 r0Var, @q0 r0 r0Var2) {
        if (r0Var == null || r0Var2 == null || !(r0Var.f6757b instanceof TextView)) {
            return null;
        }
        View view = r0Var2.f6757b;
        if (view instanceof TextView) {
            final TextView textView = (TextView) view;
            Map<String, Object> map = r0Var.f6756a;
            Map<String, Object> map2 = r0Var2.f6756a;
            float floatValue = map.get(PROPNAME_SCALE) != null ? ((Float) map.get(PROPNAME_SCALE)).floatValue() : 1.0f;
            float floatValue2 = map2.get(PROPNAME_SCALE) != null ? ((Float) map2.get(PROPNAME_SCALE)).floatValue() : 1.0f;
            if (floatValue == floatValue2) {
                return null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.TextScale.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    textView.setScaleX(floatValue3);
                    textView.setScaleY(floatValue3);
                }
            });
            return ofFloat;
        }
        return null;
    }
}
