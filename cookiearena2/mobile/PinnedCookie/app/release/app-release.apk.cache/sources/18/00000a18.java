package com.google.android.material.color.utilities;

import d.b1;

@d.b1({b1.a.f8134l})
/* loaded from: classes.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static double clampDouble(double d7, double d8, double d9) {
        return d9 < d7 ? d7 : d9 > d8 ? d8 : d9;
    }

    public static int clampInt(int i7, int i8, int i9) {
        return i9 < i7 ? i7 : i9 > i8 ? i8 : i9;
    }

    public static double differenceDegrees(double d7, double d8) {
        return 180.0d - Math.abs(Math.abs(d7 - d8) - 180.0d);
    }

    public static double lerp(double d7, double d8, double d9) {
        return ((1.0d - d9) * d7) + (d9 * d8);
    }

    public static double[] matrixMultiply(double[] dArr, double[][] dArr2) {
        double d7 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d8 = dArr3[0] * d7;
        double d9 = dArr[1];
        double d10 = d8 + (dArr3[1] * d9);
        double d11 = dArr[2];
        double d12 = d10 + (dArr3[2] * d11);
        double[] dArr4 = dArr2[1];
        double d13 = (dArr4[0] * d7) + (dArr4[1] * d9) + (dArr4[2] * d11);
        double[] dArr5 = dArr2[2];
        return new double[]{d12, d13, (d7 * dArr5[0]) + (d9 * dArr5[1]) + (d11 * dArr5[2])};
    }

    public static double rotationDirection(double d7, double d8) {
        return sanitizeDegreesDouble(d8 - d7) <= 180.0d ? 1.0d : -1.0d;
    }

    public static double sanitizeDegreesDouble(double d7) {
        double d8 = d7 % 360.0d;
        return d8 < androidx.cardview.widget.g.f1896q ? d8 + 360.0d : d8;
    }

    public static int sanitizeDegreesInt(int i7) {
        int i8 = i7 % 360;
        return i8 < 0 ? i8 + 360 : i8;
    }

    public static int signum(double d7) {
        if (d7 < androidx.cardview.widget.g.f1896q) {
            return -1;
        }
        return d7 == androidx.cardview.widget.g.f1896q ? 0 : 1;
    }
}