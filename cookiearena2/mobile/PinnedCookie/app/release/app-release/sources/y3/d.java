package y3;

import d5.l;
import d5.u;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p0.x0;
import u.v;
import u4.l0;
import u4.r1;
import u4.w;
import v4.g;
import x3.o;
import x3.s0;
/* loaded from: classes.dex */
public final class d<K, V> implements Map<K, V>, Serializable, v4.g {
    public static final int A = -1;
    @n6.d

    /* renamed from: w  reason: collision with root package name */
    public static final a f18819w = new a(null);

    /* renamed from: x  reason: collision with root package name */
    public static final int f18820x = -1640531527;

    /* renamed from: y  reason: collision with root package name */
    public static final int f18821y = 8;

    /* renamed from: z  reason: collision with root package name */
    public static final int f18822z = 2;
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public K[] f18823k;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public V[] f18824l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public int[] f18825m;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public int[] f18826n;

    /* renamed from: o  reason: collision with root package name */
    public int f18827o;

    /* renamed from: p  reason: collision with root package name */
    public int f18828p;

    /* renamed from: q  reason: collision with root package name */
    public int f18829q;

    /* renamed from: r  reason: collision with root package name */
    public int f18830r;
    @n6.e

    /* renamed from: s  reason: collision with root package name */
    public y3.f<K> f18831s;
    @n6.e

    /* renamed from: t  reason: collision with root package name */
    public g<V> f18832t;
    @n6.e

    /* renamed from: u  reason: collision with root package name */
    public y3.e<K, V> f18833u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f18834v;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(w wVar) {
            this();
        }

        public final int c(int i7) {
            return Integer.highestOneBit(u.u(i7, 1) * 3);
        }

        public final int d(int i7) {
            return Integer.numberOfLeadingZeros(i7) + 1;
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b<K, V> extends C0267d<K, V> implements Iterator<Map.Entry<K, V>>, v4.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@n6.d d<K, V> dVar) {
            super(dVar);
            l0.p(dVar, "map");
        }

        @Override // java.util.Iterator
        @n6.d
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            if (a() < d().f18828p) {
                int a7 = a();
                g(a7 + 1);
                i(a7);
                c<K, V> cVar = new c<>(d(), b());
                f();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void k(@n6.d StringBuilder sb) {
            l0.p(sb, "sb");
            if (a() >= d().f18828p) {
                throw new NoSuchElementException();
            }
            int a7 = a();
            g(a7 + 1);
            i(a7);
            Object obj = d().f18823k[b()];
            if (l0.g(obj, d())) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = d().f18824l;
            l0.m(objArr);
            Object obj2 = objArr[b()];
            if (l0.g(obj2, d())) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            f();
        }

        public final int l() {
            if (a() < d().f18828p) {
                int a7 = a();
                g(a7 + 1);
                i(a7);
                Object obj = d().f18823k[b()];
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] objArr = d().f18824l;
                l0.m(objArr);
                Object obj2 = objArr[b()];
                int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
                f();
                return hashCode2;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, g.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final d<K, V> f18835k;

        /* renamed from: l  reason: collision with root package name */
        public final int f18836l;

        public c(@n6.d d<K, V> dVar, int i7) {
            l0.p(dVar, "map");
            this.f18835k = dVar;
            this.f18836l = i7;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@n6.e Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (l0.g(entry.getKey(), getKey()) && l0.g(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) this.f18835k.f18823k[this.f18836l];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = this.f18835k.f18824l;
            l0.m(objArr);
            return (V) objArr[this.f18836l];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v6) {
            this.f18835k.m();
            Object[] k7 = this.f18835k.k();
            int i7 = this.f18836l;
            V v7 = (V) k7[i7];
            k7[i7] = v6;
            return v7;
        }

        @n6.d
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    @r1({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,694:1\n1#2:695\n*E\n"})
    /* renamed from: y3.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0267d<K, V> {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final d<K, V> f18837k;

        /* renamed from: l  reason: collision with root package name */
        public int f18838l;

        /* renamed from: m  reason: collision with root package name */
        public int f18839m;

        public C0267d(@n6.d d<K, V> dVar) {
            l0.p(dVar, "map");
            this.f18837k = dVar;
            this.f18839m = -1;
            f();
        }

        public final int a() {
            return this.f18838l;
        }

        public final int b() {
            return this.f18839m;
        }

        @n6.d
        public final d<K, V> d() {
            return this.f18837k;
        }

        public final void f() {
            while (this.f18838l < this.f18837k.f18828p) {
                int[] iArr = this.f18837k.f18825m;
                int i7 = this.f18838l;
                if (iArr[i7] >= 0) {
                    return;
                }
                this.f18838l = i7 + 1;
            }
        }

        public final void g(int i7) {
            this.f18838l = i7;
        }

        public final boolean hasNext() {
            return this.f18838l < this.f18837k.f18828p;
        }

        public final void i(int i7) {
            this.f18839m = i7;
        }

        public final void remove() {
            if (!(this.f18839m != -1)) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f18837k.m();
            this.f18837k.M(this.f18839m);
            this.f18839m = -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class e<K, V> extends C0267d<K, V> implements Iterator<K>, v4.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@n6.d d<K, V> dVar) {
            super(dVar);
            l0.p(dVar, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (a() < d().f18828p) {
                int a7 = a();
                g(a7 + 1);
                i(a7);
                K k7 = (K) d().f18823k[b()];
                f();
                return k7;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes.dex */
    public static final class f<K, V> extends C0267d<K, V> implements Iterator<V>, v4.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@n6.d d<K, V> dVar) {
            super(dVar);
            l0.p(dVar, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (a() < d().f18828p) {
                int a7 = a();
                g(a7 + 1);
                i(a7);
                Object[] objArr = d().f18824l;
                l0.m(objArr);
                V v6 = (V) objArr[b()];
                f();
                return v6;
            }
            throw new NoSuchElementException();
        }
    }

    public d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i7, int i8) {
        this.f18823k = kArr;
        this.f18824l = vArr;
        this.f18825m = iArr;
        this.f18826n = iArr2;
        this.f18827o = i7;
        this.f18828p = i8;
        this.f18829q = f18819w.d(y());
    }

    public int A() {
        return this.f18830r;
    }

    @n6.d
    public Collection<V> B() {
        g<V> gVar = this.f18832t;
        if (gVar == null) {
            g<V> gVar2 = new g<>(this);
            this.f18832t = gVar2;
            return gVar2;
        }
        return gVar;
    }

    public final int C(K k7) {
        return ((k7 != null ? k7.hashCode() : 0) * (-1640531527)) >>> this.f18829q;
    }

    public final boolean D() {
        return this.f18834v;
    }

    @n6.d
    public final e<K, V> E() {
        return new e<>(this);
    }

    public final boolean F(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z6 = false;
        if (collection.isEmpty()) {
            return false;
        }
        s(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (G(it.next())) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean G(Map.Entry<? extends K, ? extends V> entry) {
        int j7 = j(entry.getKey());
        V[] k7 = k();
        if (j7 >= 0) {
            k7[j7] = entry.getValue();
            return true;
        }
        int i7 = (-j7) - 1;
        if (l0.g(entry.getValue(), k7[i7])) {
            return false;
        }
        k7[i7] = entry.getValue();
        return true;
    }

    public final boolean H(int i7) {
        int C = C(this.f18823k[i7]);
        int i8 = this.f18827o;
        while (true) {
            int[] iArr = this.f18826n;
            if (iArr[C] == 0) {
                iArr[C] = i7 + 1;
                this.f18825m[i7] = C;
                return true;
            }
            i8--;
            if (i8 < 0) {
                return false;
            }
            C = C == 0 ? y() - 1 : C - 1;
        }
    }

    public final void I(int i7) {
        if (this.f18828p > size()) {
            n();
        }
        int i8 = 0;
        if (i7 != y()) {
            this.f18826n = new int[i7];
            this.f18829q = f18819w.d(i7);
        } else {
            o.l2(this.f18826n, 0, 0, y());
        }
        while (i8 < this.f18828p) {
            int i9 = i8 + 1;
            if (!H(i8)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i8 = i9;
        }
    }

    public final boolean J(@n6.d Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, "entry");
        m();
        int u6 = u(entry.getKey());
        if (u6 < 0) {
            return false;
        }
        V[] vArr = this.f18824l;
        l0.m(vArr);
        if (l0.g(vArr[u6], entry.getValue())) {
            M(u6);
            return true;
        }
        return false;
    }

    public final void K(int i7) {
        int B = u.B(this.f18827o * 2, y() / 2);
        int i8 = 0;
        int i9 = i7;
        do {
            i7 = i7 == 0 ? y() - 1 : i7 - 1;
            i8++;
            if (i8 > this.f18827o) {
                this.f18826n[i9] = 0;
                return;
            }
            int[] iArr = this.f18826n;
            int i10 = iArr[i7];
            if (i10 == 0) {
                iArr[i9] = 0;
                return;
            }
            if (i10 < 0) {
                iArr[i9] = -1;
            } else {
                int i11 = i10 - 1;
                if (((C(this.f18823k[i11]) - i7) & (y() - 1)) >= i8) {
                    this.f18826n[i9] = i10;
                    this.f18825m[i11] = i9;
                }
                B--;
            }
            i9 = i7;
            i8 = 0;
            B--;
        } while (B >= 0);
        this.f18826n[i9] = -1;
    }

    public final int L(K k7) {
        m();
        int u6 = u(k7);
        if (u6 < 0) {
            return -1;
        }
        M(u6);
        return u6;
    }

    public final void M(int i7) {
        y3.c.f(this.f18823k, i7);
        K(this.f18825m[i7]);
        this.f18825m[i7] = -1;
        this.f18830r = size() - 1;
    }

    public final boolean N(V v6) {
        m();
        int v7 = v(v6);
        if (v7 < 0) {
            return false;
        }
        M(v7);
        return true;
    }

    public final boolean O(int i7) {
        int w6 = w();
        int i8 = this.f18828p;
        int i9 = w6 - i8;
        int size = i8 - size();
        return i9 < i7 && i9 + size >= i7 && size >= w() / 4;
    }

    @n6.d
    public final f<K, V> P() {
        return new f<>(this);
    }

    public final Object Q() {
        if (this.f18834v) {
            return new i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    @Override // java.util.Map
    public void clear() {
        m();
        s0 it = new l(0, this.f18828p - 1).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            int[] iArr = this.f18825m;
            int i7 = iArr[b7];
            if (i7 >= 0) {
                this.f18826n[i7] = 0;
                iArr[b7] = -1;
            }
        }
        y3.c.g(this.f18823k, 0, this.f18828p);
        V[] vArr = this.f18824l;
        if (vArr != null) {
            y3.c.g(vArr, 0, this.f18828p);
        }
        this.f18830r = 0;
        this.f18828p = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return u(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return v(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return x();
    }

    @Override // java.util.Map
    public boolean equals(@n6.e Object obj) {
        return obj == this || ((obj instanceof Map) && q((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @n6.e
    public V get(Object obj) {
        int u6 = u(obj);
        if (u6 < 0) {
            return null;
        }
        V[] vArr = this.f18824l;
        l0.m(vArr);
        return vArr[u6];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> t6 = t();
        int i7 = 0;
        while (t6.hasNext()) {
            i7 += t6.l();
        }
        return i7;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int j(K k7) {
        m();
        while (true) {
            int C = C(k7);
            int B = u.B(this.f18827o * 2, y() / 2);
            int i7 = 0;
            while (true) {
                int i8 = this.f18826n[C];
                if (i8 <= 0) {
                    if (this.f18828p < w()) {
                        int i9 = this.f18828p;
                        int i10 = i9 + 1;
                        this.f18828p = i10;
                        this.f18823k[i9] = k7;
                        this.f18825m[i9] = C;
                        this.f18826n[C] = i10;
                        this.f18830r = size() + 1;
                        if (i7 > this.f18827o) {
                            this.f18827o = i7;
                        }
                        return i9;
                    }
                    s(1);
                } else if (l0.g(this.f18823k[i8 - 1], k7)) {
                    return -i8;
                } else {
                    i7++;
                    if (i7 > B) {
                        I(y() * 2);
                        break;
                    }
                    C = C == 0 ? y() - 1 : C - 1;
                }
            }
        }
    }

    public final V[] k() {
        V[] vArr = this.f18824l;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) y3.c.d(w());
        this.f18824l = vArr2;
        return vArr2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return z();
    }

    @n6.d
    public final Map<K, V> l() {
        m();
        this.f18834v = true;
        return this;
    }

    public final void m() {
        if (this.f18834v) {
            throw new UnsupportedOperationException();
        }
    }

    public final void n() {
        int i7;
        V[] vArr = this.f18824l;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i7 = this.f18828p;
            if (i8 >= i7) {
                break;
            }
            if (this.f18825m[i8] >= 0) {
                K[] kArr = this.f18823k;
                kArr[i9] = kArr[i8];
                if (vArr != null) {
                    vArr[i9] = vArr[i8];
                }
                i9++;
            }
            i8++;
        }
        y3.c.g(this.f18823k, i9, i7);
        if (vArr != null) {
            y3.c.g(vArr, i9, this.f18828p);
        }
        this.f18828p = i9;
    }

    public final boolean o(@n6.d Collection<?> collection) {
        l0.p(collection, x0.f14590b);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!p((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean p(@n6.d Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, "entry");
        int u6 = u(entry.getKey());
        if (u6 < 0) {
            return false;
        }
        V[] vArr = this.f18824l;
        l0.m(vArr);
        return l0.g(vArr[u6], entry.getValue());
    }

    @Override // java.util.Map
    @n6.e
    public V put(K k7, V v6) {
        m();
        int j7 = j(k7);
        V[] k8 = k();
        if (j7 >= 0) {
            k8[j7] = v6;
            return null;
        }
        int i7 = (-j7) - 1;
        V v7 = k8[i7];
        k8[i7] = v6;
        return v7;
    }

    @Override // java.util.Map
    public void putAll(@n6.d Map<? extends K, ? extends V> map) {
        l0.p(map, v.h.f17254c);
        m();
        F(map.entrySet());
    }

    public final boolean q(Map<?, ?> map) {
        return size() == map.size() && o(map.entrySet());
    }

    public final void r(int i7) {
        if (i7 < 0) {
            throw new OutOfMemoryError();
        }
        if (i7 > w()) {
            int w6 = (w() * 3) / 2;
            if (i7 <= w6) {
                i7 = w6;
            }
            this.f18823k = (K[]) y3.c.e(this.f18823k, i7);
            V[] vArr = this.f18824l;
            this.f18824l = vArr != null ? (V[]) y3.c.e(vArr, i7) : null;
            int[] copyOf = Arrays.copyOf(this.f18825m, i7);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.f18825m = copyOf;
            int c7 = f18819w.c(i7);
            if (c7 > y()) {
                I(c7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @n6.e
    public V remove(Object obj) {
        int L = L(obj);
        if (L < 0) {
            return null;
        }
        V[] vArr = this.f18824l;
        l0.m(vArr);
        V v6 = vArr[L];
        y3.c.f(vArr, L);
        return v6;
    }

    public final void s(int i7) {
        if (O(i7)) {
            I(y());
        } else {
            r(this.f18828p + i7);
        }
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return A();
    }

    @n6.d
    public final b<K, V> t() {
        return new b<>(this);
    }

    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b<K, V> t6 = t();
        int i7 = 0;
        while (t6.hasNext()) {
            if (i7 > 0) {
                sb.append(", ");
            }
            t6.k(sb);
            i7++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        l0.o(sb2, "sb.toString()");
        return sb2;
    }

    public final int u(K k7) {
        int C = C(k7);
        int i7 = this.f18827o;
        while (true) {
            int i8 = this.f18826n[C];
            if (i8 == 0) {
                return -1;
            }
            if (i8 > 0) {
                int i9 = i8 - 1;
                if (l0.g(this.f18823k[i9], k7)) {
                    return i9;
                }
            }
            i7--;
            if (i7 < 0) {
                return -1;
            }
            C = C == 0 ? y() - 1 : C - 1;
        }
    }

    public final int v(V v6) {
        int i7 = this.f18828p;
        while (true) {
            i7--;
            if (i7 < 0) {
                return -1;
            }
            if (this.f18825m[i7] >= 0) {
                V[] vArr = this.f18824l;
                l0.m(vArr);
                if (l0.g(vArr[i7], v6)) {
                    return i7;
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return B();
    }

    public final int w() {
        return this.f18823k.length;
    }

    @n6.d
    public Set<Map.Entry<K, V>> x() {
        y3.e<K, V> eVar = this.f18833u;
        if (eVar == null) {
            y3.e<K, V> eVar2 = new y3.e<>(this);
            this.f18833u = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public final int y() {
        return this.f18826n.length;
    }

    @n6.d
    public Set<K> z() {
        y3.f<K> fVar = this.f18831s;
        if (fVar == null) {
            y3.f<K> fVar2 = new y3.f<>(this);
            this.f18831s = fVar2;
            return fVar2;
        }
        return fVar;
    }

    public d() {
        this(8);
    }

    public d(int i7) {
        this(y3.c.d(i7), null, new int[i7], new int[f18819w.c(i7)], 2, 0);
    }
}
