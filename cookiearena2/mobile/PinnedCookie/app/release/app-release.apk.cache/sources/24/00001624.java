package kotlinx.coroutines;

import v3.d1;

/* loaded from: classes.dex */
public final class z0 {
    @n6.d
    public static final String a(@n6.d Object obj) {
        return obj.getClass().getSimpleName();
    }

    @n6.d
    public static final String b(@n6.d Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @n6.d
    public static final String c(@n6.d e4.d<?> dVar) {
        String b7;
        if (dVar instanceof kotlinx.coroutines.internal.l) {
            return dVar.toString();
        }
        try {
            d1.a aVar = v3.d1.f17778l;
            b7 = v3.d1.b(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            d1.a aVar2 = v3.d1.f17778l;
            b7 = v3.d1.b(v3.e1.a(th));
        }
        if (v3.d1.e(b7) != null) {
            b7 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) b7;
    }
}