package u3;

import android.app.Activity;
import u4.l0;

@t3.d
/* loaded from: classes.dex */
public final class t {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final c f17365a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final c f17366b;

    /* renamed from: c  reason: collision with root package name */
    public final float f17367c;

    public t(@n6.d c cVar, @n6.d c cVar2, float f7) {
        l0.p(cVar, "primaryActivityStack");
        l0.p(cVar2, "secondaryActivityStack");
        this.f17365a = cVar;
        this.f17366b = cVar2;
        this.f17367c = f7;
    }

    public final boolean a(@n6.d Activity activity) {
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        return this.f17365a.a(activity) || this.f17366b.a(activity);
    }

    @n6.d
    public final c b() {
        return this.f17365a;
    }

    @n6.d
    public final c c() {
        return this.f17366b;
    }

    public final float d() {
        return this.f17367c;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (l0.g(this.f17365a, tVar.f17365a) && l0.g(this.f17366b, tVar.f17366b)) {
                return (this.f17367c > tVar.f17367c ? 1 : (this.f17367c == tVar.f17367c ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f17365a.hashCode() * 31) + this.f17366b.hashCode()) * 31) + Float.hashCode(this.f17367c);
    }

    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SplitInfo:{");
        sb.append("primaryActivityStack=" + b() + ',');
        sb.append("secondaryActivityStack=" + c() + ',');
        sb.append("splitRatio=" + d() + '}');
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}