package v3;
/* loaded from: classes.dex */
public final class j2 {
    @g1(version = "1.3")
    @t
    @k4.f
    public static final short[] a(int i7, t4.l<? super Integer, h2> lVar) {
        u4.l0.p(lVar, "init");
        short[] sArr = new short[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            sArr[i8] = lVar.O(Integer.valueOf(i8)).j0();
        }
        return i2.f(sArr);
    }

    @g1(version = "1.3")
    @t
    @k4.f
    public static final short[] b(short... sArr) {
        u4.l0.p(sArr, "elements");
        return sArr;
    }
}
