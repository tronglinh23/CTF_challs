package com.google.android.material.color;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.material.color.DynamicColors;
import com.google.android.material.color.utilities.QuantizerCelebi;
import com.google.android.material.color.utilities.Score;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.b1;
import d.g1;
import d.o0;
import d.q0;
/* loaded from: classes.dex */
public class DynamicColorsOptions {
    private static final DynamicColors.Precondition ALWAYS_ALLOW = new DynamicColors.Precondition() { // from class: com.google.android.material.color.DynamicColorsOptions.1
        @Override // com.google.android.material.color.DynamicColors.Precondition
        public boolean shouldApplyDynamicColors(@o0 Activity activity, int i7) {
            return true;
        }
    };
    private static final DynamicColors.OnAppliedCallback NO_OP_CALLBACK = new DynamicColors.OnAppliedCallback() { // from class: com.google.android.material.color.DynamicColorsOptions.2
        @Override // com.google.android.material.color.DynamicColors.OnAppliedCallback
        public void onApplied(@o0 Activity activity) {
        }
    };
    @q0
    private Integer contentBasedSeedColor;
    @o0
    private final DynamicColors.OnAppliedCallback onAppliedCallback;
    @o0
    private final DynamicColors.Precondition precondition;
    @g1
    private final int themeOverlay;

    /* loaded from: classes.dex */
    public static class Builder {
        @q0
        private Bitmap contentBasedSource;
        @g1
        private int themeOverlay;
        @o0
        private DynamicColors.Precondition precondition = DynamicColorsOptions.ALWAYS_ALLOW;
        @o0
        private DynamicColors.OnAppliedCallback onAppliedCallback = DynamicColorsOptions.NO_OP_CALLBACK;

        @o0
        public DynamicColorsOptions build() {
            return new DynamicColorsOptions(this);
        }

        @CanIgnoreReturnValue
        @b1({b1.a.LIBRARY_GROUP})
        @o0
        public Builder setContentBasedSource(@o0 Bitmap bitmap) {
            this.contentBasedSource = bitmap;
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setOnAppliedCallback(@o0 DynamicColors.OnAppliedCallback onAppliedCallback) {
            this.onAppliedCallback = onAppliedCallback;
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setPrecondition(@o0 DynamicColors.Precondition precondition) {
            this.precondition = precondition;
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setThemeOverlay(@g1 int i7) {
            this.themeOverlay = i7;
            return this;
        }
    }

    private static int extractSeedColorFromImage(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return Score.score(QuantizerCelebi.quantize(iArr, 128)).get(0).intValue();
    }

    @q0
    public Integer getContentBasedSeedColor() {
        return this.contentBasedSeedColor;
    }

    @o0
    public DynamicColors.OnAppliedCallback getOnAppliedCallback() {
        return this.onAppliedCallback;
    }

    @o0
    public DynamicColors.Precondition getPrecondition() {
        return this.precondition;
    }

    @g1
    public int getThemeOverlay() {
        return this.themeOverlay;
    }

    private DynamicColorsOptions(Builder builder) {
        this.themeOverlay = builder.themeOverlay;
        this.precondition = builder.precondition;
        this.onAppliedCallback = builder.onAppliedCallback;
        if (builder.contentBasedSource != null) {
            this.contentBasedSeedColor = Integer.valueOf(extractSeedColorFromImage(builder.contentBasedSource));
        }
    }
}
