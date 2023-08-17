package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class t3 {
    @n6.d
    public static final <T> s3<T> a(@n6.d ThreadLocal<T> threadLocal, T t6) {
        return new kotlinx.coroutines.internal.x0(t6, threadLocal);
    }

    public static /* synthetic */ s3 b(ThreadLocal threadLocal, Object obj, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            obj = threadLocal.get();
        }
        return a(threadLocal, obj);
    }

    @n6.e
    public static final Object c(@n6.d ThreadLocal<?> threadLocal, @n6.d e4.d<? super v3.m2> dVar) {
        if (dVar.g().e(new kotlinx.coroutines.internal.y0(threadLocal)) != null) {
            return v3.m2.f17815a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + dVar.g()).toString());
    }

    public static final Object d(ThreadLocal<?> threadLocal, e4.d<? super v3.m2> dVar) {
        u4.i0.e(3);
        throw null;
    }

    @n6.e
    public static final Object e(@n6.d ThreadLocal<?> threadLocal, @n6.d e4.d<? super Boolean> dVar) {
        return h4.b.a(dVar.g().e(new kotlinx.coroutines.internal.y0(threadLocal)) != null);
    }

    public static final Object f(ThreadLocal<?> threadLocal, e4.d<? super Boolean> dVar) {
        u4.i0.e(3);
        throw null;
    }
}
