package g1;

import java.util.concurrent.atomic.AtomicBoolean;
import u4.l0;
import v3.d1;
import v3.m2;
/* loaded from: classes.dex */
public final class h extends AtomicBoolean implements Runnable {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final e4.d<m2> f10004k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(@n6.d e4.d<? super m2> dVar) {
        super(false);
        l0.p(dVar, "continuation");
        this.f10004k = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            e4.d<m2> dVar = this.f10004k;
            d1.a aVar = d1.f17778l;
            dVar.D(d1.b(m2.f17815a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @n6.d
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
