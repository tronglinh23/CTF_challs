package x3;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class q0<T> implements Iterable<p0<? extends T>>, v4.a {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final t4.a<Iterator<T>> f18388k;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(@n6.d t4.a<? extends Iterator<? extends T>> aVar) {
        u4.l0.p(aVar, "iteratorFactory");
        this.f18388k = aVar;
    }

    @Override // java.lang.Iterable
    @n6.d
    public Iterator<p0<T>> iterator() {
        return new r0(this.f18388k.n());
    }
}
