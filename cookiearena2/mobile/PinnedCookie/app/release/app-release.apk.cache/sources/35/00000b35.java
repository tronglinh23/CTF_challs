package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import d.l;
import d.o0;
import p0.p0;

/* loaded from: classes.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(@o0 Context context) {
        this(MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean isThemeSurfaceColor(@l int i7) {
        return p0.B(i7, 255) == this.colorSurface;
    }

    public int calculateOverlayAlpha(float f7) {
        return Math.round(calculateOverlayAlphaFraction(f7) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f7) {
        if (this.displayDensity <= 0.0f || f7 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f7 / r0)) * FORMULA_MULTIPLIER) + FORMULA_OFFSET) / 100.0f, 1.0f);
    }

    @l
    public int compositeOverlay(@l int i7, float f7, @o0 View view) {
        return compositeOverlay(i7, f7 + getParentAbsoluteElevation(view));
    }

    @l
    public int compositeOverlayIfNeeded(@l int i7, float f7, @o0 View view) {
        return compositeOverlayIfNeeded(i7, f7 + getParentAbsoluteElevation(view));
    }

    @l
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f7, @o0 View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f7 + getParentAbsoluteElevation(view));
    }

    public float getParentAbsoluteElevation(@o0 View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    @l
    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    @l
    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    @l
    public int compositeOverlay(@l int i7, float f7) {
        int i8;
        float calculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f7);
        int alpha = Color.alpha(i7);
        int layer = MaterialColors.layer(p0.B(i7, 255), this.elevationOverlayColor, calculateOverlayAlphaFraction);
        if (calculateOverlayAlphaFraction > 0.0f && (i8 = this.elevationOverlayAccentColor) != 0) {
            layer = MaterialColors.layer(layer, p0.B(i8, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return p0.B(layer, alpha);
    }

    @l
    public int compositeOverlayIfNeeded(@l int i7, float f7) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i7)) ? compositeOverlay(i7, f7) : i7;
    }

    @l
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f7) {
        return compositeOverlayIfNeeded(this.colorSurface, f7);
    }

    public ElevationOverlayProvider(boolean z6, @l int i7, @l int i8, @l int i9, float f7) {
        this.elevationOverlayEnabled = z6;
        this.elevationOverlayColor = i7;
        this.elevationOverlayAccentColor = i8;
        this.colorSurface = i9;
        this.displayDensity = f7;
    }
}