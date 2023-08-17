package x3;

import java.util.Map;
import java.util.NoSuchElementException;
@u4.r1({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n330#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:105,6\n*E\n"})
/* loaded from: classes.dex */
public class y0 {
    @s4.h(name = "getOrImplicitDefaultNullable")
    @v3.a1
    public static final <K, V> V a(@n6.d Map<K, ? extends V> map, K k7) {
        u4.l0.p(map, "<this>");
        if (map instanceof v0) {
            return (V) ((v0) map).h(k7);
        }
        V v6 = map.get(k7);
        if (v6 != null || map.containsKey(k7)) {
            return v6;
        }
        throw new NoSuchElementException("Key " + k7 + " is missing in the map.");
    }

    @n6.d
    public static final <K, V> Map<K, V> b(@n6.d Map<K, ? extends V> map, @n6.d t4.l<? super K, ? extends V> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return map instanceof v0 ? b(((v0) map).e(), lVar) : new w0(map, lVar);
    }

    @s4.h(name = "withDefaultMutable")
    @n6.d
    public static final <K, V> Map<K, V> c(@n6.d Map<K, V> map, @n6.d t4.l<? super K, ? extends V> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return map instanceof e1 ? c(((e1) map).e(), lVar) : new f1(map, lVar);
    }
}
