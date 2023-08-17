package v3;
/* loaded from: classes.dex */
public final class z0 {
    @g1(version = "1.4")
    @k4.f
    public static final <V> V a(e5.p<? extends V> pVar, Object obj, e5.o<?> oVar) {
        u4.l0.p(pVar, "<this>");
        u4.l0.p(oVar, "property");
        return pVar.get();
    }

    @g1(version = "1.4")
    @k4.f
    public static final <T, V> V b(e5.q<T, ? extends V> qVar, T t6, e5.o<?> oVar) {
        u4.l0.p(qVar, "<this>");
        u4.l0.p(oVar, "property");
        return qVar.get(t6);
    }

    @g1(version = "1.4")
    @k4.f
    public static final <V> void c(e5.k<V> kVar, Object obj, e5.o<?> oVar, V v6) {
        u4.l0.p(kVar, "<this>");
        u4.l0.p(oVar, "property");
        kVar.set(v6);
    }

    @g1(version = "1.4")
    @k4.f
    public static final <T, V> void d(e5.l<T, V> lVar, T t6, e5.o<?> oVar, V v6) {
        u4.l0.p(lVar, "<this>");
        u4.l0.p(oVar, "property");
        lVar.z(t6, v6);
    }
}
