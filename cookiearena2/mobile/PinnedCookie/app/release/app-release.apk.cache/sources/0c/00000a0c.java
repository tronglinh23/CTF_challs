package com.google.android.material.color.utilities;

import d.b1;

@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class Blend {
    private Blend() {
    }

    public static int cam16Ucs(int i7, int i8, double d7) {
        Cam16 fromInt = Cam16.fromInt(i7);
        Cam16 fromInt2 = Cam16.fromInt(i8);
        double jstar = fromInt.getJstar();
        double astar = fromInt.getAstar();
        double bstar = fromInt.getBstar();
        return Cam16.fromUcs(jstar + ((fromInt2.getJstar() - jstar) * d7), astar + ((fromInt2.getAstar() - astar) * d7), bstar + ((fromInt2.getBstar() - bstar) * d7)).toInt();
    }

    public static int harmonize(int i7, int i8) {
        Hct fromInt = Hct.fromInt(i7);
        Hct fromInt2 = Hct.fromInt(i8);
        return Hct.from(MathUtils.sanitizeDegreesDouble(fromInt.getHue() + (Math.min(MathUtils.differenceDegrees(fromInt.getHue(), fromInt2.getHue()) * 0.5d, 15.0d) * MathUtils.rotationDirection(fromInt.getHue(), fromInt2.getHue()))), fromInt.getChroma(), fromInt.getTone()).toInt();
    }

    public static int hctHue(int i7, int i8, double d7) {
        return Hct.from(Cam16.fromInt(cam16Ucs(i7, i8, d7)).getHue(), Cam16.fromInt(i7).getChroma(), ColorUtils.lstarFromArgb(i7)).toInt();
    }
}