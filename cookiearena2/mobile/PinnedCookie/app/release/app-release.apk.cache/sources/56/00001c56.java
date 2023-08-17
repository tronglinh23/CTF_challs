package v3;

import java.util.List;

@s4.h(name = "TuplesKt")
/* loaded from: classes.dex */
public final class q1 {
    @n6.d
    public static final <A, B> u0<A, B> a(A a7, B b7) {
        return new u0<>(a7, b7);
    }

    @n6.d
    public static final <T> List<T> b(@n6.d u0<? extends T, ? extends T> u0Var) {
        u4.l0.p(u0Var, "<this>");
        return x3.w.L(u0Var.e(), u0Var.f());
    }

    @n6.d
    public static final <T> List<T> c(@n6.d p1<? extends T, ? extends T, ? extends T> p1Var) {
        u4.l0.p(p1Var, "<this>");
        return x3.w.L(p1Var.f(), p1Var.g(), p1Var.h());
    }
}