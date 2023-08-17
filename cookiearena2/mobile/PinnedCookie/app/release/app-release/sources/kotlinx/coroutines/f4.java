package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class f4 {
    @n6.e
    public static final Object a(@n6.d e4.d<? super v3.m2> dVar) {
        Object h7;
        e4.g g7 = dVar.g();
        r2.z(g7);
        e4.d d7 = g4.c.d(dVar);
        kotlinx.coroutines.internal.l lVar = d7 instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) d7 : null;
        if (lVar == null) {
            h7 = v3.m2.f17815a;
        } else {
            if (lVar.f12816n.X0(g7)) {
                lVar.n(g7, v3.m2.f17815a);
            } else {
                e4 e4Var = new e4();
                e4.g t6 = g7.t(e4Var);
                v3.m2 m2Var = v3.m2.f17815a;
                lVar.n(t6, m2Var);
                if (e4Var.f11964l) {
                    h7 = kotlinx.coroutines.internal.m.h(lVar) ? g4.d.h() : m2Var;
                }
            }
            h7 = g4.d.h();
        }
        if (h7 == g4.d.h()) {
            h4.h.c(dVar);
        }
        return h7 == g4.d.h() ? h7 : v3.m2.f17815a;
    }
}
