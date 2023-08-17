package x3;

import java.util.Collection;
import java.util.Iterator;
@u4.r1({"SMAP\nAbstractCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1747#2,3:43\n1726#2,3:46\n*S KotlinDebug\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n*L\n19#1:43,3\n22#1:46,3\n*E\n"})
@v3.g1(version = "1.1")
/* loaded from: classes.dex */
public abstract class a<E> implements Collection<E>, v4.a {

    /* renamed from: x3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0262a extends u4.n0 implements t4.l<E, CharSequence> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ a<E> f18274l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0262a(a<? extends E> aVar) {
            super(1);
            this.f18274l = aVar;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final CharSequence O(E e7) {
            return e7 == this.f18274l ? "(this Collection)" : String.valueOf(e7);
        }
    }

    public abstract int a();

    @Override // java.util.Collection
    public boolean add(E e7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(E e7) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (u4.l0.g(it.next(), e7)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(@n6.d Collection<? extends Object> collection) {
        u4.l0.p(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @n6.d
    public abstract Iterator<E> iterator();

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
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    @n6.d
    public Object[] toArray() {
        return u4.v.a(this);
    }

    @n6.d
    public String toString() {
        return e0.h3(this, ", ", "[", "]", 0, null, new C0262a(this), 24, null);
    }

    @Override // java.util.Collection
    @n6.d
    public <T> T[] toArray(@n6.d T[] tArr) {
        u4.l0.p(tArr, "array");
        return (T[]) u4.v.b(this, tArr);
    }
}
