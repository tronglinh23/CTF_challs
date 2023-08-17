package z;

import java.util.ArrayList;
import y.d;
import y.e;
/* loaded from: classes.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f18890d = false;

    /* renamed from: e  reason: collision with root package name */
    public static final int f18891e = 30;

    /* renamed from: f  reason: collision with root package name */
    public static final int f18892f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f18893g = 1073741824;

    /* renamed from: h  reason: collision with root package name */
    public static final int f18894h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public static final int f18895i = -1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f18896j = -2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f18897k = -3;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<y.e> f18898a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f18899b = new a();

    /* renamed from: c  reason: collision with root package name */
    public y.f f18900c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static int f18901k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f18902l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f18903m = 2;

        /* renamed from: a  reason: collision with root package name */
        public e.b f18904a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f18905b;

        /* renamed from: c  reason: collision with root package name */
        public int f18906c;

        /* renamed from: d  reason: collision with root package name */
        public int f18907d;

        /* renamed from: e  reason: collision with root package name */
        public int f18908e;

        /* renamed from: f  reason: collision with root package name */
        public int f18909f;

        /* renamed from: g  reason: collision with root package name */
        public int f18910g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f18911h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f18912i;

        /* renamed from: j  reason: collision with root package name */
        public int f18913j;
    }

    /* renamed from: z.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0268b {
        void a();

        void b(y.e eVar, a aVar);
    }

    public b(y.f fVar) {
        this.f18900c = fVar;
    }

    public final boolean a(InterfaceC0268b interfaceC0268b, y.e eVar, int i7) {
        this.f18899b.f18904a = eVar.H();
        this.f18899b.f18905b = eVar.j0();
        this.f18899b.f18906c = eVar.m0();
        this.f18899b.f18907d = eVar.D();
        a aVar = this.f18899b;
        aVar.f18912i = false;
        aVar.f18913j = i7;
        e.b bVar = aVar.f18904a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z6 = bVar == bVar2;
        boolean z7 = aVar.f18905b == bVar2;
        boolean z8 = z6 && eVar.f18587f0 > 0.0f;
        boolean z9 = z7 && eVar.f18587f0 > 0.0f;
        if (z8 && eVar.f18624y[0] == 4) {
            aVar.f18904a = e.b.FIXED;
        }
        if (z9 && eVar.f18624y[1] == 4) {
            aVar.f18905b = e.b.FIXED;
        }
        interfaceC0268b.b(eVar, aVar);
        eVar.c2(this.f18899b.f18908e);
        eVar.y1(this.f18899b.f18909f);
        eVar.x1(this.f18899b.f18911h);
        eVar.g1(this.f18899b.f18910g);
        a aVar2 = this.f18899b;
        aVar2.f18913j = a.f18901k;
        return aVar2.f18912i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
        if (r8 != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
        if (r5.f18587f0 <= 0.0f) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(y.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<y.e> r0 = r13.A1
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.S2(r1)
            z.b$b r2 = r13.G2()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<y.e> r5 = r13.A1
            java.lang.Object r5 = r5.get(r4)
            y.e r5 = (y.e) r5
            boolean r6 = r5 instanceof y.h
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof y.a
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.E0()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            z.l r6 = r5.f18584e
            if (r6 == 0) goto L48
            z.n r7 = r5.f18586f
            if (r7 == 0) goto L48
            z.g r6 = r6.f18992e
            boolean r6 = r6.f18935j
            if (r6 == 0) goto L48
            z.g r6 = r7.f18992e
            boolean r6 = r6.f18935j
            if (r6 == 0) goto L48
            goto Lac
        L48:
            y.e$b r6 = r5.z(r3)
            r7 = 1
            y.e$b r8 = r5.z(r7)
            y.e$b r9 = y.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.f18620w
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.f18622x
            if (r10 == r7) goto L61
            r10 = r7
            goto L62
        L61:
            r10 = r3
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.S2(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof y.n
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.f18620w
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.B0()
            if (r11 != 0) goto L7d
            r10 = r7
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.f18622x
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.B0()
            if (r11 != 0) goto L8c
            r10 = r7
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.f18587f0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L98
            goto L99
        L98:
            r7 = r10
        L99:
            if (r7 == 0) goto L9c
            goto Lac
        L9c:
            int r6 = z.b.a.f18901k
            r12.a(r2, r5, r6)
            q.f r5 = r13.G1
            if (r5 == 0) goto Lac
            long r6 = r5.f15039c
            r8 = 1
            long r6 = r6 + r8
            r5.f15039c = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.b.b(y.f):void");
    }

    public final void c(y.f fVar, String str, int i7, int i8, int i9) {
        int Q = fVar.Q();
        int P = fVar.P();
        fVar.P1(0);
        fVar.O1(0);
        fVar.c2(i8);
        fVar.y1(i9);
        fVar.P1(Q);
        fVar.O1(P);
        this.f18900c.X2(i7);
        this.f18900c.n2();
    }

    public long d(y.f fVar, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        boolean z6;
        int i16;
        int i17;
        boolean z7;
        int i18;
        InterfaceC0268b interfaceC0268b;
        int i19;
        int i20;
        int i21;
        boolean z8;
        q.f fVar2;
        InterfaceC0268b G2 = fVar.G2();
        int size = fVar.A1.size();
        int m02 = fVar.m0();
        int D = fVar.D();
        boolean b7 = y.k.b(i7, 128);
        boolean z9 = b7 || y.k.b(i7, 64);
        if (z9) {
            for (int i22 = 0; i22 < size; i22++) {
                y.e eVar = fVar.A1.get(i22);
                e.b H = eVar.H();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z10 = (H == bVar) && (eVar.j0() == bVar) && eVar.A() > 0.0f;
                if ((eVar.B0() && z10) || ((eVar.D0() && z10) || (eVar instanceof y.n) || eVar.B0() || eVar.D0())) {
                    z9 = false;
                    break;
                }
            }
        }
        if (z9 && (fVar2 = q.e.C) != null) {
            fVar2.f15041e++;
        }
        boolean z11 = z9 & ((i10 == 1073741824 && i12 == 1073741824) || b7);
        int i23 = 2;
        if (z11) {
            int min = Math.min(fVar.O(), i11);
            int min2 = Math.min(fVar.N(), i13);
            if (i10 == 1073741824 && fVar.m0() != min) {
                fVar.c2(min);
                fVar.L2();
            }
            if (i12 == 1073741824 && fVar.D() != min2) {
                fVar.y1(min2);
                fVar.L2();
            }
            if (i10 == 1073741824 && i12 == 1073741824) {
                z6 = fVar.B2(b7);
                i16 = 2;
            } else {
                boolean C2 = fVar.C2(b7);
                if (i10 == 1073741824) {
                    C2 &= fVar.D2(b7, 0);
                    i16 = 1;
                } else {
                    i16 = 0;
                }
                if (i12 == 1073741824) {
                    z6 = fVar.D2(b7, 1) & C2;
                    i16++;
                } else {
                    z6 = C2;
                }
            }
            if (z6) {
                fVar.i2(i10 == 1073741824, i12 == 1073741824);
            }
        } else {
            z6 = false;
            i16 = 0;
        }
        if (z6 && i16 == 2) {
            return 0L;
        }
        int H2 = fVar.H2();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = this.f18898a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, m02, D);
        }
        if (size2 > 0) {
            e.b H3 = fVar.H();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z12 = H3 == bVar2;
            boolean z13 = fVar.j0() == bVar2;
            int max = Math.max(fVar.m0(), this.f18900c.Q());
            int max2 = Math.max(fVar.D(), this.f18900c.P());
            int i24 = 0;
            boolean z14 = false;
            while (i24 < size2) {
                y.e eVar2 = this.f18898a.get(i24);
                if (eVar2 instanceof y.n) {
                    int m03 = eVar2.m0();
                    i19 = H2;
                    int D2 = eVar2.D();
                    i20 = D;
                    boolean a7 = a(G2, eVar2, a.f18902l) | z14;
                    q.f fVar3 = fVar.G1;
                    i21 = m02;
                    if (fVar3 != null) {
                        fVar3.f15040d++;
                    }
                    int m04 = eVar2.m0();
                    int D3 = eVar2.D();
                    if (m04 != m03) {
                        eVar2.c2(m04);
                        if (z12 && eVar2.X() > max) {
                            max = Math.max(max, eVar2.X() + eVar2.r(d.b.RIGHT).g());
                        }
                        z8 = true;
                    } else {
                        z8 = a7;
                    }
                    if (D3 != D2) {
                        eVar2.y1(D3);
                        if (z13 && eVar2.v() > max2) {
                            max2 = Math.max(max2, eVar2.v() + eVar2.r(d.b.BOTTOM).g());
                        }
                        z8 = true;
                    }
                    z14 = z8 | ((y.n) eVar2).y2();
                } else {
                    i19 = H2;
                    i21 = m02;
                    i20 = D;
                }
                i24++;
                H2 = i19;
                D = i20;
                m02 = i21;
                i23 = 2;
            }
            int i25 = H2;
            int i26 = m02;
            int i27 = D;
            int i28 = i23;
            int i29 = 0;
            while (i29 < i28) {
                int i30 = 0;
                while (i30 < size2) {
                    y.e eVar3 = this.f18898a.get(i30);
                    if (((eVar3 instanceof y.i) && !(eVar3 instanceof y.n)) || (eVar3 instanceof y.h) || eVar3.l0() == 8 || ((z11 && eVar3.f18584e.f18992e.f18935j && eVar3.f18586f.f18992e.f18935j) || (eVar3 instanceof y.n))) {
                        z7 = z11;
                        i18 = size2;
                        interfaceC0268b = G2;
                    } else {
                        int m05 = eVar3.m0();
                        int D4 = eVar3.D();
                        int t6 = eVar3.t();
                        int i31 = a.f18902l;
                        z7 = z11;
                        if (i29 == 1) {
                            i31 = a.f18903m;
                        }
                        boolean a8 = a(G2, eVar3, i31) | z14;
                        q.f fVar4 = fVar.G1;
                        i18 = size2;
                        interfaceC0268b = G2;
                        if (fVar4 != null) {
                            fVar4.f15040d++;
                        }
                        int m06 = eVar3.m0();
                        int D5 = eVar3.D();
                        if (m06 != m05) {
                            eVar3.c2(m06);
                            if (z12 && eVar3.X() > max) {
                                max = Math.max(max, eVar3.X() + eVar3.r(d.b.RIGHT).g());
                            }
                            a8 = true;
                        }
                        if (D5 != D4) {
                            eVar3.y1(D5);
                            if (z13 && eVar3.v() > max2) {
                                max2 = Math.max(max2, eVar3.v() + eVar3.r(d.b.BOTTOM).g());
                            }
                            a8 = true;
                        }
                        z14 = (!eVar3.q0() || t6 == eVar3.t()) ? a8 : true;
                    }
                    i30++;
                    G2 = interfaceC0268b;
                    z11 = z7;
                    size2 = i18;
                }
                boolean z15 = z11;
                int i32 = size2;
                InterfaceC0268b interfaceC0268b2 = G2;
                if (!z14) {
                    break;
                }
                i29++;
                c(fVar, "intermediate pass", i29, i26, i27);
                G2 = interfaceC0268b2;
                z11 = z15;
                size2 = i32;
                i28 = 2;
                z14 = false;
            }
            i17 = i25;
        } else {
            i17 = H2;
        }
        fVar.V2(i17);
        return 0L;
    }

    public void e(y.f fVar) {
        this.f18898a.clear();
        int size = fVar.A1.size();
        for (int i7 = 0; i7 < size; i7++) {
            y.e eVar = fVar.A1.get(i7);
            e.b H = eVar.H();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (H == bVar || eVar.j0() == bVar) {
                this.f18898a.add(eVar);
            }
        }
        fVar.L2();
    }
}
