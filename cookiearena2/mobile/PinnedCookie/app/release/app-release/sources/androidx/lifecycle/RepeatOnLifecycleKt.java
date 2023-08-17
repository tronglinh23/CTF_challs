package androidx.lifecycle;

import androidx.lifecycle.p;
import v3.m2;
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    @n6.e
    public static final Object a(@n6.d p pVar, @n6.d p.b bVar, @n6.d t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super m2>, ? extends Object> pVar2, @n6.d e4.d<? super m2> dVar) {
        Object g7;
        if (bVar != p.b.INITIALIZED) {
            return (pVar.b() != p.b.DESTROYED && (g7 = kotlinx.coroutines.v0.g(new RepeatOnLifecycleKt$repeatOnLifecycle$3(pVar, bVar, pVar2, null), dVar)) == g4.d.h()) ? g7 : m2.f17815a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    @n6.e
    public static final Object b(@n6.d z zVar, @n6.d p.b bVar, @n6.d t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super m2>, ? extends Object> pVar, @n6.d e4.d<? super m2> dVar) {
        Object a7 = a(zVar.getLifecycle(), bVar, pVar, dVar);
        return a7 == g4.d.h() ? a7 : m2.f17815a;
    }
}
