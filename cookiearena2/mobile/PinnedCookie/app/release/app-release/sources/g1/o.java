package g1;

import d.o0;
/* loaded from: classes.dex */
public class o<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f10023a;

    /* renamed from: b  reason: collision with root package name */
    public final S f10024b;

    public o(F f7, S s6) {
        this.f10023a = f7;
        this.f10024b = s6;
    }

    @o0
    public static <A, B> o<A, B> a(A a7, B b7) {
        return new o<>(a7, b7);
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            return n.a(oVar.f10023a, this.f10023a) && n.a(oVar.f10024b, this.f10024b);
        }
        return false;
    }

    public int hashCode() {
        F f7 = this.f10023a;
        int hashCode = f7 == null ? 0 : f7.hashCode();
        S s6 = this.f10024b;
        return hashCode ^ (s6 != null ? s6.hashCode() : 0);
    }

    @o0
    public String toString() {
        return "Pair{" + this.f10023a + " " + this.f10024b + "}";
    }
}
