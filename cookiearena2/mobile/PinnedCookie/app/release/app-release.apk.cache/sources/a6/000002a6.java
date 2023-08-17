package androidx.collection;

import d.o0;
import d.q0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a<K, V> extends m<K, V> implements Map<K, V> {
    @q0

    /* renamed from: w  reason: collision with root package name */
    public l<K, V> f1915w;

    /* renamed from: androidx.collection.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0029a extends l<K, V> {
        public C0029a() {
        }

        @Override // androidx.collection.l
        public void a() {
            a.this.clear();
        }

        @Override // androidx.collection.l
        public Object b(int i7, int i8) {
            return a.this.f1992l[(i7 << 1) + i8];
        }

        @Override // androidx.collection.l
        public Map<K, V> c() {
            return a.this;
        }

        @Override // androidx.collection.l
        public int d() {
            return a.this.f1993m;
        }

        @Override // androidx.collection.l
        public int e(Object obj) {
            return a.this.g(obj);
        }

        @Override // androidx.collection.l
        public int f(Object obj) {
            return a.this.j(obj);
        }

        @Override // androidx.collection.l
        public void g(K k7, V v6) {
            a.this.put(k7, v6);
        }

        @Override // androidx.collection.l
        public void h(int i7) {
            a.this.m(i7);
        }

        @Override // androidx.collection.l
        public V i(int i7, V v6) {
            return a.this.n(i7, v6);
        }
    }

    public a() {
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return q().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return q().m();
    }

    public boolean p(@o0 Collection<?> collection) {
        return l.j(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f1993m + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final l<K, V> q() {
        if (this.f1915w == null) {
            this.f1915w = new C0029a();
        }
        return this.f1915w;
    }

    public boolean r(@o0 Collection<?> collection) {
        return l.o(this, collection);
    }

    public boolean s(@o0 Collection<?> collection) {
        return l.p(this, collection);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return q().n();
    }

    public a(int i7) {
        super(i7);
    }

    public a(m mVar) {
        super(mVar);
    }
}