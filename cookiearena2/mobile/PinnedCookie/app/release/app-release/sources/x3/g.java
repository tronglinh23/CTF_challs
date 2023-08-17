package x3;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
@v3.g1(version = "1.1")
/* loaded from: classes.dex */
public abstract class g<K, V> extends AbstractMap<K, V> implements Map<K, V>, v4.g {
    public abstract Set a();

    public /* bridge */ Set<Object> b() {
        return super.keySet();
    }

    public /* bridge */ int d() {
        return super.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    public /* bridge */ Collection<Object> f() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @n6.e
    public abstract V put(K k7, V v6);

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) f();
    }
}
