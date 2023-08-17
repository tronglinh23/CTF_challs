package com.google.android.material.color.utilities;

import d.b1;

@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);
    private final double aw;

    /* renamed from: c  reason: collision with root package name */
    private final double f8037c;
    private final double fl;
    private final double flRoot;

    /* renamed from: n  reason: collision with root package name */
    private final double f8038n;
    private final double nbb;
    private final double nc;
    private final double ncb;
    private final double[] rgbD;

    /* renamed from: z  reason: collision with root package name */
    private final double f8039z;

    private ViewingConditions(double d7, double d8, double d9, double d10, double d11, double d12, double[] dArr, double d13, double d14, double d15) {
        this.f8038n = d7;
        this.aw = d8;
        this.nbb = d9;
        this.ncb = d10;
        this.f8037c = d11;
        this.nc = d12;
        this.rgbD = dArr;
        this.fl = d13;
        this.flRoot = d14;
        this.f8039z = d15;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d7) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d7, 2.0d, false);
    }

    public static ViewingConditions make(double[] dArr, double d7, double d8, double d9, boolean z6) {
        double max = Math.max(0.1d, d8);
        double[][] dArr2 = Cam16.XYZ_TO_CAM16RGB;
        double d10 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d11 = dArr3[0] * d10;
        double d12 = dArr[1];
        double d13 = d11 + (dArr3[1] * d12);
        double d14 = dArr[2];
        double d15 = d13 + (dArr3[2] * d14);
        double[] dArr4 = dArr2[1];
        double d16 = (dArr4[0] * d10) + (dArr4[1] * d12) + (dArr4[2] * d14);
        double[] dArr5 = dArr2[2];
        double d17 = (d10 * dArr5[0]) + (d12 * dArr5[1]) + (d14 * dArr5[2]);
        double d18 = (d9 / 10.0d) + 0.8d;
        double lerp = d18 >= 0.9d ? MathUtils.lerp(0.59d, 0.69d, (d18 - 0.9d) * 10.0d) : MathUtils.lerp(0.525d, 0.59d, (d18 - 0.8d) * 10.0d);
        double clampDouble = MathUtils.clampDouble(androidx.cardview.widget.g.f1896q, 1.0d, z6 ? 1.0d : (1.0d - (Math.exp(((-d7) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d18);
        double[] dArr6 = {(((100.0d / d15) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d16) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d17) * clampDouble) + 1.0d) - clampDouble};
        double d19 = 5.0d * d7;
        double d20 = 1.0d / (d19 + 1.0d);
        double d21 = d20 * d20 * d20 * d20;
        double d22 = 1.0d - d21;
        double cbrt = (d21 * d7) + (0.1d * d22 * d22 * Math.cbrt(d19));
        double yFromLstar = ColorUtils.yFromLstar(max) / dArr[1];
        double sqrt = Math.sqrt(yFromLstar) + 1.48d;
        double pow = 0.725d / Math.pow(yFromLstar, 0.2d);
        double pow2 = Math.pow(((dArr6[2] * cbrt) * d17) / 100.0d, 0.42d);
        double[] dArr7 = {Math.pow(((dArr6[0] * cbrt) * d15) / 100.0d, 0.42d), Math.pow(((dArr6[1] * cbrt) * d16) / 100.0d, 0.42d), pow2};
        double d23 = dArr7[0];
        double d24 = (d23 * 400.0d) / (d23 + 27.13d);
        double d25 = dArr7[1];
        return new ViewingConditions(yFromLstar, ((d24 * 2.0d) + ((d25 * 400.0d) / (d25 + 27.13d)) + (((400.0d * pow2) / (pow2 + 27.13d)) * 0.05d)) * pow, pow, pow, lerp, d18, dArr6, cbrt, Math.pow(cbrt, 0.25d), sqrt);
    }

    public double getAw() {
        return this.aw;
    }

    public double getC() {
        return this.f8037c;
    }

    public double getFl() {
        return this.fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    public double getN() {
        return this.f8038n;
    }

    public double getNbb() {
        return this.nbb;
    }

    public double getNc() {
        return this.nc;
    }

    public double getNcb() {
        return this.ncb;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    public double getZ() {
        return this.f8039z;
    }
}