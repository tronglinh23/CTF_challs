package c0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h extends f {
    public static final String X = "KeyCycle";
    public static final String Y = "KeyCycle";
    public static final String Z = "wavePeriod";

    /* renamed from: a0  reason: collision with root package name */
    public static final String f7405a0 = "waveOffset";

    /* renamed from: b0  reason: collision with root package name */
    public static final String f7406b0 = "wavePhase";

    /* renamed from: c0  reason: collision with root package name */
    public static final String f7407c0 = "waveShape";

    /* renamed from: d0  reason: collision with root package name */
    public static final int f7408d0 = 0;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f7409e0 = 1;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f7410f0 = 2;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f7411g0 = 3;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f7412h0 = 4;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f7413i0 = 5;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f7414j0 = 6;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f7415k0 = 4;
    public String D = null;
    public int E = 0;
    public int F = -1;
    public String G = null;
    public float H = Float.NaN;
    public float I = 0.0f;
    public float J = 0.0f;
    public float K = Float.NaN;
    public int L = -1;
    public float M = Float.NaN;
    public float N = Float.NaN;
    public float O = Float.NaN;
    public float P = Float.NaN;
    public float Q = Float.NaN;
    public float R = Float.NaN;
    public float S = Float.NaN;
    public float T = Float.NaN;
    public float U = Float.NaN;
    public float V = Float.NaN;
    public float W = Float.NaN;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f7416a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f7417b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f7418c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f7419d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f7420e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f7421f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f7422g = 7;

        /* renamed from: h  reason: collision with root package name */
        public static final int f7423h = 8;

        /* renamed from: i  reason: collision with root package name */
        public static final int f7424i = 9;

        /* renamed from: j  reason: collision with root package name */
        public static final int f7425j = 10;

        /* renamed from: k  reason: collision with root package name */
        public static final int f7426k = 11;

        /* renamed from: l  reason: collision with root package name */
        public static final int f7427l = 12;

        /* renamed from: m  reason: collision with root package name */
        public static final int f7428m = 13;

        /* renamed from: n  reason: collision with root package name */
        public static final int f7429n = 14;

        /* renamed from: o  reason: collision with root package name */
        public static final int f7430o = 15;

        /* renamed from: p  reason: collision with root package name */
        public static final int f7431p = 16;

        /* renamed from: q  reason: collision with root package name */
        public static final int f7432q = 17;

        /* renamed from: r  reason: collision with root package name */
        public static final int f7433r = 18;

        /* renamed from: s  reason: collision with root package name */
        public static final int f7434s = 19;

        /* renamed from: t  reason: collision with root package name */
        public static final int f7435t = 20;

        /* renamed from: u  reason: collision with root package name */
        public static final int f7436u = 21;

        /* renamed from: v  reason: collision with root package name */
        public static SparseIntArray f7437v;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7437v = sparseIntArray;
            sparseIntArray.append(k.m.qf, 1);
            f7437v.append(k.m.of, 2);
            f7437v.append(k.m.rf, 3);
            f7437v.append(k.m.nf, 4);
            f7437v.append(k.m.wf, 5);
            f7437v.append(k.m.uf, 6);
            f7437v.append(k.m.tf, 7);
            f7437v.append(k.m.xf, 8);
            f7437v.append(k.m.df, 9);
            f7437v.append(k.m.mf, 10);
            f7437v.append(k.m.f1if, 11);
            f7437v.append(k.m.jf, 12);
            f7437v.append(k.m.kf, 13);
            f7437v.append(k.m.sf, 14);
            f7437v.append(k.m.gf, 15);
            f7437v.append(k.m.hf, 16);
            f7437v.append(k.m.ef, 17);
            f7437v.append(k.m.ff, 18);
            f7437v.append(k.m.lf, 19);
            f7437v.append(k.m.pf, 20);
            f7437v.append(k.m.vf, 21);
        }

        public static void b(h c7, TypedArray a7) {
            int indexCount = a7.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = a7.getIndex(i7);
                switch (f7437v.get(index)) {
                    case 1:
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
                    case 2:
                        c7.f7381a = a7.getInt(index, c7.f7381a);
                        break;
                    case 3:
                        c7.D = a7.getString(index);
                        break;
                    case 4:
                        c7.E = a7.getInteger(index, c7.E);
                        break;
                    case 5:
                        if (a7.peekValue(index).type == 3) {
                            c7.G = a7.getString(index);
                            c7.F = 7;
                            break;
                        } else {
                            c7.F = a7.getInt(index, c7.F);
                            break;
                        }
                    case 6:
                        c7.H = a7.getFloat(index, c7.H);
                        break;
                    case 7:
                        if (a7.peekValue(index).type == 5) {
                            c7.I = a7.getDimension(index, c7.I);
                            break;
                        } else {
                            c7.I = a7.getFloat(index, c7.I);
                            break;
                        }
                    case 8:
                        c7.L = a7.getInt(index, c7.L);
                        break;
                    case 9:
                        c7.M = a7.getFloat(index, c7.M);
                        break;
                    case 10:
                        c7.N = a7.getDimension(index, c7.N);
                        break;
                    case 11:
                        c7.O = a7.getFloat(index, c7.O);
                        break;
                    case 12:
                        c7.Q = a7.getFloat(index, c7.Q);
                        break;
                    case 13:
                        c7.R = a7.getFloat(index, c7.R);
                        break;
                    case 14:
                        c7.P = a7.getFloat(index, c7.P);
                        break;
                    case 15:
                        c7.S = a7.getFloat(index, c7.S);
                        break;
                    case 16:
                        c7.T = a7.getFloat(index, c7.T);
                        break;
                    case 17:
                        c7.U = a7.getDimension(index, c7.U);
                        break;
                    case 18:
                        c7.V = a7.getDimension(index, c7.V);
                        break;
                    case 19:
                        c7.W = a7.getDimension(index, c7.W);
                        break;
                    case 20:
                        c7.K = a7.getFloat(index, c7.K);
                        break;
                    case 21:
                        c7.J = a7.getFloat(index, c7.J) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f7437v.get(index));
                        break;
                }
            }
        }
    }

    public h() {
        this.f7384d = 4;
        this.f7385e = new HashMap<>();
    }

    @Override // c0.f
    public void a(HashMap<String, b0.d> splines) {
        c.n("KeyCycle", "add " + splines.size() + " values", 2);
        for (String str : splines.keySet()) {
            b0.d dVar = splines.get(str);
            if (dVar != null) {
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
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c7 = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c7 = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c7 = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c7 = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c7 = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c7 = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals(f.f7363i)) {
                            c7 = '\b';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c7 = '\t';
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
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
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c7 = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            c7 = '\r';
                            break;
                        }
                        break;
                }
                switch (c7) {
                    case 0:
                        dVar.g(this.f7381a, this.Q);
                        continue;
                    case 1:
                        dVar.g(this.f7381a, this.R);
                        continue;
                    case 2:
                        dVar.g(this.f7381a, this.U);
                        continue;
                    case 3:
                        dVar.g(this.f7381a, this.V);
                        continue;
                    case 4:
                        dVar.g(this.f7381a, this.W);
                        continue;
                    case 5:
                        dVar.g(this.f7381a, this.K);
                        continue;
                    case 6:
                        dVar.g(this.f7381a, this.S);
                        continue;
                    case 7:
                        dVar.g(this.f7381a, this.T);
                        continue;
                    case '\b':
                        dVar.g(this.f7381a, this.O);
                        continue;
                    case '\t':
                        dVar.g(this.f7381a, this.N);
                        continue;
                    case '\n':
                        dVar.g(this.f7381a, this.P);
                        continue;
                    case 11:
                        dVar.g(this.f7381a, this.M);
                        continue;
                    case '\f':
                        dVar.g(this.f7381a, this.I);
                        continue;
                    case '\r':
                        dVar.g(this.f7381a, this.J);
                        continue;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("  UNKNOWN  ");
                            sb.append(str);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    public void a0(HashMap<String, b0.c> oscSet) {
        b0.c cVar;
        b0.c cVar2;
        for (String str : oscSet.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.a aVar = this.f7385e.get(str.substring(7));
                if (aVar != null && aVar.j() == a.b.FLOAT_TYPE && (cVar = oscSet.get(str)) != null) {
                    cVar.g(this.f7381a, this.F, this.G, this.L, this.H, this.I, this.J, aVar.k(), aVar);
                }
            } else {
                float b02 = b0(str);
                if (!Float.isNaN(b02) && (cVar2 = oscSet.get(str)) != null) {
                    cVar2.f(this.f7381a, this.F, this.G, this.L, this.H, this.I, this.J, b02);
                }
            }
        }
    }

    @Override // c0.f
    /* renamed from: b */
    public f clone() {
        return new h().c(this);
    }

    public float b0(String key) {
        key.hashCode();
        char c7 = 65535;
        switch (key.hashCode()) {
            case -1249320806:
                if (key.equals("rotationX")) {
                    c7 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (key.equals("rotationY")) {
                    c7 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (key.equals("translationX")) {
                    c7 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (key.equals("translationY")) {
                    c7 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (key.equals("translationZ")) {
                    c7 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (key.equals("progress")) {
                    c7 = 5;
                    break;
                }
                break;
            case -908189618:
                if (key.equals("scaleX")) {
                    c7 = 6;
                    break;
                }
                break;
            case -908189617:
                if (key.equals("scaleY")) {
                    c7 = 7;
                    break;
                }
                break;
            case -40300674:
                if (key.equals(f.f7363i)) {
                    c7 = '\b';
                    break;
                }
                break;
            case -4379043:
                if (key.equals("elevation")) {
                    c7 = '\t';
                    break;
                }
                break;
            case 37232917:
                if (key.equals("transitionPathRotate")) {
                    c7 = '\n';
                    break;
                }
                break;
            case 92909918:
                if (key.equals("alpha")) {
                    c7 = 11;
                    break;
                }
                break;
            case 156108012:
                if (key.equals("waveOffset")) {
                    c7 = '\f';
                    break;
                }
                break;
            case 1530034690:
                if (key.equals("wavePhase")) {
                    c7 = '\r';
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                return this.Q;
            case 1:
                return this.R;
            case 2:
                return this.U;
            case 3:
                return this.V;
            case 4:
                return this.W;
            case 5:
                return this.K;
            case 6:
                return this.S;
            case 7:
                return this.T;
            case '\b':
                return this.O;
            case '\t':
                return this.N;
            case '\n':
                return this.P;
            case 11:
                return this.M;
            case '\f':
                return this.I;
            case '\r':
                return this.J;
            default:
                if (key.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("  UNKNOWN  ");
                sb.append(key);
                return Float.NaN;
        }
    }

    @Override // c0.f
    public f c(f src) {
        super.c(src);
        h hVar = (h) src;
        this.D = hVar.D;
        this.E = hVar.E;
        this.F = hVar.F;
        this.G = hVar.G;
        this.H = hVar.H;
        this.I = hVar.I;
        this.J = hVar.J;
        this.K = hVar.K;
        this.L = hVar.L;
        this.M = hVar.M;
        this.N = hVar.N;
        this.O = hVar.O;
        this.P = hVar.P;
        this.Q = hVar.Q;
        this.R = hVar.R;
        this.S = hVar.S;
        this.T = hVar.T;
        this.U = hVar.U;
        this.V = hVar.V;
        this.W = hVar.W;
        return this;
    }

    @Override // c0.f
    public void d(HashSet<String> attributes) {
        if (!Float.isNaN(this.M)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.N)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.O)) {
            attributes.add(f.f7363i);
        }
        if (!Float.isNaN(this.Q)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.R)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.S)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.T)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.P)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.U)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.V)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.W)) {
            attributes.add("translationZ");
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
        a.b(this, context.obtainStyledAttributes(attrs, k.m.cf));
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
            case 1530034690:
                if (tag.equals("wavePhase")) {
                    c7 = 16;
                    break;
                }
                break;
            case 1532805160:
                if (tag.equals("waveShape")) {
                    c7 = 17;
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                this.K = m(value);
                return;
            case 1:
                this.D = value.toString();
                return;
            case 2:
                this.Q = m(value);
                return;
            case 3:
                this.R = m(value);
                return;
            case 4:
                this.U = m(value);
                return;
            case 5:
                this.V = m(value);
                return;
            case 6:
                this.W = m(value);
                return;
            case 7:
                this.S = m(value);
                return;
            case '\b':
                this.T = m(value);
                return;
            case '\t':
                this.O = m(value);
                return;
            case '\n':
                this.N = m(value);
                return;
            case 11:
                this.P = m(value);
                return;
            case '\f':
                this.M = m(value);
                return;
            case '\r':
                this.I = m(value);
                return;
            case 14:
                this.H = m(value);
                return;
            case 15:
                this.E = n(value);
                return;
            case 16:
                this.J = m(value);
                return;
            case 17:
                if (value instanceof Integer) {
                    this.F = n(value);
                    return;
                }
                this.F = 7;
                this.G = value.toString();
                return;
            default:
                return;
        }
    }
}
