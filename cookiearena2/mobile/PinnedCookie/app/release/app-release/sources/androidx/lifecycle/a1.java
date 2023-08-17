package androidx.lifecycle;

import kotlinx.coroutines.m1;
import kotlinx.coroutines.r3;
/* loaded from: classes.dex */
public final class a1 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final String f4685a = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @n6.d
    public static final kotlinx.coroutines.u0 a(@n6.d z0 z0Var) {
        u4.l0.p(z0Var, "<this>");
        kotlinx.coroutines.u0 u0Var = (kotlinx.coroutines.u0) z0Var.e(f4685a);
        if (u0Var != null) {
            return u0Var;
        }
        Object g7 = z0Var.g(f4685a, new d(r3.c(null, 1, null).t(m1.e().c1())));
        u4.l0.o(g7, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (kotlinx.coroutines.u0) g7;
    }
}
