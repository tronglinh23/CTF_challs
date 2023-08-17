package m0;

import android.graphics.Color;
import androidx.core.view.u1;
import d.o0;
import p0.p0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f13420a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b  reason: collision with root package name */
    public static final float[][] f13421b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f13422c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d  reason: collision with root package name */
    public static final float[][] f13423d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int a(float f7) {
        if (f7 < 1.0f) {
            return u1.f3816t;
        }
        if (f7 > 99.0f) {
            return -1;
        }
        float f8 = (f7 + 16.0f) / 116.0f;
        float f9 = (f7 > 8.0f ? 1 : (f7 == 8.0f ? 0 : -1)) > 0 ? f8 * f8 * f8 : f7 / 903.2963f;
        float f10 = f8 * f8 * f8;
        boolean z6 = f10 > 0.008856452f;
        float f11 = z6 ? f10 : ((f8 * 116.0f) - 16.0f) / 903.2963f;
        if (!z6) {
            f10 = ((f8 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f13422c;
        return p0.g(f11 * fArr[0], f9 * fArr[1], f10 * fArr[2]);
    }

    public static float b(int i7) {
        return c(g(i7));
    }

    public static float c(float f7) {
        float f8 = f7 / 100.0f;
        return f8 <= 0.008856452f ? f8 * 903.2963f : (((float) Math.cbrt(f8)) * 116.0f) - 16.0f;
    }

    public static float d(float f7, float f8, float f9) {
        return f7 + ((f8 - f7) * f9);
    }

    public static float e(int i7) {
        float f7 = i7 / 255.0f;
        return (f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    @o0
    public static float[] f(int i7) {
        float e7 = e(Color.red(i7));
        float e8 = e(Color.green(i7));
        float e9 = e(Color.blue(i7));
        float[][] fArr = f13423d;
        float[] fArr2 = fArr[0];
        float f7 = (fArr2[0] * e7) + (fArr2[1] * e8) + (fArr2[2] * e9);
        float[] fArr3 = fArr[1];
        float f8 = (fArr3[0] * e7) + (fArr3[1] * e8) + (fArr3[2] * e9);
        float[] fArr4 = fArr[2];
        return new float[]{f7, f8, (e7 * fArr4[0]) + (e8 * fArr4[1]) + (e9 * fArr4[2])};
    }

    public static float g(int i7) {
        float e7 = e(Color.red(i7));
        float e8 = e(Color.green(i7));
        float e9 = e(Color.blue(i7));
        float[] fArr = f13423d[1];
        return (e7 * fArr[0]) + (e8 * fArr[1]) + (e9 * fArr[2]);
    }

    public static float h(float f7) {
        return (f7 > 8.0f ? (float) Math.pow((f7 + 16.0d) / 116.0d, 3.0d) : f7 / 903.2963f) * 100.0f;
    }
}