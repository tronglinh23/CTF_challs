package u3;

import android.content.Intent;
import java.util.LinkedHashSet;
import java.util.Set;
import u4.l0;
import x3.e0;
@t3.d
/* loaded from: classes.dex */
public final class w extends y {
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public final Intent f17375e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public final Set<a> f17376f;

    public /* synthetic */ w(Set set, Intent intent, int i7, int i8, float f7, int i9, int i10, u4.w wVar) {
        this(set, intent, (i10 & 4) != 0 ? 0 : i7, (i10 & 8) != 0 ? 0 : i8, (i10 & 16) != 0 ? 0.5f : f7, (i10 & 32) != 0 ? 3 : i9);
    }

    @Override // u3.y
    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w) && super.equals(obj) && super.equals(obj)) {
            w wVar = (w) obj;
            return l0.g(this.f17376f, wVar.f17376f) && l0.g(this.f17375e, wVar.f17375e);
        }
        return false;
    }

    @n6.d
    public final Set<a> f() {
        return this.f17376f;
    }

    @n6.d
    public final Intent g() {
        return this.f17375e;
    }

    @n6.d
    public final w h(@n6.d a aVar) {
        l0.p(aVar, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f17376f);
        linkedHashSet.add(aVar);
        return new w(e0.V5(linkedHashSet), this.f17375e, d(), c(), e(), b());
    }

    @Override // u3.y
    public int hashCode() {
        return (((super.hashCode() * 31) + this.f17376f.hashCode()) * 31) + this.f17375e.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@n6.d Set<a> set, @n6.d Intent intent, int i7, int i8, float f7, int i9) {
        super(i7, i8, f7, i9);
        l0.p(set, "filters");
        l0.p(intent, "placeholderIntent");
        this.f17375e = intent;
        this.f17376f = e0.V5(set);
    }
}
