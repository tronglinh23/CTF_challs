package v3;
/* loaded from: classes.dex */
public final class d2 {
    @g1(version = "1.3")
    @t
    @k4.f
    public static final long[] a(int i7, t4.l<? super Integer, b2> lVar) {
        u4.l0.p(lVar, "init");
        long[] jArr = new long[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            jArr[i8] = lVar.O(Integer.valueOf(i8)).l0();
        }
        return c2.f(jArr);
    }

    @g1(version = "1.3")
    @t
    @k4.f
    public static final long[] b(long... jArr) {
        u4.l0.p(jArr, "elements");
        return jArr;
    }
}
