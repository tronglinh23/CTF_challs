package v3;
/* loaded from: classes.dex */
public class j1 extends i1 {
    @k4.f
    public static final <R> R l(Object obj, t4.a<? extends R> aVar) {
        R n7;
        u4.l0.p(obj, "lock");
        u4.l0.p(aVar, "block");
        synchronized (obj) {
            try {
                n7 = aVar.n();
                u4.i0.d(1);
            } catch (Throwable th) {
                u4.i0.d(1);
                u4.i0.c(1);
                throw th;
            }
        }
        u4.i0.c(1);
        return n7;
    }
}
