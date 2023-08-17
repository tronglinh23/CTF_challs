package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u.v;
/* loaded from: classes.dex */
public final class b2 {
    @c2
    public static /* synthetic */ void a() {
    }

    @n6.d
    public static final Executor b(@n6.d o0 o0Var) {
        Executor a12;
        z1 z1Var = o0Var instanceof z1 ? (z1) o0Var : null;
        return (z1Var == null || (a12 = z1Var.a1()) == null) ? new l1(o0Var) : a12;
    }

    @s4.h(name = v.h.f17254c)
    @n6.d
    public static final o0 c(@n6.d Executor executor) {
        o0 o0Var;
        l1 l1Var = executor instanceof l1 ? (l1) executor : null;
        return (l1Var == null || (o0Var = l1Var.f12902k) == null) ? new a2(executor) : o0Var;
    }

    @s4.h(name = v.h.f17254c)
    @n6.d
    public static final z1 d(@n6.d ExecutorService executorService) {
        return new a2(executorService);
    }
}
