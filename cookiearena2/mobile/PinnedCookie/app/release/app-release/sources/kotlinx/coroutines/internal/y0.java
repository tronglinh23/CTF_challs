package kotlinx.coroutines.internal;

import e4.g;
@v3.a1
/* loaded from: classes.dex */
public final class y0 implements g.c<x0<?>> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final ThreadLocal<?> f12880k;

    public y0(@n6.d ThreadLocal<?> threadLocal) {
        this.f12880k = threadLocal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ y0 c(y0 y0Var, ThreadLocal threadLocal, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            threadLocal = y0Var.f12880k;
        }
        return y0Var.b(threadLocal);
    }

    public final ThreadLocal<?> a() {
        return this.f12880k;
    }

    @n6.d
    public final y0 b(@n6.d ThreadLocal<?> threadLocal) {
        return new y0(threadLocal);
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && u4.l0.g(this.f12880k, ((y0) obj).f12880k);
    }

    public int hashCode() {
        return this.f12880k.hashCode();
    }

    @n6.d
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f12880k + ')';
    }
}
