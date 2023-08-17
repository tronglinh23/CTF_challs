package x3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@u4.r1({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n330#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n*L\n80#1:105,6\n*E\n"})
/* loaded from: classes.dex */
public final class w0<K, V> implements v0<K, V> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final Map<K, V> f18393k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final t4.l<K, V> f18394l;

    /* JADX WARN: Multi-variable type inference failed */
    public w0(@n6.d Map<K, ? extends V> map, @n6.d t4.l<? super K, ? extends V> lVar) {
        u4.l0.p(map, "map");
        u4.l0.p(lVar, "default");
        this.f18393k = map;
        this.f18394l = lVar;
    }

    @n6.d
    public Set<Map.Entry<K, V>> a() {
        return e().entrySet();
    }

    @n6.d
    public Set<K> b() {
        return e().keySet();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return e().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return e().containsValue(obj);
    }

    public int d() {
        return e().size();
    }

    @Override // x3.v0
    @n6.d
    public Map<K, V> e() {
        return this.f18393k;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(@n6.e Object obj) {
        return e().equals(obj);
    }

    @n6.d
    public Collection<V> f() {
        return e().values();
    }

    @Override // java.util.Map
    @n6.e
    public V get(Object obj) {
        return e().get(obj);
    }

    @Override // x3.v0
    public V h(K k7) {
        Map<K, V> e7 = e();
        V v6 = e7.get(k7);
        return (v6 != null || e7.containsKey(k7)) ? v6 : this.f18394l.O(k7);
    }

    @Override // java.util.Map
    public int hashCode() {
        return e().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return e().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return b();
    }

    @Override // java.util.Map
    public V put(K k7, V v6) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return d();
    }

    @n6.d
    public String toString() {
        return e().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return f();
    }
}