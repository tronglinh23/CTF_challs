package u3;

import android.app.Activity;
import java.util.List;
import u4.l0;
@t3.d
/* loaded from: classes.dex */
public final class c {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final List<Activity> f17324a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17325b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@n6.d List<? extends Activity> list, boolean z6) {
        l0.p(list, "activities");
        this.f17324a = list;
        this.f17325b = z6;
    }

    public final boolean a(@n6.d Activity activity) {
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        return this.f17324a.contains(activity);
    }

    @n6.d
    public final List<Activity> b() {
        return this.f17324a;
    }

    public final boolean c() {
        return this.f17325b;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return (l0.g(this.f17324a, cVar.f17324a) || this.f17325b == cVar.f17325b) ? false : true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f17325b ? 1 : 0) * 31) + this.f17324a.hashCode();
    }

    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityStack{");
        sb.append(l0.C("activities=", b()));
        sb.append("isEmpty=" + this.f17325b + '}');
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ c(List list, boolean z6, int i7, u4.w wVar) {
        this(list, (i7 & 2) != 0 ? false : z6);
    }
}
