package i5;

import java.util.Set;
import u4.l0;
/* loaded from: classes.dex */
public class w extends v {
    @k4.f
    public static final o t(String str) {
        l0.p(str, "<this>");
        return new o(str);
    }

    @k4.f
    public static final o u(String str, q qVar) {
        l0.p(str, "<this>");
        l0.p(qVar, "option");
        return new o(str, qVar);
    }

    @k4.f
    public static final o v(String str, Set<? extends q> set) {
        l0.p(str, "<this>");
        l0.p(set, "options");
        return new o(str, set);
    }
}
