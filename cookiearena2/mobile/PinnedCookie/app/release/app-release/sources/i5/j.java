package i5;

import u4.l0;
/* loaded from: classes.dex */
public final class j {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final String f11118a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final d5.l f11119b;

    public j(@n6.d String str, @n6.d d5.l lVar) {
        l0.p(str, "value");
        l0.p(lVar, "range");
        this.f11118a = str;
        this.f11119b = lVar;
    }

    public static /* synthetic */ j d(j jVar, String str, d5.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = jVar.f11118a;
        }
        if ((i7 & 2) != 0) {
            lVar = jVar.f11119b;
        }
        return jVar.c(str, lVar);
    }

    @n6.d
    public final String a() {
        return this.f11118a;
    }

    @n6.d
    public final d5.l b() {
        return this.f11119b;
    }

    @n6.d
    public final j c(@n6.d String str, @n6.d d5.l lVar) {
        l0.p(str, "value");
        l0.p(lVar, "range");
        return new j(str, lVar);
    }

    @n6.d
    public final d5.l e() {
        return this.f11119b;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return l0.g(this.f11118a, jVar.f11118a) && l0.g(this.f11119b, jVar.f11119b);
        }
        return false;
    }

    @n6.d
    public final String f() {
        return this.f11118a;
    }

    public int hashCode() {
        return (this.f11118a.hashCode() * 31) + this.f11119b.hashCode();
    }

    @n6.d
    public String toString() {
        return "MatchGroup(value=" + this.f11118a + ", range=" + this.f11119b + ')';
    }
}
