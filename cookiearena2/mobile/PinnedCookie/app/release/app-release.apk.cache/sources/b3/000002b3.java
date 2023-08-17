package androidx.collection;

import d.o0;
import d.q0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class j<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f1952a;

    /* renamed from: b  reason: collision with root package name */
    public int f1953b;

    /* renamed from: c  reason: collision with root package name */
    public int f1954c;

    /* renamed from: d  reason: collision with root package name */
    public int f1955d;

    /* renamed from: e  reason: collision with root package name */
    public int f1956e;

    /* renamed from: f  reason: collision with root package name */
    public int f1957f;

    /* renamed from: g  reason: collision with root package name */
    public int f1958g;

    /* renamed from: h  reason: collision with root package name */
    public int f1959h;

    public j(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1954c = i7;
        this.f1952a = new LinkedHashMap<>(0, 0.75f, true);
    }

    @q0
    public V a(@o0 K k7) {
        return null;
    }

    public final synchronized int b() {
        return this.f1956e;
    }

    public void c(boolean z6, @o0 K k7, @o0 V v6, @q0 V v7) {
    }

    public final void d() {
        r(-1);
    }

    public final synchronized int e() {
        return this.f1957f;
    }

    @q0
    public final V f(@o0 K k7) {
        V put;
        if (k7 != null) {
            synchronized (this) {
                V v6 = this.f1952a.get(k7);
                if (v6 != null) {
                    this.f1958g++;
                    return v6;
                }
                this.f1959h++;
                V a7 = a(k7);
                if (a7 == null) {
                    return null;
                }
                synchronized (this) {
                    this.f1956e++;
                    put = this.f1952a.put(k7, a7);
                    if (put != null) {
                        this.f1952a.put(k7, put);
                    } else {
                        this.f1953b += n(k7, a7);
                    }
                }
                if (put != null) {
                    c(false, k7, a7, put);
                    return put;
                }
                r(this.f1954c);
                return a7;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized int g() {
        return this.f1958g;
    }

    public final synchronized int h() {
        return this.f1954c;
    }

    public final synchronized int i() {
        return this.f1959h;
    }

    @q0
    public final V j(@o0 K k7, @o0 V v6) {
        V put;
        if (k7 == null || v6 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1955d++;
            this.f1953b += n(k7, v6);
            put = this.f1952a.put(k7, v6);
            if (put != null) {
                this.f1953b -= n(k7, put);
            }
        }
        if (put != null) {
            c(false, k7, put, v6);
        }
        r(this.f1954c);
        return put;
    }

    public final synchronized int k() {
        return this.f1955d;
    }

    @q0
    public final V l(@o0 K k7) {
        V remove;
        if (k7 != null) {
            synchronized (this) {
                remove = this.f1952a.remove(k7);
                if (remove != null) {
                    this.f1953b -= n(k7, remove);
                }
            }
            if (remove != null) {
                c(false, k7, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public void m(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.f1954c = i7;
        }
        r(i7);
    }

    public final int n(K k7, V v6) {
        int p6 = p(k7, v6);
        if (p6 >= 0) {
            return p6;
        }
        throw new IllegalStateException("Negative size: " + k7 + "=" + v6);
    }

    public final synchronized int o() {
        return this.f1953b;
    }

    public int p(@o0 K k7, @o0 V v6) {
        return 1;
    }

    public final synchronized Map<K, V> q() {
        return new LinkedHashMap(this.f1952a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f1953b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f1952a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f1953b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f1953b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f1952a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f1952a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f1952a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1953b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.n(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f1953b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1957f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f1957f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.c(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.j.r(int):void");
    }

    public final synchronized String toString() {
        int i7;
        int i8;
        i7 = this.f1958g;
        i8 = this.f1959h + i7;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1954c), Integer.valueOf(this.f1958g), Integer.valueOf(this.f1959h), Integer.valueOf(i8 != 0 ? (i7 * 100) / i8 : 0));
    }
}