package s;

import java.util.HashMap;
import java.util.HashSet;
import u.o;
import u.v;
/* loaded from: classes.dex */
public class e extends b {
    public static final String L = "KeyPosition";
    public static final float M = 20.0f;
    public static final int N = 2;
    public static final int O = 1;
    public static final int P = 0;
    public static final int Q = 2;
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    public float J;
    public float K;

    /* renamed from: y  reason: collision with root package name */
    public int f16166y;

    /* renamed from: z  reason: collision with root package name */
    public String f16167z;

    public e() {
        int i7 = b.f16140m;
        this.f16166y = i7;
        this.f16167z = null;
        this.A = i7;
        this.B = 0;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = 0;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.f16155k = 2;
    }

    public float A() {
        return this.K;
    }

    public boolean B(int i7, int i8, u.e eVar, u.e eVar2, float f7, float f8) {
        x(i7, i8, eVar.a(), eVar.b(), eVar2.a(), eVar2.b());
        return Math.abs(f7 - this.J) < 20.0f && Math.abs(f8 - this.K) < 20.0f;
    }

    public void C(r.f fVar, u.e eVar, u.e eVar2, float f7, float f8, String[] strArr, float[] fArr) {
        int i7 = this.I;
        if (i7 == 1) {
            E(eVar, eVar2, f7, f8, strArr, fArr);
        } else if (i7 != 2) {
            D(eVar, eVar2, f7, f8, strArr, fArr);
        } else {
            F(fVar, eVar, eVar2, f7, f8, strArr, fArr);
        }
    }

    public void D(u.e eVar, u.e eVar2, float f7, float f8, String[] strArr, float[] fArr) {
        float a7 = eVar.a();
        float b7 = eVar.b();
        float a8 = eVar2.a() - a7;
        float b8 = eVar2.b() - b7;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f7 - a7) / a8;
            strArr[1] = "percentY";
            fArr[1] = (f8 - b7) / b8;
        } else if ("percentX".equals(str)) {
            fArr[0] = (f7 - a7) / a8;
            fArr[1] = (f8 - b7) / b8;
        } else {
            fArr[1] = (f7 - a7) / a8;
            fArr[0] = (f8 - b7) / b8;
        }
    }

    public void E(u.e eVar, u.e eVar2, float f7, float f8, String[] strArr, float[] fArr) {
        float a7 = eVar.a();
        float b7 = eVar.b();
        float a8 = eVar2.a() - a7;
        float b8 = eVar2.b() - b7;
        float hypot = (float) Math.hypot(a8, b8);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f9 = a8 / hypot;
        float f10 = b8 / hypot;
        float f11 = f8 - b7;
        float f12 = f7 - a7;
        float f13 = ((f9 * f11) - (f12 * f10)) / hypot;
        float f14 = ((f9 * f12) + (f10 * f11)) / hypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f14;
                fArr[1] = f13;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f14;
        fArr[1] = f13;
    }

    public void F(r.f fVar, u.e eVar, u.e eVar2, float f7, float f8, String[] strArr, float[] fArr) {
        eVar.a();
        eVar.b();
        eVar2.a();
        eVar2.b();
        r.f n7 = fVar.n();
        int D = n7.D();
        int k7 = n7.k();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = f7 / D;
            strArr[1] = "percentY";
            fArr[1] = f8 / k7;
        } else if ("percentX".equals(str)) {
            fArr[0] = f7 / D;
            fArr[1] = f8 / k7;
        } else {
            fArr[1] = f7 / D;
            fArr[0] = f8 / k7;
        }
    }

    @Override // u.v
    public int a(String str) {
        return v.g.a(str);
    }

    @Override // s.b, u.v
    public boolean b(int i7, int i8) {
        if (i7 == 100) {
            this.f16152h = i8;
            return true;
        } else if (i7 == 508) {
            this.f16166y = i8;
            return true;
        } else if (i7 != 510) {
            return super.b(i7, i8);
        } else {
            this.I = i8;
            return true;
        }
    }

    @Override // s.b, u.v
    public boolean c(int i7, float f7) {
        switch (i7) {
            case v.g.f17243k /* 503 */:
                this.C = f7;
                return true;
            case v.g.f17244l /* 504 */:
                this.D = f7;
                return true;
            case v.g.f17245m /* 505 */:
                this.C = f7;
                this.D = f7;
                return true;
            case v.g.f17246n /* 506 */:
                this.E = f7;
                return true;
            case v.g.f17247o /* 507 */:
                this.F = f7;
                return true;
            default:
                return super.c(i7, f7);
        }
    }

    @Override // s.b, u.v
    public boolean d(int i7, String str) {
        if (i7 != 501) {
            return super.d(i7, str);
        }
        this.f16167z = str.toString();
        return true;
    }

    @Override // s.b
    public void f(HashMap<String, o> hashMap) {
    }

    @Override // s.b
    /* renamed from: g */
    public b clone() {
        return new e().h(this);
    }

    @Override // s.b
    public b h(b bVar) {
        super.h(bVar);
        e eVar = (e) bVar;
        this.f16167z = eVar.f16167z;
        this.A = eVar.A;
        this.B = eVar.B;
        this.C = eVar.C;
        this.D = Float.NaN;
        this.E = eVar.E;
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
        this.J = eVar.J;
        this.K = eVar.K;
        return this;
    }

    @Override // s.b
    public void i(HashSet<String> hashSet) {
    }

    public final void v(float f7, float f8, float f9, float f10) {
        float f11 = f9 - f7;
        float f12 = f10 - f8;
        float f13 = Float.isNaN(this.E) ? 0.0f : this.E;
        float f14 = Float.isNaN(this.H) ? 0.0f : this.H;
        float f15 = Float.isNaN(this.F) ? 0.0f : this.F;
        this.J = (int) (f7 + (f13 * f11) + ((Float.isNaN(this.G) ? 0.0f : this.G) * f12));
        this.K = (int) (f8 + (f11 * f14) + (f12 * f15));
    }

    public final void w(float f7, float f8, float f9, float f10) {
        float f11 = f9 - f7;
        float f12 = f10 - f8;
        float f13 = this.E;
        float f14 = this.F;
        this.J = f7 + (f11 * f13) + ((-f12) * f14);
        this.K = f8 + (f12 * f13) + (f11 * f14);
    }

    public void x(int i7, int i8, float f7, float f8, float f9, float f10) {
        int i9 = this.I;
        if (i9 == 1) {
            w(f7, f8, f9, f10);
        } else if (i9 != 2) {
            v(f7, f8, f9, f10);
        } else {
            y(i7, i8);
        }
    }

    public final void y(int i7, int i8) {
        float f7 = this.E;
        float f8 = 0;
        this.J = ((i7 - 0) * f7) + f8;
        this.K = ((i8 - 0) * f7) + f8;
    }

    public float z() {
        return this.J;
    }
}
