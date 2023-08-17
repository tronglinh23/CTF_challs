package x3;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
@u4.r1({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n857#2,2:140\n847#2,2:142\n1#3:144\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n28#1:140,2\n52#1:142,2\n*E\n"})
/* loaded from: classes.dex */
public class m1 extends l1 {
    @n6.d
    public static final <T> Set<T> A(@n6.d Set<? extends T> set, @n6.d T[] tArr) {
        u4.l0.p(set, "<this>");
        u4.l0.p(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        b0.H0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @k4.f
    public static final <T> Set<T> B(Set<? extends T> set, T t6) {
        u4.l0.p(set, "<this>");
        return z(set, t6);
    }

    @n6.d
    public static final <T> Set<T> C(@n6.d Set<? extends T> set, @n6.d f5.m<? extends T> mVar) {
        u4.l0.p(set, "<this>");
        u4.l0.p(mVar, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(z0.j(set.size() * 2));
        linkedHashSet.addAll(set);
        b0.n0(linkedHashSet, mVar);
        return linkedHashSet;
    }

    @n6.d
    public static final <T> Set<T> D(@n6.d Set<? extends T> set, @n6.d Iterable<? extends T> iterable) {
        int size;
        u4.l0.p(set, "<this>");
        u4.l0.p(iterable, "elements");
        Integer Z = x.Z(iterable);
        if (Z != null) {
            size = set.size() + Z.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(z0.j(size));
        linkedHashSet.addAll(set);
        b0.o0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    @n6.d
    public static final <T> Set<T> E(@n6.d Set<? extends T> set, T t6) {
        u4.l0.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(z0.j(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t6);
        return linkedHashSet;
    }

    @n6.d
    public static final <T> Set<T> F(@n6.d Set<? extends T> set, @n6.d T[] tArr) {
        u4.l0.p(set, "<this>");
        u4.l0.p(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(z0.j(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        b0.p0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @k4.f
    public static final <T> Set<T> G(Set<? extends T> set, T t6) {
        u4.l0.p(set, "<this>");
        return E(set, t6);
    }

    @n6.d
    public static final <T> Set<T> x(@n6.d Set<? extends T> set, @n6.d f5.m<? extends T> mVar) {
        u4.l0.p(set, "<this>");
        u4.l0.p(mVar, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        b0.E0(linkedHashSet, mVar);
        return linkedHashSet;
    }

    @n6.d
    public static final <T> Set<T> y(@n6.d Set<? extends T> set, @n6.d Iterable<? extends T> iterable) {
        u4.l0.p(set, "<this>");
        u4.l0.p(iterable, "elements");
        Collection<?> q02 = b0.q0(iterable);
        if (q02.isEmpty()) {
            return e0.V5(set);
        }
        if (!(q02 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(q02);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t6 : set) {
            if (!q02.contains(t6)) {
                linkedHashSet2.add(t6);
            }
        }
        return linkedHashSet2;
    }

    @n6.d
    public static final <T> Set<T> z(@n6.d Set<? extends T> set, T t6) {
        u4.l0.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(z0.j(set.size()));
        boolean z6 = false;
        for (T t7 : set) {
            boolean z7 = true;
            if (!z6 && u4.l0.g(t7, t6)) {
                z6 = true;
                z7 = false;
            }
            if (z7) {
                linkedHashSet.add(t7);
            }
        }
        return linkedHashSet;
    }
}
