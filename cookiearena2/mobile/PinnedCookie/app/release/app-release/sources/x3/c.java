package x3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
@v3.g1(version = "1.1")
@u4.r1({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n350#2,7:158\n378#2,7:165\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:158,7\n29#1:165,7\n*E\n"})
/* loaded from: classes.dex */
public abstract class c<E> extends x3.a<E> implements List<E>, v4.a {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public static final a f18278k = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public final void a(int i7, int i8, int i9) {
            if (i7 < 0 || i8 > i9) {
                throw new IndexOutOfBoundsException("startIndex: " + i7 + ", endIndex: " + i8 + ", size: " + i9);
            } else if (i7 <= i8) {
            } else {
                throw new IllegalArgumentException("startIndex: " + i7 + " > endIndex: " + i8);
            }
        }

        public final void b(int i7, int i8) {
            if (i7 < 0 || i7 >= i8) {
                throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
            }
        }

        public final void c(int i7, int i8) {
            if (i7 < 0 || i7 > i8) {
                throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
            }
        }

        public final void d(int i7, int i8, int i9) {
            if (i7 < 0 || i8 > i9) {
                throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
            } else if (i7 <= i8) {
            } else {
                throw new IllegalArgumentException("fromIndex: " + i7 + " > toIndex: " + i8);
            }
        }

        public final boolean e(@n6.d Collection<?> collection, @n6.d Collection<?> collection2) {
            u4.l0.p(collection, "c");
            u4.l0.p(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!u4.l0.g(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(@n6.d Collection<?> collection) {
            u4.l0.p(collection, "c");
            Iterator<?> it = collection.iterator();
            int i7 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i7 = (i7 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i7;
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Iterator<E>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public int f18279k;

        public b() {
        }

        public final int a() {
            return this.f18279k;
        }

        public final void b(int i7) {
            this.f18279k = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18279k < c.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                c<E> cVar = c.this;
                int i7 = this.f18279k;
                this.f18279k = i7 + 1;
                return cVar.get(i7);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: x3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0263c extends c<E>.b implements ListIterator<E>, v4.a {
        public C0263c(int i7) {
            super();
            c.f18278k.c(i7, c.this.size());
            b(i7);
        }

        @Override // java.util.ListIterator
        public void add(E e7) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                c<E> cVar = c.this;
                b(a() - 1);
                return cVar.get(a());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e7) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes.dex */
    public static final class d<E> extends c<E> implements RandomAccess {
        @n6.d

        /* renamed from: l  reason: collision with root package name */
        public final c<E> f18282l;

        /* renamed from: m  reason: collision with root package name */
        public final int f18283m;

        /* renamed from: n  reason: collision with root package name */
        public int f18284n;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@n6.d c<? extends E> cVar, int i7, int i8) {
            u4.l0.p(cVar, "list");
            this.f18282l = cVar;
            this.f18283m = i7;
            c.f18278k.d(i7, i8, cVar.size());
            this.f18284n = i8 - i7;
        }

        @Override // x3.c, x3.a
        public int a() {
            return this.f18284n;
        }

        @Override // x3.c, java.util.List
        public E get(int i7) {
            c.f18278k.b(i7, this.f18284n);
            return this.f18282l.get(this.f18283m + i7);
        }
    }

    @Override // x3.a
    public abstract int a();

    @Override // java.util.List
    public void add(int i7, E e7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i7, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@n6.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f18278k.e(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i7);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f18278k.f(this);
    }

    public int indexOf(E e7) {
        Iterator<E> it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (u4.l0.g(it.next(), e7)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // x3.a, java.util.Collection, java.lang.Iterable
    @n6.d
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e7) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (u4.l0.g(listIterator.previous(), e7)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    @n6.d
    public ListIterator<E> listIterator() {
        return new C0263c(0);
    }

    @Override // java.util.List
    public E remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i7, E e7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @n6.d
    public List<E> subList(int i7, int i8) {
        return new d(this, i7, i8);
    }

    @Override // java.util.List
    @n6.d
    public ListIterator<E> listIterator(int i7) {
        return new C0263c(i7);
    }
}
