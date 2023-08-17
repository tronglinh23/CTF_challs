package kotlinx.coroutines;

/* loaded from: classes.dex */
public final class w1 {
    @n6.d
    public static final t1 a() {
        return new i(Thread.currentThread());
    }

    public static final void b(@n6.d t4.a<v3.m2> aVar) {
        aVar.n();
    }

    @i2
    public static final long c() {
        t1 a7 = u3.f13126a.a();
        if (a7 != null) {
            return a7.k1();
        }
        return Long.MAX_VALUE;
    }
}