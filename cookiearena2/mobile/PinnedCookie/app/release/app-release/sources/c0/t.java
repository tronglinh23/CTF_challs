package c0;

import android.view.View;
import androidx.constraintlayout.widget.e;
import d.o0;
import java.util.Arrays;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public class t implements Comparable<t> {
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
    public u.d f7682k;

    /* renamed from: m  reason: collision with root package name */
    public float f7684m;

    /* renamed from: n  reason: collision with root package name */
    public float f7685n;

    /* renamed from: o  reason: collision with root package name */
    public float f7686o;

    /* renamed from: p  reason: collision with root package name */
    public float f7687p;

    /* renamed from: q  reason: collision with root package name */
    public float f7688q;

    /* renamed from: r  reason: collision with root package name */
    public float f7689r;

    /* renamed from: u  reason: collision with root package name */
    public int f7692u;

    /* renamed from: v  reason: collision with root package name */
    public int f7693v;

    /* renamed from: w  reason: collision with root package name */
    public float f7694w;

    /* renamed from: x  reason: collision with root package name */
    public o f7695x;

    /* renamed from: y  reason: collision with root package name */
    public LinkedHashMap<String, androidx.constraintlayout.widget.a> f7696y;

    /* renamed from: z  reason: collision with root package name */
    public int f7697z;

    /* renamed from: l  reason: collision with root package name */
    public int f7683l = 0;

    /* renamed from: s  reason: collision with root package name */
    public float f7690s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public float f7691t = Float.NaN;

    public t() {
        int i7 = f.f7360f;
        this.f7692u = i7;
        this.f7693v = i7;
        this.f7694w = Float.NaN;
        this.f7695x = null;
        this.f7696y = new LinkedHashMap<>();
        this.f7697z = 0;
        this.B = new double[18];
        this.C = new double[18];
    }

    public static final float A(float sin, float cos, float cx, float cy, float x6, float y6) {
        return (((x6 - cx) * cos) - ((y6 - cy) * sin)) + cx;
    }

    public static final float B(float sin, float cos, float cx, float cy, float x6, float y6) {
        return ((x6 - cx) * sin) + ((y6 - cy) * cos) + cy;
    }

    public void c(e.a c7) {
        this.f7682k = u.d.c(c7.f2266d.f2380d);
        e.c cVar = c7.f2266d;
        this.f7692u = cVar.f2381e;
        this.f7693v = cVar.f2378b;
        this.f7690s = cVar.f2385i;
        this.f7683l = cVar.f2382f;
        this.A = cVar.f2379c;
        this.f7691t = c7.f2265c.f2395e;
        this.f7694w = c7.f2267e.D;
        for (String str : c7.f2269g.keySet()) {
            androidx.constraintlayout.widget.a aVar = c7.f2269g.get(str);
            if (aVar != null && aVar.n()) {
                this.f7696y.put(str, aVar);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public int compareTo(@o0 t o6) {
        return Float.compare(this.f7685n, o6.f7685n);
    }

    public void e(o toOrbit) {
        toOrbit.A(this.f7691t);
    }

    public final boolean h(float a7, float b7) {
        return (Float.isNaN(a7) || Float.isNaN(b7)) ? Float.isNaN(a7) != Float.isNaN(b7) : Math.abs(a7 - b7) > 1.0E-6f;
    }

    public void i(t points, boolean[] mask, String[] custom, boolean arcMode) {
        boolean h7 = h(this.f7686o, points.f7686o);
        boolean h8 = h(this.f7687p, points.f7687p);
        mask[0] = mask[0] | h(this.f7685n, points.f7685n);
        boolean z6 = h7 | h8 | arcMode;
        mask[1] = mask[1] | z6;
        mask[2] = z6 | mask[2];
        mask[3] = mask[3] | h(this.f7688q, points.f7688q);
        mask[4] = h(this.f7689r, points.f7689r) | mask[4];
    }

    public void j(double[] data, int[] toUse) {
        float[] fArr = {this.f7685n, this.f7686o, this.f7687p, this.f7688q, this.f7689r, this.f7690s};
        int i7 = 0;
        for (int i8 : toUse) {
            if (i8 < 6) {
                data[i7] = fArr[r4];
                i7++;
            }
        }
    }

    public void k(int[] toUse, double[] data, float[] point, int offset) {
        float f7 = this.f7688q;
        float f8 = this.f7689r;
        for (int i7 = 0; i7 < toUse.length; i7++) {
            float f9 = (float) data[i7];
            int i8 = toUse[i7];
            if (i8 == 3) {
                f7 = f9;
            } else if (i8 == 4) {
                f8 = f9;
            }
        }
        point[offset] = f7;
        point[offset + 1] = f8;
    }

    public void l(double p6, int[] toUse, double[] data, float[] point, int offset) {
        float f7 = this.f7686o;
        float f8 = this.f7687p;
        float f9 = this.f7688q;
        float f10 = this.f7689r;
        for (int i7 = 0; i7 < toUse.length; i7++) {
            float f11 = (float) data[i7];
            int i8 = toUse[i7];
            if (i8 == 1) {
                f7 = f11;
            } else if (i8 == 2) {
                f8 = f11;
            } else if (i8 == 3) {
                f9 = f11;
            } else if (i8 == 4) {
                f10 = f11;
            }
        }
        o oVar = this.f7695x;
        if (oVar != null) {
            float[] fArr = new float[2];
            oVar.m(p6, fArr, new float[2]);
            float f12 = fArr[0];
            float f13 = fArr[1];
            double d7 = f12;
            double d8 = f7;
            double d9 = f8;
            f7 = (float) ((d7 + (Math.sin(d9) * d8)) - (f9 / 2.0f));
            f8 = (float) ((f13 - (d8 * Math.cos(d9))) - (f10 / 2.0f));
        }
        point[offset] = f7 + (f9 / 2.0f) + 0.0f;
        point[offset + 1] = f8 + (f10 / 2.0f) + 0.0f;
    }

    public void m(double p6, int[] toUse, double[] data, float[] point, double[] vdata, float[] velocity) {
        float f7;
        float f8 = this.f7686o;
        float f9 = this.f7687p;
        float f10 = this.f7688q;
        float f11 = this.f7689r;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i7 = 0; i7 < toUse.length; i7++) {
            float f16 = (float) data[i7];
            float f17 = (float) vdata[i7];
            int i8 = toUse[i7];
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
        o oVar = this.f7695x;
        if (oVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            oVar.m(p6, fArr, fArr2);
            float f21 = fArr[0];
            float f22 = fArr[1];
            float f23 = fArr2[0];
            float f24 = fArr2[1];
            double d7 = f8;
            double d8 = f9;
            f7 = f10;
            float sin = (float) ((f21 + (Math.sin(d8) * d7)) - (f10 / 2.0f));
            float cos = (float) ((f22 - (d7 * Math.cos(d8))) - (f11 / 2.0f));
            double d9 = f12;
            double d10 = f14;
            float sin2 = (float) (f23 + (Math.sin(d8) * d9) + (Math.cos(d8) * d10));
            f20 = (float) ((f24 - (d9 * Math.cos(d8))) + (Math.sin(d8) * d10));
            f19 = sin2;
            f8 = sin;
            f9 = cos;
            f18 = 2.0f;
        } else {
            f7 = f10;
        }
        point[0] = f8 + (f7 / f18) + 0.0f;
        point[1] = f9 + (f11 / f18) + 0.0f;
        velocity[0] = f19;
        velocity[1] = f20;
    }

    public void n(double p6, int[] toUse, double[] data, float[] point, int offset) {
        float f7 = this.f7686o;
        float f8 = this.f7687p;
        float f9 = this.f7688q;
        float f10 = this.f7689r;
        for (int i7 = 0; i7 < toUse.length; i7++) {
            float f11 = (float) data[i7];
            int i8 = toUse[i7];
            if (i8 == 1) {
                f7 = f11;
            } else if (i8 == 2) {
                f8 = f11;
            } else if (i8 == 3) {
                f9 = f11;
            } else if (i8 == 4) {
                f10 = f11;
            }
        }
        o oVar = this.f7695x;
        if (oVar != null) {
            float[] fArr = new float[2];
            oVar.m(p6, fArr, new float[2]);
            float f12 = fArr[0];
            float f13 = fArr[1];
            double d7 = f12;
            double d8 = f7;
            double d9 = f8;
            f7 = (float) ((d7 + (Math.sin(d9) * d8)) - (f9 / 2.0f));
            f8 = (float) ((f13 - (d8 * Math.cos(d9))) - (f10 / 2.0f));
        }
        point[offset] = f7 + (f9 / 2.0f) + 0.0f;
        point[offset + 1] = f8 + (f10 / 2.0f) + 0.0f;
    }

    public int o(String name, double[] value, int offset) {
        androidx.constraintlayout.widget.a aVar = this.f7696y.get(name);
        int i7 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.p() == 1) {
            value[offset] = aVar.k();
            return 1;
        }
        int p6 = aVar.p();
        aVar.l(new float[p6]);
        while (i7 < p6) {
            value[offset] = r2[i7];
            i7++;
            offset++;
        }
        return p6;
    }

    public int p(String name) {
        androidx.constraintlayout.widget.a aVar = this.f7696y.get(name);
        if (aVar == null) {
            return 0;
        }
        return aVar.p();
    }

    public void q(int[] toUse, double[] data, float[] path, int offset) {
        float f7 = this.f7686o;
        float f8 = this.f7687p;
        float f9 = this.f7688q;
        float f10 = this.f7689r;
        for (int i7 = 0; i7 < toUse.length; i7++) {
            float f11 = (float) data[i7];
            int i8 = toUse[i7];
            if (i8 == 1) {
                f7 = f11;
            } else if (i8 == 2) {
                f8 = f11;
            } else if (i8 == 3) {
                f9 = f11;
            } else if (i8 == 4) {
                f10 = f11;
            }
        }
        o oVar = this.f7695x;
        if (oVar != null) {
            float n7 = oVar.n();
            float o6 = this.f7695x.o();
            double d7 = f7;
            double d8 = f8;
            float sin = (float) ((n7 + (Math.sin(d8) * d7)) - (f9 / 2.0f));
            f8 = (float) ((o6 - (d7 * Math.cos(d8))) - (f10 / 2.0f));
            f7 = sin;
        }
        float f12 = f9 + f7;
        float f13 = f10 + f8;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i9 = offset + 1;
        path[offset] = f7 + 0.0f;
        int i10 = i9 + 1;
        path[i9] = f8 + 0.0f;
        int i11 = i10 + 1;
        path[i10] = f12 + 0.0f;
        int i12 = i11 + 1;
        path[i11] = f8 + 0.0f;
        int i13 = i12 + 1;
        path[i12] = f12 + 0.0f;
        int i14 = i13 + 1;
        path[i13] = f13 + 0.0f;
        path[i14] = f7 + 0.0f;
        path[i14 + 1] = f13 + 0.0f;
    }

    public boolean r(String name) {
        return this.f7696y.containsKey(name);
    }

    public void s(j c7, t startTimePoint, t endTimePoint) {
        float f7 = c7.f7381a / 100.0f;
        this.f7684m = f7;
        this.f7683l = c7.H;
        float f8 = Float.isNaN(c7.I) ? f7 : c7.I;
        float f9 = Float.isNaN(c7.J) ? f7 : c7.J;
        float f10 = endTimePoint.f7688q;
        float f11 = startTimePoint.f7688q;
        float f12 = endTimePoint.f7689r;
        float f13 = startTimePoint.f7689r;
        this.f7685n = this.f7684m;
        float f14 = startTimePoint.f7686o;
        float f15 = startTimePoint.f7687p;
        float f16 = (endTimePoint.f7686o + (f10 / 2.0f)) - ((f11 / 2.0f) + f14);
        float f17 = (endTimePoint.f7687p + (f12 / 2.0f)) - (f15 + (f13 / 2.0f));
        float f18 = ((f10 - f11) * f8) / 2.0f;
        this.f7686o = (int) ((f14 + (f16 * f7)) - f18);
        float f19 = ((f12 - f13) * f9) / 2.0f;
        this.f7687p = (int) ((f15 + (f17 * f7)) - f19);
        this.f7688q = (int) (f11 + r9);
        this.f7689r = (int) (f13 + r12);
        float f20 = Float.isNaN(c7.K) ? f7 : c7.K;
        float f21 = Float.isNaN(c7.N) ? 0.0f : c7.N;
        if (!Float.isNaN(c7.L)) {
            f7 = c7.L;
        }
        float f22 = Float.isNaN(c7.M) ? 0.0f : c7.M;
        this.f7697z = 0;
        this.f7686o = (int) (((startTimePoint.f7686o + (f20 * f16)) + (f22 * f17)) - f18);
        this.f7687p = (int) (((startTimePoint.f7687p + (f16 * f21)) + (f17 * f7)) - f19);
        this.f7682k = u.d.c(c7.F);
        this.f7692u = c7.G;
    }

    public void t(j c7, t startTimePoint, t endTimePoint) {
        float f7 = c7.f7381a / 100.0f;
        this.f7684m = f7;
        this.f7683l = c7.H;
        float f8 = Float.isNaN(c7.I) ? f7 : c7.I;
        float f9 = Float.isNaN(c7.J) ? f7 : c7.J;
        float f10 = endTimePoint.f7688q - startTimePoint.f7688q;
        float f11 = endTimePoint.f7689r - startTimePoint.f7689r;
        this.f7685n = this.f7684m;
        if (!Float.isNaN(c7.K)) {
            f7 = c7.K;
        }
        float f12 = startTimePoint.f7686o;
        float f13 = startTimePoint.f7688q;
        float f14 = startTimePoint.f7687p;
        float f15 = startTimePoint.f7689r;
        float f16 = (endTimePoint.f7686o + (endTimePoint.f7688q / 2.0f)) - ((f13 / 2.0f) + f12);
        float f17 = (endTimePoint.f7687p + (endTimePoint.f7689r / 2.0f)) - ((f15 / 2.0f) + f14);
        float f18 = f16 * f7;
        float f19 = (f10 * f8) / 2.0f;
        this.f7686o = (int) ((f12 + f18) - f19);
        float f20 = f7 * f17;
        float f21 = (f11 * f9) / 2.0f;
        this.f7687p = (int) ((f14 + f20) - f21);
        this.f7688q = (int) (f13 + r7);
        this.f7689r = (int) (f15 + r8);
        float f22 = Float.isNaN(c7.L) ? 0.0f : c7.L;
        this.f7697z = 1;
        float f23 = (int) ((startTimePoint.f7686o + f18) - f19);
        float f24 = (int) ((startTimePoint.f7687p + f20) - f21);
        this.f7686o = f23 + ((-f17) * f22);
        this.f7687p = f24 + (f16 * f22);
        this.f7693v = this.f7693v;
        this.f7682k = u.d.c(c7.F);
        this.f7692u = c7.G;
    }

    public void u(int parentWidth, int parentHeight, j c7, t s6, t e7) {
        float min;
        float f7;
        float f8 = c7.f7381a / 100.0f;
        this.f7684m = f8;
        this.f7683l = c7.H;
        this.f7697z = c7.O;
        float f9 = Float.isNaN(c7.I) ? f8 : c7.I;
        float f10 = Float.isNaN(c7.J) ? f8 : c7.J;
        float f11 = e7.f7688q;
        float f12 = s6.f7688q;
        float f13 = e7.f7689r;
        float f14 = s6.f7689r;
        this.f7685n = this.f7684m;
        this.f7688q = (int) (f12 + ((f11 - f12) * f9));
        this.f7689r = (int) (f14 + ((f13 - f14) * f10));
        int i7 = c7.O;
        if (i7 == 1) {
            float f15 = Float.isNaN(c7.K) ? f8 : c7.K;
            float f16 = e7.f7686o;
            float f17 = s6.f7686o;
            this.f7686o = (f15 * (f16 - f17)) + f17;
            if (!Float.isNaN(c7.L)) {
                f8 = c7.L;
            }
            float f18 = e7.f7687p;
            float f19 = s6.f7687p;
            this.f7687p = (f8 * (f18 - f19)) + f19;
        } else if (i7 != 2) {
            float f20 = Float.isNaN(c7.K) ? f8 : c7.K;
            float f21 = e7.f7686o;
            float f22 = s6.f7686o;
            this.f7686o = (f20 * (f21 - f22)) + f22;
            if (!Float.isNaN(c7.L)) {
                f8 = c7.L;
            }
            float f23 = e7.f7687p;
            float f24 = s6.f7687p;
            this.f7687p = (f8 * (f23 - f24)) + f24;
        } else {
            if (Float.isNaN(c7.K)) {
                float f25 = e7.f7686o;
                float f26 = s6.f7686o;
                min = ((f25 - f26) * f8) + f26;
            } else {
                min = Math.min(f10, f9) * c7.K;
            }
            this.f7686o = min;
            if (Float.isNaN(c7.L)) {
                float f27 = e7.f7687p;
                float f28 = s6.f7687p;
                f7 = (f8 * (f27 - f28)) + f28;
            } else {
                f7 = c7.L;
            }
            this.f7687p = f7;
        }
        this.f7693v = s6.f7693v;
        this.f7682k = u.d.c(c7.F);
        this.f7692u = c7.G;
    }

    public void v(int parentWidth, int parentHeight, j c7, t startTimePoint, t endTimePoint) {
        float f7 = c7.f7381a / 100.0f;
        this.f7684m = f7;
        this.f7683l = c7.H;
        float f8 = Float.isNaN(c7.I) ? f7 : c7.I;
        float f9 = Float.isNaN(c7.J) ? f7 : c7.J;
        float f10 = endTimePoint.f7688q;
        float f11 = startTimePoint.f7688q;
        float f12 = endTimePoint.f7689r;
        float f13 = startTimePoint.f7689r;
        this.f7685n = this.f7684m;
        float f14 = startTimePoint.f7686o;
        float f15 = startTimePoint.f7687p;
        float f16 = endTimePoint.f7686o + (f10 / 2.0f);
        float f17 = endTimePoint.f7687p + (f12 / 2.0f);
        float f18 = (f10 - f11) * f8;
        this.f7686o = (int) ((f14 + ((f16 - ((f11 / 2.0f) + f14)) * f7)) - (f18 / 2.0f));
        float f19 = (f12 - f13) * f9;
        this.f7687p = (int) ((f15 + ((f17 - (f15 + (f13 / 2.0f))) * f7)) - (f19 / 2.0f));
        this.f7688q = (int) (f11 + f18);
        this.f7689r = (int) (f13 + f19);
        this.f7697z = 2;
        if (!Float.isNaN(c7.K)) {
            this.f7686o = (int) (c7.K * ((int) (parentWidth - this.f7688q)));
        }
        if (!Float.isNaN(c7.L)) {
            this.f7687p = (int) (c7.L * ((int) (parentHeight - this.f7689r)));
        }
        this.f7693v = this.f7693v;
        this.f7682k = u.d.c(c7.F);
        this.f7692u = c7.G;
    }

    public void w(float x6, float y6, float w6, float h7) {
        this.f7686o = x6;
        this.f7687p = y6;
        this.f7688q = w6;
        this.f7689r = h7;
    }

    public void x(float locationX, float locationY, float[] mAnchorDpDt, int[] toUse, double[] deltaData, double[] data) {
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i7 = 0; i7 < toUse.length; i7++) {
            float f11 = (float) deltaData[i7];
            double d7 = data[i7];
            int i8 = toUse[i7];
            if (i8 == 1) {
                f7 = f11;
            } else if (i8 == 2) {
                f9 = f11;
            } else if (i8 == 3) {
                f8 = f11;
            } else if (i8 == 4) {
                f10 = f11;
            }
        }
        float f12 = f7 - ((0.0f * f8) / 2.0f);
        float f13 = f9 - ((0.0f * f10) / 2.0f);
        mAnchorDpDt[0] = (f12 * (1.0f - locationX)) + (((f8 * 1.0f) + f12) * locationX) + 0.0f;
        mAnchorDpDt[1] = (f13 * (1.0f - locationY)) + (((f10 * 1.0f) + f13) * locationY) + 0.0f;
    }

    public void y(float position, View view, int[] toUse, double[] data, double[] slope, double[] cycle, boolean mForceMeasure) {
        float f7;
        boolean z6;
        boolean z7;
        float f8;
        float f9 = this.f7686o;
        float f10 = this.f7687p;
        float f11 = this.f7688q;
        float f12 = this.f7689r;
        if (toUse.length != 0 && this.B.length <= toUse[toUse.length - 1]) {
            int i7 = toUse[toUse.length - 1] + 1;
            this.B = new double[i7];
            this.C = new double[i7];
        }
        Arrays.fill(this.B, Double.NaN);
        for (int i8 = 0; i8 < toUse.length; i8++) {
            double[] dArr = this.B;
            int i9 = toUse[i8];
            dArr[i9] = data[i8];
            this.C[i9] = slope[i8];
        }
        float f13 = Float.NaN;
        int i10 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (true) {
            double[] dArr2 = this.B;
            if (i10 >= dArr2.length) {
                break;
            }
            boolean isNaN = Double.isNaN(dArr2[i10]);
            double d7 = androidx.cardview.widget.g.f1896q;
            if (isNaN && (cycle == null || cycle[i10] == androidx.cardview.widget.g.f1896q)) {
                f8 = f13;
            } else {
                if (cycle != null) {
                    d7 = cycle[i10];
                }
                if (!Double.isNaN(this.B[i10])) {
                    d7 = this.B[i10] + d7;
                }
                f8 = f13;
                float f18 = (float) d7;
                float f19 = (float) this.C[i10];
                if (i10 == 1) {
                    f13 = f8;
                    f14 = f19;
                    f9 = f18;
                } else if (i10 == 2) {
                    f13 = f8;
                    f15 = f19;
                    f10 = f18;
                } else if (i10 == 3) {
                    f13 = f8;
                    f16 = f19;
                    f11 = f18;
                } else if (i10 == 4) {
                    f13 = f8;
                    f17 = f19;
                    f12 = f18;
                } else if (i10 == 5) {
                    f13 = f18;
                }
                i10++;
            }
            f13 = f8;
            i10++;
        }
        float f20 = f13;
        o oVar = this.f7695x;
        if (oVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            oVar.m(position, fArr, fArr2);
            float f21 = fArr[0];
            float f22 = fArr[1];
            float f23 = fArr2[0];
            float f24 = fArr2[1];
            double d8 = f9;
            double d9 = f10;
            float sin = (float) ((f21 + (Math.sin(d9) * d8)) - (f11 / 2.0f));
            f7 = f12;
            float cos = (float) ((f22 - (Math.cos(d9) * d8)) - (f12 / 2.0f));
            double d10 = f14;
            double d11 = f15;
            float sin2 = (float) (f23 + (Math.sin(d9) * d10) + (Math.cos(d9) * d8 * d11));
            float cos2 = (float) ((f24 - (d10 * Math.cos(d9))) + (d8 * Math.sin(d9) * d11));
            if (slope.length >= 2) {
                z6 = false;
                slope[0] = sin2;
                z7 = true;
                slope[1] = cos2;
            } else {
                z6 = false;
                z7 = true;
            }
            if (!Float.isNaN(f20)) {
                view.setRotation((float) (f20 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f9 = sin;
            f10 = cos;
        } else {
            f7 = f12;
            z6 = false;
            z7 = true;
            if (!Float.isNaN(f20)) {
                view.setRotation((float) (0.0f + f20 + Math.toDegrees(Math.atan2(f15 + (f17 / 2.0f), f14 + (f16 / 2.0f)))));
            }
        }
        if (view instanceof e) {
            ((e) view).a(f9, f10, f11 + f9, f10 + f7);
            return;
        }
        float f25 = f9 + 0.5f;
        int i11 = (int) f25;
        float f26 = f10 + 0.5f;
        int i12 = (int) f26;
        int i13 = (int) (f25 + f11);
        int i14 = (int) (f26 + f7);
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        if (i15 != view.getMeasuredWidth() || i16 != view.getMeasuredHeight()) {
            z6 = z7;
        }
        if (z6 || mForceMeasure) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
        }
        view.layout(i11, i12, i13, i14);
    }

    public void z(o mc, t relative) {
        double d7 = ((this.f7686o + (this.f7688q / 2.0f)) - relative.f7686o) - (relative.f7688q / 2.0f);
        double d8 = ((this.f7687p + (this.f7689r / 2.0f)) - relative.f7687p) - (relative.f7689r / 2.0f);
        this.f7695x = mc;
        this.f7686o = (float) Math.hypot(d8, d7);
        if (Float.isNaN(this.f7694w)) {
            this.f7687p = (float) (Math.atan2(d8, d7) + 1.5707963267948966d);
        } else {
            this.f7687p = (float) Math.toRadians(this.f7694w);
        }
    }

    public t(int parentWidth, int parentHeight, j c7, t startTimePoint, t endTimePoint) {
        int i7 = f.f7360f;
        this.f7692u = i7;
        this.f7693v = i7;
        this.f7694w = Float.NaN;
        this.f7695x = null;
        this.f7696y = new LinkedHashMap<>();
        this.f7697z = 0;
        this.B = new double[18];
        this.C = new double[18];
        if (startTimePoint.f7693v != f.f7360f) {
            u(parentWidth, parentHeight, c7, startTimePoint, endTimePoint);
            return;
        }
        int i8 = c7.O;
        if (i8 == 1) {
            t(c7, startTimePoint, endTimePoint);
        } else if (i8 != 2) {
            s(c7, startTimePoint, endTimePoint);
        } else {
            v(parentWidth, parentHeight, c7, startTimePoint, endTimePoint);
        }
    }
}
