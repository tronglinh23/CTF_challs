package z;

import y.d;
import y.e;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f18988a;

    /* renamed from: b  reason: collision with root package name */
    public y.e f18989b;

    /* renamed from: c  reason: collision with root package name */
    public m f18990c;

    /* renamed from: d  reason: collision with root package name */
    public e.b f18991d;

    /* renamed from: e  reason: collision with root package name */
    public g f18992e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f18993f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18994g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f18995h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f18996i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public b f18997j = b.NONE;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18998a;

        static {
            int[] iArr = new int[d.b.values().length];
            f18998a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18998a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18998a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18998a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18998a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(y.e eVar) {
        this.f18989b = eVar;
    }

    @Override // z.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i7) {
        fVar.f18937l.add(fVar2);
        fVar.f18931f = i7;
        fVar2.f18936k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i7, g gVar) {
        fVar.f18937l.add(fVar2);
        fVar.f18937l.add(this.f18992e);
        fVar.f18933h = i7;
        fVar.f18934i = gVar;
        fVar2.f18936k.add(fVar);
        gVar.f18936k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i7, int i8) {
        int max;
        if (i8 == 0) {
            y.e eVar = this.f18989b;
            int i9 = eVar.A;
            max = Math.max(eVar.f18626z, i7);
            if (i9 > 0) {
                max = Math.min(i9, i7);
            }
            if (max == i7) {
                return i7;
            }
        } else {
            y.e eVar2 = this.f18989b;
            int i10 = eVar2.D;
            max = Math.max(eVar2.C, i7);
            if (i10 > 0) {
                max = Math.min(i10, i7);
            }
            if (max == i7) {
                return i7;
            }
        }
        return max;
    }

    public final f h(y.d dVar) {
        y.d dVar2 = dVar.f18535f;
        if (dVar2 == null) {
            return null;
        }
        y.e eVar = dVar2.f18533d;
        int i7 = a.f18998a[dVar2.f18534e.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            return null;
                        }
                        return eVar.f18586f.f18996i;
                    }
                    return eVar.f18586f.f18969k;
                }
                return eVar.f18586f.f18995h;
            }
            return eVar.f18584e.f18996i;
        }
        return eVar.f18584e.f18995h;
    }

    public final f i(y.d dVar, int i7) {
        y.d dVar2 = dVar.f18535f;
        if (dVar2 == null) {
            return null;
        }
        y.e eVar = dVar2.f18533d;
        p pVar = i7 == 0 ? eVar.f18584e : eVar.f18586f;
        int i8 = a.f18998a[dVar2.f18534e.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f18996i;
        }
        return pVar.f18995h;
    }

    public long j() {
        if (this.f18992e.f18935j) {
            return r0.f18932g;
        }
        return 0L;
    }

    public boolean k() {
        int size = this.f18995h.f18937l.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f18995h.f18937l.get(i8).f18929d != this) {
                i7++;
            }
        }
        int size2 = this.f18996i.f18937l.size();
        for (int i9 = 0; i9 < size2; i9++) {
            if (this.f18996i.f18937l.get(i9).f18929d != this) {
                i7++;
            }
        }
        return i7 >= 2;
    }

    public boolean l() {
        return this.f18992e.f18935j;
    }

    public boolean m() {
        return this.f18994g;
    }

    public abstract void n();

    public final void o(int i7, int i8) {
        int i9 = this.f18988a;
        if (i9 == 0) {
            this.f18992e.e(g(i8, i7));
        } else if (i9 == 1) {
            this.f18992e.e(Math.min(g(this.f18992e.f18947m, i7), i8));
        } else if (i9 == 2) {
            y.e U = this.f18989b.U();
            if (U != null) {
                if ((i7 == 0 ? U.f18584e : U.f18586f).f18992e.f18935j) {
                    y.e eVar = this.f18989b;
                    this.f18992e.e(g((int) ((r9.f18932g * (i7 == 0 ? eVar.B : eVar.E)) + 0.5f), i7));
                }
            }
        } else if (i9 != 3) {
        } else {
            y.e eVar2 = this.f18989b;
            p pVar = eVar2.f18584e;
            e.b bVar = pVar.f18991d;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && pVar.f18988a == 3) {
                n nVar = eVar2.f18586f;
                if (nVar.f18991d == bVar2 && nVar.f18988a == 3) {
                    return;
                }
            }
            if (i7 == 0) {
                pVar = eVar2.f18586f;
            }
            if (pVar.f18992e.f18935j) {
                float A = eVar2.A();
                this.f18992e.e(i7 == 1 ? (int) ((pVar.f18992e.f18932g / A) + 0.5f) : (int) ((A * pVar.f18992e.f18932g) + 0.5f));
            }
        }
    }

    public abstract boolean p();

    public void q(d dVar, y.d dVar2, y.d dVar3, int i7) {
        f h7 = h(dVar2);
        f h8 = h(dVar3);
        if (h7.f18935j && h8.f18935j) {
            int g7 = h7.f18932g + dVar2.g();
            int g8 = h8.f18932g - dVar3.g();
            int i8 = g8 - g7;
            if (!this.f18992e.f18935j && this.f18991d == e.b.MATCH_CONSTRAINT) {
                o(i7, i8);
            }
            g gVar = this.f18992e;
            if (gVar.f18935j) {
                if (gVar.f18932g == i8) {
                    this.f18995h.e(g7);
                    this.f18996i.e(g8);
                    return;
                }
                y.e eVar = this.f18989b;
                float E = i7 == 0 ? eVar.E() : eVar.g0();
                if (h7 == h8) {
                    g7 = h7.f18932g;
                    g8 = h8.f18932g;
                    E = 0.5f;
                }
                this.f18995h.e((int) (g7 + 0.5f + (((g8 - g7) - this.f18992e.f18932g) * E)));
                this.f18996i.e(this.f18995h.f18932g + this.f18992e.f18932g);
            }
        }
    }

    public void r(d dVar) {
    }

    public void s(d dVar) {
    }

    public long t(int i7) {
        int i8;
        g gVar = this.f18992e;
        if (gVar.f18935j) {
            long j7 = gVar.f18932g;
            if (k()) {
                i8 = this.f18995h.f18931f - this.f18996i.f18931f;
            } else if (i7 != 0) {
                return j7 - this.f18996i.f18931f;
            } else {
                i8 = this.f18995h.f18931f;
            }
            return j7 + i8;
        }
        return 0L;
    }
}