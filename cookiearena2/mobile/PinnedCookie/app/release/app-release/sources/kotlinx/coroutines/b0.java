package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class b0 {
    @n6.d
    public static final <T> z<T> a(T t6) {
        a0 a0Var = new a0(null);
        a0Var.d0(t6);
        return a0Var;
    }

    @n6.d
    public static final <T> z<T> b(@n6.e n2 n2Var) {
        return new a0(n2Var);
    }

    public static /* synthetic */ z c(n2 n2Var, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            n2Var = null;
        }
        return b(n2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean d(@n6.d z<T> zVar, @n6.d Object obj) {
        Throwable e7 = v3.d1.e(obj);
        return e7 == null ? zVar.d0(obj) : zVar.i(e7);
    }
}
