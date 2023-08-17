package y3;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import u4.l0;

/* loaded from: classes.dex */
public final class j<E> extends x3.h<E> implements Set<E>, Serializable, v4.h {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final d<E, ?> f18852k;

    public j(@n6.d d<E, ?> dVar) {
        l0.p(dVar, "backing");
        this.f18852k = dVar;
    }

    @Override // x3.h
    public int a() {
        return this.f18852k.size();
    }

    @Override // x3.h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e7) {
        return this.f18852k.j(e7) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@n6.d Collection<? extends E> collection) {
        l0.p(collection, "elements");
        this.f18852k.m();
        return super.addAll(collection);
    }

    @n6.d
    public final Set<E> b() {
        this.f18852k.l();
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f18852k.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f18852k.containsKey(obj);
    }

    public final Object d() {
        if (this.f18852k.D()) {
            return new h(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f18852k.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @n6.d
    public Iterator<E> iterator() {
        return this.f18852k.E();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f18852k.L(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@n6.d Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        this.f18852k.m();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@n6.d Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        this.f18852k.m();
        return super.retainAll(collection);
    }

    public j() {
        this(new d());
    }

    public j(int i7) {
        this(new d(i7));
    }
}