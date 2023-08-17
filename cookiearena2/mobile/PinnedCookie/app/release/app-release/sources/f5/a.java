package f5;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import u4.l0;
/* loaded from: classes.dex */
public final class a<T> implements m<T> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<m<T>> f9797a;

    public a(@n6.d m<? extends T> mVar) {
        l0.p(mVar, "sequence");
        this.f9797a = new AtomicReference<>(mVar);
    }

    @Override // f5.m
    @n6.d
    public Iterator<T> iterator() {
        m<T> andSet = this.f9797a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
