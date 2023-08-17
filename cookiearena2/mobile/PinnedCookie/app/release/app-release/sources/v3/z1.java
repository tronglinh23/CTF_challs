package v3;
/* loaded from: classes.dex */
public final class z1 {
    @g1(version = "1.3")
    @t
    @k4.f
    public static final int[] a(int i7, t4.l<? super Integer, x1> lVar) {
        u4.l0.p(lVar, "init");
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = lVar.O(Integer.valueOf(i8)).l0();
        }
        return y1.f(iArr);
    }

    @g1(version = "1.3")
    @t
    @k4.f
    public static final int[] b(int... iArr) {
        u4.l0.p(iArr, "elements");
        return iArr;
    }
}
