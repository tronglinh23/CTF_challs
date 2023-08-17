package kotlinx.coroutines.selects;

import t4.l;
import u4.i0;
import v3.m2;

/* loaded from: classes.dex */
public final class h {
    @n6.e
    public static final <R> Object a(@n6.d l<? super a<? super R>, m2> lVar, @n6.d e4.d<? super R> dVar) {
        j jVar = new j(dVar);
        try {
            lVar.O(jVar);
        } catch (Throwable th) {
            jVar.c(th);
        }
        Object d7 = jVar.d();
        if (d7 == g4.d.h()) {
            h4.h.c(dVar);
        }
        return d7;
    }

    public static final <R> Object b(l<? super a<? super R>, m2> lVar, e4.d<? super R> dVar) {
        i0.e(0);
        j jVar = new j(dVar);
        try {
            lVar.O(jVar);
        } catch (Throwable th) {
            jVar.c(th);
        }
        Object d7 = jVar.d();
        if (d7 == g4.d.h()) {
            h4.h.c(dVar);
        }
        i0.e(1);
        return d7;
    }
}