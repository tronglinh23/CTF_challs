package y3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import u4.l0;

/* loaded from: classes.dex */
public final class f<E> extends x3.h<E> implements Set<E>, v4.h {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final d<E, ?> f18841k;

    public f(@n6.d d<E, ?> dVar) {
        l0.p(dVar, "backing");
        this.f18841k = dVar;
    }

    @Override // x3.h
    public int a() {
        return this.f18841k.size();
    }

    @Override // x3.h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@n6.d Collection<? extends E> collection) {
        l0.p(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f18841k.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f18841k.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f18841k.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @n6.d
    public Iterator<E> iterator() {
        return this.f18841k.E();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f18841k.L(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@n6.d Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        this.f18841k.m();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@n6.d Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        this.f18841k.m();
        return super.retainAll(collection);
    }
}