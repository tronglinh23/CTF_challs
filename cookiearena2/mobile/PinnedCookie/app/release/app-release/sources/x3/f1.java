package x3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import u.v;
@u4.r1({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n330#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n*L\n101#1:105,6\n*E\n"})
/* loaded from: classes.dex */
public final class f1<K, V> implements e1<K, V> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final Map<K, V> f18301k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final t4.l<K, V> f18302l;

    /* JADX WARN: Multi-variable type inference failed */
    public f1(@n6.d Map<K, V> map, @n6.d t4.l<? super K, ? extends V> lVar) {
        u4.l0.p(map, "map");
        u4.l0.p(lVar, "default");
        this.f18301k = map;
        this.f18302l = lVar;
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
        e().clear();
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

    @Override // x3.e1, x3.v0
    @n6.d
    public Map<K, V> e() {
        return this.f18301k;
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
        return (v6 != null || e7.containsKey(k7)) ? v6 : this.f18302l.O(k7);
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
    @n6.e
    public V put(K k7, V v6) {
        return e().put(k7, v6);
    }

    @Override // java.util.Map
    public void putAll(@n6.d Map<? extends K, ? extends V> map) {
        u4.l0.p(map, v.h.f17254c);
        e().putAll(map);
    }

    @Override // java.util.Map
    @n6.e
    public V remove(Object obj) {
        return e().remove(obj);
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
