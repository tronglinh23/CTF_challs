package com.google.android.material.color;

import com.google.android.material.R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.g1;
import d.n;
import d.o0;
import d.q0;
/* loaded from: classes.dex */
public class HarmonizedColorsOptions {
    @d.f
    private final int colorAttributeToHarmonizeWith;
    @q0
    private final HarmonizedColorAttributes colorAttributes;
    @n
    @o0
    private final int[] colorResourceIds;

    /* loaded from: classes.dex */
    public static class Builder {
        @q0
        private HarmonizedColorAttributes colorAttributes;
        @n
        @o0
        private int[] colorResourceIds = new int[0];
        @d.f
        private int colorAttributeToHarmonizeWith = R.attr.colorPrimary;

        @o0
        public HarmonizedColorsOptions build() {
            return new HarmonizedColorsOptions(this);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setColorAttributeToHarmonizeWith(@d.f int i7) {
            this.colorAttributeToHarmonizeWith = i7;
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setColorAttributes(@q0 HarmonizedColorAttributes harmonizedColorAttributes) {
            this.colorAttributes = harmonizedColorAttributes;
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder setColorResourceIds(@n @o0 int[] iArr) {
            this.colorResourceIds = iArr;
            return this;
        }
    }

    @o0
    public static HarmonizedColorsOptions createMaterialDefaults() {
        return new Builder().setColorAttributes(HarmonizedColorAttributes.createMaterialDefaults()).build();
    }

    @d.f
    public int getColorAttributeToHarmonizeWith() {
        return this.colorAttributeToHarmonizeWith;
    }

    @q0
    public HarmonizedColorAttributes getColorAttributes() {
        return this.colorAttributes;
    }

    @n
    @o0
    public int[] getColorResourceIds() {
        return this.colorResourceIds;
    }

    @g1
    public int getThemeOverlayResourceId(@g1 int i7) {
        HarmonizedColorAttributes harmonizedColorAttributes = this.colorAttributes;
        return (harmonizedColorAttributes == null || harmonizedColorAttributes.getThemeOverlay() == 0) ? i7 : this.colorAttributes.getThemeOverlay();
    }

    private HarmonizedColorsOptions(Builder builder) {
        this.colorResourceIds = builder.colorResourceIds;
        this.colorAttributes = builder.colorAttributes;
        this.colorAttributeToHarmonizeWith = builder.colorAttributeToHarmonizeWith;
    }
}
