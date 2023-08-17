package kotlinx.coroutines;

import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class n extends u2 {
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final Future<?> f12913o;

    public n(@n6.d Future<?> future) {
        this.f12913o = future;
    }

    @Override // t4.l
    public /* bridge */ /* synthetic */ v3.m2 O(Throwable th) {
        X0(th);
        return v3.m2.f17815a;
    }

    @Override // kotlinx.coroutines.g0
    public void X0(@n6.e Throwable th) {
        if (th != null) {
            this.f12913o.cancel(false);
        }
    }
}