package com.google.android.material.transition.platform;

import android.graphics.RectF;
import d.w0;

@w0(21)
/* loaded from: classes.dex */
class FitModeEvaluators {
    private static final FitModeEvaluator WIDTH = new FitModeEvaluator() { // from class: com.google.android.material.transition.platform.FitModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public void applyMask(RectF rectF, float f7, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.currentEndHeight - fitModeResult.currentStartHeight) * f7;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public FitModeResult evaluate(float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
            float lerp = TransitionUtils.lerp(f10, f12, f8, f9, f7, true);
            float f14 = lerp / f10;
            float f15 = lerp / f12;
            return new FitModeResult(f14, f15, lerp, f11 * f14, lerp, f13 * f15);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartHeight > fitModeResult.currentEndHeight;
        }
    };
    private static final FitModeEvaluator HEIGHT = new FitModeEvaluator() { // from class: com.google.android.material.transition.platform.FitModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public void applyMask(RectF rectF, float f7, FitModeResult fitModeResult) {
            float abs = (Math.abs(fitModeResult.currentEndWidth - fitModeResult.currentStartWidth) / 2.0f) * f7;
            rectF.left += abs;
            rectF.right -= abs;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public FitModeResult evaluate(float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
            float lerp = TransitionUtils.lerp(f11, f13, f8, f9, f7, true);
            float f14 = lerp / f11;
            float f15 = lerp / f13;
            return new FitModeResult(f14, f15, f10 * f14, lerp, f12 * f15, lerp);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartWidth > fitModeResult.currentEndWidth;
        }
    };

    private FitModeEvaluators() {
    }

    public static FitModeEvaluator get(int i7, boolean z6, RectF rectF, RectF rectF2) {
        if (i7 == 0) {
            return shouldAutoFitToWidth(z6, rectF, rectF2) ? WIDTH : HEIGHT;
        } else if (i7 != 1) {
            if (i7 == 2) {
                return HEIGHT;
            }
            throw new IllegalArgumentException("Invalid fit mode: " + i7);
        } else {
            return WIDTH;
        }
    }

    private static boolean shouldAutoFitToWidth(boolean z6, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f7 = (height2 * width) / width2;
        float f8 = (width2 * height) / width;
        if (z6) {
            if (f7 >= height) {
                return true;
            }
        } else if (f8 >= height2) {
            return true;
        }
        return false;
    }
}