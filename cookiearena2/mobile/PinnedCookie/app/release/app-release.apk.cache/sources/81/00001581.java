package kotlinx.coroutines;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l1 implements Executor {
    @n6.d
    @s4.e

    /* renamed from: k  reason: collision with root package name */
    public final o0 f12902k;

    public l1(@n6.d o0 o0Var) {
        this.f12902k = o0Var;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@n6.d Runnable runnable) {
        this.f12902k.V0(e4.i.f8770k, runnable);
    }

    @n6.d
    public String toString() {
        return this.f12902k.toString();
    }
}