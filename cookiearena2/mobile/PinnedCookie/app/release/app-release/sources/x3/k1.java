package x3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import v3.m2;
/* loaded from: classes.dex */
public class k1 {
    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final <E> Set<E> a(@n6.d Set<E> set) {
        u4.l0.p(set, "builder");
        return ((y3.j) set).b();
    }

    @v3.g1(version = "1.3")
    @k4.f
    @v3.a1
    public static final <E> Set<E> b(int i7, t4.l<? super Set<E>, m2> lVar) {
        u4.l0.p(lVar, "builderAction");
        Set e7 = e(i7);
        lVar.O(e7);
        return a(e7);
    }

    @v3.g1(version = "1.3")
    @k4.f
    @v3.a1
    public static final <E> Set<E> c(t4.l<? super Set<E>, m2> lVar) {
        u4.l0.p(lVar, "builderAction");
        Set d7 = d();
        lVar.O(d7);
        return a(d7);
    }

    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final <E> Set<E> d() {
        return new y3.j();
    }

    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final <E> Set<E> e(int i7) {
        return new y3.j(i7);
    }

    @n6.d
    public static final <T> Set<T> f(T t6) {
        Set<T> singleton = Collections.singleton(t6);
        u4.l0.o(singleton, "singleton(element)");
        return singleton;
    }

    @n6.d
    public static final <T> TreeSet<T> g(@n6.d Comparator<? super T> comparator, @n6.d T... tArr) {
        u4.l0.p(comparator, "comparator");
        u4.l0.p(tArr, "elements");
        return (TreeSet) p.Py(tArr, new TreeSet(comparator));
    }

    @n6.d
    public static final <T> TreeSet<T> h(@n6.d T... tArr) {
        u4.l0.p(tArr, "elements");
        return (TreeSet) p.Py(tArr, new TreeSet());
    }
}
