package x3;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class r implements Iterator<Boolean>, v4.a {
    @n6.d
    public final Boolean a() {
        return Boolean.valueOf(b());
    }

    public abstract boolean b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Boolean next() {
        return Boolean.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}