package androidx.window.layout;

import d.b1;
import java.util.List;
import u4.l0;
import x3.e0;
/* loaded from: classes.dex */
public final class w {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final List<g> f7129a;

    /* JADX WARN: Multi-variable type inference failed */
    @b1({b1.a.TESTS})
    public w(@n6.d List<? extends g> list) {
        l0.p(list, "displayFeatures");
        this.f7129a = list;
    }

    @n6.d
    public final List<g> a() {
        return this.f7129a;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l0.g(w.class, obj.getClass())) {
            return false;
        }
        return l0.g(this.f7129a, ((w) obj).f7129a);
    }

    public int hashCode() {
        return this.f7129a.hashCode();
    }

    @n6.d
    public String toString() {
        return e0.h3(this.f7129a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
