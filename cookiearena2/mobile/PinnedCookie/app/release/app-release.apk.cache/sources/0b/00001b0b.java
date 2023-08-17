package u;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import u.i;
import u.v;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: f  reason: collision with root package name */
    public static final String f17018f = "SplineSet";

    /* renamed from: a  reason: collision with root package name */
    public u.b f17019a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f17020b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    public float[] f17021c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    public int f17022d;

    /* renamed from: e  reason: collision with root package name */
    public String f17023e;

    /* loaded from: classes.dex */
    public static class a extends o {

        /* renamed from: g  reason: collision with root package name */
        public String f17024g;

        /* renamed from: h  reason: collision with root package name */
        public long f17025h;

        public a(String str, long j7) {
            this.f17024g = str;
            this.f17025h = j7;
        }

        @Override // u.o
        public void h(v vVar, float f7) {
            vVar.c(vVar.a(this.f17024g), a(f7));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends o {

        /* renamed from: g  reason: collision with root package name */
        public String f17026g;

        /* renamed from: h  reason: collision with root package name */
        public i.a f17027h;

        /* renamed from: i  reason: collision with root package name */
        public float[] f17028i;

        public b(String str, i.a aVar) {
            this.f17026g = str.split(",")[1];
            this.f17027h = aVar;
        }

        @Override // u.o
        public void g(int i7, float f7) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // u.o
        public void j(int i7) {
            int f7 = this.f17027h.f();
            int h7 = this.f17027h.g(0).h();
            double[] dArr = new double[f7];
            this.f17028i = new float[h7];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, f7, h7);
            for (int i8 = 0; i8 < f7; i8++) {
                int d7 = this.f17027h.d(i8);
                r.a g7 = this.f17027h.g(i8);
                dArr[i8] = d7 * 0.01d;
                g7.e(this.f17028i);
                int i9 = 0;
                while (true) {
                    if (i9 < this.f17028i.length) {
                        dArr2[i8][i9] = r6[i9];
                        i9++;
                    }
                }
            }
            this.f17019a = u.b.a(i7, dArr, dArr2);
        }

        public void k(int i7, r.a aVar) {
            this.f17027h.a(i7, aVar);
        }

        public void l(w.r rVar, float f7) {
            this.f17019a.e(f7, this.f17028i);
            rVar.z(this.f17027h.g(0), this.f17028i);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends o {

        /* renamed from: g  reason: collision with root package name */
        public String f17029g;

        /* renamed from: h  reason: collision with root package name */
        public i.b f17030h;

        /* renamed from: i  reason: collision with root package name */
        public float[] f17031i;

        public c(String str, i.b bVar) {
            this.f17029g = str.split(",")[1];
            this.f17030h = bVar;
        }

        @Override // u.o
        public void g(int i7, float f7) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // u.o
        public void h(v vVar, float f7) {
            l((r.f) vVar, f7);
        }

        @Override // u.o
        public void j(int i7) {
            int f7 = this.f17030h.f();
            int r6 = this.f17030h.g(0).r();
            double[] dArr = new double[f7];
            this.f17031i = new float[r6];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, f7, r6);
            for (int i8 = 0; i8 < f7; i8++) {
                int d7 = this.f17030h.d(i8);
                r.b g7 = this.f17030h.g(i8);
                dArr[i8] = d7 * 0.01d;
                g7.o(this.f17031i);
                int i9 = 0;
                while (true) {
                    if (i9 < this.f17031i.length) {
                        dArr2[i8][i9] = r6[i9];
                        i9++;
                    }
                }
            }
            this.f17019a = u.b.a(i7, dArr, dArr2);
        }

        public void k(int i7, r.b bVar) {
            this.f17030h.a(i7, bVar);
        }

        public void l(r.f fVar, float f7) {
            this.f17019a.e(f7, this.f17031i);
            this.f17030h.g(0).w(fVar, this.f17031i);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static void a(int[] iArr, float[] fArr, int i7, int i8) {
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

        public static int b(int[] iArr, float[] fArr, int i7, int i8) {
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

        public static void c(int[] iArr, float[] fArr, int i7, int i8) {
            int i9 = iArr[i7];
            iArr[i7] = iArr[i8];
            iArr[i8] = i9;
            float f7 = fArr[i7];
            fArr[i7] = fArr[i8];
            fArr[i8] = f7;
        }
    }

    public static o d(String str, i.a aVar) {
        return new b(str, aVar);
    }

    public static o e(String str, i.b bVar) {
        return new c(str, bVar);
    }

    public static o f(String str, long j7) {
        return new a(str, j7);
    }

    public float a(float f7) {
        return (float) this.f17019a.c(f7, 0);
    }

    public u.b b() {
        return this.f17019a;
    }

    public float c(float f7) {
        return (float) this.f17019a.f(f7, 0);
    }

    public void g(int i7, float f7) {
        int[] iArr = this.f17020b;
        if (iArr.length < this.f17022d + 1) {
            this.f17020b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f17021c;
            this.f17021c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f17020b;
        int i8 = this.f17022d;
        iArr2[i8] = i7;
        this.f17021c[i8] = f7;
        this.f17022d = i8 + 1;
    }

    public void h(v vVar, float f7) {
        vVar.c(v.a.a(this.f17023e), a(f7));
    }

    public void i(String str) {
        this.f17023e = str;
    }

    public void j(int i7) {
        int i8;
        int i9 = this.f17022d;
        if (i9 == 0) {
            return;
        }
        d.a(this.f17020b, this.f17021c, 0, i9 - 1);
        int i10 = 1;
        for (int i11 = 1; i11 < this.f17022d; i11++) {
            int[] iArr = this.f17020b;
            if (iArr[i11 - 1] != iArr[i11]) {
                i10++;
            }
        }
        double[] dArr = new double[i10];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i10, 1);
        int i12 = 0;
        for (0; i8 < this.f17022d; i8 + 1) {
            if (i8 > 0) {
                int[] iArr2 = this.f17020b;
                i8 = iArr2[i8] == iArr2[i8 - 1] ? i8 + 1 : 0;
            }
            dArr[i12] = this.f17020b[i8] * 0.01d;
            dArr2[i12][0] = this.f17021c[i8];
            i12++;
        }
        this.f17019a = u.b.a(i7, dArr, dArr2);
    }

    public String toString() {
        String str = this.f17023e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i7 = 0; i7 < this.f17022d; i7++) {
            str = str + "[" + this.f17020b[i7] + " , " + decimalFormat.format(this.f17021c[i7]) + "] ";
        }
        return str;
    }
}