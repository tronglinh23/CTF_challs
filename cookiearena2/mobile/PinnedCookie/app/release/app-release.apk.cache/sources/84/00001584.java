package kotlinx.coroutines;

import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class m extends o {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final Future<?> f12905k;

    public m(@n6.d Future<?> future) {
        this.f12905k = future;
    }

    @Override // t4.l
    public /* bridge */ /* synthetic */ v3.m2 O(Throwable th) {
        b(th);
        return v3.m2.f17815a;
    }

    @Override // kotlinx.coroutines.p
    public void b(@n6.e Throwable th) {
        if (th != null) {
            this.f12905k.cancel(false);
        }
    }

    @n6.d
    public String toString() {
        return "CancelFutureOnCancel[" + this.f12905k + ']';
    }
}