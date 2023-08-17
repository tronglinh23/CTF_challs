package x3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
@v3.g1(version = "1.1")
/* loaded from: classes.dex */
public abstract class i<E> extends x3.a<E> implements Set<E>, v4.a {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public static final a f18308k = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public final boolean a(@n6.d Set<?> set, @n6.d Set<?> set2) {
            u4.l0.p(set, "c");
            u4.l0.p(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        public final int b(@n6.d Collection<?> collection) {
            u4.l0.p(collection, "c");
            Iterator<?> it = collection.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                i7 += next != null ? next.hashCode() : 0;
            }
            return i7;
        }

        public a() {
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@n6.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f18308k.a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f18308k.b(this);
    }

    @Override // x3.a, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
