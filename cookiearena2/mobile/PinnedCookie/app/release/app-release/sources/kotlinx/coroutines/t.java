package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class t {
    @i2
    public static final void a(@n6.d q<?> qVar, @n6.d p1 p1Var) {
        qVar.N(new q1(p1Var));
    }

    @n6.d
    public static final <T> r<T> b(@n6.d e4.d<? super T> dVar) {
        if (dVar instanceof kotlinx.coroutines.internal.l) {
            r<T> m7 = ((kotlinx.coroutines.internal.l) dVar).m();
            if (m7 != null) {
                if (!m7.L()) {
                    m7 = null;
                }
                if (m7 != null) {
                    return m7;
                }
            }
            return new r<>(dVar, 2);
        }
        return new r<>(dVar, 1);
    }

    public static final void c(@n6.d q<?> qVar, @n6.d kotlinx.coroutines.internal.y yVar) {
        qVar.N(new g3(yVar));
    }

    @n6.e
    public static final <T> Object d(@n6.d t4.l<? super q<? super T>, v3.m2> lVar, @n6.d e4.d<? super T> dVar) {
        r rVar = new r(g4.c.d(dVar), 1);
        rVar.x();
        lVar.O(rVar);
        Object A = rVar.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        return A;
    }

    public static final <T> Object e(t4.l<? super q<? super T>, v3.m2> lVar, e4.d<? super T> dVar) {
        u4.i0.e(0);
        r rVar = new r(g4.c.d(dVar), 1);
        rVar.x();
        lVar.O(rVar);
        Object A = rVar.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        u4.i0.e(1);
        return A;
    }

    @n6.e
    public static final <T> Object f(@n6.d t4.l<? super q<? super T>, v3.m2> lVar, @n6.d e4.d<? super T> dVar) {
        r b7 = b(g4.c.d(dVar));
        lVar.O(b7);
        Object A = b7.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        return A;
    }

    public static final <T> Object g(t4.l<? super q<? super T>, v3.m2> lVar, e4.d<? super T> dVar) {
        u4.i0.e(0);
        r b7 = b(g4.c.d(dVar));
        lVar.O(b7);
        Object A = b7.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        u4.i0.e(1);
        return A;
    }
}
