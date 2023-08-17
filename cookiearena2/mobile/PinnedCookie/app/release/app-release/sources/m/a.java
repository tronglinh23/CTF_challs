package m;

import d.b1;
import d.o0;
import d.q0;
import java.util.HashMap;
import java.util.Map;
import m.b;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: o  reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f13393o = new HashMap<>();

    public boolean contains(K k7) {
        return this.f13393o.containsKey(k7);
    }

    @Override // m.b
    @q0
    public b.c<K, V> d(K k7) {
        return this.f13393o.get(k7);
    }

    @Override // m.b
    public V h(@o0 K k7, @o0 V v6) {
        b.c<K, V> d7 = d(k7);
        if (d7 != null) {
            return d7.f13399l;
        }
        this.f13393o.put(k7, g(k7, v6));
        return null;
    }

    @Override // m.b
    public V i(@o0 K k7) {
        V v6 = (V) super.i(k7);
        this.f13393o.remove(k7);
        return v6;
    }

    @q0
    public Map.Entry<K, V> j(K k7) {
        if (contains(k7)) {
            return this.f13393o.get(k7).f13401n;
        }
        return null;
    }
}
