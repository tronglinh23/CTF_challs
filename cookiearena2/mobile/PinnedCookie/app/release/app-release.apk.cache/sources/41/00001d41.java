package x3;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class f0 implements Iterator<Double>, v4.a {
    @n6.d
    public final Double a() {
        return Double.valueOf(b());
    }

    public abstract double b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Double next() {
        return Double.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}