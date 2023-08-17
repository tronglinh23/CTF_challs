package v3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
@g1(version = "1.3")
@s4.f
@t
@u4.r1({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n62#1:87,3\n*E\n"})
/* loaded from: classes.dex */
public final class i2 implements Collection<h2>, v4.a {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final short[] f17800k;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<h2>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final short[] f17801k;

        /* renamed from: l  reason: collision with root package name */
        public int f17802l;

        public a(@n6.d short[] sArr) {
            u4.l0.p(sArr, "array");
            this.f17801k = sArr;
        }

        public short a() {
            int i7 = this.f17802l;
            short[] sArr = this.f17801k;
            if (i7 < sArr.length) {
                this.f17802l = i7 + 1;
                return h2.l(sArr[i7]);
            }
            throw new NoSuchElementException(String.valueOf(this.f17802l));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17802l < this.f17801k.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ h2 next() {
            return h2.d(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @a1
    public /* synthetic */ i2(short[] sArr) {
        this.f17800k = sArr;
    }

    public static final /* synthetic */ i2 b(short[] sArr) {
        return new i2(sArr);
    }

    @n6.d
    public static short[] d(int i7) {
        return f(new short[i7]);
    }

    @n6.d
    @a1
    public static short[] f(@n6.d short[] sArr) {
        u4.l0.p(sArr, "storage");
        return sArr;
    }

    public static boolean i(short[] sArr, short s6) {
        return x3.p.U8(sArr, s6);
    }

    public static boolean j(short[] sArr, @n6.d Collection<h2> collection) {
        u4.l0.p(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!((obj instanceof h2) && x3.p.U8(sArr, ((h2) obj).j0()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(short[] sArr, Object obj) {
        return (obj instanceof i2) && u4.l0.g(sArr, ((i2) obj).v());
    }

    public static final boolean l(short[] sArr, short[] sArr2) {
        return u4.l0.g(sArr, sArr2);
    }

    public static final short m(short[] sArr, int i7) {
        return h2.l(sArr[i7]);
    }

    public static int o(short[] sArr) {
        return sArr.length;
    }

    @a1
    public static /* synthetic */ void p() {
    }

    public static int q(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean r(short[] sArr) {
        return sArr.length == 0;
    }

    @n6.d
    public static Iterator<h2> s(short[] sArr) {
        return new a(sArr);
    }

    public static final void t(short[] sArr, int i7, short s6) {
        sArr[i7] = s6;
    }

    public static String u(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public boolean a(short s6) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(h2 h2Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends h2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h2) {
            return g(((h2) obj).j0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@n6.d Collection<? extends Object> collection) {
        u4.l0.p(collection, "elements");
        return j(this.f17800k, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f17800k, obj);
    }

    public boolean g(short s6) {
        return i(this.f17800k, s6);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return q(this.f17800k);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f17800k);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @n6.d
    public Iterator<h2> iterator() {
        return s(this.f17800k);
    }

    @Override // java.util.Collection
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public int size() {
        return o(this.f17800k);
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
        return u(this.f17800k);
    }

    public final /* synthetic */ short[] v() {
        return this.f17800k;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        u4.l0.p(tArr, "array");
        return (T[]) u4.v.b(this, tArr);
    }
}
