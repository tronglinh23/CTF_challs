package q;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import q.i;
import y.d;

/* loaded from: classes.dex */
public class e {
    public static boolean A = false;
    public static int B = 1000;
    public static f C = null;
    public static long D = 0;
    public static long E = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final boolean f15010r = false;

    /* renamed from: s  reason: collision with root package name */
    public static final boolean f15011s = false;

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f15012t = false;

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f15013u = false;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f15014v = false;

    /* renamed from: w  reason: collision with root package name */
    public static boolean f15015w = true;

    /* renamed from: x  reason: collision with root package name */
    public static boolean f15016x = true;

    /* renamed from: y  reason: collision with root package name */
    public static boolean f15017y = true;

    /* renamed from: z  reason: collision with root package name */
    public static boolean f15018z = true;

    /* renamed from: d  reason: collision with root package name */
    public a f15022d;

    /* renamed from: g  reason: collision with root package name */
    public q.b[] f15025g;

    /* renamed from: n  reason: collision with root package name */
    public final c f15032n;

    /* renamed from: q  reason: collision with root package name */
    public a f15035q;

    /* renamed from: a  reason: collision with root package name */
    public boolean f15019a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f15020b = 0;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, i> f15021c = null;

    /* renamed from: e  reason: collision with root package name */
    public int f15023e = 32;

    /* renamed from: f  reason: collision with root package name */
    public int f15024f = 32;

    /* renamed from: h  reason: collision with root package name */
    public boolean f15026h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15027i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean[] f15028j = new boolean[32];

    /* renamed from: k  reason: collision with root package name */
    public int f15029k = 1;

    /* renamed from: l  reason: collision with root package name */
    public int f15030l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f15031m = 32;

    /* renamed from: o  reason: collision with root package name */
    public i[] f15033o = new i[B];

    /* renamed from: p  reason: collision with root package name */
    public int f15034p = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a(e eVar);

        i b(e eVar, boolean[] zArr);

        void c(e eVar, i iVar, boolean z6);

        void clear();

        void d(a aVar);

        void e(e eVar, q.b bVar, boolean z6);

        void f(i iVar);

        i getKey();

        boolean isEmpty();
    }

    /* loaded from: classes.dex */
    public class b extends q.b {
        public b(c cVar) {
            this.f15004e = new j(this, cVar);
        }
    }

    public e() {
        this.f15025g = null;
        this.f15025g = new q.b[32];
        W();
        c cVar = new c();
        this.f15032n = cVar;
        this.f15022d = new h(cVar);
        if (A) {
            this.f15035q = new b(cVar);
        } else {
            this.f15035q = new q.b(cVar);
        }
    }

    public static f L() {
        return C;
    }

    public static q.b w(e eVar, i iVar, i iVar2, float f7) {
        return eVar.v().m(iVar, iVar2, f7);
    }

    public final void A() {
        B();
        String str = "";
        for (int i7 = 0; i7 < this.f15030l; i7++) {
            str = (str + this.f15025g[i7]) + "\n";
        }
        System.out.println(str + this.f15022d + "\n");
    }

    public final void B() {
        System.out.println("Display Rows (" + this.f15030l + "x" + this.f15029k + ")\n");
    }

    public void C() {
        int i7 = 0;
        for (int i8 = 0; i8 < this.f15023e; i8++) {
            q.b bVar = this.f15025g[i8];
            if (bVar != null) {
                i7 += bVar.E();
            }
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f15030l; i10++) {
            q.b bVar2 = this.f15025g[i10];
            if (bVar2 != null) {
                i9 += bVar2.E();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("Linear System -> Table size: ");
        sb.append(this.f15023e);
        sb.append(" (");
        int i11 = this.f15023e;
        sb.append(H(i11 * i11));
        sb.append(") -- row sizes: ");
        sb.append(H(i7));
        sb.append(", actual size: ");
        sb.append(H(i9));
        sb.append(" rows: ");
        sb.append(this.f15030l);
        sb.append("/");
        sb.append(this.f15031m);
        sb.append(" cols: ");
        sb.append(this.f15029k);
        sb.append("/");
        sb.append(this.f15024f);
        sb.append(" ");
        sb.append(0);
        sb.append(" occupied cells, ");
        sb.append(H(0));
        printStream.println(sb.toString());
    }

    public void D() {
        B();
        String str = "";
        for (int i7 = 0; i7 < this.f15030l; i7++) {
            if (this.f15025g[i7].f15000a.f15088t == i.b.UNRESTRICTED) {
                str = (str + this.f15025g[i7].F()) + "\n";
            }
        }
        System.out.println(str + this.f15022d + "\n");
    }

    public final int E(a aVar) throws Exception {
        boolean z6;
        int i7 = 0;
        while (true) {
            if (i7 >= this.f15030l) {
                z6 = false;
                break;
            }
            q.b bVar = this.f15025g[i7];
            if (bVar.f15000a.f15088t != i.b.UNRESTRICTED && bVar.f15001b < 0.0f) {
                z6 = true;
                break;
            }
            i7++;
        }
        if (z6) {
            boolean z7 = false;
            int i8 = 0;
            while (!z7) {
                f fVar = C;
                if (fVar != null) {
                    fVar.f15051o++;
                }
                i8++;
                float f7 = Float.MAX_VALUE;
                int i9 = -1;
                int i10 = -1;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f15030l; i12++) {
                    q.b bVar2 = this.f15025g[i12];
                    if (bVar2.f15000a.f15088t != i.b.UNRESTRICTED && !bVar2.f15005f && bVar2.f15001b < 0.0f) {
                        int i13 = 9;
                        if (f15018z) {
                            int f8 = bVar2.f15004e.f();
                            int i14 = 0;
                            while (i14 < f8) {
                                i j7 = bVar2.f15004e.j(i14);
                                float c7 = bVar2.f15004e.c(j7);
                                if (c7 > 0.0f) {
                                    int i15 = 0;
                                    while (i15 < i13) {
                                        float f9 = j7.f15086r[i15] / c7;
                                        if ((f9 < f7 && i15 == i11) || i15 > i11) {
                                            i10 = j7.f15081m;
                                            i11 = i15;
                                            i9 = i12;
                                            f7 = f9;
                                        }
                                        i15++;
                                        i13 = 9;
                                    }
                                }
                                i14++;
                                i13 = 9;
                            }
                        } else {
                            for (int i16 = 1; i16 < this.f15029k; i16++) {
                                i iVar = this.f15032n.f15009d[i16];
                                float c8 = bVar2.f15004e.c(iVar);
                                if (c8 > 0.0f) {
                                    for (int i17 = 0; i17 < 9; i17++) {
                                        float f10 = iVar.f15086r[i17] / c8;
                                        if ((f10 < f7 && i17 == i11) || i17 > i11) {
                                            i10 = i16;
                                            i11 = i17;
                                            i9 = i12;
                                            f7 = f10;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i9 != -1) {
                    q.b bVar3 = this.f15025g[i9];
                    bVar3.f15000a.f15082n = -1;
                    f fVar2 = C;
                    if (fVar2 != null) {
                        fVar2.f15050n++;
                    }
                    bVar3.C(this.f15032n.f15009d[i10]);
                    i iVar2 = bVar3.f15000a;
                    iVar2.f15082n = i9;
                    iVar2.r(this, bVar3);
                } else {
                    z7 = true;
                }
                if (i8 > this.f15029k / 2) {
                    z7 = true;
                }
            }
            return i8;
        }
        return 0;
    }

    public void F(f fVar) {
        C = fVar;
    }

    public c G() {
        return this.f15032n;
    }

    public final String H(int i7) {
        int i8 = i7 * 4;
        int i9 = i8 / 1024;
        int i10 = i9 / 1024;
        if (i10 > 0) {
            return "" + i10 + " Mb";
        } else if (i9 > 0) {
            return "" + i9 + " Kb";
        } else {
            return "" + i8 + " bytes";
        }
    }

    public final String I(int i7) {
        return i7 == 1 ? "LOW" : i7 == 2 ? "MEDIUM" : i7 == 3 ? "HIGH" : i7 == 4 ? "HIGHEST" : i7 == 5 ? "EQUALITY" : i7 == 8 ? "FIXED" : i7 == 6 ? "BARRIER" : "NONE";
    }

    public a J() {
        return this.f15022d;
    }

    public int K() {
        int i7 = 0;
        for (int i8 = 0; i8 < this.f15030l; i8++) {
            q.b bVar = this.f15025g[i8];
            if (bVar != null) {
                i7 += bVar.E();
            }
        }
        return i7;
    }

    public int M() {
        return this.f15030l;
    }

    public int N() {
        return this.f15020b;
    }

    public int O(Object obj) {
        i j7 = ((y.d) obj).j();
        if (j7 != null) {
            return (int) (j7.f15084p + 0.5f);
        }
        return 0;
    }

    public q.b P(int i7) {
        return this.f15025g[i7];
    }

    public float Q(String str) {
        i R = R(str, i.b.UNRESTRICTED);
        if (R == null) {
            return 0.0f;
        }
        return R.f15084p;
    }

    public i R(String str, i.b bVar) {
        if (this.f15021c == null) {
            this.f15021c = new HashMap<>();
        }
        i iVar = this.f15021c.get(str);
        return iVar == null ? y(str, bVar) : iVar;
    }

    public final void S() {
        int i7 = this.f15023e * 2;
        this.f15023e = i7;
        this.f15025g = (q.b[]) Arrays.copyOf(this.f15025g, i7);
        c cVar = this.f15032n;
        cVar.f15009d = (i[]) Arrays.copyOf(cVar.f15009d, this.f15023e);
        int i8 = this.f15023e;
        this.f15028j = new boolean[i8];
        this.f15024f = i8;
        this.f15031m = i8;
        f fVar = C;
        if (fVar != null) {
            fVar.f15044h++;
            fVar.f15056t = Math.max(fVar.f15056t, i8);
            f fVar2 = C;
            fVar2.J = fVar2.f15056t;
        }
    }

    public void T() throws Exception {
        f fVar = C;
        if (fVar != null) {
            fVar.f15045i++;
        }
        if (this.f15022d.isEmpty()) {
            r();
        } else if (!this.f15026h && !this.f15027i) {
            U(this.f15022d);
        } else {
            f fVar2 = C;
            if (fVar2 != null) {
                fVar2.f15058v++;
            }
            boolean z6 = false;
            int i7 = 0;
            while (true) {
                if (i7 >= this.f15030l) {
                    z6 = true;
                    break;
                } else if (!this.f15025g[i7].f15005f) {
                    break;
                } else {
                    i7++;
                }
            }
            if (!z6) {
                U(this.f15022d);
                return;
            }
            f fVar3 = C;
            if (fVar3 != null) {
                fVar3.f15057u++;
            }
            r();
        }
    }

    public void U(a aVar) throws Exception {
        f fVar = C;
        if (fVar != null) {
            fVar.f15062z++;
            fVar.A = Math.max(fVar.A, this.f15029k);
            f fVar2 = C;
            fVar2.B = Math.max(fVar2.B, this.f15030l);
        }
        E(aVar);
        V(aVar, false);
        r();
    }

    public final int V(a aVar, boolean z6) {
        f fVar = C;
        if (fVar != null) {
            fVar.f15048l++;
        }
        for (int i7 = 0; i7 < this.f15029k; i7++) {
            this.f15028j[i7] = false;
        }
        boolean z7 = false;
        int i8 = 0;
        while (!z7) {
            f fVar2 = C;
            if (fVar2 != null) {
                fVar2.f15049m++;
            }
            i8++;
            if (i8 >= this.f15029k * 2) {
                return i8;
            }
            if (aVar.getKey() != null) {
                this.f15028j[aVar.getKey().f15081m] = true;
            }
            i b7 = aVar.b(this, this.f15028j);
            if (b7 != null) {
                boolean[] zArr = this.f15028j;
                int i9 = b7.f15081m;
                if (zArr[i9]) {
                    return i8;
                }
                zArr[i9] = true;
            }
            if (b7 != null) {
                float f7 = Float.MAX_VALUE;
                int i10 = -1;
                for (int i11 = 0; i11 < this.f15030l; i11++) {
                    q.b bVar = this.f15025g[i11];
                    if (bVar.f15000a.f15088t != i.b.UNRESTRICTED && !bVar.f15005f && bVar.y(b7)) {
                        float c7 = bVar.f15004e.c(b7);
                        if (c7 < 0.0f) {
                            float f8 = (-bVar.f15001b) / c7;
                            if (f8 < f7) {
                                i10 = i11;
                                f7 = f8;
                            }
                        }
                    }
                }
                if (i10 > -1) {
                    q.b bVar2 = this.f15025g[i10];
                    bVar2.f15000a.f15082n = -1;
                    f fVar3 = C;
                    if (fVar3 != null) {
                        fVar3.f15050n++;
                    }
                    bVar2.C(b7);
                    i iVar = bVar2.f15000a;
                    iVar.f15082n = i10;
                    iVar.r(this, bVar2);
                }
            } else {
                z7 = true;
            }
        }
        return i8;
    }

    public final void W() {
        int i7 = 0;
        if (A) {
            while (i7 < this.f15030l) {
                q.b bVar = this.f15025g[i7];
                if (bVar != null) {
                    this.f15032n.f15006a.a(bVar);
                }
                this.f15025g[i7] = null;
                i7++;
            }
            return;
        }
        while (i7 < this.f15030l) {
            q.b bVar2 = this.f15025g[i7];
            if (bVar2 != null) {
                this.f15032n.f15007b.a(bVar2);
            }
            this.f15025g[i7] = null;
            i7++;
        }
    }

    public void X(q.b bVar) {
        i iVar;
        int i7;
        if (!bVar.f15005f || (iVar = bVar.f15000a) == null) {
            return;
        }
        int i8 = iVar.f15082n;
        if (i8 != -1) {
            while (true) {
                i7 = this.f15030l;
                if (i8 >= i7 - 1) {
                    break;
                }
                q.b[] bVarArr = this.f15025g;
                int i9 = i8 + 1;
                q.b bVar2 = bVarArr[i9];
                i iVar2 = bVar2.f15000a;
                if (iVar2.f15082n == i9) {
                    iVar2.f15082n = i8;
                }
                bVarArr[i8] = bVar2;
                i8 = i9;
            }
            this.f15030l = i7 - 1;
        }
        i iVar3 = bVar.f15000a;
        if (!iVar3.f15085q) {
            iVar3.m(this, bVar.f15001b);
        }
        if (A) {
            this.f15032n.f15006a.a(bVar);
        } else {
            this.f15032n.f15007b.a(bVar);
        }
    }

    public void Y() {
        c cVar;
        int i7 = 0;
        while (true) {
            cVar = this.f15032n;
            i[] iVarArr = cVar.f15009d;
            if (i7 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i7];
            if (iVar != null) {
                iVar.l();
            }
            i7++;
        }
        cVar.f15008c.c(this.f15033o, this.f15034p);
        this.f15034p = 0;
        Arrays.fill(this.f15032n.f15009d, (Object) null);
        HashMap<String, i> hashMap = this.f15021c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f15020b = 0;
        this.f15022d.clear();
        this.f15029k = 1;
        for (int i8 = 0; i8 < this.f15030l; i8++) {
            q.b bVar = this.f15025g[i8];
            if (bVar != null) {
                bVar.f15002c = false;
            }
        }
        W();
        this.f15030l = 0;
        if (A) {
            this.f15035q = new b(this.f15032n);
        } else {
            this.f15035q = new q.b(this.f15032n);
        }
    }

    public final i a(i.b bVar, String str) {
        i b7 = this.f15032n.f15008c.b();
        if (b7 == null) {
            b7 = new i(bVar, str);
            b7.p(bVar, str);
        } else {
            b7.l();
            b7.p(bVar, str);
        }
        int i7 = this.f15034p;
        int i8 = B;
        if (i7 >= i8) {
            int i9 = i8 * 2;
            B = i9;
            this.f15033o = (i[]) Arrays.copyOf(this.f15033o, i9);
        }
        i[] iVarArr = this.f15033o;
        int i10 = this.f15034p;
        this.f15034p = i10 + 1;
        iVarArr[i10] = b7;
        return b7;
    }

    public void b(y.e eVar, y.e eVar2, float f7, int i7) {
        d.b bVar = d.b.LEFT;
        i u6 = u(eVar.r(bVar));
        d.b bVar2 = d.b.TOP;
        i u7 = u(eVar.r(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i u8 = u(eVar.r(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i u9 = u(eVar.r(bVar4));
        i u10 = u(eVar2.r(bVar));
        i u11 = u(eVar2.r(bVar2));
        i u12 = u(eVar2.r(bVar3));
        i u13 = u(eVar2.r(bVar4));
        q.b v6 = v();
        double d7 = f7;
        double d8 = i7;
        v6.v(u7, u9, u11, u13, (float) (Math.sin(d7) * d8));
        d(v6);
        q.b v7 = v();
        v7.v(u6, u8, u10, u12, (float) (Math.cos(d7) * d8));
        d(v7);
    }

    public void c(i iVar, i iVar2, int i7, float f7, i iVar3, i iVar4, int i8, int i9) {
        q.b v6 = v();
        v6.k(iVar, iVar2, i7, f7, iVar3, iVar4, i8);
        if (i9 != 8) {
            v6.g(this, i9);
        }
        d(v6);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(q.b r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            q.f r0 = q.e.C
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.f15046j
            long r3 = r3 + r1
            r0.f15046j = r3
            boolean r3 = r8.f15005f
            if (r3 == 0) goto L17
            long r3 = r0.f15047k
            long r3 = r3 + r1
            r0.f15047k = r3
        L17:
            int r0 = r7.f15030l
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f15031m
            if (r0 >= r4) goto L26
            int r0 = r7.f15029k
            int r0 = r0 + r3
            int r4 = r7.f15024f
            if (r0 < r4) goto L29
        L26:
            r7.S()
        L29:
            boolean r0 = r8.f15005f
            r4 = 0
            if (r0 != 0) goto La1
            r8.a(r7)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L38
            return
        L38:
            r8.w()
            boolean r0 = r8.i(r7)
            if (r0 == 0) goto L98
            q.i r0 = r7.t()
            r8.f15000a = r0
            int r5 = r7.f15030l
            r7.m(r8)
            int r6 = r7.f15030l
            int r5 = r5 + r3
            if (r6 != r5) goto L98
            q.e$a r4 = r7.f15035q
            r4.d(r8)
            q.e$a r4 = r7.f15035q
            r7.V(r4, r3)
            int r4 = r0.f15082n
            r5 = -1
            if (r4 != r5) goto L99
            q.i r4 = r8.f15000a
            if (r4 != r0) goto L76
            q.i r0 = r8.A(r0)
            if (r0 == 0) goto L76
            q.f r4 = q.e.C
            if (r4 == 0) goto L73
            long r5 = r4.f15050n
            long r5 = r5 + r1
            r4.f15050n = r5
        L73:
            r8.C(r0)
        L76:
            boolean r0 = r8.f15005f
            if (r0 != 0) goto L7f
            q.i r0 = r8.f15000a
            r0.r(r7, r8)
        L7f:
            boolean r0 = q.e.A
            if (r0 == 0) goto L8b
            q.c r0 = r7.f15032n
            q.g$a<q.b> r0 = r0.f15006a
            r0.a(r8)
            goto L92
        L8b:
            q.c r0 = r7.f15032n
            q.g$a<q.b> r0 = r0.f15007b
            r0.a(r8)
        L92:
            int r0 = r7.f15030l
            int r0 = r0 - r3
            r7.f15030l = r0
            goto L99
        L98:
            r3 = r4
        L99:
            boolean r0 = r8.x()
            if (r0 != 0) goto La0
            return
        La0:
            r4 = r3
        La1:
            if (r4 != 0) goto La6
            r7.m(r8)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.d(q.b):void");
    }

    public q.b e(i iVar, i iVar2, int i7, int i8) {
        if (f15015w && i8 == 8 && iVar2.f15085q && iVar.f15082n == -1) {
            iVar.m(this, iVar2.f15084p + i7);
            return null;
        }
        q.b v6 = v();
        v6.r(iVar, iVar2, i7);
        if (i8 != 8) {
            v6.g(this, i8);
        }
        d(v6);
        return v6;
    }

    public void f(i iVar, int i7) {
        if (f15015w && iVar.f15082n == -1) {
            float f7 = i7;
            iVar.m(this, f7);
            for (int i8 = 0; i8 < this.f15020b + 1; i8++) {
                i iVar2 = this.f15032n.f15009d[i8];
                if (iVar2 != null && iVar2.f15092x && iVar2.f15093y == iVar.f15081m) {
                    iVar2.m(this, iVar2.f15094z + f7);
                }
            }
            return;
        }
        int i9 = iVar.f15082n;
        if (i9 == -1) {
            q.b v6 = v();
            v6.l(iVar, i7);
            d(v6);
            return;
        }
        q.b bVar = this.f15025g[i9];
        if (bVar.f15005f) {
            bVar.f15001b = i7;
        } else if (bVar.f15004e.f() == 0) {
            bVar.f15005f = true;
            bVar.f15001b = i7;
        } else {
            q.b v7 = v();
            v7.q(iVar, i7);
            d(v7);
        }
    }

    public final void g(q.b bVar) {
        bVar.g(this, 0);
    }

    public void h(i iVar, i iVar2, int i7, boolean z6) {
        q.b v6 = v();
        i x6 = x();
        x6.f15083o = 0;
        v6.t(iVar, iVar2, x6, i7);
        d(v6);
    }

    public void i(i iVar, i iVar2, int i7, int i8) {
        q.b v6 = v();
        i x6 = x();
        x6.f15083o = 0;
        v6.t(iVar, iVar2, x6, i7);
        if (i8 != 8) {
            o(v6, (int) (v6.f15004e.c(x6) * (-1.0f)), i8);
        }
        d(v6);
    }

    public void j(i iVar, i iVar2, int i7, boolean z6) {
        q.b v6 = v();
        i x6 = x();
        x6.f15083o = 0;
        v6.u(iVar, iVar2, x6, i7);
        d(v6);
    }

    public void k(i iVar, i iVar2, int i7, int i8) {
        q.b v6 = v();
        i x6 = x();
        x6.f15083o = 0;
        v6.u(iVar, iVar2, x6, i7);
        if (i8 != 8) {
            o(v6, (int) (v6.f15004e.c(x6) * (-1.0f)), i8);
        }
        d(v6);
    }

    public void l(i iVar, i iVar2, i iVar3, i iVar4, float f7, int i7) {
        q.b v6 = v();
        v6.n(iVar, iVar2, iVar3, iVar4, f7);
        if (i7 != 8) {
            v6.g(this, i7);
        }
        d(v6);
    }

    public final void m(q.b bVar) {
        int i7;
        if (f15016x && bVar.f15005f) {
            bVar.f15000a.m(this, bVar.f15001b);
        } else {
            q.b[] bVarArr = this.f15025g;
            int i8 = this.f15030l;
            bVarArr[i8] = bVar;
            i iVar = bVar.f15000a;
            iVar.f15082n = i8;
            this.f15030l = i8 + 1;
            iVar.r(this, bVar);
        }
        if (f15016x && this.f15019a) {
            int i9 = 0;
            while (i9 < this.f15030l) {
                if (this.f15025g[i9] == null) {
                    System.out.println("WTF");
                }
                q.b bVar2 = this.f15025g[i9];
                if (bVar2 != null && bVar2.f15005f) {
                    bVar2.f15000a.m(this, bVar2.f15001b);
                    if (A) {
                        this.f15032n.f15006a.a(bVar2);
                    } else {
                        this.f15032n.f15007b.a(bVar2);
                    }
                    this.f15025g[i9] = null;
                    int i10 = i9 + 1;
                    int i11 = i10;
                    while (true) {
                        i7 = this.f15030l;
                        if (i10 >= i7) {
                            break;
                        }
                        q.b[] bVarArr2 = this.f15025g;
                        int i12 = i10 - 1;
                        q.b bVar3 = bVarArr2[i10];
                        bVarArr2[i12] = bVar3;
                        i iVar2 = bVar3.f15000a;
                        if (iVar2.f15082n == i10) {
                            iVar2.f15082n = i12;
                        }
                        i11 = i10;
                        i10++;
                    }
                    if (i11 < i7) {
                        this.f15025g[i11] = null;
                    }
                    this.f15030l = i7 - 1;
                    i9--;
                }
                i9++;
            }
            this.f15019a = false;
        }
    }

    public final void n(q.b bVar, int i7) {
        o(bVar, i7, 0);
    }

    public void o(q.b bVar, int i7, int i8) {
        bVar.h(s(i8, null), i7);
    }

    public void p(i iVar, i iVar2, int i7) {
        if (iVar.f15082n != -1 || i7 != 0) {
            e(iVar, iVar2, i7, 8);
            return;
        }
        if (iVar2.f15092x) {
            iVar2 = this.f15032n.f15009d[iVar2.f15093y];
        }
        if (iVar.f15092x) {
            i iVar3 = this.f15032n.f15009d[iVar.f15093y];
        } else {
            iVar.o(this, iVar2, 0.0f);
        }
    }

    public final void q() {
        int i7;
        int i8 = 0;
        while (i8 < this.f15030l) {
            q.b bVar = this.f15025g[i8];
            if (bVar.f15004e.f() == 0) {
                bVar.f15005f = true;
            }
            if (bVar.f15005f) {
                i iVar = bVar.f15000a;
                iVar.f15084p = bVar.f15001b;
                iVar.k(bVar);
                int i9 = i8;
                while (true) {
                    i7 = this.f15030l;
                    if (i9 >= i7 - 1) {
                        break;
                    }
                    q.b[] bVarArr = this.f15025g;
                    int i10 = i9 + 1;
                    bVarArr[i9] = bVarArr[i10];
                    i9 = i10;
                }
                this.f15025g[i7 - 1] = null;
                this.f15030l = i7 - 1;
                i8--;
                if (A) {
                    this.f15032n.f15006a.a(bVar);
                } else {
                    this.f15032n.f15007b.a(bVar);
                }
            }
            i8++;
        }
    }

    public final void r() {
        for (int i7 = 0; i7 < this.f15030l; i7++) {
            q.b bVar = this.f15025g[i7];
            bVar.f15000a.f15084p = bVar.f15001b;
        }
    }

    public i s(int i7, String str) {
        f fVar = C;
        if (fVar != null) {
            fVar.f15053q++;
        }
        if (this.f15029k + 1 >= this.f15024f) {
            S();
        }
        i a7 = a(i.b.ERROR, str);
        int i8 = this.f15020b + 1;
        this.f15020b = i8;
        this.f15029k++;
        a7.f15081m = i8;
        a7.f15083o = i7;
        this.f15032n.f15009d[i8] = a7;
        this.f15022d.f(a7);
        return a7;
    }

    public i t() {
        f fVar = C;
        if (fVar != null) {
            fVar.f15055s++;
        }
        if (this.f15029k + 1 >= this.f15024f) {
            S();
        }
        i a7 = a(i.b.SLACK, null);
        int i7 = this.f15020b + 1;
        this.f15020b = i7;
        this.f15029k++;
        a7.f15081m = i7;
        this.f15032n.f15009d[i7] = a7;
        return a7;
    }

    public i u(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f15029k + 1 >= this.f15024f) {
            S();
        }
        if (obj instanceof y.d) {
            y.d dVar = (y.d) obj;
            iVar = dVar.j();
            if (iVar == null) {
                dVar.z(this.f15032n);
                iVar = dVar.j();
            }
            int i7 = iVar.f15081m;
            if (i7 == -1 || i7 > this.f15020b || this.f15032n.f15009d[i7] == null) {
                if (i7 != -1) {
                    iVar.l();
                }
                int i8 = this.f15020b + 1;
                this.f15020b = i8;
                this.f15029k++;
                iVar.f15081m = i8;
                iVar.f15088t = i.b.UNRESTRICTED;
                this.f15032n.f15009d[i8] = iVar;
            }
        }
        return iVar;
    }

    public q.b v() {
        q.b b7;
        if (A) {
            b7 = this.f15032n.f15006a.b();
            if (b7 == null) {
                b7 = new b(this.f15032n);
                E++;
            } else {
                b7.D();
            }
        } else {
            b7 = this.f15032n.f15007b.b();
            if (b7 == null) {
                b7 = new q.b(this.f15032n);
                D++;
            } else {
                b7.D();
            }
        }
        i.j();
        return b7;
    }

    public i x() {
        f fVar = C;
        if (fVar != null) {
            fVar.f15054r++;
        }
        if (this.f15029k + 1 >= this.f15024f) {
            S();
        }
        i a7 = a(i.b.SLACK, null);
        int i7 = this.f15020b + 1;
        this.f15020b = i7;
        this.f15029k++;
        a7.f15081m = i7;
        this.f15032n.f15009d[i7] = a7;
        return a7;
    }

    public final i y(String str, i.b bVar) {
        f fVar = C;
        if (fVar != null) {
            fVar.f15052p++;
        }
        if (this.f15029k + 1 >= this.f15024f) {
            S();
        }
        i a7 = a(bVar, null);
        a7.n(str);
        int i7 = this.f15020b + 1;
        this.f15020b = i7;
        this.f15029k++;
        a7.f15081m = i7;
        if (this.f15021c == null) {
            this.f15021c = new HashMap<>();
        }
        this.f15021c.put(str, a7);
        this.f15032n.f15009d[this.f15020b] = a7;
        return a7;
    }

    public void z() {
        B();
        String str = " num vars " + this.f15020b + "\n";
        for (int i7 = 0; i7 < this.f15020b + 1; i7++) {
            i iVar = this.f15032n.f15009d[i7];
            if (iVar != null && iVar.f15085q) {
                str = str + " $[" + i7 + "] => " + iVar + " = " + iVar.f15084p + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i8 = 0; i8 < this.f15020b + 1; i8++) {
            i[] iVarArr = this.f15032n.f15009d;
            i iVar2 = iVarArr[i8];
            if (iVar2 != null && iVar2.f15092x) {
                str2 = str2 + " ~[" + i8 + "] => " + iVar2 + " = " + iVarArr[iVar2.f15093y] + " + " + iVar2.f15094z + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i9 = 0; i9 < this.f15030l; i9++) {
            str3 = (str3 + this.f15025g[i9].F()) + "\n #  ";
        }
        if (this.f15022d != null) {
            str3 = str3 + "Goal: " + this.f15022d + "\n";
        }
        System.out.println(str3);
    }
}