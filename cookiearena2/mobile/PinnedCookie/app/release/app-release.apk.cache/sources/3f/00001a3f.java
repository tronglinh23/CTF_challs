package s2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u4.r1;

@r1({"SMAP\nNavArgument.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgumentKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,203:1\n483#2,7:204\n766#3:211\n857#3,2:212\n*S KotlinDebug\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgumentKt\n*L\n197#1:204,7\n202#1:211\n202#1:212,2\n*E\n"})
/* loaded from: classes.dex */
public final class s {
    @n6.d
    public static final List<String> a(@n6.d Map<String, q> map, @n6.d t4.l<? super String, Boolean> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, q> entry : map.entrySet()) {
            q value = entry.getValue();
            boolean z6 = false;
            if (value != null && !value.d() && !value.c()) {
                z6 = true;
            }
            if (z6) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (lVar.O((String) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}