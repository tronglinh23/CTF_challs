package x3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import u4.u1;
import v3.m2;
import v3.q2;

@u4.r1({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,793:1\n392#1:803\n403#1:808\n500#1,6:813\n525#1,6:819\n1#2:794\n1238#3,4:795\n1238#3,4:799\n1238#3,4:804\n1238#3,4:809\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n442#1:803\n457#1:808\n515#1:813,6\n540#1:819,6\n392#1:795,4\n403#1:799,4\n442#1:804,4\n457#1:809,4\n*E\n"})
/* loaded from: classes.dex */
public class a1 extends z0 {
    @n6.d
    public static final <K, V> Map<K, V> A(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (lVar.O(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @k4.f
    public static final <K, V> void A0(Map<K, V> map, K k7, V v6) {
        u4.l0.p(map, "<this>");
        map.put(k7, v6);
    }

    @n6.d
    public static final <K, V> Map<K, V> B(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super K, Boolean> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (lVar.O((K) entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @n6.d
    public static final <K, V> Map<K, V> B0(@n6.d f5.m<? extends v3.u0<? extends K, ? extends V>> mVar) {
        u4.l0.p(mVar, "<this>");
        return k0(C0(mVar, new LinkedHashMap()));
    }

    @n6.d
    public static final <K, V> Map<K, V> C(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!lVar.O(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M C0(@n6.d f5.m<? extends v3.u0<? extends K, ? extends V>> mVar, @n6.d M m7) {
        u4.l0.p(mVar, "<this>");
        u4.l0.p(m7, "destination");
        w0(m7, mVar);
        return m7;
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M D(@n6.d Map<? extends K, ? extends V> map, @n6.d M m7, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!lVar.O(entry).booleanValue()) {
                m7.put(entry.getKey(), entry.getValue());
            }
        }
        return m7;
    }

    @n6.d
    public static final <K, V> Map<K, V> D0(@n6.d Iterable<? extends v3.u0<? extends K, ? extends V>> iterable) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return E0(iterable, new LinkedHashMap(z0.j(collection.size())));
                }
                return z0.k(iterable instanceof List ? (v3.u0<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
            }
            return z();
        }
        return k0(E0(iterable, new LinkedHashMap()));
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M E(@n6.d Map<? extends K, ? extends V> map, @n6.d M m7, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (lVar.O(entry).booleanValue()) {
                m7.put(entry.getKey(), entry.getValue());
            }
        }
        return m7;
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M E0(@n6.d Iterable<? extends v3.u0<? extends K, ? extends V>> iterable, @n6.d M m7) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(m7, "destination");
        x0(m7, iterable);
        return m7;
    }

    @n6.d
    public static final <K, V> Map<K, V> F(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super V, Boolean> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (lVar.O((V) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.1")
    @n6.d
    public static final <K, V> Map<K, V> F0(@n6.d Map<? extends K, ? extends V> map) {
        u4.l0.p(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? J0(map) : z0.o(map) : z();
    }

    @k4.f
    public static final <K, V> V G(Map<? extends K, ? extends V> map, K k7) {
        u4.l0.p(map, "<this>");
        return map.get(k7);
    }

    @v3.g1(version = "1.1")
    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M G0(@n6.d Map<? extends K, ? extends V> map, @n6.d M m7) {
        u4.l0.p(map, "<this>");
        u4.l0.p(m7, "destination");
        m7.putAll(map);
        return m7;
    }

    @k4.f
    public static final <K, V> V H(Map<K, ? extends V> map, K k7, t4.a<? extends V> aVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(aVar, "defaultValue");
        V v6 = map.get(k7);
        return v6 == null ? aVar.n() : v6;
    }

    @n6.d
    public static final <K, V> Map<K, V> H0(@n6.d v3.u0<? extends K, ? extends V>[] u0VarArr) {
        u4.l0.p(u0VarArr, "<this>");
        int length = u0VarArr.length;
        return length != 0 ? length != 1 ? I0(u0VarArr, new LinkedHashMap(z0.j(u0VarArr.length))) : z0.k(u0VarArr[0]) : z();
    }

    public static final <K, V> V I(@n6.d Map<K, ? extends V> map, K k7, @n6.d t4.a<? extends V> aVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(aVar, "defaultValue");
        V v6 = map.get(k7);
        return (v6 != null || map.containsKey(k7)) ? v6 : aVar.n();
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M I0(@n6.d v3.u0<? extends K, ? extends V>[] u0VarArr, @n6.d M m7) {
        u4.l0.p(u0VarArr, "<this>");
        u4.l0.p(m7, "destination");
        y0(m7, u0VarArr);
        return m7;
    }

    public static final <K, V> V J(@n6.d Map<K, V> map, K k7, @n6.d t4.a<? extends V> aVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(aVar, "defaultValue");
        V v6 = map.get(k7);
        if (v6 == null) {
            V n7 = aVar.n();
            map.put(k7, n7);
            return n7;
        }
        return v6;
    }

    @v3.g1(version = "1.1")
    @n6.d
    public static final <K, V> Map<K, V> J0(@n6.d Map<? extends K, ? extends V> map) {
        u4.l0.p(map, "<this>");
        return new LinkedHashMap(map);
    }

    @v3.g1(version = "1.1")
    public static final <K, V> V K(@n6.d Map<K, ? extends V> map, K k7) {
        u4.l0.p(map, "<this>");
        return (V) y0.a(map, k7);
    }

    @k4.f
    public static final <K, V> v3.u0<K, V> K0(Map.Entry<? extends K, ? extends V> entry) {
        u4.l0.p(entry, "<this>");
        return new v3.u0<>(entry.getKey(), entry.getValue());
    }

    @v3.g1(version = "1.1")
    @k4.f
    public static final <K, V> HashMap<K, V> L() {
        return new HashMap<>();
    }

    @n6.d
    public static final <K, V> HashMap<K, V> M(@n6.d v3.u0<? extends K, ? extends V>... u0VarArr) {
        u4.l0.p(u0VarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(z0.j(u0VarArr.length));
        y0(hashMap, u0VarArr);
        return hashMap;
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lt4/a<+TR;>;)TR; */
    @v3.g1(version = "1.3")
    @k4.f
    public static final Object N(Map map, t4.a aVar) {
        u4.l0.p(aVar, "defaultValue");
        return map.isEmpty() ? aVar.n() : map;
    }

    @k4.f
    public static final <K, V> boolean O(Map<? extends K, ? extends V> map) {
        u4.l0.p(map, "<this>");
        return !map.isEmpty();
    }

    @v3.g1(version = "1.3")
    @k4.f
    public static final <K, V> boolean P(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @k4.f
    public static final <K, V> Iterator<Map.Entry<K, V>> Q(Map<? extends K, ? extends V> map) {
        u4.l0.p(map, "<this>");
        return (Iterator<Map.Entry<? extends K, ? extends V>>) map.entrySet().iterator();
    }

    @v3.g1(version = "1.1")
    @k4.f
    public static final <K, V> LinkedHashMap<K, V> R() {
        return new LinkedHashMap<>();
    }

    @n6.d
    public static final <K, V> LinkedHashMap<K, V> S(@n6.d v3.u0<? extends K, ? extends V>... u0VarArr) {
        u4.l0.p(u0VarArr, "pairs");
        return (LinkedHashMap) I0(u0VarArr, new LinkedHashMap(z0.j(u0VarArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <K, V, R> Map<R, V> T(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(z0.j(map.size()));
        for (Object obj : map.entrySet()) {
            linkedHashMap.put(lVar.O(obj), ((Map.Entry) obj).getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <K, V, R, M extends Map<? super R, ? super V>> M U(@n6.d Map<? extends K, ? extends V> map, @n6.d M m7, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "transform");
        for (Object obj : map.entrySet()) {
            m7.put(lVar.O(obj), ((Map.Entry) obj).getValue());
        }
        return m7;
    }

    @k4.f
    public static final <K, V> Map<K, V> V() {
        return z();
    }

    @n6.d
    public static final <K, V> Map<K, V> W(@n6.d v3.u0<? extends K, ? extends V>... u0VarArr) {
        u4.l0.p(u0VarArr, "pairs");
        return u0VarArr.length > 0 ? I0(u0VarArr, new LinkedHashMap(z0.j(u0VarArr.length))) : z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <K, V, R> Map<K, R> X(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(z0.j(map.size()));
        for (Object obj : map.entrySet()) {
            linkedHashMap.put(((Map.Entry) obj).getKey(), lVar.O(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <K, V, R, M extends Map<? super K, ? super R>> M Y(@n6.d Map<? extends K, ? extends V> map, @n6.d M m7, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "transform");
        for (Object obj : map.entrySet()) {
            m7.put(((Map.Entry) obj).getKey(), lVar.O(obj));
        }
        return m7;
    }

    @v3.g1(version = "1.1")
    @n6.d
    public static final <K, V> Map<K, V> Z(@n6.d Map<? extends K, ? extends V> map, @n6.d f5.m<? extends K> mVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(mVar, androidx.lifecycle.r0.f4812h);
        Map J0 = J0(map);
        b0.E0(J0.keySet(), mVar);
        return k0(J0);
    }

    @v3.g1(version = "1.1")
    @n6.d
    public static final <K, V> Map<K, V> a0(@n6.d Map<? extends K, ? extends V> map, @n6.d Iterable<? extends K> iterable) {
        u4.l0.p(map, "<this>");
        u4.l0.p(iterable, androidx.lifecycle.r0.f4812h);
        Map J0 = J0(map);
        b0.F0(J0.keySet(), iterable);
        return k0(J0);
    }

    @v3.g1(version = "1.1")
    @n6.d
    public static final <K, V> Map<K, V> b0(@n6.d Map<? extends K, ? extends V> map, K k7) {
        u4.l0.p(map, "<this>");
        Map J0 = J0(map);
        J0.remove(k7);
        return k0(J0);
    }

    @v3.g1(version = "1.1")
    @n6.d
    public static final <K, V> Map<K, V> c0(@n6.d Map<? extends K, ? extends V> map, @n6.d K[] kArr) {
        u4.l0.p(map, "<this>");
        u4.l0.p(kArr, androidx.lifecycle.r0.f4812h);
        Map J0 = J0(map);
        b0.H0(J0.keySet(), kArr);
        return k0(J0);
    }

    @v3.g1(version = "1.1")
    @k4.f
    public static final <K, V> void d0(Map<K, V> map, f5.m<? extends K> mVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(mVar, androidx.lifecycle.r0.f4812h);
        b0.E0(map.keySet(), mVar);
    }

    @v3.g1(version = "1.1")
    @k4.f
    public static final <K, V> void e0(Map<K, V> map, Iterable<? extends K> iterable) {
        u4.l0.p(map, "<this>");
        u4.l0.p(iterable, androidx.lifecycle.r0.f4812h);
        b0.F0(map.keySet(), iterable);
    }

    @v3.g1(version = "1.1")
    @k4.f
    public static final <K, V> void f0(Map<K, V> map, K k7) {
        u4.l0.p(map, "<this>");
        map.remove(k7);
    }

    @v3.g1(version = "1.1")
    @k4.f
    public static final <K, V> void g0(Map<K, V> map, K[] kArr) {
        u4.l0.p(map, "<this>");
        u4.l0.p(kArr, androidx.lifecycle.r0.f4812h);
        b0.H0(map.keySet(), kArr);
    }

    @s4.h(name = "mutableIterator")
    @k4.f
    public static final <K, V> Iterator<Map.Entry<K, V>> h0(Map<K, V> map) {
        u4.l0.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @v3.g1(version = "1.1")
    @k4.f
    public static final <K, V> Map<K, V> i0() {
        return new LinkedHashMap();
    }

    @n6.d
    public static final <K, V> Map<K, V> j0(@n6.d v3.u0<? extends K, ? extends V>... u0VarArr) {
        u4.l0.p(u0VarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(z0.j(u0VarArr.length));
        y0(linkedHashMap, u0VarArr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <K, V> Map<K, V> k0(@n6.d Map<K, ? extends V> map) {
        u4.l0.p(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : z0.o(map) : z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k4.f
    public static final <K, V> Map<K, V> l0(Map<K, ? extends V> map) {
        return map == 0 ? z() : map;
    }

    @n6.d
    public static final <K, V> Map<K, V> m0(@n6.d Map<? extends K, ? extends V> map, @n6.d f5.m<? extends v3.u0<? extends K, ? extends V>> mVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(mVar, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w0(linkedHashMap, mVar);
        return k0(linkedHashMap);
    }

    @n6.d
    public static final <K, V> Map<K, V> n0(@n6.d Map<? extends K, ? extends V> map, @n6.d Iterable<? extends v3.u0<? extends K, ? extends V>> iterable) {
        u4.l0.p(map, "<this>");
        u4.l0.p(iterable, "pairs");
        if (map.isEmpty()) {
            return D0(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        x0(linkedHashMap, iterable);
        return linkedHashMap;
    }

    @n6.d
    public static final <K, V> Map<K, V> o0(@n6.d Map<? extends K, ? extends V> map, @n6.d Map<? extends K, ? extends V> map2) {
        u4.l0.p(map, "<this>");
        u4.l0.p(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @n6.d
    public static final <K, V> Map<K, V> p0(@n6.d Map<? extends K, ? extends V> map, @n6.d v3.u0<? extends K, ? extends V> u0Var) {
        u4.l0.p(map, "<this>");
        u4.l0.p(u0Var, "pair");
        if (map.isEmpty()) {
            return z0.k(u0Var);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(u0Var.e(), u0Var.f());
        return linkedHashMap;
    }

    @n6.d
    public static final <K, V> Map<K, V> q0(@n6.d Map<? extends K, ? extends V> map, @n6.d v3.u0<? extends K, ? extends V>[] u0VarArr) {
        u4.l0.p(map, "<this>");
        u4.l0.p(u0VarArr, "pairs");
        if (map.isEmpty()) {
            return H0(u0VarArr);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        y0(linkedHashMap, u0VarArr);
        return linkedHashMap;
    }

    @k4.f
    public static final <K, V> void r0(Map<? super K, ? super V> map, f5.m<? extends v3.u0<? extends K, ? extends V>> mVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(mVar, "pairs");
        w0(map, mVar);
    }

    @v3.g1(version = "1.6")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <K, V> Map<K, V> s(int i7, @v3.b t4.l<? super Map<K, V>, m2> lVar) {
        u4.l0.p(lVar, "builderAction");
        Map h7 = z0.h(i7);
        lVar.O(h7);
        return z0.d(h7);
    }

    @k4.f
    public static final <K, V> void s0(Map<? super K, ? super V> map, Iterable<? extends v3.u0<? extends K, ? extends V>> iterable) {
        u4.l0.p(map, "<this>");
        u4.l0.p(iterable, "pairs");
        x0(map, iterable);
    }

    @v3.g1(version = "1.6")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <K, V> Map<K, V> t(@v3.b t4.l<? super Map<K, V>, m2> lVar) {
        u4.l0.p(lVar, "builderAction");
        Map g7 = z0.g();
        lVar.O(g7);
        return z0.d(g7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k4.f
    public static final <K, V> void t0(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        u4.l0.p(map, "<this>");
        u4.l0.p(map2, "map");
        map.putAll(map2);
    }

    @k4.f
    public static final <K, V> K u(Map.Entry<? extends K, ? extends V> entry) {
        u4.l0.p(entry, "<this>");
        return entry.getKey();
    }

    @k4.f
    public static final <K, V> void u0(Map<? super K, ? super V> map, v3.u0<? extends K, ? extends V> u0Var) {
        u4.l0.p(map, "<this>");
        u4.l0.p(u0Var, "pair");
        map.put((K) u0Var.e(), (V) u0Var.f());
    }

    @k4.f
    public static final <K, V> V v(Map.Entry<? extends K, ? extends V> entry) {
        u4.l0.p(entry, "<this>");
        return entry.getValue();
    }

    @k4.f
    public static final <K, V> void v0(Map<? super K, ? super V> map, v3.u0<? extends K, ? extends V>[] u0VarArr) {
        u4.l0.p(map, "<this>");
        u4.l0.p(u0VarArr, "pairs");
        y0(map, u0VarArr);
    }

    @k4.f
    public static final <K, V> boolean w(Map<? extends K, ? extends V> map, K k7) {
        u4.l0.p(map, "<this>");
        return map.containsKey(k7);
    }

    public static final <K, V> void w0(@n6.d Map<? super K, ? super V> map, @n6.d f5.m<? extends v3.u0<? extends K, ? extends V>> mVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(mVar, "pairs");
        for (v3.u0<? extends K, ? extends V> u0Var : mVar) {
            map.put((K) u0Var.a(), (V) u0Var.b());
        }
    }

    @k4.f
    public static final <K> boolean x(Map<? extends K, ?> map, K k7) {
        u4.l0.p(map, "<this>");
        return map.containsKey(k7);
    }

    public static final <K, V> void x0(@n6.d Map<? super K, ? super V> map, @n6.d Iterable<? extends v3.u0<? extends K, ? extends V>> iterable) {
        u4.l0.p(map, "<this>");
        u4.l0.p(iterable, "pairs");
        for (v3.u0<? extends K, ? extends V> u0Var : iterable) {
            map.put((K) u0Var.a(), (V) u0Var.b());
        }
    }

    @k4.f
    public static final <K, V> boolean y(Map<K, ? extends V> map, V v6) {
        u4.l0.p(map, "<this>");
        return map.containsValue(v6);
    }

    public static final <K, V> void y0(@n6.d Map<? super K, ? super V> map, @n6.d v3.u0<? extends K, ? extends V>[] u0VarArr) {
        u4.l0.p(map, "<this>");
        u4.l0.p(u0VarArr, "pairs");
        for (v3.u0<? extends K, ? extends V> u0Var : u0VarArr) {
            map.put((K) u0Var.a(), (V) u0Var.b());
        }
    }

    @n6.d
    public static final <K, V> Map<K, V> z() {
        i0 i0Var = i0.f18309k;
        u4.l0.n(i0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return i0Var;
    }

    @k4.f
    public static final <K, V> V z0(Map<? extends K, V> map, K k7) {
        u4.l0.p(map, "<this>");
        return (V) u1.k(map).remove(k7);
    }
}