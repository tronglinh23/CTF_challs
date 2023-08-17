package x3;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class t implements Iterator<Character>, v4.a {
    @n6.d
    public final Character a() {
        return Character.valueOf(b());
    }

    public abstract char b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}