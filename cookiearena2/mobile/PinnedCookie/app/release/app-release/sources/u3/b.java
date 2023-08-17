package u3;

import java.util.LinkedHashSet;
import java.util.Set;
import u4.l0;
import x3.e0;
@t3.d
/* loaded from: classes.dex */
public final class b extends m {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17322a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final Set<a> f17323b;

    public /* synthetic */ b(Set set, boolean z6, int i7, u4.w wVar) {
        this(set, (i7 & 2) != 0 ? false : z6);
    }

    public final boolean a() {
        return this.f17322a;
    }

    @n6.d
    public final Set<a> b() {
        return this.f17323b;
    }

    @n6.d
    public final b c(@n6.d a aVar) {
        l0.p(aVar, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f17323b);
        linkedHashSet.add(aVar);
        return new b(e0.V5(linkedHashSet), this.f17322a);
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return l0.g(this.f17323b, bVar.f17323b) && this.f17322a == bVar.f17322a;
        }
        return false;
    }

    public int hashCode() {
        return (this.f17323b.hashCode() * 31) + Boolean.hashCode(this.f17322a);
    }

    public b(@n6.d Set<a> set, boolean z6) {
        l0.p(set, "filters");
        this.f17322a = z6;
        this.f17323b = e0.V5(set);
    }
}
