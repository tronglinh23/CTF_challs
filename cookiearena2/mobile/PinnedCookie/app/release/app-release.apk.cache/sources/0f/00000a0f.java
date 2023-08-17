package com.google.android.material.color.utilities;

import d.b1;

@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class Contrast {
    private static final double CONTRAST_RATIO_EPSILON = 0.04d;
    private static final double LUMINANCE_GAMUT_MAP_TOLERANCE = 0.4d;
    public static final double RATIO_30 = 3.0d;
    public static final double RATIO_45 = 4.5d;
    public static final double RATIO_70 = 7.0d;
    public static final double RATIO_MAX = 21.0d;
    public static final double RATIO_MIN = 1.0d;

    private Contrast() {
    }

    public static double darker(double d7, double d8) {
        if (d7 >= androidx.cardview.widget.g.f1896q && d7 <= 100.0d) {
            double yFromLstar = ColorUtils.yFromLstar(d7);
            double d9 = ((yFromLstar + 5.0d) / d8) - 5.0d;
            if (d9 >= androidx.cardview.widget.g.f1896q && d9 <= 100.0d) {
                double ratioOfYs = ratioOfYs(yFromLstar, d9);
                double abs = Math.abs(ratioOfYs - d8);
                if (ratioOfYs < d8 && abs > CONTRAST_RATIO_EPSILON) {
                    return -1.0d;
                }
                double lstarFromY = ColorUtils.lstarFromY(d9) - LUMINANCE_GAMUT_MAP_TOLERANCE;
                if (lstarFromY >= androidx.cardview.widget.g.f1896q && lstarFromY <= 100.0d) {
                    return lstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double darkerUnsafe(double d7, double d8) {
        return Math.max((double) androidx.cardview.widget.g.f1896q, darker(d7, d8));
    }

    public static double lighter(double d7, double d8) {
        if (d7 >= androidx.cardview.widget.g.f1896q && d7 <= 100.0d) {
            double yFromLstar = ColorUtils.yFromLstar(d7);
            double d9 = ((yFromLstar + 5.0d) * d8) - 5.0d;
            if (d9 >= androidx.cardview.widget.g.f1896q && d9 <= 100.0d) {
                double ratioOfYs = ratioOfYs(d9, yFromLstar);
                double abs = Math.abs(ratioOfYs - d8);
                if (ratioOfYs < d8 && abs > CONTRAST_RATIO_EPSILON) {
                    return -1.0d;
                }
                double lstarFromY = ColorUtils.lstarFromY(d9) + LUMINANCE_GAMUT_MAP_TOLERANCE;
                if (lstarFromY >= androidx.cardview.widget.g.f1896q && lstarFromY <= 100.0d) {
                    return lstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double lighterUnsafe(double d7, double d8) {
        double lighter = lighter(d7, d8);
        if (lighter < androidx.cardview.widget.g.f1896q) {
            return 100.0d;
        }
        return lighter;
    }

    public static double ratioOfTones(double d7, double d8) {
        return ratioOfYs(ColorUtils.yFromLstar(d7), ColorUtils.yFromLstar(d8));
    }

    public static double ratioOfYs(double d7, double d8) {
        double max = Math.max(d7, d8);
        if (max != d8) {
            d7 = d8;
        }
        return (max + 5.0d) / (d7 + 5.0d);
    }
}