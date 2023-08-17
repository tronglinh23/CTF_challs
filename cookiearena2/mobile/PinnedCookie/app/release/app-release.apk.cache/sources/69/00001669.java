package m;

import d.b1;
import d.o0;
import d.q0;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: k  reason: collision with root package name */
    public c<K, V> f13394k;

    /* renamed from: l  reason: collision with root package name */
    public c<K, V> f13395l;

    /* renamed from: m  reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f13396m = new WeakHashMap<>();

    /* renamed from: n  reason: collision with root package name */
    public int f13397n = 0;

    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f13401n;
        }

        @Override // m.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f13400m;
        }
    }

    /* renamed from: m.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0180b<K, V> extends e<K, V> {
        public C0180b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f13400m;
        }

        @Override // m.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f13401n;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {
        @o0

        /* renamed from: k  reason: collision with root package name */
        public final K f13398k;
        @o0

        /* renamed from: l  reason: collision with root package name */
        public final V f13399l;

        /* renamed from: m  reason: collision with root package name */
        public c<K, V> f13400m;

        /* renamed from: n  reason: collision with root package name */
        public c<K, V> f13401n;

        public c(@o0 K k7, @o0 V v6) {
            this.f13398k = k7;
            this.f13399l = v6;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f13398k.equals(cVar.f13398k) && this.f13399l.equals(cVar.f13399l);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        @o0
        public K getKey() {
            return this.f13398k;
        }

        @Override // java.util.Map.Entry
        @o0
        public V getValue() {
            return this.f13399l;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f13398k.hashCode() ^ this.f13399l.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v6) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f13398k + "=" + this.f13399l;
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: k  reason: collision with root package name */
        public c<K, V> f13402k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f13403l = true;

        public d() {
        }

        @Override // m.b.f
        public void a(@o0 c<K, V> cVar) {
            c<K, V> cVar2 = this.f13402k;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f13401n;
                this.f13402k = cVar3;
                this.f13403l = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f13403l) {
                this.f13403l = false;
                this.f13402k = b.this.f13394k;
            } else {
                c<K, V> cVar = this.f13402k;
                this.f13402k = cVar != null ? cVar.f13400m : null;
            }
            return this.f13402k;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13403l) {
                return b.this.f13394k != null;
            }
            c<K, V> cVar = this.f13402k;
            return (cVar == null || cVar.f13400m == null) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: k  reason: collision with root package name */
        public c<K, V> f13405k;

        /* renamed from: l  reason: collision with root package name */
        public c<K, V> f13406l;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f13405k = cVar2;
            this.f13406l = cVar;
        }

        @Override // m.b.f
        public void a(@o0 c<K, V> cVar) {
            if (this.f13405k == cVar && cVar == this.f13406l) {
                this.f13406l = null;
                this.f13405k = null;
            }
            c<K, V> cVar2 = this.f13405k;
            if (cVar2 == cVar) {
                this.f13405k = b(cVar2);
            }
            if (this.f13406l == cVar) {
                this.f13406l = e();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f13406l;
            this.f13406l = e();
            return cVar;
        }

        public final c<K, V> e() {
            c<K, V> cVar = this.f13406l;
            c<K, V> cVar2 = this.f13405k;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13406l != null;
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static abstract class f<K, V> {
        public abstract void a(@o0 c<K, V> cVar);
    }

    @o0
    public Iterator<Map.Entry<K, V>> a() {
        C0180b c0180b = new C0180b(this.f13395l, this.f13394k);
        this.f13396m.put(c0180b, Boolean.FALSE);
        return c0180b;
    }

    @q0
    public Map.Entry<K, V> b() {
        return this.f13394k;
    }

    @q0
    public c<K, V> d(K k7) {
        c<K, V> cVar = this.f13394k;
        while (cVar != null && !cVar.f13398k.equals(k7)) {
            cVar = cVar.f13400m;
        }
        return cVar;
    }

    @o0
    public b<K, V>.d e() {
        b<K, V>.d dVar = new d();
        this.f13396m.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (size() != bVar.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    @q0
    public Map.Entry<K, V> f() {
        return this.f13395l;
    }

    public c<K, V> g(@o0 K k7, @o0 V v6) {
        c<K, V> cVar = new c<>(k7, v6);
        this.f13397n++;
        c<K, V> cVar2 = this.f13395l;
        if (cVar2 == null) {
            this.f13394k = cVar;
            this.f13395l = cVar;
            return cVar;
        }
        cVar2.f13400m = cVar;
        cVar.f13401n = cVar2;
        this.f13395l = cVar;
        return cVar;
    }

    public V h(@o0 K k7, @o0 V v6) {
        c<K, V> d7 = d(k7);
        if (d7 != null) {
            return d7.f13399l;
        }
        g(k7, v6);
        return null;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += it.next().hashCode();
        }
        return i7;
    }

    public V i(@o0 K k7) {
        c<K, V> d7 = d(k7);
        if (d7 == null) {
            return null;
        }
        this.f13397n--;
        if (!this.f13396m.isEmpty()) {
            Iterator<f<K, V>> it = this.f13396m.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(d7);
            }
        }
        c<K, V> cVar = d7.f13401n;
        if (cVar != null) {
            cVar.f13400m = d7.f13400m;
        } else {
            this.f13394k = d7.f13400m;
        }
        c<K, V> cVar2 = d7.f13400m;
        if (cVar2 != null) {
            cVar2.f13401n = cVar;
        } else {
            this.f13395l = cVar;
        }
        d7.f13400m = null;
        d7.f13401n = null;
        return d7.f13399l;
    }

    @Override // java.lang.Iterable
    @o0
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f13394k, this.f13395l);
        this.f13396m.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f13397n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}