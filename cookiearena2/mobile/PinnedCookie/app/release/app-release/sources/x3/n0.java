package x3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import u4.k1;
import u4.u1;
@u4.r1({"SMAP\nGroupingJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n+ 2 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n143#2:53\n80#2,4:54\n85#2:59\n1#3:58\n1855#4,2:60\n*S KotlinDebug\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n*L\n22#1:53\n22#1:54,4\n22#1:59\n48#1:60,2\n*E\n"})
/* loaded from: classes.dex */
public class n0 {
    @v3.g1(version = "1.1")
    @n6.d
    public static final <T, K> Map<K, Integer> a(@n6.d l0<T, ? extends K> l0Var) {
        u4.l0.p(l0Var, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b7 = l0Var.b();
        while (b7.hasNext()) {
            K a7 = l0Var.a(b7.next());
            Object obj = linkedHashMap.get(a7);
            if (obj == null && !linkedHashMap.containsKey(a7)) {
                obj = new k1.f();
            }
            k1.f fVar = (k1.f) obj;
            fVar.f17434k++;
            linkedHashMap.put(a7, fVar);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            u4.l0.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            u1.m(entry).setValue(Integer.valueOf(((k1.f) entry.getValue()).f17434k));
        }
        return u1.k(linkedHashMap);
    }

    @k4.f
    @v3.a1
    public static final <K, V, R> Map<K, R> b(Map<K, V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "f");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            u4.l0.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            u1.m(entry).setValue(lVar.O(entry));
        }
        return u1.k(map);
    }
}
