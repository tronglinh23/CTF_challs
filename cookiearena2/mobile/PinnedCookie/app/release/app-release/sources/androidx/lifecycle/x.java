package androidx.lifecycle;

import kotlinx.coroutines.m1;
import kotlinx.coroutines.r3;
/* loaded from: classes.dex */
public final class x {
    @n6.d
    public static final s a(@n6.d p pVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        u4.l0.p(pVar, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) pVar.c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(pVar, r3.c(null, 1, null).t(m1.e().a1()));
        } while (!w.a(pVar.c(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.l();
        return lifecycleCoroutineScopeImpl;
    }
}
