package p5;

import kotlinx.coroutines.internal.w0;
import u4.u1;
/* loaded from: classes.dex */
public final class f {
    public static final /* synthetic */ kotlinx.coroutines.flow.j a(kotlinx.coroutines.flow.j jVar, e4.g gVar) {
        return e(jVar, gVar);
    }

    @n6.d
    public static final <T> e<T> b(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar) {
        e<T> eVar = iVar instanceof e ? (e) iVar : null;
        return eVar == null ? new i(iVar, null, 0, null, 14, null) : eVar;
    }

    @n6.e
    public static final <T, V> Object c(@n6.d e4.g gVar, V v6, @n6.d Object obj, @n6.d t4.p<? super V, ? super e4.d<? super T>, ? extends Object> pVar, @n6.d e4.d<? super T> dVar) {
        Object c7 = w0.c(gVar, obj);
        try {
            Object J = ((t4.p) u1.q(pVar, 2)).J(v6, new z(dVar, gVar));
            w0.a(gVar, c7);
            if (J == g4.d.h()) {
                h4.h.c(dVar);
            }
            return J;
        } catch (Throwable th) {
            w0.a(gVar, c7);
            throw th;
        }
    }

    public static /* synthetic */ Object d(e4.g gVar, Object obj, Object obj2, t4.p pVar, e4.d dVar, int i7, Object obj3) {
        if ((i7 & 4) != 0) {
            obj2 = w0.b(gVar);
        }
        return c(gVar, obj, obj2, pVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.j<T> e(kotlinx.coroutines.flow.j<? super T> jVar, e4.g gVar) {
        return jVar instanceof y ? true : jVar instanceof t ? jVar : new b0(jVar, gVar);
    }
}
