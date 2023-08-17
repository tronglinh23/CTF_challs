package v3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
@g1(version = "1.3")
@s4.f
@t
@u4.r1({"SMAP\nUIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n*L\n62#1:87,3\n*E\n"})
/* loaded from: classes.dex */
public final class y1 implements Collection<x1>, v4.a {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final int[] f17844k;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<x1>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final int[] f17845k;

        /* renamed from: l  reason: collision with root package name */
        public int f17846l;

        public a(@n6.d int[] iArr) {
            u4.l0.p(iArr, "array");
            this.f17845k = iArr;
        }

        public int a() {
            int i7 = this.f17846l;
            int[] iArr = this.f17845k;
            if (i7 < iArr.length) {
                this.f17846l = i7 + 1;
                return x1.l(iArr[i7]);
            }
            throw new NoSuchElementException(String.valueOf(this.f17846l));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17846l < this.f17845k.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ x1 next() {
            return x1.d(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @a1
    public /* synthetic */ y1(int[] iArr) {
        this.f17844k = iArr;
    }

    public static final /* synthetic */ y1 b(int[] iArr) {
        return new y1(iArr);
    }

    @n6.d
    public static int[] d(int i7) {
        return f(new int[i7]);
    }

    @n6.d
    @a1
    public static int[] f(@n6.d int[] iArr) {
        u4.l0.p(iArr, "storage");
        return iArr;
    }

    public static boolean i(int[] iArr, int i7) {
        return x3.p.R8(iArr, i7);
    }

    public static boolean j(int[] iArr, @n6.d Collection<x1> collection) {
        u4.l0.p(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!((obj instanceof x1) && x3.p.R8(iArr, ((x1) obj).l0()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(int[] iArr, Object obj) {
        return (obj instanceof y1) && u4.l0.g(iArr, ((y1) obj).v());
    }

    public static final boolean l(int[] iArr, int[] iArr2) {
        return u4.l0.g(iArr, iArr2);
    }

    public static final int m(int[] iArr, int i7) {
        return x1.l(iArr[i7]);
    }

    public static int o(int[] iArr) {
        return iArr.length;
    }

    @a1
    public static /* synthetic */ void p() {
    }

    public static int q(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean r(int[] iArr) {
        return iArr.length == 0;
    }

    @n6.d
    public static Iterator<x1> s(int[] iArr) {
        return new a(iArr);
    }

    public static final void t(int[] iArr, int i7, int i8) {
        iArr[i7] = i8;
    }

    public static String u(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public boolean a(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(x1 x1Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends x1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof x1) {
            return g(((x1) obj).l0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@n6.d Collection<? extends Object> collection) {
        u4.l0.p(collection, "elements");
        return j(this.f17844k, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f17844k, obj);
    }

    public boolean g(int i7) {
        return i(this.f17844k, i7);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return q(this.f17844k);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f17844k);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @n6.d
    public Iterator<x1> iterator() {
        return s(this.f17844k);
    }

    @Override // java.util.Collection
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public int size() {
        return o(this.f17844k);
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
        return u(this.f17844k);
    }

    public final /* synthetic */ int[] v() {
        return this.f17844k;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        u4.l0.p(tArr, "array");
        return (T[]) u4.v.b(this, tArr);
    }
}
