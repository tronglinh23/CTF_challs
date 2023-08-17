package x3;

import java.util.AbstractCollection;
import java.util.Collection;
@v3.g1(version = "1.1")
/* loaded from: classes.dex */
public abstract class e<E> extends AbstractCollection<E> implements Collection<E>, v4.b {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e7);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
