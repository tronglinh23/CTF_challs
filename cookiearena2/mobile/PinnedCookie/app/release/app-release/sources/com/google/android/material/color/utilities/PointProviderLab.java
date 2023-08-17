package com.google.android.material.color.utilities;

import d.b1;
@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class PointProviderLab implements PointProvider {
    @Override // com.google.android.material.color.utilities.PointProvider
    public double distance(double[] dArr, double[] dArr2) {
        double d7 = dArr[0] - dArr2[0];
        double d8 = dArr[1] - dArr2[1];
        double d9 = dArr[2] - dArr2[2];
        return (d7 * d7) + (d8 * d8) + (d9 * d9);
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public double[] fromInt(int i7) {
        double[] labFromArgb = ColorUtils.labFromArgb(i7);
        return new double[]{labFromArgb[0], labFromArgb[1], labFromArgb[2]};
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public int toInt(double[] dArr) {
        return ColorUtils.argbFromLab(dArr[0], dArr[1], dArr[2]);
    }
}
