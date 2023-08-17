package x3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import v3.m2;
import v3.q2;
/* loaded from: classes.dex */
public class l1 extends k1 {
    @v3.g1(version = "1.6")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <E> Set<E> i(int i7, @v3.b t4.l<? super Set<E>, m2> lVar) {
        u4.l0.p(lVar, "builderAction");
        Set e7 = k1.e(i7);
        lVar.O(e7);
        return k1.a(e7);
    }

    @v3.g1(version = "1.6")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <E> Set<E> j(@v3.b t4.l<? super Set<E>, m2> lVar) {
        u4.l0.p(lVar, "builderAction");
        Set d7 = k1.d();
        lVar.O(d7);
        return k1.a(d7);
    }

    @n6.d
    public static final <T> Set<T> k() {
        return j0.f18320k;
    }

    @v3.g1(version = "1.1")
    @k4.f
    public static final <T> HashSet<T> l() {
        return new HashSet<>();
    }

    @n6.d
    public static final <T> HashSet<T> m(@n6.d T... tArr) {
        u4.l0.p(tArr, "elements");
        return (HashSet) p.Py(tArr, new HashSet(z0.j(tArr.length)));
    }

    @v3.g1(version = "1.1")
    @k4.f
    public static final <T> LinkedHashSet<T> n() {
        return new LinkedHashSet<>();
    }

    @n6.d
    public static final <T> LinkedHashSet<T> o(@n6.d T... tArr) {
        u4.l0.p(tArr, "elements");
        return (LinkedHashSet) p.Py(tArr, new LinkedHashSet(z0.j(tArr.length)));
    }

    @v3.g1(version = "1.1")
    @k4.f
    public static final <T> Set<T> p() {
        return new LinkedHashSet();
    }

    @n6.d
    public static final <T> Set<T> q(@n6.d T... tArr) {
        u4.l0.p(tArr, "elements");
        return (Set) p.Py(tArr, new LinkedHashSet(z0.j(tArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T> Set<T> r(@n6.d Set<? extends T> set) {
        u4.l0.p(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : k1.f(set.iterator().next()) : k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k4.f
    public static final <T> Set<T> s(Set<? extends T> set) {
        return set == 0 ? k() : set;
    }

    @k4.f
    public static final <T> Set<T> t() {
        return k();
    }

    @n6.d
    public static final <T> Set<T> u(@n6.d T... tArr) {
        u4.l0.p(tArr, "elements");
        return tArr.length > 0 ? p.Mz(tArr) : k();
    }

    @v3.g1(version = "1.4")
    @n6.d
    public static final <T> Set<T> v(@n6.e T t6) {
        return t6 != null ? k1.f(t6) : k();
    }

    @v3.g1(version = "1.4")
    @n6.d
    public static final <T> Set<T> w(@n6.d T... tArr) {
        u4.l0.p(tArr, "elements");
        return (Set) p.vb(tArr, new LinkedHashSet());
    }
}
