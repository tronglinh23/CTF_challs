package y;

import java.util.HashMap;
import y.d;
import y.e;
/* loaded from: classes.dex */
public class h extends e {
    public static final int I1 = 0;
    public static final int J1 = 1;
    public static final int K1 = 0;
    public static final int L1 = 1;
    public static final int M1 = 2;
    public static final int N1 = -1;
    public float A1 = -1.0f;
    public int B1 = -1;
    public int C1 = -1;
    public boolean D1 = true;
    public d E1 = this.R;
    public int F1 = 0;
    public int G1 = 0;
    public boolean H1;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18689a;

        static {
            int[] iArr = new int[d.b.values().length];
            f18689a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18689a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18689a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18689a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18689a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18689a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18689a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18689a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18689a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.Z.clear();
        this.Z.add(this.E1);
        int length = this.Y.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.Y[i7] = this.E1;
        }
    }

    public void A2(int i7) {
        this.G1 = i7;
    }

    public void B2(int i7) {
        if (this.F1 == i7) {
            return;
        }
        this.F1 = i7;
        this.Z.clear();
        if (this.F1 == 1) {
            this.E1 = this.Q;
        } else {
            this.E1 = this.R;
        }
        this.Z.add(this.E1);
        int length = this.Y.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.Y[i8] = this.E1;
        }
    }

    @Override // y.e
    public boolean G0() {
        return this.H1;
    }

    @Override // y.e
    public boolean H0() {
        return this.H1;
    }

    @Override // y.e
    public String f0() {
        return "Guideline";
    }

    @Override // y.e
    public void g(q.e eVar, boolean z6) {
        f fVar = (f) U();
        if (fVar == null) {
            return;
        }
        d r6 = fVar.r(d.b.LEFT);
        d r7 = fVar.r(d.b.RIGHT);
        e eVar2 = this.f18581c0;
        boolean z7 = eVar2 != null && eVar2.f18579b0[0] == e.b.WRAP_CONTENT;
        if (this.F1 == 0) {
            r6 = fVar.r(d.b.TOP);
            r7 = fVar.r(d.b.BOTTOM);
            e eVar3 = this.f18581c0;
            z7 = eVar3 != null && eVar3.f18579b0[1] == e.b.WRAP_CONTENT;
        }
        if (this.H1 && this.E1.o()) {
            q.i u6 = eVar.u(this.E1);
            eVar.f(u6, this.E1.f());
            if (this.B1 != -1) {
                if (z7) {
                    eVar.i(eVar.u(r7), u6, 0, 5);
                }
            } else if (this.C1 != -1 && z7) {
                q.i u7 = eVar.u(r7);
                eVar.i(u6, eVar.u(r6), 0, 5);
                eVar.i(u7, u6, 0, 5);
            }
            this.H1 = false;
        } else if (this.B1 != -1) {
            q.i u8 = eVar.u(this.E1);
            eVar.e(u8, eVar.u(r6), this.B1, 8);
            if (z7) {
                eVar.i(eVar.u(r7), u8, 0, 5);
            }
        } else if (this.C1 == -1) {
            if (this.A1 != -1.0f) {
                eVar.d(q.e.w(eVar, eVar.u(this.E1), eVar.u(r7), this.A1));
            }
        } else {
            q.i u9 = eVar.u(this.E1);
            q.i u10 = eVar.u(r7);
            eVar.e(u9, u10, -this.C1, 8);
            if (z7) {
                eVar.i(u9, eVar.u(r6), 0, 5);
                eVar.i(u10, u9, 0, 5);
            }
        }
    }

    @Override // y.e
    public boolean h() {
        return true;
    }

    @Override // y.e
    public void j2(q.e eVar, boolean z6) {
        if (U() == null) {
            return;
        }
        int O = eVar.O(this.E1);
        if (this.F1 == 1) {
            f2(O);
            g2(0);
            y1(U().D());
            c2(0);
            return;
        }
        f2(0);
        g2(O);
        c2(U().m0());
        y1(0);
    }

    public void k2() {
        if (this.B1 != -1) {
            t2();
        } else if (this.A1 != -1.0f) {
            s2();
        } else if (this.C1 != -1) {
            r2();
        }
    }

    public d l2() {
        return this.E1;
    }

    public int m2() {
        return this.F1;
    }

    @Override // y.e
    public void n(e eVar, HashMap<e, e> hashMap) {
        super.n(eVar, hashMap);
        h hVar = (h) eVar;
        this.A1 = hVar.A1;
        this.B1 = hVar.B1;
        this.C1 = hVar.C1;
        this.D1 = hVar.D1;
        B2(hVar.F1);
    }

    public int n2() {
        return this.B1;
    }

    public int o2() {
        if (this.A1 != -1.0f) {
            return 0;
        }
        if (this.B1 != -1) {
            return 1;
        }
        return this.C1 != -1 ? 2 : -1;
    }

    public int p2() {
        return this.C1;
    }

    public float q2() {
        return this.A1;
    }

    @Override // y.e
    public d r(d.b bVar) {
        int i7 = a.f18689a[bVar.ordinal()];
        if (i7 == 1 || i7 == 2) {
            if (this.F1 == 1) {
                return this.E1;
            }
            return null;
        } else if ((i7 == 3 || i7 == 4) && this.F1 == 0) {
            return this.E1;
        } else {
            return null;
        }
    }

    public void r2() {
        int o02 = o0();
        if (this.F1 == 0) {
            o02 = p0();
        }
        w2(o02);
    }

    public void s2() {
        int m02 = U().m0() - o0();
        if (this.F1 == 0) {
            m02 = U().D() - p0();
        }
        x2(m02);
    }

    public void t2() {
        float o02 = o0() / U().m0();
        if (this.F1 == 0) {
            o02 = p0() / U().D();
        }
        y2(o02);
    }

    public boolean u2() {
        return this.A1 != -1.0f && this.B1 == -1 && this.C1 == -1;
    }

    public void v2(int i7) {
        this.E1.A(i7);
        this.H1 = true;
    }

    public void w2(int i7) {
        if (i7 > -1) {
            this.A1 = -1.0f;
            this.B1 = i7;
            this.C1 = -1;
        }
    }

    public void x2(int i7) {
        if (i7 > -1) {
            this.A1 = -1.0f;
            this.B1 = -1;
            this.C1 = i7;
        }
    }

    public void y2(float f7) {
        if (f7 > -1.0f) {
            this.A1 = f7;
            this.B1 = -1;
            this.C1 = -1;
        }
    }

    public void z2(int i7) {
        y2(i7 / 100.0f);
    }
}
