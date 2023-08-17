package kotlinx.coroutines.debug.internal;

import d5.u;
import i0.x2;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.r0;
import t4.p;
import u4.l0;
import u4.n0;
import u4.w;
import v3.m2;
import v3.y;
import v4.g;
/* loaded from: classes.dex */
public final class c<K, V> extends x3.g<K, V> {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11871l = AtomicIntegerFieldUpdater.newUpdater(c.class, "_size");
    @n6.d
    private volatile /* synthetic */ int _size;
    @n6.d
    volatile /* synthetic */ Object core;
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public final ReferenceQueue<K> f11872k;

    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: g  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f11873g = AtomicIntegerFieldUpdater.newUpdater(a.class, "load");

        /* renamed from: a  reason: collision with root package name */
        public final int f11874a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11875b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11876c;
        @n6.d

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ AtomicReferenceArray f11877d;
        @n6.d

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ AtomicReferenceArray f11878e;
        @n6.d
        private volatile /* synthetic */ int load = 0;

        /* renamed from: kotlinx.coroutines.debug.internal.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0143a<E> implements Iterator<E>, v4.d {
            @n6.d

            /* renamed from: k  reason: collision with root package name */
            public final p<K, V, E> f11880k;

            /* renamed from: l  reason: collision with root package name */
            public int f11881l = -1;

            /* renamed from: m  reason: collision with root package name */
            public K f11882m;

            /* renamed from: n  reason: collision with root package name */
            public V f11883n;

            /* JADX WARN: Multi-variable type inference failed */
            public C0143a(@n6.d p<? super K, ? super V, ? extends E> pVar) {
                this.f11880k = pVar;
                a();
            }

            public final void a() {
                K k7;
                while (true) {
                    int i7 = this.f11881l + 1;
                    this.f11881l = i7;
                    if (i7 >= a.this.f11874a) {
                        return;
                    }
                    l lVar = (l) a.this.f11877d.get(this.f11881l);
                    if (lVar != null && (k7 = (K) lVar.get()) != null) {
                        this.f11882m = k7;
                        V v6 = (V) a.this.f11878e.get(this.f11881l);
                        if (v6 instanceof m) {
                            v6 = (V) ((m) v6).f11950a;
                        }
                        if (v6 != null) {
                            this.f11883n = v6;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            @n6.d
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public Void remove() {
                kotlinx.coroutines.debug.internal.d.e();
                throw new y();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f11881l < a.this.f11874a;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.f11881l < a.this.f11874a) {
                    p<K, V, E> pVar = this.f11880k;
                    K k7 = this.f11882m;
                    if (k7 == null) {
                        l0.S(x2.f10960j);
                        k7 = (K) m2.f17815a;
                    }
                    V v6 = this.f11883n;
                    if (v6 == null) {
                        l0.S("value");
                        v6 = (V) m2.f17815a;
                    }
                    E J = pVar.J(k7, v6);
                    a();
                    return J;
                }
                throw new NoSuchElementException();
            }
        }

        public a(int i7) {
            this.f11874a = i7;
            this.f11875b = Integer.numberOfLeadingZeros(i7) + 1;
            this.f11876c = (i7 * 2) / 3;
            this.f11877d = new AtomicReferenceArray(i7);
            this.f11878e = new AtomicReferenceArray(i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object g(a aVar, Object obj, Object obj2, l lVar, int i7, Object obj3) {
            if ((i7 & 4) != 0) {
                lVar = null;
            }
            return aVar.f(obj, obj2, lVar);
        }

        public final void b(@n6.d l<?> lVar) {
            int d7 = d(lVar.f11949a);
            while (true) {
                l<?> lVar2 = (l) this.f11877d.get(d7);
                if (lVar2 == null) {
                    return;
                }
                if (lVar2 == lVar) {
                    i(d7);
                    return;
                }
                if (d7 == 0) {
                    d7 = this.f11874a;
                }
                d7--;
            }
        }

        @n6.e
        public final V c(@n6.d K k7) {
            int d7 = d(k7.hashCode());
            while (true) {
                l lVar = (l) this.f11877d.get(d7);
                if (lVar == null) {
                    return null;
                }
                T t6 = lVar.get();
                if (l0.g(k7, t6)) {
                    V v6 = (V) this.f11878e.get(d7);
                    return v6 instanceof m ? (V) ((m) v6).f11950a : v6;
                }
                if (t6 == 0) {
                    i(d7);
                }
                if (d7 == 0) {
                    d7 = this.f11874a;
                }
                d7--;
            }
        }

        public final int d(int i7) {
            return (i7 * (-1640531527)) >>> this.f11875b;
        }

        @n6.d
        public final <E> Iterator<E> e(@n6.d p<? super K, ? super V, ? extends E> pVar) {
            return new C0143a(pVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
            if (r1 < r5.f11876c) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
            r6 = kotlinx.coroutines.debug.internal.d.f11893c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
            if (kotlinx.coroutines.debug.internal.c.a.f11873g.compareAndSet(r5, r1, r1 + 1) != false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
            r1 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
            if (r8 != null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
            r8 = new kotlinx.coroutines.debug.internal.l<>(r6, r5.f11879f.f11872k);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
            if (kotlinx.coroutines.debug.internal.b.a(r5.f11877d, r0, null, r8) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
            r6 = r5.f11878e.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
            if ((r6 instanceof kotlinx.coroutines.debug.internal.m) == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
            r6 = kotlinx.coroutines.debug.internal.d.f11893c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
            if (kotlinx.coroutines.debug.internal.b.a(r5.f11878e, r0, r6, r7) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r1 == false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
            r1 = r5.load;
         */
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(@n6.d K r6, @n6.e V r7, @n6.e kotlinx.coroutines.debug.internal.l<K> r8) {
            /*
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.d(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.f11877d
                java.lang.Object r2 = r2.get(r0)
                kotlinx.coroutines.debug.internal.l r2 = (kotlinx.coroutines.debug.internal.l) r2
                if (r2 != 0) goto L46
                r2 = 0
                if (r7 != 0) goto L17
                return r2
            L17:
                if (r1 != 0) goto L30
            L19:
                int r1 = r5.load
                int r3 = r5.f11876c
                if (r1 < r3) goto L24
                kotlinx.coroutines.internal.r0 r6 = kotlinx.coroutines.debug.internal.d.a()
                return r6
            L24:
                int r3 = r1 + 1
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.debug.internal.c.a.f11873g
                boolean r1 = r4.compareAndSet(r5, r1, r3)
                if (r1 != 0) goto L2f
                goto L19
            L2f:
                r1 = 1
            L30:
                if (r8 != 0) goto L3d
                kotlinx.coroutines.debug.internal.l r8 = new kotlinx.coroutines.debug.internal.l
                kotlinx.coroutines.debug.internal.c<K, V> r3 = kotlinx.coroutines.debug.internal.c.this
                java.lang.ref.ReferenceQueue r3 = kotlinx.coroutines.debug.internal.c.i(r3)
                r8.<init>(r6, r3)
            L3d:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f11877d
                boolean r2 = kotlinx.coroutines.debug.internal.b.a(r3, r0, r2, r8)
                if (r2 != 0) goto L57
                goto L9
            L46:
                java.lang.Object r2 = r2.get()
                boolean r3 = u4.l0.g(r6, r2)
                if (r3 == 0) goto L6f
                if (r1 == 0) goto L57
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = kotlinx.coroutines.debug.internal.c.a.f11873g
                r6.decrementAndGet(r5)
            L57:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.f11878e
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof kotlinx.coroutines.debug.internal.m
                if (r8 == 0) goto L66
                kotlinx.coroutines.internal.r0 r6 = kotlinx.coroutines.debug.internal.d.a()
                return r6
            L66:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.f11878e
                boolean r8 = kotlinx.coroutines.debug.internal.b.a(r8, r0, r6, r7)
                if (r8 == 0) goto L57
                return r6
            L6f:
                if (r2 != 0) goto L74
                r5.i(r0)
            L74:
                if (r0 != 0) goto L78
                int r0 = r5.f11874a
            L78:
                int r0 = r0 + (-1)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.c.a.f(java.lang.Object, java.lang.Object, kotlinx.coroutines.debug.internal.l):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @n6.d
        public final c<K, V>.a h() {
            Object obj;
            r0 r0Var;
            m d7;
            while (true) {
                c<K, V>.a aVar = (c<K, V>.a) new a(Integer.highestOneBit(u.u(c.this.size(), 4)) * 4);
                int i7 = this.f11874a;
                for (int i8 = 0; i8 < i7; i8++) {
                    l lVar = (l) this.f11877d.get(i8);
                    Object obj2 = lVar != null ? lVar.get() : null;
                    if (lVar != null && obj2 == null) {
                        i(i8);
                    }
                    while (true) {
                        obj = this.f11878e.get(i8);
                        if (obj instanceof m) {
                            obj = ((m) obj).f11950a;
                            break;
                        }
                        AtomicReferenceArray atomicReferenceArray = this.f11878e;
                        d7 = kotlinx.coroutines.debug.internal.d.d(obj);
                        if (kotlinx.coroutines.debug.internal.b.a(atomicReferenceArray, i8, obj, d7)) {
                            break;
                        }
                    }
                    if (obj2 != null && obj != null) {
                        Object f7 = aVar.f(obj2, obj, lVar);
                        r0Var = kotlinx.coroutines.debug.internal.d.f11893c;
                        if (f7 != r0Var) {
                        }
                    }
                }
                return aVar;
            }
        }

        public final void i(int i7) {
            Object obj;
            do {
                obj = this.f11878e.get(i7);
                if (obj == null || (obj instanceof m)) {
                    return;
                }
            } while (!kotlinx.coroutines.debug.internal.b.a(this.f11878e, i7, obj, null));
            c.this.k();
        }
    }

    /* loaded from: classes.dex */
    public static final class b<K, V> implements Map.Entry<K, V>, g.a {

        /* renamed from: k  reason: collision with root package name */
        public final K f11885k;

        /* renamed from: l  reason: collision with root package name */
        public final V f11886l;

        public b(K k7, V v6) {
            this.f11885k = k7;
            this.f11886l = v6;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f11885k;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f11886l;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v6) {
            kotlinx.coroutines.debug.internal.d.e();
            throw new y();
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0144c<E> extends x3.h<E> {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final p<K, V, E> f11887k;

        /* JADX WARN: Multi-variable type inference failed */
        public C0144c(@n6.d p<? super K, ? super V, ? extends E> pVar) {
            this.f11887k = pVar;
        }

        @Override // x3.h
        public int a() {
            return c.this.size();
        }

        @Override // x3.h, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e7) {
            kotlinx.coroutines.debug.internal.d.e();
            throw new y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @n6.d
        public Iterator<E> iterator() {
            return ((a) c.this.core).e(this.f11887k);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends n0 implements p<K, V, Map.Entry<K, V>> {

        /* renamed from: l  reason: collision with root package name */
        public static final d f11889l = new d();

        public d() {
            super(2);
        }

        @Override // t4.p
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Map.Entry<K, V> J(@n6.d K k7, @n6.d V v6) {
            return new b(k7, v6);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends n0 implements p<K, V, K> {

        /* renamed from: l  reason: collision with root package name */
        public static final e f11890l = new e();

        public e() {
            super(2);
        }

        @Override // t4.p
        @n6.d
        public final K J(@n6.d K k7, @n6.d V v6) {
            return k7;
        }
    }

    public c() {
        this(false, 1, null);
    }

    @Override // x3.g
    @n6.d
    public Set<Map.Entry<K, V>> a() {
        return new C0144c(d.f11889l);
    }

    @Override // x3.g
    @n6.d
    public Set<K> b() {
        return new C0144c(e.f11890l);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // x3.g
    public int d() {
        return this._size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @n6.e
    public V get(@n6.e Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((a) this.core).c(obj);
    }

    public final void j(l<?> lVar) {
        ((a) this.core).b(lVar);
    }

    public final void k() {
        f11871l.decrementAndGet(this);
    }

    public final synchronized V l(K k7, V v6) {
        V v7;
        r0 r0Var;
        a aVar = (a) this.core;
        while (true) {
            v7 = (V) a.g(aVar, k7, v6, null, 4, null);
            r0Var = kotlinx.coroutines.debug.internal.d.f11893c;
            if (v7 == r0Var) {
                aVar = aVar.h();
                this.core = aVar;
            }
        }
        return v7;
    }

    public final void m() {
        if (!(this.f11872k != null)) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference<? extends K> remove = this.f11872k.remove();
                if (remove == null) {
                    break;
                }
                j((l) remove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
    }

    @Override // x3.g, java.util.AbstractMap, java.util.Map
    @n6.e
    public V put(@n6.d K k7, @n6.d V v6) {
        r0 r0Var;
        V v7 = (V) a.g((a) this.core, k7, v6, null, 4, null);
        r0Var = kotlinx.coroutines.debug.internal.d.f11893c;
        if (v7 == r0Var) {
            v7 = l(k7, v6);
        }
        if (v7 == null) {
            f11871l.incrementAndGet(this);
        }
        return v7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @n6.e
    public V remove(@n6.e Object obj) {
        r0 r0Var;
        if (obj == 0) {
            return null;
        }
        V v6 = (V) a.g((a) this.core, obj, null, null, 4, null);
        r0Var = kotlinx.coroutines.debug.internal.d.f11893c;
        if (v6 == r0Var) {
            v6 = l(obj, null);
        }
        if (v6 != null) {
            f11871l.decrementAndGet(this);
        }
        return v6;
    }

    public /* synthetic */ c(boolean z6, int i7, w wVar) {
        this((i7 & 1) != 0 ? false : z6);
    }

    public c(boolean z6) {
        this._size = 0;
        this.core = new a(16);
        this.f11872k = z6 ? new ReferenceQueue<>() : null;
    }
}
