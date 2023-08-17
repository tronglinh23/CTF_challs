package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import d.o0;
import d.x;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ElasticTabIndicatorInterpolator extends TabIndicatorInterpolator {
    private static float accInterp(@x(from = 0.0d, to = 1.0d) float f7) {
        return (float) (1.0d - Math.cos((f7 * 3.141592653589793d) / 2.0d));
    }

    private static float decInterp(@x(from = 0.0d, to = 1.0d) float f7) {
        return (float) Math.sin((f7 * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    public void updateIndicatorForOffset(TabLayout tabLayout, View view, View view2, float f7, @o0 Drawable drawable) {
        float decInterp;
        float accInterp;
        RectF calculateIndicatorWidthForTab = TabIndicatorInterpolator.calculateIndicatorWidthForTab(tabLayout, view);
        RectF calculateIndicatorWidthForTab2 = TabIndicatorInterpolator.calculateIndicatorWidthForTab(tabLayout, view2);
        if (calculateIndicatorWidthForTab.left < calculateIndicatorWidthForTab2.left) {
            decInterp = accInterp(f7);
            accInterp = decInterp(f7);
        } else {
            decInterp = decInterp(f7);
            accInterp = accInterp(f7);
        }
        drawable.setBounds(AnimationUtils.lerp((int) calculateIndicatorWidthForTab.left, (int) calculateIndicatorWidthForTab2.left, decInterp), drawable.getBounds().top, AnimationUtils.lerp((int) calculateIndicatorWidthForTab.right, (int) calculateIndicatorWidthForTab2.right, accInterp), drawable.getBounds().bottom);
    }
}
