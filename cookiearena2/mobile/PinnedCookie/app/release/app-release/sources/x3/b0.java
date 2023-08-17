package x3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import u4.u1;
import v3.q2;
/* loaded from: classes.dex */
public class b0 extends a0 {
    @k4.f
    public static final <T> void A0(Collection<? super T> collection, T[] tArr) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(tArr, "elements");
        p0(collection, tArr);
    }

    @v3.k(level = v3.m.ERROR, message = "Use removeAt(index) instead.", replaceWith = @v3.b1(expression = "removeAt(index)", imports = {}))
    @k4.f
    public static final <T> T B0(List<T> list, int i7) {
        u4.l0.p(list, "<this>");
        return list.remove(i7);
    }

    @k4.f
    public static final <T> boolean C0(Collection<? extends T> collection, T t6) {
        u4.l0.p(collection, "<this>");
        return u1.a(collection).remove(t6);
    }

    public static final <T> boolean D0(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        return r0(iterable, lVar, true);
    }

    public static final <T> boolean E0(@n6.d Collection<? super T> collection, @n6.d f5.m<? extends T> mVar) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(mVar, "elements");
        List c32 = f5.u.c3(mVar);
        return (c32.isEmpty() ^ true) && collection.removeAll(c32);
    }

    public static final <T> boolean F0(@n6.d Collection<? super T> collection, @n6.d Iterable<? extends T> iterable) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(iterable, "elements");
        return collection.removeAll(q0(iterable));
    }

    @k4.f
    public static final <T> boolean G0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(collection2, "elements");
        return u1.a(collection).removeAll(collection2);
    }

    public static final <T> boolean H0(@n6.d Collection<? super T> collection, @n6.d T[] tArr) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(tArr, "elements");
        return ((tArr.length == 0) ^ true) && collection.removeAll(o.t(tArr));
    }

    public static final <T> boolean I0(@n6.d List<T> list, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "predicate");
        return s0(list, lVar, true);
    }

    @v3.g1(version = "1.4")
    @q2(markerClass = {v3.r.class})
    public static final <T> T J0(@n6.d List<T> list) {
        u4.l0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final <T> T K0(@n6.d List<T> list) {
        u4.l0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @v3.g1(version = "1.4")
    @q2(markerClass = {v3.r.class})
    public static final <T> T L0(@n6.d List<T> list) {
        u4.l0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(w.G(list));
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final <T> T M0(@n6.d List<T> list) {
        u4.l0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(w.G(list));
    }

    public static final <T> boolean N0(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        return r0(iterable, lVar, false);
    }

    public static final <T> boolean O0(@n6.d Collection<? super T> collection, @n6.d f5.m<? extends T> mVar) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(mVar, "elements");
        List c32 = f5.u.c3(mVar);
        return c32.isEmpty() ^ true ? collection.retainAll(c32) : T0(collection);
    }

    public static final <T> boolean P0(@n6.d Collection<? super T> collection, @n6.d Iterable<? extends T> iterable) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(iterable, "elements");
        return collection.retainAll(q0(iterable));
    }

    @k4.f
    public static final <T> boolean Q0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(collection2, "elements");
        return u1.a(collection).retainAll(collection2);
    }

    public static final <T> boolean R0(@n6.d Collection<? super T> collection, @n6.d T[] tArr) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(tArr, "elements");
        return (tArr.length == 0) ^ true ? collection.retainAll(o.t(tArr)) : T0(collection);
    }

    public static final <T> boolean S0(@n6.d List<T> list, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "predicate");
        return s0(list, lVar, false);
    }

    public static final boolean T0(Collection<?> collection) {
        boolean z6 = !collection.isEmpty();
        collection.clear();
        return z6;
    }

    public static final <T> boolean n0(@n6.d Collection<? super T> collection, @n6.d f5.m<? extends T> mVar) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(mVar, "elements");
        Iterator<? extends T> it = mVar.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z6 = true;
            }
        }
        return z6;
    }

    public static final <T> boolean o0(@n6.d Collection<? super T> collection, @n6.d Iterable<? extends T> iterable) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z6 = true;
            }
        }
        return z6;
    }

    public static final <T> boolean p0(@n6.d Collection<? super T> collection, @n6.d T[] tArr) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(tArr, "elements");
        return collection.addAll(o.t(tArr));
    }

    @n6.d
    public static final <T> Collection<T> q0(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : e0.Q5(iterable);
    }

    public static final <T> boolean r0(Iterable<? extends T> iterable, t4.l<? super T, Boolean> lVar, boolean z6) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (lVar.O((T) it.next()).booleanValue() == z6) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    public static final <T> boolean s0(List<T> list, t4.l<? super T, Boolean> lVar, boolean z6) {
        if (!(list instanceof RandomAccess)) {
            u4.l0.n(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return r0(u1.c(list), lVar, z6);
        }
        s0 it = new d5.l(0, w.G(list)).iterator();
        int i7 = 0;
        while (it.hasNext()) {
            int b7 = it.b();
            T t6 = list.get(b7);
            if (lVar.O(t6).booleanValue() != z6) {
                if (i7 != b7) {
                    list.set(i7, t6);
                }
                i7++;
            }
        }
        if (i7 >= list.size()) {
            return false;
        }
        int G = w.G(list);
        if (i7 > G) {
            return true;
        }
        while (true) {
            list.remove(G);
            if (G == i7) {
                return true;
            }
            G--;
        }
    }

    @k4.f
    public static final <T> void t0(Collection<? super T> collection, f5.m<? extends T> mVar) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(mVar, "elements");
        E0(collection, mVar);
    }

    @k4.f
    public static final <T> void u0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(iterable, "elements");
        F0(collection, iterable);
    }

    @k4.f
    public static final <T> void v0(Collection<? super T> collection, T t6) {
        u4.l0.p(collection, "<this>");
        collection.remove(t6);
    }

    @k4.f
    public static final <T> void w0(Collection<? super T> collection, T[] tArr) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(tArr, "elements");
        H0(collection, tArr);
    }

    @k4.f
    public static final <T> void x0(Collection<? super T> collection, f5.m<? extends T> mVar) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(mVar, "elements");
        n0(collection, mVar);
    }

    @k4.f
    public static final <T> void y0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(iterable, "elements");
        o0(collection, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k4.f
    public static final <T> void z0(Collection<? super T> collection, T t6) {
        u4.l0.p(collection, "<this>");
        collection.add(t6);
    }
}
