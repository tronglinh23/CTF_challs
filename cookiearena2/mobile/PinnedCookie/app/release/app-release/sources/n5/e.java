package n5;

import kotlinx.coroutines.e3;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v2;
import kotlinx.coroutines.w0;
import v3.m2;
/* loaded from: classes.dex */
public final class e {
    @e3
    @n6.d
    public static final <E> m0<E> a(@n6.d u0 u0Var, @n6.d e4.g gVar, int i7, @n6.d w0 w0Var, @n6.e t4.l<? super Throwable, m2> lVar, @n6.d t4.p<? super f<E>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        e4.g e7 = kotlinx.coroutines.n0.e(u0Var, gVar);
        n d7 = q.d(i7, null, null, 6, null);
        d b0Var = w0Var.h() ? new b0(e7, d7, pVar) : new d(e7, d7, true);
        if (lVar != null) {
            ((v2) b0Var).X(lVar);
        }
        ((kotlinx.coroutines.a) b0Var).L1(w0Var, b0Var, pVar);
        return b0Var;
    }

    public static /* synthetic */ m0 b(u0 u0Var, e4.g gVar, int i7, w0 w0Var, t4.l lVar, t4.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = e4.i.f8770k;
        }
        e4.g gVar2 = gVar;
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        int i9 = i7;
        if ((i8 & 4) != 0) {
            w0Var = w0.DEFAULT;
        }
        w0 w0Var2 = w0Var;
        if ((i8 & 8) != 0) {
            lVar = null;
        }
        return a(u0Var, gVar2, i9, w0Var2, lVar, pVar);
    }
}
