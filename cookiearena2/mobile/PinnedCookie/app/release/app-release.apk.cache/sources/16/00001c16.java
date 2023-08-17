package v3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

@g1(version = "1.3")
@s4.f
@t
@u4.r1({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n62#1:87,3\n*E\n"})
/* loaded from: classes.dex */
public final class c2 implements Collection<b2>, v4.a {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final long[] f17775k;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<b2>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final long[] f17776k;

        /* renamed from: l  reason: collision with root package name */
        public int f17777l;

        public a(@n6.d long[] jArr) {
            u4.l0.p(jArr, "array");
            this.f17776k = jArr;
        }

        public long a() {
            int i7 = this.f17777l;
            long[] jArr = this.f17776k;
            if (i7 < jArr.length) {
                this.f17777l = i7 + 1;
                return b2.l(jArr[i7]);
            }
            throw new NoSuchElementException(String.valueOf(this.f17777l));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17777l < this.f17776k.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ b2 next() {
            return b2.d(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @a1
    public /* synthetic */ c2(long[] jArr) {
        this.f17775k = jArr;
    }

    public static final /* synthetic */ c2 b(long[] jArr) {
        return new c2(jArr);
    }

    @n6.d
    public static long[] d(int i7) {
        return f(new long[i7]);
    }

    @n6.d
    @a1
    public static long[] f(@n6.d long[] jArr) {
        u4.l0.p(jArr, "storage");
        return jArr;
    }

    public static boolean i(long[] jArr, long j7) {
        return x3.p.S8(jArr, j7);
    }

    public static boolean j(long[] jArr, @n6.d Collection<b2> collection) {
        u4.l0.p(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!((obj instanceof b2) && x3.p.S8(jArr, ((b2) obj).l0()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(long[] jArr, Object obj) {
        return (obj instanceof c2) && u4.l0.g(jArr, ((c2) obj).v());
    }

    public static final boolean l(long[] jArr, long[] jArr2) {
        return u4.l0.g(jArr, jArr2);
    }

    public static final long m(long[] jArr, int i7) {
        return b2.l(jArr[i7]);
    }

    public static int o(long[] jArr) {
        return jArr.length;
    }

    @a1
    public static /* synthetic */ void p() {
    }

    public static int q(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean r(long[] jArr) {
        return jArr.length == 0;
    }

    @n6.d
    public static Iterator<b2> s(long[] jArr) {
        return new a(jArr);
    }

    public static final void t(long[] jArr, int i7, long j7) {
        jArr[i7] = j7;
    }

    public static String u(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public boolean a(long j7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(b2 b2Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends b2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof b2) {
            return g(((b2) obj).l0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@n6.d Collection<? extends Object> collection) {
        u4.l0.p(collection, "elements");
        return j(this.f17775k, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f17775k, obj);
    }

    public boolean g(long j7) {
        return i(this.f17775k, j7);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return q(this.f17775k);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f17775k);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @n6.d
    public Iterator<b2> iterator() {
        return s(this.f17775k);
    }

    @Override // java.util.Collection
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public int size() {
        return o(this.f17775k);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return u4.v.a(this);
    }

    public String toString() {
        return u(this.f17775k);
    }

    public final /* synthetic */ long[] v() {
        return this.f17775k;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        u4.l0.p(tArr, "array");
        return (T[]) u4.v.b(this, tArr);
    }
}