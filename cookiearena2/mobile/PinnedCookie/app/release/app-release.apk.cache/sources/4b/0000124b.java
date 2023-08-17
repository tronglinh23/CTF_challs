package i6;

import java.util.zip.Inflater;

@s4.h(name = "-InflaterSourceExtensions")
/* loaded from: classes.dex */
public final class h {
    @n6.d
    public static final y a(@n6.d o0 o0Var, @n6.d Inflater inflater) {
        u4.l0.p(o0Var, "$this$inflate");
        u4.l0.p(inflater, "inflater");
        return new y(o0Var, inflater);
    }

    public static /* synthetic */ y b(o0 o0Var, Inflater inflater, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            inflater = new Inflater();
        }
        u4.l0.p(o0Var, "$this$inflate");
        u4.l0.p(inflater, "inflater");
        return new y(o0Var, inflater);
    }
}