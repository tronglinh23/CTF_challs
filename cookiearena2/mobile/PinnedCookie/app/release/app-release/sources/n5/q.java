package n5;

import n5.r;
import v3.m2;
/* loaded from: classes.dex */
public final class q {
    @n6.d
    public static final <E> n<E> b(int i7, @n6.d m mVar, @n6.e t4.l<? super E, m2> lVar) {
        if (i7 == -2) {
            return new h(mVar == m.SUSPEND ? n.f13954d.a() : 1, mVar, lVar);
        } else if (i7 != -1) {
            return i7 != 0 ? i7 != Integer.MAX_VALUE ? (i7 == 1 && mVar == m.DROP_OLDEST) ? new a0(lVar) : new h(i7, mVar, lVar) : new d0(lVar) : mVar == m.SUSPEND ? new k0(lVar) : new h(1, mVar, lVar);
        } else {
            if ((mVar != m.SUSPEND ? 0 : 1) != 0) {
                return new a0(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    public static /* synthetic */ n c(int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        return d(i7, null, null, 6, null);
    }

    public static /* synthetic */ n d(int i7, m mVar, t4.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        if ((i8 & 2) != 0) {
            mVar = m.SUSPEND;
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        return b(i7, mVar, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T e(@n6.d Object obj, @n6.d t4.l<? super Throwable, ? extends T> lVar) {
        return obj instanceof r.c ? lVar.O(r.f(obj)) : obj;
    }

    @n6.d
    public static final <T> Object f(@n6.d Object obj, @n6.d t4.l<? super Throwable, m2> lVar) {
        if (obj instanceof r.a) {
            lVar.O(r.f(obj));
        }
        return obj;
    }

    @n6.d
    public static final <T> Object g(@n6.d Object obj, @n6.d t4.l<? super Throwable, m2> lVar) {
        if (obj instanceof r.c) {
            lVar.O(r.f(obj));
        }
        return obj;
    }

    @n6.d
    public static final <T> Object h(@n6.d Object obj, @n6.d t4.l<? super T, m2> lVar) {
        if (!(obj instanceof r.c)) {
            lVar.O(obj);
        }
        return obj;
    }
}
