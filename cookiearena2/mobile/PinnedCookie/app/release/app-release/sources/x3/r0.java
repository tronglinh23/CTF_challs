package x3;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class r0<T> implements Iterator<p0<? extends T>>, v4.a {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final Iterator<T> f18389k;

    /* renamed from: l  reason: collision with root package name */
    public int f18390l;

    /* JADX WARN: Multi-variable type inference failed */
    public r0(@n6.d Iterator<? extends T> it) {
        u4.l0.p(it, "iterator");
        this.f18389k = it;
    }

    @Override // java.util.Iterator
    @n6.d
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public final p0<T> next() {
        int i7 = this.f18390l;
        this.f18390l = i7 + 1;
        if (i7 < 0) {
            w.W();
        }
        return new p0<>(i7, this.f18389k.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18389k.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
