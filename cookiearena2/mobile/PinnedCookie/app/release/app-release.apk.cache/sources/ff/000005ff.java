package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class z0 {
    @d.q0

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f4866a;
    @d.q0

    /* renamed from: b  reason: collision with root package name */
    public final Set<Closeable> f4867b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f4868c;

    public z0() {
        this.f4866a = new HashMap();
        this.f4867b = new LinkedHashSet();
        this.f4868c = false;
    }

    public static void d(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public void b(@d.o0 Closeable closeable) {
        Set<Closeable> set = this.f4867b;
        if (set != null) {
            synchronized (set) {
                this.f4867b.add(closeable);
            }
        }
    }

    @d.l0
    public final void c() {
        this.f4868c = true;
        Map<String, Object> map = this.f4866a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f4866a.values().iterator();
                while (it.hasNext()) {
                    d(it.next());
                }
            }
        }
        Set<Closeable> set = this.f4867b;
        if (set != null) {
            synchronized (set) {
                Iterator<Closeable> it2 = this.f4867b.iterator();
                while (it2.hasNext()) {
                    d(it2.next());
                }
            }
        }
        f();
    }

    public <T> T e(String str) {
        T t6;
        Map<String, Object> map = this.f4866a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t6 = (T) this.f4866a.get(str);
        }
        return t6;
    }

    public void f() {
    }

    public <T> T g(String str, T t6) {
        Object obj;
        synchronized (this.f4866a) {
            obj = this.f4866a.get(str);
            if (obj == null) {
                this.f4866a.put(str, t6);
            }
        }
        if (obj != null) {
            t6 = obj;
        }
        if (this.f4868c) {
            d(t6);
        }
        return t6;
    }

    public z0(@d.o0 Closeable... closeableArr) {
        this.f4866a = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f4867b = linkedHashSet;
        this.f4868c = false;
        linkedHashSet.addAll(Arrays.asList(closeableArr));
    }
}