package s;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import u.h;
import u.o;
import u.v;
import u.w;

/* loaded from: classes.dex */
public class d extends b {
    public static final String R = "KeyCycle";
    public static final String S = "KeyCycle";
    public static final String T = "wavePeriod";
    public static final String U = "waveOffset";
    public static final String V = "wavePhase";
    public static final String W = "waveShape";
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f16159a0 = 3;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f16160b0 = 4;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f16161c0 = 5;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f16162d0 = 6;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f16163e0 = 4;

    /* renamed from: y  reason: collision with root package name */
    public String f16164y = null;

    /* renamed from: z  reason: collision with root package name */
    public int f16165z = 0;
    public int A = -1;
    public String B = null;
    public float C = Float.NaN;
    public float D = 0.0f;
    public float E = 0.0f;
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

    public d() {
        this.f16155k = 4;
        this.f16156l = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // u.v
    public int a(String str) {
        char c7;
        str.hashCode();
        switch (str.hashCode()) {
            case -1581616630:
                if (str.equals(v.c.P)) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -1310311125:
                if (str.equals("easing")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case -1019779949:
                if (str.equals(v.c.R)) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c7 = '\t';
                    break;
                }
                c7 = 65535;
                break;
            case -991726143:
                if (str.equals(v.c.Q)) {
                    c7 = '\n';
                    break;
                }
                c7 = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c7 = 11;
                    break;
                }
                c7 = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c7 = '\f';
                    break;
                }
                c7 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c7 = '\r';
                    break;
                }
                c7 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c7 = 14;
                    break;
                }
                c7 = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c7 = 15;
                    break;
                }
                c7 = 65535;
                break;
            case 106629499:
                if (str.equals(v.c.S)) {
                    c7 = 16;
                    break;
                }
                c7 = 65535;
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c7 = 17;
                    break;
                }
                c7 = 65535;
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c7 = 18;
                    break;
                }
                c7 = 65535;
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c7 = 19;
                    break;
                }
                c7 = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c7 = 20;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
            case 0:
                return v.c.f17171t;
            case 1:
                return v.c.f17169r;
            case 2:
                return 308;
            case 3:
                return 309;
            case 4:
                return 310;
            case 5:
                return 304;
            case 6:
                return 305;
            case 7:
                return 306;
            case '\b':
                return v.c.f17173v;
            case '\t':
                return 315;
            case '\n':
                return v.c.f17172u;
            case 11:
                return 313;
            case '\f':
                return 314;
            case '\r':
                return 311;
            case 14:
                return 312;
            case 15:
                return v.c.f17155d;
            case 16:
                return v.c.f17174w;
            case 17:
                return v.c.f17153b;
            case 18:
                return v.c.f17168q;
            case 19:
                return 421;
            case 20:
                return v.c.f17154c;
            default:
                return -1;
        }
    }

    @Override // s.b, u.v
    public boolean b(int i7, int i8) {
        if (i7 == 401) {
            this.f16165z = i8;
            return true;
        } else if (i7 == 421) {
            this.A = i8;
            return true;
        } else if (c(i7, i8)) {
            return true;
        } else {
            return super.b(i7, i8);
        }
    }

    @Override // s.b, u.v
    public boolean c(int i7, float f7) {
        if (i7 == 315) {
            this.F = f7;
            return true;
        } else if (i7 == 403) {
            this.G = f7;
            return true;
        } else if (i7 == 416) {
            this.J = f7;
            return true;
        } else {
            switch (i7) {
                case 304:
                    this.O = f7;
                    return true;
                case 305:
                    this.P = f7;
                    return true;
                case 306:
                    this.Q = f7;
                    return true;
                case 307:
                    this.H = f7;
                    return true;
                case 308:
                    this.K = f7;
                    return true;
                case 309:
                    this.L = f7;
                    return true;
                case 310:
                    this.I = f7;
                    return true;
                case 311:
                    this.M = f7;
                    return true;
                case 312:
                    this.N = f7;
                    return true;
                default:
                    switch (i7) {
                        case v.c.f17172u /* 423 */:
                            this.C = f7;
                            return true;
                        case v.c.f17173v /* 424 */:
                            this.D = f7;
                            return true;
                        case v.c.f17174w /* 425 */:
                            this.E = f7;
                            return true;
                        default:
                            return super.c(i7, f7);
                    }
            }
        }
    }

    @Override // s.b, u.v
    public boolean d(int i7, String str) {
        if (i7 == 420) {
            this.f16164y = str;
            return true;
        } else if (i7 != 422) {
            return super.d(i7, str);
        } else {
            this.B = str;
            return true;
        }
    }

    @Override // s.b
    public void f(HashMap<String, o> hashMap) {
    }

    @Override // s.b
    /* renamed from: g */
    public b clone() {
        return null;
    }

    @Override // s.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("translationZ");
        }
        if (this.f16156l.size() > 0) {
            Iterator<String> it = this.f16156l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void v(HashMap<String, h> hashMap) {
        h hVar;
        h hVar2;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                r.b bVar = this.f16156l.get(str.substring(7));
                if (bVar != null && bVar.m() == 901 && (hVar = hashMap.get(str)) != null) {
                    hVar.g(this.f16152h, this.A, this.B, -1, this.C, this.D, this.E, bVar.n(), bVar);
                }
            } else {
                float x6 = x(str);
                if (!Float.isNaN(x6) && (hVar2 = hashMap.get(str)) != null) {
                    hVar2.f(this.f16152h, this.A, this.B, -1, this.C, this.D, this.E, x6);
                }
            }
        }
    }

    public void w() {
        System.out.println("MotionKeyCycle{mWaveShape=" + this.A + ", mWavePeriod=" + this.C + ", mWaveOffset=" + this.D + ", mWavePhase=" + this.E + ", mRotation=" + this.I + '}');
    }

    public float x(String str) {
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
            case -1019779949:
                if (str.equals(v.c.R)) {
                    c7 = 6;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c7 = 7;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c7 = '\b';
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c7 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
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
            case 106629499:
                if (str.equals(v.c.S)) {
                    c7 = '\f';
                    break;
                }
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c7 = '\r';
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                return this.K;
            case 1:
                return this.L;
            case 2:
                return this.I;
            case 3:
                return this.O;
            case 4:
                return this.P;
            case 5:
                return this.Q;
            case 6:
                return this.D;
            case 7:
                return this.F;
            case '\b':
                return this.M;
            case '\t':
                return this.N;
            case '\n':
                return this.H;
            case 11:
                return this.G;
            case '\f':
                return this.E;
            case '\r':
                return this.J;
            default:
                return Float.NaN;
        }
    }

    public void y() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        w.c(" ------------- " + this.f16152h + " -------------");
        w.c("MotionKeyCycle{Shape=" + this.A + ", Period=" + this.C + ", Offset=" + this.D + ", Phase=" + this.E + '}');
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i7 = 0; i7 < strArr.length; i7++) {
            v.a.a(strArr[i7]);
            w.c(strArr[i7] + ":" + x(strArr[i7]));
        }
    }
}