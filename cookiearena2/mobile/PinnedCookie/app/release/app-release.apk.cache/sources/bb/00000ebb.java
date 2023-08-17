package d5;

import u4.l0;
import v3.g1;

/* loaded from: classes.dex */
public class t {
    public static final void a(boolean z6, @n6.d Number number) {
        l0.p(number, "step");
        if (z6) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Ld5/g<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @g1(version = "1.3")
    @k4.f
    public static final boolean b(g gVar, Object obj) {
        l0.p(gVar, "<this>");
        return obj != null && gVar.a((Comparable) obj);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Ld5/r<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @g1(version = "1.7")
    @v3.r
    @k4.f
    public static final boolean c(r rVar, Object obj) {
        l0.p(rVar, "<this>");
        return obj != null && rVar.a((Comparable) obj);
    }

    @g1(version = "1.1")
    @n6.d
    public static final f<Double> d(double d7, double d8) {
        return new d(d7, d8);
    }

    @g1(version = "1.1")
    @n6.d
    public static final f<Float> e(float f7, float f8) {
        return new e(f7, f8);
    }

    @n6.d
    public static final <T extends Comparable<? super T>> g<T> f(@n6.d T t6, @n6.d T t7) {
        l0.p(t6, "<this>");
        l0.p(t7, "that");
        return new i(t6, t7);
    }

    @g1(version = "1.7")
    @v3.r
    @n6.d
    public static final r<Double> g(double d7, double d8) {
        return new p(d7, d8);
    }

    @g1(version = "1.7")
    @v3.r
    @n6.d
    public static final r<Float> h(float f7, float f8) {
        return new q(f7, f8);
    }

    @g1(version = "1.7")
    @v3.r
    @n6.d
    public static final <T extends Comparable<? super T>> r<T> i(@n6.d T t6, @n6.d T t7) {
        l0.p(t6, "<this>");
        l0.p(t7, "that");
        return new h(t6, t7);
    }
}