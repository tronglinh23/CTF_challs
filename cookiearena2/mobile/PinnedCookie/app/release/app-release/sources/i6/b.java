package i6;

import java.util.zip.Deflater;
@s4.h(name = "-DeflaterSinkExtensions")
/* loaded from: classes.dex */
public final class b {
    @n6.d
    public static final q a(@n6.d m0 m0Var, @n6.d Deflater deflater) {
        u4.l0.p(m0Var, "$this$deflate");
        u4.l0.p(deflater, "deflater");
        return new q(m0Var, deflater);
    }

    public static /* synthetic */ q b(m0 m0Var, Deflater deflater, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            deflater = new Deflater();
        }
        u4.l0.p(m0Var, "$this$deflate");
        u4.l0.p(deflater, "deflater");
        return new q(m0Var, deflater);
    }
}
