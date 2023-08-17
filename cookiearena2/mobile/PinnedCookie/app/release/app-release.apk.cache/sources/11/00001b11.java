package u;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public class q extends d {

    /* renamed from: q  reason: collision with root package name */
    public static final boolean f17044q = false;

    /* renamed from: p  reason: collision with root package name */
    public k f17045p;

    public q(String str) {
        this.f16911a = str;
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
        this.f17045p = e(Arrays.copyOf(dArr, i7 + 1));
    }

    public static k d(String str) {
        String[] split = str.split("\\s+");
        int length = split.length;
        double[] dArr = new double[length];
        for (int i7 = 0; i7 < length; i7++) {
            dArr[i7] = Double.parseDouble(split[i7]);
        }
        return e(dArr);
    }

    public static k e(double[] dArr) {
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
        k kVar = new k(dArr3, dArr2);
        System.out.println(" 0 " + kVar.c(androidx.cardview.widget.g.f1896q, 0));
        System.out.println(" 1 " + kVar.c(1.0d, 0));
        return kVar;
    }

    @Override // u.d
    public double a(double d7) {
        return this.f17045p.c(d7, 0);
    }

    @Override // u.d
    public double b(double d7) {
        return this.f17045p.f(d7, 0);
    }
}