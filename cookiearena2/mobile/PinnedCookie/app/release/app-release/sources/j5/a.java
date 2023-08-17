package j5;

import i5.j;
import i5.k;
import i5.l;
import n6.d;
import n6.e;
import s4.h;
import u4.l0;
import v3.g1;
@h(name = "RegexExtensionsJDK8Kt")
/* loaded from: classes.dex */
public final class a {
    @g1(version = "1.2")
    @e
    public static final j a(@d k kVar, @d String str) {
        l0.p(kVar, "<this>");
        l0.p(str, "name");
        l lVar = kVar instanceof l ? (l) kVar : null;
        if (lVar != null) {
            return lVar.c(str);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
