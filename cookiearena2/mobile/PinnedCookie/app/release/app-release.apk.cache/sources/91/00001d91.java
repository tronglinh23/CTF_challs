package x3;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class s0 implements Iterator<Integer>, v4.a {
    @n6.d
    public final Integer a() {
        return Integer.valueOf(b());
    }

    public abstract int b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}