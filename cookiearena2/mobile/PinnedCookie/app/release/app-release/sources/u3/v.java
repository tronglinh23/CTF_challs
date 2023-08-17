package u3;

import java.util.LinkedHashSet;
import java.util.Set;
import u4.l0;
import x3.e0;
@t3.d
/* loaded from: classes.dex */
public final class v extends y {

    /* renamed from: e  reason: collision with root package name */
    public final boolean f17371e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f17372f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f17373g;
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public final Set<u> f17374h;

    public /* synthetic */ v(Set set, boolean z6, boolean z7, boolean z8, int i7, int i8, float f7, int i9, int i10, u4.w wVar) {
        this(set, (i10 & 2) != 0 ? false : z6, (i10 & 4) != 0 ? true : z7, (i10 & 8) != 0 ? false : z8, (i10 & 16) != 0 ? 0 : i7, (i10 & 32) == 0 ? i8 : 0, (i10 & 64) != 0 ? 0.5f : f7, (i10 & 128) != 0 ? 3 : i9);
    }

    @Override // u3.y
    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v) && super.equals(obj)) {
            v vVar = (v) obj;
            return l0.g(this.f17374h, vVar.f17374h) && this.f17371e == vVar.f17371e && this.f17372f == vVar.f17372f && this.f17373g == vVar.f17373g;
        }
        return false;
    }

    public final boolean f() {
        return this.f17373g;
    }

    @n6.d
    public final Set<u> g() {
        return this.f17374h;
    }

    public final boolean h() {
        return this.f17371e;
    }

    @Override // u3.y
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.f17374h.hashCode()) * 31) + Boolean.hashCode(this.f17371e)) * 31) + Boolean.hashCode(this.f17372f)) * 31) + Boolean.hashCode(this.f17373g);
    }

    public final boolean i() {
        return this.f17372f;
    }

    @n6.d
    public final v j(@n6.d u uVar) {
        l0.p(uVar, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f17374h);
        linkedHashSet.add(uVar);
        return new v(e0.V5(linkedHashSet), this.f17371e, this.f17372f, this.f17373g, d(), c(), e(), b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@n6.d Set<u> set, boolean z6, boolean z7, boolean z8, int i7, int i8, float f7, int i9) {
        super(i7, i8, f7, i9);
        l0.p(set, "filters");
        this.f17371e = z6;
        this.f17372f = z7;
        this.f17373g = z8;
        this.f17374h = e0.V5(set);
    }
}
