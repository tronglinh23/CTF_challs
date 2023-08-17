package z;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import y.e;
import z.b;
/* loaded from: classes.dex */
public class e {

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f18916j = true;

    /* renamed from: a  reason: collision with root package name */
    public y.f f18917a;

    /* renamed from: d  reason: collision with root package name */
    public y.f f18920d;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18918b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18919c = true;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<p> f18921e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<m> f18922f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public b.InterfaceC0268b f18923g = null;

    /* renamed from: h  reason: collision with root package name */
    public b.a f18924h = new b.a();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<m> f18925i = new ArrayList<>();

    public e(y.f fVar) {
        this.f18917a = fVar;
        this.f18920d = fVar;
    }

    public final void a(f fVar, int i7, int i8, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f18929d;
        if (pVar.f18990c == null) {
            y.f fVar3 = this.f18917a;
            if (pVar == fVar3.f18584e || pVar == fVar3.f18586f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i8);
                arrayList.add(mVar);
            }
            pVar.f18990c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f18995h.f18936k) {
                if (dVar instanceof f) {
                    a((f) dVar, i7, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f18996i.f18936k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i7, 1, fVar2, arrayList, mVar);
                }
            }
            if (i7 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f18969k.f18936k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i7, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f18995h.f18937l) {
                if (fVar4 == fVar2) {
                    mVar.f18963b = true;
                }
                a(fVar4, i7, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f18996i.f18937l) {
                if (fVar5 == fVar2) {
                    mVar.f18963b = true;
                }
                a(fVar5, i7, 1, fVar2, arrayList, mVar);
            }
            if (i7 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f18969k.f18937l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i7, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    public final boolean b(y.f fVar) {
        int i7;
        e.b bVar;
        int i8;
        e.b bVar2;
        e.b bVar3;
        e.b bVar4;
        Iterator<y.e> it = fVar.A1.iterator();
        while (it.hasNext()) {
            y.e next = it.next();
            e.b[] bVarArr = next.f18579b0;
            e.b bVar5 = bVarArr[0];
            e.b bVar6 = bVarArr[1];
            if (next.l0() == 8) {
                next.f18576a = true;
            } else {
                if (next.B < 1.0f && bVar5 == e.b.MATCH_CONSTRAINT) {
                    next.f18620w = 2;
                }
                if (next.E < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    next.f18622x = 2;
                }
                if (next.A() > 0.0f) {
                    e.b bVar7 = e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        next.f18620w = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == e.b.WRAP_CONTENT || bVar5 == e.b.FIXED)) {
                        next.f18622x = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.f18620w == 0) {
                            next.f18620w = 3;
                        }
                        if (next.f18622x == 0) {
                            next.f18622x = 3;
                        }
                    }
                }
                e.b bVar8 = e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.f18620w == 1 && (next.Q.f18535f == null || next.S.f18535f == null)) {
                    bVar5 = e.b.WRAP_CONTENT;
                }
                e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.f18622x == 1 && (next.R.f18535f == null || next.T.f18535f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                l lVar = next.f18584e;
                lVar.f18991d = bVar9;
                int i9 = next.f18620w;
                lVar.f18988a = i9;
                n nVar = next.f18586f;
                nVar.f18991d = bVar10;
                int i10 = next.f18622x;
                nVar.f18988a = i10;
                e.b bVar11 = e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == e.b.FIXED || bVar9 == e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT)) {
                    int m02 = next.m0();
                    if (bVar9 == bVar11) {
                        i7 = (fVar.m0() - next.Q.f18536g) - next.S.f18536g;
                        bVar = e.b.FIXED;
                    } else {
                        i7 = m02;
                        bVar = bVar9;
                    }
                    int D = next.D();
                    if (bVar10 == bVar11) {
                        i8 = (fVar.D() - next.R.f18536g) - next.T.f18536g;
                        bVar2 = e.b.FIXED;
                    } else {
                        i8 = D;
                        bVar2 = bVar10;
                    }
                    r(next, bVar, i7, bVar2, i8);
                    next.f18584e.f18992e.e(next.m0());
                    next.f18586f.f18992e.e(next.D());
                    next.f18576a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                        if (i9 == 3) {
                            if (bVar10 == bVar4) {
                                r(next, bVar4, 0, bVar4, 0);
                            }
                            int D2 = next.D();
                            int i11 = (int) ((D2 * next.f18587f0) + 0.5f);
                            e.b bVar12 = e.b.FIXED;
                            r(next, bVar12, i11, bVar12, D2);
                            next.f18584e.f18992e.e(next.m0());
                            next.f18586f.f18992e.e(next.D());
                            next.f18576a = true;
                        } else if (i9 == 1) {
                            r(next, bVar4, 0, bVar10, 0);
                            next.f18584e.f18992e.f18947m = next.m0();
                        } else if (i9 == 2) {
                            e.b bVar13 = fVar.f18579b0[0];
                            e.b bVar14 = e.b.FIXED;
                            if (bVar13 == bVar14 || bVar13 == bVar11) {
                                r(next, bVar14, (int) ((next.B * fVar.m0()) + 0.5f), bVar10, next.D());
                                next.f18584e.f18992e.e(next.m0());
                                next.f18586f.f18992e.e(next.D());
                                next.f18576a = true;
                            }
                        } else {
                            y.d[] dVarArr = next.Y;
                            if (dVarArr[0].f18535f == null || dVarArr[1].f18535f == null) {
                                r(next, bVar4, 0, bVar10, 0);
                                next.f18584e.f18992e.e(next.m0());
                                next.f18586f.f18992e.e(next.D());
                                next.f18576a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = e.b.WRAP_CONTENT) || bVar9 == e.b.FIXED)) {
                        if (i10 == 3) {
                            if (bVar9 == bVar3) {
                                r(next, bVar3, 0, bVar3, 0);
                            }
                            int m03 = next.m0();
                            float f7 = next.f18587f0;
                            if (next.B() == -1) {
                                f7 = 1.0f / f7;
                            }
                            e.b bVar15 = e.b.FIXED;
                            r(next, bVar15, m03, bVar15, (int) ((m03 * f7) + 0.5f));
                            next.f18584e.f18992e.e(next.m0());
                            next.f18586f.f18992e.e(next.D());
                            next.f18576a = true;
                        } else if (i10 == 1) {
                            r(next, bVar9, 0, bVar3, 0);
                            next.f18586f.f18992e.f18947m = next.D();
                        } else if (i10 == 2) {
                            e.b bVar16 = fVar.f18579b0[1];
                            e.b bVar17 = e.b.FIXED;
                            if (bVar16 == bVar17 || bVar16 == bVar11) {
                                r(next, bVar9, next.m0(), bVar17, (int) ((next.E * fVar.D()) + 0.5f));
                                next.f18584e.f18992e.e(next.m0());
                                next.f18586f.f18992e.e(next.D());
                                next.f18576a = true;
                            }
                        } else {
                            y.d[] dVarArr2 = next.Y;
                            if (dVarArr2[2].f18535f == null || dVarArr2[3].f18535f == null) {
                                r(next, bVar3, 0, bVar10, 0);
                                next.f18584e.f18992e.e(next.m0());
                                next.f18586f.f18992e.e(next.D());
                                next.f18576a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i9 == 1 || i10 == 1) {
                            e.b bVar18 = e.b.WRAP_CONTENT;
                            r(next, bVar18, 0, bVar18, 0);
                            next.f18584e.f18992e.f18947m = next.m0();
                            next.f18586f.f18992e.f18947m = next.D();
                        } else if (i10 == 2 && i9 == 2) {
                            e.b[] bVarArr2 = fVar.f18579b0;
                            e.b bVar19 = bVarArr2[0];
                            e.b bVar20 = e.b.FIXED;
                            if (bVar19 == bVar20 && bVarArr2[1] == bVar20) {
                                r(next, bVar20, (int) ((next.B * fVar.m0()) + 0.5f), bVar20, (int) ((next.E * fVar.D()) + 0.5f));
                                next.f18584e.f18992e.e(next.m0());
                                next.f18586f.f18992e.e(next.D());
                                next.f18576a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        d(this.f18921e);
        this.f18925i.clear();
        m.f18961k = 0;
        k(this.f18917a.f18584e, 0, this.f18925i);
        k(this.f18917a.f18586f, 1, this.f18925i);
        this.f18918b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f18920d.f18584e.f();
        this.f18920d.f18586f.f();
        arrayList.add(this.f18920d.f18584e);
        arrayList.add(this.f18920d.f18586f);
        Iterator<y.e> it = this.f18920d.A1.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            y.e next = it.next();
            if (next instanceof y.h) {
                arrayList.add(new j(next));
            } else {
                if (next.B0()) {
                    if (next.f18580c == null) {
                        next.f18580c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f18580c);
                } else {
                    arrayList.add(next.f18584e);
                }
                if (next.D0()) {
                    if (next.f18582d == null) {
                        next.f18582d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f18582d);
                } else {
                    arrayList.add(next.f18586f);
                }
                if (next instanceof y.j) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f18989b != this.f18920d) {
                next2.d();
            }
        }
    }

    public final int e(y.f fVar, int i7) {
        int size = this.f18925i.size();
        long j7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            j7 = Math.max(j7, this.f18925i.get(i8).b(fVar, i7));
        }
        return (int) j7;
    }

    public void f(e.b bVar, e.b bVar2) {
        if (this.f18918b) {
            c();
            Iterator<y.e> it = this.f18917a.A1.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                y.e next = it.next();
                boolean[] zArr = next.f18588g;
                zArr[0] = true;
                zArr[1] = true;
                if (next instanceof y.a) {
                    z6 = true;
                }
            }
            if (z6) {
                return;
            }
            Iterator<m> it2 = this.f18925i.iterator();
            while (it2.hasNext()) {
                m next2 = it2.next();
                e.b bVar3 = e.b.WRAP_CONTENT;
                next2.d(bVar == bVar3, bVar2 == bVar3);
            }
        }
    }

    public boolean g(boolean z6) {
        boolean z7;
        boolean z8 = true;
        boolean z9 = z6 & true;
        if (this.f18918b || this.f18919c) {
            Iterator<y.e> it = this.f18917a.A1.iterator();
            while (it.hasNext()) {
                y.e next = it.next();
                next.q();
                next.f18576a = false;
                next.f18584e.n();
                next.f18586f.n();
            }
            this.f18917a.q();
            y.f fVar = this.f18917a;
            fVar.f18576a = false;
            fVar.f18584e.n();
            this.f18917a.f18586f.n();
            this.f18919c = false;
        }
        if (b(this.f18920d)) {
            return false;
        }
        this.f18917a.f2(0);
        this.f18917a.g2(0);
        e.b z10 = this.f18917a.z(0);
        e.b z11 = this.f18917a.z(1);
        if (this.f18918b) {
            c();
        }
        int o02 = this.f18917a.o0();
        int p02 = this.f18917a.p0();
        this.f18917a.f18584e.f18995h.e(o02);
        this.f18917a.f18586f.f18995h.e(p02);
        s();
        e.b bVar = e.b.WRAP_CONTENT;
        if (z10 == bVar || z11 == bVar) {
            if (z9) {
                Iterator<p> it2 = this.f18921e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().p()) {
                        z9 = false;
                        break;
                    }
                }
            }
            if (z9 && z10 == e.b.WRAP_CONTENT) {
                this.f18917a.D1(e.b.FIXED);
                y.f fVar2 = this.f18917a;
                fVar2.c2(e(fVar2, 0));
                y.f fVar3 = this.f18917a;
                fVar3.f18584e.f18992e.e(fVar3.m0());
            }
            if (z9 && z11 == e.b.WRAP_CONTENT) {
                this.f18917a.Y1(e.b.FIXED);
                y.f fVar4 = this.f18917a;
                fVar4.y1(e(fVar4, 1));
                y.f fVar5 = this.f18917a;
                fVar5.f18586f.f18992e.e(fVar5.D());
            }
        }
        y.f fVar6 = this.f18917a;
        e.b bVar2 = fVar6.f18579b0[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int m02 = fVar6.m0() + o02;
            this.f18917a.f18584e.f18996i.e(m02);
            this.f18917a.f18584e.f18992e.e(m02 - o02);
            s();
            y.f fVar7 = this.f18917a;
            e.b bVar4 = fVar7.f18579b0[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int D = fVar7.D() + p02;
                this.f18917a.f18586f.f18996i.e(D);
                this.f18917a.f18586f.f18992e.e(D - p02);
            }
            s();
            z7 = true;
        } else {
            z7 = false;
        }
        Iterator<p> it3 = this.f18921e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f18989b != this.f18917a || next2.f18994g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f18921e.iterator();
        while (it4.hasNext()) {
            p next3 = it4.next();
            if (z7 || next3.f18989b != this.f18917a) {
                if (!next3.f18995h.f18935j || ((!next3.f18996i.f18935j && !(next3 instanceof j)) || (!next3.f18992e.f18935j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    z8 = false;
                    break;
                }
            }
        }
        this.f18917a.D1(z10);
        this.f18917a.Y1(z11);
        return z8;
    }

    public boolean h(boolean z6) {
        if (this.f18918b) {
            Iterator<y.e> it = this.f18917a.A1.iterator();
            while (it.hasNext()) {
                y.e next = it.next();
                next.q();
                next.f18576a = false;
                l lVar = next.f18584e;
                lVar.f18992e.f18935j = false;
                lVar.f18994g = false;
                lVar.n();
                n nVar = next.f18586f;
                nVar.f18992e.f18935j = false;
                nVar.f18994g = false;
                nVar.n();
            }
            this.f18917a.q();
            y.f fVar = this.f18917a;
            fVar.f18576a = false;
            l lVar2 = fVar.f18584e;
            lVar2.f18992e.f18935j = false;
            lVar2.f18994g = false;
            lVar2.n();
            n nVar2 = this.f18917a.f18586f;
            nVar2.f18992e.f18935j = false;
            nVar2.f18994g = false;
            nVar2.n();
            c();
        }
        if (b(this.f18920d)) {
            return false;
        }
        this.f18917a.f2(0);
        this.f18917a.g2(0);
        this.f18917a.f18584e.f18995h.e(0);
        this.f18917a.f18586f.f18995h.e(0);
        return true;
    }

    public boolean i(boolean z6, int i7) {
        boolean z7;
        e.b bVar;
        boolean z8 = true;
        boolean z9 = z6 & true;
        e.b z10 = this.f18917a.z(0);
        e.b z11 = this.f18917a.z(1);
        int o02 = this.f18917a.o0();
        int p02 = this.f18917a.p0();
        if (z9 && (z10 == (bVar = e.b.WRAP_CONTENT) || z11 == bVar)) {
            Iterator<p> it = this.f18921e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f18993f == i7 && !next.p()) {
                    z9 = false;
                    break;
                }
            }
            if (i7 == 0) {
                if (z9 && z10 == e.b.WRAP_CONTENT) {
                    this.f18917a.D1(e.b.FIXED);
                    y.f fVar = this.f18917a;
                    fVar.c2(e(fVar, 0));
                    y.f fVar2 = this.f18917a;
                    fVar2.f18584e.f18992e.e(fVar2.m0());
                }
            } else if (z9 && z11 == e.b.WRAP_CONTENT) {
                this.f18917a.Y1(e.b.FIXED);
                y.f fVar3 = this.f18917a;
                fVar3.y1(e(fVar3, 1));
                y.f fVar4 = this.f18917a;
                fVar4.f18586f.f18992e.e(fVar4.D());
            }
        }
        if (i7 == 0) {
            y.f fVar5 = this.f18917a;
            e.b bVar2 = fVar5.f18579b0[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int m02 = fVar5.m0() + o02;
                this.f18917a.f18584e.f18996i.e(m02);
                this.f18917a.f18584e.f18992e.e(m02 - o02);
                z7 = true;
            }
            z7 = false;
        } else {
            y.f fVar6 = this.f18917a;
            e.b bVar3 = fVar6.f18579b0[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int D = fVar6.D() + p02;
                this.f18917a.f18586f.f18996i.e(D);
                this.f18917a.f18586f.f18992e.e(D - p02);
                z7 = true;
            }
            z7 = false;
        }
        s();
        Iterator<p> it2 = this.f18921e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f18993f == i7 && (next2.f18989b != this.f18917a || next2.f18994g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f18921e.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f18993f == i7 && (z7 || next3.f18989b != this.f18917a)) {
                if (!next3.f18995h.f18935j || !next3.f18996i.f18935j || (!(next3 instanceof c) && !next3.f18992e.f18935j)) {
                    z8 = false;
                    break;
                }
            }
        }
        this.f18917a.D1(z10);
        this.f18917a.Y1(z11);
        return z8;
    }

    public final void j() {
        Iterator<p> it = this.f18921e.iterator();
        String str = "digraph {\n";
        while (it.hasNext()) {
            str = m(it.next(), str);
        }
        String str2 = str + "\n}\n";
        System.out.println("content:<<\n" + str2 + "\n>>");
    }

    public final void k(p pVar, int i7, ArrayList<m> arrayList) {
        for (d dVar : pVar.f18995h.f18936k) {
            if (dVar instanceof f) {
                a((f) dVar, i7, 0, pVar.f18996i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f18995h, i7, 0, pVar.f18996i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f18996i.f18936k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i7, 1, pVar.f18995h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f18996i, i7, 1, pVar.f18995h, arrayList, null);
            }
        }
        if (i7 == 1) {
            for (d dVar3 : ((n) pVar).f18969k.f18936k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i7, 2, null, arrayList, null);
                }
            }
        }
    }

    public final String l(c cVar, String str) {
        int i7 = cVar.f18993f;
        StringBuilder sb = new StringBuilder("subgraph ");
        sb.append("cluster_");
        sb.append(cVar.f18989b.y());
        if (i7 == 0) {
            sb.append("_h");
        } else {
            sb.append("_v");
        }
        sb.append(" {\n");
        Iterator<p> it = cVar.f18914k.iterator();
        String str2 = "";
        while (it.hasNext()) {
            p next = it.next();
            sb.append(next.f18989b.y());
            if (i7 == 0) {
                sb.append("_HORIZONTAL");
            } else {
                sb.append("_VERTICAL");
            }
            sb.append(";\n");
            str2 = m(next, str2);
        }
        sb.append("}\n");
        return str + str2 + ((Object) sb);
    }

    public final String m(p pVar, String str) {
        boolean z6;
        f fVar = pVar.f18995h;
        f fVar2 = pVar.f18996i;
        StringBuilder sb = new StringBuilder(str);
        if ((pVar instanceof k) || !fVar.f18936k.isEmpty() || (!fVar2.f18936k.isEmpty() || !fVar.f18937l.isEmpty()) || !fVar2.f18937l.isEmpty()) {
            sb.append(t(pVar));
            boolean q6 = q(fVar, fVar2);
            String n7 = n(fVar2, q6, n(fVar, q6, str));
            boolean z7 = pVar instanceof n;
            if (z7) {
                n7 = n(((n) pVar).f18969k, q6, n7);
            }
            if ((pVar instanceof l) || (((z6 = pVar instanceof c)) && ((c) pVar).f18993f == 0)) {
                e.b H = pVar.f18989b.H();
                if (H == e.b.FIXED || H == e.b.WRAP_CONTENT) {
                    if (!fVar.f18937l.isEmpty() && fVar2.f18937l.isEmpty()) {
                        sb.append("\n");
                        sb.append(fVar2.d());
                        sb.append(" -> ");
                        sb.append(fVar.d());
                        sb.append("\n");
                    } else if (fVar.f18937l.isEmpty() && !fVar2.f18937l.isEmpty()) {
                        sb.append("\n");
                        sb.append(fVar.d());
                        sb.append(" -> ");
                        sb.append(fVar2.d());
                        sb.append("\n");
                    }
                } else if (H == e.b.MATCH_CONSTRAINT && pVar.f18989b.A() > 0.0f) {
                    sb.append("\n");
                    sb.append(pVar.f18989b.y());
                    sb.append("_HORIZONTAL -> ");
                    sb.append(pVar.f18989b.y());
                    sb.append("_VERTICAL;\n");
                }
            } else if (z7 || (z6 && ((c) pVar).f18993f == 1)) {
                e.b j02 = pVar.f18989b.j0();
                if (j02 == e.b.FIXED || j02 == e.b.WRAP_CONTENT) {
                    if (!fVar.f18937l.isEmpty() && fVar2.f18937l.isEmpty()) {
                        sb.append("\n");
                        sb.append(fVar2.d());
                        sb.append(" -> ");
                        sb.append(fVar.d());
                        sb.append("\n");
                    } else if (fVar.f18937l.isEmpty() && !fVar2.f18937l.isEmpty()) {
                        sb.append("\n");
                        sb.append(fVar.d());
                        sb.append(" -> ");
                        sb.append(fVar2.d());
                        sb.append("\n");
                    }
                } else if (j02 == e.b.MATCH_CONSTRAINT && pVar.f18989b.A() > 0.0f) {
                    sb.append("\n");
                    sb.append(pVar.f18989b.y());
                    sb.append("_VERTICAL -> ");
                    sb.append(pVar.f18989b.y());
                    sb.append("_HORIZONTAL;\n");
                }
            }
            return pVar instanceof c ? l((c) pVar, n7) : sb.toString();
        }
        return str;
    }

    public final String n(f fVar, boolean z6, String str) {
        StringBuilder sb = new StringBuilder(str);
        for (f fVar2 : fVar.f18937l) {
            String str2 = ("\n" + fVar.d()) + " -> " + fVar2.d();
            if (fVar.f18931f > 0 || z6 || (fVar.f18929d instanceof k)) {
                String str3 = str2 + "[";
                if (fVar.f18931f > 0) {
                    str3 = str3 + "label=\"" + fVar.f18931f + "\"";
                    if (z6) {
                        str3 = str3 + ",";
                    }
                }
                if (z6) {
                    str3 = str3 + " style=dashed ";
                }
                if (fVar.f18929d instanceof k) {
                    str3 = str3 + " style=bold,color=gray ";
                }
                str2 = str3 + "]";
            }
            sb.append(str2 + "\n");
        }
        return sb.toString();
    }

    public void o() {
        this.f18918b = true;
    }

    public void p() {
        this.f18919c = true;
    }

    public final boolean q(f fVar, f fVar2) {
        Iterator<f> it = fVar.f18937l.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (it.next() != fVar2) {
                i7++;
            }
        }
        Iterator<f> it2 = fVar2.f18937l.iterator();
        int i8 = 0;
        while (it2.hasNext()) {
            if (it2.next() != fVar) {
                i8++;
            }
        }
        return i7 > 0 && i8 > 0;
    }

    public final void r(y.e eVar, e.b bVar, int i7, e.b bVar2, int i8) {
        b.a aVar = this.f18924h;
        aVar.f18904a = bVar;
        aVar.f18905b = bVar2;
        aVar.f18906c = i7;
        aVar.f18907d = i8;
        this.f18923g.b(eVar, aVar);
        eVar.c2(this.f18924h.f18908e);
        eVar.y1(this.f18924h.f18909f);
        eVar.x1(this.f18924h.f18911h);
        eVar.g1(this.f18924h.f18910g);
    }

    public void s() {
        g gVar;
        Iterator<y.e> it = this.f18917a.A1.iterator();
        while (it.hasNext()) {
            y.e next = it.next();
            if (!next.f18576a) {
                e.b[] bVarArr = next.f18579b0;
                boolean z6 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i7 = next.f18620w;
                int i8 = next.f18622x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z7 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i7 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i8 == 1)) {
                    z6 = true;
                }
                g gVar2 = next.f18584e.f18992e;
                boolean z8 = gVar2.f18935j;
                g gVar3 = next.f18586f.f18992e;
                boolean z9 = gVar3.f18935j;
                if (z8 && z9) {
                    e.b bVar4 = e.b.FIXED;
                    r(next, bVar4, gVar2.f18932g, bVar4, gVar3.f18932g);
                    next.f18576a = true;
                } else if (z8 && z6) {
                    r(next, e.b.FIXED, gVar2.f18932g, bVar3, gVar3.f18932g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f18586f.f18992e.f18947m = next.D();
                    } else {
                        next.f18586f.f18992e.e(next.D());
                        next.f18576a = true;
                    }
                } else if (z9 && z7) {
                    r(next, bVar3, gVar2.f18932g, e.b.FIXED, gVar3.f18932g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f18584e.f18992e.f18947m = next.m0();
                    } else {
                        next.f18584e.f18992e.e(next.m0());
                        next.f18576a = true;
                    }
                }
                if (next.f18576a && (gVar = next.f18586f.f18970l) != null) {
                    gVar.e(next.t());
                }
            }
        }
    }

    public final String t(p pVar) {
        boolean z6 = pVar instanceof n;
        String y6 = pVar.f18989b.y();
        StringBuilder sb = new StringBuilder(y6);
        y.e eVar = pVar.f18989b;
        e.b H = !z6 ? eVar.H() : eVar.j0();
        m mVar = pVar.f18990c;
        if (z6) {
            sb.append("_VERTICAL");
        } else {
            sb.append("_HORIZONTAL");
        }
        sb.append(" [shape=none, label=<");
        sb.append("<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">");
        sb.append("  <TR>");
        if (z6) {
            sb.append("    <TD ");
            if (pVar.f18995h.f18935j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"TOP\" BORDER=\"1\">T</TD>");
        } else {
            sb.append("    <TD ");
            if (pVar.f18995h.f18935j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        }
        sb.append("    <TD BORDER=\"1\" ");
        boolean z7 = pVar.f18992e.f18935j;
        if (z7 && !pVar.f18989b.f18576a) {
            sb.append(" BGCOLOR=\"green\" ");
        } else if (z7) {
            sb.append(" BGCOLOR=\"lightgray\" ");
        } else if (pVar.f18989b.f18576a) {
            sb.append(" BGCOLOR=\"yellow\" ");
        }
        if (H == e.b.MATCH_CONSTRAINT) {
            sb.append("style=\"dashed\"");
        }
        sb.append(">");
        sb.append(y6);
        if (mVar != null) {
            sb.append(" [");
            sb.append(mVar.f18967f + 1);
            sb.append("/");
            sb.append(m.f18961k);
            sb.append("]");
        }
        sb.append(" </TD>");
        if (z6) {
            sb.append("    <TD ");
            if (((n) pVar).f18969k.f18935j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>");
            sb.append("    <TD ");
            if (pVar.f18996i.f18935j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        } else {
            sb.append("    <TD ");
            if (pVar.f18996i.f18935j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        }
        sb.append("  </TR></TABLE>");
        sb.append(">];\n");
        return sb.toString();
    }

    public void u(b.InterfaceC0268b interfaceC0268b) {
        this.f18923g = interfaceC0268b;
    }
}
