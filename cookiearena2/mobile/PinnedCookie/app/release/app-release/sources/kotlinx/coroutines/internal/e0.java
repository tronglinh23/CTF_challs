package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.z2;
/* loaded from: classes.dex */
public final class e0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f12795a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f12796b;
    @n6.d
    @s4.e

    /* renamed from: c  reason: collision with root package name */
    public static final z2 f12797c;

    static {
        e0 e0Var = new e0();
        f12795a = e0Var;
        f12796b = t0.e(f0.f12802a, true);
        f12797c = e0Var.a();
    }

    public final z2 a() {
        Object next;
        z2 f7;
        try {
            List<d0> d7 = f12796b ? o.f12832a.d() : f5.u.c3(f5.s.e(ServiceLoader.load(d0.class, d0.class.getClassLoader()).iterator()));
            Iterator<T> it = d7.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c7 = ((d0) next).c();
                    do {
                        Object next2 = it.next();
                        int c8 = ((d0) next2).c();
                        if (c7 < c8) {
                            next = next2;
                            c7 = c8;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            d0 d0Var = (d0) next;
            return (d0Var == null || (f7 = f0.f(d0Var, d7)) == null) ? f0.b(null, null, 3, null) : f7;
        } catch (Throwable th) {
            return f0.b(th, null, 2, null);
        }
    }
}
