package r;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import s.g;
import u.h;
import u.i;
import u.m;
import u.o;
import u.t;
import u.v;
import u.w;
import u.x;
import u.y;
/* loaded from: classes.dex */
public class c implements v {
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;
    public static final int X = 4;
    public static final int Y = 5;
    public static final int Z = 0;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f15338a0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f15339b0 = 2;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f15340c0 = 3;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f15341d0 = 4;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f15342e0 = 5;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f15343f0 = 6;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f15344g0 = 1;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f15345h0 = 2;

    /* renamed from: i0  reason: collision with root package name */
    public static final String f15346i0 = "MotionController";

    /* renamed from: j0  reason: collision with root package name */
    public static final boolean f15347j0 = false;

    /* renamed from: k0  reason: collision with root package name */
    public static final boolean f15348k0 = false;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f15349l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f15350m0 = 1;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f15351n0 = 2;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f15352o0 = 3;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f15353p0 = 4;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f15354q0 = 5;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f15355r0 = -1;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f15356s0 = -2;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f15357t0 = -3;
    public String[] A;
    public int[] B;
    public HashMap<String, t> H;
    public HashMap<String, o> I;
    public HashMap<String, h> J;
    public g[] K;
    public String[] S;

    /* renamed from: i  reason: collision with root package name */
    public f f15359i;

    /* renamed from: j  reason: collision with root package name */
    public int f15360j;

    /* renamed from: k  reason: collision with root package name */
    public String f15361k;

    /* renamed from: q  reason: collision with root package name */
    public u.b[] f15367q;

    /* renamed from: r  reason: collision with root package name */
    public u.b f15368r;

    /* renamed from: v  reason: collision with root package name */
    public float f15372v;

    /* renamed from: w  reason: collision with root package name */
    public float f15373w;

    /* renamed from: x  reason: collision with root package name */
    public int[] f15374x;

    /* renamed from: y  reason: collision with root package name */
    public double[] f15375y;

    /* renamed from: z  reason: collision with root package name */
    public double[] f15376z;

    /* renamed from: h  reason: collision with root package name */
    public m f15358h = new m();

    /* renamed from: l  reason: collision with root package name */
    public int f15362l = -1;

    /* renamed from: m  reason: collision with root package name */
    public e f15363m = new e();

    /* renamed from: n  reason: collision with root package name */
    public e f15364n = new e();

    /* renamed from: o  reason: collision with root package name */
    public d f15365o = new d();

    /* renamed from: p  reason: collision with root package name */
    public d f15366p = new d();

    /* renamed from: s  reason: collision with root package name */
    public float f15369s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public float f15370t = 0.0f;

    /* renamed from: u  reason: collision with root package name */
    public float f15371u = 1.0f;
    public int C = 4;
    public float[] D = new float[4];
    public ArrayList<e> E = new ArrayList<>();
    public float[] F = new float[1];
    public ArrayList<s.b> G = new ArrayList<>();
    public int L = -1;
    public int M = -1;
    public f N = null;
    public int O = -1;
    public float P = Float.NaN;
    public u.c Q = null;
    public boolean R = false;

    /* loaded from: classes.dex */
    public static class a implements u.c {

        /* renamed from: a  reason: collision with root package name */
        public float f15377a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ u.d f15378b;

        public a(u.d dVar) {
            this.f15378b = dVar;
        }

        @Override // u.c
        public float a() {
            return (float) this.f15378b.b(this.f15377a);
        }

        @Override // u.c
        public float getInterpolation(float f7) {
            this.f15377a = f7;
            return (float) this.f15378b.a(f7);
        }
    }

    public c(f fVar) {
        c0(fVar);
    }

    public static u.c A(int i7, String str, int i8) {
        if (i7 != -1) {
            return null;
        }
        return new a(u.d.c(str));
    }

    public e B(int i7) {
        return this.E.get(i7);
    }

    public int C(int i7, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<s.b> it = this.G.iterator();
        int i8 = 0;
        int i9 = 0;
        while (it.hasNext()) {
            s.b next = it.next();
            int i10 = next.f16155k;
            if (i10 == i7 || i7 != -1) {
                iArr[i9] = 0;
                int i11 = i9 + 1;
                iArr[i11] = i10;
                int i12 = i11 + 1;
                int i13 = next.f16152h;
                iArr[i12] = i13;
                double d7 = i13 / 100.0f;
                this.f15367q[0].d(d7, this.f15375y);
                this.f15363m.l(d7, this.f15374x, this.f15375y, fArr, 0);
                int i14 = i12 + 1;
                iArr[i14] = Float.floatToIntBits(fArr[0]);
                int i15 = i14 + 1;
                iArr[i15] = Float.floatToIntBits(fArr[1]);
                if (next instanceof s.e) {
                    s.e eVar = (s.e) next;
                    int i16 = i15 + 1;
                    iArr[i16] = eVar.I;
                    int i17 = i16 + 1;
                    iArr[i17] = Float.floatToIntBits(eVar.E);
                    i15 = i17 + 1;
                    iArr[i15] = Float.floatToIntBits(eVar.F);
                }
                int i18 = i15 + 1;
                iArr[i9] = i18 - i9;
                i8++;
                i9 = i18;
            }
        }
        return i8;
    }

    public float D(int i7, float f7, float f8) {
        e eVar = this.f15364n;
        float f9 = eVar.f15399o;
        e eVar2 = this.f15363m;
        float f10 = eVar2.f15399o;
        float f11 = f9 - f10;
        float f12 = eVar.f15400p;
        float f13 = eVar2.f15400p;
        float f14 = f12 - f13;
        float f15 = f10 + (eVar2.f15401q / 2.0f);
        float f16 = f13 + (eVar2.f15402r / 2.0f);
        float hypot = (float) Math.hypot(f11, f14);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f17 = f7 - f15;
        float f18 = f8 - f16;
        if (((float) Math.hypot(f17, f18)) == 0.0f) {
            return 0.0f;
        }
        float f19 = (f17 * f11) + (f18 * f14);
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                return 0.0f;
                            }
                            return f18 / f14;
                        }
                        return f17 / f14;
                    }
                    return f18 / f11;
                }
                return f17 / f11;
            }
            return (float) Math.sqrt((hypot * hypot) - (f19 * f19));
        }
        return f19 / hypot;
    }

    public int E(int[] iArr, float[] fArr) {
        Iterator<s.b> it = this.G.iterator();
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            s.b next = it.next();
            int i9 = next.f16152h;
            iArr[i7] = (next.f16155k * 1000) + i9;
            double d7 = i9 / 100.0f;
            this.f15367q[0].d(d7, this.f15375y);
            this.f15363m.l(d7, this.f15374x, this.f15375y, fArr, i8);
            i8 += 2;
            i7++;
        }
        return i7;
    }

    public double[] F(double d7) {
        this.f15367q[0].d(d7, this.f15375y);
        u.b bVar = this.f15368r;
        if (bVar != null) {
            double[] dArr = this.f15375y;
            if (dArr.length > 0) {
                bVar.d(d7, dArr);
            }
        }
        return this.f15375y;
    }

    public s.e G(int i7, int i8, float f7, float f8) {
        u.e eVar = new u.e();
        e eVar2 = this.f15363m;
        float f9 = eVar2.f15399o;
        eVar.f16919b = f9;
        float f10 = eVar2.f15400p;
        eVar.f16921d = f10;
        eVar.f16920c = f9 + eVar2.f15401q;
        eVar.f16918a = f10 + eVar2.f15402r;
        u.e eVar3 = new u.e();
        e eVar4 = this.f15364n;
        float f11 = eVar4.f15399o;
        eVar3.f16919b = f11;
        float f12 = eVar4.f15400p;
        eVar3.f16921d = f12;
        eVar3.f16920c = f11 + eVar4.f15401q;
        eVar3.f16918a = f12 + eVar4.f15402r;
        Iterator<s.b> it = this.G.iterator();
        while (it.hasNext()) {
            s.b next = it.next();
            if (next instanceof s.e) {
                s.e eVar5 = (s.e) next;
                if (eVar5.B(i7, i8, eVar, eVar3, f7, f8)) {
                    return eVar5;
                }
            }
        }
        return null;
    }

    public void H(float f7, int i7, int i8, float f8, float f9, float[] fArr) {
        float o6 = o(f7, this.F);
        HashMap<String, o> hashMap = this.I;
        o oVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, o> hashMap2 = this.I;
        o oVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, o> hashMap3 = this.I;
        o oVar3 = hashMap3 == null ? null : hashMap3.get("rotationZ");
        HashMap<String, o> hashMap4 = this.I;
        o oVar4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, o> hashMap5 = this.I;
        o oVar5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, h> hashMap6 = this.J;
        h hVar = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, h> hashMap7 = this.J;
        h hVar2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, h> hashMap8 = this.J;
        h hVar3 = hashMap8 == null ? null : hashMap8.get("rotationZ");
        HashMap<String, h> hashMap9 = this.J;
        h hVar4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, h> hashMap10 = this.J;
        h hVar5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
        x xVar = new x();
        xVar.b();
        xVar.d(oVar3, o6);
        xVar.h(oVar, oVar2, o6);
        xVar.f(oVar4, oVar5, o6);
        xVar.c(hVar3, o6);
        xVar.g(hVar, hVar2, o6);
        xVar.e(hVar4, hVar5, o6);
        u.b bVar = this.f15368r;
        if (bVar != null) {
            double[] dArr = this.f15375y;
            if (dArr.length > 0) {
                double d7 = o6;
                bVar.d(d7, dArr);
                this.f15368r.g(d7, this.f15376z);
                this.f15363m.x(f8, f9, fArr, this.f15374x, this.f15376z, this.f15375y);
            }
            xVar.a(f8, f9, i7, i8, fArr);
            return;
        }
        int i9 = 0;
        if (this.f15367q == null) {
            e eVar = this.f15364n;
            float f10 = eVar.f15399o;
            e eVar2 = this.f15363m;
            float f11 = f10 - eVar2.f15399o;
            h hVar6 = hVar5;
            float f12 = eVar.f15400p - eVar2.f15400p;
            h hVar7 = hVar4;
            float f13 = (eVar.f15401q - eVar2.f15401q) + f11;
            float f14 = (eVar.f15402r - eVar2.f15402r) + f12;
            fArr[0] = (f11 * (1.0f - f8)) + (f13 * f8);
            fArr[1] = (f12 * (1.0f - f9)) + (f14 * f9);
            xVar.b();
            xVar.d(oVar3, o6);
            xVar.h(oVar, oVar2, o6);
            xVar.f(oVar4, oVar5, o6);
            xVar.c(hVar3, o6);
            xVar.g(hVar, hVar2, o6);
            xVar.e(hVar7, hVar6, o6);
            xVar.a(f8, f9, i7, i8, fArr);
            return;
        }
        double o7 = o(o6, this.F);
        this.f15367q[0].g(o7, this.f15376z);
        this.f15367q[0].d(o7, this.f15375y);
        float f15 = this.F[0];
        while (true) {
            double[] dArr2 = this.f15376z;
            if (i9 >= dArr2.length) {
                this.f15363m.x(f8, f9, fArr, this.f15374x, dArr2, this.f15375y);
                xVar.a(f8, f9, i7, i8, fArr);
                return;
            }
            dArr2[i9] = dArr2[i9] * f15;
            i9++;
        }
    }

    public final float I() {
        char c7;
        float f7;
        float[] fArr = new float[2];
        float f8 = 1.0f / 99;
        double d7 = 0.0d;
        double d8 = 0.0d;
        float f9 = 0.0f;
        int i7 = 0;
        while (i7 < 100) {
            float f10 = i7 * f8;
            double d9 = f10;
            u.d dVar = this.f15363m.f15395k;
            Iterator<e> it = this.E.iterator();
            float f11 = Float.NaN;
            float f12 = 0.0f;
            while (it.hasNext()) {
                e next = it.next();
                u.d dVar2 = next.f15395k;
                if (dVar2 != null) {
                    float f13 = next.f15397m;
                    if (f13 < f10) {
                        dVar = dVar2;
                        f12 = f13;
                    } else if (Float.isNaN(f11)) {
                        f11 = next.f15397m;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f11)) {
                    f11 = 1.0f;
                }
                d9 = (((float) dVar.a((f10 - f12) / r17)) * (f11 - f12)) + f12;
            }
            this.f15367q[0].d(d9, this.f15375y);
            float f14 = f9;
            int i8 = i7;
            this.f15363m.l(d9, this.f15374x, this.f15375y, fArr, 0);
            if (i8 > 0) {
                c7 = 0;
                f7 = (float) (f14 + Math.hypot(d8 - fArr[1], d7 - fArr[0]));
            } else {
                c7 = 0;
                f7 = f14;
            }
            d7 = fArr[c7];
            i7 = i8 + 1;
            f9 = f7;
            d8 = fArr[1];
        }
        return f9;
    }

    public float J() {
        return this.f15363m.f15402r;
    }

    public float K() {
        return this.f15363m.f15401q;
    }

    public float L() {
        return this.f15363m.f15399o;
    }

    public float M() {
        return this.f15363m.f15400p;
    }

    public int N() {
        return this.M;
    }

    public f O() {
        return this.f15359i;
    }

    public final void P(e eVar) {
        Iterator<e> it = this.E.iterator();
        e eVar2 = null;
        while (it.hasNext()) {
            e next = it.next();
            if (eVar.f15398n == next.f15398n) {
                eVar2 = next;
            }
        }
        if (eVar2 != null) {
            this.E.remove(eVar2);
        }
        if (Collections.binarySearch(this.E, eVar) == 0) {
            w.f("MotionController", " KeyPath position \"" + eVar.f15398n + "\" outside of range");
        }
        this.E.add((-r0) - 1, eVar);
    }

    public boolean Q(f fVar, float f7, long j7, u.g gVar) {
        double d7;
        float o6 = o(f7, null);
        int i7 = this.O;
        if (i7 != -1) {
            float f8 = 1.0f / i7;
            float floor = ((float) Math.floor(o6 / f8)) * f8;
            float f9 = (o6 % f8) / f8;
            if (!Float.isNaN(this.P)) {
                f9 = (f9 + this.P) % 1.0f;
            }
            u.c cVar = this.Q;
            o6 = ((cVar != null ? cVar.getInterpolation(f9) : ((double) f9) > 0.5d ? 1.0f : 0.0f) * f8) + floor;
        }
        float f10 = o6;
        HashMap<String, o> hashMap = this.I;
        if (hashMap != null) {
            Iterator<o> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().h(fVar, f10);
            }
        }
        u.b[] bVarArr = this.f15367q;
        if (bVarArr != null) {
            double d8 = f10;
            bVarArr[0].d(d8, this.f15375y);
            this.f15367q[0].g(d8, this.f15376z);
            u.b bVar = this.f15368r;
            if (bVar != null) {
                double[] dArr = this.f15375y;
                if (dArr.length > 0) {
                    bVar.d(d8, dArr);
                    this.f15368r.g(d8, this.f15376z);
                }
            }
            if (this.R) {
                d7 = d8;
            } else {
                d7 = d8;
                this.f15363m.y(f10, fVar, this.f15374x, this.f15375y, this.f15376z, null);
            }
            if (this.M != -1) {
                if (this.N == null) {
                    this.N = fVar.n().f(this.M);
                }
                if (this.N != null) {
                    float w6 = (r1.w() + this.N.h()) / 2.0f;
                    float l7 = (this.N.l() + this.N.q()) / 2.0f;
                    if (fVar.q() - fVar.l() > 0 && fVar.h() - fVar.w() > 0) {
                        fVar.N(l7 - fVar.l());
                        fVar.O(w6 - fVar.w());
                    }
                }
            }
            int i8 = 1;
            while (true) {
                u.b[] bVarArr2 = this.f15367q;
                if (i8 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i8].e(d7, this.D);
                this.f15363m.f15409y.get(this.A[i8 - 1]).w(fVar, this.D);
                i8++;
            }
            d dVar = this.f15365o;
            if (dVar.f15380l == 0) {
                if (f10 <= 0.0f) {
                    fVar.b0(dVar.f15381m);
                } else if (f10 >= 1.0f) {
                    fVar.b0(this.f15366p.f15381m);
                } else if (this.f15366p.f15381m != dVar.f15381m) {
                    fVar.b0(4);
                }
            }
            if (this.K != null) {
                int i9 = 0;
                while (true) {
                    g[] gVarArr = this.K;
                    if (i9 >= gVarArr.length) {
                        break;
                    }
                    gVarArr[i9].v(f10, fVar);
                    i9++;
                }
            }
        } else {
            e eVar = this.f15363m;
            float f11 = eVar.f15399o;
            e eVar2 = this.f15364n;
            float f12 = f11 + ((eVar2.f15399o - f11) * f10);
            float f13 = eVar.f15400p;
            float f14 = f13 + ((eVar2.f15400p - f13) * f10);
            float f15 = eVar.f15401q;
            float f16 = f15 + ((eVar2.f15401q - f15) * f10);
            float f17 = eVar.f15402r;
            float f18 = f12 + 0.5f;
            float f19 = f14 + 0.5f;
            fVar.G((int) f18, (int) f19, (int) (f18 + f16), (int) (f19 + f17 + ((eVar2.f15402r - f17) * f10)));
        }
        HashMap<String, h> hashMap2 = this.J;
        if (hashMap2 != null) {
            for (h hVar : hashMap2.values()) {
                if (hVar instanceof h.f) {
                    double[] dArr2 = this.f15376z;
                    ((h.f) hVar).l(fVar, f10, dArr2[0], dArr2[1]);
                } else {
                    hVar.h(fVar, f10);
                }
            }
            return false;
        }
        return false;
    }

    public String R() {
        return this.f15359i.m();
    }

    public void S(f fVar, s.e eVar, float f7, float f8, String[] strArr, float[] fArr) {
        u.e eVar2 = new u.e();
        e eVar3 = this.f15363m;
        float f9 = eVar3.f15399o;
        eVar2.f16919b = f9;
        float f10 = eVar3.f15400p;
        eVar2.f16921d = f10;
        eVar2.f16920c = f9 + eVar3.f15401q;
        eVar2.f16918a = f10 + eVar3.f15402r;
        u.e eVar4 = new u.e();
        e eVar5 = this.f15364n;
        float f11 = eVar5.f15399o;
        eVar4.f16919b = f11;
        float f12 = eVar5.f15400p;
        eVar4.f16921d = f12;
        eVar4.f16920c = f11 + eVar5.f15401q;
        eVar4.f16918a = f12 + eVar5.f15402r;
        eVar.C(fVar, eVar2, eVar4, f7, f8, strArr, fArr);
    }

    public final void T(e eVar) {
        eVar.w(this.f15359i.E(), this.f15359i.F(), this.f15359i.D(), this.f15359i.k());
    }

    public void U(m mVar, m mVar2, int i7, int i8, int i9) {
        if (i7 == 1) {
            int i10 = mVar.f17011b + mVar.f17012c;
            mVar2.f17011b = ((mVar.f17013d + mVar.f17010a) - mVar.b()) / 2;
            mVar2.f17013d = i9 - ((i10 + mVar.a()) / 2);
            mVar2.f17012c = mVar2.f17011b + mVar.b();
            mVar2.f17010a = mVar2.f17013d + mVar.a();
        } else if (i7 == 2) {
            int i11 = mVar.f17011b + mVar.f17012c;
            mVar2.f17011b = i8 - (((mVar.f17013d + mVar.f17010a) + mVar.b()) / 2);
            mVar2.f17013d = (i11 - mVar.a()) / 2;
            mVar2.f17012c = mVar2.f17011b + mVar.b();
            mVar2.f17010a = mVar2.f17013d + mVar.a();
        } else if (i7 == 3) {
            int i12 = mVar.f17011b + mVar.f17012c;
            mVar2.f17011b = ((mVar.a() / 2) + mVar.f17013d) - (i12 / 2);
            mVar2.f17013d = i9 - ((i12 + mVar.a()) / 2);
            mVar2.f17012c = mVar2.f17011b + mVar.b();
            mVar2.f17010a = mVar2.f17013d + mVar.a();
        } else if (i7 != 4) {
        } else {
            int i13 = mVar.f17011b + mVar.f17012c;
            mVar2.f17011b = i8 - (((mVar.f17010a + mVar.f17013d) + mVar.b()) / 2);
            mVar2.f17013d = (i13 - mVar.a()) / 2;
            mVar2.f17012c = mVar2.f17011b + mVar.b();
            mVar2.f17010a = mVar2.f17013d + mVar.a();
        }
    }

    public void V(f fVar) {
        e eVar = this.f15363m;
        eVar.f15397m = 0.0f;
        eVar.f15398n = 0.0f;
        this.R = true;
        eVar.w(fVar.E(), fVar.F(), fVar.D(), fVar.k());
        this.f15364n.w(fVar.E(), fVar.F(), fVar.D(), fVar.k());
        this.f15365o.p(fVar);
        this.f15366p.p(fVar);
    }

    public void W(int i7) {
        this.f15363m.f15396l = i7;
    }

    public void X(f fVar) {
        e eVar = this.f15364n;
        eVar.f15397m = 1.0f;
        eVar.f15398n = 1.0f;
        T(eVar);
        this.f15364n.w(fVar.l(), fVar.w(), fVar.D(), fVar.k());
        this.f15364n.c(fVar);
        this.f15366p.p(fVar);
    }

    public void Y(int i7) {
        this.L = i7;
    }

    public void Z(f fVar) {
        e eVar = this.f15363m;
        eVar.f15397m = 0.0f;
        eVar.f15398n = 0.0f;
        eVar.w(fVar.E(), fVar.F(), fVar.D(), fVar.k());
        this.f15363m.c(fVar);
        this.f15365o.p(fVar);
    }

    @Override // u.v
    public int a(String str) {
        return 0;
    }

    public void a0(y yVar, f fVar, int i7, int i8, int i9) {
        e eVar = this.f15363m;
        eVar.f15397m = 0.0f;
        eVar.f15398n = 0.0f;
        m mVar = new m();
        if (i7 == 1) {
            int i10 = yVar.f17305b + yVar.f17307d;
            mVar.f17011b = ((yVar.f17306c + yVar.f17308e) - yVar.c()) / 2;
            mVar.f17013d = i8 - ((i10 + yVar.b()) / 2);
            mVar.f17012c = mVar.f17011b + yVar.c();
            mVar.f17010a = mVar.f17013d + yVar.b();
        } else if (i7 == 2) {
            int i11 = yVar.f17305b + yVar.f17307d;
            mVar.f17011b = i9 - (((yVar.f17306c + yVar.f17308e) + yVar.c()) / 2);
            mVar.f17013d = (i11 - yVar.b()) / 2;
            mVar.f17012c = mVar.f17011b + yVar.c();
            mVar.f17010a = mVar.f17013d + yVar.b();
        }
        this.f15363m.w(mVar.f17011b, mVar.f17013d, mVar.b(), mVar.a());
        this.f15365o.q(mVar, fVar, i7, yVar.f17304a);
    }

    @Override // u.v
    public boolean b(int i7, int i8) {
        if (i7 != 509) {
            return i7 == 704;
        }
        Y(i8);
        return true;
    }

    public void b0(int i7) {
        this.M = i7;
        this.N = null;
    }

    @Override // u.v
    public boolean c(int i7, float f7) {
        return false;
    }

    public void c0(f fVar) {
        this.f15359i = fVar;
    }

    @Override // u.v
    public boolean d(int i7, String str) {
        if (705 == i7) {
            System.out.println("TYPE_INTERPOLATOR  " + str);
            this.Q = A(-1, str, 0);
        }
        return false;
    }

    public void d0(int i7, int i8, float f7, long j7) {
        ArrayList arrayList;
        String[] strArr;
        e[] eVarArr;
        int i9;
        b bVar;
        o f8;
        b bVar2;
        Integer num;
        o f9;
        b bVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i10 = this.L;
        if (i10 != -1) {
            this.f15363m.f15405u = i10;
        }
        this.f15365o.i(this.f15366p, hashSet2);
        ArrayList<s.b> arrayList2 = this.G;
        if (arrayList2 != null) {
            Iterator<s.b> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                s.b next = it.next();
                if (next instanceof s.e) {
                    s.e eVar = (s.e) next;
                    P(new e(i7, i8, eVar, this.f15363m, this.f15364n));
                    int i11 = eVar.f16166y;
                    if (i11 != -1) {
                        this.f15362l = i11;
                    }
                } else if (next instanceof s.d) {
                    next.i(hashSet3);
                } else if (next instanceof s.f) {
                    next.i(hashSet);
                } else if (next instanceof g) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((g) next);
                } else {
                    next.q(hashMap);
                    next.i(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.K = (g[]) arrayList.toArray(new g[0]);
        }
        char c7 = 1;
        if (!hashSet2.isEmpty()) {
            this.I = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    i.b bVar4 = new i.b();
                    String str = next2.split(",")[c7];
                    Iterator<s.b> it3 = this.G.iterator();
                    while (it3.hasNext()) {
                        s.b next3 = it3.next();
                        HashMap<String, b> hashMap2 = next3.f16156l;
                        if (hashMap2 != null && (bVar3 = hashMap2.get(str)) != null) {
                            bVar4.a(next3.f16152h, bVar3);
                        }
                    }
                    f9 = o.e(next2, bVar4);
                } else {
                    f9 = o.f(next2, j7);
                }
                if (f9 != null) {
                    f9.i(next2);
                    this.I.put(next2, f9);
                }
                c7 = 1;
            }
            ArrayList<s.b> arrayList3 = this.G;
            if (arrayList3 != null) {
                Iterator<s.b> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    s.b next4 = it4.next();
                    if (next4 instanceof s.c) {
                        next4.f(this.I);
                    }
                }
            }
            this.f15365o.c(this.I, 0);
            this.f15366p.c(this.I, 100);
            for (String str2 : this.I.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                o oVar = this.I.get(str2);
                if (oVar != null) {
                    oVar.j(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.H == null) {
                this.H = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.H.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        i.b bVar5 = new i.b();
                        String str3 = next5.split(",")[1];
                        Iterator<s.b> it6 = this.G.iterator();
                        while (it6.hasNext()) {
                            s.b next6 = it6.next();
                            HashMap<String, b> hashMap3 = next6.f16156l;
                            if (hashMap3 != null && (bVar2 = hashMap3.get(str3)) != null) {
                                bVar5.a(next6.f16152h, bVar2);
                            }
                        }
                        f8 = o.e(next5, bVar5);
                    } else {
                        f8 = o.f(next5, j7);
                    }
                    if (f8 != null) {
                        f8.i(next5);
                    }
                }
            }
            ArrayList<s.b> arrayList4 = this.G;
            if (arrayList4 != null) {
                Iterator<s.b> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    s.b next7 = it7.next();
                    if (next7 instanceof s.f) {
                        ((s.f) next7).v(this.H);
                    }
                }
            }
            for (String str4 : this.H.keySet()) {
                this.H.get(str4).f(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int i12 = 2;
        int size = this.E.size() + 2;
        e[] eVarArr2 = new e[size];
        eVarArr2[0] = this.f15363m;
        eVarArr2[size - 1] = this.f15364n;
        if (this.E.size() > 0 && this.f15362l == s.b.f16140m) {
            this.f15362l = 0;
        }
        Iterator<e> it8 = this.E.iterator();
        int i13 = 1;
        while (it8.hasNext()) {
            eVarArr2[i13] = it8.next();
            i13++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.f15364n.f15409y.keySet()) {
            if (this.f15363m.f15409y.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.A = strArr2;
        this.B = new int[strArr2.length];
        int i14 = 0;
        while (true) {
            strArr = this.A;
            if (i14 >= strArr.length) {
                break;
            }
            String str6 = strArr[i14];
            this.B[i14] = 0;
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    break;
                }
                if (eVarArr2[i15].f15409y.containsKey(str6) && (bVar = eVarArr2[i15].f15409y.get(str6)) != null) {
                    int[] iArr = this.B;
                    iArr[i14] = iArr[i14] + bVar.r();
                    break;
                }
                i15++;
            }
            i14++;
        }
        boolean z6 = eVarArr2[0].f15405u != -1;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i16 = 1; i16 < size; i16++) {
            eVarArr2[i16].i(eVarArr2[i16 - 1], zArr, this.A, z6);
        }
        int i17 = 0;
        for (int i18 = 1; i18 < length; i18++) {
            if (zArr[i18]) {
                i17++;
            }
        }
        this.f15374x = new int[i17];
        int max = Math.max(2, i17);
        this.f15375y = new double[max];
        this.f15376z = new double[max];
        int i19 = 0;
        for (int i20 = 1; i20 < length; i20++) {
            if (zArr[i20]) {
                this.f15374x[i19] = i20;
                i19++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, size, this.f15374x.length);
        double[] dArr2 = new double[size];
        for (int i21 = 0; i21 < size; i21++) {
            eVarArr2[i21].j(dArr[i21], this.f15374x);
            dArr2[i21] = eVarArr2[i21].f15397m;
        }
        int i22 = 0;
        while (true) {
            int[] iArr2 = this.f15374x;
            if (i22 >= iArr2.length) {
                break;
            }
            if (iArr2[i22] < e.P.length) {
                String str7 = e.P[this.f15374x[i22]] + " [";
                for (int i23 = 0; i23 < size; i23++) {
                    str7 = str7 + dArr[i23][i22];
                }
            }
            i22++;
        }
        this.f15367q = new u.b[this.A.length + 1];
        int i24 = 0;
        while (true) {
            String[] strArr3 = this.A;
            if (i24 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i24];
            int i25 = 0;
            int i26 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i25 < size) {
                if (eVarArr2[i25].r(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i12];
                        iArr3[1] = eVarArr2[i25].p(str8);
                        i9 = 0;
                        iArr3[0] = size;
                        dArr4 = (double[][]) Array.newInstance(Double.TYPE, iArr3);
                    } else {
                        i9 = 0;
                    }
                    e eVar2 = eVarArr2[i25];
                    eVarArr = eVarArr2;
                    dArr3[i26] = eVar2.f15397m;
                    eVar2.o(str8, dArr4[i26], i9);
                    i26++;
                } else {
                    eVarArr = eVarArr2;
                }
                i25++;
                eVarArr2 = eVarArr;
                i12 = 2;
            }
            i24++;
            this.f15367q[i24] = u.b.a(this.f15362l, Arrays.copyOf(dArr3, i26), (double[][]) Arrays.copyOf(dArr4, i26));
            eVarArr2 = eVarArr2;
            i12 = 2;
        }
        e[] eVarArr3 = eVarArr2;
        this.f15367q[0] = u.b.a(this.f15362l, dArr2, dArr);
        if (eVarArr3[0].f15405u != -1) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, size, 2);
            for (int i27 = 0; i27 < size; i27++) {
                iArr4[i27] = eVarArr3[i27].f15405u;
                dArr5[i27] = r6.f15397m;
                double[] dArr7 = dArr6[i27];
                dArr7[0] = r6.f15399o;
                dArr7[1] = r6.f15400p;
            }
            this.f15368r = u.b.b(iArr4, dArr5, dArr6);
        }
        this.J = new HashMap<>();
        if (this.G != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f10 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                h d7 = h.d(next8);
                if (d7 != null) {
                    if (d7.k() && Float.isNaN(f10)) {
                        f10 = I();
                    }
                    d7.i(next8);
                    this.J.put(next8, d7);
                }
            }
            Iterator<s.b> it10 = this.G.iterator();
            while (it10.hasNext()) {
                s.b next9 = it10.next();
                if (next9 instanceof s.d) {
                    ((s.d) next9).v(this.J);
                }
            }
            Iterator<h> it11 = this.J.values().iterator();
            while (it11.hasNext()) {
                it11.next().j(f10);
            }
        }
    }

    @Override // u.v
    public boolean e(int i7, boolean z6) {
        return false;
    }

    public void e0(c cVar) {
        this.f15363m.z(cVar, cVar.f15363m);
        this.f15364n.z(cVar, cVar.f15364n);
    }

    public void f(s.b bVar) {
        this.G.add(bVar);
    }

    public void g(ArrayList<s.b> arrayList) {
        this.G.addAll(arrayList);
    }

    public void h(float[] fArr, int i7) {
        float f7 = 1.0f / ((float) (i7 - 1));
        HashMap<String, o> hashMap = this.I;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, o> hashMap2 = this.I;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, h> hashMap3 = this.J;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, h> hashMap4 = this.J;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i8 = 0; i8 < i7; i8++) {
            float f8 = i8 * f7;
            float f9 = this.f15371u;
            float f10 = 0.0f;
            if (f9 != 1.0f) {
                float f11 = this.f15370t;
                if (f8 < f11) {
                    f8 = 0.0f;
                }
                if (f8 > f11 && f8 < 1.0d) {
                    f8 = Math.min((f8 - f11) * f9, 1.0f);
                }
            }
            double d7 = f8;
            u.d dVar = this.f15363m.f15395k;
            Iterator<e> it = this.E.iterator();
            float f12 = Float.NaN;
            while (it.hasNext()) {
                e next = it.next();
                u.d dVar2 = next.f15395k;
                if (dVar2 != null) {
                    float f13 = next.f15397m;
                    if (f13 < f8) {
                        dVar = dVar2;
                        f10 = f13;
                    } else if (Float.isNaN(f12)) {
                        f12 = next.f15397m;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f12)) {
                    f12 = 1.0f;
                }
                d7 = (((float) dVar.a((f8 - f10) / r12)) * (f12 - f10)) + f10;
            }
            this.f15367q[0].d(d7, this.f15375y);
            u.b bVar = this.f15368r;
            if (bVar != null) {
                double[] dArr = this.f15375y;
                if (dArr.length > 0) {
                    bVar.d(d7, dArr);
                }
            }
            this.f15363m.k(this.f15374x, this.f15375y, fArr, i8 * 2);
        }
    }

    public int i(float[] fArr, int[] iArr) {
        if (fArr != null) {
            double[] h7 = this.f15367q[0].h();
            if (iArr != null) {
                Iterator<e> it = this.E.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    iArr[i7] = it.next().f15410z;
                    i7++;
                }
            }
            int i8 = 0;
            for (double d7 : h7) {
                this.f15367q[0].d(d7, this.f15375y);
                this.f15363m.k(this.f15374x, this.f15375y, fArr, i8);
                i8 += 2;
            }
            return i8 / 2;
        }
        return 0;
    }

    public int j(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr != null) {
            double[] h7 = this.f15367q[0].h();
            if (iArr != null) {
                Iterator<e> it = this.E.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    iArr[i7] = it.next().f15410z;
                    i7++;
                }
            }
            if (iArr2 != null) {
                Iterator<e> it2 = this.E.iterator();
                int i8 = 0;
                while (it2.hasNext()) {
                    iArr2[i8] = (int) (it2.next().f15398n * 100.0f);
                    i8++;
                }
            }
            int i9 = 0;
            for (int i10 = 0; i10 < h7.length; i10++) {
                this.f15367q[0].d(h7[i10], this.f15375y);
                this.f15363m.l(h7[i10], this.f15374x, this.f15375y, fArr, i9);
                i9 += 2;
            }
            return i9 / 2;
        }
        return 0;
    }

    public void k(float[] fArr, int i7) {
        double d7;
        float f7 = 1.0f;
        float f8 = 1.0f / ((float) (i7 - 1));
        HashMap<String, o> hashMap = this.I;
        o oVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, o> hashMap2 = this.I;
        o oVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, h> hashMap3 = this.J;
        h hVar = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, h> hashMap4 = this.J;
        h hVar2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i8 = 0;
        while (i8 < i7) {
            float f9 = i8 * f8;
            float f10 = this.f15371u;
            float f11 = 0.0f;
            if (f10 != f7) {
                float f12 = this.f15370t;
                if (f9 < f12) {
                    f9 = 0.0f;
                }
                if (f9 > f12 && f9 < 1.0d) {
                    f9 = Math.min((f9 - f12) * f10, f7);
                }
            }
            float f13 = f9;
            double d8 = f13;
            u.d dVar = this.f15363m.f15395k;
            Iterator<e> it = this.E.iterator();
            float f14 = Float.NaN;
            while (it.hasNext()) {
                e next = it.next();
                u.d dVar2 = next.f15395k;
                double d9 = d8;
                if (dVar2 != null) {
                    float f15 = next.f15397m;
                    if (f15 < f13) {
                        f11 = f15;
                        dVar = dVar2;
                    } else if (Float.isNaN(f14)) {
                        f14 = next.f15397m;
                    }
                }
                d8 = d9;
            }
            double d10 = d8;
            if (dVar != null) {
                if (Float.isNaN(f14)) {
                    f14 = 1.0f;
                }
                d7 = (((float) dVar.a((f13 - f11) / r16)) * (f14 - f11)) + f11;
            } else {
                d7 = d10;
            }
            this.f15367q[0].d(d7, this.f15375y);
            u.b bVar = this.f15368r;
            if (bVar != null) {
                double[] dArr = this.f15375y;
                if (dArr.length > 0) {
                    bVar.d(d7, dArr);
                }
            }
            int i9 = i8 * 2;
            int i10 = i8;
            this.f15363m.l(d7, this.f15374x, this.f15375y, fArr, i9);
            if (hVar != null) {
                fArr[i9] = fArr[i9] + hVar.a(f13);
            } else if (oVar != null) {
                fArr[i9] = fArr[i9] + oVar.a(f13);
            }
            if (hVar2 != null) {
                int i11 = i9 + 1;
                fArr[i11] = fArr[i11] + hVar2.a(f13);
            } else if (oVar2 != null) {
                int i12 = i9 + 1;
                fArr[i12] = fArr[i12] + oVar2.a(f13);
            }
            i8 = i10 + 1;
            f7 = 1.0f;
        }
    }

    public void l(float f7, float[] fArr, int i7) {
        this.f15367q[0].d(o(f7, null), this.f15375y);
        this.f15363m.q(this.f15374x, this.f15375y, fArr, i7);
    }

    public void m(float[] fArr, int i7) {
        float f7 = 1.0f / ((float) (i7 - 1));
        for (int i8 = 0; i8 < i7; i8++) {
            this.f15367q[0].d(o(i8 * f7, null), this.f15375y);
            this.f15363m.q(this.f15374x, this.f15375y, fArr, i8 * 8);
        }
    }

    public void n(boolean z6) {
    }

    public final float o(float f7, float[] fArr) {
        float f8 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f9 = this.f15371u;
            if (f9 != 1.0d) {
                float f10 = this.f15370t;
                if (f7 < f10) {
                    f7 = 0.0f;
                }
                if (f7 > f10 && f7 < 1.0d) {
                    f7 = Math.min((f7 - f10) * f9, 1.0f);
                }
            }
        }
        u.d dVar = this.f15363m.f15395k;
        Iterator<e> it = this.E.iterator();
        float f11 = Float.NaN;
        while (it.hasNext()) {
            e next = it.next();
            u.d dVar2 = next.f15395k;
            if (dVar2 != null) {
                float f12 = next.f15397m;
                if (f12 < f7) {
                    dVar = dVar2;
                    f8 = f12;
                } else if (Float.isNaN(f11)) {
                    f11 = next.f15397m;
                }
            }
        }
        if (dVar != null) {
            float f13 = (Float.isNaN(f11) ? 1.0f : f11) - f8;
            double d7 = (f7 - f8) / f13;
            f7 = (((float) dVar.a(d7)) * f13) + f8;
            if (fArr != null) {
                fArr[0] = (float) dVar.b(d7);
            }
        }
        return f7;
    }

    public int p() {
        return this.f15363m.f15406v;
    }

    public int q(String str, float[] fArr, int i7) {
        o oVar = this.I.get(str);
        if (oVar == null) {
            return -1;
        }
        for (int i8 = 0; i8 < fArr.length; i8++) {
            fArr[i8] = oVar.a(i8 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void r(double d7, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f15367q[0].d(d7, dArr);
        this.f15367q[0].g(d7, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f15363m.m(d7, this.f15374x, dArr, fArr, dArr2, fArr2);
    }

    public float s() {
        return this.f15372v;
    }

    public float t() {
        return this.f15373w;
    }

    public String toString() {
        return " start: x: " + this.f15363m.f15399o + " y: " + this.f15363m.f15400p + " end: x: " + this.f15364n.f15399o + " y: " + this.f15364n.f15400p;
    }

    public void u(float f7, float f8, float f9, float[] fArr) {
        double[] dArr;
        float o6 = o(f7, this.F);
        u.b[] bVarArr = this.f15367q;
        int i7 = 0;
        if (bVarArr == null) {
            e eVar = this.f15364n;
            float f10 = eVar.f15399o;
            e eVar2 = this.f15363m;
            float f11 = f10 - eVar2.f15399o;
            float f12 = eVar.f15400p - eVar2.f15400p;
            float f13 = (eVar.f15401q - eVar2.f15401q) + f11;
            float f14 = (eVar.f15402r - eVar2.f15402r) + f12;
            fArr[0] = (f11 * (1.0f - f8)) + (f13 * f8);
            fArr[1] = (f12 * (1.0f - f9)) + (f14 * f9);
            return;
        }
        double d7 = o6;
        bVarArr[0].g(d7, this.f15376z);
        this.f15367q[0].d(d7, this.f15375y);
        float f15 = this.F[0];
        while (true) {
            dArr = this.f15376z;
            if (i7 >= dArr.length) {
                break;
            }
            dArr[i7] = dArr[i7] * f15;
            i7++;
        }
        u.b bVar = this.f15368r;
        if (bVar == null) {
            this.f15363m.x(f8, f9, fArr, this.f15374x, dArr, this.f15375y);
            return;
        }
        double[] dArr2 = this.f15375y;
        if (dArr2.length > 0) {
            bVar.d(d7, dArr2);
            this.f15368r.g(d7, this.f15376z);
            this.f15363m.x(f8, f9, fArr, this.f15374x, this.f15376z, this.f15375y);
        }
    }

    public int v() {
        int i7 = this.f15363m.f15396l;
        Iterator<e> it = this.E.iterator();
        while (it.hasNext()) {
            i7 = Math.max(i7, it.next().f15396l);
        }
        return Math.max(i7, this.f15364n.f15396l);
    }

    public float w() {
        return this.f15364n.f15402r;
    }

    public float x() {
        return this.f15364n.f15401q;
    }

    public float y() {
        return this.f15364n.f15399o;
    }

    public float z() {
        return this.f15364n.f15400p;
    }
}
