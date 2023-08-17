package v3;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class p1<A, B, C> implements Serializable {

    /* renamed from: k  reason: collision with root package name */
    public final A f17821k;

    /* renamed from: l  reason: collision with root package name */
    public final B f17822l;

    /* renamed from: m  reason: collision with root package name */
    public final C f17823m;

    public p1(A a7, B b7, C c7) {
        this.f17821k = a7;
        this.f17822l = b7;
        this.f17823m = c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p1 e(p1 p1Var, Object obj, Object obj2, Object obj3, int i7, Object obj4) {
        if ((i7 & 1) != 0) {
            obj = p1Var.f17821k;
        }
        if ((i7 & 2) != 0) {
            obj2 = p1Var.f17822l;
        }
        if ((i7 & 4) != 0) {
            obj3 = p1Var.f17823m;
        }
        return p1Var.d(obj, obj2, obj3);
    }

    public final A a() {
        return this.f17821k;
    }

    public final B b() {
        return this.f17822l;
    }

    public final C c() {
        return this.f17823m;
    }

    @n6.d
    public final p1<A, B, C> d(A a7, B b7, C c7) {
        return new p1<>(a7, b7, c7);
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            return u4.l0.g(this.f17821k, p1Var.f17821k) && u4.l0.g(this.f17822l, p1Var.f17822l) && u4.l0.g(this.f17823m, p1Var.f17823m);
        }
        return false;
    }

    public final A f() {
        return this.f17821k;
    }

    public final B g() {
        return this.f17822l;
    }

    public final C h() {
        return this.f17823m;
    }

    public int hashCode() {
        A a7 = this.f17821k;
        int hashCode = (a7 == null ? 0 : a7.hashCode()) * 31;
        B b7 = this.f17822l;
        int hashCode2 = (hashCode + (b7 == null ? 0 : b7.hashCode())) * 31;
        C c7 = this.f17823m;
        return hashCode2 + (c7 != null ? c7.hashCode() : 0);
    }

    @n6.d
    public String toString() {
        return '(' + this.f17821k + ", " + this.f17822l + ", " + this.f17823m + ')';
    }
}
