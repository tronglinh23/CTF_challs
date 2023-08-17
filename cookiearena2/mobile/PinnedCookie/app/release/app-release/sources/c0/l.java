package c0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class l extends f {
    public static final String V = "KeyTimeCycle";
    public static final String W = "KeyTimeCycle";
    public static final String X = "wavePeriod";
    public static final String Y = "waveOffset";
    public static final String Z = "waveShape";

    /* renamed from: a0  reason: collision with root package name */
    public static final int f7461a0 = 0;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f7462b0 = 1;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f7463c0 = 2;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f7464d0 = 3;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f7465e0 = 4;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f7466f0 = 5;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f7467g0 = 6;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f7468h0 = 3;
    public String D;
    public int E = -1;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public float J = Float.NaN;
    public float K = Float.NaN;
    public float L = Float.NaN;
    public float M = Float.NaN;
    public float N = Float.NaN;
    public float O = Float.NaN;
    public float P = Float.NaN;
    public float Q = Float.NaN;
    public int R = 0;
    public String S = null;
    public float T = Float.NaN;
    public float U = 0.0f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f7469a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f7470b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f7471c = 4;

        /* renamed from: d  reason: collision with root package name */
        public static final int f7472d = 5;

        /* renamed from: e  reason: collision with root package name */
        public static final int f7473e = 6;

        /* renamed from: f  reason: collision with root package name */
        public static final int f7474f = 8;

        /* renamed from: g  reason: collision with root package name */
        public static final int f7475g = 7;

        /* renamed from: h  reason: collision with root package name */
        public static final int f7476h = 9;

        /* renamed from: i  reason: collision with root package name */
        public static final int f7477i = 10;

        /* renamed from: j  reason: collision with root package name */
        public static final int f7478j = 12;

        /* renamed from: k  reason: collision with root package name */
        public static final int f7479k = 13;

        /* renamed from: l  reason: collision with root package name */
        public static final int f7480l = 14;

        /* renamed from: m  reason: collision with root package name */
        public static final int f7481m = 15;

        /* renamed from: n  reason: collision with root package name */
        public static final int f7482n = 16;

        /* renamed from: o  reason: collision with root package name */
        public static final int f7483o = 17;

        /* renamed from: p  reason: collision with root package name */
        public static final int f7484p = 18;

        /* renamed from: q  reason: collision with root package name */
        public static final int f7485q = 19;

        /* renamed from: r  reason: collision with root package name */
        public static final int f7486r = 20;

        /* renamed from: s  reason: collision with root package name */
        public static final int f7487s = 21;

        /* renamed from: t  reason: collision with root package name */
        public static SparseIntArray f7488t;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7488t = sparseIntArray;
            sparseIntArray.append(k.m.Pf, 1);
            f7488t.append(k.m.Yf, 2);
            f7488t.append(k.m.Uf, 4);
            f7488t.append(k.m.Vf, 5);
            f7488t.append(k.m.Wf, 6);
            f7488t.append(k.m.Sf, 7);
            f7488t.append(k.m.eg, 8);
            f7488t.append(k.m.dg, 9);
            f7488t.append(k.m.cg, 10);
            f7488t.append(k.m.ag, 12);
            f7488t.append(k.m.Zf, 13);
            f7488t.append(k.m.Tf, 14);
            f7488t.append(k.m.Qf, 15);
            f7488t.append(k.m.Rf, 16);
            f7488t.append(k.m.Xf, 17);
            f7488t.append(k.m.bg, 18);
            f7488t.append(k.m.hg, 20);
            f7488t.append(k.m.gg, 21);
            f7488t.append(k.m.jg, 19);
        }

        public static void a(l c7, TypedArray a7) {
            int indexCount = a7.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = a7.getIndex(i7);
                switch (f7488t.get(index)) {
                    case 1:
                        c7.F = a7.getFloat(index, c7.F);
                        break;
                    case 2:
                        c7.G = a7.getDimension(index, c7.G);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f7488t.get(index));
                        break;
                    case 4:
                        c7.H = a7.getFloat(index, c7.H);
                        break;
                    case 5:
                        c7.I = a7.getFloat(index, c7.I);
                        break;
                    case 6:
                        c7.J = a7.getFloat(index, c7.J);
                        break;
                    case 7:
                        c7.L = a7.getFloat(index, c7.L);
                        break;
                    case 8:
                        c7.K = a7.getFloat(index, c7.K);
                        break;
                    case 9:
                        c7.D = a7.getString(index);
                        break;
                    case 10:
                        if (s.P0) {
                            int resourceId = a7.getResourceId(index, c7.f7382b);
                            c7.f7382b = resourceId;
                            if (resourceId == -1) {
                                c7.f7383c = a7.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (a7.peekValue(index).type == 3) {
                            c7.f7383c = a7.getString(index);
                            break;
                        } else {
                            c7.f7382b = a7.getResourceId(index, c7.f7382b);
                            break;
                        }
                    case 12:
                        c7.f7381a = a7.getInt(index, c7.f7381a);
                        break;
                    case 13:
                        c7.E = a7.getInteger(index, c7.E);
                        break;
                    case 14:
                        c7.M = a7.getFloat(index, c7.M);
                        break;
                    case 15:
                        c7.N = a7.getDimension(index, c7.N);
                        break;
                    case 16:
                        c7.O = a7.getDimension(index, c7.O);
                        break;
                    case 17:
                        c7.P = a7.getDimension(index, c7.P);
                        break;
                    case 18:
                        c7.Q = a7.getFloat(index, c7.Q);
                        break;
                    case 19:
                        if (a7.peekValue(index).type == 3) {
                            c7.S = a7.getString(index);
                            c7.R = 7;
                            break;
                        } else {
                            c7.R = a7.getInt(index, c7.R);
                            break;
                        }
                    case 20:
                        c7.T = a7.getFloat(index, c7.T);
                        break;
                    case 21:
                        if (a7.peekValue(index).type == 5) {
                            c7.U = a7.getDimension(index, c7.U);
                            break;
                        } else {
                            c7.U = a7.getFloat(index, c7.U);
                            break;
                        }
                }
            }
        }
    }

    public l() {
        this.f7384d = 3;
        this.f7385e = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r1.equals("scaleY") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W(java.util.HashMap<java.lang.String, b0.f> r11) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.l.W(java.util.HashMap):void");
    }

    @Override // c0.f
    public void a(HashMap<String, b0.d> splines) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // c0.f
    /* renamed from: b */
    public f clone() {
        return new l().c(this);
    }

    @Override // c0.f
    public f c(f src) {
        super.c(src);
        l lVar = (l) src;
        this.D = lVar.D;
        this.E = lVar.E;
        this.R = lVar.R;
        this.T = lVar.T;
        this.U = lVar.U;
        this.Q = lVar.Q;
        this.F = lVar.F;
        this.G = lVar.G;
        this.H = lVar.H;
        this.K = lVar.K;
        this.I = lVar.I;
        this.J = lVar.J;
        this.L = lVar.L;
        this.M = lVar.M;
        this.N = lVar.N;
        this.O = lVar.O;
        this.P = lVar.P;
        return this;
    }

    @Override // c0.f
    public void d(HashSet<String> attributes) {
        if (!Float.isNaN(this.F)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.G)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.H)) {
            attributes.add(f.f7363i);
        }
        if (!Float.isNaN(this.I)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.J)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.N)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.O)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.P)) {
            attributes.add("translationZ");
        }
        if (!Float.isNaN(this.K)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.L)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.M)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.Q)) {
            attributes.add("progress");
        }
        if (this.f7385e.size() > 0) {
            Iterator<String> it = this.f7385e.keySet().iterator();
            while (it.hasNext()) {
                attributes.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // c0.f
    public void f(Context context, AttributeSet attrs) {
        a.a(this, context.obtainStyledAttributes(attrs, k.m.Of));
    }

    @Override // c0.f
    public void i(HashMap<String, Integer> interpolation) {
        if (this.E == -1) {
            return;
        }
        if (!Float.isNaN(this.F)) {
            interpolation.put("alpha", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.G)) {
            interpolation.put("elevation", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.H)) {
            interpolation.put(f.f7363i, Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.I)) {
            interpolation.put("rotationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.J)) {
            interpolation.put("rotationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.N)) {
            interpolation.put("translationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.O)) {
            interpolation.put("translationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.P)) {
            interpolation.put("translationZ", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.K)) {
            interpolation.put("transitionPathRotate", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.L)) {
            interpolation.put("scaleX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.L)) {
            interpolation.put("scaleY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.Q)) {
            interpolation.put("progress", Integer.valueOf(this.E));
        }
        if (this.f7385e.size() > 0) {
            Iterator<String> it = this.f7385e.keySet().iterator();
            while (it.hasNext()) {
                interpolation.put("CUSTOM," + it.next(), Integer.valueOf(this.E));
            }
        }
    }

    @Override // c0.f
    public void j(String tag, Object value) {
        tag.hashCode();
        char c7 = 65535;
        switch (tag.hashCode()) {
            case -1913008125:
                if (tag.equals(f.A)) {
                    c7 = 0;
                    break;
                }
                break;
            case -1812823328:
                if (tag.equals("transitionEasing")) {
                    c7 = 1;
                    break;
                }
                break;
            case -1249320806:
                if (tag.equals("rotationX")) {
                    c7 = 2;
                    break;
                }
                break;
            case -1249320805:
                if (tag.equals("rotationY")) {
                    c7 = 3;
                    break;
                }
                break;
            case -1225497657:
                if (tag.equals("translationX")) {
                    c7 = 4;
                    break;
                }
                break;
            case -1225497656:
                if (tag.equals("translationY")) {
                    c7 = 5;
                    break;
                }
                break;
            case -1225497655:
                if (tag.equals("translationZ")) {
                    c7 = 6;
                    break;
                }
                break;
            case -908189618:
                if (tag.equals("scaleX")) {
                    c7 = 7;
                    break;
                }
                break;
            case -908189617:
                if (tag.equals("scaleY")) {
                    c7 = '\b';
                    break;
                }
                break;
            case -40300674:
                if (tag.equals(f.f7363i)) {
                    c7 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (tag.equals("elevation")) {
                    c7 = '\n';
                    break;
                }
                break;
            case 37232917:
                if (tag.equals("transitionPathRotate")) {
                    c7 = 11;
                    break;
                }
                break;
            case 92909918:
                if (tag.equals("alpha")) {
                    c7 = '\f';
                    break;
                }
                break;
            case 156108012:
                if (tag.equals("waveOffset")) {
                    c7 = '\r';
                    break;
                }
                break;
            case 184161818:
                if (tag.equals("wavePeriod")) {
                    c7 = 14;
                    break;
                }
                break;
            case 579057826:
                if (tag.equals("curveFit")) {
                    c7 = 15;
                    break;
                }
                break;
            case 1532805160:
                if (tag.equals("waveShape")) {
                    c7 = 16;
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                this.Q = m(value);
                return;
            case 1:
                this.D = value.toString();
                return;
            case 2:
                this.I = m(value);
                return;
            case 3:
                this.J = m(value);
                return;
            case 4:
                this.N = m(value);
                return;
            case 5:
                this.O = m(value);
                return;
            case 6:
                this.P = m(value);
                return;
            case 7:
                this.L = m(value);
                return;
            case '\b':
                this.M = m(value);
                return;
            case '\t':
                this.H = m(value);
                return;
            case '\n':
                this.G = m(value);
                return;
            case 11:
                this.K = m(value);
                return;
            case '\f':
                this.F = m(value);
                return;
            case '\r':
                this.U = m(value);
                return;
            case 14:
                this.T = m(value);
                return;
            case 15:
                this.E = n(value);
                return;
            case 16:
                if (value instanceof Integer) {
                    this.R = n(value);
                    return;
                }
                this.R = 7;
                this.S = value.toString();
                return;
            default:
                return;
        }
    }
}
