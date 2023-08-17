package kotlinx.coroutines;

import v3.d1;

/* loaded from: classes.dex */
public final class k0 {
    @n6.d
    public static final <T> Object a(@n6.e Object obj, @n6.d e4.d<? super T> dVar) {
        if (obj instanceof e0) {
            d1.a aVar = v3.d1.f17778l;
            return v3.d1.b(v3.e1.a(((e0) obj).f11961a));
        }
        d1.a aVar2 = v3.d1.f17778l;
        return v3.d1.b(obj);
    }

    @n6.e
    public static final <T> Object b(@n6.d Object obj, @n6.d q<?> qVar) {
        Throwable e7 = v3.d1.e(obj);
        if (e7 == null) {
            return obj;
        }
        return new e0(e7, false, 2, null);
    }

    @n6.e
    public static final <T> Object c(@n6.d Object obj, @n6.e t4.l<? super Throwable, v3.m2> lVar) {
        Throwable e7 = v3.d1.e(obj);
        if (e7 == null) {
            return lVar != null ? new f0(obj, lVar) : obj;
        }
        return new e0(e7, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, t4.l lVar, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}