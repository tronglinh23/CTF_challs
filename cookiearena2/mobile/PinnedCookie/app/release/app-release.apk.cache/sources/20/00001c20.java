package v3;

import v3.d1;

@u4.r1({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
/* loaded from: classes.dex */
public final class e1 {
    @g1(version = "1.3")
    @n6.d
    @a1
    public static final Object a(@n6.d Throwable th) {
        u4.l0.p(th, "exception");
        return new d1.b(th);
    }

    @g1(version = "1.3")
    @k4.f
    public static final <R, T> R b(Object obj, t4.l<? super T, ? extends R> lVar, t4.l<? super Throwable, ? extends R> lVar2) {
        u4.l0.p(lVar, "onSuccess");
        u4.l0.p(lVar2, "onFailure");
        Throwable e7 = d1.e(obj);
        return e7 == null ? lVar.O(obj) : lVar2.O(e7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @k4.f
    public static final <R, T extends R> R c(Object obj, R r6) {
        return d1.i(obj) ? r6 : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @k4.f
    public static final <R, T extends R> R d(Object obj, t4.l<? super Throwable, ? extends R> lVar) {
        u4.l0.p(lVar, "onFailure");
        Throwable e7 = d1.e(obj);
        return e7 == null ? obj : lVar.O(e7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @k4.f
    public static final <T> T e(Object obj) {
        n(obj);
        return obj;
    }

    @g1(version = "1.3")
    @k4.f
    public static final <R, T> Object f(Object obj, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(lVar, "transform");
        if (d1.j(obj)) {
            d1.a aVar = d1.f17778l;
            return d1.b(lVar.O(obj));
        }
        return d1.b(obj);
    }

    @g1(version = "1.3")
    @k4.f
    public static final <R, T> Object g(Object obj, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(lVar, "transform");
        if (d1.j(obj)) {
            try {
                d1.a aVar = d1.f17778l;
                return d1.b(lVar.O(obj));
            } catch (Throwable th) {
                d1.a aVar2 = d1.f17778l;
                return d1.b(a(th));
            }
        }
        return d1.b(obj);
    }

    @g1(version = "1.3")
    @k4.f
    public static final <T> Object h(Object obj, t4.l<? super Throwable, m2> lVar) {
        u4.l0.p(lVar, s2.t0.f16450f);
        Throwable e7 = d1.e(obj);
        if (e7 != null) {
            lVar.O(e7);
        }
        return obj;
    }

    @g1(version = "1.3")
    @k4.f
    public static final <T> Object i(Object obj, t4.l<? super T, m2> lVar) {
        u4.l0.p(lVar, s2.t0.f16450f);
        if (d1.j(obj)) {
            lVar.O(obj);
        }
        return obj;
    }

    @g1(version = "1.3")
    @k4.f
    public static final <R, T extends R> Object j(Object obj, t4.l<? super Throwable, ? extends R> lVar) {
        u4.l0.p(lVar, "transform");
        Throwable e7 = d1.e(obj);
        if (e7 == null) {
            return obj;
        }
        d1.a aVar = d1.f17778l;
        return d1.b(lVar.O(e7));
    }

    @g1(version = "1.3")
    @k4.f
    public static final <R, T extends R> Object k(Object obj, t4.l<? super Throwable, ? extends R> lVar) {
        u4.l0.p(lVar, "transform");
        Throwable e7 = d1.e(obj);
        if (e7 == null) {
            return obj;
        }
        try {
            d1.a aVar = d1.f17778l;
            return d1.b(lVar.O(e7));
        } catch (Throwable th) {
            d1.a aVar2 = d1.f17778l;
            return d1.b(a(th));
        }
    }

    @g1(version = "1.3")
    @k4.f
    public static final <T, R> Object l(T t6, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(lVar, "block");
        try {
            d1.a aVar = d1.f17778l;
            return d1.b(lVar.O(t6));
        } catch (Throwable th) {
            d1.a aVar2 = d1.f17778l;
            return d1.b(a(th));
        }
    }

    @g1(version = "1.3")
    @k4.f
    public static final <R> Object m(t4.a<? extends R> aVar) {
        u4.l0.p(aVar, "block");
        try {
            d1.a aVar2 = d1.f17778l;
            return d1.b(aVar.n());
        } catch (Throwable th) {
            d1.a aVar3 = d1.f17778l;
            return d1.b(a(th));
        }
    }

    @g1(version = "1.3")
    @a1
    public static final void n(@n6.d Object obj) {
        if (obj instanceof d1.b) {
            throw ((d1.b) obj).f17780k;
        }
    }
}