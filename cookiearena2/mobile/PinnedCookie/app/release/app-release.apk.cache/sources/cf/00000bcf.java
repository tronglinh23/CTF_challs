package com.google.android.material.math;

/* loaded from: classes.dex */
public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    private MathUtils() {
    }

    public static float dist(float f7, float f8, float f9, float f10) {
        return (float) Math.hypot(f9 - f7, f10 - f8);
    }

    public static float distanceToFurthestCorner(float f7, float f8, float f9, float f10, float f11, float f12) {
        return max(dist(f7, f8, f9, f10), dist(f7, f8, f11, f10), dist(f7, f8, f11, f12), dist(f7, f8, f9, f12));
    }

    public static float floorMod(float f7, int i7) {
        float f8 = i7;
        int i8 = (int) (f7 / f8);
        if (Math.signum(f7) * f8 < 0.0f && i8 * i7 != f7) {
            i8--;
        }
        return f7 - (i8 * i7);
    }

    public static boolean geq(float f7, float f8, float f9) {
        return f7 + f9 >= f8;
    }

    public static float lerp(float f7, float f8, float f9) {
        return ((1.0f - f9) * f7) + (f9 * f8);
    }

    private static float max(float f7, float f8, float f9, float f10) {
        return (f7 <= f8 || f7 <= f9 || f7 <= f10) ? (f8 <= f9 || f8 <= f10) ? f9 > f10 ? f9 : f10 : f8 : f7;
    }

    public static int floorMod(int i7, int i8) {
        int i9 = i7 / i8;
        if ((i7 ^ i8) < 0 && i9 * i8 != i7) {
            i9--;
        }
        return i7 - (i9 * i8);
    }
}