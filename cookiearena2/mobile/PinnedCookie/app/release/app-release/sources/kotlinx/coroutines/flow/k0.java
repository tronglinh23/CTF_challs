package kotlinx.coroutines.flow;
/* loaded from: classes.dex */
public final class k0 {
    @n6.d
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r0 f12257a = new kotlinx.coroutines.internal.r0("NO_VALUE");

    @n6.d
    public static final <T> d0<T> a(int i7, int i8, @n6.d n5.m mVar) {
        boolean z6 = true;
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i7).toString());
        }
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i8).toString());
        }
        if (i7 <= 0 && i8 <= 0 && mVar != n5.m.SUSPEND) {
            z6 = false;
        }
        if (z6) {
            int i9 = i8 + i7;
            if (i9 < 0) {
                i9 = Integer.MAX_VALUE;
            }
            return new j0(i7, i9, mVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + mVar).toString());
    }

    public static /* synthetic */ d0 b(int i7, int i8, n5.m mVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            mVar = n5.m.SUSPEND;
        }
        return a(i7, i8, mVar);
    }

    public static final /* synthetic */ Object c(Object[] objArr, long j7) {
        return f(objArr, j7);
    }

    public static final /* synthetic */ void d(Object[] objArr, long j7, Object obj) {
        h(objArr, j7, obj);
    }

    @n6.d
    public static final <T> i<T> e(@n6.d i0<? extends T> i0Var, @n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        return ((i7 == 0 || i7 == -3) && mVar == n5.m.SUSPEND) ? i0Var : new p5.i(i0Var, gVar, i7, mVar);
    }

    public static final Object f(Object[] objArr, long j7) {
        return objArr[((int) j7) & (objArr.length - 1)];
    }

    public static /* synthetic */ void g() {
    }

    public static final void h(Object[] objArr, long j7, Object obj) {
        objArr[((int) j7) & (objArr.length - 1)] = obj;
    }
}
