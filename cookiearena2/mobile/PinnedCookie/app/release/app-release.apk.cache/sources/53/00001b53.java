package u4;

import java.util.Collection;

@v3.g1(version = "1.1")
/* loaded from: classes.dex */
public final class b1 implements t {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final Class<?> f17400k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final String f17401l;

    public b1(@n6.d Class<?> cls, @n6.d String str) {
        l0.p(cls, "jClass");
        l0.p(str, "moduleName");
        this.f17400k = cls;
        this.f17401l = str;
    }

    public boolean equals(@n6.e Object obj) {
        return (obj instanceof b1) && l0.g(n(), ((b1) obj).n());
    }

    public int hashCode() {
        return n().hashCode();
    }

    @Override // e5.h
    @n6.d
    public Collection<e5.c<?>> j() {
        throw new s4.q();
    }

    @Override // u4.t
    @n6.d
    public Class<?> n() {
        return this.f17400k;
    }

    @n6.d
    public String toString() {
        return n().toString() + l1.f17441b;
    }
}