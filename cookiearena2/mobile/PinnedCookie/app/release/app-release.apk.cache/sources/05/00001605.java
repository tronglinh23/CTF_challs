package kotlinx.coroutines;

/* loaded from: classes.dex */
public final class u3 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final u3 f13126a = new u3();
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<t1> f13127b = new ThreadLocal<>();

    @n6.e
    public final t1 a() {
        return f13127b.get();
    }

    @n6.d
    public final t1 b() {
        ThreadLocal<t1> threadLocal = f13127b;
        t1 t1Var = threadLocal.get();
        if (t1Var == null) {
            t1 a7 = w1.a();
            threadLocal.set(a7);
            return a7;
        }
        return t1Var;
    }

    public final void c() {
        f13127b.set(null);
    }

    public final void d(@n6.d t1 t1Var) {
        f13127b.set(t1Var);
    }
}