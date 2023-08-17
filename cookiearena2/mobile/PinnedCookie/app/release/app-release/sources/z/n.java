package z;

import y.d;
import y.e;
import z.f;
import z.p;
/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f18969k;

    /* renamed from: l  reason: collision with root package name */
    public g f18970l;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18971a;

        static {
            int[] iArr = new int[p.b.values().length];
            f18971a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18971a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18971a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(y.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f18969k = fVar;
        this.f18970l = null;
        this.f18995h.f18930e = f.a.TOP;
        this.f18996i.f18930e = f.a.BOTTOM;
        fVar.f18930e = f.a.BASELINE;
        this.f18993f = 1;
    }

    @Override // z.p, z.d
    public void a(d dVar) {
        float f7;
        float A;
        float f8;
        int i7;
        int i8 = a.f18971a[this.f18997j.ordinal()];
        if (i8 == 1) {
            s(dVar);
        } else if (i8 == 2) {
            r(dVar);
        } else if (i8 == 3) {
            y.e eVar = this.f18989b;
            q(dVar, eVar.R, eVar.T, 1);
            return;
        }
        g gVar = this.f18992e;
        if (gVar.f18928c && !gVar.f18935j && this.f18991d == e.b.MATCH_CONSTRAINT) {
            y.e eVar2 = this.f18989b;
            int i9 = eVar2.f18622x;
            if (i9 == 2) {
                y.e U = eVar2.U();
                if (U != null) {
                    if (U.f18586f.f18992e.f18935j) {
                        this.f18992e.e((int) ((r7.f18932g * this.f18989b.E) + 0.5f));
                    }
                }
            } else if (i9 == 3 && eVar2.f18584e.f18992e.f18935j) {
                int B = eVar2.B();
                if (B == -1) {
                    y.e eVar3 = this.f18989b;
                    f7 = eVar3.f18584e.f18992e.f18932g;
                    A = eVar3.A();
                } else if (B == 0) {
                    f8 = r7.f18584e.f18992e.f18932g * this.f18989b.A();
                    i7 = (int) (f8 + 0.5f);
                    this.f18992e.e(i7);
                } else if (B != 1) {
                    i7 = 0;
                    this.f18992e.e(i7);
                } else {
                    y.e eVar4 = this.f18989b;
                    f7 = eVar4.f18584e.f18992e.f18932g;
                    A = eVar4.A();
                }
                f8 = f7 / A;
                i7 = (int) (f8 + 0.5f);
                this.f18992e.e(i7);
            }
        }
        f fVar = this.f18995h;
        if (fVar.f18928c) {
            f fVar2 = this.f18996i;
            if (fVar2.f18928c) {
                if (fVar.f18935j && fVar2.f18935j && this.f18992e.f18935j) {
                    return;
                }
                if (!this.f18992e.f18935j && this.f18991d == e.b.MATCH_CONSTRAINT) {
                    y.e eVar5 = this.f18989b;
                    if (eVar5.f18620w == 0 && !eVar5.D0()) {
                        f fVar3 = this.f18995h.f18937l.get(0);
                        f fVar4 = this.f18996i.f18937l.get(0);
                        int i10 = fVar3.f18932g;
                        f fVar5 = this.f18995h;
                        int i11 = i10 + fVar5.f18931f;
                        int i12 = fVar4.f18932g + this.f18996i.f18931f;
                        fVar5.e(i11);
                        this.f18996i.e(i12);
                        this.f18992e.e(i12 - i11);
                        return;
                    }
                }
                if (!this.f18992e.f18935j && this.f18991d == e.b.MATCH_CONSTRAINT && this.f18988a == 1 && this.f18995h.f18937l.size() > 0 && this.f18996i.f18937l.size() > 0) {
                    f fVar6 = this.f18995h.f18937l.get(0);
                    int i13 = (this.f18996i.f18937l.get(0).f18932g + this.f18996i.f18931f) - (fVar6.f18932g + this.f18995h.f18931f);
                    g gVar2 = this.f18992e;
                    int i14 = gVar2.f18947m;
                    if (i13 < i14) {
                        gVar2.e(i13);
                    } else {
                        gVar2.e(i14);
                    }
                }
                if (this.f18992e.f18935j && this.f18995h.f18937l.size() > 0 && this.f18996i.f18937l.size() > 0) {
                    f fVar7 = this.f18995h.f18937l.get(0);
                    f fVar8 = this.f18996i.f18937l.get(0);
                    int i15 = fVar7.f18932g + this.f18995h.f18931f;
                    int i16 = fVar8.f18932g + this.f18996i.f18931f;
                    float g02 = this.f18989b.g0();
                    if (fVar7 == fVar8) {
                        i15 = fVar7.f18932g;
                        i16 = fVar8.f18932g;
                        g02 = 0.5f;
                    }
                    this.f18995h.e((int) (i15 + 0.5f + (((i16 - i15) - this.f18992e.f18932g) * g02)));
                    this.f18996i.e(this.f18995h.f18932g + this.f18992e.f18932g);
                }
            }
        }
    }

    @Override // z.p
    public void d() {
        y.e U;
        y.e U2;
        y.e eVar = this.f18989b;
        if (eVar.f18576a) {
            this.f18992e.e(eVar.D());
        }
        if (!this.f18992e.f18935j) {
            this.f18991d = this.f18989b.j0();
            if (this.f18989b.q0()) {
                this.f18970l = new z.a(this);
            }
            e.b bVar = this.f18991d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (U2 = this.f18989b.U()) != null && U2.j0() == e.b.FIXED) {
                    int D = (U2.D() - this.f18989b.R.g()) - this.f18989b.T.g();
                    b(this.f18995h, U2.f18586f.f18995h, this.f18989b.R.g());
                    b(this.f18996i, U2.f18586f.f18996i, -this.f18989b.T.g());
                    this.f18992e.e(D);
                    return;
                } else if (this.f18991d == e.b.FIXED) {
                    this.f18992e.e(this.f18989b.D());
                }
            }
        } else if (this.f18991d == e.b.MATCH_PARENT && (U = this.f18989b.U()) != null && U.j0() == e.b.FIXED) {
            b(this.f18995h, U.f18586f.f18995h, this.f18989b.R.g());
            b(this.f18996i, U.f18586f.f18996i, -this.f18989b.T.g());
            return;
        }
        g gVar = this.f18992e;
        boolean z6 = gVar.f18935j;
        if (z6) {
            y.e eVar2 = this.f18989b;
            if (eVar2.f18576a) {
                y.d[] dVarArr = eVar2.Y;
                y.d dVar = dVarArr[2];
                y.d dVar2 = dVar.f18535f;
                if (dVar2 != null && dVarArr[3].f18535f != null) {
                    if (eVar2.D0()) {
                        this.f18995h.f18931f = this.f18989b.Y[2].g();
                        this.f18996i.f18931f = -this.f18989b.Y[3].g();
                    } else {
                        f h7 = h(this.f18989b.Y[2]);
                        if (h7 != null) {
                            b(this.f18995h, h7, this.f18989b.Y[2].g());
                        }
                        f h8 = h(this.f18989b.Y[3]);
                        if (h8 != null) {
                            b(this.f18996i, h8, -this.f18989b.Y[3].g());
                        }
                        this.f18995h.f18927b = true;
                        this.f18996i.f18927b = true;
                    }
                    if (this.f18989b.q0()) {
                        b(this.f18969k, this.f18995h, this.f18989b.t());
                        return;
                    }
                    return;
                } else if (dVar2 != null) {
                    f h9 = h(dVar);
                    if (h9 != null) {
                        b(this.f18995h, h9, this.f18989b.Y[2].g());
                        b(this.f18996i, this.f18995h, this.f18992e.f18932g);
                        if (this.f18989b.q0()) {
                            b(this.f18969k, this.f18995h, this.f18989b.t());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    y.d dVar3 = dVarArr[3];
                    if (dVar3.f18535f != null) {
                        f h10 = h(dVar3);
                        if (h10 != null) {
                            b(this.f18996i, h10, -this.f18989b.Y[3].g());
                            b(this.f18995h, this.f18996i, -this.f18992e.f18932g);
                        }
                        if (this.f18989b.q0()) {
                            b(this.f18969k, this.f18995h, this.f18989b.t());
                            return;
                        }
                        return;
                    }
                    y.d dVar4 = dVarArr[4];
                    if (dVar4.f18535f != null) {
                        f h11 = h(dVar4);
                        if (h11 != null) {
                            b(this.f18969k, h11, 0);
                            b(this.f18995h, this.f18969k, -this.f18989b.t());
                            b(this.f18996i, this.f18995h, this.f18992e.f18932g);
                            return;
                        }
                        return;
                    } else if ((eVar2 instanceof y.i) || eVar2.U() == null || this.f18989b.r(d.b.CENTER).f18535f != null) {
                        return;
                    } else {
                        b(this.f18995h, this.f18989b.U().f18586f.f18995h, this.f18989b.p0());
                        b(this.f18996i, this.f18995h, this.f18992e.f18932g);
                        if (this.f18989b.q0()) {
                            b(this.f18969k, this.f18995h, this.f18989b.t());
                            return;
                        }
                        return;
                    }
                }
            }
        }
        if (z6 || this.f18991d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            y.e eVar3 = this.f18989b;
            int i7 = eVar3.f18622x;
            if (i7 == 2) {
                y.e U3 = eVar3.U();
                if (U3 != null) {
                    g gVar2 = U3.f18586f.f18992e;
                    this.f18992e.f18937l.add(gVar2);
                    gVar2.f18936k.add(this.f18992e);
                    g gVar3 = this.f18992e;
                    gVar3.f18927b = true;
                    gVar3.f18936k.add(this.f18995h);
                    this.f18992e.f18936k.add(this.f18996i);
                }
            } else if (i7 == 3 && !eVar3.D0()) {
                y.e eVar4 = this.f18989b;
                if (eVar4.f18620w != 3) {
                    g gVar4 = eVar4.f18584e.f18992e;
                    this.f18992e.f18937l.add(gVar4);
                    gVar4.f18936k.add(this.f18992e);
                    g gVar5 = this.f18992e;
                    gVar5.f18927b = true;
                    gVar5.f18936k.add(this.f18995h);
                    this.f18992e.f18936k.add(this.f18996i);
                }
            }
        }
        y.e eVar5 = this.f18989b;
        y.d[] dVarArr2 = eVar5.Y;
        y.d dVar5 = dVarArr2[2];
        y.d dVar6 = dVar5.f18535f;
        if (dVar6 != null && dVarArr2[3].f18535f != null) {
            if (eVar5.D0()) {
                this.f18995h.f18931f = this.f18989b.Y[2].g();
                this.f18996i.f18931f = -this.f18989b.Y[3].g();
            } else {
                f h12 = h(this.f18989b.Y[2]);
                f h13 = h(this.f18989b.Y[3]);
                if (h12 != null) {
                    h12.b(this);
                }
                if (h13 != null) {
                    h13.b(this);
                }
                this.f18997j = p.b.CENTER;
            }
            if (this.f18989b.q0()) {
                c(this.f18969k, this.f18995h, 1, this.f18970l);
            }
        } else if (dVar6 != null) {
            f h14 = h(dVar5);
            if (h14 != null) {
                b(this.f18995h, h14, this.f18989b.Y[2].g());
                c(this.f18996i, this.f18995h, 1, this.f18992e);
                if (this.f18989b.q0()) {
                    c(this.f18969k, this.f18995h, 1, this.f18970l);
                }
                e.b bVar2 = this.f18991d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f18989b.A() > 0.0f) {
                    l lVar = this.f18989b.f18584e;
                    if (lVar.f18991d == bVar3) {
                        lVar.f18992e.f18936k.add(this.f18992e);
                        this.f18992e.f18937l.add(this.f18989b.f18584e.f18992e);
                        this.f18992e.f18926a = this;
                    }
                }
            }
        } else {
            y.d dVar7 = dVarArr2[3];
            if (dVar7.f18535f != null) {
                f h15 = h(dVar7);
                if (h15 != null) {
                    b(this.f18996i, h15, -this.f18989b.Y[3].g());
                    c(this.f18995h, this.f18996i, -1, this.f18992e);
                    if (this.f18989b.q0()) {
                        c(this.f18969k, this.f18995h, 1, this.f18970l);
                    }
                }
            } else {
                y.d dVar8 = dVarArr2[4];
                if (dVar8.f18535f != null) {
                    f h16 = h(dVar8);
                    if (h16 != null) {
                        b(this.f18969k, h16, 0);
                        c(this.f18995h, this.f18969k, -1, this.f18970l);
                        c(this.f18996i, this.f18995h, 1, this.f18992e);
                    }
                } else if (!(eVar5 instanceof y.i) && eVar5.U() != null) {
                    b(this.f18995h, this.f18989b.U().f18586f.f18995h, this.f18989b.p0());
                    c(this.f18996i, this.f18995h, 1, this.f18992e);
                    if (this.f18989b.q0()) {
                        c(this.f18969k, this.f18995h, 1, this.f18970l);
                    }
                    e.b bVar4 = this.f18991d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f18989b.A() > 0.0f) {
                        l lVar2 = this.f18989b.f18584e;
                        if (lVar2.f18991d == bVar5) {
                            lVar2.f18992e.f18936k.add(this.f18992e);
                            this.f18992e.f18937l.add(this.f18989b.f18584e.f18992e);
                            this.f18992e.f18926a = this;
                        }
                    }
                }
            }
        }
        if (this.f18992e.f18937l.size() == 0) {
            this.f18992e.f18928c = true;
        }
    }

    @Override // z.p
    public void e() {
        f fVar = this.f18995h;
        if (fVar.f18935j) {
            this.f18989b.g2(fVar.f18932g);
        }
    }

    @Override // z.p
    public void f() {
        this.f18990c = null;
        this.f18995h.c();
        this.f18996i.c();
        this.f18969k.c();
        this.f18992e.c();
        this.f18994g = false;
    }

    @Override // z.p
    public void n() {
        this.f18994g = false;
        this.f18995h.c();
        this.f18995h.f18935j = false;
        this.f18996i.c();
        this.f18996i.f18935j = false;
        this.f18969k.c();
        this.f18969k.f18935j = false;
        this.f18992e.f18935j = false;
    }

    @Override // z.p
    public boolean p() {
        return this.f18991d != e.b.MATCH_CONSTRAINT || this.f18989b.f18622x == 0;
    }

    public String toString() {
        return "VerticalRun " + this.f18989b.y();
    }
}
