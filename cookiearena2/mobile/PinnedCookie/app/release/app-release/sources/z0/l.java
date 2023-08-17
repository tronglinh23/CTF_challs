package z0;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import v3.d1;
import v3.e1;
@d.w0(31)
/* loaded from: classes.dex */
public final class l<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final e4.d<R> f19020k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(@n6.d e4.d<? super R> dVar) {
        super(false);
        u4.l0.p(dVar, "continuation");
        this.f19020k = dVar;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(@n6.d E e7) {
        u4.l0.p(e7, "error");
        if (compareAndSet(false, true)) {
            e4.d<R> dVar = this.f19020k;
            d1.a aVar = v3.d1.f17778l;
            dVar.D(v3.d1.b(e1.a(e7)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(@n6.d R r6) {
        u4.l0.p(r6, "result");
        if (compareAndSet(false, true)) {
            e4.d<R> dVar = this.f19020k;
            d1.a aVar = v3.d1.f17778l;
            dVar.D(v3.d1.b(r6));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @n6.d
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
