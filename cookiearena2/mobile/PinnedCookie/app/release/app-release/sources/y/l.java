package y;

import y.d;
/* loaded from: classes.dex */
public class l extends n {
    @Override // y.e
    public void g(q.e eVar, boolean z6) {
        super.g(eVar, z6);
        if (this.B1 > 0) {
            e eVar2 = this.A1[0];
            eVar2.S0();
            d.b bVar = d.b.LEFT;
            eVar2.j(bVar, this, bVar);
            d.b bVar2 = d.b.RIGHT;
            eVar2.j(bVar2, this, bVar2);
            d.b bVar3 = d.b.TOP;
            eVar2.j(bVar3, this, bVar3);
            d.b bVar4 = d.b.BOTTOM;
            eVar2.j(bVar4, this, bVar4);
        }
    }

    @Override // y.n
    public void v2(int i7, int i8, int i9, int i10) {
        int s22 = s2() + t2() + 0;
        int u22 = u2() + r2() + 0;
        if (this.B1 > 0) {
            s22 += this.A1[0].m0();
            u22 += this.A1[0].D();
        }
        int max = Math.max(Q(), s22);
        int max2 = Math.max(P(), u22);
        if (i7 != 1073741824) {
            i8 = i7 == Integer.MIN_VALUE ? Math.min(max, i8) : i7 == 0 ? max : 0;
        }
        if (i9 != 1073741824) {
            i10 = i9 == Integer.MIN_VALUE ? Math.min(max2, i10) : i9 == 0 ? max2 : 0;
        }
        A2(i8, i10);
        c2(i8);
        y1(i10);
        z2(this.B1 > 0);
    }
}
