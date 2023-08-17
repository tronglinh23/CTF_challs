package z;

import java.util.Iterator;
import z.f;
/* loaded from: classes.dex */
public class k extends p {
    public k(y.e eVar) {
        super(eVar);
    }

    @Override // z.p, z.d
    public void a(d dVar) {
        y.a aVar = (y.a) this.f18989b;
        int p22 = aVar.p2();
        Iterator<f> it = this.f18995h.f18937l.iterator();
        int i7 = 0;
        int i8 = -1;
        while (it.hasNext()) {
            int i9 = it.next().f18932g;
            if (i8 == -1 || i9 < i8) {
                i8 = i9;
            }
            if (i7 < i9) {
                i7 = i9;
            }
        }
        if (p22 == 0 || p22 == 2) {
            this.f18995h.e(i8 + aVar.q2());
        } else {
            this.f18995h.e(i7 + aVar.q2());
        }
    }

    @Override // z.p
    public void d() {
        y.e eVar = this.f18989b;
        if (eVar instanceof y.a) {
            this.f18995h.f18927b = true;
            y.a aVar = (y.a) eVar;
            int p22 = aVar.p2();
            boolean o22 = aVar.o2();
            int i7 = 0;
            if (p22 == 0) {
                this.f18995h.f18930e = f.a.LEFT;
                while (i7 < aVar.B1) {
                    y.e eVar2 = aVar.A1[i7];
                    if (o22 || eVar2.l0() != 8) {
                        f fVar = eVar2.f18584e.f18995h;
                        fVar.f18936k.add(this.f18995h);
                        this.f18995h.f18937l.add(fVar);
                    }
                    i7++;
                }
                u(this.f18989b.f18584e.f18995h);
                u(this.f18989b.f18584e.f18996i);
            } else if (p22 == 1) {
                this.f18995h.f18930e = f.a.RIGHT;
                while (i7 < aVar.B1) {
                    y.e eVar3 = aVar.A1[i7];
                    if (o22 || eVar3.l0() != 8) {
                        f fVar2 = eVar3.f18584e.f18996i;
                        fVar2.f18936k.add(this.f18995h);
                        this.f18995h.f18937l.add(fVar2);
                    }
                    i7++;
                }
                u(this.f18989b.f18584e.f18995h);
                u(this.f18989b.f18584e.f18996i);
            } else if (p22 == 2) {
                this.f18995h.f18930e = f.a.TOP;
                while (i7 < aVar.B1) {
                    y.e eVar4 = aVar.A1[i7];
                    if (o22 || eVar4.l0() != 8) {
                        f fVar3 = eVar4.f18586f.f18995h;
                        fVar3.f18936k.add(this.f18995h);
                        this.f18995h.f18937l.add(fVar3);
                    }
                    i7++;
                }
                u(this.f18989b.f18586f.f18995h);
                u(this.f18989b.f18586f.f18996i);
            } else if (p22 != 3) {
            } else {
                this.f18995h.f18930e = f.a.BOTTOM;
                while (i7 < aVar.B1) {
                    y.e eVar5 = aVar.A1[i7];
                    if (o22 || eVar5.l0() != 8) {
                        f fVar4 = eVar5.f18586f.f18996i;
                        fVar4.f18936k.add(this.f18995h);
                        this.f18995h.f18937l.add(fVar4);
                    }
                    i7++;
                }
                u(this.f18989b.f18586f.f18995h);
                u(this.f18989b.f18586f.f18996i);
            }
        }
    }

    @Override // z.p
    public void e() {
        y.e eVar = this.f18989b;
        if (eVar instanceof y.a) {
            int p22 = ((y.a) eVar).p2();
            if (p22 == 0 || p22 == 1) {
                this.f18989b.f2(this.f18995h.f18932g);
            } else {
                this.f18989b.g2(this.f18995h.f18932g);
            }
        }
    }

    @Override // z.p
    public void f() {
        this.f18990c = null;
        this.f18995h.c();
    }

    @Override // z.p
    public void n() {
        this.f18995h.f18935j = false;
    }

    @Override // z.p
    public boolean p() {
        return false;
    }

    public final void u(f fVar) {
        this.f18995h.f18936k.add(fVar);
        fVar.f18937l.add(this.f18995h);
    }
}
