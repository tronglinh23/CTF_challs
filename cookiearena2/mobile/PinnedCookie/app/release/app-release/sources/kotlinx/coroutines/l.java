package kotlinx.coroutines;

import e4.e;
/* loaded from: classes.dex */
public final /* synthetic */ class l {

    /* renamed from: a */
    public static final int f12899a = 0;

    /* renamed from: b */
    public static final int f12900b = 1;

    /* renamed from: c */
    public static final int f12901c = 2;

    @n6.d
    public static final <T> c1<T> a(@n6.d u0 u0Var, @n6.d e4.g gVar, @n6.d w0 w0Var, @n6.d t4.p<? super u0, ? super e4.d<? super T>, ? extends Object> pVar) {
        e4.g e7 = n0.e(u0Var, gVar);
        d1 x2Var = w0Var.h() ? new x2(e7, pVar) : new d1(e7, true);
        ((a) x2Var).L1(w0Var, x2Var, pVar);
        return x2Var;
    }

    public static /* synthetic */ c1 b(u0 u0Var, e4.g gVar, w0 w0Var, t4.p pVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            gVar = e4.i.f8770k;
        }
        if ((i7 & 2) != 0) {
            w0Var = w0.DEFAULT;
        }
        return j.a(u0Var, gVar, w0Var, pVar);
    }

    @n6.e
    public static final <T> Object c(@n6.d o0 o0Var, @n6.d t4.p<? super u0, ? super e4.d<? super T>, ? extends Object> pVar, @n6.d e4.d<? super T> dVar) {
        return j.h(o0Var, pVar, dVar);
    }

    public static final <T> Object d(o0 o0Var, t4.p<? super u0, ? super e4.d<? super T>, ? extends Object> pVar, e4.d<? super T> dVar) {
        u4.i0.e(0);
        Object h7 = j.h(o0Var, pVar, dVar);
        u4.i0.e(1);
        return h7;
    }

    @n6.d
    public static final n2 e(@n6.d u0 u0Var, @n6.d e4.g gVar, @n6.d w0 w0Var, @n6.d t4.p<? super u0, ? super e4.d<? super v3.m2>, ? extends Object> pVar) {
        e4.g e7 = n0.e(u0Var, gVar);
        a y2Var = w0Var.h() ? new y2(e7, pVar) : new o3(e7, true);
        y2Var.L1(w0Var, y2Var, pVar);
        return y2Var;
    }

    public static /* synthetic */ n2 f(u0 u0Var, e4.g gVar, w0 w0Var, t4.p pVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            gVar = e4.i.f8770k;
        }
        if ((i7 & 2) != 0) {
            w0Var = w0.DEFAULT;
        }
        return j.d(u0Var, gVar, w0Var, pVar);
    }

    @n6.e
    public static final <T> Object g(@n6.d e4.g gVar, @n6.d t4.p<? super u0, ? super e4.d<? super T>, ? extends Object> pVar, @n6.d e4.d<? super T> dVar) {
        Object N1;
        e4.g g7 = dVar.g();
        e4.g d7 = n0.d(g7, gVar);
        r2.z(d7);
        if (d7 == g7) {
            kotlinx.coroutines.internal.n0 n0Var = new kotlinx.coroutines.internal.n0(d7, dVar);
            N1 = q5.b.f(n0Var, n0Var, pVar);
        } else {
            e.b bVar = e4.e.f8765a;
            if (u4.l0.g(d7.e(bVar), g7.e(bVar))) {
                c4 c4Var = new c4(d7, dVar);
                Object c7 = kotlinx.coroutines.internal.w0.c(d7, null);
                try {
                    Object f7 = q5.b.f(c4Var, c4Var, pVar);
                    kotlinx.coroutines.internal.w0.a(d7, c7);
                    N1 = f7;
                } catch (Throwable th) {
                    kotlinx.coroutines.internal.w0.a(d7, c7);
                    throw th;
                }
            } else {
                i1 i1Var = new i1(d7, dVar);
                q5.a.f(pVar, i1Var, i1Var, null, 4, null);
                N1 = i1Var.N1();
            }
        }
        if (N1 == g4.d.h()) {
            h4.h.c(dVar);
        }
        return N1;
    }
}
