package z;
/* loaded from: classes.dex */
public class j extends p {
    public j(y.e eVar) {
        super(eVar);
        eVar.f18584e.f();
        eVar.f18586f.f();
        this.f18993f = ((y.h) eVar).m2();
    }

    @Override // z.p, z.d
    public void a(d dVar) {
        f fVar = this.f18995h;
        if (fVar.f18928c && !fVar.f18935j) {
            this.f18995h.e((int) ((fVar.f18937l.get(0).f18932g * ((y.h) this.f18989b).q2()) + 0.5f));
        }
    }

    @Override // z.p
    public void d() {
        y.h hVar = (y.h) this.f18989b;
        int n22 = hVar.n2();
        int p22 = hVar.p2();
        hVar.q2();
        if (hVar.m2() == 1) {
            if (n22 != -1) {
                this.f18995h.f18937l.add(this.f18989b.f18581c0.f18584e.f18995h);
                this.f18989b.f18581c0.f18584e.f18995h.f18936k.add(this.f18995h);
                this.f18995h.f18931f = n22;
            } else if (p22 != -1) {
                this.f18995h.f18937l.add(this.f18989b.f18581c0.f18584e.f18996i);
                this.f18989b.f18581c0.f18584e.f18996i.f18936k.add(this.f18995h);
                this.f18995h.f18931f = -p22;
            } else {
                f fVar = this.f18995h;
                fVar.f18927b = true;
                fVar.f18937l.add(this.f18989b.f18581c0.f18584e.f18996i);
                this.f18989b.f18581c0.f18584e.f18996i.f18936k.add(this.f18995h);
            }
            u(this.f18989b.f18584e.f18995h);
            u(this.f18989b.f18584e.f18996i);
            return;
        }
        if (n22 != -1) {
            this.f18995h.f18937l.add(this.f18989b.f18581c0.f18586f.f18995h);
            this.f18989b.f18581c0.f18586f.f18995h.f18936k.add(this.f18995h);
            this.f18995h.f18931f = n22;
        } else if (p22 != -1) {
            this.f18995h.f18937l.add(this.f18989b.f18581c0.f18586f.f18996i);
            this.f18989b.f18581c0.f18586f.f18996i.f18936k.add(this.f18995h);
            this.f18995h.f18931f = -p22;
        } else {
            f fVar2 = this.f18995h;
            fVar2.f18927b = true;
            fVar2.f18937l.add(this.f18989b.f18581c0.f18586f.f18996i);
            this.f18989b.f18581c0.f18586f.f18996i.f18936k.add(this.f18995h);
        }
        u(this.f18989b.f18586f.f18995h);
        u(this.f18989b.f18586f.f18996i);
    }

    @Override // z.p
    public void e() {
        if (((y.h) this.f18989b).m2() == 1) {
            this.f18989b.f2(this.f18995h.f18932g);
        } else {
            this.f18989b.g2(this.f18995h.f18932g);
        }
    }

    @Override // z.p
    public void f() {
        this.f18995h.c();
    }

    @Override // z.p
    public void n() {
        this.f18995h.f18935j = false;
        this.f18996i.f18935j = false;
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
