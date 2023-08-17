package x3;

import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class n1 implements Iterator<Short>, v4.a {
    @n6.d
    public final Short a() {
        return Short.valueOf(b());
    }

    public abstract short b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Short next() {
        return Short.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
