package z;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class m {

    /* renamed from: h  reason: collision with root package name */
    public static final int f18958h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f18959i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f18960j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static int f18961k;

    /* renamed from: c  reason: collision with root package name */
    public p f18964c;

    /* renamed from: d  reason: collision with root package name */
    public p f18965d;

    /* renamed from: f  reason: collision with root package name */
    public int f18967f;

    /* renamed from: g  reason: collision with root package name */
    public int f18968g;

    /* renamed from: a  reason: collision with root package name */
    public int f18962a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18963b = false;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<p> f18966e = new ArrayList<>();

    public m(p pVar, int i7) {
        this.f18964c = null;
        this.f18965d = null;
        int i8 = f18961k;
        this.f18967f = i8;
        f18961k = i8 + 1;
        this.f18964c = pVar;
        this.f18965d = pVar;
        this.f18968g = i7;
    }

    public void a(p pVar) {
        this.f18966e.add(pVar);
        this.f18965d = pVar;
    }

    public long b(y.f fVar, int i7) {
        long j7;
        int i8;
        p pVar = this.f18964c;
        if (pVar instanceof c) {
            if (((c) pVar).f18993f != i7) {
                return 0L;
            }
        } else if (i7 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i7 == 0 ? fVar.f18584e : fVar.f18586f).f18995h;
        f fVar3 = (i7 == 0 ? fVar.f18584e : fVar.f18586f).f18996i;
        boolean contains = pVar.f18995h.f18937l.contains(fVar2);
        boolean contains2 = this.f18964c.f18996i.f18937l.contains(fVar3);
        long j8 = this.f18964c.j();
        if (contains && contains2) {
            long f7 = f(this.f18964c.f18995h, 0L);
            long e7 = e(this.f18964c.f18996i, 0L);
            long j9 = f7 - j8;
            p pVar2 = this.f18964c;
            int i9 = pVar2.f18996i.f18931f;
            if (j9 >= (-i9)) {
                j9 += i9;
            }
            int i10 = pVar2.f18995h.f18931f;
            long j10 = ((-e7) - j8) - i10;
            if (j10 >= i10) {
                j10 -= i10;
            }
            float f8 = (float) (pVar2.f18989b.u(i7) > 0.0f ? (((float) j10) / r12) + (((float) j9) / (1.0f - r12)) : 0L);
            long j11 = (f8 * r12) + 0.5f + j8 + (f8 * (1.0f - r12)) + 0.5f;
            j7 = r12.f18995h.f18931f + j11;
            i8 = this.f18964c.f18996i.f18931f;
        } else if (contains) {
            return Math.max(f(this.f18964c.f18995h, r12.f18931f), this.f18964c.f18995h.f18931f + j8);
        } else if (contains2) {
            return Math.max(-e(this.f18964c.f18996i, r12.f18931f), (-this.f18964c.f18996i.f18931f) + j8);
        } else {
            j7 = r12.f18995h.f18931f + this.f18964c.j();
            i8 = this.f18964c.f18996i.f18931f;
        }
        return j7 - i8;
    }

    public final boolean c(p pVar, int i7) {
        f fVar;
        p pVar2;
        f fVar2;
        p pVar3;
        if (pVar.f18989b.f18588g[i7]) {
            for (d dVar : pVar.f18995h.f18936k) {
                if ((dVar instanceof f) && (pVar3 = (fVar2 = (f) dVar).f18929d) != pVar && fVar2 == pVar3.f18995h) {
                    if (pVar instanceof c) {
                        Iterator<p> it = ((c) pVar).f18914k.iterator();
                        while (it.hasNext()) {
                            c(it.next(), i7);
                        }
                    } else if (!(pVar instanceof k)) {
                        pVar.f18989b.f18588g[i7] = false;
                    }
                    c(fVar2.f18929d, i7);
                }
            }
            for (d dVar2 : pVar.f18996i.f18936k) {
                if ((dVar2 instanceof f) && (pVar2 = (fVar = (f) dVar2).f18929d) != pVar && fVar == pVar2.f18995h) {
                    if (pVar instanceof c) {
                        Iterator<p> it2 = ((c) pVar).f18914k.iterator();
                        while (it2.hasNext()) {
                            c(it2.next(), i7);
                        }
                    } else if (!(pVar instanceof k)) {
                        pVar.f18989b.f18588g[i7] = false;
                    }
                    c(fVar.f18929d, i7);
                }
            }
            return false;
        }
        return false;
    }

    public void d(boolean z6, boolean z7) {
        if (z6) {
            p pVar = this.f18964c;
            if (pVar instanceof l) {
                c(pVar, 0);
            }
        }
        if (z7) {
            p pVar2 = this.f18964c;
            if (pVar2 instanceof n) {
                c(pVar2, 1);
            }
        }
    }

    public final long e(f fVar, long j7) {
        p pVar = fVar.f18929d;
        if (pVar instanceof k) {
            return j7;
        }
        int size = fVar.f18936k.size();
        long j8 = j7;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = fVar.f18936k.get(i7);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f18929d != pVar) {
                    j8 = Math.min(j8, e(fVar2, fVar2.f18931f + j7));
                }
            }
        }
        if (fVar == pVar.f18996i) {
            long j9 = j7 - pVar.j();
            return Math.min(Math.min(j8, e(pVar.f18995h, j9)), j9 - pVar.f18995h.f18931f);
        }
        return j8;
    }

    public final long f(f fVar, long j7) {
        p pVar = fVar.f18929d;
        if (pVar instanceof k) {
            return j7;
        }
        int size = fVar.f18936k.size();
        long j8 = j7;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = fVar.f18936k.get(i7);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f18929d != pVar) {
                    j8 = Math.max(j8, f(fVar2, fVar2.f18931f + j7));
                }
            }
        }
        if (fVar == pVar.f18995h) {
            long j9 = j7 + pVar.j();
            return Math.max(Math.max(j8, f(pVar.f18996i, j9)), j9 - pVar.f18996i.f18931f);
        }
        return j8;
    }
}
