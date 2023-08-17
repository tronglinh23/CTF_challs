package u4;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class h<T> implements Iterator<T>, v4.a {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final T[] f17418k;

    /* renamed from: l  reason: collision with root package name */
    public int f17419l;

    public h(@n6.d T[] tArr) {
        l0.p(tArr, "array");
        this.f17418k = tArr;
    }

    @n6.d
    public final T[] a() {
        return this.f17418k;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17419l < this.f17418k.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f17418k;
            int i7 = this.f17419l;
            this.f17419l = i7 + 1;
            return tArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            this.f17419l--;
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
