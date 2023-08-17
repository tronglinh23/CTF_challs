package z0;
/* loaded from: classes.dex */
public final class b1 {
    @v3.k(message = "Use androidx.tracing.Trace instead", replaceWith = @v3.b1(expression = "trace(sectionName)", imports = {"androidx.tracing.trace"}))
    public static final <T> T a(@n6.d String str, @n6.d t4.a<? extends T> aVar) {
        u4.l0.p(str, "sectionName");
        u4.l0.p(aVar, "block");
        w0.b(str);
        try {
            return aVar.n();
        } finally {
            u4.i0.d(1);
            w0.d();
            u4.i0.c(1);
        }
    }
}
