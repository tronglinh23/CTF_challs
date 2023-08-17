package x3;

import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class k0 implements Iterator<Float>, v4.a {
    @n6.d
    public final Float a() {
        return Float.valueOf(b());
    }

    public abstract float b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Float next() {
        return Float.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
