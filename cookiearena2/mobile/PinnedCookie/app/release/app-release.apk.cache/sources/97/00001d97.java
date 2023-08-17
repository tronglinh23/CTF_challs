package x3;

import java.util.Map;

@s4.h(name = "MapAccessorsKt")
/* loaded from: classes.dex */
public final class u0 {
    @k4.f
    public static final <V, V1 extends V> V1 a(Map<? super String, ? extends V> map, Object obj, e5.o<?> oVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(oVar, "property");
        return (V1) y0.a(map, oVar.getName());
    }

    @s4.h(name = "getVar")
    @k4.f
    public static final <V, V1 extends V> V1 b(Map<? super String, ? extends V> map, Object obj, e5.o<?> oVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(oVar, "property");
        return (V1) y0.a(map, oVar.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k4.f
    public static final <V> void c(Map<? super String, ? super V> map, Object obj, e5.o<?> oVar, V v6) {
        u4.l0.p(map, "<this>");
        u4.l0.p(oVar, "property");
        map.put(oVar.getName(), v6);
    }
}