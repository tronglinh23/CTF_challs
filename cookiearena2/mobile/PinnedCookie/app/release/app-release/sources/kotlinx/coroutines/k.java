package kotlinx.coroutines;
/* loaded from: classes.dex */
public final /* synthetic */ class k {
    public static final <T> T a(@n6.d e4.g gVar, @n6.d t4.p<? super u0, ? super e4.d<? super T>, ? extends Object> pVar) throws InterruptedException {
        t1 a7;
        e4.g e7;
        Thread currentThread = Thread.currentThread();
        e4.e eVar = (e4.e) gVar.e(e4.e.f8765a);
        if (eVar == null) {
            a7 = u3.f13126a.b();
            e7 = n0.e(e2.f11962k, gVar.t(a7));
        } else {
            t1 t1Var = eVar instanceof t1 ? (t1) eVar : null;
            if (t1Var != null) {
                t1 t1Var2 = t1Var.m1() ? t1Var : null;
                if (t1Var2 != null) {
                    a7 = t1Var2;
                    e7 = n0.e(e2.f11962k, gVar);
                }
            }
            a7 = u3.f13126a.a();
            e7 = n0.e(e2.f11962k, gVar);
        }
        h hVar = new h(e7, currentThread, a7);
        hVar.L1(w0.DEFAULT, hVar, pVar);
        return (T) hVar.M1();
    }

    public static /* synthetic */ Object b(e4.g gVar, t4.p pVar, int i7, Object obj) throws InterruptedException {
        if ((i7 & 1) != 0) {
            gVar = e4.i.f8770k;
        }
        return j.f(gVar, pVar);
    }
}
