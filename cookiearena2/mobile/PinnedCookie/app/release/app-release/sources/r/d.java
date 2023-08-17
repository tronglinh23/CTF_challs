package r;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import u.m;
import u.o;
import u.w;
/* loaded from: classes.dex */
public class d implements Comparable<d> {
    public static final String N = "MotionPaths";
    public static final boolean O = false;
    public static final int P = 1;
    public static final int Q = 2;
    public static String[] R = {"position", "x", "y", "width", "height", "pathRotate"};
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;

    /* renamed from: m  reason: collision with root package name */
    public int f15381m;

    /* renamed from: z  reason: collision with root package name */
    public u.d f15394z;

    /* renamed from: k  reason: collision with root package name */
    public float f15379k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public int f15380l = 0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f15382n = false;

    /* renamed from: o  reason: collision with root package name */
    public float f15383o = 0.0f;

    /* renamed from: p  reason: collision with root package name */
    public float f15384p = 0.0f;

    /* renamed from: q  reason: collision with root package name */
    public float f15385q = 0.0f;

    /* renamed from: r  reason: collision with root package name */
    public float f15386r = 0.0f;

    /* renamed from: s  reason: collision with root package name */
    public float f15387s = 1.0f;

    /* renamed from: t  reason: collision with root package name */
    public float f15388t = 1.0f;

    /* renamed from: u  reason: collision with root package name */
    public float f15389u = Float.NaN;

    /* renamed from: v  reason: collision with root package name */
    public float f15390v = Float.NaN;

    /* renamed from: w  reason: collision with root package name */
    public float f15391w = 0.0f;

    /* renamed from: x  reason: collision with root package name */
    public float f15392x = 0.0f;

    /* renamed from: y  reason: collision with root package name */
    public float f15393y = 0.0f;
    public int A = 0;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public int I = -1;
    public LinkedHashMap<String, b> J = new LinkedHashMap<>();
    public int K = 0;
    public double[] L = new double[18];
    public double[] M = new double[18];

    public void c(HashMap<String, o> hashMap, int i7) {
        for (String str : hashMap.keySet()) {
            o oVar = hashMap.get(str);
            str.hashCode();
            char c7 = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c7 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c7 = 1;
                        break;
                    }
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c7 = 2;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c7 = 3;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c7 = 4;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c7 = 5;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c7 = 6;
                        break;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c7 = 7;
                        break;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c7 = '\b';
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c7 = '\t';
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c7 = '\n';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c7 = 11;
                        break;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c7 = '\f';
                        break;
                    }
                    break;
            }
            switch (c7) {
                case 0:
                    oVar.g(i7, Float.isNaN(this.f15385q) ? 0.0f : this.f15385q);
                    break;
                case 1:
                    oVar.g(i7, Float.isNaN(this.f15386r) ? 0.0f : this.f15386r);
                    break;
                case 2:
                    oVar.g(i7, Float.isNaN(this.f15384p) ? 0.0f : this.f15384p);
                    break;
                case 3:
                    oVar.g(i7, Float.isNaN(this.f15391w) ? 0.0f : this.f15391w);
                    break;
                case 4:
                    oVar.g(i7, Float.isNaN(this.f15392x) ? 0.0f : this.f15392x);
                    break;
                case 5:
                    oVar.g(i7, Float.isNaN(this.f15393y) ? 0.0f : this.f15393y);
                    break;
                case 6:
                    oVar.g(i7, Float.isNaN(this.H) ? 0.0f : this.H);
                    break;
                case 7:
                    oVar.g(i7, Float.isNaN(this.f15389u) ? 0.0f : this.f15389u);
                    break;
                case '\b':
                    oVar.g(i7, Float.isNaN(this.f15390v) ? 0.0f : this.f15390v);
                    break;
                case '\t':
                    oVar.g(i7, Float.isNaN(this.f15387s) ? 1.0f : this.f15387s);
                    break;
                case '\n':
                    oVar.g(i7, Float.isNaN(this.f15388t) ? 1.0f : this.f15388t);
                    break;
                case 11:
                    oVar.g(i7, Float.isNaN(this.f15379k) ? 1.0f : this.f15379k);
                    break;
                case '\f':
                    oVar.g(i7, Float.isNaN(this.G) ? 0.0f : this.G);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.J.containsKey(str2)) {
                            b bVar = this.J.get(str2);
                            if (oVar instanceof o.c) {
                                ((o.c) oVar).k(i7, bVar);
                                break;
                            } else {
                                w.f("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i7 + ", value" + bVar.n() + oVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        w.f("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    public void d(f fVar) {
        this.f15381m = fVar.B();
        this.f15379k = fVar.B() != 4 ? 0.0f : fVar.g();
        this.f15382n = false;
        this.f15384p = fVar.t();
        this.f15385q = fVar.r();
        this.f15386r = fVar.s();
        this.f15387s = fVar.u();
        this.f15388t = fVar.v();
        this.f15389u = fVar.o();
        this.f15390v = fVar.p();
        this.f15391w = fVar.x();
        this.f15392x = fVar.y();
        this.f15393y = fVar.z();
        for (String str : fVar.j()) {
            b i7 = fVar.i(str);
            if (i7 != null && i7.q()) {
                this.J.put(str, i7);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        return Float.compare(this.B, dVar.B);
    }

    public final boolean h(float f7, float f8) {
        return (Float.isNaN(f7) || Float.isNaN(f8)) ? Float.isNaN(f7) != Float.isNaN(f8) : Math.abs(f7 - f8) > 1.0E-6f;
    }

    public void i(d dVar, HashSet<String> hashSet) {
        if (h(this.f15379k, dVar.f15379k)) {
            hashSet.add("alpha");
        }
        if (h(this.f15383o, dVar.f15383o)) {
            hashSet.add("translationZ");
        }
        int i7 = this.f15381m;
        int i8 = dVar.f15381m;
        if (i7 != i8 && this.f15380l == 0 && (i7 == 4 || i8 == 4)) {
            hashSet.add("alpha");
        }
        if (h(this.f15384p, dVar.f15384p)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.G) || !Float.isNaN(dVar.G)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.H) || !Float.isNaN(dVar.H)) {
            hashSet.add("progress");
        }
        if (h(this.f15385q, dVar.f15385q)) {
            hashSet.add("rotationX");
        }
        if (h(this.f15386r, dVar.f15386r)) {
            hashSet.add("rotationY");
        }
        if (h(this.f15389u, dVar.f15389u)) {
            hashSet.add("pivotX");
        }
        if (h(this.f15390v, dVar.f15390v)) {
            hashSet.add("pivotY");
        }
        if (h(this.f15387s, dVar.f15387s)) {
            hashSet.add("scaleX");
        }
        if (h(this.f15388t, dVar.f15388t)) {
            hashSet.add("scaleY");
        }
        if (h(this.f15391w, dVar.f15391w)) {
            hashSet.add("translationX");
        }
        if (h(this.f15392x, dVar.f15392x)) {
            hashSet.add("translationY");
        }
        if (h(this.f15393y, dVar.f15393y)) {
            hashSet.add("translationZ");
        }
        if (h(this.f15383o, dVar.f15383o)) {
            hashSet.add("elevation");
        }
    }

    public void j(d dVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | h(this.B, dVar.B);
        zArr[1] = zArr[1] | h(this.C, dVar.C);
        zArr[2] = zArr[2] | h(this.D, dVar.D);
        zArr[3] = zArr[3] | h(this.E, dVar.E);
        zArr[4] = h(this.F, dVar.F) | zArr[4];
    }

    public void k(double[] dArr, int[] iArr) {
        float[] fArr = {this.B, this.C, this.D, this.E, this.F, this.f15379k, this.f15383o, this.f15384p, this.f15385q, this.f15386r, this.f15387s, this.f15388t, this.f15389u, this.f15390v, this.f15391w, this.f15392x, this.f15393y, this.G};
        int i7 = 0;
        for (int i8 : iArr) {
            if (i8 < 18) {
                dArr[i7] = fArr[r4];
                i7++;
            }
        }
    }

    public int l(String str, double[] dArr, int i7) {
        b bVar = this.J.get(str);
        if (bVar.r() == 1) {
            dArr[i7] = bVar.n();
            return 1;
        }
        int r6 = bVar.r();
        bVar.o(new float[r6]);
        int i8 = 0;
        while (i8 < r6) {
            dArr[i7] = r1[i8];
            i8++;
            i7++;
        }
        return r6;
    }

    public int m(String str) {
        return this.J.get(str).r();
    }

    public boolean n(String str) {
        return this.J.containsKey(str);
    }

    public void o(float f7, float f8, float f9, float f10) {
        this.C = f7;
        this.D = f8;
        this.E = f9;
        this.F = f10;
    }

    public void p(f fVar) {
        o(fVar.E(), fVar.F(), fVar.D(), fVar.k());
        d(fVar);
    }

    public void q(m mVar, f fVar, int i7, float f7) {
        o(mVar.f17011b, mVar.f17013d, mVar.b(), mVar.a());
        d(fVar);
        this.f15389u = Float.NaN;
        this.f15390v = Float.NaN;
        if (i7 == 1) {
            this.f15384p = f7 - 90.0f;
        } else if (i7 != 2) {
        } else {
            this.f15384p = f7 + 90.0f;
        }
    }
}
