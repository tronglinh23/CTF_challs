package com.google.android.material.color;

import com.google.android.material.R;
import d.g1;
import d.o0;

/* loaded from: classes.dex */
public final class HarmonizedColorAttributes {
    private static final int[] HARMONIZED_MATERIAL_ATTRIBUTES = {R.attr.colorError, R.attr.colorOnError, R.attr.colorErrorContainer, R.attr.colorOnErrorContainer};
    private final int[] attributes;
    @g1
    private final int themeOverlay;

    private HarmonizedColorAttributes(@d.f @o0 int[] iArr, @g1 int i7) {
        if (i7 != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.attributes = iArr;
        this.themeOverlay = i7;
    }

    @o0
    public static HarmonizedColorAttributes create(@d.f @o0 int[] iArr) {
        return new HarmonizedColorAttributes(iArr, 0);
    }

    @o0
    public static HarmonizedColorAttributes createMaterialDefaults() {
        return create(HARMONIZED_MATERIAL_ATTRIBUTES, R.style.ThemeOverlay_Material3_HarmonizedColors);
    }

    @o0
    public int[] getAttributes() {
        return this.attributes;
    }

    @g1
    public int getThemeOverlay() {
        return this.themeOverlay;
    }

    @o0
    public static HarmonizedColorAttributes create(@d.f @o0 int[] iArr, @g1 int i7) {
        return new HarmonizedColorAttributes(iArr, i7);
    }
}