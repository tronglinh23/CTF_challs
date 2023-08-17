package v3;
/* loaded from: classes.dex */
public class i1 {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String, u4.w] */
    @k4.f
    public static final Void a() {
        ?? r12 = 0;
        throw new k0(r12, 1, r12);
    }

    @k4.f
    public static final Void b(String str) {
        u4.l0.p(str, "reason");
        throw new k0("An operation is not implemented: " + str);
    }

    @g1(version = "1.1")
    @k4.f
    public static final <T> T c(T t6, t4.l<? super T, m2> lVar) {
        u4.l0.p(lVar, "block");
        lVar.O(t6);
        return t6;
    }

    @k4.f
    public static final <T> T d(T t6, t4.l<? super T, m2> lVar) {
        u4.l0.p(lVar, "block");
        lVar.O(t6);
        return t6;
    }

    @k4.f
    public static final <T, R> R e(T t6, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(lVar, "block");
        return lVar.O(t6);
    }

    @k4.f
    public static final void f(int i7, t4.l<? super Integer, m2> lVar) {
        u4.l0.p(lVar, s2.t0.f16450f);
        for (int i8 = 0; i8 < i7; i8++) {
            lVar.O(Integer.valueOf(i8));
        }
    }

    @k4.f
    public static final <T, R> R g(T t6, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(lVar, "block");
        return lVar.O(t6);
    }

    @k4.f
    public static final <R> R h(t4.a<? extends R> aVar) {
        u4.l0.p(aVar, "block");
        return aVar.n();
    }

    @g1(version = "1.1")
    @k4.f
    public static final <T> T i(T t6, t4.l<? super T, Boolean> lVar) {
        u4.l0.p(lVar, "predicate");
        if (lVar.O(t6).booleanValue()) {
            return t6;
        }
        return null;
    }

    @g1(version = "1.1")
    @k4.f
    public static final <T> T j(T t6, t4.l<? super T, Boolean> lVar) {
        u4.l0.p(lVar, "predicate");
        if (lVar.O(t6).booleanValue()) {
            return null;
        }
        return t6;
    }

    @k4.f
    public static final <T, R> R k(T t6, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(lVar, "block");
        return lVar.O(t6);
    }
}
