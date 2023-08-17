package x3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
@v3.g1(version = "1.1")
@u4.r1({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1747#2,3:154\n1726#2,3:157\n288#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class d<K, V> implements Map<K, V>, v4.a {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final a f18285m = new a(null);
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public volatile Set<? extends K> f18286k;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public volatile Collection<? extends V> f18287l;

    @u4.r1({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public final boolean a(@n6.d Map.Entry<?, ?> entry, @n6.e Object obj) {
            u4.l0.p(entry, "e");
            if (obj instanceof Map.Entry) {
                Map.Entry entry2 = (Map.Entry) obj;
                return u4.l0.g(entry.getKey(), entry2.getKey()) && u4.l0.g(entry.getValue(), entry2.getValue());
            }
            return false;
        }

        public final int b(@n6.d Map.Entry<?, ?> entry) {
            u4.l0.p(entry, "e");
            Object key = entry.getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = entry.getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @n6.d
        public final String c(@n6.d Map.Entry<?, ?> entry) {
            u4.l0.p(entry, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            return sb.toString();
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i<K> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ d<K, V> f18288l;

        /* loaded from: classes.dex */
        public static final class a implements Iterator<K>, v4.a {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f18289k;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f18289k = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f18289k.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f18289k.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(d<K, ? extends V> dVar) {
            this.f18288l = dVar;
        }

        @Override // x3.a
        public int a() {
            return this.f18288l.size();
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f18288l.containsKey(obj);
        }

        @Override // x3.i, x3.a, java.util.Collection, java.lang.Iterable
        @n6.d
        public Iterator<K> iterator() {
            return new a(this.f18288l.entrySet().iterator());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends u4.n0 implements t4.l<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ d<K, V> f18290l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(d<K, ? extends V> dVar) {
            super(1);
            this.f18290l = dVar;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final CharSequence O(@n6.d Map.Entry<? extends K, ? extends V> entry) {
            u4.l0.p(entry, "it");
            return this.f18290l.l(entry);
        }
    }

    /* renamed from: x3.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0264d extends x3.a<V> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ d<K, V> f18291k;

        /* renamed from: x3.d$d$a */
        /* loaded from: classes.dex */
        public static final class a implements Iterator<V>, v4.a {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f18292k;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f18292k = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f18292k.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f18292k.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0264d(d<K, ? extends V> dVar) {
            this.f18291k = dVar;
        }

        @Override // x3.a
        public int a() {
            return this.f18291k.size();
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f18291k.containsValue(obj);
        }

        @Override // x3.a, java.util.Collection, java.lang.Iterable
        @n6.d
        public Iterator<V> iterator() {
            return new a(this.f18291k.entrySet().iterator());
        }
    }

    public final boolean b(@n6.e Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        u4.l0.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v6 = get(key);
        if (u4.l0.g(value, v6)) {
            if (v6 == null) {
                u4.l0.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
                return containsKey(key);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return j(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (u4.l0.g(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Set d();

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return d();
    }

    @Override // java.util.Map
    public boolean equals(@n6.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            Set<Map.Entry<K, V>> entrySet = map.entrySet();
            if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
                return true;
            }
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                if (!b((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @n6.d
    public Set<K> f() {
        if (this.f18286k == null) {
            this.f18286k = new b(this);
        }
        Set set = (Set<? extends K>) this.f18286k;
        u4.l0.m(set);
        return set;
    }

    public int g() {
        return entrySet().size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @n6.e
    public V get(Object obj) {
        Map.Entry<K, V> j7 = j(obj);
        if (j7 != null) {
            return j7.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @n6.d
    public Collection<V> i() {
        if (this.f18287l == null) {
            this.f18287l = new C0264d(this);
        }
        Collection collection = (Collection<? extends V>) this.f18287l;
        u4.l0.m(collection);
        return collection;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Map.Entry<K, V> j(K k7) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (u4.l0.g(((Map.Entry) obj).getKey(), k7)) {
                break;
            }
        }
        return (Map.Entry) obj;
    }

    public final String k(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return f();
    }

    public final String l(Map.Entry<? extends K, ? extends V> entry) {
        return k(entry.getKey()) + '=' + k(entry.getValue());
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
        return g();
    }

    @n6.d
    public String toString() {
        return e0.h3(entrySet(), ", ", "{", "}", 0, null, new c(this), 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return i();
    }
}
