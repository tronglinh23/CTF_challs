package s;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import u.o;
/* loaded from: classes.dex */
public class g extends b {
    public static final String R = "KeyTrigger";
    public static final String S = "viewTransitionOnCross";
    public static final String T = "viewTransitionOnPositiveCross";
    public static final String U = "viewTransitionOnNegativeCross";
    public static final String V = "postLayout";
    public static final String W = "triggerSlack";
    public static final String X = "triggerCollisionView";
    public static final String Y = "triggerCollisionId";
    public static final String Z = "triggerID";

    /* renamed from: a0  reason: collision with root package name */
    public static final String f16170a0 = "positiveCross";

    /* renamed from: b0  reason: collision with root package name */
    public static final String f16171b0 = "negativeCross";

    /* renamed from: c0  reason: collision with root package name */
    public static final String f16172c0 = "triggerReceiver";

    /* renamed from: d0  reason: collision with root package name */
    public static final String f16173d0 = "CROSS";

    /* renamed from: e0  reason: collision with root package name */
    public static final int f16174e0 = 301;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f16175f0 = 302;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f16176g0 = 303;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f16177h0 = 304;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f16178i0 = 305;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f16179j0 = 306;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f16180k0 = 307;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f16181l0 = 308;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f16182m0 = 309;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f16183n0 = 310;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f16184o0 = 311;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f16185p0 = 312;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f16186q0 = 5;
    public int A;
    public String B;
    public String C;
    public int D;
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public u.e P;
    public u.e Q;

    /* renamed from: y  reason: collision with root package name */
    public int f16187y = -1;

    /* renamed from: z  reason: collision with root package name */
    public String f16188z = null;

    public g() {
        int i7 = b.f16140m;
        this.A = i7;
        this.B = null;
        this.C = null;
        this.D = i7;
        this.E = i7;
        this.F = 0.1f;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = Float.NaN;
        this.L = false;
        this.M = i7;
        this.N = i7;
        this.O = i7;
        this.P = new u.e();
        this.Q = new u.e();
        this.f16155k = 5;
        this.f16156l = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // u.v
    public int a(String str) {
        char c7;
        str.hashCode();
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c7 = '\t';
                    break;
                }
                c7 = 65535;
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    c7 = '\n';
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
                return 309;
            case 1:
                return 302;
            case 2:
                return 307;
            case 3:
                return 308;
            case 4:
                return 310;
            case 5:
                return 306;
            case 6:
                return 303;
            case 7:
                return 305;
            case '\b':
                return 301;
            case '\t':
                return 304;
            case '\n':
                return 311;
            default:
                return -1;
        }
    }

    @Override // s.b, u.v
    public boolean b(int i7, int i8) {
        if (i7 == 307) {
            this.E = i8;
            return true;
        } else if (i7 == 308) {
            this.D = u(Integer.valueOf(i8));
            return true;
        } else if (i7 == 311) {
            this.A = i8;
            return true;
        } else {
            switch (i7) {
                case 301:
                    this.O = i8;
                    return true;
                case 302:
                    this.N = i8;
                    return true;
                case 303:
                    this.M = i8;
                    return true;
                default:
                    return super.b(i7, i8);
            }
        }
    }

    @Override // s.b, u.v
    public boolean c(int i7, float f7) {
        if (i7 != 305) {
            return super.c(i7, f7);
        }
        this.F = f7;
        return true;
    }

    @Override // s.b, u.v
    public boolean d(int i7, String str) {
        if (i7 == 309) {
            this.C = str;
            return true;
        } else if (i7 == 310) {
            this.B = str;
            return true;
        } else if (i7 != 312) {
            return super.d(i7, str);
        } else {
            this.f16188z = str;
            return true;
        }
    }

    @Override // s.b, u.v
    public boolean e(int i7, boolean z6) {
        if (i7 != 304) {
            return super.e(i7, z6);
        }
        this.L = z6;
        return true;
    }

    @Override // s.b
    public void f(HashMap<String, o> hashMap) {
    }

    @Override // s.b
    /* renamed from: g */
    public b clone() {
        return new g().h(this);
    }

    @Override // s.b
    public void i(HashSet<String> hashSet) {
    }

    public void v(float f7, r.f fVar) {
    }

    @Override // s.b
    /* renamed from: w  reason: merged with bridge method [inline-methods] */
    public g h(b bVar) {
        super.h(bVar);
        g gVar = (g) bVar;
        this.f16187y = gVar.f16187y;
        this.f16188z = gVar.f16188z;
        this.A = gVar.A;
        this.B = gVar.B;
        this.C = gVar.C;
        this.D = gVar.D;
        this.E = gVar.E;
        this.F = gVar.F;
        this.G = gVar.G;
        this.H = gVar.H;
        this.I = gVar.I;
        this.J = gVar.J;
        this.K = gVar.K;
        this.L = gVar.L;
        this.P = gVar.P;
        this.Q = gVar.Q;
        return this;
    }

    public final void x(String str, r.f fVar) {
        boolean z6 = str.length() == 1;
        if (!z6) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f16156l.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z6 || lowerCase.matches(str)) {
                r.b bVar = this.f16156l.get(str2);
                if (bVar != null) {
                    bVar.a(fVar);
                }
            }
        }
    }
}
