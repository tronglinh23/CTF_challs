package u;

import java.util.Arrays;

/* loaded from: classes.dex */
public class l {

    /* renamed from: i  reason: collision with root package name */
    public static String f16993i = "Oscillator";

    /* renamed from: j  reason: collision with root package name */
    public static final int f16994j = 0;

    /* renamed from: k  reason: collision with root package name */
    public static final int f16995k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f16996l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static final int f16997m = 3;

    /* renamed from: n  reason: collision with root package name */
    public static final int f16998n = 4;

    /* renamed from: o  reason: collision with root package name */
    public static final int f16999o = 5;

    /* renamed from: p  reason: collision with root package name */
    public static final int f17000p = 6;

    /* renamed from: q  reason: collision with root package name */
    public static final int f17001q = 7;

    /* renamed from: c  reason: collision with root package name */
    public double[] f17004c;

    /* renamed from: d  reason: collision with root package name */
    public String f17005d;

    /* renamed from: e  reason: collision with root package name */
    public k f17006e;

    /* renamed from: f  reason: collision with root package name */
    public int f17007f;

    /* renamed from: a  reason: collision with root package name */
    public float[] f17002a = new float[0];

    /* renamed from: b  reason: collision with root package name */
    public double[] f17003b = new double[0];

    /* renamed from: g  reason: collision with root package name */
    public double f17008g = 6.283185307179586d;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17009h = false;

    public void a(double d7, float f7) {
        int length = this.f17002a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f17003b, d7);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f17003b = Arrays.copyOf(this.f17003b, length);
        this.f17002a = Arrays.copyOf(this.f17002a, length);
        this.f17004c = new double[length];
        double[] dArr = this.f17003b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f17003b[binarySearch] = d7;
        this.f17002a[binarySearch] = f7;
        this.f17009h = false;
    }

    public double b(double d7) {
        if (d7 <= androidx.cardview.widget.g.f1896q) {
            d7 = 1.0E-5d;
        } else if (d7 >= 1.0d) {
            d7 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f17003b, d7);
        if (binarySearch <= 0 && binarySearch != 0) {
            int i7 = (-binarySearch) - 1;
            float[] fArr = this.f17002a;
            float f7 = fArr[i7];
            int i8 = i7 - 1;
            float f8 = fArr[i8];
            double d8 = f7 - f8;
            double[] dArr = this.f17003b;
            double d9 = dArr[i7];
            double d10 = dArr[i8];
            double d11 = d8 / (d9 - d10);
            return (f8 - (d11 * d10)) + (d7 * d11);
        }
        return androidx.cardview.widget.g.f1896q;
    }

    public double c(double d7) {
        if (d7 < androidx.cardview.widget.g.f1896q) {
            d7 = 0.0d;
        } else if (d7 > 1.0d) {
            d7 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f17003b, d7);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch != 0) {
            int i7 = (-binarySearch) - 1;
            float[] fArr = this.f17002a;
            float f7 = fArr[i7];
            int i8 = i7 - 1;
            float f8 = fArr[i8];
            double d8 = f7 - f8;
            double[] dArr = this.f17003b;
            double d9 = dArr[i7];
            double d10 = dArr[i8];
            double d11 = d8 / (d9 - d10);
            return this.f17004c[i8] + ((f8 - (d11 * d10)) * (d7 - d10)) + ((d11 * ((d7 * d7) - (d10 * d10))) / 2.0d);
        }
        return androidx.cardview.widget.g.f1896q;
    }

    public double d(double d7, double d8, double d9) {
        double c7 = d8 + c(d7);
        double b7 = b(d7) + d9;
        switch (this.f17007f) {
            case 1:
                return androidx.cardview.widget.g.f1896q;
            case 2:
                return b7 * 4.0d * Math.signum((((c7 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return b7 * 2.0d;
            case 4:
                return (-b7) * 2.0d;
            case 5:
                double d10 = this.f17008g;
                return (-d10) * b7 * Math.sin(d10 * c7);
            case 6:
                return b7 * 4.0d * ((((c7 * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f17006e.f(c7 % 1.0d, 0);
            default:
                double d11 = this.f17008g;
                return b7 * d11 * Math.cos(d11 * c7);
        }
    }

    public double e(double d7, double d8) {
        double abs;
        double c7 = c(d7) + d8;
        switch (this.f17007f) {
            case 1:
                return Math.signum(0.5d - (c7 % 1.0d));
            case 2:
                abs = Math.abs((((c7 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((c7 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((c7 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f17008g * (d8 + c7));
            case 6:
                double abs2 = 1.0d - Math.abs(((c7 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.f17006e.c(c7 % 1.0d, 0);
            default:
                return Math.sin(this.f17008g * c7);
        }
        return 1.0d - abs;
    }

    public void f() {
        double d7 = 0.0d;
        int i7 = 0;
        while (true) {
            if (i7 >= this.f17002a.length) {
                break;
            }
            d7 += r7[i7];
            i7++;
        }
        double d8 = 0.0d;
        int i8 = 1;
        while (true) {
            float[] fArr = this.f17002a;
            if (i8 >= fArr.length) {
                break;
            }
            int i9 = i8 - 1;
            float f7 = (fArr[i9] + fArr[i8]) / 2.0f;
            double[] dArr = this.f17003b;
            d8 += (dArr[i8] - dArr[i9]) * f7;
            i8++;
        }
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.f17002a;
            if (i10 >= fArr2.length) {
                break;
            }
            fArr2[i10] = (float) (fArr2[i10] * (d7 / d8));
            i10++;
        }
        this.f17004c[0] = 0.0d;
        int i11 = 1;
        while (true) {
            float[] fArr3 = this.f17002a;
            if (i11 >= fArr3.length) {
                this.f17009h = true;
                return;
            }
            int i12 = i11 - 1;
            float f8 = (fArr3[i12] + fArr3[i11]) / 2.0f;
            double[] dArr2 = this.f17003b;
            double d9 = dArr2[i11] - dArr2[i12];
            double[] dArr3 = this.f17004c;
            dArr3[i11] = dArr3[i12] + (d9 * f8);
            i11++;
        }
    }

    public void g(int i7, String str) {
        this.f17007f = i7;
        this.f17005d = str;
        if (str != null) {
            this.f17006e = k.i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f17003b) + " period=" + Arrays.toString(this.f17002a);
    }
}