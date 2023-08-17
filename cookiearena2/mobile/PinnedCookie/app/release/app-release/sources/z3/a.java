package z3;

import java.util.Map;
import k4.f;
import s4.h;
import u4.l0;
import u4.u1;
import v3.g1;
@h(name = "CollectionsJDK8Kt")
/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.2")
    @f
    public static final <K, V> V a(Map<? extends K, ? extends V> map, K k7, V v6) {
        l0.p(map, "<this>");
        return map.getOrDefault(k7, v6);
    }

    @g1(version = "1.2")
    @f
    public static final <K, V> boolean b(Map<? extends K, ? extends V> map, K k7, V v6) {
        l0.p(map, "<this>");
        return u1.k(map).remove(k7, v6);
    }
}
