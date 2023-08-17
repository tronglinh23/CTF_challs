package u;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public int f16922a;

    /* renamed from: b  reason: collision with root package name */
    public a[][] f16923b;

    /* renamed from: c  reason: collision with root package name */
    public int f16924c;

    /* renamed from: d  reason: collision with root package name */
    public double[] f16925d;

    /* renamed from: e  reason: collision with root package name */
    public double f16926e;

    /* renamed from: f  reason: collision with root package name */
    public double[][] f16927f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public double f16928a;

        /* renamed from: b  reason: collision with root package name */
        public double f16929b;

        /* renamed from: c  reason: collision with root package name */
        public double f16930c;

        /* renamed from: d  reason: collision with root package name */
        public double f16931d;

        public a(double d7, double d8, double d9, double d10) {
            this.f16928a = d7;
            this.f16929b = d8;
            this.f16930c = d9;
            this.f16931d = d10;
        }

        public double a(double d7) {
            return (((((this.f16931d * d7) + this.f16930c) * d7) + this.f16929b) * d7) + this.f16928a;
        }

        public double b(double d7) {
            return (((this.f16931d * 3.0d * d7) + (this.f16930c * 2.0d)) * d7) + this.f16929b;
        }
    }

    public f(double[][] dArr) {
        g(dArr);
    }

    public static a[] b(int i7, double[] dArr) {
        double[] dArr2 = new double[i7];
        double[] dArr3 = new double[i7];
        double[] dArr4 = new double[i7];
        int i8 = i7 - 1;
        int i9 = 0;
        dArr2[0] = 0.5d;
        int i10 = 1;
        for (int i11 = 1; i11 < i8; i11++) {
            dArr2[i11] = 1.0d / (4.0d - dArr2[i11 - 1]);
        }
        int i12 = i8 - 1;
        dArr2[i8] = 1.0d / (2.0d - dArr2[i12]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i10 < i8) {
            int i13 = i10 + 1;
            int i14 = i10 - 1;
            dArr3[i10] = (((dArr[i13] - dArr[i14]) * 3.0d) - dArr3[i14]) * dArr2[i10];
            i10 = i13;
        }
        double d7 = (((dArr[i8] - dArr[i12]) * 3.0d) - dArr3[i12]) * dArr2[i8];
        dArr3[i8] = d7;
        dArr4[i8] = d7;
        while (i12 >= 0) {
            dArr4[i12] = dArr3[i12] - (dArr2[i12] * dArr4[i12 + 1]);
            i12--;
        }
        a[] aVarArr = new a[i8];
        while (i9 < i8) {
            double d8 = dArr[i9];
            double d9 = dArr4[i9];
            int i15 = i9 + 1;
            double d10 = dArr[i15];
            double d11 = dArr4[i15];
            aVarArr[i9] = new a((float) d8, d9, (((d10 - d8) * 3.0d) - (d9 * 2.0d)) - d11, ((d8 - d10) * 2.0d) + d9 + d11);
            i9 = i15;
        }
        return aVarArr;
    }

    public double a(a[] aVarArr) {
        int i7;
        int length = aVarArr.length;
        double[] dArr = new double[aVarArr.length];
        double d7 = androidx.cardview.widget.g.f1896q;
        double d8 = 0.0d;
        double d9 = 0.0d;
        while (true) {
            i7 = 0;
            if (d8 >= 1.0d) {
                break;
            }
            double d10 = 0.0d;
            while (i7 < aVarArr.length) {
                double d11 = dArr[i7];
                double a7 = aVarArr[i7].a(d8);
                dArr[i7] = a7;
                double d12 = d11 - a7;
                d10 += d12 * d12;
                i7++;
            }
            if (d8 > androidx.cardview.widget.g.f1896q) {
                d9 += Math.sqrt(d10);
            }
            d8 += 0.1d;
        }
        while (i7 < aVarArr.length) {
            double d13 = dArr[i7];
            double a8 = aVarArr[i7].a(1.0d);
            dArr[i7] = a8;
            double d14 = d13 - a8;
            d7 += d14 * d14;
            i7++;
        }
        return d9 + Math.sqrt(d7);
    }

    public double c(double d7, int i7) {
        double[] dArr;
        double d8 = d7 * this.f16926e;
        int i8 = 0;
        while (true) {
            dArr = this.f16925d;
            if (i8 >= dArr.length - 1) {
                break;
            }
            double d9 = dArr[i8];
            if (d9 >= d8) {
                break;
            }
            d8 -= d9;
            i8++;
        }
        return this.f16923b[i7][i8].a(d8 / dArr[i8]);
    }

    public void d(double d7, double[] dArr) {
        double d8 = d7 * this.f16926e;
        int i7 = 0;
        while (true) {
            double[] dArr2 = this.f16925d;
            if (i7 >= dArr2.length - 1) {
                break;
            }
            double d9 = dArr2[i7];
            if (d9 >= d8) {
                break;
            }
            d8 -= d9;
            i7++;
        }
        for (int i8 = 0; i8 < dArr.length; i8++) {
            dArr[i8] = this.f16923b[i8][i7].a(d8 / this.f16925d[i7]);
        }
    }

    public void e(double d7, float[] fArr) {
        double d8 = d7 * this.f16926e;
        int i7 = 0;
        while (true) {
            double[] dArr = this.f16925d;
            if (i7 >= dArr.length - 1) {
                break;
            }
            double d9 = dArr[i7];
            if (d9 >= d8) {
                break;
            }
            d8 -= d9;
            i7++;
        }
        for (int i8 = 0; i8 < fArr.length; i8++) {
            fArr[i8] = (float) this.f16923b[i8][i7].a(d8 / this.f16925d[i7]);
        }
    }

    public void f(double d7, double[] dArr) {
        double d8 = d7 * this.f16926e;
        int i7 = 0;
        while (true) {
            double[] dArr2 = this.f16925d;
            if (i7 >= dArr2.length - 1) {
                break;
            }
            double d9 = dArr2[i7];
            if (d9 >= d8) {
                break;
            }
            d8 -= d9;
            i7++;
        }
        for (int i8 = 0; i8 < dArr.length; i8++) {
            dArr[i8] = this.f16923b[i8][i7].b(d8 / this.f16925d[i7]);
        }
    }

    public void g(double[][] dArr) {
        int i7;
        int length = dArr[0].length;
        this.f16924c = length;
        int length2 = dArr.length;
        this.f16922a = length2;
        this.f16927f = (double[][]) Array.newInstance(Double.TYPE, length, length2);
        this.f16923b = new a[this.f16924c];
        for (int i8 = 0; i8 < this.f16924c; i8++) {
            for (int i9 = 0; i9 < this.f16922a; i9++) {
                this.f16927f[i8][i9] = dArr[i9][i8];
            }
        }
        int i10 = 0;
        while (true) {
            i7 = this.f16924c;
            if (i10 >= i7) {
                break;
            }
            a[][] aVarArr = this.f16923b;
            double[] dArr2 = this.f16927f[i10];
            aVarArr[i10] = b(dArr2.length, dArr2);
            i10++;
        }
        this.f16925d = new double[this.f16922a - 1];
        this.f16926e = androidx.cardview.widget.g.f1896q;
        a[] aVarArr2 = new a[i7];
        for (int i11 = 0; i11 < this.f16925d.length; i11++) {
            for (int i12 = 0; i12 < this.f16924c; i12++) {
                aVarArr2[i12] = this.f16923b[i12][i11];
            }
            double d7 = this.f16926e;
            double[] dArr3 = this.f16925d;
            double a7 = a(aVarArr2);
            dArr3[i11] = a7;
            this.f16926e = d7 + a7;
        }
    }

    public f() {
    }
}