package androidx.lifecycle;

import d.b1;
import java.util.HashMap;
import java.util.Map;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f4751a = new HashMap();

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean a(@n6.d String str, int i7) {
        u4.l0.p(str, "name");
        Integer num = this.f4751a.get(str);
        int intValue = num != null ? num.intValue() : 0;
        boolean z6 = (intValue & i7) != 0;
        this.f4751a.put(str, Integer.valueOf(i7 | intValue));
        return !z6;
    }
}
