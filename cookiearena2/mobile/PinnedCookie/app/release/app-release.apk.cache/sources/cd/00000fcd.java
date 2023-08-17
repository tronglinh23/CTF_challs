package g1;

import java.util.concurrent.atomic.AtomicBoolean;
import u4.l0;
import v3.d1;

/* loaded from: classes.dex */
public final class b<T> extends AtomicBoolean implements e<T> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final e4.d<T> f9980k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(@n6.d e4.d<? super T> dVar) {
        super(false);
        l0.p(dVar, "continuation");
        this.f9980k = dVar;
    }

    @Override // g1.e
    public void accept(T t6) {
        if (compareAndSet(false, true)) {
            e4.d<T> dVar = this.f9980k;
            d1.a aVar = d1.f17778l;
            dVar.D(d1.b(t6));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @n6.d
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}