package s;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import u.o;
import u.v;
/* loaded from: classes.dex */
public class f extends b {
    public static final String Q = "KeyTimeCycle";
    public static final String R = "KeyTimeCycle";
    public static final int S = 3;

    /* renamed from: y  reason: collision with root package name */
    public String f16168y;

    /* renamed from: z  reason: collision with root package name */
    public int f16169z = -1;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public float J = Float.NaN;
    public float K = Float.NaN;
    public float L = Float.NaN;
    public int M = 0;
    public String N = null;
    public float O = Float.NaN;
    public float P = 0.0f;

    public f() {
        this.f16155k = 3;
        this.f16156l = new HashMap<>();
    }

    @Override // u.v
    public int a(String str) {
        return v.c.a(str);
    }

    @Override // s.b, u.v
    public boolean b(int i7, int i8) {
        if (i7 == 100) {
            this.f16152h = i8;
            return true;
        } else if (i7 != 421) {
            return super.b(i7, i8);
        } else {
            this.M = i8;
            return true;
        }
    }

    @Override // s.b, u.v
    public boolean c(int i7, float f7) {
        if (i7 == 315) {
            this.L = t(Float.valueOf(f7));
            return true;
        } else if (i7 == 401) {
            this.f16169z = u(Float.valueOf(f7));
            return true;
        } else if (i7 == 403) {
            this.A = f7;
            return true;
        } else if (i7 == 416) {
            this.F = t(Float.valueOf(f7));
            return true;
        } else if (i7 == 423) {
            this.O = t(Float.valueOf(f7));
            return true;
        } else if (i7 == 424) {
            this.P = t(Float.valueOf(f7));
            return true;
        } else {
            switch (i7) {
                case 304:
                    this.I = t(Float.valueOf(f7));
                    return true;
                case 305:
                    this.J = t(Float.valueOf(f7));
                    return true;
                case 306:
                    this.K = t(Float.valueOf(f7));
                    return true;
                case 307:
                    this.B = t(Float.valueOf(f7));
                    return true;
                case 308:
                    this.D = t(Float.valueOf(f7));
                    return true;
                case 309:
                    this.E = t(Float.valueOf(f7));
                    return true;
                case 310:
                    this.C = t(Float.valueOf(f7));
                    return true;
                case 311:
                    this.G = t(Float.valueOf(f7));
                    return true;
                case 312:
                    this.H = t(Float.valueOf(f7));
                    return true;
                default:
                    return super.c(i7, f7);
            }
        }
    }

    @Override // s.b, u.v
    public boolean d(int i7, String str) {
        if (i7 == 420) {
            this.f16168y = str;
            return true;
        } else if (i7 != 421) {
            return super.d(i7, str);
        } else {
            this.M = 7;
            this.N = str;
            return true;
        }
    }

    @Override // s.b, u.v
    public boolean e(int i7, boolean z6) {
        return super.e(i7, z6);
    }

    @Override // s.b
    public void f(HashMap<String, o> hashMap) {
    }

    @Override // s.b
    /* renamed from: g */
    public b clone() {
        return new f().h(this);
    }

    @Override // s.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.A)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.B)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("translationZ");
        }
        if (this.f16156l.size() > 0) {
            Iterator<String> it = this.f16156l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r1.equals("scaleX") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(java.util.HashMap<java.lang.String, u.t> r11) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.f.v(java.util.HashMap):void");
    }

    @Override // s.b
    /* renamed from: w  reason: merged with bridge method [inline-methods] */
    public f h(b bVar) {
        super.h(bVar);
        f fVar = (f) bVar;
        this.f16168y = fVar.f16168y;
        this.f16169z = fVar.f16169z;
        this.M = fVar.M;
        this.O = fVar.O;
        this.P = fVar.P;
        this.L = fVar.L;
        this.A = fVar.A;
        this.B = fVar.B;
        this.C = fVar.C;
        this.F = fVar.F;
        this.D = fVar.D;
        this.E = fVar.E;
        this.G = fVar.G;
        this.H = fVar.H;
        this.I = fVar.I;
        this.J = fVar.J;
        this.K = fVar.K;
        return this;
    }
}
