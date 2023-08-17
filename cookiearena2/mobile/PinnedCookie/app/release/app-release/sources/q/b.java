package q;

import java.util.ArrayList;
import q.e;
import q.i;
/* loaded from: classes.dex */
public class b implements e.a {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f14998g = false;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f14999h = false;

    /* renamed from: e  reason: collision with root package name */
    public a f15004e;

    /* renamed from: a  reason: collision with root package name */
    public i f15000a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f15001b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15002c = false;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<i> f15003d = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f15005f = false;

    /* loaded from: classes.dex */
    public interface a {
        float a(int i7);

        void b(i iVar, float f7, boolean z6);

        float c(i iVar);

        void clear();

        void d();

        void e(i iVar, float f7);

        int f();

        int g(i iVar);

        float h(b bVar, boolean z6);

        int i();

        i j(int i7);

        float k(i iVar, boolean z6);

        boolean l(i iVar);

        void m(float f7);

        void n();
    }

    public b() {
    }

    public i A(i iVar) {
        return B(null, iVar);
    }

    public final i B(boolean[] zArr, i iVar) {
        i.b bVar;
        int f7 = this.f15004e.f();
        i iVar2 = null;
        float f8 = 0.0f;
        for (int i7 = 0; i7 < f7; i7++) {
            float a7 = this.f15004e.a(i7);
            if (a7 < 0.0f) {
                i j7 = this.f15004e.j(i7);
                if ((zArr == null || !zArr[j7.f15081m]) && j7 != iVar && (((bVar = j7.f15088t) == i.b.SLACK || bVar == i.b.ERROR) && a7 < f8)) {
                    f8 = a7;
                    iVar2 = j7;
                }
            }
        }
        return iVar2;
    }

    public void C(i iVar) {
        i iVar2 = this.f15000a;
        if (iVar2 != null) {
            this.f15004e.e(iVar2, -1.0f);
            this.f15000a.f15082n = -1;
            this.f15000a = null;
        }
        float k7 = this.f15004e.k(iVar, true) * (-1.0f);
        this.f15000a = iVar;
        if (k7 == 1.0f) {
            return;
        }
        this.f15001b /= k7;
        this.f15004e.m(k7);
    }

    public void D() {
        this.f15000a = null;
        this.f15004e.clear();
        this.f15001b = 0.0f;
        this.f15005f = false;
    }

    public int E() {
        return (this.f15000a != null ? 4 : 0) + 4 + 4 + this.f15004e.i();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v1 float, still in use, count: 4, list:
          (r7v1 float) from 0x00b9: PHI (r7v2 float) = (r7v1 float), (r7v3 float), (r7v1 float) binds: [B:24:0x0095, B:26:0x00b8, B:21:0x007f] A[DONT_GENERATE, DONT_INLINE]
          (r7v1 float) from 0x00b8: ARITH (r7v3 float) = (r7v1 float) * (-1.0f float)
          (r7v1 float) from 0x007d: CMP_G (r7v1 float), (0.0f float) A[WRAPPED]
          (r7v1 float) from 0x00b9: PHI (r7v2 float) = (r7v1 float), (r7v3 float), (r7v1 float) binds: [B:24:0x0095, B:26:0x00b8, B:21:0x007f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:152)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:117)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:81)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:96)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyIf(SimplifyVisitor.java:280)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:138)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String F() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.b.F():java.lang.String");
    }

    public void G(e eVar, i iVar, boolean z6) {
        if (iVar == null || !iVar.f15092x) {
            return;
        }
        float c7 = this.f15004e.c(iVar);
        this.f15001b += iVar.f15094z * c7;
        this.f15004e.k(iVar, z6);
        if (z6) {
            iVar.k(this);
        }
        this.f15004e.b(eVar.f15032n.f15009d[iVar.f15093y], c7, z6);
        if (e.f15016x && this.f15004e.f() == 0) {
            this.f15005f = true;
            eVar.f15019a = true;
        }
    }

    @Override // q.e.a
    public void a(e eVar) {
        if (eVar.f15025g.length == 0) {
            return;
        }
        boolean z6 = false;
        while (!z6) {
            int f7 = this.f15004e.f();
            for (int i7 = 0; i7 < f7; i7++) {
                i j7 = this.f15004e.j(i7);
                if (j7.f15082n != -1 || j7.f15085q || j7.f15092x) {
                    this.f15003d.add(j7);
                }
            }
            int size = this.f15003d.size();
            if (size > 0) {
                for (int i8 = 0; i8 < size; i8++) {
                    i iVar = this.f15003d.get(i8);
                    if (iVar.f15085q) {
                        c(eVar, iVar, true);
                    } else if (iVar.f15092x) {
                        G(eVar, iVar, true);
                    } else {
                        e(eVar, eVar.f15025g[iVar.f15082n], true);
                    }
                }
                this.f15003d.clear();
            } else {
                z6 = true;
            }
        }
        if (e.f15016x && this.f15000a != null && this.f15004e.f() == 0) {
            this.f15005f = true;
            eVar.f15019a = true;
        }
    }

    @Override // q.e.a
    public i b(e eVar, boolean[] zArr) {
        return B(zArr, null);
    }

    @Override // q.e.a
    public void c(e eVar, i iVar, boolean z6) {
        if (iVar == null || !iVar.f15085q) {
            return;
        }
        this.f15001b += iVar.f15084p * this.f15004e.c(iVar);
        this.f15004e.k(iVar, z6);
        if (z6) {
            iVar.k(this);
        }
        if (e.f15016x && this.f15004e.f() == 0) {
            this.f15005f = true;
            eVar.f15019a = true;
        }
    }

    @Override // q.e.a
    public void clear() {
        this.f15004e.clear();
        this.f15000a = null;
        this.f15001b = 0.0f;
    }

    @Override // q.e.a
    public void d(e.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f15000a = null;
            this.f15004e.clear();
            for (int i7 = 0; i7 < bVar.f15004e.f(); i7++) {
                this.f15004e.b(bVar.f15004e.j(i7), bVar.f15004e.a(i7), true);
            }
        }
    }

    @Override // q.e.a
    public void e(e eVar, b bVar, boolean z6) {
        this.f15001b += bVar.f15001b * this.f15004e.h(bVar, z6);
        if (z6) {
            bVar.f15000a.k(this);
        }
        if (e.f15016x && this.f15000a != null && this.f15004e.f() == 0) {
            this.f15005f = true;
            eVar.f15019a = true;
        }
    }

    @Override // q.e.a
    public void f(i iVar) {
        int i7 = iVar.f15083o;
        float f7 = 1.0f;
        if (i7 != 1) {
            if (i7 == 2) {
                f7 = 1000.0f;
            } else if (i7 == 3) {
                f7 = 1000000.0f;
            } else if (i7 == 4) {
                f7 = 1.0E9f;
            } else if (i7 == 5) {
                f7 = 1.0E12f;
            }
        }
        this.f15004e.e(iVar, f7);
    }

    public b g(e eVar, int i7) {
        this.f15004e.e(eVar.s(i7, "ep"), 1.0f);
        this.f15004e.e(eVar.s(i7, "em"), -1.0f);
        return this;
    }

    @Override // q.e.a
    public i getKey() {
        return this.f15000a;
    }

    public b h(i iVar, int i7) {
        this.f15004e.e(iVar, i7);
        return this;
    }

    public boolean i(e eVar) {
        boolean z6;
        i j7 = j(eVar);
        if (j7 == null) {
            z6 = true;
        } else {
            C(j7);
            z6 = false;
        }
        if (this.f15004e.f() == 0) {
            this.f15005f = true;
        }
        return z6;
    }

    @Override // q.e.a
    public boolean isEmpty() {
        return this.f15000a == null && this.f15001b == 0.0f && this.f15004e.f() == 0;
    }

    public i j(e eVar) {
        boolean z6;
        boolean z7;
        int f7 = this.f15004e.f();
        i iVar = null;
        float f8 = 0.0f;
        float f9 = 0.0f;
        boolean z8 = false;
        boolean z9 = false;
        i iVar2 = null;
        for (int i7 = 0; i7 < f7; i7++) {
            float a7 = this.f15004e.a(i7);
            i j7 = this.f15004e.j(i7);
            if (j7.f15088t == i.b.UNRESTRICTED) {
                if (iVar == null) {
                    z7 = z(j7, eVar);
                } else if (f8 > a7) {
                    z7 = z(j7, eVar);
                } else if (!z8 && z(j7, eVar)) {
                    f8 = a7;
                    iVar = j7;
                    z8 = true;
                }
                z8 = z7;
                f8 = a7;
                iVar = j7;
            } else if (iVar == null && a7 < 0.0f) {
                if (iVar2 == null) {
                    z6 = z(j7, eVar);
                } else if (f9 > a7) {
                    z6 = z(j7, eVar);
                } else if (!z9 && z(j7, eVar)) {
                    f9 = a7;
                    iVar2 = j7;
                    z9 = true;
                }
                z9 = z6;
                f9 = a7;
                iVar2 = j7;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public b k(i iVar, i iVar2, int i7, float f7, i iVar3, i iVar4, int i8) {
        if (iVar2 == iVar3) {
            this.f15004e.e(iVar, 1.0f);
            this.f15004e.e(iVar4, 1.0f);
            this.f15004e.e(iVar2, -2.0f);
            return this;
        }
        if (f7 == 0.5f) {
            this.f15004e.e(iVar, 1.0f);
            this.f15004e.e(iVar2, -1.0f);
            this.f15004e.e(iVar3, -1.0f);
            this.f15004e.e(iVar4, 1.0f);
            if (i7 > 0 || i8 > 0) {
                this.f15001b = (-i7) + i8;
            }
        } else if (f7 <= 0.0f) {
            this.f15004e.e(iVar, -1.0f);
            this.f15004e.e(iVar2, 1.0f);
            this.f15001b = i7;
        } else if (f7 >= 1.0f) {
            this.f15004e.e(iVar4, -1.0f);
            this.f15004e.e(iVar3, 1.0f);
            this.f15001b = -i8;
        } else {
            float f8 = 1.0f - f7;
            this.f15004e.e(iVar, f8 * 1.0f);
            this.f15004e.e(iVar2, f8 * (-1.0f));
            this.f15004e.e(iVar3, (-1.0f) * f7);
            this.f15004e.e(iVar4, 1.0f * f7);
            if (i7 > 0 || i8 > 0) {
                this.f15001b = ((-i7) * f8) + (i8 * f7);
            }
        }
        return this;
    }

    public b l(i iVar, int i7) {
        this.f15000a = iVar;
        float f7 = i7;
        iVar.f15084p = f7;
        this.f15001b = f7;
        this.f15005f = true;
        return this;
    }

    public b m(i iVar, i iVar2, float f7) {
        this.f15004e.e(iVar, -1.0f);
        this.f15004e.e(iVar2, f7);
        return this;
    }

    public b n(i iVar, i iVar2, i iVar3, i iVar4, float f7) {
        this.f15004e.e(iVar, -1.0f);
        this.f15004e.e(iVar2, 1.0f);
        this.f15004e.e(iVar3, f7);
        this.f15004e.e(iVar4, -f7);
        return this;
    }

    public b o(float f7, float f8, float f9, i iVar, int i7, i iVar2, int i8, i iVar3, int i9, i iVar4, int i10) {
        if (f8 == 0.0f || f7 == f9) {
            this.f15001b = ((-i7) - i8) + i9 + i10;
            this.f15004e.e(iVar, 1.0f);
            this.f15004e.e(iVar2, -1.0f);
            this.f15004e.e(iVar4, 1.0f);
            this.f15004e.e(iVar3, -1.0f);
        } else {
            float f10 = (f7 / f8) / (f9 / f8);
            this.f15001b = ((-i7) - i8) + (i9 * f10) + (i10 * f10);
            this.f15004e.e(iVar, 1.0f);
            this.f15004e.e(iVar2, -1.0f);
            this.f15004e.e(iVar4, f10);
            this.f15004e.e(iVar3, -f10);
        }
        return this;
    }

    public b p(float f7, float f8, float f9, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f15001b = 0.0f;
        if (f8 == 0.0f || f7 == f9) {
            this.f15004e.e(iVar, 1.0f);
            this.f15004e.e(iVar2, -1.0f);
            this.f15004e.e(iVar4, 1.0f);
            this.f15004e.e(iVar3, -1.0f);
        } else if (f7 == 0.0f) {
            this.f15004e.e(iVar, 1.0f);
            this.f15004e.e(iVar2, -1.0f);
        } else if (f9 == 0.0f) {
            this.f15004e.e(iVar3, 1.0f);
            this.f15004e.e(iVar4, -1.0f);
        } else {
            float f10 = (f7 / f8) / (f9 / f8);
            this.f15004e.e(iVar, 1.0f);
            this.f15004e.e(iVar2, -1.0f);
            this.f15004e.e(iVar4, f10);
            this.f15004e.e(iVar3, -f10);
        }
        return this;
    }

    public b q(i iVar, int i7) {
        if (i7 < 0) {
            this.f15001b = i7 * (-1);
            this.f15004e.e(iVar, 1.0f);
        } else {
            this.f15001b = i7;
            this.f15004e.e(iVar, -1.0f);
        }
        return this;
    }

    public b r(i iVar, i iVar2, int i7) {
        boolean z6 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z6 = true;
            }
            this.f15001b = i7;
        }
        if (z6) {
            this.f15004e.e(iVar, 1.0f);
            this.f15004e.e(iVar2, -1.0f);
        } else {
            this.f15004e.e(iVar, -1.0f);
            this.f15004e.e(iVar2, 1.0f);
        }
        return this;
    }

    public b s(i iVar, int i7, i iVar2) {
        this.f15001b = i7;
        this.f15004e.e(iVar, -1.0f);
        return this;
    }

    public b t(i iVar, i iVar2, i iVar3, int i7) {
        boolean z6 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z6 = true;
            }
            this.f15001b = i7;
        }
        if (z6) {
            this.f15004e.e(iVar, 1.0f);
            this.f15004e.e(iVar2, -1.0f);
            this.f15004e.e(iVar3, -1.0f);
        } else {
            this.f15004e.e(iVar, -1.0f);
            this.f15004e.e(iVar2, 1.0f);
            this.f15004e.e(iVar3, 1.0f);
        }
        return this;
    }

    public String toString() {
        return F();
    }

    public b u(i iVar, i iVar2, i iVar3, int i7) {
        boolean z6 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z6 = true;
            }
            this.f15001b = i7;
        }
        if (z6) {
            this.f15004e.e(iVar, 1.0f);
            this.f15004e.e(iVar2, -1.0f);
            this.f15004e.e(iVar3, 1.0f);
        } else {
            this.f15004e.e(iVar, -1.0f);
            this.f15004e.e(iVar2, 1.0f);
            this.f15004e.e(iVar3, -1.0f);
        }
        return this;
    }

    public b v(i iVar, i iVar2, i iVar3, i iVar4, float f7) {
        this.f15004e.e(iVar3, 0.5f);
        this.f15004e.e(iVar4, 0.5f);
        this.f15004e.e(iVar, -0.5f);
        this.f15004e.e(iVar2, -0.5f);
        this.f15001b = -f7;
        return this;
    }

    public void w() {
        float f7 = this.f15001b;
        if (f7 < 0.0f) {
            this.f15001b = f7 * (-1.0f);
            this.f15004e.n();
        }
    }

    public boolean x() {
        i iVar = this.f15000a;
        return iVar != null && (iVar.f15088t == i.b.UNRESTRICTED || this.f15001b >= 0.0f);
    }

    public boolean y(i iVar) {
        return this.f15004e.l(iVar);
    }

    public final boolean z(i iVar, e eVar) {
        return iVar.f15091w <= 1;
    }

    public b(c cVar) {
        this.f15004e = new q.a(this, cVar);
    }
}
