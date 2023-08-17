package y3;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import u4.l0;
import u4.r1;
import x3.k;
import x3.o;
/* loaded from: classes.dex */
public final class b<E> extends x3.f<E> implements List<E>, RandomAccess, Serializable, v4.e {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public E[] f18810k;

    /* renamed from: l  reason: collision with root package name */
    public int f18811l;

    /* renamed from: m  reason: collision with root package name */
    public int f18812m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f18813n;
    @n6.e

    /* renamed from: o  reason: collision with root package name */
    public final b<E> f18814o;
    @n6.e

    /* renamed from: p  reason: collision with root package name */
    public final b<E> f18815p;

    @r1({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a<E> implements ListIterator<E>, v4.f {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final b<E> f18816k;

        /* renamed from: l  reason: collision with root package name */
        public int f18817l;

        /* renamed from: m  reason: collision with root package name */
        public int f18818m;

        public a(@n6.d b<E> bVar, int i7) {
            l0.p(bVar, "list");
            this.f18816k = bVar;
            this.f18817l = i7;
            this.f18818m = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e7) {
            b<E> bVar = this.f18816k;
            int i7 = this.f18817l;
            this.f18817l = i7 + 1;
            bVar.add(i7, e7);
            this.f18818m = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f18817l < this.f18816k.f18812m;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f18817l > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.f18817l < this.f18816k.f18812m) {
                int i7 = this.f18817l;
                this.f18817l = i7 + 1;
                this.f18818m = i7;
                return (E) this.f18816k.f18810k[this.f18816k.f18811l + this.f18818m];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f18817l;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i7 = this.f18817l;
            if (i7 > 0) {
                int i8 = i7 - 1;
                this.f18817l = i8;
                this.f18818m = i8;
                return (E) this.f18816k.f18810k[this.f18816k.f18811l + this.f18818m];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f18817l - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i7 = this.f18818m;
            if (!(i7 != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f18816k.remove(i7);
            this.f18817l = this.f18818m;
            this.f18818m = -1;
        }

        @Override // java.util.ListIterator
        public void set(E e7) {
            int i7 = this.f18818m;
            if (!(i7 != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f18816k.set(i7, e7);
        }
    }

    public b(E[] eArr, int i7, int i8, boolean z6, b<E> bVar, b<E> bVar2) {
        this.f18810k = eArr;
        this.f18811l = i7;
        this.f18812m = i8;
        this.f18813n = z6;
        this.f18814o = bVar;
        this.f18815p = bVar2;
    }

    @Override // x3.f
    public int a() {
        return this.f18812m;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e7) {
        l();
        j(this.f18811l + this.f18812m, e7);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@n6.d Collection<? extends E> collection) {
        l0.p(collection, "elements");
        l();
        int size = collection.size();
        i(this.f18811l + this.f18812m, collection, size);
        return size > 0;
    }

    @Override // x3.f
    public E b(int i7) {
        l();
        x3.c.f18278k.b(i7, this.f18812m);
        return r(this.f18811l + i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        l();
        s(this.f18811l, this.f18812m);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@n6.e Object obj) {
        return obj == this || ((obj instanceof List) && m((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i7) {
        x3.c.f18278k.b(i7, this.f18812m);
        return this.f18810k[this.f18811l + i7];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i7;
        i7 = c.i(this.f18810k, this.f18811l, this.f18812m);
        return i7;
    }

    public final void i(int i7, Collection<? extends E> collection, int i8) {
        b<E> bVar = this.f18814o;
        if (bVar != null) {
            bVar.i(i7, collection, i8);
            this.f18810k = this.f18814o.f18810k;
            this.f18812m += i8;
            return;
        }
        p(i7, i8);
        Iterator<? extends E> it = collection.iterator();
        for (int i9 = 0; i9 < i8; i9++) {
            this.f18810k[i7 + i9] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i7 = 0; i7 < this.f18812m; i7++) {
            if (l0.g(this.f18810k[this.f18811l + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f18812m == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @n6.d
    public Iterator<E> iterator() {
        return new a(this, 0);
    }

    public final void j(int i7, E e7) {
        b<E> bVar = this.f18814o;
        if (bVar == null) {
            p(i7, 1);
            this.f18810k[i7] = e7;
            return;
        }
        bVar.j(i7, e7);
        this.f18810k = this.f18814o.f18810k;
        this.f18812m++;
    }

    @n6.d
    public final List<E> k() {
        if (this.f18814o == null) {
            l();
            this.f18813n = true;
            return this;
        }
        throw new IllegalStateException();
    }

    public final void l() {
        if (q()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i7 = this.f18812m - 1; i7 >= 0; i7--) {
            if (l0.g(this.f18810k[this.f18811l + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @n6.d
    public ListIterator<E> listIterator() {
        return new a(this, 0);
    }

    public final boolean m(List<?> list) {
        boolean h7;
        h7 = c.h(this.f18810k, this.f18811l, this.f18812m, list);
        return h7;
    }

    public final void n(int i7) {
        if (this.f18814o != null) {
            throw new IllegalStateException();
        }
        if (i7 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f18810k;
        if (i7 > eArr.length) {
            this.f18810k = (E[]) c.e(this.f18810k, k.f18322n.a(eArr.length, i7));
        }
    }

    public final void o(int i7) {
        n(this.f18812m + i7);
    }

    public final void p(int i7, int i8) {
        o(i8);
        E[] eArr = this.f18810k;
        o.c1(eArr, eArr, i7 + i8, i7, this.f18811l + this.f18812m);
        this.f18812m += i8;
    }

    public final boolean q() {
        b<E> bVar;
        return this.f18813n || ((bVar = this.f18815p) != null && bVar.f18813n);
    }

    public final E r(int i7) {
        b<E> bVar = this.f18814o;
        if (bVar != null) {
            this.f18812m--;
            return bVar.r(i7);
        }
        E[] eArr = this.f18810k;
        E e7 = eArr[i7];
        o.c1(eArr, eArr, i7, i7 + 1, this.f18811l + this.f18812m);
        c.f(this.f18810k, (this.f18811l + this.f18812m) - 1);
        this.f18812m--;
        return e7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        l();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@n6.d Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        l();
        return t(this.f18811l, this.f18812m, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@n6.d Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        l();
        return t(this.f18811l, this.f18812m, collection, true) > 0;
    }

    public final void s(int i7, int i8) {
        b<E> bVar = this.f18814o;
        if (bVar != null) {
            bVar.s(i7, i8);
        } else {
            E[] eArr = this.f18810k;
            o.c1(eArr, eArr, i7, i7 + i8, this.f18812m);
            E[] eArr2 = this.f18810k;
            int i9 = this.f18812m;
            c.g(eArr2, i9 - i8, i9);
        }
        this.f18812m -= i8;
    }

    @Override // x3.f, java.util.AbstractList, java.util.List
    public E set(int i7, E e7) {
        l();
        x3.c.f18278k.b(i7, this.f18812m);
        E[] eArr = this.f18810k;
        int i8 = this.f18811l;
        E e8 = eArr[i8 + i7];
        eArr[i8 + i7] = e7;
        return e8;
    }

    @Override // java.util.AbstractList, java.util.List
    @n6.d
    public List<E> subList(int i7, int i8) {
        x3.c.f18278k.d(i7, i8, this.f18812m);
        E[] eArr = this.f18810k;
        int i9 = this.f18811l + i7;
        int i10 = i8 - i7;
        boolean z6 = this.f18813n;
        b<E> bVar = this.f18815p;
        return new b(eArr, i9, i10, z6, this, bVar == null ? this : bVar);
    }

    public final int t(int i7, int i8, Collection<? extends E> collection, boolean z6) {
        b<E> bVar = this.f18814o;
        if (bVar != null) {
            int t6 = bVar.t(i7, i8, collection, z6);
            this.f18812m -= t6;
            return t6;
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i7 + i9;
            if (collection.contains(this.f18810k[i11]) == z6) {
                E[] eArr = this.f18810k;
                i9++;
                eArr[i10 + i7] = eArr[i11];
                i10++;
            } else {
                i9++;
            }
        }
        int i12 = i8 - i10;
        E[] eArr2 = this.f18810k;
        o.c1(eArr2, eArr2, i7 + i10, i8 + i7, this.f18812m);
        E[] eArr3 = this.f18810k;
        int i13 = this.f18812m;
        c.g(eArr3, i13 - i12, i13);
        this.f18812m -= i12;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @n6.d
    public <T> T[] toArray(@n6.d T[] tArr) {
        l0.p(tArr, "destination");
        int length = tArr.length;
        int i7 = this.f18812m;
        if (length < i7) {
            E[] eArr = this.f18810k;
            int i8 = this.f18811l;
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i8, i7 + i8, tArr.getClass());
            l0.o(tArr2, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr2;
        }
        E[] eArr2 = this.f18810k;
        int i9 = this.f18811l;
        o.c1(eArr2, tArr, 0, i9, i7 + i9);
        int length2 = tArr.length;
        int i10 = this.f18812m;
        if (length2 > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    @n6.d
    public String toString() {
        String j7;
        j7 = c.j(this.f18810k, this.f18811l, this.f18812m);
        return j7;
    }

    public final Object u() {
        if (q()) {
            return new h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    @n6.d
    public ListIterator<E> listIterator(int i7) {
        x3.c.f18278k.c(i7, this.f18812m);
        return new a(this, i7);
    }

    @Override // x3.f, java.util.AbstractList, java.util.List
    public void add(int i7, E e7) {
        l();
        x3.c.f18278k.c(i7, this.f18812m);
        j(this.f18811l + i7, e7);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i7, @n6.d Collection<? extends E> collection) {
        l0.p(collection, "elements");
        l();
        x3.c.f18278k.c(i7, this.f18812m);
        int size = collection.size();
        i(this.f18811l + i7, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @n6.d
    public Object[] toArray() {
        E[] eArr = this.f18810k;
        int i7 = this.f18811l;
        return o.M1(eArr, i7, this.f18812m + i7);
    }

    public b() {
        this(10);
    }

    public b(int i7) {
        this(c.d(i7), 0, 0, false, null, null);
    }
}
