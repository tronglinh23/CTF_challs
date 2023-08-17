package x3;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class s implements Iterator<Byte>, v4.a {
    @n6.d
    public final Byte a() {
        return Byte.valueOf(b());
    }

    public abstract byte b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Byte next() {
        return Byte.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}