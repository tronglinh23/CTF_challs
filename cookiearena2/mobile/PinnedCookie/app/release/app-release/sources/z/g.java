package z;

import z.f;
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f18947m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f18930e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f18930e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // z.f
    public void e(int i7) {
        if (this.f18935j) {
            return;
        }
        this.f18935j = true;
        this.f18932g = i7;
        for (d dVar : this.f18936k) {
            dVar.a(dVar);
        }
    }
}
