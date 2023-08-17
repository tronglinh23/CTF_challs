package v3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class u0<A, B> implements Serializable {

    /* renamed from: k  reason: collision with root package name */
    public final A f17832k;

    /* renamed from: l  reason: collision with root package name */
    public final B f17833l;

    public u0(A a7, B b7) {
        this.f17832k = a7;
        this.f17833l = b7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ u0 d(u0 u0Var, Object obj, Object obj2, int i7, Object obj3) {
        if ((i7 & 1) != 0) {
            obj = u0Var.f17832k;
        }
        if ((i7 & 2) != 0) {
            obj2 = u0Var.f17833l;
        }
        return u0Var.c(obj, obj2);
    }

    public final A a() {
        return this.f17832k;
    }

    public final B b() {
        return this.f17833l;
    }

    @n6.d
    public final u0<A, B> c(A a7, B b7) {
        return new u0<>(a7, b7);
    }

    public final A e() {
        return this.f17832k;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            return u4.l0.g(this.f17832k, u0Var.f17832k) && u4.l0.g(this.f17833l, u0Var.f17833l);
        }
        return false;
    }

    public final B f() {
        return this.f17833l;
    }

    public int hashCode() {
        A a7 = this.f17832k;
        int hashCode = (a7 == null ? 0 : a7.hashCode()) * 31;
        B b7 = this.f17833l;
        return hashCode + (b7 != null ? b7.hashCode() : 0);
    }

    @n6.d
    public String toString() {
        return '(' + this.f17832k + ", " + this.f17833l + ')';
    }
}