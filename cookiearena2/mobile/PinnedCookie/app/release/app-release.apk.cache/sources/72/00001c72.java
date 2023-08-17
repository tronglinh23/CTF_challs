package v3;

@u4.r1({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
/* loaded from: classes.dex */
public class y0 extends x0 {
    @k4.f
    public static final void c(boolean z6) {
        if (!z6) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @k4.f
    public static final void d(boolean z6, t4.a<? extends Object> aVar) {
        u4.l0.p(aVar, "lazyMessage");
        if (!z6) {
            throw new IllegalStateException(aVar.n().toString());
        }
    }

    @k4.f
    public static final <T> T e(T t6) {
        if (t6 != null) {
            return t6;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @k4.f
    public static final <T> T f(T t6, t4.a<? extends Object> aVar) {
        u4.l0.p(aVar, "lazyMessage");
        if (t6 != null) {
            return t6;
        }
        throw new IllegalStateException(aVar.n().toString());
    }

    @k4.f
    public static final Void g(Object obj) {
        u4.l0.p(obj, "message");
        throw new IllegalStateException(obj.toString());
    }

    @k4.f
    public static final void h(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @k4.f
    public static final void i(boolean z6, t4.a<? extends Object> aVar) {
        u4.l0.p(aVar, "lazyMessage");
        if (!z6) {
            throw new IllegalArgumentException(aVar.n().toString());
        }
    }

    @k4.f
    public static final <T> T j(T t6) {
        if (t6 != null) {
            return t6;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @k4.f
    public static final <T> T k(T t6, t4.a<? extends Object> aVar) {
        u4.l0.p(aVar, "lazyMessage");
        if (t6 != null) {
            return t6;
        }
        throw new IllegalArgumentException(aVar.n().toString());
    }
}