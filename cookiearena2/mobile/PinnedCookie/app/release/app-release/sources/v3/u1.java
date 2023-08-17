package v3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
@g1(version = "1.3")
@s4.f
@t
@u4.r1({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n62#1:87,3\n*E\n"})
/* loaded from: classes.dex */
public final class u1 implements Collection<t1>, v4.a {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final byte[] f17834k;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<t1>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final byte[] f17835k;

        /* renamed from: l  reason: collision with root package name */
        public int f17836l;

        public a(@n6.d byte[] bArr) {
            u4.l0.p(bArr, "array");
            this.f17835k = bArr;
        }

        public byte a() {
            int i7 = this.f17836l;
            byte[] bArr = this.f17835k;
            if (i7 < bArr.length) {
                this.f17836l = i7 + 1;
                return t1.l(bArr[i7]);
            }
            throw new NoSuchElementException(String.valueOf(this.f17836l));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17836l < this.f17835k.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ t1 next() {
            return t1.d(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @a1
    public /* synthetic */ u1(byte[] bArr) {
        this.f17834k = bArr;
    }

    public static final /* synthetic */ u1 b(byte[] bArr) {
        return new u1(bArr);
    }

    @n6.d
    public static byte[] d(int i7) {
        return f(new byte[i7]);
    }

    @n6.d
    @a1
    public static byte[] f(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "storage");
        return bArr;
    }

    public static boolean i(byte[] bArr, byte b7) {
        return x3.p.N8(bArr, b7);
    }

    public static boolean j(byte[] bArr, @n6.d Collection<t1> collection) {
        u4.l0.p(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!((obj instanceof t1) && x3.p.N8(bArr, ((t1) obj).j0()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(byte[] bArr, Object obj) {
        return (obj instanceof u1) && u4.l0.g(bArr, ((u1) obj).v());
    }

    public static final boolean l(byte[] bArr, byte[] bArr2) {
        return u4.l0.g(bArr, bArr2);
    }

    public static final byte m(byte[] bArr, int i7) {
        return t1.l(bArr[i7]);
    }

    public static int o(byte[] bArr) {
        return bArr.length;
    }

    @a1
    public static /* synthetic */ void p() {
    }

    public static int q(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean r(byte[] bArr) {
        return bArr.length == 0;
    }

    @n6.d
    public static Iterator<t1> s(byte[] bArr) {
        return new a(bArr);
    }

    public static final void t(byte[] bArr, int i7, byte b7) {
        bArr[i7] = b7;
    }

    public static String u(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public boolean a(byte b7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(t1 t1Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends t1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof t1) {
            return g(((t1) obj).j0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@n6.d Collection<? extends Object> collection) {
        u4.l0.p(collection, "elements");
        return j(this.f17834k, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f17834k, obj);
    }

    public boolean g(byte b7) {
        return i(this.f17834k, b7);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return q(this.f17834k);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f17834k);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @n6.d
    public Iterator<t1> iterator() {
        return s(this.f17834k);
    }

    @Override // java.util.Collection
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public int size() {
        return o(this.f17834k);
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
        return u(this.f17834k);
    }

    public final /* synthetic */ byte[] v() {
        return this.f17834k;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        u4.l0.p(tArr, "array");
        return (T[]) u4.v.b(this, tArr);
    }
}
