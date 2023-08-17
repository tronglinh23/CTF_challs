package x5;

import java.util.LinkedHashSet;
import java.util.Set;
import r5.h0;
import u4.l0;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Set<h0> f18487a = new LinkedHashSet();

    public final synchronized void a(@n6.d h0 h0Var) {
        l0.p(h0Var, "route");
        this.f18487a.remove(h0Var);
    }

    public final synchronized void b(@n6.d h0 h0Var) {
        l0.p(h0Var, "failedRoute");
        this.f18487a.add(h0Var);
    }

    public final synchronized boolean c(@n6.d h0 h0Var) {
        l0.p(h0Var, "route");
        return this.f18487a.contains(h0Var);
    }
}
