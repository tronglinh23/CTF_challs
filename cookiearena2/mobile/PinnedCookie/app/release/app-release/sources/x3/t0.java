package x3;

import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class t0 implements Iterator<Long>, v4.a {
    @n6.d
    public final Long a() {
        return Long.valueOf(b());
    }

    public abstract long b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
