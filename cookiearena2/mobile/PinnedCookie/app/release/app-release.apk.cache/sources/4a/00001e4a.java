package z;

import y.d;
import y.e;
import z.f;
import z.p;

/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k  reason: collision with root package name */
    public static int[] f18956k = new int[2];

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18957a;

        static {
            int[] iArr = new int[p.b.values().length];
            f18957a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18957a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18957a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(y.e eVar) {
        super(eVar);
        this.f18995h.f18930e = f.a.LEFT;
        this.f18996i.f18930e = f.a.RIGHT;
        this.f18993f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02b9, code lost:
        if (r14 != 1) goto L135;
     */
    @Override // z.p, z.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(z.d r17) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.l.a(z.d):void");
    }

    @Override // z.p
    public void d() {
        y.e U;
        y.e U2;
        y.e eVar = this.f18989b;
        if (eVar.f18576a) {
            this.f18992e.e(eVar.m0());
        }
        if (this.f18992e.f18935j) {
            e.b bVar = this.f18991d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (U = this.f18989b.U()) != null && (U.H() == e.b.FIXED || U.H() == bVar2)) {
                b(this.f18995h, U.f18584e.f18995h, this.f18989b.Q.g());
                b(this.f18996i, U.f18584e.f18996i, -this.f18989b.S.g());
                return;
            }
        } else {
            e.b H = this.f18989b.H();
            this.f18991d = H;
            if (H != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (H == bVar3 && (U2 = this.f18989b.U()) != null && (U2.H() == e.b.FIXED || U2.H() == bVar3)) {
                    int m02 = (U2.m0() - this.f18989b.Q.g()) - this.f18989b.S.g();
                    b(this.f18995h, U2.f18584e.f18995h, this.f18989b.Q.g());
                    b(this.f18996i, U2.f18584e.f18996i, -this.f18989b.S.g());
                    this.f18992e.e(m02);
                    return;
                } else if (this.f18991d == e.b.FIXED) {
                    this.f18992e.e(this.f18989b.m0());
                }
            }
        }
        g gVar = this.f18992e;
        if (gVar.f18935j) {
            y.e eVar2 = this.f18989b;
            if (eVar2.f18576a) {
                y.d[] dVarArr = eVar2.Y;
                y.d dVar = dVarArr[0];
                y.d dVar2 = dVar.f18535f;
                if (dVar2 != null && dVarArr[1].f18535f != null) {
                    if (eVar2.B0()) {
                        this.f18995h.f18931f = this.f18989b.Y[0].g();
                        this.f18996i.f18931f = -this.f18989b.Y[1].g();
                        return;
                    }
                    f h7 = h(this.f18989b.Y[0]);
                    if (h7 != null) {
                        b(this.f18995h, h7, this.f18989b.Y[0].g());
                    }
                    f h8 = h(this.f18989b.Y[1]);
                    if (h8 != null) {
                        b(this.f18996i, h8, -this.f18989b.Y[1].g());
                    }
                    this.f18995h.f18927b = true;
                    this.f18996i.f18927b = true;
                    return;
                } else if (dVar2 != null) {
                    f h9 = h(dVar);
                    if (h9 != null) {
                        b(this.f18995h, h9, this.f18989b.Y[0].g());
                        b(this.f18996i, this.f18995h, this.f18992e.f18932g);
                        return;
                    }
                    return;
                } else {
                    y.d dVar3 = dVarArr[1];
                    if (dVar3.f18535f != null) {
                        f h10 = h(dVar3);
                        if (h10 != null) {
                            b(this.f18996i, h10, -this.f18989b.Y[1].g());
                            b(this.f18995h, this.f18996i, -this.f18992e.f18932g);
                            return;
                        }
                        return;
                    } else if ((eVar2 instanceof y.i) || eVar2.U() == null || this.f18989b.r(d.b.CENTER).f18535f != null) {
                        return;
                    } else {
                        b(this.f18995h, this.f18989b.U().f18584e.f18995h, this.f18989b.o0());
                        b(this.f18996i, this.f18995h, this.f18992e.f18932g);
                        return;
                    }
                }
            }
        }
        if (this.f18991d == e.b.MATCH_CONSTRAINT) {
            y.e eVar3 = this.f18989b;
            int i7 = eVar3.f18620w;
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
            } else if (i7 == 3) {
                if (eVar3.f18622x == 3) {
                    this.f18995h.f18926a = this;
                    this.f18996i.f18926a = this;
                    n nVar = eVar3.f18586f;
                    nVar.f18995h.f18926a = this;
                    nVar.f18996i.f18926a = this;
                    gVar.f18926a = this;
                    if (eVar3.D0()) {
                        this.f18992e.f18937l.add(this.f18989b.f18586f.f18992e);
                        this.f18989b.f18586f.f18992e.f18936k.add(this.f18992e);
                        n nVar2 = this.f18989b.f18586f;
                        nVar2.f18992e.f18926a = this;
                        this.f18992e.f18937l.add(nVar2.f18995h);
                        this.f18992e.f18937l.add(this.f18989b.f18586f.f18996i);
                        this.f18989b.f18586f.f18995h.f18936k.add(this.f18992e);
                        this.f18989b.f18586f.f18996i.f18936k.add(this.f18992e);
                    } else if (this.f18989b.B0()) {
                        this.f18989b.f18586f.f18992e.f18937l.add(this.f18992e);
                        this.f18992e.f18936k.add(this.f18989b.f18586f.f18992e);
                    } else {
                        this.f18989b.f18586f.f18992e.f18937l.add(this.f18992e);
                    }
                } else {
                    g gVar4 = eVar3.f18586f.f18992e;
                    gVar.f18937l.add(gVar4);
                    gVar4.f18936k.add(this.f18992e);
                    this.f18989b.f18586f.f18995h.f18936k.add(this.f18992e);
                    this.f18989b.f18586f.f18996i.f18936k.add(this.f18992e);
                    g gVar5 = this.f18992e;
                    gVar5.f18927b = true;
                    gVar5.f18936k.add(this.f18995h);
                    this.f18992e.f18936k.add(this.f18996i);
                    this.f18995h.f18937l.add(this.f18992e);
                    this.f18996i.f18937l.add(this.f18992e);
                }
            }
        }
        y.e eVar4 = this.f18989b;
        y.d[] dVarArr2 = eVar4.Y;
        y.d dVar4 = dVarArr2[0];
        y.d dVar5 = dVar4.f18535f;
        if (dVar5 != null && dVarArr2[1].f18535f != null) {
            if (eVar4.B0()) {
                this.f18995h.f18931f = this.f18989b.Y[0].g();
                this.f18996i.f18931f = -this.f18989b.Y[1].g();
                return;
            }
            f h11 = h(this.f18989b.Y[0]);
            f h12 = h(this.f18989b.Y[1]);
            if (h11 != null) {
                h11.b(this);
            }
            if (h12 != null) {
                h12.b(this);
            }
            this.f18997j = p.b.CENTER;
        } else if (dVar5 != null) {
            f h13 = h(dVar4);
            if (h13 != null) {
                b(this.f18995h, h13, this.f18989b.Y[0].g());
                c(this.f18996i, this.f18995h, 1, this.f18992e);
            }
        } else {
            y.d dVar6 = dVarArr2[1];
            if (dVar6.f18535f != null) {
                f h14 = h(dVar6);
                if (h14 != null) {
                    b(this.f18996i, h14, -this.f18989b.Y[1].g());
                    c(this.f18995h, this.f18996i, -1, this.f18992e);
                }
            } else if ((eVar4 instanceof y.i) || eVar4.U() == null) {
            } else {
                b(this.f18995h, this.f18989b.U().f18584e.f18995h, this.f18989b.o0());
                c(this.f18996i, this.f18995h, 1, this.f18992e);
            }
        }
    }

    @Override // z.p
    public void e() {
        f fVar = this.f18995h;
        if (fVar.f18935j) {
            this.f18989b.f2(fVar.f18932g);
        }
    }

    @Override // z.p
    public void f() {
        this.f18990c = null;
        this.f18995h.c();
        this.f18996i.c();
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
        this.f18992e.f18935j = false;
    }

    @Override // z.p
    public boolean p() {
        return this.f18991d != e.b.MATCH_CONSTRAINT || this.f18989b.f18620w == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f18989b.y();
    }

    public final void u(int[] iArr, int i7, int i8, int i9, int i10, float f7, int i11) {
        int i12 = i8 - i7;
        int i13 = i10 - i9;
        if (i11 != -1) {
            if (i11 == 0) {
                iArr[0] = (int) ((i13 * f7) + 0.5f);
                iArr[1] = i13;
                return;
            } else if (i11 != 1) {
                return;
            } else {
                iArr[0] = i12;
                iArr[1] = (int) ((i12 * f7) + 0.5f);
                return;
            }
        }
        int i14 = (int) ((i13 * f7) + 0.5f);
        int i15 = (int) ((i12 / f7) + 0.5f);
        if (i14 <= i12) {
            iArr[0] = i14;
            iArr[1] = i13;
        } else if (i15 <= i13) {
            iArr[0] = i12;
            iArr[1] = i15;
        }
    }
}