package r;

import androidx.cardview.widget.g;
import java.util.Arrays;
import java.util.HashMap;
import r.f;
/* loaded from: classes.dex */
public class e implements Comparable<e> {
    public static final String D = "MotionPaths";
    public static final boolean E = false;
    public static final boolean F = false;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    public static final int K = 4;
    public static final int L = 5;
    public static final int M = 1;
    public static final int N = 0;
    public static final int O = 2;
    public static String[] P = {"position", "x", "y", "width", "height", "pathRotate"};
    public int A;
    public double[] B;
    public double[] C;

    /* renamed from: k  reason: collision with root package name */
    public u.d f15395k;

    /* renamed from: l  reason: collision with root package name */
    public int f15396l;

    /* renamed from: m  reason: collision with root package name */
    public float f15397m;

    /* renamed from: n  reason: collision with root package name */
    public float f15398n;

    /* renamed from: o  reason: collision with root package name */
    public float f15399o;

    /* renamed from: p  reason: collision with root package name */
    public float f15400p;

    /* renamed from: q  reason: collision with root package name */
    public float f15401q;

    /* renamed from: r  reason: collision with root package name */
    public float f15402r;

    /* renamed from: s  reason: collision with root package name */
    public float f15403s;

    /* renamed from: t  reason: collision with root package name */
    public float f15404t;

    /* renamed from: u  reason: collision with root package name */
    public int f15405u;

    /* renamed from: v  reason: collision with root package name */
    public int f15406v;

    /* renamed from: w  reason: collision with root package name */
    public float f15407w;

    /* renamed from: x  reason: collision with root package name */
    public c f15408x;

    /* renamed from: y  reason: collision with root package name */
    public HashMap<String, b> f15409y;

    /* renamed from: z  reason: collision with root package name */
    public int f15410z;

    public e() {
        this.f15396l = 0;
        this.f15403s = Float.NaN;
        this.f15404t = Float.NaN;
        this.f15405u = -1;
        this.f15406v = -1;
        this.f15407w = Float.NaN;
        this.f15408x = null;
        this.f15409y = new HashMap<>();
        this.f15410z = 0;
        this.B = new double[18];
        this.C = new double[18];
    }

    public static final float A(float f7, float f8, float f9, float f10, float f11, float f12) {
        return (((f11 - f9) * f8) - ((f12 - f10) * f7)) + f9;
    }

    public static final float B(float f7, float f8, float f9, float f10, float f11, float f12) {
        return ((f11 - f9) * f7) + ((f12 - f10) * f8) + f10;
    }

    public void c(f fVar) {
        this.f15395k = u.d.c(fVar.f15426i.f15435c);
        f.a aVar = fVar.f15426i;
        this.f15405u = aVar.f15436d;
        this.f15406v = aVar.f15433a;
        this.f15403s = aVar.f15440h;
        this.f15396l = aVar.f15437e;
        this.A = aVar.f15434b;
        this.f15404t = fVar.f15427j.f15449d;
        this.f15407w = 0.0f;
        for (String str : fVar.j()) {
            b i7 = fVar.i(str);
            if (i7 != null && i7.q()) {
                this.f15409y.put(str, i7);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        return Float.compare(this.f15398n, eVar.f15398n);
    }

    public void e(c cVar) {
        cVar.F(this.f15404t);
    }

    public final boolean h(float f7, float f8) {
        return (Float.isNaN(f7) || Float.isNaN(f8)) ? Float.isNaN(f7) != Float.isNaN(f8) : Math.abs(f7 - f8) > 1.0E-6f;
    }

    public void i(e eVar, boolean[] zArr, String[] strArr, boolean z6) {
        boolean h7 = h(this.f15399o, eVar.f15399o);
        boolean h8 = h(this.f15400p, eVar.f15400p);
        zArr[0] = zArr[0] | h(this.f15398n, eVar.f15398n);
        boolean z7 = h7 | h8 | z6;
        zArr[1] = zArr[1] | z7;
        zArr[2] = z7 | zArr[2];
        zArr[3] = zArr[3] | h(this.f15401q, eVar.f15401q);
        zArr[4] = h(this.f15402r, eVar.f15402r) | zArr[4];
    }

    public void j(double[] dArr, int[] iArr) {
        float[] fArr = {this.f15398n, this.f15399o, this.f15400p, this.f15401q, this.f15402r, this.f15403s};
        int i7 = 0;
        for (int i8 : iArr) {
            if (i8 < 6) {
                dArr[i7] = fArr[r4];
                i7++;
            }
        }
    }

    public void k(int[] iArr, double[] dArr, float[] fArr, int i7) {
        float f7 = this.f15401q;
        float f8 = this.f15402r;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f9 = (float) dArr[i8];
            int i9 = iArr[i8];
            if (i9 == 3) {
                f7 = f9;
            } else if (i9 == 4) {
                f8 = f9;
            }
        }
        fArr[i7] = f7;
        fArr[i7 + 1] = f8;
    }

    public void l(double d7, int[] iArr, double[] dArr, float[] fArr, int i7) {
        float f7 = this.f15399o;
        float f8 = this.f15400p;
        float f9 = this.f15401q;
        float f10 = this.f15402r;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f11 = (float) dArr[i8];
            int i9 = iArr[i8];
            if (i9 == 1) {
                f7 = f11;
            } else if (i9 == 2) {
                f8 = f11;
            } else if (i9 == 3) {
                f9 = f11;
            } else if (i9 == 4) {
                f10 = f11;
            }
        }
        c cVar = this.f15408x;
        if (cVar != null) {
            float[] fArr2 = new float[2];
            cVar.r(d7, fArr2, new float[2]);
            float f12 = fArr2[0];
            float f13 = fArr2[1];
            double d8 = f12;
            double d9 = f7;
            double d10 = f8;
            f7 = (float) ((d8 + (Math.sin(d10) * d9)) - (f9 / 2.0f));
            f8 = (float) ((f13 - (d9 * Math.cos(d10))) - (f10 / 2.0f));
        }
        fArr[i7] = f7 + (f9 / 2.0f) + 0.0f;
        fArr[i7 + 1] = f8 + (f10 / 2.0f) + 0.0f;
    }

    public void m(double d7, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f7;
        float f8 = this.f15399o;
        float f9 = this.f15400p;
        float f10 = this.f15401q;
        float f11 = this.f15402r;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            float f16 = (float) dArr[i7];
            float f17 = (float) dArr2[i7];
            int i8 = iArr[i7];
            if (i8 == 1) {
                f8 = f16;
                f12 = f17;
            } else if (i8 == 2) {
                f9 = f16;
                f14 = f17;
            } else if (i8 == 3) {
                f10 = f16;
                f13 = f17;
            } else if (i8 == 4) {
                f11 = f16;
                f15 = f17;
            }
        }
        float f18 = 2.0f;
        float f19 = (f13 / 2.0f) + f12;
        float f20 = (f15 / 2.0f) + f14;
        c cVar = this.f15408x;
        if (cVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            cVar.r(d7, fArr3, fArr4);
            float f21 = fArr3[0];
            float f22 = fArr3[1];
            float f23 = fArr4[0];
            float f24 = fArr4[1];
            double d8 = f8;
            double d9 = f9;
            f7 = f10;
            float sin = (float) ((f21 + (Math.sin(d9) * d8)) - (f10 / 2.0f));
            float cos = (float) ((f22 - (d8 * Math.cos(d9))) - (f11 / 2.0f));
            double d10 = f12;
            double d11 = f14;
            float sin2 = (float) (f23 + (Math.sin(d9) * d10) + (Math.cos(d9) * d11));
            f20 = (float) ((f24 - (d10 * Math.cos(d9))) + (Math.sin(d9) * d11));
            f19 = sin2;
            f8 = sin;
            f9 = cos;
            f18 = 2.0f;
        } else {
            f7 = f10;
        }
        fArr[0] = f8 + (f7 / f18) + 0.0f;
        fArr[1] = f9 + (f11 / f18) + 0.0f;
        fArr2[0] = f19;
        fArr2[1] = f20;
    }

    public void n(double d7, int[] iArr, double[] dArr, float[] fArr, int i7) {
        float f7 = this.f15399o;
        float f8 = this.f15400p;
        float f9 = this.f15401q;
        float f10 = this.f15402r;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f11 = (float) dArr[i8];
            int i9 = iArr[i8];
            if (i9 == 1) {
                f7 = f11;
            } else if (i9 == 2) {
                f8 = f11;
            } else if (i9 == 3) {
                f9 = f11;
            } else if (i9 == 4) {
                f10 = f11;
            }
        }
        c cVar = this.f15408x;
        if (cVar != null) {
            float[] fArr2 = new float[2];
            cVar.r(d7, fArr2, new float[2]);
            float f12 = fArr2[0];
            float f13 = fArr2[1];
            double d8 = f12;
            double d9 = f7;
            double d10 = f8;
            f7 = (float) ((d8 + (Math.sin(d10) * d9)) - (f9 / 2.0f));
            f8 = (float) ((f13 - (d9 * Math.cos(d10))) - (f10 / 2.0f));
        }
        fArr[i7] = f7 + (f9 / 2.0f) + 0.0f;
        fArr[i7 + 1] = f8 + (f10 / 2.0f) + 0.0f;
    }

    public int o(String str, double[] dArr, int i7) {
        b bVar = this.f15409y.get(str);
        int i8 = 0;
        if (bVar == null) {
            return 0;
        }
        if (bVar.r() == 1) {
            dArr[i7] = bVar.n();
            return 1;
        }
        int r6 = bVar.r();
        bVar.o(new float[r6]);
        while (i8 < r6) {
            dArr[i7] = r2[i8];
            i8++;
            i7++;
        }
        return r6;
    }

    public int p(String str) {
        b bVar = this.f15409y.get(str);
        if (bVar == null) {
            return 0;
        }
        return bVar.r();
    }

    public void q(int[] iArr, double[] dArr, float[] fArr, int i7) {
        float f7 = this.f15399o;
        float f8 = this.f15400p;
        float f9 = this.f15401q;
        float f10 = this.f15402r;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f11 = (float) dArr[i8];
            int i9 = iArr[i8];
            if (i9 == 1) {
                f7 = f11;
            } else if (i9 == 2) {
                f8 = f11;
            } else if (i9 == 3) {
                f9 = f11;
            } else if (i9 == 4) {
                f10 = f11;
            }
        }
        c cVar = this.f15408x;
        if (cVar != null) {
            float s6 = cVar.s();
            float t6 = this.f15408x.t();
            double d7 = f7;
            double d8 = f8;
            float sin = (float) ((s6 + (Math.sin(d8) * d7)) - (f9 / 2.0f));
            f8 = (float) ((t6 - (d7 * Math.cos(d8))) - (f10 / 2.0f));
            f7 = sin;
        }
        float f12 = f9 + f7;
        float f13 = f10 + f8;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i10 = i7 + 1;
        fArr[i7] = f7 + 0.0f;
        int i11 = i10 + 1;
        fArr[i10] = f8 + 0.0f;
        int i12 = i11 + 1;
        fArr[i11] = f12 + 0.0f;
        int i13 = i12 + 1;
        fArr[i12] = f8 + 0.0f;
        int i14 = i13 + 1;
        fArr[i13] = f12 + 0.0f;
        int i15 = i14 + 1;
        fArr[i14] = f13 + 0.0f;
        fArr[i15] = f7 + 0.0f;
        fArr[i15 + 1] = f13 + 0.0f;
    }

    public boolean r(String str) {
        return this.f15409y.containsKey(str);
    }

    public void s(s.e eVar, e eVar2, e eVar3) {
        float f7 = eVar.f16152h / 100.0f;
        this.f15397m = f7;
        this.f15396l = eVar.B;
        float f8 = Float.isNaN(eVar.C) ? f7 : eVar.C;
        float f9 = Float.isNaN(eVar.D) ? f7 : eVar.D;
        float f10 = eVar3.f15401q;
        float f11 = eVar2.f15401q;
        float f12 = eVar3.f15402r;
        float f13 = eVar2.f15402r;
        this.f15398n = this.f15397m;
        float f14 = eVar2.f15399o;
        float f15 = eVar2.f15400p;
        float f16 = (eVar3.f15399o + (f10 / 2.0f)) - ((f11 / 2.0f) + f14);
        float f17 = (eVar3.f15400p + (f12 / 2.0f)) - (f15 + (f13 / 2.0f));
        float f18 = ((f10 - f11) * f8) / 2.0f;
        this.f15399o = (int) ((f14 + (f16 * f7)) - f18);
        float f19 = ((f12 - f13) * f9) / 2.0f;
        this.f15400p = (int) ((f15 + (f17 * f7)) - f19);
        this.f15401q = (int) (f11 + r9);
        this.f15402r = (int) (f13 + r12);
        float f20 = Float.isNaN(eVar.E) ? f7 : eVar.E;
        float f21 = Float.isNaN(eVar.H) ? 0.0f : eVar.H;
        if (!Float.isNaN(eVar.F)) {
            f7 = eVar.F;
        }
        float f22 = Float.isNaN(eVar.G) ? 0.0f : eVar.G;
        this.f15410z = 0;
        this.f15399o = (int) (((eVar2.f15399o + (f20 * f16)) + (f22 * f17)) - f18);
        this.f15400p = (int) (((eVar2.f15400p + (f16 * f21)) + (f17 * f7)) - f19);
        this.f15395k = u.d.c(eVar.f16167z);
        this.f15405u = eVar.A;
    }

    public void t(s.e eVar, e eVar2, e eVar3) {
        float f7 = eVar.f16152h / 100.0f;
        this.f15397m = f7;
        this.f15396l = eVar.B;
        float f8 = Float.isNaN(eVar.C) ? f7 : eVar.C;
        float f9 = Float.isNaN(eVar.D) ? f7 : eVar.D;
        float f10 = eVar3.f15401q - eVar2.f15401q;
        float f11 = eVar3.f15402r - eVar2.f15402r;
        this.f15398n = this.f15397m;
        if (!Float.isNaN(eVar.E)) {
            f7 = eVar.E;
        }
        float f12 = eVar2.f15399o;
        float f13 = eVar2.f15401q;
        float f14 = eVar2.f15400p;
        float f15 = eVar2.f15402r;
        float f16 = (eVar3.f15399o + (eVar3.f15401q / 2.0f)) - ((f13 / 2.0f) + f12);
        float f17 = (eVar3.f15400p + (eVar3.f15402r / 2.0f)) - ((f15 / 2.0f) + f14);
        float f18 = f16 * f7;
        float f19 = (f10 * f8) / 2.0f;
        this.f15399o = (int) ((f12 + f18) - f19);
        float f20 = f7 * f17;
        float f21 = (f11 * f9) / 2.0f;
        this.f15400p = (int) ((f14 + f20) - f21);
        this.f15401q = (int) (f13 + r7);
        this.f15402r = (int) (f15 + r8);
        float f22 = Float.isNaN(eVar.F) ? 0.0f : eVar.F;
        this.f15410z = 1;
        float f23 = (int) ((eVar2.f15399o + f18) - f19);
        float f24 = (int) ((eVar2.f15400p + f20) - f21);
        this.f15399o = f23 + ((-f17) * f22);
        this.f15400p = f24 + (f16 * f22);
        this.f15406v = this.f15406v;
        this.f15395k = u.d.c(eVar.f16167z);
        this.f15405u = eVar.A;
    }

    public void u(int i7, int i8, s.e eVar, e eVar2, e eVar3) {
        float min;
        float f7;
        float f8 = eVar.f16152h / 100.0f;
        this.f15397m = f8;
        this.f15396l = eVar.B;
        this.f15410z = eVar.I;
        float f9 = Float.isNaN(eVar.C) ? f8 : eVar.C;
        float f10 = Float.isNaN(eVar.D) ? f8 : eVar.D;
        float f11 = eVar3.f15401q;
        float f12 = eVar2.f15401q;
        float f13 = eVar3.f15402r;
        float f14 = eVar2.f15402r;
        this.f15398n = this.f15397m;
        this.f15401q = (int) (f12 + ((f11 - f12) * f9));
        this.f15402r = (int) (f14 + ((f13 - f14) * f10));
        int i9 = eVar.I;
        if (i9 == 1) {
            float f15 = Float.isNaN(eVar.E) ? f8 : eVar.E;
            float f16 = eVar3.f15399o;
            float f17 = eVar2.f15399o;
            this.f15399o = (f15 * (f16 - f17)) + f17;
            if (!Float.isNaN(eVar.F)) {
                f8 = eVar.F;
            }
            float f18 = eVar3.f15400p;
            float f19 = eVar2.f15400p;
            this.f15400p = (f8 * (f18 - f19)) + f19;
        } else if (i9 != 2) {
            float f20 = Float.isNaN(eVar.E) ? f8 : eVar.E;
            float f21 = eVar3.f15399o;
            float f22 = eVar2.f15399o;
            this.f15399o = (f20 * (f21 - f22)) + f22;
            if (!Float.isNaN(eVar.F)) {
                f8 = eVar.F;
            }
            float f23 = eVar3.f15400p;
            float f24 = eVar2.f15400p;
            this.f15400p = (f8 * (f23 - f24)) + f24;
        } else {
            if (Float.isNaN(eVar.E)) {
                float f25 = eVar3.f15399o;
                float f26 = eVar2.f15399o;
                min = ((f25 - f26) * f8) + f26;
            } else {
                min = Math.min(f10, f9) * eVar.E;
            }
            this.f15399o = min;
            if (Float.isNaN(eVar.F)) {
                float f27 = eVar3.f15400p;
                float f28 = eVar2.f15400p;
                f7 = (f8 * (f27 - f28)) + f28;
            } else {
                f7 = eVar.F;
            }
            this.f15400p = f7;
        }
        this.f15406v = eVar2.f15406v;
        this.f15395k = u.d.c(eVar.f16167z);
        this.f15405u = eVar.A;
    }

    public void v(int i7, int i8, s.e eVar, e eVar2, e eVar3) {
        float f7 = eVar.f16152h / 100.0f;
        this.f15397m = f7;
        this.f15396l = eVar.B;
        float f8 = Float.isNaN(eVar.C) ? f7 : eVar.C;
        float f9 = Float.isNaN(eVar.D) ? f7 : eVar.D;
        float f10 = eVar3.f15401q;
        float f11 = eVar2.f15401q;
        float f12 = eVar3.f15402r;
        float f13 = eVar2.f15402r;
        this.f15398n = this.f15397m;
        float f14 = eVar2.f15399o;
        float f15 = eVar2.f15400p;
        float f16 = eVar3.f15399o + (f10 / 2.0f);
        float f17 = eVar3.f15400p + (f12 / 2.0f);
        float f18 = (f10 - f11) * f8;
        this.f15399o = (int) ((f14 + ((f16 - ((f11 / 2.0f) + f14)) * f7)) - (f18 / 2.0f));
        float f19 = (f12 - f13) * f9;
        this.f15400p = (int) ((f15 + ((f17 - (f15 + (f13 / 2.0f))) * f7)) - (f19 / 2.0f));
        this.f15401q = (int) (f11 + f18);
        this.f15402r = (int) (f13 + f19);
        this.f15410z = 2;
        if (!Float.isNaN(eVar.E)) {
            this.f15399o = (int) (eVar.E * ((int) (i7 - this.f15401q)));
        }
        if (!Float.isNaN(eVar.F)) {
            this.f15400p = (int) (eVar.F * ((int) (i8 - this.f15402r)));
        }
        this.f15406v = this.f15406v;
        this.f15395k = u.d.c(eVar.f16167z);
        this.f15405u = eVar.A;
    }

    public void w(float f7, float f8, float f9, float f10) {
        this.f15399o = f7;
        this.f15400p = f8;
        this.f15401q = f9;
        this.f15402r = f10;
    }

    public void x(float f7, float f8, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            float f13 = (float) dArr[i7];
            double d7 = dArr2[i7];
            int i8 = iArr[i7];
            if (i8 == 1) {
                f9 = f13;
            } else if (i8 == 2) {
                f11 = f13;
            } else if (i8 == 3) {
                f10 = f13;
            } else if (i8 == 4) {
                f12 = f13;
            }
        }
        float f14 = f9 - ((0.0f * f10) / 2.0f);
        float f15 = f11 - ((0.0f * f12) / 2.0f);
        fArr[0] = (f14 * (1.0f - f7)) + (((f10 * 1.0f) + f14) * f7) + 0.0f;
        fArr[1] = (f15 * (1.0f - f8)) + (((f12 * 1.0f) + f15) * f8) + 0.0f;
    }

    public void y(float f7, f fVar, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f8;
        float f9;
        float f10 = this.f15399o;
        float f11 = this.f15400p;
        float f12 = this.f15401q;
        float f13 = this.f15402r;
        if (iArr.length != 0 && this.B.length <= iArr[iArr.length - 1]) {
            int i7 = iArr[iArr.length - 1] + 1;
            this.B = new double[i7];
            this.C = new double[i7];
        }
        Arrays.fill(this.B, Double.NaN);
        for (int i8 = 0; i8 < iArr.length; i8++) {
            double[] dArr4 = this.B;
            int i9 = iArr[i8];
            dArr4[i9] = dArr[i8];
            this.C[i9] = dArr2[i8];
        }
        float f14 = Float.NaN;
        int i10 = 0;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (true) {
            double[] dArr5 = this.B;
            if (i10 >= dArr5.length) {
                break;
            }
            boolean isNaN = Double.isNaN(dArr5[i10]);
            double d7 = g.f1896q;
            if (isNaN && (dArr3 == null || dArr3[i10] == g.f1896q)) {
                f9 = f14;
            } else {
                if (dArr3 != null) {
                    d7 = dArr3[i10];
                }
                if (!Double.isNaN(this.B[i10])) {
                    d7 = this.B[i10] + d7;
                }
                f9 = f14;
                float f19 = (float) d7;
                float f20 = (float) this.C[i10];
                if (i10 == 1) {
                    f14 = f9;
                    f15 = f20;
                    f10 = f19;
                } else if (i10 == 2) {
                    f14 = f9;
                    f16 = f20;
                    f11 = f19;
                } else if (i10 == 3) {
                    f14 = f9;
                    f17 = f20;
                    f12 = f19;
                } else if (i10 == 4) {
                    f14 = f9;
                    f18 = f20;
                    f13 = f19;
                } else if (i10 == 5) {
                    f14 = f19;
                }
                i10++;
            }
            f14 = f9;
            i10++;
        }
        float f21 = f14;
        c cVar = this.f15408x;
        if (cVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            cVar.r(f7, fArr, fArr2);
            float f22 = fArr[0];
            float f23 = fArr[1];
            float f24 = fArr2[0];
            float f25 = fArr2[1];
            double d8 = f10;
            double d9 = f11;
            float sin = (float) ((f22 + (Math.sin(d9) * d8)) - (f12 / 2.0f));
            f8 = f13;
            float cos = (float) ((f23 - (Math.cos(d9) * d8)) - (f13 / 2.0f));
            double d10 = f15;
            double d11 = f16;
            float sin2 = (float) (f24 + (Math.sin(d9) * d10) + (Math.cos(d9) * d8 * d11));
            float cos2 = (float) ((f25 - (d10 * Math.cos(d9))) + (d8 * Math.sin(d9) * d11));
            if (dArr2.length >= 2) {
                dArr2[0] = sin2;
                dArr2[1] = cos2;
            }
            if (!Float.isNaN(f21)) {
                fVar.R((float) (f21 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f10 = sin;
            f11 = cos;
        } else {
            f8 = f13;
            if (!Float.isNaN(f21)) {
                fVar.R((float) (0.0f + f21 + Math.toDegrees(Math.atan2(f16 + (f18 / 2.0f), f15 + (f17 / 2.0f)))));
            }
        }
        float f26 = f10 + 0.5f;
        float f27 = f11 + 0.5f;
        fVar.G((int) f26, (int) f27, (int) (f26 + f12), (int) (f27 + f8));
    }

    public void z(c cVar, e eVar) {
        double d7 = ((this.f15399o + (this.f15401q / 2.0f)) - eVar.f15399o) - (eVar.f15401q / 2.0f);
        double d8 = ((this.f15400p + (this.f15402r / 2.0f)) - eVar.f15400p) - (eVar.f15402r / 2.0f);
        this.f15408x = cVar;
        this.f15399o = (float) Math.hypot(d8, d7);
        if (Float.isNaN(this.f15407w)) {
            this.f15400p = (float) (Math.atan2(d8, d7) + 1.5707963267948966d);
        } else {
            this.f15400p = (float) Math.toRadians(this.f15407w);
        }
    }

    public e(int i7, int i8, s.e eVar, e eVar2, e eVar3) {
        this.f15396l = 0;
        this.f15403s = Float.NaN;
        this.f15404t = Float.NaN;
        this.f15405u = -1;
        this.f15406v = -1;
        this.f15407w = Float.NaN;
        this.f15408x = null;
        this.f15409y = new HashMap<>();
        this.f15410z = 0;
        this.B = new double[18];
        this.C = new double[18];
        if (eVar2.f15406v != -1) {
            u(i7, i8, eVar, eVar2, eVar3);
            return;
        }
        int i9 = eVar.I;
        if (i9 == 1) {
            t(eVar, eVar2, eVar3);
        } else if (i9 != 2) {
            s(eVar, eVar2, eVar3);
        } else {
            v(i7, i8, eVar, eVar2, eVar3);
        }
    }
}
