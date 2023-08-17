package u;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import u.v;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: h  reason: collision with root package name */
    public static final String f16933h = "KeyCycleOscillator";

    /* renamed from: a  reason: collision with root package name */
    public u.b f16934a;

    /* renamed from: b  reason: collision with root package name */
    public c f16935b;

    /* renamed from: c  reason: collision with root package name */
    public String f16936c;

    /* renamed from: d  reason: collision with root package name */
    public int f16937d = 0;

    /* renamed from: e  reason: collision with root package name */
    public String f16938e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f16939f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<g> f16940g = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Comparator<g> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            return Integer.compare(gVar.f16964a, gVar2.f16964a);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends h {

        /* renamed from: i  reason: collision with root package name */
        public String f16942i;

        /* renamed from: j  reason: collision with root package name */
        public int f16943j;

        public b(String str) {
            this.f16942i = str;
            this.f16943j = v.c.a(str);
        }

        @Override // u.h
        public void h(r.f fVar, float f7) {
            fVar.c(this.f16943j, a(f7));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: q  reason: collision with root package name */
        public static final int f16944q = -1;

        /* renamed from: r  reason: collision with root package name */
        public static final String f16945r = "CycleOscillator";

        /* renamed from: a  reason: collision with root package name */
        public final int f16946a;

        /* renamed from: b  reason: collision with root package name */
        public l f16947b;

        /* renamed from: c  reason: collision with root package name */
        public final int f16948c;

        /* renamed from: d  reason: collision with root package name */
        public final int f16949d;

        /* renamed from: e  reason: collision with root package name */
        public final int f16950e;

        /* renamed from: f  reason: collision with root package name */
        public float[] f16951f;

        /* renamed from: g  reason: collision with root package name */
        public double[] f16952g;

        /* renamed from: h  reason: collision with root package name */
        public float[] f16953h;

        /* renamed from: i  reason: collision with root package name */
        public float[] f16954i;

        /* renamed from: j  reason: collision with root package name */
        public float[] f16955j;

        /* renamed from: k  reason: collision with root package name */
        public float[] f16956k;

        /* renamed from: l  reason: collision with root package name */
        public int f16957l;

        /* renamed from: m  reason: collision with root package name */
        public u.b f16958m;

        /* renamed from: n  reason: collision with root package name */
        public double[] f16959n;

        /* renamed from: o  reason: collision with root package name */
        public double[] f16960o;

        /* renamed from: p  reason: collision with root package name */
        public float f16961p;

        public c(int i7, String str, int i8, int i9) {
            l lVar = new l();
            this.f16947b = lVar;
            this.f16948c = 0;
            this.f16949d = 1;
            this.f16950e = 2;
            this.f16957l = i7;
            this.f16946a = i8;
            lVar.g(i7, str);
            this.f16951f = new float[i9];
            this.f16952g = new double[i9];
            this.f16953h = new float[i9];
            this.f16954i = new float[i9];
            this.f16955j = new float[i9];
            this.f16956k = new float[i9];
        }

        public double a() {
            return this.f16959n[1];
        }

        public double b(float f7) {
            u.b bVar = this.f16958m;
            if (bVar != null) {
                double d7 = f7;
                bVar.g(d7, this.f16960o);
                this.f16958m.d(d7, this.f16959n);
            } else {
                double[] dArr = this.f16960o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d8 = f7;
            double e7 = this.f16947b.e(d8, this.f16959n[1]);
            double d9 = this.f16947b.d(d8, this.f16959n[1], this.f16960o[1]);
            double[] dArr2 = this.f16960o;
            return dArr2[0] + (e7 * dArr2[2]) + (d9 * this.f16959n[2]);
        }

        public double c(float f7) {
            u.b bVar = this.f16958m;
            if (bVar != null) {
                bVar.d(f7, this.f16959n);
            } else {
                double[] dArr = this.f16959n;
                dArr[0] = this.f16954i[0];
                dArr[1] = this.f16955j[0];
                dArr[2] = this.f16951f[0];
            }
            double[] dArr2 = this.f16959n;
            return dArr2[0] + (this.f16947b.e(f7, dArr2[1]) * this.f16959n[2]);
        }

        public void d(int i7, int i8, float f7, float f8, float f9, float f10) {
            this.f16952g[i7] = i8 / 100.0d;
            this.f16953h[i7] = f7;
            this.f16954i[i7] = f8;
            this.f16955j[i7] = f9;
            this.f16951f[i7] = f10;
        }

        public void e(float f7) {
            this.f16961p = f7;
            double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, this.f16952g.length, 3);
            float[] fArr = this.f16951f;
            this.f16959n = new double[fArr.length + 2];
            this.f16960o = new double[fArr.length + 2];
            if (this.f16952g[0] > androidx.cardview.widget.g.f1896q) {
                this.f16947b.a(androidx.cardview.widget.g.f1896q, this.f16953h[0]);
            }
            double[] dArr2 = this.f16952g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f16947b.a(1.0d, this.f16953h[length]);
            }
            for (int i7 = 0; i7 < dArr.length; i7++) {
                double[] dArr3 = dArr[i7];
                dArr3[0] = this.f16954i[i7];
                dArr3[1] = this.f16955j[i7];
                dArr3[2] = this.f16951f[i7];
                this.f16947b.a(this.f16952g[i7], this.f16953h[i7]);
            }
            this.f16947b.f();
            double[] dArr4 = this.f16952g;
            if (dArr4.length > 1) {
                this.f16958m = u.b.a(0, dArr4, dArr);
            } else {
                this.f16958m = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static int a(int[] iArr, float[] fArr, int i7, int i8) {
            int i9 = iArr[i8];
            int i10 = i7;
            while (i7 < i8) {
                if (iArr[i7] <= i9) {
                    c(iArr, fArr, i10, i7);
                    i10++;
                }
                i7++;
            }
            c(iArr, fArr, i10, i8);
            return i10;
        }

        public static void b(int[] iArr, float[] fArr, int i7, int i8) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i8;
            iArr2[1] = i7;
            int i9 = 2;
            while (i9 > 0) {
                int i10 = i9 - 1;
                int i11 = iArr2[i10];
                i9 = i10 - 1;
                int i12 = iArr2[i9];
                if (i11 < i12) {
                    int a7 = a(iArr, fArr, i11, i12);
                    int i13 = i9 + 1;
                    iArr2[i9] = a7 - 1;
                    int i14 = i13 + 1;
                    iArr2[i13] = i11;
                    int i15 = i14 + 1;
                    iArr2[i14] = i12;
                    i9 = i15 + 1;
                    iArr2[i15] = a7 + 1;
                }
            }
        }

        public static void c(int[] iArr, float[] fArr, int i7, int i8) {
            int i9 = iArr[i7];
            iArr[i7] = iArr[i8];
            iArr[i8] = i9;
            float f7 = fArr[i7];
            fArr[i7] = fArr[i8];
            fArr[i8] = f7;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static int a(int[] iArr, float[] fArr, float[] fArr2, int i7, int i8) {
            int i9 = iArr[i8];
            int i10 = i7;
            while (i7 < i8) {
                if (iArr[i7] <= i9) {
                    c(iArr, fArr, fArr2, i10, i7);
                    i10++;
                }
                i7++;
            }
            c(iArr, fArr, fArr2, i10, i8);
            return i10;
        }

        public static void b(int[] iArr, float[] fArr, float[] fArr2, int i7, int i8) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i8;
            iArr2[1] = i7;
            int i9 = 2;
            while (i9 > 0) {
                int i10 = i9 - 1;
                int i11 = iArr2[i10];
                i9 = i10 - 1;
                int i12 = iArr2[i9];
                if (i11 < i12) {
                    int a7 = a(iArr, fArr, fArr2, i11, i12);
                    int i13 = i9 + 1;
                    iArr2[i9] = a7 - 1;
                    int i14 = i13 + 1;
                    iArr2[i13] = i11;
                    int i15 = i14 + 1;
                    iArr2[i14] = i12;
                    i9 = i15 + 1;
                    iArr2[i15] = a7 + 1;
                }
            }
        }

        public static void c(int[] iArr, float[] fArr, float[] fArr2, int i7, int i8) {
            int i9 = iArr[i7];
            iArr[i7] = iArr[i8];
            iArr[i8] = i9;
            float f7 = fArr[i7];
            fArr[i7] = fArr[i8];
            fArr[i8] = f7;
            float f8 = fArr2[i7];
            fArr2[i7] = fArr2[i8];
            fArr2[i8] = f8;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends h {

        /* renamed from: i  reason: collision with root package name */
        public String f16962i;

        /* renamed from: j  reason: collision with root package name */
        public int f16963j;

        public f(String str) {
            this.f16962i = str;
            this.f16963j = v.c.a(str);
        }

        @Override // u.h
        public void h(r.f fVar, float f7) {
            fVar.c(this.f16963j, a(f7));
        }

        public void l(r.f fVar, float f7, double d7, double d8) {
            fVar.R(a(f7) + ((float) Math.toDegrees(Math.atan2(d8, d7))));
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public int f16964a;

        /* renamed from: b  reason: collision with root package name */
        public float f16965b;

        /* renamed from: c  reason: collision with root package name */
        public float f16966c;

        /* renamed from: d  reason: collision with root package name */
        public float f16967d;

        /* renamed from: e  reason: collision with root package name */
        public float f16968e;

        public g(int i7, float f7, float f8, float f9, float f10) {
            this.f16964a = i7;
            this.f16965b = f10;
            this.f16966c = f8;
            this.f16967d = f7;
            this.f16968e = f9;
        }
    }

    public static h d(String str) {
        return str.equals("pathRotate") ? new f(str) : new b(str);
    }

    public float a(float f7) {
        return (float) this.f16935b.c(f7);
    }

    public u.b b() {
        return this.f16934a;
    }

    public float c(float f7) {
        return (float) this.f16935b.b(f7);
    }

    public void e(Object obj) {
    }

    public void f(int i7, int i8, String str, int i9, float f7, float f8, float f9, float f10) {
        this.f16940g.add(new g(i7, f7, f8, f9, f10));
        if (i9 != -1) {
            this.f16939f = i9;
        }
        this.f16937d = i8;
        this.f16938e = str;
    }

    public void g(int i7, int i8, String str, int i9, float f7, float f8, float f9, float f10, Object obj) {
        this.f16940g.add(new g(i7, f7, f8, f9, f10));
        if (i9 != -1) {
            this.f16939f = i9;
        }
        this.f16937d = i8;
        e(obj);
        this.f16938e = str;
    }

    public void h(r.f fVar, float f7) {
    }

    public void i(String str) {
        this.f16936c = str;
    }

    public void j(float f7) {
        int size = this.f16940g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f16940g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, 3);
        this.f16935b = new c(this.f16937d, this.f16938e, this.f16939f, size);
        Iterator<g> it = this.f16940g.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            g next = it.next();
            float f8 = next.f16967d;
            dArr[i7] = f8 * 0.01d;
            double[] dArr3 = dArr2[i7];
            float f9 = next.f16965b;
            dArr3[0] = f9;
            float f10 = next.f16966c;
            dArr3[1] = f10;
            float f11 = next.f16968e;
            dArr3[2] = f11;
            this.f16935b.d(i7, next.f16964a, f8, f10, f11, f9);
            i7++;
            dArr2 = dArr2;
        }
        this.f16935b.e(f7);
        this.f16934a = u.b.a(0, dArr, dArr2);
    }

    public boolean k() {
        return this.f16939f == 1;
    }

    public String toString() {
        String str = this.f16936c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<g> it = this.f16940g.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().f16964a + " , " + decimalFormat.format(r3.f16965b) + "] ";
        }
        return str;
    }
}