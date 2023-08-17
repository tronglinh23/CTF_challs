package x3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class i0 implements Map, Serializable, v4.a {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public static final i0 f18309k = new i0();

    /* renamed from: l  reason: collision with root package name */
    public static final long f18310l = 8246714829545688274L;

    public boolean a(@n6.d Void r22) {
        u4.l0.p(r22, "value");
        return false;
    }

    @Override // java.util.Map
    @n6.e
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public Void get(@n6.e Object obj) {
        return null;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(@n6.e Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return a((Void) obj);
        }
        return false;
    }

    @n6.d
    public Set<Map.Entry> d() {
        return j0.f18320k;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return d();
    }

    @Override // java.util.Map
    public boolean equals(@n6.e Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @n6.d
    public Set<Object> f() {
        return j0.f18320k;
    }

    public int g() {
        return 0;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @n6.d
    public Collection i() {
        return h0.f18305k;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    public Void j(Object obj, Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object k() {
        return f18309k;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return f();
    }

    @Override // java.util.Map
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return g();
    }

    @n6.d
    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return i();
    }
}
