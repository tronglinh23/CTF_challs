package x3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class b1 extends a1 {
    /* JADX WARN: Multi-variable type inference failed */
    @v3.k(message = "Use maxByOrNull instead.", replaceWith = @v3.b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k4.f
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> L0(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Object obj;
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj2 = (Object) it.next();
            if (it.hasNext()) {
                R O = lVar.O(obj2);
                do {
                    Object obj3 = (Object) it.next();
                    R O2 = lVar.O(obj3);
                    obj2 = obj2;
                    if (O.compareTo(O2) < 0) {
                        O = O2;
                        obj2 = (Object) obj3;
                    }
                } while (it.hasNext());
            }
            obj = obj2;
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    @v3.k(message = "Use maxWithOrNull instead.", replaceWith = @v3.b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k4.f
    public static final /* synthetic */ <K, V> Map.Entry<K, V> M0(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        u4.l0.p(map, "<this>");
        u4.l0.p(comparator, "comparator");
        return (Map.Entry) e0.Q3(map.entrySet(), comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.k(message = "Use minByOrNull instead.", replaceWith = @v3.b1(expression = "this.minByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> N0(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Object obj;
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj2 = (Object) it.next();
            if (it.hasNext()) {
                R O = lVar.O(obj2);
                do {
                    Object obj3 = (Object) it.next();
                    R O2 = lVar.O(obj3);
                    obj2 = obj2;
                    if (O.compareTo(O2) > 0) {
                        O = O2;
                        obj2 = (Object) obj3;
                    }
                } while (it.hasNext());
            }
            obj = obj2;
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    @v3.k(message = "Use minWithOrNull instead.", replaceWith = @v3.b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Map.Entry O0(Map map, Comparator comparator) {
        u4.l0.p(map, "<this>");
        u4.l0.p(comparator, "comparator");
        return (Map.Entry) e0.i4(map.entrySet(), comparator);
    }
}
