package kotlinx.coroutines;

import java.util.concurrent.Future;
/* loaded from: classes.dex */
public final class o1 implements p1 {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final Future<?> f12926k;

    public o1(@n6.d Future<?> future) {
        this.f12926k = future;
    }

    @Override // kotlinx.coroutines.p1
    public void j() {
        this.f12926k.cancel(false);
    }

    @n6.d
    public String toString() {
        return "DisposableFutureHandle[" + this.f12926k + ']';
    }
}
