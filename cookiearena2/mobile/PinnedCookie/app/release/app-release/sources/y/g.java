package y;

import java.util.ArrayList;
import java.util.HashMap;
import y.e;
/* loaded from: classes.dex */
public class g extends n {

    /* renamed from: o2  reason: collision with root package name */
    public static final int f18646o2 = 0;

    /* renamed from: p2  reason: collision with root package name */
    public static final int f18647p2 = 1;

    /* renamed from: q2  reason: collision with root package name */
    public static final int f18648q2 = 2;

    /* renamed from: r2  reason: collision with root package name */
    public static final int f18649r2 = 0;

    /* renamed from: s2  reason: collision with root package name */
    public static final int f18650s2 = 1;

    /* renamed from: t2  reason: collision with root package name */
    public static final int f18651t2 = 2;

    /* renamed from: u2  reason: collision with root package name */
    public static final int f18652u2 = 3;

    /* renamed from: v2  reason: collision with root package name */
    public static final int f18653v2 = 0;

    /* renamed from: w2  reason: collision with root package name */
    public static final int f18654w2 = 1;

    /* renamed from: x2  reason: collision with root package name */
    public static final int f18655x2 = 2;

    /* renamed from: y2  reason: collision with root package name */
    public static final int f18656y2 = 3;

    /* renamed from: m2  reason: collision with root package name */
    public e[] f18669m2;
    public int P1 = -1;
    public int Q1 = -1;
    public int R1 = -1;
    public int S1 = -1;
    public int T1 = -1;
    public int U1 = -1;
    public float V1 = 0.5f;
    public float W1 = 0.5f;
    public float X1 = 0.5f;
    public float Y1 = 0.5f;
    public float Z1 = 0.5f;

    /* renamed from: a2  reason: collision with root package name */
    public float f18657a2 = 0.5f;

    /* renamed from: b2  reason: collision with root package name */
    public int f18658b2 = 0;

    /* renamed from: c2  reason: collision with root package name */
    public int f18659c2 = 0;

    /* renamed from: d2  reason: collision with root package name */
    public int f18660d2 = 2;

    /* renamed from: e2  reason: collision with root package name */
    public int f18661e2 = 2;

    /* renamed from: f2  reason: collision with root package name */
    public int f18662f2 = 0;

    /* renamed from: g2  reason: collision with root package name */
    public int f18663g2 = -1;

    /* renamed from: h2  reason: collision with root package name */
    public int f18664h2 = 0;

    /* renamed from: i2  reason: collision with root package name */
    public ArrayList<a> f18665i2 = new ArrayList<>();

    /* renamed from: j2  reason: collision with root package name */
    public e[] f18666j2 = null;

    /* renamed from: k2  reason: collision with root package name */
    public e[] f18667k2 = null;

    /* renamed from: l2  reason: collision with root package name */
    public int[] f18668l2 = null;

    /* renamed from: n2  reason: collision with root package name */
    public int f18670n2 = 0;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f18671a;

        /* renamed from: d  reason: collision with root package name */
        public d f18674d;

        /* renamed from: e  reason: collision with root package name */
        public d f18675e;

        /* renamed from: f  reason: collision with root package name */
        public d f18676f;

        /* renamed from: g  reason: collision with root package name */
        public d f18677g;

        /* renamed from: h  reason: collision with root package name */
        public int f18678h;

        /* renamed from: i  reason: collision with root package name */
        public int f18679i;

        /* renamed from: j  reason: collision with root package name */
        public int f18680j;

        /* renamed from: k  reason: collision with root package name */
        public int f18681k;

        /* renamed from: q  reason: collision with root package name */
        public int f18687q;

        /* renamed from: b  reason: collision with root package name */
        public e f18672b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f18673c = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f18682l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f18683m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f18684n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f18685o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f18686p = 0;

        public a(int i7, d dVar, d dVar2, d dVar3, d dVar4, int i8) {
            this.f18678h = 0;
            this.f18679i = 0;
            this.f18680j = 0;
            this.f18681k = 0;
            this.f18687q = 0;
            this.f18671a = i7;
            this.f18674d = dVar;
            this.f18675e = dVar2;
            this.f18676f = dVar3;
            this.f18677g = dVar4;
            this.f18678h = g.this.s2();
            this.f18679i = g.this.u2();
            this.f18680j = g.this.t2();
            this.f18681k = g.this.r2();
            this.f18687q = i8;
        }

        public void b(e eVar) {
            if (this.f18671a == 0) {
                int f32 = g.this.f3(eVar, this.f18687q);
                if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                    this.f18686p++;
                    f32 = 0;
                }
                this.f18682l += f32 + (eVar.l0() != 8 ? g.this.f18658b2 : 0);
                int e32 = g.this.e3(eVar, this.f18687q);
                if (this.f18672b == null || this.f18673c < e32) {
                    this.f18672b = eVar;
                    this.f18673c = e32;
                    this.f18683m = e32;
                }
            } else {
                int f33 = g.this.f3(eVar, this.f18687q);
                int e33 = g.this.e3(eVar, this.f18687q);
                if (eVar.j0() == e.b.MATCH_CONSTRAINT) {
                    this.f18686p++;
                    e33 = 0;
                }
                this.f18683m += e33 + (eVar.l0() != 8 ? g.this.f18659c2 : 0);
                if (this.f18672b == null || this.f18673c < f33) {
                    this.f18672b = eVar;
                    this.f18673c = f33;
                    this.f18682l = f33;
                }
            }
            this.f18685o++;
        }

        public void c() {
            this.f18673c = 0;
            this.f18672b = null;
            this.f18682l = 0;
            this.f18683m = 0;
            this.f18684n = 0;
            this.f18685o = 0;
            this.f18686p = 0;
        }

        public void d(boolean z6, int i7, boolean z7) {
            e eVar;
            char c7;
            float f7;
            float f8;
            int i8 = this.f18685o;
            for (int i9 = 0; i9 < i8 && this.f18684n + i9 < g.this.f18670n2; i9++) {
                e eVar2 = g.this.f18669m2[this.f18684n + i9];
                if (eVar2 != null) {
                    eVar2.U0();
                }
            }
            if (i8 == 0 || this.f18672b == null) {
                return;
            }
            boolean z8 = z7 && i7 == 0;
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < i8; i12++) {
                int i13 = z6 ? (i8 - 1) - i12 : i12;
                if (this.f18684n + i13 >= g.this.f18670n2) {
                    break;
                }
                e eVar3 = g.this.f18669m2[this.f18684n + i13];
                if (eVar3 != null && eVar3.l0() == 0) {
                    if (i10 == -1) {
                        i10 = i12;
                    }
                    i11 = i12;
                }
            }
            e eVar4 = null;
            if (this.f18671a != 0) {
                e eVar5 = this.f18672b;
                eVar5.B1(g.this.P1);
                int i14 = this.f18678h;
                if (i7 > 0) {
                    i14 += g.this.f18658b2;
                }
                if (z6) {
                    eVar5.S.a(this.f18676f, i14);
                    if (z7) {
                        eVar5.Q.a(this.f18674d, this.f18680j);
                    }
                    if (i7 > 0) {
                        this.f18676f.f18533d.Q.a(eVar5.S, 0);
                    }
                } else {
                    eVar5.Q.a(this.f18674d, i14);
                    if (z7) {
                        eVar5.S.a(this.f18676f, this.f18680j);
                    }
                    if (i7 > 0) {
                        this.f18674d.f18533d.S.a(eVar5.Q, 0);
                    }
                }
                for (int i15 = 0; i15 < i8 && this.f18684n + i15 < g.this.f18670n2; i15++) {
                    e eVar6 = g.this.f18669m2[this.f18684n + i15];
                    if (eVar6 != null) {
                        if (i15 == 0) {
                            eVar6.l(eVar6.R, this.f18675e, this.f18679i);
                            int i16 = g.this.Q1;
                            float f9 = g.this.W1;
                            if (this.f18684n == 0 && g.this.S1 != -1) {
                                i16 = g.this.S1;
                                f9 = g.this.Y1;
                            } else if (z7 && g.this.U1 != -1) {
                                i16 = g.this.U1;
                                f9 = g.this.f18657a2;
                            }
                            eVar6.W1(i16);
                            eVar6.V1(f9);
                        }
                        if (i15 == i8 - 1) {
                            eVar6.l(eVar6.T, this.f18677g, this.f18681k);
                        }
                        if (eVar4 != null) {
                            eVar6.R.a(eVar4.T, g.this.f18659c2);
                            if (i15 == i10) {
                                eVar6.R.B(this.f18679i);
                            }
                            eVar4.T.a(eVar6.R, 0);
                            if (i15 == i11 + 1) {
                                eVar4.T.B(this.f18681k);
                            }
                        }
                        if (eVar6 != eVar5) {
                            if (z6) {
                                int i17 = g.this.f18660d2;
                                if (i17 == 0) {
                                    eVar6.S.a(eVar5.S, 0);
                                } else if (i17 == 1) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i17 == 2) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                    eVar6.S.a(eVar5.S, 0);
                                }
                            } else {
                                int i18 = g.this.f18660d2;
                                if (i18 == 0) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i18 == 1) {
                                    eVar6.S.a(eVar5.S, 0);
                                } else if (i18 == 2) {
                                    if (z8) {
                                        eVar6.Q.a(this.f18674d, this.f18678h);
                                        eVar6.S.a(this.f18676f, this.f18680j);
                                    } else {
                                        eVar6.Q.a(eVar5.Q, 0);
                                        eVar6.S.a(eVar5.S, 0);
                                    }
                                }
                                eVar4 = eVar6;
                            }
                        }
                        eVar4 = eVar6;
                    }
                }
                return;
            }
            e eVar7 = this.f18672b;
            eVar7.W1(g.this.Q1);
            int i19 = this.f18679i;
            if (i7 > 0) {
                i19 += g.this.f18659c2;
            }
            eVar7.R.a(this.f18675e, i19);
            if (z7) {
                eVar7.T.a(this.f18677g, this.f18681k);
            }
            if (i7 > 0) {
                this.f18675e.f18533d.T.a(eVar7.R, 0);
            }
            char c8 = 3;
            if (g.this.f18661e2 == 3 && !eVar7.q0()) {
                for (int i20 = 0; i20 < i8; i20++) {
                    int i21 = z6 ? (i8 - 1) - i20 : i20;
                    if (this.f18684n + i21 >= g.this.f18670n2) {
                        break;
                    }
                    eVar = g.this.f18669m2[this.f18684n + i21];
                    if (eVar.q0()) {
                        break;
                    }
                }
            }
            eVar = eVar7;
            int i22 = 0;
            while (i22 < i8) {
                int i23 = z6 ? (i8 - 1) - i22 : i22;
                if (this.f18684n + i23 >= g.this.f18670n2) {
                    return;
                }
                e eVar8 = g.this.f18669m2[this.f18684n + i23];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                    c7 = c8;
                } else {
                    if (i22 == 0) {
                        eVar8.l(eVar8.Q, this.f18674d, this.f18678h);
                    }
                    if (i23 == 0) {
                        int i24 = g.this.P1;
                        float f10 = g.this.V1;
                        if (z6) {
                            f10 = 1.0f - f10;
                        }
                        if (this.f18684n == 0 && g.this.R1 != -1) {
                            i24 = g.this.R1;
                            if (z6) {
                                f8 = g.this.X1;
                                f7 = 1.0f - f8;
                                f10 = f7;
                            } else {
                                f7 = g.this.X1;
                                f10 = f7;
                            }
                        } else if (z7 && g.this.T1 != -1) {
                            i24 = g.this.T1;
                            if (z6) {
                                f8 = g.this.Z1;
                                f7 = 1.0f - f8;
                                f10 = f7;
                            } else {
                                f7 = g.this.Z1;
                                f10 = f7;
                            }
                        }
                        eVar8.B1(i24);
                        eVar8.A1(f10);
                    }
                    if (i22 == i8 - 1) {
                        eVar8.l(eVar8.S, this.f18676f, this.f18680j);
                    }
                    if (eVar4 != null) {
                        eVar8.Q.a(eVar4.S, g.this.f18658b2);
                        if (i22 == i10) {
                            eVar8.Q.B(this.f18678h);
                        }
                        eVar4.S.a(eVar8.Q, 0);
                        if (i22 == i11 + 1) {
                            eVar4.S.B(this.f18680j);
                        }
                    }
                    if (eVar8 != eVar7) {
                        c7 = 3;
                        if (g.this.f18661e2 == 3 && eVar.q0() && eVar8 != eVar && eVar8.q0()) {
                            eVar8.U.a(eVar.U, 0);
                        } else {
                            int i25 = g.this.f18661e2;
                            if (i25 == 0) {
                                eVar8.R.a(eVar7.R, 0);
                            } else if (i25 == 1) {
                                eVar8.T.a(eVar7.T, 0);
                            } else if (z8) {
                                eVar8.R.a(this.f18675e, this.f18679i);
                                eVar8.T.a(this.f18677g, this.f18681k);
                            } else {
                                eVar8.R.a(eVar7.R, 0);
                                eVar8.T.a(eVar7.T, 0);
                            }
                        }
                    } else {
                        c7 = 3;
                    }
                }
                i22++;
                c8 = c7;
                eVar4 = eVar8;
            }
        }

        public int e() {
            return this.f18671a == 1 ? this.f18683m - g.this.f18659c2 : this.f18683m;
        }

        public int f() {
            return this.f18671a == 0 ? this.f18682l - g.this.f18658b2 : this.f18682l;
        }

        public void g(int i7) {
            int i8 = this.f18686p;
            if (i8 == 0) {
                return;
            }
            int i9 = this.f18685o;
            int i10 = i7 / i8;
            for (int i11 = 0; i11 < i9 && this.f18684n + i11 < g.this.f18670n2; i11++) {
                e eVar = g.this.f18669m2[this.f18684n + i11];
                if (this.f18671a == 0) {
                    if (eVar != null && eVar.H() == e.b.MATCH_CONSTRAINT && eVar.f18620w == 0) {
                        g.this.w2(eVar, e.b.FIXED, i10, eVar.j0(), eVar.D());
                    }
                } else if (eVar != null && eVar.j0() == e.b.MATCH_CONSTRAINT && eVar.f18622x == 0) {
                    g.this.w2(eVar, eVar.H(), eVar.m0(), e.b.FIXED, i10);
                }
            }
            h();
        }

        public final void h() {
            this.f18682l = 0;
            this.f18683m = 0;
            this.f18672b = null;
            this.f18673c = 0;
            int i7 = this.f18685o;
            for (int i8 = 0; i8 < i7 && this.f18684n + i8 < g.this.f18670n2; i8++) {
                e eVar = g.this.f18669m2[this.f18684n + i8];
                if (this.f18671a == 0) {
                    int m02 = eVar.m0();
                    int i9 = g.this.f18658b2;
                    if (eVar.l0() == 8) {
                        i9 = 0;
                    }
                    this.f18682l += m02 + i9;
                    int e32 = g.this.e3(eVar, this.f18687q);
                    if (this.f18672b == null || this.f18673c < e32) {
                        this.f18672b = eVar;
                        this.f18673c = e32;
                        this.f18683m = e32;
                    }
                } else {
                    int f32 = g.this.f3(eVar, this.f18687q);
                    int e33 = g.this.e3(eVar, this.f18687q);
                    int i10 = g.this.f18659c2;
                    if (eVar.l0() == 8) {
                        i10 = 0;
                    }
                    this.f18683m += e33 + i10;
                    if (this.f18672b == null || this.f18673c < f32) {
                        this.f18672b = eVar;
                        this.f18673c = f32;
                        this.f18682l = f32;
                    }
                }
            }
        }

        public void i(int i7) {
            this.f18684n = i7;
        }

        public void j(int i7, d dVar, d dVar2, d dVar3, d dVar4, int i8, int i9, int i10, int i11, int i12) {
            this.f18671a = i7;
            this.f18674d = dVar;
            this.f18675e = dVar2;
            this.f18676f = dVar3;
            this.f18677g = dVar4;
            this.f18678h = i8;
            this.f18679i = i9;
            this.f18680j = i10;
            this.f18681k = i11;
            this.f18687q = i12;
        }
    }

    public void A3(int i7) {
        this.f18659c2 = i7;
    }

    public void B3(int i7) {
        this.Q1 = i7;
    }

    public void C3(int i7) {
        this.f18662f2 = i7;
    }

    public final void c3(boolean z6) {
        e eVar;
        float f7;
        int i7;
        if (this.f18668l2 == null || this.f18667k2 == null || this.f18666j2 == null) {
            return;
        }
        for (int i8 = 0; i8 < this.f18670n2; i8++) {
            this.f18669m2[i8].U0();
        }
        int[] iArr = this.f18668l2;
        int i9 = iArr[0];
        int i10 = iArr[1];
        float f8 = this.V1;
        e eVar2 = null;
        int i11 = 0;
        while (i11 < i9) {
            if (z6) {
                i7 = (i9 - i11) - 1;
                f7 = 1.0f - this.V1;
            } else {
                f7 = f8;
                i7 = i11;
            }
            e eVar3 = this.f18667k2[i7];
            if (eVar3 != null && eVar3.l0() != 8) {
                if (i11 == 0) {
                    eVar3.l(eVar3.Q, this.Q, s2());
                    eVar3.B1(this.P1);
                    eVar3.A1(f7);
                }
                if (i11 == i9 - 1) {
                    eVar3.l(eVar3.S, this.S, t2());
                }
                if (i11 > 0 && eVar2 != null) {
                    eVar3.l(eVar3.Q, eVar2.S, this.f18658b2);
                    eVar2.l(eVar2.S, eVar3.Q, 0);
                }
                eVar2 = eVar3;
            }
            i11++;
            f8 = f7;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            e eVar4 = this.f18666j2[i12];
            if (eVar4 != null && eVar4.l0() != 8) {
                if (i12 == 0) {
                    eVar4.l(eVar4.R, this.R, u2());
                    eVar4.W1(this.Q1);
                    eVar4.V1(this.W1);
                }
                if (i12 == i10 - 1) {
                    eVar4.l(eVar4.T, this.T, r2());
                }
                if (i12 > 0 && eVar2 != null) {
                    eVar4.l(eVar4.R, eVar2.T, this.f18659c2);
                    eVar2.l(eVar2.T, eVar4.R, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i13 = 0; i13 < i9; i13++) {
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = (i14 * i9) + i13;
                if (this.f18664h2 == 1) {
                    i15 = (i13 * i10) + i14;
                }
                e[] eVarArr = this.f18669m2;
                if (i15 < eVarArr.length && (eVar = eVarArr[i15]) != null && eVar.l0() != 8) {
                    e eVar5 = this.f18667k2[i13];
                    e eVar6 = this.f18666j2[i14];
                    if (eVar != eVar5) {
                        eVar.l(eVar.Q, eVar5.Q, 0);
                        eVar.l(eVar.S, eVar5.S, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.l(eVar.R, eVar6.R, 0);
                        eVar.l(eVar.T, eVar6.T, 0);
                    }
                }
            }
        }
    }

    public float d3() {
        return this.f18663g2;
    }

    public final int e3(e eVar, int i7) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.j0() == e.b.MATCH_CONSTRAINT) {
            int i8 = eVar.f18622x;
            if (i8 == 0) {
                return 0;
            }
            if (i8 == 2) {
                int i9 = (int) (eVar.E * i7);
                if (i9 != eVar.D()) {
                    eVar.N1(true);
                    w2(eVar, eVar.H(), eVar.m0(), e.b.FIXED, i9);
                }
                return i9;
            } else if (i8 == 1) {
                return eVar.D();
            } else {
                if (i8 == 3) {
                    return (int) ((eVar.m0() * eVar.f18587f0) + 0.5f);
                }
            }
        }
        return eVar.D();
    }

    public final int f3(e eVar, int i7) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.H() == e.b.MATCH_CONSTRAINT) {
            int i8 = eVar.f18620w;
            if (i8 == 0) {
                return 0;
            }
            if (i8 == 2) {
                int i9 = (int) (eVar.B * i7);
                if (i9 != eVar.m0()) {
                    eVar.N1(true);
                    w2(eVar, e.b.FIXED, i9, eVar.j0(), eVar.D());
                }
                return i9;
            } else if (i8 == 1) {
                return eVar.m0();
            } else {
                if (i8 == 3) {
                    return (int) ((eVar.D() * eVar.f18587f0) + 0.5f);
                }
            }
        }
        return eVar.m0();
    }

    @Override // y.e
    public void g(q.e eVar, boolean z6) {
        super.g(eVar, z6);
        boolean z7 = U() != null && ((f) U()).O2();
        int i7 = this.f18662f2;
        if (i7 != 0) {
            if (i7 == 1) {
                int size = this.f18665i2.size();
                int i8 = 0;
                while (i8 < size) {
                    this.f18665i2.get(i8).d(z7, i8, i8 == size + (-1));
                    i8++;
                }
            } else if (i7 == 2) {
                c3(z7);
            } else if (i7 == 3) {
                int size2 = this.f18665i2.size();
                int i9 = 0;
                while (i9 < size2) {
                    this.f18665i2.get(i9).d(z7, i9, i9 == size2 + (-1));
                    i9++;
                }
            }
        } else if (this.f18665i2.size() > 0) {
            this.f18665i2.get(0).d(z7, 0, true);
        }
        z2(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g3(y.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.g.g3(y.e[], int, int, int, int[]):void");
    }

    public final void h3(e[] eVarArr, int i7, int i8, int i9, int[] iArr) {
        int i10;
        int i11;
        int i12;
        d dVar;
        int t22;
        d dVar2;
        int r22;
        int i13;
        if (i7 == 0) {
            return;
        }
        this.f18665i2.clear();
        a aVar = new a(i8, this.Q, this.R, this.S, this.T, i9);
        this.f18665i2.add(aVar);
        if (i8 == 0) {
            i10 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i15 < i7) {
                e eVar = eVarArr[i15];
                int f32 = f3(eVar, i9);
                if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                    i10++;
                }
                int i16 = i10;
                boolean z6 = (i14 == i9 || (this.f18658b2 + i14) + f32 > i9) && aVar.f18672b != null;
                if (!z6 && i15 > 0 && (i13 = this.f18663g2) > 0 && i15 % i13 == 0) {
                    z6 = true;
                }
                if (z6) {
                    aVar = new a(i8, this.Q, this.R, this.S, this.T, i9);
                    aVar.i(i15);
                    this.f18665i2.add(aVar);
                } else if (i15 > 0) {
                    i14 += this.f18658b2 + f32;
                    aVar.b(eVar);
                    i15++;
                    i10 = i16;
                }
                i14 = f32;
                aVar.b(eVar);
                i15++;
                i10 = i16;
            }
        } else {
            i10 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i7) {
                e eVar2 = eVarArr[i18];
                int e32 = e3(eVar2, i9);
                if (eVar2.j0() == e.b.MATCH_CONSTRAINT) {
                    i10++;
                }
                int i19 = i10;
                boolean z7 = (i17 == i9 || (this.f18659c2 + i17) + e32 > i9) && aVar.f18672b != null;
                if (!z7 && i18 > 0 && (i11 = this.f18663g2) > 0 && i18 % i11 == 0) {
                    z7 = true;
                }
                if (z7) {
                    aVar = new a(i8, this.Q, this.R, this.S, this.T, i9);
                    aVar.i(i18);
                    this.f18665i2.add(aVar);
                } else if (i18 > 0) {
                    i17 += this.f18659c2 + e32;
                    aVar.b(eVar2);
                    i18++;
                    i10 = i19;
                }
                i17 = e32;
                aVar.b(eVar2);
                i18++;
                i10 = i19;
            }
        }
        int size = this.f18665i2.size();
        d dVar3 = this.Q;
        d dVar4 = this.R;
        d dVar5 = this.S;
        d dVar6 = this.T;
        int s22 = s2();
        int u22 = u2();
        int t23 = t2();
        int r23 = r2();
        e.b H = H();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z8 = H == bVar || j0() == bVar;
        if (i10 > 0 && z8) {
            for (int i20 = 0; i20 < size; i20++) {
                a aVar2 = this.f18665i2.get(i20);
                if (i8 == 0) {
                    aVar2.g(i9 - aVar2.f());
                } else {
                    aVar2.g(i9 - aVar2.e());
                }
            }
        }
        int i21 = u22;
        int i22 = t23;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = s22;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i27 = r23;
        while (i25 < size) {
            a aVar3 = this.f18665i2.get(i25);
            if (i8 == 0) {
                if (i25 < size - 1) {
                    dVar2 = this.f18665i2.get(i25 + 1).f18672b.R;
                    r22 = 0;
                } else {
                    dVar2 = this.T;
                    r22 = r2();
                }
                d dVar9 = aVar3.f18672b.T;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i28 = i23;
                d dVar12 = dVar7;
                int i29 = i24;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i12 = i25;
                aVar3.j(i8, dVar10, dVar12, dVar13, dVar2, i26, i21, i22, r22, i9);
                int max = Math.max(i29, aVar3.f());
                i23 = i28 + aVar3.e();
                if (i12 > 0) {
                    i23 += this.f18659c2;
                }
                dVar8 = dVar11;
                i24 = max;
                i21 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i30 = r22;
                dVar6 = dVar2;
                i27 = i30;
            } else {
                d dVar15 = dVar8;
                int i31 = i23;
                int i32 = i24;
                i12 = i25;
                if (i12 < size - 1) {
                    dVar = this.f18665i2.get(i12 + 1).f18672b.Q;
                    t22 = 0;
                } else {
                    dVar = this.S;
                    t22 = t2();
                }
                d dVar16 = aVar3.f18672b.S;
                aVar3.j(i8, dVar15, dVar7, dVar, dVar6, i26, i21, t22, i27, i9);
                i24 = i32 + aVar3.f();
                int max2 = Math.max(i31, aVar3.e());
                if (i12 > 0) {
                    i24 += this.f18658b2;
                }
                i23 = max2;
                i26 = 0;
                i22 = t22;
                dVar8 = dVar16;
            }
            i25 = i12 + 1;
            dVar5 = dVar;
        }
        iArr[0] = i24;
        iArr[1] = i23;
    }

    public final void i3(e[] eVarArr, int i7, int i8, int i9, int[] iArr) {
        int i10;
        int i11;
        int i12;
        d dVar;
        int t22;
        d dVar2;
        int r22;
        int i13;
        if (i7 == 0) {
            return;
        }
        this.f18665i2.clear();
        a aVar = new a(i8, this.Q, this.R, this.S, this.T, i9);
        this.f18665i2.add(aVar);
        if (i8 == 0) {
            int i14 = 0;
            i10 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i16 < i7) {
                int i17 = i14 + 1;
                e eVar = eVarArr[i16];
                int f32 = f3(eVar, i9);
                if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                    i10++;
                }
                int i18 = i10;
                boolean z6 = (i15 == i9 || (this.f18658b2 + i15) + f32 > i9) && aVar.f18672b != null;
                if (!z6 && i16 > 0 && (i13 = this.f18663g2) > 0 && i17 > i13) {
                    z6 = true;
                }
                if (z6) {
                    aVar = new a(i8, this.Q, this.R, this.S, this.T, i9);
                    aVar.i(i16);
                    this.f18665i2.add(aVar);
                    i14 = i17;
                    i15 = f32;
                } else {
                    i15 = i16 > 0 ? i15 + this.f18658b2 + f32 : f32;
                    i14 = 0;
                }
                aVar.b(eVar);
                i16++;
                i10 = i18;
            }
        } else {
            int i19 = 0;
            i10 = 0;
            int i20 = 0;
            while (i20 < i7) {
                e eVar2 = eVarArr[i20];
                int e32 = e3(eVar2, i9);
                if (eVar2.j0() == e.b.MATCH_CONSTRAINT) {
                    i10++;
                }
                int i21 = i10;
                boolean z7 = (i19 == i9 || (this.f18659c2 + i19) + e32 > i9) && aVar.f18672b != null;
                if (!z7 && i20 > 0 && (i11 = this.f18663g2) > 0 && i11 < 0) {
                    z7 = true;
                }
                if (z7) {
                    aVar = new a(i8, this.Q, this.R, this.S, this.T, i9);
                    aVar.i(i20);
                    this.f18665i2.add(aVar);
                } else if (i20 > 0) {
                    i19 += this.f18659c2 + e32;
                    aVar.b(eVar2);
                    i20++;
                    i10 = i21;
                }
                i19 = e32;
                aVar.b(eVar2);
                i20++;
                i10 = i21;
            }
        }
        int size = this.f18665i2.size();
        d dVar3 = this.Q;
        d dVar4 = this.R;
        d dVar5 = this.S;
        d dVar6 = this.T;
        int s22 = s2();
        int u22 = u2();
        int t23 = t2();
        int r23 = r2();
        e.b H = H();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z8 = H == bVar || j0() == bVar;
        if (i10 > 0 && z8) {
            for (int i22 = 0; i22 < size; i22++) {
                a aVar2 = this.f18665i2.get(i22);
                if (i8 == 0) {
                    aVar2.g(i9 - aVar2.f());
                } else {
                    aVar2.g(i9 - aVar2.e());
                }
            }
        }
        int i23 = u22;
        int i24 = t23;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = s22;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i29 = r23;
        while (i27 < size) {
            a aVar3 = this.f18665i2.get(i27);
            if (i8 == 0) {
                if (i27 < size - 1) {
                    dVar2 = this.f18665i2.get(i27 + 1).f18672b.R;
                    r22 = 0;
                } else {
                    dVar2 = this.T;
                    r22 = r2();
                }
                d dVar9 = aVar3.f18672b.T;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i30 = i25;
                d dVar12 = dVar7;
                int i31 = i26;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i12 = i27;
                aVar3.j(i8, dVar10, dVar12, dVar13, dVar2, i28, i23, i24, r22, i9);
                int max = Math.max(i31, aVar3.f());
                i25 = i30 + aVar3.e();
                if (i12 > 0) {
                    i25 += this.f18659c2;
                }
                dVar8 = dVar11;
                i26 = max;
                i23 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i32 = r22;
                dVar6 = dVar2;
                i29 = i32;
            } else {
                d dVar15 = dVar8;
                int i33 = i25;
                int i34 = i26;
                i12 = i27;
                if (i12 < size - 1) {
                    dVar = this.f18665i2.get(i12 + 1).f18672b.Q;
                    t22 = 0;
                } else {
                    dVar = this.S;
                    t22 = t2();
                }
                d dVar16 = aVar3.f18672b.S;
                aVar3.j(i8, dVar15, dVar7, dVar, dVar6, i28, i23, t22, i29, i9);
                i26 = i34 + aVar3.f();
                int max2 = Math.max(i33, aVar3.e());
                if (i12 > 0) {
                    i26 += this.f18658b2;
                }
                i25 = max2;
                i28 = 0;
                i24 = t22;
                dVar8 = dVar16;
            }
            i27 = i12 + 1;
            dVar5 = dVar;
        }
        iArr[0] = i26;
        iArr[1] = i25;
    }

    public final void j3(e[] eVarArr, int i7, int i8, int i9, int[] iArr) {
        a aVar;
        if (i7 == 0) {
            return;
        }
        if (this.f18665i2.size() == 0) {
            aVar = new a(i8, this.Q, this.R, this.S, this.T, i9);
            this.f18665i2.add(aVar);
        } else {
            a aVar2 = this.f18665i2.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i8, this.Q, this.R, this.S, this.T, s2(), u2(), t2(), r2(), i9);
        }
        for (int i10 = 0; i10 < i7; i10++) {
            aVar.b(eVarArr[i10]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void k3(float f7) {
        this.X1 = f7;
    }

    public void l3(int i7) {
        this.R1 = i7;
    }

    public void m3(float f7) {
        this.Y1 = f7;
    }

    @Override // y.j, y.e
    public void n(e eVar, HashMap<e, e> hashMap) {
        super.n(eVar, hashMap);
        g gVar = (g) eVar;
        this.P1 = gVar.P1;
        this.Q1 = gVar.Q1;
        this.R1 = gVar.R1;
        this.S1 = gVar.S1;
        this.T1 = gVar.T1;
        this.U1 = gVar.U1;
        this.V1 = gVar.V1;
        this.W1 = gVar.W1;
        this.X1 = gVar.X1;
        this.Y1 = gVar.Y1;
        this.Z1 = gVar.Z1;
        this.f18657a2 = gVar.f18657a2;
        this.f18658b2 = gVar.f18658b2;
        this.f18659c2 = gVar.f18659c2;
        this.f18660d2 = gVar.f18660d2;
        this.f18661e2 = gVar.f18661e2;
        this.f18662f2 = gVar.f18662f2;
        this.f18663g2 = gVar.f18663g2;
        this.f18664h2 = gVar.f18664h2;
    }

    public void n3(int i7) {
        this.S1 = i7;
    }

    public void o3(int i7) {
        this.f18660d2 = i7;
    }

    public void p3(float f7) {
        this.V1 = f7;
    }

    public void q3(int i7) {
        this.f18658b2 = i7;
    }

    public void r3(int i7) {
        this.P1 = i7;
    }

    public void s3(float f7) {
        this.Z1 = f7;
    }

    public void t3(int i7) {
        this.T1 = i7;
    }

    public void u3(float f7) {
        this.f18657a2 = f7;
    }

    @Override // y.n
    public void v2(int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int[] iArr;
        boolean z6;
        if (this.B1 > 0 && !x2()) {
            A2(0, 0);
            z2(false);
            return;
        }
        int s22 = s2();
        int t22 = t2();
        int u22 = u2();
        int r22 = r2();
        int[] iArr2 = new int[2];
        int i13 = (i8 - s22) - t22;
        int i14 = this.f18664h2;
        if (i14 == 1) {
            i13 = (i10 - u22) - r22;
        }
        int i15 = i13;
        if (i14 == 0) {
            if (this.P1 == -1) {
                this.P1 = 0;
            }
            if (this.Q1 == -1) {
                this.Q1 = 0;
            }
        } else {
            if (this.P1 == -1) {
                this.P1 = 0;
            }
            if (this.Q1 == -1) {
                this.Q1 = 0;
            }
        }
        e[] eVarArr = this.A1;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            i11 = this.B1;
            if (i16 >= i11) {
                break;
            }
            if (this.A1[i16].l0() == 8) {
                i17++;
            }
            i16++;
        }
        if (i17 > 0) {
            eVarArr = new e[i11 - i17];
            int i18 = 0;
            for (int i19 = 0; i19 < this.B1; i19++) {
                e eVar = this.A1[i19];
                if (eVar.l0() != 8) {
                    eVarArr[i18] = eVar;
                    i18++;
                }
            }
            i12 = i18;
        } else {
            i12 = i11;
        }
        this.f18669m2 = eVarArr;
        this.f18670n2 = i12;
        int i20 = this.f18662f2;
        if (i20 == 0) {
            iArr = iArr2;
            z6 = true;
            j3(eVarArr, i12, this.f18664h2, i15, iArr2);
        } else if (i20 == 1) {
            z6 = true;
            iArr = iArr2;
            h3(eVarArr, i12, this.f18664h2, i15, iArr2);
        } else if (i20 == 2) {
            z6 = true;
            iArr = iArr2;
            g3(eVarArr, i12, this.f18664h2, i15, iArr2);
        } else if (i20 != 3) {
            z6 = true;
            iArr = iArr2;
        } else {
            z6 = true;
            iArr = iArr2;
            i3(eVarArr, i12, this.f18664h2, i15, iArr2);
        }
        int i21 = iArr[0] + s22 + t22;
        int i22 = iArr[z6 ? 1 : 0] + u22 + r22;
        if (i7 == 1073741824) {
            i21 = i8;
        } else if (i7 == Integer.MIN_VALUE) {
            i21 = Math.min(i21, i8);
        } else if (i7 != 0) {
            i21 = 0;
        }
        if (i9 == 1073741824) {
            i22 = i10;
        } else if (i9 == Integer.MIN_VALUE) {
            i22 = Math.min(i22, i10);
        } else if (i9 != 0) {
            i22 = 0;
        }
        A2(i21, i22);
        c2(i21);
        y1(i22);
        if (this.B1 <= 0) {
            z6 = false;
        }
        z2(z6);
    }

    public void v3(int i7) {
        this.U1 = i7;
    }

    public void w3(int i7) {
        this.f18663g2 = i7;
    }

    public void x3(int i7) {
        this.f18664h2 = i7;
    }

    public void y3(int i7) {
        this.f18661e2 = i7;
    }

    public void z3(float f7) {
        this.W1 = f7;
    }
}
