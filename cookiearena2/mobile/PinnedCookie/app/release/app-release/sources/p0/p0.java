package p0;

import android.graphics.Color;
import com.google.android.material.color.utilities.Contrast;
import java.util.Objects;
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final double f14556a = 95.047d;

    /* renamed from: b  reason: collision with root package name */
    public static final double f14557b = 100.0d;

    /* renamed from: c  reason: collision with root package name */
    public static final double f14558c = 108.883d;

    /* renamed from: d  reason: collision with root package name */
    public static final double f14559d = 0.008856d;

    /* renamed from: e  reason: collision with root package name */
    public static final double f14560e = 903.3d;

    /* renamed from: f  reason: collision with root package name */
    public static final int f14561f = 10;

    /* renamed from: g  reason: collision with root package name */
    public static final int f14562g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final ThreadLocal<double[]> f14563h = new ThreadLocal<>();

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static Color a(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float alpha = color.alpha();
            float alpha2 = color2.alpha() * (1.0f - alpha);
            int componentCount = color2.getComponentCount() - 1;
            float f7 = alpha + alpha2;
            components2[componentCount] = f7;
            if (f7 > 0.0f) {
                alpha /= f7;
                alpha2 /= f7;
            }
            for (int i7 = 0; i7 < componentCount; i7++) {
                components2[i7] = (components[i7] * alpha) + (components2[i7] * alpha2);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    public static double A(double d7) {
        return d7 > 0.008856d ? Math.pow(d7, 0.3333333333333333d) : ((d7 * 903.3d) + 16.0d) / 116.0d;
    }

    @d.l
    public static int B(@d.l int i7, @d.g0(from = 0, to = 255) int i8) {
        if (i8 < 0 || i8 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i7 & androidx.core.view.u1.f3815s) | (i8 << 24);
    }

    @d.l
    public static int a(@d.o0 float[] fArr) {
        int round;
        int round2;
        int round3;
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float abs = (1.0f - Math.abs((f9 * 2.0f) - 1.0f)) * f8;
        float f10 = f9 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f7 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f7) / 60) {
            case 0:
                round = Math.round((abs + f10) * 255.0f);
                round2 = Math.round((abs2 + f10) * 255.0f);
                round3 = Math.round(f10 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f10) * 255.0f);
                round2 = Math.round((abs + f10) * 255.0f);
                round3 = Math.round(f10 * 255.0f);
                break;
            case 2:
                round = Math.round(f10 * 255.0f);
                round2 = Math.round((abs + f10) * 255.0f);
                round3 = Math.round((abs2 + f10) * 255.0f);
                break;
            case 3:
                round = Math.round(f10 * 255.0f);
                round2 = Math.round((abs2 + f10) * 255.0f);
                round3 = Math.round((abs + f10) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f10) * 255.0f);
                round2 = Math.round(f10 * 255.0f);
                round3 = Math.round((abs + f10) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f10) * 255.0f);
                round2 = Math.round(f10 * 255.0f);
                round3 = Math.round((abs2 + f10) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(x(round, 0, 255), x(round2, 0, 255), x(round3, 0, 255));
    }

    @d.l
    public static int b(@d.x(from = 0.0d, to = 100.0d) double d7, @d.x(from = -128.0d, to = 127.0d) double d8, @d.x(from = -128.0d, to = 127.0d) double d9) {
        double[] z6 = z();
        c(d7, d8, d9, z6);
        return g(z6[0], z6[1], z6[2]);
    }

    public static void c(@d.x(from = 0.0d, to = 100.0d) double d7, @d.x(from = -128.0d, to = 127.0d) double d8, @d.x(from = -128.0d, to = 127.0d) double d9, @d.o0 double[] dArr) {
        double d10 = (d7 + 16.0d) / 116.0d;
        double d11 = (d8 / 500.0d) + d10;
        double d12 = d10 - (d9 / 200.0d);
        double pow = Math.pow(d11, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d11 * 116.0d) - 16.0d) / 903.3d;
        }
        double pow2 = d7 > 7.9996247999999985d ? Math.pow(d10, 3.0d) : d7 / 903.3d;
        double pow3 = Math.pow(d12, 3.0d);
        if (pow3 <= 0.008856d) {
            pow3 = ((d12 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = pow * 95.047d;
        dArr[1] = pow2 * 100.0d;
        dArr[2] = pow3 * 108.883d;
    }

    public static void d(@d.g0(from = 0, to = 255) int i7, @d.g0(from = 0, to = 255) int i8, @d.g0(from = 0, to = 255) int i9, @d.o0 float[] fArr) {
        float f7;
        float abs;
        float f8 = i7 / 255.0f;
        float f9 = i8 / 255.0f;
        float f10 = i9 / 255.0f;
        float max = Math.max(f8, Math.max(f9, f10));
        float min = Math.min(f8, Math.min(f9, f10));
        float f11 = max - min;
        float f12 = (max + min) / 2.0f;
        if (max == min) {
            f7 = 0.0f;
            abs = 0.0f;
        } else {
            f7 = max == f8 ? ((f9 - f10) / f11) % 6.0f : max == f9 ? ((f10 - f8) / f11) + 2.0f : 4.0f + ((f8 - f9) / f11);
            abs = f11 / (1.0f - Math.abs((2.0f * f12) - 1.0f));
        }
        float f13 = (f7 * 60.0f) % 360.0f;
        if (f13 < 0.0f) {
            f13 += 360.0f;
        }
        fArr[0] = w(f13, 0.0f, 360.0f);
        fArr[1] = w(abs, 0.0f, 1.0f);
        fArr[2] = w(f12, 0.0f, 1.0f);
    }

    public static void e(@d.g0(from = 0, to = 255) int i7, @d.g0(from = 0, to = 255) int i8, @d.g0(from = 0, to = 255) int i9, @d.o0 double[] dArr) {
        f(i7, i8, i9, dArr);
        h(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void f(@d.g0(from = 0, to = 255) int i7, @d.g0(from = 0, to = 255) int i8, @d.g0(from = 0, to = 255) int i9, @d.o0 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d7 = i7 / 255.0d;
        double pow = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        double d8 = i8 / 255.0d;
        double pow2 = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
        double d9 = i9 / 255.0d;
        double pow3 = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
        dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
        dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
    }

    @d.l
    public static int g(@d.x(from = 0.0d, to = 95.047d) double d7, @d.x(from = 0.0d, to = 100.0d) double d8, @d.x(from = 0.0d, to = 108.883d) double d9) {
        double d10 = (((3.2406d * d7) + ((-1.5372d) * d8)) + ((-0.4986d) * d9)) / 100.0d;
        double d11 = ((((-0.9689d) * d7) + (1.8758d * d8)) + (0.0415d * d9)) / 100.0d;
        double d12 = (((0.0557d * d7) + ((-0.204d) * d8)) + (1.057d * d9)) / 100.0d;
        return Color.rgb(x((int) Math.round((d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d) * 255.0d), 0, 255), x((int) Math.round((d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d) * 255.0d), 0, 255), x((int) Math.round((d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d), 0, 255));
    }

    public static void h(@d.x(from = 0.0d, to = 95.047d) double d7, @d.x(from = 0.0d, to = 100.0d) double d8, @d.x(from = 0.0d, to = 108.883d) double d9, @d.o0 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double A = A(d7 / 95.047d);
        double A2 = A(d8 / 100.0d);
        double A3 = A(d9 / 108.883d);
        dArr[0] = Math.max((double) androidx.cardview.widget.g.f1896q, (116.0d * A2) - 16.0d);
        dArr[1] = (A - A2) * 500.0d;
        dArr[2] = (A2 - A3) * 200.0d;
    }

    @d.l
    public static int i(@d.l int i7, @d.l int i8, @d.x(from = 0.0d, to = 1.0d) float f7) {
        float f8 = 1.0f - f7;
        return Color.argb((int) ((Color.alpha(i7) * f8) + (Color.alpha(i8) * f7)), (int) ((Color.red(i7) * f8) + (Color.red(i8) * f7)), (int) ((Color.green(i7) * f8) + (Color.green(i8) * f7)), (int) ((Color.blue(i7) * f8) + (Color.blue(i8) * f7)));
    }

    public static void j(@d.o0 float[] fArr, @d.o0 float[] fArr2, @d.x(from = 0.0d, to = 1.0d) float f7, @d.o0 float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f8 = 1.0f - f7;
        fArr3[0] = o(fArr[0], fArr2[0], f7);
        fArr3[1] = (fArr[1] * f8) + (fArr2[1] * f7);
        fArr3[2] = (fArr[2] * f8) + (fArr2[2] * f7);
    }

    public static void k(@d.o0 double[] dArr, @d.o0 double[] dArr2, @d.x(from = 0.0d, to = 1.0d) double d7, @d.o0 double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d8 = 1.0d - d7;
        dArr3[0] = (dArr[0] * d8) + (dArr2[0] * d7);
        dArr3[1] = (dArr[1] * d8) + (dArr2[1] * d7);
        dArr3[2] = (dArr[2] * d8) + (dArr2[2] * d7);
    }

    public static double l(@d.l int i7, @d.l int i8) {
        if (Color.alpha(i8) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i8));
        }
        if (Color.alpha(i7) < 255) {
            i7 = t(i7, i8);
        }
        double m7 = m(i7) + 0.05d;
        double m8 = m(i8) + 0.05d;
        return Math.max(m7, m8) / Math.min(m7, m8);
    }

    @d.x(from = androidx.cardview.widget.g.f1896q, to = Contrast.RATIO_MIN)
    public static double m(@d.l int i7) {
        double[] z6 = z();
        r(i7, z6);
        return z6[1] / 100.0d;
    }

    public static int n(@d.l int i7, @d.l int i8, float f7) {
        int i9 = 255;
        if (Color.alpha(i8) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i8));
        }
        double d7 = f7;
        if (l(B(i7, 255), i8) < d7) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 <= 10 && i9 - i10 > 1; i11++) {
            int i12 = (i10 + i9) / 2;
            if (l(B(i7, i12), i8) < d7) {
                i10 = i12;
            } else {
                i9 = i12;
            }
        }
        return i9;
    }

    @d.l1
    public static float o(float f7, float f8, float f9) {
        if (Math.abs(f8 - f7) > 180.0f) {
            if (f8 > f7) {
                f7 += 360.0f;
            } else {
                f8 += 360.0f;
            }
        }
        return (f7 + ((f8 - f7) * f9)) % 360.0f;
    }

    public static void p(@d.l int i7, @d.o0 float[] fArr) {
        d(Color.red(i7), Color.green(i7), Color.blue(i7), fArr);
    }

    public static void q(@d.l int i7, @d.o0 double[] dArr) {
        e(Color.red(i7), Color.green(i7), Color.blue(i7), dArr);
    }

    public static void r(@d.l int i7, @d.o0 double[] dArr) {
        f(Color.red(i7), Color.green(i7), Color.blue(i7), dArr);
    }

    public static int s(int i7, int i8) {
        return 255 - (((255 - i8) * (255 - i7)) / 255);
    }

    public static int t(@d.l int i7, @d.l int i8) {
        int alpha = Color.alpha(i8);
        int alpha2 = Color.alpha(i7);
        int s6 = s(alpha2, alpha);
        return Color.argb(s6, v(Color.red(i7), alpha2, Color.red(i8), alpha, s6), v(Color.green(i7), alpha2, Color.green(i8), alpha, s6), v(Color.blue(i7), alpha2, Color.blue(i8), alpha, s6));
    }

    @d.o0
    @d.w0(26)
    public static Color u(@d.o0 Color color, @d.o0 Color color2) {
        return a.a(color, color2);
    }

    public static int v(int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        return (((i7 * 255) * i8) + ((i9 * i10) * (255 - i8))) / (i11 * 255);
    }

    public static float w(float f7, float f8, float f9) {
        return f7 < f8 ? f8 : Math.min(f7, f9);
    }

    public static int x(int i7, int i8, int i9) {
        return i7 < i8 ? i8 : Math.min(i7, i9);
    }

    public static double y(@d.o0 double[] dArr, @d.o0 double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    public static double[] z() {
        ThreadLocal<double[]> threadLocal = f14563h;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }
}
