package u;

import java.lang.reflect.Array;
import java.util.Arrays;
/* loaded from: classes.dex */
public class k extends b {

    /* renamed from: i  reason: collision with root package name */
    public static final String f16987i = "MonotonicCurveFit";

    /* renamed from: d  reason: collision with root package name */
    public double[] f16988d;

    /* renamed from: e  reason: collision with root package name */
    public double[][] f16989e;

    /* renamed from: f  reason: collision with root package name */
    public double[][] f16990f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16991g = true;

    /* renamed from: h  reason: collision with root package name */
    public double[] f16992h;

    public k(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f16992h = new double[length2];
        int i7 = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance(Double.TYPE, i7, length2);
        double[][] dArr4 = (double[][]) Array.newInstance(Double.TYPE, length, length2);
        for (int i8 = 0; i8 < length2; i8++) {
            int i9 = 0;
            while (i9 < i7) {
                int i10 = i9 + 1;
                double d7 = dArr[i10] - dArr[i9];
                double[] dArr5 = dArr3[i9];
                double d8 = (dArr2[i10][i8] - dArr2[i9][i8]) / d7;
                dArr5[i8] = d8;
                if (i9 == 0) {
                    dArr4[i9][i8] = d8;
                } else {
                    dArr4[i9][i8] = (dArr3[i9 - 1][i8] + d8) * 0.5d;
                }
                i9 = i10;
            }
            dArr4[i7][i8] = dArr3[length - 2][i8];
        }
        for (int i11 = 0; i11 < i7; i11++) {
            for (int i12 = 0; i12 < length2; i12++) {
                double d9 = dArr3[i11][i12];
                if (d9 == androidx.cardview.widget.g.f1896q) {
                    dArr4[i11][i12] = 0.0d;
                    dArr4[i11 + 1][i12] = 0.0d;
                } else {
                    double d10 = dArr4[i11][i12] / d9;
                    int i13 = i11 + 1;
                    double d11 = dArr4[i13][i12] / d9;
                    double hypot = Math.hypot(d10, d11);
                    if (hypot > 9.0d) {
                        double d12 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i11];
                        double[] dArr7 = dArr3[i11];
                        dArr6[i12] = d10 * d12 * dArr7[i12];
                        dArr4[i13][i12] = d12 * d11 * dArr7[i12];
                    }
                }
            }
        }
        this.f16988d = dArr;
        this.f16989e = dArr2;
        this.f16990f = dArr4;
    }

    public static k i(String str) {
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i7 = 0;
        while (indexOf2 != -1) {
            dArr[i7] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i7++;
        }
        dArr[i7] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        return j(Arrays.copyOf(dArr, i7 + 1));
    }

    public static k j(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d7 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i7 = 0; i7 < dArr.length; i7++) {
            double d8 = dArr[i7];
            int i8 = i7 + length2;
            dArr2[i8][0] = d8;
            double d9 = i7 * d7;
            dArr3[i8] = d9;
            if (i7 > 0) {
                int i9 = (length2 * 2) + i7;
                dArr2[i9][0] = d8 + 1.0d;
                dArr3[i9] = d9 + 1.0d;
                int i10 = i7 - 1;
                dArr2[i10][0] = (d8 - 1.0d) - d7;
                dArr3[i10] = (d9 - 1.0d) - d7;
            }
        }
        return new k(dArr3, dArr2);
    }

    public static double k(double d7, double d8, double d9, double d10, double d11, double d12) {
        double d13 = d8 * d8;
        double d14 = d8 * 6.0d;
        double d15 = 3.0d * d7;
        return ((((((((((-6.0d) * d13) * d10) + (d14 * d10)) + ((6.0d * d13) * d9)) - (d14 * d9)) + ((d15 * d12) * d13)) + ((d15 * d11) * d13)) - (((2.0d * d7) * d12) * d8)) - (((4.0d * d7) * d11) * d8)) + (d7 * d11);
    }

    public static double l(double d7, double d8, double d9, double d10, double d11, double d12) {
        double d13 = d8 * d8;
        double d14 = d13 * d8;
        double d15 = 3.0d * d13;
        double d16 = ((((((-2.0d) * d14) * d10) + (d15 * d10)) + ((d14 * 2.0d) * d9)) - (d15 * d9)) + d9;
        double d17 = d7 * d12;
        double d18 = d7 * d11;
        return ((((d16 + (d17 * d14)) + (d14 * d18)) - (d17 * d13)) - (((d7 * 2.0d) * d11) * d13)) + (d18 * d8);
    }

    @Override // u.b
    public double c(double d7, int i7) {
        double d8;
        double d9;
        double f7;
        double[] dArr = this.f16988d;
        int length = dArr.length;
        int i8 = 0;
        if (this.f16991g) {
            double d10 = dArr[0];
            if (d7 <= d10) {
                d8 = this.f16989e[0][i7];
                d9 = d7 - d10;
                f7 = f(d10, i7);
            } else {
                int i9 = length - 1;
                double d11 = dArr[i9];
                if (d7 >= d11) {
                    d8 = this.f16989e[i9][i7];
                    d9 = d7 - d11;
                    f7 = f(d11, i7);
                }
            }
            return d8 + (d9 * f7);
        } else if (d7 <= dArr[0]) {
            return this.f16989e[0][i7];
        } else {
            int i10 = length - 1;
            if (d7 >= dArr[i10]) {
                return this.f16989e[i10][i7];
            }
        }
        while (i8 < length - 1) {
            double[] dArr2 = this.f16988d;
            double d12 = dArr2[i8];
            if (d7 == d12) {
                return this.f16989e[i8][i7];
            }
            int i11 = i8 + 1;
            double d13 = dArr2[i11];
            if (d7 < d13) {
                double d14 = d13 - d12;
                double d15 = (d7 - d12) / d14;
                double[][] dArr3 = this.f16989e;
                double d16 = dArr3[i8][i7];
                double d17 = dArr3[i11][i7];
                double[][] dArr4 = this.f16990f;
                return l(d14, d15, d16, d17, dArr4[i8][i7], dArr4[i11][i7]);
            }
            i8 = i11;
        }
        return androidx.cardview.widget.g.f1896q;
    }

    @Override // u.b
    public void d(double d7, double[] dArr) {
        double[] dArr2 = this.f16988d;
        int length = dArr2.length;
        int i7 = 0;
        int length2 = this.f16989e[0].length;
        if (this.f16991g) {
            double d8 = dArr2[0];
            if (d7 <= d8) {
                g(d8, this.f16992h);
                for (int i8 = 0; i8 < length2; i8++) {
                    dArr[i8] = this.f16989e[0][i8] + ((d7 - this.f16988d[0]) * this.f16992h[i8]);
                }
                return;
            }
            int i9 = length - 1;
            double d9 = dArr2[i9];
            if (d7 >= d9) {
                g(d9, this.f16992h);
                while (i7 < length2) {
                    dArr[i7] = this.f16989e[i9][i7] + ((d7 - this.f16988d[i9]) * this.f16992h[i7]);
                    i7++;
                }
                return;
            }
        } else if (d7 <= dArr2[0]) {
            for (int i10 = 0; i10 < length2; i10++) {
                dArr[i10] = this.f16989e[0][i10];
            }
            return;
        } else {
            int i11 = length - 1;
            if (d7 >= dArr2[i11]) {
                while (i7 < length2) {
                    dArr[i7] = this.f16989e[i11][i7];
                    i7++;
                }
                return;
            }
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d7 == this.f16988d[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = this.f16989e[i12][i13];
                }
            }
            double[] dArr3 = this.f16988d;
            int i14 = i12 + 1;
            double d10 = dArr3[i14];
            if (d7 < d10) {
                double d11 = dArr3[i12];
                double d12 = d10 - d11;
                double d13 = (d7 - d11) / d12;
                while (i7 < length2) {
                    double[][] dArr4 = this.f16989e;
                    double d14 = dArr4[i12][i7];
                    double d15 = dArr4[i14][i7];
                    double[][] dArr5 = this.f16990f;
                    dArr[i7] = l(d12, d13, d14, d15, dArr5[i12][i7], dArr5[i14][i7]);
                    i7++;
                }
                return;
            }
            i12 = i14;
        }
    }

    @Override // u.b
    public void e(double d7, float[] fArr) {
        double[] dArr = this.f16988d;
        int length = dArr.length;
        int i7 = 0;
        int length2 = this.f16989e[0].length;
        if (this.f16991g) {
            double d8 = dArr[0];
            if (d7 <= d8) {
                g(d8, this.f16992h);
                for (int i8 = 0; i8 < length2; i8++) {
                    fArr[i8] = (float) (this.f16989e[0][i8] + ((d7 - this.f16988d[0]) * this.f16992h[i8]));
                }
                return;
            }
            int i9 = length - 1;
            double d9 = dArr[i9];
            if (d7 >= d9) {
                g(d9, this.f16992h);
                while (i7 < length2) {
                    fArr[i7] = (float) (this.f16989e[i9][i7] + ((d7 - this.f16988d[i9]) * this.f16992h[i7]));
                    i7++;
                }
                return;
            }
        } else if (d7 <= dArr[0]) {
            for (int i10 = 0; i10 < length2; i10++) {
                fArr[i10] = (float) this.f16989e[0][i10];
            }
            return;
        } else {
            int i11 = length - 1;
            if (d7 >= dArr[i11]) {
                while (i7 < length2) {
                    fArr[i7] = (float) this.f16989e[i11][i7];
                    i7++;
                }
                return;
            }
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d7 == this.f16988d[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) this.f16989e[i12][i13];
                }
            }
            double[] dArr2 = this.f16988d;
            int i14 = i12 + 1;
            double d10 = dArr2[i14];
            if (d7 < d10) {
                double d11 = dArr2[i12];
                double d12 = d10 - d11;
                double d13 = (d7 - d11) / d12;
                while (i7 < length2) {
                    double[][] dArr3 = this.f16989e;
                    double d14 = dArr3[i12][i7];
                    double d15 = dArr3[i14][i7];
                    double[][] dArr4 = this.f16990f;
                    fArr[i7] = (float) l(d12, d13, d14, d15, dArr4[i12][i7], dArr4[i14][i7]);
                    i7++;
                }
                return;
            }
            i12 = i14;
        }
    }

    @Override // u.b
    public double f(double d7, int i7) {
        double[] dArr = this.f16988d;
        int length = dArr.length;
        int i8 = 0;
        double d8 = dArr[0];
        if (d7 >= d8) {
            d8 = dArr[length - 1];
            if (d7 < d8) {
                d8 = d7;
            }
        }
        while (i8 < length - 1) {
            double[] dArr2 = this.f16988d;
            int i9 = i8 + 1;
            double d9 = dArr2[i9];
            if (d8 <= d9) {
                double d10 = dArr2[i8];
                double d11 = d9 - d10;
                double[][] dArr3 = this.f16989e;
                double d12 = dArr3[i8][i7];
                double d13 = dArr3[i9][i7];
                double[][] dArr4 = this.f16990f;
                return k(d11, (d8 - d10) / d11, d12, d13, dArr4[i8][i7], dArr4[i9][i7]) / d11;
            }
            i8 = i9;
        }
        return androidx.cardview.widget.g.f1896q;
    }

    @Override // u.b
    public void g(double d7, double[] dArr) {
        double[] dArr2 = this.f16988d;
        int length = dArr2.length;
        int length2 = this.f16989e[0].length;
        double d8 = dArr2[0];
        if (d7 > d8) {
            d8 = dArr2[length - 1];
            if (d7 < d8) {
                d8 = d7;
            }
        }
        int i7 = 0;
        while (i7 < length - 1) {
            double[] dArr3 = this.f16988d;
            int i8 = i7 + 1;
            double d9 = dArr3[i8];
            if (d8 <= d9) {
                double d10 = dArr3[i7];
                double d11 = d9 - d10;
                double d12 = (d8 - d10) / d11;
                for (int i9 = 0; i9 < length2; i9++) {
                    double[][] dArr4 = this.f16989e;
                    double d13 = dArr4[i7][i9];
                    double d14 = dArr4[i8][i9];
                    double[][] dArr5 = this.f16990f;
                    dArr[i9] = k(d11, d12, d13, d14, dArr5[i7][i9], dArr5[i8][i9]) / d11;
                }
                return;
            }
            i7 = i8;
        }
    }

    @Override // u.b
    public double[] h() {
        return this.f16988d;
    }
}
