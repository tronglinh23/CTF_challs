package y;

import java.util.HashSet;
import y.e;
import z.b;

/* loaded from: classes.dex */
public class n extends j {
    public int C1 = 0;
    public int D1 = 0;
    public int E1 = 0;
    public int F1 = 0;
    public int G1 = 0;
    public int H1 = 0;
    public int I1 = 0;
    public int J1 = 0;
    public boolean K1 = false;
    public int L1 = 0;
    public int M1 = 0;
    public b.a N1 = new b.a();
    public b.InterfaceC0268b O1 = null;

    public void A2(int i7, int i8) {
        this.L1 = i7;
        this.M1 = i8;
    }

    public void B2(int i7) {
        this.E1 = i7;
        this.C1 = i7;
        this.F1 = i7;
        this.D1 = i7;
        this.G1 = i7;
        this.H1 = i7;
    }

    public void C2(int i7) {
        this.D1 = i7;
    }

    public void D2(int i7) {
        this.H1 = i7;
    }

    public void E2(int i7) {
        this.E1 = i7;
        this.I1 = i7;
    }

    public void F2(int i7) {
        this.F1 = i7;
        this.J1 = i7;
    }

    public void G2(int i7) {
        this.G1 = i7;
        this.I1 = i7;
        this.J1 = i7;
    }

    public void H2(int i7) {
        this.C1 = i7;
    }

    @Override // y.j, y.i
    public void a(f fVar) {
        n2();
    }

    public void m2(boolean z6) {
        int i7 = this.G1;
        if (i7 > 0 || this.H1 > 0) {
            if (z6) {
                this.I1 = this.H1;
                this.J1 = i7;
                return;
            }
            this.I1 = i7;
            this.J1 = this.H1;
        }
    }

    public void n2() {
        for (int i7 = 0; i7 < this.B1; i7++) {
            e eVar = this.A1[i7];
            if (eVar != null) {
                eVar.I1(true);
            }
        }
    }

    public boolean o2(HashSet<e> hashSet) {
        for (int i7 = 0; i7 < this.B1; i7++) {
            if (hashSet.contains(this.A1[i7])) {
                return true;
            }
        }
        return false;
    }

    public int p2() {
        return this.M1;
    }

    public int q2() {
        return this.L1;
    }

    public int r2() {
        return this.D1;
    }

    public int s2() {
        return this.I1;
    }

    public int t2() {
        return this.J1;
    }

    public int u2() {
        return this.C1;
    }

    public void v2(int i7, int i8, int i9, int i10) {
    }

    public void w2(e eVar, e.b bVar, int i7, e.b bVar2, int i8) {
        while (this.O1 == null && U() != null) {
            this.O1 = ((f) U()).G2();
        }
        b.a aVar = this.N1;
        aVar.f18904a = bVar;
        aVar.f18905b = bVar2;
        aVar.f18906c = i7;
        aVar.f18907d = i8;
        this.O1.b(eVar, aVar);
        eVar.c2(this.N1.f18908e);
        eVar.y1(this.N1.f18909f);
        eVar.x1(this.N1.f18911h);
        eVar.g1(this.N1.f18910g);
    }

    public boolean x2() {
        e eVar = this.f18581c0;
        b.InterfaceC0268b G2 = eVar != null ? ((f) eVar).G2() : null;
        if (G2 == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.B1) {
                return true;
            }
            e eVar2 = this.A1[i7];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b z6 = eVar2.z(0);
                e.b z7 = eVar2.z(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (!(z6 == bVar && eVar2.f18620w != 1 && z7 == bVar && eVar2.f18622x != 1)) {
                    if (z6 == bVar) {
                        z6 = e.b.WRAP_CONTENT;
                    }
                    if (z7 == bVar) {
                        z7 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.N1;
                    aVar.f18904a = z6;
                    aVar.f18905b = z7;
                    aVar.f18906c = eVar2.m0();
                    this.N1.f18907d = eVar2.D();
                    G2.b(eVar2, this.N1);
                    eVar2.c2(this.N1.f18908e);
                    eVar2.y1(this.N1.f18909f);
                    eVar2.g1(this.N1.f18910g);
                }
            }
            i7++;
        }
    }

    public boolean y2() {
        return this.K1;
    }

    public void z2(boolean z6) {
        this.K1 = z6;
    }
}