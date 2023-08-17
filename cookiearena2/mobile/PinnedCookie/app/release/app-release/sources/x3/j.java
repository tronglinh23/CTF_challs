package x3;

import java.util.Collection;
import java.util.Iterator;
@u4.r1({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,471:1\n1726#2,3:472\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n61#1:472,3\n*E\n"})
/* loaded from: classes.dex */
public final class j<T> implements Collection<T>, v4.a {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final T[] f18318k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f18319l;

    public j(@n6.d T[] tArr, boolean z6) {
        u4.l0.p(tArr, androidx.lifecycle.r0.f4811g);
        this.f18318k = tArr;
        this.f18319l = z6;
    }

    public int a() {
        return this.f18318k.length;
    }

    @Override // java.util.Collection
    public boolean add(T t6) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @n6.d
    public final T[] b() {
        return this.f18318k;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return p.T8(this.f18318k, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@n6.d Collection<? extends Object> collection) {
        u4.l0.p(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean d() {
        return this.f18319l;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f18318k.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @n6.d
    public Iterator<T> iterator() {
        return u4.i.a(this.f18318k);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        u4.l0.p(tArr, "array");
        return (T[]) u4.v.b(this, tArr);
    }

    @Override // java.util.Collection
    @n6.d
    public final Object[] toArray() {
        return v.h(this.f18318k, this.f18319l);
    }
}
