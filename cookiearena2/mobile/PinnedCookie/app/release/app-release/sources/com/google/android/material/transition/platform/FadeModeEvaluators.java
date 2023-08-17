package com.google.android.material.transition.platform;

import d.w0;
@w0(21)
/* loaded from: classes.dex */
class FadeModeEvaluators {
    private static final FadeModeEvaluator IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f7, float f8, float f9, float f10) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f8, f9, f7));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f7, float f8, float f9, float f10) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f8, f9, f7), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f7, float f8, float f9, float f10) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f8, f9, f7), TransitionUtils.lerp(0, 255, f8, f9, f7));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f7, float f8, float f9, float f10) {
            float f11 = ((f9 - f8) * f10) + f8;
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f8, f11, f7), TransitionUtils.lerp(0, 255, f11, f9, f7));
        }
    };

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int i7, boolean z6) {
        if (i7 == 0) {
            return z6 ? IN : OUT;
        } else if (i7 == 1) {
            return z6 ? OUT : IN;
        } else if (i7 != 2) {
            if (i7 == 3) {
                return THROUGH;
            }
            throw new IllegalArgumentException("Invalid fade mode: " + i7);
        } else {
            return CROSS;
        }
    }
}
