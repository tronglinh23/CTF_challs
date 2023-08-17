package kotlinx.coroutines;

/* loaded from: classes.dex */
public interface q<T> extends e4.d<T> {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ boolean a(q qVar, Throwable th, int i7, Object obj) {
            if (obj == null) {
                if ((i7 & 1) != 0) {
                    th = null;
                }
                return qVar.b(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ Object b(q qVar, Object obj, Object obj2, int i7, Object obj3) {
            if (obj3 == null) {
                if ((i7 & 2) != 0) {
                    obj2 = null;
                }
                return qVar.o(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    void N(@n6.d t4.l<? super Throwable, v3.m2> lVar);

    @c2
    void Y(T t6, @n6.e t4.l<? super Throwable, v3.m2> lVar);

    boolean b(@n6.e Throwable th);

    boolean d();

    boolean isCancelled();

    boolean l();

    @n6.e
    @i2
    Object m0(T t6, @n6.e Object obj, @n6.e t4.l<? super Throwable, v3.m2> lVar);

    @n6.e
    @i2
    Object o(T t6, @n6.e Object obj);

    @c2
    void q(@n6.d o0 o0Var, @n6.d Throwable th);

    @c2
    void r(@n6.d o0 o0Var, T t6);

    @n6.e
    @i2
    Object r0(@n6.d Throwable th);

    @i2
    void t0(@n6.d Object obj);

    @i2
    void x();
}