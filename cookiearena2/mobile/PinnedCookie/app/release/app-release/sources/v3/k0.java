package v3;
/* loaded from: classes.dex */
public final class k0 extends Error {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, u4.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k0() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.k0.<init>():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(@n6.d String str) {
        super(str);
        u4.l0.p(str, "message");
    }

    public /* synthetic */ k0(String str, int i7, u4.w wVar) {
        this((i7 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
