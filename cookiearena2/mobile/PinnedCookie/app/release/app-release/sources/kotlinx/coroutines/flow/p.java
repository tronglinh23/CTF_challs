package kotlinx.coroutines.flow;

import kotlinx.coroutines.n2;
import p5.r;
/* loaded from: classes.dex */
public final /* synthetic */ class p {
    @v3.k(level = v3.m.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ i a(i iVar, int i7) {
        i d7;
        d7 = d(iVar, i7, null, 2, null);
        return d7;
    }

    @n6.d
    public static final <T> i<T> b(@n6.d i<? extends T> iVar, int i7, @n6.d n5.m mVar) {
        int i8;
        n5.m mVar2;
        boolean z6 = true;
        if (!(i7 >= 0 || i7 == -2 || i7 == -1)) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i7).toString());
        }
        if (i7 == -1 && mVar != n5.m.SUSPEND) {
            z6 = false;
        }
        if (z6) {
            if (i7 == -1) {
                mVar2 = n5.m.DROP_OLDEST;
                i8 = 0;
            } else {
                i8 = i7;
                mVar2 = mVar;
            }
            return iVar instanceof p5.r ? r.a.a((p5.r) iVar, null, i8, mVar2, 1, null) : new p5.i(iVar, null, i8, mVar2, 2, null);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
    }

    public static /* synthetic */ i c(i iVar, int i7, int i8, Object obj) {
        i a7;
        if ((i8 & 1) != 0) {
            i7 = -2;
        }
        a7 = a(iVar, i7);
        return a7;
    }

    public static /* synthetic */ i d(i iVar, int i7, n5.m mVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = -2;
        }
        if ((i8 & 2) != 0) {
            mVar = n5.m.SUSPEND;
        }
        return k.o(iVar, i7, mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T> i<T> e(@n6.d i<? extends T> iVar) {
        return iVar instanceof c ? iVar : new d(iVar);
    }

    public static final void f(e4.g gVar) {
        if (gVar.e(n2.f12920c) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + gVar).toString());
    }

    @n6.d
    public static final <T> i<T> g(@n6.d i<? extends T> iVar) {
        i<T> d7;
        d7 = d(iVar, -1, null, 2, null);
        return d7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T> i<T> h(@n6.d i<? extends T> iVar, @n6.d e4.g gVar) {
        f(gVar);
        return u4.l0.g(gVar, e4.i.f8770k) ? iVar : iVar instanceof p5.r ? r.a.a((p5.r) iVar, gVar, 0, null, 6, null) : new p5.i(iVar, gVar, 0, null, 12, null);
    }
}
