package x3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import v3.m2;
@u4.r1({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
/* loaded from: classes.dex */
public class z0 extends y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f18397a = 1073741824;

    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final <K, V> Map<K, V> d(@n6.d Map<K, V> map) {
        u4.l0.p(map, "builder");
        return ((y3.d) map).l();
    }

    @v3.g1(version = "1.3")
    @k4.f
    @v3.a1
    public static final <K, V> Map<K, V> e(int i7, t4.l<? super Map<K, V>, m2> lVar) {
        u4.l0.p(lVar, "builderAction");
        Map h7 = h(i7);
        lVar.O(h7);
        return d(h7);
    }

    @v3.g1(version = "1.3")
    @k4.f
    @v3.a1
    public static final <K, V> Map<K, V> f(t4.l<? super Map<K, V>, m2> lVar) {
        u4.l0.p(lVar, "builderAction");
        Map g7 = g();
        lVar.O(g7);
        return d(g7);
    }

    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final <K, V> Map<K, V> g() {
        return new y3.d();
    }

    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final <K, V> Map<K, V> h(int i7) {
        return new y3.d(i7);
    }

    public static final <K, V> V i(@n6.d ConcurrentMap<K, V> concurrentMap, K k7, @n6.d t4.a<? extends V> aVar) {
        u4.l0.p(concurrentMap, "<this>");
        u4.l0.p(aVar, "defaultValue");
        V v6 = concurrentMap.get(k7);
        if (v6 == null) {
            V n7 = aVar.n();
            V putIfAbsent = concurrentMap.putIfAbsent(k7, n7);
            return putIfAbsent == null ? n7 : putIfAbsent;
        }
        return v6;
    }

    @v3.a1
    public static final int j(int i7) {
        if (i7 < 0) {
            return i7;
        }
        if (i7 < 3) {
            return i7 + 1;
        }
        if (i7 < 1073741824) {
            return (int) ((i7 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @n6.d
    public static final <K, V> Map<K, V> k(@n6.d v3.u0<? extends K, ? extends V> u0Var) {
        u4.l0.p(u0Var, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(u0Var.e(), u0Var.f());
        u4.l0.o(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    @v3.g1(version = "1.4")
    @n6.d
    public static final <K, V> SortedMap<K, V> l(@n6.d Comparator<? super K> comparator, @n6.d v3.u0<? extends K, ? extends V>... u0VarArr) {
        u4.l0.p(comparator, "comparator");
        u4.l0.p(u0VarArr, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        a1.y0(treeMap, u0VarArr);
        return treeMap;
    }

    @n6.d
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m(@n6.d v3.u0<? extends K, ? extends V>... u0VarArr) {
        u4.l0.p(u0VarArr, "pairs");
        TreeMap treeMap = new TreeMap();
        a1.y0(treeMap, u0VarArr);
        return treeMap;
    }

    @k4.f
    public static final Properties n(Map<String, String> map) {
        u4.l0.p(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @n6.d
    public static final <K, V> Map<K, V> o(@n6.d Map<? extends K, ? extends V> map) {
        u4.l0.p(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        u4.l0.o(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    @k4.f
    public static final <K, V> Map<K, V> p(Map<K, ? extends V> map) {
        u4.l0.p(map, "<this>");
        return o(map);
    }

    @n6.d
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> q(@n6.d Map<? extends K, ? extends V> map) {
        u4.l0.p(map, "<this>");
        return new TreeMap(map);
    }

    @n6.d
    public static final <K, V> SortedMap<K, V> r(@n6.d Map<? extends K, ? extends V> map, @n6.d Comparator<? super K> comparator) {
        u4.l0.p(map, "<this>");
        u4.l0.p(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
