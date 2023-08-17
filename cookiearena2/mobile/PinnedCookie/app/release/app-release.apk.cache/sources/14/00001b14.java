package u;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import u.i;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: k  reason: collision with root package name */
    public static final String f17062k = "SplineSet";

    /* renamed from: l  reason: collision with root package name */
    public static final int f17063l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f17064m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f17065n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static float f17066o = 6.2831855f;

    /* renamed from: a  reason: collision with root package name */
    public u.b f17067a;

    /* renamed from: e  reason: collision with root package name */
    public int f17071e;

    /* renamed from: f  reason: collision with root package name */
    public String f17072f;

    /* renamed from: i  reason: collision with root package name */
    public long f17075i;

    /* renamed from: b  reason: collision with root package name */
    public int f17068b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int[] f17069c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    public float[][] f17070d = (float[][]) Array.newInstance(Float.TYPE, 10, 3);

    /* renamed from: g  reason: collision with root package name */
    public float[] f17073g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    public boolean f17074h = false;

    /* renamed from: j  reason: collision with root package name */
    public float f17076j = Float.NaN;

    /* loaded from: classes.dex */
    public static class a extends t {

        /* renamed from: p  reason: collision with root package name */
        public String f17077p;

        /* renamed from: q  reason: collision with root package name */
        public i.a f17078q;

        /* renamed from: r  reason: collision with root package name */
        public i.c f17079r = new i.c();

        /* renamed from: s  reason: collision with root package name */
        public float[] f17080s;

        /* renamed from: t  reason: collision with root package name */
        public float[] f17081t;

        public a(String str, i.a aVar) {
            this.f17077p = str.split(",")[1];
            this.f17078q = aVar;
        }

        @Override // u.t
        public void c(int i7, float f7, float f8, int i8, float f9) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // u.t
        public void f(int i7) {
            int f7 = this.f17078q.f();
            int h7 = this.f17078q.g(0).h();
            double[] dArr = new double[f7];
            int i8 = h7 + 2;
            this.f17080s = new float[i8];
            this.f17081t = new float[h7];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, f7, i8);
            for (int i9 = 0; i9 < f7; i9++) {
                int d7 = this.f17078q.d(i9);
                r.a g7 = this.f17078q.g(i9);
                float[] g8 = this.f17079r.g(i9);
                dArr[i9] = d7 * 0.01d;
                g7.e(this.f17080s);
                int i10 = 0;
                while (true) {
                    if (i10 < this.f17080s.length) {
                        dArr2[i9][i10] = r8[i10];
                        i10++;
                    }
                }
                double[] dArr3 = dArr2[i9];
                dArr3[h7] = g8[0];
                dArr3[h7 + 1] = g8[1];
            }
            this.f17067a = u.b.a(i7, dArr, dArr2);
        }

        public void g(int i7, r.a aVar, float f7, int i8, float f8) {
            this.f17078q.a(i7, aVar);
            this.f17079r.a(i7, new float[]{f7, f8});
            this.f17068b = Math.max(this.f17068b, i8);
        }

        public boolean h(r.f fVar, float f7, long j7, g gVar) {
            this.f17067a.e(f7, this.f17080s);
            float[] fArr = this.f17080s;
            float f8 = fArr[fArr.length - 2];
            float f9 = fArr[fArr.length - 1];
            long j8 = j7 - this.f17075i;
            if (Float.isNaN(this.f17076j)) {
                float a7 = gVar.a(fVar, this.f17077p, 0);
                this.f17076j = a7;
                if (Float.isNaN(a7)) {
                    this.f17076j = 0.0f;
                }
            }
            float f10 = (float) ((this.f17076j + ((j8 * 1.0E-9d) * f8)) % 1.0d);
            this.f17076j = f10;
            this.f17075i = j7;
            float a8 = a(f10);
            this.f17074h = false;
            int i7 = 0;
            while (true) {
                float[] fArr2 = this.f17081t;
                if (i7 >= fArr2.length) {
                    break;
                }
                boolean z6 = this.f17074h;
                float f11 = this.f17080s[i7];
                this.f17074h = z6 | (((double) f11) != androidx.cardview.widget.g.f1896q);
                fArr2[i7] = (f11 * a8) + f9;
                i7++;
            }
            fVar.M(this.f17078q.g(0), this.f17081t);
            if (f8 != 0.0f) {
                this.f17074h = true;
            }
            return this.f17074h;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends t {

        /* renamed from: p  reason: collision with root package name */
        public String f17082p;

        /* renamed from: q  reason: collision with root package name */
        public i.b f17083q;

        /* renamed from: r  reason: collision with root package name */
        public i.c f17084r = new i.c();

        /* renamed from: s  reason: collision with root package name */
        public float[] f17085s;

        /* renamed from: t  reason: collision with root package name */
        public float[] f17086t;

        public b(String str, i.b bVar) {
            this.f17082p = str.split(",")[1];
            this.f17083q = bVar;
        }

        @Override // u.t
        public void c(int i7, float f7, float f8, int i8, float f9) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // u.t
        public void f(int i7) {
            int f7 = this.f17083q.f();
            int r6 = this.f17083q.g(0).r();
            double[] dArr = new double[f7];
            int i8 = r6 + 2;
            this.f17085s = new float[i8];
            this.f17086t = new float[r6];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, f7, i8);
            for (int i9 = 0; i9 < f7; i9++) {
                int d7 = this.f17083q.d(i9);
                r.b g7 = this.f17083q.g(i9);
                float[] g8 = this.f17084r.g(i9);
                dArr[i9] = d7 * 0.01d;
                g7.o(this.f17085s);
                int i10 = 0;
                while (true) {
                    if (i10 < this.f17085s.length) {
                        dArr2[i9][i10] = r8[i10];
                        i10++;
                    }
                }
                double[] dArr3 = dArr2[i9];
                dArr3[r6] = g8[0];
                dArr3[r6 + 1] = g8[1];
            }
            this.f17067a = u.b.a(i7, dArr, dArr2);
        }

        public void g(int i7, r.b bVar, float f7, int i8, float f8) {
            this.f17083q.a(i7, bVar);
            this.f17084r.a(i7, new float[]{f7, f8});
            this.f17068b = Math.max(this.f17068b, i8);
        }

        public boolean h(r.f fVar, float f7, long j7, g gVar) {
            this.f17067a.e(f7, this.f17085s);
            float[] fArr = this.f17085s;
            float f8 = fArr[fArr.length - 2];
            float f9 = fArr[fArr.length - 1];
            long j8 = j7 - this.f17075i;
            if (Float.isNaN(this.f17076j)) {
                float a7 = gVar.a(fVar, this.f17082p, 0);
                this.f17076j = a7;
                if (Float.isNaN(a7)) {
                    this.f17076j = 0.0f;
                }
            }
            float f10 = (float) ((this.f17076j + ((j8 * 1.0E-9d) * f8)) % 1.0d);
            this.f17076j = f10;
            this.f17075i = j7;
            float a8 = a(f10);
            this.f17074h = false;
            int i7 = 0;
            while (true) {
                float[] fArr2 = this.f17086t;
                if (i7 >= fArr2.length) {
                    break;
                }
                boolean z6 = this.f17074h;
                float f11 = this.f17085s[i7];
                this.f17074h = z6 | (((double) f11) != androidx.cardview.widget.g.f1896q);
                fArr2[i7] = (f11 * a8) + f9;
                i7++;
            }
            this.f17083q.g(0).w(fVar, this.f17086t);
            if (f8 != 0.0f) {
                this.f17074h = true;
            }
            return this.f17074h;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(int[] iArr, float[][] fArr, int i7, int i8) {
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
                    int b7 = b(iArr, fArr, i11, i12);
                    int i13 = i9 + 1;
                    iArr2[i9] = b7 - 1;
                    int i14 = i13 + 1;
                    iArr2[i13] = i11;
                    int i15 = i14 + 1;
                    iArr2[i14] = i12;
                    i9 = i15 + 1;
                    iArr2[i15] = b7 + 1;
                }
            }
        }

        public static int b(int[] iArr, float[][] fArr, int i7, int i8) {
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

        public static void c(int[] iArr, float[][] fArr, int i7, int i8) {
            int i9 = iArr[i7];
            iArr[i7] = iArr[i8];
            iArr[i8] = i9;
            float[] fArr2 = fArr[i7];
            fArr[i7] = fArr[i8];
            fArr[i8] = fArr2;
        }
    }

    public float a(float f7) {
        float abs;
        switch (this.f17068b) {
            case 1:
                return Math.signum(f7 * f17066o);
            case 2:
                abs = Math.abs(f7);
                break;
            case 3:
                return (((f7 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f7 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f7 * f17066o);
            case 6:
                float abs2 = 1.0f - Math.abs(((f7 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f7 * f17066o);
        }
        return 1.0f - abs;
    }

    public u.b b() {
        return this.f17067a;
    }

    public void c(int i7, float f7, float f8, int i8, float f9) {
        int[] iArr = this.f17069c;
        int i9 = this.f17071e;
        iArr[i9] = i7;
        float[] fArr = this.f17070d[i9];
        fArr[0] = f7;
        fArr[1] = f8;
        fArr[2] = f9;
        this.f17068b = Math.max(this.f17068b, i8);
        this.f17071e++;
    }

    public void d(long j7) {
        this.f17075i = j7;
    }

    public void e(String str) {
        this.f17072f = str;
    }

    public void f(int i7) {
        int i8;
        int i9 = this.f17071e;
        if (i9 == 0) {
            System.err.println("Error no points added to " + this.f17072f);
            return;
        }
        c.a(this.f17069c, this.f17070d, 0, i9 - 1);
        int i10 = 1;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f17069c;
            if (i10 >= iArr.length) {
                break;
            }
            if (iArr[i10] != iArr[i10 - 1]) {
                i11++;
            }
            i10++;
        }
        if (i11 == 0) {
            i11 = 1;
        }
        double[] dArr = new double[i11];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i11, 3);
        int i12 = 0;
        for (0; i8 < this.f17071e; i8 + 1) {
            if (i8 > 0) {
                int[] iArr2 = this.f17069c;
                i8 = iArr2[i8] == iArr2[i8 - 1] ? i8 + 1 : 0;
            }
            dArr[i12] = this.f17069c[i8] * 0.01d;
            double[] dArr3 = dArr2[i12];
            float[] fArr = this.f17070d[i8];
            dArr3[0] = fArr[0];
            dArr3[1] = fArr[1];
            dArr3[2] = fArr[2];
            i12++;
        }
        this.f17067a = u.b.a(i7, dArr, dArr2);
    }

    public String toString() {
        String str = this.f17072f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i7 = 0; i7 < this.f17071e; i7++) {
            str = str + "[" + this.f17069c[i7] + " , " + decimalFormat.format(this.f17070d[i7]) + "] ";
        }
        return str;
    }
}