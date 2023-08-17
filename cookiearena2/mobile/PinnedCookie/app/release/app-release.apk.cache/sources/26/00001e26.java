package y3;

import java.util.Collection;
import java.util.Iterator;
import u4.l0;

/* loaded from: classes.dex */
public final class g<V> extends x3.e<V> implements Collection<V>, v4.b {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final d<?, V> f18842k;

    public g(@n6.d d<?, V> dVar) {
        l0.p(dVar, "backing");
        this.f18842k = dVar;
    }

    @Override // x3.e
    public int a() {
        return this.f18842k.size();
    }

    @Override // x3.e, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@n6.d Collection<? extends V> collection) {
        l0.p(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @n6.d
    public final d<?, V> b() {
        return this.f18842k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f18842k.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f18842k.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f18842k.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @n6.d
    public Iterator<V> iterator() {
        return this.f18842k.P();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f18842k.N(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@n6.d Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        this.f18842k.m();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@n6.d Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        this.f18842k.m();
        return super.retainAll(collection);
    }
}