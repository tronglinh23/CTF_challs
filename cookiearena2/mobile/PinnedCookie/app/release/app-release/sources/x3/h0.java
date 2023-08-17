package x3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class h0 implements List, Serializable, RandomAccess, v4.a {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public static final h0 f18305k = new h0();

    /* renamed from: l  reason: collision with root package name */
    public static final long f18306l = -7390468764508069838L;

    public void a(int i7, Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return d((Void) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@n6.d Collection collection) {
        u4.l0.p(collection, "elements");
        return collection.isEmpty();
    }

    public boolean d(@n6.d Void r22) {
        u4.l0.p(r22, "element");
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@n6.e Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    @Override // java.util.List
    @n6.d
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public Void get(int i7) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i7 + '.');
    }

    public int g() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    public int i(@n6.d Void r22) {
        u4.l0.p(r22, "element");
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return i((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @n6.d
    public Iterator iterator() {
        return g0.f18303k;
    }

    public int j(@n6.d Void r22) {
        u4.l0.p(r22, "element");
        return -1;
    }

    public final Object k() {
        return f18305k;
    }

    public Void l(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return j((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @n6.d
    public ListIterator listIterator() {
        return g0.f18303k;
    }

    public Void m(int i7, Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.List
    @n6.d
    public List subList(int i7, int i8) {
        if (i7 == 0 && i8 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return u4.v.a(this);
    }

    @n6.d
    public String toString() {
        return r5.v.f16052o;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @n6.d
    public ListIterator listIterator(int i7) {
        if (i7 == 0) {
            return g0.f18303k;
        }
        throw new IndexOutOfBoundsException("Index: " + i7);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        u4.l0.p(tArr, "array");
        return (T[]) u4.v.b(this, tArr);
    }
}
