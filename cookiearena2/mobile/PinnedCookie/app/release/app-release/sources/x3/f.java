package x3;

import java.util.AbstractList;
import java.util.List;
@v3.g1(version = "1.1")
/* loaded from: classes.dex */
public abstract class f<E> extends AbstractList<E> implements List<E>, v4.e {
    public abstract int a();

    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i7, E e7);

    public abstract E b(int i7);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i7) {
        return b(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i7, E e7);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
