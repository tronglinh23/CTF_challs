package z;

import java.util.ArrayList;
import java.util.Iterator;
import y.d;
import y.e;
import z.b;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f18948a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f18949b = false;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f18951d = true;

    /* renamed from: c  reason: collision with root package name */
    public static b.a f18950c = new b.a();

    /* renamed from: e  reason: collision with root package name */
    public static int f18952e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static int f18953f = 0;

    public static boolean a(int i7, y.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b H = eVar.H();
        e.b j02 = eVar.j0();
        y.f fVar = eVar.U() != null ? (y.f) eVar.U() : null;
        if (fVar != null) {
            fVar.H();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.j0();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z6 = H == bVar5 || eVar.G0() || H == e.b.WRAP_CONTENT || (H == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f18620w == 0 && eVar.f18587f0 == 0.0f && eVar.r0(0)) || (H == bVar2 && eVar.f18620w == 1 && eVar.u0(0, eVar.m0()));
        boolean z7 = j02 == bVar5 || eVar.H0() || j02 == e.b.WRAP_CONTENT || (j02 == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f18622x == 0 && eVar.f18587f0 == 0.0f && eVar.r0(1)) || (j02 == bVar && eVar.f18622x == 1 && eVar.u0(1, eVar.D()));
        if (eVar.f18587f0 <= 0.0f || !(z6 || z7)) {
            return z6 && z7;
        }
        return true;
    }

    public static void b(int i7, y.e eVar, b.InterfaceC0268b interfaceC0268b, boolean z6) {
        y.d dVar;
        y.d dVar2;
        y.d dVar3;
        y.d dVar4;
        if (eVar.z0()) {
            return;
        }
        boolean z7 = true;
        f18952e++;
        if (!(eVar instanceof y.f) && eVar.F0()) {
            int i8 = i7 + 1;
            if (a(i8, eVar)) {
                y.f.R2(i8, eVar, interfaceC0268b, new b.a(), b.a.f18901k);
            }
        }
        y.d r6 = eVar.r(d.b.LEFT);
        y.d r7 = eVar.r(d.b.RIGHT);
        int f7 = r6.f();
        int f8 = r7.f();
        if (r6.e() != null && r6.o()) {
            Iterator<y.d> it = r6.e().iterator();
            while (it.hasNext()) {
                y.d next = it.next();
                y.e eVar2 = next.f18533d;
                int i9 = i7 + 1;
                boolean a7 = a(i9, eVar2);
                if (eVar2.F0() && a7) {
                    y.f.R2(i9, eVar2, interfaceC0268b, new b.a(), b.a.f18901k);
                }
                boolean z8 = ((next == eVar2.Q && (dVar4 = eVar2.S.f18535f) != null && dVar4.o()) || (next == eVar2.S && (dVar3 = eVar2.Q.f18535f) != null && dVar3.o())) ? z7 : false;
                e.b H = eVar2.H();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (H != bVar || a7) {
                    if (!eVar2.F0()) {
                        y.d dVar5 = eVar2.Q;
                        if (next == dVar5 && eVar2.S.f18535f == null) {
                            int g7 = dVar5.g() + f7;
                            eVar2.q1(g7, eVar2.m0() + g7);
                            b(i9, eVar2, interfaceC0268b, z6);
                        } else {
                            y.d dVar6 = eVar2.S;
                            if (next == dVar6 && dVar5.f18535f == null) {
                                int g8 = f7 - dVar6.g();
                                eVar2.q1(g8 - eVar2.m0(), g8);
                                b(i9, eVar2, interfaceC0268b, z6);
                            } else if (z8 && !eVar2.B0()) {
                                f(i9, interfaceC0268b, eVar2, z6);
                            }
                        }
                    }
                } else if (eVar2.H() == bVar && eVar2.A >= 0 && eVar2.f18626z >= 0 && ((eVar2.l0() == 8 || (eVar2.f18620w == 0 && eVar2.A() == 0.0f)) && !eVar2.B0() && !eVar2.E0() && z8 && !eVar2.B0())) {
                    g(i9, eVar, interfaceC0268b, eVar2, z6);
                }
                z7 = true;
            }
        }
        if (eVar instanceof y.h) {
            return;
        }
        if (r7.e() != null && r7.o()) {
            Iterator<y.d> it2 = r7.e().iterator();
            while (it2.hasNext()) {
                y.d next2 = it2.next();
                y.e eVar3 = next2.f18533d;
                int i10 = i7 + 1;
                boolean a8 = a(i10, eVar3);
                if (eVar3.F0() && a8) {
                    y.f.R2(i10, eVar3, interfaceC0268b, new b.a(), b.a.f18901k);
                }
                boolean z9 = (next2 == eVar3.Q && (dVar2 = eVar3.S.f18535f) != null && dVar2.o()) || (next2 == eVar3.S && (dVar = eVar3.Q.f18535f) != null && dVar.o());
                e.b H2 = eVar3.H();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (H2 != bVar2 || a8) {
                    if (!eVar3.F0()) {
                        y.d dVar7 = eVar3.Q;
                        if (next2 == dVar7 && eVar3.S.f18535f == null) {
                            int g9 = dVar7.g() + f8;
                            eVar3.q1(g9, eVar3.m0() + g9);
                            b(i10, eVar3, interfaceC0268b, z6);
                        } else {
                            y.d dVar8 = eVar3.S;
                            if (next2 == dVar8 && dVar7.f18535f == null) {
                                int g10 = f8 - dVar8.g();
                                eVar3.q1(g10 - eVar3.m0(), g10);
                                b(i10, eVar3, interfaceC0268b, z6);
                            } else if (z9 && !eVar3.B0()) {
                                f(i10, interfaceC0268b, eVar3, z6);
                            }
                        }
                    }
                } else if (eVar3.H() == bVar2 && eVar3.A >= 0 && eVar3.f18626z >= 0 && (eVar3.l0() == 8 || (eVar3.f18620w == 0 && eVar3.A() == 0.0f))) {
                    if (!eVar3.B0() && !eVar3.E0() && z9 && !eVar3.B0()) {
                        g(i10, eVar, interfaceC0268b, eVar3, z6);
                    }
                }
            }
        }
        eVar.N0();
    }

    public static String c(int i7) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append("  ");
        }
        sb.append("+-(" + i7 + ") ");
        return sb.toString();
    }

    public static void d(int i7, y.a aVar, b.InterfaceC0268b interfaceC0268b, int i8, boolean z6) {
        if (aVar.m2()) {
            if (i8 == 0) {
                b(i7 + 1, aVar, interfaceC0268b, z6);
            } else {
                k(i7 + 1, aVar, interfaceC0268b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d1, code lost:
        if (r6.f18533d == r0) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014f  */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(y.f r20, q.e r21, int r22, int r23, y.c r24, boolean r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.h.e(y.f, q.e, int, int, y.c, boolean, boolean, boolean):boolean");
    }

    public static void f(int i7, b.InterfaceC0268b interfaceC0268b, y.e eVar, boolean z6) {
        float E = eVar.E();
        int f7 = eVar.Q.f18535f.f();
        int f8 = eVar.S.f18535f.f();
        int g7 = eVar.Q.g() + f7;
        int g8 = f8 - eVar.S.g();
        if (f7 == f8) {
            E = 0.5f;
        } else {
            f7 = g7;
            f8 = g8;
        }
        int m02 = eVar.m0();
        int i8 = (f8 - f7) - m02;
        if (f7 > f8) {
            i8 = (f7 - f8) - m02;
        }
        int i9 = ((int) (i8 > 0 ? (E * i8) + 0.5f : E * i8)) + f7;
        int i10 = i9 + m02;
        if (f7 > f8) {
            i10 = i9 - m02;
        }
        eVar.q1(i9, i10);
        b(i7 + 1, eVar, interfaceC0268b, z6);
    }

    public static void g(int i7, y.e eVar, b.InterfaceC0268b interfaceC0268b, y.e eVar2, boolean z6) {
        float E = eVar2.E();
        int f7 = eVar2.Q.f18535f.f() + eVar2.Q.g();
        int f8 = eVar2.S.f18535f.f() - eVar2.S.g();
        if (f8 >= f7) {
            int m02 = eVar2.m0();
            if (eVar2.l0() != 8) {
                int i8 = eVar2.f18620w;
                if (i8 == 2) {
                    m02 = (int) (eVar2.E() * 0.5f * (eVar instanceof y.f ? eVar.m0() : eVar.U().m0()));
                } else if (i8 == 0) {
                    m02 = f8 - f7;
                }
                m02 = Math.max(eVar2.f18626z, m02);
                int i9 = eVar2.A;
                if (i9 > 0) {
                    m02 = Math.min(i9, m02);
                }
            }
            int i10 = f7 + ((int) ((E * ((f8 - f7) - m02)) + 0.5f));
            eVar2.q1(i10, m02 + i10);
            b(i7 + 1, eVar2, interfaceC0268b, z6);
        }
    }

    public static void h(int i7, b.InterfaceC0268b interfaceC0268b, y.e eVar) {
        float g02 = eVar.g0();
        int f7 = eVar.R.f18535f.f();
        int f8 = eVar.T.f18535f.f();
        int g7 = eVar.R.g() + f7;
        int g8 = f8 - eVar.T.g();
        if (f7 == f8) {
            g02 = 0.5f;
        } else {
            f7 = g7;
            f8 = g8;
        }
        int D = eVar.D();
        int i8 = (f8 - f7) - D;
        if (f7 > f8) {
            i8 = (f7 - f8) - D;
        }
        int i9 = (int) (i8 > 0 ? (g02 * i8) + 0.5f : g02 * i8);
        int i10 = f7 + i9;
        int i11 = i10 + D;
        if (f7 > f8) {
            i10 = f7 - i9;
            i11 = i10 - D;
        }
        eVar.t1(i10, i11);
        k(i7 + 1, eVar, interfaceC0268b);
    }

    public static void i(int i7, y.e eVar, b.InterfaceC0268b interfaceC0268b, y.e eVar2) {
        float g02 = eVar2.g0();
        int f7 = eVar2.R.f18535f.f() + eVar2.R.g();
        int f8 = eVar2.T.f18535f.f() - eVar2.T.g();
        if (f8 >= f7) {
            int D = eVar2.D();
            if (eVar2.l0() != 8) {
                int i8 = eVar2.f18622x;
                if (i8 == 2) {
                    D = (int) (g02 * 0.5f * (eVar instanceof y.f ? eVar.D() : eVar.U().D()));
                } else if (i8 == 0) {
                    D = f8 - f7;
                }
                D = Math.max(eVar2.C, D);
                int i9 = eVar2.D;
                if (i9 > 0) {
                    D = Math.min(i9, D);
                }
            }
            int i10 = f7 + ((int) ((g02 * ((f8 - f7) - D)) + 0.5f));
            eVar2.t1(i10, D + i10);
            k(i7 + 1, eVar2, interfaceC0268b);
        }
    }

    public static void j(y.f fVar, b.InterfaceC0268b interfaceC0268b) {
        e.b H = fVar.H();
        e.b j02 = fVar.j0();
        f18952e = 0;
        f18953f = 0;
        fVar.V0();
        ArrayList<y.e> l22 = fVar.l2();
        int size = l22.size();
        for (int i7 = 0; i7 < size; i7++) {
            l22.get(i7).V0();
        }
        boolean O2 = fVar.O2();
        if (H == e.b.FIXED) {
            fVar.q1(0, fVar.m0());
        } else {
            fVar.r1(0);
        }
        boolean z6 = false;
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            y.e eVar = l22.get(i8);
            if (eVar instanceof y.h) {
                y.h hVar = (y.h) eVar;
                if (hVar.m2() == 1) {
                    if (hVar.n2() != -1) {
                        hVar.v2(hVar.n2());
                    } else if (hVar.p2() != -1 && fVar.G0()) {
                        hVar.v2(fVar.m0() - hVar.p2());
                    } else if (fVar.G0()) {
                        hVar.v2((int) ((hVar.q2() * fVar.m0()) + 0.5f));
                    }
                    z6 = true;
                }
            } else if ((eVar instanceof y.a) && ((y.a) eVar).r2() == 0) {
                z7 = true;
            }
        }
        if (z6) {
            for (int i9 = 0; i9 < size; i9++) {
                y.e eVar2 = l22.get(i9);
                if (eVar2 instanceof y.h) {
                    y.h hVar2 = (y.h) eVar2;
                    if (hVar2.m2() == 1) {
                        b(0, hVar2, interfaceC0268b, O2);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0268b, O2);
        if (z7) {
            for (int i10 = 0; i10 < size; i10++) {
                y.e eVar3 = l22.get(i10);
                if (eVar3 instanceof y.a) {
                    y.a aVar = (y.a) eVar3;
                    if (aVar.r2() == 0) {
                        d(0, aVar, interfaceC0268b, 0, O2);
                    }
                }
            }
        }
        if (j02 == e.b.FIXED) {
            fVar.t1(0, fVar.D());
        } else {
            fVar.s1(0);
        }
        boolean z8 = false;
        boolean z9 = false;
        for (int i11 = 0; i11 < size; i11++) {
            y.e eVar4 = l22.get(i11);
            if (eVar4 instanceof y.h) {
                y.h hVar3 = (y.h) eVar4;
                if (hVar3.m2() == 0) {
                    if (hVar3.n2() != -1) {
                        hVar3.v2(hVar3.n2());
                    } else if (hVar3.p2() != -1 && fVar.H0()) {
                        hVar3.v2(fVar.D() - hVar3.p2());
                    } else if (fVar.H0()) {
                        hVar3.v2((int) ((hVar3.q2() * fVar.D()) + 0.5f));
                    }
                    z8 = true;
                }
            } else if ((eVar4 instanceof y.a) && ((y.a) eVar4).r2() == 1) {
                z9 = true;
            }
        }
        if (z8) {
            for (int i12 = 0; i12 < size; i12++) {
                y.e eVar5 = l22.get(i12);
                if (eVar5 instanceof y.h) {
                    y.h hVar4 = (y.h) eVar5;
                    if (hVar4.m2() == 0) {
                        k(1, hVar4, interfaceC0268b);
                    }
                }
            }
        }
        k(0, fVar, interfaceC0268b);
        if (z9) {
            for (int i13 = 0; i13 < size; i13++) {
                y.e eVar6 = l22.get(i13);
                if (eVar6 instanceof y.a) {
                    y.a aVar2 = (y.a) eVar6;
                    if (aVar2.r2() == 1) {
                        d(0, aVar2, interfaceC0268b, 1, O2);
                    }
                }
            }
        }
        for (int i14 = 0; i14 < size; i14++) {
            y.e eVar7 = l22.get(i14);
            if (eVar7.F0() && a(0, eVar7)) {
                y.f.R2(0, eVar7, interfaceC0268b, f18950c, b.a.f18901k);
                if (!(eVar7 instanceof y.h)) {
                    b(0, eVar7, interfaceC0268b, O2);
                    k(0, eVar7, interfaceC0268b);
                } else if (((y.h) eVar7).m2() == 0) {
                    k(0, eVar7, interfaceC0268b);
                } else {
                    b(0, eVar7, interfaceC0268b, O2);
                }
            }
        }
    }

    public static void k(int i7, y.e eVar, b.InterfaceC0268b interfaceC0268b) {
        y.d dVar;
        y.d dVar2;
        y.d dVar3;
        y.d dVar4;
        if (eVar.L0()) {
            return;
        }
        f18953f++;
        if (!(eVar instanceof y.f) && eVar.F0()) {
            int i8 = i7 + 1;
            if (a(i8, eVar)) {
                y.f.R2(i8, eVar, interfaceC0268b, new b.a(), b.a.f18901k);
            }
        }
        y.d r6 = eVar.r(d.b.TOP);
        y.d r7 = eVar.r(d.b.BOTTOM);
        int f7 = r6.f();
        int f8 = r7.f();
        if (r6.e() != null && r6.o()) {
            Iterator<y.d> it = r6.e().iterator();
            while (it.hasNext()) {
                y.d next = it.next();
                y.e eVar2 = next.f18533d;
                int i9 = i7 + 1;
                boolean a7 = a(i9, eVar2);
                if (eVar2.F0() && a7) {
                    y.f.R2(i9, eVar2, interfaceC0268b, new b.a(), b.a.f18901k);
                }
                boolean z6 = (next == eVar2.R && (dVar4 = eVar2.T.f18535f) != null && dVar4.o()) || (next == eVar2.T && (dVar3 = eVar2.R.f18535f) != null && dVar3.o());
                e.b j02 = eVar2.j0();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (j02 != bVar || a7) {
                    if (!eVar2.F0()) {
                        y.d dVar5 = eVar2.R;
                        if (next == dVar5 && eVar2.T.f18535f == null) {
                            int g7 = dVar5.g() + f7;
                            eVar2.t1(g7, eVar2.D() + g7);
                            k(i9, eVar2, interfaceC0268b);
                        } else {
                            y.d dVar6 = eVar2.T;
                            if (next == dVar6 && dVar5.f18535f == null) {
                                int g8 = f7 - dVar6.g();
                                eVar2.t1(g8 - eVar2.D(), g8);
                                k(i9, eVar2, interfaceC0268b);
                            } else if (z6 && !eVar2.D0()) {
                                h(i9, interfaceC0268b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.j0() == bVar && eVar2.D >= 0 && eVar2.C >= 0 && (eVar2.l0() == 8 || (eVar2.f18622x == 0 && eVar2.A() == 0.0f))) {
                    if (!eVar2.D0() && !eVar2.E0() && z6 && !eVar2.D0()) {
                        i(i9, eVar, interfaceC0268b, eVar2);
                    }
                }
            }
        }
        if (eVar instanceof y.h) {
            return;
        }
        if (r7.e() != null && r7.o()) {
            Iterator<y.d> it2 = r7.e().iterator();
            while (it2.hasNext()) {
                y.d next2 = it2.next();
                y.e eVar3 = next2.f18533d;
                int i10 = i7 + 1;
                boolean a8 = a(i10, eVar3);
                if (eVar3.F0() && a8) {
                    y.f.R2(i10, eVar3, interfaceC0268b, new b.a(), b.a.f18901k);
                }
                boolean z7 = (next2 == eVar3.R && (dVar2 = eVar3.T.f18535f) != null && dVar2.o()) || (next2 == eVar3.T && (dVar = eVar3.R.f18535f) != null && dVar.o());
                e.b j03 = eVar3.j0();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (j03 != bVar2 || a8) {
                    if (!eVar3.F0()) {
                        y.d dVar7 = eVar3.R;
                        if (next2 == dVar7 && eVar3.T.f18535f == null) {
                            int g9 = dVar7.g() + f8;
                            eVar3.t1(g9, eVar3.D() + g9);
                            k(i10, eVar3, interfaceC0268b);
                        } else {
                            y.d dVar8 = eVar3.T;
                            if (next2 == dVar8 && dVar7.f18535f == null) {
                                int g10 = f8 - dVar8.g();
                                eVar3.t1(g10 - eVar3.D(), g10);
                                k(i10, eVar3, interfaceC0268b);
                            } else if (z7 && !eVar3.D0()) {
                                h(i10, interfaceC0268b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.j0() == bVar2 && eVar3.D >= 0 && eVar3.C >= 0 && (eVar3.l0() == 8 || (eVar3.f18622x == 0 && eVar3.A() == 0.0f))) {
                    if (!eVar3.D0() && !eVar3.E0() && z7 && !eVar3.D0()) {
                        i(i10, eVar, interfaceC0268b, eVar3);
                    }
                }
            }
        }
        y.d r8 = eVar.r(d.b.BASELINE);
        if (r8.e() != null && r8.o()) {
            int f9 = r8.f();
            Iterator<y.d> it3 = r8.e().iterator();
            while (it3.hasNext()) {
                y.d next3 = it3.next();
                y.e eVar4 = next3.f18533d;
                int i11 = i7 + 1;
                boolean a9 = a(i11, eVar4);
                if (eVar4.F0() && a9) {
                    y.f.R2(i11, eVar4, interfaceC0268b, new b.a(), b.a.f18901k);
                }
                if (eVar4.j0() != e.b.MATCH_CONSTRAINT || a9) {
                    if (!eVar4.F0() && next3 == eVar4.U) {
                        eVar4.o1(next3.g() + f9);
                        k(i11, eVar4, interfaceC0268b);
                    }
                }
            }
        }
        eVar.O0();
    }
}
