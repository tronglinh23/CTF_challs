package androidx.collection;

import d.q0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class l<K, V> {
    @q0

    /* renamed from: a  reason: collision with root package name */
    public l<K, V>.b f1967a;
    @q0

    /* renamed from: b  reason: collision with root package name */
    public l<K, V>.c f1968b;
    @q0

    /* renamed from: c  reason: collision with root package name */
    public l<K, V>.e f1969c;

    /* loaded from: classes.dex */
    public final class a<T> implements Iterator<T> {

        /* renamed from: k  reason: collision with root package name */
        public final int f1970k;

        /* renamed from: l  reason: collision with root package name */
        public int f1971l;

        /* renamed from: m  reason: collision with root package name */
        public int f1972m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1973n = false;

        public a(int i7) {
            this.f1970k = i7;
            this.f1971l = l.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1972m < this.f1971l;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t6 = (T) l.this.b(this.f1972m, this.f1970k);
                this.f1972m++;
                this.f1973n = true;
                return t6;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1973n) {
                throw new IllegalStateException();
            }
            int i7 = this.f1972m - 1;
            this.f1972m = i7;
            this.f1971l--;
            this.f1973n = false;
            l.this.h(i7);
        }
    }

    /* loaded from: classes.dex */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d7 = l.this.d();
            for (Map.Entry<K, V> entry : collection) {
                l.this.g(entry.getKey(), entry.getValue());
            }
            return d7 != l.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            l.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int e7 = l.this.e(entry.getKey());
                if (e7 < 0) {
                    return false;
                }
                return g.c(l.this.b(e7, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return l.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i7 = 0;
            for (int d7 = l.this.d() - 1; d7 >= 0; d7--) {
                Object b7 = l.this.b(d7, 0);
                Object b8 = l.this.b(d7, 1);
                i7 += (b7 == null ? 0 : b7.hashCode()) ^ (b8 == null ? 0 : b8.hashCode());
            }
            return i7;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return l.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return l.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k7) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            l.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return l.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return l.j(l.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return l.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i7 = 0;
            for (int d7 = l.this.d() - 1; d7 >= 0; d7--) {
                Object b7 = l.this.b(d7, 0);
                i7 += b7 == null ? 0 : b7.hashCode();
            }
            return i7;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return l.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e7 = l.this.e(obj);
            if (e7 >= 0) {
                l.this.h(e7);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return l.o(l.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return l.p(l.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return l.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return l.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) l.this.r(tArr, 0);
        }
    }

    /* loaded from: classes.dex */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: k  reason: collision with root package name */
        public int f1977k;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1979m = false;

        /* renamed from: l  reason: collision with root package name */
        public int f1978l = -1;

        public d() {
            this.f1977k = l.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f1978l++;
                this.f1979m = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f1979m) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return g.c(entry.getKey(), l.this.b(this.f1978l, 0)) && g.c(entry.getValue(), l.this.b(this.f1978l, 1));
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f1979m) {
                return (K) l.this.b(this.f1978l, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f1979m) {
                return (V) l.this.b(this.f1978l, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1978l < this.f1977k;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f1979m) {
                Object b7 = l.this.b(this.f1978l, 0);
                Object b8 = l.this.b(this.f1978l, 1);
                return (b7 == null ? 0 : b7.hashCode()) ^ (b8 != null ? b8.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1979m) {
                throw new IllegalStateException();
            }
            l.this.h(this.f1978l);
            this.f1978l--;
            this.f1977k--;
            this.f1979m = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v6) {
            if (this.f1979m) {
                return (V) l.this.i(this.f1978l, v6);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes.dex */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v6) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            l.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return l.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return l.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f7 = l.this.f(obj);
            if (f7 >= 0) {
                l.this.h(f7);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d7 = l.this.d();
            int i7 = 0;
            boolean z6 = false;
            while (i7 < d7) {
                if (collection.contains(l.this.b(i7, 1))) {
                    l.this.h(i7);
                    i7--;
                    d7--;
                    z6 = true;
                }
                i7++;
            }
            return z6;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d7 = l.this.d();
            int i7 = 0;
            boolean z6 = false;
            while (i7 < d7) {
                if (!collection.contains(l.this.b(i7, 1))) {
                    l.this.h(i7);
                    i7--;
                    d7--;
                    z6 = true;
                }
                i7++;
            }
            return z6;
        }

        @Override // java.util.Collection
        public int size() {
            return l.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return l.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) l.this.r(tArr, 1);
        }
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i7, int i8);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k7, V v6);

    public abstract void h(int i7);

    public abstract V i(int i7, V v6);

    public Set<Map.Entry<K, V>> l() {
        if (this.f1967a == null) {
            this.f1967a = new b();
        }
        return this.f1967a;
    }

    public Set<K> m() {
        if (this.f1968b == null) {
            this.f1968b = new c();
        }
        return this.f1968b;
    }

    public Collection<V> n() {
        if (this.f1969c == null) {
            this.f1969c = new e();
        }
        return this.f1969c;
    }

    public Object[] q(int i7) {
        int d7 = d();
        Object[] objArr = new Object[d7];
        for (int i8 = 0; i8 < d7; i8++) {
            objArr[i8] = b(i8, i7);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] r(T[] tArr, int i7) {
        int d7 = d();
        if (tArr.length < d7) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d7));
        }
        for (int i8 = 0; i8 < d7; i8++) {
            tArr[i8] = b(i8, i7);
        }
        if (tArr.length > d7) {
            tArr[d7] = null;
        }
        return tArr;
    }
}