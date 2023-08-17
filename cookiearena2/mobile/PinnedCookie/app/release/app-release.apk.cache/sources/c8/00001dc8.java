package y;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import y.e;
import z.b;

/* loaded from: classes.dex */
public class f extends o {

    /* renamed from: g2  reason: collision with root package name */
    public static final int f18635g2 = 8;

    /* renamed from: h2  reason: collision with root package name */
    public static final boolean f18636h2 = false;

    /* renamed from: i2  reason: collision with root package name */
    public static final boolean f18637i2 = false;

    /* renamed from: j2  reason: collision with root package name */
    public static final boolean f18638j2 = false;

    /* renamed from: k2  reason: collision with root package name */
    public static int f18639k2;
    public z.b B1;
    public z.e C1;
    public int D1;
    public b.InterfaceC0268b E1;
    public boolean F1;
    public q.f G1;
    public q.e H1;
    public int I1;
    public int J1;
    public int K1;
    public int L1;
    public int M1;
    public int N1;
    public c[] O1;
    public c[] P1;
    public boolean Q1;
    public boolean R1;
    public boolean S1;
    public int T1;
    public int U1;
    public int V1;
    public boolean W1;
    public boolean X1;
    public boolean Y1;
    public int Z1;

    /* renamed from: a2  reason: collision with root package name */
    public WeakReference<d> f18640a2;

    /* renamed from: b2  reason: collision with root package name */
    public WeakReference<d> f18641b2;

    /* renamed from: c2  reason: collision with root package name */
    public WeakReference<d> f18642c2;

    /* renamed from: d2  reason: collision with root package name */
    public WeakReference<d> f18643d2;

    /* renamed from: e2  reason: collision with root package name */
    public HashSet<e> f18644e2;

    /* renamed from: f2  reason: collision with root package name */
    public b.a f18645f2;

    public f() {
        this.B1 = new z.b(this);
        this.C1 = new z.e(this);
        this.E1 = null;
        this.F1 = false;
        this.H1 = new q.e();
        this.M1 = 0;
        this.N1 = 0;
        this.O1 = new c[4];
        this.P1 = new c[4];
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.T1 = 0;
        this.U1 = 0;
        this.V1 = 257;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = 0;
        this.f18640a2 = null;
        this.f18641b2 = null;
        this.f18642c2 = null;
        this.f18643d2 = null;
        this.f18644e2 = new HashSet<>();
        this.f18645f2 = new b.a();
    }

    public static boolean R2(int i7, e eVar, b.InterfaceC0268b interfaceC0268b, b.a aVar, int i8) {
        int i9;
        int i10;
        if (interfaceC0268b == null) {
            return false;
        }
        if (eVar.l0() == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.f18908e = 0;
            aVar.f18909f = 0;
            return false;
        }
        aVar.f18904a = eVar.H();
        aVar.f18905b = eVar.j0();
        aVar.f18906c = eVar.m0();
        aVar.f18907d = eVar.D();
        aVar.f18912i = false;
        aVar.f18913j = i8;
        e.b bVar = aVar.f18904a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z6 = bVar == bVar2;
        boolean z7 = aVar.f18905b == bVar2;
        boolean z8 = z6 && eVar.f18587f0 > 0.0f;
        boolean z9 = z7 && eVar.f18587f0 > 0.0f;
        if (z6 && eVar.r0(0) && eVar.f18620w == 0 && !z8) {
            aVar.f18904a = e.b.WRAP_CONTENT;
            if (z7 && eVar.f18622x == 0) {
                aVar.f18904a = e.b.FIXED;
            }
            z6 = false;
        }
        if (z7 && eVar.r0(1) && eVar.f18622x == 0 && !z9) {
            aVar.f18905b = e.b.WRAP_CONTENT;
            if (z6 && eVar.f18620w == 0) {
                aVar.f18905b = e.b.FIXED;
            }
            z7 = false;
        }
        if (eVar.G0()) {
            aVar.f18904a = e.b.FIXED;
            z6 = false;
        }
        if (eVar.H0()) {
            aVar.f18905b = e.b.FIXED;
            z7 = false;
        }
        if (z8) {
            if (eVar.f18624y[0] == 4) {
                aVar.f18904a = e.b.FIXED;
            } else if (!z7) {
                e.b bVar3 = aVar.f18905b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i10 = aVar.f18907d;
                } else {
                    aVar.f18904a = e.b.WRAP_CONTENT;
                    interfaceC0268b.b(eVar, aVar);
                    i10 = aVar.f18909f;
                }
                aVar.f18904a = bVar4;
                aVar.f18906c = (int) (eVar.A() * i10);
            }
        }
        if (z9) {
            if (eVar.f18624y[1] == 4) {
                aVar.f18905b = e.b.FIXED;
            } else if (!z6) {
                e.b bVar5 = aVar.f18904a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i9 = aVar.f18906c;
                } else {
                    aVar.f18905b = e.b.WRAP_CONTENT;
                    interfaceC0268b.b(eVar, aVar);
                    i9 = aVar.f18908e;
                }
                aVar.f18905b = bVar6;
                if (eVar.B() == -1) {
                    aVar.f18907d = (int) (i9 / eVar.A());
                } else {
                    aVar.f18907d = (int) (eVar.A() * i9);
                }
            }
        }
        interfaceC0268b.b(eVar, aVar);
        eVar.c2(aVar.f18908e);
        eVar.y1(aVar.f18909f);
        eVar.x1(aVar.f18911h);
        eVar.g1(aVar.f18910g);
        aVar.f18913j = b.a.f18901k;
        return aVar.f18912i;
    }

    public void A2() {
        this.C1.f(H(), j0());
    }

    public boolean B2(boolean z6) {
        return this.C1.g(z6);
    }

    public boolean C2(boolean z6) {
        return this.C1.h(z6);
    }

    public boolean D2(boolean z6, int i7) {
        return this.C1.i(z6, i7);
    }

    public void E2(q.f fVar) {
        this.G1 = fVar;
        this.H1.F(fVar);
    }

    public ArrayList<h> F2() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.A1.size();
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = this.A1.get(i7);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.m2() == 0) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public b.InterfaceC0268b G2() {
        return this.E1;
    }

    public int H2() {
        return this.V1;
    }

    public q.e I2() {
        return this.H1;
    }

    public ArrayList<h> J2() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.A1.size();
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = this.A1.get(i7);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.m2() == 1) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public boolean K2() {
        return false;
    }

    public void L2() {
        this.C1.o();
    }

    public void M2() {
        this.C1.p();
    }

    public boolean N2() {
        return this.Y1;
    }

    public boolean O2() {
        return this.F1;
    }

    public boolean P2() {
        return this.X1;
    }

    public long Q2(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.I1 = i14;
        this.J1 = i15;
        return this.B1.d(this, i7, i14, i15, i8, i9, i10, i11, i12, i13);
    }

    @Override // y.o, y.e
    public void R0() {
        this.H1.Y();
        this.I1 = 0;
        this.K1 = 0;
        this.J1 = 0;
        this.L1 = 0;
        this.W1 = false;
        super.R0();
    }

    public boolean S2(int i7) {
        return (this.V1 & i7) == i7;
    }

    public final void T2() {
        this.M1 = 0;
        this.N1 = 0;
    }

    public void U2(b.InterfaceC0268b interfaceC0268b) {
        this.E1 = interfaceC0268b;
        this.C1.u(interfaceC0268b);
    }

    public void V2(int i7) {
        this.V1 = i7;
        q.e.f15014v = S2(512);
    }

    public void W2(int i7, int i8, int i9, int i10) {
        this.I1 = i7;
        this.J1 = i8;
        this.K1 = i9;
        this.L1 = i10;
    }

    public void X2(int i7) {
        this.D1 = i7;
    }

    public void Y2(boolean z6) {
        this.F1 = z6;
    }

    public boolean Z2(q.e eVar, boolean[] zArr) {
        zArr[2] = false;
        boolean S2 = S2(64);
        j2(eVar, S2);
        int size = this.A1.size();
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            e eVar2 = this.A1.get(i7);
            eVar2.j2(eVar, S2);
            if (eVar2.t0()) {
                z6 = true;
            }
        }
        return z6;
    }

    public void a3() {
        this.B1.e(this);
    }

    @Override // y.e
    public void b0(StringBuilder sb) {
        sb.append(this.f18604o + ":{\n");
        sb.append("  actualWidth:" + this.f18583d0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f18585e0);
        sb.append("\n");
        Iterator<e> it = l2().iterator();
        while (it.hasNext()) {
            it.next().b0(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    @Override // y.e
    public String f0() {
        return "ConstraintLayout";
    }

    @Override // y.e
    public void i2(boolean z6, boolean z7) {
        super.i2(z6, z7);
        int size = this.A1.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.A1.get(i7).i2(z6, z7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x031d  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // y.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n2() {
        /*
            Method dump skipped, instructions count: 826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.f.n2():void");
    }

    public void q2(e eVar, int i7) {
        if (i7 == 0) {
            s2(eVar);
        } else if (i7 == 1) {
            x2(eVar);
        }
    }

    public boolean r2(q.e eVar) {
        boolean S2 = S2(64);
        g(eVar, S2);
        int size = this.A1.size();
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            e eVar2 = this.A1.get(i7);
            eVar2.G1(0, false);
            eVar2.G1(1, false);
            if (eVar2 instanceof a) {
                z6 = true;
            }
        }
        if (z6) {
            for (int i8 = 0; i8 < size; i8++) {
                e eVar3 = this.A1.get(i8);
                if (eVar3 instanceof a) {
                    ((a) eVar3).s2();
                }
            }
        }
        this.f18644e2.clear();
        for (int i9 = 0; i9 < size; i9++) {
            e eVar4 = this.A1.get(i9);
            if (eVar4.f()) {
                if (eVar4 instanceof n) {
                    this.f18644e2.add(eVar4);
                } else {
                    eVar4.g(eVar, S2);
                }
            }
        }
        while (this.f18644e2.size() > 0) {
            int size2 = this.f18644e2.size();
            Iterator<e> it = this.f18644e2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                n nVar = (n) it.next();
                if (nVar.o2(this.f18644e2)) {
                    nVar.g(eVar, S2);
                    this.f18644e2.remove(nVar);
                    break;
                }
            }
            if (size2 == this.f18644e2.size()) {
                Iterator<e> it2 = this.f18644e2.iterator();
                while (it2.hasNext()) {
                    it2.next().g(eVar, S2);
                }
                this.f18644e2.clear();
            }
        }
        if (q.e.f15014v) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar5 = this.A1.get(i10);
                if (!eVar5.f()) {
                    hashSet.add(eVar5);
                }
            }
            e(this, eVar, hashSet, H() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                k.a(this, eVar, next);
                next.g(eVar, S2);
            }
        } else {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar6 = this.A1.get(i11);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.f18579b0;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.D1(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.Y1(e.b.FIXED);
                    }
                    eVar6.g(eVar, S2);
                    if (bVar == bVar3) {
                        eVar6.D1(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.Y1(bVar2);
                    }
                } else {
                    k.a(this, eVar, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(eVar, S2);
                    }
                }
            }
        }
        if (this.M1 > 0) {
            b.b(this, eVar, null, 0);
        }
        if (this.N1 > 0) {
            b.b(this, eVar, null, 1);
        }
        return true;
    }

    public final void s2(e eVar) {
        int i7 = this.M1 + 1;
        c[] cVarArr = this.P1;
        if (i7 >= cVarArr.length) {
            this.P1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.P1[this.M1] = new c(eVar, 0, O2());
        this.M1++;
    }

    public void t2(d dVar) {
        WeakReference<d> weakReference = this.f18643d2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f18643d2.get().f()) {
            this.f18643d2 = new WeakReference<>(dVar);
        }
    }

    public void u2(d dVar) {
        WeakReference<d> weakReference = this.f18641b2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f18641b2.get().f()) {
            this.f18641b2 = new WeakReference<>(dVar);
        }
    }

    public final void v2(d dVar, q.i iVar) {
        this.H1.i(iVar, this.H1.u(dVar), 0, 5);
    }

    public final void w2(d dVar, q.i iVar) {
        this.H1.i(this.H1.u(dVar), iVar, 0, 5);
    }

    public final void x2(e eVar) {
        int i7 = this.N1 + 1;
        c[] cVarArr = this.O1;
        if (i7 >= cVarArr.length) {
            this.O1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.O1[this.N1] = new c(eVar, 1, O2());
        this.N1++;
    }

    public void y2(d dVar) {
        WeakReference<d> weakReference = this.f18642c2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f18642c2.get().f()) {
            this.f18642c2 = new WeakReference<>(dVar);
        }
    }

    public void z2(d dVar) {
        WeakReference<d> weakReference = this.f18640a2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f18640a2.get().f()) {
            this.f18640a2 = new WeakReference<>(dVar);
        }
    }

    public f(int i7, int i8, int i9, int i10) {
        super(i7, i8, i9, i10);
        this.B1 = new z.b(this);
        this.C1 = new z.e(this);
        this.E1 = null;
        this.F1 = false;
        this.H1 = new q.e();
        this.M1 = 0;
        this.N1 = 0;
        this.O1 = new c[4];
        this.P1 = new c[4];
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.T1 = 0;
        this.U1 = 0;
        this.V1 = 257;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = 0;
        this.f18640a2 = null;
        this.f18641b2 = null;
        this.f18642c2 = null;
        this.f18643d2 = null;
        this.f18644e2 = new HashSet<>();
        this.f18645f2 = new b.a();
    }

    public f(int i7, int i8) {
        super(i7, i8);
        this.B1 = new z.b(this);
        this.C1 = new z.e(this);
        this.E1 = null;
        this.F1 = false;
        this.H1 = new q.e();
        this.M1 = 0;
        this.N1 = 0;
        this.O1 = new c[4];
        this.P1 = new c[4];
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.T1 = 0;
        this.U1 = 0;
        this.V1 = 257;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = 0;
        this.f18640a2 = null;
        this.f18641b2 = null;
        this.f18642c2 = null;
        this.f18643d2 = null;
        this.f18644e2 = new HashSet<>();
        this.f18645f2 = new b.a();
    }

    public f(String str, int i7, int i8) {
        super(i7, i8);
        this.B1 = new z.b(this);
        this.C1 = new z.e(this);
        this.E1 = null;
        this.F1 = false;
        this.H1 = new q.e();
        this.M1 = 0;
        this.N1 = 0;
        this.O1 = new c[4];
        this.P1 = new c[4];
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.T1 = 0;
        this.U1 = 0;
        this.V1 = 257;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = 0;
        this.f18640a2 = null;
        this.f18641b2 = null;
        this.f18642c2 = null;
        this.f18643d2 = null;
        this.f18644e2 = new HashSet<>();
        this.f18645f2 = new b.a();
        j1(str);
    }
}