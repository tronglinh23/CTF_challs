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
public class g extends f {
    public static final String U = "KeyAttribute";
    public static final String V = "KeyAttributes";
    public static final boolean W = false;
    public static final int X = 1;
    public String D;
    public int E = -1;
    public boolean F = false;
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
    public float R = Float.NaN;
    public float S = Float.NaN;
    public float T = Float.NaN;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f7386a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f7387b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f7388c = 4;

        /* renamed from: d  reason: collision with root package name */
        public static final int f7389d = 5;

        /* renamed from: e  reason: collision with root package name */
        public static final int f7390e = 6;

        /* renamed from: f  reason: collision with root package name */
        public static final int f7391f = 8;

        /* renamed from: g  reason: collision with root package name */
        public static final int f7392g = 7;

        /* renamed from: h  reason: collision with root package name */
        public static final int f7393h = 9;

        /* renamed from: i  reason: collision with root package name */
        public static final int f7394i = 10;

        /* renamed from: j  reason: collision with root package name */
        public static final int f7395j = 12;

        /* renamed from: k  reason: collision with root package name */
        public static final int f7396k = 13;

        /* renamed from: l  reason: collision with root package name */
        public static final int f7397l = 14;

        /* renamed from: m  reason: collision with root package name */
        public static final int f7398m = 15;

        /* renamed from: n  reason: collision with root package name */
        public static final int f7399n = 16;

        /* renamed from: o  reason: collision with root package name */
        public static final int f7400o = 17;

        /* renamed from: p  reason: collision with root package name */
        public static final int f7401p = 18;

        /* renamed from: q  reason: collision with root package name */
        public static final int f7402q = 19;

        /* renamed from: r  reason: collision with root package name */
        public static final int f7403r = 20;

        /* renamed from: s  reason: collision with root package name */
        public static SparseIntArray f7404s;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7404s = sparseIntArray;
            sparseIntArray.append(k.m.Je, 1);
            f7404s.append(k.m.Ue, 2);
            f7404s.append(k.m.Qe, 4);
            f7404s.append(k.m.Re, 5);
            f7404s.append(k.m.Se, 6);
            f7404s.append(k.m.Ke, 19);
            f7404s.append(k.m.Le, 20);
            f7404s.append(k.m.Oe, 7);
            f7404s.append(k.m.bf, 8);
            f7404s.append(k.m.af, 9);
            f7404s.append(k.m.Ye, 10);
            f7404s.append(k.m.We, 12);
            f7404s.append(k.m.Ve, 13);
            f7404s.append(k.m.Pe, 14);
            f7404s.append(k.m.Me, 15);
            f7404s.append(k.m.Ne, 16);
            f7404s.append(k.m.Te, 17);
            f7404s.append(k.m.Xe, 18);
        }

        public static void a(g c7, TypedArray a7) {
            int indexCount = a7.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = a7.getIndex(i7);
                switch (f7404s.get(index)) {
                    case 1:
                        c7.G = a7.getFloat(index, c7.G);
                        break;
                    case 2:
                        c7.H = a7.getDimension(index, c7.H);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f7404s.get(index));
                        break;
                    case 4:
                        c7.I = a7.getFloat(index, c7.I);
                        break;
                    case 5:
                        c7.J = a7.getFloat(index, c7.J);
                        break;
                    case 6:
                        c7.K = a7.getFloat(index, c7.K);
                        break;
                    case 7:
                        c7.O = a7.getFloat(index, c7.O);
                        break;
                    case 8:
                        c7.N = a7.getFloat(index, c7.N);
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
                        c7.P = a7.getFloat(index, c7.P);
                        break;
                    case 15:
                        c7.Q = a7.getDimension(index, c7.Q);
                        break;
                    case 16:
                        c7.R = a7.getDimension(index, c7.R);
                        break;
                    case 17:
                        c7.S = a7.getDimension(index, c7.S);
                        break;
                    case 18:
                        c7.T = a7.getFloat(index, c7.T);
                        break;
                    case 19:
                        c7.L = a7.getDimension(index, c7.L);
                        break;
                    case 20:
                        c7.M = a7.getDimension(index, c7.M);
                        break;
                }
            }
        }
    }

    public g() {
        this.f7384d = 1;
        this.f7385e = new HashMap<>();
    }

    public int T() {
        return this.E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r1.equals("scaleY") == false) goto L15;
     */
    @Override // c0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.HashMap<java.lang.String, b0.d> r7) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.g.a(java.util.HashMap):void");
    }

    @Override // c0.f
    /* renamed from: b */
    public f clone() {
        return new g().c(this);
    }

    @Override // c0.f
    public f c(f src) {
        super.c(src);
        g gVar = (g) src;
        this.E = gVar.E;
        this.F = gVar.F;
        this.G = gVar.G;
        this.H = gVar.H;
        this.I = gVar.I;
        this.J = gVar.J;
        this.K = gVar.K;
        this.L = gVar.L;
        this.M = gVar.M;
        this.N = gVar.N;
        this.O = gVar.O;
        this.P = gVar.P;
        this.Q = gVar.Q;
        this.R = gVar.R;
        this.S = gVar.S;
        this.T = gVar.T;
        return this;
    }

    @Override // c0.f
    public void d(HashSet<String> attributes) {
        if (!Float.isNaN(this.G)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.H)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.I)) {
            attributes.add(f.f7363i);
        }
        if (!Float.isNaN(this.J)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.K)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.L)) {
            attributes.add(f.f7366l);
        }
        if (!Float.isNaN(this.M)) {
            attributes.add(f.f7367m);
        }
        if (!Float.isNaN(this.Q)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.R)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.S)) {
            attributes.add("translationZ");
        }
        if (!Float.isNaN(this.N)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.O)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.P)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.T)) {
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
        a.a(this, context.obtainStyledAttributes(attrs, k.m.Ie));
    }

    @Override // c0.f
    public void i(HashMap<String, Integer> interpolation) {
        if (this.E == -1) {
            return;
        }
        if (!Float.isNaN(this.G)) {
            interpolation.put("alpha", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.H)) {
            interpolation.put("elevation", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.I)) {
            interpolation.put(f.f7363i, Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.J)) {
            interpolation.put("rotationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.K)) {
            interpolation.put("rotationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.L)) {
            interpolation.put(f.f7366l, Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.M)) {
            interpolation.put(f.f7367m, Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.Q)) {
            interpolation.put("translationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.R)) {
            interpolation.put("translationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.S)) {
            interpolation.put("translationZ", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.N)) {
            interpolation.put("transitionPathRotate", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.O)) {
            interpolation.put("scaleX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.P)) {
            interpolation.put("scaleY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.T)) {
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
            case -760884510:
                if (tag.equals(f.f7366l)) {
                    c7 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (tag.equals(f.f7367m)) {
                    c7 = '\n';
                    break;
                }
                break;
            case -40300674:
                if (tag.equals(f.f7363i)) {
                    c7 = 11;
                    break;
                }
                break;
            case -4379043:
                if (tag.equals("elevation")) {
                    c7 = '\f';
                    break;
                }
                break;
            case 37232917:
                if (tag.equals("transitionPathRotate")) {
                    c7 = '\r';
                    break;
                }
                break;
            case 92909918:
                if (tag.equals("alpha")) {
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
            case 1941332754:
                if (tag.equals("visibility")) {
                    c7 = 16;
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                this.T = m(value);
                return;
            case 1:
                this.D = value.toString();
                return;
            case 2:
                this.J = m(value);
                return;
            case 3:
                this.K = m(value);
                return;
            case 4:
                this.Q = m(value);
                return;
            case 5:
                this.R = m(value);
                return;
            case 6:
                this.S = m(value);
                return;
            case 7:
                this.O = m(value);
                return;
            case '\b':
                this.P = m(value);
                return;
            case '\t':
                this.L = m(value);
                return;
            case '\n':
                this.M = m(value);
                return;
            case 11:
                this.I = m(value);
                return;
            case '\f':
                this.H = m(value);
                return;
            case '\r':
                this.N = m(value);
                return;
            case 14:
                this.G = m(value);
                return;
            case 15:
                this.E = n(value);
                return;
            case 16:
                this.F = l(value);
                return;
            default:
                return;
        }
    }
}
