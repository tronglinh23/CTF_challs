package androidx.lifecycle;

import d.b1;
import i0.x2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class e1 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, z0> f4737a = new LinkedHashMap();

    public final void a() {
        Iterator<z0> it = this.f4737a.values().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f4737a.clear();
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.e
    public final z0 b(@n6.d String str) {
        u4.l0.p(str, x2.f10960j);
        return this.f4737a.get(str);
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    public final Set<String> c() {
        return new HashSet(this.f4737a.keySet());
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public final void d(@n6.d String str, @n6.d z0 z0Var) {
        u4.l0.p(str, x2.f10960j);
        u4.l0.p(z0Var, "viewModel");
        z0 put = this.f4737a.put(str, z0Var);
        if (put != null) {
            put.f();
        }
    }
}
