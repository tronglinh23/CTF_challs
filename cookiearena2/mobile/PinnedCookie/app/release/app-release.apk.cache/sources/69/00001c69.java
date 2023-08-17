package v3;

/* loaded from: classes.dex */
public final class v1 {
    @g1(version = "1.3")
    @t
    @k4.f
    public static final byte[] a(int i7, t4.l<? super Integer, t1> lVar) {
        u4.l0.p(lVar, "init");
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = lVar.O(Integer.valueOf(i8)).j0();
        }
        return u1.f(bArr);
    }

    @g1(version = "1.3")
    @t
    @k4.f
    public static final byte[] b(byte... bArr) {
        u4.l0.p(bArr, "elements");
        return bArr;
    }
}