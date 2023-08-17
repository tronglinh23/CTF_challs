package y3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import u4.l0;
/* loaded from: classes.dex */
public final class e<K, V> extends a<Map.Entry<K, V>, K, V> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final d<K, V> f18840k;

    public e(@n6.d d<K, V> dVar) {
        l0.p(dVar, "backing");
        this.f18840k = dVar;
    }

    @Override // x3.h
    public int a() {
        return this.f18840k.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@n6.d Collection<? extends Map.Entry<K, V>> collection) {
        l0.p(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f18840k.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@n6.d Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        return this.f18840k.o(collection);
    }

    @Override // y3.a
    public boolean d(@n6.d Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, "element");
        return this.f18840k.p(entry);
    }

    @Override // y3.a
    public boolean f(@n6.d Map.Entry entry) {
        l0.p(entry, "element");
        return this.f18840k.J(entry);
    }

    @Override // x3.h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: g  reason: merged with bridge method [inline-methods] */
    public boolean add(@n6.d Map.Entry<K, V> entry) {
        l0.p(entry, "element");
        throw new UnsupportedOperationException();
    }

    @n6.d
    public final d<K, V> i() {
        return this.f18840k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f18840k.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @n6.d
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f18840k.t();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@n6.d Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        this.f18840k.m();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@n6.d Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        this.f18840k.m();
        return super.retainAll(collection);
    }
}
