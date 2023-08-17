package u4;

import java.io.Serializable;
@v3.g1(version = "1.4")
/* loaded from: classes.dex */
public class a implements e0, Serializable {

    /* renamed from: k  reason: collision with root package name */
    public final Object f17382k;

    /* renamed from: l  reason: collision with root package name */
    public final Class f17383l;

    /* renamed from: m  reason: collision with root package name */
    public final String f17384m;

    /* renamed from: n  reason: collision with root package name */
    public final String f17385n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f17386o;

    /* renamed from: p  reason: collision with root package name */
    public final int f17387p;

    /* renamed from: q  reason: collision with root package name */
    public final int f17388q;

    public a(int i7, Class cls, String str, String str2, int i8) {
        this(i7, q.f17458q, cls, str, str2, i8);
    }

    public e5.h b() {
        Class cls = this.f17383l;
        if (cls == null) {
            return null;
        }
        return this.f17386o ? l1.g(cls) : l1.d(cls);
    }

    @Override // u4.e0
    public int e() {
        return this.f17387p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f17386o == aVar.f17386o && this.f17387p == aVar.f17387p && this.f17388q == aVar.f17388q && l0.g(this.f17382k, aVar.f17382k) && l0.g(this.f17383l, aVar.f17383l) && this.f17384m.equals(aVar.f17384m) && this.f17385n.equals(aVar.f17385n);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f17382k;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f17383l;
        return ((((((((((hashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f17384m.hashCode()) * 31) + this.f17385n.hashCode()) * 31) + (this.f17386o ? 1231 : 1237)) * 31) + this.f17387p) * 31) + this.f17388q;
    }

    public String toString() {
        return l1.w(this);
    }

    public a(int i7, Object obj, Class cls, String str, String str2, int i8) {
        this.f17382k = obj;
        this.f17383l = cls;
        this.f17384m = str;
        this.f17385n = str2;
        this.f17386o = (i8 & 1) == 1;
        this.f17387p = i7;
        this.f17388q = i8 >> 1;
    }
}
