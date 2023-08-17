package x3;

import java.util.AbstractSet;
import java.util.Set;
@v3.g1(version = "1.1")
/* loaded from: classes.dex */
public abstract class h<E> extends AbstractSet<E> implements Set<E>, v4.h {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e7);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
