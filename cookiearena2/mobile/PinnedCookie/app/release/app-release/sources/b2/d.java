package b2;

import android.view.animation.Interpolator;
/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f7168a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7169b;

    public d(float[] fArr) {
        this.f7168a = fArr;
        this.f7169b = 1.0f / ((float) (fArr.length - 1));
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f7) {
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f7168a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f7), fArr.length - 2);
        float f8 = this.f7169b;
        float f9 = (f7 - (min * f8)) / f8;
        float[] fArr2 = this.f7168a;
        float f10 = fArr2[min];
        return f10 + (f9 * (fArr2[min + 1] - f10));
    }
}
